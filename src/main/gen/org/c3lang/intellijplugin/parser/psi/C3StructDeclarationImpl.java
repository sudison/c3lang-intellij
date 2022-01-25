// This is a generated file. Not intended for manual editing.
package org.c3lang.intellijplugin.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.c3lang.intellijplugin.parser.psi.C3Types.*;
import org.c3lang.intellijplugin.reference.C3StructMixin;

public class C3StructDeclarationImpl extends C3StructMixin implements C3StructDeclaration {

  public C3StructDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitStructDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public C3StructBody getStructBody() {
    return findNotNullChildByClass(C3StructBody.class);
  }

  @Override
  @NotNull
  public C3StructOrUnion getStructOrUnion() {
    return findNotNullChildByClass(C3StructOrUnion.class);
  }

}
