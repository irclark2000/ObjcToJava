package com.gmail.irclark2000.objc;

import java.util.ArrayList;

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
			String aCall = "String.stringWithFormat(";
			int index = proto.indexOf(aCall) + aCall.length() - 1;
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto.substring(index));
			String fmt = fixFormatString(args.get(0));
			proto = proto.substring(0, proto.indexOf(aCall)) + "String.format(" + fmt;
			for (int i=1; i < args.size(); i++) {
				proto += ", " + args.get(i);
			}
			proto+= ")";
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
	};
	
	String fixFormatString(String str) {
		StringBuffer fmt = new StringBuffer (str);
		for (int i=0; i < str.length() -1; i++) {
			if (fmt.charAt(i) == '%' && fmt.charAt(i+1) == '@') {
				fmt.setCharAt(i+1, 's');
				i++;
			}
		}
		return fmt.toString();
	}
}
