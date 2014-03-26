package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.Map;

public class ClassDeclaration {
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

	private ArrayList<String> protocols;
	private ArrayList<String> variables;
	private ArrayList<String> properties;
	// used to declare and make setters getters
	private ArrayList<String> synthesized;
	private ArrayList<String> dynamic;

	ClassDeclaration() {
		protocols = new ArrayList<String>();
		variables = new ArrayList<String>();
		properties = new ArrayList<String>();
		synthesized = new ArrayList<String>();
		dynamic = new ArrayList<String>();
	}
	
	public static ClassDeclaration getClassDeclaration (Map<String, ClassDeclaration> map, String className) {
		ClassDeclaration cd = map.get(className);
		if (cd == null) {
			cd = new ClassDeclaration();
			map.put(className, cd);
		}
		return cd;
	}
}
