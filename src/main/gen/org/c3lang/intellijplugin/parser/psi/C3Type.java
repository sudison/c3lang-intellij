// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3Type extends PsiElement {

  @NotNull
  C3BaseType getBaseType();

  @NotNull
  List<C3TypeSuffix> getTypeSuffixList();

}
