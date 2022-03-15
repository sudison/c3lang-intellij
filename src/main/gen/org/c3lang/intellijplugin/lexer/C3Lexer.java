/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.c3lang.intellijplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.c3lang.intellijplugin.parser.psi.C3Type;
import org.c3lang.intellijplugin.parser.psi.C3Types;
import org.c3lang.intellijplugin.parser.psi.C3ElementType;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>c3lang.flex</tt>
 */
class C3Lexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\13\1\12\1\26\1\27\1\26\22\0\1\13\1\63\1\25\1\0\1\11\1\65\2\0\1\54"+
    "\1\57\1\74\1\64\1\73\1\66\1\53\1\24\1\15\1\6\6\7\2\3\1\71\1\72\1\60\1\61\1"+
    "\62\1\70\1\67\1\4\1\16\4\4\10\1\1\20\10\1\1\22\2\1\1\77\1\0\1\100\1\75\1\10"+
    "\1\0\1\30\1\17\1\35\1\42\1\33\1\5\1\51\1\47\1\40\1\2\1\34\1\43\1\44\1\37\1"+
    "\21\1\45\1\52\1\32\1\31\1\36\1\41\1\14\1\46\1\23\1\50\1\2\1\55\1\76\1\56\7"+
    "\0\1\26\242\0\2\26\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\3\2\1\1\5"+
    "\1\3\1\4\1\3\1\6\1\1\20\3\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\0\1\3\1\36"+
    "\1\3\1\0\1\37\2\40\1\0\5\40\1\3\3\0"+
    "\3\3\1\41\1\0\1\42\1\43\17\3\1\44\1\45"+
    "\5\3\1\46\10\3\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63"+
    "\1\64\1\3\4\40\1\65\1\40\1\3\3\4\3\3"+
    "\1\41\13\3\1\66\3\3\1\67\17\3\1\70\1\3"+
    "\1\71\5\40\1\72\1\73\1\3\1\74\6\3\1\75"+
    "\1\76\2\3\1\77\1\100\1\101\1\3\1\102\1\103"+
    "\3\3\1\104\5\3\1\105\4\3\1\106\1\107\1\110"+
    "\1\40\1\111\1\112\1\113\1\40\1\114\2\3\1\115"+
    "\2\3\1\116\4\3\1\117\1\120\2\3\1\121\1\122"+
    "\1\3\1\123\1\3\1\124\2\40\1\125\1\126\1\127"+
    "\1\130\2\3\1\131\1\132\1\133\1\3\1\134\1\135"+
    "\1\136\1\40\1\3\1\137\1\140\1\141\1\142";

  private static int [] zzUnpackAction() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\101\0\202\0\303\0\u0104\0\u0145\0\u0186\0\u01c7"+
    "\0\101\0\u0208\0\u0249\0\u028a\0\u02cb\0\u030c\0\u034d\0\u038e"+
    "\0\u03cf\0\u0410\0\u0451\0\u0492\0\u04d3\0\u0514\0\u0555\0\u0596"+
    "\0\u05d7\0\u0618\0\u0659\0\u069a\0\u06db\0\u071c\0\u075d\0\u079e"+
    "\0\101\0\u07df\0\101\0\u0820\0\u0861\0\u08a2\0\u08e3\0\u0924"+
    "\0\101\0\u0965\0\101\0\u09a6\0\u09e7\0\101\0\101\0\101"+
    "\0\101\0\101\0\101\0\101\0\u0a28\0\u0104\0\u0a69\0\303"+
    "\0\u0aaa\0\u0186\0\u0aeb\0\u0b2c\0\u0b6d\0\u0bae\0\u0bef\0\u0c30"+
    "\0\u0c71\0\u0cb2\0\u0cf3\0\u0d34\0\u0d75\0\u0db6\0\u0df7\0\u0e38"+
    "\0\u0e79\0\u0eba\0\u0efb\0\u030c\0\u030c\0\303\0\u0f3c\0\u0f7d"+
    "\0\u0fbe\0\u0fff\0\u1040\0\u1081\0\u10c2\0\u1103\0\u1144\0\u1185"+
    "\0\u11c6\0\u1207\0\u1248\0\u1289\0\u12ca\0\303\0\u130b\0\u134c"+
    "\0\u138d\0\u13ce\0\u140f\0\u1450\0\u1491\0\u14d2\0\u1513\0\u1554"+
    "\0\u1595\0\u15d6\0\u1617\0\u1658\0\u1699\0\u16da\0\101\0\101"+
    "\0\101\0\101\0\101\0\101\0\101\0\101\0\101\0\101"+
    "\0\101\0\101\0\303\0\u171b\0\u175c\0\u179d\0\u17de\0\u181f"+
    "\0\u0b2c\0\u1860\0\u18a1\0\u0d75\0\u0db6\0\u0df7\0\u18e2\0\u1923"+
    "\0\u1964\0\101\0\u19a5\0\u19e6\0\u1a27\0\u1a68\0\u1aa9\0\u1aea"+
    "\0\u1b2b\0\u1b6c\0\u1bad\0\u1bee\0\u1c2f\0\303\0\u1c70\0\u1cb1"+
    "\0\u1cf2\0\303\0\u1d33\0\u1d74\0\u1db5\0\u1df6\0\u1e37\0\u1e78"+
    "\0\u1eb9\0\u1efa\0\u1f3b\0\u1f7c\0\u1fbd\0\u1ffe\0\u203f\0\u2080"+
    "\0\u20c1\0\101\0\u2102\0\u0b2c\0\u2143\0\u2184\0\u21c5\0\u2206"+
    "\0\u2247\0\303\0\303\0\u2288\0\303\0\u22c9\0\u230a\0\u234b"+
    "\0\u238c\0\u23cd\0\u240e\0\303\0\303\0\u244f\0\u2490\0\303"+
    "\0\303\0\303\0\u24d1\0\303\0\303\0\u2512\0\u2553\0\u2594"+
    "\0\303\0\u25d5\0\u2616\0\u2657\0\u2698\0\u26d9\0\303\0\u271a"+
    "\0\u275b\0\u279c\0\u27dd\0\303\0\303\0\303\0\u281e\0\u0b2c"+
    "\0\u0b2c\0\u0b2c\0\u285f\0\303\0\u28a0\0\u28e1\0\303\0\u2922"+
    "\0\u2963\0\303\0\u29a4\0\u29e5\0\u2a26\0\u2a67\0\303\0\303"+
    "\0\u2aa8\0\u2ae9\0\303\0\303\0\u2b2a\0\303\0\u2b6b\0\303"+
    "\0\u2bac\0\u2bed\0\303\0\303\0\303\0\303\0\u2c2e\0\u2c6f"+
    "\0\303\0\303\0\303\0\u2cb0\0\303\0\303\0\u0b2c\0\u2cf1"+
    "\0\u2d32\0\303\0\303\0\u0b2c\0\303";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\2\5\1\7"+
    "\1\10\2\11\1\12\1\13\1\3\1\14\1\3\1\4"+
    "\1\3\1\4\1\15\1\16\1\2\1\11\1\17\1\20"+
    "\1\21\1\22\1\4\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\2\4\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
    "\1\57\1\60\1\61\1\62\1\63\1\64\102\0\1\3"+
    "\2\65\1\3\4\65\3\0\2\65\1\3\1\65\1\3"+
    "\1\65\1\3\1\65\4\0\23\65\27\0\10\4\3\0"+
    "\10\4\4\0\23\4\31\0\1\5\2\0\2\5\1\66"+
    "\4\0\1\5\64\0\10\4\3\0\5\4\1\67\2\4"+
    "\4\0\7\4\1\70\3\4\1\71\7\4\27\0\1\65"+
    "\1\4\1\0\1\65\1\4\2\0\1\72\3\0\1\4"+
    "\1\0\1\65\1\4\1\65\1\4\1\65\1\4\4\0"+
    "\23\4\27\0\1\73\1\74\1\0\1\73\1\75\2\0"+
    "\1\76\3\0\1\74\1\0\1\73\1\74\1\73\1\74"+
    "\1\73\1\74\4\0\1\74\1\77\1\74\1\100\1\74"+
    "\1\101\2\74\1\102\1\74\1\103\10\74\27\0\10\4"+
    "\3\0\5\4\1\104\2\4\4\0\23\4\44\0\2\105"+
    "\2\106\2\107\56\0\10\4\3\0\5\4\1\110\2\4"+
    "\4\0\2\4\1\111\15\4\1\112\2\4\52\0\1\113"+
    "\54\0\12\114\1\0\12\114\1\115\2\0\51\114\1\0"+
    "\10\4\3\0\10\4\4\0\1\4\1\116\21\4\27\0"+
    "\10\4\3\0\10\4\4\0\6\4\1\117\7\4\1\120"+
    "\1\121\3\4\27\0\10\4\3\0\10\4\4\0\3\4"+
    "\1\122\17\4\27\0\10\4\3\0\7\4\1\123\4\0"+
    "\2\4\1\124\4\4\1\125\3\4\1\126\7\4\27\0"+
    "\10\4\3\0\5\4\1\127\2\4\4\0\1\130\16\4"+
    "\1\131\3\4\27\0\10\4\3\0\10\4\4\0\2\4"+
    "\1\132\15\4\1\133\2\4\27\0\10\4\3\0\10\4"+
    "\4\0\3\4\1\134\5\4\1\135\11\4\27\0\4\4"+
    "\1\136\3\4\3\0\10\4\4\0\7\4\1\137\4\4"+
    "\1\140\6\4\27\0\10\4\3\0\10\4\4\0\1\4"+
    "\1\141\5\4\1\142\1\143\2\4\1\144\7\4\27\0"+
    "\10\4\3\0\5\4\1\145\2\4\4\0\3\4\1\146"+
    "\17\4\27\0\10\4\3\0\5\4\1\147\2\4\4\0"+
    "\23\4\27\0\10\4\3\0\5\4\1\150\2\4\4\0"+
    "\1\151\22\4\27\0\10\4\3\0\10\4\4\0\11\4"+
    "\1\152\11\4\27\0\10\4\3\0\10\4\4\0\17\4"+
    "\1\153\3\4\27\0\10\4\3\0\10\4\4\0\1\154"+
    "\22\4\27\0\10\4\3\0\10\4\4\0\11\4\1\155"+
    "\11\4\101\0\1\156\102\0\1\157\102\0\1\160\102\0"+
    "\1\161\100\0\1\162\100\0\1\163\100\0\1\164\103\0"+
    "\1\165\1\166\100\0\1\167\1\170\103\0\1\171\100\0"+
    "\1\172\10\0\10\65\3\0\10\65\4\0\23\65\27\0"+
    "\10\4\3\0\10\4\4\0\2\4\1\173\20\4\27\0"+
    "\10\4\3\0\5\4\1\174\2\4\4\0\23\4\27\0"+
    "\10\73\3\0\10\73\4\0\23\73\27\0\10\74\3\0"+
    "\10\74\4\0\23\74\27\0\10\74\3\0\5\74\1\175"+
    "\2\74\4\0\23\74\27\0\1\73\1\74\1\0\1\73"+
    "\1\74\2\0\1\76\3\0\1\74\1\0\1\73\1\74"+
    "\1\73\1\74\1\73\1\74\4\0\23\74\27\0\10\74"+
    "\3\0\10\74\4\0\16\74\1\176\4\74\27\0\10\74"+
    "\3\0\10\74\4\0\13\74\1\177\7\74\27\0\10\74"+
    "\3\0\10\74\4\0\1\200\22\74\27\0\4\74\1\201"+
    "\3\74\3\0\10\74\4\0\23\74\27\0\10\74\3\0"+
    "\10\74\4\0\3\74\1\202\17\74\27\0\10\4\3\0"+
    "\10\4\4\0\10\4\1\203\12\4\34\0\1\204\1\0"+
    "\1\105\4\0\1\204\71\0\2\205\1\106\4\0\1\205"+
    "\66\0\5\206\1\107\4\0\3\206\10\0\1\206\2\0"+
    "\1\206\1\0\1\206\4\0\1\206\37\0\10\4\3\0"+
    "\5\4\1\207\2\4\4\0\23\4\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\210\17\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\211\14\4\26\0\12\113\1\212"+
    "\66\113\1\0\10\4\3\0\10\4\4\0\2\4\1\213"+
    "\20\4\27\0\10\4\3\0\10\4\4\0\10\4\1\214"+
    "\12\4\27\0\10\4\3\0\5\4\1\215\2\4\4\0"+
    "\23\4\27\0\10\4\3\0\10\4\4\0\6\4\1\216"+
    "\14\4\27\0\10\4\3\0\10\4\4\0\6\4\1\217"+
    "\14\4\27\0\10\4\3\0\10\4\4\0\2\4\1\220"+
    "\20\4\27\0\10\4\3\0\10\4\4\0\11\4\1\221"+
    "\11\4\27\0\10\4\3\0\10\4\4\0\1\4\1\222"+
    "\21\4\27\0\10\4\3\0\10\4\4\0\7\4\1\223"+
    "\13\4\27\0\10\4\3\0\10\4\4\0\1\4\1\224"+
    "\21\4\27\0\10\4\3\0\10\4\4\0\1\225\22\4"+
    "\27\0\10\4\3\0\10\4\4\0\20\4\1\226\2\4"+
    "\27\0\10\4\3\0\10\4\4\0\15\4\1\227\5\4"+
    "\27\0\10\4\3\0\7\4\1\230\4\0\23\4\27\0"+
    "\10\4\3\0\10\4\4\0\13\4\1\231\7\4\27\0"+
    "\10\4\3\0\10\4\4\0\6\4\1\232\14\4\27\0"+
    "\10\4\3\0\10\4\4\0\15\4\1\233\5\4\27\0"+
    "\10\4\3\0\10\4\4\0\17\4\1\234\3\4\27\0"+
    "\10\4\3\0\10\4\4\0\10\4\1\235\12\4\27\0"+
    "\10\4\3\0\10\4\4\0\7\4\1\236\13\4\27\0"+
    "\10\4\3\0\5\4\1\237\2\4\4\0\23\4\27\0"+
    "\10\4\3\0\10\4\4\0\11\4\1\240\11\4\27\0"+
    "\4\4\1\241\3\4\3\0\10\4\4\0\23\4\27\0"+
    "\10\4\3\0\10\4\4\0\5\4\1\242\1\4\1\243"+
    "\13\4\27\0\10\4\3\0\10\4\4\0\12\4\1\244"+
    "\10\4\27\0\10\4\3\0\10\4\4\0\5\4\1\245"+
    "\15\4\27\0\10\4\3\0\3\4\1\246\4\4\4\0"+
    "\23\4\27\0\10\4\3\0\10\4\4\0\10\4\1\247"+
    "\12\4\27\0\10\4\3\0\10\4\4\0\13\4\1\250"+
    "\7\4\27\0\10\4\3\0\10\4\4\0\1\251\22\4"+
    "\101\0\1\252\26\0\10\4\3\0\10\4\4\0\1\253"+
    "\22\4\27\0\10\74\3\0\10\74\4\0\2\74\1\254"+
    "\20\74\27\0\10\74\3\0\10\74\4\0\10\74\1\255"+
    "\12\74\27\0\10\74\3\0\10\74\4\0\1\74\1\256"+
    "\6\74\1\257\12\74\27\0\10\74\3\0\10\74\4\0"+
    "\1\74\1\260\21\74\27\0\4\74\1\261\3\74\3\0"+
    "\10\74\4\0\23\74\27\0\10\4\3\0\10\4\4\0"+
    "\12\4\1\262\10\4\27\0\10\4\3\0\10\4\4\0"+
    "\13\4\1\263\7\4\27\0\10\4\3\0\10\4\4\0"+
    "\1\264\22\4\27\0\10\4\3\0\10\4\4\0\3\4"+
    "\1\265\17\4\27\0\10\4\3\0\10\4\4\0\11\4"+
    "\1\266\11\4\27\0\10\4\3\0\10\4\4\0\6\4"+
    "\1\267\14\4\27\0\10\4\3\0\10\4\4\0\2\4"+
    "\1\270\20\4\27\0\10\4\3\0\10\4\4\0\11\4"+
    "\1\271\11\4\27\0\10\4\3\0\10\4\4\0\3\4"+
    "\1\272\17\4\27\0\10\4\3\0\5\4\1\273\2\4"+
    "\4\0\23\4\27\0\10\4\3\0\10\4\4\0\14\4"+
    "\1\274\6\4\27\0\10\4\3\0\10\4\4\0\3\4"+
    "\1\275\17\4\27\0\10\4\3\0\10\4\4\0\1\4"+
    "\1\276\4\4\1\277\14\4\27\0\10\4\3\0\10\4"+
    "\4\0\3\4\1\300\2\4\1\301\14\4\27\0\10\4"+
    "\3\0\10\4\4\0\2\4\1\302\20\4\27\0\10\4"+
    "\3\0\10\4\4\0\3\4\1\303\17\4\27\0\10\4"+
    "\3\0\10\4\4\0\6\4\1\304\14\4\27\0\10\4"+
    "\3\0\10\4\4\0\13\4\1\305\7\4\27\0\10\4"+
    "\3\0\5\4\1\306\2\4\4\0\23\4\27\0\10\4"+
    "\3\0\5\4\1\307\2\4\4\0\23\4\27\0\10\4"+
    "\3\0\5\4\1\310\2\4\4\0\23\4\27\0\10\4"+
    "\3\0\10\4\4\0\6\4\1\311\14\4\27\0\10\4"+
    "\3\0\10\4\4\0\7\4\1\312\13\4\27\0\10\4"+
    "\3\0\3\4\1\313\4\4\4\0\23\4\27\0\10\4"+
    "\3\0\10\4\4\0\1\314\2\4\1\315\17\4\27\0"+
    "\10\4\3\0\10\4\4\0\1\316\22\4\27\0\10\4"+
    "\3\0\10\4\4\0\21\4\1\317\1\4\27\0\10\4"+
    "\3\0\10\4\4\0\11\4\1\320\11\4\27\0\10\4"+
    "\3\0\10\4\4\0\2\4\1\321\20\4\27\0\10\4"+
    "\3\0\10\4\4\0\13\4\1\322\7\4\27\0\10\4"+
    "\3\0\10\4\4\0\13\4\1\323\7\4\27\0\4\4"+
    "\1\324\3\4\3\0\10\4\4\0\23\4\27\0\10\4"+
    "\3\0\10\4\4\0\12\4\1\325\10\4\27\0\10\4"+
    "\3\0\10\4\4\0\6\4\1\326\14\4\27\0\10\74"+
    "\3\0\10\74\4\0\6\74\1\327\14\74\27\0\10\74"+
    "\3\0\10\74\4\0\3\74\1\330\17\74\27\0\4\74"+
    "\1\331\3\74\3\0\10\74\4\0\23\74\27\0\10\74"+
    "\3\0\10\74\4\0\3\74\1\332\17\74\27\0\10\74"+
    "\3\0\10\74\4\0\1\333\22\74\27\0\10\4\3\0"+
    "\10\4\4\0\4\4\1\334\16\4\27\0\10\4\3\0"+
    "\10\4\4\0\5\4\1\335\15\4\27\0\10\4\3\0"+
    "\10\4\4\0\5\4\1\336\15\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\337\14\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\340\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\341\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\275\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\342\14\4\27\0\10\4\3\0"+
    "\10\4\4\0\10\4\1\343\12\4\27\0\10\4\3\0"+
    "\10\4\4\0\12\4\1\344\10\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\345\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\346\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\7\4\1\347\13\4\27\0\10\4\3\0"+
    "\10\4\4\0\21\4\1\350\1\4\27\0\10\4\3\0"+
    "\10\4\4\0\13\4\1\351\7\4\27\0\10\4\3\0"+
    "\10\4\4\0\11\4\1\352\11\4\27\0\10\4\3\0"+
    "\10\4\4\0\2\4\1\353\20\4\27\0\10\4\3\0"+
    "\10\4\4\0\13\4\1\354\7\4\27\0\10\4\3\0"+
    "\10\4\4\0\13\4\1\355\7\4\27\0\10\4\3\0"+
    "\5\4\1\356\2\4\4\0\23\4\27\0\10\4\3\0"+
    "\10\4\4\0\10\4\1\357\12\4\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\360\17\4\27\0\10\74\3\0"+
    "\10\74\4\0\5\74\1\361\15\74\27\0\10\74\3\0"+
    "\10\74\4\0\11\74\1\362\11\74\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\363\14\4\27\0\10\4\3\0"+
    "\10\4\4\0\17\4\1\364\3\4\27\0\10\4\3\0"+
    "\10\4\4\0\7\4\1\365\13\4\27\0\10\4\3\0"+
    "\10\4\4\0\7\4\1\366\13\4\27\0\10\4\3\0"+
    "\10\4\4\0\7\4\1\367\13\4\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\370\17\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\371\14\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\372\14\4\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\373\17\4\27\0\10\4\3\0"+
    "\10\4\4\0\13\4\1\374\7\4\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\375\17\4\27\0\10\4\3\0"+
    "\10\4\4\0\5\4\1\376\15\4\27\0\10\74\3\0"+
    "\10\74\4\0\17\74\1\377\3\74\27\0\10\74\3\0"+
    "\10\74\4\0\13\74\1\u0100\7\74\27\0\10\4\3\0"+
    "\10\4\4\0\11\4\1\u0101\11\4\27\0\4\4\1\u0102"+
    "\3\4\3\0\10\4\4\0\23\4\27\0\10\4\3\0"+
    "\10\4\4\0\6\4\1\u0103\14\4\27\0\10\74\3\0"+
    "\10\74\4\0\6\74\1\u0104\14\74\27\0\10\4\3\0"+
    "\10\4\4\0\3\4\1\u0105\17\4\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11635];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\27\1\1\11\1\1\1\11"+
    "\5\1\1\11\1\1\1\11\2\1\7\11\1\1\1\0"+
    "\3\1\1\0\3\1\1\0\6\1\3\0\4\1\1\0"+
    "\42\1\14\11\17\1\1\11\37\1\1\11\133\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  C3Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 99: break;
          case 2: 
            { return C3Types.CONST_IDENT;
            } 
            // fall through
          case 100: break;
          case 3: 
            { return C3Types.IDENT;
            } 
            // fall through
          case 101: break;
          case 4: 
            { return C3Types.INT_LITERAL;
            } 
            // fall through
          case 102: break;
          case 5: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 103: break;
          case 6: 
            { return C3Types.DIV_OP;
            } 
            // fall through
          case 104: break;
          case 7: 
            { return C3Types.DOT;
            } 
            // fall through
          case 105: break;
          case 8: 
            { return C3Types.LP;
            } 
            // fall through
          case 106: break;
          case 9: 
            { return C3Types.LBR;
            } 
            // fall through
          case 107: break;
          case 10: 
            { return C3Types.RBR;
            } 
            // fall through
          case 108: break;
          case 11: 
            { return C3Types.RP;
            } 
            // fall through
          case 109: break;
          case 12: 
            { return C3Types.LT_OP;
            } 
            // fall through
          case 110: break;
          case 13: 
            { return C3Types.EQ;
            } 
            // fall through
          case 111: break;
          case 14: 
            { return C3Types.GT_OP;
            } 
            // fall through
          case 112: break;
          case 15: 
            { return C3Types.BANG;
            } 
            // fall through
          case 113: break;
          case 16: 
            { return C3Types.ADD_OP;
            } 
            // fall through
          case 114: break;
          case 17: 
            { return C3Types.MOD_OP;
            } 
            // fall through
          case 115: break;
          case 18: 
            { return C3Types.SUB_OP;
            } 
            // fall through
          case 116: break;
          case 19: 
            { return C3Types.AT;
            } 
            // fall through
          case 117: break;
          case 20: 
            { return C3Types.QUESTION;
            } 
            // fall through
          case 118: break;
          case 21: 
            { return C3Types.COLON;
            } 
            // fall through
          case 119: break;
          case 22: 
            { return C3Types.EOS;
            } 
            // fall through
          case 120: break;
          case 23: 
            { return C3Types.COMMA;
            } 
            // fall through
          case 121: break;
          case 24: 
            { return C3Types.STAR;
            } 
            // fall through
          case 122: break;
          case 25: 
            { return C3Types.BIT_XOR_OP;
            } 
            // fall through
          case 123: break;
          case 26: 
            { return C3Types.BIT_OR_OP;
            } 
            // fall through
          case 124: break;
          case 27: 
            { return C3Types.LB;
            } 
            // fall through
          case 125: break;
          case 28: 
            { return C3Types.RB;
            } 
            // fall through
          case 126: break;
          case 29: 
            { return C3Types.TYPE_IDENT;
            } 
            // fall through
          case 127: break;
          case 30: 
            { return C3Types.FN_KW;
            } 
            // fall through
          case 128: break;
          case 31: 
            { return C3Types.CT_CONST_IDENT;
            } 
            // fall through
          case 129: break;
          case 32: 
            { return C3Types.CT_IDENT;
            } 
            // fall through
          case 130: break;
          case 33: 
            { return C3ElementType.Companion.getEND_OF_LINE_COMMENTS();
            } 
            // fall through
          case 131: break;
          case 34: 
            { return C3Types.STRING_LITERAL;
            } 
            // fall through
          case 132: break;
          case 35: 
            { return C3Types.AS_KW;
            } 
            // fall through
          case 133: break;
          case 36: 
            { return C3Types.IF_KW;
            } 
            // fall through
          case 134: break;
          case 37: 
            { return C3Types.IN_KW;
            } 
            // fall through
          case 135: break;
          case 38: 
            { return C3Types.DO_KW;
            } 
            // fall through
          case 136: break;
          case 39: 
            { return C3Types.DOTDOT;
            } 
            // fall through
          case 137: break;
          case 40: 
            { return C3Types.FN_BLOCK_START;
            } 
            // fall through
          case 138: break;
          case 41: 
            { return C3Types.FN_BLOCK_END;
            } 
            // fall through
          case 139: break;
          case 42: 
            { return C3Types.LE_OP;
            } 
            // fall through
          case 140: break;
          case 43: 
            { return C3Types.EQ_OP;
            } 
            // fall through
          case 141: break;
          case 44: 
            { return C3Types.GE_OP;
            } 
            // fall through
          case 142: break;
          case 45: 
            { return C3Types.NE_OP;
            } 
            // fall through
          case 143: break;
          case 46: 
            { return C3Types.INC_OP;
            } 
            // fall through
          case 144: break;
          case 47: 
            { return C3Types.ADD_MOD_OP;
            } 
            // fall through
          case 145: break;
          case 48: 
            { return C3Types.SUB_MOD_OP;
            } 
            // fall through
          case 146: break;
          case 49: 
            { return C3Types.DEC_OP;
            } 
            // fall through
          case 147: break;
          case 50: 
            { return C3Types.ELVIS;
            } 
            // fall through
          case 148: break;
          case 51: 
            { return C3Types.SCOPE;
            } 
            // fall through
          case 149: break;
          case 52: 
            { return C3Types.FOR_KW;
            } 
            // fall through
          case 150: break;
          case 53: 
            { return C3Types.CTIF_KW;
            } 
            // fall through
          case 151: break;
          case 54: 
            { return C3Types.TRY_KW;
            } 
            // fall through
          case 152: break;
          case 55: 
            { return C3Types.INT_KW;
            } 
            // fall through
          case 153: break;
          case 56: 
            { return C3Types.ELLIPSIS;
            } 
            // fall through
          case 154: break;
          case 57: 
            { return C3Types.CTFOR_KW;
            } 
            // fall through
          case 155: break;
          case 58: 
            { return C3Types.VOID_KW;
            } 
            // fall through
          case 156: break;
          case 59: 
            { return C3Types.BOOL_KW;
            } 
            // fall through
          case 157: break;
          case 60: 
            { return C3Types.BYTE_KW;
            } 
            // fall through
          case 158: break;
          case 61: 
            { return C3Types.ENUM_KW;
            } 
            // fall through
          case 159: break;
          case 62: 
            { return C3Types.ELSE_KW;
            } 
            // fall through
          case 160: break;
          case 63: 
            { return C3Types.CASE_KW;
            } 
            // fall through
          case 161: break;
          case 64: 
            { return C3Types.CAST_KW;
            } 
            // fall through
          case 162: break;
          case 65: 
            { return C3Types.CHAR_KW;
            } 
            // fall through
          case 163: break;
          case 66: 
            { return C3Types.NEXT_KW;
            } 
            // fall through
          case 164: break;
          case 67: 
            { return C3Types.NULL_KW;
            } 
            // fall through
          case 165: break;
          case 68: 
            { return C3Types.UINT_KW;
            } 
            // fall through
          case 166: break;
          case 69: 
            { return C3Types.LONG_KW;
            } 
            // fall through
          case 167: break;
          case 70: 
            { return C3Types.HALF_KW;
            } 
            // fall through
          case 168: break;
          case 71: 
            { return C3Types.QUAD_KW;
            } 
            // fall through
          case 169: break;
          case 72: 
            { return C3Types.FLOAT_KW;
            } 
            // fall through
          case 170: break;
          case 73: 
            { return C3Types.CTELSE_KW;
            } 
            // fall through
          case 171: break;
          case 74: 
            { return C3Types.CTELIF_KW;
            } 
            // fall through
          case 172: break;
          case 75: 
            { return C3Types.CTCASE_KW;
            } 
            // fall through
          case 173: break;
          case 76: 
            { return C3Types.BREAK_KW;
            } 
            // fall through
          case 174: break;
          case 77: 
            { return C3Types.SHORT_KW;
            } 
            // fall through
          case 175: break;
          case 78: 
            { return C3Types.CONST_KW;
            } 
            // fall through
          case 176: break;
          case 79: 
            { return C3Types.UNION_KW;
            } 
            // fall through
          case 177: break;
          case 80: 
            { return C3Types.ULONG_KW;
            } 
            // fall through
          case 178: break;
          case 81: 
            { return C3Types.DEFER_KW;
            } 
            // fall through
          case 179: break;
          case 82: 
            { return C3Types.LOCAL_KW;
            } 
            // fall through
          case 180: break;
          case 83: 
            { return C3Types.MACRO_KW;
            } 
            // fall through
          case 181: break;
          case 84: 
            { return C3Types.WHILE_KW;
            } 
            // fall through
          case 182: break;
          case 85: 
            { return C3Types.STRUCT_KW;
            } 
            // fall through
          case 183: break;
          case 86: 
            { return C3Types.SWITCH_KW;
            } 
            // fall through
          case 184: break;
          case 87: 
            { return C3Types.RETURN_KW;
            } 
            // fall through
          case 185: break;
          case 88: 
            { return C3Types.EXTERN_KW;
            } 
            // fall through
          case 186: break;
          case 89: 
            { return C3Types.IMPORT_KW;
            } 
            // fall through
          case 187: break;
          case 90: 
            { return C3Types.USHORT_KW;
            } 
            // fall through
          case 188: break;
          case 91: 
            { return C3Types.DOUBLE_KW;
            } 
            // fall through
          case 189: break;
          case 92: 
            { return C3Types.MODULE_KW;
            } 
            // fall through
          case 190: break;
          case 93: 
            { return C3Types.PUBLIC_KW;
            } 
            // fall through
          case 191: break;
          case 94: 
            { return C3Types.CTSWITCH_KW;
            } 
            // fall through
          case 192: break;
          case 95: 
            { return C3Types.TYPEDEF_KW;
            } 
            // fall through
          case 193: break;
          case 96: 
            { return C3Types.DEFAULT_KW;
            } 
            // fall through
          case 194: break;
          case 97: 
            { return C3Types.CTDEFAULT_KW;
            } 
            // fall through
          case 195: break;
          case 98: 
            { return C3Types.CONTINUE_KW;
            } 
            // fall through
          case 196: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
