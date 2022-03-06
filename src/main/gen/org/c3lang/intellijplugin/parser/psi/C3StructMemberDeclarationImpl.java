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

public class C3StructMemberDeclarationImpl extends ASTWrapperPsiElement implements C3StructMemberDeclaration {

  public C3StructMemberDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitStructMemberDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3StructBody getStructBody() {
    return findChildByClass(C3StructBody.class);
  }

  @Override
  @Nullable
  public C3StructMemberDeclarationType getStructMemberDeclarationType() {
    return findChildByClass(C3StructMemberDeclarationType.class);
  }

  @Override
  @Nullable
  public C3StructOrUnion getStructOrUnion() {
    return findChildByClass(C3StructOrUnion.class);
  }

}
