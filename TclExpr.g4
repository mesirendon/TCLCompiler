grammar TclExpr;
import LexerRules;

@header {
  import java.util.*;
  import java.lang.*;
}

@parser::members {
  Map<String, Object> memory = new HashMap<String, Object>();
}

prog: declaration_list+;

declaration_list
  : declaration NEWLINE
  | NEWLINE
  ;

declaration
  : sets_declaration TOKEN_PYC
  | puts_declaration TOKEN_PYC
  ;

sets_declaration
  : SET ID TOKEN_INTEGER {memory.put($ID.text, $TOKEN_INTEGER.int);}
  | SET ID TOKEN_DOUBLE  {memory.put($ID.text, Double.parseDouble($TOKEN_DOUBLE.text));}
  | SET ID TOKEN_STRING  {memory.put($ID.text, $TOKEN_STRING.text);}
  ;

puts_declaration
  : PUTS TOKEN_INTEGER {System.out.println($TOKEN_INTEGER.text);}
  | PUTS TOKEN_DOUBLE  {System.out.println($TOKEN_DOUBLE.text);}
  | PUTS TOKEN_STRING  {System.out.println($TOKEN_STRING.text);}
  | PUTS TOKEN_DOLLAR ID
    {
      Object x = memory.get($ID.text);
      if (x == null)
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: la variable '" + $ID.text + "' no ha sido declarada.");
    }
  ;
