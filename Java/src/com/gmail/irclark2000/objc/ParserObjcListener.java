package com.gmail.irclark2000.objc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.gmail.irclark2000.objc.ClassDescription.ClassDeclaration;
import com.gmail.irclark2000.objc.parser.ObjCBaseListener;
import com.gmail.irclark2000.objc.parser.ObjCParser;
import com.gmail.irclark2000.objc.parser.ObjCParser.Abstract_declarator_suffixContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Class_method_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Compound_statement_partsContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.DeclarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Declaration_specifierContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Declarator_suffixContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.EnumeratorContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.External_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Implementation_definitionContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Init_declaratorContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Instance_method_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Keyword_argumentContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Method_typeContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Parameter_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Postfix_expression_completeContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Property_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Property_synthesize_itemContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Protocol_nameContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Specifier_qualifierContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.StatementContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Struct_declarationContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Struct_declaratorContext;
import com.gmail.irclark2000.objc.parser.ObjCParser.Type_qualifierContext;

public class ParserObjcListener extends ObjCBaseListener {
	ParseTreeProperty<String> code = new ParseTreeProperty<String>();
	ParseTreeProperty<ArrayList<String>> list = new ParseTreeProperty<ArrayList<String>>();
	ParseTreeProperty<ClassDeclaration> declarations = new ParseTreeProperty<ClassDeclaration>();

	private ClassDescription classDescription;
	private Map<String, ClassDescription.ClassDeclaration> classDeclarations;
	private Map<String, ClassDescription.ClassDeclaration> headerDeclarations;
	private String gClassName = "";
	private String gSuperClassName = "";
	private boolean skipMethods = false;
	private CodeFormatter codeFormat = new CodeFormatter();
	private ParseOptions options;
	public static final String CLASSNAME_MARKER = "__CLASS0x--x0NAME__";

	String getCode(ParseTree ctx) {
		return code.get(ctx);
	}

	void setCode(ParseTree ctx, String s) {
		code.put(ctx, s);
	}

	void setList(ParseTree ctx, ArrayList<String> s) {
		list.put(ctx, s);
	}

	ArrayList<String> getList(ParseTree ctx) {
		return list.get(ctx);
	}

	void setDeclaration(ParseTree ctx, ClassDeclaration s) {
		declarations.put(ctx, s);
	}

	ClassDeclaration getDeclaration(ParseTree ctx) {
		return declarations.get(ctx);
	}

	public boolean isSkipMethods() {
		return skipMethods;
	}

	public void setSkipMethods(boolean skipMethods) {
		this.skipMethods = skipMethods;
	}

	@Override
	public void exitTranslation_unit(ObjCParser.Translation_unitContext ctx) {
		String program = "";
		for (External_declarationContext ext : ctx.external_declaration()) {
			program = program + getCode(ext);
		}
		System.out.print(program);
	}

	@Override
	public void exitClass_implementation(
			ObjCParser.Class_implementationContext ctx) {
		String name = getCode(ctx.class_name());
		gClassName = name;
		String myClass = "public class " + name;
		if (ctx.superclass_name() != null) {
			myClass = myClass + " extends " + getCode(ctx.superclass_name());
		} else if (this.gSuperClassName.length() > 0) {
			myClass = myClass + " extends " + gSuperClassName;
		}
		myClass = myClass + " {\n";
		ClassDescription.ClassDeclaration cDec = null;
		if (ctx.implementation_definition_list() != null) {
			cDec = getDeclaration(ctx.implementation_definition_list());
		}
		// get methods first
		if (cDec != null) {
			for (String method : cDec.getMethod_definitions()) {
				String code = method.replaceAll(CLASSNAME_MARKER, gClassName);
				if (code.startsWith("public void dealloc")) {
					continue;
				}
				code = codeFormat.codeIndenter(code);
				myClass = myClass + code;
			}
		}

		// now getters and setters
		if (cDec != null) {
			ArrayList<String> setters = codeFormat.generateGetters(
					classDescription, cDec, gClassName);
			if (setters.size() > 0) {
				myClass += "\n";
				for (String setter : setters) {
					myClass += setter;
				}
			}
		}
		// now print out variables from property list
		// from header first
		ArrayList<String> vars = headerDeclarations.get(gClassName)
				.getProperties();
		for (String variable : vars) {
			myClass += "\n" + variable + ";";
		}
		// then from current set
		if (cDec != null) {
			vars = cDec.getProperties();
			for (String variable : vars) {
				myClass += "\n" + variable + ";";
			}
		}

		// now the external variables
		ClassDescription.ClassDeclaration vDec = classDeclarations.get("*");
	if (vDec != null) {
			ArrayList<String> variables = classDeclarations.get("*")
					.getVariables();
			if (variables.size() > 0) {
				myClass += "\n";
				for (String variable : variables) {
					myClass += "\n" + codeFormat.fixDeclarations(variable)
							+ ";";
				}
			}
		}
		// ArrayList<String> properties = cd.getProperties();
		// if (properties.size() > 0) {
		// myClass += "\n";
		// for (String variable : properties) {
		// myClass += variable;
		// }
		// }

		myClass = myClass + "\n}\n";
		writeOutput(options.getOutputFileName(), myClass);
		setCode(ctx, myClass);
	}

	@Override
	public void exitProperty_implementation(
			ObjCParser.Property_implementationContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);

