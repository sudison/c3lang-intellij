// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3MacroDeclaration extends PsiElement {

  @NotNull
  C3CompoundStatement getCompoundStatement();

  @Nullable
  C3MacroArgumentList getMacroArgumentList();

  @Nullable
  C3Type getType();

}
