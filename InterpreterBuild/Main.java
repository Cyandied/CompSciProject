/*
  Commented By: Christopher Lopes

  <p>To Run:
  <pre>
  java Main test.txt
  </pre>
  where {@code test.txt} is an test input file for the calculator.
*/

import java.io.*;
import java_cup.runtime.*;

public class Main {
  public static void main(String[] argv) {
    /* Start the parser */
    try {
      Lexer l = new Lexer(new FileReader(argv[0]));
      // SymbolFactory sf = new ComplexSymbolFactory();
      parser p = new parser(l /* , sf */);
      Object result = p.parse().value;
    } catch (Exception e) {
      /* do cleanup here -- possibly rethrow e */
      e.printStackTrace();
    }
  }
}
