package com.gmail.irclark2000.objc;


/**
 * @author Isaac Clark Handles transforming of NSDictionary functions to Java
 *         equivalents using Map<String, Object>
 * 
 */

public class CodeFormatterMap {
	
	/**
	 * @param call
	 * @param options
	 * @return dictionary constructors expressed as Map calls
	 */
	
	public String reformatConstructorCall(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		String mapCall = "Map<String, " + options.getDirectoryObject() + ">";
		if (proto.contains(mapCall + ".alloc().init(")) {
			proto = "new Hash" + mapCall + "()";
		}

		return proto;
	}


	/**
	 * @param call using objective C NSDictionary method
	 * @param options code formatting options
	 * @return Java equivalent function call using Map
	 */
	public String reformatMapFunctions(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		String mapType = "<String, " + options.getDirectoryObject() + ">";

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
		if (proto.contains("Map" + mapType + ".dictionary()")) {
			proto = proto.replace("Map" + mapType + ".dictionary", "new HashMap" + mapType);
		}
		return proto;
	}

}
