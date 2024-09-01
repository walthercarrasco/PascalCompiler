package org.main;

public class MyVisitor extends gBaseVisitor<String> {
    @Override
    public String visitProgram_block(gParser.Program_blockContext ctx) {
        return ctx.PROGRAM().getText() + " " + ctx.ID().getText() + ctx.SEMI().getText() + "/n" + this.visitSrc(ctx.src());
    }

    @Override
    public String visitSrc(gParser.SrcContext ctx) {
        return this.visitDeclaration(ctx.declaration()) + "/n" + this.visitBody(ctx.body()) + ctx.DOT().getText();
    }

    //Variable Declaration
    @Override
    public String visitDeclaration(gParser.DeclarationContext ctx) {
        String str = "";

        if(ctx.var_block() != null)
        {
            str += this.visitVar_block(ctx.var_block());
        }

        if (ctx.function_block() != null)
        {
            str += this.visitFunction_block(ctx.function_block());
        }

        return str;
    }

    @Override
    public String visitVar_block(gParser.Var_blockContext ctx) {
        String str = ctx.VAR().getText() + "/n" + ctx.variables(0).getText();

        if(ctx.variables().size() > 1)
        {
            for(int i = 1; i < ctx.variables().size(); i++)
            {
                str += ctx.variables(i).getText();
            }
        }

        return str;
    }

    @Override
    public String visitVariable_declaration(gParser.Variable_declarationContext ctx) {
        return this.visitVarNames(ctx.varNames()) + ctx.COLON().getText() + ctx.type().getText() + ctx.SEMI().getText();
    }

    @Override
    public String visitArray_declaration(gParser.Array_declarationContext ctx) {
        return ctx.ID().getText() + ctx.COLON().getText() + this.visitArray(ctx.array()) + ctx.SEMI().getText();
    }

    @Override
    public String visitConstant_declaration(gParser.Constant_declarationContext ctx) {
        return this.visitVarNames(ctx.varNames()) + ctx.constType().getText() + ctx.SEMI().getText();
    }

    @Override
    public String visitConstant_initialization(gParser.Constant_initializationContext ctx) {
        return ctx.ID().getText() + ctx.COLON().getText() + ctx.constType().getText() + ctx.ASSIGN().getText() + ctx.CONST_VAL().getText() + ctx.SEMI().getText();
    }

    @Override
    public String visitVariable_initialization(gParser.Variable_initializationContext ctx) {
        return ctx.assigment().getText();
    }

    @Override
    public String visitVarNames(gParser.VarNamesContext ctx) {
        String str = ctx.ID(0).getText();

        if(ctx.ID().size() > 1)
        {
            for(int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i-1).getText() + ctx.ID(i).getText();
            }
        }

