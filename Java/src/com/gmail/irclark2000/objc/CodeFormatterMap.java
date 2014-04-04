package com.gmail.irclark2000.objc;


/**
 * @author Isaac Clark Handles transforming of NSDictionary functions to Java
 *         equivalents using Map<String, Object>
 * 
 */

public class CodeFormatterMap {

	/**
	 * @param call using objective C NSDictionary method
	 * @param options code formatting options
	 * @return Java equivalent function call using Map
	 */
	public String reformatMapFunctions(String call, ParseOptions options) {
		String proto = String.format("%s", call);

		if (proto.contains("setObjectforKey")) {
			proto = proto.replace("setObjectforKey(", "put"
					+ CodeFormatter.REVERSE_ARGS_MARKER + "(");
		}
		if (proto.contains("removeObjectForKey")) {
			proto = proto.replace("removeObjectForKey(", "remove(");
		}
		if (proto.contains("removeAllObjects(")) {
			proto = proto.replace("removeAllObjects(", "clear(");
		}
		if (proto.contains("objectForKey")) {
			proto = proto.replace("objectForKey(", "get(");
		}
		if (proto.contains("allKeys")) {
			proto = proto.replace("allKeys(", "keySet(");
		}		
		if (proto.contains("Map.dictionary()")) {
			proto = proto.replace("Map.dictionary", "new HashMap<String, " + options.getDirectoryObject() + ">");
		}
		return proto;
	}

}
