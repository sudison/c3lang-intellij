// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3PrimaryExpression extends PsiElement {

  @Nullable
  C3BaseType getBaseType();

  @Nullable
  C3Constant getConstant();

  @Nullable
  C3Expression getExpression();

  @Nullable
  C3GroupedExpression getGroupedExpression();

  @Nullable
  C3IdentExpression getIdentExpression();

  @Nullable
  C3InitializerList getInitializerList();

  @Nullable
  C3Path getPath();

  @Nullable
  C3StatementList getStatementList();

  @Nullable
  C3Type getType();

}
