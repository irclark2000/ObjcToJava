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
	private String directoryObject;
	private boolean parsingheader;
	
	ParseOptions () {
		constructorSignatures = new ArrayList<String>();
		directoryObject = "String";
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
	 * @return the directoryObject
	 */
	public String getDirectoryObject() {
		return directoryObject;
	}

	/**
	 * @param directoryObject the directoryObject to set
	 */
	public void setDirectoryObject(String directoryObject) {
		this.directoryObject = directoryObject;
	}

}
