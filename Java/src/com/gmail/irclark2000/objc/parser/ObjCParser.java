// Generated from ObjC.g4 by ANTLR 4.0
package com.gmail.irclark2000.objc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjCParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__114=1, T__113=2, T__112=3, T__111=4, T__110=5, T__109=6, T__108=7, 
		T__107=8, T__106=9, T__105=10, T__104=11, T__103=12, T__102=13, T__101=14, 
		T__100=15, T__99=16, T__98=17, T__97=18, T__96=19, T__95=20, T__94=21, 
		T__93=22, T__92=23, T__91=24, T__90=25, T__89=26, T__88=27, T__87=28, 
		T__86=29, T__85=30, T__84=31, T__83=32, T__82=33, T__81=34, T__80=35, 
		T__79=36, T__78=37, T__77=38, T__76=39, T__75=40, T__74=41, T__73=42, 
		T__72=43, T__71=44, T__70=45, T__69=46, T__68=47, T__67=48, T__66=49, 
		T__65=50, T__64=51, T__63=52, T__62=53, T__61=54, T__60=55, T__59=56, 
		T__58=57, T__57=58, T__56=59, T__55=60, T__54=61, T__53=62, T__52=63, 
		T__51=64, T__50=65, T__49=66, T__48=67, T__47=68, T__46=69, T__45=70, 
		T__44=71, T__43=72, T__42=73, T__41=74, T__40=75, T__39=76, T__38=77, 
		T__37=78, T__36=79, T__35=80, T__34=81, T__33=82, T__32=83, T__31=84, 
		T__30=85, T__29=86, T__28=87, T__27=88, T__26=89, T__25=90, T__24=91, 
		T__23=92, T__22=93, T__21=94, T__20=95, T__19=96, T__18=97, T__17=98, 
		T__16=99, T__15=100, T__14=101, T__13=102, T__12=103, T__11=104, T__10=105, 
		T__9=106, T__8=107, T__7=108, T__6=109, T__5=110, T__4=111, T__3=112, 
		T__2=113, T__1=114, T__0=115, DOTIDENTIFIER=116, IDENTIFIER=117, CHARACTER_LITERAL=118, 
		CSTRING_LITERAL=119, STRING_LITERAL=120, HEX_LITERAL=121, DECIMAL_LITERAL=122, 
		OCTAL_LITERAL=123, FLOATING_POINT_LITERAL=124, IMPORT=125, INCLUDE=126, 
		PRAGMA=127, WS=128, COMMENT=129, LINE_COMMENT=130;
	public static final String[] tokenNames = {
		"<INVALID>", "'self'", "'register'", "'*'", "'@synchronized'", "'double'", 
		"'inout'", "'}'", "'float'", "'char'", "'do'", "'auto'", "'*='", "'oneway'", 
		"')'", "'@trystatement'", "'unsigned'", "'@implementation'", "'goto'", 
		"'byref'", "'@property'", "'#ifdef'", "'@encode'", "'|'", "'!'", "'long'", 
		"'sizeof'", "'@protected'", "'short'", "'-='", "'in'", "','", "'while'", 
		"'@finally'", "'-'", "'if'", "'int'", "'?'", "'@optional'", "'bycopy'", 
		"'void'", "'>>='", "'...'", "'break'", "'+='", "'^='", "'else'", "'.+'", 
		"'struct'", "'++'", "'extern'", "'.'", "'+'", "'&&'", "'||'", "'>'", "'%='", 
		"'/='", "'switch'", "'/'", "'~'", "'out'", "'@throw'", "'&'", "'['", "'#ifndef'", 
		"'@end'", "'<'", "'--'", "'continue'", "'!='", "'<='", "'id'", "'<<'", 
		"'@selector'", "'@protocol'", "'case'", "'@package'", "'@synthesize'", 
		"'@dynamic'", "'super'", "'%'", "'->'", "'union'", "'signed'", "'@catch'", 
		"'='", "'const'", "'|='", "'enum'", "'@class'", "'<<='", "']'", "'default'", 
		"'@public'", "':'", "'('", "'&='", "'#endif'", "'{'", "'#undef'", "'static'", 
		"'#define'", "'>>'", "'^'", "'@private'", "'@required'", "'for'", "'return'", 
		"'typedef'", "';'", "'volatile'", "'@interface'", "'=='", "'#if'", "'>='", 
		"DOTIDENTIFIER", "IDENTIFIER", "CHARACTER_LITERAL", "CSTRING_LITERAL", 
		"STRING_LITERAL", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"IMPORT", "INCLUDE", "PRAGMA", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_translation_unit = 0, RULE_external_declaration = 1, RULE_preprocessor_declaration = 2, 
		RULE_define_statement = 3, RULE_macro_specification = 4, RULE_class_interface = 5, 
		RULE_category_interface = 6, RULE_class_implementation = 7, RULE_category_implementation = 8, 
		RULE_protocol_declaration = 9, RULE_protocol_declaration_list = 10, RULE_protocol_requirement = 11, 
		RULE_class_declaration_list = 12, RULE_class_list = 13, RULE_protocol_reference_list = 14, 
		RULE_protocol_list = 15, RULE_property_declaration = 16, RULE_property_attributes_declaration = 17, 
		RULE_property_attributes_list = 18, RULE_property_attribute = 19, RULE_class_name = 20, 
		RULE_superclass_name = 21, RULE_category_name = 22, RULE_protocol_name = 23, 
		RULE_instance_variables = 24, RULE_visibility_specification = 25, RULE_interface_declaration_list = 26, 
		RULE_class_method_declaration = 27, RULE_instance_method_declaration = 28, 
		RULE_method_declaration = 29, RULE_implementation_definition_list = 30, 
		RULE_implementation_definition = 31, RULE_class_method_definition = 32, 
		RULE_instance_method_definition = 33, RULE_method_definition = 34, RULE_method_selector = 35, 
		RULE_keyword_declarator = 36, RULE_selector = 37, RULE_method_type = 38, 
		RULE_property_implementation = 39, RULE_property_synthesize_list = 40, 
		RULE_property_synthesize_item = 41, RULE_type_specifier = 42, RULE_other_type_specifier = 43, 
		RULE_unusual_type_specifier = 44, RULE_simple_type_specifier = 45, RULE_primitive_type_specifier = 46, 
		RULE_type_qualifier = 47, RULE_protocol_qualifier = 48, RULE_primary_expression = 49, 
		RULE_simple_expression = 50, RULE_parenthetical_expression = 51, RULE_self_expression = 52, 
		RULE_unsupported_instruction = 53, RULE_string_constant = 54, RULE_message_expression = 55, 
		RULE_receiver = 56, RULE_message_selector = 57, RULE_keyword_argument = 58, 
		RULE_selector_expression = 59, RULE_selector_name = 60, RULE_protocol_expression = 61, 
		RULE_encode_expression = 62, RULE_exception_declarator = 63, RULE_try_statement = 64, 
		RULE_catch_statement = 65, RULE_finally_statement = 66, RULE_throw_statement = 67, 
		RULE_try_block = 68, RULE_synchronized_statement = 69, RULE_function_definition = 70, 
		RULE_declaration_minus_semi = 71, RULE_declaration = 72, RULE_declaration_specifiers = 73, 
		RULE_declaration_specifier = 74, RULE_storage_class_specifier = 75, RULE_init_declarator_list = 76, 
		RULE_init_declarator = 77, RULE_struct_or_union_specifier = 78, RULE_struct_declaration = 79, 
		RULE_specifier_qualifier_list = 80, RULE_specifier_qualifier = 81, RULE_struct_declarator_list = 82, 
		RULE_struct_declarator = 83, RULE_enum_specifier = 84, RULE_enumerator_list = 85, 
		RULE_enumerator = 86, RULE_declarator = 87, RULE_direct_declarator = 88, 
		RULE_declarator_suffix = 89, RULE_parameter_list = 90, RULE_parameter_declaration = 91, 
		RULE_initializer = 92, RULE_type_name = 93, RULE_abstract_declarator = 94, 
		RULE_abstract_declarator_suffix = 95, RULE_parameter_declaration_list = 96, 
		RULE_statement_list = 97, RULE_statement = 98, RULE_semi_statement = 99, 
		RULE_labeled_statement = 100, RULE_compound_statement = 101, RULE_compound_statement_parts = 102, 
		RULE_selection_statement = 103, RULE_while_statement = 104, RULE_for_statement = 105, 
		RULE_do_while_statement = 106, RULE_for_complete = 107, RULE_for_declaration_complete = 108, 
		RULE_jump_statement = 109, RULE_setter_call = 110, RULE_getter_call = 111, 
		RULE_dotidentifier = 112, RULE_expression = 113, RULE_assignment_expression = 114, 
		RULE_assignment_operator = 115, RULE_conditional_expression = 116, RULE_constant_expression = 117, 
		RULE_logical_or_expression = 118, RULE_logical_and_expression = 119, RULE_inclusive_or_expression = 120, 
		RULE_exclusive_or_expression = 121, RULE_and_expression = 122, RULE_equality_expression = 123, 
		RULE_equality_op = 124, RULE_relational_expression = 125, RULE_relational_op = 126, 
		RULE_shift_expression = 127, RULE_shift_op = 128, RULE_additive_expression = 129, 
		RULE_add_op = 130, RULE_multiplicative_expression = 131, RULE_multiply_op = 132, 
		RULE_cast_expression = 133, RULE_unary_expression = 134, RULE_unary_operator = 135, 
		RULE_postfix_expression = 136, RULE_postfix_expression_complete = 137, 
		RULE_comment = 138, RULE_argument_expression_list = 139, RULE_identifier = 140, 
		RULE_constant = 141;
	public static final String[] ruleNames = {
		"translation_unit", "external_declaration", "preprocessor_declaration", 
		"define_statement", "macro_specification", "class_interface", "category_interface", 
		"class_implementation", "category_implementation", "protocol_declaration", 
		"protocol_declaration_list", "protocol_requirement", "class_declaration_list", 
		"class_list", "protocol_reference_list", "protocol_list", "property_declaration", 
		"property_attributes_declaration", "property_attributes_list", "property_attribute", 
		"class_name", "superclass_name", "category_name", "protocol_name", "instance_variables", 
		"visibility_specification", "interface_declaration_list", "class_method_declaration", 
		"instance_method_declaration", "method_declaration", "implementation_definition_list", 
		"implementation_definition", "class_method_definition", "instance_method_definition", 
		"method_definition", "method_selector", "keyword_declarator", "selector", 
		"method_type", "property_implementation", "property_synthesize_list", 
		"property_synthesize_item", "type_specifier", "other_type_specifier", 
		"unusual_type_specifier", "simple_type_specifier", "primitive_type_specifier", 
		"type_qualifier", "protocol_qualifier", "primary_expression", "simple_expression", 
		"parenthetical_expression", "self_expression", "unsupported_instruction", 
		"string_constant", "message_expression", "receiver", "message_selector", 
		"keyword_argument", "selector_expression", "selector_name", "protocol_expression", 
		"encode_expression", "exception_declarator", "try_statement", "catch_statement", 
		"finally_statement", "throw_statement", "try_block", "synchronized_statement", 
		"function_definition", "declaration_minus_semi", "declaration", "declaration_specifiers", 
		"declaration_specifier", "storage_class_specifier", "init_declarator_list", 
		"init_declarator", "struct_or_union_specifier", "struct_declaration", 
		"specifier_qualifier_list", "specifier_qualifier", "struct_declarator_list", 
		"struct_declarator", "enum_specifier", "enumerator_list", "enumerator", 
		"declarator", "direct_declarator", "declarator_suffix", "parameter_list", 
		"parameter_declaration", "initializer", "type_name", "abstract_declarator", 
		"abstract_declarator_suffix", "parameter_declaration_list", "statement_list", 
		"statement", "semi_statement", "labeled_statement", "compound_statement", 
		"compound_statement_parts", "selection_statement", "while_statement", 
		"for_statement", "do_while_statement", "for_complete", "for_declaration_complete", 
		"jump_statement", "setter_call", "getter_call", "dotidentifier", "expression", 
		"assignment_expression", "assignment_operator", "conditional_expression", 
		"constant_expression", "logical_or_expression", "logical_and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
		"equality_expression", "equality_op", "relational_expression", "relational_op", 
		"shift_expression", "shift_op", "additive_expression", "add_op", "multiplicative_expression", 
		"multiply_op", "cast_expression", "unary_expression", "unary_operator", 
		"postfix_expression", "postfix_expression_complete", "comment", "argument_expression_list", 
		"identifier", "constant"
	};

	@Override
	public String getGrammarFileName() { return "ObjC.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Translation_unitContext extends ParserRuleContext {
		public List<External_declarationContext> external_declaration() {
			return getRuleContexts(External_declarationContext.class);
		}
		public TerminalNode EOF() { return getToken(ObjCParser.EOF, 0); }
		public External_declarationContext external_declaration(int i) {
			return getRuleContext(External_declarationContext.class,i);
		}
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTranslation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTranslation_unit(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284); external_declaration();
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (2 - 2)) | (1L << (3 - 2)) | (1L << (5 - 2)) | (1L << (6 - 2)) | (1L << (8 - 2)) | (1L << (9 - 2)) | (1L << (11 - 2)) | (1L << (13 - 2)) | (1L << (16 - 2)) | (1L << (17 - 2)) | (1L << (19 - 2)) | (1L << (21 - 2)) | (1L << (25 - 2)) | (1L << (28 - 2)) | (1L << (30 - 2)) | (1L << (36 - 2)) | (1L << (39 - 2)) | (1L << (40 - 2)) | (1L << (48 - 2)) | (1L << (50 - 2)) | (1L << (61 - 2)) | (1L << (65 - 2)))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (75 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (90 - 72)) | (1L << (96 - 72)) | (1L << (98 - 72)) | (1L << (100 - 72)) | (1L << (101 - 72)) | (1L << (102 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (112 - 72)) | (1L << (114 - 72)) | (1L << (IDENTIFIER - 72)) | (1L << (IMPORT - 72)) | (1L << (INCLUDE - 72)) | (1L << (COMMENT - 72)) | (1L << (LINE_COMMENT - 72)))) != 0) );
			setState(289); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class External_declarationContext extends ParserRuleContext {
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Class_declaration_listContext class_declaration_list() {
			return getRuleContext(Class_declaration_listContext.class,0);
		}
		public Class_implementationContext class_implementation() {
			return getRuleContext(Class_implementationContext.class,0);
		}
		public Preprocessor_declarationContext preprocessor_declaration() {
			return getRuleContext(Preprocessor_declarationContext.class,0);
		}
		public Class_interfaceContext class_interface() {
			return getRuleContext(Class_interfaceContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Protocol_declaration_listContext protocol_declaration_list() {
			return getRuleContext(Protocol_declaration_listContext.class,0);
		}
		public Category_implementationContext category_implementation() {
			return getRuleContext(Category_implementationContext.class,0);
		}
		public Category_interfaceContext category_interface() {
			return getRuleContext(Category_interfaceContext.class,0);
		}
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExternal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExternal_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_external_declaration);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); comment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292); preprocessor_declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293); function_definition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294); declaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295); class_interface();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296); class_implementation();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297); category_interface();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(298); category_implementation();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(299); protocol_declaration();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(300); protocol_declaration_list();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(301); class_declaration_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Preprocessor_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(ObjCParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjCParser.INCLUDE, 0); }
		public Define_statementContext define_statement() {
			return getRuleContext(Define_statementContext.class,0);
		}
		public Preprocessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPreprocessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPreprocessor_declaration(this);
		}
	}

	public final Preprocessor_declarationContext preprocessor_declaration() throws RecognitionException {
		Preprocessor_declarationContext _localctx = new Preprocessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preprocessor_declaration);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(IMPORT);
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(INCLUDE);
				}
				break;
			case 102:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); define_statement();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(307); match(21);
				setState(308); expression();
				}
				break;
			case 114:
				enterOuterAlt(_localctx, 5);
				{
				setState(309); match(114);
				setState(310); expression();
				}
				break;
			case 100:
				enterOuterAlt(_localctx, 6);
				{
				setState(311); match(100);
				setState(312); expression();
				}
				break;
			case 65:
				enterOuterAlt(_localctx, 7);
				{
				setState(313); match(65);
				setState(314); expression();
				}
				break;
			case 98:
				enterOuterAlt(_localctx, 8);
				{
				setState(315); match(98);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_statementContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Define_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDefine_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDefine_statement(this);
		}
	}

	public final Define_statementContext define_statement() throws RecognitionException {
		Define_statementContext _localctx = new Define_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(102);
			setState(319); identifier();
			setState(320); constant_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Macro_specificationContext extends ParserRuleContext {
		public Macro_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macro_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMacro_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMacro_specification(this);
		}
	}

	public final Macro_specificationContext macro_specification() throws RecognitionException {
		Macro_specificationContext _localctx = new Macro_specificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_macro_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_interfaceContext extends ParserRuleContext {
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_interface(this);
		}
	}

	public final Class_interfaceContext class_interface() throws RecognitionException {
		Class_interfaceContext _localctx = new Class_interfaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(112);
			setState(325); class_name();
			setState(328);
			_la = _input.LA(1);
			if (_la==95) {
				{
				setState(326); match(95);
				setState(327); superclass_name();
				}
			}

			setState(331);
			_la = _input.LA(1);
			if (_la==67) {
				{
				setState(330); protocol_reference_list();
				}
			}

			setState(334);
			_la = _input.LA(1);
			if (_la==99) {
				{
				setState(333); instance_variables();
				}
			}

			setState(337);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(336); interface_declaration_list();
				}
			}

			setState(339); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_interfaceContext extends ParserRuleContext {
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Category_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_interface(this);
		}
	}

	public final Category_interfaceContext category_interface() throws RecognitionException {
		Category_interfaceContext _localctx = new Category_interfaceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_category_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(112);
			setState(342); class_name();
			setState(343); match(96);
			setState(345);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(344); category_name();
				}
			}

			setState(347); match(14);
			setState(349);
			_la = _input.LA(1);
			if (_la==67) {
				{
				setState(348); protocol_reference_list();
				}
			}

			setState(352);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(351); interface_declaration_list();
				}
			}

			setState(354); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_implementationContext extends ParserRuleContext {
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Superclass_nameContext superclass_name() {
			return getRuleContext(Superclass_nameContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_implementation(this);
		}
	}

	public final Class_implementationContext class_implementation() throws RecognitionException {
		Class_implementationContext _localctx = new Class_implementationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(17);
			{
			setState(357); class_name();
			setState(360);
			_la = _input.LA(1);
			if (_la==95) {
				{
				setState(358); match(95);
				setState(359); superclass_name();
				}
			}

			setState(363);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (78 - 72)) | (1L << (79 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (96 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(362); implementation_definition_list();
				}
			}

			}
			setState(365); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_implementationContext extends ParserRuleContext {
		public Implementation_definition_listContext implementation_definition_list() {
			return getRuleContext(Implementation_definition_listContext.class,0);
		}
		public Category_nameContext category_name() {
			return getRuleContext(Category_nameContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Category_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_implementation(this);
		}
	}

	public final Category_implementationContext category_implementation() throws RecognitionException {
		Category_implementationContext _localctx = new Category_implementationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_category_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(17);
			{
			setState(368); class_name();
			setState(369); match(96);
			setState(370); category_name();
			setState(371); match(14);
			setState(373);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (78 - 72)) | (1L << (79 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (96 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(372); implementation_definition_list();
				}
			}

			}
			setState(375); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_requirementContext protocol_requirement() {
			return getRuleContext(Protocol_requirementContext.class,0);
		}
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Interface_declaration_listContext interface_declaration_list() {
			return getRuleContext(Interface_declaration_listContext.class,0);
		}
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); match(75);
			{
			setState(378); protocol_name();
			setState(380);
			_la = _input.LA(1);
			if (_la==67) {
				{
				setState(379); protocol_reference_list();
				}
			}

			setState(383);
			_la = _input.LA(1);
			if (_la==38 || _la==106) {
				{
				setState(382); protocol_requirement();
				}
			}

			setState(386);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
				{
				setState(385); interface_declaration_list();
				}
			}

			}
			setState(388); match(66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_declaration_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_declaration_list(this);
		}
	}

	public final Protocol_declaration_listContext protocol_declaration_list() throws RecognitionException {
		Protocol_declaration_listContext _localctx = new Protocol_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_protocol_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(390); match(75);
			setState(391); protocol_list();
			setState(392); match(110);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_requirementContext extends ParserRuleContext {
		public Protocol_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_requirement(this);
		}
	}

	public final Protocol_requirementContext protocol_requirement() throws RecognitionException {
		Protocol_requirementContext _localctx = new Protocol_requirementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol_requirement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==38 || _la==106) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declaration_listContext extends ParserRuleContext {
		public Class_listContext class_list() {
			return getRuleContext(Class_listContext.class,0);
		}
		public Class_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_declaration_list(this);
		}
	}

	public final Class_declaration_listContext class_declaration_list() throws RecognitionException {
		Class_declaration_listContext _localctx = new Class_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_declaration_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396); match(90);
			setState(397); class_list();
			setState(398); match(110);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_listContext extends ParserRuleContext {
		public List<Class_nameContext> class_name() {
			return getRuleContexts(Class_nameContext.class);
		}
		public Class_nameContext class_name(int i) {
			return getRuleContext(Class_nameContext.class,i);
		}
		public Class_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_list(this);
		}
	}

	public final Class_listContext class_list() throws RecognitionException {
		Class_listContext _localctx = new Class_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_class_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); class_name();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(401); match(31);
				setState(402); class_name();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_reference_listContext extends ParserRuleContext {
		public Protocol_listContext protocol_list() {
			return getRuleContext(Protocol_listContext.class,0);
		}
		public Protocol_reference_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_reference_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_reference_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_reference_list(this);
		}
	}

	public final Protocol_reference_listContext protocol_reference_list() throws RecognitionException {
		Protocol_reference_listContext _localctx = new Protocol_reference_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_protocol_reference_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(408); match(67);
			setState(409); protocol_list();
			setState(410); match(55);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_listContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name(int i) {
			return getRuleContext(Protocol_nameContext.class,i);
		}
		public List<Protocol_nameContext> protocol_name() {
			return getRuleContexts(Protocol_nameContext.class);
		}
		public Protocol_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_list(this);
		}
	}

	public final Protocol_listContext protocol_list() throws RecognitionException {
		Protocol_listContext _localctx = new Protocol_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_protocol_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); protocol_name();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(413); match(31);
				setState(414); protocol_name();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Property_attributes_declarationContext property_attributes_declaration() {
			return getRuleContext(Property_attributes_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_declaration(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); match(20);
			setState(422);
			_la = _input.LA(1);
			if (_la==96) {
				{
				setState(421); property_attributes_declaration();
				}
			}

			setState(424); struct_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributes_declarationContext extends ParserRuleContext {
		public Property_attributes_listContext property_attributes_list() {
			return getRuleContext(Property_attributes_listContext.class,0);
		}
		public Property_attributes_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_declaration(this);
		}
	}

	public final Property_attributes_declarationContext property_attributes_declaration() throws RecognitionException {
		Property_attributes_declarationContext _localctx = new Property_attributes_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_property_attributes_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); match(96);
			setState(427); property_attributes_list();
			setState(428); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributes_listContext extends ParserRuleContext {
		public Property_attributeContext property_attribute(int i) {
			return getRuleContext(Property_attributeContext.class,i);
		}
		public List<Property_attributeContext> property_attribute() {
			return getRuleContexts(Property_attributeContext.class);
		}
		public Property_attributes_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attributes_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attributes_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attributes_list(this);
		}
	}

	public final Property_attributes_listContext property_attributes_list() throws RecognitionException {
		Property_attributes_listContext _localctx = new Property_attributes_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_property_attributes_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); property_attribute();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(431); match(31);
				setState(432); property_attribute();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_attributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public Property_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_attribute(this);
		}
	}

	public final Property_attributeContext property_attribute() throws RecognitionException {
		Property_attributeContext _localctx = new Property_attributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_property_attribute);
		try {
			setState(446);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439); match(IDENTIFIER);
				setState(440); match(86);
				setState(441); match(IDENTIFIER);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442); match(IDENTIFIER);
				setState(443); match(86);
				setState(444); match(IDENTIFIER);
				setState(445); match(95);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Superclass_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSuperclass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSuperclass_name(this);
		}
	}

	public final Superclass_nameContext superclass_name() throws RecognitionException {
		Superclass_nameContext _localctx = new Superclass_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_superclass_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Category_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Category_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_category_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCategory_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCategory_name(this);
		}
	}

	public final Category_nameContext category_name() throws RecognitionException {
		Category_nameContext _localctx = new Category_nameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_category_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_name(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_variablesContext extends ParserRuleContext {
		public Instance_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_variables; }
	 
		public Instance_variablesContext() { }
		public void copyFrom(Instance_variablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Instance_declContext extends Instance_variablesContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Instance_declContext(Instance_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_decl(this);
		}
	}
	public static class Instance_sideclContext extends Instance_variablesContext {
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Instance_sideclContext(Instance_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_sidecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_sidecl(this);
		}
	}
	public static class Instance_ideclContext extends Instance_variablesContext {
		public Instance_variablesContext instance_variables() {
			return getRuleContext(Instance_variablesContext.class,0);
		}
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Instance_ideclContext(Instance_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_idecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_idecl(this);
		}
	}
	public static class Instance_sdeclContext extends Instance_variablesContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public Visibility_specificationContext visibility_specification() {
			return getRuleContext(Visibility_specificationContext.class,0);
		}
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Instance_sdeclContext(Instance_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_sdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_sdecl(this);
		}
	}

	public final Instance_variablesContext instance_variables() throws RecognitionException {
		Instance_variablesContext _localctx = new Instance_variablesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instance_variables);
		int _la;
		try {
			setState(492);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Instance_declContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456); match(99);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					{
					setState(457); struct_declaration();
					}
					}
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(463); match(7);
				}
				break;

			case 2:
				_localctx = new Instance_sdeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464); match(99);
				setState(465); visibility_specification();
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(466); struct_declaration();
					}
					}
					setState(469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
				setState(471); match(7);
				}
				break;

			case 3:
				_localctx = new Instance_ideclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473); match(99);
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(474); struct_declaration();
					}
					}
					setState(477); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
				setState(479); instance_variables();
				setState(480); match(7);
				}
				break;

			case 4:
				_localctx = new Instance_sideclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(482); match(99);
				setState(483); visibility_specification();
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484); struct_declaration();
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
				setState(489); instance_variables();
				setState(490); match(7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Visibility_specificationContext extends ParserRuleContext {
		public Visibility_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterVisibility_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitVisibility_specification(this);
		}
	}

	public final Visibility_specificationContext visibility_specification() throws RecognitionException {
		Visibility_specificationContext _localctx = new Visibility_specificationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_visibility_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==27 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (77 - 77)) | (1L << (94 - 77)) | (1L << (105 - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_declaration_listContext extends ParserRuleContext {
		public Class_method_declarationContext class_method_declaration(int i) {
			return getRuleContext(Class_method_declarationContext.class,i);
		}
		public Property_declarationContext property_declaration(int i) {
			return getRuleContext(Property_declarationContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public List<Property_declarationContext> property_declaration() {
			return getRuleContexts(Property_declarationContext.class);
		}
		public Instance_method_declarationContext instance_method_declaration(int i) {
			return getRuleContext(Instance_method_declarationContext.class,i);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Instance_method_declarationContext> instance_method_declaration() {
			return getRuleContexts(Instance_method_declarationContext.class);
		}
		public List<Class_method_declarationContext> class_method_declaration() {
			return getRuleContexts(Class_method_declarationContext.class);
		}
		public Interface_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInterface_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInterface_declaration_list(this);
		}
	}

	public final Interface_declaration_listContext interface_declaration_list() throws RecognitionException {
		Interface_declaration_listContext _localctx = new Interface_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interface_declaration_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(500);
				switch (_input.LA(1)) {
				case 2:
				case 5:
				case 6:
				case 8:
				case 9:
				case 11:
				case 13:
				case 16:
				case 19:
				case 25:
				case 28:
				case 30:
				case 36:
				case 39:
				case 40:
				case 48:
				case 50:
				case 61:
				case 72:
				case 83:
				case 84:
				case 87:
				case 89:
				case 101:
				case 109:
				case 111:
				case IDENTIFIER:
					{
					setState(496); declaration();
					}
					break;
				case 52:
					{
					setState(497); class_method_declaration();
					}
					break;
				case 34:
					{
					setState(498); instance_method_declaration();
					}
					break;
				case 20:
					{
					setState(499); property_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_declaration(this);
		}
	}

	public final Class_method_declarationContext class_method_declaration() throws RecognitionException {
		Class_method_declarationContext _localctx = new Class_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_class_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504); match(52);
			setState(505); method_declaration();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_method_declarationContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Instance_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_declaration(this);
		}
	}

	public final Instance_method_declarationContext instance_method_declaration() throws RecognitionException {
		Instance_method_declarationContext _localctx = new Instance_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instance_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(507); match(34);
			setState(508); method_declaration();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if (_la==96) {
				{
				setState(510); method_type();
				}
			}

			setState(513); method_selector();
			setState(514); match(110);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_definition_listContext extends ParserRuleContext {
		public List<Implementation_definitionContext> implementation_definition() {
			return getRuleContexts(Implementation_definitionContext.class);
		}
		public Implementation_definitionContext implementation_definition(int i) {
			return getRuleContext(Implementation_definitionContext.class,i);
		}
		public Implementation_definition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterImplementation_definition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitImplementation_definition_list(this);
		}
	}

	public final Implementation_definition_listContext implementation_definition_list() throws RecognitionException {
		Implementation_definition_listContext _localctx = new Implementation_definition_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_implementation_definition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516); implementation_definition();
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 52) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (78 - 72)) | (1L << (79 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (96 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implementation_definitionContext extends ParserRuleContext {
		public Instance_method_definitionContext instance_method_definition() {
			return getRuleContext(Instance_method_definitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Property_implementationContext property_implementation() {
			return getRuleContext(Property_implementationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Class_method_definitionContext class_method_definition() {
			return getRuleContext(Class_method_definitionContext.class,0);
		}
		public Implementation_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterImplementation_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitImplementation_definition(this);
		}
	}

	public final Implementation_definitionContext implementation_definition() throws RecognitionException {
		Implementation_definitionContext _localctx = new Implementation_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_implementation_definition);
		try {
			setState(526);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521); function_definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); declaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523); class_method_definition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524); instance_method_definition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525); property_implementation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Class_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClass_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClass_method_definition(this);
		}
	}

	public final Class_method_definitionContext class_method_definition() throws RecognitionException {
		Class_method_definitionContext _localctx = new Class_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_class_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(528); match(52);
			setState(529); method_definition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instance_method_definitionContext extends ParserRuleContext {
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Instance_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInstance_method_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInstance_method_definition(this);
		}
	}

	public final Instance_method_definitionContext instance_method_definition() throws RecognitionException {
		Instance_method_definitionContext _localctx = new Instance_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_instance_method_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(531); match(34);
			setState(532); method_definition();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_definitionContext extends ParserRuleContext {
		public Method_selectorContext method_selector() {
			return getRuleContext(Method_selectorContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Method_typeContext method_type() {
			return getRuleContext(Method_typeContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_definition(this);
		}
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if (_la==96) {
				{
				setState(534); method_type();
				}
			}

			setState(537); method_selector();
			setState(539);
			_la = _input.LA(1);
			if (_la==3 || _la==96 || _la==IDENTIFIER) {
				{
				setState(538); init_declarator_list();
				}
			}

			setState(541); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_selectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Keyword_declaratorContext> keyword_declarator() {
			return getRuleContexts(Keyword_declaratorContext.class);
		}
		public Keyword_declaratorContext keyword_declarator(int i) {
			return getRuleContext(Keyword_declaratorContext.class,i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_selector(this);
		}
	}

	public final Method_selectorContext method_selector() throws RecognitionException {
		Method_selectorContext _localctx = new Method_selectorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_method_selector);
		try {
			int _alt;
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(545); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(544); keyword_declarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(547); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(550);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(549); parameter_list();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_declaratorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Method_typeContext> method_type() {
			return getRuleContexts(Method_typeContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Method_typeContext method_type(int i) {
			return getRuleContext(Method_typeContext.class,i);
		}
		public Keyword_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_declarator(this);
		}
	}

	public final Keyword_declaratorContext keyword_declarator() throws RecognitionException {
		Keyword_declaratorContext _localctx = new Keyword_declaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_keyword_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if (_la==DOTIDENTIFIER || _la==IDENTIFIER) {
				{
				setState(554); selector();
				}
			}

			setState(557); match(95);
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==96) {
				{
				{
				setState(558); method_type();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public DotidentifierContext dotidentifier() {
			return getRuleContext(DotidentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selector);
		try {
			setState(568);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(566); identifier();
				}
				break;
			case DOTIDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(567); dotidentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Method_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMethod_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMethod_type(this);
		}
	}

	public final Method_typeContext method_type() throws RecognitionException {
		Method_typeContext _localctx = new Method_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_method_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570); match(96);
			setState(571); type_name();
			setState(572); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_implementationContext extends ParserRuleContext {
		public Property_synthesize_listContext property_synthesize_list() {
			return getRuleContext(Property_synthesize_listContext.class,0);
		}
		public Property_implementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_implementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_implementation(this);
		}
	}

	public final Property_implementationContext property_implementation() throws RecognitionException {
		Property_implementationContext _localctx = new Property_implementationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_property_implementation);
		try {
			setState(582);
			switch (_input.LA(1)) {
			case 78:
				enterOuterAlt(_localctx, 1);
				{
				setState(574); match(78);
				setState(575); property_synthesize_list();
				setState(576); match(110);
				}
				break;
			case 79:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); match(79);
				setState(579); property_synthesize_list();
				setState(580); match(110);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_synthesize_listContext extends ParserRuleContext {
		public List<Property_synthesize_itemContext> property_synthesize_item() {
			return getRuleContexts(Property_synthesize_itemContext.class);
		}
		public Property_synthesize_itemContext property_synthesize_item(int i) {
			return getRuleContext(Property_synthesize_itemContext.class,i);
		}
		public Property_synthesize_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_list(this);
		}
	}

	public final Property_synthesize_listContext property_synthesize_list() throws RecognitionException {
		Property_synthesize_listContext _localctx = new Property_synthesize_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_property_synthesize_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); property_synthesize_item();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(585); match(31);
				setState(586); property_synthesize_item();
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_synthesize_itemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ObjCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ObjCParser.IDENTIFIER); }
		public Property_synthesize_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_synthesize_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProperty_synthesize_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProperty_synthesize_item(this);
		}
	}

	public final Property_synthesize_itemContext property_synthesize_item() throws RecognitionException {
		Property_synthesize_itemContext _localctx = new Property_synthesize_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_property_synthesize_item);
		try {
			setState(596);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592); match(IDENTIFIER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593); match(IDENTIFIER);
				setState(594); match(86);
				setState(595); match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public Other_type_specifierContext other_type_specifier() {
			return getRuleContext(Other_type_specifierContext.class,0);
		}
		public Simple_type_specifierContext simple_type_specifier() {
			return getRuleContext(Simple_type_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_specifier(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type_specifier);
		try {
			setState(600);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598); simple_type_specifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599); other_type_specifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_type_specifierContext extends ParserRuleContext {
		public Other_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_type_specifier; }
	 
		public Other_type_specifierContext() { }
		public void copyFrom(Other_type_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassTypeSpecContext extends Other_type_specifierContext {
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public ClassTypeSpecContext(Other_type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterClassTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitClassTypeSpec(this);
		}
	}
	public static class IngoreTypeSpecContext extends Other_type_specifierContext {
		public Unusual_type_specifierContext unusual_type_specifier() {
			return getRuleContext(Unusual_type_specifierContext.class,0);
		}
		public IngoreTypeSpecContext(Other_type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIngoreTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIngoreTypeSpec(this);
		}
	}
	public static class IdTypeSpecContext extends Other_type_specifierContext {
		public Protocol_reference_listContext protocol_reference_list() {
			return getRuleContext(Protocol_reference_listContext.class,0);
		}
		public IdTypeSpecContext(Other_type_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIdTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIdTypeSpec(this);
		}
	}

	public final Other_type_specifierContext other_type_specifier() throws RecognitionException {
		Other_type_specifierContext _localctx = new Other_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_other_type_specifier);
		int _la;
		try {
			setState(611);
			switch (_input.LA(1)) {
			case 72:
				_localctx = new IdTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(602); match(72);
				setState(604);
				_la = _input.LA(1);
				if (_la==67) {
					{
					setState(603); protocol_reference_list();
					}
				}

				}
				}
				break;
			case IDENTIFIER:
				_localctx = new ClassTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(606); class_name();
				setState(608);
				_la = _input.LA(1);
				if (_la==67) {
					{
					setState(607); protocol_reference_list();
					}
				}

				}
				}
				break;
			case 48:
			case 83:
				_localctx = new IngoreTypeSpecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(610); unusual_type_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unusual_type_specifierContext extends ParserRuleContext {
		public Struct_or_union_specifierContext struct_or_union_specifier() {
			return getRuleContext(Struct_or_union_specifierContext.class,0);
		}
		public Unusual_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unusual_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnusual_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnusual_type_specifier(this);
		}
	}

	public final Unusual_type_specifierContext unusual_type_specifier() throws RecognitionException {
		Unusual_type_specifierContext _localctx = new Unusual_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unusual_type_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); struct_or_union_specifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_type_specifierContext extends ParserRuleContext {
		public Primitive_type_specifierContext primitive_type_specifier() {
			return getRuleContext(Primitive_type_specifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Simple_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSimple_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSimple_type_specifier(this);
		}
	}

	public final Simple_type_specifierContext simple_type_specifier() throws RecognitionException {
		Simple_type_specifierContext _localctx = new Simple_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_type_specifier);
		try {
			setState(618);
			switch (_input.LA(1)) {
			case 5:
			case 8:
			case 9:
			case 16:
			case 25:
			case 28:
			case 36:
			case 40:
			case 84:
				enterOuterAlt(_localctx, 1);
				{
				setState(615); primitive_type_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(616); identifier();
				}
				break;
			case 89:
				enterOuterAlt(_localctx, 3);
				{
				setState(617); enum_specifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_type_specifierContext extends ParserRuleContext {
		public Primitive_type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPrimitive_type_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPrimitive_type_specifier(this);
		}
	}

	public final Primitive_type_specifierContext primitive_type_specifier() throws RecognitionException {
		Primitive_type_specifierContext _localctx = new Primitive_type_specifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primitive_type_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 9) | (1L << 16) | (1L << 25) | (1L << 28) | (1L << 36) | (1L << 40))) != 0) || _la==84) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_qualifierContext extends ParserRuleContext {
		public Type_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_qualifier; }
	 
		public Type_qualifierContext() { }
		public void copyFrom(Type_qualifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstTypeQualifierContext extends Type_qualifierContext {
		public ConstTypeQualifierContext(Type_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstTypeQualifier(this);
		}
	}
	public static class IgnoreTypeQualifierContext extends Type_qualifierContext {
		public Protocol_qualifierContext protocol_qualifier() {
			return getRuleContext(Protocol_qualifierContext.class,0);
		}
		public IgnoreTypeQualifierContext(Type_qualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIgnoreTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIgnoreTypeQualifier(this);
		}
	}

	public final Type_qualifierContext type_qualifier() throws RecognitionException {
		Type_qualifierContext _localctx = new Type_qualifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type_qualifier);
		try {
			setState(625);
			switch (_input.LA(1)) {
			case 87:
				_localctx = new ConstTypeQualifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(622); match(87);
				}
				break;
			case 111:
				_localctx = new IgnoreTypeQualifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(623); match(111);
				}
				break;
			case 6:
			case 13:
			case 19:
			case 30:
			case 39:
			case 61:
				_localctx = new IgnoreTypeQualifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(624); protocol_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_qualifierContext extends ParserRuleContext {
		public Protocol_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_qualifier(this);
		}
	}

	public final Protocol_qualifierContext protocol_qualifier() throws RecognitionException {
		Protocol_qualifierContext _localctx = new Protocol_qualifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_protocol_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 13) | (1L << 19) | (1L << 30) | (1L << 39) | (1L << 61))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Parenthetical_expressionContext parenthetical_expression() {
			return getRuleContext(Parenthetical_expressionContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public Selector_expressionContext selector_expression() {
			return getRuleContext(Selector_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPrimary_expression(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primary_expression);
		try {
			setState(632);
			switch (_input.LA(1)) {
			case 1:
			case 64:
			case DOTIDENTIFIER:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case CSTRING_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(629); simple_expression();
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(630); parenthetical_expression();
				}
				break;
			case 74:
				enterOuterAlt(_localctx, 3);
				{
				setState(631); selector_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public String_constantContext string_constant() {
			return getRuleContext(String_constantContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Getter_callContext getter_call() {
			return getRuleContext(Getter_callContext.class,0);
		}
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSimple_expression(this);
		}
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_simple_expression);
		try {
			setState(640);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(634); identifier();
				}
				break;
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(635); constant();
				}
				break;
			case CSTRING_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(636); string_constant();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 4);
				{
				setState(637); message_expression();
				}
				break;
			case DOTIDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(638); getter_call();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 6);
				{
				setState(639); self_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parenthetical_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Parenthetical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthetical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParenthetical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParenthetical_expression(this);
		}
	}

	public final Parenthetical_expressionContext parenthetical_expression() throws RecognitionException {
		Parenthetical_expressionContext _localctx = new Parenthetical_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parenthetical_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(642); match(96);
			setState(643); expression();
			setState(644); match(14);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Self_expressionContext extends ParserRuleContext {
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelf_expression(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_self_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsupported_instructionContext extends ParserRuleContext {
		public Encode_expressionContext encode_expression() {
			return getRuleContext(Encode_expressionContext.class,0);
		}
		public Protocol_expressionContext protocol_expression() {
			return getRuleContext(Protocol_expressionContext.class,0);
		}
		public Unsupported_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupported_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnsupported_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnsupported_instruction(this);
		}
	}

	public final Unsupported_instructionContext unsupported_instruction() throws RecognitionException {
		Unsupported_instructionContext _localctx = new Unsupported_instructionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_unsupported_instruction);
		try {
			setState(650);
			switch (_input.LA(1)) {
			case 22:
				enterOuterAlt(_localctx, 1);
				{
				setState(648); encode_expression();
				}
				break;
			case 75:
				enterOuterAlt(_localctx, 2);
				{
				setState(649); protocol_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_constantContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ObjCParser.STRING_LITERAL, 0); }
		public TerminalNode CSTRING_LITERAL() { return getToken(ObjCParser.CSTRING_LITERAL, 0); }
		public String_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterString_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitString_constant(this);
		}
	}

	public final String_constantContext string_constant() throws RecognitionException {
		String_constantContext _localctx = new String_constantContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_string_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			_la = _input.LA(1);
			if ( !(_la==CSTRING_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_expressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public Message_selectorContext message_selector() {
			return getRuleContext(Message_selectorContext.class,0);
		}
		public DotidentifierContext dotidentifier() {
			return getRuleContext(DotidentifierContext.class,0);
		}
		public Message_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_expression(this);
		}
	}

	public final Message_expressionContext message_expression() throws RecognitionException {
		Message_expressionContext _localctx = new Message_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_message_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(64);
			setState(655); receiver();
			setState(656); message_selector();
			setState(657); match(92);
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(658); match(51);
				setState(659); dotidentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_receiver);
		try {
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(662); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663); class_name();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(664); match(80);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(665); message_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_selectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<Keyword_argumentContext> keyword_argument() {
			return getRuleContexts(Keyword_argumentContext.class);
		}
		public Keyword_argumentContext keyword_argument(int i) {
			return getRuleContext(Keyword_argumentContext.class,i);
		}
		public Message_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMessage_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMessage_selector(this);
		}
	}

	public final Message_selectorContext message_selector() throws RecognitionException {
		Message_selectorContext _localctx = new Message_selectorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_message_selector);
		int _la;
		try {
			setState(674);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(669); keyword_argument();
					}
					}
					setState(672); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (95 - 95)) | (1L << (DOTIDENTIFIER - 95)) | (1L << (IDENTIFIER - 95)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Keyword_argumentContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Keyword_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterKeyword_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitKeyword_argument(this);
		}
	}

	public final Keyword_argumentContext keyword_argument() throws RecognitionException {
		Keyword_argumentContext _localctx = new Keyword_argumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_keyword_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if (_la==DOTIDENTIFIER || _la==IDENTIFIER) {
				{
				setState(676); selector();
				}
			}

			setState(679); match(95);
			setState(680); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_expressionContext extends ParserRuleContext {
		public Selector_nameContext selector_name() {
			return getRuleContext(Selector_nameContext.class,0);
		}
		public Selector_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_expression(this);
		}
	}

	public final Selector_expressionContext selector_expression() throws RecognitionException {
		Selector_expressionContext _localctx = new Selector_expressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_selector_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); match(74);
			setState(683); match(96);
			setState(684); selector_name();
			setState(685); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_nameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public Selector_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSelector_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSelector_name(this);
		}
	}

	public final Selector_nameContext selector_name() throws RecognitionException {
		Selector_nameContext _localctx = new Selector_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_selector_name);
		int _la;
		try {
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(687); selector();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(689);
					_la = _input.LA(1);
					if (_la==DOTIDENTIFIER || _la==IDENTIFIER) {
						{
						setState(688); selector();
						}
					}

					setState(691); match(95);
					}
					}
					setState(694); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (95 - 95)) | (1L << (DOTIDENTIFIER - 95)) | (1L << (IDENTIFIER - 95)))) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Protocol_expressionContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterProtocol_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitProtocol_expression(this);
		}
	}

	public final Protocol_expressionContext protocol_expression() throws RecognitionException {
		Protocol_expressionContext _localctx = new Protocol_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_protocol_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698); match(75);
			setState(699); match(96);
			setState(700); protocol_name();
			setState(701); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Encode_expressionContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Encode_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encode_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEncode_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEncode_expression(this);
		}
	}

	public final Encode_expressionContext encode_expression() throws RecognitionException {
		Encode_expressionContext _localctx = new Encode_expressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_encode_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); match(22);
			setState(704); match(96);
			setState(705); type_name();
			setState(706); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Exception_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterException_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitException_declarator(this);
		}
	}

	public final Exception_declaratorContext exception_declarator() throws RecognitionException {
		Exception_declaratorContext _localctx = new Exception_declaratorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exception_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708); declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_statementContext extends ParserRuleContext {
		public Try_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_statement(this);
		}
	}

	public final Try_statementContext try_statement() throws RecognitionException {
		Try_statementContext _localctx = new Try_statementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_try_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710); match(15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Exception_declaratorContext exception_declarator() {
			return getRuleContext(Exception_declaratorContext.class,0);
		}
		public Catch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCatch_statement(this);
		}
	}

	public final Catch_statementContext catch_statement() throws RecognitionException {
		Catch_statementContext _localctx = new Catch_statementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_catch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712); match(85);
			setState(713); match(96);
			setState(714); exception_declarator();
			setState(715); match(14);
			setState(716); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Finally_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFinally_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFinally_statement(this);
		}
	}

	public final Finally_statementContext finally_statement() throws RecognitionException {
		Finally_statementContext _localctx = new Finally_statementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_finally_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718); match(33);
			setState(719); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throw_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Throw_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterThrow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitThrow_statement(this);
		}
	}

	public final Throw_statementContext throw_statement() throws RecognitionException {
		Throw_statementContext _localctx = new Throw_statementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_throw_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721); match(62);
			setState(722); match(96);
			setState(723); match(IDENTIFIER);
			setState(724); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Try_blockContext extends ParserRuleContext {
		public Try_statementContext try_statement() {
			return getRuleContext(Try_statementContext.class,0);
		}
		public Catch_statementContext catch_statement() {
			return getRuleContext(Catch_statementContext.class,0);
		}
		public Finally_statementContext finally_statement() {
			return getRuleContext(Finally_statementContext.class,0);
		}
		public Try_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterTry_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitTry_block(this);
		}
	}

	public final Try_blockContext try_block() throws RecognitionException {
		Try_blockContext _localctx = new Try_blockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_try_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726); try_statement();
			setState(727); catch_statement();
			setState(729);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(728); finally_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Synchronized_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Synchronized_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronized_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSynchronized_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSynchronized_statement(this);
		}
	}

	public final Synchronized_statementContext synchronized_statement() throws RecognitionException {
		Synchronized_statementContext _localctx = new Synchronized_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_synchronized_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(4);
			setState(732); match(96);
			setState(733); match(IDENTIFIER);
			setState(734); match(14);
			setState(735); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(737); declaration_specifiers();
				}
				break;
			}
			setState(740); declarator();
			setState(741); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_minus_semiContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public Declaration_minus_semiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_minus_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_minus_semi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_minus_semi(this);
		}
	}

	public final Declaration_minus_semiContext declaration_minus_semi() throws RecognitionException {
		Declaration_minus_semiContext _localctx = new Declaration_minus_semiContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_declaration_minus_semi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743); declaration_specifiers();
			setState(745);
			_la = _input.LA(1);
			if (_la==3 || _la==96 || _la==IDENTIFIER) {
				{
				setState(744); init_declarator_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Declaration_minus_semiContext declaration_minus_semi() {
			return getRuleContext(Declaration_minus_semiContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747); declaration_minus_semi();
			setState(748); match(110);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public List<Declaration_specifierContext> declaration_specifier() {
			return getRuleContexts(Declaration_specifierContext.class);
		}
		public Declaration_specifierContext declaration_specifier(int i) {
			return getRuleContext(Declaration_specifierContext.class,i);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_specifiers(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_declaration_specifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(751); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(750); declaration_specifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(753); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Storage_class_specifierContext storage_class_specifier() {
			return getRuleContext(Storage_class_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclaration_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclaration_specifier(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_declaration_specifier);
		try {
			setState(758);
			switch (_input.LA(1)) {
			case 2:
			case 11:
			case 50:
			case 101:
			case 109:
				enterOuterAlt(_localctx, 1);
				{
				setState(755); storage_class_specifier();
				}
				break;
			case 5:
			case 8:
			case 9:
			case 16:
			case 25:
			case 28:
			case 36:
			case 40:
			case 48:
			case 72:
			case 83:
			case 84:
			case 89:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(756); type_specifier();
				}
				break;
			case 6:
			case 13:
			case 19:
			case 30:
			case 39:
			case 61:
			case 87:
			case 111:
				enterOuterAlt(_localctx, 3);
				{
				setState(757); type_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
	 
		public Storage_class_specifierContext() { }
		public void copyFrom(Storage_class_specifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgnoreStoreClassContext extends Storage_class_specifierContext {
		public IgnoreStoreClassContext(Storage_class_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIgnoreStoreClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIgnoreStoreClass(this);
		}
	}
	public static class StaticStoreClassContext extends Storage_class_specifierContext {
		public StaticStoreClassContext(Storage_class_specifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStaticStoreClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStaticStoreClass(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_storage_class_specifier);
		try {
			setState(765);
			switch (_input.LA(1)) {
			case 11:
				_localctx = new IgnoreStoreClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(760); match(11);
				}
				break;
			case 2:
				_localctx = new IgnoreStoreClassContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(761); match(2);
				}
				break;
			case 101:
				_localctx = new StaticStoreClassContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(762); match(101);
				}
				break;
			case 50:
				_localctx = new IgnoreStoreClassContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(763); match(50);
				}
				break;
			case 109:
				_localctx = new IgnoreStoreClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(764); match(109);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator_list(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767); init_declarator();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(768); match(31);
				setState(769); init_declarator();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInit_declarator(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775); declarator();
			setState(778);
			_la = _input.LA(1);
			if (_la==86) {
				{
				setState(776); match(86);
				setState(777); initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_or_union_specifierContext extends ParserRuleContext {
		public List<Struct_declarationContext> struct_declaration() {
			return getRuleContexts(Struct_declarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public Struct_declarationContext struct_declaration(int i) {
			return getRuleContext(Struct_declarationContext.class,i);
		}
		public Struct_or_union_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_or_union_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_or_union_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_or_union_specifier(this);
		}
	}

	public final Struct_or_union_specifierContext struct_or_union_specifier() throws RecognitionException {
		Struct_or_union_specifierContext _localctx = new Struct_or_union_specifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_struct_or_union_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( !(_la==48 || _la==83) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(793);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(781); match(IDENTIFIER);
				}
				break;

			case 2:
				{
				setState(783);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(782); match(IDENTIFIER);
					}
				}

				setState(785); match(99);
				setState(787); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(786); struct_declaration();
					}
					}
					setState(789); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0) );
				setState(791); match(7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_declarator_listContext struct_declarator_list() {
			return getRuleContext(Struct_declarator_listContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declaration(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_struct_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795); specifier_qualifier_list();
			setState(796); struct_declarator_list();
			setState(797); match(110);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specifier_qualifier_listContext extends ParserRuleContext {
		public List<Specifier_qualifierContext> specifier_qualifier() {
			return getRuleContexts(Specifier_qualifierContext.class);
		}
		public Specifier_qualifierContext specifier_qualifier(int i) {
			return getRuleContext(Specifier_qualifierContext.class,i);
		}
		public Specifier_qualifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSpecifier_qualifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSpecifier_qualifier_list(this);
		}
	}

	public final Specifier_qualifier_listContext specifier_qualifier_list() throws RecognitionException {
		Specifier_qualifier_listContext _localctx = new Specifier_qualifier_listContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_specifier_qualifier_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(799); specifier_qualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(802); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specifier_qualifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Type_qualifierContext type_qualifier() {
			return getRuleContext(Type_qualifierContext.class,0);
		}
		public Specifier_qualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifier_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSpecifier_qualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSpecifier_qualifier(this);
		}
	}

	public final Specifier_qualifierContext specifier_qualifier() throws RecognitionException {
		Specifier_qualifierContext _localctx = new Specifier_qualifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_specifier_qualifier);
		try {
			setState(806);
			switch (_input.LA(1)) {
			case 5:
			case 8:
			case 9:
			case 16:
			case 25:
			case 28:
			case 36:
			case 40:
			case 48:
			case 72:
			case 83:
			case 84:
			case 89:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(804); type_specifier();
				}
				break;
			case 6:
			case 13:
			case 19:
			case 30:
			case 39:
			case 61:
			case 87:
			case 111:
				enterOuterAlt(_localctx, 2);
				{
				setState(805); type_qualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declarator_listContext extends ParserRuleContext {
		public Struct_declaratorContext struct_declarator(int i) {
			return getRuleContext(Struct_declaratorContext.class,i);
		}
		public List<Struct_declaratorContext> struct_declarator() {
			return getRuleContexts(Struct_declaratorContext.class);
		}
		public Struct_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator_list(this);
		}
	}

	public final Struct_declarator_listContext struct_declarator_list() throws RecognitionException {
		Struct_declarator_listContext _localctx = new Struct_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_struct_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); struct_declarator();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(809); match(31);
				setState(810); struct_declarator();
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Struct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStruct_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStruct_declarator(this);
		}
	}

	public final Struct_declaratorContext struct_declarator() throws RecognitionException {
		Struct_declaratorContext _localctx = new Struct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_struct_declarator);
		int _la;
		try {
			setState(822);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816); declarator();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				_la = _input.LA(1);
				if (_la==3 || _la==96 || _la==IDENTIFIER) {
					{
					setState(817); declarator();
					}
				}

				setState(820); match(95);
				setState(821); constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_specifierContext extends ParserRuleContext {
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnum_specifier(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enum_specifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824); match(89);
			setState(837);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(825); identifier();
				setState(830);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(826); match(99);
					setState(827); enumerator_list();
					setState(828); match(7);
					}
					break;
				}
				}
				break;
			case 99:
				{
				setState(832); match(99);
				setState(833); enumerator_list();
				setState(834); match(7);
				setState(835); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator_list(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumerator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); enumerator();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(840); match(31);
				setState(841); enumerator();
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847); identifier();
			setState(850);
			_la = _input.LA(1);
			if (_la==86) {
				{
				setState(848); match(86);
				setState(849); constant_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Direct_declaratorContext direct_declarator() {
			return getRuleContext(Direct_declaratorContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_declarator);
		int _la;
		try {
			setState(861);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(852); match(3);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 13) | (1L << 19) | (1L << 30) | (1L << 39) | (1L << 61))) != 0) || _la==87 || _la==111) {
					{
					{
					setState(853); type_qualifier();
					}
					}
					setState(858);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859); declarator();
				}
				break;
			case 96:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(860); direct_declarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_declaratorContext extends ParserRuleContext {
		public Declarator_suffixContext declarator_suffix(int i) {
			return getRuleContext(Declarator_suffixContext.class,i);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public List<Declarator_suffixContext> declarator_suffix() {
			return getRuleContexts(Declarator_suffixContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Direct_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDirect_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDirect_declarator(this);
		}
	}

	public final Direct_declaratorContext direct_declarator() throws RecognitionException {
		Direct_declaratorContext _localctx = new Direct_declaratorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_direct_declarator);
		try {
			int _alt;
			setState(879);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(863); identifier();
				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(864); declarator_suffix();
						}
						} 
					}
					setState(869);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(870); match(96);
				setState(871); declarator();
				setState(872); match(14);
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(873); declarator_suffix();
						}
						} 
					}
					setState(878);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDeclarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDeclarator_suffix(this);
		}
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_declarator_suffix);
		int _la;
		try {
			setState(891);
			switch (_input.LA(1)) {
			case 64:
				enterOuterAlt(_localctx, 1);
				{
				setState(881); match(64);
				setState(883);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(882); constant_expression();
					}
				}

				setState(885); match(92);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(886); match(96);
				setState(888);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(887); parameter_list();
					}
				}

				setState(890); match(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893); parameter_declaration_list();
			setState(896);
			_la = _input.LA(1);
			if (_la==31) {
				{
				setState(894); match(31);
				setState(895); match(42);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898); declaration_specifiers();
			setState(903);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(900);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(899); declarator();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(902); abstract_declarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_initializer);
		int _la;
		try {
			setState(917);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 24:
			case 26:
			case 34:
			case 49:
			case 60:
			case 63:
			case 64:
			case 68:
			case 74:
			case 96:
			case DOTIDENTIFIER:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case CSTRING_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(905); assignment_expression();
				}
				break;
			case 99:
				enterOuterAlt(_localctx, 2);
				{
				setState(906); match(99);
				setState(907); initializer();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==31) {
					{
					{
					setState(908); match(31);
					setState(909); initializer();
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(915); match(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Specifier_qualifier_listContext specifier_qualifier_list() {
			return getRuleContext(Specifier_qualifier_listContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919); specifier_qualifier_list();
			setState(920); abstract_declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declaratorContext extends ParserRuleContext {
		public Abstract_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator; }
	 
		public Abstract_declaratorContext() { }
		public void copyFrom(Abstract_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdecRecurseContext extends Abstract_declaratorContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Abstract_declarator_suffixContext abstract_declarator_suffix(int i) {
			return getRuleContext(Abstract_declarator_suffixContext.class,i);
		}
		public List<Abstract_declarator_suffixContext> abstract_declarator_suffix() {
			return getRuleContexts(Abstract_declarator_suffixContext.class);
		}
		public AdecRecurseContext(Abstract_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdecRecurse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdecRecurse(this);
		}
	}
	public static class AdecConstContext extends Abstract_declaratorContext {
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public AdecConstContext(Abstract_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdecConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdecConst(this);
		}
	}
	public static class AdecNoneContext extends Abstract_declaratorContext {
		public AdecNoneContext(Abstract_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdecNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdecNone(this);
		}
	}
	public static class AdecTypeContext extends Abstract_declaratorContext {
		public Abstract_declaratorContext abstract_declarator() {
			return getRuleContext(Abstract_declaratorContext.class,0);
		}
		public Type_qualifierContext type_qualifier(int i) {
			return getRuleContext(Type_qualifierContext.class,i);
		}
		public List<Type_qualifierContext> type_qualifier() {
			return getRuleContexts(Type_qualifierContext.class);
		}
		public AdecTypeContext(Abstract_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdecType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdecType(this);
		}
	}

	public final Abstract_declaratorContext abstract_declarator() throws RecognitionException {
		Abstract_declaratorContext _localctx = new Abstract_declaratorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_abstract_declarator);
		int _la;
		try {
			int _alt;
			setState(948);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new AdecTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(922); match(3);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 13) | (1L << 19) | (1L << 30) | (1L << 39) | (1L << 61))) != 0) || _la==87 || _la==111) {
					{
					{
					setState(923); type_qualifier();
					}
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(929); abstract_declarator();
				}
				break;

			case 2:
				_localctx = new AdecRecurseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(930); match(96);
				setState(931); abstract_declarator();
				setState(932); match(14);
				setState(934); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(933); abstract_declarator_suffix();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(936); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				_localctx = new AdecConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(943); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(938); match(64);
					setState(940);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
						{
						setState(939); constant_expression();
						}
					}

					setState(942); match(92);
					}
					}
					setState(945); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==64 );
				}
				break;

			case 4:
				_localctx = new AdecNoneContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abstract_declarator_suffixContext extends ParserRuleContext {
		public Parameter_declaration_listContext parameter_declaration_list() {
			return getRuleContext(Parameter_declaration_listContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Abstract_declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAbstract_declarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAbstract_declarator_suffix(this);
		}
	}

	public final Abstract_declarator_suffixContext abstract_declarator_suffix() throws RecognitionException {
		Abstract_declarator_suffixContext _localctx = new Abstract_declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_abstract_declarator_suffix);
		int _la;
		try {
			setState(960);
			switch (_input.LA(1)) {
			case 64:
				enterOuterAlt(_localctx, 1);
				{
				setState(950); match(64);
				setState(952);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(951); constant_expression();
					}
				}

				setState(954); match(92);
				}
				break;
			case 96:
				enterOuterAlt(_localctx, 2);
				{
				setState(955); match(96);
				setState(957);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 19) | (1L << 25) | (1L << 28) | (1L << 30) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 48) | (1L << 50) | (1L << 61))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (72 - 72)) | (1L << (83 - 72)) | (1L << (84 - 72)) | (1L << (87 - 72)) | (1L << (89 - 72)) | (1L << (101 - 72)) | (1L << (109 - 72)) | (1L << (111 - 72)) | (1L << (IDENTIFIER - 72)))) != 0)) {
					{
					setState(956); parameter_declaration_list();
					}
				}

				setState(959); match(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declaration_listContext extends ParserRuleContext {
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public Parameter_declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterParameter_declaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitParameter_declaration_list(this);
		}
	}

	public final Parameter_declaration_listContext parameter_declaration_list() throws RecognitionException {
		Parameter_declaration_listContext _localctx = new Parameter_declaration_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_parameter_declaration_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(962); parameter_declaration();
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(963); match(31);
					setState(964); parameter_declaration();
					}
					} 
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(970); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(973); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Semi_statementContext semi_statement() {
			return getRuleContext(Semi_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_statement);
		try {
			setState(983);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(975); labeled_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(976); semi_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977); compound_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978); selection_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(979); jump_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(980); while_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(981); for_statement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(982); do_while_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semi_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Semi_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSemi_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSemi_statement(this);
		}
	}

	public final Semi_statementContext semi_statement() throws RecognitionException {
		Semi_statementContext _localctx = new Semi_statementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_semi_statement);
		try {
			setState(989);
			switch (_input.LA(1)) {
			case 1:
			case 3:
			case 24:
			case 26:
			case 34:
			case 49:
			case 60:
			case 63:
			case 64:
			case 68:
			case 74:
			case 96:
			case DOTIDENTIFIER:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case CSTRING_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(985); expression();
				setState(986); match(110);
				}
				break;
			case 110:
				enterOuterAlt(_localctx, 2);
				{
				setState(988); match(110);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
	 
		public Labeled_statementContext() { }
		public void copyFrom(Labeled_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefaultContext extends Labeled_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefaultContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDefault(this);
		}
	}
	public static class LabelidContext extends Labeled_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelidContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLabelid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLabelid(this);
		}
	}
	public static class CaseContext extends Labeled_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public CaseContext(Labeled_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCase(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_labeled_statement);
		try {
			setState(1003);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new LabelidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(991); identifier();
				setState(992); match(95);
				setState(993); statement();
				}
				break;
			case 76:
				_localctx = new CaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(995); match(76);
				setState(996); constant_expression();
				setState(997); match(95);
				setState(998); statement();
				}
				break;
			case 93:
				_localctx = new DefaultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1000); match(93);
				setState(1001); match(95);
				setState(1002); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public List<Compound_statement_partsContext> compound_statement_parts() {
			return getRuleContexts(Compound_statement_partsContext.class);
		}
		public Compound_statement_partsContext compound_statement_parts(int i) {
			return getRuleContext(Compound_statement_partsContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCompound_statement(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005); match(99);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 18) | (1L << 19) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 28) | (1L << 30) | (1L << 32) | (1L << 34) | (1L << 35) | (1L << 36) | (1L << 39) | (1L << 40) | (1L << 43) | (1L << 48) | (1L << 49) | (1L << 50) | (1L << 58) | (1L << 60) | (1L << 61) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (69 - 64)) | (1L << (72 - 64)) | (1L << (74 - 64)) | (1L << (76 - 64)) | (1L << (83 - 64)) | (1L << (84 - 64)) | (1L << (87 - 64)) | (1L << (89 - 64)) | (1L << (93 - 64)) | (1L << (96 - 64)) | (1L << (99 - 64)) | (1L << (101 - 64)) | (1L << (107 - 64)) | (1L << (108 - 64)) | (1L << (109 - 64)) | (1L << (110 - 64)) | (1L << (111 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				{
				setState(1006); compound_statement_parts();
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012); match(7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statement_partsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Compound_statement_partsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement_parts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCompound_statement_parts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCompound_statement_parts(this);
		}
	}

	public final Compound_statement_partsContext compound_statement_parts() throws RecognitionException {
		Compound_statement_partsContext _localctx = new Compound_statement_partsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_compound_statement_parts);
		try {
			setState(1016);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014); declaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015); statement_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	 
		public Selection_statementContext() { }
		public void copyFrom(Selection_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfstmtContext extends Selection_statementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfstmtContext(Selection_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIfstmt(this);
		}
	}
	public static class SwitchContext extends Selection_statementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchContext(Selection_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSwitch(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_selection_statement);
		try {
			setState(1033);
			switch (_input.LA(1)) {
			case 35:
				_localctx = new IfstmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1018); match(35);
				setState(1019); match(96);
				setState(1020); expression();
				setState(1021); match(14);
				setState(1022); statement();
				setState(1025);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1023); match(46);
					setState(1024); statement();
					}
					break;
				}
				}
				break;
			case 58:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1027); match(58);
				setState(1028); match(96);
				setState(1029); expression();
				setState(1030); match(14);
				setState(1031); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035); match(32);
			setState(1036); match(96);
			setState(1037); expression();
			setState(1038); match(14);
			setState(1039); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_completeContext for_complete() {
			return getRuleContext(For_completeContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041); match(107);
			setState(1042); match(96);
			setState(1043); for_complete();
			setState(1044); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046); match(10);
			setState(1047); statement();
			setState(1048); match(32);
			setState(1049); match(96);
			setState(1050); expression();
			setState(1051); match(14);
			setState(1052); match(110);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_completeContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_declaration_completeContext for_declaration_complete() {
			return getRuleContext(For_declaration_completeContext.class,0);
		}
		public Declaration_minus_semiContext declaration_minus_semi() {
			return getRuleContext(Declaration_minus_semiContext.class,0);
		}
		public For_completeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_complete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterFor_complete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitFor_complete(this);
		}
	}

	public final For_completeContext for_complete() throws RecognitionException {
		For_completeContext _localctx = new For_completeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_for_complete);
		int _la;
		try {
			setState(1077);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054); expression();
				setState(1055); match(110);
				setState(1057);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1056); expression();
					}
				}

				setState(1059); match(110);
				setState(1061);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1060); expression();
					}
				}

				setState(1063); match(14);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065); match(110);
				setState(1067);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1066); expression();
					}
				}

				setState(1069); match(110);
				setState(1071);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1070); expression();
					}
				}

				setState(1073); match(14);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1074); declaration_minus_semi();
				setState(1075); for_declaration_complete();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_declaration_completeContext extends ParserRuleContext {
		public For_declaration_completeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration_complete; }
	 
		public For_declaration_completeContext() { }
		public void copyFrom(For_declaration_completeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Forcomplete1Context extends For_declaration_completeContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Forcomplete1Context(For_declaration_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterForcomplete1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitForcomplete1(this);
		}
	}
	public static class Forcomplete2Context extends For_declaration_completeContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Forcomplete2Context(For_declaration_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterForcomplete2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitForcomplete2(this);
		}
	}

	public final For_declaration_completeContext for_declaration_complete() throws RecognitionException {
		For_declaration_completeContext _localctx = new For_declaration_completeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_for_declaration_complete);
		int _la;
		try {
			setState(1092);
			switch (_input.LA(1)) {
			case 110:
				_localctx = new Forcomplete1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1079); match(110);
				setState(1081);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1080); expression();
					}
				}

				setState(1083); match(110);
				setState(1085);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1084); expression();
					}
				}

				setState(1087); match(14);
				}
				break;
			case 30:
				_localctx = new Forcomplete2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1088); match(30);
				setState(1089); expression();
				setState(1090); match(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitJump_statement(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_jump_statement);
		int _la;
		try {
			setState(1107);
			switch (_input.LA(1)) {
			case 18:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094); match(18);
				setState(1095); identifier();
				setState(1096); match(110);
				}
				break;
			case 69:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098); match(69);
				setState(1099); match(110);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 3);
				{
				setState(1100); match(43);
				setState(1101); match(110);
				}
				break;
			case 108:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102); match(108);
				setState(1104);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1103); expression();
					}
				}

				setState(1106); match(110);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Setter_callContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DotidentifierContext dotidentifier() {
			return getRuleContext(DotidentifierContext.class,0);
		}
		public Setter_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSetter_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSetter_call(this);
		}
	}

	public final Setter_callContext setter_call() throws RecognitionException {
		Setter_callContext _localctx = new Setter_callContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_setter_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109); dotidentifier();
			setState(1110); match(86);
			setState(1111); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Getter_callContext extends ParserRuleContext {
		public DotidentifierContext dotidentifier() {
			return getRuleContext(DotidentifierContext.class,0);
		}
		public Getter_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterGetter_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitGetter_call(this);
		}
	}

	public final Getter_callContext getter_call() throws RecognitionException {
		Getter_callContext _localctx = new Getter_callContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_getter_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); dotidentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotidentifierContext extends ParserRuleContext {
		public TerminalNode DOTIDENTIFIER() { return getToken(ObjCParser.DOTIDENTIFIER, 0); }
		public DotidentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotidentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDotidentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDotidentifier(this);
		}
	}

	public final DotidentifierContext dotidentifier() throws RecognitionException {
		DotidentifierContext _localctx = new DotidentifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_dotidentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115); match(DOTIDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117); assignment_expression();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(1118); match(31);
				setState(1119); assignment_expression();
				}
				}
				setState(1124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125); conditional_expression();
			setState(1129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 29) | (1L << 41) | (1L << 44) | (1L << 45) | (1L << 56) | (1L << 57))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (86 - 86)) | (1L << (88 - 86)) | (1L << (91 - 86)) | (1L << (97 - 86)))) != 0)) {
				{
				setState(1126); assignment_operator();
				setState(1127); assignment_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << 29) | (1L << 41) | (1L << 44) | (1L << 45) | (1L << 56) | (1L << 57))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (86 - 86)) | (1L << (88 - 86)) | (1L << (91 - 86)) | (1L << (97 - 86)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Logical_or_expressionContext> logical_or_expression() {
			return getRuleContexts(Logical_or_expressionContext.class);
		}
		public Logical_or_expressionContext logical_or_expression(int i) {
			return getRuleContext(Logical_or_expressionContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConditional_expression(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133); logical_or_expression();
			setState(1139);
			_la = _input.LA(1);
			if (_la==37) {
				{
				setState(1134); match(37);
				setState(1135); logical_or_expression();
				setState(1136); match(95);
				setState(1137); logical_or_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant_expression(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141); conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_or_expression(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143); logical_and_expression();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==54) {
				{
				{
				setState(1144); match(54);
				setState(1145); logical_and_expression();
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitLogical_and_expression(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151); inclusive_or_expression();
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==53) {
				{
				{
				setState(1152); match(53);
				setState(1153); inclusive_or_expression();
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitInclusive_or_expression(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159); exclusive_or_expression();
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==23) {
				{
				{
				setState(1160); match(23);
				setState(1161); exclusive_or_expression();
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitExclusive_or_expression(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); and_expression();
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==104) {
				{
				{
				setState(1168); match(104);
				setState(1169); and_expression();
				}
				}
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175); equality_expression();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==63) {
				{
				{
				setState(1176); match(63);
				setState(1177); equality_expression();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public List<Equality_opContext> equality_op() {
			return getRuleContexts(Equality_opContext.class);
		}
		public Equality_opContext equality_op(int i) {
			return getRuleContext(Equality_opContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEquality_expression(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183); relational_expression();
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==70 || _la==113) {
				{
				{
				setState(1184); equality_op();
				setState(1185); relational_expression();
				}
				}
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_opContext extends ParserRuleContext {
		public Equality_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterEquality_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitEquality_op(this);
		}
	}

	public final Equality_opContext equality_op() throws RecognitionException {
		Equality_opContext _localctx = new Equality_opContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_equality_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			_la = _input.LA(1);
			if ( !(_la==70 || _la==113) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_opContext relational_op(int i) {
			return getRuleContext(Relational_opContext.class,i);
		}
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public List<Relational_opContext> relational_op() {
			return getRuleContexts(Relational_opContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitRelational_expression(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194); shift_expression();
			setState(1200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (55 - 55)) | (1L << (67 - 55)) | (1L << (71 - 55)) | (1L << (115 - 55)))) != 0)) {
				{
				{
				setState(1195); relational_op();
				setState(1196); shift_expression();
				}
				}
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_opContext extends ParserRuleContext {
		public Relational_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterRelational_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitRelational_op(this);
		}
	}

	public final Relational_opContext relational_op() throws RecognitionException {
		Relational_opContext _localctx = new Relational_opContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_relational_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (55 - 55)) | (1L << (67 - 55)) | (1L << (71 - 55)) | (1L << (115 - 55)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Shift_opContext shift_op(int i) {
			return getRuleContext(Shift_opContext.class,i);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Shift_opContext> shift_op() {
			return getRuleContexts(Shift_opContext.class);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitShift_expression(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205); additive_expression();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==73 || _la==103) {
				{
				{
				setState(1206); shift_op();
				setState(1207); additive_expression();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_opContext extends ParserRuleContext {
		public Shift_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterShift_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitShift_op(this);
		}
	}

	public final Shift_opContext shift_op() throws RecognitionException {
		Shift_opContext _localctx = new Shift_opContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_shift_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			_la = _input.LA(1);
			if ( !(_la==73 || _la==103) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdditive_expression(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216); multiplicative_expression();
			setState(1222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==34 || _la==52) {
				{
				{
				setState(1217); add_op();
				setState(1218); multiplicative_expression();
				}
				}
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitAdd_op(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225);
			_la = _input.LA(1);
			if ( !(_la==34 || _la==52) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public List<Multiply_opContext> multiply_op() {
			return getRuleContexts(Multiply_opContext.class);
		}
		public Multiply_opContext multiply_op(int i) {
			return getRuleContext(Multiply_opContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMultiplicative_expression(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1227); cast_expression();
			setState(1233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1228); multiply_op();
					setState(1229); cast_expression();
					}
					} 
				}
				setState(1235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiply_opContext extends ParserRuleContext {
		public Multiply_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterMultiply_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitMultiply_op(this);
		}
	}

	public final Multiply_opContext multiply_op() throws RecognitionException {
		Multiply_opContext _localctx = new Multiply_opContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_multiply_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			_la = _input.LA(1);
			if ( !(_la==3 || _la==59 || _la==81) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Message_expressionContext message_expression() {
			return getRuleContext(Message_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCast_expression(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_cast_expression);
		try {
			setState(1245);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238); match(96);
				setState(1239); type_name();
				setState(1240); match(14);
				setState(1241); cast_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243); unary_expression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1244); message_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Simple_unaryContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Simple_unaryContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSimple_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSimple_unary(this);
		}
	}
	public static class CastunaryContext extends Unary_expressionContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public CastunaryContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterCastunary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitCastunary(this);
		}
	}
	public static class PfixunaryContext extends Unary_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public PfixunaryContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPfixunary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPfixunary(this);
		}
	}
	public static class SizeofunaryContext extends Unary_expressionContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public SizeofunaryContext(Unary_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSizeofunary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSizeofunary(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_unary_expression);
		try {
			setState(1263);
			switch (_input.LA(1)) {
			case 1:
			case 64:
			case 74:
			case 96:
			case DOTIDENTIFIER:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case CSTRING_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				_localctx = new PfixunaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1247); postfix_expression();
				}
				break;
			case 49:
				_localctx = new Simple_unaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1248); match(49);
				setState(1249); unary_expression();
				}
				break;
			case 68:
				_localctx = new Simple_unaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1250); match(68);
				setState(1251); unary_expression();
				}
				break;
			case 3:
			case 24:
			case 34:
			case 60:
			case 63:
				_localctx = new CastunaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1252); unary_operator();
				setState(1253); cast_expression();
				}
				break;
			case 26:
				_localctx = new SizeofunaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1255); match(26);
				setState(1261);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1256); match(96);
					setState(1257); type_name();
					setState(1258); match(14);
					}
					break;

				case 2:
					{
					setState(1260); unary_expression();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 24) | (1L << 34) | (1L << 60) | (1L << 63))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expression_completeContext postfix_expression_complete(int i) {
			return getRuleContext(Postfix_expression_completeContext.class,i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public List<Postfix_expression_completeContext> postfix_expression_complete() {
			return getRuleContexts(Postfix_expression_completeContext.class);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitPostfix_expression(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_postfix_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1267); primary_expression();
			setState(1271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(1268); postfix_expression_complete();
					}
					} 
				}
				setState(1273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expression_completeContext extends ParserRuleContext {
		public Postfix_expression_completeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression_complete; }
	 
		public Postfix_expression_completeContext() { }
		public void copyFrom(Postfix_expression_completeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimpostContext extends Postfix_expression_completeContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimpostContext(Postfix_expression_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterDimpost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitDimpost(this);
		}
	}
	public static class SimplepostContext extends Postfix_expression_completeContext {
		public SimplepostContext(Postfix_expression_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterSimplepost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitSimplepost(this);
		}
	}
	public static class ArrowpostContext extends Postfix_expression_completeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrowpostContext(Postfix_expression_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArrowpost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArrowpost(this);
		}
	}
	public static class ArgpostContext extends Postfix_expression_completeContext {
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public ArgpostContext(Postfix_expression_completeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgpost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgpost(this);
		}
	}

	public final Postfix_expression_completeContext postfix_expression_complete() throws RecognitionException {
		Postfix_expression_completeContext _localctx = new Postfix_expression_completeContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_postfix_expression_complete);
		int _la;
		try {
			setState(1289);
			switch (_input.LA(1)) {
			case 64:
				_localctx = new DimpostContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1274); match(64);
				setState(1275); expression();
				setState(1276); match(92);
				}
				break;
			case 96:
				_localctx = new ArgpostContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1278); match(96);
				setState(1280);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 3) | (1L << 24) | (1L << 26) | (1L << 34) | (1L << 49) | (1L << 60) | (1L << 63))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (64 - 64)) | (1L << (68 - 64)) | (1L << (74 - 64)) | (1L << (96 - 64)) | (1L << (DOTIDENTIFIER - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (CHARACTER_LITERAL - 64)) | (1L << (CSTRING_LITERAL - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(1279); argument_expression_list();
					}
				}

				setState(1282); match(14);
				}
				break;
			case 51:
				_localctx = new ArrowpostContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1283); match(51);
				setState(1284); identifier();
				}
				break;
			case 82:
				_localctx = new ArrowpostContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1285); match(82);
				setState(1286); identifier();
				}
				break;
			case 49:
				_localctx = new SimplepostContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1287); match(49);
				}
				break;
			case 68:
				_localctx = new SimplepostContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1288); match(68);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(ObjCParser.LINE_COMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(ObjCParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==LINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitArgument_expression_list(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293); assignment_expression();
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(1294); match(31);
				setState(1295); assignment_expression();
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjCParser.CHARACTER_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjCParser.OCTAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(ObjCParser.HEX_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjCParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjCParser.DECIMAL_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjCListener ) ((ObjCListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (CHARACTER_LITERAL - 118)) | (1L << (HEX_LITERAL - 118)) | (1L << (DECIMAL_LITERAL - 118)) | (1L << (OCTAL_LITERAL - 118)) | (1L << (FLOATING_POINT_LITERAL - 118)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\u0084\u051c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\t"+
		"E\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4"+
		"Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t"+
		"\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4"+
		"h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\t"+
		"s\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4"+
		"\177\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083"+
		"\4\u0084\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088"+
		"\t\u0088\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c"+
		"\4\u008d\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f\3\2\6\2\u0120\n\2\r\2"+
		"\16\2\u0121\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0131"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u013f\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u014b\n\7\3\7\5\7\u014e\n\7\3"+
		"\7\5\7\u0151\n\7\3\7\5\7\u0154\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u015c\n"+
		"\b\3\b\3\b\5\b\u0160\n\b\3\b\5\b\u0163\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t"+
		"\u016b\n\t\3\t\5\t\u016e\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0178"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\5\13\u017f\n\13\3\13\5\13\u0182\n\13\3\13"+
		"\5\13\u0185\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u0196\n\17\f\17\16\17\u0199\13\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u01a2\n\21\f\21\16\21\u01a5\13\21\3\22\3\22"+
		"\5\22\u01a9\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u01b4"+
		"\n\24\f\24\16\24\u01b7\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u01c1\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32"+
		"\u01cd\n\32\f\32\16\32\u01d0\13\32\3\32\3\32\3\32\3\32\6\32\u01d6\n\32"+
		"\r\32\16\32\u01d7\3\32\3\32\3\32\3\32\6\32\u01de\n\32\r\32\16\32\u01df"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01e8\n\32\r\32\16\32\u01e9\3\32\3"+
		"\32\3\32\5\32\u01ef\n\32\3\33\3\33\3\34\3\34\3\34\3\34\6\34\u01f7\n\34"+
		"\r\34\16\34\u01f8\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u0202\n\37\3"+
		"\37\3\37\3\37\3 \6 \u0208\n \r \16 \u0209\3!\3!\3!\3!\3!\5!\u0211\n!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\5$\u021a\n$\3$\3$\5$\u021e\n$\3$\3$\3%\3%\6%\u0224"+
		"\n%\r%\16%\u0225\3%\5%\u0229\n%\5%\u022b\n%\3&\5&\u022e\n&\3&\3&\7&\u0232"+
		"\n&\f&\16&\u0235\13&\3&\3&\3\'\3\'\5\'\u023b\n\'\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u0249\n)\3*\3*\3*\7*\u024e\n*\f*\16*\u0251\13*\3+\3"+
		"+\3+\3+\5+\u0257\n+\3,\3,\5,\u025b\n,\3-\3-\5-\u025f\n-\3-\3-\5-\u0263"+
		"\n-\3-\5-\u0266\n-\3.\3.\3/\3/\3/\5/\u026d\n/\3\60\3\60\3\61\3\61\3\61"+
		"\5\61\u0274\n\61\3\62\3\62\3\63\3\63\3\63\5\63\u027b\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\5\64\u0283\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\5\67\u028d\n\67\38\38\39\39\39\39\39\39\59\u0297\n9\3:\3:\3:\3:"+
		"\5:\u029d\n:\3;\3;\6;\u02a1\n;\r;\16;\u02a2\5;\u02a5\n;\3<\5<\u02a8\n"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\5>\u02b4\n>\3>\6>\u02b7\n>\r>\16>\u02b8"+
		"\5>\u02bb\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C"+
		"\3C\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\5F\u02dc\nF\3G\3G\3G\3G\3G\3G\3H"+
		"\5H\u02e5\nH\3H\3H\3H\3I\3I\5I\u02ec\nI\3J\3J\3J\3K\6K\u02f2\nK\rK\16"+
		"K\u02f3\3L\3L\3L\5L\u02f9\nL\3M\3M\3M\3M\3M\5M\u0300\nM\3N\3N\3N\7N\u0305"+
		"\nN\fN\16N\u0308\13N\3O\3O\3O\5O\u030d\nO\3P\3P\3P\5P\u0312\nP\3P\3P\6"+
		"P\u0316\nP\rP\16P\u0317\3P\3P\5P\u031c\nP\3Q\3Q\3Q\3Q\3R\6R\u0323\nR\r"+
		"R\16R\u0324\3S\3S\5S\u0329\nS\3T\3T\3T\7T\u032e\nT\fT\16T\u0331\13T\3"+
		"U\3U\5U\u0335\nU\3U\3U\5U\u0339\nU\3V\3V\3V\3V\3V\3V\5V\u0341\nV\3V\3"+
		"V\3V\3V\3V\5V\u0348\nV\3W\3W\3W\7W\u034d\nW\fW\16W\u0350\13W\3X\3X\3X"+
		"\5X\u0355\nX\3Y\3Y\7Y\u0359\nY\fY\16Y\u035c\13Y\3Y\3Y\5Y\u0360\nY\3Z\3"+
		"Z\7Z\u0364\nZ\fZ\16Z\u0367\13Z\3Z\3Z\3Z\3Z\7Z\u036d\nZ\fZ\16Z\u0370\13"+
		"Z\5Z\u0372\nZ\3[\3[\5[\u0376\n[\3[\3[\3[\5[\u037b\n[\3[\5[\u037e\n[\3"+
		"\\\3\\\3\\\5\\\u0383\n\\\3]\3]\5]\u0387\n]\3]\5]\u038a\n]\3^\3^\3^\3^"+
		"\3^\7^\u0391\n^\f^\16^\u0394\13^\3^\3^\5^\u0398\n^\3_\3_\3_\3`\3`\7`\u039f"+
		"\n`\f`\16`\u03a2\13`\3`\3`\3`\3`\3`\6`\u03a9\n`\r`\16`\u03aa\3`\3`\5`"+
		"\u03af\n`\3`\6`\u03b2\n`\r`\16`\u03b3\3`\5`\u03b7\n`\3a\3a\5a\u03bb\n"+
		"a\3a\3a\3a\5a\u03c0\na\3a\5a\u03c3\na\3b\3b\3b\7b\u03c8\nb\fb\16b\u03cb"+
		"\13b\3c\6c\u03ce\nc\rc\16c\u03cf\3d\3d\3d\3d\3d\3d\3d\3d\5d\u03da\nd\3"+
		"e\3e\3e\3e\5e\u03e0\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u03ee\n"+
		"f\3g\3g\7g\u03f2\ng\fg\16g\u03f5\13g\3g\3g\3h\3h\5h\u03fb\nh\3i\3i\3i"+
		"\3i\3i\3i\3i\5i\u0404\ni\3i\3i\3i\3i\3i\3i\5i\u040c\ni\3j\3j\3j\3j\3j"+
		"\3j\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3m\3m\3m\5m\u0424\nm\3m\3m"+
		"\5m\u0428\nm\3m\3m\3m\3m\5m\u042e\nm\3m\3m\5m\u0432\nm\3m\3m\3m\3m\5m"+
		"\u0438\nm\3n\3n\5n\u043c\nn\3n\3n\5n\u0440\nn\3n\3n\3n\3n\3n\5n\u0447"+
		"\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0453\no\3o\5o\u0456\no\3p\3p\3p"+
		"\3p\3q\3q\3r\3r\3s\3s\3s\7s\u0463\ns\fs\16s\u0466\13s\3t\3t\3t\3t\5t\u046c"+
		"\nt\3u\3u\3v\3v\3v\3v\3v\3v\5v\u0476\nv\3w\3w\3x\3x\3x\7x\u047d\nx\fx"+
		"\16x\u0480\13x\3y\3y\3y\7y\u0485\ny\fy\16y\u0488\13y\3z\3z\3z\7z\u048d"+
		"\nz\fz\16z\u0490\13z\3{\3{\3{\7{\u0495\n{\f{\16{\u0498\13{\3|\3|\3|\7"+
		"|\u049d\n|\f|\16|\u04a0\13|\3}\3}\3}\3}\7}\u04a6\n}\f}\16}\u04a9\13}\3"+
		"~\3~\3\177\3\177\3\177\3\177\7\177\u04b1\n\177\f\177\16\177\u04b4\13\177"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u04bc\n\u0081"+
		"\f\u0081\16\u0081\u04bf\13\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u04c7\n\u0083\f\u0083\16\u0083\u04ca\13\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u04d2\n\u0085\f\u0085"+
		"\16\u0085\u04d5\13\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u04e0\n\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\5\u0088\u04f0\n\u0088\5\u0088\u04f2\n\u0088\3\u0089\3"+
		"\u0089\3\u008a\3\u008a\7\u008a\u04f8\n\u008a\f\u008a\16\u008a\u04fb\13"+
		"\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0503\n"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u050c\n\u008b\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u0513\n"+
		"\u008d\f\u008d\16\u008d\u0516\13\u008d\3\u008e\3\u008e\3\u008f\3\u008f"+
		"\3\u008f\2\u0090\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100"+
		"\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118"+
		"\u011a\u011c\2\21\4((ll\6\35\35OO``kk\n\7\7\n\13\22\22\33\33\36\36&&*"+
		"*VV\b\b\b\17\17\25\25  ))??\3yz\4\62\62UU\13\16\16\37\37++./:;XXZZ]]c"+
		"c\4HHss\699EEIIuu\4KKii\4$$\66\66\5\5\5==SS\7\5\5\32\32$$>>AA\3\u0083"+
		"\u0084\4xx{~\u0551\2\u011f\3\2\2\2\4\u0130\3\2\2\2\6\u013e\3\2\2\2\b\u0140"+
		"\3\2\2\2\n\u0144\3\2\2\2\f\u0146\3\2\2\2\16\u0157\3\2\2\2\20\u0166\3\2"+
		"\2\2\22\u0171\3\2\2\2\24\u017b\3\2\2\2\26\u0188\3\2\2\2\30\u018c\3\2\2"+
		"\2\32\u018e\3\2\2\2\34\u0192\3\2\2\2\36\u019a\3\2\2\2 \u019e\3\2\2\2\""+
		"\u01a6\3\2\2\2$\u01ac\3\2\2\2&\u01b0\3\2\2\2(\u01c0\3\2\2\2*\u01c2\3\2"+
		"\2\2,\u01c4\3\2\2\2.\u01c6\3\2\2\2\60\u01c8\3\2\2\2\62\u01ee\3\2\2\2\64"+
		"\u01f0\3\2\2\2\66\u01f6\3\2\2\28\u01fa\3\2\2\2:\u01fd\3\2\2\2<\u0201\3"+
		"\2\2\2>\u0207\3\2\2\2@\u0210\3\2\2\2B\u0212\3\2\2\2D\u0215\3\2\2\2F\u0219"+
		"\3\2\2\2H\u022a\3\2\2\2J\u022d\3\2\2\2L\u023a\3\2\2\2N\u023c\3\2\2\2P"+
		"\u0248\3\2\2\2R\u024a\3\2\2\2T\u0256\3\2\2\2V\u025a\3\2\2\2X\u0265\3\2"+
		"\2\2Z\u0267\3\2\2\2\\\u026c\3\2\2\2^\u026e\3\2\2\2`\u0273\3\2\2\2b\u0275"+
		"\3\2\2\2d\u027a\3\2\2\2f\u0282\3\2\2\2h\u0284\3\2\2\2j\u0288\3\2\2\2l"+
		"\u028c\3\2\2\2n\u028e\3\2\2\2p\u0290\3\2\2\2r\u029c\3\2\2\2t\u02a4\3\2"+
		"\2\2v\u02a7\3\2\2\2x\u02ac\3\2\2\2z\u02ba\3\2\2\2|\u02bc\3\2\2\2~\u02c1"+
		"\3\2\2\2\u0080\u02c6\3\2\2\2\u0082\u02c8\3\2\2\2\u0084\u02ca\3\2\2\2\u0086"+
		"\u02d0\3\2\2\2\u0088\u02d3\3\2\2\2\u008a\u02d8\3\2\2\2\u008c\u02dd\3\2"+
		"\2\2\u008e\u02e4\3\2\2\2\u0090\u02e9\3\2\2\2\u0092\u02ed\3\2\2\2\u0094"+
		"\u02f1\3\2\2\2\u0096\u02f8\3\2\2\2\u0098\u02ff\3\2\2\2\u009a\u0301\3\2"+
		"\2\2\u009c\u0309\3\2\2\2\u009e\u030e\3\2\2\2\u00a0\u031d\3\2\2\2\u00a2"+
		"\u0322\3\2\2\2\u00a4\u0328\3\2\2\2\u00a6\u032a\3\2\2\2\u00a8\u0338\3\2"+
		"\2\2\u00aa\u033a\3\2\2\2\u00ac\u0349\3\2\2\2\u00ae\u0351\3\2\2\2\u00b0"+
		"\u035f\3\2\2\2\u00b2\u0371\3\2\2\2\u00b4\u037d\3\2\2\2\u00b6\u037f\3\2"+
		"\2\2\u00b8\u0384\3\2\2\2\u00ba\u0397\3\2\2\2\u00bc\u0399\3\2\2\2\u00be"+
		"\u03b6\3\2\2\2\u00c0\u03c2\3\2\2\2\u00c2\u03c4\3\2\2\2\u00c4\u03cd\3\2"+
		"\2\2\u00c6\u03d9\3\2\2\2\u00c8\u03df\3\2\2\2\u00ca\u03ed\3\2\2\2\u00cc"+
		"\u03ef\3\2\2\2\u00ce\u03fa\3\2\2\2\u00d0\u040b\3\2\2\2\u00d2\u040d\3\2"+
		"\2\2\u00d4\u0413\3\2\2\2\u00d6\u0418\3\2\2\2\u00d8\u0437\3\2\2\2\u00da"+
		"\u0446\3\2\2\2\u00dc\u0455\3\2\2\2\u00de\u0457\3\2\2\2\u00e0\u045b\3\2"+
		"\2\2\u00e2\u045d\3\2\2\2\u00e4\u045f\3\2\2\2\u00e6\u0467\3\2\2\2\u00e8"+
		"\u046d\3\2\2\2\u00ea\u046f\3\2\2\2\u00ec\u0477\3\2\2\2\u00ee\u0479\3\2"+
		"\2\2\u00f0\u0481\3\2\2\2\u00f2\u0489\3\2\2\2\u00f4\u0491\3\2\2\2\u00f6"+
		"\u0499\3\2\2\2\u00f8\u04a1\3\2\2\2\u00fa\u04aa\3\2\2\2\u00fc\u04ac\3\2"+
		"\2\2\u00fe\u04b5\3\2\2\2\u0100\u04b7\3\2\2\2\u0102\u04c0\3\2\2\2\u0104"+
		"\u04c2\3\2\2\2\u0106\u04cb\3\2\2\2\u0108\u04cd\3\2\2\2\u010a\u04d6\3\2"+
		"\2\2\u010c\u04df\3\2\2\2\u010e\u04f1\3\2\2\2\u0110\u04f3\3\2\2\2\u0112"+
		"\u04f5\3\2\2\2\u0114\u050b\3\2\2\2\u0116\u050d\3\2\2\2\u0118\u050f\3\2"+
		"\2\2\u011a\u0517\3\2\2\2\u011c\u0519\3\2\2\2\u011e\u0120\5\4\3\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\1\2\2\u0124\3\3\2\2\2\u0125\u0131"+
		"\5\u0116\u008c\2\u0126\u0131\5\6\4\2\u0127\u0131\5\u008eH\2\u0128\u0131"+
		"\5\u0092J\2\u0129\u0131\5\f\7\2\u012a\u0131\5\20\t\2\u012b\u0131\5\16"+
		"\b\2\u012c\u0131\5\22\n\2\u012d\u0131\5\24\13\2\u012e\u0131\5\26\f\2\u012f"+
		"\u0131\5\32\16\2\u0130\u0125\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u0127\3"+
		"\2\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130"+
		"\u012b\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u012f\3\2\2\2\u0131\5\3\2\2\2\u0132\u013f\7\177\2\2\u0133\u013f"+
		"\7\u0080\2\2\u0134\u013f\5\b\5\2\u0135\u0136\7\27\2\2\u0136\u013f\5\u00e4"+
		"s\2\u0137\u0138\7t\2\2\u0138\u013f\5\u00e4s\2\u0139\u013a\7f\2\2\u013a"+
		"\u013f\5\u00e4s\2\u013b\u013c\7C\2\2\u013c\u013f\5\u00e4s\2\u013d\u013f"+
		"\7d\2\2\u013e\u0132\3\2\2\2\u013e\u0133\3\2\2\2\u013e\u0134\3\2\2\2\u013e"+
		"\u0135\3\2\2\2\u013e\u0137\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013b\3\2"+
		"\2\2\u013e\u013d\3\2\2\2\u013f\7\3\2\2\2\u0140\u0141\7h\2\2\u0141\u0142"+
		"\5\u011a\u008e\2\u0142\u0143\5\u00ecw\2\u0143\t\3\2\2\2\u0144\u0145\7"+
		"\61\2\2\u0145\13\3\2\2\2\u0146\u0147\7r\2\2\u0147\u014a\5*\26\2\u0148"+
		"\u0149\7a\2\2\u0149\u014b\5,\27\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5\36\20\2\u014d\u014c\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0151\5\62\32\2\u0150\u014f\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\5\66\34\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7D"+
		"\2\2\u0156\r\3\2\2\2\u0157\u0158\7r\2\2\u0158\u0159\5*\26\2\u0159\u015b"+
		"\7b\2\2\u015a\u015c\5.\30\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\7\20\2\2\u015e\u0160\5\36\20\2\u015f\u015e"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0163\5\66\34\2"+
		"\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\7D\2\2\u0165\17\3\2\2\2\u0166\u0167\7\23\2\2\u0167\u016a\5*\26\2\u0168"+
		"\u0169\7a\2\2\u0169\u016b\5,\27\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016e\5> \2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7D\2\2\u0170\21\3\2\2\2\u0171"+
		"\u0172\7\23\2\2\u0172\u0173\5*\26\2\u0173\u0174\7b\2\2\u0174\u0175\5."+
		"\30\2\u0175\u0177\7\20\2\2\u0176\u0178\5> \2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7D\2\2\u017a\23\3\2\2\2"+
		"\u017b\u017c\7M\2\2\u017c\u017e\5\60\31\2\u017d\u017f\5\36\20\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u0182\5\30"+
		"\r\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0185\5\66\34\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3"+
		"\2\2\2\u0186\u0187\7D\2\2\u0187\25\3\2\2\2\u0188\u0189\7M\2\2\u0189\u018a"+
		"\5 \21\2\u018a\u018b\7p\2\2\u018b\27\3\2\2\2\u018c\u018d\t\2\2\2\u018d"+
		"\31\3\2\2\2\u018e\u018f\7\\\2\2\u018f\u0190\5\34\17\2\u0190\u0191\7p\2"+
		"\2\u0191\33\3\2\2\2\u0192\u0197\5*\26\2\u0193\u0194\7!\2\2\u0194\u0196"+
		"\5*\26\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\35\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\7E\2\2"+
		"\u019b\u019c\5 \21\2\u019c\u019d\79\2\2\u019d\37\3\2\2\2\u019e\u01a3\5"+
		"\60\31\2\u019f\u01a0\7!\2\2\u01a0\u01a2\5\60\31\2\u01a1\u019f\3\2\2\2"+
		"\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4!\3"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7\26\2\2\u01a7\u01a9\5$\23\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5\u00a0"+
		"Q\2\u01ab#\3\2\2\2\u01ac\u01ad\7b\2\2\u01ad\u01ae\5&\24\2\u01ae\u01af"+
		"\7\20\2\2\u01af%\3\2\2\2\u01b0\u01b5\5(\25\2\u01b1\u01b2\7!\2\2\u01b2"+
		"\u01b4\5(\25\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\'\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01c1"+
		"\7w\2\2\u01b9\u01ba\7w\2\2\u01ba\u01bb\7X\2\2\u01bb\u01c1\7w\2\2\u01bc"+
		"\u01bd\7w\2\2\u01bd\u01be\7X\2\2\u01be\u01bf\7w\2\2\u01bf\u01c1\7a\2\2"+
		"\u01c0\u01b8\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1)\3"+
		"\2\2\2\u01c2\u01c3\5\u011a\u008e\2\u01c3+\3\2\2\2\u01c4\u01c5\5\u011a"+
		"\u008e\2\u01c5-\3\2\2\2\u01c6\u01c7\7w\2\2\u01c7/\3\2\2\2\u01c8\u01c9"+
		"\7w\2\2\u01c9\61\3\2\2\2\u01ca\u01ce\7e\2\2\u01cb\u01cd\5\u00a0Q\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01ef\7\t\2\2\u01d2"+
		"\u01d3\7e\2\2\u01d3\u01d5\5\64\33\2\u01d4\u01d6\5\u00a0Q\2\u01d5\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\7\t\2\2\u01da\u01ef\3\2\2\2\u01db\u01dd\7e"+
		"\2\2\u01dc\u01de\5\u00a0Q\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\5\62"+
		"\32\2\u01e2\u01e3\7\t\2\2\u01e3\u01ef\3\2\2\2\u01e4\u01e5\7e\2\2\u01e5"+
		"\u01e7\5\64\33\2\u01e6\u01e8\5\u00a0Q\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\5\62\32\2\u01ec\u01ed\7\t\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ca\3"+
		"\2\2\2\u01ee\u01d2\3\2\2\2\u01ee\u01db\3\2\2\2\u01ee\u01e4\3\2\2\2\u01ef"+
		"\63\3\2\2\2\u01f0\u01f1\t\3\2\2\u01f1\65\3\2\2\2\u01f2\u01f7\5\u0092J"+
		"\2\u01f3\u01f7\58\35\2\u01f4\u01f7\5:\36\2\u01f5\u01f7\5\"\22\2\u01f6"+
		"\u01f2\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\67\3\2\2\2\u01fa\u01fb\7\66\2\2\u01fb\u01fc\5<\37\2\u01fc9\3\2\2\2\u01fd"+
		"\u01fe\7$\2\2\u01fe\u01ff\5<\37\2\u01ff;\3\2\2\2\u0200\u0202\5N(\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5H"+
		"%\2\u0204\u0205\7p\2\2\u0205=\3\2\2\2\u0206\u0208\5@!\2\u0207\u0206\3"+
		"\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"?\3\2\2\2\u020b\u0211\5\u008eH\2\u020c\u0211\5\u0092J\2\u020d\u0211\5"+
		"B\"\2\u020e\u0211\5D#\2\u020f\u0211\5P)\2\u0210\u020b\3\2\2\2\u0210\u020c"+
		"\3\2\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211"+
		"A\3\2\2\2\u0212\u0213\7\66\2\2\u0213\u0214\5F$\2\u0214C\3\2\2\2\u0215"+
		"\u0216\7$\2\2\u0216\u0217\5F$\2\u0217E\3\2\2\2\u0218\u021a\5N(\2\u0219"+
		"\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\5H"+
		"%\2\u021c\u021e\5\u009aN\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\5\u00ccg\2\u0220G\3\2\2\2\u0221\u022b\5L\'"+
		"\2\u0222\u0224\5J&\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0229\5\u00b6\\"+
		"\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0221"+
		"\3\2\2\2\u022a\u0223\3\2\2\2\u022bI\3\2\2\2\u022c\u022e\5L\'\2\u022d\u022c"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233\7a\2\2\u0230"+
		"\u0232\5N(\2\u0231\u0230\3\2\2\2\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0237"+
		"\5\u011a\u008e\2\u0237K\3\2\2\2\u0238\u023b\5\u011a\u008e\2\u0239\u023b"+
		"\5\u00e2r\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023bM\3\2\2\2\u023c"+
		"\u023d\7b\2\2\u023d\u023e\5\u00bc_\2\u023e\u023f\7\20\2\2\u023fO\3\2\2"+
		"\2\u0240\u0241\7P\2\2\u0241\u0242\5R*\2\u0242\u0243\7p\2\2\u0243\u0249"+
		"\3\2\2\2\u0244\u0245\7Q\2\2\u0245\u0246\5R*\2\u0246\u0247\7p\2\2\u0247"+
		"\u0249\3\2\2\2\u0248\u0240\3\2\2\2\u0248\u0244\3\2\2\2\u0249Q\3\2\2\2"+
		"\u024a\u024f\5T+\2\u024b\u024c\7!\2\2\u024c\u024e\5T+\2\u024d\u024b\3"+
		"\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"S\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0257\7w\2\2\u0253\u0254\7w\2\2\u0254"+
		"\u0255\7X\2\2\u0255\u0257\7w\2\2\u0256\u0252\3\2\2\2\u0256\u0253\3\2\2"+
		"\2\u0257U\3\2\2\2\u0258\u025b\5\\/\2\u0259\u025b\5X-\2\u025a\u0258\3\2"+
		"\2\2\u025a\u0259\3\2\2\2\u025bW\3\2\2\2\u025c\u025e\7J\2\2\u025d\u025f"+
		"\5\36\20\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0266\3\2\2\2"+
		"\u0260\u0262\5*\26\2\u0261\u0263\5\36\20\2\u0262\u0261\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0266\5Z.\2\u0265\u025c\3\2\2\2\u0265"+
		"\u0260\3\2\2\2\u0265\u0264\3\2\2\2\u0266Y\3\2\2\2\u0267\u0268\5\u009e"+
		"P\2\u0268[\3\2\2\2\u0269\u026d\5^\60\2\u026a\u026d\5\u011a\u008e\2\u026b"+
		"\u026d\5\u00aaV\2\u026c\u0269\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026b"+
		"\3\2\2\2\u026d]\3\2\2\2\u026e\u026f\t\4\2\2\u026f_\3\2\2\2\u0270\u0274"+
		"\7Y\2\2\u0271\u0274\7q\2\2\u0272\u0274\5b\62\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0272\3\2\2\2\u0274a\3\2\2\2\u0275\u0276\t\5\2\2"+
		"\u0276c\3\2\2\2\u0277\u027b\5f\64\2\u0278\u027b\5h\65\2\u0279\u027b\5"+
		"x=\2\u027a\u0277\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027b"+
		"e\3\2\2\2\u027c\u0283\5\u011a\u008e\2\u027d\u0283\5\u011c\u008f\2\u027e"+
		"\u0283\5n8\2\u027f\u0283\5p9\2\u0280\u0283\5\u00e0q\2\u0281\u0283\5j\66"+
		"\2\u0282\u027c\3\2\2\2\u0282\u027d\3\2\2\2\u0282\u027e\3\2\2\2\u0282\u027f"+
		"\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283g\3\2\2\2\u0284"+
		"\u0285\7b\2\2\u0285\u0286\5\u00e4s\2\u0286\u0287\7\20\2\2\u0287i\3\2\2"+
		"\2\u0288\u0289\7\3\2\2\u0289k\3\2\2\2\u028a\u028d\5~@\2\u028b\u028d\5"+
		"|?\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028dm\3\2\2\2\u028e\u028f"+
		"\t\6\2\2\u028fo\3\2\2\2\u0290\u0291\7B\2\2\u0291\u0292\5r:\2\u0292\u0293"+
		"\5t;\2\u0293\u0296\7^\2\2\u0294\u0295\7\65\2\2\u0295\u0297\5\u00e2r\2"+
		"\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297q\3\2\2\2\u0298\u029d\5"+
		"\u00e4s\2\u0299\u029d\5*\26\2\u029a\u029d\7R\2\2\u029b\u029d\5p9\2\u029c"+
		"\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2"+
		"\2\2\u029ds\3\2\2\2\u029e\u02a5\5L\'\2\u029f\u02a1\5v<\2\u02a0\u029f\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a5\3\2\2\2\u02a4\u029e\3\2\2\2\u02a4\u02a0\3\2\2\2\u02a5u\3\2\2\2"+
		"\u02a6\u02a8\5L\'\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02aa\7a\2\2\u02aa\u02ab\5\u00e4s\2\u02abw\3\2\2\2\u02ac"+
		"\u02ad\7L\2\2\u02ad\u02ae\7b\2\2\u02ae\u02af\5z>\2\u02af\u02b0\7\20\2"+
		"\2\u02b0y\3\2\2\2\u02b1\u02bb\5L\'\2\u02b2\u02b4\5L\'\2\u02b3\u02b2\3"+
		"\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7a\2\2\u02b6"+
		"\u02b3\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8\u02b9\3\2"+
		"\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b1\3\2\2\2\u02ba\u02b6\3\2\2\2\u02bb"+
		"{\3\2\2\2\u02bc\u02bd\7M\2\2\u02bd\u02be\7b\2\2\u02be\u02bf\5\60\31\2"+
		"\u02bf\u02c0\7\20\2\2\u02c0}\3\2\2\2\u02c1\u02c2\7\30\2\2\u02c2\u02c3"+
		"\7b\2\2\u02c3\u02c4\5\u00bc_\2\u02c4\u02c5\7\20\2\2\u02c5\177\3\2\2\2"+
		"\u02c6\u02c7\5\u00b0Y\2\u02c7\u0081\3\2\2\2\u02c8\u02c9\7\21\2\2\u02c9"+
		"\u0083\3\2\2\2\u02ca\u02cb\7W\2\2\u02cb\u02cc\7b\2\2\u02cc\u02cd\5\u0080"+
		"A\2\u02cd\u02ce\7\20\2\2\u02ce\u02cf\5\u00c6d\2\u02cf\u0085\3\2\2\2\u02d0"+
		"\u02d1\7#\2\2\u02d1\u02d2\5\u00c6d\2\u02d2\u0087\3\2\2\2\u02d3\u02d4\7"+
		"@\2\2\u02d4\u02d5\7b\2\2\u02d5\u02d6\7w\2\2\u02d6\u02d7\7\20\2\2\u02d7"+
		"\u0089\3\2\2\2\u02d8\u02d9\5\u0082B\2\u02d9\u02db\5\u0084C\2\u02da\u02dc"+
		"\5\u0086D\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u008b\3\2\2"+
		"\2\u02dd\u02de\7\6\2\2\u02de\u02df\7b\2\2\u02df\u02e0\7w\2\2\u02e0\u02e1"+
		"\7\20\2\2\u02e1\u02e2\5\u00c6d\2\u02e2\u008d\3\2\2\2\u02e3\u02e5\5\u0094"+
		"K\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\5\u00b0Y\2\u02e7\u02e8\5\u00ccg\2\u02e8\u008f\3\2\2\2\u02e9\u02eb"+
		"\5\u0094K\2\u02ea\u02ec\5\u009aN\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u0091\3\2\2\2\u02ed\u02ee\5\u0090I\2\u02ee\u02ef\7p\2\2\u02ef"+
		"\u0093\3\2\2\2\u02f0\u02f2\5\u0096L\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u0095\3\2\2\2\u02f5"+
		"\u02f9\5\u0098M\2\u02f6\u02f9\5V,\2\u02f7\u02f9\5`\61\2\u02f8\u02f5\3"+
		"\2\2\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u0097\3\2\2\2\u02fa"+
		"\u0300\7\r\2\2\u02fb\u0300\7\4\2\2\u02fc\u0300\7g\2\2\u02fd\u0300\7\64"+
		"\2\2\u02fe\u0300\7o\2\2\u02ff\u02fa\3\2\2\2\u02ff\u02fb\3\2\2\2\u02ff"+
		"\u02fc\3\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0099\3\2"+
		"\2\2\u0301\u0306\5\u009cO\2\u0302\u0303\7!\2\2\u0303\u0305\5\u009cO\2"+
		"\u0304\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u009b\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030c\5\u00b0Y"+
		"\2\u030a\u030b\7X\2\2\u030b\u030d\5\u00ba^\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u009d\3\2\2\2\u030e\u031b\t\7\2\2\u030f\u031c\7w"+
		"\2\2\u0310\u0312\7w\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0315\7e\2\2\u0314\u0316\5\u00a0Q\2\u0315\u0314\3"+
		"\2\2\2\u0316\u0317\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\7\t\2\2\u031a\u031c\3\2\2\2\u031b\u030f\3\2"+
		"\2\2\u031b\u0311\3\2\2\2\u031c\u009f\3\2\2\2\u031d\u031e\5\u00a2R\2\u031e"+
		"\u031f\5\u00a6T\2\u031f\u0320\7p\2\2\u0320\u00a1\3\2\2\2\u0321\u0323\5"+
		"\u00a4S\2\u0322\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2"+
		"\u0324\u0325\3\2\2\2\u0325\u00a3\3\2\2\2\u0326\u0329\5V,\2\u0327\u0329"+
		"\5`\61\2\u0328\u0326\3\2\2\2\u0328\u0327\3\2\2\2\u0329\u00a5\3\2\2\2\u032a"+
		"\u032f\5\u00a8U\2\u032b\u032c\7!\2\2\u032c\u032e\5\u00a8U\2\u032d\u032b"+
		"\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u00a7\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0339\5\u00b0Y\2\u0333\u0335"+
		"\5\u00b0Y\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2"+
		"\2\u0336\u0337\7a\2\2\u0337\u0339\5\u011c\u008f\2\u0338\u0332\3\2\2\2"+
		"\u0338\u0334\3\2\2\2\u0339\u00a9\3\2\2\2\u033a\u0347\7[\2\2\u033b\u0340"+
		"\5\u011a\u008e\2\u033c\u033d\7e\2\2\u033d\u033e\5\u00acW\2\u033e\u033f"+
		"\7\t\2\2\u033f\u0341\3\2\2\2\u0340\u033c\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0348\3\2\2\2\u0342\u0343\7e\2\2\u0343\u0344\5\u00acW\2\u0344\u0345\7"+
		"\t\2\2\u0345\u0346\5\u011a\u008e\2\u0346\u0348\3\2\2\2\u0347\u033b\3\2"+
		"\2\2\u0347\u0342\3\2\2\2\u0348\u00ab\3\2\2\2\u0349\u034e\5\u00aeX\2\u034a"+
		"\u034b\7!\2\2\u034b\u034d\5\u00aeX\2\u034c\u034a\3\2\2\2\u034d\u0350\3"+
		"\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u00ad\3\2\2\2\u0350"+
		"\u034e\3\2\2\2\u0351\u0354\5\u011a\u008e\2\u0352\u0353\7X\2\2\u0353\u0355"+
		"\5\u00ecw\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u00af\3\2\2"+
		"\2\u0356\u035a\7\5\2\2\u0357\u0359\5`\61\2\u0358\u0357\3\2\2\2\u0359\u035c"+
		"\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035d\u0360\5\u00b0Y\2\u035e\u0360\5\u00b2Z\2\u035f\u0356"+
		"\3\2\2\2\u035f\u035e\3\2\2\2\u0360\u00b1\3\2\2\2\u0361\u0365\5\u011a\u008e"+
		"\2\u0362\u0364\5\u00b4[\2\u0363\u0362\3\2\2\2\u0364\u0367\3\2\2\2\u0365"+
		"\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0372\3\2\2\2\u0367\u0365\3\2"+
		"\2\2\u0368\u0369\7b\2\2\u0369\u036a\5\u00b0Y\2\u036a\u036e\7\20\2\2\u036b"+
		"\u036d\5\u00b4[\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c"+
		"\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0371"+
		"\u0361\3\2\2\2\u0371\u0368\3\2\2\2\u0372\u00b3\3\2\2\2\u0373\u0375\7B"+
		"\2\2\u0374\u0376\5\u00ecw\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u037e\7^\2\2\u0378\u037a\7b\2\2\u0379\u037b\5\u00b6"+
		"\\\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037e\7\20\2\2\u037d\u0373\3\2\2\2\u037d\u0378\3\2\2\2\u037e\u00b5\3"+
		"\2\2\2\u037f\u0382\5\u00c2b\2\u0380\u0381\7!\2\2\u0381\u0383\7,\2\2\u0382"+
		"\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u00b7\3\2\2\2\u0384\u0389\5\u0094"+
		"K\2\u0385\u0387\5\u00b0Y\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u038a\5\u00be`\2\u0389\u0386\3\2\2\2\u0389\u0388"+
		"\3\2\2\2\u038a\u00b9\3\2\2\2\u038b\u0398\5\u00e6t\2\u038c\u038d\7e\2\2"+
		"\u038d\u0392\5\u00ba^\2\u038e\u038f\7!\2\2\u038f\u0391\5\u00ba^\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2"+
		"\2\2\u0393\u0395\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\7\t\2\2\u0396"+
		"\u0398\3\2\2\2\u0397\u038b\3\2\2\2\u0397\u038c\3\2\2\2\u0398\u00bb\3\2"+
		"\2\2\u0399\u039a\5\u00a2R\2\u039a\u039b\5\u00be`\2\u039b\u00bd\3\2\2\2"+
		"\u039c\u03a0\7\5\2\2\u039d\u039f\5`\61\2\u039e\u039d\3\2\2\2\u039f\u03a2"+
		"\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a3\u03b7\5\u00be`\2\u03a4\u03a5\7b\2\2\u03a5\u03a6\5"+
		"\u00be`\2\u03a6\u03a8\7\20\2\2\u03a7\u03a9\5\u00c0a\2\u03a8\u03a7\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03b7\3\2\2\2\u03ac\u03ae\7B\2\2\u03ad\u03af\5\u00ecw\2\u03ae\u03ad\3"+
		"\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\7^\2\2\u03b1"+
		"\u03ac\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2"+
		"\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u039c\3\2\2\2\u03b6"+
		"\u03a4\3\2\2\2\u03b6\u03b1\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u00bf\3\2"+
		"\2\2\u03b8\u03ba\7B\2\2\u03b9\u03bb\5\u00ecw\2\u03ba\u03b9\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03c3\7^\2\2\u03bd\u03bf\7b\2"+
		"\2\u03be\u03c0\5\u00c2b\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c3\7\20\2\2\u03c2\u03b8\3\2\2\2\u03c2\u03bd\3"+
		"\2\2\2\u03c3\u00c1\3\2\2\2\u03c4\u03c9\5\u00b8]\2\u03c5\u03c6\7!\2\2\u03c6"+
		"\u03c8\5\u00b8]\2\u03c7\u03c5\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u00c3\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc"+
		"\u03ce\5\u00c6d\2\u03cd\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03cd"+
		"\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u00c5\3\2\2\2\u03d1\u03da\5\u00caf"+
		"\2\u03d2\u03da\5\u00c8e\2\u03d3\u03da\5\u00ccg\2\u03d4\u03da\5\u00d0i"+
		"\2\u03d5\u03da\5\u00dco\2\u03d6\u03da\5\u00d2j\2\u03d7\u03da\5\u00d4k"+
		"\2\u03d8\u03da\5\u00d6l\2\u03d9\u03d1\3\2\2\2\u03d9\u03d2\3\2\2\2\u03d9"+
		"\u03d3\3\2\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d5\3\2\2\2\u03d9\u03d6\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u00c7\3\2\2\2\u03db"+
		"\u03dc\5\u00e4s\2\u03dc\u03dd\7p\2\2\u03dd\u03e0\3\2\2\2\u03de\u03e0\7"+
		"p\2\2\u03df\u03db\3\2\2\2\u03df\u03de\3\2\2\2\u03e0\u00c9\3\2\2\2\u03e1"+
		"\u03e2\5\u011a\u008e\2\u03e2\u03e3\7a\2\2\u03e3\u03e4\5\u00c6d\2\u03e4"+
		"\u03ee\3\2\2\2\u03e5\u03e6\7N\2\2\u03e6\u03e7\5\u00ecw\2\u03e7\u03e8\7"+
		"a\2\2\u03e8\u03e9\5\u00c6d\2\u03e9\u03ee\3\2\2\2\u03ea\u03eb\7_\2\2\u03eb"+
		"\u03ec\7a\2\2\u03ec\u03ee\5\u00c6d\2\u03ed\u03e1\3\2\2\2\u03ed\u03e5\3"+
		"\2\2\2\u03ed\u03ea\3\2\2\2\u03ee\u00cb\3\2\2\2\u03ef\u03f3\7e\2\2\u03f0"+
		"\u03f2\5\u00ceh\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1"+
		"\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6"+
		"\u03f7\7\t\2\2\u03f7\u00cd\3\2\2\2\u03f8\u03fb\5\u0092J\2\u03f9\u03fb"+
		"\5\u00c4c\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3\2\2\2\u03fb\u00cf\3\2\2"+
		"\2\u03fc\u03fd\7%\2\2\u03fd\u03fe\7b\2\2\u03fe\u03ff\5\u00e4s\2\u03ff"+
		"\u0400\7\20\2\2\u0400\u0403\5\u00c6d\2\u0401\u0402\7\60\2\2\u0402\u0404"+
		"\5\u00c6d\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u040c\3\2\2"+
		"\2\u0405\u0406\7<\2\2\u0406\u0407\7b\2\2\u0407\u0408\5\u00e4s\2\u0408"+
		"\u0409\7\20\2\2\u0409\u040a\5\u00c6d\2\u040a\u040c\3\2\2\2\u040b\u03fc"+
		"\3\2\2\2\u040b\u0405\3\2\2\2\u040c\u00d1\3\2\2\2\u040d\u040e\7\"\2\2\u040e"+
		"\u040f\7b\2\2\u040f\u0410\5\u00e4s\2\u0410\u0411\7\20\2\2\u0411\u0412"+
		"\5\u00c6d\2\u0412\u00d3\3\2\2\2\u0413\u0414\7m\2\2\u0414\u0415\7b\2\2"+
		"\u0415\u0416\5\u00d8m\2\u0416\u0417\5\u00c6d\2\u0417\u00d5\3\2\2\2\u0418"+
		"\u0419\7\f\2\2\u0419\u041a\5\u00c6d\2\u041a\u041b\7\"\2\2\u041b\u041c"+
		"\7b\2\2\u041c\u041d\5\u00e4s\2\u041d\u041e\7\20\2\2\u041e\u041f\7p\2\2"+
		"\u041f\u00d7\3\2\2\2\u0420\u0421\5\u00e4s\2\u0421\u0423\7p\2\2\u0422\u0424"+
		"\5\u00e4s\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\3\2\2"+
		"\2\u0425\u0427\7p\2\2\u0426\u0428\5\u00e4s\2\u0427\u0426\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7\20\2\2\u042a\u0438\3"+
		"\2\2\2\u042b\u042d\7p\2\2\u042c\u042e\5\u00e4s\2\u042d\u042c\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0431\7p\2\2\u0430\u0432\5\u00e4"+
		"s\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0438\7\20\2\2\u0434\u0435\5\u0090I\2\u0435\u0436\5\u00dan\2\u0436\u0438"+
		"\3\2\2\2\u0437\u0420\3\2\2\2\u0437\u042b\3\2\2\2\u0437\u0434\3\2\2\2\u0438"+
		"\u00d9\3\2\2\2\u0439\u043b\7p\2\2\u043a\u043c\5\u00e4s\2\u043b\u043a\3"+
		"\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043f\7p\2\2\u043e"+
		"\u0440\5\u00e4s\2\u043f\u043e\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441"+
		"\3\2\2\2\u0441\u0447\7\20\2\2\u0442\u0443\7 \2\2\u0443\u0444\5\u00e4s"+
		"\2\u0444\u0445\7\20\2\2\u0445\u0447\3\2\2\2\u0446\u0439\3\2\2\2\u0446"+
		"\u0442\3\2\2\2\u0447\u00db\3\2\2\2\u0448\u0449\7\24\2\2\u0449\u044a\5"+
		"\u011a\u008e\2\u044a\u044b\7p\2\2\u044b\u0456\3\2\2\2\u044c\u044d\7G\2"+
		"\2\u044d\u0456\7p\2\2\u044e\u044f\7-\2\2\u044f\u0456\7p\2\2\u0450\u0452"+
		"\7n\2\2\u0451\u0453\5\u00e4s\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2"+
		"\u0453\u0454\3\2\2\2\u0454\u0456\7p\2\2\u0455\u0448\3\2\2\2\u0455\u044c"+
		"\3\2\2\2\u0455\u044e\3\2\2\2\u0455\u0450\3\2\2\2\u0456\u00dd\3\2\2\2\u0457"+
		"\u0458\5\u00e2r\2\u0458\u0459\7X\2\2\u0459\u045a\5\u00e4s\2\u045a\u00df"+
		"\3\2\2\2\u045b\u045c\5\u00e2r\2\u045c\u00e1\3\2\2\2\u045d\u045e\7v\2\2"+
		"\u045e\u00e3\3\2\2\2\u045f\u0464\5\u00e6t\2\u0460\u0461\7!\2\2\u0461\u0463"+
		"\5\u00e6t\2\u0462\u0460\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2\2"+
		"\2\u0464\u0465\3\2\2\2\u0465\u00e5\3\2\2\2\u0466\u0464\3\2\2\2\u0467\u046b"+
		"\5\u00eav\2\u0468\u0469\5\u00e8u\2\u0469\u046a\5\u00e6t\2\u046a\u046c"+
		"\3\2\2\2\u046b\u0468\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u00e7\3\2\2\2\u046d"+
		"\u046e\t\b\2\2\u046e\u00e9\3\2\2\2\u046f\u0475\5\u00eex\2\u0470\u0471"+
		"\7\'\2\2\u0471\u0472\5\u00eex\2\u0472\u0473\7a\2\2\u0473\u0474\5\u00ee"+
		"x\2\u0474\u0476\3\2\2\2\u0475\u0470\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u00eb\3\2\2\2\u0477\u0478\5\u00eav\2\u0478\u00ed\3\2\2\2\u0479\u047e"+
		"\5\u00f0y\2\u047a\u047b\78\2\2\u047b\u047d\5\u00f0y\2\u047c\u047a\3\2"+
		"\2\2\u047d\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u00ef\3\2\2\2\u0480\u047e\3\2\2\2\u0481\u0486\5\u00f2z\2\u0482\u0483"+
		"\7\67\2\2\u0483\u0485\5\u00f2z\2\u0484\u0482\3\2\2\2\u0485\u0488\3\2\2"+
		"\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u00f1\3\2\2\2\u0488\u0486"+
		"\3\2\2\2\u0489\u048e\5\u00f4{\2\u048a\u048b\7\31\2\2\u048b\u048d\5\u00f4"+
		"{\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2\2\2\u048e"+
		"\u048f\3\2\2\2\u048f\u00f3\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u0496\5\u00f6"+
		"|\2\u0492\u0493\7j\2\2\u0493\u0495\5\u00f6|\2\u0494\u0492\3\2\2\2\u0495"+
		"\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u00f5\3\2"+
		"\2\2\u0498\u0496\3\2\2\2\u0499\u049e\5\u00f8}\2\u049a\u049b\7A\2\2\u049b"+
		"\u049d\5\u00f8}\2\u049c\u049a\3\2\2\2\u049d\u04a0\3\2\2\2\u049e\u049c"+
		"\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u00f7\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1"+
		"\u04a7\5\u00fc\177\2\u04a2\u04a3\5\u00fa~\2\u04a3\u04a4\5\u00fc\177\2"+
		"\u04a4\u04a6\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5"+
		"\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u00f9\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa"+
		"\u04ab\t\t\2\2\u04ab\u00fb\3\2\2\2\u04ac\u04b2\5\u0100\u0081\2\u04ad\u04ae"+
		"\5\u00fe\u0080\2\u04ae\u04af\5\u0100\u0081\2\u04af\u04b1\3\2\2\2\u04b0"+
		"\u04ad\3\2\2\2\u04b1\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2"+
		"\2\2\u04b3\u00fd\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b6\t\n\2\2\u04b6"+
		"\u00ff\3\2\2\2\u04b7\u04bd\5\u0104\u0083\2\u04b8\u04b9\5\u0102\u0082\2"+
		"\u04b9\u04ba\5\u0104\u0083\2\u04ba\u04bc\3\2\2\2\u04bb\u04b8\3\2\2\2\u04bc"+
		"\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u0101\3\2"+
		"\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c1\t\13\2\2\u04c1\u0103\3\2\2\2\u04c2"+
		"\u04c8\5\u0108\u0085\2\u04c3\u04c4\5\u0106\u0084\2\u04c4\u04c5\5\u0108"+
		"\u0085\2\u04c5\u04c7\3\2\2\2\u04c6\u04c3\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8"+
		"\u04c6\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u0105\3\2\2\2\u04ca\u04c8\3\2"+
		"\2\2\u04cb\u04cc\t\f\2\2\u04cc\u0107\3\2\2\2\u04cd\u04d3\5\u010c\u0087"+
		"\2\u04ce\u04cf\5\u010a\u0086\2\u04cf\u04d0\5\u010c\u0087\2\u04d0\u04d2"+
		"\3\2\2\2\u04d1\u04ce\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d3"+
		"\u04d4\3\2\2\2\u04d4\u0109\3\2\2\2\u04d5\u04d3\3\2\2\2\u04d6\u04d7\t\r"+
		"\2\2\u04d7\u010b\3\2\2\2\u04d8\u04d9\7b\2\2\u04d9\u04da\5\u00bc_\2\u04da"+
		"\u04db\7\20\2\2\u04db\u04dc\5\u010c\u0087\2\u04dc\u04e0\3\2\2\2\u04dd"+
		"\u04e0\5\u010e\u0088\2\u04de\u04e0\5p9\2\u04df\u04d8\3\2\2\2\u04df\u04dd"+
		"\3\2\2\2\u04df\u04de\3\2\2\2\u04e0\u010d\3\2\2\2\u04e1\u04f2\5\u0112\u008a"+
		"\2\u04e2\u04e3\7\63\2\2\u04e3\u04f2\5\u010e\u0088\2\u04e4\u04e5\7F\2\2"+
		"\u04e5\u04f2\5\u010e\u0088\2\u04e6\u04e7\5\u0110\u0089\2\u04e7\u04e8\5"+
		"\u010c\u0087\2\u04e8\u04f2\3\2\2\2\u04e9\u04ef\7\34\2\2\u04ea\u04eb\7"+
		"b\2\2\u04eb\u04ec\5\u00bc_\2\u04ec\u04ed\7\20\2\2\u04ed\u04f0\3\2\2\2"+
		"\u04ee\u04f0\5\u010e\u0088\2\u04ef\u04ea\3\2\2\2\u04ef\u04ee\3\2\2\2\u04f0"+
		"\u04f2\3\2\2\2\u04f1\u04e1\3\2\2\2\u04f1\u04e2\3\2\2\2\u04f1\u04e4\3\2"+
		"\2\2\u04f1\u04e6\3\2\2\2\u04f1\u04e9\3\2\2\2\u04f2\u010f\3\2\2\2\u04f3"+
		"\u04f4\t\16\2\2\u04f4\u0111\3\2\2\2\u04f5\u04f9\5d\63\2\u04f6\u04f8\5"+
		"\u0114\u008b\2\u04f7\u04f6\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04f7\3\2"+
		"\2\2\u04f9\u04fa\3\2\2\2\u04fa\u0113\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fc"+
		"\u04fd\7B\2\2\u04fd\u04fe\5\u00e4s\2\u04fe\u04ff\7^\2\2\u04ff\u050c\3"+
		"\2\2\2\u0500\u0502\7b\2\2\u0501\u0503\5\u0118\u008d\2\u0502\u0501\3\2"+
		"\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u050c\7\20\2\2\u0505"+
		"\u0506\7\65\2\2\u0506\u050c\5\u011a\u008e\2\u0507\u0508\7T\2\2\u0508\u050c"+
		"\5\u011a\u008e\2\u0509\u050c\7\63\2\2\u050a\u050c\7F\2\2\u050b\u04fc\3"+
		"\2\2\2\u050b\u0500\3\2\2\2\u050b\u0505\3\2\2\2\u050b\u0507\3\2\2\2\u050b"+
		"\u0509\3\2\2\2\u050b\u050a\3\2\2\2\u050c\u0115\3\2\2\2\u050d\u050e\t\17"+
		"\2\2\u050e\u0117\3\2\2\2\u050f\u0514\5\u00e6t\2\u0510\u0511\7!\2\2\u0511"+
		"\u0513\5\u00e6t\2\u0512\u0510\3\2\2\2\u0513\u0516\3\2\2\2\u0514\u0512"+
		"\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0119\3\2\2\2\u0516\u0514\3\2\2\2\u0517"+
		"\u0518\7w\2\2\u0518\u011b\3\2\2\2\u0519\u051a\t\20\2\2\u051a\u011d\3\2"+
		"\2\2\u008d\u0121\u0130\u013e\u014a\u014d\u0150\u0153\u015b\u015f\u0162"+
		"\u016a\u016d\u0177\u017e\u0181\u0184\u0197\u01a3\u01a8\u01b5\u01c0\u01ce"+
		"\u01d7\u01df\u01e9\u01ee\u01f6\u01f8\u0201\u0209\u0210\u0219\u021d\u0225"+
		"\u0228\u022a\u022d\u0233\u023a\u0248\u024f\u0256\u025a\u025e\u0262\u0265"+
		"\u026c\u0273\u027a\u0282\u028c\u0296\u029c\u02a2\u02a4\u02a7\u02b3\u02b8"+
		"\u02ba\u02db\u02e4\u02eb\u02f3\u02f8\u02ff\u0306\u030c\u0311\u0317\u031b"+
		"\u0324\u0328\u032f\u0334\u0338\u0340\u0347\u034e\u0354\u035a\u035f\u0365"+
		"\u036e\u0371\u0375\u037a\u037d\u0382\u0386\u0389\u0392\u0397\u03a0\u03aa"+
		"\u03ae\u03b3\u03b6\u03ba\u03bf\u03c2\u03c9\u03cf\u03d9\u03df\u03ed\u03f3"+
		"\u03fa\u0403\u040b\u0423\u0427\u042d\u0431\u0437\u043b\u043f\u0446\u0452"+
		"\u0455\u0464\u046b\u0475\u047e\u0486\u048e\u0496\u049e\u04a7\u04b2\u04bd"+
		"\u04c8\u04d3\u04df\u04ef\u04f1\u04f9\u0502\u050b\u0514";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}