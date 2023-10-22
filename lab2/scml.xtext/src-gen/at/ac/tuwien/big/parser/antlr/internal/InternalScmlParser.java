package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartCity'", "'{'", "'category'", "','", "'}'", "'project'", "'Category'", "'SDG'", "'Project'", "'('", "')'", "'component'", "'indicator'", "'-'", "'KPIMeasurementDevice'", "'status'", "'lastCalculation'", "'nextCalculation'", "'parameter'", "'Location'", "'Lat'", "'Long'", "'collected'", "'DataValue'", "'type'", "'value'", "'producedTime'", "'consumedTime'", "'Parameter'", "'unit'", "'goalreferencevalue'", "'observedValue'", "'BuildingComponent'", "'isPartOf'", "'composedOf'", "'location'", "'produces'", "'device'", "'TransportationComponent'", "'EnvironmentalComponent'", "'.'", "'E'", "'e'", "'GoalReferenceValue'", "'basis'", "'AggregatedValue'", "'aggregator'", "'aggregatedTime'", "'Basis'", "'description'", "'principleType'", "'source'", "'Sensor'", "'Actuator'", "'STRING'", "'BOOL'", "'INTEGER'", "'FLOAT'", "'AIRQUALITY'", "'WEATHER'", "'TRAFFIC'", "'ENERGY'", "'AGRICULTURAL'", "'NAVIGATION'", "'WASTEMANAGEMENT'", "'SAFETY'", "'LAW'", "'STANDARD'", "'POLICY'", "'SUM'", "'DIFF'", "'AVG'", "'MIN'", "'MAX'", "'GOOD'", "'WARN'", "'CRITICAL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
    // InternalScml.g:65:1: entryRuleSmartCity returns [EObject current=null] : iv_ruleSmartCity= ruleSmartCity EOF ;
    public final EObject entryRuleSmartCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartCity = null;


        try {
            // InternalScml.g:65:50: (iv_ruleSmartCity= ruleSmartCity EOF )
            // InternalScml.g:66:2: iv_ruleSmartCity= ruleSmartCity EOF
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
    // InternalScml.g:72:1: ruleSmartCity returns [EObject current=null] : ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )? (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleSmartCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_category_6_0 = null;

        EObject lv_category_8_0 = null;

        EObject lv_project_12_0 = null;

        EObject lv_project_14_0 = null;



        	enterRule();

        try {
            // InternalScml.g:78:2: ( ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )? (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalScml.g:79:2: ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )? (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalScml.g:79:2: ( () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )? (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalScml.g:80:3: () otherlv_1= 'SmartCity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )? (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalScml.g:80:3: ()
            // InternalScml.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmartCityAccess().getSmartCityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmartCityAccess().getSmartCityKeyword_1());
            		
            // InternalScml.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalScml.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalScml.g:92:4: (lv_name_2_0= ruleEString )
            // InternalScml.g:93:5: lv_name_2_0= ruleEString
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
            		
            // InternalScml.g:114:3: (otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalScml.g:115:4: otherlv_4= 'category' otherlv_5= '{' ( (lv_category_6_0= ruleCategory ) ) (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSmartCityAccess().getCategoryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalScml.g:123:4: ( (lv_category_6_0= ruleCategory ) )
                    // InternalScml.g:124:5: (lv_category_6_0= ruleCategory )
                    {
                    // InternalScml.g:124:5: (lv_category_6_0= ruleCategory )
                    // InternalScml.g:125:6: lv_category_6_0= ruleCategory
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_category_6_0=ruleCategory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						add(
                    							current,
                    							"category",
                    							lv_category_6_0,
                    							"at.ac.tuwien.big.Scml.Category");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:142:4: (otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalScml.g:143:5: otherlv_7= ',' ( (lv_category_8_0= ruleCategory ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSmartCityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalScml.g:147:5: ( (lv_category_8_0= ruleCategory ) )
                    	    // InternalScml.g:148:6: (lv_category_8_0= ruleCategory )
                    	    {
                    	    // InternalScml.g:148:6: (lv_category_8_0= ruleCategory )
                    	    // InternalScml.g:149:7: lv_category_8_0= ruleCategory
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_category_8_0=ruleCategory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"category",
                    	    								lv_category_8_0,
                    	    								"at.ac.tuwien.big.Scml.Category");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalScml.g:172:3: (otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalScml.g:173:4: otherlv_10= 'project' otherlv_11= '{' ( (lv_project_12_0= ruleProject ) ) (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSmartCityAccess().getProjectKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalScml.g:181:4: ( (lv_project_12_0= ruleProject ) )
                    // InternalScml.g:182:5: (lv_project_12_0= ruleProject )
                    {
                    // InternalScml.g:182:5: (lv_project_12_0= ruleProject )
                    // InternalScml.g:183:6: lv_project_12_0= ruleProject
                    {

                    						newCompositeNode(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_project_12_0=ruleProject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    						}
                    						add(
                    							current,
                    							"project",
                    							lv_project_12_0,
                    							"at.ac.tuwien.big.Scml.Project");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:200:4: (otherlv_13= ',' ( (lv_project_14_0= ruleProject ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalScml.g:201:5: otherlv_13= ',' ( (lv_project_14_0= ruleProject ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSmartCityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalScml.g:205:5: ( (lv_project_14_0= ruleProject ) )
                    	    // InternalScml.g:206:6: (lv_project_14_0= ruleProject )
                    	    {
                    	    // InternalScml.g:206:6: (lv_project_14_0= ruleProject )
                    	    // InternalScml.g:207:7: lv_project_14_0= ruleProject
                    	    {

                    	    							newCompositeNode(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_project_14_0=ruleProject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSmartCityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"project",
                    	    								lv_project_14_0,
                    	    								"at.ac.tuwien.big.Scml.Project");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleInfrastructureComponent"
    // InternalScml.g:238:1: entryRuleInfrastructureComponent returns [EObject current=null] : iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF ;
    public final EObject entryRuleInfrastructureComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureComponent = null;


        try {
            // InternalScml.g:238:64: (iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF )
            // InternalScml.g:239:2: iv_ruleInfrastructureComponent= ruleInfrastructureComponent EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfrastructureComponent=ruleInfrastructureComponent();

            state._fsp--;

             current =iv_ruleInfrastructureComponent; 
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
    // $ANTLR end "entryRuleInfrastructureComponent"


    // $ANTLR start "ruleInfrastructureComponent"
    // InternalScml.g:245:1: ruleInfrastructureComponent returns [EObject current=null] : (this_BuildingComponent_0= ruleBuildingComponent | this_TransportationComponent_1= ruleTransportationComponent | this_EnvironmentalComponent_2= ruleEnvironmentalComponent ) ;
    public final EObject ruleInfrastructureComponent() throws RecognitionException {
        EObject current = null;

        EObject this_BuildingComponent_0 = null;

        EObject this_TransportationComponent_1 = null;

        EObject this_EnvironmentalComponent_2 = null;



        	enterRule();

        try {
            // InternalScml.g:251:2: ( (this_BuildingComponent_0= ruleBuildingComponent | this_TransportationComponent_1= ruleTransportationComponent | this_EnvironmentalComponent_2= ruleEnvironmentalComponent ) )
            // InternalScml.g:252:2: (this_BuildingComponent_0= ruleBuildingComponent | this_TransportationComponent_1= ruleTransportationComponent | this_EnvironmentalComponent_2= ruleEnvironmentalComponent )
            {
            // InternalScml.g:252:2: (this_BuildingComponent_0= ruleBuildingComponent | this_TransportationComponent_1= ruleTransportationComponent | this_EnvironmentalComponent_2= ruleEnvironmentalComponent )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 50:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalScml.g:253:3: this_BuildingComponent_0= ruleBuildingComponent
                    {

                    			newCompositeNode(grammarAccess.getInfrastructureComponentAccess().getBuildingComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildingComponent_0=ruleBuildingComponent();

                    state._fsp--;


                    			current = this_BuildingComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalScml.g:262:3: this_TransportationComponent_1= ruleTransportationComponent
                    {

                    			newCompositeNode(grammarAccess.getInfrastructureComponentAccess().getTransportationComponentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransportationComponent_1=ruleTransportationComponent();

                    state._fsp--;


                    			current = this_TransportationComponent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalScml.g:271:3: this_EnvironmentalComponent_2= ruleEnvironmentalComponent
                    {

                    			newCompositeNode(grammarAccess.getInfrastructureComponentAccess().getEnvironmentalComponentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnvironmentalComponent_2=ruleEnvironmentalComponent();

                    state._fsp--;


                    			current = this_EnvironmentalComponent_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleInfrastructureComponent"


    // $ANTLR start "entryRuleDevice"
    // InternalScml.g:283:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalScml.g:283:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalScml.g:284:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalScml.g:290:1: ruleDevice returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalScml.g:296:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalScml.g:297:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalScml.g:297:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==63) ) {
                alt6=1;
            }
            else if ( (LA6_0==64) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalScml.g:298:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalScml.g:307:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getDeviceAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleEString"
    // InternalScml.g:319:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalScml.g:319:47: (iv_ruleEString= ruleEString EOF )
            // InternalScml.g:320:2: iv_ruleEString= ruleEString EOF
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
    // InternalScml.g:326:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalScml.g:332:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalScml.g:333:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalScml.g:333:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalScml.g:334:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScml.g:342:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleCategory"
    // InternalScml.g:353:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalScml.g:353:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalScml.g:354:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalScml.g:360:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'SDG' otherlv_4= '{' ( (lv_SDG_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_SDG_5_0 = null;

        AntlrDatatypeRuleToken lv_SDG_7_0 = null;



        	enterRule();

        try {
            // InternalScml.g:366:2: ( (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'SDG' otherlv_4= '{' ( (lv_SDG_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalScml.g:367:2: (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'SDG' otherlv_4= '{' ( (lv_SDG_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalScml.g:367:2: (otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'SDG' otherlv_4= '{' ( (lv_SDG_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalScml.g:368:3: otherlv_0= 'Category' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'SDG' otherlv_4= '{' ( (lv_SDG_5_0= ruleEInt ) ) (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalScml.g:372:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:373:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:373:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:374:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCategoryAccess().getSDGKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalScml.g:403:3: ( (lv_SDG_5_0= ruleEInt ) )
            // InternalScml.g:404:4: (lv_SDG_5_0= ruleEInt )
            {
            // InternalScml.g:404:4: (lv_SDG_5_0= ruleEInt )
            // InternalScml.g:405:5: lv_SDG_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_SDG_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoryRule());
            					}
            					add(
            						current,
            						"SDG",
            						lv_SDG_5_0,
            						"at.ac.tuwien.big.Scml.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:422:3: (otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalScml.g:423:4: otherlv_6= ',' ( (lv_SDG_7_0= ruleEInt ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCategoryAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalScml.g:427:4: ( (lv_SDG_7_0= ruleEInt ) )
            	    // InternalScml.g:428:5: (lv_SDG_7_0= ruleEInt )
            	    {
            	    // InternalScml.g:428:5: (lv_SDG_7_0= ruleEInt )
            	    // InternalScml.g:429:6: lv_SDG_7_0= ruleEInt
            	    {

            	    						newCompositeNode(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_SDG_7_0=ruleEInt();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCategoryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SDG",
            	    							lv_SDG_7_0,
            	    							"at.ac.tuwien.big.Scml.EInt");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleProject"
    // InternalScml.g:459:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalScml.g:459:48: (iv_ruleProject= ruleProject EOF )
            // InternalScml.g:460:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalScml.g:466:1: ruleProject returns [EObject current=null] : ( () otherlv_1= 'Project' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_component_12_0 = null;

        EObject lv_component_14_0 = null;

        EObject lv_indicator_18_0 = null;

        EObject lv_indicator_20_0 = null;



        	enterRule();

        try {
            // InternalScml.g:472:2: ( ( () otherlv_1= 'Project' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalScml.g:473:2: ( () otherlv_1= 'Project' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalScml.g:473:2: ( () otherlv_1= 'Project' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalScml.g:474:3: () otherlv_1= 'Project' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )? (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalScml.g:474:3: ()
            // InternalScml.g:475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getProjectKeyword_1());
            		
            // InternalScml.g:485:3: ( (lv_name_2_0= ruleEString ) )
            // InternalScml.g:486:4: (lv_name_2_0= ruleEString )
            {
            // InternalScml.g:486:4: (lv_name_2_0= ruleEString )
            // InternalScml.g:487:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalScml.g:508:3: (otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalScml.g:509:4: otherlv_4= 'category' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getCategoryKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalScml.g:517:4: ( ( ruleEString ) )
                    // InternalScml.g:518:5: ( ruleEString )
                    {
                    // InternalScml.g:518:5: ( ruleEString )
                    // InternalScml.g:519:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProjectRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:533:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalScml.g:534:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalScml.g:538:5: ( ( ruleEString ) )
                    	    // InternalScml.g:539:6: ( ruleEString )
                    	    {
                    	    // InternalScml.g:539:6: ( ruleEString )
                    	    // InternalScml.g:540:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProjectRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getProjectAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalScml.g:560:3: (otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalScml.g:561:4: otherlv_10= 'component' otherlv_11= '{' ( (lv_component_12_0= ruleInfrastructureComponent ) ) (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getProjectAccess().getComponentKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalScml.g:569:4: ( (lv_component_12_0= ruleInfrastructureComponent ) )
                    // InternalScml.g:570:5: (lv_component_12_0= ruleInfrastructureComponent )
                    {
                    // InternalScml.g:570:5: (lv_component_12_0= ruleInfrastructureComponent )
                    // InternalScml.g:571:6: lv_component_12_0= ruleInfrastructureComponent
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_component_12_0=ruleInfrastructureComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    						}
                    						add(
                    							current,
                    							"component",
                    							lv_component_12_0,
                    							"at.ac.tuwien.big.Scml.InfrastructureComponent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:588:4: (otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalScml.g:589:5: otherlv_13= ',' ( (lv_component_14_0= ruleInfrastructureComponent ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getProjectAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalScml.g:593:5: ( (lv_component_14_0= ruleInfrastructureComponent ) )
                    	    // InternalScml.g:594:6: (lv_component_14_0= ruleInfrastructureComponent )
                    	    {
                    	    // InternalScml.g:594:6: (lv_component_14_0= ruleInfrastructureComponent )
                    	    // InternalScml.g:595:7: lv_component_14_0= ruleInfrastructureComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_component_14_0=ruleInfrastructureComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"component",
                    	    								lv_component_14_0,
                    	    								"at.ac.tuwien.big.Scml.InfrastructureComponent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalScml.g:618:3: (otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalScml.g:619:4: otherlv_16= 'indicator' otherlv_17= '{' ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) ) (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getProjectAccess().getIndicatorKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalScml.g:627:4: ( (lv_indicator_18_0= ruleKPIMeasurementDevice ) )
                    // InternalScml.g:628:5: (lv_indicator_18_0= ruleKPIMeasurementDevice )
                    {
                    // InternalScml.g:628:5: (lv_indicator_18_0= ruleKPIMeasurementDevice )
                    // InternalScml.g:629:6: lv_indicator_18_0= ruleKPIMeasurementDevice
                    {

                    						newCompositeNode(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_indicator_18_0=ruleKPIMeasurementDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProjectRule());
                    						}
                    						add(
                    							current,
                    							"indicator",
                    							lv_indicator_18_0,
                    							"at.ac.tuwien.big.Scml.KPIMeasurementDevice");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:646:4: (otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalScml.g:647:5: otherlv_19= ',' ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getProjectAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalScml.g:651:5: ( (lv_indicator_20_0= ruleKPIMeasurementDevice ) )
                    	    // InternalScml.g:652:6: (lv_indicator_20_0= ruleKPIMeasurementDevice )
                    	    {
                    	    // InternalScml.g:652:6: (lv_indicator_20_0= ruleKPIMeasurementDevice )
                    	    // InternalScml.g:653:7: lv_indicator_20_0= ruleKPIMeasurementDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_indicator_20_0=ruleKPIMeasurementDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"indicator",
                    	    								lv_indicator_20_0,
                    	    								"at.ac.tuwien.big.Scml.KPIMeasurementDevice");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEInt"
    // InternalScml.g:684:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalScml.g:684:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalScml.g:685:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalScml.g:691:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalScml.g:697:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalScml.g:698:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalScml.g:698:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalScml.g:699:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalScml.g:699:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalScml.g:700:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleKPIMeasurementDevice"
    // InternalScml.g:717:1: entryRuleKPIMeasurementDevice returns [EObject current=null] : iv_ruleKPIMeasurementDevice= ruleKPIMeasurementDevice EOF ;
    public final EObject entryRuleKPIMeasurementDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIMeasurementDevice = null;


        try {
            // InternalScml.g:717:61: (iv_ruleKPIMeasurementDevice= ruleKPIMeasurementDevice EOF )
            // InternalScml.g:718:2: iv_ruleKPIMeasurementDevice= ruleKPIMeasurementDevice EOF
            {
             newCompositeNode(grammarAccess.getKPIMeasurementDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKPIMeasurementDevice=ruleKPIMeasurementDevice();

            state._fsp--;

             current =iv_ruleKPIMeasurementDevice; 
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
    // $ANTLR end "entryRuleKPIMeasurementDevice"


    // $ANTLR start "ruleKPIMeasurementDevice"
    // InternalScml.g:724:1: ruleKPIMeasurementDevice returns [EObject current=null] : (otherlv_0= 'KPIMeasurementDevice' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleStatus ) ) (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'nextCalculation' ( (lv_nextCalculation_12_0= ruleEString ) ) (otherlv_13= 'parameter' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleKPIMeasurementDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_lastCalculation_7_0 = null;

        AntlrDatatypeRuleToken lv_lastCalculation_9_0 = null;

        AntlrDatatypeRuleToken lv_nextCalculation_12_0 = null;



        	enterRule();

        try {
            // InternalScml.g:730:2: ( (otherlv_0= 'KPIMeasurementDevice' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleStatus ) ) (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'nextCalculation' ( (lv_nextCalculation_12_0= ruleEString ) ) (otherlv_13= 'parameter' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // InternalScml.g:731:2: (otherlv_0= 'KPIMeasurementDevice' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleStatus ) ) (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'nextCalculation' ( (lv_nextCalculation_12_0= ruleEString ) ) (otherlv_13= 'parameter' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // InternalScml.g:731:2: (otherlv_0= 'KPIMeasurementDevice' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleStatus ) ) (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'nextCalculation' ( (lv_nextCalculation_12_0= ruleEString ) ) (otherlv_13= 'parameter' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // InternalScml.g:732:3: otherlv_0= 'KPIMeasurementDevice' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'status' ( (lv_status_4_0= ruleStatus ) ) (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )? otherlv_11= 'nextCalculation' ( (lv_nextCalculation_12_0= ruleEString ) ) (otherlv_13= 'parameter' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKPIMeasurementDeviceAccess().getKPIMeasurementDeviceKeyword_0());
            		
            // InternalScml.g:736:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:737:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:737:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:738:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKPIMeasurementDeviceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getKPIMeasurementDeviceAccess().getStatusKeyword_3());
            		
            // InternalScml.g:763:3: ( (lv_status_4_0= ruleStatus ) )
            // InternalScml.g:764:4: (lv_status_4_0= ruleStatus )
            {
            // InternalScml.g:764:4: (lv_status_4_0= ruleStatus )
            // InternalScml.g:765:5: lv_status_4_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getStatusStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_status_4_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKPIMeasurementDeviceRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_4_0,
            						"at.ac.tuwien.big.Scml.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:782:3: (otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalScml.g:783:4: otherlv_5= 'lastCalculation' otherlv_6= '{' ( (lv_lastCalculation_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalScml.g:791:4: ( (lv_lastCalculation_7_0= ruleEString ) )
                    // InternalScml.g:792:5: (lv_lastCalculation_7_0= ruleEString )
                    {
                    // InternalScml.g:792:5: (lv_lastCalculation_7_0= ruleEString )
                    // InternalScml.g:793:6: lv_lastCalculation_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_lastCalculation_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getKPIMeasurementDeviceRule());
                    						}
                    						add(
                    							current,
                    							"lastCalculation",
                    							lv_lastCalculation_7_0,
                    							"at.ac.tuwien.big.Scml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:810:4: (otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalScml.g:811:5: otherlv_8= ',' ( (lv_lastCalculation_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getKPIMeasurementDeviceAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalScml.g:815:5: ( (lv_lastCalculation_9_0= ruleEString ) )
                    	    // InternalScml.g:816:6: (lv_lastCalculation_9_0= ruleEString )
                    	    {
                    	    // InternalScml.g:816:6: (lv_lastCalculation_9_0= ruleEString )
                    	    // InternalScml.g:817:7: lv_lastCalculation_9_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_lastCalculation_9_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getKPIMeasurementDeviceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"lastCalculation",
                    	    								lv_lastCalculation_9_0,
                    	    								"at.ac.tuwien.big.Scml.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationKeyword_6());
            		
            // InternalScml.g:844:3: ( (lv_nextCalculation_12_0= ruleEString ) )
            // InternalScml.g:845:4: (lv_nextCalculation_12_0= ruleEString )
            {
            // InternalScml.g:845:4: (lv_nextCalculation_12_0= ruleEString )
            // InternalScml.g:846:5: lv_nextCalculation_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_nextCalculation_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKPIMeasurementDeviceRule());
            					}
            					set(
            						current,
            						"nextCalculation",
            						lv_nextCalculation_12_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:863:3: (otherlv_13= 'parameter' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalScml.g:864:4: otherlv_13= 'parameter' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getKPIMeasurementDeviceAccess().getParameterKeyword_8_0());
                    			
                    // InternalScml.g:868:4: ( ( ruleEString ) )
                    // InternalScml.g:869:5: ( ruleEString )
                    {
                    // InternalScml.g:869:5: ( ruleEString )
                    // InternalScml.g:870:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getKPIMeasurementDeviceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getKPIMeasurementDeviceAccess().getParameterParameterCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleKPIMeasurementDevice"


    // $ANTLR start "entryRuleLocation"
    // InternalScml.g:893:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalScml.g:893:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalScml.g:894:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalScml.g:900:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'Lat' ( (lv_Lat_3_0= ruleEFloat ) ) otherlv_4= 'Long' ( (lv_Long_5_0= ruleEFloat ) ) otherlv_6= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Lat_3_0 = null;

        AntlrDatatypeRuleToken lv_Long_5_0 = null;



        	enterRule();

        try {
            // InternalScml.g:906:2: ( (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'Lat' ( (lv_Lat_3_0= ruleEFloat ) ) otherlv_4= 'Long' ( (lv_Long_5_0= ruleEFloat ) ) otherlv_6= '}' ) )
            // InternalScml.g:907:2: (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'Lat' ( (lv_Lat_3_0= ruleEFloat ) ) otherlv_4= 'Long' ( (lv_Long_5_0= ruleEFloat ) ) otherlv_6= '}' )
            {
            // InternalScml.g:907:2: (otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'Lat' ( (lv_Lat_3_0= ruleEFloat ) ) otherlv_4= 'Long' ( (lv_Long_5_0= ruleEFloat ) ) otherlv_6= '}' )
            // InternalScml.g:908:3: otherlv_0= 'Location' otherlv_1= '{' otherlv_2= 'Lat' ( (lv_Lat_3_0= ruleEFloat ) ) otherlv_4= 'Long' ( (lv_Long_5_0= ruleEFloat ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLatKeyword_2());
            		
            // InternalScml.g:920:3: ( (lv_Lat_3_0= ruleEFloat ) )
            // InternalScml.g:921:4: (lv_Lat_3_0= ruleEFloat )
            {
            // InternalScml.g:921:4: (lv_Lat_3_0= ruleEFloat )
            // InternalScml.g:922:5: lv_Lat_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLatEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_Lat_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"Lat",
            						lv_Lat_3_0,
            						"at.ac.tuwien.big.Scml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getLongKeyword_4());
            		
            // InternalScml.g:943:3: ( (lv_Long_5_0= ruleEFloat ) )
            // InternalScml.g:944:4: (lv_Long_5_0= ruleEFloat )
            {
            // InternalScml.g:944:4: (lv_Long_5_0= ruleEFloat )
            // InternalScml.g:945:5: lv_Long_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLongEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_Long_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"Long",
            						lv_Long_5_0,
            						"at.ac.tuwien.big.Scml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleDataValue"
    // InternalScml.g:970:1: entryRuleDataValue returns [EObject current=null] : iv_ruleDataValue= ruleDataValue EOF ;
    public final EObject entryRuleDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataValue = null;


        try {
            // InternalScml.g:970:50: (iv_ruleDataValue= ruleDataValue EOF )
            // InternalScml.g:971:2: iv_ruleDataValue= ruleDataValue EOF
            {
             newCompositeNode(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataValue=ruleDataValue();

            state._fsp--;

             current =iv_ruleDataValue; 
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
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalScml.g:977:1: ruleDataValue returns [EObject current=null] : ( ( (lv_collected_0_0= 'collected' ) ) otherlv_1= 'DataValue' otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'producedTime' ( (lv_producedTime_8_0= ruleEString ) ) (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleDataValue() throws RecognitionException {
        EObject current = null;

        Token lv_collected_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_producedTime_8_0 = null;

        AntlrDatatypeRuleToken lv_consumedTime_10_0 = null;



        	enterRule();

        try {
            // InternalScml.g:983:2: ( ( ( (lv_collected_0_0= 'collected' ) ) otherlv_1= 'DataValue' otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'producedTime' ( (lv_producedTime_8_0= ruleEString ) ) (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalScml.g:984:2: ( ( (lv_collected_0_0= 'collected' ) ) otherlv_1= 'DataValue' otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'producedTime' ( (lv_producedTime_8_0= ruleEString ) ) (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalScml.g:984:2: ( ( (lv_collected_0_0= 'collected' ) ) otherlv_1= 'DataValue' otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'producedTime' ( (lv_producedTime_8_0= ruleEString ) ) (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalScml.g:985:3: ( (lv_collected_0_0= 'collected' ) ) otherlv_1= 'DataValue' otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDataType ) ) otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) otherlv_7= 'producedTime' ( (lv_producedTime_8_0= ruleEString ) ) (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalScml.g:985:3: ( (lv_collected_0_0= 'collected' ) )
            // InternalScml.g:986:4: (lv_collected_0_0= 'collected' )
            {
            // InternalScml.g:986:4: (lv_collected_0_0= 'collected' )
            // InternalScml.g:987:5: lv_collected_0_0= 'collected'
            {
            lv_collected_0_0=(Token)match(input,33,FOLLOW_29); 

            					newLeafNode(lv_collected_0_0, grammarAccess.getDataValueAccess().getCollectedCollectedKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataValueRule());
            					}
            					setWithLastConsumed(current, "collected", lv_collected_0_0 != null, "collected");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDataValueAccess().getDataValueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getDataValueAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getDataValueAccess().getTypeKeyword_3());
            		
            // InternalScml.g:1011:3: ( (lv_type_4_0= ruleDataType ) )
            // InternalScml.g:1012:4: (lv_type_4_0= ruleDataType )
            {
            // InternalScml.g:1012:4: (lv_type_4_0= ruleDataType )
            // InternalScml.g:1013:5: lv_type_4_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getTypeDataTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_4_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"at.ac.tuwien.big.Scml.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDataValueAccess().getValueKeyword_5());
            		
            // InternalScml.g:1034:3: ( (lv_value_6_0= ruleEString ) )
            // InternalScml.g:1035:4: (lv_value_6_0= ruleEString )
            {
            // InternalScml.g:1035:4: (lv_value_6_0= ruleEString )
            // InternalScml.g:1036:5: lv_value_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getValueEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_33);
            lv_value_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getDataValueAccess().getProducedTimeKeyword_7());
            		
            // InternalScml.g:1057:3: ( (lv_producedTime_8_0= ruleEString ) )
            // InternalScml.g:1058:4: (lv_producedTime_8_0= ruleEString )
            {
            // InternalScml.g:1058:4: (lv_producedTime_8_0= ruleEString )
            // InternalScml.g:1059:5: lv_producedTime_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataValueAccess().getProducedTimeEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_34);
            lv_producedTime_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataValueRule());
            					}
            					set(
            						current,
            						"producedTime",
            						lv_producedTime_8_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1076:3: (otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalScml.g:1077:4: otherlv_9= 'consumedTime' ( (lv_consumedTime_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataValueAccess().getConsumedTimeKeyword_9_0());
                    			
                    // InternalScml.g:1081:4: ( (lv_consumedTime_10_0= ruleEString ) )
                    // InternalScml.g:1082:5: (lv_consumedTime_10_0= ruleEString )
                    {
                    // InternalScml.g:1082:5: (lv_consumedTime_10_0= ruleEString )
                    // InternalScml.g:1083:6: lv_consumedTime_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDataValueAccess().getConsumedTimeEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_consumedTime_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataValueRule());
                    						}
                    						set(
                    							current,
                    							"consumedTime",
                    							lv_consumedTime_10_0,
                    							"at.ac.tuwien.big.Scml.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDataValueAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleParameter"
    // InternalScml.g:1109:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalScml.g:1109:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalScml.g:1110:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalScml.g:1116:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleParameterType ) ) otherlv_7= 'component' ( ( ruleEString ) ) otherlv_9= 'goalreferencevalue' ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) ) (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_unit_4_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_goalreferencevalue_10_0 = null;

        EObject lv_observedValue_12_0 = null;



        	enterRule();

        try {
            // InternalScml.g:1122:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleParameterType ) ) otherlv_7= 'component' ( ( ruleEString ) ) otherlv_9= 'goalreferencevalue' ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) ) (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )? otherlv_13= '}' ) )
            // InternalScml.g:1123:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleParameterType ) ) otherlv_7= 'component' ( ( ruleEString ) ) otherlv_9= 'goalreferencevalue' ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) ) (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )? otherlv_13= '}' )
            {
            // InternalScml.g:1123:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleParameterType ) ) otherlv_7= 'component' ( ( ruleEString ) ) otherlv_9= 'goalreferencevalue' ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) ) (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )? otherlv_13= '}' )
            // InternalScml.g:1124:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleParameterType ) ) otherlv_7= 'component' ( ( ruleEString ) ) otherlv_9= 'goalreferencevalue' ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) ) (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalScml.g:1128:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:1129:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:1129:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:1130:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getUnitKeyword_3());
            		
            // InternalScml.g:1155:3: ( (lv_unit_4_0= ruleEString ) )
            // InternalScml.g:1156:4: (lv_unit_4_0= ruleEString )
            {
            // InternalScml.g:1156:4: (lv_unit_4_0= ruleEString )
            // InternalScml.g:1157:5: lv_unit_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getUnitEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_unit_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalScml.g:1178:3: ( (lv_type_6_0= ruleParameterType ) )
            // InternalScml.g:1179:4: (lv_type_6_0= ruleParameterType )
            {
            // InternalScml.g:1179:4: (lv_type_6_0= ruleParameterType )
            // InternalScml.g:1180:5: lv_type_6_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
            lv_type_6_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"at.ac.tuwien.big.Scml.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getComponentKeyword_7());
            		
            // InternalScml.g:1201:3: ( ( ruleEString ) )
            // InternalScml.g:1202:4: ( ruleEString )
            {
            // InternalScml.g:1202:4: ( ruleEString )
            // InternalScml.g:1203:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getComponentInfrastructureComponentCrossReference_8_0());
            				
            pushFollow(FOLLOW_38);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterAccess().getGoalreferencevalueKeyword_9());
            		
            // InternalScml.g:1221:3: ( (lv_goalreferencevalue_10_0= ruleGoalReferenceValue ) )
            // InternalScml.g:1222:4: (lv_goalreferencevalue_10_0= ruleGoalReferenceValue )
            {
            // InternalScml.g:1222:4: (lv_goalreferencevalue_10_0= ruleGoalReferenceValue )
            // InternalScml.g:1223:5: lv_goalreferencevalue_10_0= ruleGoalReferenceValue
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getGoalreferencevalueGoalReferenceValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_40);
            lv_goalreferencevalue_10_0=ruleGoalReferenceValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"goalreferencevalue",
            						lv_goalreferencevalue_10_0,
            						"at.ac.tuwien.big.Scml.GoalReferenceValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1240:3: (otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalScml.g:1241:4: otherlv_11= 'observedValue' ( (lv_observedValue_12_0= ruleAggregatedValue ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getObservedValueKeyword_11_0());
                    			
                    // InternalScml.g:1245:4: ( (lv_observedValue_12_0= ruleAggregatedValue ) )
                    // InternalScml.g:1246:5: (lv_observedValue_12_0= ruleAggregatedValue )
                    {
                    // InternalScml.g:1246:5: (lv_observedValue_12_0= ruleAggregatedValue )
                    // InternalScml.g:1247:6: lv_observedValue_12_0= ruleAggregatedValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getObservedValueAggregatedValueParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_observedValue_12_0=ruleAggregatedValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"observedValue",
                    							lv_observedValue_12_0,
                    							"at.ac.tuwien.big.Scml.AggregatedValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBuildingComponent"
    // InternalScml.g:1273:1: entryRuleBuildingComponent returns [EObject current=null] : iv_ruleBuildingComponent= ruleBuildingComponent EOF ;
    public final EObject entryRuleBuildingComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildingComponent = null;


        try {
            // InternalScml.g:1273:58: (iv_ruleBuildingComponent= ruleBuildingComponent EOF )
            // InternalScml.g:1274:2: iv_ruleBuildingComponent= ruleBuildingComponent EOF
            {
             newCompositeNode(grammarAccess.getBuildingComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildingComponent=ruleBuildingComponent();

            state._fsp--;

             current =iv_ruleBuildingComponent; 
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
    // $ANTLR end "entryRuleBuildingComponent"


    // $ANTLR start "ruleBuildingComponent"
    // InternalScml.g:1280:1: ruleBuildingComponent returns [EObject current=null] : (otherlv_0= 'BuildingComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleBuildingComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_location_12_0 = null;

        EObject lv_produces_15_0 = null;

        EObject lv_produces_17_0 = null;

        EObject lv_parameter_20_0 = null;

        EObject lv_device_23_0 = null;

        EObject lv_device_25_0 = null;



        	enterRule();

        try {
            // InternalScml.g:1286:2: ( (otherlv_0= 'BuildingComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalScml.g:1287:2: (otherlv_0= 'BuildingComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalScml.g:1287:2: (otherlv_0= 'BuildingComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalScml.g:1288:3: otherlv_0= 'BuildingComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBuildingComponentAccess().getBuildingComponentKeyword_0());
            		
            // InternalScml.g:1292:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:1293:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:1293:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:1294:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBuildingComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScml.g:1315:3: (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalScml.g:1316:4: otherlv_3= 'isPartOf' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBuildingComponentAccess().getIsPartOfKeyword_3_0());
                    			
                    // InternalScml.g:1320:4: ( ( ruleEString ) )
                    // InternalScml.g:1321:5: ( ruleEString )
                    {
                    // InternalScml.g:1321:5: ( ruleEString )
                    // InternalScml.g:1322:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBuildingComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBuildingComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalScml.g:1337:3: (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalScml.g:1338:4: otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getBuildingComponentAccess().getComposedOfKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getBuildingComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalScml.g:1346:4: ( ( ruleEString ) )
                    // InternalScml.g:1347:5: ( ruleEString )
                    {
                    // InternalScml.g:1347:5: ( ruleEString )
                    // InternalScml.g:1348:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBuildingComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1362:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalScml.g:1363:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getBuildingComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalScml.g:1367:5: ( ( ruleEString ) )
                    	    // InternalScml.g:1368:6: ( ruleEString )
                    	    {
                    	    // InternalScml.g:1368:6: ( ruleEString )
                    	    // InternalScml.g:1369:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBuildingComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getBuildingComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_11, grammarAccess.getBuildingComponentAccess().getLocationKeyword_5());
            		
            // InternalScml.g:1393:3: ( (lv_location_12_0= ruleLocation ) )
            // InternalScml.g:1394:4: (lv_location_12_0= ruleLocation )
            {
            // InternalScml.g:1394:4: (lv_location_12_0= ruleLocation )
            // InternalScml.g:1395:5: lv_location_12_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getBuildingComponentAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_46);
            lv_location_12_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_12_0,
            						"at.ac.tuwien.big.Scml.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1412:3: (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalScml.g:1413:4: otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getBuildingComponentAccess().getProducesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalScml.g:1421:4: ( (lv_produces_15_0= ruleDataValue ) )
                    // InternalScml.g:1422:5: (lv_produces_15_0= ruleDataValue )
                    {
                    // InternalScml.g:1422:5: (lv_produces_15_0= ruleDataValue )
                    // InternalScml.g:1423:6: lv_produces_15_0= ruleDataValue
                    {

                    						newCompositeNode(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_produces_15_0=ruleDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
                    						}
                    						add(
                    							current,
                    							"produces",
                    							lv_produces_15_0,
                    							"at.ac.tuwien.big.Scml.DataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1440:4: (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalScml.g:1441:5: otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getBuildingComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalScml.g:1445:5: ( (lv_produces_17_0= ruleDataValue ) )
                    	    // InternalScml.g:1446:6: (lv_produces_17_0= ruleDataValue )
                    	    {
                    	    // InternalScml.g:1446:6: (lv_produces_17_0= ruleDataValue )
                    	    // InternalScml.g:1447:7: lv_produces_17_0= ruleDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_produces_17_0=ruleDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"produces",
                    	    								lv_produces_17_0,
                    	    								"at.ac.tuwien.big.Scml.DataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_18, grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_49); 

            			newLeafNode(otherlv_19, grammarAccess.getBuildingComponentAccess().getParameterKeyword_8());
            		
            // InternalScml.g:1474:3: ( (lv_parameter_20_0= ruleParameter ) )
            // InternalScml.g:1475:4: (lv_parameter_20_0= ruleParameter )
            {
            // InternalScml.g:1475:4: (lv_parameter_20_0= ruleParameter )
            // InternalScml.g:1476:5: lv_parameter_20_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getBuildingComponentAccess().getParameterParameterParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_50);
            lv_parameter_20_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_20_0,
            						"at.ac.tuwien.big.Scml.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1493:3: (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalScml.g:1494:4: otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getBuildingComponentAccess().getDeviceKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_22, grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalScml.g:1502:4: ( (lv_device_23_0= ruleDevice ) )
                    // InternalScml.g:1503:5: (lv_device_23_0= ruleDevice )
                    {
                    // InternalScml.g:1503:5: (lv_device_23_0= ruleDevice )
                    // InternalScml.g:1504:6: lv_device_23_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_device_23_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
                    						}
                    						add(
                    							current,
                    							"device",
                    							lv_device_23_0,
                    							"at.ac.tuwien.big.Scml.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1521:4: (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalScml.g:1522:5: otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getBuildingComponentAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalScml.g:1526:5: ( (lv_device_25_0= ruleDevice ) )
                    	    // InternalScml.g:1527:6: (lv_device_25_0= ruleDevice )
                    	    {
                    	    // InternalScml.g:1527:6: (lv_device_25_0= ruleDevice )
                    	    // InternalScml.g:1528:7: lv_device_25_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_device_25_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBuildingComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"device",
                    	    								lv_device_25_0,
                    	    								"at.ac.tuwien.big.Scml.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBuildingComponent"


    // $ANTLR start "entryRuleTransportationComponent"
    // InternalScml.g:1559:1: entryRuleTransportationComponent returns [EObject current=null] : iv_ruleTransportationComponent= ruleTransportationComponent EOF ;
    public final EObject entryRuleTransportationComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransportationComponent = null;


        try {
            // InternalScml.g:1559:64: (iv_ruleTransportationComponent= ruleTransportationComponent EOF )
            // InternalScml.g:1560:2: iv_ruleTransportationComponent= ruleTransportationComponent EOF
            {
             newCompositeNode(grammarAccess.getTransportationComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransportationComponent=ruleTransportationComponent();

            state._fsp--;

             current =iv_ruleTransportationComponent; 
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
    // $ANTLR end "entryRuleTransportationComponent"


    // $ANTLR start "ruleTransportationComponent"
    // InternalScml.g:1566:1: ruleTransportationComponent returns [EObject current=null] : (otherlv_0= 'TransportationComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleTransportationComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_location_12_0 = null;

        EObject lv_produces_15_0 = null;

        EObject lv_produces_17_0 = null;

        EObject lv_parameter_20_0 = null;

        EObject lv_device_23_0 = null;

        EObject lv_device_25_0 = null;



        	enterRule();

        try {
            // InternalScml.g:1572:2: ( (otherlv_0= 'TransportationComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalScml.g:1573:2: (otherlv_0= 'TransportationComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalScml.g:1573:2: (otherlv_0= 'TransportationComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalScml.g:1574:3: otherlv_0= 'TransportationComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransportationComponentAccess().getTransportationComponentKeyword_0());
            		
            // InternalScml.g:1578:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:1579:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:1579:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:1580:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransportationComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScml.g:1601:3: (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalScml.g:1602:4: otherlv_3= 'isPartOf' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransportationComponentAccess().getIsPartOfKeyword_3_0());
                    			
                    // InternalScml.g:1606:4: ( ( ruleEString ) )
                    // InternalScml.g:1607:5: ( ruleEString )
                    {
                    // InternalScml.g:1607:5: ( ruleEString )
                    // InternalScml.g:1608:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransportationComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransportationComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalScml.g:1623:3: (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalScml.g:1624:4: otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransportationComponentAccess().getComposedOfKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransportationComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalScml.g:1632:4: ( ( ruleEString ) )
                    // InternalScml.g:1633:5: ( ruleEString )
                    {
                    // InternalScml.g:1633:5: ( ruleEString )
                    // InternalScml.g:1634:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransportationComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1648:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalScml.g:1649:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTransportationComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalScml.g:1653:5: ( ( ruleEString ) )
                    	    // InternalScml.g:1654:6: ( ruleEString )
                    	    {
                    	    // InternalScml.g:1654:6: ( ruleEString )
                    	    // InternalScml.g:1655:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransportationComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getTransportationComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_11, grammarAccess.getTransportationComponentAccess().getLocationKeyword_5());
            		
            // InternalScml.g:1679:3: ( (lv_location_12_0= ruleLocation ) )
            // InternalScml.g:1680:4: (lv_location_12_0= ruleLocation )
            {
            // InternalScml.g:1680:4: (lv_location_12_0= ruleLocation )
            // InternalScml.g:1681:5: lv_location_12_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getTransportationComponentAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_46);
            lv_location_12_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_12_0,
            						"at.ac.tuwien.big.Scml.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1698:3: (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalScml.g:1699:4: otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getTransportationComponentAccess().getProducesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalScml.g:1707:4: ( (lv_produces_15_0= ruleDataValue ) )
                    // InternalScml.g:1708:5: (lv_produces_15_0= ruleDataValue )
                    {
                    // InternalScml.g:1708:5: (lv_produces_15_0= ruleDataValue )
                    // InternalScml.g:1709:6: lv_produces_15_0= ruleDataValue
                    {

                    						newCompositeNode(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_produces_15_0=ruleDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
                    						}
                    						add(
                    							current,
                    							"produces",
                    							lv_produces_15_0,
                    							"at.ac.tuwien.big.Scml.DataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1726:4: (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalScml.g:1727:5: otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getTransportationComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalScml.g:1731:5: ( (lv_produces_17_0= ruleDataValue ) )
                    	    // InternalScml.g:1732:6: (lv_produces_17_0= ruleDataValue )
                    	    {
                    	    // InternalScml.g:1732:6: (lv_produces_17_0= ruleDataValue )
                    	    // InternalScml.g:1733:7: lv_produces_17_0= ruleDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_produces_17_0=ruleDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"produces",
                    	    								lv_produces_17_0,
                    	    								"at.ac.tuwien.big.Scml.DataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_18, grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_49); 

            			newLeafNode(otherlv_19, grammarAccess.getTransportationComponentAccess().getParameterKeyword_8());
            		
            // InternalScml.g:1760:3: ( (lv_parameter_20_0= ruleParameter ) )
            // InternalScml.g:1761:4: (lv_parameter_20_0= ruleParameter )
            {
            // InternalScml.g:1761:4: (lv_parameter_20_0= ruleParameter )
            // InternalScml.g:1762:5: lv_parameter_20_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getTransportationComponentAccess().getParameterParameterParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_50);
            lv_parameter_20_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_20_0,
            						"at.ac.tuwien.big.Scml.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1779:3: (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==48) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalScml.g:1780:4: otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getTransportationComponentAccess().getDeviceKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_22, grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalScml.g:1788:4: ( (lv_device_23_0= ruleDevice ) )
                    // InternalScml.g:1789:5: (lv_device_23_0= ruleDevice )
                    {
                    // InternalScml.g:1789:5: (lv_device_23_0= ruleDevice )
                    // InternalScml.g:1790:6: lv_device_23_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_device_23_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
                    						}
                    						add(
                    							current,
                    							"device",
                    							lv_device_23_0,
                    							"at.ac.tuwien.big.Scml.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1807:4: (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalScml.g:1808:5: otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getTransportationComponentAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalScml.g:1812:5: ( (lv_device_25_0= ruleDevice ) )
                    	    // InternalScml.g:1813:6: (lv_device_25_0= ruleDevice )
                    	    {
                    	    // InternalScml.g:1813:6: (lv_device_25_0= ruleDevice )
                    	    // InternalScml.g:1814:7: lv_device_25_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_device_25_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTransportationComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"device",
                    	    								lv_device_25_0,
                    	    								"at.ac.tuwien.big.Scml.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleTransportationComponent"


    // $ANTLR start "entryRuleEnvironmentalComponent"
    // InternalScml.g:1845:1: entryRuleEnvironmentalComponent returns [EObject current=null] : iv_ruleEnvironmentalComponent= ruleEnvironmentalComponent EOF ;
    public final EObject entryRuleEnvironmentalComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironmentalComponent = null;


        try {
            // InternalScml.g:1845:63: (iv_ruleEnvironmentalComponent= ruleEnvironmentalComponent EOF )
            // InternalScml.g:1846:2: iv_ruleEnvironmentalComponent= ruleEnvironmentalComponent EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentalComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironmentalComponent=ruleEnvironmentalComponent();

            state._fsp--;

             current =iv_ruleEnvironmentalComponent; 
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
    // $ANTLR end "entryRuleEnvironmentalComponent"


    // $ANTLR start "ruleEnvironmentalComponent"
    // InternalScml.g:1852:1: ruleEnvironmentalComponent returns [EObject current=null] : (otherlv_0= 'EnvironmentalComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleEnvironmentalComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_location_12_0 = null;

        EObject lv_produces_15_0 = null;

        EObject lv_produces_17_0 = null;

        EObject lv_parameter_20_0 = null;

        EObject lv_device_23_0 = null;

        EObject lv_device_25_0 = null;



        	enterRule();

        try {
            // InternalScml.g:1858:2: ( (otherlv_0= 'EnvironmentalComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalScml.g:1859:2: (otherlv_0= 'EnvironmentalComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalScml.g:1859:2: (otherlv_0= 'EnvironmentalComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalScml.g:1860:3: otherlv_0= 'EnvironmentalComponent' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )? (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= 'location' ( (lv_location_12_0= ruleLocation ) ) (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )? otherlv_19= 'parameter' ( (lv_parameter_20_0= ruleParameter ) ) (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnvironmentalComponentAccess().getEnvironmentalComponentKeyword_0());
            		
            // InternalScml.g:1864:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:1865:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:1865:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:1866:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScml.g:1887:3: (otherlv_3= 'isPartOf' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalScml.g:1888:4: otherlv_3= 'isPartOf' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnvironmentalComponentAccess().getIsPartOfKeyword_3_0());
                    			
                    // InternalScml.g:1892:4: ( ( ruleEString ) )
                    // InternalScml.g:1893:5: ( ruleEString )
                    {
                    // InternalScml.g:1893:5: ( ruleEString )
                    // InternalScml.g:1894:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentalComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalScml.g:1909:3: (otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalScml.g:1910:4: otherlv_5= 'composedOf' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,45,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEnvironmentalComponentAccess().getComposedOfKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentalComponentAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalScml.g:1918:4: ( ( ruleEString ) )
                    // InternalScml.g:1919:5: ( ruleEString )
                    {
                    // InternalScml.g:1919:5: ( ruleEString )
                    // InternalScml.g:1920:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEnvironmentalComponentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:1934:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==14) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalScml.g:1935:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalScml.g:1939:5: ( ( ruleEString ) )
                    	    // InternalScml.g:1940:6: ( ruleEString )
                    	    {
                    	    // InternalScml.g:1940:6: ( ruleEString )
                    	    // InternalScml.g:1941:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEnvironmentalComponentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_44); 

                    				newLeafNode(otherlv_10, grammarAccess.getEnvironmentalComponentAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_11, grammarAccess.getEnvironmentalComponentAccess().getLocationKeyword_5());
            		
            // InternalScml.g:1965:3: ( (lv_location_12_0= ruleLocation ) )
            // InternalScml.g:1966:4: (lv_location_12_0= ruleLocation )
            {
            // InternalScml.g:1966:4: (lv_location_12_0= ruleLocation )
            // InternalScml.g:1967:5: lv_location_12_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_46);
            lv_location_12_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
            					}
            					set(
            						current,
            						"location",
            						lv_location_12_0,
            						"at.ac.tuwien.big.Scml.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:1984:3: (otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalScml.g:1985:4: otherlv_13= 'produces' otherlv_14= '{' ( (lv_produces_15_0= ruleDataValue ) ) (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,47,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEnvironmentalComponentAccess().getProducesKeyword_7_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalScml.g:1993:4: ( (lv_produces_15_0= ruleDataValue ) )
                    // InternalScml.g:1994:5: (lv_produces_15_0= ruleDataValue )
                    {
                    // InternalScml.g:1994:5: (lv_produces_15_0= ruleDataValue )
                    // InternalScml.g:1995:6: lv_produces_15_0= ruleDataValue
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_produces_15_0=ruleDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
                    						}
                    						add(
                    							current,
                    							"produces",
                    							lv_produces_15_0,
                    							"at.ac.tuwien.big.Scml.DataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:2012:4: (otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==14) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalScml.g:2013:5: otherlv_16= ',' ( (lv_produces_17_0= ruleDataValue ) )
                    	    {
                    	    otherlv_16=(Token)match(input,14,FOLLOW_47); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalScml.g:2017:5: ( (lv_produces_17_0= ruleDataValue ) )
                    	    // InternalScml.g:2018:6: (lv_produces_17_0= ruleDataValue )
                    	    {
                    	    // InternalScml.g:2018:6: (lv_produces_17_0= ruleDataValue )
                    	    // InternalScml.g:2019:7: lv_produces_17_0= ruleDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_produces_17_0=ruleDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"produces",
                    	    								lv_produces_17_0,
                    	    								"at.ac.tuwien.big.Scml.DataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_18, grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_49); 

            			newLeafNode(otherlv_19, grammarAccess.getEnvironmentalComponentAccess().getParameterKeyword_8());
            		
            // InternalScml.g:2046:3: ( (lv_parameter_20_0= ruleParameter ) )
            // InternalScml.g:2047:4: (lv_parameter_20_0= ruleParameter )
            {
            // InternalScml.g:2047:4: (lv_parameter_20_0= ruleParameter )
            // InternalScml.g:2048:5: lv_parameter_20_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getParameterParameterParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_50);
            lv_parameter_20_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_20_0,
            						"at.ac.tuwien.big.Scml.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScml.g:2065:3: (otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalScml.g:2066:4: otherlv_21= 'device' otherlv_22= '{' ( (lv_device_23_0= ruleDevice ) ) (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,48,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getEnvironmentalComponentAccess().getDeviceKeyword_10_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_22, grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalScml.g:2074:4: ( (lv_device_23_0= ruleDevice ) )
                    // InternalScml.g:2075:5: (lv_device_23_0= ruleDevice )
                    {
                    // InternalScml.g:2075:5: (lv_device_23_0= ruleDevice )
                    // InternalScml.g:2076:6: lv_device_23_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_device_23_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
                    						}
                    						add(
                    							current,
                    							"device",
                    							lv_device_23_0,
                    							"at.ac.tuwien.big.Scml.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalScml.g:2093:4: (otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalScml.g:2094:5: otherlv_24= ',' ( (lv_device_25_0= ruleDevice ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalScml.g:2098:5: ( (lv_device_25_0= ruleDevice ) )
                    	    // InternalScml.g:2099:6: (lv_device_25_0= ruleDevice )
                    	    {
                    	    // InternalScml.g:2099:6: (lv_device_25_0= ruleDevice )
                    	    // InternalScml.g:2100:7: lv_device_25_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_device_25_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnvironmentalComponentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"device",
                    	    								lv_device_25_0,
                    	    								"at.ac.tuwien.big.Scml.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEnvironmentalComponent"


    // $ANTLR start "entryRuleEFloat"
    // InternalScml.g:2131:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalScml.g:2131:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalScml.g:2132:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalScml.g:2138:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalScml.g:2144:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalScml.g:2145:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalScml.g:2145:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalScml.g:2146:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalScml.g:2146:3: (kw= '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalScml.g:2147:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_52); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalScml.g:2153:3: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalScml.g:2154:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_53); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,51,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_54); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalScml.g:2174:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=52 && LA46_0<=53)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalScml.g:2175:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalScml.g:2175:4: (kw= 'E' | kw= 'e' )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==52) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==53) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalScml.g:2176:5: kw= 'E'
                            {
                            kw=(Token)match(input,52,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalScml.g:2182:5: kw= 'e'
                            {
                            kw=(Token)match(input,53,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalScml.g:2188:4: (kw= '-' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==24) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalScml.g:2189:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleGoalReferenceValue"
    // InternalScml.g:2207:1: entryRuleGoalReferenceValue returns [EObject current=null] : iv_ruleGoalReferenceValue= ruleGoalReferenceValue EOF ;
    public final EObject entryRuleGoalReferenceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalReferenceValue = null;


        try {
            // InternalScml.g:2207:59: (iv_ruleGoalReferenceValue= ruleGoalReferenceValue EOF )
            // InternalScml.g:2208:2: iv_ruleGoalReferenceValue= ruleGoalReferenceValue EOF
            {
             newCompositeNode(grammarAccess.getGoalReferenceValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalReferenceValue=ruleGoalReferenceValue();

            state._fsp--;

             current =iv_ruleGoalReferenceValue; 
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
    // $ANTLR end "entryRuleGoalReferenceValue"


    // $ANTLR start "ruleGoalReferenceValue"
    // InternalScml.g:2214:1: ruleGoalReferenceValue returns [EObject current=null] : (otherlv_0= 'GoalReferenceValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'basis' ( (lv_basis_7_0= ruleBasis ) ) otherlv_8= '}' ) ;
    public final EObject ruleGoalReferenceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_basis_7_0 = null;



        	enterRule();

        try {
            // InternalScml.g:2220:2: ( (otherlv_0= 'GoalReferenceValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'basis' ( (lv_basis_7_0= ruleBasis ) ) otherlv_8= '}' ) )
            // InternalScml.g:2221:2: (otherlv_0= 'GoalReferenceValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'basis' ( (lv_basis_7_0= ruleBasis ) ) otherlv_8= '}' )
            {
            // InternalScml.g:2221:2: (otherlv_0= 'GoalReferenceValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'basis' ( (lv_basis_7_0= ruleBasis ) ) otherlv_8= '}' )
            // InternalScml.g:2222:3: otherlv_0= 'GoalReferenceValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'basis' ( (lv_basis_7_0= ruleBasis ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalReferenceValueAccess().getGoalReferenceValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getGoalReferenceValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getGoalReferenceValueAccess().getTypeKeyword_2());
            		
            // InternalScml.g:2234:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalScml.g:2235:4: (lv_type_3_0= ruleDataType )
            {
            // InternalScml.g:2235:4: (lv_type_3_0= ruleDataType )
            // InternalScml.g:2236:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getGoalReferenceValueAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalReferenceValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"at.ac.tuwien.big.Scml.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGoalReferenceValueAccess().getValueKeyword_4());
            		
            // InternalScml.g:2257:3: ( (lv_value_5_0= ruleEString ) )
            // InternalScml.g:2258:4: (lv_value_5_0= ruleEString )
            {
            // InternalScml.g:2258:4: (lv_value_5_0= ruleEString )
            // InternalScml.g:2259:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGoalReferenceValueAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_55);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalReferenceValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,55,FOLLOW_56); 

            			newLeafNode(otherlv_6, grammarAccess.getGoalReferenceValueAccess().getBasisKeyword_6());
            		
            // InternalScml.g:2280:3: ( (lv_basis_7_0= ruleBasis ) )
            // InternalScml.g:2281:4: (lv_basis_7_0= ruleBasis )
            {
            // InternalScml.g:2281:4: (lv_basis_7_0= ruleBasis )
            // InternalScml.g:2282:5: lv_basis_7_0= ruleBasis
            {

            					newCompositeNode(grammarAccess.getGoalReferenceValueAccess().getBasisBasisParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_basis_7_0=ruleBasis();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalReferenceValueRule());
            					}
            					set(
            						current,
            						"basis",
            						lv_basis_7_0,
            						"at.ac.tuwien.big.Scml.Basis");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGoalReferenceValueAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleGoalReferenceValue"


    // $ANTLR start "entryRuleAggregatedValue"
    // InternalScml.g:2307:1: entryRuleAggregatedValue returns [EObject current=null] : iv_ruleAggregatedValue= ruleAggregatedValue EOF ;
    public final EObject entryRuleAggregatedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregatedValue = null;


        try {
            // InternalScml.g:2307:56: (iv_ruleAggregatedValue= ruleAggregatedValue EOF )
            // InternalScml.g:2308:2: iv_ruleAggregatedValue= ruleAggregatedValue EOF
            {
             newCompositeNode(grammarAccess.getAggregatedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregatedValue=ruleAggregatedValue();

            state._fsp--;

             current =iv_ruleAggregatedValue; 
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
    // $ANTLR end "entryRuleAggregatedValue"


    // $ANTLR start "ruleAggregatedValue"
    // InternalScml.g:2314:1: ruleAggregatedValue returns [EObject current=null] : (otherlv_0= 'AggregatedValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'aggregator' ( (lv_aggregator_7_0= ruleOperation ) ) otherlv_8= 'aggregatedTime' ( (lv_aggregatedTime_9_0= ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleAggregatedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_aggregator_7_0 = null;

        AntlrDatatypeRuleToken lv_aggregatedTime_9_0 = null;



        	enterRule();

        try {
            // InternalScml.g:2320:2: ( (otherlv_0= 'AggregatedValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'aggregator' ( (lv_aggregator_7_0= ruleOperation ) ) otherlv_8= 'aggregatedTime' ( (lv_aggregatedTime_9_0= ruleEString ) ) otherlv_10= '}' ) )
            // InternalScml.g:2321:2: (otherlv_0= 'AggregatedValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'aggregator' ( (lv_aggregator_7_0= ruleOperation ) ) otherlv_8= 'aggregatedTime' ( (lv_aggregatedTime_9_0= ruleEString ) ) otherlv_10= '}' )
            {
            // InternalScml.g:2321:2: (otherlv_0= 'AggregatedValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'aggregator' ( (lv_aggregator_7_0= ruleOperation ) ) otherlv_8= 'aggregatedTime' ( (lv_aggregatedTime_9_0= ruleEString ) ) otherlv_10= '}' )
            // InternalScml.g:2322:3: otherlv_0= 'AggregatedValue' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleDataType ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleEString ) ) otherlv_6= 'aggregator' ( (lv_aggregator_7_0= ruleOperation ) ) otherlv_8= 'aggregatedTime' ( (lv_aggregatedTime_9_0= ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregatedValueAccess().getAggregatedValueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAggregatedValueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregatedValueAccess().getTypeKeyword_2());
            		
            // InternalScml.g:2334:3: ( (lv_type_3_0= ruleDataType ) )
            // InternalScml.g:2335:4: (lv_type_3_0= ruleDataType )
            {
            // InternalScml.g:2335:4: (lv_type_3_0= ruleDataType )
            // InternalScml.g:2336:5: lv_type_3_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAggregatedValueAccess().getTypeDataTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_type_3_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedValueRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"at.ac.tuwien.big.Scml.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAggregatedValueAccess().getValueKeyword_4());
            		
            // InternalScml.g:2357:3: ( (lv_value_5_0= ruleEString ) )
            // InternalScml.g:2358:4: (lv_value_5_0= ruleEString )
            {
            // InternalScml.g:2358:4: (lv_value_5_0= ruleEString )
            // InternalScml.g:2359:5: lv_value_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAggregatedValueAccess().getValueEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_57);
            lv_value_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,57,FOLLOW_58); 

            			newLeafNode(otherlv_6, grammarAccess.getAggregatedValueAccess().getAggregatorKeyword_6());
            		
            // InternalScml.g:2380:3: ( (lv_aggregator_7_0= ruleOperation ) )
            // InternalScml.g:2381:4: (lv_aggregator_7_0= ruleOperation )
            {
            // InternalScml.g:2381:4: (lv_aggregator_7_0= ruleOperation )
            // InternalScml.g:2382:5: lv_aggregator_7_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getAggregatedValueAccess().getAggregatorOperationEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_59);
            lv_aggregator_7_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedValueRule());
            					}
            					set(
            						current,
            						"aggregator",
            						lv_aggregator_7_0,
            						"at.ac.tuwien.big.Scml.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAggregatedValueAccess().getAggregatedTimeKeyword_8());
            		
            // InternalScml.g:2403:3: ( (lv_aggregatedTime_9_0= ruleEString ) )
            // InternalScml.g:2404:4: (lv_aggregatedTime_9_0= ruleEString )
            {
            // InternalScml.g:2404:4: (lv_aggregatedTime_9_0= ruleEString )
            // InternalScml.g:2405:5: lv_aggregatedTime_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAggregatedValueAccess().getAggregatedTimeEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_aggregatedTime_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregatedValueRule());
            					}
            					set(
            						current,
            						"aggregatedTime",
            						lv_aggregatedTime_9_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAggregatedValueAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAggregatedValue"


    // $ANTLR start "entryRuleBasis"
    // InternalScml.g:2430:1: entryRuleBasis returns [EObject current=null] : iv_ruleBasis= ruleBasis EOF ;
    public final EObject entryRuleBasis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasis = null;


        try {
            // InternalScml.g:2430:46: (iv_ruleBasis= ruleBasis EOF )
            // InternalScml.g:2431:2: iv_ruleBasis= ruleBasis EOF
            {
             newCompositeNode(grammarAccess.getBasisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasis=ruleBasis();

            state._fsp--;

             current =iv_ruleBasis; 
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
    // $ANTLR end "entryRuleBasis"


    // $ANTLR start "ruleBasis"
    // InternalScml.g:2437:1: ruleBasis returns [EObject current=null] : (otherlv_0= 'Basis' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'principleType' ( (lv_principleType_5_0= rulePrincipleType ) ) otherlv_6= 'source' ( (lv_source_7_0= ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBasis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_principleType_5_0 = null;

        AntlrDatatypeRuleToken lv_source_7_0 = null;



        	enterRule();

        try {
            // InternalScml.g:2443:2: ( (otherlv_0= 'Basis' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'principleType' ( (lv_principleType_5_0= rulePrincipleType ) ) otherlv_6= 'source' ( (lv_source_7_0= ruleEString ) ) otherlv_8= '}' ) )
            // InternalScml.g:2444:2: (otherlv_0= 'Basis' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'principleType' ( (lv_principleType_5_0= rulePrincipleType ) ) otherlv_6= 'source' ( (lv_source_7_0= ruleEString ) ) otherlv_8= '}' )
            {
            // InternalScml.g:2444:2: (otherlv_0= 'Basis' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'principleType' ( (lv_principleType_5_0= rulePrincipleType ) ) otherlv_6= 'source' ( (lv_source_7_0= ruleEString ) ) otherlv_8= '}' )
            // InternalScml.g:2445:3: otherlv_0= 'Basis' otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'principleType' ( (lv_principleType_5_0= rulePrincipleType ) ) otherlv_6= 'source' ( (lv_source_7_0= ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBasisAccess().getBasisKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getBasisAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getBasisAccess().getDescriptionKeyword_2());
            		
            // InternalScml.g:2457:3: ( (lv_description_3_0= ruleEString ) )
            // InternalScml.g:2458:4: (lv_description_3_0= ruleEString )
            {
            // InternalScml.g:2458:4: (lv_description_3_0= ruleEString )
            // InternalScml.g:2459:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBasisAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasisRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,61,FOLLOW_62); 

            			newLeafNode(otherlv_4, grammarAccess.getBasisAccess().getPrincipleTypeKeyword_4());
            		
            // InternalScml.g:2480:3: ( (lv_principleType_5_0= rulePrincipleType ) )
            // InternalScml.g:2481:4: (lv_principleType_5_0= rulePrincipleType )
            {
            // InternalScml.g:2481:4: (lv_principleType_5_0= rulePrincipleType )
            // InternalScml.g:2482:5: lv_principleType_5_0= rulePrincipleType
            {

            					newCompositeNode(grammarAccess.getBasisAccess().getPrincipleTypePrincipleTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_63);
            lv_principleType_5_0=rulePrincipleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasisRule());
            					}
            					set(
            						current,
            						"principleType",
            						lv_principleType_5_0,
            						"at.ac.tuwien.big.Scml.PrincipleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBasisAccess().getSourceKeyword_6());
            		
            // InternalScml.g:2503:3: ( (lv_source_7_0= ruleEString ) )
            // InternalScml.g:2504:4: (lv_source_7_0= ruleEString )
            {
            // InternalScml.g:2504:4: (lv_source_7_0= ruleEString )
            // InternalScml.g:2505:5: lv_source_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBasisAccess().getSourceEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_source_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBasisRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_7_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBasisAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBasis"


    // $ANTLR start "entryRuleSensor"
    // InternalScml.g:2530:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalScml.g:2530:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalScml.g:2531:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalScml.g:2537:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalScml.g:2543:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) )
            // InternalScml.g:2544:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            {
            // InternalScml.g:2544:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            // InternalScml.g:2545:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalScml.g:2549:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:2550:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:2550:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:2551:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
            		
            // InternalScml.g:2576:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalScml.g:2577:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalScml.g:2577:4: (lv_type_4_0= ruleParameterType )
            // InternalScml.g:2578:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeParameterTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"at.ac.tuwien.big.Scml.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalScml.g:2603:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalScml.g:2603:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalScml.g:2604:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalScml.g:2610:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalScml.g:2616:2: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' ) )
            // InternalScml.g:2617:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            {
            // InternalScml.g:2617:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}' )
            // InternalScml.g:2618:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalScml.g:2622:3: ( (lv_name_1_0= ruleEString ) )
            // InternalScml.g:2623:4: (lv_name_1_0= ruleEString )
            {
            // InternalScml.g:2623:4: (lv_name_1_0= ruleEString )
            // InternalScml.g:2624:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Scml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getTypeKeyword_3());
            		
            // InternalScml.g:2649:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalScml.g:2650:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalScml.g:2650:4: (lv_type_4_0= ruleParameterType )
            // InternalScml.g:2651:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTypeParameterTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"at.ac.tuwien.big.Scml.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "ruleDataType"
    // InternalScml.g:2676:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOL' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'FLOAT' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalScml.g:2682:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOL' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'FLOAT' ) ) )
            // InternalScml.g:2683:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOL' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'FLOAT' ) )
            {
            // InternalScml.g:2683:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'BOOL' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'FLOAT' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt47=1;
                }
                break;
            case 66:
                {
                alt47=2;
                }
                break;
            case 67:
                {
                alt47=3;
                }
                break;
            case 68:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalScml.g:2684:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalScml.g:2684:3: (enumLiteral_0= 'STRING' )
                    // InternalScml.g:2685:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:2692:3: (enumLiteral_1= 'BOOL' )
                    {
                    // InternalScml.g:2692:3: (enumLiteral_1= 'BOOL' )
                    // InternalScml.g:2693:4: enumLiteral_1= 'BOOL'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:2700:3: (enumLiteral_2= 'INTEGER' )
                    {
                    // InternalScml.g:2700:3: (enumLiteral_2= 'INTEGER' )
                    // InternalScml.g:2701:4: enumLiteral_2= 'INTEGER'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:2708:3: (enumLiteral_3= 'FLOAT' )
                    {
                    // InternalScml.g:2708:3: (enumLiteral_3= 'FLOAT' )
                    // InternalScml.g:2709:4: enumLiteral_3= 'FLOAT'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleParameterType"
    // InternalScml.g:2719:1: ruleParameterType returns [Enumerator current=null] : ( (enumLiteral_0= 'AIRQUALITY' ) | (enumLiteral_1= 'WEATHER' ) | (enumLiteral_2= 'TRAFFIC' ) | (enumLiteral_3= 'ENERGY' ) | (enumLiteral_4= 'AGRICULTURAL' ) | (enumLiteral_5= 'NAVIGATION' ) | (enumLiteral_6= 'WASTEMANAGEMENT' ) | (enumLiteral_7= 'SAFETY' ) ) ;
    public final Enumerator ruleParameterType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalScml.g:2725:2: ( ( (enumLiteral_0= 'AIRQUALITY' ) | (enumLiteral_1= 'WEATHER' ) | (enumLiteral_2= 'TRAFFIC' ) | (enumLiteral_3= 'ENERGY' ) | (enumLiteral_4= 'AGRICULTURAL' ) | (enumLiteral_5= 'NAVIGATION' ) | (enumLiteral_6= 'WASTEMANAGEMENT' ) | (enumLiteral_7= 'SAFETY' ) ) )
            // InternalScml.g:2726:2: ( (enumLiteral_0= 'AIRQUALITY' ) | (enumLiteral_1= 'WEATHER' ) | (enumLiteral_2= 'TRAFFIC' ) | (enumLiteral_3= 'ENERGY' ) | (enumLiteral_4= 'AGRICULTURAL' ) | (enumLiteral_5= 'NAVIGATION' ) | (enumLiteral_6= 'WASTEMANAGEMENT' ) | (enumLiteral_7= 'SAFETY' ) )
            {
            // InternalScml.g:2726:2: ( (enumLiteral_0= 'AIRQUALITY' ) | (enumLiteral_1= 'WEATHER' ) | (enumLiteral_2= 'TRAFFIC' ) | (enumLiteral_3= 'ENERGY' ) | (enumLiteral_4= 'AGRICULTURAL' ) | (enumLiteral_5= 'NAVIGATION' ) | (enumLiteral_6= 'WASTEMANAGEMENT' ) | (enumLiteral_7= 'SAFETY' ) )
            int alt48=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt48=1;
                }
                break;
            case 70:
                {
                alt48=2;
                }
                break;
            case 71:
                {
                alt48=3;
                }
                break;
            case 72:
                {
                alt48=4;
                }
                break;
            case 73:
                {
                alt48=5;
                }
                break;
            case 74:
                {
                alt48=6;
                }
                break;
            case 75:
                {
                alt48=7;
                }
                break;
            case 76:
                {
                alt48=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalScml.g:2727:3: (enumLiteral_0= 'AIRQUALITY' )
                    {
                    // InternalScml.g:2727:3: (enumLiteral_0= 'AIRQUALITY' )
                    // InternalScml.g:2728:4: enumLiteral_0= 'AIRQUALITY'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getAIRQUALITYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getParameterTypeAccess().getAIRQUALITYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:2735:3: (enumLiteral_1= 'WEATHER' )
                    {
                    // InternalScml.g:2735:3: (enumLiteral_1= 'WEATHER' )
                    // InternalScml.g:2736:4: enumLiteral_1= 'WEATHER'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getWEATHEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getParameterTypeAccess().getWEATHEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:2743:3: (enumLiteral_2= 'TRAFFIC' )
                    {
                    // InternalScml.g:2743:3: (enumLiteral_2= 'TRAFFIC' )
                    // InternalScml.g:2744:4: enumLiteral_2= 'TRAFFIC'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getTRAFFICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getParameterTypeAccess().getTRAFFICEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:2751:3: (enumLiteral_3= 'ENERGY' )
                    {
                    // InternalScml.g:2751:3: (enumLiteral_3= 'ENERGY' )
                    // InternalScml.g:2752:4: enumLiteral_3= 'ENERGY'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getENERGYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getParameterTypeAccess().getENERGYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalScml.g:2759:3: (enumLiteral_4= 'AGRICULTURAL' )
                    {
                    // InternalScml.g:2759:3: (enumLiteral_4= 'AGRICULTURAL' )
                    // InternalScml.g:2760:4: enumLiteral_4= 'AGRICULTURAL'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getAGRICULTURALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getParameterTypeAccess().getAGRICULTURALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalScml.g:2767:3: (enumLiteral_5= 'NAVIGATION' )
                    {
                    // InternalScml.g:2767:3: (enumLiteral_5= 'NAVIGATION' )
                    // InternalScml.g:2768:4: enumLiteral_5= 'NAVIGATION'
                    {
                    enumLiteral_5=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getNAVIGATIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getParameterTypeAccess().getNAVIGATIONEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalScml.g:2775:3: (enumLiteral_6= 'WASTEMANAGEMENT' )
                    {
                    // InternalScml.g:2775:3: (enumLiteral_6= 'WASTEMANAGEMENT' )
                    // InternalScml.g:2776:4: enumLiteral_6= 'WASTEMANAGEMENT'
                    {
                    enumLiteral_6=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getWASTEMANAGEMENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getParameterTypeAccess().getWASTEMANAGEMENTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalScml.g:2783:3: (enumLiteral_7= 'SAFETY' )
                    {
                    // InternalScml.g:2783:3: (enumLiteral_7= 'SAFETY' )
                    // InternalScml.g:2784:4: enumLiteral_7= 'SAFETY'
                    {
                    enumLiteral_7=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getParameterTypeAccess().getSAFETYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getParameterTypeAccess().getSAFETYEnumLiteralDeclaration_7());
                    			

                    }


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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "rulePrincipleType"
    // InternalScml.g:2794:1: rulePrincipleType returns [Enumerator current=null] : ( (enumLiteral_0= 'LAW' ) | (enumLiteral_1= 'STANDARD' ) | (enumLiteral_2= 'POLICY' ) ) ;
    public final Enumerator rulePrincipleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalScml.g:2800:2: ( ( (enumLiteral_0= 'LAW' ) | (enumLiteral_1= 'STANDARD' ) | (enumLiteral_2= 'POLICY' ) ) )
            // InternalScml.g:2801:2: ( (enumLiteral_0= 'LAW' ) | (enumLiteral_1= 'STANDARD' ) | (enumLiteral_2= 'POLICY' ) )
            {
            // InternalScml.g:2801:2: ( (enumLiteral_0= 'LAW' ) | (enumLiteral_1= 'STANDARD' ) | (enumLiteral_2= 'POLICY' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt49=1;
                }
                break;
            case 78:
                {
                alt49=2;
                }
                break;
            case 79:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalScml.g:2802:3: (enumLiteral_0= 'LAW' )
                    {
                    // InternalScml.g:2802:3: (enumLiteral_0= 'LAW' )
                    // InternalScml.g:2803:4: enumLiteral_0= 'LAW'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getPrincipleTypeAccess().getLAWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrincipleTypeAccess().getLAWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:2810:3: (enumLiteral_1= 'STANDARD' )
                    {
                    // InternalScml.g:2810:3: (enumLiteral_1= 'STANDARD' )
                    // InternalScml.g:2811:4: enumLiteral_1= 'STANDARD'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getPrincipleTypeAccess().getSTANDARDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrincipleTypeAccess().getSTANDARDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:2818:3: (enumLiteral_2= 'POLICY' )
                    {
                    // InternalScml.g:2818:3: (enumLiteral_2= 'POLICY' )
                    // InternalScml.g:2819:4: enumLiteral_2= 'POLICY'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getPrincipleTypeAccess().getPOLICYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrincipleTypeAccess().getPOLICYEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "rulePrincipleType"


    // $ANTLR start "ruleOperation"
    // InternalScml.g:2829:1: ruleOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFF' ) | (enumLiteral_2= 'AVG' ) | (enumLiteral_3= 'MIN' ) | (enumLiteral_4= 'MAX' ) ) ;
    public final Enumerator ruleOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalScml.g:2835:2: ( ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFF' ) | (enumLiteral_2= 'AVG' ) | (enumLiteral_3= 'MIN' ) | (enumLiteral_4= 'MAX' ) ) )
            // InternalScml.g:2836:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFF' ) | (enumLiteral_2= 'AVG' ) | (enumLiteral_3= 'MIN' ) | (enumLiteral_4= 'MAX' ) )
            {
            // InternalScml.g:2836:2: ( (enumLiteral_0= 'SUM' ) | (enumLiteral_1= 'DIFF' ) | (enumLiteral_2= 'AVG' ) | (enumLiteral_3= 'MIN' ) | (enumLiteral_4= 'MAX' ) )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt50=1;
                }
                break;
            case 81:
                {
                alt50=2;
                }
                break;
            case 82:
                {
                alt50=3;
                }
                break;
            case 83:
                {
                alt50=4;
                }
                break;
            case 84:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalScml.g:2837:3: (enumLiteral_0= 'SUM' )
                    {
                    // InternalScml.g:2837:3: (enumLiteral_0= 'SUM' )
                    // InternalScml.g:2838:4: enumLiteral_0= 'SUM'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getSUMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationAccess().getSUMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:2845:3: (enumLiteral_1= 'DIFF' )
                    {
                    // InternalScml.g:2845:3: (enumLiteral_1= 'DIFF' )
                    // InternalScml.g:2846:4: enumLiteral_1= 'DIFF'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getDIFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationAccess().getDIFFEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:2853:3: (enumLiteral_2= 'AVG' )
                    {
                    // InternalScml.g:2853:3: (enumLiteral_2= 'AVG' )
                    // InternalScml.g:2854:4: enumLiteral_2= 'AVG'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getAVGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperationAccess().getAVGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:2861:3: (enumLiteral_3= 'MIN' )
                    {
                    // InternalScml.g:2861:3: (enumLiteral_3= 'MIN' )
                    // InternalScml.g:2862:4: enumLiteral_3= 'MIN'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getMINEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperationAccess().getMINEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalScml.g:2869:3: (enumLiteral_4= 'MAX' )
                    {
                    // InternalScml.g:2869:3: (enumLiteral_4= 'MAX' )
                    // InternalScml.g:2870:4: enumLiteral_4= 'MAX'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getOperationAccess().getMAXEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperationAccess().getMAXEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleStatus"
    // InternalScml.g:2880:1: ruleStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARN' ) | (enumLiteral_2= 'CRITICAL' ) ) ;
    public final Enumerator ruleStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalScml.g:2886:2: ( ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARN' ) | (enumLiteral_2= 'CRITICAL' ) ) )
            // InternalScml.g:2887:2: ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARN' ) | (enumLiteral_2= 'CRITICAL' ) )
            {
            // InternalScml.g:2887:2: ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARN' ) | (enumLiteral_2= 'CRITICAL' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt51=1;
                }
                break;
            case 86:
                {
                alt51=2;
                }
                break;
            case 87:
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalScml.g:2888:3: (enumLiteral_0= 'GOOD' )
                    {
                    // InternalScml.g:2888:3: (enumLiteral_0= 'GOOD' )
                    // InternalScml.g:2889:4: enumLiteral_0= 'GOOD'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:2896:3: (enumLiteral_1= 'WARN' )
                    {
                    // InternalScml.g:2896:3: (enumLiteral_1= 'WARN' )
                    // InternalScml.g:2897:4: enumLiteral_1= 'WARN'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getWARNEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatusAccess().getWARNEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:2904:3: (enumLiteral_2= 'CRITICAL' )
                    {
                    // InternalScml.g:2904:3: (enumLiteral_2= 'CRITICAL' )
                    // InternalScml.g:2905:4: enumLiteral_2= 'CRITICAL'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C0A000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0006080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000001000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800020000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});

}