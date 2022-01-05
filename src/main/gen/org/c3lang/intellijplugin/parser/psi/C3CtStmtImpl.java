// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.c3lang.intellijplugin.parser.psi.C3Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class C3CtStmtImpl extends ASTWrapperPsiElement implements C3CtStmt {

  public C3CtStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitCtStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3CompoundStatement getCompoundStatement() {
    return findChildByClass(C3CompoundStatement.class);
  }

  @Override
  @Nullable
  public C3CtElseBody getCtElseBody() {
    return findChildByClass(C3CtElseBody.class);
  }

  @Override
  @Nullable
  public C3CtForStmt getCtForStmt() {
    return findChildByClass(C3CtForStmt.class);
  }

  @Override
  @Nullable
  public C3CtIf getCtIf() {
    return findChildByClass(C3CtIf.class);
  }

  @Override
  @Nullable
  public C3CtSwitch getCtSwitch() {
    return findChildByClass(C3CtSwitch.class);
  }

  @Override
  @Nullable
  public C3CtSwitchBody getCtSwitchBody() {
    return findChildByClass(C3CtSwitchBody.class);
  }

}
