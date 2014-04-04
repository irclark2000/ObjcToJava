package com.gmail.irclark2000.objc;

/**
 * @author Isaac Clark Handles transforming of NSArray functions to Java
 *         equivalents
 * 
 */

public class CodeFormatterArrayList {

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
	 * @param call possible ArrayList constructor
	 * @param options
	 * @return reformatted ArrayList constructor calls
	 */
	public String reformatConstructorCall(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		if (proto.contains("ArrayList.alloc().initWithObjects(")) {
			String aCall = ".alloc().initWithObjects(";
			int start = proto.indexOf(aCall) + aCall.length();
			while (proto.charAt(start) != '(')
				start++;
			proto = "new ArrayList(Arrays.AsList"
					+ proto.substring(start, call.length()) + ")";
			proto.replace(", null)", ")");
		} else if (proto.contains("ArrayList.arrayWithArray(")) {
			String aCall = ".arrayWithArray";
			int start = proto.indexOf(aCall) + aCall.length();
			while (proto.charAt(start) != '(')
				start++;
			proto = "new ArrayList().addAll"
					+ proto.substring(start, call.length());
		}
		return proto;
	}
}
