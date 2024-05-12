
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Jun 05 13:31:05 CST 2021
//----------------------------------------------------

package Compilador;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Jun 05 13:31:05 CST 2021
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\007\000\002\003" +
    "\007\000\002\011\007\000\002\011\006\000\002\004\007" +
    "\000\002\004\007\000\002\006\015\000\002\010\064\000" +
    "\002\010\064\000\002\010\064\000\002\010\064\000\002" +
    "\012\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\231\000\004\040\005\001\002\000\006\005\015\020" +
    "\016\001\002\000\004\023\010\001\002\000\004\002\007" +
    "\001\002\000\004\002\001\001\002\000\004\023\011\001" +
    "\002\000\004\023\012\001\002\000\004\022\013\001\002" +
    "\000\006\005\uffff\020\uffff\001\002\000\004\005\027\001" +
    "\002\000\004\020\022\001\002\000\004\014\017\001\002" +
    "\000\004\015\020\001\002\000\004\016\021\001\002\000" +
    "\004\005\ufffd\001\002\000\004\014\023\001\002\000\004" +
    "\015\024\001\002\000\004\016\025\001\002\000\004\005" +
    "\ufffe\001\002\000\004\031\041\001\002\000\006\023\031" +
    "\024\030\001\002\000\004\024\035\001\002\000\004\023" +
    "\032\001\002\000\004\023\033\001\002\000\004\022\034" +
    "\001\002\000\004\031\ufffc\001\002\000\004\024\036\001" +
    "\002\000\004\022\037\001\002\000\004\031\ufffb\001\002" +
    "\000\004\023\227\001\002\000\004\016\042\001\002\000" +
    "\004\026\044\001\002\000\004\017\217\001\002\000\004" +
    "\037\045\001\002\000\004\041\046\001\002\000\004\023" +
    "\047\001\002\000\004\023\050\001\002\000\004\023\051" +
    "\001\002\000\004\023\052\001\002\000\004\042\053\001" +
    "\002\000\004\041\054\001\002\000\004\022\055\001\002" +
    "\000\004\027\056\001\002\000\004\036\057\001\002\000" +
    "\004\023\060\001\002\000\004\022\061\001\002\000\004" +
    "\026\062\001\002\000\004\037\063\001\002\000\004\041" +
    "\064\001\002\000\004\023\065\001\002\000\004\023\066" +
    "\001\002\000\004\023\067\001\002\000\004\023\070\001" +
    "\002\000\004\042\071\001\002\000\004\041\072\001\002" +
    "\000\004\022\073\001\002\000\004\027\074\001\002\000" +
    "\004\036\075\001\002\000\004\023\076\001\002\000\004" +
    "\022\077\001\002\000\004\023\100\001\002\000\004\007" +
    "\101\001\002\000\004\023\102\001\002\000\012\010\105" +
    "\011\104\012\106\013\103\001\002\000\004\023\175\001" +
    "\002\000\004\023\153\001\002\000\004\023\131\001\002" +
    "\000\004\023\107\001\002\000\004\022\110\001\002\000" +
    "\004\026\111\001\002\000\004\037\112\001\002\000\004" +
    "\041\113\001\002\000\004\023\114\001\002\000\004\023" +
    "\115\001\002\000\004\023\116\001\002\000\004\023\117" +
    "\001\002\000\004\042\120\001\002\000\004\041\121\001" +
    "\002\000\004\037\122\001\002\000\004\023\123\001\002" +
    "\000\004\037\124\001\002\000\004\004\125\001\002\000" +
    "\004\037\126\001\002\000\004\004\127\001\002\000\004" +
    "\022\130\001\002\000\004\017\ufff6\001\002\000\004\022" +
    "\132\001\002\000\004\026\133\001\002\000\004\037\134" +
    "\001\002\000\004\041\135\001\002\000\004\023\136\001" +
    "\002\000\004\023\137\001\002\000\004\023\140\001\002" +
    "\000\004\023\141\001\002\000\004\042\142\001\002\000" +
    "\004\041\143\001\002\000\004\037\144\001\002\000\004" +
    "\023\145\001\002\000\004\037\146\001\002\000\004\004" +
    "\147\001\002\000\004\037\150\001\002\000\004\004\151" +
    "\001\002\000\004\022\152\001\002\000\004\017\ufff9\001" +
    "\002\000\004\022\154\001\002\000\004\026\155\001\002" +
    "\000\004\037\156\001\002\000\004\041\157\001\002\000" +
    "\004\023\160\001\002\000\004\023\161\001\002\000\004" +
    "\023\162\001\002\000\004\023\163\001\002\000\004\042" +
    "\164\001\002\000\004\041\165\001\002\000\004\037\166" +
    "\001\002\000\004\023\167\001\002\000\004\037\170\001" +
    "\002\000\004\004\171\001\002\000\004\037\172\001\002" +
    "\000\004\004\173\001\002\000\004\022\174\001\002\000" +
    "\004\017\ufff8\001\002\000\004\022\176\001\002\000\004" +
    "\026\177\001\002\000\004\037\200\001\002\000\004\041" +
    "\201\001\002\000\004\023\202\001\002\000\004\023\203" +
    "\001\002\000\004\023\204\001\002\000\004\023\205\001" +
    "\002\000\004\042\206\001\002\000\004\041\207\001\002" +
    "\000\004\037\210\001\002\000\004\023\211\001\002\000" +
    "\004\037\212\001\002\000\004\004\213\001\002\000\004" +
    "\037\214\001\002\000\004\004\215\001\002\000\004\022" +
    "\216\001\002\000\004\017\ufff7\001\002\000\004\031\220" +
    "\001\002\000\004\014\221\001\002\000\004\023\222\001" +
    "\002\000\004\043\223\001\002\000\004\024\224\001\002" +
    "\000\004\015\225\001\002\000\004\022\226\001\002\000" +
    "\004\023\ufffa\001\002\000\004\024\231\001\002\000\004" +
    "\002\000\001\002\000\004\022\232\001\002\000\004\017" +
    "\233\001\002\000\004\002\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\231\000\006\002\005\003\003\001\001\000\004\011" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\025\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\037\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\012\227\001\001\000\002\001\001\000\004\010\042\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // END ::= Identificador Numero P_coma Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("END",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Identificador Igual Identificador Multiplicacion Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas Salida Identificador Salida Linea Salida Linea P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-49)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Identificador Igual Identificador Division Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas Salida Identificador Salida Linea Salida Linea P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-49)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Identificador Igual Identificador Resta Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas Salida Identificador Salida Linea Salida Linea P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-49)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas P_coma Leer Entrada Identificador P_coma Identificador Igual Identificador Suma Identificador P_coma Escribir Salida Comillas Identificador Identificador Identificador Identificador D_puntos Comillas Salida Identificador Salida Linea Salida Linea P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-49)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ITERACION ::= Estructuras_iteracion Llave_a SENTENCIA Llave_c Estructuras_iteracion Parentesis_a Identificador Diferente Numero Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("ITERACION",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VARIABLES ::= T_datos Numero Numero Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VARIABLES",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VARIABLES ::= T_datos Identificador Identificador Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("VARIABLES",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // MAIN ::= Main Parentesis_a Parentesis_c Llave_a 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAIN",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // MAIN ::= T_datos Main Parentesis_a Parentesis_c Llave_a 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("MAIN",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LIBRERIA ::= Librerias Identificador Identificador Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("LIBRERIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LIBRERIA MAIN VARIABLES ITERACION END 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

