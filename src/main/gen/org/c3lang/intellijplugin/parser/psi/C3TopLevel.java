// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3TopLevel extends PsiElement {

  @Nullable
  C3ConditionalCompilation getConditionalCompilation();

  @Nullable
  C3ConstDeclaration getConstDeclaration();

  @Nullable
  C3EnumDeclaration getEnumDeclaration();

  @Nullable
  C3ErrorDeclaration getErrorDeclaration();

  @Nullable
  C3FuncDefinition getFuncDefinition();

  @Nullable
  C3GlobalDeclaration getGlobalDeclaration();

  @Nullable
  C3MacroDeclaration getMacroDeclaration();

  @Nullable
  C3StructDeclaration getStructDeclaration();

  @Nullable
  C3TypedefDeclaration getTypedefDeclaration();

}
