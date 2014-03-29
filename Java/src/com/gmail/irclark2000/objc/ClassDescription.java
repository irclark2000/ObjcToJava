package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassDescription {
	private Map<String, ClassDeclaration> headers;
	private Map<String, ClassDeclaration> mFiles;
	private String tempClassName;

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

	public String getTempClassName() {
		return tempClassName;
	}

	public void setTempClassName(String classFileName) {
		this.tempClassName = classFileName;
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

		public void addVariables(ArrayList<String> variables) {
			for (String variable : variables) {
				this.addVariable(variable);
			}
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
		public void addProperties(ArrayList<String> declarations) {
			for (String decl : declarations) {
				this.addProperty(decl);
			}
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
		public void addSynthesized(ArrayList<String> definitions) {
			for (String def : definitions) {
				this.addSynthesized(def);
			}
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
		public void addDynamic(ArrayList<String> dynamic) {
			for (String def : dynamic) {
				this.addDynamic(def);
			}
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

		public void addMethod_definitions(ArrayList<String> definitions) {
			for (String def : definitions) {
				this.addMethod_definition(def);
			}
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

		public void addFunction_definitions(ArrayList<String> definitions) {
			for (String def : definitions) {
				this.addFunction_definition(def);
			}
		}

		public void clearFunction_definition() {
			this.function_definitions.clear();
		}

		public ArrayList<String> getMethod_declarations() {
			return method_declarations;
		}

		public void addMethod_declarations(ArrayList<String> declaration) {
			for (String decl : declaration) {
				this.addMethod_declaration(decl);
			}
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
