package com.gmail.irclark2000.objc;

/**
 * @author Isaac Clark Handles transforming of NSArray functions to Java
 *         equivalents
 * 
 */

public class CodeFormatterArrayList {

	/**
	 * @param call using objective C NSArray method
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
}
