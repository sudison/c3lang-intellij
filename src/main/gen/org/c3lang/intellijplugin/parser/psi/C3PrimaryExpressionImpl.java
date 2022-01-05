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

public class C3PrimaryExpressionImpl extends ASTWrapperPsiElement implements C3PrimaryExpression {

  public C3PrimaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitPrimaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3BaseType getBaseType() {
    return findChildByClass(C3BaseType.class);
  }

  @Override
  @Nullable
  public C3Constant getConstant() {
    return findChildByClass(C3Constant.class);
  }

  @Override
  @Nullable
  public C3Expression getExpression() {
    return findChildByClass(C3Expression.class);
  }

  @Override
  @Nullable
  public C3GroupedExpression getGroupedExpression() {
    return findChildByClass(C3GroupedExpression.class);
  }

  @Override
  @Nullable
  public C3IdentExpression getIdentExpression() {
    return findChildByClass(C3IdentExpression.class);
  }

  @Override
  @Nullable
  public C3InitializerList getInitializerList() {
    return findChildByClass(C3InitializerList.class);
  }

  @Override
  @Nullable
  public C3Path getPath() {
    return findChildByClass(C3Path.class);
  }

  @Override
  @Nullable
  public C3StatementList getStatementList() {
    return findChildByClass(C3StatementList.class);
  }

  @Override
  @Nullable
  public C3Type getType() {
    return findChildByClass(C3Type.class);
  }

}
