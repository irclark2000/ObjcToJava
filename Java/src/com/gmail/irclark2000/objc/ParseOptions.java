package com.gmail.irclark2000.objc;

import java.util.ArrayList;

public class ParseOptions {
	private ArrayList<String> constructorSignatures;
	private String outputFileName;
	private String className;
	private boolean parsingheader;
	
	ParseOptions () {
		constructorSignatures = new ArrayList<String>();
	}
	
	public ArrayList<String> getConstructorSignatures() {
		return constructorSignatures;
	}
	public void setConstructorSignatures(ArrayList<String> constructorSignatures) {
		this.constructorSignatures = constructorSignatures;
	}
	public String getOutputFileName() {
		return outputFileName;
	}
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public boolean isParsingheader() {
		return parsingheader;
	}
	public void setParsingheader(boolean parsingheader) {
		this.parsingheader = parsingheader;
	}

}
