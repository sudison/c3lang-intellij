// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3MultiplicativeExpression extends PsiElement {

  @NotNull
  List<C3MultiplicativeOp> getMultiplicativeOpList();

  @NotNull
  List<C3UnaryExpression> getUnaryExpressionList();

}
