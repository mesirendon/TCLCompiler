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
	 * Enter a parse tree produced by {@link TclExprParser#execution_list}.
	 * @param ctx the parse tree
	 */
	void enterExecution_list(TclExprParser.Execution_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#execution_list}.
	 * @param ctx the parse tree
	 */
	void exitExecution_list(TclExprParser.Execution_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#algebraic}.
	 * @param ctx the parse tree
	 */
	void enterAlgebraic(TclExprParser.AlgebraicContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#algebraic}.
	 * @param ctx the parse tree
	 */
	void exitAlgebraic(TclExprParser.AlgebraicContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link TclExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TclExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TclExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TclExprParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TclExprParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TclExprParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TclExprParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(TclExprParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(TclExprParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(TclExprParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(TclExprParser.ElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TclExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TclExprParser.NumberContext ctx);
}