		ClassDescription.ClassDeclaration cd = new ClassDescription.ClassDeclaration();
		ArrayList<String> holder = cd.getSynthesized();
		if (ctx.getChild(0).getText().equals("@dynamic")) {
			holder = cd.getDynamic();
		}
		ArrayList<String> properties = getList(ctx.property_synthesize_list());
		for (String item : properties) {
			holder.add(item);
		}
		setDeclaration(ctx, cd);
	}

	@Override
	public void exitProperty_synthesize_list(
			ObjCParser.Property_synthesize_listContext ctx) {
		ArrayList<String> list = new ArrayList<String>();
		for (Property_synthesize_itemContext item : ctx
				.property_synthesize_item()) {
			String itemText = getCode(item);
			list.add(itemText);
		}
		setList(ctx, list);
	}

	@Override
	public void exitProperty_synthesize_item(
			ObjCParser.Property_synthesize_itemContext ctx) {
		String item = "";
		if (ctx.IDENTIFIER().size() == 1) {
			item = ctx.IDENTIFIER(0).getText();
		} else {
			item = ctx.IDENTIFIER(0).getText() + "="
					+ ctx.IDENTIFIER(1).getText();
		}
		setCode(ctx, item);
	}

	@Override
	public void exitDeclaration(ObjCParser.DeclarationContext ctx) {
		String decl = getCode(ctx.declaration_minus_semi()) + ";\n";
		setCode(ctx, decl);
	}

	@Override
	public void exitDeclaration_minus_semi(
			ObjCParser.Declaration_minus_semiContext ctx) {
		String dms = getCode(ctx.declaration_specifiers());
		if (ctx.init_declarator_list() != null) {
			dms += " " + getCode(ctx.init_declarator_list());
		}
		setCode(ctx, dms);
	}

	@Override
	public void exitProperty_declaration(
			ObjCParser.Property_declarationContext ctx) {

		setList(ctx, getList(ctx.struct_declaration()));
	}

	@Override
	public void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx) {
		String sDecl = getCode(ctx.specifier_qualifier_list()) + " ";
		ArrayList<String> list = getList(ctx.struct_declarator_list());
		ArrayList<String> code = new ArrayList<String>();
		for (String item : list) {
			String sd = (sDecl + item).trim();
			code.add(sd);
		}
		setList(ctx, code);
	}

	@Override
	public void exitStruct_declarator_list(
			ObjCParser.Struct_declarator_listContext ctx) {
		ArrayList<String> list = new ArrayList<String>();
		for (Struct_declaratorContext item : ctx.struct_declarator()) {
			list.add(getCode(item));
		}
		setList(ctx, list);
	}

	@Override
	public void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx) {
		String dec = "";
		if (ctx.constant() == null) {
			dec = getCode(ctx.declarator());
		} else {
			if (ctx.declarator() != null) {
				dec = getCode(ctx.declarator());
			}
			if (dec.length() == 0) {
				dec = ":" + getCode(ctx.constant());
			} else {
				dec += ":" + getCode(ctx.constant());
			}
		}
		setCode(ctx, dec);
	}

	@Override
	public void exitImplementation_definition(
			ObjCParser.Implementation_definitionContext ctx) {
		ClassDescription.ClassDeclaration cDec = new ClassDescription.ClassDeclaration();
		if (ctx.function_definition() != null) {
			String function = getCode(ctx.function_definition());
			cDec.addFunction_definition(function);
		}
		if (ctx.declaration() != null) {

		}
		if (ctx.class_method_definition() != null) {
			String method = getCode(ctx.class_method_definition());
			cDec.addMethod_definition(method);
		}
		if (ctx.instance_method_definition() != null) {
			String method = getCode(ctx.instance_method_definition());
			cDec.addMethod_definition(method);
		}
		if (ctx.property_implementation() != null) {
			ClassDescription.ClassDeclaration list = getDeclaration(ctx
					.getChild(0));

			for (String item : list.getSynthesized()) {
				cDec.addSynthesized(item);
			}
			for (String item : list.getDynamic()) {
				cDec.addDynamic(item);
			}
		}
		setDeclaration(ctx, cDec);
		setCode(ctx, "");
	}

	@Override
	public void exitImplementation_definition_list(
			ObjCParser.Implementation_definition_listContext ctx) {
		ClassDescription.ClassDeclaration cd = new ClassDescription.ClassDeclaration();
		for (Implementation_definitionContext imp : ctx
				.implementation_definition()) {
			ClassDescription.ClassDeclaration item = getDeclaration(imp);
			cd.addFunction_definitions(item.getFunction_definitions());
			cd.addMethod_definitions(item.getMethod_definitions());
			cd.addSynthesized(item.getSynthesized());
			cd.addDynamic(item.getDynamic());
		}
		setDeclaration(ctx, cd);
	}

	@Override
	public void exitExternal_declaration(
			ObjCParser.External_declarationContext ctx) {
		ClassDescription.ClassDeclaration cd = choseMapAndDeclaration(gClassName);
		if (ctx.declaration() != null) {
			String dec = "static " + getCode(ctx.declaration());
			cd.addVariable(dec);
			setCode(ctx, "");
		} else {
			String code = getCode(ctx.getChild(0));
			setCode(ctx, code);
		}
	}

	@Override
	public void exitCategory_implementation(
			ObjCParser.Category_implementationContext ctx) {
		String name = getCode(ctx.class_name());
		gClassName = name;
		String myClass = "public class " + name;
		myClass = myClass + " {\n";
		ClassDescription.ClassDeclaration cDec = null;
		if (ctx.implementation_definition_list() != null) {
			cDec = getDeclaration(ctx.implementation_definition_list());
		}

		// methods first
		if (cDec != null) {
			for (String method : cDec.getMethod_definitions()) {
				myClass = myClass + method;
			}
		}
		// myClass = myClass + getCode(ctx.implementation_definition_list());
		// ClassDescription.ClassDeclaration cd =
		// choseMapAndDeclaration(gClassName);
		// ArrayList<String> setters = codeFormat.generateGetters(
		// classDescription, gClassName);
		// if (setters.size() > 0) {
		// myClass += "\n";
		// for (String setter : setters) {
		// myClass += setter;
		// }
		// }
		// ArrayList<String> variables = cd.getVariables();
		// if (variables.size() > 0) {
		// myClass += "\n";
		// for (String variable : variables) {
		// myClass += codeFormat.fixDeclarations(variable);
		// }
		// variables.clear();
		// }
		//
		// ArrayList<String> gVariables = ClassDeclaration.getClassDeclaration(
		// classDeclarations, "*").getVariables();
		// if (gVariables.size() > 0) {
		// myClass += "\n";
		// for (String variable : gVariables) {
		// myClass += codeFormat.fixDeclarations(variable);
		// }
		// gVariables.clear();
		// }
		// ArrayList<String> properties = cd.getProperties();
		// if (properties.size() > 0) {
		// myClass += "\n";
		// for (String variable : properties) {
		// myClass += variable;
		// }
		// }
		//
		// myClass = myClass + "}\n";
		// setCode(ctx, myClass);
	}

	@Override
	public void exitCategory_interface(ObjCParser.Category_interfaceContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String decs = "";
		String className = getCode(ctx.class_name());
		String categoryName = "";
		gClassName = className;
		if (ctx.category_name() != null) {
			categoryName = getCode(ctx.category_name());
		}
		ClassDescription.ClassDeclaration cDec = choseMapAndDeclaration(gClassName);
		if (ctx.interface_declaration_list() != null) {
			ClassDescription.ClassDeclaration list = getDeclaration(ctx
					.interface_declaration_list());
			cDec.addMethod_declarations(list.getMethod_declarations());
			cDec.addProperties(list.getProperties());
			cDec.addVariables(list.getVariables());
		}
		setCode(ctx, decs);
	}

	@Override
	public void exitInterface_declaration_list(
			ObjCParser.Interface_declaration_listContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		ClassDescription.ClassDeclaration iFace = new ClassDescription.ClassDeclaration();

		if (ctx.declaration() != null) {
			for (DeclarationContext decl : ctx.declaration()) {
				String code = getCode(decl);
				String.format("%s", code);
			}
		}
		if (ctx.class_method_declaration() != null) {
			for (Class_method_declarationContext meth : ctx
					.class_method_declaration()) {
				iFace.addMethod_declaration(getCode(meth));
			}
		}
		if (ctx.instance_method_declaration() != null) {
			for (Instance_method_declarationContext meth : ctx
					.instance_method_declaration()) {
				iFace.addMethod_declaration(getCode(meth));
			}
		}
		if (ctx.property_declaration() != null) {
			for (Property_declarationContext decl : ctx.property_declaration()) {
				ArrayList<String> list = getList(decl);
				for (String d : list) {
					iFace.addProperty(d);
				}
			}
		}

		setDeclaration(ctx, iFace);
	}

	@Override
	public void exitInstance_method_definition(
			ObjCParser.Instance_method_definitionContext ctx) {
		String call = getCode(ctx.method_definition());
		String mDef = "public " + call;
		setCode(ctx, mDef);
	}

	@Override
	public void exitClass_method_definition(
			ObjCParser.Class_method_definitionContext ctx) {
		String mDef = "public static " + getCode(ctx.method_definition());
		setCode(ctx, mDef);
	}

	@Override
	public void exitClass_method_declaration(
			ObjCParser.Class_method_declarationContext ctx) {
		code.put(ctx, "public static " + getCode(ctx.getChild(0)));
	}

	@Override
	public void exitInstance_method_declaration(
			ObjCParser.Instance_method_declarationContext ctx) {
		code.put(ctx, getCode(ctx.getChild(0)));
	}

	@Override
	public void exitMethod_declaration(ObjCParser.Method_declarationContext ctx) {
		String method = "";
		if (ctx.method_type() != null) {
			method = getCode(ctx.method_type());
		}
		if (method.length() != 0) {
			method = getCode(ctx.method_selector());
		} else {
			method += " " + getCode(ctx.method_selector());
		}

	}

	@Override
	public void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx) {
		String en = "enum ";
		if (ctx.identifier() != null) {
			en += ctx.identifier().getText() + " ";
			if (ctx.enumerator_list() != null) {
				ArrayList<String> list = getList(ctx.enumerator_list());
				en += " {";
				for (int i = 0; i < list.size(); i++) {
					if (i == 0) {
						en += "{ ";
					} else {
						en += ", ";
					}
					en += list.get(i);
				}
				en += "}";
			}
		} else {
			if (ctx.enumerator_list() != null) {
				ArrayList<String> list = getList(ctx.enumerator_list());
				for (int i = 0; i < list.size(); i++) {
					if (i == 0) {
						en += "{ ";
					} else {
						en += ", ";
					}
					en += list.get(i);
				}
			}
			en += "}";
		}
		ClassDeclaration cd = choseMapAndDeclaration(gClassName);
		cd.addEnum(en);
		setCode(ctx, "");
	}

	// used for definitions which can appear in either .h or .m files
	public ClassDeclaration choseMapAndDeclaration(String className) {
		ClassDeclaration cd;
		String cName = className;
		if (cName.length() == 0) {
			cName = "*";
		}
		if (options.isParsingheader()) {
			cd = ClassDeclaration
					.getClassDeclaration(headerDeclarations, cName);
		} else {
			cd = ClassDeclaration.getClassDeclaration(classDeclarations, cName);
		}
		return cd;
	}

	@Override
	public void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx) {
		ArrayList<String> list = new ArrayList<String>();
		for (EnumeratorContext en : ctx.enumerator()) {
			String enumerator = getCode(en);
			list.add(enumerator);
		}
		setList(ctx, list);
	}

	@Override
	public void exitEnumerator(ObjCParser.EnumeratorContext ctx) {
		String en = ctx.identifier().getText();
		if (ctx.constant_expression() != null) {
			en += " = " + getCode(ctx.constant_expression());
		}
		setCode(ctx, en);
	}

	@Override
	public void exitMethod_definition(ObjCParser.Method_definitionContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String methDef = "";
		if (ctx.method_type() != null) {
			methDef += getCode(ctx.method_type()) + " ";
		}
		String selector = getCode(ctx.method_selector());
		methDef += selector;
		String cName = (gClassName.length() == 0) ? CLASSNAME_MARKER
				: gClassName;
		methDef = codeFormat.generateConstructor(methDef, cName);
		if (selector.startsWith("init")) {
		}
		if (ctx.init_declarator_list() != null) {
			methDef += getCode(ctx.init_declarator_list());
		}
		methDef += getCode(ctx.compound_statement());
		setCode(ctx, methDef);
	}

	@Override
	public void exitMethod_selector(ObjCParser.Method_selectorContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String mSelect = "";
		String body = "";
		String params = "";
		if (ctx.selector() != null) {
			mSelect = getCode(ctx.selector());
		} else {
			if (ctx.keyword_declarator() != null) {
				for (int i = 0; i < ctx.keyword_declarator().size(); i++) {
					String parts[] = getCode(ctx.keyword_declarator(i)).split(
							":");
					body += parts[0];
					if (i == 0) {
						params += parts[1];
					} else {
						params += ", " + parts[1];
					}
				}
				mSelect = body + "(" + params + ")";
			}
			if (ctx.parameter_list() != null) {
				if (mSelect.length() == 0) {
					mSelect = getCode(ctx.parameter_list());
				} else {
					mSelect += " " + getCode(ctx.parameter_list());
				}
			}
		}
		setCode(ctx, mSelect);
	}

	@Override
	public void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String key = "";
		String body = "";
		String param = "";
		String name = "";
		if (ctx.selector() != null) {
			body = getCode(ctx.selector());
		}
		for (Method_typeContext mt : ctx.method_type()) {
			param += getCode(mt);
		}
		name = getCode(ctx.identifier());
		key = body + ":" + param + " " + name;

		setCode(ctx, key);
	}

	@Override
	public void exitMethod_type(ObjCParser.Method_typeContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		// String mType = "(" + getCode(ctx.type_name()) + ")";
		String mType = getCode(ctx.type_name());
		setCode(ctx, mType);
	}

	@Override
	public void exitInit_declarator_list(
			ObjCParser.Init_declarator_listContext ctx) {
		String iDecs = "";
		for (Init_declaratorContext dec : ctx.init_declarator()) {
			if (iDecs.length() == 0) {
				iDecs = getCode(dec);
			} else {
				iDecs += ", " + getCode(dec);
			}
		}
		setCode(ctx, iDecs);
	}

	@Override
	public void exitInit_declarator(ObjCParser.Init_declaratorContext ctx) {
		String iDec = getCode(ctx.declarator());
		if (ctx.initializer() != null) {
			iDec += " = " + getCode(ctx.initializer());
		}
		setCode(ctx, iDec);
	}

	@Override
	public void exitInitializer(ObjCParser.InitializerContext ctx) {
		String init = "";
		if (ctx.assignment_expression() != null) {
			init = getCode(ctx.assignment_expression());
		} else {
			init = "{\n";
			for (int i = 0; i < ctx.initializer().size(); i++) {
				if (i == 0) {
					init += getCode(ctx.initializer(i));
				} else {
					init += ", " + getCode(ctx.initializer(i));
				}
			}
			init += "\n}\n";
		}
		setCode(ctx, init);
	}

	@Override
	public void exitType_name(ObjCParser.Type_nameContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String tName = getCode(ctx.specifier_qualifier_list());
		String tName2 = getCode(ctx.getChild(1));
		setCode(ctx, tName + tName2);
	}

	@Override
	public void exitSpecifier_qualifier_list(
			ObjCParser.Specifier_qualifier_listContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String quals = "";
		for (Specifier_qualifierContext q : ctx.specifier_qualifier()) {
			if (quals.length() == 0) {
				quals = getCode(q);
			} else {
				quals += " " + getCode(q);
			}
		}
		setCode(ctx, quals);
	}

	@Override
	public void exitSpecifier_qualifier(
			ObjCParser.Specifier_qualifierContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String qual = "";
		if (ctx.type_specifier() != null) {
			qual = getCode(ctx.type_specifier());
		} else {
			qual = getCode(ctx.type_qualifier());
		}
		setCode(ctx, qual);
	}

	@Override
	public void exitType_specifier(ObjCParser.Type_specifierContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String tSpec = getCode(ctx.getChild(0));
		setCode(ctx, tSpec);
	}

	@Override
	public void exitAdecRecurse(ObjCParser.AdecRecurseContext ctx) {
		String adec = "(" + getCode(ctx.getChild(1)) + ")";
		for (Abstract_declarator_suffixContext d : ctx
				.abstract_declarator_suffix()) {
			adec += getCode(d);
		}
		setCode(ctx, adec);
	}

	// this is where we drop that troublesome '*'
	@Override
	public void exitAdecType(ObjCParser.AdecTypeContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		int index = message.indexOf("*");
		if (index != -1) {
			message += "*";
		}
		String adec = "";
		for (Type_qualifierContext d : ctx.type_qualifier()) {
			adec += getCode(d);
		}
		adec += getCode(ctx.abstract_declarator());
		setCode(ctx, adec);
	}

	@Override
	public void exitAdecConst(ObjCParser.AdecConstContext ctx) {
		String adec = "[";
		if (ctx.constant_expression() != null) {
			for (int i = 0; i < ctx.constant_expression().size(); i++) {
				adec += getCode(ctx.constant_expression(i));
			}
		}
		adec += "]";
		setCode(ctx, adec);
	}

	@Override
	public void exitAdecNone(ObjCParser.AdecNoneContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitAbstract_declarator_suffix(
			ObjCParser.Abstract_declarator_suffixContext ctx) {
		String suffix = "";
		if (ctx.getChild(0).getText().equals("[")) {
			suffix = "[";
			if (ctx.constant_expression() != null) {
				suffix += getCode(ctx.constant_expression());
			}
			suffix = "]";
		} else {
			suffix = "(";
			if (ctx.parameter_declaration_list() != null) {
				suffix += getCode(ctx.parameter_declaration_list());
			}
			suffix += ")";
		}
		setCode(ctx, suffix);
	}

	@Override
	public void exitParameter_declaration_list(
			ObjCParser.Parameter_declaration_listContext ctx) {
		String list = "";
		for (int i = 0; i < ctx.parameter_declaration().size(); i++) {
			Parameter_declarationContext dec = ctx.parameter_declaration(i);
			if (i == 0) {
				list = getCode(dec);
			} else {
				list += ", " + getCode(dec);
			}
		}
		setCode(ctx, list);
	}

	@Override
	public void exitParameter_declaration(
			ObjCParser.Parameter_declarationContext ctx) {
		String dec = getCode(ctx.declaration_specifiers());
		if (ctx.abstract_declarator() != null) {
			dec += " " + getCode(ctx.abstract_declarator());
		} else {
			if (ctx.declarator() != null) {
				dec += " " + getCode(ctx.declarator());
			}
		}
		setCode(ctx, dec);
	}

	@Override
	public void exitDeclaration_specifiers(
			ObjCParser.Declaration_specifiersContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String specs = "";
		for (Declaration_specifierContext spec : ctx.declaration_specifier()) {
			if (specs.length() == 0) {
				specs = getCode(spec);
			} else {
				specs += " " + getCode(spec);
			}
		}
		setCode(ctx, specs);
	}

	@Override
	public void exitDeclaration_specifier(
			ObjCParser.Declaration_specifierContext ctx) {
		setCode(ctx, getCode(ctx.getChild(0)));
	}

	@Override
	public void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx) {
		String suffix = "";
		if (ctx.getChild(0).getText().equals("[")) {
			if (ctx.constant_expression() != null) {
				suffix = "[" + getCode(ctx.constant_expression()) + "]";
			} else {
				suffix = "[]";
			}
		} else {
			if (ctx.parameter_list() != null) {
				suffix = "(" + getCode(ctx.parameter_list()) + ")";
			} else {
				suffix = "()";
			}
		}
		setCode(ctx, suffix);
	}

	@Override
	public void exitDeclarator(ObjCParser.DeclaratorContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		int index = message.indexOf("*");
		if (index != -1) {
			message += "*";
		}
		String decl = "";
		if (ctx.direct_declarator() == null) {
			for (Type_qualifierContext t : ctx.type_qualifier()) {
				if (decl.length() == 0) {
					decl = getCode(t);
				} else {
					decl += " " + getCode(t);
				}
			}
			if (decl.length() == 0) {
				decl = getCode(ctx.declarator());
			} else {
				decl += " " + getCode(ctx.declarator());
			}
		} else {
			decl = getCode(ctx.direct_declarator());
		}
		setCode(ctx, decl);
	}

	@Override
	public void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx) {
		String direct = "";
		if (ctx.identifier() != null) {
			direct = getCode(ctx.identifier());
			for (Declarator_suffixContext s : ctx.declarator_suffix()) {
				direct += " " + getCode(s);
			}
		} else {
			direct = "(" + getCode(ctx.declarator()) + ")";
			for (Declarator_suffixContext s : ctx.declarator_suffix()) {
				direct += " " + getCode(s);
			}
		}

		setCode(ctx, direct);
	}

	@Override
	public void exitStatement_list(ObjCParser.Statement_listContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String states = "";
		for (StatementContext stmt : ctx.statement()) {
			states += getCode(stmt);
		}
		setCode(ctx, states);
	}

	@Override
	public void exitCompound_statement(ObjCParser.Compound_statementContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String cStatements = "{\n";
		for (Compound_statement_partsContext stmt : ctx
				.compound_statement_parts()) {
			cStatements += getCode(stmt);
		}
		cStatements += "}\n";
		setCode(ctx, cStatements);
	}

	public void exitCompound_statement_parts(
			ObjCParser.Compound_statement_partsContext ctx) {

		String stmts = "";
		if (ctx.declaration() != null) {
			stmts += getCode(ctx.declaration());
		} else {
			stmts += getCode(ctx.statement_list());
		}
		setCode(ctx, stmts);
	}

	@Override
	public void exitStatement(ObjCParser.StatementContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setCode(ctx, getCode(ctx.getChild(0)));
	}

	@Override
	public void exitLabelid(ObjCParser.LabelidContext ctx) {
		String label = getCode(ctx.identifier()) + ": "
				+ getCode(ctx.getChild(2));
		setCode(ctx, label);
	}

	@Override
	public void exitFor_complete(ObjCParser.For_completeContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String fc = "";
		if (ctx.declaration_minus_semi() != null) {
			fc = getCode(ctx.declaration_minus_semi())
					+ getCode(ctx.getChild(1));
		} else if (ctx.getChild(0).getText().equals(";")) {
			int i = 1;
			String[] parts = ctx.getText().split(";");
			fc += ";";
			if (parts[1].length() > 0) {
				fc += getCode(ctx.expression(i++));
			}
			fc += ";";
			if (parts[2].length() > 0) {
				fc += getCode(ctx.expression(i++));
			}
		} else {
			int i = 1;
			fc += getCode(ctx.expression(0));
			String[] parts = ctx.getText().split(";");
			fc += ";";
			if (parts[1].length() > 0) {
				fc += getCode(ctx.expression(i++));
			}
			fc += ";";
			if (parts[2].length() > 0) {
				fc += getCode(ctx.expression(i++));
			}
		}
		fc += ")";
		setCode(ctx, fc);
	}

	@Override
	public void exitForcomplete1(ObjCParser.Forcomplete1Context ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String f = "";
		if (ctx.getChild(0).getText().equals(";")) {
			String[] parts = ctx.getText().split(";");
			f += ";";
			int i = 0;
			if (parts[1].length() > 0) {
				f += getCode(ctx.expression(i++));
			}
			f += ";";
			if (parts[2].length() > 0) {
				f += getCode(ctx.expression(i++));
			}
		} else {
			f = " : " + getCode(ctx.expression(0));
		}
		setCode(ctx, f);
	}

	@Override
	public void exitForcomplete2(ObjCParser.Forcomplete2Context ctx) {
		String fComplete = " : " + getCode(ctx.expression());
		setCode(ctx, fComplete);
	}

	@Override
	public void exitCase(ObjCParser.CaseContext ctx) {
		String caseStatement = "case " + getCode(ctx.constant_expression())
				+ ":\n" + getCode(ctx.statement());
		setCode(ctx, caseStatement);
	}

	@Override
	public void exitDefault(ObjCParser.DefaultContext ctx) {
		String defStatement = "default: \n" + getCode(ctx.getChild(2)) + ";\n";
		setCode(ctx, defStatement);
	}

	@Override
	public void exitGetter_call(ObjCParser.Getter_callContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String[] parts = getCode(ctx.dotidentifier()).split(":");
		parts[1] = parts[1].substring(0, 1).toUpperCase()
				+ parts[1].substring(1);
		String call = String.format("%s.get%s()", parts[0], parts[1]);
		setCode(ctx, call);
	}

	@Override
	public void exitSetter_call(ObjCParser.Setter_callContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String[] parts = getCode(ctx.dotidentifier()).split(":");
		parts[1] = parts[1].substring(0, 1).toUpperCase()
				+ parts[1].substring(1);
		String value = getCode(ctx.expression());
		String call = String.format("%s.set%s(%s)", parts[0], parts[1], value);
		setCode(ctx, call);
	}

	@Override
	public void exitDotidentifier(ObjCParser.DotidentifierContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String[] parts = ctx.getText().split("\\.");
		String code = String.format("%s:%s",
				codeFormat.identifierFormatter(parts[0]), parts[1]);
		setCode(ctx, code);
	}

	@Override
	public void exitMessage_expression(ObjCParser.Message_expressionContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String receiver = getCode(ctx.receiver());
		String mExpression = "";
		String cName = gClassName;
		if (cName.length() == 0) {
			cName = classDescription.getTempClassName();
		}

		if (ctx.getter_call() != null) {
			mExpression = getCode(ctx.getter_call());
		} else {
			if (receiver.equals(gClassName)) {
				// mExpression = "" + getCode(ctx.message_selector());
				// experiment with this
				mExpression = getCode(ctx.receiver()) + "."
						+ getCode(ctx.message_selector());
			} else {
				mExpression = getCode(ctx.receiver()) + "."
						+ getCode(ctx.message_selector());
			}
			mExpression = codeFormat.generateConstructorCall(mExpression, options);
		}
		setCode(ctx, mExpression);
	}

	@Override
	public void exitMessage_selector(ObjCParser.Message_selectorContext ctx) {
		String selector = "";
		// String message = ctx.getText();
		// message += "";
		if (ctx.selector() != null) {
			selector = getCode(ctx.selector()) + "()";
		} else { // keywords
			String params = "";
			String types = "";
			for (Keyword_argumentContext ka : ctx.keyword_argument()) {
				String parts[] = getCode(ka).split(":", 2);
				types += parts[0];
				if (params.length() > 0) {
					params = params + ", " + parts[1];
				} else {
					params = parts[1];
				}
			}
			selector = types + "(" + params + ")";
		}
		setCode(ctx, selector);
	}

	@Override
	public void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String key = "";
		if (ctx.selector() != null) {
			key = getCode(ctx.selector());
		}
		key += ":" + getCode(ctx.expression());
		setCode(ctx, key);
	}

	@Override
	public void exitSemi_statement(ObjCParser.Semi_statementContext ctx) {
		String semi = "";
		if (ctx.getChild(0).getText().equals(";")) {
			semi = ";\n";
		} else {
			semi = getCode(ctx.getChild(0)) + ";\n";
		}
		setCode(ctx, semi);
	}

	@Override
	public void exitIfstmt(ObjCParser.IfstmtContext ctx) {
		String ifSt = "if(" + getCode(ctx.expression()) + ")"
				+ getCode(ctx.statement(0));
		if (ctx.statement().size() > 1) {
			ifSt += "\n" + "else " + getCode(ctx.statement(1));
		}
		setCode(ctx, ifSt);
	}

	@Override
	public void enterWhile_statement(ObjCParser.While_statementContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String exp = getCode(ctx.parenthetical_expression());
		String st = getCode(ctx.statement());
		String wh = "while (" + exp + ")";
		wh += st;
		setCode(ctx, wh);

	}

	@Override
	public void exitIterFor(ObjCParser.IterForContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String fr = "for (" + getCode(ctx.for_complete());
		fr += getCode(ctx.statement());
		setCode(ctx, fr);
	}

	@Override
	public void exitDowhile(ObjCParser.DowhileContext ctx) {
		String doWhile = "do" + getCode(ctx.statement()) + " while("
				+ getCode(ctx.expression()) + ";\n}";
		setCode(ctx, doWhile);
	}

	@Override
	public void exitJump_statement(ObjCParser.Jump_statementContext ctx) {
		String type = ctx.getText();
		String jump = "";
		if (type.startsWith("goto")) {
			jump += "goto " + ctx.identifier().getText() + ";\n";
		} else if (type.startsWith("continue")) {
			jump += "continue;\n";
		} else if (type.startsWith("return")) {
			jump += "return " + getCode(ctx.expression()) + ";\n";
		} else if (type.startsWith("break")) {
			jump += "break;\n";
		}
		setCode(ctx, jump);
	}

	@Override
	public void exitSwitch(ObjCParser.SwitchContext ctx) {
		String swSt = "switch(" + getCode(ctx.expression()) + ")\n"
				+ getCode(ctx.statement());
		setCode(ctx, swSt);
	}

	@Override
	public void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
		String name = getCode(ctx.identifier());
		setCode(ctx, name);
	}

	@Override
	public void exitClass_name(ObjCParser.Class_nameContext ctx) {
		String name = getCode(ctx.identifier());
		setCode(ctx, name);
	}

	@Override
	public void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx) {
		String name = getCode(ctx.identifier());
		setCode(ctx, name);
	}

	@Override
	public void exitIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitStaticStoreClass(ObjCParser.StaticStoreClassContext ctx) {
		setCode(ctx, "public static");
	}

	@Override
	public void exitSimple_type_specifier(
			ObjCParser.Simple_type_specifierContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String tSpec = getCode(ctx.getChild(0));
		setCode(ctx, tSpec);
	}

	@Override
	public void exitPrimitive_type_specifier(
			ObjCParser.Primitive_type_specifierContext ctx) {
		setCode(ctx, ctx.getText());
	}

	// not handled;
	@Override
	public void exitUnusual_type_specifier(
			ObjCParser.Unusual_type_specifierContext ctx) {
		setCode(ctx, "");
	}

	// protocol reference list stuff not handled for now
	@Override
	public void exitIdTypeSpec(ObjCParser.IdTypeSpecContext ctx) {
		setCode(ctx, "Object");
	}

	// protocol reference list stuff not handled for now
	@Override
	public void enterClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx) {
		String cName = getCode(ctx.class_name());
		setCode(ctx, cName);
	}

	@Override
	public void exitConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx) {
		setCode(ctx, "");
	}

	// not handling 'volatile' or 'protocol qualifier'
	@Override
	public void exitIgnoreTypeQualifier(
			ObjCParser.IgnoreTypeQualifierContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitConstant(ObjCParser.ConstantContext ctx) {
		String stmt = ctx.getText();
		setCode(ctx, stmt);
	}

	@Override
	public void exitString_constant(ObjCParser.String_constantContext ctx) {
		String stmt = ctx.getText().substring(1);
		setCode(ctx, stmt);
	}

	@Override
	public void exitSimple_expression(ObjCParser.Simple_expressionContext ctx) {
		String simple = "";
		if (ctx.identifier() != null) {
			simple = getCode(ctx.identifier());
		} else {
			// int n = ctx.getChildCount();
			simple = getCode(ctx.getChild(0));
		}
		setCode(ctx, simple);
	}

	@Override
	public void exitParenthetical_expression(
			ObjCParser.Parenthetical_expressionContext ctx) {
		String stmt = "(" + getCode(ctx.expression()) + ")";
		setCode(ctx, stmt);
	}

	@Override
	public void exitSelf_expression(ObjCParser.Self_expressionContext ctx) {
		setCode(ctx, "this");
	}

	// encode, protocol, and selector statements
	@Override
	public void exitUnsupported_instruction(
			ObjCParser.Unsupported_instructionContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitReceiver(ObjCParser.ReceiverContext ctx) {
		String rec = "";
		if (ctx.expression() != null) {
			rec = getCode(ctx.expression());
		} else if (ctx.class_name() != null) {
			rec = getCode(ctx.class_name());
		} else if (ctx.getter_call() != null) {
			rec = getCode(ctx.getter_call());
		} else { // super
			rec = "super";
		}
		setCode(ctx, rec);
	}

	@Override
	public void exitSelector(ObjCParser.SelectorContext ctx) {
		String selector = getCode(ctx.getChild(0));

		setCode(ctx, selector);
	}

	@Override
	public void exitExpression(ObjCParser.ExpressionContext ctx) {
		String message = ctx.getText();
		String.format("%s", message);
		String exp = getCode(ctx.assignment_expression().get(0));
		if (exp.equals("nil"))
			exp = "null";

		for (int i = 1; i < ctx.assignment_expression().size(); i++) {
			exp += ", " + getCode(ctx.assignment_expression().get(i));
		}
		setCode(ctx, exp);
	}

	@Override
	public void exitAssignment_expression(
			ObjCParser.Assignment_expressionContext ctx) {
		String aExp = getCode(ctx.conditional_expression());
		if (ctx.assignment_operator() != null) {
			aExp += " " + ctx.assignment_operator().getText() + " "
					+ getCode(ctx.assignment_expression());
		}
		setCode(ctx, aExp);
	}

	@Override
	public void exitLogical_or_expression(
			ObjCParser.Logical_or_expressionContext ctx) {
		String logic = getCode(ctx.logical_and_expression(0));
		for (int i = 1; i < ctx.logical_and_expression().size(); i++) {
			logic += " || " + getCode(ctx.logical_and_expression(i));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitAnd_expression(ObjCParser.And_expressionContext ctx) {
		String logic = getCode(ctx.equality_expression(0));
		for (int i = 1; i < ctx.equality_expression().size(); i++) {
			logic += " & " + getCode(ctx.equality_expression(i));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitSelector_expression(
			ObjCParser.Selector_expressionContext ctx) {
		String selector = getCode(ctx.getChild(0)) + "("
				+ getCode(ctx.selector_name()) + ")";
		setCode(ctx, selector);
	}

	@Override
	public void exitLogical_and_expression(
			ObjCParser.Logical_and_expressionContext ctx) {
		String logic = getCode(ctx.inclusive_or_expression(0));
		for (int i = 1; i < ctx.inclusive_or_expression().size(); i++) {
			logic += " && " + getCode(ctx.inclusive_or_expression(i));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitConditional_expression(
			ObjCParser.Conditional_expressionContext ctx) {
		// String message = ctx.getText();
		// message += "";
		String logic = getCode(ctx.logical_or_expression(0));
		for (int i = 1; i < ctx.logical_or_expression().size(); i++) {
			logic += " ? " + getCode(ctx.logical_or_expression(i)) + " : "
					+ getCode(ctx.logical_or_expression(2));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitInclusive_or_expression(
			ObjCParser.Inclusive_or_expressionContext ctx) {
		String logic = getCode(ctx.exclusive_or_expression(0));
		for (int i = 1; i < ctx.exclusive_or_expression().size(); i++) {

			logic += " || " + getCode(ctx.exclusive_or_expression(i));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitExclusive_or_expression(
			ObjCParser.Exclusive_or_expressionContext ctx) {
		String logic = getCode(ctx.and_expression(0));
		for (int i = 1; i < ctx.and_expression().size(); i++) {
			logic += " ^ " + getCode(ctx.and_expression(i));
		}
		setCode(ctx, logic);
	}

	@Override
	public void exitEquality_expression(
			ObjCParser.Equality_expressionContext ctx) {
		String equal = getCode(ctx.relational_expression(0));
		for (int i = 1; i < ctx.relational_expression().size(); i++) {
			equal += " " + getCode(ctx.equality_op(i - 1)) + " "
					+ getCode(ctx.relational_expression(i));
		}
		setCode(ctx, equal);
	}

	@Override
	public void exitRelational_expression(
			ObjCParser.Relational_expressionContext ctx) {
		String relate = getCode(ctx.shift_expression(0));
		for (int i = 1; i < ctx.shift_expression().size(); i++) {
			relate += " " + getCode(ctx.relational_op(i - 1)) + " "
					+ getCode(ctx.shift_expression(i));
		}
		setCode(ctx, relate);
	}

	@Override
	public void exitShift_expression(ObjCParser.Shift_expressionContext ctx) {
		String shift = getCode(ctx.additive_expression(0));
		for (int i = 1; i < ctx.additive_expression().size(); i++) {
			shift += " " + getCode(ctx.shift_op(i - 1)) + " "
					+ getCode(ctx.additive_expression(i));
		}
		setCode(ctx, shift);
	}

	@Override
	public void exitAdditive_expression(
			ObjCParser.Additive_expressionContext ctx) {
		String shift = getCode(ctx.multiplicative_expression(0));
		for (int i = 1; i < ctx.multiplicative_expression().size(); i++) {
			shift += " " + getCode(ctx.add_op(i - 1)) + " "
					+ getCode(ctx.multiplicative_expression(i));
		}
		setCode(ctx, shift);
	}

	@Override
	public void exitMultiplicative_expression(
			ObjCParser.Multiplicative_expressionContext ctx) {
		String shift = getCode(ctx.cast_expression(0));
		for (int i = 1; i < ctx.cast_expression().size(); i++) {
			shift += " " + getCode(ctx.multiply_op(i - 1)) + " "
					+ getCode(ctx.cast_expression(i));
		}
		setCode(ctx, shift);
	}

	@Override
	public void exitCast_expression(ObjCParser.Cast_expressionContext ctx) {
		String cast = "";
		String message = ctx.getText();
		String.format("%s", message);
		if (ctx.cast_expression() != null) {
			cast = "(" + getCode(ctx.type_name()) + ")"
					+ getCode(ctx.cast_expression());
		} else {
			cast = getCode(ctx.getChild(0));
			if (cast == null) {
				cast = "";
			}

			if (cast.equals("nil"))
				cast = "null";
		}
		setCode(ctx, cast);
	}

	@Override
	public void exitAdd_op(ObjCParser.Add_opContext ctx) {
		setCode(ctx, ctx.getText());
	}

	@Override
	public void exitMultiply_op(ObjCParser.Multiply_opContext ctx) {
		setCode(ctx, ctx.getText());
	}

	@Override
	public void exitShift_op(ObjCParser.Shift_opContext ctx) {
		setCode(ctx, ctx.getText());
	}

	@Override
	public void exitEquality_op(ObjCParser.Equality_opContext ctx) {
		setCode(ctx, ctx.getText());
	}

	@Override
	public void exitRelational_op(ObjCParser.Relational_opContext ctx) {
		setCode(ctx, ctx.getText());
	}

	@Override
	public void exitConstant_expression(
			ObjCParser.Constant_expressionContext ctx) {
		String con = getCode(ctx.conditional_expression());
		setCode(ctx, con);
	}

	@Override
	public void exitUnary_operator(ObjCParser.Unary_operatorContext ctx) {
		String code = ctx.getText();
		if (code.equals("*")) {
			code = "";
		}
		setCode(ctx, code);
	}

	@Override
	public void exitCastunary(ObjCParser.CastunaryContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String cast = getCode(ctx.unary_operator())
				+ getCode(ctx.cast_expression());

		setCode(ctx, cast);
	}

	@Override
	public void exitPfixunary(ObjCParser.PfixunaryContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		setCode(ctx, getCode(ctx.postfix_expression()));
	}

	@Override
	public void exitSimple_unary(ObjCParser.Simple_unaryContext ctx) {
		String simple = ctx.getChild(0).getText() + getCode(ctx.getChild(1));
		setCode(ctx, simple);
	}

	@Override
	public void exitSizeofunary(ObjCParser.SizeofunaryContext ctx) {
		String sizef = "sizeof (";
		if (ctx.type_name() != null) {
			sizef += getCode(ctx.type_name()) + ")";
		} else {
			sizef += getCode(ctx.getChild(1)) + ")";
		}
		setCode(ctx, sizef);
	}

	@Override
	public void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx) {
		String pFix = getCode(ctx.primary_expression());
		if (ctx.postfix_expression_complete() != null) {
			for (Postfix_expression_completeContext fc : ctx
					.postfix_expression_complete()) {
				pFix += getCode(fc);
			}
		}
		setCode(ctx, pFix);
	}

	@Override
	public void exitDimpost(ObjCParser.DimpostContext ctx) {
		String exPost = "[" + getCode(ctx.expression()) + "]";
		setCode(ctx, exPost);
	}

	@Override
	public void exitSimplepost(ObjCParser.SimplepostContext ctx) {
		String exPost = ctx.getText();
		setCode(ctx, exPost);
	}

	@Override
	public void enterArrowpost(ObjCParser.ArrowpostContext ctx) {
		String exPost = "." + getCode(ctx.identifier());
		setCode(ctx, exPost);
	}

	@Override
	public void exitArgpost(ObjCParser.ArgpostContext ctx) {
		String aPost = "(";
		if (ctx.argument_expression_list() != null) {
			aPost += getCode(ctx.argument_expression_list());
		}
		aPost += ")";
		setCode(ctx, aPost);
	}

	@Override
	public void exitArgument_expression_list(
			ObjCParser.Argument_expression_listContext ctx) {
		String arg = getCode(ctx.assignment_expression(0));
		for (int i = 1; i < ctx.assignment_expression().size(); i++) {
			arg += ", " + getCode(ctx.assignment_expression(i));
		}
		setCode(ctx, arg);
	}

	@Override
	public void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx) {
		String primary = getCode(ctx.getChild(0));

		setCode(ctx, primary);
	}

	@Override
	public void enterIdentifier(ObjCParser.IdentifierContext ctx) {
		String text = ctx.getText();
		text = codeFormat.identifierFormatter(text);
		setCode(ctx, text);
	}

	@Override
	public void exitIdentifier(ObjCParser.IdentifierContext ctx) {
		String text = ctx.getText();
		text = codeFormat.identifierFormatter(text);
		setCode(ctx, text);
	}

	@Override
	public void exitFunction_definition(
			ObjCParser.Function_definitionContext ctx) {
		String fDef = "";
		if (ctx.declaration_specifiers() != null) {
			fDef = getCode(ctx.declaration_specifiers());
		}
		fDef += getCode(ctx.declarator());
		fDef += getCode(ctx.compound_statement());

		setCode(ctx, fDef);
	}

	@Override
	public void exitClass_interface(ObjCParser.Class_interfaceContext ctx) {
		String name = getCode(ctx.class_name());
		gClassName = name;
		if (ctx.superclass_name() != null) {
			gSuperClassName = getCode(ctx.superclass_name());
		}
		ClassDeclaration cd;
		if (options.isParsingheader()) {
			cd = ClassDescription.ClassDeclaration.getClassDeclaration(
					headerDeclarations, gClassName);
		} else {
			cd = ClassDescription.ClassDeclaration.getClassDeclaration(
					classDeclarations, gClassName);
		}
		if (ctx.instance_variables() != null) {
			ArrayList<String> variables = cd.getVariables();
			ArrayList<String> list = getList(ctx.instance_variables());
			for (String var : list) {
				variables.add(var);
			}
		}
		if (ctx.protocol_reference_list() != null) {
			ArrayList<String> protocols = getList(ctx.protocol_reference_list());
			ArrayList<String> list = cd.getProtocols();
			for (String protocol : protocols) {
				list.add(protocol);
			}
		}
		ClassDescription.ClassDeclaration cDec = choseMapAndDeclaration(gClassName);
		if (ctx.interface_declaration_list() != null) {
			ClassDescription.ClassDeclaration list = getDeclaration(ctx
					.interface_declaration_list());
			cDec.addMethod_declarations(list.getMethod_declarations());
			cDec.addProperties(list.getProperties());
			cDec.addVariables(list.getVariables());
		}
		setCode(ctx, "");
	}

	@Override
	public void exitProtocol_reference_list(
			ObjCParser.Protocol_reference_listContext ctx) {
		setList(ctx, getList(ctx.getChild(0)));
	}

	@Override
	public void exitProtocol_list(ObjCParser.Protocol_listContext ctx) {
		ArrayList<String> pl = new ArrayList<String>();
		for (Protocol_nameContext ref : ctx.protocol_name()) {
			pl.add(ref.getText());
		}
		setList(ctx, pl);
	}

	@Override
	public void exitInstance_decl(ObjCParser.Instance_declContext ctx) {
		String cd = ctx.getText();
		String.format("%s", cd);
		String visibility = "public ";
		ArrayList<String> decs = new ArrayList<String>();
		for (Struct_declarationContext dec : ctx.struct_declaration()) {
			String code = visibility + getCode(dec);
			decs.add(code);
		}
		setList(ctx, decs);
	}

	@Override
	public void exitInstance_sidecl(ObjCParser.Instance_sideclContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String prefix = ctx.visibility_specification().getText().substring(1);
		ArrayList<String> instance = new ArrayList<String>();
		if (ctx.struct_declaration() != null) {
			for (Struct_declarationContext dp : ctx.struct_declaration()) {
				if (prefix.length() == 0) {
					prefix = getCode(dp);
				} else {
					prefix += " " + getCode(dp);
				}
			}
			ArrayList<String> decls = getList(ctx.instance_variables());
			String var = "";
			for (String decl : decls) {
				if (prefix.length() == 0) {
					var = decl;
				} else {
					var = " " + decl;
				}
				instance.add(var);
			}
		}
		setList(ctx, null);
	}

	@Override
	public void exitInstance_idecl(ObjCParser.Instance_ideclContext ctx) {
		String code = ctx.getText();
		String.format("%s", code);
		String prefix = "";
		ArrayList<String> instance = new ArrayList<String>();
		if (ctx.struct_declaration() != null) {
			for (Struct_declarationContext dp : ctx.struct_declaration()) {
				if (prefix.length() == 0) {
					prefix = getCode(dp);
				} else {
					prefix += " " + getCode(dp);
				}
			}
			ArrayList<String> decls = getList(ctx.instance_variables());
			String var = "";
			for (String decl : decls) {
				if (prefix.length() == 0) {
					var = decl;
				} else {
					var = " " + decl;
				}
				instance.add(var);
			}
		}
		setList(ctx, null);
	}

	@Override
	public void exitInstance_sdecl(ObjCParser.Instance_sdeclContext ctx) {
		String cd = ctx.getText();
		String.format("%s", cd);
		String visibility = ctx.visibility_specification().getText()
				.substring(1)
				+ " ";
		ArrayList<String> decs = new ArrayList<String>();
		for (Struct_declarationContext dec : ctx.struct_declaration()) {
			String code = visibility + getCode(dec);
			decs.add(code);
		}
		setList(ctx, decs);
	}

	@Override
	public void exitClass_declaration_list(
			ObjCParser.Class_declaration_listContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitProtocol_declaration(
			ObjCParser.Protocol_declarationContext ctx) {
		setCode(ctx, "");
	}

	@Override
	public void exitProtocol_declaration_list(
			ObjCParser.Protocol_declaration_listContext ctx) {
		setCode(ctx, "");
	}

	ParserObjcListener() {
		this.classDescription = new ClassDescription();
		this.headerDeclarations = classDescription.getHeaders();
		this.classDeclarations = classDescription.getmFiles();
	}

	ParserObjcListener(ClassDescription classDescription,
			ParseOptions options) {
		super();
		this.classDescription = classDescription;
		this.options = options;
		this.headerDeclarations = classDescription.getHeaders();
		this.classDeclarations = classDescription.getmFiles();
	}

	private void writeOutput(String fileName, String code) {
		try {
			File file = new File(fileName);
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			output.write(code);
			output.close();
		} catch (IOException e) {
			System.exit(10);
		}
	}
}
