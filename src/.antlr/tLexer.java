// Generated from c:\Users\ahmed\IdeaProjects\u005Cuntitled\src\t.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Type=1, WS=2, Id=3, Integer=4, Char=5, Semicolom=6, Equal=7, Space=8, 
		Arthmatic_op=9, Conditaionl_op=10, Logical_op=11, N_Line=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Type", "WS", "Id", "Integer", "Char", "Semicolom", "Equal", "Space", 
			"Arthmatic_op", "Conditaionl_op", "Logical_op", "N_Line"
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
			"Arthmatic_op", "Conditaionl_op", "Logical_op", "N_Line"
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


	public tLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "t.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7:
			Space_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Space_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u009a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\7\3B\n\3\f\3\16\3E\13\3\3\4\6\4"+
		"H\n\4\r\4\16\4I\3\4\7\4M\n\4\f\4\16\4P\13\4\3\5\6\5S\n\5\r\5\16\5T\3\5"+
		"\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\6\5_\n\5\r\5\16\5`\5\5c\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5v\n\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\f\3\f\3"+
		"\f\3\f\5\f\u0097\n\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\3\2\t\5\2\13\f\17\17\"\"\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\4\2C\\c|\4\2--??\6\2\'\',,//\61\61\4\2>>@@\2\u00b1\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\3>\3\2\2\2\5C\3\2\2\2\7G\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2"+
		"\17{\3\2\2\2\21}\3\2\2\2\23\u0085\3\2\2\2\25\u0090\3\2\2\2\27\u0096\3"+
		"\2\2\2\31\u0098\3\2\2\2\33\34\7k\2\2\34\35\7p\2\2\35?\7v\2\2\36\37\7f"+
		"\2\2\37 \7q\2\2 !\7w\2\2!\"\7d\2\2\"#\7n\2\2#?\7g\2\2$%\7n\2\2%&\7q\2"+
		"\2&\'\7p\2\2\'?\7i\2\2()\7h\2\2)*\7n\2\2*+\7q\2\2+,\7c\2\2,?\7v\2\2-."+
		"\7U\2\2./\7v\2\2/\60\7t\2\2\60\61\7k\2\2\61\62\7p\2\2\62?\7i\2\2\63\64"+
		"\7e\2\2\64\65\7j\2\2\65\66\7c\2\2\66?\7t\2\2\678\7d\2\289\7q\2\29:\7q"+
		"\2\2:;\7n\2\2;<\7g\2\2<=\7c\2\2=?\7p\2\2>\33\3\2\2\2>\36\3\2\2\2>$\3\2"+
		"\2\2>(\3\2\2\2>-\3\2\2\2>\63\3\2\2\2>\67\3\2\2\2?\4\3\2\2\2@B\t\2\2\2"+
		"A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\6\3\2\2\2EC\3\2\2\2FH\t\3\2"+
		"\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KM\t\4\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\b\3\2\2\2PN\3\2\2\2QS\4\62;\2RQ\3\2"+
		"\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2Uc\3\2\2\2VX\4\62;\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\60\2\2]_\4\62;\2^]"+
		"\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2bR\3\2\2\2bY\3\2\2\2c"+
		"v\3\2\2\2de\7v\2\2ef\7t\2\2fg\7w\2\2gn\7g\2\2hi\7h\2\2ij\7c\2\2jk\7n\2"+
		"\2kl\7u\2\2ln\7g\2\2md\3\2\2\2mh\3\2\2\2nv\3\2\2\2op\7\61\2\2pq\7\61\2"+
		"\2qr\3\2\2\2rs\7$\2\2st\7\"\2\2tv\7$\2\2ub\3\2\2\2um\3\2\2\2uo\3\2\2\2"+
		"v\n\3\2\2\2wx\t\5\2\2x\f\3\2\2\2yz\7=\2\2z\16\3\2\2\2{|\7?\2\2|\20\3\2"+
		"\2\2}~\b\t\2\2~\22\3\2\2\2\177\u0086\t\6\2\2\u0080\u0081\7-\2\2\u0081"+
		"\u0086\7-\2\2\u0082\u0083\7/\2\2\u0083\u0086\7/\2\2\u0084\u0086\t\7\2"+
		"\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\24\3\2\2\2\u0087\u0088\7?\2\2\u0088\u0091\7?\2\2\u0089"+
		"\u008a\7#\2\2\u008a\u0091\7?\2\2\u008b\u0091\t\b\2\2\u008c\u008d\7@\2"+
		"\2\u008d\u0091\7?\2\2\u008e\u008f\7>\2\2\u008f\u0091\7?\2\2\u0090\u0087"+
		"\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\26\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0097\7(\2\2"+
		"\u0094\u0095\7~\2\2\u0095\u0097\7~\2\2\u0096\u0092\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\30\3\2\2\2\u0098\u0099\7\f\2\2\u0099\32\3\2\2\2\20\2>C"+
		"INTY`bmu\u0085\u0090\u0096\3\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}