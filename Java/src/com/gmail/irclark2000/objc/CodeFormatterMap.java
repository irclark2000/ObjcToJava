package com.gmail.irclark2000.objc;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Isaac Clark Handles transforming of NSDictionary functions to Java
 *         equivalents using Map<String, Object>
 * 
 */

public class CodeFormatterMap {
	
	@SuppressWarnings("serial")
	static final Map<String , String> SIMPLEMAPFUNCTIONS = new HashMap<String , String>() {
	{
		put("setObjectforKey(", "put" + CodeFormatter.REVERSE_ARGS_MARKER + "(");
		put("removeObjectForKey(", "remove(");
		put("removeAllObjects(", "clear(");
		put("objectForKey(", "get(");
		put("allKeys(", "keySet(");
	}};

	
	/**
	 * @param call
	 * @param options
	 * @return dictionary constructors expressed as Map calls
	 */
	
	public String reformatConstructorCall(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		String mapCall = "Map" + options.getDirectoryTypes();
		if (proto.contains(mapCall + ".alloc().init(")) {
			proto = "new Hash" + mapCall + "()";
		}

		return proto;
	}


	/**
	 * Make sure to fix any reversed arguments after this
	 * @param call using objective C NSDictionary method
	 * @param options code formatting options
	 * @return Java equivalent function call using Map
	 */
	public String reformatMapFunctions(String call, ParseOptions options) {
		String proto = String.format("%s", call);
		String mapType = options.getDirectoryTypes();
		proto = CodeFormatter.makeSimpleMethodSubtitutions(SIMPLEMAPFUNCTIONS, proto);

		if (proto.contains("Map" + mapType + ".dictionary()")) {
			proto = proto.replace("Map" + mapType + ".dictionary", "new HashMap" + mapType);
		}
		return proto;
	}

}
