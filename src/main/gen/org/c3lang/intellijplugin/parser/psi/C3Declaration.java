// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNameIdentifierOwner;

public interface C3Declaration extends PsiNameIdentifierOwner {

  @NotNull
  C3FailableType getFailableType();

  @Nullable
  C3Initializer getInitializer();

}
