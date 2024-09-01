// Generated from src/grammar/g.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, BEGIN=3, END=4, FUNCTION=5, PROCEDURE=6, IF=7, THEN=8, 
		ELSE=9, ELSEIF=10, FOR=11, TO=12, DOWNTO=13, DO=14, WHILE=15, REPEAT=16, 
		UNTIL=17, READ=18, WRITE=19, WRITELN=20, MOD=21, DIV=22, AND=23, OR=24, 
		NOT=25, TRUE=26, FALSE=27, ARRAY=28, OF=29, INTEGER=30, CHAR=31, BOOLEAN=32, 
		STRING=33, CONSTCHAR=34, CONSTSTR=35, COLON=36, SEMI=37, COMMA=38, LPAREN=39, 
		RPAREN=40, LBRACK=41, RBRACK=42, PLUS=43, MINUS=44, ASTERISK=45, SLASH=46, 
		EQUAL=47, NOTEQUAL=48, LT=49, LE=50, GT=51, GE=52, ASSIGN=53, DOT=54, 
		DOTDOT=55, SINGLE_QUOTE=56, ID=57, LETTER=58, NUM=59, WS=60, STR=61, ESC=62, 
		CONST_VAL=63, IGNORE_BLOCK=64;
	public static final int
		RULE_program_block = 0, RULE_src = 1, RULE_declaration = 2, RULE_var_block = 3, 
		RULE_variables = 4, RULE_varNames = 5, RULE_function_block = 6, RULE_type = 7, 
		RULE_arrayType = 8, RULE_constType = 9, RULE_array = 10, RULE_range = 11, 
		RULE_function_variables = 12, RULE_function = 13, RULE_body = 14, RULE_statement = 15, 
		RULE_simple = 16, RULE_nested = 17, RULE_expression = 18, RULE_arrayExpression = 19, 
		RULE_assigment = 20, RULE_read = 21, RULE_write = 22, RULE_call_function = 23, 
		RULE_if_block = 24, RULE_else_if_block = 25, RULE_else_block = 26, RULE_for_loop = 27, 
		RULE_while_loop = 28, RULE_repeat_loop = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program_block", "src", "declaration", "var_block", "variables", "varNames", 
			"function_block", "type", "arrayType", "constType", "array", "range", 
			"function_variables", "function", "body", "statement", "simple", "nested", 
			"expression", "arrayExpression", "assigment", "read", "write", "call_function", 
			"if_block", "else_if_block", "else_block", "for_loop", "while_loop", 
			"repeat_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'var'", "'begin'", "'end'", "'function'", "'procedure'", 
			"'if'", "'then'", "'else'", "'else if'", "'for'", "'to'", "'downto'", 
			"'do'", "'while'", "'repeat'", "'until'", "'read'", "'write'", "'writeln'", 
			"'mod'", "'div'", "'and'", "'or'", "'not'", "'true'", "'false'", "'array'", 
			"'of'", "'integer'", "'char'", "'boolean'", "'string'", "'constchar'", 
			"'conststr'", "':'", "';'", "','", "'('", "')'", "'['", "']'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'<>'", "'<'", "'<='", "'>'", "'>='", "':='", 
			"'.'", "'..'", "'''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "VAR", "BEGIN", "END", "FUNCTION", "PROCEDURE", "IF", 
			"THEN", "ELSE", "ELSEIF", "FOR", "TO", "DOWNTO", "DO", "WHILE", "REPEAT", 
			"UNTIL", "READ", "WRITE", "WRITELN", "MOD", "DIV", "AND", "OR", "NOT", 
			"TRUE", "FALSE", "ARRAY", "OF", "INTEGER", "CHAR", "BOOLEAN", "STRING", 
			"CONSTCHAR", "CONSTSTR", "COLON", "SEMI", "COMMA", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "PLUS", "MINUS", "ASTERISK", "SLASH", "EQUAL", "NOTEQUAL", 
			"LT", "LE", "GT", "GE", "ASSIGN", "DOT", "DOTDOT", "SINGLE_QUOTE", "ID", 
			"LETTER", "NUM", "WS", "STR", "ESC", "CONST_VAL", "IGNORE_BLOCK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Program_blockContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(gParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public Program_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitProgram_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_blockContext program_block() throws RecognitionException {
		Program_blockContext _localctx = new Program_blockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PROGRAM);
			setState(61);
			match(ID);
			setState(62);
			match(SEMI);
			setState(63);
			src();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(gParser.DOT, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			declaration();
			setState(66);
			body();
			setState(67);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Var_blockContext var_block() {
			return getRuleContext(Var_blockContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(69);
				var_block();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(72);
				function_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(gParser.VAR, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public Var_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVar_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_blockContext var_block() throws RecognitionException {
		Var_blockContext _localctx = new Var_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(VAR);
			setState(76);
			variables();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(77);
				variables();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Constant_declarationContext extends VariablesContext {
		public VarNamesContext varNames() {
			return getRuleContext(VarNamesContext.class,0);
		}
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public Constant_declarationContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Variable_declarationContext extends VariablesContext {
		public VarNamesContext varNames() {
			return getRuleContext(VarNamesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public Variable_declarationContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends VariablesContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public Array_declarationContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Constant_initializationContext extends VariablesContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public TerminalNode CONST_VAL() { return getToken(gParser.CONST_VAL, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public Constant_initializationContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitConstant_initialization(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Variable_initializationContext extends VariablesContext {
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public Variable_initializationContext(VariablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVariable_initialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Variable_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				varNames();
				setState(84);
				match(COLON);
				setState(85);
				type();
				setState(86);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new Array_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(COLON);
				setState(90);
				array();
				setState(91);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new Constant_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				varNames();
				setState(94);
				constType();
				setState(95);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new Constant_initializationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(ID);
				setState(98);
				match(COLON);
				setState(99);
				constType();
				setState(100);
				match(ASSIGN);
				setState(101);
				match(CONST_VAL);
				setState(102);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new Variable_initializationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				assigment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public VarNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitVarNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNamesContext varNames() throws RecognitionException {
		VarNamesContext _localctx = new VarNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				match(ID);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				function();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class String_TypeContext extends TypeContext {
		public TerminalNode STRING() { return getToken(gParser.STRING, 0); }
		public String_TypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitString_Type(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_TypeContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public Array_TypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArray_Type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case CHAR:
			case BOOLEAN:
				_localctx = new Array_TypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				arrayType();
				}
				break;
			case STRING:
				_localctx = new String_TypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BOOLContext extends ArrayTypeContext {
		public TerminalNode BOOLEAN() { return getToken(gParser.BOOLEAN, 0); }
		public BOOLContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBOOL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CHARContext extends ArrayTypeContext {
		public TerminalNode CHAR() { return getToken(gParser.CHAR, 0); }
		public CHARContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCHAR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INTContext extends ArrayTypeContext {
		public TerminalNode INTEGER() { return getToken(gParser.INTEGER, 0); }
		public INTContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayType);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new INTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(INTEGER);
				}
				break;
			case CHAR:
				_localctx = new CHARContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				_localctx = new BOOLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstTypeContext extends ParserRuleContext {
		public ConstTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constType; }
	 
		public ConstTypeContext() { }
		public void copyFrom(ConstTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CONSTSTRContext extends ConstTypeContext {
		public TerminalNode CONSTSTR() { return getToken(gParser.CONSTSTR, 0); }
		public CONSTSTRContext(ConstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCONSTSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CONSTCHContext extends ConstTypeContext {
		public TerminalNode CONSTCHAR() { return getToken(gParser.CONSTCHAR, 0); }
		public CONSTCHContext(ConstTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCONSTCH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstTypeContext constType() throws RecognitionException {
		ConstTypeContext _localctx = new ConstTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constType);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTCHAR:
				_localctx = new CONSTCHContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(CONSTCHAR);
				}
				break;
			case CONSTSTR:
				_localctx = new CONSTSTRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(CONSTSTR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(gParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(gParser.LBRACK, 0); }
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(gParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(gParser.OF, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ARRAY);
			setState(134);
			match(LBRACK);
			setState(135);
			range();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(136);
				match(COMMA);
				setState(137);
				range();
				}
			}

			setState(140);
			match(RBRACK);
			setState(141);
			match(OF);
			setState(142);
			arrayType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(gParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(gParser.NUM, i);
		}
		public TerminalNode DOTDOT() { return getToken(gParser.DOTDOT, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(NUM);
			setState(145);
			match(DOTDOT);
			setState(146);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_variablesContext extends ParserRuleContext {
		public Function_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_variables; }
	 
		public Function_variablesContext() { }
		public void copyFrom(Function_variablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_variables_arrayContext extends Function_variablesContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public Function_variables_arrayContext(Function_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_variables_array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_variables_normalContext extends Function_variablesContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public Function_variables_normalContext(Function_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_variables_normal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_variables_constContext extends Function_variablesContext {
		public List<TerminalNode> ID() { return getTokens(gParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(gParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public ConstTypeContext constType() {
			return getRuleContext(ConstTypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public Function_variables_constContext(Function_variablesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction_variables_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_variablesContext function_variables() throws RecognitionException {
		Function_variablesContext _localctx = new Function_variablesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_variables);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Function_variables_normalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(149);
					match(COMMA);
					setState(150);
					match(ID);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(COLON);
				setState(157);
				type();
				}
				break;
			case 2:
				_localctx = new Function_variables_arrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(ID);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					match(ID);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(COLON);
				setState(167);
				array();
				}
				break;
			case 3:
				_localctx = new Function_variables_constContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(ID);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					match(ID);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(COLON);
				setState(177);
				constType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(gParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(gParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(gParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(gParser.SEMI, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<Function_variablesContext> function_variables() {
			return getRuleContexts(Function_variablesContext.class);
		}
		public Function_variablesContext function_variables(int i) {
			return getRuleContext(Function_variablesContext.class,i);
		}
		public Var_blockContext var_block() {
			return getRuleContext(Var_blockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FUNCTION);
			setState(181);
			match(ID);
			setState(182);
			match(LPAREN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(183);
				function_variables();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(184);
					match(SEMI);
					setState(185);
					function_variables();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(RPAREN);
			setState(194);
			match(COLON);
			setState(195);
			type();
			setState(196);
			match(SEMI);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(197);
				var_block();
				}
			}

			setState(200);
			body();
			setState(201);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(gParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(gParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(BEGIN);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188077791360L) != 0) );
			setState(209);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Nested_statementContext extends StatementContext {
		public NestedContext nested() {
			return getRuleContext(NestedContext.class,0);
		}
		public Nested_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNested_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Simple_statementContext extends StatementContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public Simple_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case WRITE:
			case WRITELN:
			case ID:
				_localctx = new Simple_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				simple();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case REPEAT:
				_localctx = new Nested_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				nested();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleContext extends ParserRuleContext {
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
	 
		public SimpleContext() { }
		public void copyFrom(SimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleWriteContext extends SimpleContext {
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public SimpleWriteContext(SimpleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleReadContext extends SimpleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public SimpleReadContext(SimpleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleRead(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCallFunctionContext extends SimpleContext {
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public SimpleCallFunctionContext(SimpleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssigmentContext extends SimpleContext {
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public SimpleAssigmentContext(SimpleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSimpleAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new SimpleAssigmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				assigment();
				}
				break;
			case 2:
				_localctx = new SimpleReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				read();
				}
				break;
			case 3:
				_localctx = new SimpleWriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				write();
				}
				break;
			case 4:
				_localctx = new SimpleCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				call_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedContext extends ParserRuleContext {
		public NestedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested; }
	 
		public NestedContext() { }
		public void copyFrom(NestedContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedIfContext extends NestedContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public NestedIfContext(NestedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedWhileContext extends NestedContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public NestedWhileContext(NestedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedRepeatContext extends NestedContext {
		public Repeat_loopContext repeat_loop() {
			return getRuleContext(Repeat_loopContext.class,0);
		}
		public NestedRepeatContext(NestedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedForContext extends NestedContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public NestedForContext(NestedContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitNestedFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedContext nested() throws RecognitionException {
		NestedContext _localctx = new NestedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nested);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new NestedIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				if_block();
				}
				break;
			case WHILE:
				_localctx = new NestedWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				while_loop();
				}
				break;
			case FOR:
				_localctx = new NestedForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				for_loop();
				}
				break;
			case REPEAT:
				_localctx = new NestedRepeatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				repeat_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public ExprIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNegContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(gParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(gParser.NOTEQUAL, 0); }
		public TerminalNode LT() { return getToken(gParser.LT, 0); }
		public TerminalNode LE() { return getToken(gParser.LE, 0); }
		public TerminalNode GE() { return getToken(gParser.GE, 0); }
		public TerminalNode GT() { return getToken(gParser.GT, 0); }
		public ExprCompContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprComp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(gParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrContext extends ExpressionContext {
		public TerminalNode STR() { return getToken(gParser.STR, 0); }
		public ExprStrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(gParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(gParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(gParser.MOD, 0); }
		public TerminalNode DIV() { return getToken(gParser.DIV, 0); }
		public ExprMultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCharContext extends ExpressionContext {
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(gParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(gParser.SINGLE_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode NUM() { return getToken(gParser.NUM, 0); }
		public ExprCharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprSumContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public ExprSumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprSum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public ExprParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(gParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(gParser.FALSE, 0); }
		public ExprBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public ExprIDContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(gParser.AND, 0); }
		public TerminalNode OR() { return getToken(gParser.OR, 0); }
		public ExprLogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayContext extends ExpressionContext {
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public ExprArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExprArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(228);
				match(LPAREN);
				setState(229);
				expression(0);
				setState(230);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(NOT);
				setState(233);
				expression(8);
				}
				break;
			case 3:
				{
				_localctx = new ExprNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(MINUS);
				setState(235);
				expression(7);
				}
				break;
			case 4:
				{
				_localctx = new ExprCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(236);
				match(SINGLE_QUOTE);
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(SINGLE_QUOTE);
				}
				}
				break;
			case 5:
				{
				_localctx = new ExprStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(STR);
				}
				break;
			case 6:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(NUM);
				}
				break;
			case 8:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ExprArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553122557952L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprSumContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(250);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(251);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprCompContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(253);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(254);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(256);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(gParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(gParser.RBRACK, 0); }
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(264);
			match(LBRACK);
			setState(265);
			expression(0);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(266);
				match(COMMA);
				setState(267);
				expression(0);
				}
			}

			setState(270);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssigmentContext extends ParserRuleContext {
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
	 
		public AssigmentContext() { }
		public void copyFrom(AssigmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssigmentVarContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public AssigmentVarContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssigmentVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssigmentArrayContext extends AssigmentContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(gParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(gParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public AssigmentArrayContext(AssigmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAssigmentArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assigment);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AssigmentVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(ID);
				setState(273);
				match(ASSIGN);
				setState(274);
				expression(0);
				setState(275);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssigmentArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(ID);
				setState(278);
				match(LBRACK);
				setState(279);
				expression(0);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(280);
					match(COMMA);
					setState(281);
					expression(0);
					}
				}

				setState(284);
				match(RBRACK);
				setState(285);
				match(ASSIGN);
				setState(286);
				expression(0);
				setState(287);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(gParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(READ);
			setState(292);
			match(LPAREN);
			setState(293);
			match(ID);
			setState(294);
			match(RPAREN);
			setState(295);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	 
		public WriteContext() { }
		public void copyFrom(WriteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteNormalContext extends WriteContext {
		public TerminalNode WRITE() { return getToken(gParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode CONST_VAL() { return getToken(gParser.CONST_VAL, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STR() { return getToken(gParser.STR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public WriteNormalContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWriteNormal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteLineContext extends WriteContext {
		public TerminalNode WRITELN() { return getToken(gParser.WRITELN, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode CONST_VAL() { return getToken(gParser.CONST_VAL, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(gParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STR() { return getToken(gParser.STR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public WriteLineContext(WriteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWriteLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_write);
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(WRITE);
				setState(298);
				match(LPAREN);
				setState(299);
				match(CONST_VAL);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(300);
					match(COMMA);
					setState(301);
					expression(0);
					}
					break;
				case STR:
					{
					setState(302);
					match(STR);
					}
					break;
				case ID:
					{
					setState(303);
					match(ID);
					}
					break;
				case RPAREN:
					break;
				default:
					break;
				}
				setState(306);
				match(RPAREN);
				setState(307);
				match(SEMI);
				}
				break;
			case WRITELN:
				_localctx = new WriteLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(WRITELN);
				setState(309);
				match(LPAREN);
				setState(310);
				match(CONST_VAL);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(311);
					match(COMMA);
					setState(312);
					expression(0);
					}
					break;
				case STR:
					{
					setState(313);
					match(STR);
					}
					break;
				case ID:
					{
					setState(314);
					match(ID);
					}
					break;
				case RPAREN:
					break;
				default:
					break;
				}
				setState(317);
				match(RPAREN);
				setState(318);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(gParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gParser.COMMA, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ID);
			setState(322);
			match(LPAREN);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3098494685807640576L) != 0)) {
				{
				setState(323);
				expression(0);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(324);
					match(COMMA);
					setState(325);
					expression(0);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(333);
			match(RPAREN);
			setState(334);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_blockContext extends ParserRuleContext {
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	 
		public If_blockContext() { }
		public void copyFrom(If_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends If_blockContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(gParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<Else_if_blockContext> else_if_block() {
			return getRuleContexts(Else_if_blockContext.class);
		}
		public Else_if_blockContext else_if_block(int i) {
			return getRuleContext(Else_if_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public IfStatContext(If_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyContext extends If_blockContext {
		public TerminalNode IF() { return getToken(gParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(gParser.THEN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public List<Else_if_blockContext> else_if_block() {
			return getRuleContexts(Else_if_blockContext.class);
		}
		public Else_if_blockContext else_if_block(int i) {
			return getRuleContext(Else_if_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public IfBodyContext(If_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_block);
		try {
			int _alt;
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new IfBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(IF);
				setState(337);
				expression(0);
				setState(338);
				match(THEN);
				{
				setState(339);
				body();
				setState(340);
				match(SEMI);
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
						else_if_block();
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(348);
					else_block();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(IF);
				setState(352);
				expression(0);
				setState(353);
				match(THEN);
				setState(354);
				statement();
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(355);
						else_if_block();
						}
						} 
					}
					setState(360);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(361);
					else_block();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_blockContext extends ParserRuleContext {
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
	 
		public Else_if_blockContext() { }
		public void copyFrom(Else_if_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatContext extends Else_if_blockContext {
		public TerminalNode ELSEIF() { return getToken(gParser.ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(gParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseIfStatContext(Else_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfBodyContext extends Else_if_blockContext {
		public TerminalNode ELSEIF() { return getToken(gParser.ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(gParser.THEN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public ElseIfBodyContext(Else_if_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_if_block);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new ElseIfBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(ELSEIF);
				setState(367);
				expression(0);
				setState(368);
				match(THEN);
				{
				setState(369);
				body();
				setState(370);
				match(SEMI);
				}
				}
				break;
			case 2:
				_localctx = new ElseIfStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(ELSEIF);
				setState(373);
				expression(0);
				setState(374);
				match(THEN);
				setState(375);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_blockContext extends ParserRuleContext {
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	 
		public Else_blockContext() { }
		public void copyFrom(Else_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatContext extends Else_blockContext {
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatContext(Else_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseBodyContext extends Else_blockContext {
		public TerminalNode ELSE() { return getToken(gParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public ElseBodyContext(Else_blockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitElseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_block);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new ElseBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(ELSE);
				{
				setState(380);
				body();
				setState(381);
				match(SEMI);
				}
				}
				break;
			case 2:
				_localctx = new ElseStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(ELSE);
				setState(384);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForDownToBodyContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOWNTO() { return getToken(gParser.DOWNTO, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public ForDownToBodyContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForDownToBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForToBodyContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(gParser.TO, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public ForToBodyContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForToBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForToStatContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(gParser.TO, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForToStatContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForToStat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForDownToStatContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(gParser.FOR, 0); }
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(gParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOWNTO() { return getToken(gParser.DOWNTO, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForDownToStatContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitForDownToStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_loop);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new ForToBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(FOR);
				setState(388);
				match(ID);
				setState(389);
				match(ASSIGN);
				setState(390);
				expression(0);
				setState(391);
				match(TO);
				setState(392);
				expression(0);
				setState(393);
				match(DO);
				{
				setState(394);
				body();
				setState(395);
				match(SEMI);
				}
				}
				break;
			case 2:
				_localctx = new ForDownToBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(FOR);
				setState(398);
				match(ID);
				setState(399);
				match(ASSIGN);
				setState(400);
				expression(0);
				setState(401);
				match(DOWNTO);
				setState(402);
				expression(0);
				setState(403);
				match(DO);
				{
				setState(404);
				body();
				setState(405);
				match(SEMI);
				}
				}
				break;
			case 3:
				_localctx = new ForToStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(FOR);
				setState(408);
				match(ID);
				setState(409);
				match(ASSIGN);
				setState(410);
				expression(0);
				setState(411);
				match(TO);
				setState(412);
				expression(0);
				setState(413);
				match(DO);
				setState(414);
				statement();
				}
				break;
			case 4:
				_localctx = new ForDownToStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				match(FOR);
				setState(417);
				match(ID);
				setState(418);
				match(ASSIGN);
				setState(419);
				expression(0);
				setState(420);
				match(DOWNTO);
				setState(421);
				expression(0);
				setState(422);
				match(DO);
				setState(423);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileBodyContext extends While_loopContext {
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public WhileBodyContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatContext extends While_loopContext {
		public TerminalNode WHILE() { return getToken(gParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode DO() { return getToken(gParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_while_loop);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new WhileBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(WHILE);
				setState(428);
				match(LPAREN);
				setState(429);
				expression(0);
				setState(430);
				match(RPAREN);
				setState(431);
				match(DO);
				{
				setState(432);
				body();
				setState(433);
				match(SEMI);
				}
				}
				break;
			case 2:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(WHILE);
				setState(436);
				match(LPAREN);
				setState(437);
				expression(0);
				setState(438);
				match(RPAREN);
				setState(439);
				match(DO);
				setState(440);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Repeat_loopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(gParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(gParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Repeat_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitRepeat_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_loopContext repeat_loop() throws RecognitionException {
		Repeat_loopContext _localctx = new Repeat_loopContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_repeat_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(REPEAT);
			setState(446); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(445);
				statement();
				}
				}
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 144115188077791360L) != 0) );
			setState(450);
			match(UNTIL);
			setState(451);
			expression(0);
			setState(452);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u01c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0003\u0002"+
		"J\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003"+
		"\f\u0003R\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004j\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005o\b\u0005"+
		"\n\u0005\f\u0005r\t\u0005\u0001\u0006\u0004\u0006u\b\u0006\u000b\u0006"+
		"\f\u0006v\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0080\b\b\u0001\t\u0001\t\u0003\t\u0084\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u008b\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0098\b\f\n\f\f\f\u009b\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00a2\b\f\n\f\f\f\u00a5\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\f\u0001\f\u0003\f"+
		"\u00b3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bb"+
		"\b\r\n\r\f\r\u00be\t\r\u0003\r\u00c0\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00c7\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0004\u000e\u00ce\b\u000e\u000b\u000e\f\u000e\u00cf\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00d6\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dc\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00e2\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f5\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0103\b\u0012\n\u0012\f\u0012\u0106\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010d\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u011b\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0122\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0131\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013c\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0140\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0147\b\u0017\n\u0017\f\u0017\u014a\t\u0017"+
		"\u0003\u0017\u014c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0158\b\u0018\n\u0018\f\u0018\u015b\t\u0018\u0001\u0018\u0003"+
		"\u0018\u015e\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0165\b\u0018\n\u0018\f\u0018\u0168\t\u0018\u0001\u0018"+
		"\u0003\u0018\u016b\b\u0018\u0003\u0018\u016d\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u017a\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0182\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01aa\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01bb\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0004\u001d\u01bf\b\u001d\u000b\u001d\f\u001d\u01c0\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0001$\u001e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:\u0000\u0006\u0002\u000099;;\u0001\u0000\u001a\u001b"+
		"\u0002\u0000\u0015\u0016-.\u0001\u0000+,\u0001\u0000/4\u0001\u0000\u0017"+
		"\u0018\u01ea\u0000<\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004F\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bi\u0001"+
		"\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\ft\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012"+
		"\u0083\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016"+
		"\u0090\u0001\u0000\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a"+
		"\u00b4\u0001\u0000\u0000\u0000\u001c\u00cb\u0001\u0000\u0000\u0000\u001e"+
		"\u00d5\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000\u0000\"\u00e1"+
		"\u0001\u0000\u0000\u0000$\u00f4\u0001\u0000\u0000\u0000&\u0107\u0001\u0000"+
		"\u0000\u0000(\u0121\u0001\u0000\u0000\u0000*\u0123\u0001\u0000\u0000\u0000"+
		",\u013f\u0001\u0000\u0000\u0000.\u0141\u0001\u0000\u0000\u00000\u016c"+
		"\u0001\u0000\u0000\u00002\u0179\u0001\u0000\u0000\u00004\u0181\u0001\u0000"+
		"\u0000\u00006\u01a9\u0001\u0000\u0000\u00008\u01ba\u0001\u0000\u0000\u0000"+
		":\u01bc\u0001\u0000\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u00059\u0000"+
		"\u0000>?\u0005%\u0000\u0000?@\u0003\u0002\u0001\u0000@\u0001\u0001\u0000"+
		"\u0000\u0000AB\u0003\u0004\u0002\u0000BC\u0003\u001c\u000e\u0000CD\u0005"+
		"6\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EG\u0003\u0006\u0003\u0000"+
		"FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000"+
		"\u0000HJ\u0003\f\u0006\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005\u0002\u0000\u0000LP\u0003"+
		"\b\u0004\u0000MO\u0003\b\u0004\u0000NM\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\u0007\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0003\n\u0005"+
		"\u0000TU\u0005$\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005%\u0000\u0000"+
		"Wj\u0001\u0000\u0000\u0000XY\u00059\u0000\u0000YZ\u0005$\u0000\u0000Z"+
		"[\u0003\u0014\n\u0000[\\\u0005%\u0000\u0000\\j\u0001\u0000\u0000\u0000"+
		"]^\u0003\n\u0005\u0000^_\u0003\u0012\t\u0000_`\u0005%\u0000\u0000`j\u0001"+
		"\u0000\u0000\u0000ab\u00059\u0000\u0000bc\u0005$\u0000\u0000cd\u0003\u0012"+
		"\t\u0000de\u00055\u0000\u0000ef\u0005?\u0000\u0000fg\u0005%\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hj\u0003(\u0014\u0000iS\u0001\u0000\u0000\u0000"+
		"iX\u0001\u0000\u0000\u0000i]\u0001\u0000\u0000\u0000ia\u0001\u0000\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000kp\u00059\u0000"+
		"\u0000lm\u0005&\u0000\u0000mo\u00059\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q\u000b\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0003"+
		"\u001a\r\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\r\u0001\u0000\u0000\u0000"+
		"x{\u0003\u0010\b\u0000y{\u0005!\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|\u0080\u0005"+
		"\u001e\u0000\u0000}\u0080\u0005\u001f\u0000\u0000~\u0080\u0005 \u0000"+
		"\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"~\u0001\u0000\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0005\"\u0000\u0000\u0082\u0084\u0005#\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0013\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u001c\u0000\u0000\u0086\u0087\u0005"+
		")\u0000\u0000\u0087\u008a\u0003\u0016\u000b\u0000\u0088\u0089\u0005&\u0000"+
		"\u0000\u0089\u008b\u0003\u0016\u000b\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005*\u0000\u0000\u008d\u008e\u0005\u001d\u0000\u0000"+
		"\u008e\u008f\u0003\u0010\b\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005;\u0000\u0000\u0091\u0092\u00057\u0000\u0000\u0092\u0093\u0005"+
		";\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0099\u00059\u0000"+
		"\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u0098\u00059\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005$\u0000\u0000\u009d\u00b3\u0003\u000e\u0007\u0000\u009e\u00a3"+
		"\u00059\u0000\u0000\u009f\u00a0\u0005&\u0000\u0000\u00a0\u00a2\u00059"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005$\u0000\u0000\u00a7\u00b3\u0003\u0014\n"+
		"\u0000\u00a8\u00ad\u00059\u0000\u0000\u00a9\u00aa\u0005&\u0000\u0000\u00aa"+
		"\u00ac\u00059\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005$\u0000\u0000\u00b1\u00b3\u0003"+
		"\u0012\t\u0000\u00b2\u0094\u0001\u0000\u0000\u0000\u00b2\u009e\u0001\u0000"+
		"\u0000\u0000\u00b2\u00a8\u0001\u0000\u0000\u0000\u00b3\u0019\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6\u00059\u0000"+
		"\u0000\u00b6\u00bf\u0005\'\u0000\u0000\u00b7\u00bc\u0003\u0018\f\u0000"+
		"\u00b8\u00b9\u0005%\u0000\u0000\u00b9\u00bb\u0003\u0018\f\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005(\u0000\u0000\u00c2\u00c3"+
		"\u0005$\u0000\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c6\u0005"+
		"%\u0000\u0000\u00c5\u00c7\u0003\u0006\u0003\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0003\u001c\u000e\u0000\u00c9\u00ca\u0005%\u0000"+
		"\u0000\u00ca\u001b\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u0003\u0000"+
		"\u0000\u00cc\u00ce\u0003\u001e\u000f\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0004\u0000\u0000\u00d2\u001d\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0003 \u0010\u0000\u00d4\u00d6\u0003\"\u0011\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d6\u001f\u0001\u0000\u0000\u0000\u00d7\u00dc\u0003(\u0014\u0000\u00d8"+
		"\u00dc\u0003*\u0015\u0000\u00d9\u00dc\u0003,\u0016\u0000\u00da\u00dc\u0003"+
		".\u0017\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00e2\u00030\u0018\u0000"+
		"\u00de\u00e2\u00038\u001c\u0000\u00df\u00e2\u00036\u001b\u0000\u00e0\u00e2"+
		"\u0003:\u001d\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e4\u0006\u0012"+
		"\uffff\uffff\u0000\u00e4\u00e5\u0005\'\u0000\u0000\u00e5\u00e6\u0003$"+
		"\u0012\u0000\u00e6\u00e7\u0005(\u0000\u0000\u00e7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9\u00f5\u0003$\u0012\b"+
		"\u00ea\u00eb\u0005,\u0000\u0000\u00eb\u00f5\u0003$\u0012\u0007\u00ec\u00ed"+
		"\u00058\u0000\u0000\u00ed\u00ee\u0007\u0000\u0000\u0000\u00ee\u00f5\u0005"+
		"8\u0000\u0000\u00ef\u00f5\u0005=\u0000\u0000\u00f0\u00f5\u0007\u0001\u0000"+
		"\u0000\u00f1\u00f5\u0005;\u0000\u0000\u00f2\u00f5\u00059\u0000\u0000\u00f3"+
		"\u00f5\u0003&\u0013\u0000\u00f4\u00e3\u0001\u0000\u0000\u0000\u00f4\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ea\u0001\u0000\u0000\u0000\u00f4\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u0104"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\n\f\u0000\u0000\u00f7\u00f8\u0007"+
		"\u0002\u0000\u0000\u00f8\u0103\u0003$\u0012\r\u00f9\u00fa\n\u000b\u0000"+
		"\u0000\u00fa\u00fb\u0007\u0003\u0000\u0000\u00fb\u0103\u0003$\u0012\f"+
		"\u00fc\u00fd\n\n\u0000\u0000\u00fd\u00fe\u0007\u0004\u0000\u0000\u00fe"+
		"\u0103\u0003$\u0012\u000b\u00ff\u0100\n\t\u0000\u0000\u0100\u0101\u0007"+
		"\u0005\u0000\u0000\u0101\u0103\u0003$\u0012\n\u0102\u00f6\u0001\u0000"+
		"\u0000\u0000\u0102\u00f9\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000"+
		"\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105%\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u00059\u0000\u0000\u0108\u0109\u0005)\u0000\u0000\u0109"+
		"\u010c\u0003$\u0012\u0000\u010a\u010b\u0005&\u0000\u0000\u010b\u010d\u0003"+
		"$\u0012\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005*\u0000"+
		"\u0000\u010f\'\u0001\u0000\u0000\u0000\u0110\u0111\u00059\u0000\u0000"+
		"\u0111\u0112\u00055\u0000\u0000\u0112\u0113\u0003$\u0012\u0000\u0113\u0114"+
		"\u0005%\u0000\u0000\u0114\u0122\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"9\u0000\u0000\u0116\u0117\u0005)\u0000\u0000\u0117\u011a\u0003$\u0012"+
		"\u0000\u0118\u0119\u0005&\u0000\u0000\u0119\u011b\u0003$\u0012\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011d\u011e"+
		"\u00055\u0000\u0000\u011e\u011f\u0003$\u0012\u0000\u011f\u0120\u0005%"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u0110\u0001\u0000"+
		"\u0000\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0122)\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u0012\u0000\u0000\u0124\u0125\u0005\'\u0000\u0000"+
		"\u0125\u0126\u00059\u0000\u0000\u0126\u0127\u0005(\u0000\u0000\u0127\u0128"+
		"\u0005%\u0000\u0000\u0128+\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0013"+
		"\u0000\u0000\u012a\u012b\u0005\'\u0000\u0000\u012b\u0130\u0005?\u0000"+
		"\u0000\u012c\u012d\u0005&\u0000\u0000\u012d\u0131\u0003$\u0012\u0000\u012e"+
		"\u0131\u0005=\u0000\u0000\u012f\u0131\u00059\u0000\u0000\u0130\u012c\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005(\u0000\u0000\u0133\u0140\u0005%\u0000"+
		"\u0000\u0134\u0135\u0005\u0014\u0000\u0000\u0135\u0136\u0005\'\u0000\u0000"+
		"\u0136\u013b\u0005?\u0000\u0000\u0137\u0138\u0005&\u0000\u0000\u0138\u013c"+
		"\u0003$\u0012\u0000\u0139\u013c\u0005=\u0000\u0000\u013a\u013c\u00059"+
		"\u0000\u0000\u013b\u0137\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000"+
		"\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005(\u0000"+
		"\u0000\u013e\u0140\u0005%\u0000\u0000\u013f\u0129\u0001\u0000\u0000\u0000"+
		"\u013f\u0134\u0001\u0000\u0000\u0000\u0140-\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u00059\u0000\u0000\u0142\u014b\u0005\'\u0000\u0000\u0143\u0148"+
		"\u0003$\u0012\u0000\u0144\u0145\u0005&\u0000\u0000\u0145\u0147\u0003$"+
		"\u0012\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000"+
		"\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000"+
		"\u0000\u0000\u014b\u0143\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005(\u0000"+
		"\u0000\u014e\u014f\u0005%\u0000\u0000\u014f/\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0005\u0007\u0000\u0000\u0151\u0152\u0003$\u0012\u0000\u0152\u0153"+
		"\u0005\b\u0000\u0000\u0153\u0154\u0003\u001c\u000e\u0000\u0154\u0155\u0005"+
		"%\u0000\u0000\u0155\u0159\u0001\u0000\u0000\u0000\u0156\u0158\u00032\u0019"+
		"\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u00034\u001a\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u016d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0005\u0007\u0000\u0000\u0160\u0161\u0003$\u0012\u0000\u0161"+
		"\u0162\u0005\b\u0000\u0000\u0162\u0166\u0003\u001e\u000f\u0000\u0163\u0165"+
		"\u00032\u0019\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165\u0168\u0001"+
		"\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u00034\u001a\u0000\u016a\u0169\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000"+
		"\u0000\u0000\u016c\u0150\u0001\u0000\u0000\u0000\u016c\u015f\u0001\u0000"+
		"\u0000\u0000\u016d1\u0001\u0000\u0000\u0000\u016e\u016f\u0005\n\u0000"+
		"\u0000\u016f\u0170\u0003$\u0012\u0000\u0170\u0171\u0005\b\u0000\u0000"+
		"\u0171\u0172\u0003\u001c\u000e\u0000\u0172\u0173\u0005%\u0000\u0000\u0173"+
		"\u017a\u0001\u0000\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175\u0176"+
		"\u0003$\u0012\u0000\u0176\u0177\u0005\b\u0000\u0000\u0177\u0178\u0003"+
		"\u001e\u000f\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u016e\u0001"+
		"\u0000\u0000\u0000\u0179\u0174\u0001\u0000\u0000\u0000\u017a3\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0005\t\u0000\u0000\u017c\u017d\u0003\u001c\u000e"+
		"\u0000\u017d\u017e\u0005%\u0000\u0000\u017e\u0182\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\t\u0000\u0000\u0180\u0182\u0003\u001e\u000f\u0000\u0181"+
		"\u017b\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182"+
		"5\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u000b\u0000\u0000\u0184\u0185"+
		"\u00059\u0000\u0000\u0185\u0186\u00055\u0000\u0000\u0186\u0187\u0003$"+
		"\u0012\u0000\u0187\u0188\u0005\f\u0000\u0000\u0188\u0189\u0003$\u0012"+
		"\u0000\u0189\u018a\u0005\u000e\u0000\u0000\u018a\u018b\u0003\u001c\u000e"+
		"\u0000\u018b\u018c\u0005%\u0000\u0000\u018c\u01aa\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005\u000b\u0000\u0000\u018e\u018f\u00059\u0000\u0000\u018f"+
		"\u0190\u00055\u0000\u0000\u0190\u0191\u0003$\u0012\u0000\u0191\u0192\u0005"+
		"\r\u0000\u0000\u0192\u0193\u0003$\u0012\u0000\u0193\u0194\u0005\u000e"+
		"\u0000\u0000\u0194\u0195\u0003\u001c\u000e\u0000\u0195\u0196\u0005%\u0000"+
		"\u0000\u0196\u01aa\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u000b\u0000"+
		"\u0000\u0198\u0199\u00059\u0000\u0000\u0199\u019a\u00055\u0000\u0000\u019a"+
		"\u019b\u0003$\u0012\u0000\u019b\u019c\u0005\f\u0000\u0000\u019c\u019d"+
		"\u0003$\u0012\u0000\u019d\u019e\u0005\u000e\u0000\u0000\u019e\u019f\u0003"+
		"\u001e\u000f\u0000\u019f\u01aa\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005"+
		"\u000b\u0000\u0000\u01a1\u01a2\u00059\u0000\u0000\u01a2\u01a3\u00055\u0000"+
		"\u0000\u01a3\u01a4\u0003$\u0012\u0000\u01a4\u01a5\u0005\r\u0000\u0000"+
		"\u01a5\u01a6\u0003$\u0012\u0000\u01a6\u01a7\u0005\u000e\u0000\u0000\u01a7"+
		"\u01a8\u0003\u001e\u000f\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9"+
		"\u0183\u0001\u0000\u0000\u0000\u01a9\u018d\u0001\u0000\u0000\u0000\u01a9"+
		"\u0197\u0001\u0000\u0000\u0000\u01a9\u01a0\u0001\u0000\u0000\u0000\u01aa"+
		"7\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u000f\u0000\u0000\u01ac\u01ad"+
		"\u0005\'\u0000\u0000\u01ad\u01ae\u0003$\u0012\u0000\u01ae\u01af\u0005"+
		"(\u0000\u0000\u01af\u01b0\u0005\u000e\u0000\u0000\u01b0\u01b1\u0003\u001c"+
		"\u000e\u0000\u01b1\u01b2\u0005%\u0000\u0000\u01b2\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005\u000f\u0000\u0000\u01b4\u01b5\u0005\'\u0000\u0000"+
		"\u01b5\u01b6\u0003$\u0012\u0000\u01b6\u01b7\u0005(\u0000\u0000\u01b7\u01b8"+
		"\u0005\u000e\u0000\u0000\u01b8\u01b9\u0003\u001e\u000f\u0000\u01b9\u01bb"+
		"\u0001\u0000\u0000\u0000\u01ba\u01ab\u0001\u0000\u0000\u0000\u01ba\u01b3"+
		"\u0001\u0000\u0000\u0000\u01bb9\u0001\u0000\u0000\u0000\u01bc\u01be\u0005"+
		"\u0010\u0000\u0000\u01bd\u01bf\u0003\u001e\u000f\u0000\u01be\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005\u0011\u0000\u0000\u01c3\u01c4\u0003"+
		"$\u0012\u0000\u01c4\u01c5\u0005%\u0000\u0000\u01c5;\u0001\u0000\u0000"+
		"\u0000*FIPipvz\u007f\u0083\u008a\u0099\u00a3\u00ad\u00b2\u00bc\u00bf\u00c6"+
		"\u00cf\u00d5\u00db\u00e1\u00f4\u0102\u0104\u010c\u011a\u0121\u0130\u013b"+
		"\u013f\u0148\u014b\u0159\u015d\u0166\u016a\u016c\u0179\u0181\u01a9\u01ba"+
		"\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}