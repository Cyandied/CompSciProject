
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\005\003\000\002\002\004\000\002\005" +
    "\004\000\002\004\007\000\002\004\011\000\002\004\007" +
    "\000\002\002\005\000\002\002\005\000\002\002\005\000" +
    "\002\002\005\000\002\002\005\000\002\002\003\000\002" +
    "\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\010\004\004\007\007\013\010\001\002\000" +
    "\010\021\013\023\012\024\011\001\002\000\016\002\001" +
    "\004\001\007\001\011\001\012\001\013\001\001\002\000" +
    "\012\002\041\004\004\007\007\013\010\001\002\000\010" +
    "\021\013\023\012\024\011\001\002\000\010\021\013\023" +
    "\012\024\011\001\002\000\022\005\ufff5\010\ufff5\014\ufff5" +
    "\015\ufff5\016\ufff5\017\ufff5\020\ufff5\022\ufff5\001\002\000" +
    "\022\005\ufff6\010\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6" +
    "\020\ufff6\022\ufff6\001\002\000\010\021\013\023\012\024" +
    "\011\001\002\000\014\014\016\015\015\016\017\017\021" +
    "\020\020\001\002\000\010\021\013\023\012\024\011\001" +
    "\002\000\010\004\004\007\007\013\010\001\002\000\010" +
    "\021\013\023\012\024\011\001\002\000\010\021\013\023" +
    "\012\024\011\001\002\000\010\021\013\023\012\024\011" +
    "\001\002\000\022\005\ufff9\010\ufff9\014\ufff9\015\ufff9\016" +
    "\ufff9\017\ufff9\020\ufff9\022\ufff9\001\002\000\022\005\ufff8" +
    "\010\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\022" +
    "\ufff8\001\002\000\022\005\ufffa\010\ufffa\014\ufffa\015\ufffa" +
    "\016\ufffa\017\021\020\020\022\ufffa\001\002\000\012\004" +
    "\004\007\007\012\027\013\010\001\002\000\016\002\uffff" +
    "\004\uffff\007\uffff\011\uffff\012\uffff\013\uffff\001\002\000" +
    "\016\002\ufffc\004\ufffc\007\ufffc\011\ufffc\012\ufffc\013\ufffc" +
    "\001\002\000\022\005\ufffb\010\ufffb\014\ufffb\015\ufffb\016" +
    "\ufffb\017\021\020\020\022\ufffb\001\002\000\014\015\015" +
    "\016\017\017\021\020\020\022\032\001\002\000\022\005" +
    "\ufff7\010\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7" +
    "\022\ufff7\001\002\000\014\010\034\015\015\016\017\017" +
    "\021\020\020\001\002\000\010\004\004\007\007\013\010" +
    "\001\002\000\012\004\004\007\007\011\036\013\010\001" +
    "\002\000\010\004\004\007\007\013\010\001\002\000\012" +
    "\004\004\007\007\012\040\013\010\001\002\000\016\002" +
    "\ufffd\004\ufffd\007\ufffd\011\ufffd\012\ufffd\013\ufffd\001\002" +
    "\000\004\002\000\001\002\000\014\005\043\015\015\016" +
    "\017\017\021\020\020\001\002\000\004\024\044\001\002" +
    "\000\004\006\045\001\002\000\016\002\ufffe\004\ufffe\007" +
    "\ufffe\011\ufffe\012\ufffe\013\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\043\000\006\004\004\005\005\001\001\000\004\002" +
    "\041\001\001\000\002\001\001\000\004\004\025\001\001" +
    "\000\004\002\032\001\001\000\004\002\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\002\030\001\001" +
    "\000\002\001\001\000\004\002\027\001\001\000\006\004" +
    "\004\005\024\001\001\000\004\002\023\001\001\000\004" +
    "\002\022\001\001\000\004\002\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\004\005\034\001\001\000\004\004\025\001" +
    "\001\000\006\004\004\005\036\001\001\000\004\004\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public void report_error(String message, Object info) {
    System.err.println(message);
  }

  public void report_fatal_error(String message, Object info) {
    report_error(message, info);
    System.exit(1);
  }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // stm_list ::= stm 
            {
              Object RESULT =null;
		  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= stm_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // stm_list ::= stm_list stm 
            {
              Object RESULT =null;
		  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm_list",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // stm ::= STORE expr AS VAR SEMI 
            {
              Object RESULT =null;
		  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // stm ::= IF expr THEN stm_list ELSE stm_list END 
            {
              Object RESULT =null;
		  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // stm ::= THINK expr ABOUT stm_list END 
            {
              Object RESULT =null;
		  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stm",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr PLUS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Integer.valueOf(e1.intValue() + e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr MINUS expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Integer.valueOf(e1.intValue() - e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr TIMES expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Integer.valueOf(e1.intValue() * e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr DIVIDE expr 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = Integer.valueOf(e1.intValue() / e2.intValue()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= LPAREN expr RPAREN 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= NUMBER 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= VAR 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = i; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
