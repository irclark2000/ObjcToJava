// Generated from ObjC.g4 by ANTLR 4.0
package com.gmail.irclark2000.objc.parser;
import org.antlr.v4.runtime.tree.*;

public interface ObjCListener extends ParseTreeListener {
	void enterSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);
	void exitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);

	void enterTry_statement(ObjCParser.Try_statementContext ctx);
	void exitTry_statement(ObjCParser.Try_statementContext ctx);

	void enterDeclarator(ObjCParser.DeclaratorContext ctx);
	void exitDeclarator(ObjCParser.DeclaratorContext ctx);

	void enterProperty_implementation(ObjCParser.Property_implementationContext ctx);
	void exitProperty_implementation(ObjCParser.Property_implementationContext ctx);

	void enterReceiver(ObjCParser.ReceiverContext ctx);
	void exitReceiver(ObjCParser.ReceiverContext ctx);

	void enterException_declarator(ObjCParser.Exception_declaratorContext ctx);
	void exitException_declarator(ObjCParser.Exception_declaratorContext ctx);

	void enterRelational_op(ObjCParser.Relational_opContext ctx);
	void exitRelational_op(ObjCParser.Relational_opContext ctx);

	void enterArgpost(ObjCParser.ArgpostContext ctx);
	void exitArgpost(ObjCParser.ArgpostContext ctx);

	void enterCompound_statement(ObjCParser.Compound_statementContext ctx);
	void exitCompound_statement(ObjCParser.Compound_statementContext ctx);

	void enterMessage_expression(ObjCParser.Message_expressionContext ctx);
	void exitMessage_expression(ObjCParser.Message_expressionContext ctx);

	void enterDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx);
	void exitDeclaration_specifier(ObjCParser.Declaration_specifierContext ctx);

	void enterCast_expression(ObjCParser.Cast_expressionContext ctx);
	void exitCast_expression(ObjCParser.Cast_expressionContext ctx);

	void enterEquality_expression(ObjCParser.Equality_expressionContext ctx);
	void exitEquality_expression(ObjCParser.Equality_expressionContext ctx);

	void enterCastunary(ObjCParser.CastunaryContext ctx);
	void exitCastunary(ObjCParser.CastunaryContext ctx);

	void enterClass_interface(ObjCParser.Class_interfaceContext ctx);
	void exitClass_interface(ObjCParser.Class_interfaceContext ctx);

	void enterFunction_definition(ObjCParser.Function_definitionContext ctx);
	void exitFunction_definition(ObjCParser.Function_definitionContext ctx);

	void enterFor_complete(ObjCParser.For_completeContext ctx);
	void exitFor_complete(ObjCParser.For_completeContext ctx);

	void enterForcomplete1(ObjCParser.Forcomplete1Context ctx);
	void exitForcomplete1(ObjCParser.Forcomplete1Context ctx);

	void enterTranslation_unit(ObjCParser.Translation_unitContext ctx);
	void exitTranslation_unit(ObjCParser.Translation_unitContext ctx);

	void enterAdecNone(ObjCParser.AdecNoneContext ctx);
	void exitAdecNone(ObjCParser.AdecNoneContext ctx);

	void enterProtocol_list(ObjCParser.Protocol_listContext ctx);
	void exitProtocol_list(ObjCParser.Protocol_listContext ctx);

	void enterLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);
	void exitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);

	void enterParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx);
	void exitParenthetical_expression(ObjCParser.Parenthetical_expressionContext ctx);

	void enterShift_expression(ObjCParser.Shift_expressionContext ctx);
	void exitShift_expression(ObjCParser.Shift_expressionContext ctx);

	void enterMethod_declaration(ObjCParser.Method_declarationContext ctx);
	void exitMethod_declaration(ObjCParser.Method_declarationContext ctx);

	void enterType_name(ObjCParser.Type_nameContext ctx);
	void exitType_name(ObjCParser.Type_nameContext ctx);

	void enterIngoreTypeSpec(ObjCParser.IngoreTypeSpecContext ctx);
	void exitIngoreTypeSpec(ObjCParser.IngoreTypeSpecContext ctx);

	void enterMethod_definition(ObjCParser.Method_definitionContext ctx);
	void exitMethod_definition(ObjCParser.Method_definitionContext ctx);

	void enterForcomplete2(ObjCParser.Forcomplete2Context ctx);
	void exitForcomplete2(ObjCParser.Forcomplete2Context ctx);

	void enterComment(ObjCParser.CommentContext ctx);
	void exitComment(ObjCParser.CommentContext ctx);

	void enterParameter_list(ObjCParser.Parameter_listContext ctx);
	void exitParameter_list(ObjCParser.Parameter_listContext ctx);

	void enterInstance_decl(ObjCParser.Instance_declContext ctx);
	void exitInstance_decl(ObjCParser.Instance_declContext ctx);

	void enterEncode_expression(ObjCParser.Encode_expressionContext ctx);
	void exitEncode_expression(ObjCParser.Encode_expressionContext ctx);

	void enterInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);
	void exitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);

	void enterConstant_expression(ObjCParser.Constant_expressionContext ctx);
	void exitConstant_expression(ObjCParser.Constant_expressionContext ctx);

	void enterSwitch(ObjCParser.SwitchContext ctx);
	void exitSwitch(ObjCParser.SwitchContext ctx);

	void enterRelational_expression(ObjCParser.Relational_expressionContext ctx);
	void exitRelational_expression(ObjCParser.Relational_expressionContext ctx);

	void enterClass_name(ObjCParser.Class_nameContext ctx);
	void exitClass_name(ObjCParser.Class_nameContext ctx);

	void enterSizeofunary(ObjCParser.SizeofunaryContext ctx);
	void exitSizeofunary(ObjCParser.SizeofunaryContext ctx);

	void enterDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);
	void exitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);

	void enterParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);
	void exitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);

	void enterPostfix_expression(ObjCParser.Postfix_expressionContext ctx);
	void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx);

	void enterKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);
	void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);

	void enterSimple_expression(ObjCParser.Simple_expressionContext ctx);
	void exitSimple_expression(ObjCParser.Simple_expressionContext ctx);

	void enterMessage_selector(ObjCParser.Message_selectorContext ctx);
	void exitMessage_selector(ObjCParser.Message_selectorContext ctx);

	void enterStaticStoreClass(ObjCParser.StaticStoreClassContext ctx);
	void exitStaticStoreClass(ObjCParser.StaticStoreClassContext ctx);

	void enterProperty_declaration(ObjCParser.Property_declarationContext ctx);
	void exitProperty_declaration(ObjCParser.Property_declarationContext ctx);

	void enterPfixunary(ObjCParser.PfixunaryContext ctx);
	void exitPfixunary(ObjCParser.PfixunaryContext ctx);

	void enterPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);
	void exitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);

	void enterSelf_expression(ObjCParser.Self_expressionContext ctx);
	void exitSelf_expression(ObjCParser.Self_expressionContext ctx);

	void enterInstance_sidecl(ObjCParser.Instance_sideclContext ctx);
	void exitInstance_sidecl(ObjCParser.Instance_sideclContext ctx);

	void enterProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);
	void exitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);

	void enterSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx);
	void exitSpecifier_qualifier(ObjCParser.Specifier_qualifierContext ctx);

	void enterSimple_unary(ObjCParser.Simple_unaryContext ctx);
	void exitSimple_unary(ObjCParser.Simple_unaryContext ctx);

	void enterCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx);
	void exitCompound_statement_parts(ObjCParser.Compound_statement_partsContext ctx);

	void enterProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);
	void exitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);

	void enterFinally_statement(ObjCParser.Finally_statementContext ctx);
	void exitFinally_statement(ObjCParser.Finally_statementContext ctx);

	void enterTry_block(ObjCParser.Try_blockContext ctx);
	void exitTry_block(ObjCParser.Try_blockContext ctx);

	void enterClass_method_definition(ObjCParser.Class_method_definitionContext ctx);
	void exitClass_method_definition(ObjCParser.Class_method_definitionContext ctx);

	void enterProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);
	void exitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);

	void enterProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);
	void exitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);

	void enterSimplepost(ObjCParser.SimplepostContext ctx);
	void exitSimplepost(ObjCParser.SimplepostContext ctx);

	void enterConditional_expression(ObjCParser.Conditional_expressionContext ctx);
	void exitConditional_expression(ObjCParser.Conditional_expressionContext ctx);

	void enterClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);
	void exitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);

	void enterPrimary_expression(ObjCParser.Primary_expressionContext ctx);
	void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx);

	void enterKeyword_argument(ObjCParser.Keyword_argumentContext ctx);
	void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx);

	void enterDotidentifier(ObjCParser.DotidentifierContext ctx);
	void exitDotidentifier(ObjCParser.DotidentifierContext ctx);

	void enterSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);
	void exitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);

	void enterVisibility_specification(ObjCParser.Visibility_specificationContext ctx);
	void exitVisibility_specification(ObjCParser.Visibility_specificationContext ctx);

	void enterInitializer(ObjCParser.InitializerContext ctx);
	void exitInitializer(ObjCParser.InitializerContext ctx);

	void enterCategory_interface(ObjCParser.Category_interfaceContext ctx);
	void exitCategory_interface(ObjCParser.Category_interfaceContext ctx);

	void enterExpression(ObjCParser.ExpressionContext ctx);
	void exitExpression(ObjCParser.ExpressionContext ctx);

	void enterSelector(ObjCParser.SelectorContext ctx);
	void exitSelector(ObjCParser.SelectorContext ctx);

	void enterProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);
	void exitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);

	void enterProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);
	void exitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);

	void enterAssignment_expression(ObjCParser.Assignment_expressionContext ctx);
	void exitAssignment_expression(ObjCParser.Assignment_expressionContext ctx);

	void enterInstance_idecl(ObjCParser.Instance_ideclContext ctx);
	void exitInstance_idecl(ObjCParser.Instance_ideclContext ctx);

	void enterMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);
	void exitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);

	void enterProperty_attribute(ObjCParser.Property_attributeContext ctx);
	void exitProperty_attribute(ObjCParser.Property_attributeContext ctx);

	void enterJump_statement(ObjCParser.Jump_statementContext ctx);
	void exitJump_statement(ObjCParser.Jump_statementContext ctx);

	void enterUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx);
	void exitUnusual_type_specifier(ObjCParser.Unusual_type_specifierContext ctx);

	void enterInstance_sdecl(ObjCParser.Instance_sdeclContext ctx);
	void exitInstance_sdecl(ObjCParser.Instance_sdeclContext ctx);

	void enterInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);
	void exitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);

	void enterSetter_call(ObjCParser.Setter_callContext ctx);
	void exitSetter_call(ObjCParser.Setter_callContext ctx);

	void enterAdecRecurse(ObjCParser.AdecRecurseContext ctx);
	void exitAdecRecurse(ObjCParser.AdecRecurseContext ctx);

	void enterEnumerator(ObjCParser.EnumeratorContext ctx);
	void exitEnumerator(ObjCParser.EnumeratorContext ctx);

	void enterProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);
	void exitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);

	void enterStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);
	void exitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);

	void enterInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);
	void exitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);

	void enterStruct_declarator(ObjCParser.Struct_declaratorContext ctx);
	void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx);

	void enterIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx);
	void exitIgnoreTypeQualifier(ObjCParser.IgnoreTypeQualifierContext ctx);

	void enterProtocol_expression(ObjCParser.Protocol_expressionContext ctx);
	void exitProtocol_expression(ObjCParser.Protocol_expressionContext ctx);

	void enterAdecType(ObjCParser.AdecTypeContext ctx);
	void exitAdecType(ObjCParser.AdecTypeContext ctx);

	void enterClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);
	void exitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);

	void enterSelector_name(ObjCParser.Selector_nameContext ctx);
	void exitSelector_name(ObjCParser.Selector_nameContext ctx);

	void enterDeclaration(ObjCParser.DeclarationContext ctx);
	void exitDeclaration(ObjCParser.DeclarationContext ctx);

	void enterInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);
	void exitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);

	void enterInit_declarator(ObjCParser.Init_declaratorContext ctx);
	void exitInit_declarator(ObjCParser.Init_declaratorContext ctx);

	void enterStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);
	void exitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);

	void enterAdecConst(ObjCParser.AdecConstContext ctx);
	void exitAdecConst(ObjCParser.AdecConstContext ctx);

	void enterExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);
	void exitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);

	void enterEnumerator_list(ObjCParser.Enumerator_listContext ctx);
	void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx);

	void enterStatement(ObjCParser.StatementContext ctx);
	void exitStatement(ObjCParser.StatementContext ctx);

	void enterAdditive_expression(ObjCParser.Additive_expressionContext ctx);
	void exitAdditive_expression(ObjCParser.Additive_expressionContext ctx);

	void enterDefault(ObjCParser.DefaultContext ctx);
	void exitDefault(ObjCParser.DefaultContext ctx);

	void enterUnary_operator(ObjCParser.Unary_operatorContext ctx);
	void exitUnary_operator(ObjCParser.Unary_operatorContext ctx);

	void enterCategory_name(ObjCParser.Category_nameContext ctx);
	void exitCategory_name(ObjCParser.Category_nameContext ctx);

	void enterLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);
	void exitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);

	void enterUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx);
	void exitUnsupported_instruction(ObjCParser.Unsupported_instructionContext ctx);

	void enterCase(ObjCParser.CaseContext ctx);
	void exitCase(ObjCParser.CaseContext ctx);

	void enterIdTypeSpec(ObjCParser.IdTypeSpecContext ctx);
	void exitIdTypeSpec(ObjCParser.IdTypeSpecContext ctx);

	void enterThrow_statement(ObjCParser.Throw_statementContext ctx);
	void exitThrow_statement(ObjCParser.Throw_statementContext ctx);

	void enterIdentifier(ObjCParser.IdentifierContext ctx);
	void exitIdentifier(ObjCParser.IdentifierContext ctx);

	void enterEquality_op(ObjCParser.Equality_opContext ctx);
	void exitEquality_op(ObjCParser.Equality_opContext ctx);

	void enterArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);
	void exitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);

	void enterImplementation_definition(ObjCParser.Implementation_definitionContext ctx);
	void exitImplementation_definition(ObjCParser.Implementation_definitionContext ctx);

	void enterIterFor(ObjCParser.IterForContext ctx);
	void exitIterFor(ObjCParser.IterForContext ctx);

	void enterPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx);
	void exitPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx);

	void enterConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx);
	void exitConstTypeQualifier(ObjCParser.ConstTypeQualifierContext ctx);

	void enterClass_implementation(ObjCParser.Class_implementationContext ctx);
	void exitClass_implementation(ObjCParser.Class_implementationContext ctx);

	void enterClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx);
	void exitClassTypeSpec(ObjCParser.ClassTypeSpecContext ctx);

	void enterWhile_statement(ObjCParser.While_statementContext ctx);
	void exitWhile_statement(ObjCParser.While_statementContext ctx);

	void enterStruct_declaration(ObjCParser.Struct_declarationContext ctx);
	void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx);

	void enterEnum_specifier(ObjCParser.Enum_specifierContext ctx);
	void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx);

	void enterParameter_declaration(ObjCParser.Parameter_declarationContext ctx);
	void exitParameter_declaration(ObjCParser.Parameter_declarationContext ctx);

	void enterProtocol_requirement(ObjCParser.Protocol_requirementContext ctx);
	void exitProtocol_requirement(ObjCParser.Protocol_requirementContext ctx);

	void enterMethod_selector(ObjCParser.Method_selectorContext ctx);
	void exitMethod_selector(ObjCParser.Method_selectorContext ctx);

	void enterAssignment_operator(ObjCParser.Assignment_operatorContext ctx);
	void exitAssignment_operator(ObjCParser.Assignment_operatorContext ctx);

	void enterInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);
	void exitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);

	void enterShift_op(ObjCParser.Shift_opContext ctx);
	void exitShift_op(ObjCParser.Shift_opContext ctx);

	void enterMethod_type(ObjCParser.Method_typeContext ctx);
	void exitMethod_type(ObjCParser.Method_typeContext ctx);

	void enterProtocol_name(ObjCParser.Protocol_nameContext ctx);
	void exitProtocol_name(ObjCParser.Protocol_nameContext ctx);

	void enterDowhile(ObjCParser.DowhileContext ctx);
	void exitDowhile(ObjCParser.DowhileContext ctx);

	void enterCategory_implementation(ObjCParser.Category_implementationContext ctx);
	void exitCategory_implementation(ObjCParser.Category_implementationContext ctx);

	void enterDimpost(ObjCParser.DimpostContext ctx);
	void exitDimpost(ObjCParser.DimpostContext ctx);

	void enterSemi_statement(ObjCParser.Semi_statementContext ctx);
	void exitSemi_statement(ObjCParser.Semi_statementContext ctx);

	void enterIfstmt(ObjCParser.IfstmtContext ctx);
	void exitIfstmt(ObjCParser.IfstmtContext ctx);

	void enterConstant(ObjCParser.ConstantContext ctx);
	void exitConstant(ObjCParser.ConstantContext ctx);

	void enterLabelid(ObjCParser.LabelidContext ctx);
	void exitLabelid(ObjCParser.LabelidContext ctx);

	void enterStatement_list(ObjCParser.Statement_listContext ctx);
	void exitStatement_list(ObjCParser.Statement_listContext ctx);

	void enterExternal_declaration(ObjCParser.External_declarationContext ctx);
	void exitExternal_declaration(ObjCParser.External_declarationContext ctx);

	void enterMultiply_op(ObjCParser.Multiply_opContext ctx);
	void exitMultiply_op(ObjCParser.Multiply_opContext ctx);

	void enterAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);
	void exitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);

	void enterClass_list(ObjCParser.Class_listContext ctx);
	void exitClass_list(ObjCParser.Class_listContext ctx);

	void enterProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);
	void exitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);

	void enterDirect_declarator(ObjCParser.Direct_declaratorContext ctx);
	void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx);

	void enterImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);
	void exitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);

	void enterIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx);
	void exitIgnoreStoreClass(ObjCParser.IgnoreStoreClassContext ctx);

	void enterAnd_expression(ObjCParser.And_expressionContext ctx);
	void exitAnd_expression(ObjCParser.And_expressionContext ctx);

	void enterMacro_specification(ObjCParser.Macro_specificationContext ctx);
	void exitMacro_specification(ObjCParser.Macro_specificationContext ctx);

	void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx);
	void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx);

	void enterString_constant(ObjCParser.String_constantContext ctx);
	void exitString_constant(ObjCParser.String_constantContext ctx);

	void enterAdd_op(ObjCParser.Add_opContext ctx);
	void exitAdd_op(ObjCParser.Add_opContext ctx);

	void enterCatch_statement(ObjCParser.Catch_statementContext ctx);
	void exitCatch_statement(ObjCParser.Catch_statementContext ctx);

	void enterArrowpost(ObjCParser.ArrowpostContext ctx);
	void exitArrowpost(ObjCParser.ArrowpostContext ctx);

	void enterType_specifier(ObjCParser.Type_specifierContext ctx);
	void exitType_specifier(ObjCParser.Type_specifierContext ctx);

	void enterSelector_expression(ObjCParser.Selector_expressionContext ctx);
	void exitSelector_expression(ObjCParser.Selector_expressionContext ctx);

	void enterDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx);
	void exitDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx);

	void enterDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);
	void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);

	void enterSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx);
	void exitSimple_type_specifier(ObjCParser.Simple_type_specifierContext ctx);
}