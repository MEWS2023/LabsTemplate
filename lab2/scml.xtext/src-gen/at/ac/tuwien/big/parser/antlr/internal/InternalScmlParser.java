package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.ScmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScmlParser extends AbstractInternalAntlrParser {
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

        public InternalScmlParser(TokenStream input, ScmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartCity";
       	}

       	@Override
       	protected ScmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartCity"
    // InternalScml.g:64:1: entryRuleSmartCity returns [EObject current=null] : iv_ruleSmartCity= ruleSmartCity EOF ;
    public final EObject entryRuleSmartCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCity = null;


        try {
            // InternalScml.g:64:50: (iv_ruleSmartCity= ruleSmartCity EOF )
            // InternalScml.g:65:2: iv_ruleSmartCity= ruleSmartCity EOF
            {
             newCompositeNode(grammarAccess.getSmartCityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartCity=ruleSmartCity();

            state._fsp--;

             current =iv_ruleSmartCity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartCity"


    // $ANTLR start "ruleSmartCity"
    // InternalScml.g:71:1: ruleSmartCity returns [EObject current=null] : ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleSmartCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalScml.g:77:2: ( ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalScml.g:78:2: ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalScml.g:78:2: ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalScml.g:79:3: () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalScml.g:79:3: ()
            // InternalScml.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmartCityAccess().getSmartCityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmartCityAccess().getSmartCityKeyword_1());
            		
            // InternalScml.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalScml.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalScml.g:91:4: (lv_name_2_0= ruleEString )
            // InternalScml.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSmartCityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartCityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartCity"


    // $ANTLR start "entryRuleEString"
    // InternalScml.g:121:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalScml.g:121:47: (iv_ruleEString= ruleEString EOF )
            // InternalScml.g:122:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalScml.g:128:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalScml.g:134:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalScml.g:135:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalScml.g:135:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalScml.g:136:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScml.g:144:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});

}