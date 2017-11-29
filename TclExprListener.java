// Generated from TclExpr.g4 by ANTLR 4.7

  import java.util.*;
  import java.lang.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TclExprParser}.
 */
public interface TclExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TclExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TclExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TclExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(TclExprParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(TclExprParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TclExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TclExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#sets_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSets_declaration(TclExprParser.Sets_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#sets_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSets_declaration(TclExprParser.Sets_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#puts_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPuts_declaration(TclExprParser.Puts_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#puts_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPuts_declaration(TclExprParser.Puts_declarationContext ctx);
}