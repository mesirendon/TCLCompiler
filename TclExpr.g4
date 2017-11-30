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
  | procs
  | NEWLINE
  ;

execution_list returns [Object v]
  : algebraic    { $v = (Object) $algebraic.v; }
  | boolean_expr { $v = (Object) $boolean_expr.v; }
  ;

algebraic returns [Double v]
  : EXPR TOKEN_LLAVE_IZQ expression TOKEN_LLAVE_DER {$v = $expression.v;}
  ;

boolean_expr returns [Integer v]
  : EXPR TOKEN_LLAVE_IZQ orexp TOKEN_LLAVE_DER { $v = $orexp.v; }
  ;

sets_declaration
  : SET ID TOKEN_COR_IZQ execution_list TOKEN_COR_DER { memory.put($ID.text, $execution_list.v); }
  | SET ID TOKEN_INTEGER                              { memory.put($ID.text, $TOKEN_INTEGER.int); }
  | SET ID TOKEN_DOUBLE                               { memory.put($ID.text, Double.parseDouble($TOKEN_DOUBLE.text)); }
  | SET ID TOKEN_STRING
    {
      String[] tokenizer = $TOKEN_STRING.text.replaceAll("\"", "").split(" ");
      String text = "";
      for (String i : tokenizer) {
        if(i.startsWith("$")) {
          String variable = i.substring(1);
          Object temp = memory.get(variable);
          text += temp + " ";
        }
        else {
          text += i + " ";
        }
      }
      memory.put($ID.text, text.trim());
    }
  | SET ID TOKEN_PAR_IZQ a=array_index TOKEN_PAR_DER b=array_index
    {
      Map<Object, Object> x = (Map<Object, Object>) memory.get($ID.text);
      if (x == null) {
        Map<Object, Object> xyz = new HashMap<Object, Object>();
        xyz.put($a.v, $b.v);
        memory.put($ID.text, xyz);
      }
      else {
        x.put($a.v, $b.v);
      }
    }
  ;

array_index returns [Object v]
  : TOKEN_INTEGER                                           { $v = $TOKEN_INTEGER.int; }
  | TOKEN_DOUBLE                                            { $v = Double.parseDouble($TOKEN_DOUBLE.text); }
  | TOKEN_STRING                                            { $v = $TOKEN_STRING.text.replaceAll("\"", ""); }
  | TOKEN_COR_IZQ algebraic TOKEN_COR_DER                   { $v = $algebraic.v; }
  | TOKEN_DOLLAR ID                                         { $v = memory.get($ID.text); }
  | TOKEN_DOLLAR ID TOKEN_PAR_IZQ array_index TOKEN_PAR_DER { $v = ((Map<Object, Object>) memory.get($ID.text)).get($array_index.v); }
  ;

puts_declaration
  : PUTS TOKEN_INTEGER {System.out.println($TOKEN_INTEGER.text);}
  | PUTS TOKEN_DOUBLE  {System.out.println($TOKEN_DOUBLE.text);}
  | PUTS TOKEN_STRING  {System.out.println($TOKEN_STRING.text.replaceAll("\"", ""));}
  | PUTS TOKEN_COR_IZQ ARRAY SIZE ID TOKEN_COR_DER
    {
      Map<Object, Object> x = (Map<Object, Object>) memory.get($ID.text);
      if( x == null ) {
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: la variable '" + $ID.text + "' no ha sido declarada.");
        System.exit(0);
      }
      else if ("HashMap".equals( x.getClass().getSimpleName() )) {
        System.out.println(x.size());
      }
      else {
        System.out.println("No es un array");
        System.exit(0);
      }
    }
  | PUTS TOKEN_COR_IZQ ARRAY EXISTS ID TOKEN_COR_DER
    {
      try {
        Map<Object, Object> x = (Map<Object, Object>) memory.get($ID.text);
        if( x == null ) {
          System.out.println(0);
        }
        else if ("HashMap".equals( x.getClass().getSimpleName() )) {
          System.out.println(1);
        }
      } catch (ClassCastException e) {
        System.out.println(0);
      }
    }
  | PUTS TOKEN_DOLLAR ID TOKEN_PAR_IZQ array_index TOKEN_PAR_DER
    {
      Map<Object, Object> x = (Map<Object, Object>) memory.get($ID.text);
      if (x == null) {
        System.out.println("<" + $ID.line + "," + ( $ID.pos + 1 ) + "> Error semantico: la variable '" + $ID.text + "' no ha sido declarada.");
        System.exit(0);
      }
      else {
        System.out.println(x.get($array_index.v));
      }
    }
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
  | TOKEN_COR_IZQ algebraic TOKEN_COR_DER  { $v = $algebraic.v; }
  | TOKEN_PAR_IZQ expression TOKEN_PAR_DER { $v = $expression.v; }
  ;

number returns [Double v]
  : TOKEN_INTEGER {$v = Double.parseDouble($TOKEN_INTEGER.text);}
  | TOKEN_DOUBLE  {$v = Double.parseDouble($TOKEN_DOUBLE.text);}
  ;

orexp returns [Integer v]
  : a=orexp TOKEN_OR b=andexp
    {
      Boolean x = $a.v == 0 ? true : false || $b.v == 0 ? true : false;
      if (x)
        $v = 1;
      else
        $v = 0;
    }
  | andexp { $v = $andexp.v; }
  ;

