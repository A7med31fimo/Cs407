// Generated from c:\Users\ahmed\IdeaProjects\u005Cuntitled\lab.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class labParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, WS=2, Id=3, Integer=4, Char=5, Semicolom=6, Equal=7, Space=8, 
		Arthmatic_op=9, Conditaionl_op=10, Logical_op=11, N_Line=12, Ws=13;
	public static final int
		RULE_var = 0, RULE_expression = 1, RULE_condition = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"var", "expression", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "';'", "'='", null, null, null, null, 
			"'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Type", "WS", "Id", "Integer", "Char", "Semicolom", "Equal", "Space", 
			"Arthmatic_op", "Conditaionl_op", "Logical_op", "N_Line", "Ws"
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
	public String getGrammarFileName() { return "lab.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public labParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> N_Line() { return getTokens(labParser.N_Line); }
		public TerminalNode N_Line(int i) {
			return getToken(labParser.N_Line, i);
		}
		public List<TerminalNode> Type() { return getTokens(labParser.Type); }
		public TerminalNode Type(int i) {
			return getToken(labParser.Type, i);
		}
		public List<TerminalNode> WS() { return getTokens(labParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(labParser.WS, i);
		}
		public List<TerminalNode> Id() { return getTokens(labParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(labParser.Id, i);
		}
		public List<TerminalNode> Semicolom() { return getTokens(labParser.Semicolom); }
		public TerminalNode Semicolom(int i) {
			return getToken(labParser.Semicolom, i);
		}
		public List<TerminalNode> Equal() { return getTokens(labParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(labParser.Equal, i);
		}
		public List<TerminalNode> Integer() { return getTokens(labParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(labParser.Integer, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						{
						setState(6);
						match(Type);
						setState(7);
						match(WS);
						setState(8);
						match(Id);
						setState(10);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(9);
							match(WS);
							}
						}

						setState(12);
						match(Semicolom);
						}
						}
						break;
					case 2:
						{
						{
						setState(13);
						match(Type);
						setState(14);
						match(WS);
						setState(15);
						match(Id);
						setState(17);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(16);
							match(WS);
							}
						}

						setState(19);
						match(Equal);
						setState(21);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(20);
							match(WS);
							}
						}

						setState(23);
						_la = _input.LA(1);
						if ( !(_la==Id || _la==Integer) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==WS) {
							{
							setState(24);
							match(WS);
							}
						}

						setState(27);
						match(Semicolom);
						}
						}
						break;
					}
					setState(33);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(30);
							match(N_Line);
							}
							} 
						}
						setState(35);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(labParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(labParser.Id, i);
		}
		public List<TerminalNode> Integer() { return getTokens(labParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(labParser.Integer, i);
		}
		public List<TerminalNode> Arthmatic_op() { return getTokens(labParser.Arthmatic_op); }
		public TerminalNode Arthmatic_op(int i) {
			return getToken(labParser.Arthmatic_op, i);
		}
		public List<TerminalNode> Conditaionl_op() { return getTokens(labParser.Conditaionl_op); }
		public TerminalNode Conditaionl_op(int i) {
			return getToken(labParser.Conditaionl_op, i);
		}
		public List<TerminalNode> Logical_op() { return getTokens(labParser.Logical_op); }
		public TerminalNode Logical_op(int i) {
			return getToken(labParser.Logical_op, i);
		}
		public List<TerminalNode> WS() { return getTokens(labParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(labParser.WS, i);
		}
		public List<TerminalNode> Ws() { return getTokens(labParser.Ws); }
		public TerminalNode Ws(int i) {
			return getToken(labParser.Ws, i);
		}
		public List<TerminalNode> N_Line() { return getTokens(labParser.N_Line); }
		public TerminalNode N_Line(int i) {
			return getToken(labParser.N_Line, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					_la = _input.LA(1);
					if ( !(_la==Id || _la==Integer) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(41);
						match(WS);
						}
						}
						setState(46);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(47);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Arthmatic_op) | (1L << Conditaionl_op) | (1L << Logical_op))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Ws) {
						{
						{
						setState(48);
						match(Ws);
						}
						}
						setState(53);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(54);
					_la = _input.LA(1);
					if ( !(_la==Id || _la==Integer) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(58);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(55);
							match(N_Line);
							}
							} 
						}
						setState(60);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConditionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> N_Line() { return getTokens(labParser.N_Line); }
		public TerminalNode N_Line(int i) {
			return getToken(labParser.N_Line, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(79);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(65);
					var();
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==N_Line) {
						{
						{
						setState(66);
						match(N_Line);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case Id:
				case Integer:
					{
					setState(72);
					expression();
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==N_Line) {
						{
						{
						setState(73);
						match(N_Line);
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Type) | (1L << Id) | (1L << Integer))) != 0) );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\5\2\r\n\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3"+
		"\2\3\2\5\2\30\n\2\3\2\3\2\5\2\34\n\2\3\2\5\2\37\n\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3"+
		"\3\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\7\3;\n\3\f\3\16\3>\13\3\6\3@"+
		"\n\3\r\3\16\3A\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\7\4M\n\4\f\4\16"+
		"\4P\13\4\6\4R\n\4\r\4\16\4S\3\4\2\2\5\2\4\6\2\4\3\2\5\6\3\2\13\r\2a\2"+
		"&\3\2\2\2\4?\3\2\2\2\6Q\3\2\2\2\b\t\7\3\2\2\t\n\7\4\2\2\n\f\7\5\2\2\13"+
		"\r\7\4\2\2\f\13\3\2\2\2\f\r\3\2\2\2\r\16\3\2\2\2\16\37\7\b\2\2\17\20\7"+
		"\3\2\2\20\21\7\4\2\2\21\23\7\5\2\2\22\24\7\4\2\2\23\22\3\2\2\2\23\24\3"+
		"\2\2\2\24\25\3\2\2\2\25\27\7\t\2\2\26\30\7\4\2\2\27\26\3\2\2\2\27\30\3"+
		"\2\2\2\30\31\3\2\2\2\31\33\t\2\2\2\32\34\7\4\2\2\33\32\3\2\2\2\33\34\3"+
		"\2\2\2\34\35\3\2\2\2\35\37\7\b\2\2\36\b\3\2\2\2\36\17\3\2\2\2\37#\3\2"+
		"\2\2 \"\7\16\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\'\3\2\2\2%"+
		"#\3\2\2\2&\36\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*.\t\2"+
		"\2\2+-\7\4\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60"+
		".\3\2\2\2\61\65\t\3\2\2\62\64\7\17\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\28<\t\2\2\29;\7\16\2"+
		"\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?*\3\2\2"+
		"\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CG\5\2\2\2DF\7\16\2\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HR\3\2\2\2IG\3\2\2\2JN\5\4\3\2KM\7\16"+
		"\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QC\3\2"+
		"\2\2QJ\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2\21\f\23\27\33"+
		"\36#(.\65<AGNQS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}