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

public class C3ImportDeclImpl extends ASTWrapperPsiElement implements C3ImportDecl {

  public C3ImportDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitImportDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public C3ImportPath getImportPath() {
    return findNotNullChildByClass(C3ImportPath.class);
  }

  @Override
  @Nullable
  public C3SpecifiedImportList getSpecifiedImportList() {
    return findChildByClass(C3SpecifiedImportList.class);
  }

}
