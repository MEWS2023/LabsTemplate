package at.ac.tuwien.big.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.services.ScmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartCity'", "'{'", "'}'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalScmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScml.g"; }


    	private ScmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(ScmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSmartCity"
    // InternalScml.g:53:1: entryRuleSmartCity : ruleSmartCity EOF ;
    public final void entryRuleSmartCity() throws RecognitionException {
        try {
            // InternalScml.g:54:1: ( ruleSmartCity EOF )
            // InternalScml.g:55:1: ruleSmartCity EOF
            {
             before(grammarAccess.getSmartCityRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartCity();

            state._fsp--;

             after(grammarAccess.getSmartCityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartCity"


    // $ANTLR start "ruleSmartCity"
    // InternalScml.g:62:1: ruleSmartCity : ( ( rule__SmartCity__Group__0 ) ) ;
    public final void ruleSmartCity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:66:2: ( ( ( rule__SmartCity__Group__0 ) ) )
            // InternalScml.g:67:2: ( ( rule__SmartCity__Group__0 ) )
            {
            // InternalScml.g:67:2: ( ( rule__SmartCity__Group__0 ) )
            // InternalScml.g:68:3: ( rule__SmartCity__Group__0 )
            {
             before(grammarAccess.getSmartCityAccess().getGroup()); 
            // InternalScml.g:69:3: ( rule__SmartCity__Group__0 )
            // InternalScml.g:69:4: rule__SmartCity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartCity"


    // $ANTLR start "entryRuleEString"
    // InternalScml.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalScml.g:79:1: ( ruleEString EOF )
            // InternalScml.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalScml.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalScml.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalScml.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalScml.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalScml.g:94:3: ( rule__EString__Alternatives )
            // InternalScml.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalScml.g:102:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:106:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalScml.g:107:2: ( RULE_STRING )
                    {
                    // InternalScml.g:107:2: ( RULE_STRING )
                    // InternalScml.g:108:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:113:2: ( RULE_ID )
                    {
                    // InternalScml.g:113:2: ( RULE_ID )
                    // InternalScml.g:114:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SmartCity__Group__0"
    // InternalScml.g:123:1: rule__SmartCity__Group__0 : rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1 ;
    public final void rule__SmartCity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:127:1: ( rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1 )
            // InternalScml.g:128:2: rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SmartCity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__0"


    // $ANTLR start "rule__SmartCity__Group__0__Impl"
    // InternalScml.g:135:1: rule__SmartCity__Group__0__Impl : ( () ) ;
    public final void rule__SmartCity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:139:1: ( ( () ) )
            // InternalScml.g:140:1: ( () )
            {
            // InternalScml.g:140:1: ( () )
            // InternalScml.g:141:2: ()
            {
             before(grammarAccess.getSmartCityAccess().getSmartCityAction_0()); 
            // InternalScml.g:142:2: ()
            // InternalScml.g:142:3: 
            {
            }

             after(grammarAccess.getSmartCityAccess().getSmartCityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__0__Impl"


    // $ANTLR start "rule__SmartCity__Group__1"
    // InternalScml.g:150:1: rule__SmartCity__Group__1 : rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2 ;
    public final void rule__SmartCity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:154:1: ( rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2 )
            // InternalScml.g:155:2: rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SmartCity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__1"


    // $ANTLR start "rule__SmartCity__Group__1__Impl"
    // InternalScml.g:162:1: rule__SmartCity__Group__1__Impl : ( 'SmartCity' ) ;
    public final void rule__SmartCity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:166:1: ( ( 'SmartCity' ) )
            // InternalScml.g:167:1: ( 'SmartCity' )
            {
            // InternalScml.g:167:1: ( 'SmartCity' )
            // InternalScml.g:168:2: 'SmartCity'
            {
             before(grammarAccess.getSmartCityAccess().getSmartCityKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getSmartCityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__1__Impl"


    // $ANTLR start "rule__SmartCity__Group__2"
    // InternalScml.g:177:1: rule__SmartCity__Group__2 : rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3 ;
    public final void rule__SmartCity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:181:1: ( rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3 )
            // InternalScml.g:182:2: rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SmartCity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__2"


    // $ANTLR start "rule__SmartCity__Group__2__Impl"
    // InternalScml.g:189:1: rule__SmartCity__Group__2__Impl : ( ( rule__SmartCity__NameAssignment_2 ) ) ;
    public final void rule__SmartCity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:193:1: ( ( ( rule__SmartCity__NameAssignment_2 ) ) )
            // InternalScml.g:194:1: ( ( rule__SmartCity__NameAssignment_2 ) )
            {
            // InternalScml.g:194:1: ( ( rule__SmartCity__NameAssignment_2 ) )
            // InternalScml.g:195:2: ( rule__SmartCity__NameAssignment_2 )
            {
             before(grammarAccess.getSmartCityAccess().getNameAssignment_2()); 
            // InternalScml.g:196:2: ( rule__SmartCity__NameAssignment_2 )
            // InternalScml.g:196:3: rule__SmartCity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__2__Impl"


    // $ANTLR start "rule__SmartCity__Group__3"
    // InternalScml.g:204:1: rule__SmartCity__Group__3 : rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4 ;
    public final void rule__SmartCity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:208:1: ( rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4 )
            // InternalScml.g:209:2: rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SmartCity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__3"


    // $ANTLR start "rule__SmartCity__Group__3__Impl"
    // InternalScml.g:216:1: rule__SmartCity__Group__3__Impl : ( '{' ) ;
    public final void rule__SmartCity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:220:1: ( ( '{' ) )
            // InternalScml.g:221:1: ( '{' )
            {
            // InternalScml.g:221:1: ( '{' )
            // InternalScml.g:222:2: '{'
            {
             before(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__3__Impl"


    // $ANTLR start "rule__SmartCity__Group__4"
    // InternalScml.g:231:1: rule__SmartCity__Group__4 : rule__SmartCity__Group__4__Impl ;
    public final void rule__SmartCity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:235:1: ( rule__SmartCity__Group__4__Impl )
            // InternalScml.g:236:2: rule__SmartCity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__4"


    // $ANTLR start "rule__SmartCity__Group__4__Impl"
    // InternalScml.g:242:1: rule__SmartCity__Group__4__Impl : ( '}' ) ;
    public final void rule__SmartCity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:246:1: ( ( '}' ) )
            // InternalScml.g:247:1: ( '}' )
            {
            // InternalScml.g:247:1: ( '}' )
            // InternalScml.g:248:2: '}'
            {
             before(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__Group__4__Impl"


    // $ANTLR start "rule__SmartCity__NameAssignment_2"
    // InternalScml.g:258:1: rule__SmartCity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SmartCity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:262:1: ( ( ruleEString ) )
            // InternalScml.g:263:2: ( ruleEString )
            {
            // InternalScml.g:263:2: ( ruleEString )
            // InternalScml.g:264:3: ruleEString
            {
             before(grammarAccess.getSmartCityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartCityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartCity__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}