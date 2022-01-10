// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;

public interface C3Types {

  IElementType ADDITIVE_EXPRESSION = new C3ElementType("ADDITIVE_EXPRESSION");
  IElementType ADDITIVE_OP = new C3ElementType("ADDITIVE_OP");
  IElementType ARGUMENT_EXPRESSION_LIST = new C3ElementType("ARGUMENT_EXPRESSION_LIST");
  IElementType ASSIGNMENT_EXPRESSION = new C3ElementType("ASSIGNMENT_EXPRESSION");
  IElementType ASSIGNMENT_OP = new C3ElementType("ASSIGNMENT_OP");
  IElementType BASE_TYPE = new C3ElementType("BASE_TYPE");
  IElementType BIT_EXPRESSION = new C3ElementType("BIT_EXPRESSION");
  IElementType BIT_OP = new C3ElementType("BIT_OP");
  IElementType CATCH_STATEMENT = new C3ElementType("CATCH_STATEMENT");
  IElementType COMPOUND_STATEMENT = new C3ElementType("COMPOUND_STATEMENT");
  IElementType CONDITIONAL_COMPILATION = new C3ElementType("CONDITIONAL_COMPILATION");
  IElementType CONDITIONAL_EXPRESSION = new C3ElementType("CONDITIONAL_EXPRESSION");
  IElementType CONSTANT = new C3ElementType("CONSTANT");
  IElementType CONSTANT_EXPRESSION = new C3ElementType("CONSTANT_EXPRESSION");
  IElementType CONST_DECLARATION = new C3ElementType("CONST_DECLARATION");
  IElementType CT_CASE_STMT = new C3ElementType("CT_CASE_STMT");
  IElementType CT_ELIF = new C3ElementType("CT_ELIF");
  IElementType CT_ELIF_BODY = new C3ElementType("CT_ELIF_BODY");
  IElementType CT_ELSE_BODY = new C3ElementType("CT_ELSE_BODY");
  IElementType CT_FOR_STMT = new C3ElementType("CT_FOR_STMT");
  IElementType CT_IF = new C3ElementType("CT_IF");
  IElementType CT_STMT = new C3ElementType("CT_STMT");
  IElementType CT_SWITCH = new C3ElementType("CT_SWITCH");
  IElementType CT_SWITCH_BODY = new C3ElementType("CT_SWITCH_BODY");
  IElementType DECLARATION = new C3ElementType("DECLARATION");
  IElementType DECLARATION_STATEMENT = new C3ElementType("DECLARATION_STATEMENT");
  IElementType DECL_EXPR_LIST = new C3ElementType("DECL_EXPR_LIST");
  IElementType DEFER_CATCH_BODY = new C3ElementType("DEFER_CATCH_BODY");
  IElementType DEFER_STATEMENT = new C3ElementType("DEFER_STATEMENT");
  IElementType ENUMERATOR = new C3ElementType("ENUMERATOR");
  IElementType ENUMERATOR_LIST = new C3ElementType("ENUMERATOR_LIST");
  IElementType ENUM_DECLARATION = new C3ElementType("ENUM_DECLARATION");
  IElementType ERROR_DECLARATION = new C3ElementType("ERROR_DECLARATION");
  IElementType ERROR_EXPRESSION = new C3ElementType("ERROR_EXPRESSION");
  IElementType EXPRESSION = new C3ElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new C3ElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STATEMENT = new C3ElementType("EXPRESSION_STATEMENT");
  IElementType EXTERNAL_FUNC_DECLARATION = new C3ElementType("EXTERNAL_FUNC_DECLARATION");
  IElementType FAILABLE_TYPE = new C3ElementType("FAILABLE_TYPE");
  IElementType FLOAT_TYPE = new C3ElementType("FLOAT_TYPE");
  IElementType FOR_STATEMENT = new C3ElementType("FOR_STATEMENT");
  IElementType FUNC_DECLARATION = new C3ElementType("FUNC_DECLARATION");
  IElementType FUNC_DEFINITION = new C3ElementType("FUNC_DEFINITION");
  IElementType FUNC_TYPEDEF = new C3ElementType("FUNC_TYPEDEF");
  IElementType GLOBAL_DECLARATION = new C3ElementType("GLOBAL_DECLARATION");
  IElementType GROUPED_EXPRESSION = new C3ElementType("GROUPED_EXPRESSION");
  IElementType IDENTIFIER_LIST = new C3ElementType("IDENTIFIER_LIST");
  IElementType IDENT_EXPRESSION = new C3ElementType("IDENT_EXPRESSION");
  IElementType IMPORT_DECL = new C3ElementType("IMPORT_DECL");
  IElementType IMPORT_PATH = new C3ElementType("IMPORT_PATH");
  IElementType INITIALIZER = new C3ElementType("INITIALIZER");
  IElementType INITIALIZER_LIST = new C3ElementType("INITIALIZER_LIST");
  IElementType INTEGER_TYPE = new C3ElementType("INTEGER_TYPE");
  IElementType ITERATION_STATEMENT = new C3ElementType("ITERATION_STATEMENT");
  IElementType JUMP_STATEMENT = new C3ElementType("JUMP_STATEMENT");
  IElementType LABELLED_STATEMENT = new C3ElementType("LABELLED_STATEMENT");
  IElementType LOGICAL_EXPRESSION = new C3ElementType("LOGICAL_EXPRESSION");
  IElementType LOGICAL_OP = new C3ElementType("LOGICAL_OP");
  IElementType MACRO_ARGUMENT = new C3ElementType("MACRO_ARGUMENT");
  IElementType MACRO_ARGUMENT_LIST = new C3ElementType("MACRO_ARGUMENT_LIST");
  IElementType MACRO_DECLARATION = new C3ElementType("MACRO_DECLARATION");
  IElementType MODULE = new C3ElementType("MODULE");
  IElementType MODULE_PARAM = new C3ElementType("MODULE_PARAM");
  IElementType MODULE_PARAMS = new C3ElementType("MODULE_PARAMS");
  IElementType MULTIPLICATIVE_EXPRESSION = new C3ElementType("MULTIPLICATIVE_EXPRESSION");
  IElementType MULTIPLICATIVE_OP = new C3ElementType("MULTIPLICATIVE_OP");
  IElementType PARAMETER_LIST = new C3ElementType("PARAMETER_LIST");
  IElementType PARAMETER_TYPE_LIST = new C3ElementType("PARAMETER_TYPE_LIST");
  IElementType PARAM_DECLARATION = new C3ElementType("PARAM_DECLARATION");
  IElementType PATH = new C3ElementType("PATH");
  IElementType POSTFIX_EXPRESSION = new C3ElementType("POSTFIX_EXPRESSION");
  IElementType POSTFIX_OP = new C3ElementType("POSTFIX_OP");
  IElementType PRIMARY_EXPRESSION = new C3ElementType("PRIMARY_EXPRESSION");
  IElementType RELATIONAL_EXPRESSION = new C3ElementType("RELATIONAL_EXPRESSION");
  IElementType RELATIONAL_OP = new C3ElementType("RELATIONAL_OP");
  IElementType SELECTION_STATEMENT = new C3ElementType("SELECTION_STATEMENT");
  IElementType SHIFT_EXPRESSION = new C3ElementType("SHIFT_EXPRESSION");
  IElementType SHIFT_OP = new C3ElementType("SHIFT_OP");
  IElementType SPECIFIED_IMPORT = new C3ElementType("SPECIFIED_IMPORT");
  IElementType SPECIFIED_IMPORT_LIST = new C3ElementType("SPECIFIED_IMPORT_LIST");
  IElementType STATEMENT = new C3ElementType("STATEMENT");
  IElementType STATEMENT_LIST = new C3ElementType("STATEMENT_LIST");
  IElementType STRUCT_BODY = new C3ElementType("STRUCT_BODY");
  IElementType STRUCT_DECLARATION = new C3ElementType("STRUCT_DECLARATION");
  IElementType STRUCT_DECLARATION_LIST = new C3ElementType("STRUCT_DECLARATION_LIST");
  IElementType STRUCT_MEMBER_DECLARATION = new C3ElementType("STRUCT_MEMBER_DECLARATION");
  IElementType STRUCT_OR_UNION = new C3ElementType("STRUCT_OR_UNION");
  IElementType TL_CT_CASE = new C3ElementType("TL_CT_CASE");
  IElementType TL_CT_ELIF_BODY = new C3ElementType("TL_CT_ELIF_BODY");
  IElementType TL_CT_ELSE_BODY = new C3ElementType("TL_CT_ELSE_BODY");
  IElementType TL_CT_SWITCH_BODY = new C3ElementType("TL_CT_SWITCH_BODY");
  IElementType TOP_LEVEL = new C3ElementType("TOP_LEVEL");
  IElementType TOP_LEVEL_BLOCK = new C3ElementType("TOP_LEVEL_BLOCK");
  IElementType TOP_LEVEL_STATEMENT = new C3ElementType("TOP_LEVEL_STATEMENT");
  IElementType TRY_STATEMENT = new C3ElementType("TRY_STATEMENT");
  IElementType TYPE = new C3ElementType("TYPE");
  IElementType TYPEDEF_DECLARATION = new C3ElementType("TYPEDEF_DECLARATION");
  IElementType TYPE_LIST = new C3ElementType("TYPE_LIST");
  IElementType TYPE_SUFFIX = new C3ElementType("TYPE_SUFFIX");
  IElementType UNARY_EXPRESSION = new C3ElementType("UNARY_EXPRESSION");
  IElementType UNARY_OP = new C3ElementType("UNARY_OP");
  IElementType VISIBILITY = new C3ElementType("VISIBILITY");

