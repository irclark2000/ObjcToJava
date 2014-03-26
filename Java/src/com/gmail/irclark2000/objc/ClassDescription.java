package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassDescription {
	private Map<String, ClassDeclaration> headers;
	private Map<String, ClassDeclaration> mFiles;
	
	public Map<String, ClassDeclaration> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, ClassDeclaration> headers) {
		this.headers = headers;
	}
	public Map<String, ClassDeclaration> getmFiles() {
		return mFiles;
	}
	public void setmFiles(Map<String, ClassDeclaration> mFiles) {
		this.mFiles = mFiles;
	}
	ClassDescription(Map<String, ClassDeclaration> headerFile) {
		this.headers = headerFile;
		this.mFiles = new HashMap<String, ClassDeclaration>();
	}
	ClassDescription() {
		this.headers = new HashMap<String, ClassDeclaration>();
		this.mFiles = new HashMap<String, ClassDeclaration>();
	}
	
	public static class ClassDeclaration {
		public ArrayList<String> getProtocols() {
			return protocols;
		}

		public void clearProtocols() {
			protocols.clear();
		}

		public void addProtocol(String protocol) {
			protocols.add(protocol);
		}

		public ArrayList<String> getVariables() {
			return variables;
		}

		public void clearVariables() {
			variables.clear();
		}

		public void addVariable(String variable) {
			variables.add(variable);
		}

		public ArrayList<String> getProperties() {
			return properties;
		}

		public void clearProperties() {
			properties.clear();
		}

		public void addProperty(String property) {
			properties.add(property);
		}

		public ArrayList<String> getSynthesized() {
			return synthesized;
		}

		public void clearSynthesized() {
			synthesized.clear();
		}

		public void addSynthesized(String synthesize) {
			synthesized.add(synthesize);
		}

		public ArrayList<String> getDynamic() {
			return dynamic;
		}

		public void clearDynamic() {
			dynamic.clear();
		}

		public void addDynamic(String dyn) {
			dynamic.add(dyn);
		}

		public ArrayList<String> getEnums() {
			return enums;
		}

		public void clearEnums() {
			enums.clear();
		}

		public void addEnum(String en) {
			enums.add(en);
		}

		public ArrayList<String> getMethod_definitions() {
			return method_definitions;
		}

		public void addMethod_definition(String method_definition) {
			this.method_definitions.add(method_definition);
		}

		public void clearMethod_definition() {
			this.method_definitions.clear();
		}

		public ArrayList<String> getFunction_definitions() {
			return function_definitions;
		}

		public void addFunction_definition(String function_definition) {
			this.function_definitions.add(function_definition);
		}

		public void clearFunction_definition() {
			this.function_definitions.clear();
		}

		public ArrayList<String> getMethod_declarations() {
			return method_declarations;
		}

		public void addMethod_declaration(String method_declaration) {
			this.method_declarations.add(method_declaration);
		}

		public void clearMethod_declaration() {
			this.method_declarations.clear();
		}


		public ArrayList<String> getFunction_declarations() {
			return function_declarations;
		}

		public void addFunction_declaration(String function_declaration) {
			this.function_declarations.add(function_declaration);
		}

		public void clearFunction_declaration() {
			this.function_declarations.clear();
		}

		private ArrayList<String> protocols;
		private ArrayList<String> variables;
		private ArrayList<String> properties;
		private ArrayList<String> method_definitions;
		private ArrayList<String> function_definitions;
		private ArrayList<String> method_declarations;
		private ArrayList<String> function_declarations;
		// used to declare and make setters getters
		private ArrayList<String> synthesized;
		private ArrayList<String> dynamic;
		private ArrayList<String> enums;

		ClassDeclaration() {
			protocols = new ArrayList<String>();
			variables = new ArrayList<String>();
			properties = new ArrayList<String>();
			synthesized = new ArrayList<String>();
			dynamic = new ArrayList<String>();
			enums = new ArrayList<String>();
			method_definitions = new ArrayList<String>();
			function_definitions = new ArrayList<String>();
			method_declarations = new ArrayList<String>();
			function_declarations = new ArrayList<String>();
		}

		public static ClassDeclaration getClassDeclaration(
				Map<String, ClassDeclaration> map, String className) {
			ClassDeclaration cd = map.get(className);
			if (cd == null) {
				cd = new ClassDeclaration();
				map.put(className, cd);
			}
			return cd;
		}
	}
}
