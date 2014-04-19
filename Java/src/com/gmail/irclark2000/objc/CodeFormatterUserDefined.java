package com.gmail.irclark2000.objc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Isaac Clark Write new translations; Avoid touching basic code
 * 
 */
public class CodeFormatterUserDefined {

	static final Map<String , String> SIMPLEUSERDEFINEDSTRINGS = new HashMap<String , String>() {
	{
		put("GXXX", "GXXX");
	}};
	
/**
	 * @param id
	 * @param options
	 * @return rewritten identifier
	 */
	
	public String identifierFormatter(String id, ParseOptions options) {
		id = CodeFormatter.makeSimpleIDSubtitutions(SIMPLEUSERDEFINEDSTRINGS, id);
		return id;
	}

	/**
	 * @param call
	 * @param options
	 * @return rewritten method call
	 */
	public String reformatConstructorCall(String call, ParseOptions options) {
		return call;
	}

	/**
	 * @param call
	 * @param options
	 * @return rewritten method call
	 */
	public String reformatMethodCall(String call, ParseOptions options) {
		final String connectVariable = "";
		
		String proto = String.format("%s", call);
		if (proto.contains(".setHTTPBody(")) {
			int index = proto.indexOf(".setHTTPBody(");
			String arg1 = proto.substring(0, index);
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto.substring(index + 1));
			
			proto = "DataOutputStream wr = new DataOutputStream (" + arg1 + ".getOutputStream());\n";
			proto += "wr.writeBytes(" + args.get(0) + ");\nwr.flush();\nwr.close();\n;";
			proto +="";
		}
		if (proto.contains("WithURLcachePolicytimeoutInterval")) {
			int index = proto.indexOf("WithURLcachePolicytimeoutInterval");
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(index));
			proto = "(HttpURLConnection) (" + args.get(0) + ").openConnection();\n";
			proto += "//.setUseCaches(" + args.get(1) + ");\n";
			proto += "//.setConnectTimeout((int) (" + args.get(2) + "*1000));\n";
			proto += "//.setReadTimeout((int) (" + args.get(2) + "*1000));\n";
		}
		if (proto.contains("sendSynchronousRequestreturningResponseerror")) {
			int index = proto.indexOf("sendSynchronousRequestreturningResponse");
			ArrayList<String> args = CodeFormatter.getFunctionArguments(proto
					.substring(index));
			String response = args.get(1);
			response = response.substring(1);
			proto =  "InputStream is = " + args.get(0) + ".getInputStream();\n";
			proto += "BufferedReader rd = new BufferedReader(new InputStreamReader(is));\n";
			proto += "String line;\n" + response +  " = new StringBuffer();\n";
			proto += "while((line = rd.readLine()) != null) {\n";
			proto += response + ".append(line);\n" + response + ".append(\"\\r\");\n}\n";
			proto += "rd.close()\n //reponse.toString();\n";
		     
		}
		return proto;
	}
}
