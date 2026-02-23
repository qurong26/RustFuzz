package iscas.ac.grand.main.antlr4.rustParser;// Generated from RustParser.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RustParser extends RustParserBase {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_AS=1, KW_BREAK=2, KW_CONST=3, KW_CONTINUE=4, KW_CRATE=5, KW_ELSE=6, 
		KW_ENUM=7, KW_EXTERN=8, KW_FALSE=9, KW_FN=10, KW_FOR=11, KW_IF=12, KW_IMPL=13, 
		KW_IN=14, KW_LET=15, KW_LOOP=16, KW_MATCH=17, KW_MOD=18, KW_MOVE=19, KW_MUT=20, 
		KW_PUB=21, KW_REF=22, KW_RETURN=23, KW_SELFVALUE=24, KW_SELFTYPE=25, KW_STATIC=26, 
		KW_STRUCT=27, KW_SUPER=28, KW_TRAIT=29, KW_TRUE=30, KW_TYPE=31, KW_UNSAFE=32, 
		KW_USE=33, KW_WHERE=34, KW_WHILE=35, KW_ASYNC=36, KW_AWAIT=37, KW_DYN=38, 
		KW_ABSTRACT=39, KW_BECOME=40, KW_BOX=41, KW_DO=42, KW_FINAL=43, KW_MACRO=44, 
		KW_OVERRIDE=45, KW_PRIV=46, KW_TYPEOF=47, KW_UNSIZED=48, KW_VIRTUAL=49, 
		KW_YIELD=50, KW_TRY=51, KW_UNION=52, KW_STATICLIFETIME=53, KW_MACRORULES=54, 
		KW_UNDERLINELIFETIME=55, KW_DOLLARCRATE=56, NON_KEYWORD_IDENTIFIER=57, 
		RAW_IDENTIFIER=58, LINE_COMMENT=59, BLOCK_COMMENT=60, INNER_LINE_DOC=61, 
		INNER_BLOCK_DOC=62, OUTER_LINE_DOC=63, OUTER_BLOCK_DOC=64, BLOCK_COMMENT_OR_DOC=65, 
		SHEBANG=66, WHITESPACE=67, NEWLINE=68, CHAR_LITERAL=69, STRING_LITERAL=70, 
		RAW_STRING_LITERAL=71, BYTE_LITERAL=72, BYTE_STRING_LITERAL=73, RAW_BYTE_STRING_LITERAL=74, 
		INTEGER_LITERAL=75, DEC_LITERAL=76, HEX_LITERAL=77, OCT_LITERAL=78, BIN_LITERAL=79, 
		FLOAT_LITERAL=80, LIFETIME_OR_LABEL=81, PLUS=82, MINUS=83, STAR=84, SLASH=85, 
		PERCENT=86, CARET=87, NOT=88, AND=89, OR=90, ANDAND=91, OROR=92, PLUSEQ=93, 
		MINUSEQ=94, STAREQ=95, SLASHEQ=96, PERCENTEQ=97, CARETEQ=98, ANDEQ=99, 
		OREQ=100, SHLEQ=101, SHREQ=102, EQ=103, EQEQ=104, NE=105, GT=106, LT=107, 
		GE=108, LE=109, AT=110, UNDERSCORE=111, DOT=112, DOTDOT=113, DOTDOTDOT=114, 
		DOTDOTEQ=115, COMMA=116, SEMI=117, COLON=118, PATHSEP=119, RARROW=120, 
		FATARROW=121, POUND=122, DOLLAR=123, QUESTION=124, LCURLYBRACE=125, RCURLYBRACE=126, 
		LSQUAREBRACKET=127, RSQUAREBRACKET=128, LPAREN=129, RPAREN=130;
	public static final int
		RULE_crate = 0, RULE_macroInvocation = 1, RULE_delimTokenTree = 2, RULE_tokenTree = 3, 
		RULE_tokenTreeToken = 4, RULE_macroInvocationSemi = 5, RULE_macroRulesDefinition = 6, 
		RULE_macroRulesDef = 7, RULE_macroRules = 8, RULE_macroRule = 9, RULE_macroMatcher = 10, 
		RULE_macroMatch = 11, RULE_macroMatchToken = 12, RULE_macroFragSpec = 13, 
		RULE_macroRepSep = 14, RULE_macroRepOp = 15, RULE_macroTranscriber = 16, 
		RULE_item = 17, RULE_visItem = 18, RULE_macroItem = 19, RULE_module = 20, 
		RULE_externCrate = 21, RULE_crateRef = 22, RULE_asClause = 23, RULE_useDeclaration = 24, 
		RULE_useTree = 25, RULE_function_ = 26, RULE_functionQualifiers = 27, 
		RULE_abi = 28, RULE_functionParameters = 29, RULE_selfParam = 30, RULE_shorthandSelf = 31, 
		RULE_typedSelf = 32, RULE_functionParam = 33, RULE_functionParamPattern = 34, 
		RULE_functionReturnType = 35, RULE_typeAlias = 36, RULE_struct_ = 37, 
		RULE_structStruct = 38, RULE_tupleStruct = 39, RULE_structFields = 40, 
		RULE_structField = 41, RULE_tupleFields = 42, RULE_tupleField = 43, RULE_enumeration = 44, 
		RULE_enumItems = 45, RULE_enumItem = 46, RULE_enumItemTuple = 47, RULE_enumItemStruct = 48, 
		RULE_enumItemDiscriminant = 49, RULE_union_ = 50, RULE_constantItem = 51, 
		RULE_staticItem = 52, RULE_trait_ = 53, RULE_implementation = 54, RULE_inherentImpl = 55, 
		RULE_traitImpl = 56, RULE_externBlock = 57, RULE_externalItem = 58, RULE_genericParams = 59, 
		RULE_genericParam = 60, RULE_lifetimeParam = 61, RULE_typeParam = 62, 
		RULE_constParam = 63, RULE_whereClause = 64, RULE_whereClauseItem = 65, 
		RULE_lifetimeWhereClauseItem = 66, RULE_typeBoundWhereClauseItem = 67, 
		RULE_forLifetimes = 68, RULE_associatedItem = 69, RULE_innerAttribute = 70, 
		RULE_outerAttribute = 71, RULE_attr = 72, RULE_attrInput = 73, RULE_statement = 74, 
		RULE_letStatement = 75, RULE_expressionStatement = 76, RULE_expression = 77, 
		RULE_comparisonOperator = 78, RULE_compoundAssignOperator = 79, RULE_expressionWithBlock = 80, 
		RULE_literalExpression = 81, RULE_pathExpression = 82, RULE_blockExpression = 83, 
		RULE_statements = 84, RULE_asyncBlockExpression = 85, RULE_unsafeBlockExpression = 86, 
		RULE_arrayElements = 87, RULE_tupleElements = 88, RULE_tupleIndex = 89, 
		RULE_structExpression = 90, RULE_structExprStruct = 91, RULE_structExprFields = 92, 
		RULE_structExprField = 93, RULE_structBase = 94, RULE_structExprTuple = 95, 
		RULE_structExprUnit = 96, RULE_enumerationVariantExpression = 97, RULE_enumExprStruct = 98, 
		RULE_enumExprFields = 99, RULE_enumExprField = 100, RULE_enumExprTuple = 101, 
		RULE_enumExprFieldless = 102, RULE_callParams = 103, RULE_closureExpression = 104, 
		RULE_closureParameters = 105, RULE_closureParam = 106, RULE_loopExpression = 107, 
		RULE_infiniteLoopExpression = 108, RULE_predicateLoopExpression = 109, 
		RULE_predicatePatternLoopExpression = 110, RULE_iteratorLoopExpression = 111, 
		RULE_loopLabel = 112, RULE_ifExpression = 113, RULE_ifLetExpression = 114, 
		RULE_matchExpression = 115, RULE_matchArms = 116, RULE_matchArmExpression = 117, 
		RULE_matchArm = 118, RULE_matchArmGuard = 119, RULE_pattern = 120, RULE_patternNoTopAlt = 121, 
		RULE_patternWithoutRange = 122, RULE_literalPattern = 123, RULE_identifierPattern = 124, 
		RULE_wildcardPattern = 125, RULE_restPattern = 126, RULE_rangePattern = 127, 
		RULE_rangePatternBound = 128, RULE_referencePattern = 129, RULE_structPattern = 130, 
		RULE_structPatternElements = 131, RULE_structPatternFields = 132, RULE_structPatternField = 133, 
		RULE_structPatternEtCetera = 134, RULE_tupleStructPattern = 135, RULE_tupleStructItems = 136, 
		RULE_tuplePattern = 137, RULE_tuplePatternItems = 138, RULE_groupedPattern = 139, 
		RULE_slicePattern = 140, RULE_slicePatternItems = 141, RULE_pathPattern = 142, 
		RULE_type_ = 143, RULE_typeNoBounds = 144, RULE_parenthesizedType = 145, 
		RULE_neverType = 146, RULE_tupleType = 147, RULE_arrayType = 148, RULE_sliceType = 149, 
		RULE_referenceType = 150, RULE_rawPointerType = 151, RULE_bareFunctionType = 152, 
		RULE_functionTypeQualifiers = 153, RULE_bareFunctionReturnType = 154, 
		RULE_functionParametersMaybeNamedVariadic = 155, RULE_maybeNamedFunctionParameters = 156, 
		RULE_maybeNamedParam = 157, RULE_maybeNamedFunctionParametersVariadic = 158, 
		RULE_traitObjectType = 159, RULE_traitObjectTypeOneBound = 160, RULE_implTraitType = 161, 
		RULE_implTraitTypeOneBound = 162, RULE_inferredType = 163, RULE_typeParamBounds = 164, 
		RULE_typeParamBound = 165, RULE_traitBound = 166, RULE_lifetimeBounds = 167, 
		RULE_lifetime = 168, RULE_simplePath = 169, RULE_simplePathSegment = 170, 
		RULE_pathInExpression = 171, RULE_pathExprSegment = 172, RULE_pathIdentSegment = 173, 
		RULE_genericArgs = 174, RULE_genericArg = 175, RULE_genericArgsConst = 176, 
		RULE_genericArgsLifetimes = 177, RULE_genericArgsTypes = 178, RULE_genericArgsBindings = 179, 
		RULE_genericArgsBinding = 180, RULE_qualifiedPathInExpression = 181, RULE_qualifiedPathType = 182, 
		RULE_qualifiedPathInType = 183, RULE_typePath = 184, RULE_typePathSegment = 185, 
		RULE_typePathFn = 186, RULE_typePathInputs = 187, RULE_visibility = 188, 
		RULE_identifier = 189, RULE_keyword = 190, RULE_macroIdentifierLikeToken = 191, 
		RULE_macroLiteralToken = 192, RULE_macroPunctuationToken = 193, RULE_shl = 194, 
		RULE_shr = 195;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "macroInvocation", "delimTokenTree", "tokenTree", "tokenTreeToken", 
			"macroInvocationSemi", "macroRulesDefinition", "macroRulesDef", "macroRules", 
			"macroRule", "macroMatcher", "macroMatch", "macroMatchToken", "macroFragSpec", 
			"macroRepSep", "macroRepOp", "macroTranscriber", "item", "visItem", "macroItem", 
			"module", "externCrate", "crateRef", "asClause", "useDeclaration", "useTree", 
			"function_", "functionQualifiers", "abi", "functionParameters", "selfParam", 
			"shorthandSelf", "typedSelf", "functionParam", "functionParamPattern", 
			"functionReturnType", "typeAlias", "struct_", "structStruct", "tupleStruct", 
			"structFields", "structField", "tupleFields", "tupleField", "enumeration", 
			"enumItems", "enumItem", "enumItemTuple", "enumItemStruct", "enumItemDiscriminant", 
			"union_", "constantItem", "staticItem", "trait_", "implementation", "inherentImpl", 
			"traitImpl", "externBlock", "externalItem", "genericParams", "genericParam", 
			"lifetimeParam", "typeParam", "constParam", "whereClause", "whereClauseItem", 
			"lifetimeWhereClauseItem", "typeBoundWhereClauseItem", "forLifetimes", 
			"associatedItem", "innerAttribute", "outerAttribute", "attr", "attrInput", 
			"statement", "letStatement", "expressionStatement", "expression", "comparisonOperator", 
			"compoundAssignOperator", "expressionWithBlock", "literalExpression", 
			"pathExpression", "blockExpression", "statements", "asyncBlockExpression", 
			"unsafeBlockExpression", "arrayElements", "tupleElements", "tupleIndex", 
			"structExpression", "structExprStruct", "structExprFields", "structExprField", 
			"structBase", "structExprTuple", "structExprUnit", "enumerationVariantExpression", 
			"enumExprStruct", "enumExprFields", "enumExprField", "enumExprTuple", 
			"enumExprFieldless", "callParams", "closureExpression", "closureParameters", 
			"closureParam", "loopExpression", "infiniteLoopExpression", "predicateLoopExpression", 
			"predicatePatternLoopExpression", "iteratorLoopExpression", "loopLabel", 
			"ifExpression", "ifLetExpression", "matchExpression", "matchArms", "matchArmExpression", 
			"matchArm", "matchArmGuard", "pattern", "patternNoTopAlt", "patternWithoutRange", 
			"literalPattern", "identifierPattern", "wildcardPattern", "restPattern", 
			"rangePattern", "rangePatternBound", "referencePattern", "structPattern", 
			"structPatternElements", "structPatternFields", "structPatternField", 
			"structPatternEtCetera", "tupleStructPattern", "tupleStructItems", "tuplePattern", 
			"tuplePatternItems", "groupedPattern", "slicePattern", "slicePatternItems", 
			"pathPattern", "type_", "typeNoBounds", "parenthesizedType", "neverType", 
			"tupleType", "arrayType", "sliceType", "referenceType", "rawPointerType", 
			"bareFunctionType", "functionTypeQualifiers", "bareFunctionReturnType", 
			"functionParametersMaybeNamedVariadic", "maybeNamedFunctionParameters", 
			"maybeNamedParam", "maybeNamedFunctionParametersVariadic", "traitObjectType", 
			"traitObjectTypeOneBound", "implTraitType", "implTraitTypeOneBound", 
			"inferredType", "typeParamBounds", "typeParamBound", "traitBound", "lifetimeBounds", 
			"lifetime", "simplePath", "simplePathSegment", "pathInExpression", "pathExprSegment", 
			"pathIdentSegment", "genericArgs", "genericArg", "genericArgsConst", 
			"genericArgsLifetimes", "genericArgsTypes", "genericArgsBindings", "genericArgsBinding", 
			"qualifiedPathInExpression", "qualifiedPathType", "qualifiedPathInType", 
			"typePath", "typePathSegment", "typePathFn", "typePathInputs", "visibility", 
			"identifier", "keyword", "macroIdentifierLikeToken", "macroLiteralToken", 
			"macroPunctuationToken", "shl", "shr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'break'", "'const'", "'continue'", "'crate'", "'else'", 
			"'enum'", "'extern'", "'false'", "'fn'", "'for'", "'if'", "'impl'", "'in'", 
			"'let'", "'loop'", "'match'", "'mod'", "'move'", "'mut'", "'pub'", "'ref'", 
			"'return'", "'self'", "'Self'", "'static'", "'struct'", "'super'", "'trait'", 
			"'true'", "'type'", "'unsafe'", "'use'", "'where'", "'while'", "'async'", 
			"'await'", "'dyn'", "'abstract'", "'become'", "'box'", "'do'", "'final'", 
			"'macro'", "'override'", "'priv'", "'typeof'", "'unsized'", "'virtual'", 
			"'yield'", "'try'", "'union'", "''static'", "'macro_rules'", "''_'", 
			"'$crate'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'&'", 
			"'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'<<='", "'>>='", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'@'", "'_'", "'.'", "'..'", "'...'", "'..='", "','", 
			"';'", "':'", "'::'", "'->'", "'=>'", "'#'", "'$'", "'?'", "'{'", "'}'", 
			"'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_AS", "KW_BREAK", "KW_CONST", "KW_CONTINUE", "KW_CRATE", "KW_ELSE", 
			"KW_ENUM", "KW_EXTERN", "KW_FALSE", "KW_FN", "KW_FOR", "KW_IF", "KW_IMPL", 
			"KW_IN", "KW_LET", "KW_LOOP", "KW_MATCH", "KW_MOD", "KW_MOVE", "KW_MUT", 
			"KW_PUB", "KW_REF", "KW_RETURN", "KW_SELFVALUE", "KW_SELFTYPE", "KW_STATIC", 
			"KW_STRUCT", "KW_SUPER", "KW_TRAIT", "KW_TRUE", "KW_TYPE", "KW_UNSAFE", 
			"KW_USE", "KW_WHERE", "KW_WHILE", "KW_ASYNC", "KW_AWAIT", "KW_DYN", "KW_ABSTRACT", 
			"KW_BECOME", "KW_BOX", "KW_DO", "KW_FINAL", "KW_MACRO", "KW_OVERRIDE", 
			"KW_PRIV", "KW_TYPEOF", "KW_UNSIZED", "KW_VIRTUAL", "KW_YIELD", "KW_TRY", 
			"KW_UNION", "KW_STATICLIFETIME", "KW_MACRORULES", "KW_UNDERLINELIFETIME", 
			"KW_DOLLARCRATE", "NON_KEYWORD_IDENTIFIER", "RAW_IDENTIFIER", "LINE_COMMENT", 
			"BLOCK_COMMENT", "INNER_LINE_DOC", "INNER_BLOCK_DOC", "OUTER_LINE_DOC", 
			"OUTER_BLOCK_DOC", "BLOCK_COMMENT_OR_DOC", "SHEBANG", "WHITESPACE", "NEWLINE", 
			"CHAR_LITERAL", "STRING_LITERAL", "RAW_STRING_LITERAL", "BYTE_LITERAL", 
			"BYTE_STRING_LITERAL", "RAW_BYTE_STRING_LITERAL", "INTEGER_LITERAL", 
			"DEC_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BIN_LITERAL", "FLOAT_LITERAL", 
			"LIFETIME_OR_LABEL", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "CARET", 
			"NOT", "AND", "OR", "ANDAND", "OROR", "PLUSEQ", "MINUSEQ", "STAREQ", 
			"SLASHEQ", "PERCENTEQ", "CARETEQ", "ANDEQ", "OREQ", "SHLEQ", "SHREQ", 
			"EQ", "EQEQ", "NE", "GT", "LT", "GE", "LE", "AT", "UNDERSCORE", "DOT", 
			"DOTDOT", "DOTDOTDOT", "DOTDOTEQ", "COMMA", "SEMI", "COLON", "PATHSEP", 
			"RARROW", "FATARROW", "POUND", "DOLLAR", "QUESTION", "LCURLYBRACE", "RCURLYBRACE", 
			"LSQUAREBRACKET", "RSQUAREBRACKET", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "RustParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RustParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CrateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RustParser.EOF, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public CrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateContext crate() throws RecognitionException {
		CrateContext _localctx = new CrateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					innerAttribute();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_IMPL) | (1L << KW_MOD) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(398);
				item();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(EOF);
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

	public static class MacroInvocationContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macroInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			simplePath();
			setState(407);
			match(NOT);
			setState(408);
			delimTokenTree();
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

	public static class DelimTokenTreeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public DelimTokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimTokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterDelimTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitDelimTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitDelimTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimTokenTreeContext delimTokenTree() throws RecognitionException {
		DelimTokenTreeContext _localctx = new DelimTokenTreeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_delimTokenTree);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(LPAREN);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(411);
					tokenTree();
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(LSQUAREBRACKET);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(419);
					tokenTree();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(LCURLYBRACE);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(427);
					tokenTree();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				match(RCURLYBRACE);
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

	public static class TokenTreeContext extends ParserRuleContext {
		public List<TokenTreeTokenContext> tokenTreeToken() {
			return getRuleContexts(TokenTreeTokenContext.class);
		}
		public TokenTreeTokenContext tokenTreeToken(int i) {
			return getRuleContext(TokenTreeTokenContext.class,i);
		}
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TokenTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterTokenTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitTokenTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitTokenTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeContext tokenTree() throws RecognitionException {
		TokenTreeContext _localctx = new TokenTreeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokenTree);
		try {
			int _alt;
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_AS:
			case KW_BREAK:
			case KW_CONST:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_ELSE:
			case KW_ENUM:
			case KW_EXTERN:
			case KW_FALSE:
			case KW_FN:
			case KW_FOR:
			case KW_IF:
			case KW_IMPL:
			case KW_IN:
			case KW_LET:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOD:
			case KW_MOVE:
			case KW_MUT:
			case KW_PUB:
			case KW_REF:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_STATIC:
			case KW_STRUCT:
			case KW_SUPER:
			case KW_TRAIT:
			case KW_TRUE:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_USE:
			case KW_WHERE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_AWAIT:
			case KW_DYN:
			case KW_ABSTRACT:
			case KW_BECOME:
			case KW_BOX:
			case KW_DO:
			case KW_FINAL:
			case KW_MACRO:
			case KW_OVERRIDE:
			case KW_PRIV:
			case KW_TYPEOF:
			case KW_UNSIZED:
			case KW_VIRTUAL:
			case KW_YIELD:
			case KW_TRY:
			case KW_UNION:
			case KW_STATICLIFETIME:
			case KW_MACRORULES:
			case KW_UNDERLINELIFETIME:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case PERCENT:
			case CARET:
			case NOT:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case PLUSEQ:
			case MINUSEQ:
			case STAREQ:
			case SLASHEQ:
			case PERCENTEQ:
			case CARETEQ:
			case ANDEQ:
			case OREQ:
			case SHLEQ:
			case SHREQ:
			case EQ:
			case EQEQ:
			case NE:
			case GT:
			case LT:
			case GE:
			case LE:
			case AT:
			case UNDERSCORE:
			case DOT:
			case DOTDOT:
			case DOTDOTDOT:
			case DOTDOTEQ:
			case COMMA:
			case SEMI:
			case COLON:
			case PATHSEP:
			case RARROW:
			case FATARROW:
			case POUND:
			case DOLLAR:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(437); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(436);
						tokenTreeToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(439); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				delimTokenTree();
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

	public static class TokenTreeTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TokenTreeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenTreeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterTokenTreeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitTokenTreeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitTokenTreeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenTreeTokenContext tokenTreeToken() throws RecognitionException {
		TokenTreeTokenContext _localctx = new TokenTreeTokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tokenTreeToken);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				macroRepOp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(DOLLAR);
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

	public static class MacroInvocationSemiContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public List<TokenTreeContext> tokenTree() {
			return getRuleContexts(TokenTreeContext.class);
		}
		public TokenTreeContext tokenTree(int i) {
			return getRuleContext(TokenTreeContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroInvocationSemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocationSemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroInvocationSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroInvocationSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroInvocationSemiContext macroInvocationSemi() throws RecognitionException {
		MacroInvocationSemiContext _localctx = new MacroInvocationSemiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_macroInvocationSemi);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				simplePath();
				setState(452);
				match(NOT);
				setState(453);
				match(LPAREN);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(454);
					tokenTree();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
				match(RPAREN);
				setState(461);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				simplePath();
				setState(464);
				match(NOT);
				setState(465);
				match(LSQUAREBRACKET);
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(466);
					tokenTree();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				match(RSQUAREBRACKET);
				setState(473);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				simplePath();
				setState(476);
				match(NOT);
				setState(477);
				match(LCURLYBRACE);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(478);
					tokenTree();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(484);
				match(RCURLYBRACE);
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

	public static class MacroRulesDefinitionContext extends ParserRuleContext {
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroRulesDefContext macroRulesDef() {
			return getRuleContext(MacroRulesDefContext.class,0);
		}
		public MacroRulesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRulesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRulesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefinitionContext macroRulesDefinition() throws RecognitionException {
		MacroRulesDefinitionContext _localctx = new MacroRulesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_macroRulesDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(KW_MACRORULES);
			setState(489);
			match(NOT);
			setState(490);
			identifier();
			setState(491);
			macroRulesDef();
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

	public static class MacroRulesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public MacroRulesContext macroRules() {
			return getRuleContext(MacroRulesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroRulesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRulesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRulesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRulesDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRulesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesDefContext macroRulesDef() throws RecognitionException {
		MacroRulesDefContext _localctx = new MacroRulesDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_macroRulesDef);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(LPAREN);
				setState(494);
				macroRules();
				setState(495);
				match(RPAREN);
				setState(496);
				match(SEMI);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(LSQUAREBRACKET);
				setState(499);
				macroRules();
				setState(500);
				match(RSQUAREBRACKET);
				setState(501);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				match(LCURLYBRACE);
				setState(504);
				macroRules();
				setState(505);
				match(RCURLYBRACE);
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

	public static class MacroRulesContext extends ParserRuleContext {
		public List<MacroRuleContext> macroRule() {
			return getRuleContexts(MacroRuleContext.class);
		}
		public MacroRuleContext macroRule(int i) {
			return getRuleContext(MacroRuleContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(RustParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(RustParser.SEMI, i);
		}
		public MacroRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRulesContext macroRules() throws RecognitionException {
		MacroRulesContext _localctx = new MacroRulesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macroRules);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			macroRule();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(SEMI);
					setState(511);
					macroRule();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(517);
				match(SEMI);
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

	public static class MacroRuleContext extends ParserRuleContext {
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public MacroTranscriberContext macroTranscriber() {
			return getRuleContext(MacroTranscriberContext.class,0);
		}
		public MacroRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRuleContext macroRule() throws RecognitionException {
		MacroRuleContext _localctx = new MacroRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macroRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			macroMatcher();
			setState(521);
			match(FATARROW);
			setState(522);
			macroTranscriber();
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

	public static class MacroMatcherContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public MacroMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroMatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatcherContext macroMatcher() throws RecognitionException {
		MacroMatcherContext _localctx = new MacroMatcherContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_macroMatcher);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(LPAREN);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(525);
					macroMatch();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				match(RPAREN);
				}
				break;
			case LSQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(LSQUAREBRACKET);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(533);
					macroMatch();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				match(RSQUAREBRACKET);
				}
				break;
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(LCURLYBRACE);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					{
					setState(541);
					macroMatch();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				match(RCURLYBRACE);
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

	public static class MacroMatchContext extends ParserRuleContext {
		public List<MacroMatchTokenContext> macroMatchToken() {
			return getRuleContexts(MacroMatchTokenContext.class);
		}
		public MacroMatchTokenContext macroMatchToken(int i) {
			return getRuleContext(MacroMatchTokenContext.class,i);
		}
		public MacroMatcherContext macroMatcher() {
			return getRuleContext(MacroMatcherContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public MacroFragSpecContext macroFragSpec() {
			return getRuleContext(MacroFragSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public List<MacroMatchContext> macroMatch() {
			return getRuleContexts(MacroMatchContext.class);
		}
		public MacroMatchContext macroMatch(int i) {
			return getRuleContext(MacroMatchContext.class,i);
		}
		public MacroRepSepContext macroRepSep() {
			return getRuleContext(MacroRepSepContext.class,0);
		}
		public MacroMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchContext macroMatch() throws RecognitionException {
		MacroMatchContext _localctx = new MacroMatchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_macroMatch);
		int _la;
		try {
			int _alt;
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(550);
						macroMatchToken();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(553); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				macroMatcher();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				match(DOLLAR);
				setState(559);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(557);
					identifier();
					}
					break;
				case KW_SELFVALUE:
					{
					setState(558);
					match(KW_SELFVALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				match(COLON);
				setState(562);
				macroFragSpec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				match(DOLLAR);
				setState(564);
				match(LPAREN);
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(565);
					macroMatch();
					}
					}
					setState(568); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (PLUS - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)) | (1L << (QUESTION - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0) );
				setState(570);
				match(RPAREN);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (SLASH - 69)) | (1L << (PERCENT - 69)) | (1L << (CARET - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (PLUSEQ - 69)) | (1L << (MINUSEQ - 69)) | (1L << (STAREQ - 69)) | (1L << (SLASHEQ - 69)) | (1L << (PERCENTEQ - 69)) | (1L << (CARETEQ - 69)) | (1L << (ANDEQ - 69)) | (1L << (OREQ - 69)) | (1L << (SHLEQ - 69)) | (1L << (SHREQ - 69)) | (1L << (EQ - 69)) | (1L << (EQEQ - 69)) | (1L << (NE - 69)) | (1L << (GT - 69)) | (1L << (LT - 69)) | (1L << (GE - 69)) | (1L << (LE - 69)) | (1L << (AT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (COMMA - 69)) | (1L << (SEMI - 69)) | (1L << (COLON - 69)) | (1L << (PATHSEP - 69)) | (1L << (RARROW - 69)) | (1L << (FATARROW - 69)) | (1L << (POUND - 69)) | (1L << (DOLLAR - 69)))) != 0)) {
					{
					setState(571);
					macroRepSep();
					}
				}

				setState(574);
				macroRepOp();
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

	public static class MacroMatchTokenContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public MacroRepOpContext macroRepOp() {
			return getRuleContext(MacroRepOpContext.class,0);
		}
		public MacroMatchTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroMatchToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroMatchToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroMatchToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroMatchToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroMatchTokenContext macroMatchToken() throws RecognitionException {
		MacroMatchTokenContext _localctx = new MacroMatchTokenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_macroMatchToken);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				macroRepOp();
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

	public static class MacroFragSpecContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MacroFragSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroFragSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroFragSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroFragSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroFragSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroFragSpecContext macroFragSpec() throws RecognitionException {
		MacroFragSpecContext _localctx = new MacroFragSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_macroFragSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			identifier();
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

	public static class MacroRepSepContext extends ParserRuleContext {
		public MacroIdentifierLikeTokenContext macroIdentifierLikeToken() {
			return getRuleContext(MacroIdentifierLikeTokenContext.class,0);
		}
		public MacroLiteralTokenContext macroLiteralToken() {
			return getRuleContext(MacroLiteralTokenContext.class,0);
		}
		public MacroPunctuationTokenContext macroPunctuationToken() {
			return getRuleContext(MacroPunctuationTokenContext.class,0);
		}
		public TerminalNode DOLLAR() { return getToken(RustParser.DOLLAR, 0); }
		public MacroRepSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRepSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRepSep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepSep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepSepContext macroRepSep() throws RecognitionException {
		MacroRepSepContext _localctx = new MacroRepSepContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_macroRepSep);
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				macroIdentifierLikeToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				macroLiteralToken();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(588);
				macroPunctuationToken();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(DOLLAR);
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

	public static class MacroRepOpContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public MacroRepOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroRepOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroRepOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroRepOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroRepOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroRepOpContext macroRepOp() throws RecognitionException {
		MacroRepOpContext _localctx = new MacroRepOpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_macroRepOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (PLUS - 82)) | (1L << (STAR - 82)) | (1L << (QUESTION - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MacroTranscriberContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public MacroTranscriberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroTranscriber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroTranscriber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroTranscriber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroTranscriber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroTranscriberContext macroTranscriber() throws RecognitionException {
		MacroTranscriberContext _localctx = new MacroTranscriberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_macroTranscriber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			delimTokenTree();
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

	public static class ItemContext extends ParserRuleContext {
		public VisItemContext visItem() {
			return getRuleContext(VisItemContext.class,0);
		}
		public MacroItemContext macroItem() {
			return getRuleContext(MacroItemContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(596);
				outerAttribute();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CONST:
			case KW_ENUM:
			case KW_EXTERN:
			case KW_FN:
			case KW_IMPL:
			case KW_MOD:
			case KW_PUB:
			case KW_STATIC:
			case KW_STRUCT:
			case KW_TRAIT:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_USE:
			case KW_ASYNC:
			case KW_UNION:
				{
				setState(602);
				visItem();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(603);
				macroItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VisItemContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public ExternCrateContext externCrate() {
			return getRuleContext(ExternCrateContext.class,0);
		}
		public UseDeclarationContext useDeclaration() {
			return getRuleContext(UseDeclarationContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public Struct_Context struct_() {
			return getRuleContext(Struct_Context.class,0);
		}
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public Union_Context union_() {
			return getRuleContext(Union_Context.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public StaticItemContext staticItem() {
			return getRuleContext(StaticItemContext.class,0);
		}
		public Trait_Context trait_() {
			return getRuleContext(Trait_Context.class,0);
		}
		public ImplementationContext implementation() {
			return getRuleContext(ImplementationContext.class,0);
		}
		public ExternBlockContext externBlock() {
			return getRuleContext(ExternBlockContext.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public VisItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterVisItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitVisItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitVisItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisItemContext visItem() throws RecognitionException {
		VisItemContext _localctx = new VisItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_visItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(606);
				visibility();
				}
			}

			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(609);
				module();
				}
				break;
			case 2:
				{
				setState(610);
				externCrate();
				}
				break;
			case 3:
				{
				setState(611);
				useDeclaration();
				}
				break;
			case 4:
				{
				setState(612);
				function_();
				}
				break;
			case 5:
				{
				setState(613);
				typeAlias();
				}
				break;
			case 6:
				{
				setState(614);
				struct_();
				}
				break;
			case 7:
				{
				setState(615);
				enumeration();
				}
				break;
			case 8:
				{
				setState(616);
				union_();
				}
				break;
			case 9:
				{
				setState(617);
				constantItem();
				}
				break;
			case 10:
				{
				setState(618);
				staticItem();
				}
				break;
			case 11:
				{
				setState(619);
				trait_();
				}
				break;
			case 12:
				{
				setState(620);
				implementation();
				}
				break;
			case 13:
				{
				setState(621);
				externBlock();
				}
				break;
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

	public static class MacroItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public MacroRulesDefinitionContext macroRulesDefinition() {
			return getRuleContext(MacroRulesDefinitionContext.class,0);
		}
		public MacroItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterMacroItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitMacroItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitMacroItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroItemContext macroItem() throws RecognitionException {
		MacroItemContext _localctx = new MacroItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_macroItem);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				macroInvocationSemi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				macroRulesDefinition();
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

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(628);
				match(KW_UNSAFE);
				}
			}

			setState(631);
			match(KW_MOD);
			setState(632);
			identifier();
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				{
				setState(633);
				match(SEMI);
				}
				break;
			case LCURLYBRACE:
				{
				setState(634);
				match(LCURLYBRACE);
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(635);
						innerAttribute();
						}
						} 
					}
					setState(640);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_IMPL) | (1L << KW_MOD) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
					{
					{
					setState(641);
					item();
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(647);
				match(RCURLYBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExternCrateContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public CrateRefContext crateRef() {
			return getRuleContext(CrateRefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public ExternCrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externCrate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterExternCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitExternCrate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitExternCrate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternCrateContext externCrate() throws RecognitionException {
		ExternCrateContext _localctx = new ExternCrateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_externCrate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(KW_EXTERN);
			setState(651);
			match(KW_CRATE);
			setState(652);
			crateRef();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(653);
				asClause();
				}
			}

			setState(656);
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

	public static class CrateRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public CrateRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crateRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterCrateRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitCrateRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitCrateRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrateRefContext crateRef() throws RecognitionException {
		CrateRefContext _localctx = new CrateRefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_crateRef);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				identifier();
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(KW_SELFVALUE);
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

	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(KW_AS);
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(663);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(664);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class UseDeclarationContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public UseTreeContext useTree() {
			return getRuleContext(UseTreeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public UseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterUseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitUseDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitUseDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseDeclarationContext useDeclaration() throws RecognitionException {
		UseDeclarationContext _localctx = new UseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_useDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(KW_USE);
			setState(668);
			useTree();
			setState(669);
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

	public static class UseTreeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public List<UseTreeContext> useTree() {
			return getRuleContexts(UseTreeContext.class);
		}
		public UseTreeContext useTree(int i) {
			return getRuleContext(UseTreeContext.class,i);
		}
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public UseTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterUseTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitUseTree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitUseTree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseTreeContext useTree() throws RecognitionException {
		UseTreeContext _localctx = new UseTreeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_useTree);
		int _la;
		try {
			int _alt;
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP) {
					{
					setState(672);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(671);
						simplePath();
						}
						break;
					}
					setState(674);
					match(PATHSEP);
					}
				}

				setState(693);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(677);
					match(STAR);
					}
					break;
				case LCURLYBRACE:
					{
					setState(678);
					match(LCURLYBRACE);
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STAR - 84)) | (1L << (PATHSEP - 84)) | (1L << (LCURLYBRACE - 84)))) != 0)) {
						{
						setState(679);
						useTree();
						setState(684);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(680);
								match(COMMA);
								setState(681);
								useTree();
								}
								} 
							}
							setState(686);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						}
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(687);
							match(COMMA);
							}
						}

						}
					}

					setState(692);
					match(RCURLYBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				simplePath();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_AS) {
					{
					setState(696);
					match(KW_AS);
					setState(699);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_MACRORULES:
					case NON_KEYWORD_IDENTIFIER:
					case RAW_IDENTIFIER:
						{
						setState(697);
						identifier();
						}
						break;
					case UNDERSCORE:
						{
						setState(698);
						match(UNDERSCORE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
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

	public static class Function_Context extends ParserRuleContext {
		public FunctionQualifiersContext functionQualifiers() {
			return getRuleContext(FunctionQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_function_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			functionQualifiers();
			setState(706);
			match(KW_FN);
			setState(707);
			identifier();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(708);
				genericParams();
				}
			}

			setState(711);
			match(LPAREN);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (QUESTION - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(712);
				functionParameters();
				}
			}

			setState(715);
			match(RPAREN);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(716);
				functionReturnType();
				}
			}

			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(719);
				whereClause();
				}
			}

			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(722);
				blockExpression();
				}
				break;
			case SEMI:
				{
				setState(723);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public FunctionQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunctionQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunctionQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunctionQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionQualifiersContext functionQualifiers() throws RecognitionException {
		FunctionQualifiersContext _localctx = new FunctionQualifiersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_CONST) {
				{
				setState(726);
				match(KW_CONST);
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ASYNC) {
				{
				setState(729);
				match(KW_ASYNC);
				}
			}

			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(732);
				match(KW_UNSAFE);
				}
			}

			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(735);
				match(KW_EXTERN);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(736);
					abi();
					}
				}

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

	public static class AbiContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public AbiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterAbi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitAbi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitAbi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbiContext abi() throws RecognitionException {
		AbiContext _localctx = new AbiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_abi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public SelfParamContext selfParam() {
			return getRuleContext(SelfParamContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionParameters);
		int _la;
		try {
			int _alt;
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				selfParam();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(744);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(747);
					selfParam();
					setState(748);
					match(COMMA);
					}
					break;
				}
				setState(752);
				functionParam();
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(753);
						match(COMMA);
						setState(754);
						functionParam();
						}
						} 
					}
					setState(759);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(760);
					match(COMMA);
					}
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

	public static class SelfParamContext extends ParserRuleContext {
		public ShorthandSelfContext shorthandSelf() {
			return getRuleContext(ShorthandSelfContext.class,0);
		}
		public TypedSelfContext typedSelf() {
			return getRuleContext(TypedSelfContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public SelfParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterSelfParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitSelfParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitSelfParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfParamContext selfParam() throws RecognitionException {
		SelfParamContext _localctx = new SelfParamContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selfParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(765);
				outerAttribute();
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(771);
				shorthandSelf();
				}
				break;
			case 2:
				{
				setState(772);
				typedSelf();
				}
				break;
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

	public static class ShorthandSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public ShorthandSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthandSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterShorthandSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitShorthandSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitShorthandSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShorthandSelfContext shorthandSelf() throws RecognitionException {
		ShorthandSelfContext _localctx = new ShorthandSelfContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shorthandSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(775);
				match(AND);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
					{
					setState(776);
					lifetime();
					}
				}

				}
			}

			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(781);
				match(KW_MUT);
				}
			}

			setState(784);
			match(KW_SELFVALUE);
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

	public static class TypedSelfContext extends ParserRuleContext {
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TypedSelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedSelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterTypedSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitTypedSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitTypedSelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedSelfContext typedSelf() throws RecognitionException {
		TypedSelfContext _localctx = new TypedSelfContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typedSelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(786);
				match(KW_MUT);
				}
			}

			setState(789);
			match(KW_SELFVALUE);
			setState(790);
			match(COLON);
			setState(791);
			type_();
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

	public static class FunctionParamContext extends ParserRuleContext {
		public FunctionParamPatternContext functionParamPattern() {
			return getRuleContext(FunctionParamPatternContext.class,0);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunctionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(793);
				outerAttribute();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(799);
				functionParamPattern();
				}
				break;
			case 2:
				{
				setState(800);
				match(DOTDOTDOT);
				}
				break;
			case 3:
				{
				setState(801);
				type_();
				}
				break;
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

	public static class FunctionParamPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public FunctionParamPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParamPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunctionParamPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunctionParamPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParamPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamPatternContext functionParamPattern() throws RecognitionException {
		FunctionParamPatternContext _localctx = new FunctionParamPatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionParamPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			pattern();
			setState(805);
			match(COLON);
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_EXTERN:
			case KW_FN:
			case KW_FOR:
			case KW_IMPL:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_UNSAFE:
			case KW_DYN:
			case KW_STATICLIFETIME:
			case KW_MACRORULES:
			case KW_UNDERLINELIFETIME:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case LIFETIME_OR_LABEL:
			case STAR:
			case NOT:
			case AND:
			case LT:
			case UNDERSCORE:
			case PATHSEP:
			case QUESTION:
			case LSQUAREBRACKET:
			case LPAREN:
				{
				setState(806);
				type_();
				}
				break;
			case DOTDOTDOT:
				{
				setState(807);
				match(DOTDOTDOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(RARROW);
			setState(811);
			type_();
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

	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(KW_TYPE);
			setState(814);
			identifier();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(815);
				genericParams();
				}
			}

			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(818);
				whereClause();
				}
			}

			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(821);
				match(EQ);
				setState(822);
				type_();
				}
			}

			setState(825);
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

	public static class Struct_Context extends ParserRuleContext {
		public StructStructContext structStruct() {
			return getRuleContext(StructStructContext.class,0);
		}
		public TupleStructContext tupleStruct() {
			return getRuleContext(TupleStructContext.class,0);
		}
		public Struct_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterStruct_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitStruct_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor) return ((RustParserVisitor<? extends T>)visitor).visitStruct_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_Context struct_() throws RecognitionException {
		Struct_Context _localctx = new Struct_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_struct_);
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				structStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				tupleStruct();
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

	public static class StructStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public StructStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).enterStructStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener) ((RustParserListener)listener).exitStructStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructStructContext structStruct() throws RecognitionException {
		StructStructContext _localctx = new StructStructContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(KW_STRUCT);
			setState(832);
			identifier();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(833);
				genericParams();
				}
			}

			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(836);
				whereClause();
				}
			}

			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				{
				setState(839);
				match(LCURLYBRACE);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
					{
					setState(840);
					structFields();
					}
				}

				setState(843);
				match(RCURLYBRACE);
				}
				break;
			case SEMI:
				{
				setState(844);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TupleStructContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TupleStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructContext tupleStruct() throws RecognitionException {
		TupleStructContext _localctx = new TupleStructContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tupleStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(KW_STRUCT);
			setState(848);
			identifier();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(849);
				genericParams();
				}
			}

			setState(852);
			match(LPAREN);
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(853);
				tupleFields();
				}
			}

			setState(856);
			match(RPAREN);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(857);
				whereClause();
				}
			}

			setState(860);
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

	public static class StructFieldsContext extends ParserRuleContext {
		public List<StructFieldContext> structField() {
			return getRuleContexts(StructFieldContext.class);
		}
		public StructFieldContext structField(int i) {
			return getRuleContext(StructFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			structField();
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(863);
					match(COMMA);
					setState(864);
					structField();
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(870);
				match(COMMA);
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

	public static class StructFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public StructFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldContext structField() throws RecognitionException {
		StructFieldContext _localctx = new StructFieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(873);
				outerAttribute();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(879);
				visibility();
				}
			}

			setState(882);
			identifier();
			setState(883);
			match(COLON);
			setState(884);
			type_();
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

	public static class TupleFieldsContext extends ParserRuleContext {
		public List<TupleFieldContext> tupleField() {
			return getRuleContexts(TupleFieldContext.class);
		}
		public TupleFieldContext tupleField(int i) {
			return getRuleContext(TupleFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldsContext tupleFields() throws RecognitionException {
		TupleFieldsContext _localctx = new TupleFieldsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tupleFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			tupleField();
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(887);
					match(COMMA);
					setState(888);
					tupleField();
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(894);
				match(COMMA);
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

	public static class TupleFieldContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public TupleFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleFieldContext tupleField() throws RecognitionException {
		TupleFieldContext _localctx = new TupleFieldContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tupleField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(897);
				outerAttribute();
				}
				}
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(903);
				visibility();
				}
			}

			setState(906);
			type_();
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

	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public EnumItemsContext enumItems() {
			return getRuleContext(EnumItemsContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(KW_ENUM);
			setState(909);
			identifier();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(910);
				genericParams();
				}
			}

			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(913);
				whereClause();
				}
			}

			setState(916);
			match(LCURLYBRACE);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
				{
				setState(917);
				enumItems();
				}
			}

			setState(920);
			match(RCURLYBRACE);
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

	public static class EnumItemsContext extends ParserRuleContext {
		public List<EnumItemContext> enumItem() {
			return getRuleContexts(EnumItemContext.class);
		}
		public EnumItemContext enumItem(int i) {
			return getRuleContext(EnumItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemsContext enumItems() throws RecognitionException {
		EnumItemsContext _localctx = new EnumItemsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_enumItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			enumItem();
			setState(927);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(923);
					match(COMMA);
					setState(924);
					enumItem();
					}
					} 
				}
				setState(929);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(930);
				match(COMMA);
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

	public static class EnumItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public EnumItemTupleContext enumItemTuple() {
			return getRuleContext(EnumItemTupleContext.class,0);
		}
		public EnumItemStructContext enumItemStruct() {
			return getRuleContext(EnumItemStructContext.class,0);
		}
		public EnumItemDiscriminantContext enumItemDiscriminant() {
			return getRuleContext(EnumItemDiscriminantContext.class,0);
		}
		public EnumItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemContext enumItem() throws RecognitionException {
		EnumItemContext _localctx = new EnumItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(933);
				outerAttribute();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_PUB) {
				{
				setState(939);
				visibility();
				}
			}

			setState(942);
			identifier();
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(943);
				enumItemTuple();
				}
				break;
			case LCURLYBRACE:
				{
				setState(944);
				enumItemStruct();
				}
				break;
			case EQ:
				{
				setState(945);
				enumItemDiscriminant();
				}
				break;
			case COMMA:
			case RCURLYBRACE:
				break;
			default:
				break;
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

	public static class EnumItemTupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TupleFieldsContext tupleFields() {
			return getRuleContext(TupleFieldsContext.class,0);
		}
		public EnumItemTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemTupleContext enumItemTuple() throws RecognitionException {
		EnumItemTupleContext _localctx = new EnumItemTupleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumItemTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(LPAREN);
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(949);
				tupleFields();
				}
			}

			setState(952);
			match(RPAREN);
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

	public static class EnumItemStructContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public EnumItemStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemStructContext enumItemStruct() throws RecognitionException {
		EnumItemStructContext _localctx = new EnumItemStructContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumItemStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(LCURLYBRACE);
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PUB) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==POUND) {
				{
				setState(955);
				structFields();
				}
			}

			setState(958);
			match(RCURLYBRACE);
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

	public static class EnumItemDiscriminantContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumItemDiscriminantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumItemDiscriminant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumItemDiscriminant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumItemDiscriminant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumItemDiscriminant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumItemDiscriminantContext enumItemDiscriminant() throws RecognitionException {
		EnumItemDiscriminantContext _localctx = new EnumItemDiscriminantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumItemDiscriminant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			match(EQ);
			setState(961);
			expression(0);
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

	public static class Union_Context extends ParserRuleContext {
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public Union_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnion_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnion_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnion_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_Context union_() throws RecognitionException {
		Union_Context _localctx = new Union_Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_union_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			match(KW_UNION);
			setState(964);
			identifier();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(965);
				genericParams();
				}
			}

			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(968);
				whereClause();
				}
			}

			setState(971);
			match(LCURLYBRACE);
			setState(972);
			structFields();
			setState(973);
			match(RCURLYBRACE);
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

	public static class ConstantItemContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstantItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstantItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstantItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantItemContext constantItem() throws RecognitionException {
		ConstantItemContext _localctx = new ConstantItemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_constantItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(KW_CONST);
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				{
				setState(976);
				identifier();
				}
				break;
			case UNDERSCORE:
				{
				setState(977);
				match(UNDERSCORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(980);
			match(COLON);
			setState(981);
			type_();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(982);
				match(EQ);
				setState(983);
				expression(0);
				}
			}

			setState(986);
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

	public static class StaticItemContext extends ParserRuleContext {
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StaticItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStaticItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStaticItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStaticItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticItemContext staticItem() throws RecognitionException {
		StaticItemContext _localctx = new StaticItemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_staticItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(KW_STATIC);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(989);
				match(KW_MUT);
				}
			}

			setState(992);
			identifier();
			setState(993);
			match(COLON);
			setState(994);
			type_();
			setState(997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(995);
				match(EQ);
				setState(996);
				expression(0);
				}
			}

			setState(999);
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

	public static class Trait_Context extends ParserRuleContext {
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public Trait_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTrait_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTrait_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTrait_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trait_Context trait_() throws RecognitionException {
		Trait_Context _localctx = new Trait_Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_trait_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1001);
				match(KW_UNSAFE);
				}
			}

			setState(1004);
			match(KW_TRAIT);
			setState(1005);
			identifier();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1006);
				genericParams();
				}
			}

			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1009);
				match(COLON);
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(1010);
					typeParamBounds();
					}
				}

				}
			}

			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1015);
				whereClause();
				}
			}

			setState(1018);
			match(LCURLYBRACE);
			setState(1022);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1019);
					innerAttribute();
					}
					} 
				}
				setState(1024);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1025);
				associatedItem();
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			match(RCURLYBRACE);
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

	public static class ImplementationContext extends ParserRuleContext {
		public InherentImplContext inherentImpl() {
			return getRuleContext(InherentImplContext.class,0);
		}
		public TraitImplContext traitImpl() {
			return getRuleContext(TraitImplContext.class,0);
		}
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplementation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_implementation);
		try {
			setState(1035);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1033);
				inherentImpl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1034);
				traitImpl();
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

	public static class InherentImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public InherentImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherentImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInherentImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInherentImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInherentImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InherentImplContext inherentImpl() throws RecognitionException {
		InherentImplContext _localctx = new InherentImplContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_inherentImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(KW_IMPL);
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1038);
				genericParams();
				}
				break;
			}
			setState(1041);
			type_();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1042);
				whereClause();
				}
			}

			setState(1045);
			match(LCURLYBRACE);
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					innerAttribute();
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1052);
				associatedItem();
				}
				}
				setState(1057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1058);
			match(RCURLYBRACE);
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

	public static class TraitImplContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<AssociatedItemContext> associatedItem() {
			return getRuleContexts(AssociatedItemContext.class);
		}
		public AssociatedItemContext associatedItem(int i) {
			return getRuleContext(AssociatedItemContext.class,i);
		}
		public TraitImplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitImpl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitImplContext traitImpl() throws RecognitionException {
		TraitImplContext _localctx = new TraitImplContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_traitImpl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1060);
				match(KW_UNSAFE);
				}
			}

			setState(1063);
			match(KW_IMPL);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1064);
				genericParams();
				}
			}

			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(1067);
				match(NOT);
				}
			}

			setState(1070);
			typePath();
			setState(1071);
			match(KW_FOR);
			setState(1072);
			type_();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WHERE) {
				{
				setState(1073);
				whereClause();
				}
			}

			setState(1076);
			match(LCURLYBRACE);
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1077);
					innerAttribute();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_SUPER) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1083);
				associatedItem();
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1089);
			match(RCURLYBRACE);
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

	public static class ExternBlockContext extends ParserRuleContext {
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExternalItemContext> externalItem() {
			return getRuleContexts(ExternalItemContext.class);
		}
		public ExternalItemContext externalItem(int i) {
			return getRuleContext(ExternalItemContext.class,i);
		}
		public ExternBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternBlockContext externBlock() throws RecognitionException {
		ExternBlockContext _localctx = new ExternBlockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_externBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(1091);
				match(KW_UNSAFE);
				}
			}

			setState(1094);
			match(KW_EXTERN);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
				{
				setState(1095);
				abi();
				}
			}

			setState(1098);
			match(LCURLYBRACE);
			setState(1102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1099);
					innerAttribute();
					}
					} 
				}
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_PUB) | (1L << KW_SELFVALUE) | (1L << KW_STATIC) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==PATHSEP || _la==POUND) {
				{
				{
				setState(1105);
				externalItem();
				}
				}
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1111);
			match(RCURLYBRACE);
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

	public static class ExternalItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public StaticItemContext staticItem() {
			return getRuleContext(StaticItemContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public ExternalItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExternalItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExternalItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExternalItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalItemContext externalItem() throws RecognitionException {
		ExternalItemContext _localctx = new ExternalItemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_externalItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1113);
				outerAttribute();
				}
				}
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1119);
				macroInvocationSemi();
				}
				break;
			case KW_CONST:
			case KW_EXTERN:
			case KW_FN:
			case KW_PUB:
			case KW_STATIC:
			case KW_UNSAFE:
			case KW_ASYNC:
				{
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1120);
					visibility();
					}
				}

				setState(1125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_STATIC:
					{
					setState(1123);
					staticItem();
					}
					break;
				case KW_CONST:
				case KW_EXTERN:
				case KW_FN:
				case KW_UNSAFE:
				case KW_ASYNC:
					{
					setState(1124);
					function_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericParamsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public List<GenericParamContext> genericParam() {
			return getRuleContexts(GenericParamContext.class);
		}
		public GenericParamContext genericParam(int i) {
			return getRuleContext(GenericParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParamsContext genericParams() throws RecognitionException {
		GenericParamsContext _localctx = new GenericParamsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_genericParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(LT);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CONST) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || _la==LIFETIME_OR_LABEL || _la==POUND) {
				{
				setState(1135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1130);
						genericParam();
						setState(1131);
						match(COMMA);
						}
						} 
					}
					setState(1137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
				}
				setState(1138);
				genericParam();
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1139);
					match(COMMA);
					}
				}

				}
			}

			setState(1144);
			match(GT);
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

	public static class GenericParamContext extends ParserRuleContext {
		public LifetimeParamContext lifetimeParam() {
			return getRuleContext(LifetimeParamContext.class,0);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public ConstParamContext constParam() {
			return getRuleContext(ConstParamContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public GenericParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericParamContext genericParam() throws RecognitionException {
		GenericParamContext _localctx = new GenericParamContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_genericParam);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1146);
					outerAttribute();
					}
					} 
				}
				setState(1151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1152);
				lifetimeParam();
				}
				break;
			case 2:
				{
				setState(1153);
				typeParam();
				}
				break;
			case 3:
				{
				setState(1154);
				constParam();
				}
				break;
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

	public static class LifetimeParamContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeParamContext lifetimeParam() throws RecognitionException {
		LifetimeParamContext _localctx = new LifetimeParamContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_lifetimeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1157);
				outerAttribute();
				}
			}

			setState(1160);
			match(LIFETIME_OR_LABEL);
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1161);
				match(COLON);
				setState(1162);
				lifetimeBounds();
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

	public static class TypeParamContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OuterAttributeContext outerAttribute() {
			return getRuleContext(OuterAttributeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POUND) {
				{
				setState(1165);
				outerAttribute();
				}
			}

			setState(1168);
			identifier();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1169);
				match(COLON);
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(1170);
					typeParamBounds();
					}
				}

				}
			}

			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1175);
				match(EQ);
				setState(1176);
				type_();
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

	public static class ConstParamContext extends ParserRuleContext {
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ConstParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterConstParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitConstParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitConstParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstParamContext constParam() throws RecognitionException {
		ConstParamContext _localctx = new ConstParamContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_constParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(KW_CONST);
			setState(1180);
			identifier();
			setState(1181);
			match(COLON);
			setState(1182);
			type_();
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public List<WhereClauseItemContext> whereClauseItem() {
			return getRuleContexts(WhereClauseItemContext.class);
		}
		public WhereClauseItemContext whereClauseItem(int i) {
			return getRuleContext(WhereClauseItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_whereClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(KW_WHERE);
			setState(1190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1185);
					whereClauseItem();
					setState(1186);
					match(COMMA);
					}
					} 
				}
				setState(1192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1193);
				whereClauseItem();
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

	public static class WhereClauseItemContext extends ParserRuleContext {
		public LifetimeWhereClauseItemContext lifetimeWhereClauseItem() {
			return getRuleContext(LifetimeWhereClauseItemContext.class,0);
		}
		public TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() {
			return getRuleContext(TypeBoundWhereClauseItemContext.class,0);
		}
		public WhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseItemContext whereClauseItem() throws RecognitionException {
		WhereClauseItemContext _localctx = new WhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_whereClauseItem);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1196);
				lifetimeWhereClauseItem();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1197);
				typeBoundWhereClauseItem();
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

	public static class LifetimeWhereClauseItemContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LifetimeBoundsContext lifetimeBounds() {
			return getRuleContext(LifetimeBoundsContext.class,0);
		}
		public LifetimeWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeWhereClauseItemContext lifetimeWhereClauseItem() throws RecognitionException {
		LifetimeWhereClauseItemContext _localctx = new LifetimeWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lifetimeWhereClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			lifetime();
			setState(1201);
			match(COLON);
			setState(1202);
			lifetimeBounds();
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

	public static class TypeBoundWhereClauseItemContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TypeBoundWhereClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoundWhereClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeBoundWhereClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeBoundWhereClauseItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeBoundWhereClauseItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundWhereClauseItemContext typeBoundWhereClauseItem() throws RecognitionException {
		TypeBoundWhereClauseItemContext _localctx = new TypeBoundWhereClauseItemContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeBoundWhereClauseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1204);
				forLifetimes();
				}
				break;
			}
			setState(1207);
			type_();
			setState(1208);
			match(COLON);
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FOR) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(1209);
				typeParamBounds();
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

	public static class ForLifetimesContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public GenericParamsContext genericParams() {
			return getRuleContext(GenericParamsContext.class,0);
		}
		public ForLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterForLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitForLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitForLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLifetimesContext forLifetimes() throws RecognitionException {
		ForLifetimesContext _localctx = new ForLifetimesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_forLifetimes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			match(KW_FOR);
			setState(1213);
			genericParams();
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

	public static class AssociatedItemContext extends ParserRuleContext {
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public ConstantItemContext constantItem() {
			return getRuleContext(ConstantItemContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public VisibilityContext visibility() {
			return getRuleContext(VisibilityContext.class,0);
		}
		public AssociatedItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associatedItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssociatedItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssociatedItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssociatedItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociatedItemContext associatedItem() throws RecognitionException {
		AssociatedItemContext _localctx = new AssociatedItemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_associatedItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1215);
				outerAttribute();
				}
				}
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				{
				setState(1221);
				macroInvocationSemi();
				}
				break;
			case KW_CONST:
			case KW_EXTERN:
			case KW_FN:
			case KW_PUB:
			case KW_TYPE:
			case KW_UNSAFE:
			case KW_ASYNC:
				{
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_PUB) {
					{
					setState(1222);
					visibility();
					}
				}

				setState(1228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1225);
					typeAlias();
					}
					break;
				case 2:
					{
					setState(1226);
					constantItem();
					}
					break;
				case 3:
					{
					setState(1227);
					function_();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InnerAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public InnerAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInnerAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInnerAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInnerAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerAttributeContext innerAttribute() throws RecognitionException {
		InnerAttributeContext _localctx = new InnerAttributeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_innerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			match(POUND);
			setState(1233);
			match(NOT);
			setState(1234);
			match(LSQUAREBRACKET);
			setState(1235);
			attr();
			setState(1236);
			match(RSQUAREBRACKET);
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

	public static class OuterAttributeContext extends ParserRuleContext {
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public OuterAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterOuterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitOuterAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitOuterAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OuterAttributeContext outerAttribute() throws RecognitionException {
		OuterAttributeContext _localctx = new OuterAttributeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_outerAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(POUND);
			setState(1239);
			match(LSQUAREBRACKET);
			setState(1240);
			attr();
			setState(1241);
			match(RSQUAREBRACKET);
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

	public static class AttrContext extends ParserRuleContext {
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public AttrInputContext attrInput() {
			return getRuleContext(AttrInputContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			simplePath();
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (EQ - 103)) | (1L << (LCURLYBRACE - 103)) | (1L << (LSQUAREBRACKET - 103)) | (1L << (LPAREN - 103)))) != 0)) {
				{
				setState(1244);
				attrInput();
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

	public static class AttrInputContext extends ParserRuleContext {
		public DelimTokenTreeContext delimTokenTree() {
			return getRuleContext(DelimTokenTreeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public AttrInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttrInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttrInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttrInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrInputContext attrInput() throws RecognitionException {
		AttrInputContext _localctx = new AttrInputContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_attrInput);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				delimTokenTree();
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(EQ);
				setState(1249);
				literalExpression();
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MacroInvocationSemiContext macroInvocationSemi() {
			return getRuleContext(MacroInvocationSemiContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_statement);
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1254);
				letStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1255);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1256);
				macroInvocationSemi();
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

	public static class LetStatementContext extends ParserRuleContext {
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternNoTopAltContext patternNoTopAlt() {
			return getRuleContext(PatternNoTopAltContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1259);
				outerAttribute();
				}
				}
				setState(1264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1265);
			match(KW_LET);
			setState(1266);
			patternNoTopAlt();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1267);
				match(COLON);
				setState(1268);
				type_();
				}
			}

			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1271);
				match(EQ);
				setState(1272);
				expression(0);
				}
			}

			setState(1275);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_expressionStatement);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				expression(0);
				setState(1278);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				expressionWithBlock();
				setState(1282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1281);
					match(SEMI);
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
	public static class TypeCastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathExpression_Context extends ExpressionContext {
		public PathExpressionContext pathExpression() {
			return getRuleContext(PathExpressionContext.class,0);
		}
		public PathExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public TupleElementsContext tupleElements() {
			return getRuleContext(TupleElementsContext.class,0);
		}
		public TupleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeExpressionContext extends ExpressionContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MacroInvocationAsExpressionContext extends ExpressionContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public MacroInvocationAsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroInvocationAsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroInvocationAsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroInvocationAsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnExpressionContext extends ExpressionContext {
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReturnExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReturnExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AwaitExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public AwaitExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorPropagationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public ErrorPropagationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterErrorPropagationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitErrorPropagationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitErrorPropagationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueExpressionContext extends ExpressionContext {
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterContinueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitContinueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitContinueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public PathExprSegmentContext pathExprSegment() {
			return getRuleContext(PathExprSegmentContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpression_Context extends ExpressionContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public LiteralExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructExpression_Context extends ExpressionContext {
		public StructExpressionContext structExpression() {
			return getRuleContext(StructExpressionContext.class,0);
		}
		public StructExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TupleIndexingExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TupleIndexingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndexingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndexingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NegationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNegationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNegationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNegationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public CallParamsContext callParams() {
			return getRuleContext(CallParamsContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LazyBooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public LazyBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLazyBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLazyBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLazyBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceExpressionContext extends ExpressionContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DereferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterDereferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitDereferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitDereferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionWithBlock_Context extends ExpressionContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public ExpressionWithBlock_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public GroupedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakExpressionContext extends ExpressionContext {
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBreakExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBreakExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBreakExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticOrLogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(RustParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public ShlContext shl() {
			return getRuleContext(ShlContext.class,0);
		}
		public ShrContext shr() {
			return getRuleContext(ShrContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public ArithmeticOrLogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArithmeticOrLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArithmeticOrLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArithmeticOrLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnumerationVariantExpression_Context extends ExpressionContext {
		public EnumerationVariantExpressionContext enumerationVariantExpression() {
			return getRuleContext(EnumerationVariantExpressionContext.class,0);
		}
		public EnumerationVariantExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public AttributedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAttributedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAttributedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAttributedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BorrowExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public BorrowExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBorrowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBorrowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBorrowExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundAssignmentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompoundAssignOperatorContext compoundAssignOperator() {
			return getRuleContext(CompoundAssignOperatorContext.class,0);
		}
		public CompoundAssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureExpression_Context extends ExpressionContext {
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ClosureExpression_Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExpressionContext extends ExpressionContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayExpression(this);
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				_localctx = new AttributedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1287);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1292);
				expression(40);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1294);
				literalExpression();
				}
				break;
			case 3:
				{
				_localctx = new PathExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1295);
				pathExpression();
				}
				break;
			case 4:
				{
				_localctx = new BorrowExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1296);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==ANDAND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(1297);
					match(KW_MUT);
					}
				}

				setState(1300);
				expression(30);
				}
				break;
			case 5:
				{
				_localctx = new DereferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1301);
				match(STAR);
				setState(1302);
				expression(29);
				}
				break;
			case 6:
				{
				_localctx = new NegationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1304);
				expression(28);
				}
				break;
			case 7:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1305);
				match(DOTDOT);
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1306);
					expression(0);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new RangeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1309);
				match(DOTDOTEQ);
				setState(1310);
				expression(15);
				}
				break;
			case 9:
				{
				_localctx = new ContinueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1311);
				match(KW_CONTINUE);
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1312);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1315);
					expression(0);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new BreakExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				match(KW_BREAK);
				setState(1320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1319);
					match(LIFETIME_OR_LABEL);
					}
					break;
				}
				setState(1323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1322);
					expression(0);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new ReturnExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1325);
				match(KW_RETURN);
				setState(1327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1326);
					expression(0);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new GroupedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1329);
				match(LPAREN);
				setState(1333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1330);
						innerAttribute();
						}
						} 
					}
					setState(1335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				setState(1336);
				expression(0);
				setState(1337);
				match(RPAREN);
				}
				break;
			case 13:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1339);
				match(LSQUAREBRACKET);
				setState(1343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1340);
						innerAttribute();
						}
						} 
					}
					setState(1345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1346);
					arrayElements();
					}
				}

				setState(1349);
				match(RSQUAREBRACKET);
				}
				break;
			case 14:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1350);
				match(LPAREN);
				setState(1354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1351);
						innerAttribute();
						}
						} 
					}
					setState(1356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
				}
				setState(1358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1357);
					tupleElements();
					}
				}

				setState(1360);
				match(RPAREN);
				}
				break;
			case 15:
				{
				_localctx = new StructExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1361);
				structExpression();
				}
				break;
			case 16:
				{
				_localctx = new EnumerationVariantExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1362);
				enumerationVariantExpression();
				}
				break;
			case 17:
				{
				_localctx = new ClosureExpression_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1363);
				closureExpression();
				}
				break;
			case 18:
				{
				_localctx = new ExpressionWithBlock_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1364);
				expressionWithBlock();
				}
				break;
			case 19:
				{
				_localctx = new MacroInvocationAsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1365);
				macroInvocation();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1449);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1368);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(1369);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STAR - 84)) | (1L << (SLASH - 84)) | (1L << (PERCENT - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1370);
						expression(27);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1371);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(1372);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1373);
						expression(26);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1374);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(1377);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1375);
							shl();
							}
							break;
						case GT:
							{
							setState(1376);
							shr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1379);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1381);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1382);
						match(AND);
						setState(1383);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1384);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1385);
						match(CARET);
						setState(1386);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1387);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1388);
						match(OR);
						setState(1389);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1390);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1391);
						comparisonOperator();
						setState(1392);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1394);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1395);
						match(ANDAND);
						setState(1396);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new LazyBooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1397);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1398);
						match(OROR);
						setState(1399);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1400);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1401);
						match(DOTDOTEQ);
						setState(1402);
						expression(15);
						}
						break;
					case 11:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1403);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1404);
						match(EQ);
						setState(1405);
						expression(14);
						}
						break;
					case 12:
						{
						_localctx = new CompoundAssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1406);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1407);
						compoundAssignOperator();
						setState(1408);
						expression(13);
						}
						break;
					case 13:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1410);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(1411);
						match(DOT);
						setState(1412);
						pathExprSegment();
						setState(1413);
						match(LPAREN);
						setState(1415);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
							{
							setState(1414);
							callParams();
							}
						}

						setState(1417);
						match(RPAREN);
						}
						break;
					case 14:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1419);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(1420);
						match(DOT);
						setState(1421);
						identifier();
						}
						break;
					case 15:
						{
						_localctx = new TupleIndexingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1422);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(1423);
						match(DOT);
						setState(1424);
						tupleIndex();
						}
						break;
					case 16:
						{
						_localctx = new AwaitExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1425);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(1426);
						match(DOT);
						setState(1427);
						match(KW_AWAIT);
						}
						break;
					case 17:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1428);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(1429);
						match(LPAREN);
						setState(1431);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
							{
							setState(1430);
							callParams();
							}
						}

						setState(1433);
						match(RPAREN);
						}
						break;
					case 18:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1434);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(1435);
						match(LSQUAREBRACKET);
						setState(1436);
						expression(0);
						setState(1437);
						match(RSQUAREBRACKET);
						}
						break;
					case 19:
						{
						_localctx = new ErrorPropagationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1439);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(1440);
						match(QUESTION);
						}
						break;
					case 20:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1441);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(1442);
						match(KW_AS);
						setState(1443);
						typeNoBounds();
						}
						break;
					case 21:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1444);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1445);
						match(DOTDOT);
						setState(1447);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
						case 1:
							{
							setState(1446);
							expression(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (EQEQ - 104)) | (1L << (NE - 104)) | (1L << (GT - 104)) | (1L << (LT - 104)) | (1L << (GE - 104)) | (1L << (LE - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CompoundAssignOperatorContext extends ParserRuleContext {
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public CompoundAssignOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundAssignOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCompoundAssignOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCompoundAssignOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCompoundAssignOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundAssignOperatorContext compoundAssignOperator() throws RecognitionException {
		CompoundAssignOperatorContext _localctx = new CompoundAssignOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_compoundAssignOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (PLUSEQ - 93)) | (1L << (MINUSEQ - 93)) | (1L << (STAREQ - 93)) | (1L << (SLASHEQ - 93)) | (1L << (PERCENTEQ - 93)) | (1L << (CARETEQ - 93)) | (1L << (ANDEQ - 93)) | (1L << (OREQ - 93)) | (1L << (SHLEQ - 93)) | (1L << (SHREQ - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionWithBlockContext extends ParserRuleContext {
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public AsyncBlockExpressionContext asyncBlockExpression() {
			return getRuleContext(AsyncBlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext unsafeBlockExpression() {
			return getRuleContext(UnsafeBlockExpressionContext.class,0);
		}
		public LoopExpressionContext loopExpression() {
			return getRuleContext(LoopExpressionContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public ExpressionWithBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterExpressionWithBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitExpressionWithBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitExpressionWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithBlockContext expressionWithBlock() throws RecognitionException {
		ExpressionWithBlockContext _localctx = new ExpressionWithBlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_expressionWithBlock);
		try {
			int _alt;
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1458);
						outerAttribute();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1461); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1463);
				expressionWithBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				blockExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1466);
				asyncBlockExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1467);
				unsafeBlockExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1468);
				loopExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1469);
				ifExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1470);
				ifLetExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1471);
				matchExpression();
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

	public static class LiteralExpressionContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_literalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_la = _input.LA(1);
			if ( !(_la==KW_FALSE || _la==KW_TRUE || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PathExpressionContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExpressionContext pathExpression() throws RecognitionException {
		PathExpressionContext _localctx = new PathExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pathExpression);
		try {
			setState(1478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				qualifiedPathInExpression();
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_blockExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			match(LCURLYBRACE);
			setState(1484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1481);
					innerAttribute();
					}
					} 
				}
				setState(1486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_PUB) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_UNION) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (SEMI - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1487);
				statements();
				}
			}

			setState(1490);
			match(RCURLYBRACE);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(1501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1492);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1495); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
					{
					setState(1497);
					expression(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1500);
				expression(0);
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

	public static class AsyncBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public AsyncBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asyncBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterAsyncBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitAsyncBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitAsyncBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsyncBlockExpressionContext asyncBlockExpression() throws RecognitionException {
		AsyncBlockExpressionContext _localctx = new AsyncBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_asyncBlockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(KW_ASYNC);
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1504);
				match(KW_MOVE);
				}
			}

			setState(1507);
			blockExpression();
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

	public static class UnsafeBlockExpressionContext extends ParserRuleContext {
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public UnsafeBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsafeBlockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterUnsafeBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitUnsafeBlockExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitUnsafeBlockExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsafeBlockExpressionContext unsafeBlockExpression() throws RecognitionException {
		UnsafeBlockExpressionContext _localctx = new UnsafeBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unsafeBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(KW_UNSAFE);
			setState(1510);
			blockExpression();
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

	public static class ArrayElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arrayElements);
		int _la;
		try {
			int _alt;
			setState(1527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				expression(0);
				setState(1517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1513);
						match(COMMA);
						setState(1514);
						expression(0);
						}
						} 
					}
					setState(1519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1520);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				expression(0);
				setState(1524);
				match(SEMI);
				setState(1525);
				expression(0);
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

	public static class TupleElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleElementsContext tupleElements() throws RecognitionException {
		TupleElementsContext _localctx = new TupleElementsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tupleElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1529);
					expression(0);
					setState(1530);
					match(COMMA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1534); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1536);
				expression(0);
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

	public static class TupleIndexContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TupleIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleIndexContext tupleIndex() throws RecognitionException {
		TupleIndexContext _localctx = new TupleIndexContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_tupleIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(INTEGER_LITERAL);
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

	public static class StructExpressionContext extends ParserRuleContext {
		public StructExprStructContext structExprStruct() {
			return getRuleContext(StructExprStructContext.class,0);
		}
		public StructExprTupleContext structExprTuple() {
			return getRuleContext(StructExprTupleContext.class,0);
		}
		public StructExprUnitContext structExprUnit() {
			return getRuleContext(StructExprUnitContext.class,0);
		}
		public StructExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExpressionContext structExpression() throws RecognitionException {
		StructExpressionContext _localctx = new StructExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_structExpression);
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				structExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1542);
				structExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1543);
				structExprUnit();
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

	public static class StructExprStructContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public StructExprFieldsContext structExprFields() {
			return getRuleContext(StructExprFieldsContext.class,0);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprStructContext structExprStruct() throws RecognitionException {
		StructExprStructContext _localctx = new StructExprStructContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_structExprStruct);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			pathInExpression();
			setState(1547);
			match(LCURLYBRACE);
			setState(1551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1548);
					innerAttribute();
					}
					} 
				}
				setState(1553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			setState(1556);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case INTEGER_LITERAL:
			case POUND:
				{
				setState(1554);
				structExprFields();
				}
				break;
			case DOTDOT:
				{
				setState(1555);
				structBase();
				}
				break;
			case RCURLYBRACE:
				break;
			default:
				break;
			}
			setState(1558);
			match(RCURLYBRACE);
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

	public static class StructExprFieldsContext extends ParserRuleContext {
		public List<StructExprFieldContext> structExprField() {
			return getRuleContexts(StructExprFieldContext.class);
		}
		public StructExprFieldContext structExprField(int i) {
			return getRuleContext(StructExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructBaseContext structBase() {
			return getRuleContext(StructBaseContext.class,0);
		}
		public StructExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldsContext structExprFields() throws RecognitionException {
		StructExprFieldsContext _localctx = new StructExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_structExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1560);
			structExprField();
			setState(1565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1561);
					match(COMMA);
					setState(1562);
					structExprField();
					}
					} 
				}
				setState(1567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			}
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1568);
				match(COMMA);
				setState(1569);
				structBase();
				}
				break;
			case 2:
				{
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1570);
					match(COMMA);
					}
				}

				}
				break;
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

	public static class StructExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public StructExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprFieldContext structExprField() throws RecognitionException {
		StructExprFieldContext _localctx = new StructExprFieldContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_structExprField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1575);
				outerAttribute();
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1581);
				identifier();
				}
				break;
			case 2:
				{
				setState(1584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(1582);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1583);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1586);
				match(COLON);
				setState(1587);
				expression(0);
				}
				break;
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

	public static class StructBaseContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StructBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBaseContext structBase() throws RecognitionException {
		StructBaseContext _localctx = new StructBaseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_structBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(DOTDOT);
			setState(1592);
			expression(0);
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

	public static class StructExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprTupleContext structExprTuple() throws RecognitionException {
		StructExprTupleContext _localctx = new StructExprTupleContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_structExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			pathInExpression();
			setState(1595);
			match(LPAREN);
			setState(1599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1596);
					innerAttribute();
					}
					} 
				}
				setState(1601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1602);
				expression(0);
				setState(1607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1603);
						match(COMMA);
						setState(1604);
						expression(0);
						}
						} 
					}
					setState(1609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1610);
					match(COMMA);
					}
				}

				}
			}

			setState(1615);
			match(RPAREN);
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

	public static class StructExprUnitContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public StructExprUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExprUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructExprUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructExprUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructExprUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprUnitContext structExprUnit() throws RecognitionException {
		StructExprUnitContext _localctx = new StructExprUnitContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_structExprUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1617);
			pathInExpression();
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

	public static class EnumerationVariantExpressionContext extends ParserRuleContext {
		public EnumExprStructContext enumExprStruct() {
			return getRuleContext(EnumExprStructContext.class,0);
		}
		public EnumExprTupleContext enumExprTuple() {
			return getRuleContext(EnumExprTupleContext.class,0);
		}
		public EnumExprFieldlessContext enumExprFieldless() {
			return getRuleContext(EnumExprFieldlessContext.class,0);
		}
		public EnumerationVariantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationVariantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumerationVariantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumerationVariantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumerationVariantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationVariantExpressionContext enumerationVariantExpression() throws RecognitionException {
		EnumerationVariantExpressionContext _localctx = new EnumerationVariantExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumerationVariantExpression);
		try {
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1619);
				enumExprStruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1620);
				enumExprTuple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1621);
				enumExprFieldless();
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

	public static class EnumExprStructContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public EnumExprFieldsContext enumExprFields() {
			return getRuleContext(EnumExprFieldsContext.class,0);
		}
		public EnumExprStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprStructContext enumExprStruct() throws RecognitionException {
		EnumExprStructContext _localctx = new EnumExprStructContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumExprStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			pathInExpression();
			setState(1625);
			match(LCURLYBRACE);
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (KW_MACRORULES - 54)) | (1L << (NON_KEYWORD_IDENTIFIER - 54)) | (1L << (RAW_IDENTIFIER - 54)) | (1L << (INTEGER_LITERAL - 54)))) != 0)) {
				{
				setState(1626);
				enumExprFields();
				}
			}

			setState(1629);
			match(RCURLYBRACE);
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

	public static class EnumExprFieldsContext extends ParserRuleContext {
		public List<EnumExprFieldContext> enumExprField() {
			return getRuleContexts(EnumExprFieldContext.class);
		}
		public EnumExprFieldContext enumExprField(int i) {
			return getRuleContext(EnumExprFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldsContext enumExprFields() throws RecognitionException {
		EnumExprFieldsContext _localctx = new EnumExprFieldsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enumExprFields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			enumExprField();
			setState(1636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1632);
					match(COMMA);
					setState(1633);
					enumExprField();
					}
					} 
				}
				setState(1638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1639);
				match(COMMA);
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

	public static class EnumExprFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public EnumExprFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldContext enumExprField() throws RecognitionException {
		EnumExprFieldContext _localctx = new EnumExprFieldContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_enumExprField);
		try {
			setState(1650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(1643);
					identifier();
					}
					break;
				case INTEGER_LITERAL:
					{
					setState(1644);
					tupleIndex();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1647);
				match(COLON);
				setState(1648);
				expression(0);
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

	public static class EnumExprTupleContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public EnumExprTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprTupleContext enumExprTuple() throws RecognitionException {
		EnumExprTupleContext _localctx = new EnumExprTupleContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumExprTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			pathInExpression();
			setState(1653);
			match(LPAREN);
			setState(1665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_BREAK) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOVE) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_UNSAFE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (LIFETIME_OR_LABEL - 69)) | (1L << (MINUS - 69)) | (1L << (STAR - 69)) | (1L << (NOT - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (OROR - 69)) | (1L << (LT - 69)) | (1L << (DOTDOT - 69)) | (1L << (DOTDOTEQ - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LCURLYBRACE - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1654);
				expression(0);
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1655);
						match(COMMA);
						setState(1656);
						expression(0);
						}
						} 
					}
					setState(1661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1662);
					match(COMMA);
					}
				}

				}
			}

			setState(1667);
			match(RPAREN);
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

	public static class EnumExprFieldlessContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public EnumExprFieldlessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumExprFieldless; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterEnumExprFieldless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitEnumExprFieldless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitEnumExprFieldless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumExprFieldlessContext enumExprFieldless() throws RecognitionException {
		EnumExprFieldlessContext _localctx = new EnumExprFieldlessContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumExprFieldless);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			pathInExpression();
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

	public static class CallParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public CallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitCallParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParamsContext callParams() throws RecognitionException {
		CallParamsContext _localctx = new CallParamsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_callParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			expression(0);
			setState(1676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1672);
					match(COMMA);
					setState(1673);
					expression(0);
					}
					} 
				}
				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			setState(1680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1679);
				match(COMMA);
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

	public static class ClosureExpressionContext extends ParserRuleContext {
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public ClosureParametersContext closureParameters() {
			return getRuleContext(ClosureParametersContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MOVE) {
				{
				setState(1682);
				match(KW_MOVE);
				}
			}

			setState(1691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR:
				{
				setState(1685);
				match(OROR);
				}
				break;
			case OR:
				{
				setState(1686);
				match(OR);
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1687);
					closureParameters();
					}
					break;
				}
				setState(1690);
				match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_BREAK:
			case KW_CONTINUE:
			case KW_CRATE:
			case KW_FALSE:
			case KW_FOR:
			case KW_IF:
			case KW_LOOP:
			case KW_MATCH:
			case KW_MOVE:
			case KW_RETURN:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_TRUE:
			case KW_UNSAFE:
			case KW_WHILE:
			case KW_ASYNC:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case LIFETIME_OR_LABEL:
			case MINUS:
			case STAR:
			case NOT:
			case AND:
			case OR:
			case ANDAND:
			case OROR:
			case LT:
			case DOTDOT:
			case DOTDOTEQ:
			case PATHSEP:
			case POUND:
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				{
				setState(1693);
				expression(0);
				}
				break;
			case RARROW:
				{
				setState(1694);
				match(RARROW);
				setState(1695);
				typeNoBounds();
				setState(1696);
				blockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ClosureParametersContext extends ParserRuleContext {
		public List<ClosureParamContext> closureParam() {
			return getRuleContexts(ClosureParamContext.class);
		}
		public ClosureParamContext closureParam(int i) {
			return getRuleContext(ClosureParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public ClosureParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParametersContext closureParameters() throws RecognitionException {
		ClosureParametersContext _localctx = new ClosureParametersContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_closureParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			closureParam();
			setState(1705);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1701);
					match(COMMA);
					setState(1702);
					closureParam();
					}
					} 
				}
				setState(1707);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1708);
				match(COMMA);
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

	public static class ClosureParamContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ClosureParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterClosureParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitClosureParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitClosureParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosureParamContext closureParam() throws RecognitionException {
		ClosureParamContext _localctx = new ClosureParamContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_closureParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1711);
				outerAttribute();
				}
				}
				setState(1716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1717);
			pattern();
			setState(1720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1718);
				match(COLON);
				setState(1719);
				type_();
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

	public static class LoopExpressionContext extends ParserRuleContext {
		public InfiniteLoopExpressionContext infiniteLoopExpression() {
			return getRuleContext(InfiniteLoopExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext predicateLoopExpression() {
			return getRuleContext(PredicateLoopExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext predicatePatternLoopExpression() {
			return getRuleContext(PredicatePatternLoopExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext iteratorLoopExpression() {
			return getRuleContext(IteratorLoopExpressionContext.class,0);
		}
		public LoopLabelContext loopLabel() {
			return getRuleContext(LoopLabelContext.class,0);
		}
		public LoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopExpressionContext loopExpression() throws RecognitionException {
		LoopExpressionContext _localctx = new LoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_loopExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIFETIME_OR_LABEL) {
				{
				setState(1722);
				loopLabel();
				}
			}

			setState(1729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1725);
				infiniteLoopExpression();
				}
				break;
			case 2:
				{
				setState(1726);
				predicateLoopExpression();
				}
				break;
			case 3:
				{
				setState(1727);
				predicatePatternLoopExpression();
				}
				break;
			case 4:
				{
				setState(1728);
				iteratorLoopExpression();
				}
				break;
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

	public static class InfiniteLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public InfiniteLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infiniteLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInfiniteLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInfiniteLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInfiniteLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfiniteLoopExpressionContext infiniteLoopExpression() throws RecognitionException {
		InfiniteLoopExpressionContext _localctx = new InfiniteLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_infiniteLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(KW_LOOP);
			setState(1732);
			blockExpression();
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

	public static class PredicateLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicateLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicateLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicateLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicateLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateLoopExpressionContext predicateLoopExpression() throws RecognitionException {
		PredicateLoopExpressionContext _localctx = new PredicateLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_predicateLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			match(KW_WHILE);
			setState(1735);
			expression(0);
			setState(1736);
			blockExpression();
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

	public static class PredicatePatternLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PredicatePatternLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicatePatternLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPredicatePatternLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPredicatePatternLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPredicatePatternLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatePatternLoopExpressionContext predicatePatternLoopExpression() throws RecognitionException {
		PredicatePatternLoopExpressionContext _localctx = new PredicatePatternLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_predicatePatternLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			match(KW_WHILE);
			setState(1739);
			match(KW_LET);
			setState(1740);
			pattern();
			setState(1741);
			match(EQ);
			setState(1742);
			expression(0);
			setState(1743);
			blockExpression();
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

	public static class IteratorLoopExpressionContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public IteratorLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIteratorLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIteratorLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIteratorLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorLoopExpressionContext iteratorLoopExpression() throws RecognitionException {
		IteratorLoopExpressionContext _localctx = new IteratorLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_iteratorLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(KW_FOR);
			setState(1746);
			pattern();
			setState(1747);
			match(KW_IN);
			setState(1748);
			expression(0);
			setState(1749);
			blockExpression();
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

	public static class LoopLabelContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public LoopLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLoopLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLoopLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLoopLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLabelContext loopLabel() throws RecognitionException {
		LoopLabelContext _localctx = new LoopLabelContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_loopLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(LIFETIME_OR_LABEL);
			setState(1752);
			match(COLON);
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

	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(KW_IF);
			setState(1755);
			expression(0);
			setState(1756);
			blockExpression();
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1757);
				match(KW_ELSE);
				setState(1761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(1758);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(1759);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(1760);
					ifLetExpression();
					}
					break;
				}
				}
				break;
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

	public static class IfLetExpressionContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockExpressionContext> blockExpression() {
			return getRuleContexts(BlockExpressionContext.class);
		}
		public BlockExpressionContext blockExpression(int i) {
			return getRuleContext(BlockExpressionContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public IfLetExpressionContext ifLetExpression() {
			return getRuleContext(IfLetExpressionContext.class,0);
		}
		public IfLetExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLetExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIfLetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIfLetExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIfLetExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLetExpressionContext ifLetExpression() throws RecognitionException {
		IfLetExpressionContext _localctx = new IfLetExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ifLetExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
			match(KW_IF);
			setState(1766);
			match(KW_LET);
			setState(1767);
			pattern();
			setState(1768);
			match(EQ);
			setState(1769);
			expression(0);
			setState(1770);
			blockExpression();
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				{
				setState(1771);
				match(KW_ELSE);
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1772);
					blockExpression();
					}
					break;
				case 2:
					{
					setState(1773);
					ifExpression();
					}
					break;
				case 3:
					{
					setState(1774);
					ifLetExpression();
					}
					break;
				}
				}
				break;
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

	public static class MatchExpressionContext extends ParserRuleContext {
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public List<InnerAttributeContext> innerAttribute() {
			return getRuleContexts(InnerAttributeContext.class);
		}
		public InnerAttributeContext innerAttribute(int i) {
			return getRuleContext(InnerAttributeContext.class,i);
		}
		public MatchArmsContext matchArms() {
			return getRuleContext(MatchArmsContext.class,0);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_matchExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			match(KW_MATCH);
			setState(1780);
			expression(0);
			setState(1781);
			match(LCURLYBRACE);
			setState(1785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1782);
					innerAttribute();
					}
					} 
				}
				setState(1787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			}
			setState(1789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (POUND - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1788);
				matchArms();
				}
			}

			setState(1791);
			match(RCURLYBRACE);
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

	public static class MatchArmsContext extends ParserRuleContext {
		public List<MatchArmContext> matchArm() {
			return getRuleContexts(MatchArmContext.class);
		}
		public MatchArmContext matchArm(int i) {
			return getRuleContext(MatchArmContext.class,i);
		}
		public List<TerminalNode> FATARROW() { return getTokens(RustParser.FATARROW); }
		public TerminalNode FATARROW(int i) {
			return getToken(RustParser.FATARROW, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MatchArmExpressionContext> matchArmExpression() {
			return getRuleContexts(MatchArmExpressionContext.class);
		}
		public MatchArmExpressionContext matchArmExpression(int i) {
			return getRuleContext(MatchArmExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public MatchArmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmsContext matchArms() throws RecognitionException {
		MatchArmsContext _localctx = new MatchArmsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_matchArms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1793);
					matchArm();
					setState(1794);
					match(FATARROW);
					setState(1795);
					matchArmExpression();
					}
					} 
				}
				setState(1801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(1802);
			matchArm();
			setState(1803);
			match(FATARROW);
			setState(1804);
			expression(0);
			setState(1806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1805);
				match(COMMA);
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

	public static class MatchArmExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public ExpressionWithBlockContext expressionWithBlock() {
			return getRuleContext(ExpressionWithBlockContext.class,0);
		}
		public MatchArmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmExpressionContext matchArmExpression() throws RecognitionException {
		MatchArmExpressionContext _localctx = new MatchArmExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_matchArmExpression);
		int _la;
		try {
			setState(1815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				expression(0);
				setState(1809);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811);
				expressionWithBlock();
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1812);
					match(COMMA);
					}
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

	public static class MatchArmContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MatchArmGuardContext matchArmGuard() {
			return getRuleContext(MatchArmGuardContext.class,0);
		}
		public MatchArmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmContext matchArm() throws RecognitionException {
		MatchArmContext _localctx = new MatchArmContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_matchArm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1817);
				outerAttribute();
				}
				}
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1823);
			pattern();
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_IF) {
				{
				setState(1824);
				matchArmGuard();
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

	public static class MatchArmGuardContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MatchArmGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchArmGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMatchArmGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMatchArmGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMatchArmGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchArmGuardContext matchArmGuard() throws RecognitionException {
		MatchArmGuardContext _localctx = new MatchArmGuardContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_matchArmGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			match(KW_IF);
			setState(1828);
			expression(0);
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

	public static class PatternContext extends ParserRuleContext {
		public List<PatternNoTopAltContext> patternNoTopAlt() {
			return getRuleContexts(PatternNoTopAltContext.class);
		}
		public PatternNoTopAltContext patternNoTopAlt(int i) {
			return getRuleContext(PatternNoTopAltContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(RustParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RustParser.OR, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1830);
				match(OR);
				}
			}

			setState(1833);
			patternNoTopAlt();
			setState(1838);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1834);
					match(OR);
					setState(1835);
					patternNoTopAlt();
					}
					} 
				}
				setState(1840);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
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

	public static class PatternNoTopAltContext extends ParserRuleContext {
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public RangePatternContext rangePattern() {
			return getRuleContext(RangePatternContext.class,0);
		}
		public PatternNoTopAltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternNoTopAlt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPatternNoTopAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPatternNoTopAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPatternNoTopAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternNoTopAltContext patternNoTopAlt() throws RecognitionException {
		PatternNoTopAltContext _localctx = new PatternNoTopAltContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_patternNoTopAlt);
		try {
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841);
				patternWithoutRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				rangePattern();
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

	public static class PatternWithoutRangeContext extends ParserRuleContext {
		public LiteralPatternContext literalPattern() {
			return getRuleContext(LiteralPatternContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public ReferencePatternContext referencePattern() {
			return getRuleContext(ReferencePatternContext.class,0);
		}
		public StructPatternContext structPattern() {
			return getRuleContext(StructPatternContext.class,0);
		}
		public TupleStructPatternContext tupleStructPattern() {
			return getRuleContext(TupleStructPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public GroupedPatternContext groupedPattern() {
			return getRuleContext(GroupedPatternContext.class,0);
		}
		public SlicePatternContext slicePattern() {
			return getRuleContext(SlicePatternContext.class,0);
		}
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public PatternWithoutRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternWithoutRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPatternWithoutRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPatternWithoutRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPatternWithoutRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternWithoutRangeContext patternWithoutRange() throws RecognitionException {
		PatternWithoutRangeContext _localctx = new PatternWithoutRangeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_patternWithoutRange);
		try {
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				literalPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				identifierPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1847);
				wildcardPattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1848);
				restPattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1849);
				referencePattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1850);
				structPattern();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1851);
				tupleStructPattern();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1852);
				tuplePattern();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1853);
				groupedPattern();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1854);
				slicePattern();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1855);
				pathPattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1856);
				macroInvocation();
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

	public static class LiteralPatternContext extends ParserRuleContext {
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RustParser.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(RustParser.RAW_STRING_LITERAL, 0); }
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(RustParser.BYTE_STRING_LITERAL, 0); }
		public TerminalNode RAW_BYTE_STRING_LITERAL() { return getToken(RustParser.RAW_BYTE_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public LiteralPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralPatternContext literalPattern() throws RecognitionException {
		LiteralPatternContext _localctx = new LiteralPatternContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_literalPattern);
		int _la;
		try {
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1859);
				match(KW_TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				match(KW_FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1861);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1862);
				match(BYTE_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1863);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1864);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1865);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1866);
				match(RAW_BYTE_STRING_LITERAL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1867);
					match(MINUS);
					}
				}

				setState(1870);
				match(INTEGER_LITERAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1871);
					match(MINUS);
					}
				}

				setState(1874);
				match(FLOAT_LITERAL);
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

	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifierPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifierPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_identifierPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_REF) {
				{
				setState(1877);
				match(KW_REF);
				}
			}

			setState(1881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(1880);
				match(KW_MUT);
				}
			}

			setState(1883);
			identifier();
			setState(1886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(1884);
				match(AT);
				setState(1885);
				pattern();
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

	public static class WildcardPatternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitWildcardPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(UNDERSCORE);
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

	public static class RestPatternContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public RestPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRestPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRestPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRestPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestPatternContext restPattern() throws RecognitionException {
		RestPatternContext _localctx = new RestPatternContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_restPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			match(DOTDOT);
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

	public static class RangePatternContext extends ParserRuleContext {
		public RangePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePattern; }
	 
		public RangePatternContext() { }
		public void copyFrom(RangePatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InclusiveRangePatternContext extends RangePatternContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public InclusiveRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInclusiveRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInclusiveRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInclusiveRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObsoleteRangePatternContext extends RangePatternContext {
		public List<RangePatternBoundContext> rangePatternBound() {
			return getRuleContexts(RangePatternBoundContext.class);
		}
		public RangePatternBoundContext rangePatternBound(int i) {
			return getRuleContext(RangePatternBoundContext.class,i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public ObsoleteRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterObsoleteRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitObsoleteRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitObsoleteRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HalfOpenRangePatternContext extends RangePatternContext {
		public RangePatternBoundContext rangePatternBound() {
			return getRuleContext(RangePatternBoundContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public HalfOpenRangePatternContext(RangePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterHalfOpenRangePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitHalfOpenRangePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitHalfOpenRangePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternContext rangePattern() throws RecognitionException {
		RangePatternContext _localctx = new RangePatternContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_rangePattern);
		try {
			setState(1903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				_localctx = new InclusiveRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1892);
				rangePatternBound();
				setState(1893);
				match(DOTDOTEQ);
				setState(1894);
				rangePatternBound();
				}
				break;
			case 2:
				_localctx = new HalfOpenRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
				rangePatternBound();
				setState(1897);
				match(DOTDOT);
				}
				break;
			case 3:
				_localctx = new ObsoleteRangePatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1899);
				rangePatternBound();
				setState(1900);
				match(DOTDOTDOT);
				setState(1901);
				rangePatternBound();
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

	public static class RangePatternBoundContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(RustParser.CHAR_LITERAL, 0); }
		public TerminalNode BYTE_LITERAL() { return getToken(RustParser.BYTE_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(RustParser.INTEGER_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(RustParser.FLOAT_LITERAL, 0); }
		public PathPatternContext pathPattern() {
			return getRuleContext(PathPatternContext.class,0);
		}
		public RangePatternBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangePatternBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRangePatternBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRangePatternBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRangePatternBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangePatternBoundContext rangePatternBound() throws RecognitionException {
		RangePatternBoundContext _localctx = new RangePatternBoundContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_rangePatternBound);
		int _la;
		try {
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1905);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1906);
				match(BYTE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1907);
					match(MINUS);
					}
				}

				setState(1910);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1911);
					match(MINUS);
					}
				}

				setState(1914);
				match(FLOAT_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1915);
				pathPattern();
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

	public static class ReferencePatternContext extends ParserRuleContext {
		public PatternWithoutRangeContext patternWithoutRange() {
			return getRuleContext(PatternWithoutRangeContext.class,0);
		}
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ReferencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencePatternContext referencePattern() throws RecognitionException {
		ReferencePatternContext _localctx = new ReferencePatternContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_referencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==ANDAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(1919);
				match(KW_MUT);
				}
				break;
			}
			setState(1922);
			patternWithoutRange();
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

	public static class StructPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LCURLYBRACE() { return getToken(RustParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(RustParser.RCURLYBRACE, 0); }
		public StructPatternElementsContext structPatternElements() {
			return getRuleContext(StructPatternElementsContext.class,0);
		}
		public StructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternContext structPattern() throws RecognitionException {
		StructPatternContext _localctx = new StructPatternContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_structPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1924);
			pathInExpression();
			setState(1925);
			match(LCURLYBRACE);
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MUT) | (1L << KW_REF) | (1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (INTEGER_LITERAL - 75)) | (1L << (DOTDOT - 75)) | (1L << (POUND - 75)))) != 0)) {
				{
				setState(1926);
				structPatternElements();
				}
			}

			setState(1929);
			match(RCURLYBRACE);
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

	public static class StructPatternElementsContext extends ParserRuleContext {
		public StructPatternFieldsContext structPatternFields() {
			return getRuleContext(StructPatternFieldsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public StructPatternEtCeteraContext structPatternEtCetera() {
			return getRuleContext(StructPatternEtCeteraContext.class,0);
		}
		public StructPatternElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternElementsContext structPatternElements() throws RecognitionException {
		StructPatternElementsContext _localctx = new StructPatternElementsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_structPatternElements);
		int _la;
		try {
			setState(1939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1931);
				structPatternFields();
				setState(1936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1932);
					match(COMMA);
					setState(1934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTDOT || _la==POUND) {
						{
						setState(1933);
						structPatternEtCetera();
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1938);
				structPatternEtCetera();
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

	public static class StructPatternFieldsContext extends ParserRuleContext {
		public List<StructPatternFieldContext> structPatternField() {
			return getRuleContexts(StructPatternFieldContext.class);
		}
		public StructPatternFieldContext structPatternField(int i) {
			return getRuleContext(StructPatternFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public StructPatternFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldsContext structPatternFields() throws RecognitionException {
		StructPatternFieldsContext _localctx = new StructPatternFieldsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_structPatternFields);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			structPatternField();
			setState(1946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1942);
					match(COMMA);
					setState(1943);
					structPatternField();
					}
					} 
				}
				setState(1948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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

	public static class StructPatternFieldContext extends ParserRuleContext {
		public TupleIndexContext tupleIndex() {
			return getRuleContext(TupleIndexContext.class,0);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public StructPatternFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternFieldContext structPatternField() throws RecognitionException {
		StructPatternFieldContext _localctx = new StructPatternFieldContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_structPatternField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1949);
				outerAttribute();
				}
				}
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(1955);
				tupleIndex();
				setState(1956);
				match(COLON);
				setState(1957);
				pattern();
				}
				break;
			case 2:
				{
				setState(1959);
				identifier();
				setState(1960);
				match(COLON);
				setState(1961);
				pattern();
				}
				break;
			case 3:
				{
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_REF) {
					{
					setState(1963);
					match(KW_REF);
					}
				}

				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_MUT) {
					{
					setState(1966);
					match(KW_MUT);
					}
				}

				setState(1969);
				identifier();
				}
				break;
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

	public static class StructPatternEtCeteraContext extends ParserRuleContext {
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public StructPatternEtCeteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structPatternEtCetera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterStructPatternEtCetera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitStructPatternEtCetera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitStructPatternEtCetera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructPatternEtCeteraContext structPatternEtCetera() throws RecognitionException {
		StructPatternEtCeteraContext _localctx = new StructPatternEtCeteraContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_structPatternEtCetera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(1972);
				outerAttribute();
				}
				}
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1978);
			match(DOTDOT);
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

	public static class TupleStructPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TupleStructItemsContext tupleStructItems() {
			return getRuleContext(TupleStructItemsContext.class,0);
		}
		public TupleStructPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructPatternContext tupleStructPattern() throws RecognitionException {
		TupleStructPatternContext _localctx = new TupleStructPatternContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_tupleStructPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			pathInExpression();
			setState(1981);
			match(LPAREN);
			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1982);
				tupleStructItems();
				}
			}

			setState(1985);
			match(RPAREN);
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

	public static class TupleStructItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleStructItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleStructItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleStructItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleStructItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleStructItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleStructItemsContext tupleStructItems() throws RecognitionException {
		TupleStructItemsContext _localctx = new TupleStructItemsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_tupleStructItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1987);
			pattern();
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1988);
					match(COMMA);
					setState(1989);
					pattern();
					}
					} 
				}
				setState(1994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1995);
				match(COMMA);
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

	public static class TuplePatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TuplePatternItemsContext tuplePatternItems() {
			return getRuleContext(TuplePatternItemsContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			match(LPAREN);
			setState(2000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(1999);
				tuplePatternItems();
				}
			}

			setState(2002);
			match(RPAREN);
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

	public static class TuplePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public RestPatternContext restPattern() {
			return getRuleContext(RestPatternContext.class,0);
		}
		public TuplePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTuplePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTuplePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTuplePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplePatternItemsContext tuplePatternItems() throws RecognitionException {
		TuplePatternItemsContext _localctx = new TuplePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_tuplePatternItems);
		int _la;
		try {
			int _alt;
			setState(2018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2004);
				pattern();
				setState(2005);
				match(COMMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2007);
				restPattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2008);
				pattern();
				setState(2011); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2009);
						match(COMMA);
						setState(2010);
						pattern();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2013); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2015);
					match(COMMA);
					}
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

	public static class GroupedPatternContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public GroupedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupedPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGroupedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGroupedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGroupedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupedPatternContext groupedPattern() throws RecognitionException {
		GroupedPatternContext _localctx = new GroupedPatternContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_groupedPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			match(LPAREN);
			setState(2021);
			pattern();
			setState(2022);
			match(RPAREN);
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

	public static class SlicePatternContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SlicePatternItemsContext slicePatternItems() {
			return getRuleContext(SlicePatternItemsContext.class,0);
		}
		public SlicePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternContext slicePattern() throws RecognitionException {
		SlicePatternContext _localctx = new SlicePatternContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_slicePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(LSQUAREBRACKET);
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_FALSE) | (1L << KW_MUT) | (1L << KW_REF) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_TRUE) | (1L << KW_MACRORULES) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (CHAR_LITERAL - 69)) | (1L << (STRING_LITERAL - 69)) | (1L << (RAW_STRING_LITERAL - 69)) | (1L << (BYTE_LITERAL - 69)) | (1L << (BYTE_STRING_LITERAL - 69)) | (1L << (RAW_BYTE_STRING_LITERAL - 69)) | (1L << (INTEGER_LITERAL - 69)) | (1L << (FLOAT_LITERAL - 69)) | (1L << (MINUS - 69)) | (1L << (AND - 69)) | (1L << (OR - 69)) | (1L << (ANDAND - 69)) | (1L << (LT - 69)) | (1L << (UNDERSCORE - 69)) | (1L << (DOTDOT - 69)) | (1L << (PATHSEP - 69)) | (1L << (LSQUAREBRACKET - 69)) | (1L << (LPAREN - 69)))) != 0)) {
				{
				setState(2025);
				slicePatternItems();
				}
			}

			setState(2028);
			match(RSQUAREBRACKET);
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

	public static class SlicePatternItemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public SlicePatternItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicePatternItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSlicePatternItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSlicePatternItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSlicePatternItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicePatternItemsContext slicePatternItems() throws RecognitionException {
		SlicePatternItemsContext _localctx = new SlicePatternItemsContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_slicePatternItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			pattern();
			setState(2035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2031);
					match(COMMA);
					setState(2032);
					pattern();
					}
					} 
				}
				setState(2037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			setState(2039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2038);
				match(COMMA);
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

	public static class PathPatternContext extends ParserRuleContext {
		public PathInExpressionContext pathInExpression() {
			return getRuleContext(PathInExpressionContext.class,0);
		}
		public QualifiedPathInExpressionContext qualifiedPathInExpression() {
			return getRuleContext(QualifiedPathInExpressionContext.class,0);
		}
		public PathPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathPatternContext pathPattern() throws RecognitionException {
		PathPatternContext _localctx = new PathPatternContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_pathPattern);
		try {
			setState(2043);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				pathInExpression();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				qualifiedPathInExpression();
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

	public static class Type_Context extends ParserRuleContext {
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public ImplTraitTypeContext implTraitType() {
			return getRuleContext(ImplTraitTypeContext.class,0);
		}
		public TraitObjectTypeContext traitObjectType() {
			return getRuleContext(TraitObjectTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 286, RULE_type_);
		try {
			setState(2048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2045);
				typeNoBounds();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2046);
				implTraitType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2047);
				traitObjectType();
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

	public static class TypeNoBoundsContext extends ParserRuleContext {
		public ParenthesizedTypeContext parenthesizedType() {
			return getRuleContext(ParenthesizedTypeContext.class,0);
		}
		public ImplTraitTypeOneBoundContext implTraitTypeOneBound() {
			return getRuleContext(ImplTraitTypeOneBoundContext.class,0);
		}
		public TraitObjectTypeOneBoundContext traitObjectTypeOneBound() {
			return getRuleContext(TraitObjectTypeOneBoundContext.class,0);
		}
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public NeverTypeContext neverType() {
			return getRuleContext(NeverTypeContext.class,0);
		}
		public RawPointerTypeContext rawPointerType() {
			return getRuleContext(RawPointerTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public SliceTypeContext sliceType() {
			return getRuleContext(SliceTypeContext.class,0);
		}
		public InferredTypeContext inferredType() {
			return getRuleContext(InferredTypeContext.class,0);
		}
		public QualifiedPathInTypeContext qualifiedPathInType() {
			return getRuleContext(QualifiedPathInTypeContext.class,0);
		}
		public BareFunctionTypeContext bareFunctionType() {
			return getRuleContext(BareFunctionTypeContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public TypeNoBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNoBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeNoBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeNoBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeNoBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNoBoundsContext typeNoBounds() throws RecognitionException {
		TypeNoBoundsContext _localctx = new TypeNoBoundsContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_typeNoBounds);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2050);
				parenthesizedType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2051);
				implTraitTypeOneBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2052);
				traitObjectTypeOneBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2053);
				typePath();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2054);
				tupleType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2055);
				neverType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2056);
				rawPointerType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2057);
				referenceType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2058);
				arrayType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2059);
				sliceType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2060);
				inferredType();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2061);
				qualifiedPathInType();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2062);
				bareFunctionType();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2063);
				macroInvocation();
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

	public static class ParenthesizedTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ParenthesizedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitParenthesizedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitParenthesizedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedTypeContext parenthesizedType() throws RecognitionException {
		ParenthesizedTypeContext _localctx = new ParenthesizedTypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_parenthesizedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			match(LPAREN);
			setState(2067);
			type_();
			setState(2068);
			match(RPAREN);
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

	public static class NeverTypeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public NeverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterNeverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitNeverType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitNeverType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeverTypeContext neverType() throws RecognitionException {
		NeverTypeContext _localctx = new NeverTypeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_neverType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2070);
			match(NOT);
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

	public static class TupleTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTupleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTupleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_tupleType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			match(LPAREN);
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(2076); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2073);
						type_();
						setState(2074);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2078); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
					{
					setState(2080);
					type_();
					}
				}

				}
			}

			setState(2085);
			match(RPAREN);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			match(LSQUAREBRACKET);
			setState(2088);
			type_();
			setState(2089);
			match(SEMI);
			setState(2090);
			expression(0);
			setState(2091);
			match(RSQUAREBRACKET);
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

	public static class SliceTypeContext extends ParserRuleContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(RustParser.LSQUAREBRACKET, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(RustParser.RSQUAREBRACKET, 0); }
		public SliceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSliceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSliceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSliceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceTypeContext sliceType() throws RecognitionException {
		SliceTypeContext _localctx = new SliceTypeContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_sliceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(LSQUAREBRACKET);
			setState(2094);
			type_();
			setState(2095);
			match(RSQUAREBRACKET);
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_referenceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(AND);
			setState(2099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
				{
				setState(2098);
				lifetime();
				}
			}

			setState(2102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_MUT) {
				{
				setState(2101);
				match(KW_MUT);
				}
			}

			setState(2104);
			typeNoBounds();
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

	public static class RawPointerTypeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(RustParser.STAR, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public RawPointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawPointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterRawPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitRawPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitRawPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawPointerTypeContext rawPointerType() throws RecognitionException {
		RawPointerTypeContext _localctx = new RawPointerTypeContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_rawPointerType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			match(STAR);
			setState(2107);
			_la = _input.LA(1);
			if ( !(_la==KW_CONST || _la==KW_MUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2108);
			typeNoBounds();
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

	public static class BareFunctionTypeContext extends ParserRuleContext {
		public FunctionTypeQualifiersContext functionTypeQualifiers() {
			return getRuleContext(FunctionTypeQualifiersContext.class,0);
		}
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() {
			return getRuleContext(FunctionParametersMaybeNamedVariadicContext.class,0);
		}
		public BareFunctionReturnTypeContext bareFunctionReturnType() {
			return getRuleContext(BareFunctionReturnTypeContext.class,0);
		}
		public BareFunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionTypeContext bareFunctionType() throws RecognitionException {
		BareFunctionTypeContext _localctx = new BareFunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_bareFunctionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_FOR) {
				{
				setState(2110);
				forLifetimes();
				}
			}

			setState(2113);
			functionTypeQualifiers();
			setState(2114);
			match(KW_FN);
			setState(2115);
			match(LPAREN);
			setState(2117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (POUND - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(2116);
				functionParametersMaybeNamedVariadic();
				}
			}

			setState(2119);
			match(RPAREN);
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2120);
				bareFunctionReturnType();
				}
				break;
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

	public static class FunctionTypeQualifiersContext extends ParserRuleContext {
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public AbiContext abi() {
			return getRuleContext(AbiContext.class,0);
		}
		public FunctionTypeQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionTypeQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionTypeQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionTypeQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeQualifiersContext functionTypeQualifiers() throws RecognitionException {
		FunctionTypeQualifiersContext _localctx = new FunctionTypeQualifiersContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_functionTypeQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_UNSAFE) {
				{
				setState(2123);
				match(KW_UNSAFE);
				}
			}

			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_EXTERN) {
				{
				setState(2126);
				match(KW_EXTERN);
				setState(2128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL || _la==RAW_STRING_LITERAL) {
					{
					setState(2127);
					abi();
					}
				}

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

	public static class BareFunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TypeNoBoundsContext typeNoBounds() {
			return getRuleContext(TypeNoBoundsContext.class,0);
		}
		public BareFunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareFunctionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterBareFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitBareFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitBareFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BareFunctionReturnTypeContext bareFunctionReturnType() throws RecognitionException {
		BareFunctionReturnTypeContext _localctx = new BareFunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_bareFunctionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2132);
			match(RARROW);
			setState(2133);
			typeNoBounds();
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

	public static class FunctionParametersMaybeNamedVariadicContext extends ParserRuleContext {
		public MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() {
			return getRuleContext(MaybeNamedFunctionParametersContext.class,0);
		}
		public MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() {
			return getRuleContext(MaybeNamedFunctionParametersVariadicContext.class,0);
		}
		public FunctionParametersMaybeNamedVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParametersMaybeNamedVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitFunctionParametersMaybeNamedVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitFunctionParametersMaybeNamedVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersMaybeNamedVariadicContext functionParametersMaybeNamedVariadic() throws RecognitionException {
		FunctionParametersMaybeNamedVariadicContext _localctx = new FunctionParametersMaybeNamedVariadicContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_functionParametersMaybeNamedVariadic);
		try {
			setState(2137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
				maybeNamedFunctionParameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2136);
				maybeNamedFunctionParametersVariadic();
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

	public static class MaybeNamedFunctionParametersContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public MaybeNamedFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersContext maybeNamedFunctionParameters() throws RecognitionException {
		MaybeNamedFunctionParametersContext _localctx = new MaybeNamedFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_maybeNamedFunctionParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			maybeNamedParam();
			setState(2144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2140);
					match(COMMA);
					setState(2141);
					maybeNamedParam();
					}
					} 
				}
				setState(2146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			setState(2148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2147);
				match(COMMA);
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

	public static class MaybeNamedParamContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public MaybeNamedParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedParamContext maybeNamedParam() throws RecognitionException {
		MaybeNamedParamContext _localctx = new MaybeNamedParamContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_maybeNamedParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2150);
				outerAttribute();
				}
				}
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_MACRORULES:
				case NON_KEYWORD_IDENTIFIER:
				case RAW_IDENTIFIER:
					{
					setState(2156);
					identifier();
					}
					break;
				case UNDERSCORE:
					{
					setState(2157);
					match(UNDERSCORE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2160);
				match(COLON);
				}
				break;
			}
			setState(2163);
			type_();
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

	public static class MaybeNamedFunctionParametersVariadicContext extends ParserRuleContext {
		public List<MaybeNamedParamContext> maybeNamedParam() {
			return getRuleContexts(MaybeNamedParamContext.class);
		}
		public MaybeNamedParamContext maybeNamedParam(int i) {
			return getRuleContext(MaybeNamedParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public List<OuterAttributeContext> outerAttribute() {
			return getRuleContexts(OuterAttributeContext.class);
		}
		public OuterAttributeContext outerAttribute(int i) {
			return getRuleContext(OuterAttributeContext.class,i);
		}
		public MaybeNamedFunctionParametersVariadicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeNamedFunctionParametersVariadic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMaybeNamedFunctionParametersVariadic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMaybeNamedFunctionParametersVariadic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeNamedFunctionParametersVariadicContext maybeNamedFunctionParametersVariadic() throws RecognitionException {
		MaybeNamedFunctionParametersVariadicContext _localctx = new MaybeNamedFunctionParametersVariadicContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_maybeNamedFunctionParametersVariadic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2165);
					maybeNamedParam();
					setState(2166);
					match(COMMA);
					}
					} 
				}
				setState(2172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			setState(2173);
			maybeNamedParam();
			setState(2174);
			match(COMMA);
			setState(2178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POUND) {
				{
				{
				setState(2175);
				outerAttribute();
				}
				}
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2181);
			match(DOTDOTDOT);
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

	public static class TraitObjectTypeContext extends ParserRuleContext {
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TraitObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeContext traitObjectType() throws RecognitionException {
		TraitObjectTypeContext _localctx = new TraitObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_traitObjectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DYN) {
				{
				setState(2183);
				match(KW_DYN);
				}
			}

			setState(2186);
			typeParamBounds();
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

	public static class TraitObjectTypeOneBoundContext extends ParserRuleContext {
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TraitObjectTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitObjectTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitObjectTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitObjectTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitObjectTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitObjectTypeOneBoundContext traitObjectTypeOneBound() throws RecognitionException {
		TraitObjectTypeOneBoundContext _localctx = new TraitObjectTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_traitObjectTypeOneBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_DYN) {
				{
				setState(2188);
				match(KW_DYN);
				}
			}

			setState(2191);
			traitBound();
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

	public static class ImplTraitTypeContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TypeParamBoundsContext typeParamBounds() {
			return getRuleContext(TypeParamBoundsContext.class,0);
		}
		public ImplTraitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeContext implTraitType() throws RecognitionException {
		ImplTraitTypeContext _localctx = new ImplTraitTypeContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_implTraitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(KW_IMPL);
			setState(2194);
			typeParamBounds();
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

	public static class ImplTraitTypeOneBoundContext extends ParserRuleContext {
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public ImplTraitTypeOneBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implTraitTypeOneBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterImplTraitTypeOneBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitImplTraitTypeOneBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitImplTraitTypeOneBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplTraitTypeOneBoundContext implTraitTypeOneBound() throws RecognitionException {
		ImplTraitTypeOneBoundContext _localctx = new ImplTraitTypeOneBoundContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_implTraitTypeOneBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			match(KW_IMPL);
			setState(2197);
			traitBound();
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

	public static class InferredTypeContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public InferredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterInferredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitInferredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitInferredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferredTypeContext inferredType() throws RecognitionException {
		InferredTypeContext _localctx = new InferredTypeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_inferredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(UNDERSCORE);
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

	public static class TypeParamBoundsContext extends ParserRuleContext {
		public List<TypeParamBoundContext> typeParamBound() {
			return getRuleContexts(TypeParamBoundContext.class);
		}
		public TypeParamBoundContext typeParamBound(int i) {
			return getRuleContext(TypeParamBoundContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public TypeParamBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundsContext typeParamBounds() throws RecognitionException {
		TypeParamBoundsContext _localctx = new TypeParamBoundsContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_typeParamBounds);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			typeParamBound();
			setState(2206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2202);
					match(PLUS);
					setState(2203);
					typeParamBound();
					}
					} 
				}
				setState(2208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			setState(2210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2209);
				match(PLUS);
				}
				break;
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

	public static class TypeParamBoundContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public TraitBoundContext traitBound() {
			return getRuleContext(TraitBoundContext.class,0);
		}
		public TypeParamBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypeParamBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypeParamBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypeParamBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundContext typeParamBound() throws RecognitionException {
		TypeParamBoundContext _localctx = new TypeParamBoundContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_typeParamBound);
		try {
			setState(2214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STATICLIFETIME:
			case KW_UNDERLINELIFETIME:
			case LIFETIME_OR_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2212);
				lifetime();
				}
				break;
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
			case QUESTION:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2213);
				traitBound();
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

	public static class TraitBoundContext extends ParserRuleContext {
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(RustParser.QUESTION, 0); }
		public ForLifetimesContext forLifetimes() {
			return getRuleContext(ForLifetimesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TraitBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTraitBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTraitBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTraitBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitBoundContext traitBound() throws RecognitionException {
		TraitBoundContext _localctx = new TraitBoundContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_traitBound);
		int _la;
		try {
			setState(2233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_CRATE:
			case KW_FOR:
			case KW_SELFVALUE:
			case KW_SELFTYPE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
			case PATHSEP:
			case QUESTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2216);
					match(QUESTION);
					}
				}

				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2219);
					forLifetimes();
					}
				}

				setState(2222);
				typePath();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				match(LPAREN);
				setState(2225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(2224);
					match(QUESTION);
					}
				}

				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_FOR) {
					{
					setState(2227);
					forLifetimes();
					}
				}

				setState(2230);
				typePath();
				setState(2231);
				match(RPAREN);
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

	public static class LifetimeBoundsContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RustParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RustParser.PLUS, i);
		}
		public LifetimeBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetimeBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetimeBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetimeBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetimeBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeBoundsContext lifetimeBounds() throws RecognitionException {
		LifetimeBoundsContext _localctx = new LifetimeBoundsContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_lifetimeBounds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2235);
					lifetime();
					setState(2236);
					match(PLUS);
					}
					} 
				}
				setState(2242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			}
			setState(2244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) {
				{
				setState(2243);
				lifetime();
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

	public static class LifetimeContext extends ParserRuleContext {
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public LifetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lifetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterLifetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitLifetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitLifetime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LifetimeContext lifetime() throws RecognitionException {
		LifetimeContext _localctx = new LifetimeContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_lifetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2246);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (KW_STATICLIFETIME - 53)) | (1L << (KW_UNDERLINELIFETIME - 53)) | (1L << (LIFETIME_OR_LABEL - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SimplePathContext extends ParserRuleContext {
		public List<SimplePathSegmentContext> simplePathSegment() {
			return getRuleContexts(SimplePathSegmentContext.class);
		}
		public SimplePathSegmentContext simplePathSegment(int i) {
			return getRuleContext(SimplePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public SimplePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathContext simplePath() throws RecognitionException {
		SimplePathContext _localctx = new SimplePathContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_simplePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2248);
				match(PATHSEP);
				}
			}

			setState(2251);
			simplePathSegment();
			setState(2256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2252);
					match(PATHSEP);
					setState(2253);
					simplePathSegment();
					}
					} 
				}
				setState(2258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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

	public static class SimplePathSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public SimplePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterSimplePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitSimplePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitSimplePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimplePathSegmentContext simplePathSegment() throws RecognitionException {
		SimplePathSegmentContext _localctx = new SimplePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_simplePathSegment);
		try {
			setState(2264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2259);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2261);
				match(KW_SELFVALUE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2262);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2263);
				match(KW_DOLLARCRATE);
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

	public static class PathInExpressionContext extends ParserRuleContext {
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public PathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathInExpressionContext pathInExpression() throws RecognitionException {
		PathInExpressionContext _localctx = new PathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_pathInExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2266);
				match(PATHSEP);
				}
			}

			setState(2269);
			pathExprSegment();
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2270);
					match(PATHSEP);
					setState(2271);
					pathExprSegment();
					}
					} 
				}
				setState(2276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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

	public static class PathExprSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public PathExprSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExprSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathExprSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathExprSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathExprSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathExprSegmentContext pathExprSegment() throws RecognitionException {
		PathExprSegmentContext _localctx = new PathExprSegmentContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_pathExprSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			pathIdentSegment();
			setState(2280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2278);
				match(PATHSEP);
				setState(2279);
				genericArgs();
				}
				break;
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

	public static class PathIdentSegmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public PathIdentSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathIdentSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterPathIdentSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitPathIdentSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitPathIdentSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathIdentSegmentContext pathIdentSegment() throws RecognitionException {
		PathIdentSegmentContext _localctx = new PathIdentSegmentContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_pathIdentSegment);
		try {
			setState(2288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_MACRORULES:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2282);
				identifier();
				}
				break;
			case KW_SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2283);
				match(KW_SUPER);
				}
				break;
			case KW_SELFVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2284);
				match(KW_SELFVALUE);
				}
				break;
			case KW_SELFTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2285);
				match(KW_SELFTYPE);
				}
				break;
			case KW_CRATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(2286);
				match(KW_CRATE);
				}
				break;
			case KW_DOLLARCRATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2287);
				match(KW_DOLLARCRATE);
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

	public static class GenericArgsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public GenericArgsLifetimesContext genericArgsLifetimes() {
			return getRuleContext(GenericArgsLifetimesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext genericArgsTypes() {
			return getRuleContext(GenericArgsTypesContext.class,0);
		}
		public GenericArgsBindingsContext genericArgsBindings() {
			return getRuleContext(GenericArgsBindingsContext.class,0);
		}
		public List<GenericArgContext> genericArg() {
			return getRuleContexts(GenericArgContext.class);
		}
		public GenericArgContext genericArg(int i) {
			return getRuleContext(GenericArgContext.class,i);
		}
		public GenericArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsContext genericArgs() throws RecognitionException {
		GenericArgsContext _localctx = new GenericArgsContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_genericArgs);
		int _la;
		try {
			int _alt;
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2290);
				match(LT);
				setState(2291);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2292);
				match(LT);
				setState(2293);
				genericArgsLifetimes();
				setState(2296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2294);
					match(COMMA);
					setState(2295);
					genericArgsTypes();
					}
					break;
				}
				setState(2300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2298);
					match(COMMA);
					setState(2299);
					genericArgsBindings();
					}
					break;
				}
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2302);
					match(COMMA);
					}
				}

				setState(2305);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2307);
				match(LT);
				setState(2308);
				genericArgsTypes();
				setState(2311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2309);
					match(COMMA);
					setState(2310);
					genericArgsBindings();
					}
					break;
				}
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2313);
					match(COMMA);
					}
				}

				setState(2316);
				match(GT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2318);
				match(LT);
				setState(2324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2319);
						genericArg();
						setState(2320);
						match(COMMA);
						}
						} 
					}
					setState(2326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,322,_ctx);
				}
				setState(2327);
				genericArg();
				setState(2329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2328);
					match(COMMA);
					}
				}

				setState(2331);
				match(GT);
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

	public static class GenericArgContext extends ParserRuleContext {
		public LifetimeContext lifetime() {
			return getRuleContext(LifetimeContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public GenericArgsConstContext genericArgsConst() {
			return getRuleContext(GenericArgsConstContext.class,0);
		}
		public GenericArgsBindingContext genericArgsBinding() {
			return getRuleContext(GenericArgsBindingContext.class,0);
		}
		public GenericArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgContext genericArg() throws RecognitionException {
		GenericArgContext _localctx = new GenericArgContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_genericArg);
		try {
			setState(2339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				lifetime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2336);
				type_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2337);
				genericArgsConst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2338);
				genericArgsBinding();
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

	public static class GenericArgsConstContext extends ParserRuleContext {
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public SimplePathSegmentContext simplePathSegment() {
			return getRuleContext(SimplePathSegmentContext.class,0);
		}
		public GenericArgsConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsConstContext genericArgsConst() throws RecognitionException {
		GenericArgsConstContext _localctx = new GenericArgsConstContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_genericArgsConst);
		int _la;
		try {
			setState(2347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURLYBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2341);
				blockExpression();
				}
				break;
			case KW_FALSE:
			case KW_TRUE:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case BYTE_LITERAL:
			case BYTE_STRING_LITERAL:
			case RAW_BYTE_STRING_LITERAL:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2342);
					match(MINUS);
					}
				}

				setState(2345);
				literalExpression();
				}
				break;
			case KW_CRATE:
			case KW_SELFVALUE:
			case KW_SUPER:
			case KW_MACRORULES:
			case KW_DOLLARCRATE:
			case NON_KEYWORD_IDENTIFIER:
			case RAW_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2346);
				simplePathSegment();
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

	public static class GenericArgsLifetimesContext extends ParserRuleContext {
		public List<LifetimeContext> lifetime() {
			return getRuleContexts(LifetimeContext.class);
		}
		public LifetimeContext lifetime(int i) {
			return getRuleContext(LifetimeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsLifetimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsLifetimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsLifetimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsLifetimes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsLifetimes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsLifetimesContext genericArgsLifetimes() throws RecognitionException {
		GenericArgsLifetimesContext _localctx = new GenericArgsLifetimesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_genericArgsLifetimes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			lifetime();
			setState(2354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2350);
					match(COMMA);
					setState(2351);
					lifetime();
					}
					} 
				}
				setState(2356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
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

	public static class GenericArgsTypesContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsTypesContext genericArgsTypes() throws RecognitionException {
		GenericArgsTypesContext _localctx = new GenericArgsTypesContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_genericArgsTypes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			type_();
			setState(2362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2358);
					match(COMMA);
					setState(2359);
					type_();
					}
					} 
				}
				setState(2364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,329,_ctx);
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

	public static class GenericArgsBindingsContext extends ParserRuleContext {
		public List<GenericArgsBindingContext> genericArgsBinding() {
			return getRuleContexts(GenericArgsBindingContext.class);
		}
		public GenericArgsBindingContext genericArgsBinding(int i) {
			return getRuleContext(GenericArgsBindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public GenericArgsBindingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBindings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBindings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBindings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBindings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingsContext genericArgsBindings() throws RecognitionException {
		GenericArgsBindingsContext _localctx = new GenericArgsBindingsContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_genericArgsBindings);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			genericArgsBinding();
			setState(2370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2366);
					match(COMMA);
					setState(2367);
					genericArgsBinding();
					}
					} 
				}
				setState(2372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
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

	public static class GenericArgsBindingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public GenericArgsBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgsBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterGenericArgsBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitGenericArgsBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitGenericArgsBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgsBindingContext genericArgsBinding() throws RecognitionException {
		GenericArgsBindingContext _localctx = new GenericArgsBindingContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_genericArgsBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			identifier();
			setState(2374);
			match(EQ);
			setState(2375);
			type_();
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

	public static class QualifiedPathInExpressionContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<PathExprSegmentContext> pathExprSegment() {
			return getRuleContexts(PathExprSegmentContext.class);
		}
		public PathExprSegmentContext pathExprSegment(int i) {
			return getRuleContext(PathExprSegmentContext.class,i);
		}
		public QualifiedPathInExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInExpressionContext qualifiedPathInExpression() throws RecognitionException {
		QualifiedPathInExpressionContext _localctx = new QualifiedPathInExpressionContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_qualifiedPathInExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			qualifiedPathType();
			setState(2380); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2378);
					match(PATHSEP);
					setState(2379);
					pathExprSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2382); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
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

	public static class QualifiedPathTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TypePathContext typePath() {
			return getRuleContext(TypePathContext.class,0);
		}
		public QualifiedPathTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathTypeContext qualifiedPathType() throws RecognitionException {
		QualifiedPathTypeContext _localctx = new QualifiedPathTypeContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_qualifiedPathType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			match(LT);
			setState(2385);
			type_();
			setState(2388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_AS) {
				{
				setState(2386);
				match(KW_AS);
				setState(2387);
				typePath();
				}
			}

			setState(2390);
			match(GT);
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

	public static class QualifiedPathInTypeContext extends ParserRuleContext {
		public QualifiedPathTypeContext qualifiedPathType() {
			return getRuleContext(QualifiedPathTypeContext.class,0);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public QualifiedPathInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPathInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterQualifiedPathInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitQualifiedPathInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitQualifiedPathInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPathInTypeContext qualifiedPathInType() throws RecognitionException {
		QualifiedPathInTypeContext _localctx = new QualifiedPathInTypeContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_qualifiedPathInType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2392);
			qualifiedPathType();
			setState(2395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2393);
					match(PATHSEP);
					setState(2394);
					typePathSegment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,333,_ctx);
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

	public static class TypePathContext extends ParserRuleContext {
		public List<TypePathSegmentContext> typePathSegment() {
			return getRuleContexts(TypePathSegmentContext.class);
		}
		public TypePathSegmentContext typePathSegment(int i) {
			return getRuleContext(TypePathSegmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(RustParser.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(RustParser.PATHSEP, i);
		}
		public TypePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathContext typePath() throws RecognitionException {
		TypePathContext _localctx = new TypePathContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_typePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATHSEP) {
				{
				setState(2399);
				match(PATHSEP);
				}
			}

			setState(2402);
			typePathSegment();
			setState(2407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2403);
					match(PATHSEP);
					setState(2404);
					typePathSegment();
					}
					} 
				}
				setState(2409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
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

	public static class TypePathSegmentContext extends ParserRuleContext {
		public PathIdentSegmentContext pathIdentSegment() {
			return getRuleContext(PathIdentSegmentContext.class,0);
		}
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public GenericArgsContext genericArgs() {
			return getRuleContext(GenericArgsContext.class,0);
		}
		public TypePathFnContext typePathFn() {
			return getRuleContext(TypePathFnContext.class,0);
		}
		public TypePathSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathSegmentContext typePathSegment() throws RecognitionException {
		TypePathSegmentContext _localctx = new TypePathSegmentContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_typePathSegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2410);
			pathIdentSegment();
			setState(2412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2411);
				match(PATHSEP);
				}
				break;
			}
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2414);
				genericArgs();
				}
				break;
			case 2:
				{
				setState(2415);
				typePathFn();
				}
				break;
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

	public static class TypePathFnContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TypePathInputsContext typePathInputs() {
			return getRuleContext(TypePathInputsContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TypePathFnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathFn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathFn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathFn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathFnContext typePathFn() throws RecognitionException {
		TypePathFnContext _localctx = new TypePathFnContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_typePathFn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(LPAREN);
			setState(2420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_CRATE) | (1L << KW_EXTERN) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IMPL) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_SUPER) | (1L << KW_UNSAFE) | (1L << KW_DYN) | (1L << KW_STATICLIFETIME) | (1L << KW_MACRORULES) | (1L << KW_UNDERLINELIFETIME) | (1L << KW_DOLLARCRATE) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (LIFETIME_OR_LABEL - 81)) | (1L << (STAR - 81)) | (1L << (NOT - 81)) | (1L << (AND - 81)) | (1L << (LT - 81)) | (1L << (UNDERSCORE - 81)) | (1L << (PATHSEP - 81)) | (1L << (QUESTION - 81)) | (1L << (LSQUAREBRACKET - 81)) | (1L << (LPAREN - 81)))) != 0)) {
				{
				setState(2419);
				typePathInputs();
				}
			}

			setState(2422);
			match(RPAREN);
			setState(2425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,339,_ctx) ) {
			case 1:
				{
				setState(2423);
				match(RARROW);
				setState(2424);
				type_();
				}
				break;
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

	public static class TypePathInputsContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(RustParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RustParser.COMMA, i);
		}
		public TypePathInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePathInputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterTypePathInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitTypePathInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitTypePathInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePathInputsContext typePathInputs() throws RecognitionException {
		TypePathInputsContext _localctx = new TypePathInputsContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_typePathInputs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			type_();
			setState(2432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2428);
					match(COMMA);
					setState(2429);
					type_();
					}
					} 
				}
				setState(2434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			}
			setState(2436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2435);
				match(COMMA);
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

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode LPAREN() { return getToken(RustParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RustParser.RPAREN, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public SimplePathContext simplePath() {
			return getRuleContext(SimplePathContext.class,0);
		}
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitVisibility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitVisibility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_visibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			match(KW_PUB);
			setState(2448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2439);
				match(LPAREN);
				setState(2445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_CRATE:
					{
					setState(2440);
					match(KW_CRATE);
					}
					break;
				case KW_SELFVALUE:
					{
					setState(2441);
					match(KW_SELFVALUE);
					}
					break;
				case KW_SUPER:
					{
					setState(2442);
					match(KW_SUPER);
					}
					break;
				case KW_IN:
					{
					setState(2443);
					match(KW_IN);
					setState(2444);
					simplePath();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2447);
				match(RPAREN);
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NON_KEYWORD_IDENTIFIER() { return getToken(RustParser.NON_KEYWORD_IDENTIFIER, 0); }
		public TerminalNode RAW_IDENTIFIER() { return getToken(RustParser.RAW_IDENTIFIER, 0); }
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_MACRORULES) | (1L << NON_KEYWORD_IDENTIFIER) | (1L << RAW_IDENTIFIER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode KW_AS() { return getToken(RustParser.KW_AS, 0); }
		public TerminalNode KW_BREAK() { return getToken(RustParser.KW_BREAK, 0); }
		public TerminalNode KW_CONST() { return getToken(RustParser.KW_CONST, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(RustParser.KW_CONTINUE, 0); }
		public TerminalNode KW_CRATE() { return getToken(RustParser.KW_CRATE, 0); }
		public TerminalNode KW_ELSE() { return getToken(RustParser.KW_ELSE, 0); }
		public TerminalNode KW_ENUM() { return getToken(RustParser.KW_ENUM, 0); }
		public TerminalNode KW_EXTERN() { return getToken(RustParser.KW_EXTERN, 0); }
		public TerminalNode KW_FALSE() { return getToken(RustParser.KW_FALSE, 0); }
		public TerminalNode KW_FN() { return getToken(RustParser.KW_FN, 0); }
		public TerminalNode KW_FOR() { return getToken(RustParser.KW_FOR, 0); }
		public TerminalNode KW_IF() { return getToken(RustParser.KW_IF, 0); }
		public TerminalNode KW_IMPL() { return getToken(RustParser.KW_IMPL, 0); }
		public TerminalNode KW_IN() { return getToken(RustParser.KW_IN, 0); }
		public TerminalNode KW_LET() { return getToken(RustParser.KW_LET, 0); }
		public TerminalNode KW_LOOP() { return getToken(RustParser.KW_LOOP, 0); }
		public TerminalNode KW_MATCH() { return getToken(RustParser.KW_MATCH, 0); }
		public TerminalNode KW_MOD() { return getToken(RustParser.KW_MOD, 0); }
		public TerminalNode KW_MOVE() { return getToken(RustParser.KW_MOVE, 0); }
		public TerminalNode KW_MUT() { return getToken(RustParser.KW_MUT, 0); }
		public TerminalNode KW_PUB() { return getToken(RustParser.KW_PUB, 0); }
		public TerminalNode KW_REF() { return getToken(RustParser.KW_REF, 0); }
		public TerminalNode KW_RETURN() { return getToken(RustParser.KW_RETURN, 0); }
		public TerminalNode KW_SELFVALUE() { return getToken(RustParser.KW_SELFVALUE, 0); }
		public TerminalNode KW_SELFTYPE() { return getToken(RustParser.KW_SELFTYPE, 0); }
		public TerminalNode KW_STATIC() { return getToken(RustParser.KW_STATIC, 0); }
		public TerminalNode KW_STRUCT() { return getToken(RustParser.KW_STRUCT, 0); }
		public TerminalNode KW_SUPER() { return getToken(RustParser.KW_SUPER, 0); }
		public TerminalNode KW_TRAIT() { return getToken(RustParser.KW_TRAIT, 0); }
		public TerminalNode KW_TRUE() { return getToken(RustParser.KW_TRUE, 0); }
		public TerminalNode KW_TYPE() { return getToken(RustParser.KW_TYPE, 0); }
		public TerminalNode KW_UNSAFE() { return getToken(RustParser.KW_UNSAFE, 0); }
		public TerminalNode KW_USE() { return getToken(RustParser.KW_USE, 0); }
		public TerminalNode KW_WHERE() { return getToken(RustParser.KW_WHERE, 0); }
		public TerminalNode KW_WHILE() { return getToken(RustParser.KW_WHILE, 0); }
		public TerminalNode KW_ASYNC() { return getToken(RustParser.KW_ASYNC, 0); }
		public TerminalNode KW_AWAIT() { return getToken(RustParser.KW_AWAIT, 0); }
		public TerminalNode KW_DYN() { return getToken(RustParser.KW_DYN, 0); }
		public TerminalNode KW_ABSTRACT() { return getToken(RustParser.KW_ABSTRACT, 0); }
		public TerminalNode KW_BECOME() { return getToken(RustParser.KW_BECOME, 0); }
		public TerminalNode KW_BOX() { return getToken(RustParser.KW_BOX, 0); }
		public TerminalNode KW_DO() { return getToken(RustParser.KW_DO, 0); }
		public TerminalNode KW_FINAL() { return getToken(RustParser.KW_FINAL, 0); }
		public TerminalNode KW_MACRO() { return getToken(RustParser.KW_MACRO, 0); }
		public TerminalNode KW_OVERRIDE() { return getToken(RustParser.KW_OVERRIDE, 0); }
		public TerminalNode KW_PRIV() { return getToken(RustParser.KW_PRIV, 0); }
		public TerminalNode KW_TYPEOF() { return getToken(RustParser.KW_TYPEOF, 0); }
		public TerminalNode KW_UNSIZED() { return getToken(RustParser.KW_UNSIZED, 0); }
		public TerminalNode KW_VIRTUAL() { return getToken(RustParser.KW_VIRTUAL, 0); }
		public TerminalNode KW_YIELD() { return getToken(RustParser.KW_YIELD, 0); }
		public TerminalNode KW_TRY() { return getToken(RustParser.KW_TRY, 0); }
		public TerminalNode KW_UNION() { return getToken(RustParser.KW_UNION, 0); }
		public TerminalNode KW_STATICLIFETIME() { return getToken(RustParser.KW_STATICLIFETIME, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_AS) | (1L << KW_BREAK) | (1L << KW_CONST) | (1L << KW_CONTINUE) | (1L << KW_CRATE) | (1L << KW_ELSE) | (1L << KW_ENUM) | (1L << KW_EXTERN) | (1L << KW_FALSE) | (1L << KW_FN) | (1L << KW_FOR) | (1L << KW_IF) | (1L << KW_IMPL) | (1L << KW_IN) | (1L << KW_LET) | (1L << KW_LOOP) | (1L << KW_MATCH) | (1L << KW_MOD) | (1L << KW_MOVE) | (1L << KW_MUT) | (1L << KW_PUB) | (1L << KW_REF) | (1L << KW_RETURN) | (1L << KW_SELFVALUE) | (1L << KW_SELFTYPE) | (1L << KW_STATIC) | (1L << KW_STRUCT) | (1L << KW_SUPER) | (1L << KW_TRAIT) | (1L << KW_TRUE) | (1L << KW_TYPE) | (1L << KW_UNSAFE) | (1L << KW_USE) | (1L << KW_WHERE) | (1L << KW_WHILE) | (1L << KW_ASYNC) | (1L << KW_AWAIT) | (1L << KW_DYN) | (1L << KW_ABSTRACT) | (1L << KW_BECOME) | (1L << KW_BOX) | (1L << KW_DO) | (1L << KW_FINAL) | (1L << KW_MACRO) | (1L << KW_OVERRIDE) | (1L << KW_PRIV) | (1L << KW_TYPEOF) | (1L << KW_UNSIZED) | (1L << KW_VIRTUAL) | (1L << KW_YIELD) | (1L << KW_TRY) | (1L << KW_UNION) | (1L << KW_STATICLIFETIME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MacroIdentifierLikeTokenContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode KW_MACRORULES() { return getToken(RustParser.KW_MACRORULES, 0); }
		public TerminalNode KW_UNDERLINELIFETIME() { return getToken(RustParser.KW_UNDERLINELIFETIME, 0); }
		public TerminalNode KW_DOLLARCRATE() { return getToken(RustParser.KW_DOLLARCRATE, 0); }
		public TerminalNode LIFETIME_OR_LABEL() { return getToken(RustParser.LIFETIME_OR_LABEL, 0); }
		public MacroIdentifierLikeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroIdentifierLikeToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroIdentifierLikeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroIdentifierLikeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroIdentifierLikeToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroIdentifierLikeTokenContext macroIdentifierLikeToken() throws RecognitionException {
		MacroIdentifierLikeTokenContext _localctx = new MacroIdentifierLikeTokenContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_macroIdentifierLikeToken);
		try {
			setState(2460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2454);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2455);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2456);
				match(KW_MACRORULES);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2457);
				match(KW_UNDERLINELIFETIME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2458);
				match(KW_DOLLARCRATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2459);
				match(LIFETIME_OR_LABEL);
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

	public static class MacroLiteralTokenContext extends ParserRuleContext {
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public MacroLiteralTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroLiteralToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroLiteralToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroLiteralToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroLiteralToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroLiteralTokenContext macroLiteralToken() throws RecognitionException {
		MacroLiteralTokenContext _localctx = new MacroLiteralTokenContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_macroLiteralToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			literalExpression();
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

	public static class MacroPunctuationTokenContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(RustParser.MINUS, 0); }
		public TerminalNode SLASH() { return getToken(RustParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(RustParser.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(RustParser.CARET, 0); }
		public TerminalNode NOT() { return getToken(RustParser.NOT, 0); }
		public TerminalNode AND() { return getToken(RustParser.AND, 0); }
		public TerminalNode OR() { return getToken(RustParser.OR, 0); }
		public TerminalNode ANDAND() { return getToken(RustParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(RustParser.OROR, 0); }
		public TerminalNode PLUSEQ() { return getToken(RustParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(RustParser.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(RustParser.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(RustParser.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(RustParser.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(RustParser.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(RustParser.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(RustParser.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(RustParser.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(RustParser.SHREQ, 0); }
		public TerminalNode EQ() { return getToken(RustParser.EQ, 0); }
		public TerminalNode EQEQ() { return getToken(RustParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(RustParser.NE, 0); }
		public TerminalNode GT() { return getToken(RustParser.GT, 0); }
		public TerminalNode LT() { return getToken(RustParser.LT, 0); }
		public TerminalNode GE() { return getToken(RustParser.GE, 0); }
		public TerminalNode LE() { return getToken(RustParser.LE, 0); }
		public TerminalNode AT() { return getToken(RustParser.AT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(RustParser.UNDERSCORE, 0); }
		public TerminalNode DOT() { return getToken(RustParser.DOT, 0); }
		public TerminalNode DOTDOT() { return getToken(RustParser.DOTDOT, 0); }
		public TerminalNode DOTDOTDOT() { return getToken(RustParser.DOTDOTDOT, 0); }
		public TerminalNode DOTDOTEQ() { return getToken(RustParser.DOTDOTEQ, 0); }
		public TerminalNode COMMA() { return getToken(RustParser.COMMA, 0); }
		public TerminalNode SEMI() { return getToken(RustParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(RustParser.COLON, 0); }
		public TerminalNode PATHSEP() { return getToken(RustParser.PATHSEP, 0); }
		public TerminalNode RARROW() { return getToken(RustParser.RARROW, 0); }
		public TerminalNode FATARROW() { return getToken(RustParser.FATARROW, 0); }
		public TerminalNode POUND() { return getToken(RustParser.POUND, 0); }
		public MacroPunctuationTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroPunctuationToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterMacroPunctuationToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitMacroPunctuationToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitMacroPunctuationToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacroPunctuationTokenContext macroPunctuationToken() throws RecognitionException {
		MacroPunctuationTokenContext _localctx = new MacroPunctuationTokenContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_macroPunctuationToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MINUS - 83)) | (1L << (SLASH - 83)) | (1L << (PERCENT - 83)) | (1L << (CARET - 83)) | (1L << (NOT - 83)) | (1L << (AND - 83)) | (1L << (OR - 83)) | (1L << (ANDAND - 83)) | (1L << (OROR - 83)) | (1L << (PLUSEQ - 83)) | (1L << (MINUSEQ - 83)) | (1L << (STAREQ - 83)) | (1L << (SLASHEQ - 83)) | (1L << (PERCENTEQ - 83)) | (1L << (CARETEQ - 83)) | (1L << (ANDEQ - 83)) | (1L << (OREQ - 83)) | (1L << (SHLEQ - 83)) | (1L << (SHREQ - 83)) | (1L << (EQ - 83)) | (1L << (EQEQ - 83)) | (1L << (NE - 83)) | (1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (GE - 83)) | (1L << (LE - 83)) | (1L << (AT - 83)) | (1L << (UNDERSCORE - 83)) | (1L << (DOT - 83)) | (1L << (DOTDOT - 83)) | (1L << (DOTDOTDOT - 83)) | (1L << (DOTDOTEQ - 83)) | (1L << (COMMA - 83)) | (1L << (SEMI - 83)) | (1L << (COLON - 83)) | (1L << (PATHSEP - 83)) | (1L << (RARROW - 83)) | (1L << (FATARROW - 83)) | (1L << (POUND - 83)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ShlContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(RustParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RustParser.LT, i);
		}
		public ShlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShlContext shl() throws RecognitionException {
		ShlContext _localctx = new ShlContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_shl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			match(LT);
			setState(2467);
			if (!(this.next('<'))) throw new FailedPredicateException(this, "this.next('<')");
			setState(2468);
			match(LT);
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

	public static class ShrContext extends ParserRuleContext {
		public List<TerminalNode> GT() { return getTokens(RustParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RustParser.GT, i);
		}
		public ShrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).enterShr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RustParserListener ) ((RustParserListener)listener).exitShr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RustParserVisitor ) return ((RustParserVisitor<? extends T>)visitor).visitShr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShrContext shr() throws RecognitionException {
		ShrContext _localctx = new ShrContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_shr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			match(GT);
			setState(2471);
			if (!(this.next('>'))) throw new FailedPredicateException(this, "this.next('>')");
			setState(2472);
			match(GT);
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
		case 77:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 194:
			return shl_sempred((ShlContext)_localctx, predIndex);
		case 195:
			return shr_sempred((ShrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 37);
		case 13:
			return precpred(_ctx, 36);
		case 14:
			return precpred(_ctx, 35);
		case 15:
			return precpred(_ctx, 34);
		case 16:
			return precpred(_ctx, 33);
		case 17:
			return precpred(_ctx, 32);
		case 18:
			return precpred(_ctx, 31);
		case 19:
			return precpred(_ctx, 27);
		case 20:
			return precpred(_ctx, 17);
		}
		return true;
	}
	private boolean shl_sempred(ShlContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return this.next('<');
		}
		return true;
	}
	private boolean shr_sempred(ShrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return this.next('>');
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084\u09ad\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\3\2\7\2\u018c\n\2\f\2\16\2\u018f\13\2\3\2\7\2"+
		"\u0192\n\2\f\2\16\2\u0195\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\7\4\u019f"+
		"\n\4\f\4\16\4\u01a2\13\4\3\4\3\4\3\4\7\4\u01a7\n\4\f\4\16\4\u01aa\13\4"+
		"\3\4\3\4\3\4\7\4\u01af\n\4\f\4\16\4\u01b2\13\4\3\4\5\4\u01b5\n\4\3\5\6"+
		"\5\u01b8\n\5\r\5\16\5\u01b9\3\5\5\5\u01bd\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u01c4\n\6\3\7\3\7\3\7\3\7\7\7\u01ca\n\7\f\7\16\7\u01cd\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u01d6\n\7\f\7\16\7\u01d9\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u01e2\n\7\f\7\16\7\u01e5\13\7\3\7\3\7\5\7\u01e9\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u01fe\n\t\3\n\3\n\3\n\7\n\u0203\n\n\f\n\16\n\u0206\13\n\3\n\5\n"+
		"\u0209\n\n\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0211\n\f\f\f\16\f\u0214\13"+
		"\f\3\f\3\f\3\f\7\f\u0219\n\f\f\f\16\f\u021c\13\f\3\f\3\f\3\f\7\f\u0221"+
		"\n\f\f\f\16\f\u0224\13\f\3\f\5\f\u0227\n\f\3\r\6\r\u022a\n\r\r\r\16\r"+
		"\u022b\3\r\3\r\3\r\3\r\5\r\u0232\n\r\3\r\3\r\3\r\3\r\3\r\6\r\u0239\n\r"+
		"\r\r\16\r\u023a\3\r\3\r\5\r\u023f\n\r\3\r\3\r\5\r\u0243\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u0249\n\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0251\n"+
		"\20\3\21\3\21\3\22\3\22\3\23\7\23\u0258\n\23\f\23\16\23\u025b\13\23\3"+
		"\23\3\23\5\23\u025f\n\23\3\24\5\24\u0262\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0271\n\24\3\25\3\25\5\25"+
		"\u0275\n\25\3\26\5\26\u0278\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u027f\n"+
		"\26\f\26\16\26\u0282\13\26\3\26\7\26\u0285\n\26\f\26\16\26\u0288\13\26"+
		"\3\26\5\26\u028b\n\26\3\27\3\27\3\27\3\27\5\27\u0291\n\27\3\27\3\27\3"+
		"\30\3\30\5\30\u0297\n\30\3\31\3\31\3\31\5\31\u029c\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\5\33\u02a3\n\33\3\33\5\33\u02a6\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u02ad\n\33\f\33\16\33\u02b0\13\33\3\33\5\33\u02b3\n\33\5\33\u02b5"+
		"\n\33\3\33\5\33\u02b8\n\33\3\33\3\33\3\33\3\33\5\33\u02be\n\33\5\33\u02c0"+
		"\n\33\5\33\u02c2\n\33\3\34\3\34\3\34\3\34\5\34\u02c8\n\34\3\34\3\34\5"+
		"\34\u02cc\n\34\3\34\3\34\5\34\u02d0\n\34\3\34\5\34\u02d3\n\34\3\34\3\34"+
		"\5\34\u02d7\n\34\3\35\5\35\u02da\n\35\3\35\5\35\u02dd\n\35\3\35\5\35\u02e0"+
		"\n\35\3\35\3\35\5\35\u02e4\n\35\5\35\u02e6\n\35\3\36\3\36\3\37\3\37\5"+
		"\37\u02ec\n\37\3\37\3\37\3\37\5\37\u02f1\n\37\3\37\3\37\3\37\7\37\u02f6"+
		"\n\37\f\37\16\37\u02f9\13\37\3\37\5\37\u02fc\n\37\5\37\u02fe\n\37\3 \7"+
		" \u0301\n \f \16 \u0304\13 \3 \3 \5 \u0308\n \3!\3!\5!\u030c\n!\5!\u030e"+
		"\n!\3!\5!\u0311\n!\3!\3!\3\"\5\"\u0316\n\"\3\"\3\"\3\"\3\"\3#\7#\u031d"+
		"\n#\f#\16#\u0320\13#\3#\3#\3#\5#\u0325\n#\3$\3$\3$\3$\5$\u032b\n$\3%\3"+
		"%\3%\3&\3&\3&\5&\u0333\n&\3&\5&\u0336\n&\3&\3&\5&\u033a\n&\3&\3&\3\'\3"+
		"\'\5\'\u0340\n\'\3(\3(\3(\5(\u0345\n(\3(\5(\u0348\n(\3(\3(\5(\u034c\n"+
		"(\3(\3(\5(\u0350\n(\3)\3)\3)\5)\u0355\n)\3)\3)\5)\u0359\n)\3)\3)\5)\u035d"+
		"\n)\3)\3)\3*\3*\3*\7*\u0364\n*\f*\16*\u0367\13*\3*\5*\u036a\n*\3+\7+\u036d"+
		"\n+\f+\16+\u0370\13+\3+\5+\u0373\n+\3+\3+\3+\3+\3,\3,\3,\7,\u037c\n,\f"+
		",\16,\u037f\13,\3,\5,\u0382\n,\3-\7-\u0385\n-\f-\16-\u0388\13-\3-\5-\u038b"+
		"\n-\3-\3-\3.\3.\3.\5.\u0392\n.\3.\5.\u0395\n.\3.\3.\5.\u0399\n.\3.\3."+
		"\3/\3/\3/\7/\u03a0\n/\f/\16/\u03a3\13/\3/\5/\u03a6\n/\3\60\7\60\u03a9"+
		"\n\60\f\60\16\60\u03ac\13\60\3\60\5\60\u03af\n\60\3\60\3\60\3\60\3\60"+
		"\5\60\u03b5\n\60\3\61\3\61\5\61\u03b9\n\61\3\61\3\61\3\62\3\62\5\62\u03bf"+
		"\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u03c9\n\64\3\64\5\64"+
		"\u03cc\n\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u03d5\n\65\3\65\3"+
		"\65\3\65\3\65\5\65\u03db\n\65\3\65\3\65\3\66\3\66\5\66\u03e1\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u03e8\n\66\3\66\3\66\3\67\5\67\u03ed\n\67\3"+
		"\67\3\67\3\67\5\67\u03f2\n\67\3\67\3\67\5\67\u03f6\n\67\5\67\u03f8\n\67"+
		"\3\67\5\67\u03fb\n\67\3\67\3\67\7\67\u03ff\n\67\f\67\16\67\u0402\13\67"+
		"\3\67\7\67\u0405\n\67\f\67\16\67\u0408\13\67\3\67\3\67\38\38\58\u040e"+
		"\n8\39\39\59\u0412\n9\39\39\59\u0416\n9\39\39\79\u041a\n9\f9\169\u041d"+
		"\139\39\79\u0420\n9\f9\169\u0423\139\39\39\3:\5:\u0428\n:\3:\3:\5:\u042c"+
		"\n:\3:\5:\u042f\n:\3:\3:\3:\3:\5:\u0435\n:\3:\3:\7:\u0439\n:\f:\16:\u043c"+
		"\13:\3:\7:\u043f\n:\f:\16:\u0442\13:\3:\3:\3;\5;\u0447\n;\3;\3;\5;\u044b"+
		"\n;\3;\3;\7;\u044f\n;\f;\16;\u0452\13;\3;\7;\u0455\n;\f;\16;\u0458\13"+
		";\3;\3;\3<\7<\u045d\n<\f<\16<\u0460\13<\3<\3<\5<\u0464\n<\3<\3<\5<\u0468"+
		"\n<\5<\u046a\n<\3=\3=\3=\3=\7=\u0470\n=\f=\16=\u0473\13=\3=\3=\5=\u0477"+
		"\n=\5=\u0479\n=\3=\3=\3>\7>\u047e\n>\f>\16>\u0481\13>\3>\3>\3>\5>\u0486"+
		"\n>\3?\5?\u0489\n?\3?\3?\3?\5?\u048e\n?\3@\5@\u0491\n@\3@\3@\3@\5@\u0496"+
		"\n@\5@\u0498\n@\3@\3@\5@\u049c\n@\3A\3A\3A\3A\3A\3B\3B\3B\3B\7B\u04a7"+
		"\nB\fB\16B\u04aa\13B\3B\5B\u04ad\nB\3C\3C\5C\u04b1\nC\3D\3D\3D\3D\3E\5"+
		"E\u04b8\nE\3E\3E\3E\5E\u04bd\nE\3F\3F\3F\3G\7G\u04c3\nG\fG\16G\u04c6\13"+
		"G\3G\3G\5G\u04ca\nG\3G\3G\3G\5G\u04cf\nG\5G\u04d1\nG\3H\3H\3H\3H\3H\3"+
		"H\3I\3I\3I\3I\3I\3J\3J\5J\u04e0\nJ\3K\3K\3K\5K\u04e5\nK\3L\3L\3L\3L\3"+
		"L\5L\u04ec\nL\3M\7M\u04ef\nM\fM\16M\u04f2\13M\3M\3M\3M\3M\5M\u04f8\nM"+
		"\3M\3M\5M\u04fc\nM\3M\3M\3N\3N\3N\3N\3N\5N\u0505\nN\5N\u0507\nN\3O\3O"+
		"\6O\u050b\nO\rO\16O\u050c\3O\3O\3O\3O\3O\3O\5O\u0515\nO\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u051e\nO\3O\3O\3O\3O\5O\u0524\nO\3O\5O\u0527\nO\3O\3O\5O\u052b"+
		"\nO\3O\5O\u052e\nO\3O\3O\5O\u0532\nO\3O\3O\7O\u0536\nO\fO\16O\u0539\13"+
		"O\3O\3O\3O\3O\3O\7O\u0540\nO\fO\16O\u0543\13O\3O\5O\u0546\nO\3O\3O\3O"+
		"\7O\u054b\nO\fO\16O\u054e\13O\3O\5O\u0551\nO\3O\3O\3O\3O\3O\3O\5O\u0559"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0564\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\5O\u058a\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O"+
		"\u059a\nO\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u05aa\nO\7O\u05ac"+
		"\nO\fO\16O\u05af\13O\3P\3P\3Q\3Q\3R\6R\u05b6\nR\rR\16R\u05b7\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\5R\u05c3\nR\3S\3S\3T\3T\5T\u05c9\nT\3U\3U\7U\u05cd"+
		"\nU\fU\16U\u05d0\13U\3U\5U\u05d3\nU\3U\3U\3V\6V\u05d8\nV\rV\16V\u05d9"+
		"\3V\5V\u05dd\nV\3V\5V\u05e0\nV\3W\3W\5W\u05e4\nW\3W\3W\3X\3X\3X\3Y\3Y"+
		"\3Y\7Y\u05ee\nY\fY\16Y\u05f1\13Y\3Y\5Y\u05f4\nY\3Y\3Y\3Y\3Y\5Y\u05fa\n"+
		"Y\3Z\3Z\3Z\6Z\u05ff\nZ\rZ\16Z\u0600\3Z\5Z\u0604\nZ\3[\3[\3\\\3\\\3\\\5"+
		"\\\u060b\n\\\3]\3]\3]\7]\u0610\n]\f]\16]\u0613\13]\3]\3]\5]\u0617\n]\3"+
		"]\3]\3^\3^\3^\7^\u061e\n^\f^\16^\u0621\13^\3^\3^\3^\5^\u0626\n^\5^\u0628"+
		"\n^\3_\7_\u062b\n_\f_\16_\u062e\13_\3_\3_\3_\5_\u0633\n_\3_\3_\3_\5_\u0638"+
		"\n_\3`\3`\3`\3a\3a\3a\7a\u0640\na\fa\16a\u0643\13a\3a\3a\3a\7a\u0648\n"+
		"a\fa\16a\u064b\13a\3a\5a\u064e\na\5a\u0650\na\3a\3a\3b\3b\3c\3c\3c\5c"+
		"\u0659\nc\3d\3d\3d\5d\u065e\nd\3d\3d\3e\3e\3e\7e\u0665\ne\fe\16e\u0668"+
		"\13e\3e\5e\u066b\ne\3f\3f\3f\5f\u0670\nf\3f\3f\3f\5f\u0675\nf\3g\3g\3"+
		"g\3g\3g\7g\u067c\ng\fg\16g\u067f\13g\3g\5g\u0682\ng\5g\u0684\ng\3g\3g"+
		"\3h\3h\3i\3i\3i\7i\u068d\ni\fi\16i\u0690\13i\3i\5i\u0693\ni\3j\5j\u0696"+
		"\nj\3j\3j\3j\5j\u069b\nj\3j\5j\u069e\nj\3j\3j\3j\3j\3j\5j\u06a5\nj\3k"+
		"\3k\3k\7k\u06aa\nk\fk\16k\u06ad\13k\3k\5k\u06b0\nk\3l\7l\u06b3\nl\fl\16"+
		"l\u06b6\13l\3l\3l\3l\5l\u06bb\nl\3m\5m\u06be\nm\3m\3m\3m\3m\5m\u06c4\n"+
		"m\3n\3n\3n\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3q\3r\3r\3"+
		"r\3s\3s\3s\3s\3s\3s\3s\5s\u06e4\ns\5s\u06e6\ns\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3t\3t\5t\u06f2\nt\5t\u06f4\nt\3u\3u\3u\3u\7u\u06fa\nu\fu\16u\u06fd\13"+
		"u\3u\5u\u0700\nu\3u\3u\3v\3v\3v\3v\7v\u0708\nv\fv\16v\u070b\13v\3v\3v"+
		"\3v\3v\5v\u0711\nv\3w\3w\3w\3w\3w\5w\u0718\nw\5w\u071a\nw\3x\7x\u071d"+
		"\nx\fx\16x\u0720\13x\3x\3x\5x\u0724\nx\3y\3y\3y\3z\5z\u072a\nz\3z\3z\3"+
		"z\7z\u072f\nz\fz\16z\u0732\13z\3{\3{\5{\u0736\n{\3|\3|\3|\3|\3|\3|\3|"+
		"\3|\3|\3|\3|\3|\5|\u0744\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u074f\n}\3}"+
		"\3}\5}\u0753\n}\3}\5}\u0756\n}\3~\5~\u0759\n~\3~\5~\u075c\n~\3~\3~\3~"+
		"\5~\u0761\n~\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0772"+
		"\n\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0777\n\u0082\3\u0082\3\u0082"+
		"\5\u0082\u077b\n\u0082\3\u0082\3\u0082\5\u0082\u077f\n\u0082\3\u0083\3"+
		"\u0083\5\u0083\u0783\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5"+
		"\u0084\u078a\n\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u0791"+
		"\n\u0085\5\u0085\u0793\n\u0085\3\u0085\5\u0085\u0796\n\u0085\3\u0086\3"+
		"\u0086\3\u0086\7\u0086\u079b\n\u0086\f\u0086\16\u0086\u079e\13\u0086\3"+
		"\u0087\7\u0087\u07a1\n\u0087\f\u0087\16\u0087\u07a4\13\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087"+
		"\u07af\n\u0087\3\u0087\5\u0087\u07b2\n\u0087\3\u0087\5\u0087\u07b5\n\u0087"+
		"\3\u0088\7\u0088\u07b8\n\u0088\f\u0088\16\u0088\u07bb\13\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u07c2\n\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\7\u008a\u07c9\n\u008a\f\u008a\16\u008a\u07cc"+
		"\13\u008a\3\u008a\5\u008a\u07cf\n\u008a\3\u008b\3\u008b\5\u008b\u07d3"+
		"\n\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\6\u008c\u07de\n\u008c\r\u008c\16\u008c\u07df\3\u008c\5\u008c"+
		"\u07e3\n\u008c\5\u008c\u07e5\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008e\3\u008e\5\u008e\u07ed\n\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3"+
		"\u008f\7\u008f\u07f4\n\u008f\f\u008f\16\u008f\u07f7\13\u008f\3\u008f\5"+
		"\u008f\u07fa\n\u008f\3\u0090\3\u0090\5\u0090\u07fe\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0803\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\5\u0092\u0813\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\6\u0095\u081f\n\u0095\r\u0095\16\u0095"+
		"\u0820\3\u0095\5\u0095\u0824\n\u0095\5\u0095\u0826\n\u0095\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\5\u0098\u0836\n\u0098\3\u0098\5\u0098\u0839\n"+
		"\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\5\u009a"+
		"\u0842\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\5\u009a\u0848\n\u009a\3"+
		"\u009a\3\u009a\5\u009a\u084c\n\u009a\3\u009b\5\u009b\u084f\n\u009b\3\u009b"+
		"\3\u009b\5\u009b\u0853\n\u009b\5\u009b\u0855\n\u009b\3\u009c\3\u009c\3"+
		"\u009c\3\u009d\3\u009d\5\u009d\u085c\n\u009d\3\u009e\3\u009e\3\u009e\7"+
		"\u009e\u0861\n\u009e\f\u009e\16\u009e\u0864\13\u009e\3\u009e\5\u009e\u0867"+
		"\n\u009e\3\u009f\7\u009f\u086a\n\u009f\f\u009f\16\u009f\u086d\13\u009f"+
		"\3\u009f\3\u009f\5\u009f\u0871\n\u009f\3\u009f\5\u009f\u0874\n\u009f\3"+
		"\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u087b\n\u00a0\f\u00a0\16"+
		"\u00a0\u087e\13\u00a0\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u0883\n\u00a0\f"+
		"\u00a0\16\u00a0\u0886\13\u00a0\3\u00a0\3\u00a0\3\u00a1\5\u00a1\u088b\n"+
		"\u00a1\3\u00a1\3\u00a1\3\u00a2\5\u00a2\u0890\n\u00a2\3\u00a2\3\u00a2\3"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6"+
		"\3\u00a6\3\u00a6\7\u00a6\u089f\n\u00a6\f\u00a6\16\u00a6\u08a2\13\u00a6"+
		"\3\u00a6\5\u00a6\u08a5\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u08a9\n\u00a7\3"+
		"\u00a8\5\u00a8\u08ac\n\u00a8\3\u00a8\5\u00a8\u08af\n\u00a8\3\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u08b4\n\u00a8\3\u00a8\5\u00a8\u08b7\n\u00a8\3\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u08bc\n\u00a8\3\u00a9\3\u00a9\3\u00a9\7\u00a9\u08c1"+
		"\n\u00a9\f\u00a9\16\u00a9\u08c4\13\u00a9\3\u00a9\5\u00a9\u08c7\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00ab\5\u00ab\u08cc\n\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\7\u00ab\u08d1\n\u00ab\f\u00ab\16\u00ab\u08d4\13\u00ab\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u08db\n\u00ac\3\u00ad\5\u00ad\u08de\n"+
		"\u00ad\3\u00ad\3\u00ad\3\u00ad\7\u00ad\u08e3\n\u00ad\f\u00ad\16\u00ad"+
		"\u08e6\13\u00ad\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u08eb\n\u00ae\3\u00af"+
		"\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u08f3\n\u00af\3\u00b0"+
		"\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u08fb\n\u00b0\3\u00b0"+
		"\3\u00b0\5\u00b0\u08ff\n\u00b0\3\u00b0\5\u00b0\u0902\n\u00b0\3\u00b0\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\5\u00b0\u090a\n\u00b0\3\u00b0\5"+
		"\u00b0\u090d\n\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\7"+
		"\u00b0\u0915\n\u00b0\f\u00b0\16\u00b0\u0918\13\u00b0\3\u00b0\3\u00b0\5"+
		"\u00b0\u091c\n\u00b0\3\u00b0\3\u00b0\5\u00b0\u0920\n\u00b0\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\5\u00b1\u0926\n\u00b1\3\u00b2\3\u00b2\5\u00b2\u092a\n"+
		"\u00b2\3\u00b2\3\u00b2\5\u00b2\u092e\n\u00b2\3\u00b3\3\u00b3\3\u00b3\7"+
		"\u00b3\u0933\n\u00b3\f\u00b3\16\u00b3\u0936\13\u00b3\3\u00b4\3\u00b4\3"+
		"\u00b4\7\u00b4\u093b\n\u00b4\f\u00b4\16\u00b4\u093e\13\u00b4\3\u00b5\3"+
		"\u00b5\3\u00b5\7\u00b5\u0943\n\u00b5\f\u00b5\16\u00b5\u0946\13\u00b5\3"+
		"\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\6\u00b7\u094f\n"+
		"\u00b7\r\u00b7\16\u00b7\u0950\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8"+
		"\u0957\n\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\6\u00b9\u095e\n"+
		"\u00b9\r\u00b9\16\u00b9\u095f\3\u00ba\5\u00ba\u0963\n\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\7\u00ba\u0968\n\u00ba\f\u00ba\16\u00ba\u096b\13\u00ba\3"+
		"\u00bb\3\u00bb\5\u00bb\u096f\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u0973\n\u00bb"+
		"\3\u00bc\3\u00bc\5\u00bc\u0977\n\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u097c\n\u00bc\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u0981\n\u00bd\f\u00bd\16"+
		"\u00bd\u0984\13\u00bd\3\u00bd\5\u00bd\u0987\n\u00bd\3\u00be\3\u00be\3"+
		"\u00be\3\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0990\n\u00be\3\u00be\5"+
		"\u00be\u0993\n\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u099f\n\u00c1\3\u00c2\3\u00c2\3"+
		"\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\2\3\u009c\u00c6\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\2\20"+
		"\5\2TTVV~~\3\2HI\4\2[[]]\4\2UUZZ\3\2VX\3\2TU\3\2jo\3\2_h\6\2\13\13  G"+
		"MRR\4\2\5\5\26\26\5\2\67\6799SS\4\288;<\3\2\3\67\4\2UUW|\2\u0aca\2\u018d"+
		"\3\2\2\2\4\u0198\3\2\2\2\6\u01b4\3\2\2\2\b\u01bc\3\2\2\2\n\u01c3\3\2\2"+
		"\2\f\u01e8\3\2\2\2\16\u01ea\3\2\2\2\20\u01fd\3\2\2\2\22\u01ff\3\2\2\2"+
		"\24\u020a\3\2\2\2\26\u0226\3\2\2\2\30\u0242\3\2\2\2\32\u0248\3\2\2\2\34"+
		"\u024a\3\2\2\2\36\u0250\3\2\2\2 \u0252\3\2\2\2\"\u0254\3\2\2\2$\u0259"+
		"\3\2\2\2&\u0261\3\2\2\2(\u0274\3\2\2\2*\u0277\3\2\2\2,\u028c\3\2\2\2."+
		"\u0296\3\2\2\2\60\u0298\3\2\2\2\62\u029d\3\2\2\2\64\u02c1\3\2\2\2\66\u02c3"+
		"\3\2\2\28\u02d9\3\2\2\2:\u02e7\3\2\2\2<\u02fd\3\2\2\2>\u0302\3\2\2\2@"+
		"\u030d\3\2\2\2B\u0315\3\2\2\2D\u031e\3\2\2\2F\u0326\3\2\2\2H\u032c\3\2"+
		"\2\2J\u032f\3\2\2\2L\u033f\3\2\2\2N\u0341\3\2\2\2P\u0351\3\2\2\2R\u0360"+
		"\3\2\2\2T\u036e\3\2\2\2V\u0378\3\2\2\2X\u0386\3\2\2\2Z\u038e\3\2\2\2\\"+
		"\u039c\3\2\2\2^\u03aa\3\2\2\2`\u03b6\3\2\2\2b\u03bc\3\2\2\2d\u03c2\3\2"+
		"\2\2f\u03c5\3\2\2\2h\u03d1\3\2\2\2j\u03de\3\2\2\2l\u03ec\3\2\2\2n\u040d"+
		"\3\2\2\2p\u040f\3\2\2\2r\u0427\3\2\2\2t\u0446\3\2\2\2v\u045e\3\2\2\2x"+
		"\u046b\3\2\2\2z\u047f\3\2\2\2|\u0488\3\2\2\2~\u0490\3\2\2\2\u0080\u049d"+
		"\3\2\2\2\u0082\u04a2\3\2\2\2\u0084\u04b0\3\2\2\2\u0086\u04b2\3\2\2\2\u0088"+
		"\u04b7\3\2\2\2\u008a\u04be\3\2\2\2\u008c\u04c4\3\2\2\2\u008e\u04d2\3\2"+
		"\2\2\u0090\u04d8\3\2\2\2\u0092\u04dd\3\2\2\2\u0094\u04e4\3\2\2\2\u0096"+
		"\u04eb\3\2\2\2\u0098\u04f0\3\2\2\2\u009a\u0506\3\2\2\2\u009c\u0558\3\2"+
		"\2\2\u009e\u05b0\3\2\2\2\u00a0\u05b2\3\2\2\2\u00a2\u05c2\3\2\2\2\u00a4"+
		"\u05c4\3\2\2\2\u00a6\u05c8\3\2\2\2\u00a8\u05ca\3\2\2\2\u00aa\u05df\3\2"+
		"\2\2\u00ac\u05e1\3\2\2\2\u00ae\u05e7\3\2\2\2\u00b0\u05f9\3\2\2\2\u00b2"+
		"\u05fe\3\2\2\2\u00b4\u0605\3\2\2\2\u00b6\u060a\3\2\2\2\u00b8\u060c\3\2"+
		"\2\2\u00ba\u061a\3\2\2\2\u00bc\u062c\3\2\2\2\u00be\u0639\3\2\2\2\u00c0"+
		"\u063c\3\2\2\2\u00c2\u0653\3\2\2\2\u00c4\u0658\3\2\2\2\u00c6\u065a\3\2"+
		"\2\2\u00c8\u0661\3\2\2\2\u00ca\u0674\3\2\2\2\u00cc\u0676\3\2\2\2\u00ce"+
		"\u0687\3\2\2\2\u00d0\u0689\3\2\2\2\u00d2\u0695\3\2\2\2\u00d4\u06a6\3\2"+
		"\2\2\u00d6\u06b4\3\2\2\2\u00d8\u06bd\3\2\2\2\u00da\u06c5\3\2\2\2\u00dc"+
		"\u06c8\3\2\2\2\u00de\u06cc\3\2\2\2\u00e0\u06d3\3\2\2\2\u00e2\u06d9\3\2"+
		"\2\2\u00e4\u06dc\3\2\2\2\u00e6\u06e7\3\2\2\2\u00e8\u06f5\3\2\2\2\u00ea"+
		"\u0709\3\2\2\2\u00ec\u0719\3\2\2\2\u00ee\u071e\3\2\2\2\u00f0\u0725\3\2"+
		"\2\2\u00f2\u0729\3\2\2\2\u00f4\u0735\3\2\2\2\u00f6\u0743\3\2\2\2\u00f8"+
		"\u0755\3\2\2\2\u00fa\u0758\3\2\2\2\u00fc\u0762\3\2\2\2\u00fe\u0764\3\2"+
		"\2\2\u0100\u0771\3\2\2\2\u0102\u077e\3\2\2\2\u0104\u0780\3\2\2\2\u0106"+
		"\u0786\3\2\2\2\u0108\u0795\3\2\2\2\u010a\u0797\3\2\2\2\u010c\u07a2\3\2"+
		"\2\2\u010e\u07b9\3\2\2\2\u0110\u07be\3\2\2\2\u0112\u07c5\3\2\2\2\u0114"+
		"\u07d0\3\2\2\2\u0116\u07e4\3\2\2\2\u0118\u07e6\3\2\2\2\u011a\u07ea\3\2"+
		"\2\2\u011c\u07f0\3\2\2\2\u011e\u07fd\3\2\2\2\u0120\u0802\3\2\2\2\u0122"+
		"\u0812\3\2\2\2\u0124\u0814\3\2\2\2\u0126\u0818\3\2\2\2\u0128\u081a\3\2"+
		"\2\2\u012a\u0829\3\2\2\2\u012c\u082f\3\2\2\2\u012e\u0833\3\2\2\2\u0130"+
		"\u083c\3\2\2\2\u0132\u0841\3\2\2\2\u0134\u084e\3\2\2\2\u0136\u0856\3\2"+
		"\2\2\u0138\u085b\3\2\2\2\u013a\u085d\3\2\2\2\u013c\u086b\3\2\2\2\u013e"+
		"\u087c\3\2\2\2\u0140\u088a\3\2\2\2\u0142\u088f\3\2\2\2\u0144\u0893\3\2"+
		"\2\2\u0146\u0896\3\2\2\2\u0148\u0899\3\2\2\2\u014a\u089b\3\2\2\2\u014c"+
		"\u08a8\3\2\2\2\u014e\u08bb\3\2\2\2\u0150\u08c2\3\2\2\2\u0152\u08c8\3\2"+
		"\2\2\u0154\u08cb\3\2\2\2\u0156\u08da\3\2\2\2\u0158\u08dd\3\2\2\2\u015a"+
		"\u08e7\3\2\2\2\u015c\u08f2\3\2\2\2\u015e\u091f\3\2\2\2\u0160\u0925\3\2"+
		"\2\2\u0162\u092d\3\2\2\2\u0164\u092f\3\2\2\2\u0166\u0937\3\2\2\2\u0168"+
		"\u093f\3\2\2\2\u016a\u0947\3\2\2\2\u016c\u094b\3\2\2\2\u016e\u0952\3\2"+
		"\2\2\u0170\u095a\3\2\2\2\u0172\u0962\3\2\2\2\u0174\u096c\3\2\2\2\u0176"+
		"\u0974\3\2\2\2\u0178\u097d\3\2\2\2\u017a\u0988\3\2\2\2\u017c\u0994\3\2"+
		"\2\2\u017e\u0996\3\2\2\2\u0180\u099e\3\2\2\2\u0182\u09a0\3\2\2\2\u0184"+
		"\u09a2\3\2\2\2\u0186\u09a4\3\2\2\2\u0188\u09a8\3\2\2\2\u018a\u018c\5\u008e"+
		"H\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0193\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\5$"+
		"\23\2\u0191\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\2"+
		"\2\3\u0197\3\3\2\2\2\u0198\u0199\5\u0154\u00ab\2\u0199\u019a\7Z\2\2\u019a"+
		"\u019b\5\6\4\2\u019b\5\3\2\2\2\u019c\u01a0\7\u0083\2\2\u019d\u019f\5\b"+
		"\5\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01b5\7\u0084"+
		"\2\2\u01a4\u01a8\7\u0081\2\2\u01a5\u01a7\5\b\5\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01b5\7\u0082\2\2\u01ac\u01b0\7\177\2\2"+
		"\u01ad\u01af\5\b\5\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01b5\7\u0080\2\2\u01b4\u019c\3\2\2\2\u01b4\u01a4\3\2\2\2\u01b4\u01ac"+
		"\3\2\2\2\u01b5\7\3\2\2\2\u01b6\u01b8\5\n\6\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01bd\5\6\4\2\u01bc\u01b7\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bd"+
		"\t\3\2\2\2\u01be\u01c4\5\u0180\u00c1\2\u01bf\u01c4\5\u0182\u00c2\2\u01c0"+
		"\u01c4\5\u0184\u00c3\2\u01c1\u01c4\5 \21\2\u01c2\u01c4\7}\2\2\u01c3\u01be"+
		"\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\13\3\2\2\2\u01c5\u01c6\5\u0154\u00ab\2\u01c6\u01c7"+
		"\7Z\2\2\u01c7\u01cb\7\u0083\2\2\u01c8\u01ca\5\b\5\2\u01c9\u01c8\3\2\2"+
		"\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7\u0084\2\2\u01cf\u01d0\7w\2"+
		"\2\u01d0\u01e9\3\2\2\2\u01d1\u01d2\5\u0154\u00ab\2\u01d2\u01d3\7Z\2\2"+
		"\u01d3\u01d7\7\u0081\2\2\u01d4\u01d6\5\b\5\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2"+
		"\2\2\u01d9\u01d7\3\2\2\2\u01da\u01db\7\u0082\2\2\u01db\u01dc\7w\2\2\u01dc"+
		"\u01e9\3\2\2\2\u01dd\u01de\5\u0154\u00ab\2\u01de\u01df\7Z\2\2\u01df\u01e3"+
		"\7\177\2\2\u01e0\u01e2\5\b\5\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01e7\7\u0080\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01c5\3\2\2"+
		"\2\u01e8\u01d1\3\2\2\2\u01e8\u01dd\3\2\2\2\u01e9\r\3\2\2\2\u01ea\u01eb"+
		"\78\2\2\u01eb\u01ec\7Z\2\2\u01ec\u01ed\5\u017c\u00bf\2\u01ed\u01ee\5\20"+
		"\t\2\u01ee\17\3\2\2\2\u01ef\u01f0\7\u0083\2\2\u01f0\u01f1\5\22\n\2\u01f1"+
		"\u01f2\7\u0084\2\2\u01f2\u01f3\7w\2\2\u01f3\u01fe\3\2\2\2\u01f4\u01f5"+
		"\7\u0081\2\2\u01f5\u01f6\5\22\n\2\u01f6\u01f7\7\u0082\2\2\u01f7\u01f8"+
		"\7w\2\2\u01f8\u01fe\3\2\2\2\u01f9\u01fa\7\177\2\2\u01fa\u01fb\5\22\n\2"+
		"\u01fb\u01fc\7\u0080\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ef\3\2\2\2\u01fd"+
		"\u01f4\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe\21\3\2\2\2\u01ff\u0204\5\24\13"+
		"\2\u0200\u0201\7w\2\2\u0201\u0203\5\24\13\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0207\u0209\7w\2\2\u0208\u0207\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\23\3\2\2\2\u020a\u020b\5\26\f\2\u020b\u020c\7{\2"+
		"\2\u020c\u020d\5\"\22\2\u020d\25\3\2\2\2\u020e\u0212\7\u0083\2\2\u020f"+
		"\u0211\5\30\r\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0227\7\u0084\2\2\u0216\u021a\7\u0081\2\2\u0217\u0219\5\30\r\2\u0218"+
		"\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0227\7\u0082\2\2\u021e"+
		"\u0222\7\177\2\2\u021f\u0221\5\30\r\2\u0220\u021f\3\2\2\2\u0221\u0224"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0227\7\u0080\2\2\u0226\u020e\3\2\2\2\u0226\u0216"+
		"\3\2\2\2\u0226\u021e\3\2\2\2\u0227\27\3\2\2\2\u0228\u022a\5\32\16\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u0243\3\2\2\2\u022d\u0243\5\26\f\2\u022e\u0231\7}\2\2\u022f"+
		"\u0232\5\u017c\u00bf\2\u0230\u0232\7\32\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\7x\2\2\u0234\u0243\5\34"+
		"\17\2\u0235\u0236\7}\2\2\u0236\u0238\7\u0083\2\2\u0237\u0239\5\30\r\2"+
		"\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\7\u0084\2\2\u023d\u023f\5\36"+
		"\20\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\5 \21\2\u0241\u0243\3\2\2\2\u0242\u0229\3\2\2\2\u0242\u022d\3\2"+
		"\2\2\u0242\u022e\3\2\2\2\u0242\u0235\3\2\2\2\u0243\31\3\2\2\2\u0244\u0249"+
		"\5\u0180\u00c1\2\u0245\u0249\5\u0182\u00c2\2\u0246\u0249\5\u0184\u00c3"+
		"\2\u0247\u0249\5 \21\2\u0248\u0244\3\2\2\2\u0248\u0245\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0248\u0247\3\2\2\2\u0249\33\3\2\2\2\u024a\u024b\5\u017c\u00bf"+
		"\2\u024b\35\3\2\2\2\u024c\u0251\5\u0180\u00c1\2\u024d\u0251\5\u0182\u00c2"+
		"\2\u024e\u0251\5\u0184\u00c3\2\u024f\u0251\7}\2\2\u0250\u024c\3\2\2\2"+
		"\u0250\u024d\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u024f\3\2\2\2\u0251\37"+
		"\3\2\2\2\u0252\u0253\t\2\2\2\u0253!\3\2\2\2\u0254\u0255\5\6\4\2\u0255"+
		"#\3\2\2\2\u0256\u0258\5\u0090I\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2"+
		"\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025e\3\2\2\2\u025b\u0259"+
		"\3\2\2\2\u025c\u025f\5&\24\2\u025d\u025f\5(\25\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025d\3\2\2\2\u025f%\3\2\2\2\u0260\u0262\5\u017a\u00be\2\u0261\u0260"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0270\3\2\2\2\u0263\u0271\5*\26\2\u0264"+
		"\u0271\5,\27\2\u0265\u0271\5\62\32\2\u0266\u0271\5\66\34\2\u0267\u0271"+
		"\5J&\2\u0268\u0271\5L\'\2\u0269\u0271\5Z.\2\u026a\u0271\5f\64\2\u026b"+
		"\u0271\5h\65\2\u026c\u0271\5j\66\2\u026d\u0271\5l\67\2\u026e\u0271\5n"+
		"8\2\u026f\u0271\5t;\2\u0270\u0263\3\2\2\2\u0270\u0264\3\2\2\2\u0270\u0265"+
		"\3\2\2\2\u0270\u0266\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u0268\3\2\2\2\u0270"+
		"\u0269\3\2\2\2\u0270\u026a\3\2\2\2\u0270\u026b\3\2\2\2\u0270\u026c\3\2"+
		"\2\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\'\3\2\2\2\u0272\u0275\5\f\7\2\u0273\u0275\5\16\b\2\u0274\u0272\3\2\2"+
		"\2\u0274\u0273\3\2\2\2\u0275)\3\2\2\2\u0276\u0278\7\"\2\2\u0277\u0276"+
		"\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\7\24\2\2"+
		"\u027a\u028a\5\u017c\u00bf\2\u027b\u028b\7w\2\2\u027c\u0280\7\177\2\2"+
		"\u027d\u027f\5\u008eH\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2\2\u0280"+
		"\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0286\3\2\2\2\u0282\u0280\3\2"+
		"\2\2\u0283\u0285\5$\23\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0289\u028b\7\u0080\2\2\u028a\u027b\3\2\2\2\u028a\u027c\3\2\2\2\u028b"+
		"+\3\2\2\2\u028c\u028d\7\n\2\2\u028d\u028e\7\7\2\2\u028e\u0290\5.\30\2"+
		"\u028f\u0291\5\60\31\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292"+
		"\3\2\2\2\u0292\u0293\7w\2\2\u0293-\3\2\2\2\u0294\u0297\5\u017c\u00bf\2"+
		"\u0295\u0297\7\32\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297/\3"+
		"\2\2\2\u0298\u029b\7\3\2\2\u0299\u029c\5\u017c\u00bf\2\u029a\u029c\7q"+
		"\2\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\61\3\2\2\2\u029d\u029e"+
		"\7#\2\2\u029e\u029f\5\64\33\2\u029f\u02a0\7w\2\2\u02a0\63\3\2\2\2\u02a1"+
		"\u02a3\5\u0154\u00ab\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a6\7y\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02b7\3\2\2\2\u02a7\u02b8\7V\2\2\u02a8\u02b4\7\177\2\2\u02a9\u02ae\5"+
		"\64\33\2\u02aa\u02ab\7v\2\2\u02ab\u02ad\5\64\33\2\u02ac\u02aa\3\2\2\2"+
		"\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b2"+
		"\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\7v\2\2\u02b2\u02b1\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02a9\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\7\u0080\2\2\u02b7\u02a7\3\2\2\2\u02b7"+
		"\u02a8\3\2\2\2\u02b8\u02c2\3\2\2\2\u02b9\u02bf\5\u0154\u00ab\2\u02ba\u02bd"+
		"\7\3\2\2\u02bb\u02be\5\u017c\u00bf\2\u02bc\u02be\7q\2\2\u02bd\u02bb\3"+
		"\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02ba\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02a5\3\2\2\2\u02c1\u02b9\3\2"+
		"\2\2\u02c2\65\3\2\2\2\u02c3\u02c4\58\35\2\u02c4\u02c5\7\f\2\2\u02c5\u02c7"+
		"\5\u017c\u00bf\2\u02c6\u02c8\5x=\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\7\u0083\2\2\u02ca\u02cc\5<\37\2\u02cb"+
		"\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\7\u0084"+
		"\2\2\u02ce\u02d0\5H%\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2"+
		"\3\2\2\2\u02d1\u02d3\5\u0082B\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2"+
		"\2\u02d3\u02d6\3\2\2\2\u02d4\u02d7\5\u00a8U\2\u02d5\u02d7\7w\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\67\3\2\2\2\u02d8\u02da\7\5\2"+
		"\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02dd"+
		"\7&\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de"+
		"\u02e0\7\"\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e5\3\2"+
		"\2\2\u02e1\u02e3\7\n\2\2\u02e2\u02e4\5:\36\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02e1\3\2\2\2\u02e5\u02e6\3\2"+
		"\2\2\u02e69\3\2\2\2\u02e7\u02e8\t\3\2\2\u02e8;\3\2\2\2\u02e9\u02eb\5>"+
		" \2\u02ea\u02ec\7v\2\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02fe"+
		"\3\2\2\2\u02ed\u02ee\5> \2\u02ee\u02ef\7v\2\2\u02ef\u02f1\3\2\2\2\u02f0"+
		"\u02ed\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f7\5D"+
		"#\2\u02f3\u02f4\7v\2\2\u02f4\u02f6\5D#\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fc\7v\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02e9\3\2\2\2\u02fd\u02f0\3\2\2\2\u02fe"+
		"=\3\2\2\2\u02ff\u0301\5\u0090I\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2"+
		"\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0307\3\2\2\2\u0304\u0302"+
		"\3\2\2\2\u0305\u0308\5@!\2\u0306\u0308\5B\"\2\u0307\u0305\3\2\2\2\u0307"+
		"\u0306\3\2\2\2\u0308?\3\2\2\2\u0309\u030b\7[\2\2\u030a\u030c\5\u0152\u00aa"+
		"\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u0309"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u0311\7\26\2\2"+
		"\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313"+
		"\7\32\2\2\u0313A\3\2\2\2\u0314\u0316\7\26\2\2\u0315\u0314\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7\32\2\2\u0318\u0319\7"+
		"x\2\2\u0319\u031a\5\u0120\u0091\2\u031aC\3\2\2\2\u031b\u031d\5\u0090I"+
		"\2\u031c\u031b\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0324\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0325\5F$\2\u0322"+
		"\u0325\7t\2\2\u0323\u0325\5\u0120\u0091\2\u0324\u0321\3\2\2\2\u0324\u0322"+
		"\3\2\2\2\u0324\u0323\3\2\2\2\u0325E\3\2\2\2\u0326\u0327\5\u00f2z\2\u0327"+
		"\u032a\7x\2\2\u0328\u032b\5\u0120\u0091\2\u0329\u032b\7t\2\2\u032a\u0328"+
		"\3\2\2\2\u032a\u0329\3\2\2\2\u032bG\3\2\2\2\u032c\u032d\7z\2\2\u032d\u032e"+
		"\5\u0120\u0091\2\u032eI\3\2\2\2\u032f\u0330\7!\2\2\u0330\u0332\5\u017c"+
		"\u00bf\2\u0331\u0333\5x=\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0335\3\2\2\2\u0334\u0336\5\u0082B\2\u0335\u0334\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0338\7i\2\2\u0338\u033a\5\u0120\u0091"+
		"\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c"+
		"\7w\2\2\u033cK\3\2\2\2\u033d\u0340\5N(\2\u033e\u0340\5P)\2\u033f\u033d"+
		"\3\2\2\2\u033f\u033e\3\2\2\2\u0340M\3\2\2\2\u0341\u0342\7\35\2\2\u0342"+
		"\u0344\5\u017c\u00bf\2\u0343\u0345\5x=\2\u0344\u0343\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0347\3\2\2\2\u0346\u0348\5\u0082B\2\u0347\u0346\3\2\2"+
		"\2\u0347\u0348\3\2\2\2\u0348\u034f\3\2\2\2\u0349\u034b\7\177\2\2\u034a"+
		"\u034c\5R*\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034d\3\2\2"+
		"\2\u034d\u0350\7\u0080\2\2\u034e\u0350\7w\2\2\u034f\u0349\3\2\2\2\u034f"+
		"\u034e\3\2\2\2\u0350O\3\2\2\2\u0351\u0352\7\35\2\2\u0352\u0354\5\u017c"+
		"\u00bf\2\u0353\u0355\5x=\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0358\7\u0083\2\2\u0357\u0359\5V,\2\u0358\u0357\3"+
		"\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\7\u0084\2\2"+
		"\u035b\u035d\5\u0082B\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u035f\7w\2\2\u035fQ\3\2\2\2\u0360\u0365\5T+\2\u0361"+
		"\u0362\7v\2\2\u0362\u0364\5T+\2\u0363\u0361\3\2\2\2\u0364\u0367\3\2\2"+
		"\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036a\7v\2\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"S\3\2\2\2\u036b\u036d\5\u0090I\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2\2"+
		"\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e"+
		"\3\2\2\2\u0371\u0373\5\u017a\u00be\2\u0372\u0371\3\2\2\2\u0372\u0373\3"+
		"\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5\u017c\u00bf\2\u0375\u0376\7x"+
		"\2\2\u0376\u0377\5\u0120\u0091\2\u0377U\3\2\2\2\u0378\u037d\5X-\2\u0379"+
		"\u037a\7v\2\2\u037a\u037c\5X-\2\u037b\u0379\3\2\2\2\u037c\u037f\3\2\2"+
		"\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d"+
		"\3\2\2\2\u0380\u0382\7v\2\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"W\3\2\2\2\u0383\u0385\5\u0090I\2\u0384\u0383\3\2\2\2\u0385\u0388\3\2\2"+
		"\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386"+
		"\3\2\2\2\u0389\u038b\5\u017a\u00be\2\u038a\u0389\3\2\2\2\u038a\u038b\3"+
		"\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\5\u0120\u0091\2\u038dY\3\2\2\2"+
		"\u038e\u038f\7\t\2\2\u038f\u0391\5\u017c\u00bf\2\u0390\u0392\5x=\2\u0391"+
		"\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0395\5\u0082"+
		"B\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0398\7\177\2\2\u0397\u0399\5\\/\2\u0398\u0397\3\2\2\2\u0398\u0399\3"+
		"\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\7\u0080\2\2\u039b[\3\2\2\2\u039c"+
		"\u03a1\5^\60\2\u039d\u039e\7v\2\2\u039e\u03a0\5^\60\2\u039f\u039d\3\2"+
		"\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03a6\7v\2\2\u03a5\u03a4\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6]\3\2\2\2\u03a7\u03a9\5\u0090I\2\u03a8\u03a7"+
		"\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab"+
		"\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03af\5\u017a\u00be\2\u03ae\u03ad"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b4\5\u017c\u00bf"+
		"\2\u03b1\u03b5\5`\61\2\u03b2\u03b5\5b\62\2\u03b3\u03b5\5d\63\2\u03b4\u03b1"+
		"\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"_\3\2\2\2\u03b6\u03b8\7\u0083\2\2\u03b7\u03b9\5V,\2\u03b8\u03b7\3\2\2"+
		"\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\7\u0084\2\2\u03bb"+
		"a\3\2\2\2\u03bc\u03be\7\177\2\2\u03bd\u03bf\5R*\2\u03be\u03bd\3\2\2\2"+
		"\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7\u0080\2\2\u03c1"+
		"c\3\2\2\2\u03c2\u03c3\7i\2\2\u03c3\u03c4\5\u009cO\2\u03c4e\3\2\2\2\u03c5"+
		"\u03c6\7\66\2\2\u03c6\u03c8\5\u017c\u00bf\2\u03c7\u03c9\5x=\2\u03c8\u03c7"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03cc\5\u0082B"+
		"\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce"+
		"\7\177\2\2\u03ce\u03cf\5R*\2\u03cf\u03d0\7\u0080\2\2\u03d0g\3\2\2\2\u03d1"+
		"\u03d4\7\5\2\2\u03d2\u03d5\5\u017c\u00bf\2\u03d3\u03d5\7q\2\2\u03d4\u03d2"+
		"\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\7x\2\2\u03d7"+
		"\u03da\5\u0120\u0091\2\u03d8\u03d9\7i\2\2\u03d9\u03db\5\u009cO\2\u03da"+
		"\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\7w"+
		"\2\2\u03ddi\3\2\2\2\u03de\u03e0\7\34\2\2\u03df\u03e1\7\26\2\2\u03e0\u03df"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\5\u017c\u00bf"+
		"\2\u03e3\u03e4\7x\2\2\u03e4\u03e7\5\u0120\u0091\2\u03e5\u03e6\7i\2\2\u03e6"+
		"\u03e8\5\u009cO\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\7w\2\2\u03eak\3\2\2\2\u03eb\u03ed\7\"\2\2\u03ec\u03eb"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\7\37\2\2"+
		"\u03ef\u03f1\5\u017c\u00bf\2\u03f0\u03f2\5x=\2\u03f1\u03f0\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f7\3\2\2\2\u03f3\u03f5\7x\2\2\u03f4\u03f6\5\u014a"+
		"\u00a6\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f8\3\2\2\2\u03f7"+
		"\u03f3\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2\2\2\u03f9\u03fb\5\u0082"+
		"B\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u0400\7\177\2\2\u03fd\u03ff\5\u008eH\2\u03fe\u03fd\3\2\2\2\u03ff\u0402"+
		"\3\2\2\2\u0400\u03fe\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0406\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0403\u0405\5\u008cG\2\u0404\u0403\3\2\2\2\u0405\u0408"+
		"\3\2\2\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408"+
		"\u0406\3\2\2\2\u0409\u040a\7\u0080\2\2\u040am\3\2\2\2\u040b\u040e\5p9"+
		"\2\u040c\u040e\5r:\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040eo\3"+
		"\2\2\2\u040f\u0411\7\17\2\2\u0410\u0412\5x=\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0415\5\u0120\u0091\2\u0414\u0416"+
		"\5\u0082B\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2"+
		"\2\u0417\u041b\7\177\2\2\u0418\u041a\5\u008eH\2\u0419\u0418\3\2\2\2\u041a"+
		"\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0421\3\2"+
		"\2\2\u041d\u041b\3\2\2\2\u041e\u0420\5\u008cG\2\u041f\u041e\3\2\2\2\u0420"+
		"\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2"+
		"\2\2\u0423\u0421\3\2\2\2\u0424\u0425\7\u0080\2\2\u0425q\3\2\2\2\u0426"+
		"\u0428\7\"\2\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u042b\7\17\2\2\u042a\u042c\5x=\2\u042b\u042a\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f\7Z\2\2\u042e\u042d\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\5\u0172\u00ba"+
		"\2\u0431\u0432\7\r\2\2\u0432\u0434\5\u0120\u0091\2\u0433\u0435\5\u0082"+
		"B\2\u0434\u0433\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436"+
		"\u043a\7\177\2\2\u0437\u0439\5\u008eH\2\u0438\u0437\3\2\2\2\u0439\u043c"+
		"\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u0440\3\2\2\2\u043c"+
		"\u043a\3\2\2\2\u043d\u043f\5\u008cG\2\u043e\u043d\3\2\2\2\u043f\u0442"+
		"\3\2\2\2\u0440\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442"+
		"\u0440\3\2\2\2\u0443\u0444\7\u0080\2\2\u0444s\3\2\2\2\u0445\u0447\7\""+
		"\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u044a\7\n\2\2\u0449\u044b\5:\36\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044c\3\2\2\2\u044c\u0450\7\177\2\2\u044d\u044f\5\u008eH\2"+
		"\u044e\u044d\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451"+
		"\3\2\2\2\u0451\u0456\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0455\5v<\2\u0454"+
		"\u0453\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2"+
		"\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u045a\7\u0080\2\2\u045a"+
		"u\3\2\2\2\u045b\u045d\5\u0090I\2\u045c\u045b\3\2\2\2\u045d\u0460\3\2\2"+
		"\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0469\3\2\2\2\u0460\u045e"+
		"\3\2\2\2\u0461\u046a\5\f\7\2\u0462\u0464\5\u017a\u00be\2\u0463\u0462\3"+
		"\2\2\2\u0463\u0464\3\2\2\2\u0464\u0467\3\2\2\2\u0465\u0468\5j\66\2\u0466"+
		"\u0468\5\66\34\2\u0467\u0465\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u046a\3"+
		"\2\2\2\u0469\u0461\3\2\2\2\u0469\u0463\3\2\2\2\u046aw\3\2\2\2\u046b\u0478"+
		"\7m\2\2\u046c\u046d\5z>\2\u046d\u046e\7v\2\2\u046e\u0470\3\2\2\2\u046f"+
		"\u046c\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471\u0472\3\2"+
		"\2\2\u0472\u0474\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0476\5z>\2\u0475\u0477"+
		"\7v\2\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478"+
		"\u0471\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7l"+
		"\2\2\u047by\3\2\2\2\u047c\u047e\5\u0090I\2\u047d\u047c\3\2\2\2\u047e\u0481"+
		"\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0485\3\2\2\2\u0481"+
		"\u047f\3\2\2\2\u0482\u0486\5|?\2\u0483\u0486\5~@\2\u0484\u0486\5\u0080"+
		"A\2\u0485\u0482\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486"+
		"{\3\2\2\2\u0487\u0489\5\u0090I\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u048d\7S\2\2\u048b\u048c\7x\2\2\u048c\u048e"+
		"\5\u0150\u00a9\2\u048d\u048b\3\2\2\2\u048d\u048e\3\2\2\2\u048e}\3\2\2"+
		"\2\u048f\u0491\5\u0090I\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0497\5\u017c\u00bf\2\u0493\u0495\7x\2\2\u0494\u0496"+
		"\5\u014a\u00a6\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0498\3"+
		"\2\2\2\u0497\u0493\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049b\3\2\2\2\u0499"+
		"\u049a\7i\2\2\u049a\u049c\5\u0120\u0091\2\u049b\u0499\3\2\2\2\u049b\u049c"+
		"\3\2\2\2\u049c\177\3\2\2\2\u049d\u049e\7\5\2\2\u049e\u049f\5\u017c\u00bf"+
		"\2\u049f\u04a0\7x\2\2\u04a0\u04a1\5\u0120\u0091\2\u04a1\u0081\3\2\2\2"+
		"\u04a2\u04a8\7$\2\2\u04a3\u04a4\5\u0084C\2\u04a4\u04a5\7v\2\2\u04a5\u04a7"+
		"\3\2\2\2\u04a6\u04a3\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ad\5\u0084"+
		"C\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u0083\3\2\2\2\u04ae"+
		"\u04b1\5\u0086D\2\u04af\u04b1\5\u0088E\2\u04b0\u04ae\3\2\2\2\u04b0\u04af"+
		"\3\2\2\2\u04b1\u0085\3\2\2\2\u04b2\u04b3\5\u0152\u00aa\2\u04b3\u04b4\7"+
		"x\2\2\u04b4\u04b5\5\u0150\u00a9\2\u04b5\u0087\3\2\2\2\u04b6\u04b8\5\u008a"+
		"F\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9"+
		"\u04ba\5\u0120\u0091\2\u04ba\u04bc\7x\2\2\u04bb\u04bd\5\u014a\u00a6\2"+
		"\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u0089\3\2\2\2\u04be\u04bf"+
		"\7\r\2\2\u04bf\u04c0\5x=\2\u04c0\u008b\3\2\2\2\u04c1\u04c3\5\u0090I\2"+
		"\u04c2\u04c1\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5"+
		"\3\2\2\2\u04c5\u04d0\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7\u04d1\5\f\7\2\u04c8"+
		"\u04ca\5\u017a\u00be\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04ce"+
		"\3\2\2\2\u04cb\u04cf\5J&\2\u04cc\u04cf\5h\65\2\u04cd\u04cf\5\66\34\2\u04ce"+
		"\u04cb\3\2\2\2\u04ce\u04cc\3\2\2\2\u04ce\u04cd\3\2\2\2\u04cf\u04d1\3\2"+
		"\2\2\u04d0\u04c7\3\2\2\2\u04d0\u04c9\3\2\2\2\u04d1\u008d\3\2\2\2\u04d2"+
		"\u04d3\7|\2\2\u04d3\u04d4\7Z\2\2\u04d4\u04d5\7\u0081\2\2\u04d5\u04d6\5"+
		"\u0092J\2\u04d6\u04d7\7\u0082\2\2\u04d7\u008f\3\2\2\2\u04d8\u04d9\7|\2"+
		"\2\u04d9\u04da\7\u0081\2\2\u04da\u04db\5\u0092J\2\u04db\u04dc\7\u0082"+
		"\2\2\u04dc\u0091\3\2\2\2\u04dd\u04df\5\u0154\u00ab\2\u04de\u04e0\5\u0094"+
		"K\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u0093\3\2\2\2\u04e1"+
		"\u04e5\5\6\4\2\u04e2\u04e3\7i\2\2\u04e3\u04e5\5\u00a4S\2\u04e4\u04e1\3"+
		"\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u0095\3\2\2\2\u04e6\u04ec\7w\2\2\u04e7"+
		"\u04ec\5$\23\2\u04e8\u04ec\5\u0098M\2\u04e9\u04ec\5\u009aN\2\u04ea\u04ec"+
		"\5\f\7\2\u04eb\u04e6\3\2\2\2\u04eb\u04e7\3\2\2\2\u04eb\u04e8\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04eb\u04ea\3\2\2\2\u04ec\u0097\3\2\2\2\u04ed\u04ef\5\u0090"+
		"I\2\u04ee\u04ed\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u04f3\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f3\u04f4\7\21"+
		"\2\2\u04f4\u04f7\5\u00f4{\2\u04f5\u04f6\7x\2\2\u04f6\u04f8\5\u0120\u0091"+
		"\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04fa"+
		"\7i\2\2\u04fa\u04fc\5\u009cO\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2\2"+
		"\u04fc\u04fd\3\2\2\2\u04fd\u04fe\7w\2\2\u04fe\u0099\3\2\2\2\u04ff\u0500"+
		"\5\u009cO\2\u0500\u0501\7w\2\2\u0501\u0507\3\2\2\2\u0502\u0504\5\u00a2"+
		"R\2\u0503\u0505\7w\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507"+
		"\3\2\2\2\u0506\u04ff\3\2\2\2\u0506\u0502\3\2\2\2\u0507\u009b\3\2\2\2\u0508"+
		"\u050a\bO\1\2\u0509\u050b\5\u0090I\2\u050a\u0509\3\2\2\2\u050b\u050c\3"+
		"\2\2\2\u050c\u050a\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\5\u009cO*\u050f\u0559\3\2\2\2\u0510\u0559\5\u00a4S\2\u0511\u0559"+
		"\5\u00a6T\2\u0512\u0514\t\4\2\2\u0513\u0515\7\26\2\2\u0514\u0513\3\2\2"+
		"\2\u0514\u0515\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0559\5\u009cO \u0517"+
		"\u0518\7V\2\2\u0518\u0559\5\u009cO\37\u0519\u051a\t\5\2\2\u051a\u0559"+
		"\5\u009cO\36\u051b\u051d\7s\2\2\u051c\u051e\5\u009cO\2\u051d\u051c\3\2"+
		"\2\2\u051d\u051e\3\2\2\2\u051e\u0559\3\2\2\2\u051f\u0520\7u\2\2\u0520"+
		"\u0559\5\u009cO\21\u0521\u0523\7\6\2\2\u0522\u0524\7S\2\2\u0523\u0522"+
		"\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0526\3\2\2\2\u0525\u0527\5\u009cO"+
		"\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0559\3\2\2\2\u0528\u052a"+
		"\7\4\2\2\u0529\u052b\7S\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052d\3\2\2\2\u052c\u052e\5\u009cO\2\u052d\u052c\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u0559\3\2\2\2\u052f\u0531\7\31\2\2\u0530\u0532\5\u009c"+
		"O\2\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0559\3\2\2\2\u0533"+
		"\u0537\7\u0083\2\2\u0534\u0536\5\u008eH\2\u0535\u0534\3\2\2\2\u0536\u0539"+
		"\3\2\2\2\u0537\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u053a\3\2\2\2\u0539"+
		"\u0537\3\2\2\2\u053a\u053b\5\u009cO\2\u053b\u053c\7\u0084\2\2\u053c\u0559"+
		"\3\2\2\2\u053d\u0541\7\u0081\2\2\u053e\u0540\5\u008eH\2\u053f\u053e\3"+
		"\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542"+
		"\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0546\5\u00b0Y\2\u0545\u0544"+
		"\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0559\7\u0082\2"+
		"\2\u0548\u054c\7\u0083\2\2\u0549\u054b\5\u008eH\2\u054a\u0549\3\2\2\2"+
		"\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u0550"+
		"\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0551\5\u00b2Z\2\u0550\u054f\3\2\2"+
		"\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0559\7\u0084\2\2\u0553"+
		"\u0559\5\u00b6\\\2\u0554\u0559\5\u00c4c\2\u0555\u0559\5\u00d2j\2\u0556"+
		"\u0559\5\u00a2R\2\u0557\u0559\5\4\3\2\u0558\u0508\3\2\2\2\u0558\u0510"+
		"\3\2\2\2\u0558\u0511\3\2\2\2\u0558\u0512\3\2\2\2\u0558\u0517\3\2\2\2\u0558"+
		"\u0519\3\2\2\2\u0558\u051b\3\2\2\2\u0558\u051f\3\2\2\2\u0558\u0521\3\2"+
		"\2\2\u0558\u0528\3\2\2\2\u0558\u052f\3\2\2\2\u0558\u0533\3\2\2\2\u0558"+
		"\u053d\3\2\2\2\u0558\u0548\3\2\2\2\u0558\u0553\3\2\2\2\u0558\u0554\3\2"+
		"\2\2\u0558\u0555\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0557\3\2\2\2\u0559"+
		"\u05ad\3\2\2\2\u055a\u055b\f\34\2\2\u055b\u055c\t\6\2\2\u055c\u05ac\5"+
		"\u009cO\35\u055d\u055e\f\33\2\2\u055e\u055f\t\7\2\2\u055f\u05ac\5\u009c"+
		"O\34\u0560\u0563\f\32\2\2\u0561\u0564\5\u0186\u00c4\2\u0562\u0564\5\u0188"+
		"\u00c5\2\u0563\u0561\3\2\2\2\u0563\u0562\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u0566\5\u009cO\33\u0566\u05ac\3\2\2\2\u0567\u0568\f\31\2\2\u0568\u0569"+
		"\7[\2\2\u0569\u05ac\5\u009cO\32\u056a\u056b\f\30\2\2\u056b\u056c\7Y\2"+
		"\2\u056c\u05ac\5\u009cO\31\u056d\u056e\f\27\2\2\u056e\u056f\7\\\2\2\u056f"+
		"\u05ac\5\u009cO\30\u0570\u0571\f\26\2\2\u0571\u0572\5\u009eP\2\u0572\u0573"+
		"\5\u009cO\27\u0573\u05ac\3\2\2\2\u0574\u0575\f\25\2\2\u0575\u0576\7]\2"+
		"\2\u0576\u05ac\5\u009cO\26\u0577\u0578\f\24\2\2\u0578\u0579\7^\2\2\u0579"+
		"\u05ac\5\u009cO\25\u057a\u057b\f\20\2\2\u057b\u057c\7u\2\2\u057c\u05ac"+
		"\5\u009cO\21\u057d\u057e\f\17\2\2\u057e\u057f\7i\2\2\u057f\u05ac\5\u009c"+
		"O\20\u0580\u0581\f\16\2\2\u0581\u0582\5\u00a0Q\2\u0582\u0583\5\u009cO"+
		"\17\u0583\u05ac\3\2\2\2\u0584\u0585\f\'\2\2\u0585\u0586\7r\2\2\u0586\u0587"+
		"\5\u015a\u00ae\2\u0587\u0589\7\u0083\2\2\u0588\u058a\5\u00d0i\2\u0589"+
		"\u0588\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\7\u0084"+
		"\2\2\u058c\u05ac\3\2\2\2\u058d\u058e\f&\2\2\u058e\u058f\7r\2\2\u058f\u05ac"+
		"\5\u017c\u00bf\2\u0590\u0591\f%\2\2\u0591\u0592\7r\2\2\u0592\u05ac\5\u00b4"+
		"[\2\u0593\u0594\f$\2\2\u0594\u0595\7r\2\2\u0595\u05ac\7\'\2\2\u0596\u0597"+
		"\f#\2\2\u0597\u0599\7\u0083\2\2\u0598\u059a\5\u00d0i\2\u0599\u0598\3\2"+
		"\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u05ac\7\u0084\2\2\u059c"+
		"\u059d\f\"\2\2\u059d\u059e\7\u0081\2\2\u059e\u059f\5\u009cO\2\u059f\u05a0"+
		"\7\u0082\2\2\u05a0\u05ac\3\2\2\2\u05a1\u05a2\f!\2\2\u05a2\u05ac\7~\2\2"+
		"\u05a3\u05a4\f\35\2\2\u05a4\u05a5\7\3\2\2\u05a5\u05ac\5\u0122\u0092\2"+
		"\u05a6\u05a7\f\23\2\2\u05a7\u05a9\7s\2\2\u05a8\u05aa\5\u009cO\2\u05a9"+
		"\u05a8\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u055a\3\2"+
		"\2\2\u05ab\u055d\3\2\2\2\u05ab\u0560\3\2\2\2\u05ab\u0567\3\2\2\2\u05ab"+
		"\u056a\3\2\2\2\u05ab\u056d\3\2\2\2\u05ab\u0570\3\2\2\2\u05ab\u0574\3\2"+
		"\2\2\u05ab\u0577\3\2\2\2\u05ab\u057a\3\2\2\2\u05ab\u057d\3\2\2\2\u05ab"+
		"\u0580\3\2\2\2\u05ab\u0584\3\2\2\2\u05ab\u058d\3\2\2\2\u05ab\u0590\3\2"+
		"\2\2\u05ab\u0593\3\2\2\2\u05ab\u0596\3\2\2\2\u05ab\u059c\3\2\2\2\u05ab"+
		"\u05a1\3\2\2\2\u05ab\u05a3\3\2\2\2\u05ab\u05a6\3\2\2\2\u05ac\u05af\3\2"+
		"\2\2\u05ad\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u009d\3\2\2\2\u05af"+
		"\u05ad\3\2\2\2\u05b0\u05b1\t\b\2\2\u05b1\u009f\3\2\2\2\u05b2\u05b3\t\t"+
		"\2\2\u05b3\u00a1\3\2\2\2\u05b4\u05b6\5\u0090I\2\u05b5\u05b4\3\2\2\2\u05b6"+
		"\u05b7\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2"+
		"\2\2\u05b9\u05ba\5\u00a2R\2\u05ba\u05c3\3\2\2\2\u05bb\u05c3\5\u00a8U\2"+
		"\u05bc\u05c3\5\u00acW\2\u05bd\u05c3\5\u00aeX\2\u05be\u05c3\5\u00d8m\2"+
		"\u05bf\u05c3\5\u00e4s\2\u05c0\u05c3\5\u00e6t\2\u05c1\u05c3\5\u00e8u\2"+
		"\u05c2\u05b5\3\2\2\2\u05c2\u05bb\3\2\2\2\u05c2\u05bc\3\2\2\2\u05c2\u05bd"+
		"\3\2\2\2\u05c2\u05be\3\2\2\2\u05c2\u05bf\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2"+
		"\u05c1\3\2\2\2\u05c3\u00a3\3\2\2\2\u05c4\u05c5\t\n\2\2\u05c5\u00a5\3\2"+
		"\2\2\u05c6\u05c9\5\u0158\u00ad\2\u05c7\u05c9\5\u016c\u00b7\2\u05c8\u05c6"+
		"\3\2\2\2\u05c8\u05c7\3\2\2\2\u05c9\u00a7\3\2\2\2\u05ca\u05ce\7\177\2\2"+
		"\u05cb\u05cd\5\u008eH\2\u05cc\u05cb\3\2\2\2\u05cd\u05d0\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2"+
		"\2\2\u05d1\u05d3\5\u00aaV\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3"+
		"\u05d4\3\2\2\2\u05d4\u05d5\7\u0080\2\2\u05d5\u00a9\3\2\2\2\u05d6\u05d8"+
		"\5\u0096L\2\u05d7\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05d7\3\2\2"+
		"\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db\u05dd\5\u009cO\2\u05dc"+
		"\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05e0\5\u009c"+
		"O\2\u05df\u05d7\3\2\2\2\u05df\u05de\3\2\2\2\u05e0\u00ab\3\2\2\2\u05e1"+
		"\u05e3\7&\2\2\u05e2\u05e4\7\25\2\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2"+
		"\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\5\u00a8U\2\u05e6\u00ad\3\2\2\2\u05e7"+
		"\u05e8\7\"\2\2\u05e8\u05e9\5\u00a8U\2\u05e9\u00af\3\2\2\2\u05ea\u05ef"+
		"\5\u009cO\2\u05eb\u05ec\7v\2\2\u05ec\u05ee\5\u009cO\2\u05ed\u05eb\3\2"+
		"\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0"+
		"\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05f4\7v\2\2\u05f3\u05f2\3\2"+
		"\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05fa\3\2\2\2\u05f5\u05f6\5\u009cO\2\u05f6"+
		"\u05f7\7w\2\2\u05f7\u05f8\5\u009cO\2\u05f8\u05fa\3\2\2\2\u05f9\u05ea\3"+
		"\2\2\2\u05f9\u05f5\3\2\2\2\u05fa\u00b1\3\2\2\2\u05fb\u05fc\5\u009cO\2"+
		"\u05fc\u05fd\7v\2\2\u05fd\u05ff\3\2\2\2\u05fe\u05fb\3\2\2\2\u05ff\u0600"+
		"\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602"+
		"\u0604\5\u009cO\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u00b3"+
		"\3\2\2\2\u0605\u0606\7M\2\2\u0606\u00b5\3\2\2\2\u0607\u060b\5\u00b8]\2"+
		"\u0608\u060b\5\u00c0a\2\u0609\u060b\5\u00c2b\2\u060a\u0607\3\2\2\2\u060a"+
		"\u0608\3\2\2\2\u060a\u0609\3\2\2\2\u060b\u00b7\3\2\2\2\u060c\u060d\5\u0158"+
		"\u00ad\2\u060d\u0611\7\177\2\2\u060e\u0610\5\u008eH\2\u060f\u060e\3\2"+
		"\2\2\u0610\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612"+
		"\u0616\3\2\2\2\u0613\u0611\3\2\2\2\u0614\u0617\5\u00ba^\2\u0615\u0617"+
		"\5\u00be`\2\u0616\u0614\3\2\2\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2"+
		"\2\u0617\u0618\3\2\2\2\u0618\u0619\7\u0080\2\2\u0619\u00b9\3\2\2\2\u061a"+
		"\u061f\5\u00bc_\2\u061b\u061c\7v\2\2\u061c\u061e\5\u00bc_\2\u061d\u061b"+
		"\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620"+
		"\u0627\3\2\2\2\u0621\u061f\3\2\2\2\u0622\u0623\7v\2\2\u0623\u0628\5\u00be"+
		"`\2\u0624\u0626\7v\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628"+
		"\3\2\2\2\u0627\u0622\3\2\2\2\u0627\u0625\3\2\2\2\u0628\u00bb\3\2\2\2\u0629"+
		"\u062b\5\u0090I\2\u062a\u0629\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a"+
		"\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u0637\3\2\2\2\u062e\u062c\3\2\2\2\u062f"+
		"\u0638\5\u017c\u00bf\2\u0630\u0633\5\u017c\u00bf\2\u0631\u0633\5\u00b4"+
		"[\2\u0632\u0630\3\2\2\2\u0632\u0631\3\2\2\2\u0633\u0634\3\2\2\2\u0634"+
		"\u0635\7x\2\2\u0635\u0636\5\u009cO\2\u0636\u0638\3\2\2\2\u0637\u062f\3"+
		"\2\2\2\u0637\u0632\3\2\2\2\u0638\u00bd\3\2\2\2\u0639\u063a\7s\2\2\u063a"+
		"\u063b\5\u009cO\2\u063b\u00bf\3\2\2\2\u063c\u063d\5\u0158\u00ad\2\u063d"+
		"\u0641\7\u0083\2\2\u063e\u0640\5\u008eH\2\u063f\u063e\3\2\2\2\u0640\u0643"+
		"\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u064f\3\2\2\2\u0643"+
		"\u0641\3\2\2\2\u0644\u0649\5\u009cO\2\u0645\u0646\7v\2\2\u0646\u0648\5"+
		"\u009cO\2\u0647\u0645\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647\3\2\2\2"+
		"\u0649\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064c\u064e"+
		"\7v\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650\3\2\2\2\u064f"+
		"\u0644\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\7\u0084"+
		"\2\2\u0652\u00c1\3\2\2\2\u0653\u0654\5\u0158\u00ad\2\u0654\u00c3\3\2\2"+
		"\2\u0655\u0659\5\u00c6d\2\u0656\u0659\5\u00ccg\2\u0657\u0659\5\u00ceh"+
		"\2\u0658\u0655\3\2\2\2\u0658\u0656\3\2\2\2\u0658\u0657\3\2\2\2\u0659\u00c5"+
		"\3\2\2\2\u065a\u065b\5\u0158\u00ad\2\u065b\u065d\7\177\2\2\u065c\u065e"+
		"\5\u00c8e\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u065f\3\2\2"+
		"\2\u065f\u0660\7\u0080\2\2\u0660\u00c7\3\2\2\2\u0661\u0666\5\u00caf\2"+
		"\u0662\u0663\7v\2\2\u0663\u0665\5\u00caf\2\u0664\u0662\3\2\2\2\u0665\u0668"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u066a\3\2\2\2\u0668"+
		"\u0666\3\2\2\2\u0669\u066b\7v\2\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2"+
		"\2\2\u066b\u00c9\3\2\2\2\u066c\u0675\5\u017c\u00bf\2\u066d\u0670\5\u017c"+
		"\u00bf\2\u066e\u0670\5\u00b4[\2\u066f\u066d\3\2\2\2\u066f\u066e\3\2\2"+
		"\2\u0670\u0671\3\2\2\2\u0671\u0672\7x\2\2\u0672\u0673\5\u009cO\2\u0673"+
		"\u0675\3\2\2\2\u0674\u066c\3\2\2\2\u0674\u066f\3\2\2\2\u0675\u00cb\3\2"+
		"\2\2\u0676\u0677\5\u0158\u00ad\2\u0677\u0683\7\u0083\2\2\u0678\u067d\5"+
		"\u009cO\2\u0679\u067a\7v\2\2\u067a\u067c\5\u009cO\2\u067b\u0679\3\2\2"+
		"\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0681"+
		"\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u0682\7v\2\2\u0681\u0680\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u0684\3\2\2\2\u0683\u0678\3\2\2\2\u0683\u0684\3\2"+
		"\2\2\u0684\u0685\3\2\2\2\u0685\u0686\7\u0084\2\2\u0686\u00cd\3\2\2\2\u0687"+
		"\u0688\5\u0158\u00ad\2\u0688\u00cf\3\2\2\2\u0689\u068e\5\u009cO\2\u068a"+
		"\u068b\7v\2\2\u068b\u068d\5\u009cO\2\u068c\u068a\3\2\2\2\u068d\u0690\3"+
		"\2\2\2\u068e\u068c\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0692\3\2\2\2\u0690"+
		"\u068e\3\2\2\2\u0691\u0693\7v\2\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2"+
		"\2\2\u0693\u00d1\3\2\2\2\u0694\u0696\7\25\2\2\u0695\u0694\3\2\2\2\u0695"+
		"\u0696\3\2\2\2\u0696\u069d\3\2\2\2\u0697\u069e\7^\2\2\u0698\u069a\7\\"+
		"\2\2\u0699\u069b\5\u00d4k\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u069c\3\2\2\2\u069c\u069e\7\\\2\2\u069d\u0697\3\2\2\2\u069d\u0698\3\2"+
		"\2\2\u069e\u06a4\3\2\2\2\u069f\u06a5\5\u009cO\2\u06a0\u06a1\7z\2\2\u06a1"+
		"\u06a2\5\u0122\u0092\2\u06a2\u06a3\5\u00a8U\2\u06a3\u06a5\3\2\2\2\u06a4"+
		"\u069f\3\2\2\2\u06a4\u06a0\3\2\2\2\u06a5\u00d3\3\2\2\2\u06a6\u06ab\5\u00d6"+
		"l\2\u06a7\u06a8\7v\2\2\u06a8\u06aa\5\u00d6l\2\u06a9\u06a7\3\2\2\2\u06aa"+
		"\u06ad\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06af\3\2"+
		"\2\2\u06ad\u06ab\3\2\2\2\u06ae\u06b0\7v\2\2\u06af\u06ae\3\2\2\2\u06af"+
		"\u06b0\3\2\2\2\u06b0\u00d5\3\2\2\2\u06b1\u06b3\5\u0090I\2\u06b2\u06b1"+
		"\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5"+
		"\u06b7\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7\u06ba\5\u00f2z\2\u06b8\u06b9"+
		"\7x\2\2\u06b9\u06bb\5\u0120\u0091\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3"+
		"\2\2\2\u06bb\u00d7\3\2\2\2\u06bc\u06be\5\u00e2r\2\u06bd\u06bc\3\2\2\2"+
		"\u06bd\u06be\3\2\2\2\u06be\u06c3\3\2\2\2\u06bf\u06c4\5\u00dan\2\u06c0"+
		"\u06c4\5\u00dco\2\u06c1\u06c4\5\u00dep\2\u06c2\u06c4\5\u00e0q\2\u06c3"+
		"\u06bf\3\2\2\2\u06c3\u06c0\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c2\3\2"+
		"\2\2\u06c4\u00d9\3\2\2\2\u06c5\u06c6\7\22\2\2\u06c6\u06c7\5\u00a8U\2\u06c7"+
		"\u00db\3\2\2\2\u06c8\u06c9\7%\2\2\u06c9\u06ca\5\u009cO\2\u06ca\u06cb\5"+
		"\u00a8U\2\u06cb\u00dd\3\2\2\2\u06cc\u06cd\7%\2\2\u06cd\u06ce\7\21\2\2"+
		"\u06ce\u06cf\5\u00f2z\2\u06cf\u06d0\7i\2\2\u06d0\u06d1\5\u009cO\2\u06d1"+
		"\u06d2\5\u00a8U\2\u06d2\u00df\3\2\2\2\u06d3\u06d4\7\r\2\2\u06d4\u06d5"+
		"\5\u00f2z\2\u06d5\u06d6\7\20\2\2\u06d6\u06d7\5\u009cO\2\u06d7\u06d8\5"+
		"\u00a8U\2\u06d8\u00e1\3\2\2\2\u06d9\u06da\7S\2\2\u06da\u06db\7x\2\2\u06db"+
		"\u00e3\3\2\2\2\u06dc\u06dd\7\16\2\2\u06dd\u06de\5\u009cO\2\u06de\u06e5"+
		"\5\u00a8U\2\u06df\u06e3\7\b\2\2\u06e0\u06e4\5\u00a8U\2\u06e1\u06e4\5\u00e4"+
		"s\2\u06e2\u06e4\5\u00e6t\2\u06e3\u06e0\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3"+
		"\u06e2\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06df\3\2\2\2\u06e5\u06e6\3\2"+
		"\2\2\u06e6\u00e5\3\2\2\2\u06e7\u06e8\7\16\2\2\u06e8\u06e9\7\21\2\2\u06e9"+
		"\u06ea\5\u00f2z\2\u06ea\u06eb\7i\2\2\u06eb\u06ec\5\u009cO\2\u06ec\u06f3"+
		"\5\u00a8U\2\u06ed\u06f1\7\b\2\2\u06ee\u06f2\5\u00a8U\2\u06ef\u06f2\5\u00e4"+
		"s\2\u06f0\u06f2\5\u00e6t\2\u06f1\u06ee\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1"+
		"\u06f0\3\2\2\2\u06f2\u06f4\3\2\2\2\u06f3\u06ed\3\2\2\2\u06f3\u06f4\3\2"+
		"\2\2\u06f4\u00e7\3\2\2\2\u06f5\u06f6\7\23\2\2\u06f6\u06f7\5\u009cO\2\u06f7"+
		"\u06fb\7\177\2\2\u06f8\u06fa\5\u008eH\2\u06f9\u06f8\3\2\2\2\u06fa\u06fd"+
		"\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06ff\3\2\2\2\u06fd"+
		"\u06fb\3\2\2\2\u06fe\u0700\5\u00eav\2\u06ff\u06fe\3\2\2\2\u06ff\u0700"+
		"\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0702\7\u0080\2\2\u0702\u00e9\3\2\2"+
		"\2\u0703\u0704\5\u00eex\2\u0704\u0705\7{\2\2\u0705\u0706\5\u00ecw\2\u0706"+
		"\u0708\3\2\2\2\u0707\u0703\3\2\2\2\u0708\u070b\3\2\2\2\u0709\u0707\3\2"+
		"\2\2\u0709\u070a\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u0709\3\2\2\2\u070c"+
		"\u070d\5\u00eex\2\u070d\u070e\7{\2\2\u070e\u0710\5\u009cO\2\u070f\u0711"+
		"\7v\2\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u00eb\3\2\2\2\u0712"+
		"\u0713\5\u009cO\2\u0713\u0714\7v\2\2\u0714\u071a\3\2\2\2\u0715\u0717\5"+
		"\u00a2R\2\u0716\u0718\7v\2\2\u0717\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718"+
		"\u071a\3\2\2\2\u0719\u0712\3\2\2\2\u0719\u0715\3\2\2\2\u071a\u00ed\3\2"+
		"\2\2\u071b\u071d\5\u0090I\2\u071c\u071b\3\2\2\2\u071d\u0720\3\2\2\2\u071e"+
		"\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u071e\3\2"+
		"\2\2\u0721\u0723\5\u00f2z\2\u0722\u0724\5\u00f0y\2\u0723\u0722\3\2\2\2"+
		"\u0723\u0724\3\2\2\2\u0724\u00ef\3\2\2\2\u0725\u0726\7\16\2\2\u0726\u0727"+
		"\5\u009cO\2\u0727\u00f1\3\2\2\2\u0728\u072a\7\\\2\2\u0729\u0728\3\2\2"+
		"\2\u0729\u072a\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u0730\5\u00f4{\2\u072c"+
		"\u072d\7\\\2\2\u072d\u072f\5\u00f4{\2\u072e\u072c\3\2\2\2\u072f\u0732"+
		"\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u00f3\3\2\2\2\u0732"+
		"\u0730\3\2\2\2\u0733\u0736\5\u00f6|\2\u0734\u0736\5\u0100\u0081\2\u0735"+
		"\u0733\3\2\2\2\u0735\u0734\3\2\2\2\u0736\u00f5\3\2\2\2\u0737\u0744\5\u00f8"+
		"}\2\u0738\u0744\5\u00fa~\2\u0739\u0744\5\u00fc\177\2\u073a\u0744\5\u00fe"+
		"\u0080\2\u073b\u0744\5\u0104\u0083\2\u073c\u0744\5\u0106\u0084\2\u073d"+
		"\u0744\5\u0110\u0089\2\u073e\u0744\5\u0114\u008b\2\u073f\u0744\5\u0118"+
		"\u008d\2\u0740\u0744\5\u011a\u008e\2\u0741\u0744\5\u011e\u0090\2\u0742"+
		"\u0744\5\4\3\2\u0743\u0737\3\2\2\2\u0743\u0738\3\2\2\2\u0743\u0739\3\2"+
		"\2\2\u0743\u073a\3\2\2\2\u0743\u073b\3\2\2\2\u0743\u073c\3\2\2\2\u0743"+
		"\u073d\3\2\2\2\u0743\u073e\3\2\2\2\u0743\u073f\3\2\2\2\u0743\u0740\3\2"+
		"\2\2\u0743\u0741\3\2\2\2\u0743\u0742\3\2\2\2\u0744\u00f7\3\2\2\2\u0745"+
		"\u0756\7 \2\2\u0746\u0756\7\13\2\2\u0747\u0756\7G\2\2\u0748\u0756\7J\2"+
		"\2\u0749\u0756\7H\2\2\u074a\u0756\7I\2\2\u074b\u0756\7K\2\2\u074c\u0756"+
		"\7L\2\2\u074d\u074f\7U\2\2\u074e\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f"+
		"\u0750\3\2\2\2\u0750\u0756\7M\2\2\u0751\u0753\7U\2\2\u0752\u0751\3\2\2"+
		"\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756\7R\2\2\u0755\u0745"+
		"\3\2\2\2\u0755\u0746\3\2\2\2\u0755\u0747\3\2\2\2\u0755\u0748\3\2\2\2\u0755"+
		"\u0749\3\2\2\2\u0755\u074a\3\2\2\2\u0755\u074b\3\2\2\2\u0755\u074c\3\2"+
		"\2\2\u0755\u074e\3\2\2\2\u0755\u0752\3\2\2\2\u0756\u00f9\3\2\2\2\u0757"+
		"\u0759\7\30\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075b\3"+
		"\2\2\2\u075a\u075c\7\26\2\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u0760\5\u017c\u00bf\2\u075e\u075f\7p\2\2\u075f\u0761"+
		"\5\u00f2z\2\u0760\u075e\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u00fb\3\2\2"+
		"\2\u0762\u0763\7q\2\2\u0763\u00fd\3\2\2\2\u0764\u0765\7s\2\2\u0765\u00ff"+
		"\3\2\2\2\u0766\u0767\5\u0102\u0082\2\u0767\u0768\7u\2\2\u0768\u0769\5"+
		"\u0102\u0082\2\u0769\u0772\3\2\2\2\u076a\u076b\5\u0102\u0082\2\u076b\u076c"+
		"\7s\2\2\u076c\u0772\3\2\2\2\u076d\u076e\5\u0102\u0082\2\u076e\u076f\7"+
		"t\2\2\u076f\u0770\5\u0102\u0082\2\u0770\u0772\3\2\2\2\u0771\u0766\3\2"+
		"\2\2\u0771\u076a\3\2\2\2\u0771\u076d\3\2\2\2\u0772\u0101\3\2\2\2\u0773"+
		"\u077f\7G\2\2\u0774\u077f\7J\2\2\u0775\u0777\7U\2\2\u0776\u0775\3\2\2"+
		"\2\u0776\u0777\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u077f\7M\2\2\u0779\u077b"+
		"\7U\2\2\u077a\u0779\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\3\2\2\2\u077c"+
		"\u077f\7R\2\2\u077d\u077f\5\u011e\u0090\2\u077e\u0773\3\2\2\2\u077e\u0774"+
		"\3\2\2\2\u077e\u0776\3\2\2\2\u077e\u077a\3\2\2\2\u077e\u077d\3\2\2\2\u077f"+
		"\u0103\3\2\2\2\u0780\u0782\t\4\2\2\u0781\u0783\7\26\2\2\u0782\u0781\3"+
		"\2\2\2\u0782\u0783\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0785\5\u00f6|\2"+
		"\u0785\u0105\3\2\2\2\u0786\u0787\5\u0158\u00ad\2\u0787\u0789\7\177\2\2"+
		"\u0788\u078a\5\u0108\u0085\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a"+
		"\u078b\3\2\2\2\u078b\u078c\7\u0080\2\2\u078c\u0107\3\2\2\2\u078d\u0792"+
		"\5\u010a\u0086\2\u078e\u0790\7v\2\2\u078f\u0791\5\u010e\u0088\2\u0790"+
		"\u078f\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u0793\3\2\2\2\u0792\u078e\3\2"+
		"\2\2\u0792\u0793\3\2\2\2\u0793\u0796\3\2\2\2\u0794\u0796\5\u010e\u0088"+
		"\2\u0795\u078d\3\2\2\2\u0795\u0794\3\2\2\2\u0796\u0109\3\2\2\2\u0797\u079c"+
		"\5\u010c\u0087\2\u0798\u0799\7v\2\2\u0799\u079b\5\u010c\u0087\2\u079a"+
		"\u0798\3\2\2\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2"+
		"\2\2\u079d\u010b\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u07a1\5\u0090I\2\u07a0"+
		"\u079f\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a2\u07a3\3\2"+
		"\2\2\u07a3\u07b4\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a6\5\u00b4[\2\u07a6"+
		"\u07a7\7x\2\2\u07a7\u07a8\5\u00f2z\2\u07a8\u07b5\3\2\2\2\u07a9\u07aa\5"+
		"\u017c\u00bf\2\u07aa\u07ab\7x\2\2\u07ab\u07ac\5\u00f2z\2\u07ac\u07b5\3"+
		"\2\2\2\u07ad\u07af\7\30\2\2\u07ae\u07ad\3\2\2\2\u07ae\u07af\3\2\2\2\u07af"+
		"\u07b1\3\2\2\2\u07b0\u07b2\7\26\2\2\u07b1\u07b0\3\2\2\2\u07b1\u07b2\3"+
		"\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\5\u017c\u00bf\2\u07b4\u07a5\3\2"+
		"\2\2\u07b4\u07a9\3\2\2\2\u07b4\u07ae\3\2\2\2\u07b5\u010d\3\2\2\2\u07b6"+
		"\u07b8\5\u0090I\2\u07b7\u07b6\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7"+
		"\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bc\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bc"+
		"\u07bd\7s\2\2\u07bd\u010f\3\2\2\2\u07be\u07bf\5\u0158\u00ad\2\u07bf\u07c1"+
		"\7\u0083\2\2\u07c0\u07c2\5\u0112\u008a\2\u07c1\u07c0\3\2\2\2\u07c1\u07c2"+
		"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c4\7\u0084\2\2\u07c4\u0111\3\2\2"+
		"\2\u07c5\u07ca\5\u00f2z\2\u07c6\u07c7\7v\2\2\u07c7\u07c9\5\u00f2z\2\u07c8"+
		"\u07c6\3\2\2\2\u07c9\u07cc\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2"+
		"\2\2\u07cb\u07ce\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cd\u07cf\7v\2\2\u07ce"+
		"\u07cd\3\2\2\2\u07ce\u07cf\3\2\2\2\u07cf\u0113\3\2\2\2\u07d0\u07d2\7\u0083"+
		"\2\2\u07d1\u07d3\5\u0116\u008c\2\u07d2\u07d1\3\2\2\2\u07d2\u07d3\3\2\2"+
		"\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5\7\u0084\2\2\u07d5\u0115\3\2\2\2\u07d6"+
		"\u07d7\5\u00f2z\2\u07d7\u07d8\7v\2\2\u07d8\u07e5\3\2\2\2\u07d9\u07e5\5"+
		"\u00fe\u0080\2\u07da\u07dd\5\u00f2z\2\u07db\u07dc\7v\2\2\u07dc\u07de\5"+
		"\u00f2z\2\u07dd\u07db\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07dd\3\2\2\2"+
		"\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1\u07e3\7v\2\2\u07e2\u07e1"+
		"\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e5\3\2\2\2\u07e4\u07d6\3\2\2\2\u07e4"+
		"\u07d9\3\2\2\2\u07e4\u07da\3\2\2\2\u07e5\u0117\3\2\2\2\u07e6\u07e7\7\u0083"+
		"\2\2\u07e7\u07e8\5\u00f2z\2\u07e8\u07e9\7\u0084\2\2\u07e9\u0119\3\2\2"+
		"\2\u07ea\u07ec\7\u0081\2\2\u07eb\u07ed\5\u011c\u008f\2\u07ec\u07eb\3\2"+
		"\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07ef\7\u0082\2\2\u07ef"+
		"\u011b\3\2\2\2\u07f0\u07f5\5\u00f2z\2\u07f1\u07f2\7v\2\2\u07f2\u07f4\5"+
		"\u00f2z\2\u07f3\u07f1\3\2\2\2\u07f4\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2"+
		"\u07f5\u07f6\3\2\2\2\u07f6\u07f9\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f8\u07fa"+
		"\7v\2\2\u07f9\u07f8\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u011d\3\2\2\2\u07fb"+
		"\u07fe\5\u0158\u00ad\2\u07fc\u07fe\5\u016c\u00b7\2\u07fd\u07fb\3\2\2\2"+
		"\u07fd\u07fc\3\2\2\2\u07fe\u011f\3\2\2\2\u07ff\u0803\5\u0122\u0092\2\u0800"+
		"\u0803\5\u0144\u00a3\2\u0801\u0803\5\u0140\u00a1\2\u0802\u07ff\3\2\2\2"+
		"\u0802\u0800\3\2\2\2\u0802\u0801\3\2\2\2\u0803\u0121\3\2\2\2\u0804\u0813"+
		"\5\u0124\u0093\2\u0805\u0813\5\u0146\u00a4\2\u0806\u0813\5\u0142\u00a2"+
		"\2\u0807\u0813\5\u0172\u00ba\2\u0808\u0813\5\u0128\u0095\2\u0809\u0813"+
		"\5\u0126\u0094\2\u080a\u0813\5\u0130\u0099\2\u080b\u0813\5\u012e\u0098"+
		"\2\u080c\u0813\5\u012a\u0096\2\u080d\u0813\5\u012c\u0097\2\u080e\u0813"+
		"\5\u0148\u00a5\2\u080f\u0813\5\u0170\u00b9\2\u0810\u0813\5\u0132\u009a"+
		"\2\u0811\u0813\5\4\3\2\u0812\u0804\3\2\2\2\u0812\u0805\3\2\2\2\u0812\u0806"+
		"\3\2\2\2\u0812\u0807\3\2\2\2\u0812\u0808\3\2\2\2\u0812\u0809\3\2\2\2\u0812"+
		"\u080a\3\2\2\2\u0812\u080b\3\2\2\2\u0812\u080c\3\2\2\2\u0812\u080d\3\2"+
		"\2\2\u0812\u080e\3\2\2\2\u0812\u080f\3\2\2\2\u0812\u0810\3\2\2\2\u0812"+
		"\u0811\3\2\2\2\u0813\u0123\3\2\2\2\u0814\u0815\7\u0083\2\2\u0815\u0816"+
		"\5\u0120\u0091\2\u0816\u0817\7\u0084\2\2\u0817\u0125\3\2\2\2\u0818\u0819"+
		"\7Z\2\2\u0819\u0127\3\2\2\2\u081a\u0825\7\u0083\2\2\u081b\u081c\5\u0120"+
		"\u0091\2\u081c\u081d\7v\2\2\u081d\u081f\3\2\2\2\u081e\u081b\3\2\2\2\u081f"+
		"\u0820\3\2\2\2\u0820\u081e\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0823\3\2"+
		"\2\2\u0822\u0824\5\u0120\u0091\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2"+
		"\2\u0824\u0826\3\2\2\2\u0825\u081e\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0827"+
		"\3\2\2\2\u0827\u0828\7\u0084\2\2\u0828\u0129\3\2\2\2\u0829\u082a\7\u0081"+
		"\2\2\u082a\u082b\5\u0120\u0091\2\u082b\u082c\7w\2\2\u082c\u082d\5\u009c"+
		"O\2\u082d\u082e\7\u0082\2\2\u082e\u012b\3\2\2\2\u082f\u0830\7\u0081\2"+
		"\2\u0830\u0831\5\u0120\u0091\2\u0831\u0832\7\u0082\2\2\u0832\u012d\3\2"+
		"\2\2\u0833\u0835\7[\2\2\u0834\u0836\5\u0152\u00aa\2\u0835\u0834\3\2\2"+
		"\2\u0835\u0836\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0839\7\26\2\2\u0838"+
		"\u0837\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083b\5\u0122"+
		"\u0092\2\u083b\u012f\3\2\2\2\u083c\u083d\7V\2\2\u083d\u083e\t\13\2\2\u083e"+
		"\u083f\5\u0122\u0092\2\u083f\u0131\3\2\2\2\u0840\u0842\5\u008aF\2\u0841"+
		"\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\5\u0134"+
		"\u009b\2\u0844\u0845\7\f\2\2\u0845\u0847\7\u0083\2\2\u0846\u0848\5\u0138"+
		"\u009d\2\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0849\3\2\2\2\u0849"+
		"\u084b\7\u0084\2\2\u084a\u084c\5\u0136\u009c\2\u084b\u084a\3\2\2\2\u084b"+
		"\u084c\3\2\2\2\u084c\u0133\3\2\2\2\u084d\u084f\7\"\2\2\u084e\u084d\3\2"+
		"\2\2\u084e\u084f\3\2\2\2\u084f\u0854\3\2\2\2\u0850\u0852\7\n\2\2\u0851"+
		"\u0853\5:\36\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0855\3\2"+
		"\2\2\u0854\u0850\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0135\3\2\2\2\u0856"+
		"\u0857\7z\2\2\u0857\u0858\5\u0122\u0092\2\u0858\u0137\3\2\2\2\u0859\u085c"+
		"\5\u013a\u009e\2\u085a\u085c\5\u013e\u00a0\2\u085b\u0859\3\2\2\2\u085b"+
		"\u085a\3\2\2\2\u085c\u0139\3\2\2\2\u085d\u0862\5\u013c\u009f\2\u085e\u085f"+
		"\7v\2\2\u085f\u0861\5\u013c\u009f\2\u0860\u085e\3\2\2\2\u0861\u0864\3"+
		"\2\2\2\u0862\u0860\3\2\2\2\u0862\u0863\3\2\2\2\u0863\u0866\3\2\2\2\u0864"+
		"\u0862\3\2\2\2\u0865\u0867\7v\2\2\u0866\u0865\3\2\2\2\u0866\u0867\3\2"+
		"\2\2\u0867\u013b\3\2\2\2\u0868\u086a\5\u0090I\2\u0869\u0868\3\2\2\2\u086a"+
		"\u086d\3\2\2\2\u086b\u0869\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u0873\3\2"+
		"\2\2\u086d\u086b\3\2\2\2\u086e\u0871\5\u017c\u00bf\2\u086f\u0871\7q\2"+
		"\2\u0870\u086e\3\2\2\2\u0870\u086f\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874"+
		"\7x\2\2\u0873\u0870\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0875\3\2\2\2\u0875"+
		"\u0876\5\u0120\u0091\2\u0876\u013d\3\2\2\2\u0877\u0878\5\u013c\u009f\2"+
		"\u0878\u0879\7v\2\2\u0879\u087b\3\2\2\2\u087a\u0877\3\2\2\2\u087b\u087e"+
		"\3\2\2\2\u087c\u087a\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087f\3\2\2\2\u087e"+
		"\u087c\3\2\2\2\u087f\u0880\5\u013c\u009f\2\u0880\u0884\7v\2\2\u0881\u0883"+
		"\5\u0090I\2\u0882\u0881\3\2\2\2\u0883\u0886\3\2\2\2\u0884\u0882\3\2\2"+
		"\2\u0884\u0885\3\2\2\2\u0885\u0887\3\2\2\2\u0886\u0884\3\2\2\2\u0887\u0888"+
		"\7t\2\2\u0888\u013f\3\2\2\2\u0889\u088b\7(\2\2\u088a\u0889\3\2\2\2\u088a"+
		"\u088b\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\5\u014a\u00a6\2\u088d\u0141"+
		"\3\2\2\2\u088e\u0890\7(\2\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890"+
		"\u0891\3\2\2\2\u0891\u0892\5\u014e\u00a8\2\u0892\u0143\3\2\2\2\u0893\u0894"+
		"\7\17\2\2\u0894\u0895\5\u014a\u00a6\2\u0895\u0145\3\2\2\2\u0896\u0897"+
		"\7\17\2\2\u0897\u0898\5\u014e\u00a8\2\u0898\u0147\3\2\2\2\u0899\u089a"+
		"\7q\2\2\u089a\u0149\3\2\2\2\u089b\u08a0\5\u014c\u00a7\2\u089c\u089d\7"+
		"T\2\2\u089d\u089f\5\u014c\u00a7\2\u089e\u089c\3\2\2\2\u089f\u08a2\3\2"+
		"\2\2\u08a0\u089e\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2"+
		"\u08a0\3\2\2\2\u08a3\u08a5\7T\2\2\u08a4\u08a3\3\2\2\2\u08a4\u08a5\3\2"+
		"\2\2\u08a5\u014b\3\2\2\2\u08a6\u08a9\5\u0152\u00aa\2\u08a7\u08a9\5\u014e"+
		"\u00a8\2\u08a8\u08a6\3\2\2\2\u08a8\u08a7\3\2\2\2\u08a9\u014d\3\2\2\2\u08aa"+
		"\u08ac\7~\2\2\u08ab\u08aa\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\3\2"+
		"\2\2\u08ad\u08af\5\u008aF\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af"+
		"\u08b0\3\2\2\2\u08b0\u08bc\5\u0172\u00ba\2\u08b1\u08b3\7\u0083\2\2\u08b2"+
		"\u08b4\7~\2\2\u08b3\u08b2\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6\3\2"+
		"\2\2\u08b5\u08b7\5\u008aF\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08b8\3\2\2\2\u08b8\u08b9\5\u0172\u00ba\2\u08b9\u08ba\7\u0084\2\2\u08ba"+
		"\u08bc\3\2\2\2\u08bb\u08ab\3\2\2\2\u08bb\u08b1\3\2\2\2\u08bc\u014f\3\2"+
		"\2\2\u08bd\u08be\5\u0152\u00aa\2\u08be\u08bf\7T\2\2\u08bf\u08c1\3\2\2"+
		"\2\u08c0\u08bd\3\2\2\2\u08c1\u08c4\3\2\2\2\u08c2\u08c0\3\2\2\2\u08c2\u08c3"+
		"\3\2\2\2\u08c3\u08c6\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c5\u08c7\5\u0152\u00aa"+
		"\2\u08c6\u08c5\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u0151\3\2\2\2\u08c8\u08c9"+
		"\t\f\2\2\u08c9\u0153\3\2\2\2\u08ca\u08cc\7y\2\2\u08cb\u08ca\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08d2\5\u0156\u00ac\2\u08ce\u08cf"+
		"\7y\2\2\u08cf\u08d1\5\u0156\u00ac\2\u08d0\u08ce\3\2\2\2\u08d1\u08d4\3"+
		"\2\2\2\u08d2\u08d0\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3\u0155\3\2\2\2\u08d4"+
		"\u08d2\3\2\2\2\u08d5\u08db\5\u017c\u00bf\2\u08d6\u08db\7\36\2\2\u08d7"+
		"\u08db\7\32\2\2\u08d8\u08db\7\7\2\2\u08d9\u08db\7:\2\2\u08da\u08d5\3\2"+
		"\2\2\u08da\u08d6\3\2\2\2\u08da\u08d7\3\2\2\2\u08da\u08d8\3\2\2\2\u08da"+
		"\u08d9\3\2\2\2\u08db\u0157\3\2\2\2\u08dc\u08de\7y\2\2\u08dd\u08dc\3\2"+
		"\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e4\5\u015a\u00ae"+
		"\2\u08e0\u08e1\7y\2\2\u08e1\u08e3\5\u015a\u00ae\2\u08e2\u08e0\3\2\2\2"+
		"\u08e3\u08e6\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u0159"+
		"\3\2\2\2\u08e6\u08e4\3\2\2\2\u08e7\u08ea\5\u015c\u00af\2\u08e8\u08e9\7"+
		"y\2\2\u08e9\u08eb\5\u015e\u00b0\2\u08ea\u08e8\3\2\2\2\u08ea\u08eb\3\2"+
		"\2\2\u08eb\u015b\3\2\2\2\u08ec\u08f3\5\u017c\u00bf\2\u08ed\u08f3\7\36"+
		"\2\2\u08ee\u08f3\7\32\2\2\u08ef\u08f3\7\33\2\2\u08f0\u08f3\7\7\2\2\u08f1"+
		"\u08f3\7:\2\2\u08f2\u08ec\3\2\2\2\u08f2\u08ed\3\2\2\2\u08f2\u08ee\3\2"+
		"\2\2\u08f2\u08ef\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f1\3\2\2\2\u08f3"+
		"\u015d\3\2\2\2\u08f4\u08f5\7m\2\2\u08f5\u0920\7l\2\2\u08f6\u08f7\7m\2"+
		"\2\u08f7\u08fa\5\u0164\u00b3\2\u08f8\u08f9\7v\2\2\u08f9\u08fb\5\u0166"+
		"\u00b4\2\u08fa\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc"+
		"\u08fd\7v\2\2\u08fd\u08ff\5\u0168\u00b5\2\u08fe\u08fc\3\2\2\2\u08fe\u08ff"+
		"\3\2\2\2\u08ff\u0901\3\2\2\2\u0900\u0902\7v\2\2\u0901\u0900\3\2\2\2\u0901"+
		"\u0902\3\2\2\2\u0902\u0903\3\2\2\2\u0903\u0904\7l\2\2\u0904\u0920\3\2"+
		"\2\2\u0905\u0906\7m\2\2\u0906\u0909\5\u0166\u00b4\2\u0907\u0908\7v\2\2"+
		"\u0908\u090a\5\u0168\u00b5\2\u0909\u0907\3\2\2\2\u0909\u090a\3\2\2\2\u090a"+
		"\u090c\3\2\2\2\u090b\u090d\7v\2\2\u090c\u090b\3\2\2\2\u090c\u090d\3\2"+
		"\2\2\u090d\u090e\3\2\2\2\u090e\u090f\7l\2\2\u090f\u0920\3\2\2\2\u0910"+
		"\u0916\7m\2\2\u0911\u0912\5\u0160\u00b1\2\u0912\u0913\7v\2\2\u0913\u0915"+
		"\3\2\2\2\u0914\u0911\3\2\2\2\u0915\u0918\3\2\2\2\u0916\u0914\3\2\2\2\u0916"+
		"\u0917\3\2\2\2\u0917\u0919\3\2\2\2\u0918\u0916\3\2\2\2\u0919\u091b\5\u0160"+
		"\u00b1\2\u091a\u091c\7v\2\2\u091b\u091a\3\2\2\2\u091b\u091c\3\2\2\2\u091c"+
		"\u091d\3\2\2\2\u091d\u091e\7l\2\2\u091e\u0920\3\2\2\2\u091f\u08f4\3\2"+
		"\2\2\u091f\u08f6\3\2\2\2\u091f\u0905\3\2\2\2\u091f\u0910\3\2\2\2\u0920"+
		"\u015f\3\2\2\2\u0921\u0926\5\u0152\u00aa\2\u0922\u0926\5\u0120\u0091\2"+
		"\u0923\u0926\5\u0162\u00b2\2\u0924\u0926\5\u016a\u00b6\2\u0925\u0921\3"+
		"\2\2\2\u0925\u0922\3\2\2\2\u0925\u0923\3\2\2\2\u0925\u0924\3\2\2\2\u0926"+
		"\u0161\3\2\2\2\u0927\u092e\5\u00a8U\2\u0928\u092a\7U\2\2\u0929\u0928\3"+
		"\2\2\2\u0929\u092a\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092e\5\u00a4S\2"+
		"\u092c\u092e\5\u0156\u00ac\2\u092d\u0927\3\2\2\2\u092d\u0929\3\2\2\2\u092d"+
		"\u092c\3\2\2\2\u092e\u0163\3\2\2\2\u092f\u0934\5\u0152\u00aa\2\u0930\u0931"+
		"\7v\2\2\u0931\u0933\5\u0152\u00aa\2\u0932\u0930\3\2\2\2\u0933\u0936\3"+
		"\2\2\2\u0934\u0932\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0165\3\2\2\2\u0936"+
		"\u0934\3\2\2\2\u0937\u093c\5\u0120\u0091\2\u0938\u0939\7v\2\2\u0939\u093b"+
		"\5\u0120\u0091\2\u093a\u0938\3\2\2\2\u093b\u093e\3\2\2\2\u093c\u093a\3"+
		"\2\2\2\u093c\u093d\3\2\2\2\u093d\u0167\3\2\2\2\u093e\u093c\3\2\2\2\u093f"+
		"\u0944\5\u016a\u00b6\2\u0940\u0941\7v\2\2\u0941\u0943\5\u016a\u00b6\2"+
		"\u0942\u0940\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942\3\2\2\2\u0944\u0945"+
		"\3\2\2\2\u0945\u0169\3\2\2\2\u0946\u0944\3\2\2\2\u0947\u0948\5\u017c\u00bf"+
		"\2\u0948\u0949\7i\2\2\u0949\u094a\5\u0120\u0091\2\u094a\u016b\3\2\2\2"+
		"\u094b\u094e\5\u016e\u00b8\2\u094c\u094d\7y\2\2\u094d\u094f\5\u015a\u00ae"+
		"\2\u094e\u094c\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u094e\3\2\2\2\u0950\u0951"+
		"\3\2\2\2\u0951\u016d\3\2\2\2\u0952\u0953\7m\2\2\u0953\u0956\5\u0120\u0091"+
		"\2\u0954\u0955\7\3\2\2\u0955\u0957\5\u0172\u00ba\2\u0956\u0954\3\2\2\2"+
		"\u0956\u0957\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\7l\2\2\u0959\u016f"+
		"\3\2\2\2\u095a\u095d\5\u016e\u00b8\2\u095b\u095c\7y\2\2\u095c\u095e\5"+
		"\u0174\u00bb\2\u095d\u095b\3\2\2\2\u095e\u095f\3\2\2\2\u095f\u095d\3\2"+
		"\2\2\u095f\u0960\3\2\2\2\u0960\u0171\3\2\2\2\u0961\u0963\7y\2\2\u0962"+
		"\u0961\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0969\5\u0174"+
		"\u00bb\2\u0965\u0966\7y\2\2\u0966\u0968\5\u0174\u00bb\2\u0967\u0965\3"+
		"\2\2\2\u0968\u096b\3\2\2\2\u0969\u0967\3\2\2\2\u0969\u096a\3\2\2\2\u096a"+
		"\u0173\3\2\2\2\u096b\u0969\3\2\2\2\u096c\u096e\5\u015c\u00af\2\u096d\u096f"+
		"\7y\2\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0972\3\2\2\2\u0970"+
		"\u0973\5\u015e\u00b0\2\u0971\u0973\5\u0176\u00bc\2\u0972\u0970\3\2\2\2"+
		"\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0175\3\2\2\2\u0974\u0976"+
		"\7\u0083\2\2\u0975\u0977\5\u0178\u00bd\2\u0976\u0975\3\2\2\2\u0976\u0977";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u097b\7\u0084\2\2\u0979\u097a\7z\2"+
		"\2\u097a\u097c\5\u0120\u0091\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2"+
		"\u097c\u0177\3\2\2\2\u097d\u0982\5\u0120\u0091\2\u097e\u097f\7v\2\2\u097f"+
		"\u0981\5\u0120\u0091\2\u0980\u097e\3\2\2\2\u0981\u0984\3\2\2\2\u0982\u0980"+
		"\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0986\3\2\2\2\u0984\u0982\3\2\2\2\u0985"+
		"\u0987\7v\2\2\u0986\u0985\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0179\3\2"+
		"\2\2\u0988\u0992\7\27\2\2\u0989\u098f\7\u0083\2\2\u098a\u0990\7\7\2\2"+
		"\u098b\u0990\7\32\2\2\u098c\u0990\7\36\2\2\u098d\u098e\7\20\2\2\u098e"+
		"\u0990\5\u0154\u00ab\2\u098f\u098a\3\2\2\2\u098f\u098b\3\2\2\2\u098f\u098c"+
		"\3\2\2\2\u098f\u098d\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993\7\u0084\2"+
		"\2\u0992\u0989\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u017b\3\2\2\2\u0994\u0995"+
		"\t\r\2\2\u0995\u017d\3\2\2\2\u0996\u0997\t\16\2\2\u0997\u017f\3\2\2\2"+
		"\u0998\u099f\5\u017e\u00c0\2\u0999\u099f\5\u017c\u00bf\2\u099a\u099f\7"+
		"8\2\2\u099b\u099f\79\2\2\u099c\u099f\7:\2\2\u099d\u099f\7S\2\2\u099e\u0998"+
		"\3\2\2\2\u099e\u0999\3\2\2\2\u099e\u099a\3\2\2\2\u099e\u099b\3\2\2\2\u099e"+
		"\u099c\3\2\2\2\u099e\u099d\3\2\2\2\u099f\u0181\3\2\2\2\u09a0\u09a1\5\u00a4"+
		"S\2\u09a1\u0183\3\2\2\2\u09a2\u09a3\t\17\2\2\u09a3\u0185\3\2\2\2\u09a4"+
		"\u09a5\7m\2\2\u09a5\u09a6\6\u00c4\27\2\u09a6\u09a7\7m\2\2\u09a7\u0187"+
		"\3\2\2\2\u09a8\u09a9\7l\2\2\u09a9\u09aa\6\u00c5\30\2\u09aa\u09ab\7l\2"+
		"\2\u09ab\u0189\3\2\2\2\u015b\u018d\u0193\u01a0\u01a8\u01b0\u01b4\u01b9"+
		"\u01bc\u01c3\u01cb\u01d7\u01e3\u01e8\u01fd\u0204\u0208\u0212\u021a\u0222"+
		"\u0226\u022b\u0231\u023a\u023e\u0242\u0248\u0250\u0259\u025e\u0261\u0270"+
		"\u0274\u0277\u0280\u0286\u028a\u0290\u0296\u029b\u02a2\u02a5\u02ae\u02b2"+
		"\u02b4\u02b7\u02bd\u02bf\u02c1\u02c7\u02cb\u02cf\u02d2\u02d6\u02d9\u02dc"+
		"\u02df\u02e3\u02e5\u02eb\u02f0\u02f7\u02fb\u02fd\u0302\u0307\u030b\u030d"+
		"\u0310\u0315\u031e\u0324\u032a\u0332\u0335\u0339\u033f\u0344\u0347\u034b"+
		"\u034f\u0354\u0358\u035c\u0365\u0369\u036e\u0372\u037d\u0381\u0386\u038a"+
		"\u0391\u0394\u0398\u03a1\u03a5\u03aa\u03ae\u03b4\u03b8\u03be\u03c8\u03cb"+
		"\u03d4\u03da\u03e0\u03e7\u03ec\u03f1\u03f5\u03f7\u03fa\u0400\u0406\u040d"+
		"\u0411\u0415\u041b\u0421\u0427\u042b\u042e\u0434\u043a\u0440\u0446\u044a"+
		"\u0450\u0456\u045e\u0463\u0467\u0469\u0471\u0476\u0478\u047f\u0485\u0488"+
		"\u048d\u0490\u0495\u0497\u049b\u04a8\u04ac\u04b0\u04b7\u04bc\u04c4\u04c9"+
		"\u04ce\u04d0\u04df\u04e4\u04eb\u04f0\u04f7\u04fb\u0504\u0506\u050c\u0514"+
		"\u051d\u0523\u0526\u052a\u052d\u0531\u0537\u0541\u0545\u054c\u0550\u0558"+
		"\u0563\u0589\u0599\u05a9\u05ab\u05ad\u05b7\u05c2\u05c8\u05ce\u05d2\u05d9"+
		"\u05dc\u05df\u05e3\u05ef\u05f3\u05f9\u0600\u0603\u060a\u0611\u0616\u061f"+
		"\u0625\u0627\u062c\u0632\u0637\u0641\u0649\u064d\u064f\u0658\u065d\u0666"+
		"\u066a\u066f\u0674\u067d\u0681\u0683\u068e\u0692\u0695\u069a\u069d\u06a4"+
		"\u06ab\u06af\u06b4\u06ba\u06bd\u06c3\u06e3\u06e5\u06f1\u06f3\u06fb\u06ff"+
		"\u0709\u0710\u0717\u0719\u071e\u0723\u0729\u0730\u0735\u0743\u074e\u0752"+
		"\u0755\u0758\u075b\u0760\u0771\u0776\u077a\u077e\u0782\u0789\u0790\u0792"+
		"\u0795\u079c\u07a2\u07ae\u07b1\u07b4\u07b9\u07c1\u07ca\u07ce\u07d2\u07df"+
		"\u07e2\u07e4\u07ec\u07f5\u07f9\u07fd\u0802\u0812\u0820\u0823\u0825\u0835"+
		"\u0838\u0841\u0847\u084b\u084e\u0852\u0854\u085b\u0862\u0866\u086b\u0870"+
		"\u0873\u087c\u0884\u088a\u088f\u08a0\u08a4\u08a8\u08ab\u08ae\u08b3\u08b6"+
		"\u08bb\u08c2\u08c6\u08cb\u08d2\u08da\u08dd\u08e4\u08ea\u08f2\u08fa\u08fe"+
		"\u0901\u0909\u090c\u0916\u091b\u091f\u0925\u0929\u092d\u0934\u093c\u0944"+
		"\u0950\u0956\u095f\u0962\u0969\u096e\u0972\u0976\u097b\u0982\u0986\u098f"+
		"\u0992\u099e";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}