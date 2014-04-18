package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Isaac Clark Handles transforming of String functions to Java
 *         equivalents
 * 
 */
public class CodeFormatterString {

	@SuppressWarnings("serial")
	static final Map<String, String> SIMPLESTRINGSTRINGS = new HashMap<String, String>() {
		{
			put("NSString", "String");
			put("NSMutableString", "String");
		}
	};

	@SuppressWarnings("serial")
	static final Map<String, String> SIMPLESTRINGFUNCTIONS = new HashMap<String, String>() {
		{
			put("substringToIndex(", "substring(0, ");
			put("substringFromIndex(", "substring(");
			put("caseInsensitiveCompare(", "compareTo(");
			put("isEqualToString(", "equals(");
			put("hasPrefix(", "startsWith(");
			put("hasSuffix(", "endsWith(");
			put("String.stringWithString(", "String.format(\"%s\", ");
			put("characterAtIndex(", "charAt(");
			put("uppercaseString(", "toUpper(");
			put("lowercaseString(", "toLower(");
		}
	};

	/**
	 * @param id
	 * @param options
	 * @return id after reformatting to Java conventions
	 */

	public String identifierFormatter(String id, ParseOptions options) {
		if (!options.useExternalTranslations()) {
			id = CodeFormatter
					.makeSimpleIDSubtitutions(SIMPLESTRINGSTRINGS, id);
		}
		return id;

	}

	/**
	 * @param call
	 *            using objective C NSString method
	 * @return Java equivalent function call using String
	 */
	public String reformatStringFunctions(String call) {
		String proto = String.format("%s", call);
		proto = CodeFormatter.makeSimpleMethodSubtitutions(
				SIMPLESTRINGFUNCTIONS, proto);
		if (proto.contains("String.stringWithFormat(")) {
			String aCall = "String.stringWithFormat(";
			int index = proto.indexOf(aCall) + aCall.length() - 1;
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(index));
			String fmt = fixFormatString(args.get(0));
			proto = proto.substring(0, proto.indexOf(aCall)) + "String.format("
					+ fmt;
			for (int i = 1; i < args.size(); i++) {
				proto += ", " + args.get(i);
			}
			proto += ")";
		}
		return proto;
	}

	String fixFormatString(String str) {
		StringBuffer fmt = new StringBuffer(str);
		for (int i = 0; i < str.length() - 1; i++) {
			if (fmt.charAt(i) == '%' && fmt.charAt(i + 1) == '@') {
				fmt.setCharAt(i + 1, 's');
				i++;
			}
		}
		return fmt.toString();
	}
}
