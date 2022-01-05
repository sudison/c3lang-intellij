// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3Statement extends PsiElement {

  @Nullable
  C3CatchStatement getCatchStatement();

  @Nullable
  C3CompoundStatement getCompoundStatement();

  @Nullable
  C3CtStmt getCtStmt();

  @Nullable
  C3DeclarationStatement getDeclarationStatement();

  @Nullable
  C3DeferStatement getDeferStatement();

  @Nullable
  C3ExpressionStatement getExpressionStatement();

  @Nullable
  C3IterationStatement getIterationStatement();

  @Nullable
  C3JumpStatement getJumpStatement();

  @Nullable
  C3LabelledStatement getLabelledStatement();

  @Nullable
  C3SelectionStatement getSelectionStatement();

  @Nullable
  C3TryStatement getTryStatement();

}
