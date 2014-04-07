package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Isaac Clark Handles transforming of NSArray functions to Java
 *         equivalents
 * 
 */

public class CodeFormatterArrayList {
	@SuppressWarnings("serial")
	static final Map<String , String> SIMPLEARRAYSTRINGS = new HashMap<String , String>() {{
		put("NSArray", "ArrayList<?>");
		put("NSMutableArray", "ArrayList<?>");
		put("NSSet", "Set<?>");
		put("NSMutableSet", "Set<?>");
	}};

	/**
	 * @param call
	 *            using objective C NSArray method
	 * @return Java equivalent function call using ArrayList
	 */
	public String reformatArrayListFunctions(String call) {

		String proto = String.format("%s", call);
		if (proto.contains("insertObjectatIndex")) {
			proto = proto.replace("insertObjectatIndex(", "add"
					+ CodeFormatter.REVERSE_ARGS_MARKER + "(");
		}
		if (proto.contains("addObject")) {
			proto = proto.replace("addObject(", "add(");
		}
		if (proto.contains("objectAtIndex")) {
			proto = proto.replace("objectAtIndex(", "get(");
		}
		if (proto.contains("containsObject")) {
			proto = proto.replace("containsObject(", "contains(");
		}
		return proto;
	}

	/**
	 * @param call
	 *            possible ArrayList constructor
	 * @param options
	 * @return reformatted ArrayList constructor calls
	 */
	public String reformatConstructorCall(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		if (proto.contains("ArrayList<?>.alloc().initWithObjects(")) {
			String aCall = ".alloc().initWithObjects(";
			int start = proto.indexOf(aCall) + aCall.length();
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(start - 1));
			proto = "new ArrayList<?>(Arrays.AsList(";
			for (int i = 0; i < args.size(); i++) {
				String arg = args.get(i);
				// skip the nil argument that ios requires
				if (i == args.size() - 1 && arg.equals("null")) {
					break;
				}
				if (i == 0) {
					proto += arg;
				} else {
					proto += ", " + arg;
				}
			}
			proto += "))";
		} else if (proto.contains("ArrayList<?>.arrayWithArray(")) {
			String aCall = ".arrayWithArray";
			int start = proto.indexOf(aCall) + aCall.length();
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(start - 1));
			proto = "new ArrayList<?>().addAll(" + args.get(0) + ")";
		} else if (proto.contains("ArrayList<?>.arrayWithObjects(")) {
			String aCall = ".arrayWithObjects(";
			int start = proto.indexOf(aCall) + aCall.length();
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(start -1));
			proto = "new ArrayList<?>(Arrays.AsList(";
			for (int i = 0; i < args.size(); i++) {
				String arg = args.get(i);
				// skip the nil argument that ios requires
				if (i == args.size() - 1 && arg.equals("null")) {
					break;
				}
				if (i == 0) {
					proto += arg;
				} else {
					proto += ", " + arg;
				}
			}
			proto += "))";
		}
		return proto;
	}

	/**
	 * @param id
	 * @param options
	 * @return id after reformatting to Java conventions
	 */

	public String identifierFormatter(String id, ParseOptions options) {
		id = CodeFormatter.makeSimpleIDSubtitutions(SIMPLEARRAYSTRINGS, id);
		return id;
	}

}
