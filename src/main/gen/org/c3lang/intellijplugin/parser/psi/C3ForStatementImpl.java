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

public class C3ForStatementImpl extends ASTWrapperPsiElement implements C3ForStatement {

  public C3ForStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitForStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3DeclExprList getDeclExprList() {
    return findChildByClass(C3DeclExprList.class);
  }

  @Override
  @Nullable
  public C3ExpressionList getExpressionList() {
    return findChildByClass(C3ExpressionList.class);
  }

  @Override
  @Nullable
  public C3ExpressionStatement getExpressionStatement() {
    return findChildByClass(C3ExpressionStatement.class);
  }

  @Override
  @Nullable
  public C3Statement getStatement() {
    return findChildByClass(C3Statement.class);
  }

}
