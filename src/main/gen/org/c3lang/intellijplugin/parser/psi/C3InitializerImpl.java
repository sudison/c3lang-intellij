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

public class C3InitializerImpl extends ASTWrapperPsiElement implements C3Initializer {

  public C3InitializerImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitInitializer(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3Expression getExpression() {
    return findChildByClass(C3Expression.class);
  }

  @Override
  @Nullable
  public C3InitializerList getInitializerList() {
    return findChildByClass(C3InitializerList.class);
  }

}
