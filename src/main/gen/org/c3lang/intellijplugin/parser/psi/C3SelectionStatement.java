// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3SelectionStatement extends PsiElement {

  @Nullable
  C3CompoundStatement getCompoundStatement();

  @NotNull
  C3DeclExprList getDeclExprList();

  @Nullable
  C3Statement getStatement();

}