andexp returns [Integer v]
  : a=andexp TOKEN_AND b=eqexp
    {
      Object y = $b.v;
      Integer cosito = 0;
      if ( y instanceof Double ) {
        Integer intero = ( (Double) y ).intValue();
        Integer decimal = ( (Double) ( (Double) y * 10 ) ).intValue();
        if (intero + decimal > 0)
          cosito = 1;
        else
          cosito = 0;
      }
      else {
        System.exit(0);
      }
      Boolean x = $a.v == 0 ? true : false && cosito == 0 ? true : false;
      if (x)
        $v = 1;
      else
        $v = 0;
    }
  | eqexp
    {
      Object x = $eqexp.v;
      if ( x instanceof Double ) {
        Integer intero = ( (Double) x ).intValue();
        Integer decimal = ( (Double) ( (Double) x * 10 ) ).intValue();
        if (intero + decimal > 0)
          $v = (Integer) 1;
        else
          $v = (Integer) 0;
      }
      else if ( x instanceof Integer ) {
        $v = (Integer) $eqexp.v;
      }
      else {
        System.exit(0);
      }
    }
  ;

eqexp returns [Object v]
  : a=eqexp TOKEN_IGUAL_NUM b=relexp
    {
      if( $a.v instanceof Double && $b.v instanceof Double ) {
        Boolean x = ( (Double) $a.v ).equals( $b.v );
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else {
        System.exit(0);
      }
    }
  | a=eqexp TOKEN_IGUAL_STR b=relexp
    {
      if( $a.v instanceof String && $b.v instanceof String ) {
        Integer x = ( (String) $a.v ).compareTo( (String) $b.v );
        if (x == 0)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else {
        System.exit(0);
      }
    }
  | a=eqexp TOKEN_DIFF_NUM b=relexp
    {
      if( $a.v instanceof Double && $b.v instanceof Double ) {
        Boolean x = !( (Double) $a.v ).equals( $b.v );
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else {
        System.exit(0);
      }
    }
  | a=eqexp TOKEN_DIFF_STR b=relexp
    {
      if( $a.v instanceof String && $b.v instanceof String ) {
        Boolean x = (String) $a.v != (String) $b.v;
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else {
        System.exit(0);
      }
    }
  | relexp { $v = $relexp.v; }
  ;

relexp returns [Object v]
  : a=relexp TOKEN_MAYOR b=belem
    {
      if ($a.v instanceof Double && $b.v instanceof Double) {
        Boolean x = (Double) $a.v > (Double) $b.v;
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else if ($a.v instanceof String && $b.v instanceof String) {
        Integer x = ( (String) $a.v ).compareTo((String) $b.v);
        if (x > 0)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else
        System.exit(0);
    }
  | a=relexp TOKEN_MENOR b=belem
    {
      if ($a.v instanceof Double && $b.v instanceof Double) {
        Boolean x = (Double) $a.v < (Double) $b.v;
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else if ($a.v instanceof String && $b.v instanceof String) {
        Integer x = ( (String) $a.v ).compareTo((String) $b.v);
        if (x < 0)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else
        System.exit(0);
    }
  | a=relexp TOKEN_MAYOR_IGUAL b=belem
    {
      if ($a.v instanceof Double && $b.v instanceof Double) {
        Boolean x = (Double) $a.v >= (Double) $b.v;
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else if ($a.v instanceof String && $b.v instanceof String) {
        Integer x = ( (String) $a.v ).compareTo((String) $b.v);
        if (x >= 0)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else
        System.exit(0);
    }
  | a=relexp TOKEN_MENOR_IGUAL b=belem
    {
      if ($a.v instanceof Double && $b.v instanceof Double) {
        Boolean x = (Double) $a.v <= (Double) $b.v;
        if (x)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else if ($a.v instanceof String && $b.v instanceof String) {
        Integer x = ( (String) $a.v ).compareTo((String) $b.v);
        if (x <= 0)
          $v = (Object) 1;
        else
          $v = (Object) 0;
      }
      else
        System.exit(0);
    }
  | belem { $v = $belem.v; }
  ;

belem returns [Object v]
  : expression   { $v = (Object) $expression.v; }
  | TOKEN_STRING { $v = (Object) $TOKEN_STRING.text.replaceAll("\"", ""); }
  | TOKEN_DOLLAR ID
    {
      Object x = memory.get($ID.text);
      if( x != null )
        $v = (Object) x;
      else
        System.exit(0);
    }
  ;

procs
  : PROC ID TOKEN_LLAVE_IZQ args+ TOKEN_LLAVE_DER TOKEN_LLAVE_IZQ declaration+ returns_declaration TOKEN_LLAVE_DER
  ;

args
  : TOKEN_LLAVE_IZQ args_list TOKEN_LLAVE_DER
  | TOKEN_LLAVE_IZQ TOKEN_COR_IZQ execution_list TOKEN_COR_DER TOKEN_LLAVE_DER
  | TOKEN_LLAVE_IZQ execution_list TOKEN_LLAVE_DER
  | TOKEN_LLAVE_IZQ TOKEN_DOLLAR ID TOKEN_PAR_IZQ TOKEN_COR_IZQ execution_list TOKEN_COR_DER TOKEN_PAR_DER TOKEN_LLAVE_DER
  ;

execution_list
  : ARRAY SIZE ID
  | ARRAY EXISTS ID
  | ID args+
  | algebraic

args_list
  : number
  | TOKEN_DOLLAR ID TOKEN_PAR_IZQ TOKEN_INTEGER TOKEN_PAR_DER
  | TOKEN_DOLLAR ID
  | TOKEN_STRING
  ;

def p_returns_declaration(p):
    '''returns_declaration : return elem token_pyc returns_declaration
                           | return token_cor_izq execution_list token_cor_der token_pyc returns_declaration
                           | return token_dollar id token_pyc returns_declaration
                           | return token_pyc returns_declaration
                           | empty'''
    pass
