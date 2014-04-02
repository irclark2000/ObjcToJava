package com.gmail.irclark2000.objc;

/**
 * @author Isaac Clark
 * Handles transforming of String functions to Java equivalents
 *
 */
public class CodeFormatterString {

	/**
	 * @param call using objective C NSString method
	 * @return Java equivalent function call using String
	 */
	public String reformatStringFunctions (String call) {
		String proto = String.format("%s", call);
		if (proto.contains("substringToIndex")) {
			proto = proto.replace("substringToIndex(", "substring(0, ");
		}
		if (proto.contains("substringFromIndex")) {
			proto = proto.replace("substringFromIndex(", "substring(");
		}
		if (proto.contains("isEqualToString")) {
			proto = proto.replace("isEqualToString(", "equals(");
		}
		if (proto.contains("hasPrefix")) {
			proto = proto.replace("hasPrefix(", "startsWith(");
		}
		if (proto.contains("hasSuffix")) {
			proto = proto.replace("hasSuffix(", "endsWith(");
		}
		if (proto.contains("String.stringWithFormat(")) {
			proto = proto.replace("String.stringWithFormat(", "String.format(");
			proto = fixFormatString(proto);
		}
		if (proto.contains("String.stringWithString(")) {
			proto = proto.replace("String.stringWithString(", "String.format(\"%s\", " );
		}
		if (proto.contains("characterAtIndex(")) {
			proto = proto.replace("characterAtIndex(", "charAt(" );
		}
		if (proto.contains("uppercaseString(")) {
			proto = proto.replace("uppercaseStrint(", "toUpper(" );
		}
		if (proto.contains("lowercaseString(")) {
			proto = proto.replace("lowercaseStrint(", "toLower(" );
		}
		return proto;
	}
	
	String fixFormatString(String str) {
		return str;
	}
}
