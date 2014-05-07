package com.gmail.irclark2000.objc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Isaac Clark read translations from external file
 * 
 */
public class Translations {
	/**
	 *  Name for default translation file.  Currently not configurable
	 */
	public static final String TRANSLATIONFILE = "translate.dat";

	/**
	 *  Map for external ID translations
	 */
	public static Map<String, String> EXTERNALSTRINGS = new HashMap<String, String>();
	/**
	 * Map for external function simple translations
	 */
	public static Map<String, String> EXTERNALFUNCTIONS = new HashMap<String, String>();

	/**
	 * Read id and function translations from an external file
	 * @param fileName
	 * @return true if successful at finding translation file
	 */
	public static boolean readTranslations(String fileName) {
		File f = new File(fileName);
		Scanner sc = null;
		List<String> lines = new ArrayList<String>();
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			return false;
		}
		boolean appendNext = false;
		while (sc.hasNextLine()) {
			String line = sc.nextLine().trim();
			if (line.length() == 0 || line.charAt(0) == '#') {
				continue;
			}
			if (appendNext) {
				line = lines.get(lines.size() -1) + line;
				lines.remove(lines.size() - 1);
				appendNext = false;
			}
			if (line.length()-1 == '\\') {
				appendNext = true;
				line = line.substring(0, line.length()-1);
			}
			lines.add(line);
		}
		sc.close();
		// convert lines to translations
		for (String line : lines) {
			String [] parts = line.split("[\t ]+", 2);
			if(parts[0].toLowerCase().equals("-replaceid")) {
				ArrayList<String> args = splitEscapeUnquote(parts[1]);
				EXTERNALSTRINGS.put(args.get(0), args.get(1));
			}
			else if(parts[0].toLowerCase().equals("-replacefunc")) {
				ArrayList<String> args = splitEscapeUnquote(parts[1]);
				String arg2 = args.get(1);
				if (arg2.length() > 0 && arg2.substring(arg2.length()-1).equals("-")) {
					arg2 = arg2.substring(0, arg2.length()-2) + CodeFormatter.REVERSE_ARGS_MARKER + "(";
				}
				EXTERNALFUNCTIONS.put(args.get(0), arg2);
			}
			else if (parts[0].toLowerCase().equals("replacecode")) {
				
			}
		}
		return true;
	}

	private static ArrayList<String> splitEscapeUnquote(String string) {
		ArrayList<String> args = new ArrayList<String>();
		boolean insideDoubleQuote = false;
		boolean insideSingleQuote = false;
		int breakPoint = -1;
		for (int i=0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (!insideDoubleQuote && !insideSingleQuote) {
				if (c == ' ' || c == '\t') {
					breakPoint = i;
					break;
				} else if (c == '\"') {
					if (i == 0) {
						insideDoubleQuote = true;
					} else if (string.charAt(i-1) != '\\') {
						insideDoubleQuote = true;
					}
				} else if (c == '\'') {
					if (i == 0) {
						insideSingleQuote = true;
					} else if (string.charAt(i-1) != '\\') {
						insideSingleQuote = true;
					}
				}
			} else if (insideDoubleQuote) {
				if (c == '\"' && string.charAt(i-1) != '\\') {
					insideDoubleQuote = false;
				}
			} else if (insideSingleQuote) {
				if (c == '\'' && string.charAt(i-1) != '\\') {
					insideDoubleQuote = false;
				}
			}
		}
		if (breakPoint != -1) {
			String arg1 = string.substring(0, breakPoint).trim();
			String arg2 = string.substring(breakPoint).trim(); 
			arg1 = arg1.substring(1, arg1.length()-1);
			arg2 = arg2.substring(1, arg2.length()-1);
			args.add(unescape(arg1));
			args.add(unescape(arg2));
		}
		return args;
	}

	private static String unescape(String arg) {
		arg.replaceAll("\\n", "\n");
		arg.replaceAll("\\t", "\t");
		arg.replaceAll("\\r", "\r");
		arg.replaceAll("\\\"", "\"");
		arg.replaceAll("\\\'", "\'");
//		arg.replaceAll("\\\\", "\\");
		return arg;
	}
}
