// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface C3CtStmt extends PsiElement {

  @Nullable
  C3CompoundStatement getCompoundStatement();

  @Nullable
  C3CtElseBody getCtElseBody();

  @Nullable
  C3CtForStmt getCtForStmt();

  @Nullable
  C3CtIf getCtIf();

  @Nullable
  C3CtSwitch getCtSwitch();

  @Nullable
  C3CtSwitchBody getCtSwitchBody();

}