        return str;
    }

    @Override
    public String visitFunction_block(gParser.Function_blockContext ctx) {
        String str = "";

        for(int i = 0; i < ctx.function().size(); i++)
        {
            str += this.visitFunction(ctx.function(i));
        }

        return str;
    }

    //Variable Types
    @Override
    public String visitArray_Type(gParser.Array_TypeContext ctx) {
        return ctx.arrayType().getText();
    }

    @Override
    public String visitString_Type(gParser.String_TypeContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public String visitINT(gParser.INTContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitBOOL(gParser.BOOLContext ctx) {
        return ctx.BOOLEAN().getText();
    }

    @Override
    public String visitCHAR(gParser.CHARContext ctx) {
        return ctx.CHAR().getText();
    }

    @Override
    public String visitCONSTCH(gParser.CONSTCHContext ctx) {
        return ctx.CONSTCHAR().getText();
    }

    @Override
    public String visitCONSTSTR(gParser.CONSTSTRContext ctx) {
        return ctx.CONSTSTR().getText();
    }

    @Override
    public String visitArray(gParser.ArrayContext ctx) {
        String str = ctx.ARRAY().getText() + ctx.LBRACK().getText() + this.visitRange(ctx.range(0));

        if(ctx.COMMA() != null)
        {
            str += ctx.COMMA().getText() + this.visitRange(ctx.range(1));
        }

        str += ctx.RBRACK().getText() + ctx.OF().getText() + ctx.arrayType().getText();

        return str;
    }

    @Override
    public String visitRange(gParser.RangeContext ctx) {
        return ctx.NUM(0).getText() + ctx.DOTDOT().getText() + ctx.NUM(1).getText();
    }

    //Functions
    @Override
    public String visitFunction_variables_normal(gParser.Function_variables_normalContext ctx) {
        String str = ctx.ID(0).getText();

        if(ctx.COMMA() != null)
        {
            for(int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i-1).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.type().getText();

        return str;
    }

    @Override
    public String visitFunction_variables_array(gParser.Function_variables_arrayContext ctx) {
        String str = ctx.ID(0).getText();

        if(ctx.COMMA() != null)
        {
            for(int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i-1).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + this.visitArray(ctx.array());

        return str;
    }

    @Override
    public String visitFunction_variables_const(gParser.Function_variables_constContext ctx) {
        String str = ctx.ID(0).getText();

        if(ctx.COMMA() != null)
        {
            for(int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i-1).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.constType().getText();

        return str;
    }

    @Override
    public String visitFunction(gParser.FunctionContext ctx) {
        String str = ctx.FUNCTION().getText() + ctx.ID().getText() + ctx.LPAREN().getText();

        if(ctx.function_variables() != null)
        {
            str += ctx.function_variables(0).getText();

            if(ctx.function_variables().size() > 1)
            {
                for(int i = 1; i < ctx.function_variables().size(); i++)
                {
                    str += ctx.SEMI(i-1).getText() + ctx.function_variables(i).getText();
                }
            }
        }

        str += ctx.RPAREN().getText() + ctx.COLON().getText() + ctx.type().getText() + ctx.SEMI(ctx.SEMI().size()-2).getText() + "/n";

        if(ctx.var_block() != null)
        {
            str += ctx.var_block().getText();
        }

        str += this.visitBody(ctx.body()) + ctx.SEMI(ctx.SEMI().size()-1).getText();

        return str;
    }

    //Body
    @Override
    public String visitBody(gParser.BodyContext ctx) {
        String str;
        str = ctx.BEGIN().getText() + "/n";
        for (int i = 0; i < ctx.statement().size(); i++){
            str += ctx.statement(i)+ "/n";
        }
        return str;
    }

    //Statement Types
    @Override
    public String visitSimple_statement(gParser.Simple_statementContext ctx) {
        return ctx.simple().getText() + "/n";
    }

    @Override
    public String visitNested_statement(gParser.Nested_statementContext ctx) {
        return ctx.nested().getText() + "/n";
    }

    @Override
    public String visitSimpleAssigment(gParser.SimpleAssigmentContext ctx) {
        return ctx.assigment().getText() + "/n";
    }

    @Override
    public String visitSimpleRead(gParser.SimpleReadContext ctx) {
        return this.visitRead(ctx.read()) + "/n";
    }

    @Override
    public String visitSimpleWrite(gParser.SimpleWriteContext ctx) {
        return ctx.write().getText() + "/n";
    }

    @Override
    public String visitSimpleCallFunction(gParser.SimpleCallFunctionContext ctx) {
        return this.visitCall_function(ctx.call_function()) + "/n";
    }

    @Override
    public String visitNestedIf(gParser.NestedIfContext ctx) {
        return ctx.if_block().getText() + "/n";
    }

    @Override
    public String visitNestedWhile(gParser.NestedWhileContext ctx) {
        return ctx.while_loop().getText() + "/n";
    }

    @Override
    public String visitNestedFor(gParser.NestedForContext ctx) {
        return ctx.for_loop().getText() + "/n";
    }

    @Override
    public String visitNestedRepeat(gParser.NestedRepeatContext ctx) {
        return this.visitRepeat_loop(ctx.repeat_loop()) + "/n";
    }

    //Expressions to assign or compare
    @Override
    public String visitExprParen(gParser.ExprParenContext ctx) {
        return ctx.LPAREN().getText() + ctx.expression().getText() + ctx.RPAREN().getText();
    }

    @Override
    public String visitExprMult(gParser.ExprMultContext ctx) {
        String str = ctx.expression(0).getText();

        if (ctx.ASTERISK()!= null)
        {
            str += ctx.ASTERISK().getText();
        }
        else if(ctx.DIV() != null)
        {
            str += ctx.DIV().getText();
        }
        else if(ctx.MOD() != null)
        {
            str += ctx.MOD().getText();
        }
        else if(ctx.SLASH() != null)
        {
            str += ctx.SLASH().getText();
        }

        str += ctx.expression(1).getText();
        return str;
    }

    @Override
    public String visitExprSum(gParser.ExprSumContext ctx) {
        String str = ctx.expression(0).getText();

        if (ctx.PLUS()!= null)
        {
            str += ctx.PLUS().getText();
        }
        else if(ctx.MINUS() != null)
        {
            str += ctx.MINUS().getText();
        }

        str += ctx.expression(1).getText();
        return str;
    }

    @Override
    public String visitExprComp(gParser.ExprCompContext ctx) {
        String str = ctx.expression(0).getText();

        if (ctx.EQUAL()!= null)
        {
            str += ctx.EQUAL().getText();
        }
        else if(ctx.NOTEQUAL() != null)
        {
            str += ctx.NOTEQUAL().getText();
        }
        else if(ctx.LT() != null)
        {
            str += ctx.LT().getText();
        }
        else if(ctx.LE() != null)
        {
            str += ctx.LE().getText();
        }
        else if(ctx.GT() != null)
        {
            str += ctx.GT().getText();
        }
        else if(ctx.GE() != null)
        {
            str += ctx.GE().getText();
        }

        str += ctx.expression(1).getText();
        return str;
    }

    @Override
    public String visitExprLogic(gParser.ExprLogicContext ctx) {
        String str = ctx.expression(0).getText();
        if (ctx.AND()!= null)
        {
            str += ctx.AND().getText();
        }
        else if(ctx.OR() != null)
        {
            str += ctx.OR().getText();
        }

        str += ctx.expression(1).getText();
        return str;
    }

    @Override
    public String visitExprNot(gParser.ExprNotContext ctx) {
        return ctx.NOT().getText() + ctx.expression().getText();
    }

    @Override
    public String visitExprNeg(gParser.ExprNegContext ctx) {
        return ctx.MINUS().getText() + ctx.expression().getText();
    }

    @Override
    public String visitExprChar(gParser.ExprCharContext ctx) {
        String str = ctx.SINGLE_QUOTE(0).getText();

        if(ctx.ID() != null)
        {
            str += ctx.ID().getText();
        }
        else if(ctx.NUM() != null)
        {
            str += ctx.NUM().getText();
        }

        str += ctx.SINGLE_QUOTE(1).getText();
        return str;
    }

    @Override
    public String visitExprStr(gParser.ExprStrContext ctx) {
        return ctx.STR().getText();
    }

    @Override
    public String visitExprBool(gParser.ExprBoolContext ctx) {
        if(ctx.TRUE() != null)
        {
            return ctx.TRUE().getText();
        }

        return ctx.FALSE().getText();
    }

    @Override
    public String visitExprInt(gParser.ExprIntContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitExprID(gParser.ExprIDContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitExprArray(gParser.ExprArrayContext ctx) {
        return this.visitArrayExpression(ctx.arrayExpression());
    }

    @Override
    public String visitArrayExpression(gParser.ArrayExpressionContext ctx) {
        String str = ctx.ID().getText() + ctx.LBRACK().getText() + ctx.expression(0).getText();

        if(ctx.COMMA() != null)
        {
            str += ctx.COMMA().getText() + ctx.expression(1).getText();
        }

        str += ctx.RBRACK().getText();

        return str;
    }

    //Simple Statements
    @Override
    public String visitAssigmentVar(gParser.AssigmentVarContext ctx) {
        return ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expression().getText() + ctx.SEMI().getText();
    }

    @Override
    public String visitAssigmentArray(gParser.AssigmentArrayContext ctx) {
        String str = ctx.ID().getText() + ctx.LBRACK().getText() + ctx.expression(0).getText();

        if(ctx.COMMA() != null)
        {
            str += ctx.COMMA().getText() + ctx.expression(1).getText();
        }

        str += ctx.RBRACK().getText() + ctx.ASSIGN().getText() + ctx.expression(1).getText() + ctx.SEMI().getText();
        return str;
    }

    @Override
    public String visitRead(gParser.ReadContext ctx) {
        return ctx.READ().getText() + ctx.LPAREN().getText() +ctx.ID().getText() + ctx.RPAREN().getText() +ctx.SEMI().getText();
    }

    @Override
    public String visitWriteNormal(gParser.WriteNormalContext ctx) {
        String str =  ctx.WRITE().getText() + ctx.LPAREN().getText() + ctx.CONST_VAL().getText();

        if(ctx.COMMA() != null)
        {
            str += ctx.COMMA().getText();

            if (ctx.ID() != null)
            {
                str += ctx.ID().getText();
            }
            else if(ctx.expression() != null)
            {
                str += ctx.expression().getText();
            }
            else if(ctx.STR() != null)
            {
                str += ctx.STR().getText();
            }
        }

        str += ctx.RPAREN().getText() + ctx.SEMI().getText();

        return str;
    }

    @Override
    public String visitWriteLine(gParser.WriteLineContext ctx) {
        String str =  ctx.WRITELN().getText() + ctx.LPAREN().getText() + ctx.CONST_VAL().getText();

        if(ctx.COMMA() != null)
        {
            str += ctx.COMMA().getText();

            if (ctx.ID() != null)
            {
                str += ctx.ID().getText();
            }
            else if(ctx.expression() != null)
            {
                str += ctx.expression().getText();
            }
            else if(ctx.STR() != null)
            {
                str += ctx.STR().getText();
            }
        }

        str += ctx.RPAREN().getText() + ctx.SEMI().getText();

        return str;
    }

    @Override
    public String visitCall_function(gParser.Call_functionContext ctx) {
        String str = ctx.ID().getText() + ctx.LPAREN().getText();

        if(ctx.expression() != null)
        {
            str += ctx.expression(0).getText();

            if(ctx.COMMA() != null)
            {
                for(int i = 1; i < ctx.expression().size(); i++)
                {
                    str += ctx.COMMA(i-1).getText() + ctx.expression(i).getText();
                }
            }
        }

        str += ctx.RPAREN().getText() + ctx.SEMI().getText();

        return str;
    }

    //Nested Statements
    @Override
    public String visitIfBody(gParser.IfBodyContext ctx) {
        String str = ctx.IF().getText() + ctx.expression().getText() + ctx.THEN().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();

        if(ctx.else_if_block() != null)
        {
            for(int i = 0; i < ctx.else_if_block().size(); i++)
            {
                str += ctx.else_if_block(i).getText();
            }
        }

        if(ctx.else_block() != null)
        {
            str += ctx.else_block().getText();
        }

        return str;
    }

    @Override
    public String visitIfStat(gParser.IfStatContext ctx) {
        String str =  ctx.IF().getText() + ctx.expression().getText() + ctx.THEN().getText() + "/n" + ctx.statement().getText();

        if(ctx.else_if_block() != null)
        {
            for(int i = 0; i < ctx.else_if_block().size(); i++)
            {
                str += ctx.else_if_block(i).getText();
            }
        }

        if(ctx.else_block() != null)
        {
            str += ctx.else_block().getText();
        }

        return str;
    }

    @Override
    public String visitElseIfBody(gParser.ElseIfBodyContext ctx) {
        return ctx.ELSEIF().getText() + ctx.expression().getText() + ctx.THEN().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();
    }

    @Override
    public String visitElseIfStat(gParser.ElseIfStatContext ctx) {
        return ctx.ELSEIF().getText() + ctx.expression().getText() + ctx.THEN().getText() + "/n" + ctx.statement().getText();
    }

    @Override
    public String visitElseBody(gParser.ElseBodyContext ctx) {
        return ctx.ELSE().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();
    }

    @Override
    public String visitElseStat(gParser.ElseStatContext ctx) {
        return ctx.ELSE().getText() + "/n" + ctx.statement().getText();
    }

    @Override
    public String visitForToBody(gParser.ForToBodyContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expression(0).getText() + ctx.TO().getText() + ctx.expression(1).getText() + ctx.DO().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();
    }

    @Override
    public String visitForDownToBody(gParser.ForDownToBodyContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expression(0).getText() + ctx.DOWNTO().getText() + ctx.expression(1).getText() + ctx.DO().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();
    }

    @Override
    public String visitForToStat(gParser.ForToStatContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expression(0).getText() + ctx.TO().getText() + ctx.expression(1).getText() + ctx.DO().getText() + "/n" + ctx.statement().getText();
    }

    @Override
    public String visitForDownToStat(gParser.ForDownToStatContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expression(0).getText() + ctx.DOWNTO().getText() + ctx.expression(1).getText() + ctx.DO().getText() + "/n" + ctx.statement().getText();
    }

    @Override
    public String visitWhileBody(gParser.WhileBodyContext ctx) {
        return ctx.WHILE().getText() + ctx.LPAREN().getText() + ctx.expression().getText() + ctx.RPAREN().getText() + ctx.DO().getText() + "/n" + this.visitBody(ctx.body()) + ctx.SEMI();
    }

    @Override
    public String visitWhileStat(gParser.WhileStatContext ctx) {
        return ctx.WHILE().getText() + ctx.LPAREN().getText() + ctx.expression().getText() + ctx.RPAREN().getText() + ctx.DO().getText() + "/n" + ctx.statement().getText();
    }

    @Override
    public String visitRepeat_loop(gParser.Repeat_loopContext ctx) {
        String str =  ctx.REPEAT().getText() + "/n";

        for(int i = 0; i < ctx.statement().size(); i++)
        {
            str += ctx.statement(i).getText();
        }

        str += ctx.UNTIL().getText() + ctx.expression().getText() + ctx.SEMI().getText();

        return str;
    }
}
