// Generated from ObjC.g4 by ANTLR 4.0
package com.gmail.irclark2000.objc.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ObjCVisitor<T> extends ParseTreeVisitor<T> {
	T visitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);

	T visitTry_statement(ObjCParser.Try_statementContext ctx);

	T visitDeclarator(ObjCParser.DeclaratorContext ctx);

	T visitReceiver(ObjCParser.ReceiverContext ctx);

	T visitProperty_implementation(ObjCParser.Property_implementationContext ctx);

	T visitException_declarator(ObjCParser.Exception_declaratorContext ctx);

	T visitLabeled_statement(ObjCParser.Labeled_statementContext ctx);

	T visitMessage_expression(ObjCParser.Message_expressionContext ctx);

	T visitCompound_statement(ObjCParser.Compound_statementContext ctx);

	T visitCast_expression(ObjCParser.Cast_expressionContext ctx);

	T visitEquality_expression(ObjCParser.Equality_expressionContext ctx);

	T visitStorage_class_specifier(ObjCParser.Storage_class_specifierContext ctx);

	T visitClass_interface(ObjCParser.Class_interfaceContext ctx);

	T visitFunction_definition(ObjCParser.Function_definitionContext ctx);

	T visitFor_complete(ObjCParser.For_completeContext ctx);

	T visitForcomplete1(ObjCParser.Forcomplete1Context ctx);

	T visitTranslation_unit(ObjCParser.Translation_unitContext ctx);

	T visitType_qualifier(ObjCParser.Type_qualifierContext ctx);

	T visitProtocol_list(ObjCParser.Protocol_listContext ctx);

	T visitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);

	T visitShift_expression(ObjCParser.Shift_expressionContext ctx);

	T visitMethod_declaration(ObjCParser.Method_declarationContext ctx);

	T visitType_name(ObjCParser.Type_nameContext ctx);

	T visitMethod_definition(ObjCParser.Method_definitionContext ctx);

	T visitForcomplete2(ObjCParser.Forcomplete2Context ctx);

	T visitParameter_list(ObjCParser.Parameter_listContext ctx);

	T visitEncode_expression(ObjCParser.Encode_expressionContext ctx);

	T visitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);

	T visitConstant_expression(ObjCParser.Constant_expressionContext ctx);

	T visitRelational_expression(ObjCParser.Relational_expressionContext ctx);

	T visitClass_name(ObjCParser.Class_nameContext ctx);

	T visitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);

	T visitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);

	T visitPostfix_expression(ObjCParser.Postfix_expressionContext ctx);

	T visitMessage_selector(ObjCParser.Message_selectorContext ctx);

	T visitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);

	T visitProperty_declaration(ObjCParser.Property_declarationContext ctx);

	T visitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);

	T visitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);

	T visitSelection_statement(ObjCParser.Selection_statementContext ctx);

	T visitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);

	T visitFinally_statement(ObjCParser.Finally_statementContext ctx);

	T visitTry_block(ObjCParser.Try_blockContext ctx);

	T visitClass_method_definition(ObjCParser.Class_method_definitionContext ctx);

	T visitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);

	T visitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);

	T visitConditional_expression(ObjCParser.Conditional_expressionContext ctx);

	T visitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);

	T visitPrimary_expression(ObjCParser.Primary_expressionContext ctx);

	T visitKeyword_argument(ObjCParser.Keyword_argumentContext ctx);

	T visitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);

	T visitVisibility_specification(ObjCParser.Visibility_specificationContext ctx);

	T visitCategory_interface(ObjCParser.Category_interfaceContext ctx);

	T visitInitializer(ObjCParser.InitializerContext ctx);

	T visitSelector(ObjCParser.SelectorContext ctx);

	T visitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);

	T visitExpression(ObjCParser.ExpressionContext ctx);

	T visitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);

	T visitAssignment_expression(ObjCParser.Assignment_expressionContext ctx);

	T visitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);

	T visitProperty_attribute(ObjCParser.Property_attributeContext ctx);

	T visitJump_statement(ObjCParser.Jump_statementContext ctx);

	T visitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);

	T visitEnumerator(ObjCParser.EnumeratorContext ctx);

	T visitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);

	T visitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);

	T visitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);

	T visitStruct_declarator(ObjCParser.Struct_declaratorContext ctx);

	T visitProtocol_expression(ObjCParser.Protocol_expressionContext ctx);

	T visitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);

	T visitSelector_name(ObjCParser.Selector_nameContext ctx);

	T visitDeclaration(ObjCParser.DeclarationContext ctx);

	T visitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);

	T visitInit_declarator(ObjCParser.Init_declaratorContext ctx);

	T visitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);

	T visitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);

	T visitEnumerator_list(ObjCParser.Enumerator_listContext ctx);

	T visitStatement(ObjCParser.StatementContext ctx);

	T visitAdditive_expression(ObjCParser.Additive_expressionContext ctx);

	T visitUnary_operator(ObjCParser.Unary_operatorContext ctx);

	T visitCategory_name(ObjCParser.Category_nameContext ctx);

	T visitInstance_variables(ObjCParser.Instance_variablesContext ctx);

	T visitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);

	T visitIteration_statement(ObjCParser.Iteration_statementContext ctx);

	T visitThrow_statement(ObjCParser.Throw_statementContext ctx);

	T visitIdentifier(ObjCParser.IdentifierContext ctx);

	T visitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);

	T visitPrimitive_type_specifier(ObjCParser.Primitive_type_specifierContext ctx);

	T visitClass_implementation(ObjCParser.Class_implementationContext ctx);

	T visitStruct_declaration(ObjCParser.Struct_declarationContext ctx);

	T visitEnum_specifier(ObjCParser.Enum_specifierContext ctx);

	T visitParameter_declaration(ObjCParser.Parameter_declarationContext ctx);

	T visitMethod_selector(ObjCParser.Method_selectorContext ctx);

	T visitAssignment_operator(ObjCParser.Assignment_operatorContext ctx);

	T visitUnary_expression(ObjCParser.Unary_expressionContext ctx);

	T visitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);

	T visitMethod_type(ObjCParser.Method_typeContext ctx);

	T visitProtocol_name(ObjCParser.Protocol_nameContext ctx);

	T visitCategory_implementation(ObjCParser.Category_implementationContext ctx);

	T visitConstant(ObjCParser.ConstantContext ctx);

	T visitStatement_list(ObjCParser.Statement_listContext ctx);

	T visitAbstract_declarator(ObjCParser.Abstract_declaratorContext ctx);

	T visitExternal_declaration(ObjCParser.External_declarationContext ctx);

	T visitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);

	T visitClass_list(ObjCParser.Class_listContext ctx);

	T visitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);

	T visitDirect_declarator(ObjCParser.Direct_declaratorContext ctx);

	T visitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);

	T visitAnd_expression(ObjCParser.And_expressionContext ctx);

	T visitMacro_specification(ObjCParser.Macro_specificationContext ctx);

	T visitString_constant(ObjCParser.String_constantContext ctx);

	T visitSuperclass_name(ObjCParser.Superclass_nameContext ctx);

	T visitCatch_statement(ObjCParser.Catch_statementContext ctx);

	T visitType_specifier(ObjCParser.Type_specifierContext ctx);

	T visitSelector_expression(ObjCParser.Selector_expressionContext ctx);

	T visitDeclaration_minus_semi(ObjCParser.Declaration_minus_semiContext ctx);

	T visitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);
}