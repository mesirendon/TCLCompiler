grammar TclExpr;
import LexerRules;

@header {
  import java.util.*;
  import java.lang.*;
}

@parser::members {
  Map<String, Object> memory = new HashMap<String, Object>();
}

prog: declaration+;

declaration
  : sets_declaration TOKEN_PYC NEWLINE
  | puts_declaration TOKEN_PYC NEWLINE
  | TOKEN_COR_IZQ execution_list TOKEN_COR_DER TOKEN_PYC NEWLINE
  | NEWLINE
  ;

execution_list returns [Double v]
  : exprs {$v = $exprs.v;}
  ;

exprs returns [Double v]
  : EXPR TOKEN_LLAVE_IZQ expression TOKEN_LLAVE_DER {$v = $expression.v;}
  ;

sets_declaration
  : SET ID TOKEN_INTEGER {memory.put($ID.text, $TOKEN_INTEGER.int);}
  | SET ID TOKEN_DOUBLE  {memory.put($ID.text, Double.parseDouble($TOKEN_DOUBLE.text));}
  | SET ID TOKEN_STRING  {memory.put($ID.text, $TOKEN_STRING.text.replaceAll("\"", ""));}
  ;

puts_declaration
  : PUTS TOKEN_INTEGER {System.out.println($TOKEN_INTEGER.text);}
  | PUTS TOKEN_DOUBLE  {System.out.println($TOKEN_DOUBLE.text);}
  | PUTS TOKEN_STRING  {System.out.println($TOKEN_STRING.text.replaceAll("\"", ""));}
  | PUTS TOKEN_DOLLAR ID
    {
      Object x = memory.get($ID.text);
      if (x == null) {
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: la variable '" + $ID.text + "' no ha sido declarada.");
        System.exit(0);
      }
      else
        System.out.println(x);
    }
  | PUTS TOKEN_COR_IZQ execution_list TOKEN_COR_DER {System.out.println($execution_list.v);}
  ;

expression returns [Double v]
  : a=expression TOKEN_MAS b=term   { $v = $a.v + $b.v; }
  | a=expression TOKEN_MENOS b=term { $v = $a.v - $b.v; }
  | term                            { $v = $term.v; }
  ;

term returns [Double v]
  : a=term TOKEN_MUL b=factor { $v = $a.v * $b.v; }
  | a=term TOKEN_DIV b=factor { $v = $a.v / $b.v; }
  | a=term TOKEN_MOD b=factor { $v = $a.v % $b.v; }
  | factor                    { $v = $factor.v; }
  ;

factor returns [Double v]
  : a=pow TOKEN_POT b=factor { $v = Math.pow($a.v, $b.v); }
  | pow                      { $v = $pow.v; }
  ;

pow returns [Double v]
  : TOKEN_MENOS a=pow { $v = -$a.v; }
  | TOKEN_NOT a=pow   { $v = ($a.v == 0) ? 1.0 : 0.0; }
  | elem              { $v = $elem.v; }
  ;

elem returns [Double v]
  : number {$v = $number.v;}
//  | TOKEN_DOLLAR ID TOKEN_PAR_IZQ TOKEN_INTEGER TOKEN_PAR_DER
  | TOKEN_DOLLAR ID
    {
      Object x = memory.get($ID.text);
      if (x == null)
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: la variable '" + $ID.text + "' no ha sido declarada.");
      else if (x instanceof Integer)
        $v = (Integer) x + 0.0;
      else if (x instanceof Double)
        $v = (Double) x;
      else {
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: Tipos de datos incompatibles. Se esperaba tipo double, integer. Se encontro tipo string");
        System.exit(0);
      }
    }
//  | TOKEN_COR_IZQ ID args TOKEN_COR_DER
  | TOKEN_PAR_IZQ expression TOKEN_PAR_DER { $v = $expression.v; }
  ;

number returns [Double v]
  : TOKEN_INTEGER {$v = Double.parseDouble($TOKEN_INTEGER.text);}
  | TOKEN_DOUBLE  {$v = Double.parseDouble($TOKEN_DOUBLE.text);}
  ;
