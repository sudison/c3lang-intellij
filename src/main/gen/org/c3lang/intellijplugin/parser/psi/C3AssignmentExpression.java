// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3AssignmentExpression extends PsiElement {

  @NotNull
  List<C3AssignmentExpression> getAssignmentExpressionList();

  @NotNull
  List<C3AssignmentOp> getAssignmentOpList();

  @Nullable
  C3ErrorExpression getErrorExpression();

  @NotNull
  List<C3InitializerList> getInitializerListList();

  @Nullable
  C3UnaryExpression getUnaryExpression();

}
