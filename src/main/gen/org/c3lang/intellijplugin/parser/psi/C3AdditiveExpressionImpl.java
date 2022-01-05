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

public class C3AdditiveExpressionImpl extends ASTWrapperPsiElement implements C3AdditiveExpression {

  public C3AdditiveExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitAdditiveExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<C3AdditiveOp> getAdditiveOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3AdditiveOp.class);
  }

  @Override
  @NotNull
  public List<C3BitExpression> getBitExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3BitExpression.class);
  }

}
