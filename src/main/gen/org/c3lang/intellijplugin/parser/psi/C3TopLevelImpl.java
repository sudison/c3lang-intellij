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

public class C3TopLevelImpl extends ASTWrapperPsiElement implements C3TopLevel {

  public C3TopLevelImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull C3Visitor visitor) {
    visitor.visitTopLevel(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof C3Visitor) accept((C3Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public C3ConditionalCompilation getConditionalCompilation() {
    return findChildByClass(C3ConditionalCompilation.class);
  }

  @Override
  @Nullable
  public C3ConstDeclaration getConstDeclaration() {
    return findChildByClass(C3ConstDeclaration.class);
  }

  @Override
  @Nullable
  public C3EnumDeclaration getEnumDeclaration() {
    return findChildByClass(C3EnumDeclaration.class);
  }

  @Override
  @Nullable
  public C3ErrorDeclaration getErrorDeclaration() {
    return findChildByClass(C3ErrorDeclaration.class);
  }

  @Override
  @Nullable
  public C3FuncDefinition getFuncDefinition() {
    return findChildByClass(C3FuncDefinition.class);
  }

  @Override
  @Nullable
  public C3GlobalDeclaration getGlobalDeclaration() {
    return findChildByClass(C3GlobalDeclaration.class);
  }

  @Override
  @Nullable
  public C3MacroDeclaration getMacroDeclaration() {
    return findChildByClass(C3MacroDeclaration.class);
  }

  @Override
  @Nullable
  public C3StructDeclaration getStructDeclaration() {
    return findChildByClass(C3StructDeclaration.class);
  }

  @Override
  @Nullable
  public C3TypedefDeclaration getTypedefDeclaration() {
    return findChildByClass(C3TypedefDeclaration.class);
  }

}