  IElementType ADD_ASSIGN = new C3TokenType("ADD_ASSIGN");
  IElementType ADD_MOD_ASSIGN = new C3TokenType("ADD_MOD_ASSIGN");
  IElementType ADD_MOD_OP = new C3TokenType("ADD_MOD_OP");
  IElementType ADD_OP = new C3TokenType("ADD_OP");
  IElementType AMP = new C3TokenType("AMP");
  IElementType AND_ASSIGN = new C3TokenType("AND_ASSIGN");
  IElementType AND_OP = new C3TokenType("AND_OP");
  IElementType AS = new C3TokenType("AS");
  IElementType AS_KW = new C3TokenType("AS_KW");
  IElementType AT = new C3TokenType("AT");
  IElementType ATTRIBUTES = new C3TokenType("attributes");
  IElementType ATTRIBUTE_DECLARATION = new C3TokenType("attribute_declaration");
  IElementType BANG = new C3TokenType("BANG");
  IElementType BIT_NEG = new C3TokenType("BIT_NEG");
  IElementType BIT_OR_OP = new C3TokenType("BIT_OR_OP");
  IElementType BIT_XOR_OP = new C3TokenType("BIT_XOR_OP");
  IElementType BOOL_KW = new C3TokenType("BOOL_KW");
  IElementType BREAK_KW = new C3TokenType("BREAK_KW");
  IElementType BYTE_KW = new C3TokenType("BYTE_KW");
  IElementType CASE_KW = new C3TokenType("CASE_KW");
  IElementType CAST_KW = new C3TokenType("CAST_KW");
  IElementType CATCH_KW = new C3TokenType("CATCH_KW");
  IElementType CHAR_KW = new C3TokenType("CHAR_KW");
  IElementType COLON = new C3TokenType("COLON");
  IElementType COMMA = new C3TokenType("COMMA");
  IElementType CONST_IDENT = new C3TokenType("CONST_IDENT");
  IElementType CONST_KW = new C3TokenType("CONST_KW");
  IElementType CONTINUE_KW = new C3TokenType("CONTINUE_KW");
  IElementType CTCASE_KW = new C3TokenType("CTCASE_KW");
  IElementType CTDEFAULT_KW = new C3TokenType("CTDEFAULT_KW");
  IElementType CTELIF_KW = new C3TokenType("CTELIF_KW");
  IElementType CTELSE_KW = new C3TokenType("CTELSE_KW");
  IElementType CTFOR_KW = new C3TokenType("CTFOR_KW");
  IElementType CTIF_KW = new C3TokenType("CTIF_KW");
  IElementType CTSWITCH_KW = new C3TokenType("CTSWITCH_KW");
  IElementType CT_CONST_IDENT = new C3TokenType("CT_CONST_IDENT");
  IElementType CT_IDENT = new C3TokenType("CT_IDENT");
  IElementType CT_TYPE_IDENT = new C3TokenType("CT_TYPE_IDENT");
  IElementType DEC_OP = new C3TokenType("DEC_OP");
  IElementType DEFAULT_KW = new C3TokenType("DEFAULT_KW");
  IElementType DEFER_KW = new C3TokenType("DEFER_KW");
  IElementType DIV_ASSIGN = new C3TokenType("DIV_ASSIGN");
  IElementType DIV_OP = new C3TokenType("DIV_OP");
  IElementType DOT = new C3TokenType("DOT");
  IElementType DOTDOT = new C3TokenType("DOTDOT");
  IElementType DOUBLE_KW = new C3TokenType("DOUBLE_KW");
  IElementType DO_KW = new C3TokenType("DO_KW");
  IElementType ELLIPSIS = new C3TokenType("ELLIPSIS");
  IElementType ELSE_KW = new C3TokenType("ELSE_KW");
  IElementType ELVIS = new C3TokenType("ELVIS");
  IElementType ENUM_KW = new C3TokenType("ENUM_KW");
  IElementType EOS = new C3TokenType("EOS");
  IElementType EQ = new C3TokenType("EQ");
  IElementType EQ_OP = new C3TokenType("EQ_OP");
  IElementType ERROR_KW = new C3TokenType("ERROR_KW");
  IElementType EXTERN_KW = new C3TokenType("EXTERN_KW");
  IElementType FLOAT_KW = new C3TokenType("FLOAT_KW");
  IElementType FN_BLOCK_END = new C3TokenType("FN_BLOCK_END");
  IElementType FN_BLOCK_START = new C3TokenType("FN_BLOCK_START");
  IElementType FOR_KW = new C3TokenType("FOR_KW");
  IElementType FUNC_KW = new C3TokenType("FUNC_KW");
  IElementType GENERICS_DECLARATION = new C3TokenType("generics_declaration");
  IElementType GE_OP = new C3TokenType("GE_OP");
  IElementType GT_OP = new C3TokenType("GT_OP");
  IElementType HALF_KW = new C3TokenType("HALF_KW");
  IElementType HASH_IDENT = new C3TokenType("HASH_IDENT");
  IElementType IDENT = new C3TokenType("IDENT");
  IElementType IF_KW = new C3TokenType("IF_KW");
  IElementType IMPORT_KW = new C3TokenType("IMPORT_KW");
  IElementType INC_OP = new C3TokenType("INC_OP");
  IElementType INT_KW = new C3TokenType("INT_KW");
  IElementType INT_LITERAL = new C3TokenType("INT_LITERAL");
  IElementType IN_KW = new C3TokenType("IN_KW");
  IElementType LB = new C3TokenType("LB");
  IElementType LBR = new C3TokenType("LBR");
  IElementType LEFT_OP = new C3TokenType("LEFT_OP");
  IElementType LE_OP = new C3TokenType("LE_OP");
  IElementType LOCAL_KW = new C3TokenType("LOCAL_KW");
  IElementType LONG_KW = new C3TokenType("LONG_KW");
  IElementType LP = new C3TokenType("LP");
  IElementType LT_OP = new C3TokenType("LT_OP");
  IElementType MACRO_KW = new C3TokenType("MACRO_KW");
  IElementType MODULE_KW = new C3TokenType("MODULE_KW");
  IElementType MOD_OP = new C3TokenType("MOD_OP");
  IElementType MULT_MOD = new C3TokenType("MULT_MOD");
  IElementType MUL_ASSIGN = new C3TokenType("MUL_ASSIGN");
  IElementType MUL_MOD_ASSIGN = new C3TokenType("MUL_MOD_ASSIGN");
  IElementType NEG_MOD = new C3TokenType("NEG_MOD");
  IElementType NEXT_KW = new C3TokenType("NEXT_KW");
  IElementType NE_OP = new C3TokenType("NE_OP");
  IElementType NULL_KW = new C3TokenType("NULL_KW");
  IElementType OR_ASSIGN = new C3TokenType("OR_ASSIGN");
  IElementType OR_OP = new C3TokenType("OR_OP");
  IElementType PUBLIC_KW = new C3TokenType("PUBLIC_KW");
  IElementType QUAD_KW = new C3TokenType("QUAD_KW");
  IElementType QUESTION = new C3TokenType("QUESTION");
  IElementType RB = new C3TokenType("RB");
  IElementType RBR = new C3TokenType("RBR");
  IElementType RETURN_KW = new C3TokenType("RETURN_KW");
  IElementType RIGHT_OP = new C3TokenType("RIGHT_OP");
  IElementType RP = new C3TokenType("RP");
  IElementType SCOPE = new C3TokenType("SCOPE");
  IElementType SHL_ASSIGN = new C3TokenType("SHL_ASSIGN");
  IElementType SHORT_KW = new C3TokenType("SHORT_KW");
  IElementType SHR_ASSIGN = new C3TokenType("SHR_ASSIGN");
  IElementType STAR = new C3TokenType("STAR");
  IElementType STRING_LITERAL = new C3TokenType("STRING_LITERAL");
  IElementType STRUCT_KW = new C3TokenType("STRUCT_KW");
  IElementType SUB_ASSIGN = new C3TokenType("SUB_ASSIGN");
  IElementType SUB_MOD_ASSIGN = new C3TokenType("SUB_MOD_ASSIGN");
  IElementType SUB_MOD_OP = new C3TokenType("SUB_MOD_OP");
  IElementType SUB_OP = new C3TokenType("SUB_OP");
  IElementType SWITCH_KW = new C3TokenType("SWITCH_KW");
  IElementType TRY_KW = new C3TokenType("TRY_KW");
  IElementType TYPEDEF_KW = new C3TokenType("TYPEDEF_KW");
  IElementType TYPEID = new C3TokenType("TYPEID");
  IElementType TYPE_IDENT = new C3TokenType("TYPE_IDENT");
  IElementType UINT_KW = new C3TokenType("UINT_KW");
  IElementType ULONG_KW = new C3TokenType("ULONG_KW");
  IElementType UNION_KW = new C3TokenType("UNION_KW");
  IElementType USHORT_KW = new C3TokenType("USHORT_KW");
  IElementType VOID_KW = new C3TokenType("VOID_KW");
  IElementType WHILE_KW = new C3TokenType("WHILE_KW");
  IElementType XOR_ASSIGN = new C3TokenType("XOR_ASSIGN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADDITIVE_EXPRESSION) {
        return new C3AdditiveExpressionImpl(node);
      }
      else if (type == ADDITIVE_OP) {
        return new C3AdditiveOpImpl(node);
      }
      else if (type == ARGUMENT_EXPRESSION_LIST) {
        return new C3ArgumentExpressionListImpl(node);
      }
      else if (type == ASSIGNMENT_EXPRESSION) {
        return new C3AssignmentExpressionImpl(node);
      }
      else if (type == ASSIGNMENT_OP) {
        return new C3AssignmentOpImpl(node);
      }
      else if (type == BASE_TYPE) {
        return new C3BaseTypeImpl(node);
      }
      else if (type == BIT_EXPRESSION) {
        return new C3BitExpressionImpl(node);
      }
      else if (type == BIT_OP) {
        return new C3BitOpImpl(node);
      }
      else if (type == CATCH_STATEMENT) {
        return new C3CatchStatementImpl(node);
      }
      else if (type == COMPOUND_STATEMENT) {
        return new C3CompoundStatementImpl(node);
      }
      else if (type == CONDITIONAL_COMPILATION) {
        return new C3ConditionalCompilationImpl(node);
      }
      else if (type == CONDITIONAL_EXPRESSION) {
        return new C3ConditionalExpressionImpl(node);
      }
      else if (type == CONSTANT) {
        return new C3ConstantImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new C3ConstantExpressionImpl(node);
      }
      else if (type == CONST_DECLARATION) {
        return new C3ConstDeclarationImpl(node);
      }
      else if (type == CT_CASE_STMT) {
        return new C3CtCaseStmtImpl(node);
      }
      else if (type == CT_ELIF) {
        return new C3CtElifImpl(node);
      }
      else if (type == CT_ELIF_BODY) {
        return new C3CtElifBodyImpl(node);
      }
      else if (type == CT_ELSE_BODY) {
        return new C3CtElseBodyImpl(node);
      }
      else if (type == CT_FOR_STMT) {
        return new C3CtForStmtImpl(node);
      }
      else if (type == CT_IF) {
        return new C3CtIfImpl(node);
      }
      else if (type == CT_STMT) {
        return new C3CtStmtImpl(node);
      }
      else if (type == CT_SWITCH) {
        return new C3CtSwitchImpl(node);
      }
      else if (type == CT_SWITCH_BODY) {
        return new C3CtSwitchBodyImpl(node);
      }
      else if (type == DECLARATION) {
        return new C3DeclarationImpl(node);
      }
      else if (type == DECLARATION_STATEMENT) {
        return new C3DeclarationStatementImpl(node);
      }
      else if (type == DECL_EXPR_LIST) {
        return new C3DeclExprListImpl(node);
      }
      else if (type == DEFER_CATCH_BODY) {
        return new C3DeferCatchBodyImpl(node);
      }
      else if (type == DEFER_STATEMENT) {
        return new C3DeferStatementImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new C3EnumeratorImpl(node);
      }
      else if (type == ENUMERATOR_LIST) {
        return new C3EnumeratorListImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new C3EnumDeclarationImpl(node);
      }
      else if (type == ERROR_DECLARATION) {
        return new C3ErrorDeclarationImpl(node);
      }
      else if (type == ERROR_EXPRESSION) {
        return new C3ErrorExpressionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new C3ExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new C3ExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new C3ExpressionStatementImpl(node);
      }
      else if (type == EXTERNAL_FUNC_DECLARATION) {
        return new C3ExternalFuncDeclarationImpl(node);
      }
      else if (type == FAILABLE_TYPE) {
        return new C3FailableTypeImpl(node);
      }
      else if (type == FLOAT_TYPE) {
        return new C3FloatTypeImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new C3ForStatementImpl(node);
      }
      else if (type == FUNC_DECLARATION) {
        return new C3FuncDeclarationImpl(node);
      }
      else if (type == FUNC_DEFINITION) {
        return new C3FuncDefinitionImpl(node);
      }
      else if (type == FUNC_TYPEDEF) {
        return new C3FuncTypedefImpl(node);
      }
      else if (type == GLOBAL_DECLARATION) {
        return new C3GlobalDeclarationImpl(node);
      }
      else if (type == GROUPED_EXPRESSION) {
        return new C3GroupedExpressionImpl(node);
      }
      else if (type == IDENTIFIER_LIST) {
        return new C3IdentifierListImpl(node);
      }
      else if (type == IDENT_EXPRESSION) {
        return new C3IdentExpressionImpl(node);
      }
      else if (type == IMPORT_DECL) {
        return new C3ImportDeclImpl(node);
      }
      else if (type == IMPORT_PATH) {
        return new C3ImportPathImpl(node);
      }
      else if (type == INITIALIZER) {
        return new C3InitializerImpl(node);
      }
      else if (type == INITIALIZER_LIST) {
        return new C3InitializerListImpl(node);
      }
      else if (type == INTEGER_TYPE) {
        return new C3IntegerTypeImpl(node);
      }
      else if (type == ITERATION_STATEMENT) {
        return new C3IterationStatementImpl(node);
      }
      else if (type == JUMP_STATEMENT) {
        return new C3JumpStatementImpl(node);
      }
      else if (type == LABELLED_STATEMENT) {
        return new C3LabelledStatementImpl(node);
      }
      else if (type == LOGICAL_EXPRESSION) {
        return new C3LogicalExpressionImpl(node);
      }
      else if (type == LOGICAL_OP) {
        return new C3LogicalOpImpl(node);
      }
      else if (type == MACRO_ARGUMENT) {
        return new C3MacroArgumentImpl(node);
      }
      else if (type == MACRO_ARGUMENT_LIST) {
        return new C3MacroArgumentListImpl(node);
      }
      else if (type == MACRO_DECLARATION) {
        return new C3MacroDeclarationImpl(node);
      }
      else if (type == MODULE) {
        return new C3ModuleImpl(node);
      }
      else if (type == MODULE_PARAM) {
        return new C3ModuleParamImpl(node);
      }
      else if (type == MODULE_PARAMS) {
        return new C3ModuleParamsImpl(node);
      }
      else if (type == MULTIPLICATIVE_EXPRESSION) {
        return new C3MultiplicativeExpressionImpl(node);
      }
      else if (type == MULTIPLICATIVE_OP) {
        return new C3MultiplicativeOpImpl(node);
      }
      else if (type == PARAMETER_LIST) {
        return new C3ParameterListImpl(node);
      }
      else if (type == PARAMETER_TYPE_LIST) {
        return new C3ParameterTypeListImpl(node);
      }
      else if (type == PARAM_DECLARATION) {
        return new C3ParamDeclarationImpl(node);
      }
      else if (type == PATH) {
        return new C3PathImpl(node);
      }
      else if (type == POSTFIX_EXPRESSION) {
        return new C3PostfixExpressionImpl(node);
      }
      else if (type == POSTFIX_OP) {
        return new C3PostfixOpImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new C3PrimaryExpressionImpl(node);
      }
      else if (type == RELATIONAL_EXPRESSION) {
        return new C3RelationalExpressionImpl(node);
      }
      else if (type == RELATIONAL_OP) {
        return new C3RelationalOpImpl(node);
      }
      else if (type == SELECTION_STATEMENT) {
        return new C3SelectionStatementImpl(node);
      }
      else if (type == SHIFT_EXPRESSION) {
        return new C3ShiftExpressionImpl(node);
      }
      else if (type == SHIFT_OP) {
        return new C3ShiftOpImpl(node);
      }
      else if (type == SPECIFIED_IMPORT) {
        return new C3SpecifiedImportImpl(node);
      }
      else if (type == SPECIFIED_IMPORT_LIST) {
        return new C3SpecifiedImportListImpl(node);
      }
      else if (type == STATEMENT) {
        return new C3StatementImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new C3StatementListImpl(node);
      }
      else if (type == STRUCT_BODY) {
        return new C3StructBodyImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new C3StructDeclarationImpl(node);
      }
      else if (type == STRUCT_DECLARATION_LIST) {
        return new C3StructDeclarationListImpl(node);
      }
      else if (type == STRUCT_MEMBER_DECLARATION) {
        return new C3StructMemberDeclarationImpl(node);
      }
      else if (type == STRUCT_OR_UNION) {
        return new C3StructOrUnionImpl(node);
      }
      else if (type == TL_CT_CASE) {
        return new C3TlCtCaseImpl(node);
      }
      else if (type == TL_CT_ELIF_BODY) {
        return new C3TlCtElifBodyImpl(node);
      }
      else if (type == TL_CT_ELSE_BODY) {
        return new C3TlCtElseBodyImpl(node);
      }
      else if (type == TL_CT_SWITCH_BODY) {
        return new C3TlCtSwitchBodyImpl(node);
      }
      else if (type == TOP_LEVEL) {
        return new C3TopLevelImpl(node);
      }
      else if (type == TOP_LEVEL_BLOCK) {
        return new C3TopLevelBlockImpl(node);
      }
      else if (type == TOP_LEVEL_STATEMENT) {
        return new C3TopLevelStatementImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new C3TryStatementImpl(node);
      }
      else if (type == TYPE) {
        return new C3TypeImpl(node);
      }
      else if (type == TYPEDEF_DECLARATION) {
        return new C3TypedefDeclarationImpl(node);
      }
      else if (type == TYPE_LIST) {
        return new C3TypeListImpl(node);
      }
      else if (type == TYPE_SUFFIX) {
        return new C3TypeSuffixImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new C3UnaryExpressionImpl(node);
      }
      else if (type == UNARY_OP) {
        return new C3UnaryOpImpl(node);
      }
      else if (type == VISIBILITY) {
        return new C3VisibilityImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
