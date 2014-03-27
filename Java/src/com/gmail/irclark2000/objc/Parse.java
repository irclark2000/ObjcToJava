package com.gmail.irclark2000.objc;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.gmail.irclark2000.objc.parser.ObjCLexer;
import com.gmail.irclark2000.objc.parser.ObjCParser;

public class Parse {

	// private static final String FILENAME = "HTTPOperations.h";

	private static final int USAGE_METHOD_CODE = 0;
	private static final int MANGLED_COMMANDLINE_CODE = 1;
	private static final String USAGE_MESSAGE = "Usage: %s options [inputFile] \n"
			+ "Options:"
			+ "\n-help              print this usage message"
			+ "\n-header headerfile use fileName as headerFile when parsing input file"
			+ "\n-autoheader        derive header file name from input file name "
			+ "\n-allheader dir     parse all headerfile in directry dir"
			+ "\n-o filename        write output to filename default is stdout"
			+ "";

	private static final String MANGLED_MESSAGE = "Command line error.\nType %s -help for usage information";
	private static boolean useHeaderFile = false;
	private static boolean useAutoHeaderFile = false;
	private static String outputFileName = "";
	private static String inputFileName = "";
	private static ArrayList<String> headerFileNames = new ArrayList<String>();

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			if (arg.equals("help") || arg.equals("-help")) {
				printErrorAndExit(USAGE_METHOD_CODE);
			} else if (arg.equals("-o")) {
				if (i >= args.length - 1 || args[i + 1].startsWith("-")) {
					printErrorAndExit(MANGLED_COMMANDLINE_CODE);
					;
				} else {
					outputFileName = args[i + 1];
					i++;
				}
			} else if (arg.equals("-autoheader")) {
				useHeaderFile = true;
				useAutoHeaderFile = true;
			} else if (arg.equals("-header")) {
				if (i >= args.length - 1 || args[i + 1].startsWith("-")) {
					printErrorAndExit(MANGLED_COMMANDLINE_CODE);
				} else {
					useAutoHeaderFile = false;
					useHeaderFile = true;
					headerFileNames.add(args[i + 1]);
					i++;
				}
				continue;
			} else if (arg.equals("-allheader")) {
				if (i >= args.length - 1 || args[i + 1].startsWith("-")) {
					printErrorAndExit(MANGLED_COMMANDLINE_CODE);
				} else {
					File f = new File(args[i+1]);
					File[] files = f.listFiles();
					for ( File file : files) {
						if (file.isFile() && file.getAbsolutePath().endsWith(".h")) {
							headerFileNames.add(file.getAbsolutePath());
						}
					}
					i++;

					useAutoHeaderFile = false;
					useHeaderFile = true;
				}
			} else if (i == args.length - 1) {
				if (arg.startsWith("-")) {
					printErrorAndExit(MANGLED_COMMANDLINE_CODE);
					;
				} else {
					inputFileName = arg;
				}
			}
		}

		if (outputFileName.length() == 0) {
			useHeaderFile = false;
			useAutoHeaderFile = false;
		} else {
			if (useAutoHeaderFile) {
				headerFileNames.add(generateHeaderFileName(inputFileName));
			}
		}
		ClassDescription cd = new ClassDescription();
		Map<String, ClassDescription.ClassDeclaration> headerDeclarations = cd
				.getHeaders();
		boolean first = true;
		if (useHeaderFile) {
			if (!first) {
				cd = new ClassDescription(headerDeclarations);
			} else {
				first = false;
			}
			for (String headerFileName : headerFileNames) {
				BufferedInputStream instream = null;
				instream = new BufferedInputStream(new FileInputStream(
						headerFileName));
				ANTLRInputStream antlrStream = null;
				antlrStream = new ANTLRInputStream(instream);
				ObjCParser.Translation_unitContext tree = new ObjCParser(
						new CommonTokenStream(new ObjCLexer(antlrStream)))
						.translation_unit();
				// walk the tree and activate so we can listen
				ParseTreeWalker walker = new ParseTreeWalker();
				walker.walk(new ParserObjcListener(cd, true), tree);
				instream.close();
			}
		}

		// Set<String> keys = cd.getHeaders().keySet();
		if (inputFileName.length() > 0) {
			BufferedInputStream instream = null;
			instream = new BufferedInputStream(new FileInputStream(
					inputFileName));
			ANTLRInputStream antlrStream = null;
			antlrStream = new ANTLRInputStream(instream);
			// lexing
			ObjCParser.Translation_unitContext tree = new ObjCParser(
					new CommonTokenStream(new ObjCLexer(antlrStream)))
					.translation_unit();

			// walk the tree and activate so we can listen
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new ParserObjcListener(new ClassDescription(
					headerDeclarations), false), tree);
		}
	}

	private static String generateHeaderFileName(String fName) {
		String hFileName = "";
		int index = fName.lastIndexOf('.');
		if (index >= 0) {
			String baseName = fName.substring(0, index);
			hFileName = baseName + ".h";
		} else {
			hFileName = fName + ".h";
		}
		return hFileName;
	}

	private static void printErrorAndExit(int errorCode) {
		switch (errorCode) {
		case USAGE_METHOD_CODE:
			System.err.printf(USAGE_MESSAGE, "ObjectiveC");
			break;
		case MANGLED_COMMANDLINE_CODE:
			System.err.printf(MANGLED_MESSAGE, "ObjectiveC");
			break;
		default:
			break;
		}
		System.exit(errorCode);
	}
}
