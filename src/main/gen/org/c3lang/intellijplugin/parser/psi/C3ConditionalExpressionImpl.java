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

public class C3ConditionalExpressionImpl extends ASTWrapperPsiElement implements C3ConditionalExpression {

  public C3ConditionalExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitConditionalExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<C3Expression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3Expression.class);
  }

  @Override
  @NotNull
  public List<C3LogicalExpression> getLogicalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3LogicalExpression.class);
  }

}
