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

public class C3PathExpressionImpl extends ASTWrapperPsiElement implements C3PathExpression {

  public C3PathExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitPathExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public C3IdentExpression getIdentExpression() {
    return findNotNullChildByClass(C3IdentExpression.class);
  }

  @Override
  @NotNull
  public List<C3Pathd> getPathdList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, C3Pathd.class);
  }

}
