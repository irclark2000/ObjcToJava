package com.gmail.irclark2000.objc;

import java.util.ArrayList;

/**
 * @author Isaac Clark
 * Holds Parsing Options
 *
 */
public class ParseOptions {
	private ArrayList<String> constructorSignatures;
	private String outputFileName;
	private String className;
	private String directoryTypes;
	private boolean parsingheader;
	private boolean smartConstructorGeneration;
	private boolean constructor;
	
	ParseOptions () {
		constructorSignatures = new ArrayList<String>();
		setDirectoryTypes("<String, String>");
		setSmartConstructorGeneration(true);
	}
	
	/**
	 * @return signature collection
	 */
	public ArrayList<String> getConstructorSignatures() {
		return constructorSignatures;
	}
	/**
	 * @param constructorSignatures
	 */
	public void setConstructorSignatures(ArrayList<String> constructorSignatures) {
		this.constructorSignatures = constructorSignatures;
	}
	/**
	 * @return output file name
	 */
	public String getOutputFileName() {
		return outputFileName;
	}
	/**
	 * @param outputFileName
	 */
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}
	/**
	 * @return class name
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return true if parsing a header file; false if implementation file
	 * 
	 */
	public boolean isParsingheader() {
		return parsingheader;
	}
	/**
	 * @param parsingheader
	 */
	public void setParsingheader(boolean parsingheader) {
		this.parsingheader = parsingheader;
	}

	/**
	 * @return the smartConstructorGeneration
	 */
	public boolean useSmartConstructorGeneration() {
		return smartConstructorGeneration;
	}

	/**
	 * @param smartConstructorGeneration the smartConstructorGeneration to set
	 */
	public void setSmartConstructorGeneration(boolean smartConstructorGeneration) {
		this.smartConstructorGeneration = smartConstructorGeneration;
	}

	/**
	 * @return the directoryTypes
	 */
	public String getDirectoryTypes() {
		return directoryTypes;
	}

	/**
	 * @param directoryTypes the directoryTypes to set
	 */
	public void setDirectoryTypes(String directoryTypes) {
		this.directoryTypes = directoryTypes;
	}

	/**
	 * @return the constructor
	 */
	public boolean isConstructorMethod() {
		return constructor;
	}

	/**
	 * @param constructor the constructor to set
	 */
	public void setConstructorMethod(boolean constructor) {
		this.constructor = constructor;
	}

}
