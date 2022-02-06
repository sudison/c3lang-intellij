// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.c3lang.intellijplugin.parser.psi.C3Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class C3Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return translation_unit(b, l + 1);
  }

  /* ********************************************************** */
  // IDENT | TYPE_IDENT
  public static boolean Symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Symbol")) return false;
    if (!nextTokenIs(b, "<symbol>", IDENT, TYPE_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYMBOL, "<symbol>");
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, TYPE_IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bit_expression (additive_op bit_expression)*
  public static boolean additive_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXPRESSION, "<additive expression>");
    r = bit_expression(b, l + 1);
    r = r && additive_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (additive_op bit_expression)*
  private static boolean additive_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additive_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_expression_1", c)) break;
    }
    return true;
  }

  // additive_op bit_expression
  private static boolean additive_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_op(b, l + 1);
    r = r && bit_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ADD_OP | ADD_MOD_OP | SUB_OP | SUB_MOD_OP
  public static boolean additive_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_OP, "<additive op>");
    r = consumeToken(b, ADD_OP);
    if (!r) r = consumeToken(b, ADD_MOD_OP);
    if (!r) r = consumeToken(b, SUB_OP);
    if (!r) r = consumeToken(b, SUB_MOD_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean argument_expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_EXPRESSION_LIST, "<argument expression list>");
    r = expression(b, l + 1);
    r = r && argument_expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)*
  private static boolean argument_expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_expression_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argument_expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_expression_list_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean argument_expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary_expression ((EQ initializer_list) | (assignment_op error_expression))+
  public static boolean assignment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_EXPRESSION, "<assignment expression>");
    r = unary_expression(b, l + 1);
    r = r && assignment_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((EQ initializer_list) | (assignment_op error_expression))+
  private static boolean assignment_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_expression_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!assignment_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "assignment_expression_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ initializer_list) | (assignment_op error_expression)
  private static boolean assignment_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_expression_1_0_0(b, l + 1);
    if (!r) r = assignment_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQ initializer_list
  private static boolean assignment_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && initializer_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment_op error_expression
  private static boolean assignment_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_op(b, l + 1);
    r = r && error_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQ
  //     | MUL_ASSIGN
  //     | MUL_MOD_ASSIGN
  //     | DIV_ASSIGN
  //     | ADD_ASSIGN
  //     | ADD_MOD_ASSIGN
  //     | SUB_ASSIGN
  //     | SUB_MOD_ASSIGN
  //     | SHR_ASSIGN
  //     | SHL_ASSIGN
  //     | AND_ASSIGN
  //     | XOR_ASSIGN
  //     | OR_ASSIGN
  public static boolean assignment_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OP, "<assignment op>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, MUL_ASSIGN);
    if (!r) r = consumeToken(b, MUL_MOD_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, ADD_ASSIGN);
    if (!r) r = consumeToken(b, ADD_MOD_ASSIGN);
    if (!r) r = consumeToken(b, SUB_ASSIGN);
    if (!r) r = consumeToken(b, SUB_MOD_ASSIGN);
    if (!r) r = consumeToken(b, SHR_ASSIGN);
    if (!r) r = consumeToken(b, SHL_ASSIGN);
    if (!r) r = consumeToken(b, AND_ASSIGN);
    if (!r) r = consumeToken(b, XOR_ASSIGN);
    if (!r) r = consumeToken(b, OR_ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VOID_KW
  //     | BOOL_KW
  //     | integer_type
  //     | float_type
  //     | Symbol
  //     | TYPE_IDENT
  //     | path TYPE_IDENT
  //     | CT_TYPE_IDENT
  public static boolean base_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPE, "<base type>");
    r = consumeToken(b, VOID_KW);
    if (!r) r = consumeToken(b, BOOL_KW);
    if (!r) r = integer_type(b, l + 1);
    if (!r) r = float_type(b, l + 1);
    if (!r) r = Symbol(b, l + 1);
    if (!r) r = consumeToken(b, TYPE_IDENT);
    if (!r) r = base_type_6(b, l + 1);
    if (!r) r = consumeToken(b, CT_TYPE_IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // path TYPE_IDENT
  private static boolean base_type_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_type_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path(b, l + 1);
    r = r && consumeToken(b, TYPE_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // shift_expression (bit_op shift_expression)*
  public static boolean bit_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_EXPRESSION, "<bit expression>");
    r = shift_expression(b, l + 1);
    r = r && bit_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (bit_op shift_expression)*
  private static boolean bit_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!bit_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bit_expression_1", c)) break;
    }
    return true;
  }

  // bit_op shift_expression
  private static boolean bit_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bit_op(b, l + 1);
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AMP | BIT_XOR_OP | BIT_OR_OP
  public static boolean bit_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_OP, "<bit op>");
    r = consumeToken(b, AMP);
    if (!r) r = consumeToken(b, BIT_XOR_OP);
    if (!r) r = consumeToken(b, BIT_OR_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CATCH_KW LP expression RP defer_catch_body
  public static boolean catch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_statement")) return false;
    if (!nextTokenIs(b, CATCH_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CATCH_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && defer_catch_body(b, l + 1);
    exit_section_(b, m, CATCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LBR statement_list? RBR
  public static boolean compound_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement")) return false;
    if (!nextTokenIs(b, LBR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_STATEMENT, null);
    r = consumeToken(b, LBR);
    p = r; // pin = 1
    r = r && report_error_(b, compound_statement_1(b, l + 1));
    r = p && consumeToken(b, RBR) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // statement_list?
  private static boolean compound_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_statement_1")) return false;
    statement_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ct_if top_level_block tl_ct_else_body?
  //     | ct_switch LBR tl_ct_switch_body RBR
  public static boolean conditional_compilation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation")) return false;
    if (!nextTokenIs(b, "<conditional compilation>", CTIF_KW, CTSWITCH_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_COMPILATION, "<conditional compilation>");
    r = conditional_compilation_0(b, l + 1);
    if (!r) r = conditional_compilation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ct_if top_level_block tl_ct_else_body?
  private static boolean conditional_compilation_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_if(b, l + 1);
    r = r && top_level_block(b, l + 1);
    r = r && conditional_compilation_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tl_ct_else_body?
  private static boolean conditional_compilation_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_0_2")) return false;
    tl_ct_else_body(b, l + 1);
    return true;
  }

  // ct_switch LBR tl_ct_switch_body RBR
  private static boolean conditional_compilation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_compilation_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_switch(b, l + 1);
    r = r && consumeToken(b, LBR);
    r = r && tl_ct_switch_body(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // logical_expression ((ELVIS | QUESTION expression COLON) logical_expression)*
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXPRESSION, "<conditional expression>");
    r = logical_expression(b, l + 1);
    r = r && conditional_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((ELVIS | QUESTION expression COLON) logical_expression)*
  private static boolean conditional_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conditional_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditional_expression_1", c)) break;
    }
    return true;
  }

  // (ELVIS | QUESTION expression COLON) logical_expression
  private static boolean conditional_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = conditional_expression_1_0_0(b, l + 1);
    r = r && logical_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ELVIS | QUESTION expression COLON
  private static boolean conditional_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELVIS);
    if (!r) r = conditional_expression_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QUESTION expression COLON
  private static boolean conditional_expression_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONST_KW (type CONST_IDENT | CT_CONST_IDENT) EQ initializer EOS
  public static boolean const_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration")) return false;
    if (!nextTokenIs(b, CONST_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_KW);
    r = r && const_declaration_1(b, l + 1);
    r = r && consumeToken(b, EQ);
    r = r && initializer(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, CONST_DECLARATION, r);
    return r;
  }

  // type CONST_IDENT | CT_CONST_IDENT
  private static boolean const_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_declaration_1_0(b, l + 1);
    if (!r) r = consumeToken(b, CT_CONST_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // type CONST_IDENT
  private static boolean const_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, CONST_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INT_LITERAL
  public static boolean constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant")) return false;
    if (!nextTokenIs(b, INT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT_LITERAL);
    exit_section_(b, m, CONSTANT, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_expression
  public static boolean constant_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT_EXPRESSION, "<constant expression>");
    r = conditional_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CTCASE_KW type_list COLON statement | CTDEFAULT_KW COLON statement
  public static boolean ct_case_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_case_stmt")) return false;
    if (!nextTokenIs(b, "<ct case stmt>", CTCASE_KW, CTDEFAULT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CT_CASE_STMT, "<ct case stmt>");
    r = ct_case_stmt_0(b, l + 1);
    if (!r) r = ct_case_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CTCASE_KW type_list COLON statement
  private static boolean ct_case_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_case_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTCASE_KW);
    r = r && type_list(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CTDEFAULT_KW COLON statement
  private static boolean ct_case_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_case_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CTDEFAULT_KW, COLON);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CTELIF_KW LP expression RP
  public static boolean ct_elif(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_elif")) return false;
    if (!nextTokenIs(b, CTELIF_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CTELIF_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, CT_ELIF, r);
    return r;
  }

  /* ********************************************************** */
  // (ct_elif compound_statement)+
  public static boolean ct_elif_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_elif_body")) return false;
    if (!nextTokenIs(b, CTELIF_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_elif_body_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ct_elif_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ct_elif_body", c)) break;
    }
    exit_section_(b, m, CT_ELIF_BODY, r);
    return r;
  }

  // ct_elif compound_statement
  private static boolean ct_elif_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_elif_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_elif(b, l + 1);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ct_elif_body (CTELSE_KW compound_statement)? | CTELSE_KW compound_statement
  public static boolean ct_else_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_else_body")) return false;
    if (!nextTokenIs(b, "<ct else body>", CTELIF_KW, CTELSE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CT_ELSE_BODY, "<ct else body>");
    r = ct_else_body_0(b, l + 1);
    if (!r) r = ct_else_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ct_elif_body (CTELSE_KW compound_statement)?
  private static boolean ct_else_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_else_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_elif_body(b, l + 1);
    r = r && ct_else_body_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (CTELSE_KW compound_statement)?
  private static boolean ct_else_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_else_body_0_1")) return false;
    ct_else_body_0_1_0(b, l + 1);
    return true;
  }

  // CTELSE_KW compound_statement
  private static boolean ct_else_body_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_else_body_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTELSE_KW);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CTELSE_KW compound_statement
  private static boolean ct_else_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_else_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTELSE_KW);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CTFOR_KW LP CT_IDENT (COMMA CT_IDENT) IN_KW expression RP statement
  public static boolean ct_for_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_for_stmt")) return false;
    if (!nextTokenIs(b, CTFOR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CTFOR_KW, LP, CT_IDENT);
    r = r && ct_for_stmt_3(b, l + 1);
    r = r && consumeToken(b, IN_KW);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && statement(b, l + 1);
    exit_section_(b, m, CT_FOR_STMT, r);
    return r;
  }

  // COMMA CT_IDENT
  private static boolean ct_for_stmt_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_for_stmt_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, CT_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CTIF_KW LP expression RP
  public static boolean ct_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_if")) return false;
    if (!nextTokenIs(b, CTIF_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CTIF_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, CT_IF, r);
    return r;
  }

  /* ********************************************************** */
  // ct_if compound_statement ct_else_body?
  //     | ct_switch LBR ct_switch_body RBR
  //     | ct_for_stmt
  public static boolean ct_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CT_STMT, "<ct stmt>");
    r = ct_stmt_0(b, l + 1);
    if (!r) r = ct_stmt_1(b, l + 1);
    if (!r) r = ct_for_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ct_if compound_statement ct_else_body?
  private static boolean ct_stmt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_stmt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_if(b, l + 1);
    r = r && compound_statement(b, l + 1);
    r = r && ct_stmt_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ct_else_body?
  private static boolean ct_stmt_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_stmt_0_2")) return false;
    ct_else_body(b, l + 1);
    return true;
  }

  // ct_switch LBR ct_switch_body RBR
  private static boolean ct_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_switch(b, l + 1);
    r = r && consumeToken(b, LBR);
    r = r && ct_switch_body(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CTSWITCH_KW LP expression RP
  public static boolean ct_switch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_switch")) return false;
    if (!nextTokenIs(b, CTSWITCH_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CTSWITCH_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, CT_SWITCH, r);
    return r;
  }

  /* ********************************************************** */
  // ct_case_stmt+
  public static boolean ct_switch_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ct_switch_body")) return false;
    if (!nextTokenIs(b, "<ct switch body>", CTCASE_KW, CTDEFAULT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CT_SWITCH_BODY, "<ct switch body>");
    r = ct_case_stmt(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ct_case_stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ct_switch_body", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (expression | declaration) (COMMA (expression | declaration))*
  public static boolean decl_expr_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_EXPR_LIST, "<decl expr list>");
    r = decl_expr_list_0(b, l + 1);
    r = r && decl_expr_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expression | declaration
  private static boolean decl_expr_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr_list_0")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = declaration(b, l + 1);
    return r;
  }

  // (COMMA (expression | declaration))*
  private static boolean decl_expr_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!decl_expr_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decl_expr_list_1", c)) break;
    }
    return true;
  }

  // COMMA (expression | declaration)
  private static boolean decl_expr_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && decl_expr_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression | declaration
  private static boolean decl_expr_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_expr_list_1_0_1")) return false;
    boolean r;
    r = expression(b, l + 1);
    if (!r) r = declaration(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // failable_type IDENT (EQ initializer)?
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = failable_type(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (EQ initializer)?
  private static boolean declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2")) return false;
    declaration_2_0(b, l + 1);
    return true;
  }

  // EQ initializer
  private static boolean declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration EOS
  public static boolean declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION_STATEMENT, "<declaration statement>");
    r = declaration(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // compound_statement
  //     | expression_statement
  //     | jump_statement
  //     | iteration_statement
  //     | selection_statement
  public static boolean defer_catch_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_catch_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFER_CATCH_BODY, "<defer catch body>");
    r = compound_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = jump_statement(b, l + 1);
    if (!r) r = iteration_statement(b, l + 1);
    if (!r) r = selection_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DEFER_KW (defer_catch_body | catch_statement)
  public static boolean defer_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_statement")) return false;
    if (!nextTokenIs(b, DEFER_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DEFER_KW);
    r = r && defer_statement_1(b, l + 1);
    exit_section_(b, m, DEFER_STATEMENT, r);
    return r;
  }

  // defer_catch_body | catch_statement
  private static boolean defer_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defer_statement_1")) return false;
    boolean r;
    r = defer_catch_body(b, l + 1);
    if (!r) r = catch_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ENUM_KW TYPE_IDENT (COLON type)? attributes? LBR enumerator_list RBR
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    if (!nextTokenIs(b, ENUM_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENUM_KW, TYPE_IDENT);
    r = r && enum_declaration_2(b, l + 1);
    r = r && enum_declaration_3(b, l + 1);
    r = r && consumeToken(b, LBR);
    r = r && enumerator_list(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // (COLON type)?
  private static boolean enum_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2")) return false;
    enum_declaration_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean enum_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean enum_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_3")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  /* ********************************************************** */
  // CONST_IDENT (EQ constant_expression)?
  public static boolean enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator")) return false;
    if (!nextTokenIs(b, CONST_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_IDENT);
    r = r && enumerator_1(b, l + 1);
    exit_section_(b, m, ENUMERATOR, r);
    return r;
  }

  // (EQ constant_expression)?
  private static boolean enumerator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_1")) return false;
    enumerator_1_0(b, l + 1);
    return true;
  }

  // EQ constant_expression
  private static boolean enumerator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enumerator (COMMA enumerator)* COMMA?
  public static boolean enumerator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list")) return false;
    if (!nextTokenIs(b, CONST_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumerator(b, l + 1);
    r = r && enumerator_list_1(b, l + 1);
    r = r && enumerator_list_2(b, l + 1);
    exit_section_(b, m, ENUMERATOR_LIST, r);
    return r;
  }

  // (COMMA enumerator)*
  private static boolean enumerator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!enumerator_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumerator_list_1", c)) break;
    }
    return true;
  }

  // COMMA enumerator
  private static boolean enumerator_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumerator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean enumerator_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ERROR_KW TYPE_IDENT ((LBR struct_body RBR) | EOS)
  public static boolean error_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_declaration")) return false;
    if (!nextTokenIs(b, ERROR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ERROR_KW, TYPE_IDENT);
    r = r && error_declaration_2(b, l + 1);
    exit_section_(b, m, ERROR_DECLARATION, r);
    return r;
  }

  // (LBR struct_body RBR) | EOS
  private static boolean error_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = error_declaration_2_0(b, l + 1);
    if (!r) r = consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // LBR struct_body RBR
  private static boolean error_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBR);
    r = r && struct_body(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_expression BANG?
  public static boolean error_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ERROR_EXPRESSION, "<error expression>");
    r = conditional_expression(b, l + 1);
    r = r && error_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BANG?
  private static boolean error_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "error_expression_1")) return false;
    consumeToken(b, BANG);
    return true;
  }

  /* ********************************************************** */
  // TRY_KW expression | assignment_expression (ELSE_KW assignment_expression)? | error_expression
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = expression_0(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    if (!r) r = error_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TRY_KW expression
  private static boolean expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY_KW);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment_expression (ELSE_KW assignment_expression)?
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_expression(b, l + 1);
    r = r && expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ELSE_KW assignment_expression)?
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    expression_1_1_0(b, l + 1);
    return true;
  }

  // ELSE_KW assignment_expression
  private static boolean expression_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KW);
    r = r && assignment_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression (COMMA expression)*
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_LIST, "<expression list>");
    r = expression(b, l + 1);
    r = r && expression_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA expression)*
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_1", c)) break;
    }
    return true;
  }

  // COMMA expression
  private static boolean expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression EOS
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION_STATEMENT, "<expression statement>");
    r = expression(b, l + 1);
    p = r; // pin = 1
    r = r && consumeToken(b, EOS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // EXTERN_KW func_declaration EOS
  public static boolean external_func_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_func_declaration")) return false;
    if (!nextTokenIs(b, EXTERN_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERN_KW);
    r = r && func_declaration(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, EXTERNAL_FUNC_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // type BANG?
  public static boolean failable_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "failable_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FAILABLE_TYPE, "<failable type>");
    r = type(b, l + 1);
    r = r && failable_type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BANG?
  private static boolean failable_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "failable_type_1")) return false;
    consumeToken(b, BANG);
    return true;
  }

  /* ********************************************************** */
  // HALF_KW | FLOAT_KW | DOUBLE_KW | QUAD_KW
  public static boolean float_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_TYPE, "<float type>");
    r = consumeToken(b, HALF_KW);
    if (!r) r = consumeToken(b, FLOAT_KW);
    if (!r) r = consumeToken(b, DOUBLE_KW);
    if (!r) r = consumeToken(b, QUAD_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR_KW LP decl_expr_list EOS expression_statement expression_list? RP statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    if (!nextTokenIs(b, FOR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR_KW, LP);
    r = r && decl_expr_list(b, l + 1);
    r = r && consumeToken(b, EOS);
    r = r && expression_statement(b, l + 1);
    r = r && for_statement_5(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && statement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // expression_list?
  private static boolean for_statement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_5")) return false;
    expression_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FN_KW failable_type func_name parameter_type_list attributes?
  public static boolean func_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_declaration")) return false;
    if (!nextTokenIs(b, FN_KW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNC_DECLARATION, null);
    r = consumeToken(b, FN_KW);
    p = r; // pin = 1
    r = r && report_error_(b, failable_type(b, l + 1));
    r = p && report_error_(b, func_name(b, l + 1)) && r;
    r = p && report_error_(b, parameter_type_list(b, l + 1)) && r;
    r = p && func_declaration_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // attributes?
  private static boolean func_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_declaration_4")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  /* ********************************************************** */
  // func_declaration compound_statement?
  public static boolean func_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_definition")) return false;
    if (!nextTokenIs(b, FN_KW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNC_DEFINITION, null);
    r = func_declaration(b, l + 1);
    p = r; // pin = 1
    r = r && func_definition_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // compound_statement?
  private static boolean func_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_definition_1")) return false;
    compound_statement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TYPE_IDENT DOT IDENT | IDENT
  public static boolean func_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_name")) return false;
    if (!nextTokenIs(b, "<func name>", IDENT, TYPE_IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNC_NAME, "<func name>");
    r = parseTokens(b, 0, TYPE_IDENT, DOT, IDENT);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FN_KW failable_type parameter_type_list
  public static boolean func_typedef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_typedef")) return false;
    if (!nextTokenIs(b, FN_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FN_KW);
    r = r && failable_type(b, l + 1);
    r = r && parameter_type_list(b, l + 1);
    exit_section_(b, m, FUNC_TYPEDEF, r);
    return r;
  }

  /* ********************************************************** */
  // type IDENT (EQ initializer)? EOS
  public static boolean global_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GLOBAL_DECLARATION, "<global declaration>");
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && global_declaration_2(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (EQ initializer)?
  private static boolean global_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_2")) return false;
    global_declaration_2_0(b, l + 1);
    return true;
  }

  // EQ initializer
  private static boolean global_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP expression RP
  public static boolean grouped_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "grouped_expression")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, GROUPED_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // CONST_IDENT | IDENT | CT_IDENT | CT_CONST_IDENT
  public static boolean ident_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ident_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_EXPRESSION, "<ident expression>");
    r = consumeToken(b, CONST_IDENT);
    if (!r) r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, CT_IDENT);
    if (!r) r = consumeToken(b, CT_CONST_IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT (COMMA IDENT)*
  public static boolean identifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && identifier_list_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // (COMMA IDENT)*
  private static boolean identifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!identifier_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifier_list_1", c)) break;
    }
    return true;
  }

  // COMMA IDENT
  private static boolean identifier_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IMPORT_KW import_path (COLON specified_import_list)? EOS
  public static boolean import_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl")) return false;
    if (!nextTokenIs(b, IMPORT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPORT_KW);
    r = r && import_path(b, l + 1);
    r = r && import_decl_2(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, IMPORT_DECL, r);
    return r;
  }

  // (COLON specified_import_list)?
  private static boolean import_decl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl_2")) return false;
    import_decl_2_0(b, l + 1);
    return true;
  }

  // COLON specified_import_list
  private static boolean import_decl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_decl_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && specified_import_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENT (DOT IDENT)*
  public static boolean import_path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && import_path_1(b, l + 1);
    exit_section_(b, m, IMPORT_PATH, r);
    return r;
  }

  // (DOT IDENT)*
  private static boolean import_path_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_path_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "import_path_1", c)) break;
    }
    return true;
  }

  // DOT IDENT
  private static boolean import_path_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_path_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression | initializer_list
  public static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER, "<initializer>");
    r = expression(b, l + 1);
    if (!r) r = initializer_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBR initializer (COMMA initializer)* RBR
  public static boolean initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_list")) return false;
    if (!nextTokenIs(b, LBR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBR);
    r = r && initializer(b, l + 1);
    r = r && initializer_list_2(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, INITIALIZER_LIST, r);
    return r;
  }

  // (COMMA initializer)*
  private static boolean initializer_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_list_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!initializer_list_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "initializer_list_2", c)) break;
    }
    return true;
  }

  // COMMA initializer
  private static boolean initializer_list_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_list_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHAR_KW | BYTE_KW | SHORT_KW | USHORT_KW | INT_KW | UINT_KW | LONG_KW | ULONG_KW
  public static boolean integer_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INTEGER_TYPE, "<integer type>");
    r = consumeToken(b, CHAR_KW);
    if (!r) r = consumeToken(b, BYTE_KW);
    if (!r) r = consumeToken(b, SHORT_KW);
    if (!r) r = consumeToken(b, USHORT_KW);
    if (!r) r = consumeToken(b, INT_KW);
    if (!r) r = consumeToken(b, UINT_KW);
    if (!r) r = consumeToken(b, LONG_KW);
    if (!r) r = consumeToken(b, ULONG_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // for_statement
  //     | WHILE_KW LP expression RP statement
  //     | DO_KW statement (WHILE_KW LP expression RP)? EOS
  public static boolean iteration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATION_STATEMENT, "<iteration statement>");
    r = for_statement(b, l + 1);
    if (!r) r = iteration_statement_1(b, l + 1);
    if (!r) r = iteration_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHILE_KW LP expression RP statement
  private static boolean iteration_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DO_KW statement (WHILE_KW LP expression RP)? EOS
  private static boolean iteration_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO_KW);
    r = r && statement(b, l + 1);
    r = r && iteration_statement_2_2(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (WHILE_KW LP expression RP)?
  private static boolean iteration_statement_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement_2_2")) return false;
    iteration_statement_2_2_0(b, l + 1);
    return true;
  }

  // WHILE_KW LP expression RP
  private static boolean iteration_statement_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (CONTINUE_KW | BREAK_KW) (CONST_IDENT | CT_CONST_IDENT)? EOS
  //     | NEXT_KW expression? EOS
  //     | RETURN_KW expression? EOS
  public static boolean jump_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUMP_STATEMENT, "<jump statement>");
    r = jump_statement_0(b, l + 1);
    if (!r) r = jump_statement_1(b, l + 1);
    if (!r) r = jump_statement_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (CONTINUE_KW | BREAK_KW) (CONST_IDENT | CT_CONST_IDENT)? EOS
  private static boolean jump_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = jump_statement_0_0(b, l + 1);
    r = r && jump_statement_0_1(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONTINUE_KW | BREAK_KW
  private static boolean jump_statement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_0_0")) return false;
    boolean r;
    r = consumeToken(b, CONTINUE_KW);
    if (!r) r = consumeToken(b, BREAK_KW);
    return r;
  }

  // (CONST_IDENT | CT_CONST_IDENT)?
  private static boolean jump_statement_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_0_1")) return false;
    jump_statement_0_1_0(b, l + 1);
    return true;
  }

  // CONST_IDENT | CT_CONST_IDENT
  private static boolean jump_statement_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, CONST_IDENT);
    if (!r) r = consumeToken(b, CT_CONST_IDENT);
    return r;
  }

  // NEXT_KW expression? EOS
  private static boolean jump_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEXT_KW);
    r = r && jump_statement_1_1(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean jump_statement_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_1_1")) return false;
    expression(b, l + 1);
    return true;
  }

  // RETURN_KW expression? EOS
  private static boolean jump_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN_KW);
    r = r && jump_statement_2_1(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean jump_statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement_2_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // CASE_KW constant_expression (DOTDOT constant_expression)? COLON | DEFAULT_KW COLON
  public static boolean labelled_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelled_statement")) return false;
    if (!nextTokenIs(b, "<labelled statement>", CASE_KW, DEFAULT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABELLED_STATEMENT, "<labelled statement>");
    r = labelled_statement_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, DEFAULT_KW, COLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CASE_KW constant_expression (DOTDOT constant_expression)? COLON
  private static boolean labelled_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelled_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE_KW);
    r = r && constant_expression(b, l + 1);
    r = r && labelled_statement_0_2(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOTDOT constant_expression)?
  private static boolean labelled_statement_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelled_statement_0_2")) return false;
    labelled_statement_0_2_0(b, l + 1);
    return true;
  }

  // DOTDOT constant_expression
  private static boolean labelled_statement_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labelled_statement_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relational_expression (logical_op relational_expression)*
  public static boolean logical_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_EXPRESSION, "<logical expression>");
    r = relational_expression(b, l + 1);
    r = r && logical_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (logical_op relational_expression)*
  private static boolean logical_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!logical_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "logical_expression_1", c)) break;
    }
    return true;
  }

  // logical_op relational_expression
  private static boolean logical_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_op(b, l + 1);
    r = r && relational_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AND_OP | OR_OP
  public static boolean logical_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_op")) return false;
    if (!nextTokenIs(b, "<logical op>", AND_OP, OR_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OP, "<logical op>");
    r = consumeToken(b, AND_OP);
    if (!r) r = consumeToken(b, OR_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type? (CT_IDENT | IDENT)
  public static boolean macro_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_ARGUMENT, "<macro argument>");
    r = macro_argument_0(b, l + 1);
    r = r && macro_argument_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type?
  private static boolean macro_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument_0")) return false;
    type(b, l + 1);
    return true;
  }

  // CT_IDENT | IDENT
  private static boolean macro_argument_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument_1")) return false;
    boolean r;
    r = consumeToken(b, CT_IDENT);
    if (!r) r = consumeToken(b, IDENT);
    return r;
  }

  /* ********************************************************** */
  // macro_argument (',' macro_argument)*
  public static boolean macro_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_ARGUMENT_LIST, "<macro argument list>");
    r = macro_argument(b, l + 1);
    r = r && macro_argument_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (',' macro_argument)*
  private static boolean macro_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!macro_argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "macro_argument_list_1", c)) break;
    }
    return true;
  }

  // ',' macro_argument
  private static boolean macro_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && macro_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MACRO_KW type? IDENT LP macro_argument_list? RP compound_statement
  public static boolean macro_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration")) return false;
    if (!nextTokenIs(b, MACRO_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MACRO_KW);
    r = r && macro_declaration_1(b, l + 1);
    r = r && consumeTokens(b, 0, IDENT, LP);
    r = r && macro_declaration_4(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, MACRO_DECLARATION, r);
    return r;
  }

  // type?
  private static boolean macro_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration_1")) return false;
    type(b, l + 1);
    return true;
  }

  // macro_argument_list?
  private static boolean macro_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_declaration_4")) return false;
    macro_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // MODULE_KW import_path (LP module_params RP)? EOS
  public static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    if (!nextTokenIs(b, MODULE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE_KW);
    r = r && import_path(b, l + 1);
    r = r && module_2(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, MODULE, r);
    return r;
  }

  // (LP module_params RP)?
  private static boolean module_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2")) return false;
    module_2_0(b, l + 1);
    return true;
  }

  // LP module_params RP
  private static boolean module_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && module_params(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CT_IDENT | HASH_IDENT | TYPE_IDENT | CT_TYPE_IDENT | IDENT
  public static boolean module_param(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_param")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_PARAM, "<module param>");
    r = consumeToken(b, CT_IDENT);
    if (!r) r = consumeToken(b, HASH_IDENT);
    if (!r) r = consumeToken(b, TYPE_IDENT);
    if (!r) r = consumeToken(b, CT_TYPE_IDENT);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // module_param (COMMA module_param)*
  public static boolean module_params(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_params")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_PARAMS, "<module params>");
    r = module_param(b, l + 1);
    r = r && module_params_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA module_param)*
  private static boolean module_params_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_params_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!module_params_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_params_1", c)) break;
    }
    return true;
  }

  // COMMA module_param
  private static boolean module_params_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_params_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && module_param(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary_expression (multiplicative_op unary_expression)*
  public static boolean multiplicative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_EXPRESSION, "<multiplicative expression>");
    r = unary_expression(b, l + 1);
    r = r && multiplicative_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (multiplicative_op unary_expression)*
  private static boolean multiplicative_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicative_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_expression_1", c)) break;
    }
    return true;
  }

  // multiplicative_op unary_expression
  private static boolean multiplicative_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative_op(b, l + 1);
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STAR | MULT_MOD | DIV_OP | MOD_OP
  public static boolean multiplicative_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE_OP, "<multiplicative op>");
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, MULT_MOD);
    if (!r) r = consumeToken(b, DIV_OP);
    if (!r) r = consumeToken(b, MOD_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type (IDENT (EQ initializer)?)?
  public static boolean param_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAM_DECLARATION, "<param declaration>");
    r = type(b, l + 1);
    p = r; // pin = 1
    r = r && param_declaration_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (IDENT (EQ initializer)?)?
  private static boolean param_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1")) return false;
    param_declaration_1_0(b, l + 1);
    return true;
  }

  // IDENT (EQ initializer)?
  private static boolean param_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && param_declaration_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EQ initializer)?
  private static boolean param_declaration_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1_0_1")) return false;
    param_declaration_1_0_1_0(b, l + 1);
    return true;
  }

  // EQ initializer
  private static boolean param_declaration_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_declaration_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // param_declaration (COMMA param_declaration)*
  public static boolean parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_LIST, "<parameter list>");
    r = param_declaration(b, l + 1);
    r = r && parameter_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA param_declaration)*
  private static boolean parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_list_1", c)) break;
    }
    return true;
  }

  // COMMA param_declaration
  private static boolean parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && param_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LP (parameter_list (',' type? ELLIPSIS)?)? RP
  public static boolean parameter_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list")) return false;
    if (!nextTokenIs(b, LP)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER_TYPE_LIST, null);
    r = consumeToken(b, LP);
    p = r; // pin = 1
    r = r && report_error_(b, parameter_type_list_1(b, l + 1));
    r = p && consumeToken(b, RP) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (parameter_list (',' type? ELLIPSIS)?)?
  private static boolean parameter_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list_1")) return false;
    parameter_type_list_1_0(b, l + 1);
    return true;
  }

  // parameter_list (',' type? ELLIPSIS)?
  private static boolean parameter_type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_list(b, l + 1);
    r = r && parameter_type_list_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type? ELLIPSIS)?
  private static boolean parameter_type_list_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list_1_0_1")) return false;
    parameter_type_list_1_0_1_0(b, l + 1);
    return true;
  }

  // ',' type? ELLIPSIS
  private static boolean parameter_type_list_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && parameter_type_list_1_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean parameter_type_list_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_type_list_1_0_1_0_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (IDENT DOT)+
  public static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = path_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!path_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "path", c)) break;
    }
    exit_section_(b, m, PATH, r);
    return r;
  }

  // IDENT DOT
  private static boolean path_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENT, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_expression postfix_op*
  public static boolean postfix_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXPRESSION, "<postfix expression>");
    r = primary_expression(b, l + 1);
    r = r && postfix_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postfix_op*
  private static boolean postfix_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!postfix_op(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postfix_expression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LB expression RB
  //     | LP argument_expression_list? RP
  //     | DOT IDENT
  //     | INC_OP
  //     | DEC_OP
  public static boolean postfix_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_OP, "<postfix op>");
    r = postfix_op_0(b, l + 1);
    if (!r) r = postfix_op_1(b, l + 1);
    if (!r) r = parseTokens(b, 0, DOT, IDENT);
    if (!r) r = consumeToken(b, INC_OP);
    if (!r) r = consumeToken(b, DEC_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LB expression RB
  private static boolean postfix_op_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_op_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // LP argument_expression_list? RP
  private static boolean postfix_op_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_op_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && postfix_op_1_1(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  // argument_expression_list?
  private static boolean postfix_op_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_op_1_1")) return false;
    argument_expression_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // constant
  //     | STRING_LITERAL
  //     | NULL_KW
  //     | path? ident_expression
  //     | base_type initializer_list
  //     | grouped_expression
  //     | type DOT (IDENT | TYPEID)
  //     | LP type RP (IDENT | TYPEID)
  //     | FN_BLOCK_START statement_list FN_BLOCK_END
  //     | CAST_KW LP expression AS_KW type RP
  public static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPRESSION, "<primary expression>");
    r = constant(b, l + 1);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, NULL_KW);
    if (!r) r = primary_expression_3(b, l + 1);
    if (!r) r = primary_expression_4(b, l + 1);
    if (!r) r = grouped_expression(b, l + 1);
    if (!r) r = primary_expression_6(b, l + 1);
    if (!r) r = primary_expression_7(b, l + 1);
    if (!r) r = primary_expression_8(b, l + 1);
    if (!r) r = primary_expression_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // path? ident_expression
  private static boolean primary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_expression_3_0(b, l + 1);
    r = r && ident_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // path?
  private static boolean primary_expression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_3_0")) return false;
    path(b, l + 1);
    return true;
  }

  // base_type initializer_list
  private static boolean primary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = base_type(b, l + 1);
    r = r && initializer_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type DOT (IDENT | TYPEID)
  private static boolean primary_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && primary_expression_6_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENT | TYPEID
  private static boolean primary_expression_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_6_2")) return false;
    boolean r;
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, TYPEID);
    return r;
  }

  // LP type RP (IDENT | TYPEID)
  private static boolean primary_expression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LP);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && primary_expression_7_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENT | TYPEID
  private static boolean primary_expression_7_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_7_3")) return false;
    boolean r;
    r = consumeToken(b, IDENT);
    if (!r) r = consumeToken(b, TYPEID);
    return r;
  }

  // FN_BLOCK_START statement_list FN_BLOCK_END
  private static boolean primary_expression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FN_BLOCK_START);
    r = r && statement_list(b, l + 1);
    r = r && consumeToken(b, FN_BLOCK_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // CAST_KW LP expression AS_KW type RP
  private static boolean primary_expression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CAST_KW, LP);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, AS_KW);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, RP);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // additive_expression (relational_op additive_expression)*
  public static boolean relational_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXPRESSION, "<relational expression>");
    r = additive_expression(b, l + 1);
    r = r && relational_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (relational_op additive_expression)*
  private static boolean relational_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!relational_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "relational_expression_1", c)) break;
    }
    return true;
  }

  // relational_op additive_expression
  private static boolean relational_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_op(b, l + 1);
    r = r && additive_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LT_OP | GT_OP | LE_OP | GE_OP | EQ_OP | NE_OP
  public static boolean relational_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OP, "<relational op>");
    r = consumeToken(b, LT_OP);
    if (!r) r = consumeToken(b, GT_OP);
    if (!r) r = consumeToken(b, LE_OP);
    if (!r) r = consumeToken(b, GE_OP);
    if (!r) r = consumeToken(b, EQ_OP);
    if (!r) r = consumeToken(b, NE_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SWITCH_KW LP decl_expr_list RP compound_statement
  //     | IF_KW LP decl_expr_list RP compound_statement (ELSE_KW compound_statement)?
  public static boolean selection_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement")) return false;
    if (!nextTokenIs(b, "<selection statement>", IF_KW, SWITCH_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTION_STATEMENT, "<selection statement>");
    r = selection_statement_0(b, l + 1);
    if (!r) r = selection_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SWITCH_KW LP decl_expr_list RP compound_statement
  private static boolean selection_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SWITCH_KW, LP);
    r = r && decl_expr_list(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IF_KW LP decl_expr_list RP compound_statement (ELSE_KW compound_statement)?
  private static boolean selection_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF_KW, LP);
    r = r && decl_expr_list(b, l + 1);
    r = r && consumeToken(b, RP);
    r = r && compound_statement(b, l + 1);
    r = r && selection_statement_1_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ELSE_KW compound_statement)?
  private static boolean selection_statement_1_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement_1_5")) return false;
    selection_statement_1_5_0(b, l + 1);
    return true;
  }

  // ELSE_KW compound_statement
  private static boolean selection_statement_1_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement_1_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KW);
    r = r && compound_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // multiplicative_expression (shift_op multiplicative_expression)*
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = multiplicative_expression(b, l + 1);
    r = r && shift_expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (shift_op multiplicative_expression)*
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!shift_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "shift_expression_1", c)) break;
    }
    return true;
  }

  // shift_op multiplicative_expression
  private static boolean shift_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_op(b, l + 1);
    r = r && multiplicative_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_OP | RIGHT_OP
  public static boolean shift_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_op")) return false;
    if (!nextTokenIs(b, "<shift op>", LEFT_OP, RIGHT_OP)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_OP, "<shift op>");
    r = consumeToken(b, LEFT_OP);
    if (!r) r = consumeToken(b, RIGHT_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT (AS IDENT)?
  //     | CONST_IDENT (AS CONST_IDENT)?
  //     | TYPE_IDENT (AS TYPE_IDENT)?
  //     | AT IDENT (AS AT IDENT)?
  public static boolean specified_import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIFIED_IMPORT, "<specified import>");
    r = specified_import_0(b, l + 1);
    if (!r) r = specified_import_1(b, l + 1);
    if (!r) r = specified_import_2(b, l + 1);
    if (!r) r = specified_import_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENT (AS IDENT)?
  private static boolean specified_import_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    r = r && specified_import_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS IDENT)?
  private static boolean specified_import_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_0_1")) return false;
    specified_import_0_1_0(b, l + 1);
    return true;
  }

  // AS IDENT
  private static boolean specified_import_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONST_IDENT (AS CONST_IDENT)?
  private static boolean specified_import_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST_IDENT);
    r = r && specified_import_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS CONST_IDENT)?
  private static boolean specified_import_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_1_1")) return false;
    specified_import_1_1_0(b, l + 1);
    return true;
  }

  // AS CONST_IDENT
  private static boolean specified_import_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, CONST_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // TYPE_IDENT (AS TYPE_IDENT)?
  private static boolean specified_import_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE_IDENT);
    r = r && specified_import_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS TYPE_IDENT)?
  private static boolean specified_import_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_2_1")) return false;
    specified_import_2_1_0(b, l + 1);
    return true;
  }

  // AS TYPE_IDENT
  private static boolean specified_import_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, TYPE_IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // AT IDENT (AS AT IDENT)?
  private static boolean specified_import_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT, IDENT);
    r = r && specified_import_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS AT IDENT)?
  private static boolean specified_import_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_3_2")) return false;
    specified_import_3_2_0(b, l + 1);
    return true;
  }

  // AS AT IDENT
  private static boolean specified_import_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, AT, IDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // specified_import (COMMA specified_import)*
  public static boolean specified_import_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPECIFIED_IMPORT_LIST, "<specified import list>");
    r = specified_import(b, l + 1);
    r = r && specified_import_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA specified_import)*
  private static boolean specified_import_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!specified_import_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specified_import_list_1", c)) break;
    }
    return true;
  }

  // COMMA specified_import
  private static boolean specified_import_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specified_import_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && specified_import(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // compound_statement
  //     | labelled_statement
  //     | expression_statement
  //     | selection_statement
  //     | iteration_statement
  //     | jump_statement
  //     | declaration_statement
  //     | catch_statement
  //     | try_statement
  //     | defer_statement
  //     | ct_stmt
  //     | EOS
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = compound_statement(b, l + 1);
    if (!r) r = labelled_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = selection_statement(b, l + 1);
    if (!r) r = iteration_statement(b, l + 1);
    if (!r) r = jump_statement(b, l + 1);
    if (!r) r = declaration_statement(b, l + 1);
    if (!r) r = catch_statement(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = defer_statement(b, l + 1);
    if (!r) r = ct_stmt(b, l + 1);
    if (!r) r = consumeToken(b, EOS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement+
  public static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_LIST, "<statement list>");
    r = statement(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_list", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBR struct_declaration_list RBR
  public static boolean struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body")) return false;
    if (!nextTokenIs(b, LBR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBR);
    r = r && struct_declaration_list(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, STRUCT_BODY, r);
    return r;
  }

  /* ********************************************************** */
  // struct_or_union TYPE_IDENT attributes? struct_body
  public static boolean struct_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration")) return false;
    if (!nextTokenIs(b, "<struct declaration>", STRUCT_KW, UNION_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION, "<struct declaration>");
    r = struct_or_union(b, l + 1);
    r = r && consumeToken(b, TYPE_IDENT);
    r = r && struct_declaration_2(b, l + 1);
    r = r && struct_body(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attributes?
  private static boolean struct_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_2")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  /* ********************************************************** */
  // struct_member_declaration*
  public static boolean struct_declaration_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATION_LIST, "<struct declaration list>");
    while (true) {
      int c = current_position_(b);
      if (!struct_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_declaration_list", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // type identifier_list attributes? EOS
  //     | struct_or_union IDENT attributes? struct_body
  //     | struct_or_union attributes? struct_body
  public static boolean struct_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_MEMBER_DECLARATION, "<struct member declaration>");
    r = struct_member_declaration_0(b, l + 1);
    if (!r) r = struct_member_declaration_1(b, l + 1);
    if (!r) r = struct_member_declaration_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type identifier_list attributes? EOS
  private static boolean struct_member_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && identifier_list(b, l + 1);
    r = r && struct_member_declaration_0_2(b, l + 1);
    r = r && consumeToken(b, EOS);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean struct_member_declaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_0_2")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  // struct_or_union IDENT attributes? struct_body
  private static boolean struct_member_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_or_union(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && struct_member_declaration_1_2(b, l + 1);
    r = r && struct_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean struct_member_declaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_1_2")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  // struct_or_union attributes? struct_body
  private static boolean struct_member_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_or_union(b, l + 1);
    r = r && struct_member_declaration_2_1(b, l + 1);
    r = r && struct_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // attributes?
  private static boolean struct_member_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration_2_1")) return false;
    consumeToken(b, ATTRIBUTES);
    return true;
  }

  /* ********************************************************** */
  // STRUCT_KW | UNION_KW
  public static boolean struct_or_union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union")) return false;
    if (!nextTokenIs(b, "<struct or union>", STRUCT_KW, UNION_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_OR_UNION, "<struct or union>");
    r = consumeToken(b, STRUCT_KW);
    if (!r) r = consumeToken(b, UNION_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (CTDEFAULT_KW | CTCASE_KW type_list) COLON top_level_statement*
  public static boolean tl_ct_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_case")) return false;
    if (!nextTokenIs(b, "<tl ct case>", CTCASE_KW, CTDEFAULT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TL_CT_CASE, "<tl ct case>");
    r = tl_ct_case_0(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && tl_ct_case_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CTDEFAULT_KW | CTCASE_KW type_list
  private static boolean tl_ct_case_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_case_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTDEFAULT_KW);
    if (!r) r = tl_ct_case_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CTCASE_KW type_list
  private static boolean tl_ct_case_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_case_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTCASE_KW);
    r = r && type_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // top_level_statement*
  private static boolean tl_ct_case_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_case_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tl_ct_case_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (ct_elif top_level_block)*
  public static boolean tl_ct_elif_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_elif_body")) return false;
    Marker m = enter_section_(b, l, _NONE_, TL_CT_ELIF_BODY, "<tl ct elif body>");
    while (true) {
      int c = current_position_(b);
      if (!tl_ct_elif_body_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tl_ct_elif_body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // ct_elif top_level_block
  private static boolean tl_ct_elif_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_elif_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ct_elif(b, l + 1);
    r = r && top_level_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tl_ct_elif_body (CTELSE_KW top_level_block)?
  public static boolean tl_ct_else_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_else_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TL_CT_ELSE_BODY, "<tl ct else body>");
    r = tl_ct_elif_body(b, l + 1);
    r = r && tl_ct_else_body_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (CTELSE_KW top_level_block)?
  private static boolean tl_ct_else_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_else_body_1")) return false;
    tl_ct_else_body_1_0(b, l + 1);
    return true;
  }

  // CTELSE_KW top_level_block
  private static boolean tl_ct_else_body_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_else_body_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CTELSE_KW);
    r = r && top_level_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // tl_ct_case+
  public static boolean tl_ct_switch_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tl_ct_switch_body")) return false;
    if (!nextTokenIs(b, "<tl ct switch body>", CTCASE_KW, CTDEFAULT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TL_CT_SWITCH_BODY, "<tl ct switch body>");
    r = tl_ct_case(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!tl_ct_case(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tl_ct_switch_body", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global_declaration
  //     | const_declaration
  //     | external_func_declaration
  //     | func_definition
  //     | conditional_compilation
  //     | struct_declaration
  //     | attribute_declaration
  //     | enum_declaration
  //     | error_declaration
  //     | macro_declaration
  //     | generics_declaration
  //     | typedef_declaration
  public static boolean top_level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL, "<top level>");
    r = global_declaration(b, l + 1);
    if (!r) r = const_declaration(b, l + 1);
    if (!r) r = external_func_declaration(b, l + 1);
    if (!r) r = func_definition(b, l + 1);
    if (!r) r = conditional_compilation(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = consumeToken(b, ATTRIBUTE_DECLARATION);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = error_declaration(b, l + 1);
    if (!r) r = macro_declaration(b, l + 1);
    if (!r) r = consumeToken(b, GENERICS_DECLARATION);
    if (!r) r = typedef_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBR top_level_statement* RBR
  public static boolean top_level_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_block")) return false;
    if (!nextTokenIs(b, LBR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBR);
    r = r && top_level_block_1(b, l + 1);
    r = r && consumeToken(b, RBR);
    exit_section_(b, m, TOP_LEVEL_BLOCK, r);
    return r;
  }

  // top_level_statement*
  private static boolean top_level_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "top_level_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // visibility? top_level
  public static boolean top_level_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOP_LEVEL_STATEMENT, "<top level statement>");
    r = top_level_statement_0(b, l + 1);
    r = r && top_level(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // visibility?
  private static boolean top_level_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "top_level_statement_0")) return false;
    visibility(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // module? import_decl* top_level_statement*
  static boolean translation_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = translation_unit_0(b, l + 1);
    r = r && translation_unit_1(b, l + 1);
    r = r && translation_unit_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // module?
  private static boolean translation_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit_0")) return false;
    module(b, l + 1);
    return true;
  }

  // import_decl*
  private static boolean translation_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!import_decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "translation_unit_1", c)) break;
    }
    return true;
  }

  // top_level_statement*
  private static boolean translation_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!top_level_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "translation_unit_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TRY_KW (selection_statement | iteration_statement | jump_statement)
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    if (!nextTokenIs(b, TRY_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY_KW);
    r = r && try_statement_1(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // selection_statement | iteration_statement | jump_statement
  private static boolean try_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_1")) return false;
    boolean r;
    r = selection_statement(b, l + 1);
    if (!r) r = iteration_statement(b, l + 1);
    if (!r) r = jump_statement(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // base_type type_suffix*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = base_type(b, l + 1);
    r = r && type_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_suffix*
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_suffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // type (COMMA type)*
  public static boolean type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = type(b, l + 1);
    r = r && type_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA type)*
  private static boolean type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_list_1", c)) break;
    }
    return true;
  }

  // COMMA type
  private static boolean type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STAR | LB (constant_expression | ADD_OP)? RB
  public static boolean type_suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_suffix")) return false;
    if (!nextTokenIs(b, "<type suffix>", LB, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SUFFIX, "<type suffix>");
    r = consumeToken(b, STAR);
    if (!r) r = type_suffix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LB (constant_expression | ADD_OP)? RB
  private static boolean type_suffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_suffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && type_suffix_1_1(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // (constant_expression | ADD_OP)?
  private static boolean type_suffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_suffix_1_1")) return false;
    type_suffix_1_1_0(b, l + 1);
    return true;
  }

  // constant_expression | ADD_OP
  private static boolean type_suffix_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_suffix_1_1_0")) return false;
    boolean r;
    r = constant_expression(b, l + 1);
    if (!r) r = consumeToken(b, ADD_OP);
    return r;
  }

  /* ********************************************************** */
  // TYPEDEF_KW (type | func_typedef) AS TYPE_IDENT EOS
  public static boolean typedef_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_declaration")) return false;
    if (!nextTokenIs(b, TYPEDEF_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPEDEF_KW);
    r = r && typedef_declaration_1(b, l + 1);
    r = r && consumeTokens(b, 0, AS, TYPE_IDENT, EOS);
    exit_section_(b, m, TYPEDEF_DECLARATION, r);
    return r;
  }

  // type | func_typedef
  private static boolean typedef_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_declaration_1")) return false;
    boolean r;
    r = type(b, l + 1);
    if (!r) r = func_typedef(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // unary_op* postfix_expression
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXPRESSION, "<unary expression>");
    r = unary_expression_0(b, l + 1);
    r = r && postfix_expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unary_op*
  private static boolean unary_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!unary_op(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "unary_expression_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AMP | STAR | ADD_OP | SUB_OP | NEG_MOD | BIT_NEG | BANG | AT | INC_OP | DEC_OP
  public static boolean unary_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OP, "<unary op>");
    r = consumeToken(b, AMP);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, ADD_OP);
    if (!r) r = consumeToken(b, SUB_OP);
    if (!r) r = consumeToken(b, NEG_MOD);
    if (!r) r = consumeToken(b, BIT_NEG);
    if (!r) r = consumeToken(b, BANG);
    if (!r) r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, INC_OP);
    if (!r) r = consumeToken(b, DEC_OP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LOCAL_KW PUBLIC_KW? | PUBLIC_KW LOCAL_KW?
  public static boolean visibility(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility")) return false;
    if (!nextTokenIs(b, "<visibility>", LOCAL_KW, PUBLIC_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VISIBILITY, "<visibility>");
    r = visibility_0(b, l + 1);
    if (!r) r = visibility_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOCAL_KW PUBLIC_KW?
  private static boolean visibility_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCAL_KW);
    r = r && visibility_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PUBLIC_KW?
  private static boolean visibility_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_0_1")) return false;
    consumeToken(b, PUBLIC_KW);
    return true;
  }

  // PUBLIC_KW LOCAL_KW?
  private static boolean visibility_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUBLIC_KW);
    r = r && visibility_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL_KW?
  private static boolean visibility_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "visibility_1_1")) return false;
    consumeToken(b, LOCAL_KW);
    return true;
  }

}
