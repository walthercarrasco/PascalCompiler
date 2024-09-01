// Generated from src/grammar/g.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_block(gParser.Program_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(gParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(gParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_declaration}
	 * labeled alternative in {@link gParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(gParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_declaration}
	 * labeled alternative in {@link gParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(gParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant_declaration}
	 * labeled alternative in {@link gParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(gParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant_initialization}
	 * labeled alternative in {@link gParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_initialization(gParser.Constant_initializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_initialization}
	 * labeled alternative in {@link gParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initialization(gParser.Variable_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#varNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNames(gParser.VarNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(gParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_Type}
	 * labeled alternative in {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Type(gParser.Array_TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_Type}
	 * labeled alternative in {@link gParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_Type(gParser.String_TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INT}
	 * labeled alternative in {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINT(gParser.INTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHAR(gParser.CHARContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link gParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOL(gParser.BOOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTCH}
	 * labeled alternative in {@link gParser#constType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTCH(gParser.CONSTCHContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTSTR}
	 * labeled alternative in {@link gParser#constType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTSTR(gParser.CONSTSTRContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(gParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(gParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_variables_normal}
	 * labeled alternative in {@link gParser#function_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_variables_normal(gParser.Function_variables_normalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_variables_array}
	 * labeled alternative in {@link gParser#function_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_variables_array(gParser.Function_variables_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_variables_const}
	 * labeled alternative in {@link gParser#function_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_variables_const(gParser.Function_variables_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(gParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(gParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simple_statement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(gParser.Simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested_statement}
	 * labeled alternative in {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_statement(gParser.Nested_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAssigment}
	 * labeled alternative in {@link gParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAssigment(gParser.SimpleAssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleRead}
	 * labeled alternative in {@link gParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleRead(gParser.SimpleReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleWrite}
	 * labeled alternative in {@link gParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleWrite(gParser.SimpleWriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCallFunction}
	 * labeled alternative in {@link gParser#simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCallFunction(gParser.SimpleCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedIf}
	 * labeled alternative in {@link gParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedIf(gParser.NestedIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedWhile}
	 * labeled alternative in {@link gParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedWhile(gParser.NestedWhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedFor}
	 * labeled alternative in {@link gParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedFor(gParser.NestedForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRepeat}
	 * labeled alternative in {@link gParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRepeat(gParser.NestedRepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprInt}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(gParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNeg}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNeg(gParser.ExprNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprComp}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComp(gParser.ExprCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(gParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(gParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMult}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(gParser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprChar}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(gParser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSum}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSum(gParser.ExprSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(gParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBool}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(gParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprID}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(gParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogic}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogic(gParser.ExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArray}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(gParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(gParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigmentVar}
	 * labeled alternative in {@link gParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentVar(gParser.AssigmentVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigmentArray}
	 * labeled alternative in {@link gParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentArray(gParser.AssigmentArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(gParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeNormal}
	 * labeled alternative in {@link gParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteNormal(gParser.WriteNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeLine}
	 * labeled alternative in {@link gParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteLine(gParser.WriteLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(gParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBody}
	 * labeled alternative in {@link gParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(gParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link gParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(gParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseIfBody}
	 * labeled alternative in {@link gParser#else_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBody(gParser.ElseIfBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseIfStat}
	 * labeled alternative in {@link gParser#else_if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(gParser.ElseIfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseBody}
	 * labeled alternative in {@link gParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBody(gParser.ElseBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link gParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(gParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forToBody}
	 * labeled alternative in {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForToBody(gParser.ForToBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDownToBody}
	 * labeled alternative in {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDownToBody(gParser.ForDownToBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forToStat}
	 * labeled alternative in {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForToStat(gParser.ForToStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forDownToStat}
	 * labeled alternative in {@link gParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDownToStat(gParser.ForDownToStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileBody}
	 * labeled alternative in {@link gParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBody(gParser.WhileBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link gParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(gParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#repeat_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_loop(gParser.Repeat_loopContext ctx);
}