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

public class C3AssignmentExpressionImpl extends ASTWrapperPsiElement implements C3AssignmentExpression {

  public C3AssignmentExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitAssignmentExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<C3AssignmentOp> getAssignmentOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3AssignmentOp.class);
  }

  @Override
  @NotNull
  public List<C3ErrorExpression> getErrorExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3ErrorExpression.class);
  }

  @Override
  @NotNull
  public List<C3InitializerList> getInitializerListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3InitializerList.class);
  }

  @Override
  @NotNull
  public C3UnaryExpression getUnaryExpression() {
    return findNotNullChildByClass(C3UnaryExpression.class);
  }

}
