package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeFormatter {
	public static final String REVERSE_ARGS_MARKER = "ReverseArgs";

	public String identifierFormatter(String id) {
		if (id.equals("NSString") || id.equals("NSMutableString")) {
			id = "String";
		} else if (id.equals("NSArray") || id.equals("NSMutableArray")) {
			id = "ArrayList";
		} else if (id.equals("NSDictionary")
				|| id.equals("NSMutableDictionary")) {
			id = "Map";
		} else if (id.equals("YES") || id.equals("TRUE")) {
			id = "true";
		} else if (id.equals("NO") || id.equals("FALSE")) {
			id = "false";
		} else if (id.equals("NSObject")) {
			id = "Object";
		} else if (id.equals("bool")) {
			id = "boolean";
		}
		return id;
	}

	public ArrayList<String> generateGetters(ClassDescription.ClassDeclaration cd) {
		ArrayList<String> code = new ArrayList<String>();
		ArrayList<String> properties = cd.getProperties();
		for (String property : properties) {
			String c = property;
			code.add(fixDeclarations(c));
		}

		return code;
	}

	public String generateConstructor(String code, String className) {
		String proto = String.format("%s", code);
		String[] parts = proto.split(" ");
		if (parts[1].startsWith("init")) {
			String cName = parts[0];
			if (cName.equals("Object")) {
				cName = className;
			}
			// while (proto.charAt(start) != '(') start++;
			proto = className;
		}
		return proto;
	}

	public String generateConstructorCall(String call) {
		String proto = String.format("%s", call);
		if (proto.contains("alloc().init")) {
			int start = proto.indexOf(".alloc().init");
			int end = start + 10;
			while (proto.charAt(end) != '(')
				end++;
			proto = "new " + proto.substring(0, start)
					+ proto.substring(end, call.length());
			String.format("%s", proto);
		}
		if (proto.contains(".autorelease()")) {
			proto = proto.replace(".autorelease()", "");
		}
		if (proto.contains("insertObjectatIndex")) {
			proto = proto.replace("insertObjectatIndex(", "add"
					+ REVERSE_ARGS_MARKER + "(");
			proto = fixReverseArgs(proto);
		}
		if (proto.contains("addObject")) {
			proto = proto.replace("addObject(", "add(");
		}
		if (proto.contains("objectAtIndex")) {
			proto = proto.replace("objectAtIndex(", "get(");
		}
		if (proto.contains("setObjectforKey")) {
			proto = proto.replace("setObjectforKey(", "put"
					+ REVERSE_ARGS_MARKER + "(");
			proto = fixReverseArgs(proto);
			// must reverse the args
		}
		if (proto.contains("objectForKey")) {
			proto = proto.replace("objectForKey(", "get(");
		}
		if (proto.contains("NSNull.null()")) {
			proto = proto.replace("NSNull.null()", "null");
		}
		if (proto.contains("isEqualToString")) {
			proto = proto.replace("isEqualToString(", "equals(");
		}
		if (proto.contains("allKeys")) {
			proto = proto.replace("allKeys(", "keySet(");
		}
		if (proto.contains("hasPrefix")) {
			proto = proto.replace("hasPrefix(", "startsWith(");
		}
		if (proto.contains("containsObject")) {
			proto = proto.replace("containsObject(", "contains(");
		}
		if (proto.contains("Map.dictionary()")) {
			proto = proto.replace("Map.dictionary", "HashMap<String, Object>");
		}
		if (proto.contains("ArrayList.arrayWithObjects(")) {
			proto = proto.replace("Map.dictionary", "HashMap<String, Object>");
		}
		if (proto.contains("String.stringWithFormat(")) {
			proto = proto.replace("String.stringWithFormat(", "String.format(");
			proto = fixFormatString(proto);
		}
		return proto;
	}

	String fixReverseArgs(String fCall) {
		// FIXME not handling case having conditional operator argument
		String call = String.format("%s", fCall);
		boolean insideQuote = false;
		int braceCount = 0;
		int parenCount = -1;
		int start = call.indexOf(REVERSE_ARGS_MARKER);
		if (start != -1) {
			int commaLoc = start + REVERSE_ARGS_MARKER.length();
			// find comma
			while (insideQuote || braceCount != 0 || parenCount != 0
					|| call.charAt(commaLoc) != ',') {
				char c = call.charAt(commaLoc);
				if (c == '"') {
					insideQuote = !insideQuote;
				} else if (c == '(' && !insideQuote) {
					parenCount++;
				} else if (c == ')' && !insideQuote) {
					parenCount--;
				} else if (c == '{' && !insideQuote) {
					braceCount++;
				} else if (c == '}' && !insideQuote) {
					braceCount--;
				}
				commaLoc++;
				if (commaLoc >= call.length()) {
					return call;
				}
			}
			// find starting parenthesis
			int parenOpen = start + +REVERSE_ARGS_MARKER.length();
			while (call.charAt(parenOpen) != '(') {
				parenOpen++;
				if (parenOpen >= call.length()) {
					return call;
				}
			}
			// find ending parenthesis
			int parenClose = commaLoc + 1;
			insideQuote = false;
			braceCount = 0;
			parenCount = 0;
			while (insideQuote || braceCount != 0 || parenCount != 0
					|| call.charAt(parenClose) != ')') {
				char c = call.charAt(parenClose);
				if (c == '"') {
					insideQuote = !insideQuote;
				} else if (c == '(' && !insideQuote) {
					parenCount++;
				} else if (c == ')' && !insideQuote) {
					if (parenCount != 0) {
						parenCount--;
					}
				} else if (c == '{' && !insideQuote) {
					braceCount++;
				} else if (c == '}' && !insideQuote) {
					braceCount--;
				}
				parenClose++;
				if (parenClose >= call.length()) {
					return call;
				}
			}
			// put a new call together
			String part1 = call.substring(0, parenOpen) + "(";
			String part2 = call.substring(commaLoc + 1, parenClose).trim()
					+ ", ";
			String part3 = call.substring(parenOpen + 1, commaLoc) + ")";
			String ans = part1 + part2 + part3;
			call = ans.replace(REVERSE_ARGS_MARKER, "");
		}
		return call;
	}

	String fixFormatString(String str) {
		return str;
	}

	// make sure things like static, final, public, private are in correct order
	String fixDeclarations(String decl) {
		String dec = "";
		String[] decParts = decl.split(" ");
		List<String> parts = Arrays.asList(decParts);
		if (parts.contains("public")) {
			dec = "public";
		} else if (parts.contains("private")) {
			dec = "public";
		}
		if (parts.contains("static")) {
			if (dec.length() == 0) {
				dec = "static";
			} else {
				dec += " static";
			}
		}
		if (parts.contains("final")) {
			if (dec.length() == 0) {
				dec = "final";
			} else {
				dec += " final";
			}
		}
		for (String part : parts) {
			if (part.equals("public") || part.equals("private")
					|| part.equals("static") || part.equals("final")) {
				continue;
			}
			if (dec.length() == 0) {
				dec = part;
			} else {
				dec = dec += " " + part;
			}
		}
		return dec;
	}

	String tabsForLevel(int level) {
		String tabs = "";
		for (int i = 0; i < level; i++) {
			tabs += "\t";
		}
		return tabs;
	}

	String codeIndenter(String code) {
		int level = 0;
		boolean insideQuote = false;
		boolean insideSingleQuote = false;
		boolean escape = false;
		boolean appendAgain = false;
		String rewrite = "";
		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);
			if (appendAgain) {
				rewrite += tabsForLevel(level);
				appendAgain = false;
			}
			rewrite += c;

			if (insideQuote || insideSingleQuote) {
				if (!escape && c == '\\') {
					escape = true;
				} else if (escape) {
					escape = false;
				}
				if (insideSingleQuote) {
					if (c == '\'' && !escape) {
						insideSingleQuote = false;
					}
				}
				if (insideQuote) {
					if (c == '\"' && !escape) {
						insideQuote = false;
					}
				}
			}
			if (!insideQuote && !insideSingleQuote) {
				if (c == '\n') {
					rewrite += tabsForLevel(level);
				} else if (c == '}') {
					appendAgain = true;
					level--;
				} else if (c == '{') {
					level++;
				}
			}
		}
		return rewrite;
	}
}