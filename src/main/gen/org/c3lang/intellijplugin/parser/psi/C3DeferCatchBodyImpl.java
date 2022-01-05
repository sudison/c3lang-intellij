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

public class C3DeferCatchBodyImpl extends ASTWrapperPsiElement implements C3DeferCatchBody {

  public C3DeferCatchBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitDeferCatchBody(this);
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
  public C3ExpressionStatement getExpressionStatement() {
    return findChildByClass(C3ExpressionStatement.class);
  }

  @Override
  @Nullable
  public C3IterationStatement getIterationStatement() {
    return findChildByClass(C3IterationStatement.class);
  }

  @Override
  @Nullable
  public C3JumpStatement getJumpStatement() {
    return findChildByClass(C3JumpStatement.class);
  }

  @Override
  @Nullable
  public C3SelectionStatement getSelectionStatement() {
    return findChildByClass(C3SelectionStatement.class);
  }

}
