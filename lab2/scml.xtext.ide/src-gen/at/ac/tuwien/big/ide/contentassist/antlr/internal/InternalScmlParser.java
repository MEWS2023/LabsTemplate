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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'STRING'", "'BOOL'", "'INTEGER'", "'FLOAT'", "'AIRQUALITY'", "'WEATHER'", "'TRAFFIC'", "'ENERGY'", "'AGRICULTURAL'", "'NAVIGATION'", "'WASTEMANAGEMENT'", "'SAFETY'", "'LAW'", "'STANDARD'", "'POLICY'", "'SUM'", "'DIFF'", "'AVG'", "'MIN'", "'MAX'", "'GOOD'", "'WARN'", "'CRITICAL'", "'SmartCity'", "'{'", "'}'", "'category'", "','", "'project'", "'Category'", "'SDG'", "'Project'", "'('", "')'", "'component'", "'indicator'", "'-'", "'KPIMeasurementDevice'", "'status'", "'nextCalculation'", "'lastCalculation'", "'parameter'", "'Location'", "'Lat'", "'Long'", "'DataValue'", "'type'", "'value'", "'producedTime'", "'consumedTime'", "'Parameter'", "'unit'", "'goalreferencevalue'", "'observedValue'", "'BuildingComponent'", "'location'", "'isPartOf'", "'composedOf'", "'produces'", "'device'", "'TransportationComponent'", "'EnvironmentalComponent'", "'.'", "'GoalReferenceValue'", "'basis'", "'AggregatedValue'", "'aggregator'", "'aggregatedTime'", "'Basis'", "'description'", "'principleType'", "'source'", "'Sensor'", "'Actuator'", "'collected'"
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


    // $ANTLR start "entryRuleInfrastructureComponent"
    // InternalScml.g:78:1: entryRuleInfrastructureComponent : ruleInfrastructureComponent EOF ;
    public final void entryRuleInfrastructureComponent() throws RecognitionException {
        try {
            // InternalScml.g:79:1: ( ruleInfrastructureComponent EOF )
            // InternalScml.g:80:1: ruleInfrastructureComponent EOF
            {
             before(grammarAccess.getInfrastructureComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleInfrastructureComponent();

            state._fsp--;

             after(grammarAccess.getInfrastructureComponentRule()); 
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
    // $ANTLR end "entryRuleInfrastructureComponent"


    // $ANTLR start "ruleInfrastructureComponent"
    // InternalScml.g:87:1: ruleInfrastructureComponent : ( ( rule__InfrastructureComponent__Alternatives ) ) ;
    public final void ruleInfrastructureComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:91:2: ( ( ( rule__InfrastructureComponent__Alternatives ) ) )
            // InternalScml.g:92:2: ( ( rule__InfrastructureComponent__Alternatives ) )
            {
            // InternalScml.g:92:2: ( ( rule__InfrastructureComponent__Alternatives ) )
            // InternalScml.g:93:3: ( rule__InfrastructureComponent__Alternatives )
            {
             before(grammarAccess.getInfrastructureComponentAccess().getAlternatives()); 
            // InternalScml.g:94:3: ( rule__InfrastructureComponent__Alternatives )
            // InternalScml.g:94:4: rule__InfrastructureComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InfrastructureComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInfrastructureComponent"


    // $ANTLR start "entryRuleDevice"
    // InternalScml.g:103:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalScml.g:104:1: ( ruleDevice EOF )
            // InternalScml.g:105:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
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
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalScml.g:112:1: ruleDevice : ( ( rule__Device__Alternatives ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:116:2: ( ( ( rule__Device__Alternatives ) ) )
            // InternalScml.g:117:2: ( ( rule__Device__Alternatives ) )
            {
            // InternalScml.g:117:2: ( ( rule__Device__Alternatives ) )
            // InternalScml.g:118:3: ( rule__Device__Alternatives )
            {
             before(grammarAccess.getDeviceAccess().getAlternatives()); 
            // InternalScml.g:119:3: ( rule__Device__Alternatives )
            // InternalScml.g:119:4: rule__Device__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleEString"
    // InternalScml.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalScml.g:129:1: ( ruleEString EOF )
            // InternalScml.g:130:1: ruleEString EOF
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
    // InternalScml.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalScml.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalScml.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalScml.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalScml.g:144:3: ( rule__EString__Alternatives )
            // InternalScml.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleCategory"
    // InternalScml.g:153:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalScml.g:154:1: ( ruleCategory EOF )
            // InternalScml.g:155:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalScml.g:162:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:166:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalScml.g:167:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalScml.g:167:2: ( ( rule__Category__Group__0 ) )
            // InternalScml.g:168:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalScml.g:169:3: ( rule__Category__Group__0 )
            // InternalScml.g:169:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleProject"
    // InternalScml.g:178:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalScml.g:179:1: ( ruleProject EOF )
            // InternalScml.g:180:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalScml.g:187:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:191:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalScml.g:192:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalScml.g:192:2: ( ( rule__Project__Group__0 ) )
            // InternalScml.g:193:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalScml.g:194:3: ( rule__Project__Group__0 )
            // InternalScml.g:194:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleEInt"
    // InternalScml.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalScml.g:204:1: ( ruleEInt EOF )
            // InternalScml.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalScml.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalScml.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalScml.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalScml.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalScml.g:219:3: ( rule__EInt__Group__0 )
            // InternalScml.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleKPIMeasurementDevice"
    // InternalScml.g:228:1: entryRuleKPIMeasurementDevice : ruleKPIMeasurementDevice EOF ;
    public final void entryRuleKPIMeasurementDevice() throws RecognitionException {
        try {
            // InternalScml.g:229:1: ( ruleKPIMeasurementDevice EOF )
            // InternalScml.g:230:1: ruleKPIMeasurementDevice EOF
            {
             before(grammarAccess.getKPIMeasurementDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleKPIMeasurementDevice();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceRule()); 
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
    // $ANTLR end "entryRuleKPIMeasurementDevice"


    // $ANTLR start "ruleKPIMeasurementDevice"
    // InternalScml.g:237:1: ruleKPIMeasurementDevice : ( ( rule__KPIMeasurementDevice__Group__0 ) ) ;
    public final void ruleKPIMeasurementDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:241:2: ( ( ( rule__KPIMeasurementDevice__Group__0 ) ) )
            // InternalScml.g:242:2: ( ( rule__KPIMeasurementDevice__Group__0 ) )
            {
            // InternalScml.g:242:2: ( ( rule__KPIMeasurementDevice__Group__0 ) )
            // InternalScml.g:243:3: ( rule__KPIMeasurementDevice__Group__0 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getGroup()); 
            // InternalScml.g:244:3: ( rule__KPIMeasurementDevice__Group__0 )
            // InternalScml.g:244:4: rule__KPIMeasurementDevice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getGroup()); 

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
    // $ANTLR end "ruleKPIMeasurementDevice"


    // $ANTLR start "entryRuleLocation"
    // InternalScml.g:253:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalScml.g:254:1: ( ruleLocation EOF )
            // InternalScml.g:255:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalScml.g:262:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:266:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalScml.g:267:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalScml.g:267:2: ( ( rule__Location__Group__0 ) )
            // InternalScml.g:268:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalScml.g:269:3: ( rule__Location__Group__0 )
            // InternalScml.g:269:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleDataValue"
    // InternalScml.g:278:1: entryRuleDataValue : ruleDataValue EOF ;
    public final void entryRuleDataValue() throws RecognitionException {
        try {
            // InternalScml.g:279:1: ( ruleDataValue EOF )
            // InternalScml.g:280:1: ruleDataValue EOF
            {
             before(grammarAccess.getDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getDataValueRule()); 
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
    // $ANTLR end "entryRuleDataValue"


    // $ANTLR start "ruleDataValue"
    // InternalScml.g:287:1: ruleDataValue : ( ( rule__DataValue__Group__0 ) ) ;
    public final void ruleDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:291:2: ( ( ( rule__DataValue__Group__0 ) ) )
            // InternalScml.g:292:2: ( ( rule__DataValue__Group__0 ) )
            {
            // InternalScml.g:292:2: ( ( rule__DataValue__Group__0 ) )
            // InternalScml.g:293:3: ( rule__DataValue__Group__0 )
            {
             before(grammarAccess.getDataValueAccess().getGroup()); 
            // InternalScml.g:294:3: ( rule__DataValue__Group__0 )
            // InternalScml.g:294:4: rule__DataValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getGroup()); 

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
    // $ANTLR end "ruleDataValue"


    // $ANTLR start "entryRuleParameter"
    // InternalScml.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalScml.g:304:1: ( ruleParameter EOF )
            // InternalScml.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalScml.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalScml.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalScml.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalScml.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalScml.g:319:3: ( rule__Parameter__Group__0 )
            // InternalScml.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleBuildingComponent"
    // InternalScml.g:328:1: entryRuleBuildingComponent : ruleBuildingComponent EOF ;
    public final void entryRuleBuildingComponent() throws RecognitionException {
        try {
            // InternalScml.g:329:1: ( ruleBuildingComponent EOF )
            // InternalScml.g:330:1: ruleBuildingComponent EOF
            {
             before(grammarAccess.getBuildingComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleBuildingComponent();

            state._fsp--;

             after(grammarAccess.getBuildingComponentRule()); 
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
    // $ANTLR end "entryRuleBuildingComponent"


    // $ANTLR start "ruleBuildingComponent"
    // InternalScml.g:337:1: ruleBuildingComponent : ( ( rule__BuildingComponent__Group__0 ) ) ;
    public final void ruleBuildingComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:341:2: ( ( ( rule__BuildingComponent__Group__0 ) ) )
            // InternalScml.g:342:2: ( ( rule__BuildingComponent__Group__0 ) )
            {
            // InternalScml.g:342:2: ( ( rule__BuildingComponent__Group__0 ) )
            // InternalScml.g:343:3: ( rule__BuildingComponent__Group__0 )
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup()); 
            // InternalScml.g:344:3: ( rule__BuildingComponent__Group__0 )
            // InternalScml.g:344:4: rule__BuildingComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleBuildingComponent"


    // $ANTLR start "entryRuleTransportationComponent"
    // InternalScml.g:353:1: entryRuleTransportationComponent : ruleTransportationComponent EOF ;
    public final void entryRuleTransportationComponent() throws RecognitionException {
        try {
            // InternalScml.g:354:1: ( ruleTransportationComponent EOF )
            // InternalScml.g:355:1: ruleTransportationComponent EOF
            {
             before(grammarAccess.getTransportationComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleTransportationComponent();

            state._fsp--;

             after(grammarAccess.getTransportationComponentRule()); 
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
    // $ANTLR end "entryRuleTransportationComponent"


    // $ANTLR start "ruleTransportationComponent"
    // InternalScml.g:362:1: ruleTransportationComponent : ( ( rule__TransportationComponent__Group__0 ) ) ;
    public final void ruleTransportationComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:366:2: ( ( ( rule__TransportationComponent__Group__0 ) ) )
            // InternalScml.g:367:2: ( ( rule__TransportationComponent__Group__0 ) )
            {
            // InternalScml.g:367:2: ( ( rule__TransportationComponent__Group__0 ) )
            // InternalScml.g:368:3: ( rule__TransportationComponent__Group__0 )
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup()); 
            // InternalScml.g:369:3: ( rule__TransportationComponent__Group__0 )
            // InternalScml.g:369:4: rule__TransportationComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleTransportationComponent"


    // $ANTLR start "entryRuleEnvironmentalComponent"
    // InternalScml.g:378:1: entryRuleEnvironmentalComponent : ruleEnvironmentalComponent EOF ;
    public final void entryRuleEnvironmentalComponent() throws RecognitionException {
        try {
            // InternalScml.g:379:1: ( ruleEnvironmentalComponent EOF )
            // InternalScml.g:380:1: ruleEnvironmentalComponent EOF
            {
             before(grammarAccess.getEnvironmentalComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironmentalComponent();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentRule()); 
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
    // $ANTLR end "entryRuleEnvironmentalComponent"


    // $ANTLR start "ruleEnvironmentalComponent"
    // InternalScml.g:387:1: ruleEnvironmentalComponent : ( ( rule__EnvironmentalComponent__Group__0 ) ) ;
    public final void ruleEnvironmentalComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:391:2: ( ( ( rule__EnvironmentalComponent__Group__0 ) ) )
            // InternalScml.g:392:2: ( ( rule__EnvironmentalComponent__Group__0 ) )
            {
            // InternalScml.g:392:2: ( ( rule__EnvironmentalComponent__Group__0 ) )
            // InternalScml.g:393:3: ( rule__EnvironmentalComponent__Group__0 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup()); 
            // InternalScml.g:394:3: ( rule__EnvironmentalComponent__Group__0 )
            // InternalScml.g:394:4: rule__EnvironmentalComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleEnvironmentalComponent"


    // $ANTLR start "entryRuleEFloat"
    // InternalScml.g:403:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalScml.g:404:1: ( ruleEFloat EOF )
            // InternalScml.g:405:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalScml.g:412:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:416:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalScml.g:417:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalScml.g:417:2: ( ( rule__EFloat__Group__0 ) )
            // InternalScml.g:418:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalScml.g:419:3: ( rule__EFloat__Group__0 )
            // InternalScml.g:419:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleGoalReferenceValue"
    // InternalScml.g:428:1: entryRuleGoalReferenceValue : ruleGoalReferenceValue EOF ;
    public final void entryRuleGoalReferenceValue() throws RecognitionException {
        try {
            // InternalScml.g:429:1: ( ruleGoalReferenceValue EOF )
            // InternalScml.g:430:1: ruleGoalReferenceValue EOF
            {
             before(grammarAccess.getGoalReferenceValueRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalReferenceValue();

            state._fsp--;

             after(grammarAccess.getGoalReferenceValueRule()); 
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
    // $ANTLR end "entryRuleGoalReferenceValue"


    // $ANTLR start "ruleGoalReferenceValue"
    // InternalScml.g:437:1: ruleGoalReferenceValue : ( ( rule__GoalReferenceValue__Group__0 ) ) ;
    public final void ruleGoalReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:441:2: ( ( ( rule__GoalReferenceValue__Group__0 ) ) )
            // InternalScml.g:442:2: ( ( rule__GoalReferenceValue__Group__0 ) )
            {
            // InternalScml.g:442:2: ( ( rule__GoalReferenceValue__Group__0 ) )
            // InternalScml.g:443:3: ( rule__GoalReferenceValue__Group__0 )
            {
             before(grammarAccess.getGoalReferenceValueAccess().getGroup()); 
            // InternalScml.g:444:3: ( rule__GoalReferenceValue__Group__0 )
            // InternalScml.g:444:4: rule__GoalReferenceValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalReferenceValueAccess().getGroup()); 

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
    // $ANTLR end "ruleGoalReferenceValue"


    // $ANTLR start "entryRuleAggregatedValue"
    // InternalScml.g:453:1: entryRuleAggregatedValue : ruleAggregatedValue EOF ;
    public final void entryRuleAggregatedValue() throws RecognitionException {
        try {
            // InternalScml.g:454:1: ( ruleAggregatedValue EOF )
            // InternalScml.g:455:1: ruleAggregatedValue EOF
            {
             before(grammarAccess.getAggregatedValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregatedValue();

            state._fsp--;

             after(grammarAccess.getAggregatedValueRule()); 
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
    // $ANTLR end "entryRuleAggregatedValue"


    // $ANTLR start "ruleAggregatedValue"
    // InternalScml.g:462:1: ruleAggregatedValue : ( ( rule__AggregatedValue__Group__0 ) ) ;
    public final void ruleAggregatedValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:466:2: ( ( ( rule__AggregatedValue__Group__0 ) ) )
            // InternalScml.g:467:2: ( ( rule__AggregatedValue__Group__0 ) )
            {
            // InternalScml.g:467:2: ( ( rule__AggregatedValue__Group__0 ) )
            // InternalScml.g:468:3: ( rule__AggregatedValue__Group__0 )
            {
             before(grammarAccess.getAggregatedValueAccess().getGroup()); 
            // InternalScml.g:469:3: ( rule__AggregatedValue__Group__0 )
            // InternalScml.g:469:4: rule__AggregatedValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedValueAccess().getGroup()); 

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
    // $ANTLR end "ruleAggregatedValue"


    // $ANTLR start "entryRuleBasis"
    // InternalScml.g:478:1: entryRuleBasis : ruleBasis EOF ;
    public final void entryRuleBasis() throws RecognitionException {
        try {
            // InternalScml.g:479:1: ( ruleBasis EOF )
            // InternalScml.g:480:1: ruleBasis EOF
            {
             before(grammarAccess.getBasisRule()); 
            pushFollow(FOLLOW_1);
            ruleBasis();

            state._fsp--;

             after(grammarAccess.getBasisRule()); 
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
    // $ANTLR end "entryRuleBasis"


    // $ANTLR start "ruleBasis"
    // InternalScml.g:487:1: ruleBasis : ( ( rule__Basis__Group__0 ) ) ;
    public final void ruleBasis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:491:2: ( ( ( rule__Basis__Group__0 ) ) )
            // InternalScml.g:492:2: ( ( rule__Basis__Group__0 ) )
            {
            // InternalScml.g:492:2: ( ( rule__Basis__Group__0 ) )
            // InternalScml.g:493:3: ( rule__Basis__Group__0 )
            {
             before(grammarAccess.getBasisAccess().getGroup()); 
            // InternalScml.g:494:3: ( rule__Basis__Group__0 )
            // InternalScml.g:494:4: rule__Basis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Basis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasisAccess().getGroup()); 

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
    // $ANTLR end "ruleBasis"


    // $ANTLR start "entryRuleSensor"
    // InternalScml.g:503:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalScml.g:504:1: ( ruleSensor EOF )
            // InternalScml.g:505:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalScml.g:512:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:516:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalScml.g:517:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalScml.g:517:2: ( ( rule__Sensor__Group__0 ) )
            // InternalScml.g:518:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalScml.g:519:3: ( rule__Sensor__Group__0 )
            // InternalScml.g:519:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalScml.g:528:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalScml.g:529:1: ( ruleActuator EOF )
            // InternalScml.g:530:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalScml.g:537:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:541:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalScml.g:542:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalScml.g:542:2: ( ( rule__Actuator__Group__0 ) )
            // InternalScml.g:543:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalScml.g:544:3: ( rule__Actuator__Group__0 )
            // InternalScml.g:544:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "ruleDataType"
    // InternalScml.g:553:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:557:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalScml.g:558:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalScml.g:558:2: ( ( rule__DataType__Alternatives ) )
            // InternalScml.g:559:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalScml.g:560:3: ( rule__DataType__Alternatives )
            // InternalScml.g:560:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleParameterType"
    // InternalScml.g:569:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:573:1: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalScml.g:574:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalScml.g:574:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalScml.g:575:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalScml.g:576:3: ( rule__ParameterType__Alternatives )
            // InternalScml.g:576:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "rulePrincipleType"
    // InternalScml.g:585:1: rulePrincipleType : ( ( rule__PrincipleType__Alternatives ) ) ;
    public final void rulePrincipleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:589:1: ( ( ( rule__PrincipleType__Alternatives ) ) )
            // InternalScml.g:590:2: ( ( rule__PrincipleType__Alternatives ) )
            {
            // InternalScml.g:590:2: ( ( rule__PrincipleType__Alternatives ) )
            // InternalScml.g:591:3: ( rule__PrincipleType__Alternatives )
            {
             before(grammarAccess.getPrincipleTypeAccess().getAlternatives()); 
            // InternalScml.g:592:3: ( rule__PrincipleType__Alternatives )
            // InternalScml.g:592:4: rule__PrincipleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrincipleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrincipleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrincipleType"


    // $ANTLR start "ruleOperation"
    // InternalScml.g:601:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:605:1: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalScml.g:606:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalScml.g:606:2: ( ( rule__Operation__Alternatives ) )
            // InternalScml.g:607:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalScml.g:608:3: ( rule__Operation__Alternatives )
            // InternalScml.g:608:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "ruleStatus"
    // InternalScml.g:617:1: ruleStatus : ( ( rule__Status__Alternatives ) ) ;
    public final void ruleStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:621:1: ( ( ( rule__Status__Alternatives ) ) )
            // InternalScml.g:622:2: ( ( rule__Status__Alternatives ) )
            {
            // InternalScml.g:622:2: ( ( rule__Status__Alternatives ) )
            // InternalScml.g:623:3: ( rule__Status__Alternatives )
            {
             before(grammarAccess.getStatusAccess().getAlternatives()); 
            // InternalScml.g:624:3: ( rule__Status__Alternatives )
            // InternalScml.g:624:4: rule__Status__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Status__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatusAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatus"


    // $ANTLR start "rule__InfrastructureComponent__Alternatives"
    // InternalScml.g:632:1: rule__InfrastructureComponent__Alternatives : ( ( ruleBuildingComponent ) | ( ruleTransportationComponent ) | ( ruleEnvironmentalComponent ) );
    public final void rule__InfrastructureComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:636:1: ( ( ruleBuildingComponent ) | ( ruleTransportationComponent ) | ( ruleEnvironmentalComponent ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt1=1;
                }
                break;
            case 73:
                {
                alt1=2;
                }
                break;
            case 74:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalScml.g:637:2: ( ruleBuildingComponent )
                    {
                    // InternalScml.g:637:2: ( ruleBuildingComponent )
                    // InternalScml.g:638:3: ruleBuildingComponent
                    {
                     before(grammarAccess.getInfrastructureComponentAccess().getBuildingComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuildingComponent();

                    state._fsp--;

                     after(grammarAccess.getInfrastructureComponentAccess().getBuildingComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:643:2: ( ruleTransportationComponent )
                    {
                    // InternalScml.g:643:2: ( ruleTransportationComponent )
                    // InternalScml.g:644:3: ruleTransportationComponent
                    {
                     before(grammarAccess.getInfrastructureComponentAccess().getTransportationComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTransportationComponent();

                    state._fsp--;

                     after(grammarAccess.getInfrastructureComponentAccess().getTransportationComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:649:2: ( ruleEnvironmentalComponent )
                    {
                    // InternalScml.g:649:2: ( ruleEnvironmentalComponent )
                    // InternalScml.g:650:3: ruleEnvironmentalComponent
                    {
                     before(grammarAccess.getInfrastructureComponentAccess().getEnvironmentalComponentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnvironmentalComponent();

                    state._fsp--;

                     after(grammarAccess.getInfrastructureComponentAccess().getEnvironmentalComponentParserRuleCall_2()); 

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
    // $ANTLR end "rule__InfrastructureComponent__Alternatives"


    // $ANTLR start "rule__Device__Alternatives"
    // InternalScml.g:659:1: rule__Device__Alternatives : ( ( ruleSensor ) | ( ruleActuator ) );
    public final void rule__Device__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:663:1: ( ( ruleSensor ) | ( ruleActuator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==85) ) {
                alt2=1;
            }
            else if ( (LA2_0==86) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalScml.g:664:2: ( ruleSensor )
                    {
                    // InternalScml.g:664:2: ( ruleSensor )
                    // InternalScml.g:665:3: ruleSensor
                    {
                     before(grammarAccess.getDeviceAccess().getSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:670:2: ( ruleActuator )
                    {
                    // InternalScml.g:670:2: ( ruleActuator )
                    // InternalScml.g:671:3: ruleActuator
                    {
                     before(grammarAccess.getDeviceAccess().getActuatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActuator();

                    state._fsp--;

                     after(grammarAccess.getDeviceAccess().getActuatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Device__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalScml.g:680:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:684:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalScml.g:685:2: ( RULE_STRING )
                    {
                    // InternalScml.g:685:2: ( RULE_STRING )
                    // InternalScml.g:686:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:691:2: ( RULE_ID )
                    {
                    // InternalScml.g:691:2: ( RULE_ID )
                    // InternalScml.g:692:3: RULE_ID
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


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalScml.g:701:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:705:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalScml.g:706:2: ( 'E' )
                    {
                    // InternalScml.g:706:2: ( 'E' )
                    // InternalScml.g:707:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:712:2: ( 'e' )
                    {
                    // InternalScml.g:712:2: ( 'e' )
                    // InternalScml.g:713:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalScml.g:722:1: rule__DataType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'BOOL' ) ) | ( ( 'INTEGER' ) ) | ( ( 'FLOAT' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:726:1: ( ( ( 'STRING' ) ) | ( ( 'BOOL' ) ) | ( ( 'INTEGER' ) ) | ( ( 'FLOAT' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalScml.g:727:2: ( ( 'STRING' ) )
                    {
                    // InternalScml.g:727:2: ( ( 'STRING' ) )
                    // InternalScml.g:728:3: ( 'STRING' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalScml.g:729:3: ( 'STRING' )
                    // InternalScml.g:729:4: 'STRING'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:733:2: ( ( 'BOOL' ) )
                    {
                    // InternalScml.g:733:2: ( ( 'BOOL' ) )
                    // InternalScml.g:734:3: ( 'BOOL' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                    // InternalScml.g:735:3: ( 'BOOL' )
                    // InternalScml.g:735:4: 'BOOL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:739:2: ( ( 'INTEGER' ) )
                    {
                    // InternalScml.g:739:2: ( ( 'INTEGER' ) )
                    // InternalScml.g:740:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // InternalScml.g:741:3: ( 'INTEGER' )
                    // InternalScml.g:741:4: 'INTEGER'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:745:2: ( ( 'FLOAT' ) )
                    {
                    // InternalScml.g:745:2: ( ( 'FLOAT' ) )
                    // InternalScml.g:746:3: ( 'FLOAT' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_3()); 
                    // InternalScml.g:747:3: ( 'FLOAT' )
                    // InternalScml.g:747:4: 'FLOAT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalScml.g:755:1: rule__ParameterType__Alternatives : ( ( ( 'AIRQUALITY' ) ) | ( ( 'WEATHER' ) ) | ( ( 'TRAFFIC' ) ) | ( ( 'ENERGY' ) ) | ( ( 'AGRICULTURAL' ) ) | ( ( 'NAVIGATION' ) ) | ( ( 'WASTEMANAGEMENT' ) ) | ( ( 'SAFETY' ) ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:759:1: ( ( ( 'AIRQUALITY' ) ) | ( ( 'WEATHER' ) ) | ( ( 'TRAFFIC' ) ) | ( ( 'ENERGY' ) ) | ( ( 'AGRICULTURAL' ) ) | ( ( 'NAVIGATION' ) ) | ( ( 'WASTEMANAGEMENT' ) ) | ( ( 'SAFETY' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
                {
                alt6=5;
                }
                break;
            case 22:
                {
                alt6=6;
                }
                break;
            case 23:
                {
                alt6=7;
                }
                break;
            case 24:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalScml.g:760:2: ( ( 'AIRQUALITY' ) )
                    {
                    // InternalScml.g:760:2: ( ( 'AIRQUALITY' ) )
                    // InternalScml.g:761:3: ( 'AIRQUALITY' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getAIRQUALITYEnumLiteralDeclaration_0()); 
                    // InternalScml.g:762:3: ( 'AIRQUALITY' )
                    // InternalScml.g:762:4: 'AIRQUALITY'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getAIRQUALITYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:766:2: ( ( 'WEATHER' ) )
                    {
                    // InternalScml.g:766:2: ( ( 'WEATHER' ) )
                    // InternalScml.g:767:3: ( 'WEATHER' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getWEATHEREnumLiteralDeclaration_1()); 
                    // InternalScml.g:768:3: ( 'WEATHER' )
                    // InternalScml.g:768:4: 'WEATHER'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getWEATHEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:772:2: ( ( 'TRAFFIC' ) )
                    {
                    // InternalScml.g:772:2: ( ( 'TRAFFIC' ) )
                    // InternalScml.g:773:3: ( 'TRAFFIC' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getTRAFFICEnumLiteralDeclaration_2()); 
                    // InternalScml.g:774:3: ( 'TRAFFIC' )
                    // InternalScml.g:774:4: 'TRAFFIC'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getTRAFFICEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:778:2: ( ( 'ENERGY' ) )
                    {
                    // InternalScml.g:778:2: ( ( 'ENERGY' ) )
                    // InternalScml.g:779:3: ( 'ENERGY' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getENERGYEnumLiteralDeclaration_3()); 
                    // InternalScml.g:780:3: ( 'ENERGY' )
                    // InternalScml.g:780:4: 'ENERGY'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getENERGYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScml.g:784:2: ( ( 'AGRICULTURAL' ) )
                    {
                    // InternalScml.g:784:2: ( ( 'AGRICULTURAL' ) )
                    // InternalScml.g:785:3: ( 'AGRICULTURAL' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getAGRICULTURALEnumLiteralDeclaration_4()); 
                    // InternalScml.g:786:3: ( 'AGRICULTURAL' )
                    // InternalScml.g:786:4: 'AGRICULTURAL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getAGRICULTURALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalScml.g:790:2: ( ( 'NAVIGATION' ) )
                    {
                    // InternalScml.g:790:2: ( ( 'NAVIGATION' ) )
                    // InternalScml.g:791:3: ( 'NAVIGATION' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getNAVIGATIONEnumLiteralDeclaration_5()); 
                    // InternalScml.g:792:3: ( 'NAVIGATION' )
                    // InternalScml.g:792:4: 'NAVIGATION'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getNAVIGATIONEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalScml.g:796:2: ( ( 'WASTEMANAGEMENT' ) )
                    {
                    // InternalScml.g:796:2: ( ( 'WASTEMANAGEMENT' ) )
                    // InternalScml.g:797:3: ( 'WASTEMANAGEMENT' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getWASTEMANAGEMENTEnumLiteralDeclaration_6()); 
                    // InternalScml.g:798:3: ( 'WASTEMANAGEMENT' )
                    // InternalScml.g:798:4: 'WASTEMANAGEMENT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getWASTEMANAGEMENTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalScml.g:802:2: ( ( 'SAFETY' ) )
                    {
                    // InternalScml.g:802:2: ( ( 'SAFETY' ) )
                    // InternalScml.g:803:3: ( 'SAFETY' )
                    {
                     before(grammarAccess.getParameterTypeAccess().getSAFETYEnumLiteralDeclaration_7()); 
                    // InternalScml.g:804:3: ( 'SAFETY' )
                    // InternalScml.g:804:4: 'SAFETY'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getParameterTypeAccess().getSAFETYEnumLiteralDeclaration_7()); 

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__PrincipleType__Alternatives"
    // InternalScml.g:812:1: rule__PrincipleType__Alternatives : ( ( ( 'LAW' ) ) | ( ( 'STANDARD' ) ) | ( ( 'POLICY' ) ) );
    public final void rule__PrincipleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:816:1: ( ( ( 'LAW' ) ) | ( ( 'STANDARD' ) ) | ( ( 'POLICY' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalScml.g:817:2: ( ( 'LAW' ) )
                    {
                    // InternalScml.g:817:2: ( ( 'LAW' ) )
                    // InternalScml.g:818:3: ( 'LAW' )
                    {
                     before(grammarAccess.getPrincipleTypeAccess().getLAWEnumLiteralDeclaration_0()); 
                    // InternalScml.g:819:3: ( 'LAW' )
                    // InternalScml.g:819:4: 'LAW'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrincipleTypeAccess().getLAWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:823:2: ( ( 'STANDARD' ) )
                    {
                    // InternalScml.g:823:2: ( ( 'STANDARD' ) )
                    // InternalScml.g:824:3: ( 'STANDARD' )
                    {
                     before(grammarAccess.getPrincipleTypeAccess().getSTANDARDEnumLiteralDeclaration_1()); 
                    // InternalScml.g:825:3: ( 'STANDARD' )
                    // InternalScml.g:825:4: 'STANDARD'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrincipleTypeAccess().getSTANDARDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:829:2: ( ( 'POLICY' ) )
                    {
                    // InternalScml.g:829:2: ( ( 'POLICY' ) )
                    // InternalScml.g:830:3: ( 'POLICY' )
                    {
                     before(grammarAccess.getPrincipleTypeAccess().getPOLICYEnumLiteralDeclaration_2()); 
                    // InternalScml.g:831:3: ( 'POLICY' )
                    // InternalScml.g:831:4: 'POLICY'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPrincipleTypeAccess().getPOLICYEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__PrincipleType__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalScml.g:839:1: rule__Operation__Alternatives : ( ( ( 'SUM' ) ) | ( ( 'DIFF' ) ) | ( ( 'AVG' ) ) | ( ( 'MIN' ) ) | ( ( 'MAX' ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:843:1: ( ( ( 'SUM' ) ) | ( ( 'DIFF' ) ) | ( ( 'AVG' ) ) | ( ( 'MIN' ) ) | ( ( 'MAX' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 32:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalScml.g:844:2: ( ( 'SUM' ) )
                    {
                    // InternalScml.g:844:2: ( ( 'SUM' ) )
                    // InternalScml.g:845:3: ( 'SUM' )
                    {
                     before(grammarAccess.getOperationAccess().getSUMEnumLiteralDeclaration_0()); 
                    // InternalScml.g:846:3: ( 'SUM' )
                    // InternalScml.g:846:4: 'SUM'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getSUMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:850:2: ( ( 'DIFF' ) )
                    {
                    // InternalScml.g:850:2: ( ( 'DIFF' ) )
                    // InternalScml.g:851:3: ( 'DIFF' )
                    {
                     before(grammarAccess.getOperationAccess().getDIFFEnumLiteralDeclaration_1()); 
                    // InternalScml.g:852:3: ( 'DIFF' )
                    // InternalScml.g:852:4: 'DIFF'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getDIFFEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:856:2: ( ( 'AVG' ) )
                    {
                    // InternalScml.g:856:2: ( ( 'AVG' ) )
                    // InternalScml.g:857:3: ( 'AVG' )
                    {
                     before(grammarAccess.getOperationAccess().getAVGEnumLiteralDeclaration_2()); 
                    // InternalScml.g:858:3: ( 'AVG' )
                    // InternalScml.g:858:4: 'AVG'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getAVGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScml.g:862:2: ( ( 'MIN' ) )
                    {
                    // InternalScml.g:862:2: ( ( 'MIN' ) )
                    // InternalScml.g:863:3: ( 'MIN' )
                    {
                     before(grammarAccess.getOperationAccess().getMINEnumLiteralDeclaration_3()); 
                    // InternalScml.g:864:3: ( 'MIN' )
                    // InternalScml.g:864:4: 'MIN'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getMINEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScml.g:868:2: ( ( 'MAX' ) )
                    {
                    // InternalScml.g:868:2: ( ( 'MAX' ) )
                    // InternalScml.g:869:3: ( 'MAX' )
                    {
                     before(grammarAccess.getOperationAccess().getMAXEnumLiteralDeclaration_4()); 
                    // InternalScml.g:870:3: ( 'MAX' )
                    // InternalScml.g:870:4: 'MAX'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationAccess().getMAXEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Status__Alternatives"
    // InternalScml.g:878:1: rule__Status__Alternatives : ( ( ( 'GOOD' ) ) | ( ( 'WARN' ) ) | ( ( 'CRITICAL' ) ) );
    public final void rule__Status__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:882:1: ( ( ( 'GOOD' ) ) | ( ( 'WARN' ) ) | ( ( 'CRITICAL' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalScml.g:883:2: ( ( 'GOOD' ) )
                    {
                    // InternalScml.g:883:2: ( ( 'GOOD' ) )
                    // InternalScml.g:884:3: ( 'GOOD' )
                    {
                     before(grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0()); 
                    // InternalScml.g:885:3: ( 'GOOD' )
                    // InternalScml.g:885:4: 'GOOD'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScml.g:889:2: ( ( 'WARN' ) )
                    {
                    // InternalScml.g:889:2: ( ( 'WARN' ) )
                    // InternalScml.g:890:3: ( 'WARN' )
                    {
                     before(grammarAccess.getStatusAccess().getWARNEnumLiteralDeclaration_1()); 
                    // InternalScml.g:891:3: ( 'WARN' )
                    // InternalScml.g:891:4: 'WARN'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getWARNEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScml.g:895:2: ( ( 'CRITICAL' ) )
                    {
                    // InternalScml.g:895:2: ( ( 'CRITICAL' ) )
                    // InternalScml.g:896:3: ( 'CRITICAL' )
                    {
                     before(grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2()); 
                    // InternalScml.g:897:3: ( 'CRITICAL' )
                    // InternalScml.g:897:4: 'CRITICAL'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Status__Alternatives"


    // $ANTLR start "rule__SmartCity__Group__0"
    // InternalScml.g:905:1: rule__SmartCity__Group__0 : rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1 ;
    public final void rule__SmartCity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:909:1: ( rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1 )
            // InternalScml.g:910:2: rule__SmartCity__Group__0__Impl rule__SmartCity__Group__1
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
    // InternalScml.g:917:1: rule__SmartCity__Group__0__Impl : ( () ) ;
    public final void rule__SmartCity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:921:1: ( ( () ) )
            // InternalScml.g:922:1: ( () )
            {
            // InternalScml.g:922:1: ( () )
            // InternalScml.g:923:2: ()
            {
             before(grammarAccess.getSmartCityAccess().getSmartCityAction_0()); 
            // InternalScml.g:924:2: ()
            // InternalScml.g:924:3: 
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
    // InternalScml.g:932:1: rule__SmartCity__Group__1 : rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2 ;
    public final void rule__SmartCity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:936:1: ( rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2 )
            // InternalScml.g:937:2: rule__SmartCity__Group__1__Impl rule__SmartCity__Group__2
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
    // InternalScml.g:944:1: rule__SmartCity__Group__1__Impl : ( 'SmartCity' ) ;
    public final void rule__SmartCity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:948:1: ( ( 'SmartCity' ) )
            // InternalScml.g:949:1: ( 'SmartCity' )
            {
            // InternalScml.g:949:1: ( 'SmartCity' )
            // InternalScml.g:950:2: 'SmartCity'
            {
             before(grammarAccess.getSmartCityAccess().getSmartCityKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalScml.g:959:1: rule__SmartCity__Group__2 : rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3 ;
    public final void rule__SmartCity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:963:1: ( rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3 )
            // InternalScml.g:964:2: rule__SmartCity__Group__2__Impl rule__SmartCity__Group__3
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
    // InternalScml.g:971:1: rule__SmartCity__Group__2__Impl : ( ( rule__SmartCity__NameAssignment_2 ) ) ;
    public final void rule__SmartCity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:975:1: ( ( ( rule__SmartCity__NameAssignment_2 ) ) )
            // InternalScml.g:976:1: ( ( rule__SmartCity__NameAssignment_2 ) )
            {
            // InternalScml.g:976:1: ( ( rule__SmartCity__NameAssignment_2 ) )
            // InternalScml.g:977:2: ( rule__SmartCity__NameAssignment_2 )
            {
             before(grammarAccess.getSmartCityAccess().getNameAssignment_2()); 
            // InternalScml.g:978:2: ( rule__SmartCity__NameAssignment_2 )
            // InternalScml.g:978:3: rule__SmartCity__NameAssignment_2
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
    // InternalScml.g:986:1: rule__SmartCity__Group__3 : rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4 ;
    public final void rule__SmartCity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:990:1: ( rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4 )
            // InternalScml.g:991:2: rule__SmartCity__Group__3__Impl rule__SmartCity__Group__4
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
    // InternalScml.g:998:1: rule__SmartCity__Group__3__Impl : ( '{' ) ;
    public final void rule__SmartCity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1002:1: ( ( '{' ) )
            // InternalScml.g:1003:1: ( '{' )
            {
            // InternalScml.g:1003:1: ( '{' )
            // InternalScml.g:1004:2: '{'
            {
             before(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalScml.g:1013:1: rule__SmartCity__Group__4 : rule__SmartCity__Group__4__Impl rule__SmartCity__Group__5 ;
    public final void rule__SmartCity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1017:1: ( rule__SmartCity__Group__4__Impl rule__SmartCity__Group__5 )
            // InternalScml.g:1018:2: rule__SmartCity__Group__4__Impl rule__SmartCity__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SmartCity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__5();

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
    // InternalScml.g:1025:1: rule__SmartCity__Group__4__Impl : ( ( rule__SmartCity__Group_4__0 )? ) ;
    public final void rule__SmartCity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1029:1: ( ( ( rule__SmartCity__Group_4__0 )? ) )
            // InternalScml.g:1030:1: ( ( rule__SmartCity__Group_4__0 )? )
            {
            // InternalScml.g:1030:1: ( ( rule__SmartCity__Group_4__0 )? )
            // InternalScml.g:1031:2: ( rule__SmartCity__Group_4__0 )?
            {
             before(grammarAccess.getSmartCityAccess().getGroup_4()); 
            // InternalScml.g:1032:2: ( rule__SmartCity__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalScml.g:1032:3: rule__SmartCity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartCity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartCityAccess().getGroup_4()); 

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


    // $ANTLR start "rule__SmartCity__Group__5"
    // InternalScml.g:1040:1: rule__SmartCity__Group__5 : rule__SmartCity__Group__5__Impl rule__SmartCity__Group__6 ;
    public final void rule__SmartCity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1044:1: ( rule__SmartCity__Group__5__Impl rule__SmartCity__Group__6 )
            // InternalScml.g:1045:2: rule__SmartCity__Group__5__Impl rule__SmartCity__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SmartCity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__6();

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
    // $ANTLR end "rule__SmartCity__Group__5"


    // $ANTLR start "rule__SmartCity__Group__5__Impl"
    // InternalScml.g:1052:1: rule__SmartCity__Group__5__Impl : ( ( rule__SmartCity__Group_5__0 )? ) ;
    public final void rule__SmartCity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1056:1: ( ( ( rule__SmartCity__Group_5__0 )? ) )
            // InternalScml.g:1057:1: ( ( rule__SmartCity__Group_5__0 )? )
            {
            // InternalScml.g:1057:1: ( ( rule__SmartCity__Group_5__0 )? )
            // InternalScml.g:1058:2: ( rule__SmartCity__Group_5__0 )?
            {
             before(grammarAccess.getSmartCityAccess().getGroup_5()); 
            // InternalScml.g:1059:2: ( rule__SmartCity__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalScml.g:1059:3: rule__SmartCity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartCity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartCityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SmartCity__Group__5__Impl"


    // $ANTLR start "rule__SmartCity__Group__6"
    // InternalScml.g:1067:1: rule__SmartCity__Group__6 : rule__SmartCity__Group__6__Impl ;
    public final void rule__SmartCity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1071:1: ( rule__SmartCity__Group__6__Impl )
            // InternalScml.g:1072:2: rule__SmartCity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group__6__Impl();

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
    // $ANTLR end "rule__SmartCity__Group__6"


    // $ANTLR start "rule__SmartCity__Group__6__Impl"
    // InternalScml.g:1078:1: rule__SmartCity__Group__6__Impl : ( '}' ) ;
    public final void rule__SmartCity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1082:1: ( ( '}' ) )
            // InternalScml.g:1083:1: ( '}' )
            {
            // InternalScml.g:1083:1: ( '}' )
            // InternalScml.g:1084:2: '}'
            {
             before(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__SmartCity__Group__6__Impl"


    // $ANTLR start "rule__SmartCity__Group_4__0"
    // InternalScml.g:1094:1: rule__SmartCity__Group_4__0 : rule__SmartCity__Group_4__0__Impl rule__SmartCity__Group_4__1 ;
    public final void rule__SmartCity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1098:1: ( rule__SmartCity__Group_4__0__Impl rule__SmartCity__Group_4__1 )
            // InternalScml.g:1099:2: rule__SmartCity__Group_4__0__Impl rule__SmartCity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SmartCity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4__1();

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
    // $ANTLR end "rule__SmartCity__Group_4__0"


    // $ANTLR start "rule__SmartCity__Group_4__0__Impl"
    // InternalScml.g:1106:1: rule__SmartCity__Group_4__0__Impl : ( 'category' ) ;
    public final void rule__SmartCity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1110:1: ( ( 'category' ) )
            // InternalScml.g:1111:1: ( 'category' )
            {
            // InternalScml.g:1111:1: ( 'category' )
            // InternalScml.g:1112:2: 'category'
            {
             before(grammarAccess.getSmartCityAccess().getCategoryKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getCategoryKeyword_4_0()); 

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
    // $ANTLR end "rule__SmartCity__Group_4__0__Impl"


    // $ANTLR start "rule__SmartCity__Group_4__1"
    // InternalScml.g:1121:1: rule__SmartCity__Group_4__1 : rule__SmartCity__Group_4__1__Impl rule__SmartCity__Group_4__2 ;
    public final void rule__SmartCity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1125:1: ( rule__SmartCity__Group_4__1__Impl rule__SmartCity__Group_4__2 )
            // InternalScml.g:1126:2: rule__SmartCity__Group_4__1__Impl rule__SmartCity__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__SmartCity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4__2();

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
    // $ANTLR end "rule__SmartCity__Group_4__1"


    // $ANTLR start "rule__SmartCity__Group_4__1__Impl"
    // InternalScml.g:1133:1: rule__SmartCity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SmartCity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1137:1: ( ( '{' ) )
            // InternalScml.g:1138:1: ( '{' )
            {
            // InternalScml.g:1138:1: ( '{' )
            // InternalScml.g:1139:2: '{'
            {
             before(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__SmartCity__Group_4__1__Impl"


    // $ANTLR start "rule__SmartCity__Group_4__2"
    // InternalScml.g:1148:1: rule__SmartCity__Group_4__2 : rule__SmartCity__Group_4__2__Impl rule__SmartCity__Group_4__3 ;
    public final void rule__SmartCity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1152:1: ( rule__SmartCity__Group_4__2__Impl rule__SmartCity__Group_4__3 )
            // InternalScml.g:1153:2: rule__SmartCity__Group_4__2__Impl rule__SmartCity__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__SmartCity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4__3();

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
    // $ANTLR end "rule__SmartCity__Group_4__2"


    // $ANTLR start "rule__SmartCity__Group_4__2__Impl"
    // InternalScml.g:1160:1: rule__SmartCity__Group_4__2__Impl : ( ( rule__SmartCity__CategoryAssignment_4_2 ) ) ;
    public final void rule__SmartCity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1164:1: ( ( ( rule__SmartCity__CategoryAssignment_4_2 ) ) )
            // InternalScml.g:1165:1: ( ( rule__SmartCity__CategoryAssignment_4_2 ) )
            {
            // InternalScml.g:1165:1: ( ( rule__SmartCity__CategoryAssignment_4_2 ) )
            // InternalScml.g:1166:2: ( rule__SmartCity__CategoryAssignment_4_2 )
            {
             before(grammarAccess.getSmartCityAccess().getCategoryAssignment_4_2()); 
            // InternalScml.g:1167:2: ( rule__SmartCity__CategoryAssignment_4_2 )
            // InternalScml.g:1167:3: rule__SmartCity__CategoryAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__CategoryAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getCategoryAssignment_4_2()); 

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
    // $ANTLR end "rule__SmartCity__Group_4__2__Impl"


    // $ANTLR start "rule__SmartCity__Group_4__3"
    // InternalScml.g:1175:1: rule__SmartCity__Group_4__3 : rule__SmartCity__Group_4__3__Impl rule__SmartCity__Group_4__4 ;
    public final void rule__SmartCity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1179:1: ( rule__SmartCity__Group_4__3__Impl rule__SmartCity__Group_4__4 )
            // InternalScml.g:1180:2: rule__SmartCity__Group_4__3__Impl rule__SmartCity__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__SmartCity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4__4();

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
    // $ANTLR end "rule__SmartCity__Group_4__3"


    // $ANTLR start "rule__SmartCity__Group_4__3__Impl"
    // InternalScml.g:1187:1: rule__SmartCity__Group_4__3__Impl : ( ( rule__SmartCity__Group_4_3__0 )* ) ;
    public final void rule__SmartCity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1191:1: ( ( ( rule__SmartCity__Group_4_3__0 )* ) )
            // InternalScml.g:1192:1: ( ( rule__SmartCity__Group_4_3__0 )* )
            {
            // InternalScml.g:1192:1: ( ( rule__SmartCity__Group_4_3__0 )* )
            // InternalScml.g:1193:2: ( rule__SmartCity__Group_4_3__0 )*
            {
             before(grammarAccess.getSmartCityAccess().getGroup_4_3()); 
            // InternalScml.g:1194:2: ( rule__SmartCity__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalScml.g:1194:3: rule__SmartCity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SmartCity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSmartCityAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__SmartCity__Group_4__3__Impl"


    // $ANTLR start "rule__SmartCity__Group_4__4"
    // InternalScml.g:1202:1: rule__SmartCity__Group_4__4 : rule__SmartCity__Group_4__4__Impl ;
    public final void rule__SmartCity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1206:1: ( rule__SmartCity__Group_4__4__Impl )
            // InternalScml.g:1207:2: rule__SmartCity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4__4__Impl();

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
    // $ANTLR end "rule__SmartCity__Group_4__4"


    // $ANTLR start "rule__SmartCity__Group_4__4__Impl"
    // InternalScml.g:1213:1: rule__SmartCity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SmartCity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1217:1: ( ( '}' ) )
            // InternalScml.g:1218:1: ( '}' )
            {
            // InternalScml.g:1218:1: ( '}' )
            // InternalScml.g:1219:2: '}'
            {
             before(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__SmartCity__Group_4__4__Impl"


    // $ANTLR start "rule__SmartCity__Group_4_3__0"
    // InternalScml.g:1229:1: rule__SmartCity__Group_4_3__0 : rule__SmartCity__Group_4_3__0__Impl rule__SmartCity__Group_4_3__1 ;
    public final void rule__SmartCity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1233:1: ( rule__SmartCity__Group_4_3__0__Impl rule__SmartCity__Group_4_3__1 )
            // InternalScml.g:1234:2: rule__SmartCity__Group_4_3__0__Impl rule__SmartCity__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__SmartCity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4_3__1();

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
    // $ANTLR end "rule__SmartCity__Group_4_3__0"


    // $ANTLR start "rule__SmartCity__Group_4_3__0__Impl"
    // InternalScml.g:1241:1: rule__SmartCity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SmartCity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1245:1: ( ( ',' ) )
            // InternalScml.g:1246:1: ( ',' )
            {
            // InternalScml.g:1246:1: ( ',' )
            // InternalScml.g:1247:2: ','
            {
             before(grammarAccess.getSmartCityAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__SmartCity__Group_4_3__0__Impl"


    // $ANTLR start "rule__SmartCity__Group_4_3__1"
    // InternalScml.g:1256:1: rule__SmartCity__Group_4_3__1 : rule__SmartCity__Group_4_3__1__Impl ;
    public final void rule__SmartCity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1260:1: ( rule__SmartCity__Group_4_3__1__Impl )
            // InternalScml.g:1261:2: rule__SmartCity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__SmartCity__Group_4_3__1"


    // $ANTLR start "rule__SmartCity__Group_4_3__1__Impl"
    // InternalScml.g:1267:1: rule__SmartCity__Group_4_3__1__Impl : ( ( rule__SmartCity__CategoryAssignment_4_3_1 ) ) ;
    public final void rule__SmartCity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1271:1: ( ( ( rule__SmartCity__CategoryAssignment_4_3_1 ) ) )
            // InternalScml.g:1272:1: ( ( rule__SmartCity__CategoryAssignment_4_3_1 ) )
            {
            // InternalScml.g:1272:1: ( ( rule__SmartCity__CategoryAssignment_4_3_1 ) )
            // InternalScml.g:1273:2: ( rule__SmartCity__CategoryAssignment_4_3_1 )
            {
             before(grammarAccess.getSmartCityAccess().getCategoryAssignment_4_3_1()); 
            // InternalScml.g:1274:2: ( rule__SmartCity__CategoryAssignment_4_3_1 )
            // InternalScml.g:1274:3: rule__SmartCity__CategoryAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__CategoryAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getCategoryAssignment_4_3_1()); 

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
    // $ANTLR end "rule__SmartCity__Group_4_3__1__Impl"


    // $ANTLR start "rule__SmartCity__Group_5__0"
    // InternalScml.g:1283:1: rule__SmartCity__Group_5__0 : rule__SmartCity__Group_5__0__Impl rule__SmartCity__Group_5__1 ;
    public final void rule__SmartCity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1287:1: ( rule__SmartCity__Group_5__0__Impl rule__SmartCity__Group_5__1 )
            // InternalScml.g:1288:2: rule__SmartCity__Group_5__0__Impl rule__SmartCity__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__SmartCity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5__1();

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
    // $ANTLR end "rule__SmartCity__Group_5__0"


    // $ANTLR start "rule__SmartCity__Group_5__0__Impl"
    // InternalScml.g:1295:1: rule__SmartCity__Group_5__0__Impl : ( 'project' ) ;
    public final void rule__SmartCity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1299:1: ( ( 'project' ) )
            // InternalScml.g:1300:1: ( 'project' )
            {
            // InternalScml.g:1300:1: ( 'project' )
            // InternalScml.g:1301:2: 'project'
            {
             before(grammarAccess.getSmartCityAccess().getProjectKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getProjectKeyword_5_0()); 

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
    // $ANTLR end "rule__SmartCity__Group_5__0__Impl"


    // $ANTLR start "rule__SmartCity__Group_5__1"
    // InternalScml.g:1310:1: rule__SmartCity__Group_5__1 : rule__SmartCity__Group_5__1__Impl rule__SmartCity__Group_5__2 ;
    public final void rule__SmartCity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1314:1: ( rule__SmartCity__Group_5__1__Impl rule__SmartCity__Group_5__2 )
            // InternalScml.g:1315:2: rule__SmartCity__Group_5__1__Impl rule__SmartCity__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__SmartCity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5__2();

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
    // $ANTLR end "rule__SmartCity__Group_5__1"


    // $ANTLR start "rule__SmartCity__Group_5__1__Impl"
    // InternalScml.g:1322:1: rule__SmartCity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__SmartCity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1326:1: ( ( '{' ) )
            // InternalScml.g:1327:1: ( '{' )
            {
            // InternalScml.g:1327:1: ( '{' )
            // InternalScml.g:1328:2: '{'
            {
             before(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__SmartCity__Group_5__1__Impl"


    // $ANTLR start "rule__SmartCity__Group_5__2"
    // InternalScml.g:1337:1: rule__SmartCity__Group_5__2 : rule__SmartCity__Group_5__2__Impl rule__SmartCity__Group_5__3 ;
    public final void rule__SmartCity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1341:1: ( rule__SmartCity__Group_5__2__Impl rule__SmartCity__Group_5__3 )
            // InternalScml.g:1342:2: rule__SmartCity__Group_5__2__Impl rule__SmartCity__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__SmartCity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5__3();

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
    // $ANTLR end "rule__SmartCity__Group_5__2"


    // $ANTLR start "rule__SmartCity__Group_5__2__Impl"
    // InternalScml.g:1349:1: rule__SmartCity__Group_5__2__Impl : ( ( rule__SmartCity__ProjectAssignment_5_2 ) ) ;
    public final void rule__SmartCity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1353:1: ( ( ( rule__SmartCity__ProjectAssignment_5_2 ) ) )
            // InternalScml.g:1354:1: ( ( rule__SmartCity__ProjectAssignment_5_2 ) )
            {
            // InternalScml.g:1354:1: ( ( rule__SmartCity__ProjectAssignment_5_2 ) )
            // InternalScml.g:1355:2: ( rule__SmartCity__ProjectAssignment_5_2 )
            {
             before(grammarAccess.getSmartCityAccess().getProjectAssignment_5_2()); 
            // InternalScml.g:1356:2: ( rule__SmartCity__ProjectAssignment_5_2 )
            // InternalScml.g:1356:3: rule__SmartCity__ProjectAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__ProjectAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getProjectAssignment_5_2()); 

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
    // $ANTLR end "rule__SmartCity__Group_5__2__Impl"


    // $ANTLR start "rule__SmartCity__Group_5__3"
    // InternalScml.g:1364:1: rule__SmartCity__Group_5__3 : rule__SmartCity__Group_5__3__Impl rule__SmartCity__Group_5__4 ;
    public final void rule__SmartCity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1368:1: ( rule__SmartCity__Group_5__3__Impl rule__SmartCity__Group_5__4 )
            // InternalScml.g:1369:2: rule__SmartCity__Group_5__3__Impl rule__SmartCity__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__SmartCity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5__4();

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
    // $ANTLR end "rule__SmartCity__Group_5__3"


    // $ANTLR start "rule__SmartCity__Group_5__3__Impl"
    // InternalScml.g:1376:1: rule__SmartCity__Group_5__3__Impl : ( ( rule__SmartCity__Group_5_3__0 )* ) ;
    public final void rule__SmartCity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1380:1: ( ( ( rule__SmartCity__Group_5_3__0 )* ) )
            // InternalScml.g:1381:1: ( ( rule__SmartCity__Group_5_3__0 )* )
            {
            // InternalScml.g:1381:1: ( ( rule__SmartCity__Group_5_3__0 )* )
            // InternalScml.g:1382:2: ( rule__SmartCity__Group_5_3__0 )*
            {
             before(grammarAccess.getSmartCityAccess().getGroup_5_3()); 
            // InternalScml.g:1383:2: ( rule__SmartCity__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalScml.g:1383:3: rule__SmartCity__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SmartCity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSmartCityAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__SmartCity__Group_5__3__Impl"


    // $ANTLR start "rule__SmartCity__Group_5__4"
    // InternalScml.g:1391:1: rule__SmartCity__Group_5__4 : rule__SmartCity__Group_5__4__Impl ;
    public final void rule__SmartCity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1395:1: ( rule__SmartCity__Group_5__4__Impl )
            // InternalScml.g:1396:2: rule__SmartCity__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5__4__Impl();

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
    // $ANTLR end "rule__SmartCity__Group_5__4"


    // $ANTLR start "rule__SmartCity__Group_5__4__Impl"
    // InternalScml.g:1402:1: rule__SmartCity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SmartCity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1406:1: ( ( '}' ) )
            // InternalScml.g:1407:1: ( '}' )
            {
            // InternalScml.g:1407:1: ( '}' )
            // InternalScml.g:1408:2: '}'
            {
             before(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__SmartCity__Group_5__4__Impl"


    // $ANTLR start "rule__SmartCity__Group_5_3__0"
    // InternalScml.g:1418:1: rule__SmartCity__Group_5_3__0 : rule__SmartCity__Group_5_3__0__Impl rule__SmartCity__Group_5_3__1 ;
    public final void rule__SmartCity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1422:1: ( rule__SmartCity__Group_5_3__0__Impl rule__SmartCity__Group_5_3__1 )
            // InternalScml.g:1423:2: rule__SmartCity__Group_5_3__0__Impl rule__SmartCity__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__SmartCity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5_3__1();

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
    // $ANTLR end "rule__SmartCity__Group_5_3__0"


    // $ANTLR start "rule__SmartCity__Group_5_3__0__Impl"
    // InternalScml.g:1430:1: rule__SmartCity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__SmartCity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1434:1: ( ( ',' ) )
            // InternalScml.g:1435:1: ( ',' )
            {
            // InternalScml.g:1435:1: ( ',' )
            // InternalScml.g:1436:2: ','
            {
             before(grammarAccess.getSmartCityAccess().getCommaKeyword_5_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSmartCityAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__SmartCity__Group_5_3__0__Impl"


    // $ANTLR start "rule__SmartCity__Group_5_3__1"
    // InternalScml.g:1445:1: rule__SmartCity__Group_5_3__1 : rule__SmartCity__Group_5_3__1__Impl ;
    public final void rule__SmartCity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1449:1: ( rule__SmartCity__Group_5_3__1__Impl )
            // InternalScml.g:1450:2: rule__SmartCity__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__SmartCity__Group_5_3__1"


    // $ANTLR start "rule__SmartCity__Group_5_3__1__Impl"
    // InternalScml.g:1456:1: rule__SmartCity__Group_5_3__1__Impl : ( ( rule__SmartCity__ProjectAssignment_5_3_1 ) ) ;
    public final void rule__SmartCity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1460:1: ( ( ( rule__SmartCity__ProjectAssignment_5_3_1 ) ) )
            // InternalScml.g:1461:1: ( ( rule__SmartCity__ProjectAssignment_5_3_1 ) )
            {
            // InternalScml.g:1461:1: ( ( rule__SmartCity__ProjectAssignment_5_3_1 ) )
            // InternalScml.g:1462:2: ( rule__SmartCity__ProjectAssignment_5_3_1 )
            {
             before(grammarAccess.getSmartCityAccess().getProjectAssignment_5_3_1()); 
            // InternalScml.g:1463:2: ( rule__SmartCity__ProjectAssignment_5_3_1 )
            // InternalScml.g:1463:3: rule__SmartCity__ProjectAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartCity__ProjectAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartCityAccess().getProjectAssignment_5_3_1()); 

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
    // $ANTLR end "rule__SmartCity__Group_5_3__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalScml.g:1472:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1476:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalScml.g:1477:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalScml.g:1484:1: rule__Category__Group__0__Impl : ( 'Category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1488:1: ( ( 'Category' ) )
            // InternalScml.g:1489:1: ( 'Category' )
            {
            // InternalScml.g:1489:1: ( 'Category' )
            // InternalScml.g:1490:2: 'Category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

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
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalScml.g:1499:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1503:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // InternalScml.g:1504:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__2();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalScml.g:1511:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1515:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalScml.g:1516:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalScml.g:1516:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalScml.g:1517:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalScml.g:1518:2: ( rule__Category__NameAssignment_1 )
            // InternalScml.g:1518:3: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // InternalScml.g:1526:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1530:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // InternalScml.g:1531:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__3();

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
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // InternalScml.g:1538:1: rule__Category__Group__2__Impl : ( '{' ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1542:1: ( ( '{' ) )
            // InternalScml.g:1543:1: ( '{' )
            {
            // InternalScml.g:1543:1: ( '{' )
            // InternalScml.g:1544:2: '{'
            {
             before(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // InternalScml.g:1553:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1557:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // InternalScml.g:1558:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__4();

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
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // InternalScml.g:1565:1: rule__Category__Group__3__Impl : ( 'SDG' ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1569:1: ( ( 'SDG' ) )
            // InternalScml.g:1570:1: ( 'SDG' )
            {
            // InternalScml.g:1570:1: ( 'SDG' )
            // InternalScml.g:1571:2: 'SDG'
            {
             before(grammarAccess.getCategoryAccess().getSDGKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getSDGKeyword_3()); 

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
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group__4"
    // InternalScml.g:1580:1: rule__Category__Group__4 : rule__Category__Group__4__Impl rule__Category__Group__5 ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1584:1: ( rule__Category__Group__4__Impl rule__Category__Group__5 )
            // InternalScml.g:1585:2: rule__Category__Group__4__Impl rule__Category__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Category__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__5();

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
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // InternalScml.g:1592:1: rule__Category__Group__4__Impl : ( '{' ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1596:1: ( ( '{' ) )
            // InternalScml.g:1597:1: ( '{' )
            {
            // InternalScml.g:1597:1: ( '{' )
            // InternalScml.g:1598:2: '{'
            {
             before(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Category__Group__5"
    // InternalScml.g:1607:1: rule__Category__Group__5 : rule__Category__Group__5__Impl rule__Category__Group__6 ;
    public final void rule__Category__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1611:1: ( rule__Category__Group__5__Impl rule__Category__Group__6 )
            // InternalScml.g:1612:2: rule__Category__Group__5__Impl rule__Category__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__6();

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
    // $ANTLR end "rule__Category__Group__5"


    // $ANTLR start "rule__Category__Group__5__Impl"
    // InternalScml.g:1619:1: rule__Category__Group__5__Impl : ( ( rule__Category__SDGAssignment_5 ) ) ;
    public final void rule__Category__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1623:1: ( ( ( rule__Category__SDGAssignment_5 ) ) )
            // InternalScml.g:1624:1: ( ( rule__Category__SDGAssignment_5 ) )
            {
            // InternalScml.g:1624:1: ( ( rule__Category__SDGAssignment_5 ) )
            // InternalScml.g:1625:2: ( rule__Category__SDGAssignment_5 )
            {
             before(grammarAccess.getCategoryAccess().getSDGAssignment_5()); 
            // InternalScml.g:1626:2: ( rule__Category__SDGAssignment_5 )
            // InternalScml.g:1626:3: rule__Category__SDGAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Category__SDGAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getSDGAssignment_5()); 

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
    // $ANTLR end "rule__Category__Group__5__Impl"


    // $ANTLR start "rule__Category__Group__6"
    // InternalScml.g:1634:1: rule__Category__Group__6 : rule__Category__Group__6__Impl rule__Category__Group__7 ;
    public final void rule__Category__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1638:1: ( rule__Category__Group__6__Impl rule__Category__Group__7 )
            // InternalScml.g:1639:2: rule__Category__Group__6__Impl rule__Category__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__7();

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
    // $ANTLR end "rule__Category__Group__6"


    // $ANTLR start "rule__Category__Group__6__Impl"
    // InternalScml.g:1646:1: rule__Category__Group__6__Impl : ( ( rule__Category__Group_6__0 )* ) ;
    public final void rule__Category__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1650:1: ( ( ( rule__Category__Group_6__0 )* ) )
            // InternalScml.g:1651:1: ( ( rule__Category__Group_6__0 )* )
            {
            // InternalScml.g:1651:1: ( ( rule__Category__Group_6__0 )* )
            // InternalScml.g:1652:2: ( rule__Category__Group_6__0 )*
            {
             before(grammarAccess.getCategoryAccess().getGroup_6()); 
            // InternalScml.g:1653:2: ( rule__Category__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalScml.g:1653:3: rule__Category__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Category__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Category__Group__6__Impl"


    // $ANTLR start "rule__Category__Group__7"
    // InternalScml.g:1661:1: rule__Category__Group__7 : rule__Category__Group__7__Impl rule__Category__Group__8 ;
    public final void rule__Category__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1665:1: ( rule__Category__Group__7__Impl rule__Category__Group__8 )
            // InternalScml.g:1666:2: rule__Category__Group__7__Impl rule__Category__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Category__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__8();

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
    // $ANTLR end "rule__Category__Group__7"


    // $ANTLR start "rule__Category__Group__7__Impl"
    // InternalScml.g:1673:1: rule__Category__Group__7__Impl : ( '}' ) ;
    public final void rule__Category__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1677:1: ( ( '}' ) )
            // InternalScml.g:1678:1: ( '}' )
            {
            // InternalScml.g:1678:1: ( '}' )
            // InternalScml.g:1679:2: '}'
            {
             before(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Category__Group__7__Impl"


    // $ANTLR start "rule__Category__Group__8"
    // InternalScml.g:1688:1: rule__Category__Group__8 : rule__Category__Group__8__Impl ;
    public final void rule__Category__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1692:1: ( rule__Category__Group__8__Impl )
            // InternalScml.g:1693:2: rule__Category__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__8__Impl();

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
    // $ANTLR end "rule__Category__Group__8"


    // $ANTLR start "rule__Category__Group__8__Impl"
    // InternalScml.g:1699:1: rule__Category__Group__8__Impl : ( '}' ) ;
    public final void rule__Category__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1703:1: ( ( '}' ) )
            // InternalScml.g:1704:1: ( '}' )
            {
            // InternalScml.g:1704:1: ( '}' )
            // InternalScml.g:1705:2: '}'
            {
             before(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Category__Group__8__Impl"


    // $ANTLR start "rule__Category__Group_6__0"
    // InternalScml.g:1715:1: rule__Category__Group_6__0 : rule__Category__Group_6__0__Impl rule__Category__Group_6__1 ;
    public final void rule__Category__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1719:1: ( rule__Category__Group_6__0__Impl rule__Category__Group_6__1 )
            // InternalScml.g:1720:2: rule__Category__Group_6__0__Impl rule__Category__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Category__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_6__1();

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
    // $ANTLR end "rule__Category__Group_6__0"


    // $ANTLR start "rule__Category__Group_6__0__Impl"
    // InternalScml.g:1727:1: rule__Category__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Category__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1731:1: ( ( ',' ) )
            // InternalScml.g:1732:1: ( ',' )
            {
            // InternalScml.g:1732:1: ( ',' )
            // InternalScml.g:1733:2: ','
            {
             before(grammarAccess.getCategoryAccess().getCommaKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Category__Group_6__0__Impl"


    // $ANTLR start "rule__Category__Group_6__1"
    // InternalScml.g:1742:1: rule__Category__Group_6__1 : rule__Category__Group_6__1__Impl ;
    public final void rule__Category__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1746:1: ( rule__Category__Group_6__1__Impl )
            // InternalScml.g:1747:2: rule__Category__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_6__1__Impl();

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
    // $ANTLR end "rule__Category__Group_6__1"


    // $ANTLR start "rule__Category__Group_6__1__Impl"
    // InternalScml.g:1753:1: rule__Category__Group_6__1__Impl : ( ( rule__Category__SDGAssignment_6_1 ) ) ;
    public final void rule__Category__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1757:1: ( ( ( rule__Category__SDGAssignment_6_1 ) ) )
            // InternalScml.g:1758:1: ( ( rule__Category__SDGAssignment_6_1 ) )
            {
            // InternalScml.g:1758:1: ( ( rule__Category__SDGAssignment_6_1 ) )
            // InternalScml.g:1759:2: ( rule__Category__SDGAssignment_6_1 )
            {
             before(grammarAccess.getCategoryAccess().getSDGAssignment_6_1()); 
            // InternalScml.g:1760:2: ( rule__Category__SDGAssignment_6_1 )
            // InternalScml.g:1760:3: rule__Category__SDGAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__SDGAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getSDGAssignment_6_1()); 

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
    // $ANTLR end "rule__Category__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalScml.g:1769:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1773:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalScml.g:1774:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

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
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalScml.g:1781:1: rule__Project__Group__0__Impl : ( () ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1785:1: ( ( () ) )
            // InternalScml.g:1786:1: ( () )
            {
            // InternalScml.g:1786:1: ( () )
            // InternalScml.g:1787:2: ()
            {
             before(grammarAccess.getProjectAccess().getProjectAction_0()); 
            // InternalScml.g:1788:2: ()
            // InternalScml.g:1788:3: 
            {
            }

             after(grammarAccess.getProjectAccess().getProjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalScml.g:1796:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1800:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalScml.g:1801:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

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
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalScml.g:1808:1: rule__Project__Group__1__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1812:1: ( ( 'Project' ) )
            // InternalScml.g:1813:1: ( 'Project' )
            {
            // InternalScml.g:1813:1: ( 'Project' )
            // InternalScml.g:1814:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_1()); 

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
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalScml.g:1823:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1827:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalScml.g:1828:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

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
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalScml.g:1835:1: rule__Project__Group__2__Impl : ( ( rule__Project__NameAssignment_2 ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1839:1: ( ( ( rule__Project__NameAssignment_2 ) ) )
            // InternalScml.g:1840:1: ( ( rule__Project__NameAssignment_2 ) )
            {
            // InternalScml.g:1840:1: ( ( rule__Project__NameAssignment_2 ) )
            // InternalScml.g:1841:2: ( rule__Project__NameAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_2()); 
            // InternalScml.g:1842:2: ( rule__Project__NameAssignment_2 )
            // InternalScml.g:1842:3: rule__Project__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalScml.g:1850:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1854:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalScml.g:1855:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

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
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalScml.g:1862:1: rule__Project__Group__3__Impl : ( '{' ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1866:1: ( ( '{' ) )
            // InternalScml.g:1867:1: ( '{' )
            {
            // InternalScml.g:1867:1: ( '{' )
            // InternalScml.g:1868:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalScml.g:1877:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1881:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalScml.g:1882:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

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
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalScml.g:1889:1: rule__Project__Group__4__Impl : ( ( rule__Project__Group_4__0 )? ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1893:1: ( ( ( rule__Project__Group_4__0 )? ) )
            // InternalScml.g:1894:1: ( ( rule__Project__Group_4__0 )? )
            {
            // InternalScml.g:1894:1: ( ( rule__Project__Group_4__0 )? )
            // InternalScml.g:1895:2: ( rule__Project__Group_4__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_4()); 
            // InternalScml.g:1896:2: ( rule__Project__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalScml.g:1896:3: rule__Project__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalScml.g:1904:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1908:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalScml.g:1909:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

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
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalScml.g:1916:1: rule__Project__Group__5__Impl : ( ( rule__Project__Group_5__0 )? ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1920:1: ( ( ( rule__Project__Group_5__0 )? ) )
            // InternalScml.g:1921:1: ( ( rule__Project__Group_5__0 )? )
            {
            // InternalScml.g:1921:1: ( ( rule__Project__Group_5__0 )? )
            // InternalScml.g:1922:2: ( rule__Project__Group_5__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_5()); 
            // InternalScml.g:1923:2: ( rule__Project__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalScml.g:1923:3: rule__Project__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalScml.g:1931:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1935:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalScml.g:1936:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

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
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalScml.g:1943:1: rule__Project__Group__6__Impl : ( ( rule__Project__Group_6__0 )? ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1947:1: ( ( ( rule__Project__Group_6__0 )? ) )
            // InternalScml.g:1948:1: ( ( rule__Project__Group_6__0 )? )
            {
            // InternalScml.g:1948:1: ( ( rule__Project__Group_6__0 )? )
            // InternalScml.g:1949:2: ( rule__Project__Group_6__0 )?
            {
             before(grammarAccess.getProjectAccess().getGroup_6()); 
            // InternalScml.g:1950:2: ( rule__Project__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalScml.g:1950:3: rule__Project__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Project__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProjectAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // InternalScml.g:1958:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1962:1: ( rule__Project__Group__7__Impl )
            // InternalScml.g:1963:2: rule__Project__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__7__Impl();

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
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalScml.g:1969:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1973:1: ( ( '}' ) )
            // InternalScml.g:1974:1: ( '}' )
            {
            // InternalScml.g:1974:1: ( '}' )
            // InternalScml.g:1975:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__Project__Group_4__0"
    // InternalScml.g:1985:1: rule__Project__Group_4__0 : rule__Project__Group_4__0__Impl rule__Project__Group_4__1 ;
    public final void rule__Project__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:1989:1: ( rule__Project__Group_4__0__Impl rule__Project__Group_4__1 )
            // InternalScml.g:1990:2: rule__Project__Group_4__0__Impl rule__Project__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Project__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_4__1();

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
    // $ANTLR end "rule__Project__Group_4__0"


    // $ANTLR start "rule__Project__Group_4__0__Impl"
    // InternalScml.g:1997:1: rule__Project__Group_4__0__Impl : ( 'category' ) ;
    public final void rule__Project__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2001:1: ( ( 'category' ) )
            // InternalScml.g:2002:1: ( 'category' )
            {
            // InternalScml.g:2002:1: ( 'category' )
            // InternalScml.g:2003:2: 'category'
            {
             before(grammarAccess.getProjectAccess().getCategoryKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCategoryKeyword_4_0()); 

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
    // $ANTLR end "rule__Project__Group_4__0__Impl"


    // $ANTLR start "rule__Project__Group_4__1"
    // InternalScml.g:2012:1: rule__Project__Group_4__1 : rule__Project__Group_4__1__Impl rule__Project__Group_4__2 ;
    public final void rule__Project__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2016:1: ( rule__Project__Group_4__1__Impl rule__Project__Group_4__2 )
            // InternalScml.g:2017:2: rule__Project__Group_4__1__Impl rule__Project__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_4__2();

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
    // $ANTLR end "rule__Project__Group_4__1"


    // $ANTLR start "rule__Project__Group_4__1__Impl"
    // InternalScml.g:2024:1: rule__Project__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Project__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2028:1: ( ( '(' ) )
            // InternalScml.g:2029:1: ( '(' )
            {
            // InternalScml.g:2029:1: ( '(' )
            // InternalScml.g:2030:2: '('
            {
             before(grammarAccess.getProjectAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__Project__Group_4__1__Impl"


    // $ANTLR start "rule__Project__Group_4__2"
    // InternalScml.g:2039:1: rule__Project__Group_4__2 : rule__Project__Group_4__2__Impl rule__Project__Group_4__3 ;
    public final void rule__Project__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2043:1: ( rule__Project__Group_4__2__Impl rule__Project__Group_4__3 )
            // InternalScml.g:2044:2: rule__Project__Group_4__2__Impl rule__Project__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Project__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_4__3();

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
    // $ANTLR end "rule__Project__Group_4__2"


    // $ANTLR start "rule__Project__Group_4__2__Impl"
    // InternalScml.g:2051:1: rule__Project__Group_4__2__Impl : ( ( rule__Project__CategoryAssignment_4_2 ) ) ;
    public final void rule__Project__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2055:1: ( ( ( rule__Project__CategoryAssignment_4_2 ) ) )
            // InternalScml.g:2056:1: ( ( rule__Project__CategoryAssignment_4_2 ) )
            {
            // InternalScml.g:2056:1: ( ( rule__Project__CategoryAssignment_4_2 ) )
            // InternalScml.g:2057:2: ( rule__Project__CategoryAssignment_4_2 )
            {
             before(grammarAccess.getProjectAccess().getCategoryAssignment_4_2()); 
            // InternalScml.g:2058:2: ( rule__Project__CategoryAssignment_4_2 )
            // InternalScml.g:2058:3: rule__Project__CategoryAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Project__CategoryAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getCategoryAssignment_4_2()); 

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
    // $ANTLR end "rule__Project__Group_4__2__Impl"


    // $ANTLR start "rule__Project__Group_4__3"
    // InternalScml.g:2066:1: rule__Project__Group_4__3 : rule__Project__Group_4__3__Impl rule__Project__Group_4__4 ;
    public final void rule__Project__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2070:1: ( rule__Project__Group_4__3__Impl rule__Project__Group_4__4 )
            // InternalScml.g:2071:2: rule__Project__Group_4__3__Impl rule__Project__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Project__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_4__4();

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
    // $ANTLR end "rule__Project__Group_4__3"


    // $ANTLR start "rule__Project__Group_4__3__Impl"
    // InternalScml.g:2078:1: rule__Project__Group_4__3__Impl : ( ( rule__Project__Group_4_3__0 )* ) ;
    public final void rule__Project__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2082:1: ( ( ( rule__Project__Group_4_3__0 )* ) )
            // InternalScml.g:2083:1: ( ( rule__Project__Group_4_3__0 )* )
            {
            // InternalScml.g:2083:1: ( ( rule__Project__Group_4_3__0 )* )
            // InternalScml.g:2084:2: ( rule__Project__Group_4_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_4_3()); 
            // InternalScml.g:2085:2: ( rule__Project__Group_4_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalScml.g:2085:3: rule__Project__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Project__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Project__Group_4__3__Impl"


    // $ANTLR start "rule__Project__Group_4__4"
    // InternalScml.g:2093:1: rule__Project__Group_4__4 : rule__Project__Group_4__4__Impl ;
    public final void rule__Project__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2097:1: ( rule__Project__Group_4__4__Impl )
            // InternalScml.g:2098:2: rule__Project__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_4__4__Impl();

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
    // $ANTLR end "rule__Project__Group_4__4"


    // $ANTLR start "rule__Project__Group_4__4__Impl"
    // InternalScml.g:2104:1: rule__Project__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Project__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2108:1: ( ( ')' ) )
            // InternalScml.g:2109:1: ( ')' )
            {
            // InternalScml.g:2109:1: ( ')' )
            // InternalScml.g:2110:2: ')'
            {
             before(grammarAccess.getProjectAccess().getRightParenthesisKeyword_4_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__Project__Group_4__4__Impl"


    // $ANTLR start "rule__Project__Group_4_3__0"
    // InternalScml.g:2120:1: rule__Project__Group_4_3__0 : rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 ;
    public final void rule__Project__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2124:1: ( rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1 )
            // InternalScml.g:2125:2: rule__Project__Group_4_3__0__Impl rule__Project__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_4_3__1();

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
    // $ANTLR end "rule__Project__Group_4_3__0"


    // $ANTLR start "rule__Project__Group_4_3__0__Impl"
    // InternalScml.g:2132:1: rule__Project__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2136:1: ( ( ',' ) )
            // InternalScml.g:2137:1: ( ',' )
            {
            // InternalScml.g:2137:1: ( ',' )
            // InternalScml.g:2138:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Project__Group_4_3__0__Impl"


    // $ANTLR start "rule__Project__Group_4_3__1"
    // InternalScml.g:2147:1: rule__Project__Group_4_3__1 : rule__Project__Group_4_3__1__Impl ;
    public final void rule__Project__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2151:1: ( rule__Project__Group_4_3__1__Impl )
            // InternalScml.g:2152:2: rule__Project__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_4_3__1"


    // $ANTLR start "rule__Project__Group_4_3__1__Impl"
    // InternalScml.g:2158:1: rule__Project__Group_4_3__1__Impl : ( ( rule__Project__CategoryAssignment_4_3_1 ) ) ;
    public final void rule__Project__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2162:1: ( ( ( rule__Project__CategoryAssignment_4_3_1 ) ) )
            // InternalScml.g:2163:1: ( ( rule__Project__CategoryAssignment_4_3_1 ) )
            {
            // InternalScml.g:2163:1: ( ( rule__Project__CategoryAssignment_4_3_1 ) )
            // InternalScml.g:2164:2: ( rule__Project__CategoryAssignment_4_3_1 )
            {
             before(grammarAccess.getProjectAccess().getCategoryAssignment_4_3_1()); 
            // InternalScml.g:2165:2: ( rule__Project__CategoryAssignment_4_3_1 )
            // InternalScml.g:2165:3: rule__Project__CategoryAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__CategoryAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getCategoryAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Project__Group_4_3__1__Impl"


    // $ANTLR start "rule__Project__Group_5__0"
    // InternalScml.g:2174:1: rule__Project__Group_5__0 : rule__Project__Group_5__0__Impl rule__Project__Group_5__1 ;
    public final void rule__Project__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2178:1: ( rule__Project__Group_5__0__Impl rule__Project__Group_5__1 )
            // InternalScml.g:2179:2: rule__Project__Group_5__0__Impl rule__Project__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__1();

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
    // $ANTLR end "rule__Project__Group_5__0"


    // $ANTLR start "rule__Project__Group_5__0__Impl"
    // InternalScml.g:2186:1: rule__Project__Group_5__0__Impl : ( 'component' ) ;
    public final void rule__Project__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2190:1: ( ( 'component' ) )
            // InternalScml.g:2191:1: ( 'component' )
            {
            // InternalScml.g:2191:1: ( 'component' )
            // InternalScml.g:2192:2: 'component'
            {
             before(grammarAccess.getProjectAccess().getComponentKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getComponentKeyword_5_0()); 

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
    // $ANTLR end "rule__Project__Group_5__0__Impl"


    // $ANTLR start "rule__Project__Group_5__1"
    // InternalScml.g:2201:1: rule__Project__Group_5__1 : rule__Project__Group_5__1__Impl rule__Project__Group_5__2 ;
    public final void rule__Project__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2205:1: ( rule__Project__Group_5__1__Impl rule__Project__Group_5__2 )
            // InternalScml.g:2206:2: rule__Project__Group_5__1__Impl rule__Project__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__Project__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__2();

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
    // $ANTLR end "rule__Project__Group_5__1"


    // $ANTLR start "rule__Project__Group_5__1__Impl"
    // InternalScml.g:2213:1: rule__Project__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Project__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2217:1: ( ( '{' ) )
            // InternalScml.g:2218:1: ( '{' )
            {
            // InternalScml.g:2218:1: ( '{' )
            // InternalScml.g:2219:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Project__Group_5__1__Impl"


    // $ANTLR start "rule__Project__Group_5__2"
    // InternalScml.g:2228:1: rule__Project__Group_5__2 : rule__Project__Group_5__2__Impl rule__Project__Group_5__3 ;
    public final void rule__Project__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2232:1: ( rule__Project__Group_5__2__Impl rule__Project__Group_5__3 )
            // InternalScml.g:2233:2: rule__Project__Group_5__2__Impl rule__Project__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__3();

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
    // $ANTLR end "rule__Project__Group_5__2"


    // $ANTLR start "rule__Project__Group_5__2__Impl"
    // InternalScml.g:2240:1: rule__Project__Group_5__2__Impl : ( ( rule__Project__ComponentAssignment_5_2 ) ) ;
    public final void rule__Project__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2244:1: ( ( ( rule__Project__ComponentAssignment_5_2 ) ) )
            // InternalScml.g:2245:1: ( ( rule__Project__ComponentAssignment_5_2 ) )
            {
            // InternalScml.g:2245:1: ( ( rule__Project__ComponentAssignment_5_2 ) )
            // InternalScml.g:2246:2: ( rule__Project__ComponentAssignment_5_2 )
            {
             before(grammarAccess.getProjectAccess().getComponentAssignment_5_2()); 
            // InternalScml.g:2247:2: ( rule__Project__ComponentAssignment_5_2 )
            // InternalScml.g:2247:3: rule__Project__ComponentAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Project__ComponentAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getComponentAssignment_5_2()); 

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
    // $ANTLR end "rule__Project__Group_5__2__Impl"


    // $ANTLR start "rule__Project__Group_5__3"
    // InternalScml.g:2255:1: rule__Project__Group_5__3 : rule__Project__Group_5__3__Impl rule__Project__Group_5__4 ;
    public final void rule__Project__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2259:1: ( rule__Project__Group_5__3__Impl rule__Project__Group_5__4 )
            // InternalScml.g:2260:2: rule__Project__Group_5__3__Impl rule__Project__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5__4();

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
    // $ANTLR end "rule__Project__Group_5__3"


    // $ANTLR start "rule__Project__Group_5__3__Impl"
    // InternalScml.g:2267:1: rule__Project__Group_5__3__Impl : ( ( rule__Project__Group_5_3__0 )* ) ;
    public final void rule__Project__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2271:1: ( ( ( rule__Project__Group_5_3__0 )* ) )
            // InternalScml.g:2272:1: ( ( rule__Project__Group_5_3__0 )* )
            {
            // InternalScml.g:2272:1: ( ( rule__Project__Group_5_3__0 )* )
            // InternalScml.g:2273:2: ( rule__Project__Group_5_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_5_3()); 
            // InternalScml.g:2274:2: ( rule__Project__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalScml.g:2274:3: rule__Project__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Project__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Project__Group_5__3__Impl"


    // $ANTLR start "rule__Project__Group_5__4"
    // InternalScml.g:2282:1: rule__Project__Group_5__4 : rule__Project__Group_5__4__Impl ;
    public final void rule__Project__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2286:1: ( rule__Project__Group_5__4__Impl )
            // InternalScml.g:2287:2: rule__Project__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_5__4__Impl();

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
    // $ANTLR end "rule__Project__Group_5__4"


    // $ANTLR start "rule__Project__Group_5__4__Impl"
    // InternalScml.g:2293:1: rule__Project__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Project__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2297:1: ( ( '}' ) )
            // InternalScml.g:2298:1: ( '}' )
            {
            // InternalScml.g:2298:1: ( '}' )
            // InternalScml.g:2299:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Project__Group_5__4__Impl"


    // $ANTLR start "rule__Project__Group_5_3__0"
    // InternalScml.g:2309:1: rule__Project__Group_5_3__0 : rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 ;
    public final void rule__Project__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2313:1: ( rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1 )
            // InternalScml.g:2314:2: rule__Project__Group_5_3__0__Impl rule__Project__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Project__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_5_3__1();

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
    // $ANTLR end "rule__Project__Group_5_3__0"


    // $ANTLR start "rule__Project__Group_5_3__0__Impl"
    // InternalScml.g:2321:1: rule__Project__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2325:1: ( ( ',' ) )
            // InternalScml.g:2326:1: ( ',' )
            {
            // InternalScml.g:2326:1: ( ',' )
            // InternalScml.g:2327:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_5_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Project__Group_5_3__0__Impl"


    // $ANTLR start "rule__Project__Group_5_3__1"
    // InternalScml.g:2336:1: rule__Project__Group_5_3__1 : rule__Project__Group_5_3__1__Impl ;
    public final void rule__Project__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2340:1: ( rule__Project__Group_5_3__1__Impl )
            // InternalScml.g:2341:2: rule__Project__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_5_3__1"


    // $ANTLR start "rule__Project__Group_5_3__1__Impl"
    // InternalScml.g:2347:1: rule__Project__Group_5_3__1__Impl : ( ( rule__Project__ComponentAssignment_5_3_1 ) ) ;
    public final void rule__Project__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2351:1: ( ( ( rule__Project__ComponentAssignment_5_3_1 ) ) )
            // InternalScml.g:2352:1: ( ( rule__Project__ComponentAssignment_5_3_1 ) )
            {
            // InternalScml.g:2352:1: ( ( rule__Project__ComponentAssignment_5_3_1 ) )
            // InternalScml.g:2353:2: ( rule__Project__ComponentAssignment_5_3_1 )
            {
             before(grammarAccess.getProjectAccess().getComponentAssignment_5_3_1()); 
            // InternalScml.g:2354:2: ( rule__Project__ComponentAssignment_5_3_1 )
            // InternalScml.g:2354:3: rule__Project__ComponentAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__ComponentAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getComponentAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Project__Group_5_3__1__Impl"


    // $ANTLR start "rule__Project__Group_6__0"
    // InternalScml.g:2363:1: rule__Project__Group_6__0 : rule__Project__Group_6__0__Impl rule__Project__Group_6__1 ;
    public final void rule__Project__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2367:1: ( rule__Project__Group_6__0__Impl rule__Project__Group_6__1 )
            // InternalScml.g:2368:2: rule__Project__Group_6__0__Impl rule__Project__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Project__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__1();

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
    // $ANTLR end "rule__Project__Group_6__0"


    // $ANTLR start "rule__Project__Group_6__0__Impl"
    // InternalScml.g:2375:1: rule__Project__Group_6__0__Impl : ( 'indicator' ) ;
    public final void rule__Project__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2379:1: ( ( 'indicator' ) )
            // InternalScml.g:2380:1: ( 'indicator' )
            {
            // InternalScml.g:2380:1: ( 'indicator' )
            // InternalScml.g:2381:2: 'indicator'
            {
             before(grammarAccess.getProjectAccess().getIndicatorKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getIndicatorKeyword_6_0()); 

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
    // $ANTLR end "rule__Project__Group_6__0__Impl"


    // $ANTLR start "rule__Project__Group_6__1"
    // InternalScml.g:2390:1: rule__Project__Group_6__1 : rule__Project__Group_6__1__Impl rule__Project__Group_6__2 ;
    public final void rule__Project__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2394:1: ( rule__Project__Group_6__1__Impl rule__Project__Group_6__2 )
            // InternalScml.g:2395:2: rule__Project__Group_6__1__Impl rule__Project__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Project__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__2();

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
    // $ANTLR end "rule__Project__Group_6__1"


    // $ANTLR start "rule__Project__Group_6__1__Impl"
    // InternalScml.g:2402:1: rule__Project__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Project__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2406:1: ( ( '{' ) )
            // InternalScml.g:2407:1: ( '{' )
            {
            // InternalScml.g:2407:1: ( '{' )
            // InternalScml.g:2408:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Project__Group_6__1__Impl"


    // $ANTLR start "rule__Project__Group_6__2"
    // InternalScml.g:2417:1: rule__Project__Group_6__2 : rule__Project__Group_6__2__Impl rule__Project__Group_6__3 ;
    public final void rule__Project__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2421:1: ( rule__Project__Group_6__2__Impl rule__Project__Group_6__3 )
            // InternalScml.g:2422:2: rule__Project__Group_6__2__Impl rule__Project__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__3();

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
    // $ANTLR end "rule__Project__Group_6__2"


    // $ANTLR start "rule__Project__Group_6__2__Impl"
    // InternalScml.g:2429:1: rule__Project__Group_6__2__Impl : ( ( rule__Project__IndicatorAssignment_6_2 ) ) ;
    public final void rule__Project__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2433:1: ( ( ( rule__Project__IndicatorAssignment_6_2 ) ) )
            // InternalScml.g:2434:1: ( ( rule__Project__IndicatorAssignment_6_2 ) )
            {
            // InternalScml.g:2434:1: ( ( rule__Project__IndicatorAssignment_6_2 ) )
            // InternalScml.g:2435:2: ( rule__Project__IndicatorAssignment_6_2 )
            {
             before(grammarAccess.getProjectAccess().getIndicatorAssignment_6_2()); 
            // InternalScml.g:2436:2: ( rule__Project__IndicatorAssignment_6_2 )
            // InternalScml.g:2436:3: rule__Project__IndicatorAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Project__IndicatorAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getIndicatorAssignment_6_2()); 

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
    // $ANTLR end "rule__Project__Group_6__2__Impl"


    // $ANTLR start "rule__Project__Group_6__3"
    // InternalScml.g:2444:1: rule__Project__Group_6__3 : rule__Project__Group_6__3__Impl rule__Project__Group_6__4 ;
    public final void rule__Project__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2448:1: ( rule__Project__Group_6__3__Impl rule__Project__Group_6__4 )
            // InternalScml.g:2449:2: rule__Project__Group_6__3__Impl rule__Project__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Project__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6__4();

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
    // $ANTLR end "rule__Project__Group_6__3"


    // $ANTLR start "rule__Project__Group_6__3__Impl"
    // InternalScml.g:2456:1: rule__Project__Group_6__3__Impl : ( ( rule__Project__Group_6_3__0 )* ) ;
    public final void rule__Project__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2460:1: ( ( ( rule__Project__Group_6_3__0 )* ) )
            // InternalScml.g:2461:1: ( ( rule__Project__Group_6_3__0 )* )
            {
            // InternalScml.g:2461:1: ( ( rule__Project__Group_6_3__0 )* )
            // InternalScml.g:2462:2: ( rule__Project__Group_6_3__0 )*
            {
             before(grammarAccess.getProjectAccess().getGroup_6_3()); 
            // InternalScml.g:2463:2: ( rule__Project__Group_6_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalScml.g:2463:3: rule__Project__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Project__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Project__Group_6__3__Impl"


    // $ANTLR start "rule__Project__Group_6__4"
    // InternalScml.g:2471:1: rule__Project__Group_6__4 : rule__Project__Group_6__4__Impl ;
    public final void rule__Project__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2475:1: ( rule__Project__Group_6__4__Impl )
            // InternalScml.g:2476:2: rule__Project__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_6__4__Impl();

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
    // $ANTLR end "rule__Project__Group_6__4"


    // $ANTLR start "rule__Project__Group_6__4__Impl"
    // InternalScml.g:2482:1: rule__Project__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Project__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2486:1: ( ( '}' ) )
            // InternalScml.g:2487:1: ( '}' )
            {
            // InternalScml.g:2487:1: ( '}' )
            // InternalScml.g:2488:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Project__Group_6__4__Impl"


    // $ANTLR start "rule__Project__Group_6_3__0"
    // InternalScml.g:2498:1: rule__Project__Group_6_3__0 : rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 ;
    public final void rule__Project__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2502:1: ( rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1 )
            // InternalScml.g:2503:2: rule__Project__Group_6_3__0__Impl rule__Project__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Project__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group_6_3__1();

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
    // $ANTLR end "rule__Project__Group_6_3__0"


    // $ANTLR start "rule__Project__Group_6_3__0__Impl"
    // InternalScml.g:2510:1: rule__Project__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Project__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2514:1: ( ( ',' ) )
            // InternalScml.g:2515:1: ( ',' )
            {
            // InternalScml.g:2515:1: ( ',' )
            // InternalScml.g:2516:2: ','
            {
             before(grammarAccess.getProjectAccess().getCommaKeyword_6_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Project__Group_6_3__0__Impl"


    // $ANTLR start "rule__Project__Group_6_3__1"
    // InternalScml.g:2525:1: rule__Project__Group_6_3__1 : rule__Project__Group_6_3__1__Impl ;
    public final void rule__Project__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2529:1: ( rule__Project__Group_6_3__1__Impl )
            // InternalScml.g:2530:2: rule__Project__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Project__Group_6_3__1"


    // $ANTLR start "rule__Project__Group_6_3__1__Impl"
    // InternalScml.g:2536:1: rule__Project__Group_6_3__1__Impl : ( ( rule__Project__IndicatorAssignment_6_3_1 ) ) ;
    public final void rule__Project__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2540:1: ( ( ( rule__Project__IndicatorAssignment_6_3_1 ) ) )
            // InternalScml.g:2541:1: ( ( rule__Project__IndicatorAssignment_6_3_1 ) )
            {
            // InternalScml.g:2541:1: ( ( rule__Project__IndicatorAssignment_6_3_1 ) )
            // InternalScml.g:2542:2: ( rule__Project__IndicatorAssignment_6_3_1 )
            {
             before(grammarAccess.getProjectAccess().getIndicatorAssignment_6_3_1()); 
            // InternalScml.g:2543:2: ( rule__Project__IndicatorAssignment_6_3_1 )
            // InternalScml.g:2543:3: rule__Project__IndicatorAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__IndicatorAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getIndicatorAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Project__Group_6_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalScml.g:2552:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2556:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalScml.g:2557:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalScml.g:2564:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2568:1: ( ( ( '-' )? ) )
            // InternalScml.g:2569:1: ( ( '-' )? )
            {
            // InternalScml.g:2569:1: ( ( '-' )? )
            // InternalScml.g:2570:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalScml.g:2571:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalScml.g:2571:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalScml.g:2579:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2583:1: ( rule__EInt__Group__1__Impl )
            // InternalScml.g:2584:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalScml.g:2590:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2594:1: ( ( RULE_INT ) )
            // InternalScml.g:2595:1: ( RULE_INT )
            {
            // InternalScml.g:2595:1: ( RULE_INT )
            // InternalScml.g:2596:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__0"
    // InternalScml.g:2606:1: rule__KPIMeasurementDevice__Group__0 : rule__KPIMeasurementDevice__Group__0__Impl rule__KPIMeasurementDevice__Group__1 ;
    public final void rule__KPIMeasurementDevice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2610:1: ( rule__KPIMeasurementDevice__Group__0__Impl rule__KPIMeasurementDevice__Group__1 )
            // InternalScml.g:2611:2: rule__KPIMeasurementDevice__Group__0__Impl rule__KPIMeasurementDevice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__KPIMeasurementDevice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__1();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__0"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__0__Impl"
    // InternalScml.g:2618:1: rule__KPIMeasurementDevice__Group__0__Impl : ( 'KPIMeasurementDevice' ) ;
    public final void rule__KPIMeasurementDevice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2622:1: ( ( 'KPIMeasurementDevice' ) )
            // InternalScml.g:2623:1: ( 'KPIMeasurementDevice' )
            {
            // InternalScml.g:2623:1: ( 'KPIMeasurementDevice' )
            // InternalScml.g:2624:2: 'KPIMeasurementDevice'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getKPIMeasurementDeviceKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getKPIMeasurementDeviceKeyword_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__0__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__1"
    // InternalScml.g:2633:1: rule__KPIMeasurementDevice__Group__1 : rule__KPIMeasurementDevice__Group__1__Impl rule__KPIMeasurementDevice__Group__2 ;
    public final void rule__KPIMeasurementDevice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2637:1: ( rule__KPIMeasurementDevice__Group__1__Impl rule__KPIMeasurementDevice__Group__2 )
            // InternalScml.g:2638:2: rule__KPIMeasurementDevice__Group__1__Impl rule__KPIMeasurementDevice__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__KPIMeasurementDevice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__2();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__1"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__1__Impl"
    // InternalScml.g:2645:1: rule__KPIMeasurementDevice__Group__1__Impl : ( ( rule__KPIMeasurementDevice__NameAssignment_1 ) ) ;
    public final void rule__KPIMeasurementDevice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2649:1: ( ( ( rule__KPIMeasurementDevice__NameAssignment_1 ) ) )
            // InternalScml.g:2650:1: ( ( rule__KPIMeasurementDevice__NameAssignment_1 ) )
            {
            // InternalScml.g:2650:1: ( ( rule__KPIMeasurementDevice__NameAssignment_1 ) )
            // InternalScml.g:2651:2: ( rule__KPIMeasurementDevice__NameAssignment_1 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getNameAssignment_1()); 
            // InternalScml.g:2652:2: ( rule__KPIMeasurementDevice__NameAssignment_1 )
            // InternalScml.g:2652:3: rule__KPIMeasurementDevice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__1__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__2"
    // InternalScml.g:2660:1: rule__KPIMeasurementDevice__Group__2 : rule__KPIMeasurementDevice__Group__2__Impl rule__KPIMeasurementDevice__Group__3 ;
    public final void rule__KPIMeasurementDevice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2664:1: ( rule__KPIMeasurementDevice__Group__2__Impl rule__KPIMeasurementDevice__Group__3 )
            // InternalScml.g:2665:2: rule__KPIMeasurementDevice__Group__2__Impl rule__KPIMeasurementDevice__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__KPIMeasurementDevice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__3();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__2"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__2__Impl"
    // InternalScml.g:2672:1: rule__KPIMeasurementDevice__Group__2__Impl : ( '{' ) ;
    public final void rule__KPIMeasurementDevice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2676:1: ( ( '{' ) )
            // InternalScml.g:2677:1: ( '{' )
            {
            // InternalScml.g:2677:1: ( '{' )
            // InternalScml.g:2678:2: '{'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__2__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__3"
    // InternalScml.g:2687:1: rule__KPIMeasurementDevice__Group__3 : rule__KPIMeasurementDevice__Group__3__Impl rule__KPIMeasurementDevice__Group__4 ;
    public final void rule__KPIMeasurementDevice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2691:1: ( rule__KPIMeasurementDevice__Group__3__Impl rule__KPIMeasurementDevice__Group__4 )
            // InternalScml.g:2692:2: rule__KPIMeasurementDevice__Group__3__Impl rule__KPIMeasurementDevice__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__KPIMeasurementDevice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__4();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__3"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__3__Impl"
    // InternalScml.g:2699:1: rule__KPIMeasurementDevice__Group__3__Impl : ( 'status' ) ;
    public final void rule__KPIMeasurementDevice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2703:1: ( ( 'status' ) )
            // InternalScml.g:2704:1: ( 'status' )
            {
            // InternalScml.g:2704:1: ( 'status' )
            // InternalScml.g:2705:2: 'status'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getStatusKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getStatusKeyword_3()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__3__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__4"
    // InternalScml.g:2714:1: rule__KPIMeasurementDevice__Group__4 : rule__KPIMeasurementDevice__Group__4__Impl rule__KPIMeasurementDevice__Group__5 ;
    public final void rule__KPIMeasurementDevice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2718:1: ( rule__KPIMeasurementDevice__Group__4__Impl rule__KPIMeasurementDevice__Group__5 )
            // InternalScml.g:2719:2: rule__KPIMeasurementDevice__Group__4__Impl rule__KPIMeasurementDevice__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__KPIMeasurementDevice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__5();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__4"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__4__Impl"
    // InternalScml.g:2726:1: rule__KPIMeasurementDevice__Group__4__Impl : ( ( rule__KPIMeasurementDevice__StatusAssignment_4 ) ) ;
    public final void rule__KPIMeasurementDevice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2730:1: ( ( ( rule__KPIMeasurementDevice__StatusAssignment_4 ) ) )
            // InternalScml.g:2731:1: ( ( rule__KPIMeasurementDevice__StatusAssignment_4 ) )
            {
            // InternalScml.g:2731:1: ( ( rule__KPIMeasurementDevice__StatusAssignment_4 ) )
            // InternalScml.g:2732:2: ( rule__KPIMeasurementDevice__StatusAssignment_4 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getStatusAssignment_4()); 
            // InternalScml.g:2733:2: ( rule__KPIMeasurementDevice__StatusAssignment_4 )
            // InternalScml.g:2733:3: rule__KPIMeasurementDevice__StatusAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__StatusAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getStatusAssignment_4()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__4__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__5"
    // InternalScml.g:2741:1: rule__KPIMeasurementDevice__Group__5 : rule__KPIMeasurementDevice__Group__5__Impl rule__KPIMeasurementDevice__Group__6 ;
    public final void rule__KPIMeasurementDevice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2745:1: ( rule__KPIMeasurementDevice__Group__5__Impl rule__KPIMeasurementDevice__Group__6 )
            // InternalScml.g:2746:2: rule__KPIMeasurementDevice__Group__5__Impl rule__KPIMeasurementDevice__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__KPIMeasurementDevice__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__6();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__5"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__5__Impl"
    // InternalScml.g:2753:1: rule__KPIMeasurementDevice__Group__5__Impl : ( ( rule__KPIMeasurementDevice__Group_5__0 )? ) ;
    public final void rule__KPIMeasurementDevice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2757:1: ( ( ( rule__KPIMeasurementDevice__Group_5__0 )? ) )
            // InternalScml.g:2758:1: ( ( rule__KPIMeasurementDevice__Group_5__0 )? )
            {
            // InternalScml.g:2758:1: ( ( rule__KPIMeasurementDevice__Group_5__0 )? )
            // InternalScml.g:2759:2: ( rule__KPIMeasurementDevice__Group_5__0 )?
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_5()); 
            // InternalScml.g:2760:2: ( rule__KPIMeasurementDevice__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==53) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalScml.g:2760:3: rule__KPIMeasurementDevice__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KPIMeasurementDevice__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__5__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__6"
    // InternalScml.g:2768:1: rule__KPIMeasurementDevice__Group__6 : rule__KPIMeasurementDevice__Group__6__Impl rule__KPIMeasurementDevice__Group__7 ;
    public final void rule__KPIMeasurementDevice__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2772:1: ( rule__KPIMeasurementDevice__Group__6__Impl rule__KPIMeasurementDevice__Group__7 )
            // InternalScml.g:2773:2: rule__KPIMeasurementDevice__Group__6__Impl rule__KPIMeasurementDevice__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__KPIMeasurementDevice__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__7();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__6"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__6__Impl"
    // InternalScml.g:2780:1: rule__KPIMeasurementDevice__Group__6__Impl : ( 'nextCalculation' ) ;
    public final void rule__KPIMeasurementDevice__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2784:1: ( ( 'nextCalculation' ) )
            // InternalScml.g:2785:1: ( 'nextCalculation' )
            {
            // InternalScml.g:2785:1: ( 'nextCalculation' )
            // InternalScml.g:2786:2: 'nextCalculation'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationKeyword_6()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__6__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__7"
    // InternalScml.g:2795:1: rule__KPIMeasurementDevice__Group__7 : rule__KPIMeasurementDevice__Group__7__Impl rule__KPIMeasurementDevice__Group__8 ;
    public final void rule__KPIMeasurementDevice__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2799:1: ( rule__KPIMeasurementDevice__Group__7__Impl rule__KPIMeasurementDevice__Group__8 )
            // InternalScml.g:2800:2: rule__KPIMeasurementDevice__Group__7__Impl rule__KPIMeasurementDevice__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__KPIMeasurementDevice__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__8();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__7"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__7__Impl"
    // InternalScml.g:2807:1: rule__KPIMeasurementDevice__Group__7__Impl : ( ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 ) ) ;
    public final void rule__KPIMeasurementDevice__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2811:1: ( ( ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 ) ) )
            // InternalScml.g:2812:1: ( ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 ) )
            {
            // InternalScml.g:2812:1: ( ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 ) )
            // InternalScml.g:2813:2: ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationAssignment_7()); 
            // InternalScml.g:2814:2: ( rule__KPIMeasurementDevice__NextCalculationAssignment_7 )
            // InternalScml.g:2814:3: rule__KPIMeasurementDevice__NextCalculationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__NextCalculationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationAssignment_7()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__7__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__8"
    // InternalScml.g:2822:1: rule__KPIMeasurementDevice__Group__8 : rule__KPIMeasurementDevice__Group__8__Impl rule__KPIMeasurementDevice__Group__9 ;
    public final void rule__KPIMeasurementDevice__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2826:1: ( rule__KPIMeasurementDevice__Group__8__Impl rule__KPIMeasurementDevice__Group__9 )
            // InternalScml.g:2827:2: rule__KPIMeasurementDevice__Group__8__Impl rule__KPIMeasurementDevice__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__KPIMeasurementDevice__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__9();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__8"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__8__Impl"
    // InternalScml.g:2834:1: rule__KPIMeasurementDevice__Group__8__Impl : ( ( rule__KPIMeasurementDevice__Group_8__0 )? ) ;
    public final void rule__KPIMeasurementDevice__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2838:1: ( ( ( rule__KPIMeasurementDevice__Group_8__0 )? ) )
            // InternalScml.g:2839:1: ( ( rule__KPIMeasurementDevice__Group_8__0 )? )
            {
            // InternalScml.g:2839:1: ( ( rule__KPIMeasurementDevice__Group_8__0 )? )
            // InternalScml.g:2840:2: ( rule__KPIMeasurementDevice__Group_8__0 )?
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_8()); 
            // InternalScml.g:2841:2: ( rule__KPIMeasurementDevice__Group_8__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalScml.g:2841:3: rule__KPIMeasurementDevice__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__KPIMeasurementDevice__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_8()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__8__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__9"
    // InternalScml.g:2849:1: rule__KPIMeasurementDevice__Group__9 : rule__KPIMeasurementDevice__Group__9__Impl ;
    public final void rule__KPIMeasurementDevice__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2853:1: ( rule__KPIMeasurementDevice__Group__9__Impl )
            // InternalScml.g:2854:2: rule__KPIMeasurementDevice__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group__9__Impl();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__9"


    // $ANTLR start "rule__KPIMeasurementDevice__Group__9__Impl"
    // InternalScml.g:2860:1: rule__KPIMeasurementDevice__Group__9__Impl : ( '}' ) ;
    public final void rule__KPIMeasurementDevice__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2864:1: ( ( '}' ) )
            // InternalScml.g:2865:1: ( '}' )
            {
            // InternalScml.g:2865:1: ( '}' )
            // InternalScml.g:2866:2: '}'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group__9__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__0"
    // InternalScml.g:2876:1: rule__KPIMeasurementDevice__Group_5__0 : rule__KPIMeasurementDevice__Group_5__0__Impl rule__KPIMeasurementDevice__Group_5__1 ;
    public final void rule__KPIMeasurementDevice__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2880:1: ( rule__KPIMeasurementDevice__Group_5__0__Impl rule__KPIMeasurementDevice__Group_5__1 )
            // InternalScml.g:2881:2: rule__KPIMeasurementDevice__Group_5__0__Impl rule__KPIMeasurementDevice__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__KPIMeasurementDevice__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5__1();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__0"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__0__Impl"
    // InternalScml.g:2888:1: rule__KPIMeasurementDevice__Group_5__0__Impl : ( 'lastCalculation' ) ;
    public final void rule__KPIMeasurementDevice__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2892:1: ( ( 'lastCalculation' ) )
            // InternalScml.g:2893:1: ( 'lastCalculation' )
            {
            // InternalScml.g:2893:1: ( 'lastCalculation' )
            // InternalScml.g:2894:2: 'lastCalculation'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationKeyword_5_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__0__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__1"
    // InternalScml.g:2903:1: rule__KPIMeasurementDevice__Group_5__1 : rule__KPIMeasurementDevice__Group_5__1__Impl rule__KPIMeasurementDevice__Group_5__2 ;
    public final void rule__KPIMeasurementDevice__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2907:1: ( rule__KPIMeasurementDevice__Group_5__1__Impl rule__KPIMeasurementDevice__Group_5__2 )
            // InternalScml.g:2908:2: rule__KPIMeasurementDevice__Group_5__1__Impl rule__KPIMeasurementDevice__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__KPIMeasurementDevice__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5__2();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__1"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__1__Impl"
    // InternalScml.g:2915:1: rule__KPIMeasurementDevice__Group_5__1__Impl : ( '{' ) ;
    public final void rule__KPIMeasurementDevice__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2919:1: ( ( '{' ) )
            // InternalScml.g:2920:1: ( '{' )
            {
            // InternalScml.g:2920:1: ( '{' )
            // InternalScml.g:2921:2: '{'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__1__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__2"
    // InternalScml.g:2930:1: rule__KPIMeasurementDevice__Group_5__2 : rule__KPIMeasurementDevice__Group_5__2__Impl rule__KPIMeasurementDevice__Group_5__3 ;
    public final void rule__KPIMeasurementDevice__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2934:1: ( rule__KPIMeasurementDevice__Group_5__2__Impl rule__KPIMeasurementDevice__Group_5__3 )
            // InternalScml.g:2935:2: rule__KPIMeasurementDevice__Group_5__2__Impl rule__KPIMeasurementDevice__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__KPIMeasurementDevice__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5__3();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__2"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__2__Impl"
    // InternalScml.g:2942:1: rule__KPIMeasurementDevice__Group_5__2__Impl : ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 ) ) ;
    public final void rule__KPIMeasurementDevice__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2946:1: ( ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 ) ) )
            // InternalScml.g:2947:1: ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 ) )
            {
            // InternalScml.g:2947:1: ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 ) )
            // InternalScml.g:2948:2: ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationAssignment_5_2()); 
            // InternalScml.g:2949:2: ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 )
            // InternalScml.g:2949:3: rule__KPIMeasurementDevice__LastCalculationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__LastCalculationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationAssignment_5_2()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__2__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__3"
    // InternalScml.g:2957:1: rule__KPIMeasurementDevice__Group_5__3 : rule__KPIMeasurementDevice__Group_5__3__Impl rule__KPIMeasurementDevice__Group_5__4 ;
    public final void rule__KPIMeasurementDevice__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2961:1: ( rule__KPIMeasurementDevice__Group_5__3__Impl rule__KPIMeasurementDevice__Group_5__4 )
            // InternalScml.g:2962:2: rule__KPIMeasurementDevice__Group_5__3__Impl rule__KPIMeasurementDevice__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__KPIMeasurementDevice__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5__4();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__3"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__3__Impl"
    // InternalScml.g:2969:1: rule__KPIMeasurementDevice__Group_5__3__Impl : ( ( rule__KPIMeasurementDevice__Group_5_3__0 )* ) ;
    public final void rule__KPIMeasurementDevice__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2973:1: ( ( ( rule__KPIMeasurementDevice__Group_5_3__0 )* ) )
            // InternalScml.g:2974:1: ( ( rule__KPIMeasurementDevice__Group_5_3__0 )* )
            {
            // InternalScml.g:2974:1: ( ( rule__KPIMeasurementDevice__Group_5_3__0 )* )
            // InternalScml.g:2975:2: ( rule__KPIMeasurementDevice__Group_5_3__0 )*
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_5_3()); 
            // InternalScml.g:2976:2: ( rule__KPIMeasurementDevice__Group_5_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalScml.g:2976:3: rule__KPIMeasurementDevice__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__KPIMeasurementDevice__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getKPIMeasurementDeviceAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__3__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__4"
    // InternalScml.g:2984:1: rule__KPIMeasurementDevice__Group_5__4 : rule__KPIMeasurementDevice__Group_5__4__Impl ;
    public final void rule__KPIMeasurementDevice__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2988:1: ( rule__KPIMeasurementDevice__Group_5__4__Impl )
            // InternalScml.g:2989:2: rule__KPIMeasurementDevice__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5__4__Impl();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__4"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5__4__Impl"
    // InternalScml.g:2995:1: rule__KPIMeasurementDevice__Group_5__4__Impl : ( '}' ) ;
    public final void rule__KPIMeasurementDevice__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:2999:1: ( ( '}' ) )
            // InternalScml.g:3000:1: ( '}' )
            {
            // InternalScml.g:3000:1: ( '}' )
            // InternalScml.g:3001:2: '}'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5__4__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5_3__0"
    // InternalScml.g:3011:1: rule__KPIMeasurementDevice__Group_5_3__0 : rule__KPIMeasurementDevice__Group_5_3__0__Impl rule__KPIMeasurementDevice__Group_5_3__1 ;
    public final void rule__KPIMeasurementDevice__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3015:1: ( rule__KPIMeasurementDevice__Group_5_3__0__Impl rule__KPIMeasurementDevice__Group_5_3__1 )
            // InternalScml.g:3016:2: rule__KPIMeasurementDevice__Group_5_3__0__Impl rule__KPIMeasurementDevice__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__KPIMeasurementDevice__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5_3__1();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5_3__0"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5_3__0__Impl"
    // InternalScml.g:3023:1: rule__KPIMeasurementDevice__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__KPIMeasurementDevice__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3027:1: ( ( ',' ) )
            // InternalScml.g:3028:1: ( ',' )
            {
            // InternalScml.g:3028:1: ( ',' )
            // InternalScml.g:3029:2: ','
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getCommaKeyword_5_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5_3__0__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5_3__1"
    // InternalScml.g:3038:1: rule__KPIMeasurementDevice__Group_5_3__1 : rule__KPIMeasurementDevice__Group_5_3__1__Impl ;
    public final void rule__KPIMeasurementDevice__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3042:1: ( rule__KPIMeasurementDevice__Group_5_3__1__Impl )
            // InternalScml.g:3043:2: rule__KPIMeasurementDevice__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5_3__1"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_5_3__1__Impl"
    // InternalScml.g:3049:1: rule__KPIMeasurementDevice__Group_5_3__1__Impl : ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 ) ) ;
    public final void rule__KPIMeasurementDevice__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3053:1: ( ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 ) ) )
            // InternalScml.g:3054:1: ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 ) )
            {
            // InternalScml.g:3054:1: ( ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 ) )
            // InternalScml.g:3055:2: ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationAssignment_5_3_1()); 
            // InternalScml.g:3056:2: ( rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 )
            // InternalScml.g:3056:3: rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationAssignment_5_3_1()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_5_3__1__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_8__0"
    // InternalScml.g:3065:1: rule__KPIMeasurementDevice__Group_8__0 : rule__KPIMeasurementDevice__Group_8__0__Impl rule__KPIMeasurementDevice__Group_8__1 ;
    public final void rule__KPIMeasurementDevice__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3069:1: ( rule__KPIMeasurementDevice__Group_8__0__Impl rule__KPIMeasurementDevice__Group_8__1 )
            // InternalScml.g:3070:2: rule__KPIMeasurementDevice__Group_8__0__Impl rule__KPIMeasurementDevice__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__KPIMeasurementDevice__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_8__1();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_8__0"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_8__0__Impl"
    // InternalScml.g:3077:1: rule__KPIMeasurementDevice__Group_8__0__Impl : ( 'parameter' ) ;
    public final void rule__KPIMeasurementDevice__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3081:1: ( ( 'parameter' ) )
            // InternalScml.g:3082:1: ( 'parameter' )
            {
            // InternalScml.g:3082:1: ( 'parameter' )
            // InternalScml.g:3083:2: 'parameter'
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getParameterKeyword_8_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getKPIMeasurementDeviceAccess().getParameterKeyword_8_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_8__0__Impl"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_8__1"
    // InternalScml.g:3092:1: rule__KPIMeasurementDevice__Group_8__1 : rule__KPIMeasurementDevice__Group_8__1__Impl ;
    public final void rule__KPIMeasurementDevice__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3096:1: ( rule__KPIMeasurementDevice__Group_8__1__Impl )
            // InternalScml.g:3097:2: rule__KPIMeasurementDevice__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__Group_8__1__Impl();

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_8__1"


    // $ANTLR start "rule__KPIMeasurementDevice__Group_8__1__Impl"
    // InternalScml.g:3103:1: rule__KPIMeasurementDevice__Group_8__1__Impl : ( ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 ) ) ;
    public final void rule__KPIMeasurementDevice__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3107:1: ( ( ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 ) ) )
            // InternalScml.g:3108:1: ( ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 ) )
            {
            // InternalScml.g:3108:1: ( ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 ) )
            // InternalScml.g:3109:2: ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getParameterAssignment_8_1()); 
            // InternalScml.g:3110:2: ( rule__KPIMeasurementDevice__ParameterAssignment_8_1 )
            // InternalScml.g:3110:3: rule__KPIMeasurementDevice__ParameterAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__KPIMeasurementDevice__ParameterAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getParameterAssignment_8_1()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__Group_8__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalScml.g:3119:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3123:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalScml.g:3124:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

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
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalScml.g:3131:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3135:1: ( ( 'Location' ) )
            // InternalScml.g:3136:1: ( 'Location' )
            {
            // InternalScml.g:3136:1: ( 'Location' )
            // InternalScml.g:3137:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

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
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalScml.g:3146:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3150:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalScml.g:3151:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

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
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalScml.g:3158:1: rule__Location__Group__1__Impl : ( '{' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3162:1: ( ( '{' ) )
            // InternalScml.g:3163:1: ( '{' )
            {
            // InternalScml.g:3163:1: ( '{' )
            // InternalScml.g:3164:2: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalScml.g:3173:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3177:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalScml.g:3178:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

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
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalScml.g:3185:1: rule__Location__Group__2__Impl : ( 'Lat' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3189:1: ( ( 'Lat' ) )
            // InternalScml.g:3190:1: ( 'Lat' )
            {
            // InternalScml.g:3190:1: ( 'Lat' )
            // InternalScml.g:3191:2: 'Lat'
            {
             before(grammarAccess.getLocationAccess().getLatKeyword_2()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLatKeyword_2()); 

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
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalScml.g:3200:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3204:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalScml.g:3205:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

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
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalScml.g:3212:1: rule__Location__Group__3__Impl : ( ( rule__Location__LatAssignment_3 ) ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3216:1: ( ( ( rule__Location__LatAssignment_3 ) ) )
            // InternalScml.g:3217:1: ( ( rule__Location__LatAssignment_3 ) )
            {
            // InternalScml.g:3217:1: ( ( rule__Location__LatAssignment_3 ) )
            // InternalScml.g:3218:2: ( rule__Location__LatAssignment_3 )
            {
             before(grammarAccess.getLocationAccess().getLatAssignment_3()); 
            // InternalScml.g:3219:2: ( rule__Location__LatAssignment_3 )
            // InternalScml.g:3219:3: rule__Location__LatAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Location__LatAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLatAssignment_3()); 

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
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalScml.g:3227:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3231:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalScml.g:3232:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

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
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalScml.g:3239:1: rule__Location__Group__4__Impl : ( 'Long' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3243:1: ( ( 'Long' ) )
            // InternalScml.g:3244:1: ( 'Long' )
            {
            // InternalScml.g:3244:1: ( 'Long' )
            // InternalScml.g:3245:2: 'Long'
            {
             before(grammarAccess.getLocationAccess().getLongKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLongKeyword_4()); 

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
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalScml.g:3254:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3258:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalScml.g:3259:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

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
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalScml.g:3266:1: rule__Location__Group__5__Impl : ( ( rule__Location__LongAssignment_5 ) ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3270:1: ( ( ( rule__Location__LongAssignment_5 ) ) )
            // InternalScml.g:3271:1: ( ( rule__Location__LongAssignment_5 ) )
            {
            // InternalScml.g:3271:1: ( ( rule__Location__LongAssignment_5 ) )
            // InternalScml.g:3272:2: ( rule__Location__LongAssignment_5 )
            {
             before(grammarAccess.getLocationAccess().getLongAssignment_5()); 
            // InternalScml.g:3273:2: ( rule__Location__LongAssignment_5 )
            // InternalScml.g:3273:3: rule__Location__LongAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Location__LongAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLongAssignment_5()); 

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
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalScml.g:3281:1: rule__Location__Group__6 : rule__Location__Group__6__Impl ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3285:1: ( rule__Location__Group__6__Impl )
            // InternalScml.g:3286:2: rule__Location__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__6__Impl();

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
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalScml.g:3292:1: rule__Location__Group__6__Impl : ( '}' ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3296:1: ( ( '}' ) )
            // InternalScml.g:3297:1: ( '}' )
            {
            // InternalScml.g:3297:1: ( '}' )
            // InternalScml.g:3298:2: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__DataValue__Group__0"
    // InternalScml.g:3308:1: rule__DataValue__Group__0 : rule__DataValue__Group__0__Impl rule__DataValue__Group__1 ;
    public final void rule__DataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3312:1: ( rule__DataValue__Group__0__Impl rule__DataValue__Group__1 )
            // InternalScml.g:3313:2: rule__DataValue__Group__0__Impl rule__DataValue__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DataValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__1();

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
    // $ANTLR end "rule__DataValue__Group__0"


    // $ANTLR start "rule__DataValue__Group__0__Impl"
    // InternalScml.g:3320:1: rule__DataValue__Group__0__Impl : ( ( rule__DataValue__CollectedAssignment_0 ) ) ;
    public final void rule__DataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3324:1: ( ( ( rule__DataValue__CollectedAssignment_0 ) ) )
            // InternalScml.g:3325:1: ( ( rule__DataValue__CollectedAssignment_0 ) )
            {
            // InternalScml.g:3325:1: ( ( rule__DataValue__CollectedAssignment_0 ) )
            // InternalScml.g:3326:2: ( rule__DataValue__CollectedAssignment_0 )
            {
             before(grammarAccess.getDataValueAccess().getCollectedAssignment_0()); 
            // InternalScml.g:3327:2: ( rule__DataValue__CollectedAssignment_0 )
            // InternalScml.g:3327:3: rule__DataValue__CollectedAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__CollectedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getCollectedAssignment_0()); 

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
    // $ANTLR end "rule__DataValue__Group__0__Impl"


    // $ANTLR start "rule__DataValue__Group__1"
    // InternalScml.g:3335:1: rule__DataValue__Group__1 : rule__DataValue__Group__1__Impl rule__DataValue__Group__2 ;
    public final void rule__DataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3339:1: ( rule__DataValue__Group__1__Impl rule__DataValue__Group__2 )
            // InternalScml.g:3340:2: rule__DataValue__Group__1__Impl rule__DataValue__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__2();

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
    // $ANTLR end "rule__DataValue__Group__1"


    // $ANTLR start "rule__DataValue__Group__1__Impl"
    // InternalScml.g:3347:1: rule__DataValue__Group__1__Impl : ( 'DataValue' ) ;
    public final void rule__DataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3351:1: ( ( 'DataValue' ) )
            // InternalScml.g:3352:1: ( 'DataValue' )
            {
            // InternalScml.g:3352:1: ( 'DataValue' )
            // InternalScml.g:3353:2: 'DataValue'
            {
             before(grammarAccess.getDataValueAccess().getDataValueKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getDataValueKeyword_1()); 

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
    // $ANTLR end "rule__DataValue__Group__1__Impl"


    // $ANTLR start "rule__DataValue__Group__2"
    // InternalScml.g:3362:1: rule__DataValue__Group__2 : rule__DataValue__Group__2__Impl rule__DataValue__Group__3 ;
    public final void rule__DataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3366:1: ( rule__DataValue__Group__2__Impl rule__DataValue__Group__3 )
            // InternalScml.g:3367:2: rule__DataValue__Group__2__Impl rule__DataValue__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__DataValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__3();

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
    // $ANTLR end "rule__DataValue__Group__2"


    // $ANTLR start "rule__DataValue__Group__2__Impl"
    // InternalScml.g:3374:1: rule__DataValue__Group__2__Impl : ( '{' ) ;
    public final void rule__DataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3378:1: ( ( '{' ) )
            // InternalScml.g:3379:1: ( '{' )
            {
            // InternalScml.g:3379:1: ( '{' )
            // InternalScml.g:3380:2: '{'
            {
             before(grammarAccess.getDataValueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataValue__Group__2__Impl"


    // $ANTLR start "rule__DataValue__Group__3"
    // InternalScml.g:3389:1: rule__DataValue__Group__3 : rule__DataValue__Group__3__Impl rule__DataValue__Group__4 ;
    public final void rule__DataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3393:1: ( rule__DataValue__Group__3__Impl rule__DataValue__Group__4 )
            // InternalScml.g:3394:2: rule__DataValue__Group__3__Impl rule__DataValue__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__DataValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__4();

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
    // $ANTLR end "rule__DataValue__Group__3"


    // $ANTLR start "rule__DataValue__Group__3__Impl"
    // InternalScml.g:3401:1: rule__DataValue__Group__3__Impl : ( 'type' ) ;
    public final void rule__DataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3405:1: ( ( 'type' ) )
            // InternalScml.g:3406:1: ( 'type' )
            {
            // InternalScml.g:3406:1: ( 'type' )
            // InternalScml.g:3407:2: 'type'
            {
             before(grammarAccess.getDataValueAccess().getTypeKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__DataValue__Group__3__Impl"


    // $ANTLR start "rule__DataValue__Group__4"
    // InternalScml.g:3416:1: rule__DataValue__Group__4 : rule__DataValue__Group__4__Impl rule__DataValue__Group__5 ;
    public final void rule__DataValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3420:1: ( rule__DataValue__Group__4__Impl rule__DataValue__Group__5 )
            // InternalScml.g:3421:2: rule__DataValue__Group__4__Impl rule__DataValue__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__DataValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__5();

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
    // $ANTLR end "rule__DataValue__Group__4"


    // $ANTLR start "rule__DataValue__Group__4__Impl"
    // InternalScml.g:3428:1: rule__DataValue__Group__4__Impl : ( ( rule__DataValue__TypeAssignment_4 ) ) ;
    public final void rule__DataValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3432:1: ( ( ( rule__DataValue__TypeAssignment_4 ) ) )
            // InternalScml.g:3433:1: ( ( rule__DataValue__TypeAssignment_4 ) )
            {
            // InternalScml.g:3433:1: ( ( rule__DataValue__TypeAssignment_4 ) )
            // InternalScml.g:3434:2: ( rule__DataValue__TypeAssignment_4 )
            {
             before(grammarAccess.getDataValueAccess().getTypeAssignment_4()); 
            // InternalScml.g:3435:2: ( rule__DataValue__TypeAssignment_4 )
            // InternalScml.g:3435:3: rule__DataValue__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__DataValue__Group__4__Impl"


    // $ANTLR start "rule__DataValue__Group__5"
    // InternalScml.g:3443:1: rule__DataValue__Group__5 : rule__DataValue__Group__5__Impl rule__DataValue__Group__6 ;
    public final void rule__DataValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3447:1: ( rule__DataValue__Group__5__Impl rule__DataValue__Group__6 )
            // InternalScml.g:3448:2: rule__DataValue__Group__5__Impl rule__DataValue__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__DataValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__6();

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
    // $ANTLR end "rule__DataValue__Group__5"


    // $ANTLR start "rule__DataValue__Group__5__Impl"
    // InternalScml.g:3455:1: rule__DataValue__Group__5__Impl : ( 'value' ) ;
    public final void rule__DataValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3459:1: ( ( 'value' ) )
            // InternalScml.g:3460:1: ( 'value' )
            {
            // InternalScml.g:3460:1: ( 'value' )
            // InternalScml.g:3461:2: 'value'
            {
             before(grammarAccess.getDataValueAccess().getValueKeyword_5()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getValueKeyword_5()); 

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
    // $ANTLR end "rule__DataValue__Group__5__Impl"


    // $ANTLR start "rule__DataValue__Group__6"
    // InternalScml.g:3470:1: rule__DataValue__Group__6 : rule__DataValue__Group__6__Impl rule__DataValue__Group__7 ;
    public final void rule__DataValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3474:1: ( rule__DataValue__Group__6__Impl rule__DataValue__Group__7 )
            // InternalScml.g:3475:2: rule__DataValue__Group__6__Impl rule__DataValue__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__DataValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__7();

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
    // $ANTLR end "rule__DataValue__Group__6"


    // $ANTLR start "rule__DataValue__Group__6__Impl"
    // InternalScml.g:3482:1: rule__DataValue__Group__6__Impl : ( ( rule__DataValue__ValueAssignment_6 ) ) ;
    public final void rule__DataValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3486:1: ( ( ( rule__DataValue__ValueAssignment_6 ) ) )
            // InternalScml.g:3487:1: ( ( rule__DataValue__ValueAssignment_6 ) )
            {
            // InternalScml.g:3487:1: ( ( rule__DataValue__ValueAssignment_6 ) )
            // InternalScml.g:3488:2: ( rule__DataValue__ValueAssignment_6 )
            {
             before(grammarAccess.getDataValueAccess().getValueAssignment_6()); 
            // InternalScml.g:3489:2: ( rule__DataValue__ValueAssignment_6 )
            // InternalScml.g:3489:3: rule__DataValue__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getValueAssignment_6()); 

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
    // $ANTLR end "rule__DataValue__Group__6__Impl"


    // $ANTLR start "rule__DataValue__Group__7"
    // InternalScml.g:3497:1: rule__DataValue__Group__7 : rule__DataValue__Group__7__Impl rule__DataValue__Group__8 ;
    public final void rule__DataValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3501:1: ( rule__DataValue__Group__7__Impl rule__DataValue__Group__8 )
            // InternalScml.g:3502:2: rule__DataValue__Group__7__Impl rule__DataValue__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__DataValue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__8();

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
    // $ANTLR end "rule__DataValue__Group__7"


    // $ANTLR start "rule__DataValue__Group__7__Impl"
    // InternalScml.g:3509:1: rule__DataValue__Group__7__Impl : ( 'producedTime' ) ;
    public final void rule__DataValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3513:1: ( ( 'producedTime' ) )
            // InternalScml.g:3514:1: ( 'producedTime' )
            {
            // InternalScml.g:3514:1: ( 'producedTime' )
            // InternalScml.g:3515:2: 'producedTime'
            {
             before(grammarAccess.getDataValueAccess().getProducedTimeKeyword_7()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getProducedTimeKeyword_7()); 

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
    // $ANTLR end "rule__DataValue__Group__7__Impl"


    // $ANTLR start "rule__DataValue__Group__8"
    // InternalScml.g:3524:1: rule__DataValue__Group__8 : rule__DataValue__Group__8__Impl rule__DataValue__Group__9 ;
    public final void rule__DataValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3528:1: ( rule__DataValue__Group__8__Impl rule__DataValue__Group__9 )
            // InternalScml.g:3529:2: rule__DataValue__Group__8__Impl rule__DataValue__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__DataValue__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__9();

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
    // $ANTLR end "rule__DataValue__Group__8"


    // $ANTLR start "rule__DataValue__Group__8__Impl"
    // InternalScml.g:3536:1: rule__DataValue__Group__8__Impl : ( ( rule__DataValue__ProducedTimeAssignment_8 ) ) ;
    public final void rule__DataValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3540:1: ( ( ( rule__DataValue__ProducedTimeAssignment_8 ) ) )
            // InternalScml.g:3541:1: ( ( rule__DataValue__ProducedTimeAssignment_8 ) )
            {
            // InternalScml.g:3541:1: ( ( rule__DataValue__ProducedTimeAssignment_8 ) )
            // InternalScml.g:3542:2: ( rule__DataValue__ProducedTimeAssignment_8 )
            {
             before(grammarAccess.getDataValueAccess().getProducedTimeAssignment_8()); 
            // InternalScml.g:3543:2: ( rule__DataValue__ProducedTimeAssignment_8 )
            // InternalScml.g:3543:3: rule__DataValue__ProducedTimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__ProducedTimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getProducedTimeAssignment_8()); 

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
    // $ANTLR end "rule__DataValue__Group__8__Impl"


    // $ANTLR start "rule__DataValue__Group__9"
    // InternalScml.g:3551:1: rule__DataValue__Group__9 : rule__DataValue__Group__9__Impl rule__DataValue__Group__10 ;
    public final void rule__DataValue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3555:1: ( rule__DataValue__Group__9__Impl rule__DataValue__Group__10 )
            // InternalScml.g:3556:2: rule__DataValue__Group__9__Impl rule__DataValue__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__DataValue__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group__10();

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
    // $ANTLR end "rule__DataValue__Group__9"


    // $ANTLR start "rule__DataValue__Group__9__Impl"
    // InternalScml.g:3563:1: rule__DataValue__Group__9__Impl : ( ( rule__DataValue__Group_9__0 )? ) ;
    public final void rule__DataValue__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3567:1: ( ( ( rule__DataValue__Group_9__0 )? ) )
            // InternalScml.g:3568:1: ( ( rule__DataValue__Group_9__0 )? )
            {
            // InternalScml.g:3568:1: ( ( rule__DataValue__Group_9__0 )? )
            // InternalScml.g:3569:2: ( rule__DataValue__Group_9__0 )?
            {
             before(grammarAccess.getDataValueAccess().getGroup_9()); 
            // InternalScml.g:3570:2: ( rule__DataValue__Group_9__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalScml.g:3570:3: rule__DataValue__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataValue__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataValueAccess().getGroup_9()); 

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
    // $ANTLR end "rule__DataValue__Group__9__Impl"


    // $ANTLR start "rule__DataValue__Group__10"
    // InternalScml.g:3578:1: rule__DataValue__Group__10 : rule__DataValue__Group__10__Impl ;
    public final void rule__DataValue__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3582:1: ( rule__DataValue__Group__10__Impl )
            // InternalScml.g:3583:2: rule__DataValue__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group__10__Impl();

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
    // $ANTLR end "rule__DataValue__Group__10"


    // $ANTLR start "rule__DataValue__Group__10__Impl"
    // InternalScml.g:3589:1: rule__DataValue__Group__10__Impl : ( '}' ) ;
    public final void rule__DataValue__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3593:1: ( ( '}' ) )
            // InternalScml.g:3594:1: ( '}' )
            {
            // InternalScml.g:3594:1: ( '}' )
            // InternalScml.g:3595:2: '}'
            {
             before(grammarAccess.getDataValueAccess().getRightCurlyBracketKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__DataValue__Group__10__Impl"


    // $ANTLR start "rule__DataValue__Group_9__0"
    // InternalScml.g:3605:1: rule__DataValue__Group_9__0 : rule__DataValue__Group_9__0__Impl rule__DataValue__Group_9__1 ;
    public final void rule__DataValue__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3609:1: ( rule__DataValue__Group_9__0__Impl rule__DataValue__Group_9__1 )
            // InternalScml.g:3610:2: rule__DataValue__Group_9__0__Impl rule__DataValue__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__DataValue__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataValue__Group_9__1();

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
    // $ANTLR end "rule__DataValue__Group_9__0"


    // $ANTLR start "rule__DataValue__Group_9__0__Impl"
    // InternalScml.g:3617:1: rule__DataValue__Group_9__0__Impl : ( 'consumedTime' ) ;
    public final void rule__DataValue__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3621:1: ( ( 'consumedTime' ) )
            // InternalScml.g:3622:1: ( 'consumedTime' )
            {
            // InternalScml.g:3622:1: ( 'consumedTime' )
            // InternalScml.g:3623:2: 'consumedTime'
            {
             before(grammarAccess.getDataValueAccess().getConsumedTimeKeyword_9_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getConsumedTimeKeyword_9_0()); 

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
    // $ANTLR end "rule__DataValue__Group_9__0__Impl"


    // $ANTLR start "rule__DataValue__Group_9__1"
    // InternalScml.g:3632:1: rule__DataValue__Group_9__1 : rule__DataValue__Group_9__1__Impl ;
    public final void rule__DataValue__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3636:1: ( rule__DataValue__Group_9__1__Impl )
            // InternalScml.g:3637:2: rule__DataValue__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__Group_9__1__Impl();

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
    // $ANTLR end "rule__DataValue__Group_9__1"


    // $ANTLR start "rule__DataValue__Group_9__1__Impl"
    // InternalScml.g:3643:1: rule__DataValue__Group_9__1__Impl : ( ( rule__DataValue__ConsumedTimeAssignment_9_1 ) ) ;
    public final void rule__DataValue__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3647:1: ( ( ( rule__DataValue__ConsumedTimeAssignment_9_1 ) ) )
            // InternalScml.g:3648:1: ( ( rule__DataValue__ConsumedTimeAssignment_9_1 ) )
            {
            // InternalScml.g:3648:1: ( ( rule__DataValue__ConsumedTimeAssignment_9_1 ) )
            // InternalScml.g:3649:2: ( rule__DataValue__ConsumedTimeAssignment_9_1 )
            {
             before(grammarAccess.getDataValueAccess().getConsumedTimeAssignment_9_1()); 
            // InternalScml.g:3650:2: ( rule__DataValue__ConsumedTimeAssignment_9_1 )
            // InternalScml.g:3650:3: rule__DataValue__ConsumedTimeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__DataValue__ConsumedTimeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDataValueAccess().getConsumedTimeAssignment_9_1()); 

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
    // $ANTLR end "rule__DataValue__Group_9__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalScml.g:3659:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3663:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalScml.g:3664:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalScml.g:3671:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3675:1: ( ( 'Parameter' ) )
            // InternalScml.g:3676:1: ( 'Parameter' )
            {
            // InternalScml.g:3676:1: ( 'Parameter' )
            // InternalScml.g:3677:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalScml.g:3686:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3690:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalScml.g:3691:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalScml.g:3698:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3702:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalScml.g:3703:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalScml.g:3703:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalScml.g:3704:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalScml.g:3705:2: ( rule__Parameter__NameAssignment_1 )
            // InternalScml.g:3705:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalScml.g:3713:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3717:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalScml.g:3718:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalScml.g:3725:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3729:1: ( ( '{' ) )
            // InternalScml.g:3730:1: ( '{' )
            {
            // InternalScml.g:3730:1: ( '{' )
            // InternalScml.g:3731:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalScml.g:3740:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3744:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalScml.g:3745:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalScml.g:3752:1: rule__Parameter__Group__3__Impl : ( 'unit' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3756:1: ( ( 'unit' ) )
            // InternalScml.g:3757:1: ( 'unit' )
            {
            // InternalScml.g:3757:1: ( 'unit' )
            // InternalScml.g:3758:2: 'unit'
            {
             before(grammarAccess.getParameterAccess().getUnitKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getUnitKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalScml.g:3767:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3771:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalScml.g:3772:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalScml.g:3779:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__UnitAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3783:1: ( ( ( rule__Parameter__UnitAssignment_4 ) ) )
            // InternalScml.g:3784:1: ( ( rule__Parameter__UnitAssignment_4 ) )
            {
            // InternalScml.g:3784:1: ( ( rule__Parameter__UnitAssignment_4 ) )
            // InternalScml.g:3785:2: ( rule__Parameter__UnitAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getUnitAssignment_4()); 
            // InternalScml.g:3786:2: ( rule__Parameter__UnitAssignment_4 )
            // InternalScml.g:3786:3: rule__Parameter__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getUnitAssignment_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalScml.g:3794:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3798:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalScml.g:3799:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalScml.g:3806:1: rule__Parameter__Group__5__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3810:1: ( ( 'type' ) )
            // InternalScml.g:3811:1: ( 'type' )
            {
            // InternalScml.g:3811:1: ( 'type' )
            // InternalScml.g:3812:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_5()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalScml.g:3821:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3825:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // InternalScml.g:3826:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__7();

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
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalScml.g:3833:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__TypeAssignment_6 ) ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3837:1: ( ( ( rule__Parameter__TypeAssignment_6 ) ) )
            // InternalScml.g:3838:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            {
            // InternalScml.g:3838:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            // InternalScml.g:3839:2: ( rule__Parameter__TypeAssignment_6 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_6()); 
            // InternalScml.g:3840:2: ( rule__Parameter__TypeAssignment_6 )
            // InternalScml.g:3840:3: rule__Parameter__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // InternalScml.g:3848:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3852:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // InternalScml.g:3853:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__8();

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
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // InternalScml.g:3860:1: rule__Parameter__Group__7__Impl : ( 'component' ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3864:1: ( ( 'component' ) )
            // InternalScml.g:3865:1: ( 'component' )
            {
            // InternalScml.g:3865:1: ( 'component' )
            // InternalScml.g:3866:2: 'component'
            {
             before(grammarAccess.getParameterAccess().getComponentKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getComponentKeyword_7()); 

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
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__8"
    // InternalScml.g:3875:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl rule__Parameter__Group__9 ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3879:1: ( rule__Parameter__Group__8__Impl rule__Parameter__Group__9 )
            // InternalScml.g:3880:2: rule__Parameter__Group__8__Impl rule__Parameter__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__Parameter__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__9();

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
    // $ANTLR end "rule__Parameter__Group__8"


    // $ANTLR start "rule__Parameter__Group__8__Impl"
    // InternalScml.g:3887:1: rule__Parameter__Group__8__Impl : ( ( rule__Parameter__ComponentAssignment_8 ) ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3891:1: ( ( ( rule__Parameter__ComponentAssignment_8 ) ) )
            // InternalScml.g:3892:1: ( ( rule__Parameter__ComponentAssignment_8 ) )
            {
            // InternalScml.g:3892:1: ( ( rule__Parameter__ComponentAssignment_8 ) )
            // InternalScml.g:3893:2: ( rule__Parameter__ComponentAssignment_8 )
            {
             before(grammarAccess.getParameterAccess().getComponentAssignment_8()); 
            // InternalScml.g:3894:2: ( rule__Parameter__ComponentAssignment_8 )
            // InternalScml.g:3894:3: rule__Parameter__ComponentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ComponentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getComponentAssignment_8()); 

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
    // $ANTLR end "rule__Parameter__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group__9"
    // InternalScml.g:3902:1: rule__Parameter__Group__9 : rule__Parameter__Group__9__Impl rule__Parameter__Group__10 ;
    public final void rule__Parameter__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3906:1: ( rule__Parameter__Group__9__Impl rule__Parameter__Group__10 )
            // InternalScml.g:3907:2: rule__Parameter__Group__9__Impl rule__Parameter__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Parameter__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__10();

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
    // $ANTLR end "rule__Parameter__Group__9"


    // $ANTLR start "rule__Parameter__Group__9__Impl"
    // InternalScml.g:3914:1: rule__Parameter__Group__9__Impl : ( 'goalreferencevalue' ) ;
    public final void rule__Parameter__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3918:1: ( ( 'goalreferencevalue' ) )
            // InternalScml.g:3919:1: ( 'goalreferencevalue' )
            {
            // InternalScml.g:3919:1: ( 'goalreferencevalue' )
            // InternalScml.g:3920:2: 'goalreferencevalue'
            {
             before(grammarAccess.getParameterAccess().getGoalreferencevalueKeyword_9()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getGoalreferencevalueKeyword_9()); 

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
    // $ANTLR end "rule__Parameter__Group__9__Impl"


    // $ANTLR start "rule__Parameter__Group__10"
    // InternalScml.g:3929:1: rule__Parameter__Group__10 : rule__Parameter__Group__10__Impl rule__Parameter__Group__11 ;
    public final void rule__Parameter__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3933:1: ( rule__Parameter__Group__10__Impl rule__Parameter__Group__11 )
            // InternalScml.g:3934:2: rule__Parameter__Group__10__Impl rule__Parameter__Group__11
            {
            pushFollow(FOLLOW_37);
            rule__Parameter__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__11();

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
    // $ANTLR end "rule__Parameter__Group__10"


    // $ANTLR start "rule__Parameter__Group__10__Impl"
    // InternalScml.g:3941:1: rule__Parameter__Group__10__Impl : ( ( rule__Parameter__GoalreferencevalueAssignment_10 ) ) ;
    public final void rule__Parameter__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3945:1: ( ( ( rule__Parameter__GoalreferencevalueAssignment_10 ) ) )
            // InternalScml.g:3946:1: ( ( rule__Parameter__GoalreferencevalueAssignment_10 ) )
            {
            // InternalScml.g:3946:1: ( ( rule__Parameter__GoalreferencevalueAssignment_10 ) )
            // InternalScml.g:3947:2: ( rule__Parameter__GoalreferencevalueAssignment_10 )
            {
             before(grammarAccess.getParameterAccess().getGoalreferencevalueAssignment_10()); 
            // InternalScml.g:3948:2: ( rule__Parameter__GoalreferencevalueAssignment_10 )
            // InternalScml.g:3948:3: rule__Parameter__GoalreferencevalueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__GoalreferencevalueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGoalreferencevalueAssignment_10()); 

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
    // $ANTLR end "rule__Parameter__Group__10__Impl"


    // $ANTLR start "rule__Parameter__Group__11"
    // InternalScml.g:3956:1: rule__Parameter__Group__11 : rule__Parameter__Group__11__Impl rule__Parameter__Group__12 ;
    public final void rule__Parameter__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3960:1: ( rule__Parameter__Group__11__Impl rule__Parameter__Group__12 )
            // InternalScml.g:3961:2: rule__Parameter__Group__11__Impl rule__Parameter__Group__12
            {
            pushFollow(FOLLOW_37);
            rule__Parameter__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__12();

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
    // $ANTLR end "rule__Parameter__Group__11"


    // $ANTLR start "rule__Parameter__Group__11__Impl"
    // InternalScml.g:3968:1: rule__Parameter__Group__11__Impl : ( ( rule__Parameter__Group_11__0 )? ) ;
    public final void rule__Parameter__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3972:1: ( ( ( rule__Parameter__Group_11__0 )? ) )
            // InternalScml.g:3973:1: ( ( rule__Parameter__Group_11__0 )? )
            {
            // InternalScml.g:3973:1: ( ( rule__Parameter__Group_11__0 )? )
            // InternalScml.g:3974:2: ( rule__Parameter__Group_11__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_11()); 
            // InternalScml.g:3975:2: ( rule__Parameter__Group_11__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==66) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalScml.g:3975:3: rule__Parameter__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Parameter__Group__11__Impl"


    // $ANTLR start "rule__Parameter__Group__12"
    // InternalScml.g:3983:1: rule__Parameter__Group__12 : rule__Parameter__Group__12__Impl ;
    public final void rule__Parameter__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3987:1: ( rule__Parameter__Group__12__Impl )
            // InternalScml.g:3988:2: rule__Parameter__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__12__Impl();

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
    // $ANTLR end "rule__Parameter__Group__12"


    // $ANTLR start "rule__Parameter__Group__12__Impl"
    // InternalScml.g:3994:1: rule__Parameter__Group__12__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:3998:1: ( ( '}' ) )
            // InternalScml.g:3999:1: ( '}' )
            {
            // InternalScml.g:3999:1: ( '}' )
            // InternalScml.g:4000:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_12()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Parameter__Group__12__Impl"


    // $ANTLR start "rule__Parameter__Group_11__0"
    // InternalScml.g:4010:1: rule__Parameter__Group_11__0 : rule__Parameter__Group_11__0__Impl rule__Parameter__Group_11__1 ;
    public final void rule__Parameter__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4014:1: ( rule__Parameter__Group_11__0__Impl rule__Parameter__Group_11__1 )
            // InternalScml.g:4015:2: rule__Parameter__Group_11__0__Impl rule__Parameter__Group_11__1
            {
            pushFollow(FOLLOW_38);
            rule__Parameter__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_11__1();

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
    // $ANTLR end "rule__Parameter__Group_11__0"


    // $ANTLR start "rule__Parameter__Group_11__0__Impl"
    // InternalScml.g:4022:1: rule__Parameter__Group_11__0__Impl : ( 'observedValue' ) ;
    public final void rule__Parameter__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4026:1: ( ( 'observedValue' ) )
            // InternalScml.g:4027:1: ( 'observedValue' )
            {
            // InternalScml.g:4027:1: ( 'observedValue' )
            // InternalScml.g:4028:2: 'observedValue'
            {
             before(grammarAccess.getParameterAccess().getObservedValueKeyword_11_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getObservedValueKeyword_11_0()); 

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
    // $ANTLR end "rule__Parameter__Group_11__0__Impl"


    // $ANTLR start "rule__Parameter__Group_11__1"
    // InternalScml.g:4037:1: rule__Parameter__Group_11__1 : rule__Parameter__Group_11__1__Impl ;
    public final void rule__Parameter__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4041:1: ( rule__Parameter__Group_11__1__Impl )
            // InternalScml.g:4042:2: rule__Parameter__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_11__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_11__1"


    // $ANTLR start "rule__Parameter__Group_11__1__Impl"
    // InternalScml.g:4048:1: rule__Parameter__Group_11__1__Impl : ( ( rule__Parameter__ObservedValueAssignment_11_1 ) ) ;
    public final void rule__Parameter__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4052:1: ( ( ( rule__Parameter__ObservedValueAssignment_11_1 ) ) )
            // InternalScml.g:4053:1: ( ( rule__Parameter__ObservedValueAssignment_11_1 ) )
            {
            // InternalScml.g:4053:1: ( ( rule__Parameter__ObservedValueAssignment_11_1 ) )
            // InternalScml.g:4054:2: ( rule__Parameter__ObservedValueAssignment_11_1 )
            {
             before(grammarAccess.getParameterAccess().getObservedValueAssignment_11_1()); 
            // InternalScml.g:4055:2: ( rule__Parameter__ObservedValueAssignment_11_1 )
            // InternalScml.g:4055:3: rule__Parameter__ObservedValueAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ObservedValueAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getObservedValueAssignment_11_1()); 

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
    // $ANTLR end "rule__Parameter__Group_11__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__0"
    // InternalScml.g:4064:1: rule__BuildingComponent__Group__0 : rule__BuildingComponent__Group__0__Impl rule__BuildingComponent__Group__1 ;
    public final void rule__BuildingComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4068:1: ( rule__BuildingComponent__Group__0__Impl rule__BuildingComponent__Group__1 )
            // InternalScml.g:4069:2: rule__BuildingComponent__Group__0__Impl rule__BuildingComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BuildingComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__1();

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
    // $ANTLR end "rule__BuildingComponent__Group__0"


    // $ANTLR start "rule__BuildingComponent__Group__0__Impl"
    // InternalScml.g:4076:1: rule__BuildingComponent__Group__0__Impl : ( 'BuildingComponent' ) ;
    public final void rule__BuildingComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4080:1: ( ( 'BuildingComponent' ) )
            // InternalScml.g:4081:1: ( 'BuildingComponent' )
            {
            // InternalScml.g:4081:1: ( 'BuildingComponent' )
            // InternalScml.g:4082:2: 'BuildingComponent'
            {
             before(grammarAccess.getBuildingComponentAccess().getBuildingComponentKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getBuildingComponentKeyword_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__1"
    // InternalScml.g:4091:1: rule__BuildingComponent__Group__1 : rule__BuildingComponent__Group__1__Impl rule__BuildingComponent__Group__2 ;
    public final void rule__BuildingComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4095:1: ( rule__BuildingComponent__Group__1__Impl rule__BuildingComponent__Group__2 )
            // InternalScml.g:4096:2: rule__BuildingComponent__Group__1__Impl rule__BuildingComponent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BuildingComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__2();

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
    // $ANTLR end "rule__BuildingComponent__Group__1"


    // $ANTLR start "rule__BuildingComponent__Group__1__Impl"
    // InternalScml.g:4103:1: rule__BuildingComponent__Group__1__Impl : ( ( rule__BuildingComponent__NameAssignment_1 ) ) ;
    public final void rule__BuildingComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4107:1: ( ( ( rule__BuildingComponent__NameAssignment_1 ) ) )
            // InternalScml.g:4108:1: ( ( rule__BuildingComponent__NameAssignment_1 ) )
            {
            // InternalScml.g:4108:1: ( ( rule__BuildingComponent__NameAssignment_1 ) )
            // InternalScml.g:4109:2: ( rule__BuildingComponent__NameAssignment_1 )
            {
             before(grammarAccess.getBuildingComponentAccess().getNameAssignment_1()); 
            // InternalScml.g:4110:2: ( rule__BuildingComponent__NameAssignment_1 )
            // InternalScml.g:4110:3: rule__BuildingComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__2"
    // InternalScml.g:4118:1: rule__BuildingComponent__Group__2 : rule__BuildingComponent__Group__2__Impl rule__BuildingComponent__Group__3 ;
    public final void rule__BuildingComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4122:1: ( rule__BuildingComponent__Group__2__Impl rule__BuildingComponent__Group__3 )
            // InternalScml.g:4123:2: rule__BuildingComponent__Group__2__Impl rule__BuildingComponent__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__BuildingComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__3();

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
    // $ANTLR end "rule__BuildingComponent__Group__2"


    // $ANTLR start "rule__BuildingComponent__Group__2__Impl"
    // InternalScml.g:4130:1: rule__BuildingComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__BuildingComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4134:1: ( ( '{' ) )
            // InternalScml.g:4135:1: ( '{' )
            {
            // InternalScml.g:4135:1: ( '{' )
            // InternalScml.g:4136:2: '{'
            {
             before(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__2__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__3"
    // InternalScml.g:4145:1: rule__BuildingComponent__Group__3 : rule__BuildingComponent__Group__3__Impl rule__BuildingComponent__Group__4 ;
    public final void rule__BuildingComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4149:1: ( rule__BuildingComponent__Group__3__Impl rule__BuildingComponent__Group__4 )
            // InternalScml.g:4150:2: rule__BuildingComponent__Group__3__Impl rule__BuildingComponent__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__BuildingComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__4();

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
    // $ANTLR end "rule__BuildingComponent__Group__3"


    // $ANTLR start "rule__BuildingComponent__Group__3__Impl"
    // InternalScml.g:4157:1: rule__BuildingComponent__Group__3__Impl : ( ( rule__BuildingComponent__Group_3__0 )? ) ;
    public final void rule__BuildingComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4161:1: ( ( ( rule__BuildingComponent__Group_3__0 )? ) )
            // InternalScml.g:4162:1: ( ( rule__BuildingComponent__Group_3__0 )? )
            {
            // InternalScml.g:4162:1: ( ( rule__BuildingComponent__Group_3__0 )? )
            // InternalScml.g:4163:2: ( rule__BuildingComponent__Group_3__0 )?
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_3()); 
            // InternalScml.g:4164:2: ( rule__BuildingComponent__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==69) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalScml.g:4164:3: rule__BuildingComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BuildingComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBuildingComponentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__3__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__4"
    // InternalScml.g:4172:1: rule__BuildingComponent__Group__4 : rule__BuildingComponent__Group__4__Impl rule__BuildingComponent__Group__5 ;
    public final void rule__BuildingComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4176:1: ( rule__BuildingComponent__Group__4__Impl rule__BuildingComponent__Group__5 )
            // InternalScml.g:4177:2: rule__BuildingComponent__Group__4__Impl rule__BuildingComponent__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__BuildingComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__5();

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
    // $ANTLR end "rule__BuildingComponent__Group__4"


    // $ANTLR start "rule__BuildingComponent__Group__4__Impl"
    // InternalScml.g:4184:1: rule__BuildingComponent__Group__4__Impl : ( ( rule__BuildingComponent__Group_4__0 )? ) ;
    public final void rule__BuildingComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4188:1: ( ( ( rule__BuildingComponent__Group_4__0 )? ) )
            // InternalScml.g:4189:1: ( ( rule__BuildingComponent__Group_4__0 )? )
            {
            // InternalScml.g:4189:1: ( ( rule__BuildingComponent__Group_4__0 )? )
            // InternalScml.g:4190:2: ( rule__BuildingComponent__Group_4__0 )?
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_4()); 
            // InternalScml.g:4191:2: ( rule__BuildingComponent__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==70) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalScml.g:4191:3: rule__BuildingComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BuildingComponent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBuildingComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__4__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__5"
    // InternalScml.g:4199:1: rule__BuildingComponent__Group__5 : rule__BuildingComponent__Group__5__Impl rule__BuildingComponent__Group__6 ;
    public final void rule__BuildingComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4203:1: ( rule__BuildingComponent__Group__5__Impl rule__BuildingComponent__Group__6 )
            // InternalScml.g:4204:2: rule__BuildingComponent__Group__5__Impl rule__BuildingComponent__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__BuildingComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__6();

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
    // $ANTLR end "rule__BuildingComponent__Group__5"


    // $ANTLR start "rule__BuildingComponent__Group__5__Impl"
    // InternalScml.g:4211:1: rule__BuildingComponent__Group__5__Impl : ( 'location' ) ;
    public final void rule__BuildingComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4215:1: ( ( 'location' ) )
            // InternalScml.g:4216:1: ( 'location' )
            {
            // InternalScml.g:4216:1: ( 'location' )
            // InternalScml.g:4217:2: 'location'
            {
             before(grammarAccess.getBuildingComponentAccess().getLocationKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getLocationKeyword_5()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__5__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__6"
    // InternalScml.g:4226:1: rule__BuildingComponent__Group__6 : rule__BuildingComponent__Group__6__Impl rule__BuildingComponent__Group__7 ;
    public final void rule__BuildingComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4230:1: ( rule__BuildingComponent__Group__6__Impl rule__BuildingComponent__Group__7 )
            // InternalScml.g:4231:2: rule__BuildingComponent__Group__6__Impl rule__BuildingComponent__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__BuildingComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__7();

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
    // $ANTLR end "rule__BuildingComponent__Group__6"


    // $ANTLR start "rule__BuildingComponent__Group__6__Impl"
    // InternalScml.g:4238:1: rule__BuildingComponent__Group__6__Impl : ( ( rule__BuildingComponent__LocationAssignment_6 ) ) ;
    public final void rule__BuildingComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4242:1: ( ( ( rule__BuildingComponent__LocationAssignment_6 ) ) )
            // InternalScml.g:4243:1: ( ( rule__BuildingComponent__LocationAssignment_6 ) )
            {
            // InternalScml.g:4243:1: ( ( rule__BuildingComponent__LocationAssignment_6 ) )
            // InternalScml.g:4244:2: ( rule__BuildingComponent__LocationAssignment_6 )
            {
             before(grammarAccess.getBuildingComponentAccess().getLocationAssignment_6()); 
            // InternalScml.g:4245:2: ( rule__BuildingComponent__LocationAssignment_6 )
            // InternalScml.g:4245:3: rule__BuildingComponent__LocationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__LocationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getLocationAssignment_6()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__6__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__7"
    // InternalScml.g:4253:1: rule__BuildingComponent__Group__7 : rule__BuildingComponent__Group__7__Impl rule__BuildingComponent__Group__8 ;
    public final void rule__BuildingComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4257:1: ( rule__BuildingComponent__Group__7__Impl rule__BuildingComponent__Group__8 )
            // InternalScml.g:4258:2: rule__BuildingComponent__Group__7__Impl rule__BuildingComponent__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__BuildingComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__8();

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
    // $ANTLR end "rule__BuildingComponent__Group__7"


    // $ANTLR start "rule__BuildingComponent__Group__7__Impl"
    // InternalScml.g:4265:1: rule__BuildingComponent__Group__7__Impl : ( ( rule__BuildingComponent__Group_7__0 )? ) ;
    public final void rule__BuildingComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4269:1: ( ( ( rule__BuildingComponent__Group_7__0 )? ) )
            // InternalScml.g:4270:1: ( ( rule__BuildingComponent__Group_7__0 )? )
            {
            // InternalScml.g:4270:1: ( ( rule__BuildingComponent__Group_7__0 )? )
            // InternalScml.g:4271:2: ( rule__BuildingComponent__Group_7__0 )?
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_7()); 
            // InternalScml.g:4272:2: ( rule__BuildingComponent__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==71) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalScml.g:4272:3: rule__BuildingComponent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BuildingComponent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBuildingComponentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__7__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__8"
    // InternalScml.g:4280:1: rule__BuildingComponent__Group__8 : rule__BuildingComponent__Group__8__Impl rule__BuildingComponent__Group__9 ;
    public final void rule__BuildingComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4284:1: ( rule__BuildingComponent__Group__8__Impl rule__BuildingComponent__Group__9 )
            // InternalScml.g:4285:2: rule__BuildingComponent__Group__8__Impl rule__BuildingComponent__Group__9
            {
            pushFollow(FOLLOW_42);
            rule__BuildingComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__9();

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
    // $ANTLR end "rule__BuildingComponent__Group__8"


    // $ANTLR start "rule__BuildingComponent__Group__8__Impl"
    // InternalScml.g:4292:1: rule__BuildingComponent__Group__8__Impl : ( 'parameter' ) ;
    public final void rule__BuildingComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4296:1: ( ( 'parameter' ) )
            // InternalScml.g:4297:1: ( 'parameter' )
            {
            // InternalScml.g:4297:1: ( 'parameter' )
            // InternalScml.g:4298:2: 'parameter'
            {
             before(grammarAccess.getBuildingComponentAccess().getParameterKeyword_8()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getParameterKeyword_8()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__8__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__9"
    // InternalScml.g:4307:1: rule__BuildingComponent__Group__9 : rule__BuildingComponent__Group__9__Impl rule__BuildingComponent__Group__10 ;
    public final void rule__BuildingComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4311:1: ( rule__BuildingComponent__Group__9__Impl rule__BuildingComponent__Group__10 )
            // InternalScml.g:4312:2: rule__BuildingComponent__Group__9__Impl rule__BuildingComponent__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__BuildingComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__10();

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
    // $ANTLR end "rule__BuildingComponent__Group__9"


    // $ANTLR start "rule__BuildingComponent__Group__9__Impl"
    // InternalScml.g:4319:1: rule__BuildingComponent__Group__9__Impl : ( ( rule__BuildingComponent__ParameterAssignment_9 ) ) ;
    public final void rule__BuildingComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4323:1: ( ( ( rule__BuildingComponent__ParameterAssignment_9 ) ) )
            // InternalScml.g:4324:1: ( ( rule__BuildingComponent__ParameterAssignment_9 ) )
            {
            // InternalScml.g:4324:1: ( ( rule__BuildingComponent__ParameterAssignment_9 ) )
            // InternalScml.g:4325:2: ( rule__BuildingComponent__ParameterAssignment_9 )
            {
             before(grammarAccess.getBuildingComponentAccess().getParameterAssignment_9()); 
            // InternalScml.g:4326:2: ( rule__BuildingComponent__ParameterAssignment_9 )
            // InternalScml.g:4326:3: rule__BuildingComponent__ParameterAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__ParameterAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getParameterAssignment_9()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__9__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__10"
    // InternalScml.g:4334:1: rule__BuildingComponent__Group__10 : rule__BuildingComponent__Group__10__Impl rule__BuildingComponent__Group__11 ;
    public final void rule__BuildingComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4338:1: ( rule__BuildingComponent__Group__10__Impl rule__BuildingComponent__Group__11 )
            // InternalScml.g:4339:2: rule__BuildingComponent__Group__10__Impl rule__BuildingComponent__Group__11
            {
            pushFollow(FOLLOW_43);
            rule__BuildingComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__11();

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
    // $ANTLR end "rule__BuildingComponent__Group__10"


    // $ANTLR start "rule__BuildingComponent__Group__10__Impl"
    // InternalScml.g:4346:1: rule__BuildingComponent__Group__10__Impl : ( ( rule__BuildingComponent__Group_10__0 )? ) ;
    public final void rule__BuildingComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4350:1: ( ( ( rule__BuildingComponent__Group_10__0 )? ) )
            // InternalScml.g:4351:1: ( ( rule__BuildingComponent__Group_10__0 )? )
            {
            // InternalScml.g:4351:1: ( ( rule__BuildingComponent__Group_10__0 )? )
            // InternalScml.g:4352:2: ( rule__BuildingComponent__Group_10__0 )?
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_10()); 
            // InternalScml.g:4353:2: ( rule__BuildingComponent__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==72) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalScml.g:4353:3: rule__BuildingComponent__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BuildingComponent__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBuildingComponentAccess().getGroup_10()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__10__Impl"


    // $ANTLR start "rule__BuildingComponent__Group__11"
    // InternalScml.g:4361:1: rule__BuildingComponent__Group__11 : rule__BuildingComponent__Group__11__Impl ;
    public final void rule__BuildingComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4365:1: ( rule__BuildingComponent__Group__11__Impl )
            // InternalScml.g:4366:2: rule__BuildingComponent__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group__11__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group__11"


    // $ANTLR start "rule__BuildingComponent__Group__11__Impl"
    // InternalScml.g:4372:1: rule__BuildingComponent__Group__11__Impl : ( '}' ) ;
    public final void rule__BuildingComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4376:1: ( ( '}' ) )
            // InternalScml.g:4377:1: ( '}' )
            {
            // InternalScml.g:4377:1: ( '}' )
            // InternalScml.g:4378:2: '}'
            {
             before(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__BuildingComponent__Group__11__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_3__0"
    // InternalScml.g:4388:1: rule__BuildingComponent__Group_3__0 : rule__BuildingComponent__Group_3__0__Impl rule__BuildingComponent__Group_3__1 ;
    public final void rule__BuildingComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4392:1: ( rule__BuildingComponent__Group_3__0__Impl rule__BuildingComponent__Group_3__1 )
            // InternalScml.g:4393:2: rule__BuildingComponent__Group_3__0__Impl rule__BuildingComponent__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BuildingComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_3__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_3__0"


    // $ANTLR start "rule__BuildingComponent__Group_3__0__Impl"
    // InternalScml.g:4400:1: rule__BuildingComponent__Group_3__0__Impl : ( 'isPartOf' ) ;
    public final void rule__BuildingComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4404:1: ( ( 'isPartOf' ) )
            // InternalScml.g:4405:1: ( 'isPartOf' )
            {
            // InternalScml.g:4405:1: ( 'isPartOf' )
            // InternalScml.g:4406:2: 'isPartOf'
            {
             before(grammarAccess.getBuildingComponentAccess().getIsPartOfKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getIsPartOfKeyword_3_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_3__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_3__1"
    // InternalScml.g:4415:1: rule__BuildingComponent__Group_3__1 : rule__BuildingComponent__Group_3__1__Impl ;
    public final void rule__BuildingComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4419:1: ( rule__BuildingComponent__Group_3__1__Impl )
            // InternalScml.g:4420:2: rule__BuildingComponent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_3__1__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_3__1"


    // $ANTLR start "rule__BuildingComponent__Group_3__1__Impl"
    // InternalScml.g:4426:1: rule__BuildingComponent__Group_3__1__Impl : ( ( rule__BuildingComponent__IsPartOfAssignment_3_1 ) ) ;
    public final void rule__BuildingComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4430:1: ( ( ( rule__BuildingComponent__IsPartOfAssignment_3_1 ) ) )
            // InternalScml.g:4431:1: ( ( rule__BuildingComponent__IsPartOfAssignment_3_1 ) )
            {
            // InternalScml.g:4431:1: ( ( rule__BuildingComponent__IsPartOfAssignment_3_1 ) )
            // InternalScml.g:4432:2: ( rule__BuildingComponent__IsPartOfAssignment_3_1 )
            {
             before(grammarAccess.getBuildingComponentAccess().getIsPartOfAssignment_3_1()); 
            // InternalScml.g:4433:2: ( rule__BuildingComponent__IsPartOfAssignment_3_1 )
            // InternalScml.g:4433:3: rule__BuildingComponent__IsPartOfAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__IsPartOfAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getIsPartOfAssignment_3_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_3__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4__0"
    // InternalScml.g:4442:1: rule__BuildingComponent__Group_4__0 : rule__BuildingComponent__Group_4__0__Impl rule__BuildingComponent__Group_4__1 ;
    public final void rule__BuildingComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4446:1: ( rule__BuildingComponent__Group_4__0__Impl rule__BuildingComponent__Group_4__1 )
            // InternalScml.g:4447:2: rule__BuildingComponent__Group_4__0__Impl rule__BuildingComponent__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__BuildingComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_4__0"


    // $ANTLR start "rule__BuildingComponent__Group_4__0__Impl"
    // InternalScml.g:4454:1: rule__BuildingComponent__Group_4__0__Impl : ( 'composedOf' ) ;
    public final void rule__BuildingComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4458:1: ( ( 'composedOf' ) )
            // InternalScml.g:4459:1: ( 'composedOf' )
            {
            // InternalScml.g:4459:1: ( 'composedOf' )
            // InternalScml.g:4460:2: 'composedOf'
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getComposedOfKeyword_4_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4__1"
    // InternalScml.g:4469:1: rule__BuildingComponent__Group_4__1 : rule__BuildingComponent__Group_4__1__Impl rule__BuildingComponent__Group_4__2 ;
    public final void rule__BuildingComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4473:1: ( rule__BuildingComponent__Group_4__1__Impl rule__BuildingComponent__Group_4__2 )
            // InternalScml.g:4474:2: rule__BuildingComponent__Group_4__1__Impl rule__BuildingComponent__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__BuildingComponent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4__2();

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
    // $ANTLR end "rule__BuildingComponent__Group_4__1"


    // $ANTLR start "rule__BuildingComponent__Group_4__1__Impl"
    // InternalScml.g:4481:1: rule__BuildingComponent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__BuildingComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4485:1: ( ( '(' ) )
            // InternalScml.g:4486:1: ( '(' )
            {
            // InternalScml.g:4486:1: ( '(' )
            // InternalScml.g:4487:2: '('
            {
             before(grammarAccess.getBuildingComponentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4__2"
    // InternalScml.g:4496:1: rule__BuildingComponent__Group_4__2 : rule__BuildingComponent__Group_4__2__Impl rule__BuildingComponent__Group_4__3 ;
    public final void rule__BuildingComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4500:1: ( rule__BuildingComponent__Group_4__2__Impl rule__BuildingComponent__Group_4__3 )
            // InternalScml.g:4501:2: rule__BuildingComponent__Group_4__2__Impl rule__BuildingComponent__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__BuildingComponent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4__3();

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
    // $ANTLR end "rule__BuildingComponent__Group_4__2"


    // $ANTLR start "rule__BuildingComponent__Group_4__2__Impl"
    // InternalScml.g:4508:1: rule__BuildingComponent__Group_4__2__Impl : ( ( rule__BuildingComponent__ComposedOfAssignment_4_2 ) ) ;
    public final void rule__BuildingComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4512:1: ( ( ( rule__BuildingComponent__ComposedOfAssignment_4_2 ) ) )
            // InternalScml.g:4513:1: ( ( rule__BuildingComponent__ComposedOfAssignment_4_2 ) )
            {
            // InternalScml.g:4513:1: ( ( rule__BuildingComponent__ComposedOfAssignment_4_2 ) )
            // InternalScml.g:4514:2: ( rule__BuildingComponent__ComposedOfAssignment_4_2 )
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfAssignment_4_2()); 
            // InternalScml.g:4515:2: ( rule__BuildingComponent__ComposedOfAssignment_4_2 )
            // InternalScml.g:4515:3: rule__BuildingComponent__ComposedOfAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__ComposedOfAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getComposedOfAssignment_4_2()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4__2__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4__3"
    // InternalScml.g:4523:1: rule__BuildingComponent__Group_4__3 : rule__BuildingComponent__Group_4__3__Impl rule__BuildingComponent__Group_4__4 ;
    public final void rule__BuildingComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4527:1: ( rule__BuildingComponent__Group_4__3__Impl rule__BuildingComponent__Group_4__4 )
            // InternalScml.g:4528:2: rule__BuildingComponent__Group_4__3__Impl rule__BuildingComponent__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__BuildingComponent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4__4();

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
    // $ANTLR end "rule__BuildingComponent__Group_4__3"


    // $ANTLR start "rule__BuildingComponent__Group_4__3__Impl"
    // InternalScml.g:4535:1: rule__BuildingComponent__Group_4__3__Impl : ( ( rule__BuildingComponent__Group_4_3__0 )* ) ;
    public final void rule__BuildingComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4539:1: ( ( ( rule__BuildingComponent__Group_4_3__0 )* ) )
            // InternalScml.g:4540:1: ( ( rule__BuildingComponent__Group_4_3__0 )* )
            {
            // InternalScml.g:4540:1: ( ( rule__BuildingComponent__Group_4_3__0 )* )
            // InternalScml.g:4541:2: ( rule__BuildingComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_4_3()); 
            // InternalScml.g:4542:2: ( rule__BuildingComponent__Group_4_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalScml.g:4542:3: rule__BuildingComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BuildingComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getBuildingComponentAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4__3__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4__4"
    // InternalScml.g:4550:1: rule__BuildingComponent__Group_4__4 : rule__BuildingComponent__Group_4__4__Impl ;
    public final void rule__BuildingComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4554:1: ( rule__BuildingComponent__Group_4__4__Impl )
            // InternalScml.g:4555:2: rule__BuildingComponent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4__4__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_4__4"


    // $ANTLR start "rule__BuildingComponent__Group_4__4__Impl"
    // InternalScml.g:4561:1: rule__BuildingComponent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__BuildingComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4565:1: ( ( ')' ) )
            // InternalScml.g:4566:1: ( ')' )
            {
            // InternalScml.g:4566:1: ( ')' )
            // InternalScml.g:4567:2: ')'
            {
             before(grammarAccess.getBuildingComponentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4__4__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4_3__0"
    // InternalScml.g:4577:1: rule__BuildingComponent__Group_4_3__0 : rule__BuildingComponent__Group_4_3__0__Impl rule__BuildingComponent__Group_4_3__1 ;
    public final void rule__BuildingComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4581:1: ( rule__BuildingComponent__Group_4_3__0__Impl rule__BuildingComponent__Group_4_3__1 )
            // InternalScml.g:4582:2: rule__BuildingComponent__Group_4_3__0__Impl rule__BuildingComponent__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BuildingComponent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4_3__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_4_3__0"


    // $ANTLR start "rule__BuildingComponent__Group_4_3__0__Impl"
    // InternalScml.g:4589:1: rule__BuildingComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__BuildingComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4593:1: ( ( ',' ) )
            // InternalScml.g:4594:1: ( ',' )
            {
            // InternalScml.g:4594:1: ( ',' )
            // InternalScml.g:4595:2: ','
            {
             before(grammarAccess.getBuildingComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4_3__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_4_3__1"
    // InternalScml.g:4604:1: rule__BuildingComponent__Group_4_3__1 : rule__BuildingComponent__Group_4_3__1__Impl ;
    public final void rule__BuildingComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4608:1: ( rule__BuildingComponent__Group_4_3__1__Impl )
            // InternalScml.g:4609:2: rule__BuildingComponent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_4_3__1"


    // $ANTLR start "rule__BuildingComponent__Group_4_3__1__Impl"
    // InternalScml.g:4615:1: rule__BuildingComponent__Group_4_3__1__Impl : ( ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 ) ) ;
    public final void rule__BuildingComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4619:1: ( ( ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 ) ) )
            // InternalScml.g:4620:1: ( ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 ) )
            {
            // InternalScml.g:4620:1: ( ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 ) )
            // InternalScml.g:4621:2: ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 )
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfAssignment_4_3_1()); 
            // InternalScml.g:4622:2: ( rule__BuildingComponent__ComposedOfAssignment_4_3_1 )
            // InternalScml.g:4622:3: rule__BuildingComponent__ComposedOfAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__ComposedOfAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getComposedOfAssignment_4_3_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_4_3__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7__0"
    // InternalScml.g:4631:1: rule__BuildingComponent__Group_7__0 : rule__BuildingComponent__Group_7__0__Impl rule__BuildingComponent__Group_7__1 ;
    public final void rule__BuildingComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4635:1: ( rule__BuildingComponent__Group_7__0__Impl rule__BuildingComponent__Group_7__1 )
            // InternalScml.g:4636:2: rule__BuildingComponent__Group_7__0__Impl rule__BuildingComponent__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__BuildingComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_7__0"


    // $ANTLR start "rule__BuildingComponent__Group_7__0__Impl"
    // InternalScml.g:4643:1: rule__BuildingComponent__Group_7__0__Impl : ( 'produces' ) ;
    public final void rule__BuildingComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4647:1: ( ( 'produces' ) )
            // InternalScml.g:4648:1: ( 'produces' )
            {
            // InternalScml.g:4648:1: ( 'produces' )
            // InternalScml.g:4649:2: 'produces'
            {
             before(grammarAccess.getBuildingComponentAccess().getProducesKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getProducesKeyword_7_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7__1"
    // InternalScml.g:4658:1: rule__BuildingComponent__Group_7__1 : rule__BuildingComponent__Group_7__1__Impl rule__BuildingComponent__Group_7__2 ;
    public final void rule__BuildingComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4662:1: ( rule__BuildingComponent__Group_7__1__Impl rule__BuildingComponent__Group_7__2 )
            // InternalScml.g:4663:2: rule__BuildingComponent__Group_7__1__Impl rule__BuildingComponent__Group_7__2
            {
            pushFollow(FOLLOW_44);
            rule__BuildingComponent__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7__2();

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
    // $ANTLR end "rule__BuildingComponent__Group_7__1"


    // $ANTLR start "rule__BuildingComponent__Group_7__1__Impl"
    // InternalScml.g:4670:1: rule__BuildingComponent__Group_7__1__Impl : ( '{' ) ;
    public final void rule__BuildingComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4674:1: ( ( '{' ) )
            // InternalScml.g:4675:1: ( '{' )
            {
            // InternalScml.g:4675:1: ( '{' )
            // InternalScml.g:4676:2: '{'
            {
             before(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7__2"
    // InternalScml.g:4685:1: rule__BuildingComponent__Group_7__2 : rule__BuildingComponent__Group_7__2__Impl rule__BuildingComponent__Group_7__3 ;
    public final void rule__BuildingComponent__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4689:1: ( rule__BuildingComponent__Group_7__2__Impl rule__BuildingComponent__Group_7__3 )
            // InternalScml.g:4690:2: rule__BuildingComponent__Group_7__2__Impl rule__BuildingComponent__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__BuildingComponent__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7__3();

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
    // $ANTLR end "rule__BuildingComponent__Group_7__2"


    // $ANTLR start "rule__BuildingComponent__Group_7__2__Impl"
    // InternalScml.g:4697:1: rule__BuildingComponent__Group_7__2__Impl : ( ( rule__BuildingComponent__ProducesAssignment_7_2 ) ) ;
    public final void rule__BuildingComponent__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4701:1: ( ( ( rule__BuildingComponent__ProducesAssignment_7_2 ) ) )
            // InternalScml.g:4702:1: ( ( rule__BuildingComponent__ProducesAssignment_7_2 ) )
            {
            // InternalScml.g:4702:1: ( ( rule__BuildingComponent__ProducesAssignment_7_2 ) )
            // InternalScml.g:4703:2: ( rule__BuildingComponent__ProducesAssignment_7_2 )
            {
             before(grammarAccess.getBuildingComponentAccess().getProducesAssignment_7_2()); 
            // InternalScml.g:4704:2: ( rule__BuildingComponent__ProducesAssignment_7_2 )
            // InternalScml.g:4704:3: rule__BuildingComponent__ProducesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__ProducesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getProducesAssignment_7_2()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7__2__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7__3"
    // InternalScml.g:4712:1: rule__BuildingComponent__Group_7__3 : rule__BuildingComponent__Group_7__3__Impl rule__BuildingComponent__Group_7__4 ;
    public final void rule__BuildingComponent__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4716:1: ( rule__BuildingComponent__Group_7__3__Impl rule__BuildingComponent__Group_7__4 )
            // InternalScml.g:4717:2: rule__BuildingComponent__Group_7__3__Impl rule__BuildingComponent__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__BuildingComponent__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7__4();

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
    // $ANTLR end "rule__BuildingComponent__Group_7__3"


    // $ANTLR start "rule__BuildingComponent__Group_7__3__Impl"
    // InternalScml.g:4724:1: rule__BuildingComponent__Group_7__3__Impl : ( ( rule__BuildingComponent__Group_7_3__0 )* ) ;
    public final void rule__BuildingComponent__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4728:1: ( ( ( rule__BuildingComponent__Group_7_3__0 )* ) )
            // InternalScml.g:4729:1: ( ( rule__BuildingComponent__Group_7_3__0 )* )
            {
            // InternalScml.g:4729:1: ( ( rule__BuildingComponent__Group_7_3__0 )* )
            // InternalScml.g:4730:2: ( rule__BuildingComponent__Group_7_3__0 )*
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_7_3()); 
            // InternalScml.g:4731:2: ( rule__BuildingComponent__Group_7_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalScml.g:4731:3: rule__BuildingComponent__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BuildingComponent__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getBuildingComponentAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7__3__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7__4"
    // InternalScml.g:4739:1: rule__BuildingComponent__Group_7__4 : rule__BuildingComponent__Group_7__4__Impl ;
    public final void rule__BuildingComponent__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4743:1: ( rule__BuildingComponent__Group_7__4__Impl )
            // InternalScml.g:4744:2: rule__BuildingComponent__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7__4__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_7__4"


    // $ANTLR start "rule__BuildingComponent__Group_7__4__Impl"
    // InternalScml.g:4750:1: rule__BuildingComponent__Group_7__4__Impl : ( '}' ) ;
    public final void rule__BuildingComponent__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4754:1: ( ( '}' ) )
            // InternalScml.g:4755:1: ( '}' )
            {
            // InternalScml.g:4755:1: ( '}' )
            // InternalScml.g:4756:2: '}'
            {
             before(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7__4__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7_3__0"
    // InternalScml.g:4766:1: rule__BuildingComponent__Group_7_3__0 : rule__BuildingComponent__Group_7_3__0__Impl rule__BuildingComponent__Group_7_3__1 ;
    public final void rule__BuildingComponent__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4770:1: ( rule__BuildingComponent__Group_7_3__0__Impl rule__BuildingComponent__Group_7_3__1 )
            // InternalScml.g:4771:2: rule__BuildingComponent__Group_7_3__0__Impl rule__BuildingComponent__Group_7_3__1
            {
            pushFollow(FOLLOW_44);
            rule__BuildingComponent__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7_3__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_7_3__0"


    // $ANTLR start "rule__BuildingComponent__Group_7_3__0__Impl"
    // InternalScml.g:4778:1: rule__BuildingComponent__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__BuildingComponent__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4782:1: ( ( ',' ) )
            // InternalScml.g:4783:1: ( ',' )
            {
            // InternalScml.g:4783:1: ( ',' )
            // InternalScml.g:4784:2: ','
            {
             before(grammarAccess.getBuildingComponentAccess().getCommaKeyword_7_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7_3__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_7_3__1"
    // InternalScml.g:4793:1: rule__BuildingComponent__Group_7_3__1 : rule__BuildingComponent__Group_7_3__1__Impl ;
    public final void rule__BuildingComponent__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4797:1: ( rule__BuildingComponent__Group_7_3__1__Impl )
            // InternalScml.g:4798:2: rule__BuildingComponent__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_7_3__1"


    // $ANTLR start "rule__BuildingComponent__Group_7_3__1__Impl"
    // InternalScml.g:4804:1: rule__BuildingComponent__Group_7_3__1__Impl : ( ( rule__BuildingComponent__ProducesAssignment_7_3_1 ) ) ;
    public final void rule__BuildingComponent__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4808:1: ( ( ( rule__BuildingComponent__ProducesAssignment_7_3_1 ) ) )
            // InternalScml.g:4809:1: ( ( rule__BuildingComponent__ProducesAssignment_7_3_1 ) )
            {
            // InternalScml.g:4809:1: ( ( rule__BuildingComponent__ProducesAssignment_7_3_1 ) )
            // InternalScml.g:4810:2: ( rule__BuildingComponent__ProducesAssignment_7_3_1 )
            {
             before(grammarAccess.getBuildingComponentAccess().getProducesAssignment_7_3_1()); 
            // InternalScml.g:4811:2: ( rule__BuildingComponent__ProducesAssignment_7_3_1 )
            // InternalScml.g:4811:3: rule__BuildingComponent__ProducesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__ProducesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getProducesAssignment_7_3_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_7_3__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10__0"
    // InternalScml.g:4820:1: rule__BuildingComponent__Group_10__0 : rule__BuildingComponent__Group_10__0__Impl rule__BuildingComponent__Group_10__1 ;
    public final void rule__BuildingComponent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4824:1: ( rule__BuildingComponent__Group_10__0__Impl rule__BuildingComponent__Group_10__1 )
            // InternalScml.g:4825:2: rule__BuildingComponent__Group_10__0__Impl rule__BuildingComponent__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__BuildingComponent__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_10__0"


    // $ANTLR start "rule__BuildingComponent__Group_10__0__Impl"
    // InternalScml.g:4832:1: rule__BuildingComponent__Group_10__0__Impl : ( 'device' ) ;
    public final void rule__BuildingComponent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4836:1: ( ( 'device' ) )
            // InternalScml.g:4837:1: ( 'device' )
            {
            // InternalScml.g:4837:1: ( 'device' )
            // InternalScml.g:4838:2: 'device'
            {
             before(grammarAccess.getBuildingComponentAccess().getDeviceKeyword_10_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getDeviceKeyword_10_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10__1"
    // InternalScml.g:4847:1: rule__BuildingComponent__Group_10__1 : rule__BuildingComponent__Group_10__1__Impl rule__BuildingComponent__Group_10__2 ;
    public final void rule__BuildingComponent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4851:1: ( rule__BuildingComponent__Group_10__1__Impl rule__BuildingComponent__Group_10__2 )
            // InternalScml.g:4852:2: rule__BuildingComponent__Group_10__1__Impl rule__BuildingComponent__Group_10__2
            {
            pushFollow(FOLLOW_45);
            rule__BuildingComponent__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10__2();

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
    // $ANTLR end "rule__BuildingComponent__Group_10__1"


    // $ANTLR start "rule__BuildingComponent__Group_10__1__Impl"
    // InternalScml.g:4859:1: rule__BuildingComponent__Group_10__1__Impl : ( '{' ) ;
    public final void rule__BuildingComponent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4863:1: ( ( '{' ) )
            // InternalScml.g:4864:1: ( '{' )
            {
            // InternalScml.g:4864:1: ( '{' )
            // InternalScml.g:4865:2: '{'
            {
             before(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10__1__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10__2"
    // InternalScml.g:4874:1: rule__BuildingComponent__Group_10__2 : rule__BuildingComponent__Group_10__2__Impl rule__BuildingComponent__Group_10__3 ;
    public final void rule__BuildingComponent__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4878:1: ( rule__BuildingComponent__Group_10__2__Impl rule__BuildingComponent__Group_10__3 )
            // InternalScml.g:4879:2: rule__BuildingComponent__Group_10__2__Impl rule__BuildingComponent__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__BuildingComponent__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10__3();

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
    // $ANTLR end "rule__BuildingComponent__Group_10__2"


    // $ANTLR start "rule__BuildingComponent__Group_10__2__Impl"
    // InternalScml.g:4886:1: rule__BuildingComponent__Group_10__2__Impl : ( ( rule__BuildingComponent__DeviceAssignment_10_2 ) ) ;
    public final void rule__BuildingComponent__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4890:1: ( ( ( rule__BuildingComponent__DeviceAssignment_10_2 ) ) )
            // InternalScml.g:4891:1: ( ( rule__BuildingComponent__DeviceAssignment_10_2 ) )
            {
            // InternalScml.g:4891:1: ( ( rule__BuildingComponent__DeviceAssignment_10_2 ) )
            // InternalScml.g:4892:2: ( rule__BuildingComponent__DeviceAssignment_10_2 )
            {
             before(grammarAccess.getBuildingComponentAccess().getDeviceAssignment_10_2()); 
            // InternalScml.g:4893:2: ( rule__BuildingComponent__DeviceAssignment_10_2 )
            // InternalScml.g:4893:3: rule__BuildingComponent__DeviceAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__DeviceAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getDeviceAssignment_10_2()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10__2__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10__3"
    // InternalScml.g:4901:1: rule__BuildingComponent__Group_10__3 : rule__BuildingComponent__Group_10__3__Impl rule__BuildingComponent__Group_10__4 ;
    public final void rule__BuildingComponent__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4905:1: ( rule__BuildingComponent__Group_10__3__Impl rule__BuildingComponent__Group_10__4 )
            // InternalScml.g:4906:2: rule__BuildingComponent__Group_10__3__Impl rule__BuildingComponent__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__BuildingComponent__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10__4();

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
    // $ANTLR end "rule__BuildingComponent__Group_10__3"


    // $ANTLR start "rule__BuildingComponent__Group_10__3__Impl"
    // InternalScml.g:4913:1: rule__BuildingComponent__Group_10__3__Impl : ( ( rule__BuildingComponent__Group_10_3__0 )* ) ;
    public final void rule__BuildingComponent__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4917:1: ( ( ( rule__BuildingComponent__Group_10_3__0 )* ) )
            // InternalScml.g:4918:1: ( ( rule__BuildingComponent__Group_10_3__0 )* )
            {
            // InternalScml.g:4918:1: ( ( rule__BuildingComponent__Group_10_3__0 )* )
            // InternalScml.g:4919:2: ( rule__BuildingComponent__Group_10_3__0 )*
            {
             before(grammarAccess.getBuildingComponentAccess().getGroup_10_3()); 
            // InternalScml.g:4920:2: ( rule__BuildingComponent__Group_10_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalScml.g:4920:3: rule__BuildingComponent__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BuildingComponent__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getBuildingComponentAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10__3__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10__4"
    // InternalScml.g:4928:1: rule__BuildingComponent__Group_10__4 : rule__BuildingComponent__Group_10__4__Impl ;
    public final void rule__BuildingComponent__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4932:1: ( rule__BuildingComponent__Group_10__4__Impl )
            // InternalScml.g:4933:2: rule__BuildingComponent__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10__4__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_10__4"


    // $ANTLR start "rule__BuildingComponent__Group_10__4__Impl"
    // InternalScml.g:4939:1: rule__BuildingComponent__Group_10__4__Impl : ( '}' ) ;
    public final void rule__BuildingComponent__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4943:1: ( ( '}' ) )
            // InternalScml.g:4944:1: ( '}' )
            {
            // InternalScml.g:4944:1: ( '}' )
            // InternalScml.g:4945:2: '}'
            {
             before(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10__4__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10_3__0"
    // InternalScml.g:4955:1: rule__BuildingComponent__Group_10_3__0 : rule__BuildingComponent__Group_10_3__0__Impl rule__BuildingComponent__Group_10_3__1 ;
    public final void rule__BuildingComponent__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4959:1: ( rule__BuildingComponent__Group_10_3__0__Impl rule__BuildingComponent__Group_10_3__1 )
            // InternalScml.g:4960:2: rule__BuildingComponent__Group_10_3__0__Impl rule__BuildingComponent__Group_10_3__1
            {
            pushFollow(FOLLOW_45);
            rule__BuildingComponent__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10_3__1();

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
    // $ANTLR end "rule__BuildingComponent__Group_10_3__0"


    // $ANTLR start "rule__BuildingComponent__Group_10_3__0__Impl"
    // InternalScml.g:4967:1: rule__BuildingComponent__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__BuildingComponent__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4971:1: ( ( ',' ) )
            // InternalScml.g:4972:1: ( ',' )
            {
            // InternalScml.g:4972:1: ( ',' )
            // InternalScml.g:4973:2: ','
            {
             before(grammarAccess.getBuildingComponentAccess().getCommaKeyword_10_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBuildingComponentAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10_3__0__Impl"


    // $ANTLR start "rule__BuildingComponent__Group_10_3__1"
    // InternalScml.g:4982:1: rule__BuildingComponent__Group_10_3__1 : rule__BuildingComponent__Group_10_3__1__Impl ;
    public final void rule__BuildingComponent__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4986:1: ( rule__BuildingComponent__Group_10_3__1__Impl )
            // InternalScml.g:4987:2: rule__BuildingComponent__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__BuildingComponent__Group_10_3__1"


    // $ANTLR start "rule__BuildingComponent__Group_10_3__1__Impl"
    // InternalScml.g:4993:1: rule__BuildingComponent__Group_10_3__1__Impl : ( ( rule__BuildingComponent__DeviceAssignment_10_3_1 ) ) ;
    public final void rule__BuildingComponent__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:4997:1: ( ( ( rule__BuildingComponent__DeviceAssignment_10_3_1 ) ) )
            // InternalScml.g:4998:1: ( ( rule__BuildingComponent__DeviceAssignment_10_3_1 ) )
            {
            // InternalScml.g:4998:1: ( ( rule__BuildingComponent__DeviceAssignment_10_3_1 ) )
            // InternalScml.g:4999:2: ( rule__BuildingComponent__DeviceAssignment_10_3_1 )
            {
             before(grammarAccess.getBuildingComponentAccess().getDeviceAssignment_10_3_1()); 
            // InternalScml.g:5000:2: ( rule__BuildingComponent__DeviceAssignment_10_3_1 )
            // InternalScml.g:5000:3: rule__BuildingComponent__DeviceAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BuildingComponent__DeviceAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBuildingComponentAccess().getDeviceAssignment_10_3_1()); 

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
    // $ANTLR end "rule__BuildingComponent__Group_10_3__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__0"
    // InternalScml.g:5009:1: rule__TransportationComponent__Group__0 : rule__TransportationComponent__Group__0__Impl rule__TransportationComponent__Group__1 ;
    public final void rule__TransportationComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5013:1: ( rule__TransportationComponent__Group__0__Impl rule__TransportationComponent__Group__1 )
            // InternalScml.g:5014:2: rule__TransportationComponent__Group__0__Impl rule__TransportationComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportationComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__1();

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
    // $ANTLR end "rule__TransportationComponent__Group__0"


    // $ANTLR start "rule__TransportationComponent__Group__0__Impl"
    // InternalScml.g:5021:1: rule__TransportationComponent__Group__0__Impl : ( 'TransportationComponent' ) ;
    public final void rule__TransportationComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5025:1: ( ( 'TransportationComponent' ) )
            // InternalScml.g:5026:1: ( 'TransportationComponent' )
            {
            // InternalScml.g:5026:1: ( 'TransportationComponent' )
            // InternalScml.g:5027:2: 'TransportationComponent'
            {
             before(grammarAccess.getTransportationComponentAccess().getTransportationComponentKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getTransportationComponentKeyword_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__1"
    // InternalScml.g:5036:1: rule__TransportationComponent__Group__1 : rule__TransportationComponent__Group__1__Impl rule__TransportationComponent__Group__2 ;
    public final void rule__TransportationComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5040:1: ( rule__TransportationComponent__Group__1__Impl rule__TransportationComponent__Group__2 )
            // InternalScml.g:5041:2: rule__TransportationComponent__Group__1__Impl rule__TransportationComponent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TransportationComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__2();

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
    // $ANTLR end "rule__TransportationComponent__Group__1"


    // $ANTLR start "rule__TransportationComponent__Group__1__Impl"
    // InternalScml.g:5048:1: rule__TransportationComponent__Group__1__Impl : ( ( rule__TransportationComponent__NameAssignment_1 ) ) ;
    public final void rule__TransportationComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5052:1: ( ( ( rule__TransportationComponent__NameAssignment_1 ) ) )
            // InternalScml.g:5053:1: ( ( rule__TransportationComponent__NameAssignment_1 ) )
            {
            // InternalScml.g:5053:1: ( ( rule__TransportationComponent__NameAssignment_1 ) )
            // InternalScml.g:5054:2: ( rule__TransportationComponent__NameAssignment_1 )
            {
             before(grammarAccess.getTransportationComponentAccess().getNameAssignment_1()); 
            // InternalScml.g:5055:2: ( rule__TransportationComponent__NameAssignment_1 )
            // InternalScml.g:5055:3: rule__TransportationComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__2"
    // InternalScml.g:5063:1: rule__TransportationComponent__Group__2 : rule__TransportationComponent__Group__2__Impl rule__TransportationComponent__Group__3 ;
    public final void rule__TransportationComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5067:1: ( rule__TransportationComponent__Group__2__Impl rule__TransportationComponent__Group__3 )
            // InternalScml.g:5068:2: rule__TransportationComponent__Group__2__Impl rule__TransportationComponent__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__TransportationComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__3();

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
    // $ANTLR end "rule__TransportationComponent__Group__2"


    // $ANTLR start "rule__TransportationComponent__Group__2__Impl"
    // InternalScml.g:5075:1: rule__TransportationComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__TransportationComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5079:1: ( ( '{' ) )
            // InternalScml.g:5080:1: ( '{' )
            {
            // InternalScml.g:5080:1: ( '{' )
            // InternalScml.g:5081:2: '{'
            {
             before(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__2__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__3"
    // InternalScml.g:5090:1: rule__TransportationComponent__Group__3 : rule__TransportationComponent__Group__3__Impl rule__TransportationComponent__Group__4 ;
    public final void rule__TransportationComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5094:1: ( rule__TransportationComponent__Group__3__Impl rule__TransportationComponent__Group__4 )
            // InternalScml.g:5095:2: rule__TransportationComponent__Group__3__Impl rule__TransportationComponent__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__TransportationComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__4();

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
    // $ANTLR end "rule__TransportationComponent__Group__3"


    // $ANTLR start "rule__TransportationComponent__Group__3__Impl"
    // InternalScml.g:5102:1: rule__TransportationComponent__Group__3__Impl : ( ( rule__TransportationComponent__Group_3__0 )? ) ;
    public final void rule__TransportationComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5106:1: ( ( ( rule__TransportationComponent__Group_3__0 )? ) )
            // InternalScml.g:5107:1: ( ( rule__TransportationComponent__Group_3__0 )? )
            {
            // InternalScml.g:5107:1: ( ( rule__TransportationComponent__Group_3__0 )? )
            // InternalScml.g:5108:2: ( rule__TransportationComponent__Group_3__0 )?
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_3()); 
            // InternalScml.g:5109:2: ( rule__TransportationComponent__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalScml.g:5109:3: rule__TransportationComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportationComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportationComponentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__3__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__4"
    // InternalScml.g:5117:1: rule__TransportationComponent__Group__4 : rule__TransportationComponent__Group__4__Impl rule__TransportationComponent__Group__5 ;
    public final void rule__TransportationComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5121:1: ( rule__TransportationComponent__Group__4__Impl rule__TransportationComponent__Group__5 )
            // InternalScml.g:5122:2: rule__TransportationComponent__Group__4__Impl rule__TransportationComponent__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__TransportationComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__5();

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
    // $ANTLR end "rule__TransportationComponent__Group__4"


    // $ANTLR start "rule__TransportationComponent__Group__4__Impl"
    // InternalScml.g:5129:1: rule__TransportationComponent__Group__4__Impl : ( ( rule__TransportationComponent__Group_4__0 )? ) ;
    public final void rule__TransportationComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5133:1: ( ( ( rule__TransportationComponent__Group_4__0 )? ) )
            // InternalScml.g:5134:1: ( ( rule__TransportationComponent__Group_4__0 )? )
            {
            // InternalScml.g:5134:1: ( ( rule__TransportationComponent__Group_4__0 )? )
            // InternalScml.g:5135:2: ( rule__TransportationComponent__Group_4__0 )?
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_4()); 
            // InternalScml.g:5136:2: ( rule__TransportationComponent__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalScml.g:5136:3: rule__TransportationComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportationComponent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportationComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__4__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__5"
    // InternalScml.g:5144:1: rule__TransportationComponent__Group__5 : rule__TransportationComponent__Group__5__Impl rule__TransportationComponent__Group__6 ;
    public final void rule__TransportationComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5148:1: ( rule__TransportationComponent__Group__5__Impl rule__TransportationComponent__Group__6 )
            // InternalScml.g:5149:2: rule__TransportationComponent__Group__5__Impl rule__TransportationComponent__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__TransportationComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__6();

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
    // $ANTLR end "rule__TransportationComponent__Group__5"


    // $ANTLR start "rule__TransportationComponent__Group__5__Impl"
    // InternalScml.g:5156:1: rule__TransportationComponent__Group__5__Impl : ( 'location' ) ;
    public final void rule__TransportationComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5160:1: ( ( 'location' ) )
            // InternalScml.g:5161:1: ( 'location' )
            {
            // InternalScml.g:5161:1: ( 'location' )
            // InternalScml.g:5162:2: 'location'
            {
             before(grammarAccess.getTransportationComponentAccess().getLocationKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getLocationKeyword_5()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__5__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__6"
    // InternalScml.g:5171:1: rule__TransportationComponent__Group__6 : rule__TransportationComponent__Group__6__Impl rule__TransportationComponent__Group__7 ;
    public final void rule__TransportationComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5175:1: ( rule__TransportationComponent__Group__6__Impl rule__TransportationComponent__Group__7 )
            // InternalScml.g:5176:2: rule__TransportationComponent__Group__6__Impl rule__TransportationComponent__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__TransportationComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__7();

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
    // $ANTLR end "rule__TransportationComponent__Group__6"


    // $ANTLR start "rule__TransportationComponent__Group__6__Impl"
    // InternalScml.g:5183:1: rule__TransportationComponent__Group__6__Impl : ( ( rule__TransportationComponent__LocationAssignment_6 ) ) ;
    public final void rule__TransportationComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5187:1: ( ( ( rule__TransportationComponent__LocationAssignment_6 ) ) )
            // InternalScml.g:5188:1: ( ( rule__TransportationComponent__LocationAssignment_6 ) )
            {
            // InternalScml.g:5188:1: ( ( rule__TransportationComponent__LocationAssignment_6 ) )
            // InternalScml.g:5189:2: ( rule__TransportationComponent__LocationAssignment_6 )
            {
             before(grammarAccess.getTransportationComponentAccess().getLocationAssignment_6()); 
            // InternalScml.g:5190:2: ( rule__TransportationComponent__LocationAssignment_6 )
            // InternalScml.g:5190:3: rule__TransportationComponent__LocationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__LocationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getLocationAssignment_6()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__6__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__7"
    // InternalScml.g:5198:1: rule__TransportationComponent__Group__7 : rule__TransportationComponent__Group__7__Impl rule__TransportationComponent__Group__8 ;
    public final void rule__TransportationComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5202:1: ( rule__TransportationComponent__Group__7__Impl rule__TransportationComponent__Group__8 )
            // InternalScml.g:5203:2: rule__TransportationComponent__Group__7__Impl rule__TransportationComponent__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__TransportationComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__8();

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
    // $ANTLR end "rule__TransportationComponent__Group__7"


    // $ANTLR start "rule__TransportationComponent__Group__7__Impl"
    // InternalScml.g:5210:1: rule__TransportationComponent__Group__7__Impl : ( ( rule__TransportationComponent__Group_7__0 )? ) ;
    public final void rule__TransportationComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5214:1: ( ( ( rule__TransportationComponent__Group_7__0 )? ) )
            // InternalScml.g:5215:1: ( ( rule__TransportationComponent__Group_7__0 )? )
            {
            // InternalScml.g:5215:1: ( ( rule__TransportationComponent__Group_7__0 )? )
            // InternalScml.g:5216:2: ( rule__TransportationComponent__Group_7__0 )?
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_7()); 
            // InternalScml.g:5217:2: ( rule__TransportationComponent__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==71) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalScml.g:5217:3: rule__TransportationComponent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportationComponent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportationComponentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__7__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__8"
    // InternalScml.g:5225:1: rule__TransportationComponent__Group__8 : rule__TransportationComponent__Group__8__Impl rule__TransportationComponent__Group__9 ;
    public final void rule__TransportationComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5229:1: ( rule__TransportationComponent__Group__8__Impl rule__TransportationComponent__Group__9 )
            // InternalScml.g:5230:2: rule__TransportationComponent__Group__8__Impl rule__TransportationComponent__Group__9
            {
            pushFollow(FOLLOW_42);
            rule__TransportationComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__9();

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
    // $ANTLR end "rule__TransportationComponent__Group__8"


    // $ANTLR start "rule__TransportationComponent__Group__8__Impl"
    // InternalScml.g:5237:1: rule__TransportationComponent__Group__8__Impl : ( 'parameter' ) ;
    public final void rule__TransportationComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5241:1: ( ( 'parameter' ) )
            // InternalScml.g:5242:1: ( 'parameter' )
            {
            // InternalScml.g:5242:1: ( 'parameter' )
            // InternalScml.g:5243:2: 'parameter'
            {
             before(grammarAccess.getTransportationComponentAccess().getParameterKeyword_8()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getParameterKeyword_8()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__8__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__9"
    // InternalScml.g:5252:1: rule__TransportationComponent__Group__9 : rule__TransportationComponent__Group__9__Impl rule__TransportationComponent__Group__10 ;
    public final void rule__TransportationComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5256:1: ( rule__TransportationComponent__Group__9__Impl rule__TransportationComponent__Group__10 )
            // InternalScml.g:5257:2: rule__TransportationComponent__Group__9__Impl rule__TransportationComponent__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__TransportationComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__10();

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
    // $ANTLR end "rule__TransportationComponent__Group__9"


    // $ANTLR start "rule__TransportationComponent__Group__9__Impl"
    // InternalScml.g:5264:1: rule__TransportationComponent__Group__9__Impl : ( ( rule__TransportationComponent__ParameterAssignment_9 ) ) ;
    public final void rule__TransportationComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5268:1: ( ( ( rule__TransportationComponent__ParameterAssignment_9 ) ) )
            // InternalScml.g:5269:1: ( ( rule__TransportationComponent__ParameterAssignment_9 ) )
            {
            // InternalScml.g:5269:1: ( ( rule__TransportationComponent__ParameterAssignment_9 ) )
            // InternalScml.g:5270:2: ( rule__TransportationComponent__ParameterAssignment_9 )
            {
             before(grammarAccess.getTransportationComponentAccess().getParameterAssignment_9()); 
            // InternalScml.g:5271:2: ( rule__TransportationComponent__ParameterAssignment_9 )
            // InternalScml.g:5271:3: rule__TransportationComponent__ParameterAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__ParameterAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getParameterAssignment_9()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__9__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__10"
    // InternalScml.g:5279:1: rule__TransportationComponent__Group__10 : rule__TransportationComponent__Group__10__Impl rule__TransportationComponent__Group__11 ;
    public final void rule__TransportationComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5283:1: ( rule__TransportationComponent__Group__10__Impl rule__TransportationComponent__Group__11 )
            // InternalScml.g:5284:2: rule__TransportationComponent__Group__10__Impl rule__TransportationComponent__Group__11
            {
            pushFollow(FOLLOW_43);
            rule__TransportationComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__11();

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
    // $ANTLR end "rule__TransportationComponent__Group__10"


    // $ANTLR start "rule__TransportationComponent__Group__10__Impl"
    // InternalScml.g:5291:1: rule__TransportationComponent__Group__10__Impl : ( ( rule__TransportationComponent__Group_10__0 )? ) ;
    public final void rule__TransportationComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5295:1: ( ( ( rule__TransportationComponent__Group_10__0 )? ) )
            // InternalScml.g:5296:1: ( ( rule__TransportationComponent__Group_10__0 )? )
            {
            // InternalScml.g:5296:1: ( ( rule__TransportationComponent__Group_10__0 )? )
            // InternalScml.g:5297:2: ( rule__TransportationComponent__Group_10__0 )?
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_10()); 
            // InternalScml.g:5298:2: ( rule__TransportationComponent__Group_10__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==72) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalScml.g:5298:3: rule__TransportationComponent__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportationComponent__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportationComponentAccess().getGroup_10()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__10__Impl"


    // $ANTLR start "rule__TransportationComponent__Group__11"
    // InternalScml.g:5306:1: rule__TransportationComponent__Group__11 : rule__TransportationComponent__Group__11__Impl ;
    public final void rule__TransportationComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5310:1: ( rule__TransportationComponent__Group__11__Impl )
            // InternalScml.g:5311:2: rule__TransportationComponent__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group__11__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group__11"


    // $ANTLR start "rule__TransportationComponent__Group__11__Impl"
    // InternalScml.g:5317:1: rule__TransportationComponent__Group__11__Impl : ( '}' ) ;
    public final void rule__TransportationComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5321:1: ( ( '}' ) )
            // InternalScml.g:5322:1: ( '}' )
            {
            // InternalScml.g:5322:1: ( '}' )
            // InternalScml.g:5323:2: '}'
            {
             before(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__TransportationComponent__Group__11__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_3__0"
    // InternalScml.g:5333:1: rule__TransportationComponent__Group_3__0 : rule__TransportationComponent__Group_3__0__Impl rule__TransportationComponent__Group_3__1 ;
    public final void rule__TransportationComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5337:1: ( rule__TransportationComponent__Group_3__0__Impl rule__TransportationComponent__Group_3__1 )
            // InternalScml.g:5338:2: rule__TransportationComponent__Group_3__0__Impl rule__TransportationComponent__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportationComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_3__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_3__0"


    // $ANTLR start "rule__TransportationComponent__Group_3__0__Impl"
    // InternalScml.g:5345:1: rule__TransportationComponent__Group_3__0__Impl : ( 'isPartOf' ) ;
    public final void rule__TransportationComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5349:1: ( ( 'isPartOf' ) )
            // InternalScml.g:5350:1: ( 'isPartOf' )
            {
            // InternalScml.g:5350:1: ( 'isPartOf' )
            // InternalScml.g:5351:2: 'isPartOf'
            {
             before(grammarAccess.getTransportationComponentAccess().getIsPartOfKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getIsPartOfKeyword_3_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_3__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_3__1"
    // InternalScml.g:5360:1: rule__TransportationComponent__Group_3__1 : rule__TransportationComponent__Group_3__1__Impl ;
    public final void rule__TransportationComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5364:1: ( rule__TransportationComponent__Group_3__1__Impl )
            // InternalScml.g:5365:2: rule__TransportationComponent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_3__1__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_3__1"


    // $ANTLR start "rule__TransportationComponent__Group_3__1__Impl"
    // InternalScml.g:5371:1: rule__TransportationComponent__Group_3__1__Impl : ( ( rule__TransportationComponent__IsPartOfAssignment_3_1 ) ) ;
    public final void rule__TransportationComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5375:1: ( ( ( rule__TransportationComponent__IsPartOfAssignment_3_1 ) ) )
            // InternalScml.g:5376:1: ( ( rule__TransportationComponent__IsPartOfAssignment_3_1 ) )
            {
            // InternalScml.g:5376:1: ( ( rule__TransportationComponent__IsPartOfAssignment_3_1 ) )
            // InternalScml.g:5377:2: ( rule__TransportationComponent__IsPartOfAssignment_3_1 )
            {
             before(grammarAccess.getTransportationComponentAccess().getIsPartOfAssignment_3_1()); 
            // InternalScml.g:5378:2: ( rule__TransportationComponent__IsPartOfAssignment_3_1 )
            // InternalScml.g:5378:3: rule__TransportationComponent__IsPartOfAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__IsPartOfAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getIsPartOfAssignment_3_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_3__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4__0"
    // InternalScml.g:5387:1: rule__TransportationComponent__Group_4__0 : rule__TransportationComponent__Group_4__0__Impl rule__TransportationComponent__Group_4__1 ;
    public final void rule__TransportationComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5391:1: ( rule__TransportationComponent__Group_4__0__Impl rule__TransportationComponent__Group_4__1 )
            // InternalScml.g:5392:2: rule__TransportationComponent__Group_4__0__Impl rule__TransportationComponent__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__TransportationComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_4__0"


    // $ANTLR start "rule__TransportationComponent__Group_4__0__Impl"
    // InternalScml.g:5399:1: rule__TransportationComponent__Group_4__0__Impl : ( 'composedOf' ) ;
    public final void rule__TransportationComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5403:1: ( ( 'composedOf' ) )
            // InternalScml.g:5404:1: ( 'composedOf' )
            {
            // InternalScml.g:5404:1: ( 'composedOf' )
            // InternalScml.g:5405:2: 'composedOf'
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getComposedOfKeyword_4_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4__1"
    // InternalScml.g:5414:1: rule__TransportationComponent__Group_4__1 : rule__TransportationComponent__Group_4__1__Impl rule__TransportationComponent__Group_4__2 ;
    public final void rule__TransportationComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5418:1: ( rule__TransportationComponent__Group_4__1__Impl rule__TransportationComponent__Group_4__2 )
            // InternalScml.g:5419:2: rule__TransportationComponent__Group_4__1__Impl rule__TransportationComponent__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__TransportationComponent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4__2();

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
    // $ANTLR end "rule__TransportationComponent__Group_4__1"


    // $ANTLR start "rule__TransportationComponent__Group_4__1__Impl"
    // InternalScml.g:5426:1: rule__TransportationComponent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__TransportationComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5430:1: ( ( '(' ) )
            // InternalScml.g:5431:1: ( '(' )
            {
            // InternalScml.g:5431:1: ( '(' )
            // InternalScml.g:5432:2: '('
            {
             before(grammarAccess.getTransportationComponentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4__2"
    // InternalScml.g:5441:1: rule__TransportationComponent__Group_4__2 : rule__TransportationComponent__Group_4__2__Impl rule__TransportationComponent__Group_4__3 ;
    public final void rule__TransportationComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5445:1: ( rule__TransportationComponent__Group_4__2__Impl rule__TransportationComponent__Group_4__3 )
            // InternalScml.g:5446:2: rule__TransportationComponent__Group_4__2__Impl rule__TransportationComponent__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__TransportationComponent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4__3();

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
    // $ANTLR end "rule__TransportationComponent__Group_4__2"


    // $ANTLR start "rule__TransportationComponent__Group_4__2__Impl"
    // InternalScml.g:5453:1: rule__TransportationComponent__Group_4__2__Impl : ( ( rule__TransportationComponent__ComposedOfAssignment_4_2 ) ) ;
    public final void rule__TransportationComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5457:1: ( ( ( rule__TransportationComponent__ComposedOfAssignment_4_2 ) ) )
            // InternalScml.g:5458:1: ( ( rule__TransportationComponent__ComposedOfAssignment_4_2 ) )
            {
            // InternalScml.g:5458:1: ( ( rule__TransportationComponent__ComposedOfAssignment_4_2 ) )
            // InternalScml.g:5459:2: ( rule__TransportationComponent__ComposedOfAssignment_4_2 )
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfAssignment_4_2()); 
            // InternalScml.g:5460:2: ( rule__TransportationComponent__ComposedOfAssignment_4_2 )
            // InternalScml.g:5460:3: rule__TransportationComponent__ComposedOfAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__ComposedOfAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getComposedOfAssignment_4_2()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4__2__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4__3"
    // InternalScml.g:5468:1: rule__TransportationComponent__Group_4__3 : rule__TransportationComponent__Group_4__3__Impl rule__TransportationComponent__Group_4__4 ;
    public final void rule__TransportationComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5472:1: ( rule__TransportationComponent__Group_4__3__Impl rule__TransportationComponent__Group_4__4 )
            // InternalScml.g:5473:2: rule__TransportationComponent__Group_4__3__Impl rule__TransportationComponent__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__TransportationComponent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4__4();

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
    // $ANTLR end "rule__TransportationComponent__Group_4__3"


    // $ANTLR start "rule__TransportationComponent__Group_4__3__Impl"
    // InternalScml.g:5480:1: rule__TransportationComponent__Group_4__3__Impl : ( ( rule__TransportationComponent__Group_4_3__0 )* ) ;
    public final void rule__TransportationComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5484:1: ( ( ( rule__TransportationComponent__Group_4_3__0 )* ) )
            // InternalScml.g:5485:1: ( ( rule__TransportationComponent__Group_4_3__0 )* )
            {
            // InternalScml.g:5485:1: ( ( rule__TransportationComponent__Group_4_3__0 )* )
            // InternalScml.g:5486:2: ( rule__TransportationComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_4_3()); 
            // InternalScml.g:5487:2: ( rule__TransportationComponent__Group_4_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==40) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalScml.g:5487:3: rule__TransportationComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TransportationComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getTransportationComponentAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4__3__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4__4"
    // InternalScml.g:5495:1: rule__TransportationComponent__Group_4__4 : rule__TransportationComponent__Group_4__4__Impl ;
    public final void rule__TransportationComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5499:1: ( rule__TransportationComponent__Group_4__4__Impl )
            // InternalScml.g:5500:2: rule__TransportationComponent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4__4__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_4__4"


    // $ANTLR start "rule__TransportationComponent__Group_4__4__Impl"
    // InternalScml.g:5506:1: rule__TransportationComponent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__TransportationComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5510:1: ( ( ')' ) )
            // InternalScml.g:5511:1: ( ')' )
            {
            // InternalScml.g:5511:1: ( ')' )
            // InternalScml.g:5512:2: ')'
            {
             before(grammarAccess.getTransportationComponentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4__4__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4_3__0"
    // InternalScml.g:5522:1: rule__TransportationComponent__Group_4_3__0 : rule__TransportationComponent__Group_4_3__0__Impl rule__TransportationComponent__Group_4_3__1 ;
    public final void rule__TransportationComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5526:1: ( rule__TransportationComponent__Group_4_3__0__Impl rule__TransportationComponent__Group_4_3__1 )
            // InternalScml.g:5527:2: rule__TransportationComponent__Group_4_3__0__Impl rule__TransportationComponent__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportationComponent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4_3__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_4_3__0"


    // $ANTLR start "rule__TransportationComponent__Group_4_3__0__Impl"
    // InternalScml.g:5534:1: rule__TransportationComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__TransportationComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5538:1: ( ( ',' ) )
            // InternalScml.g:5539:1: ( ',' )
            {
            // InternalScml.g:5539:1: ( ',' )
            // InternalScml.g:5540:2: ','
            {
             before(grammarAccess.getTransportationComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4_3__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_4_3__1"
    // InternalScml.g:5549:1: rule__TransportationComponent__Group_4_3__1 : rule__TransportationComponent__Group_4_3__1__Impl ;
    public final void rule__TransportationComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5553:1: ( rule__TransportationComponent__Group_4_3__1__Impl )
            // InternalScml.g:5554:2: rule__TransportationComponent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_4_3__1"


    // $ANTLR start "rule__TransportationComponent__Group_4_3__1__Impl"
    // InternalScml.g:5560:1: rule__TransportationComponent__Group_4_3__1__Impl : ( ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 ) ) ;
    public final void rule__TransportationComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5564:1: ( ( ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 ) ) )
            // InternalScml.g:5565:1: ( ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 ) )
            {
            // InternalScml.g:5565:1: ( ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 ) )
            // InternalScml.g:5566:2: ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 )
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfAssignment_4_3_1()); 
            // InternalScml.g:5567:2: ( rule__TransportationComponent__ComposedOfAssignment_4_3_1 )
            // InternalScml.g:5567:3: rule__TransportationComponent__ComposedOfAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__ComposedOfAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getComposedOfAssignment_4_3_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_4_3__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7__0"
    // InternalScml.g:5576:1: rule__TransportationComponent__Group_7__0 : rule__TransportationComponent__Group_7__0__Impl rule__TransportationComponent__Group_7__1 ;
    public final void rule__TransportationComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5580:1: ( rule__TransportationComponent__Group_7__0__Impl rule__TransportationComponent__Group_7__1 )
            // InternalScml.g:5581:2: rule__TransportationComponent__Group_7__0__Impl rule__TransportationComponent__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__TransportationComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_7__0"


    // $ANTLR start "rule__TransportationComponent__Group_7__0__Impl"
    // InternalScml.g:5588:1: rule__TransportationComponent__Group_7__0__Impl : ( 'produces' ) ;
    public final void rule__TransportationComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5592:1: ( ( 'produces' ) )
            // InternalScml.g:5593:1: ( 'produces' )
            {
            // InternalScml.g:5593:1: ( 'produces' )
            // InternalScml.g:5594:2: 'produces'
            {
             before(grammarAccess.getTransportationComponentAccess().getProducesKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getProducesKeyword_7_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7__1"
    // InternalScml.g:5603:1: rule__TransportationComponent__Group_7__1 : rule__TransportationComponent__Group_7__1__Impl rule__TransportationComponent__Group_7__2 ;
    public final void rule__TransportationComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5607:1: ( rule__TransportationComponent__Group_7__1__Impl rule__TransportationComponent__Group_7__2 )
            // InternalScml.g:5608:2: rule__TransportationComponent__Group_7__1__Impl rule__TransportationComponent__Group_7__2
            {
            pushFollow(FOLLOW_44);
            rule__TransportationComponent__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7__2();

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
    // $ANTLR end "rule__TransportationComponent__Group_7__1"


    // $ANTLR start "rule__TransportationComponent__Group_7__1__Impl"
    // InternalScml.g:5615:1: rule__TransportationComponent__Group_7__1__Impl : ( '{' ) ;
    public final void rule__TransportationComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5619:1: ( ( '{' ) )
            // InternalScml.g:5620:1: ( '{' )
            {
            // InternalScml.g:5620:1: ( '{' )
            // InternalScml.g:5621:2: '{'
            {
             before(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7__2"
    // InternalScml.g:5630:1: rule__TransportationComponent__Group_7__2 : rule__TransportationComponent__Group_7__2__Impl rule__TransportationComponent__Group_7__3 ;
    public final void rule__TransportationComponent__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5634:1: ( rule__TransportationComponent__Group_7__2__Impl rule__TransportationComponent__Group_7__3 )
            // InternalScml.g:5635:2: rule__TransportationComponent__Group_7__2__Impl rule__TransportationComponent__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__TransportationComponent__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7__3();

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
    // $ANTLR end "rule__TransportationComponent__Group_7__2"


    // $ANTLR start "rule__TransportationComponent__Group_7__2__Impl"
    // InternalScml.g:5642:1: rule__TransportationComponent__Group_7__2__Impl : ( ( rule__TransportationComponent__ProducesAssignment_7_2 ) ) ;
    public final void rule__TransportationComponent__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5646:1: ( ( ( rule__TransportationComponent__ProducesAssignment_7_2 ) ) )
            // InternalScml.g:5647:1: ( ( rule__TransportationComponent__ProducesAssignment_7_2 ) )
            {
            // InternalScml.g:5647:1: ( ( rule__TransportationComponent__ProducesAssignment_7_2 ) )
            // InternalScml.g:5648:2: ( rule__TransportationComponent__ProducesAssignment_7_2 )
            {
             before(grammarAccess.getTransportationComponentAccess().getProducesAssignment_7_2()); 
            // InternalScml.g:5649:2: ( rule__TransportationComponent__ProducesAssignment_7_2 )
            // InternalScml.g:5649:3: rule__TransportationComponent__ProducesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__ProducesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getProducesAssignment_7_2()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7__2__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7__3"
    // InternalScml.g:5657:1: rule__TransportationComponent__Group_7__3 : rule__TransportationComponent__Group_7__3__Impl rule__TransportationComponent__Group_7__4 ;
    public final void rule__TransportationComponent__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5661:1: ( rule__TransportationComponent__Group_7__3__Impl rule__TransportationComponent__Group_7__4 )
            // InternalScml.g:5662:2: rule__TransportationComponent__Group_7__3__Impl rule__TransportationComponent__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__TransportationComponent__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7__4();

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
    // $ANTLR end "rule__TransportationComponent__Group_7__3"


    // $ANTLR start "rule__TransportationComponent__Group_7__3__Impl"
    // InternalScml.g:5669:1: rule__TransportationComponent__Group_7__3__Impl : ( ( rule__TransportationComponent__Group_7_3__0 )* ) ;
    public final void rule__TransportationComponent__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5673:1: ( ( ( rule__TransportationComponent__Group_7_3__0 )* ) )
            // InternalScml.g:5674:1: ( ( rule__TransportationComponent__Group_7_3__0 )* )
            {
            // InternalScml.g:5674:1: ( ( rule__TransportationComponent__Group_7_3__0 )* )
            // InternalScml.g:5675:2: ( rule__TransportationComponent__Group_7_3__0 )*
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_7_3()); 
            // InternalScml.g:5676:2: ( rule__TransportationComponent__Group_7_3__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalScml.g:5676:3: rule__TransportationComponent__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TransportationComponent__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getTransportationComponentAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7__3__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7__4"
    // InternalScml.g:5684:1: rule__TransportationComponent__Group_7__4 : rule__TransportationComponent__Group_7__4__Impl ;
    public final void rule__TransportationComponent__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5688:1: ( rule__TransportationComponent__Group_7__4__Impl )
            // InternalScml.g:5689:2: rule__TransportationComponent__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7__4__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_7__4"


    // $ANTLR start "rule__TransportationComponent__Group_7__4__Impl"
    // InternalScml.g:5695:1: rule__TransportationComponent__Group_7__4__Impl : ( '}' ) ;
    public final void rule__TransportationComponent__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5699:1: ( ( '}' ) )
            // InternalScml.g:5700:1: ( '}' )
            {
            // InternalScml.g:5700:1: ( '}' )
            // InternalScml.g:5701:2: '}'
            {
             before(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7__4__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7_3__0"
    // InternalScml.g:5711:1: rule__TransportationComponent__Group_7_3__0 : rule__TransportationComponent__Group_7_3__0__Impl rule__TransportationComponent__Group_7_3__1 ;
    public final void rule__TransportationComponent__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5715:1: ( rule__TransportationComponent__Group_7_3__0__Impl rule__TransportationComponent__Group_7_3__1 )
            // InternalScml.g:5716:2: rule__TransportationComponent__Group_7_3__0__Impl rule__TransportationComponent__Group_7_3__1
            {
            pushFollow(FOLLOW_44);
            rule__TransportationComponent__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7_3__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_7_3__0"


    // $ANTLR start "rule__TransportationComponent__Group_7_3__0__Impl"
    // InternalScml.g:5723:1: rule__TransportationComponent__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__TransportationComponent__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5727:1: ( ( ',' ) )
            // InternalScml.g:5728:1: ( ',' )
            {
            // InternalScml.g:5728:1: ( ',' )
            // InternalScml.g:5729:2: ','
            {
             before(grammarAccess.getTransportationComponentAccess().getCommaKeyword_7_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7_3__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_7_3__1"
    // InternalScml.g:5738:1: rule__TransportationComponent__Group_7_3__1 : rule__TransportationComponent__Group_7_3__1__Impl ;
    public final void rule__TransportationComponent__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5742:1: ( rule__TransportationComponent__Group_7_3__1__Impl )
            // InternalScml.g:5743:2: rule__TransportationComponent__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_7_3__1"


    // $ANTLR start "rule__TransportationComponent__Group_7_3__1__Impl"
    // InternalScml.g:5749:1: rule__TransportationComponent__Group_7_3__1__Impl : ( ( rule__TransportationComponent__ProducesAssignment_7_3_1 ) ) ;
    public final void rule__TransportationComponent__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5753:1: ( ( ( rule__TransportationComponent__ProducesAssignment_7_3_1 ) ) )
            // InternalScml.g:5754:1: ( ( rule__TransportationComponent__ProducesAssignment_7_3_1 ) )
            {
            // InternalScml.g:5754:1: ( ( rule__TransportationComponent__ProducesAssignment_7_3_1 ) )
            // InternalScml.g:5755:2: ( rule__TransportationComponent__ProducesAssignment_7_3_1 )
            {
             before(grammarAccess.getTransportationComponentAccess().getProducesAssignment_7_3_1()); 
            // InternalScml.g:5756:2: ( rule__TransportationComponent__ProducesAssignment_7_3_1 )
            // InternalScml.g:5756:3: rule__TransportationComponent__ProducesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__ProducesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getProducesAssignment_7_3_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_7_3__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10__0"
    // InternalScml.g:5765:1: rule__TransportationComponent__Group_10__0 : rule__TransportationComponent__Group_10__0__Impl rule__TransportationComponent__Group_10__1 ;
    public final void rule__TransportationComponent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5769:1: ( rule__TransportationComponent__Group_10__0__Impl rule__TransportationComponent__Group_10__1 )
            // InternalScml.g:5770:2: rule__TransportationComponent__Group_10__0__Impl rule__TransportationComponent__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__TransportationComponent__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_10__0"


    // $ANTLR start "rule__TransportationComponent__Group_10__0__Impl"
    // InternalScml.g:5777:1: rule__TransportationComponent__Group_10__0__Impl : ( 'device' ) ;
    public final void rule__TransportationComponent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5781:1: ( ( 'device' ) )
            // InternalScml.g:5782:1: ( 'device' )
            {
            // InternalScml.g:5782:1: ( 'device' )
            // InternalScml.g:5783:2: 'device'
            {
             before(grammarAccess.getTransportationComponentAccess().getDeviceKeyword_10_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getDeviceKeyword_10_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10__1"
    // InternalScml.g:5792:1: rule__TransportationComponent__Group_10__1 : rule__TransportationComponent__Group_10__1__Impl rule__TransportationComponent__Group_10__2 ;
    public final void rule__TransportationComponent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5796:1: ( rule__TransportationComponent__Group_10__1__Impl rule__TransportationComponent__Group_10__2 )
            // InternalScml.g:5797:2: rule__TransportationComponent__Group_10__1__Impl rule__TransportationComponent__Group_10__2
            {
            pushFollow(FOLLOW_45);
            rule__TransportationComponent__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10__2();

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
    // $ANTLR end "rule__TransportationComponent__Group_10__1"


    // $ANTLR start "rule__TransportationComponent__Group_10__1__Impl"
    // InternalScml.g:5804:1: rule__TransportationComponent__Group_10__1__Impl : ( '{' ) ;
    public final void rule__TransportationComponent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5808:1: ( ( '{' ) )
            // InternalScml.g:5809:1: ( '{' )
            {
            // InternalScml.g:5809:1: ( '{' )
            // InternalScml.g:5810:2: '{'
            {
             before(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10__1__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10__2"
    // InternalScml.g:5819:1: rule__TransportationComponent__Group_10__2 : rule__TransportationComponent__Group_10__2__Impl rule__TransportationComponent__Group_10__3 ;
    public final void rule__TransportationComponent__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5823:1: ( rule__TransportationComponent__Group_10__2__Impl rule__TransportationComponent__Group_10__3 )
            // InternalScml.g:5824:2: rule__TransportationComponent__Group_10__2__Impl rule__TransportationComponent__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__TransportationComponent__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10__3();

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
    // $ANTLR end "rule__TransportationComponent__Group_10__2"


    // $ANTLR start "rule__TransportationComponent__Group_10__2__Impl"
    // InternalScml.g:5831:1: rule__TransportationComponent__Group_10__2__Impl : ( ( rule__TransportationComponent__DeviceAssignment_10_2 ) ) ;
    public final void rule__TransportationComponent__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5835:1: ( ( ( rule__TransportationComponent__DeviceAssignment_10_2 ) ) )
            // InternalScml.g:5836:1: ( ( rule__TransportationComponent__DeviceAssignment_10_2 ) )
            {
            // InternalScml.g:5836:1: ( ( rule__TransportationComponent__DeviceAssignment_10_2 ) )
            // InternalScml.g:5837:2: ( rule__TransportationComponent__DeviceAssignment_10_2 )
            {
             before(grammarAccess.getTransportationComponentAccess().getDeviceAssignment_10_2()); 
            // InternalScml.g:5838:2: ( rule__TransportationComponent__DeviceAssignment_10_2 )
            // InternalScml.g:5838:3: rule__TransportationComponent__DeviceAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__DeviceAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getDeviceAssignment_10_2()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10__2__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10__3"
    // InternalScml.g:5846:1: rule__TransportationComponent__Group_10__3 : rule__TransportationComponent__Group_10__3__Impl rule__TransportationComponent__Group_10__4 ;
    public final void rule__TransportationComponent__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5850:1: ( rule__TransportationComponent__Group_10__3__Impl rule__TransportationComponent__Group_10__4 )
            // InternalScml.g:5851:2: rule__TransportationComponent__Group_10__3__Impl rule__TransportationComponent__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__TransportationComponent__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10__4();

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
    // $ANTLR end "rule__TransportationComponent__Group_10__3"


    // $ANTLR start "rule__TransportationComponent__Group_10__3__Impl"
    // InternalScml.g:5858:1: rule__TransportationComponent__Group_10__3__Impl : ( ( rule__TransportationComponent__Group_10_3__0 )* ) ;
    public final void rule__TransportationComponent__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5862:1: ( ( ( rule__TransportationComponent__Group_10_3__0 )* ) )
            // InternalScml.g:5863:1: ( ( rule__TransportationComponent__Group_10_3__0 )* )
            {
            // InternalScml.g:5863:1: ( ( rule__TransportationComponent__Group_10_3__0 )* )
            // InternalScml.g:5864:2: ( rule__TransportationComponent__Group_10_3__0 )*
            {
             before(grammarAccess.getTransportationComponentAccess().getGroup_10_3()); 
            // InternalScml.g:5865:2: ( rule__TransportationComponent__Group_10_3__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalScml.g:5865:3: rule__TransportationComponent__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TransportationComponent__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getTransportationComponentAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10__3__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10__4"
    // InternalScml.g:5873:1: rule__TransportationComponent__Group_10__4 : rule__TransportationComponent__Group_10__4__Impl ;
    public final void rule__TransportationComponent__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5877:1: ( rule__TransportationComponent__Group_10__4__Impl )
            // InternalScml.g:5878:2: rule__TransportationComponent__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10__4__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_10__4"


    // $ANTLR start "rule__TransportationComponent__Group_10__4__Impl"
    // InternalScml.g:5884:1: rule__TransportationComponent__Group_10__4__Impl : ( '}' ) ;
    public final void rule__TransportationComponent__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5888:1: ( ( '}' ) )
            // InternalScml.g:5889:1: ( '}' )
            {
            // InternalScml.g:5889:1: ( '}' )
            // InternalScml.g:5890:2: '}'
            {
             before(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10__4__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10_3__0"
    // InternalScml.g:5900:1: rule__TransportationComponent__Group_10_3__0 : rule__TransportationComponent__Group_10_3__0__Impl rule__TransportationComponent__Group_10_3__1 ;
    public final void rule__TransportationComponent__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5904:1: ( rule__TransportationComponent__Group_10_3__0__Impl rule__TransportationComponent__Group_10_3__1 )
            // InternalScml.g:5905:2: rule__TransportationComponent__Group_10_3__0__Impl rule__TransportationComponent__Group_10_3__1
            {
            pushFollow(FOLLOW_45);
            rule__TransportationComponent__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10_3__1();

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
    // $ANTLR end "rule__TransportationComponent__Group_10_3__0"


    // $ANTLR start "rule__TransportationComponent__Group_10_3__0__Impl"
    // InternalScml.g:5912:1: rule__TransportationComponent__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__TransportationComponent__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5916:1: ( ( ',' ) )
            // InternalScml.g:5917:1: ( ',' )
            {
            // InternalScml.g:5917:1: ( ',' )
            // InternalScml.g:5918:2: ','
            {
             before(grammarAccess.getTransportationComponentAccess().getCommaKeyword_10_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransportationComponentAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10_3__0__Impl"


    // $ANTLR start "rule__TransportationComponent__Group_10_3__1"
    // InternalScml.g:5927:1: rule__TransportationComponent__Group_10_3__1 : rule__TransportationComponent__Group_10_3__1__Impl ;
    public final void rule__TransportationComponent__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5931:1: ( rule__TransportationComponent__Group_10_3__1__Impl )
            // InternalScml.g:5932:2: rule__TransportationComponent__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__TransportationComponent__Group_10_3__1"


    // $ANTLR start "rule__TransportationComponent__Group_10_3__1__Impl"
    // InternalScml.g:5938:1: rule__TransportationComponent__Group_10_3__1__Impl : ( ( rule__TransportationComponent__DeviceAssignment_10_3_1 ) ) ;
    public final void rule__TransportationComponent__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5942:1: ( ( ( rule__TransportationComponent__DeviceAssignment_10_3_1 ) ) )
            // InternalScml.g:5943:1: ( ( rule__TransportationComponent__DeviceAssignment_10_3_1 ) )
            {
            // InternalScml.g:5943:1: ( ( rule__TransportationComponent__DeviceAssignment_10_3_1 ) )
            // InternalScml.g:5944:2: ( rule__TransportationComponent__DeviceAssignment_10_3_1 )
            {
             before(grammarAccess.getTransportationComponentAccess().getDeviceAssignment_10_3_1()); 
            // InternalScml.g:5945:2: ( rule__TransportationComponent__DeviceAssignment_10_3_1 )
            // InternalScml.g:5945:3: rule__TransportationComponent__DeviceAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportationComponent__DeviceAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportationComponentAccess().getDeviceAssignment_10_3_1()); 

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
    // $ANTLR end "rule__TransportationComponent__Group_10_3__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__0"
    // InternalScml.g:5954:1: rule__EnvironmentalComponent__Group__0 : rule__EnvironmentalComponent__Group__0__Impl rule__EnvironmentalComponent__Group__1 ;
    public final void rule__EnvironmentalComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5958:1: ( rule__EnvironmentalComponent__Group__0__Impl rule__EnvironmentalComponent__Group__1 )
            // InternalScml.g:5959:2: rule__EnvironmentalComponent__Group__0__Impl rule__EnvironmentalComponent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EnvironmentalComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group__0__Impl"
    // InternalScml.g:5966:1: rule__EnvironmentalComponent__Group__0__Impl : ( 'EnvironmentalComponent' ) ;
    public final void rule__EnvironmentalComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5970:1: ( ( 'EnvironmentalComponent' ) )
            // InternalScml.g:5971:1: ( 'EnvironmentalComponent' )
            {
            // InternalScml.g:5971:1: ( 'EnvironmentalComponent' )
            // InternalScml.g:5972:2: 'EnvironmentalComponent'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getEnvironmentalComponentKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getEnvironmentalComponentKeyword_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__1"
    // InternalScml.g:5981:1: rule__EnvironmentalComponent__Group__1 : rule__EnvironmentalComponent__Group__1__Impl rule__EnvironmentalComponent__Group__2 ;
    public final void rule__EnvironmentalComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5985:1: ( rule__EnvironmentalComponent__Group__1__Impl rule__EnvironmentalComponent__Group__2 )
            // InternalScml.g:5986:2: rule__EnvironmentalComponent__Group__1__Impl rule__EnvironmentalComponent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__EnvironmentalComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__2();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group__1__Impl"
    // InternalScml.g:5993:1: rule__EnvironmentalComponent__Group__1__Impl : ( ( rule__EnvironmentalComponent__NameAssignment_1 ) ) ;
    public final void rule__EnvironmentalComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:5997:1: ( ( ( rule__EnvironmentalComponent__NameAssignment_1 ) ) )
            // InternalScml.g:5998:1: ( ( rule__EnvironmentalComponent__NameAssignment_1 ) )
            {
            // InternalScml.g:5998:1: ( ( rule__EnvironmentalComponent__NameAssignment_1 ) )
            // InternalScml.g:5999:2: ( rule__EnvironmentalComponent__NameAssignment_1 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getNameAssignment_1()); 
            // InternalScml.g:6000:2: ( rule__EnvironmentalComponent__NameAssignment_1 )
            // InternalScml.g:6000:3: rule__EnvironmentalComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__2"
    // InternalScml.g:6008:1: rule__EnvironmentalComponent__Group__2 : rule__EnvironmentalComponent__Group__2__Impl rule__EnvironmentalComponent__Group__3 ;
    public final void rule__EnvironmentalComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6012:1: ( rule__EnvironmentalComponent__Group__2__Impl rule__EnvironmentalComponent__Group__3 )
            // InternalScml.g:6013:2: rule__EnvironmentalComponent__Group__2__Impl rule__EnvironmentalComponent__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__EnvironmentalComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__3();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__2"


    // $ANTLR start "rule__EnvironmentalComponent__Group__2__Impl"
    // InternalScml.g:6020:1: rule__EnvironmentalComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__EnvironmentalComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6024:1: ( ( '{' ) )
            // InternalScml.g:6025:1: ( '{' )
            {
            // InternalScml.g:6025:1: ( '{' )
            // InternalScml.g:6026:2: '{'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__2__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__3"
    // InternalScml.g:6035:1: rule__EnvironmentalComponent__Group__3 : rule__EnvironmentalComponent__Group__3__Impl rule__EnvironmentalComponent__Group__4 ;
    public final void rule__EnvironmentalComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6039:1: ( rule__EnvironmentalComponent__Group__3__Impl rule__EnvironmentalComponent__Group__4 )
            // InternalScml.g:6040:2: rule__EnvironmentalComponent__Group__3__Impl rule__EnvironmentalComponent__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__EnvironmentalComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__4();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__3"


    // $ANTLR start "rule__EnvironmentalComponent__Group__3__Impl"
    // InternalScml.g:6047:1: rule__EnvironmentalComponent__Group__3__Impl : ( ( rule__EnvironmentalComponent__Group_3__0 )? ) ;
    public final void rule__EnvironmentalComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6051:1: ( ( ( rule__EnvironmentalComponent__Group_3__0 )? ) )
            // InternalScml.g:6052:1: ( ( rule__EnvironmentalComponent__Group_3__0 )? )
            {
            // InternalScml.g:6052:1: ( ( rule__EnvironmentalComponent__Group_3__0 )? )
            // InternalScml.g:6053:2: ( rule__EnvironmentalComponent__Group_3__0 )?
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_3()); 
            // InternalScml.g:6054:2: ( rule__EnvironmentalComponent__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==69) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalScml.g:6054:3: rule__EnvironmentalComponent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvironmentalComponent__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__3__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__4"
    // InternalScml.g:6062:1: rule__EnvironmentalComponent__Group__4 : rule__EnvironmentalComponent__Group__4__Impl rule__EnvironmentalComponent__Group__5 ;
    public final void rule__EnvironmentalComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6066:1: ( rule__EnvironmentalComponent__Group__4__Impl rule__EnvironmentalComponent__Group__5 )
            // InternalScml.g:6067:2: rule__EnvironmentalComponent__Group__4__Impl rule__EnvironmentalComponent__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__EnvironmentalComponent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__5();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__4"


    // $ANTLR start "rule__EnvironmentalComponent__Group__4__Impl"
    // InternalScml.g:6074:1: rule__EnvironmentalComponent__Group__4__Impl : ( ( rule__EnvironmentalComponent__Group_4__0 )? ) ;
    public final void rule__EnvironmentalComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6078:1: ( ( ( rule__EnvironmentalComponent__Group_4__0 )? ) )
            // InternalScml.g:6079:1: ( ( rule__EnvironmentalComponent__Group_4__0 )? )
            {
            // InternalScml.g:6079:1: ( ( rule__EnvironmentalComponent__Group_4__0 )? )
            // InternalScml.g:6080:2: ( rule__EnvironmentalComponent__Group_4__0 )?
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_4()); 
            // InternalScml.g:6081:2: ( rule__EnvironmentalComponent__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==70) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalScml.g:6081:3: rule__EnvironmentalComponent__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvironmentalComponent__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__4__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__5"
    // InternalScml.g:6089:1: rule__EnvironmentalComponent__Group__5 : rule__EnvironmentalComponent__Group__5__Impl rule__EnvironmentalComponent__Group__6 ;
    public final void rule__EnvironmentalComponent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6093:1: ( rule__EnvironmentalComponent__Group__5__Impl rule__EnvironmentalComponent__Group__6 )
            // InternalScml.g:6094:2: rule__EnvironmentalComponent__Group__5__Impl rule__EnvironmentalComponent__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__EnvironmentalComponent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__6();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__5"


    // $ANTLR start "rule__EnvironmentalComponent__Group__5__Impl"
    // InternalScml.g:6101:1: rule__EnvironmentalComponent__Group__5__Impl : ( 'location' ) ;
    public final void rule__EnvironmentalComponent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6105:1: ( ( 'location' ) )
            // InternalScml.g:6106:1: ( 'location' )
            {
            // InternalScml.g:6106:1: ( 'location' )
            // InternalScml.g:6107:2: 'location'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLocationKeyword_5()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getLocationKeyword_5()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__5__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__6"
    // InternalScml.g:6116:1: rule__EnvironmentalComponent__Group__6 : rule__EnvironmentalComponent__Group__6__Impl rule__EnvironmentalComponent__Group__7 ;
    public final void rule__EnvironmentalComponent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6120:1: ( rule__EnvironmentalComponent__Group__6__Impl rule__EnvironmentalComponent__Group__7 )
            // InternalScml.g:6121:2: rule__EnvironmentalComponent__Group__6__Impl rule__EnvironmentalComponent__Group__7
            {
            pushFollow(FOLLOW_41);
            rule__EnvironmentalComponent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__7();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__6"


    // $ANTLR start "rule__EnvironmentalComponent__Group__6__Impl"
    // InternalScml.g:6128:1: rule__EnvironmentalComponent__Group__6__Impl : ( ( rule__EnvironmentalComponent__LocationAssignment_6 ) ) ;
    public final void rule__EnvironmentalComponent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6132:1: ( ( ( rule__EnvironmentalComponent__LocationAssignment_6 ) ) )
            // InternalScml.g:6133:1: ( ( rule__EnvironmentalComponent__LocationAssignment_6 ) )
            {
            // InternalScml.g:6133:1: ( ( rule__EnvironmentalComponent__LocationAssignment_6 ) )
            // InternalScml.g:6134:2: ( rule__EnvironmentalComponent__LocationAssignment_6 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLocationAssignment_6()); 
            // InternalScml.g:6135:2: ( rule__EnvironmentalComponent__LocationAssignment_6 )
            // InternalScml.g:6135:3: rule__EnvironmentalComponent__LocationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__LocationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getLocationAssignment_6()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__6__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__7"
    // InternalScml.g:6143:1: rule__EnvironmentalComponent__Group__7 : rule__EnvironmentalComponent__Group__7__Impl rule__EnvironmentalComponent__Group__8 ;
    public final void rule__EnvironmentalComponent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6147:1: ( rule__EnvironmentalComponent__Group__7__Impl rule__EnvironmentalComponent__Group__8 )
            // InternalScml.g:6148:2: rule__EnvironmentalComponent__Group__7__Impl rule__EnvironmentalComponent__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__EnvironmentalComponent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__8();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__7"


    // $ANTLR start "rule__EnvironmentalComponent__Group__7__Impl"
    // InternalScml.g:6155:1: rule__EnvironmentalComponent__Group__7__Impl : ( ( rule__EnvironmentalComponent__Group_7__0 )? ) ;
    public final void rule__EnvironmentalComponent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6159:1: ( ( ( rule__EnvironmentalComponent__Group_7__0 )? ) )
            // InternalScml.g:6160:1: ( ( rule__EnvironmentalComponent__Group_7__0 )? )
            {
            // InternalScml.g:6160:1: ( ( rule__EnvironmentalComponent__Group_7__0 )? )
            // InternalScml.g:6161:2: ( rule__EnvironmentalComponent__Group_7__0 )?
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_7()); 
            // InternalScml.g:6162:2: ( rule__EnvironmentalComponent__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==71) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalScml.g:6162:3: rule__EnvironmentalComponent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvironmentalComponent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_7()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__7__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__8"
    // InternalScml.g:6170:1: rule__EnvironmentalComponent__Group__8 : rule__EnvironmentalComponent__Group__8__Impl rule__EnvironmentalComponent__Group__9 ;
    public final void rule__EnvironmentalComponent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6174:1: ( rule__EnvironmentalComponent__Group__8__Impl rule__EnvironmentalComponent__Group__9 )
            // InternalScml.g:6175:2: rule__EnvironmentalComponent__Group__8__Impl rule__EnvironmentalComponent__Group__9
            {
            pushFollow(FOLLOW_42);
            rule__EnvironmentalComponent__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__9();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__8"


    // $ANTLR start "rule__EnvironmentalComponent__Group__8__Impl"
    // InternalScml.g:6182:1: rule__EnvironmentalComponent__Group__8__Impl : ( 'parameter' ) ;
    public final void rule__EnvironmentalComponent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6186:1: ( ( 'parameter' ) )
            // InternalScml.g:6187:1: ( 'parameter' )
            {
            // InternalScml.g:6187:1: ( 'parameter' )
            // InternalScml.g:6188:2: 'parameter'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getParameterKeyword_8()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getParameterKeyword_8()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__8__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__9"
    // InternalScml.g:6197:1: rule__EnvironmentalComponent__Group__9 : rule__EnvironmentalComponent__Group__9__Impl rule__EnvironmentalComponent__Group__10 ;
    public final void rule__EnvironmentalComponent__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6201:1: ( rule__EnvironmentalComponent__Group__9__Impl rule__EnvironmentalComponent__Group__10 )
            // InternalScml.g:6202:2: rule__EnvironmentalComponent__Group__9__Impl rule__EnvironmentalComponent__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__EnvironmentalComponent__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__10();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__9"


    // $ANTLR start "rule__EnvironmentalComponent__Group__9__Impl"
    // InternalScml.g:6209:1: rule__EnvironmentalComponent__Group__9__Impl : ( ( rule__EnvironmentalComponent__ParameterAssignment_9 ) ) ;
    public final void rule__EnvironmentalComponent__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6213:1: ( ( ( rule__EnvironmentalComponent__ParameterAssignment_9 ) ) )
            // InternalScml.g:6214:1: ( ( rule__EnvironmentalComponent__ParameterAssignment_9 ) )
            {
            // InternalScml.g:6214:1: ( ( rule__EnvironmentalComponent__ParameterAssignment_9 ) )
            // InternalScml.g:6215:2: ( rule__EnvironmentalComponent__ParameterAssignment_9 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getParameterAssignment_9()); 
            // InternalScml.g:6216:2: ( rule__EnvironmentalComponent__ParameterAssignment_9 )
            // InternalScml.g:6216:3: rule__EnvironmentalComponent__ParameterAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__ParameterAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getParameterAssignment_9()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__9__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__10"
    // InternalScml.g:6224:1: rule__EnvironmentalComponent__Group__10 : rule__EnvironmentalComponent__Group__10__Impl rule__EnvironmentalComponent__Group__11 ;
    public final void rule__EnvironmentalComponent__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6228:1: ( rule__EnvironmentalComponent__Group__10__Impl rule__EnvironmentalComponent__Group__11 )
            // InternalScml.g:6229:2: rule__EnvironmentalComponent__Group__10__Impl rule__EnvironmentalComponent__Group__11
            {
            pushFollow(FOLLOW_43);
            rule__EnvironmentalComponent__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__11();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__10"


    // $ANTLR start "rule__EnvironmentalComponent__Group__10__Impl"
    // InternalScml.g:6236:1: rule__EnvironmentalComponent__Group__10__Impl : ( ( rule__EnvironmentalComponent__Group_10__0 )? ) ;
    public final void rule__EnvironmentalComponent__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6240:1: ( ( ( rule__EnvironmentalComponent__Group_10__0 )? ) )
            // InternalScml.g:6241:1: ( ( rule__EnvironmentalComponent__Group_10__0 )? )
            {
            // InternalScml.g:6241:1: ( ( rule__EnvironmentalComponent__Group_10__0 )? )
            // InternalScml.g:6242:2: ( rule__EnvironmentalComponent__Group_10__0 )?
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_10()); 
            // InternalScml.g:6243:2: ( rule__EnvironmentalComponent__Group_10__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==72) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalScml.g:6243:3: rule__EnvironmentalComponent__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnvironmentalComponent__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_10()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__10__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group__11"
    // InternalScml.g:6251:1: rule__EnvironmentalComponent__Group__11 : rule__EnvironmentalComponent__Group__11__Impl ;
    public final void rule__EnvironmentalComponent__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6255:1: ( rule__EnvironmentalComponent__Group__11__Impl )
            // InternalScml.g:6256:2: rule__EnvironmentalComponent__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group__11__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__11"


    // $ANTLR start "rule__EnvironmentalComponent__Group__11__Impl"
    // InternalScml.g:6262:1: rule__EnvironmentalComponent__Group__11__Impl : ( '}' ) ;
    public final void rule__EnvironmentalComponent__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6266:1: ( ( '}' ) )
            // InternalScml.g:6267:1: ( '}' )
            {
            // InternalScml.g:6267:1: ( '}' )
            // InternalScml.g:6268:2: '}'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group__11__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_3__0"
    // InternalScml.g:6278:1: rule__EnvironmentalComponent__Group_3__0 : rule__EnvironmentalComponent__Group_3__0__Impl rule__EnvironmentalComponent__Group_3__1 ;
    public final void rule__EnvironmentalComponent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6282:1: ( rule__EnvironmentalComponent__Group_3__0__Impl rule__EnvironmentalComponent__Group_3__1 )
            // InternalScml.g:6283:2: rule__EnvironmentalComponent__Group_3__0__Impl rule__EnvironmentalComponent__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EnvironmentalComponent__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_3__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_3__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_3__0__Impl"
    // InternalScml.g:6290:1: rule__EnvironmentalComponent__Group_3__0__Impl : ( 'isPartOf' ) ;
    public final void rule__EnvironmentalComponent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6294:1: ( ( 'isPartOf' ) )
            // InternalScml.g:6295:1: ( 'isPartOf' )
            {
            // InternalScml.g:6295:1: ( 'isPartOf' )
            // InternalScml.g:6296:2: 'isPartOf'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfKeyword_3_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_3__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_3__1"
    // InternalScml.g:6305:1: rule__EnvironmentalComponent__Group_3__1 : rule__EnvironmentalComponent__Group_3__1__Impl ;
    public final void rule__EnvironmentalComponent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6309:1: ( rule__EnvironmentalComponent__Group_3__1__Impl )
            // InternalScml.g:6310:2: rule__EnvironmentalComponent__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_3__1__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_3__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_3__1__Impl"
    // InternalScml.g:6316:1: rule__EnvironmentalComponent__Group_3__1__Impl : ( ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 ) ) ;
    public final void rule__EnvironmentalComponent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6320:1: ( ( ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 ) ) )
            // InternalScml.g:6321:1: ( ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 ) )
            {
            // InternalScml.g:6321:1: ( ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 ) )
            // InternalScml.g:6322:2: ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfAssignment_3_1()); 
            // InternalScml.g:6323:2: ( rule__EnvironmentalComponent__IsPartOfAssignment_3_1 )
            // InternalScml.g:6323:3: rule__EnvironmentalComponent__IsPartOfAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__IsPartOfAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfAssignment_3_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_3__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__0"
    // InternalScml.g:6332:1: rule__EnvironmentalComponent__Group_4__0 : rule__EnvironmentalComponent__Group_4__0__Impl rule__EnvironmentalComponent__Group_4__1 ;
    public final void rule__EnvironmentalComponent__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6336:1: ( rule__EnvironmentalComponent__Group_4__0__Impl rule__EnvironmentalComponent__Group_4__1 )
            // InternalScml.g:6337:2: rule__EnvironmentalComponent__Group_4__0__Impl rule__EnvironmentalComponent__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__EnvironmentalComponent__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__0__Impl"
    // InternalScml.g:6344:1: rule__EnvironmentalComponent__Group_4__0__Impl : ( 'composedOf' ) ;
    public final void rule__EnvironmentalComponent__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6348:1: ( ( 'composedOf' ) )
            // InternalScml.g:6349:1: ( 'composedOf' )
            {
            // InternalScml.g:6349:1: ( 'composedOf' )
            // InternalScml.g:6350:2: 'composedOf'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfKeyword_4_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__1"
    // InternalScml.g:6359:1: rule__EnvironmentalComponent__Group_4__1 : rule__EnvironmentalComponent__Group_4__1__Impl rule__EnvironmentalComponent__Group_4__2 ;
    public final void rule__EnvironmentalComponent__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6363:1: ( rule__EnvironmentalComponent__Group_4__1__Impl rule__EnvironmentalComponent__Group_4__2 )
            // InternalScml.g:6364:2: rule__EnvironmentalComponent__Group_4__1__Impl rule__EnvironmentalComponent__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__EnvironmentalComponent__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4__2();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__1__Impl"
    // InternalScml.g:6371:1: rule__EnvironmentalComponent__Group_4__1__Impl : ( '(' ) ;
    public final void rule__EnvironmentalComponent__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6375:1: ( ( '(' ) )
            // InternalScml.g:6376:1: ( '(' )
            {
            // InternalScml.g:6376:1: ( '(' )
            // InternalScml.g:6377:2: '('
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__2"
    // InternalScml.g:6386:1: rule__EnvironmentalComponent__Group_4__2 : rule__EnvironmentalComponent__Group_4__2__Impl rule__EnvironmentalComponent__Group_4__3 ;
    public final void rule__EnvironmentalComponent__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6390:1: ( rule__EnvironmentalComponent__Group_4__2__Impl rule__EnvironmentalComponent__Group_4__3 )
            // InternalScml.g:6391:2: rule__EnvironmentalComponent__Group_4__2__Impl rule__EnvironmentalComponent__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__EnvironmentalComponent__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4__3();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__2"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__2__Impl"
    // InternalScml.g:6398:1: rule__EnvironmentalComponent__Group_4__2__Impl : ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 ) ) ;
    public final void rule__EnvironmentalComponent__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6402:1: ( ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 ) ) )
            // InternalScml.g:6403:1: ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 ) )
            {
            // InternalScml.g:6403:1: ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 ) )
            // InternalScml.g:6404:2: ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfAssignment_4_2()); 
            // InternalScml.g:6405:2: ( rule__EnvironmentalComponent__ComposedOfAssignment_4_2 )
            // InternalScml.g:6405:3: rule__EnvironmentalComponent__ComposedOfAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__ComposedOfAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfAssignment_4_2()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__2__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__3"
    // InternalScml.g:6413:1: rule__EnvironmentalComponent__Group_4__3 : rule__EnvironmentalComponent__Group_4__3__Impl rule__EnvironmentalComponent__Group_4__4 ;
    public final void rule__EnvironmentalComponent__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6417:1: ( rule__EnvironmentalComponent__Group_4__3__Impl rule__EnvironmentalComponent__Group_4__4 )
            // InternalScml.g:6418:2: rule__EnvironmentalComponent__Group_4__3__Impl rule__EnvironmentalComponent__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__EnvironmentalComponent__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4__4();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__3"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__3__Impl"
    // InternalScml.g:6425:1: rule__EnvironmentalComponent__Group_4__3__Impl : ( ( rule__EnvironmentalComponent__Group_4_3__0 )* ) ;
    public final void rule__EnvironmentalComponent__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6429:1: ( ( ( rule__EnvironmentalComponent__Group_4_3__0 )* ) )
            // InternalScml.g:6430:1: ( ( rule__EnvironmentalComponent__Group_4_3__0 )* )
            {
            // InternalScml.g:6430:1: ( ( rule__EnvironmentalComponent__Group_4_3__0 )* )
            // InternalScml.g:6431:2: ( rule__EnvironmentalComponent__Group_4_3__0 )*
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_4_3()); 
            // InternalScml.g:6432:2: ( rule__EnvironmentalComponent__Group_4_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==40) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalScml.g:6432:3: rule__EnvironmentalComponent__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EnvironmentalComponent__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__3__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__4"
    // InternalScml.g:6440:1: rule__EnvironmentalComponent__Group_4__4 : rule__EnvironmentalComponent__Group_4__4__Impl ;
    public final void rule__EnvironmentalComponent__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6444:1: ( rule__EnvironmentalComponent__Group_4__4__Impl )
            // InternalScml.g:6445:2: rule__EnvironmentalComponent__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4__4__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__4"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4__4__Impl"
    // InternalScml.g:6451:1: rule__EnvironmentalComponent__Group_4__4__Impl : ( ')' ) ;
    public final void rule__EnvironmentalComponent__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6455:1: ( ( ')' ) )
            // InternalScml.g:6456:1: ( ')' )
            {
            // InternalScml.g:6456:1: ( ')' )
            // InternalScml.g:6457:2: ')'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getRightParenthesisKeyword_4_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4__4__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4_3__0"
    // InternalScml.g:6467:1: rule__EnvironmentalComponent__Group_4_3__0 : rule__EnvironmentalComponent__Group_4_3__0__Impl rule__EnvironmentalComponent__Group_4_3__1 ;
    public final void rule__EnvironmentalComponent__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6471:1: ( rule__EnvironmentalComponent__Group_4_3__0__Impl rule__EnvironmentalComponent__Group_4_3__1 )
            // InternalScml.g:6472:2: rule__EnvironmentalComponent__Group_4_3__0__Impl rule__EnvironmentalComponent__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EnvironmentalComponent__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4_3__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4_3__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4_3__0__Impl"
    // InternalScml.g:6479:1: rule__EnvironmentalComponent__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__EnvironmentalComponent__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6483:1: ( ( ',' ) )
            // InternalScml.g:6484:1: ( ',' )
            {
            // InternalScml.g:6484:1: ( ',' )
            // InternalScml.g:6485:2: ','
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4_3__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4_3__1"
    // InternalScml.g:6494:1: rule__EnvironmentalComponent__Group_4_3__1 : rule__EnvironmentalComponent__Group_4_3__1__Impl ;
    public final void rule__EnvironmentalComponent__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6498:1: ( rule__EnvironmentalComponent__Group_4_3__1__Impl )
            // InternalScml.g:6499:2: rule__EnvironmentalComponent__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4_3__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_4_3__1__Impl"
    // InternalScml.g:6505:1: rule__EnvironmentalComponent__Group_4_3__1__Impl : ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 ) ) ;
    public final void rule__EnvironmentalComponent__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6509:1: ( ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 ) ) )
            // InternalScml.g:6510:1: ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 ) )
            {
            // InternalScml.g:6510:1: ( ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 ) )
            // InternalScml.g:6511:2: ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfAssignment_4_3_1()); 
            // InternalScml.g:6512:2: ( rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 )
            // InternalScml.g:6512:3: rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfAssignment_4_3_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_4_3__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__0"
    // InternalScml.g:6521:1: rule__EnvironmentalComponent__Group_7__0 : rule__EnvironmentalComponent__Group_7__0__Impl rule__EnvironmentalComponent__Group_7__1 ;
    public final void rule__EnvironmentalComponent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6525:1: ( rule__EnvironmentalComponent__Group_7__0__Impl rule__EnvironmentalComponent__Group_7__1 )
            // InternalScml.g:6526:2: rule__EnvironmentalComponent__Group_7__0__Impl rule__EnvironmentalComponent__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__EnvironmentalComponent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__0__Impl"
    // InternalScml.g:6533:1: rule__EnvironmentalComponent__Group_7__0__Impl : ( 'produces' ) ;
    public final void rule__EnvironmentalComponent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6537:1: ( ( 'produces' ) )
            // InternalScml.g:6538:1: ( 'produces' )
            {
            // InternalScml.g:6538:1: ( 'produces' )
            // InternalScml.g:6539:2: 'produces'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getProducesKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getProducesKeyword_7_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__1"
    // InternalScml.g:6548:1: rule__EnvironmentalComponent__Group_7__1 : rule__EnvironmentalComponent__Group_7__1__Impl rule__EnvironmentalComponent__Group_7__2 ;
    public final void rule__EnvironmentalComponent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6552:1: ( rule__EnvironmentalComponent__Group_7__1__Impl rule__EnvironmentalComponent__Group_7__2 )
            // InternalScml.g:6553:2: rule__EnvironmentalComponent__Group_7__1__Impl rule__EnvironmentalComponent__Group_7__2
            {
            pushFollow(FOLLOW_44);
            rule__EnvironmentalComponent__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7__2();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__1__Impl"
    // InternalScml.g:6560:1: rule__EnvironmentalComponent__Group_7__1__Impl : ( '{' ) ;
    public final void rule__EnvironmentalComponent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6564:1: ( ( '{' ) )
            // InternalScml.g:6565:1: ( '{' )
            {
            // InternalScml.g:6565:1: ( '{' )
            // InternalScml.g:6566:2: '{'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__2"
    // InternalScml.g:6575:1: rule__EnvironmentalComponent__Group_7__2 : rule__EnvironmentalComponent__Group_7__2__Impl rule__EnvironmentalComponent__Group_7__3 ;
    public final void rule__EnvironmentalComponent__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6579:1: ( rule__EnvironmentalComponent__Group_7__2__Impl rule__EnvironmentalComponent__Group_7__3 )
            // InternalScml.g:6580:2: rule__EnvironmentalComponent__Group_7__2__Impl rule__EnvironmentalComponent__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentalComponent__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7__3();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__2"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__2__Impl"
    // InternalScml.g:6587:1: rule__EnvironmentalComponent__Group_7__2__Impl : ( ( rule__EnvironmentalComponent__ProducesAssignment_7_2 ) ) ;
    public final void rule__EnvironmentalComponent__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6591:1: ( ( ( rule__EnvironmentalComponent__ProducesAssignment_7_2 ) ) )
            // InternalScml.g:6592:1: ( ( rule__EnvironmentalComponent__ProducesAssignment_7_2 ) )
            {
            // InternalScml.g:6592:1: ( ( rule__EnvironmentalComponent__ProducesAssignment_7_2 ) )
            // InternalScml.g:6593:2: ( rule__EnvironmentalComponent__ProducesAssignment_7_2 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getProducesAssignment_7_2()); 
            // InternalScml.g:6594:2: ( rule__EnvironmentalComponent__ProducesAssignment_7_2 )
            // InternalScml.g:6594:3: rule__EnvironmentalComponent__ProducesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__ProducesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getProducesAssignment_7_2()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__2__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__3"
    // InternalScml.g:6602:1: rule__EnvironmentalComponent__Group_7__3 : rule__EnvironmentalComponent__Group_7__3__Impl rule__EnvironmentalComponent__Group_7__4 ;
    public final void rule__EnvironmentalComponent__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6606:1: ( rule__EnvironmentalComponent__Group_7__3__Impl rule__EnvironmentalComponent__Group_7__4 )
            // InternalScml.g:6607:2: rule__EnvironmentalComponent__Group_7__3__Impl rule__EnvironmentalComponent__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentalComponent__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7__4();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__3"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__3__Impl"
    // InternalScml.g:6614:1: rule__EnvironmentalComponent__Group_7__3__Impl : ( ( rule__EnvironmentalComponent__Group_7_3__0 )* ) ;
    public final void rule__EnvironmentalComponent__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6618:1: ( ( ( rule__EnvironmentalComponent__Group_7_3__0 )* ) )
            // InternalScml.g:6619:1: ( ( rule__EnvironmentalComponent__Group_7_3__0 )* )
            {
            // InternalScml.g:6619:1: ( ( rule__EnvironmentalComponent__Group_7_3__0 )* )
            // InternalScml.g:6620:2: ( rule__EnvironmentalComponent__Group_7_3__0 )*
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_7_3()); 
            // InternalScml.g:6621:2: ( rule__EnvironmentalComponent__Group_7_3__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==40) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalScml.g:6621:3: rule__EnvironmentalComponent__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EnvironmentalComponent__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__3__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__4"
    // InternalScml.g:6629:1: rule__EnvironmentalComponent__Group_7__4 : rule__EnvironmentalComponent__Group_7__4__Impl ;
    public final void rule__EnvironmentalComponent__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6633:1: ( rule__EnvironmentalComponent__Group_7__4__Impl )
            // InternalScml.g:6634:2: rule__EnvironmentalComponent__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7__4__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__4"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7__4__Impl"
    // InternalScml.g:6640:1: rule__EnvironmentalComponent__Group_7__4__Impl : ( '}' ) ;
    public final void rule__EnvironmentalComponent__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6644:1: ( ( '}' ) )
            // InternalScml.g:6645:1: ( '}' )
            {
            // InternalScml.g:6645:1: ( '}' )
            // InternalScml.g:6646:2: '}'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7__4__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7_3__0"
    // InternalScml.g:6656:1: rule__EnvironmentalComponent__Group_7_3__0 : rule__EnvironmentalComponent__Group_7_3__0__Impl rule__EnvironmentalComponent__Group_7_3__1 ;
    public final void rule__EnvironmentalComponent__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6660:1: ( rule__EnvironmentalComponent__Group_7_3__0__Impl rule__EnvironmentalComponent__Group_7_3__1 )
            // InternalScml.g:6661:2: rule__EnvironmentalComponent__Group_7_3__0__Impl rule__EnvironmentalComponent__Group_7_3__1
            {
            pushFollow(FOLLOW_44);
            rule__EnvironmentalComponent__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7_3__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7_3__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7_3__0__Impl"
    // InternalScml.g:6668:1: rule__EnvironmentalComponent__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__EnvironmentalComponent__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6672:1: ( ( ',' ) )
            // InternalScml.g:6673:1: ( ',' )
            {
            // InternalScml.g:6673:1: ( ',' )
            // InternalScml.g:6674:2: ','
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_7_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7_3__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7_3__1"
    // InternalScml.g:6683:1: rule__EnvironmentalComponent__Group_7_3__1 : rule__EnvironmentalComponent__Group_7_3__1__Impl ;
    public final void rule__EnvironmentalComponent__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6687:1: ( rule__EnvironmentalComponent__Group_7_3__1__Impl )
            // InternalScml.g:6688:2: rule__EnvironmentalComponent__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7_3__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_7_3__1__Impl"
    // InternalScml.g:6694:1: rule__EnvironmentalComponent__Group_7_3__1__Impl : ( ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 ) ) ;
    public final void rule__EnvironmentalComponent__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6698:1: ( ( ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 ) ) )
            // InternalScml.g:6699:1: ( ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 ) )
            {
            // InternalScml.g:6699:1: ( ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 ) )
            // InternalScml.g:6700:2: ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getProducesAssignment_7_3_1()); 
            // InternalScml.g:6701:2: ( rule__EnvironmentalComponent__ProducesAssignment_7_3_1 )
            // InternalScml.g:6701:3: rule__EnvironmentalComponent__ProducesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__ProducesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getProducesAssignment_7_3_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_7_3__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__0"
    // InternalScml.g:6710:1: rule__EnvironmentalComponent__Group_10__0 : rule__EnvironmentalComponent__Group_10__0__Impl rule__EnvironmentalComponent__Group_10__1 ;
    public final void rule__EnvironmentalComponent__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6714:1: ( rule__EnvironmentalComponent__Group_10__0__Impl rule__EnvironmentalComponent__Group_10__1 )
            // InternalScml.g:6715:2: rule__EnvironmentalComponent__Group_10__0__Impl rule__EnvironmentalComponent__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__EnvironmentalComponent__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__0__Impl"
    // InternalScml.g:6722:1: rule__EnvironmentalComponent__Group_10__0__Impl : ( 'device' ) ;
    public final void rule__EnvironmentalComponent__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6726:1: ( ( 'device' ) )
            // InternalScml.g:6727:1: ( 'device' )
            {
            // InternalScml.g:6727:1: ( 'device' )
            // InternalScml.g:6728:2: 'device'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getDeviceKeyword_10_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getDeviceKeyword_10_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__1"
    // InternalScml.g:6737:1: rule__EnvironmentalComponent__Group_10__1 : rule__EnvironmentalComponent__Group_10__1__Impl rule__EnvironmentalComponent__Group_10__2 ;
    public final void rule__EnvironmentalComponent__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6741:1: ( rule__EnvironmentalComponent__Group_10__1__Impl rule__EnvironmentalComponent__Group_10__2 )
            // InternalScml.g:6742:2: rule__EnvironmentalComponent__Group_10__1__Impl rule__EnvironmentalComponent__Group_10__2
            {
            pushFollow(FOLLOW_45);
            rule__EnvironmentalComponent__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10__2();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__1__Impl"
    // InternalScml.g:6749:1: rule__EnvironmentalComponent__Group_10__1__Impl : ( '{' ) ;
    public final void rule__EnvironmentalComponent__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6753:1: ( ( '{' ) )
            // InternalScml.g:6754:1: ( '{' )
            {
            // InternalScml.g:6754:1: ( '{' )
            // InternalScml.g:6755:2: '{'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__1__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__2"
    // InternalScml.g:6764:1: rule__EnvironmentalComponent__Group_10__2 : rule__EnvironmentalComponent__Group_10__2__Impl rule__EnvironmentalComponent__Group_10__3 ;
    public final void rule__EnvironmentalComponent__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6768:1: ( rule__EnvironmentalComponent__Group_10__2__Impl rule__EnvironmentalComponent__Group_10__3 )
            // InternalScml.g:6769:2: rule__EnvironmentalComponent__Group_10__2__Impl rule__EnvironmentalComponent__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentalComponent__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10__3();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__2"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__2__Impl"
    // InternalScml.g:6776:1: rule__EnvironmentalComponent__Group_10__2__Impl : ( ( rule__EnvironmentalComponent__DeviceAssignment_10_2 ) ) ;
    public final void rule__EnvironmentalComponent__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6780:1: ( ( ( rule__EnvironmentalComponent__DeviceAssignment_10_2 ) ) )
            // InternalScml.g:6781:1: ( ( rule__EnvironmentalComponent__DeviceAssignment_10_2 ) )
            {
            // InternalScml.g:6781:1: ( ( rule__EnvironmentalComponent__DeviceAssignment_10_2 ) )
            // InternalScml.g:6782:2: ( rule__EnvironmentalComponent__DeviceAssignment_10_2 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getDeviceAssignment_10_2()); 
            // InternalScml.g:6783:2: ( rule__EnvironmentalComponent__DeviceAssignment_10_2 )
            // InternalScml.g:6783:3: rule__EnvironmentalComponent__DeviceAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__DeviceAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getDeviceAssignment_10_2()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__2__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__3"
    // InternalScml.g:6791:1: rule__EnvironmentalComponent__Group_10__3 : rule__EnvironmentalComponent__Group_10__3__Impl rule__EnvironmentalComponent__Group_10__4 ;
    public final void rule__EnvironmentalComponent__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6795:1: ( rule__EnvironmentalComponent__Group_10__3__Impl rule__EnvironmentalComponent__Group_10__4 )
            // InternalScml.g:6796:2: rule__EnvironmentalComponent__Group_10__3__Impl rule__EnvironmentalComponent__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__EnvironmentalComponent__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10__4();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__3"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__3__Impl"
    // InternalScml.g:6803:1: rule__EnvironmentalComponent__Group_10__3__Impl : ( ( rule__EnvironmentalComponent__Group_10_3__0 )* ) ;
    public final void rule__EnvironmentalComponent__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6807:1: ( ( ( rule__EnvironmentalComponent__Group_10_3__0 )* ) )
            // InternalScml.g:6808:1: ( ( rule__EnvironmentalComponent__Group_10_3__0 )* )
            {
            // InternalScml.g:6808:1: ( ( rule__EnvironmentalComponent__Group_10_3__0 )* )
            // InternalScml.g:6809:2: ( rule__EnvironmentalComponent__Group_10_3__0 )*
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getGroup_10_3()); 
            // InternalScml.g:6810:2: ( rule__EnvironmentalComponent__Group_10_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==40) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalScml.g:6810:3: rule__EnvironmentalComponent__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__EnvironmentalComponent__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getEnvironmentalComponentAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__3__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__4"
    // InternalScml.g:6818:1: rule__EnvironmentalComponent__Group_10__4 : rule__EnvironmentalComponent__Group_10__4__Impl ;
    public final void rule__EnvironmentalComponent__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6822:1: ( rule__EnvironmentalComponent__Group_10__4__Impl )
            // InternalScml.g:6823:2: rule__EnvironmentalComponent__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10__4__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__4"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10__4__Impl"
    // InternalScml.g:6829:1: rule__EnvironmentalComponent__Group_10__4__Impl : ( '}' ) ;
    public final void rule__EnvironmentalComponent__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6833:1: ( ( '}' ) )
            // InternalScml.g:6834:1: ( '}' )
            {
            // InternalScml.g:6834:1: ( '}' )
            // InternalScml.g:6835:2: '}'
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10__4__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10_3__0"
    // InternalScml.g:6845:1: rule__EnvironmentalComponent__Group_10_3__0 : rule__EnvironmentalComponent__Group_10_3__0__Impl rule__EnvironmentalComponent__Group_10_3__1 ;
    public final void rule__EnvironmentalComponent__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6849:1: ( rule__EnvironmentalComponent__Group_10_3__0__Impl rule__EnvironmentalComponent__Group_10_3__1 )
            // InternalScml.g:6850:2: rule__EnvironmentalComponent__Group_10_3__0__Impl rule__EnvironmentalComponent__Group_10_3__1
            {
            pushFollow(FOLLOW_45);
            rule__EnvironmentalComponent__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10_3__1();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10_3__0"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10_3__0__Impl"
    // InternalScml.g:6857:1: rule__EnvironmentalComponent__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__EnvironmentalComponent__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6861:1: ( ( ',' ) )
            // InternalScml.g:6862:1: ( ',' )
            {
            // InternalScml.g:6862:1: ( ',' )
            // InternalScml.g:6863:2: ','
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_10_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnvironmentalComponentAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10_3__0__Impl"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10_3__1"
    // InternalScml.g:6872:1: rule__EnvironmentalComponent__Group_10_3__1 : rule__EnvironmentalComponent__Group_10_3__1__Impl ;
    public final void rule__EnvironmentalComponent__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6876:1: ( rule__EnvironmentalComponent__Group_10_3__1__Impl )
            // InternalScml.g:6877:2: rule__EnvironmentalComponent__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10_3__1"


    // $ANTLR start "rule__EnvironmentalComponent__Group_10_3__1__Impl"
    // InternalScml.g:6883:1: rule__EnvironmentalComponent__Group_10_3__1__Impl : ( ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 ) ) ;
    public final void rule__EnvironmentalComponent__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6887:1: ( ( ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 ) ) )
            // InternalScml.g:6888:1: ( ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 ) )
            {
            // InternalScml.g:6888:1: ( ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 ) )
            // InternalScml.g:6889:2: ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getDeviceAssignment_10_3_1()); 
            // InternalScml.g:6890:2: ( rule__EnvironmentalComponent__DeviceAssignment_10_3_1 )
            // InternalScml.g:6890:3: rule__EnvironmentalComponent__DeviceAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnvironmentalComponent__DeviceAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentalComponentAccess().getDeviceAssignment_10_3_1()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__Group_10_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalScml.g:6899:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6903:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalScml.g:6904:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalScml.g:6911:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6915:1: ( ( ( '-' )? ) )
            // InternalScml.g:6916:1: ( ( '-' )? )
            {
            // InternalScml.g:6916:1: ( ( '-' )? )
            // InternalScml.g:6917:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalScml.g:6918:2: ( '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalScml.g:6918:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalScml.g:6926:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6930:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalScml.g:6931:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalScml.g:6938:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6942:1: ( ( ( RULE_INT )? ) )
            // InternalScml.g:6943:1: ( ( RULE_INT )? )
            {
            // InternalScml.g:6943:1: ( ( RULE_INT )? )
            // InternalScml.g:6944:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalScml.g:6945:2: ( RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalScml.g:6945:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalScml.g:6953:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6957:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalScml.g:6958:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalScml.g:6965:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6969:1: ( ( '.' ) )
            // InternalScml.g:6970:1: ( '.' )
            {
            // InternalScml.g:6970:1: ( '.' )
            // InternalScml.g:6971:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalScml.g:6980:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6984:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalScml.g:6985:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalScml.g:6992:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:6996:1: ( ( RULE_INT ) )
            // InternalScml.g:6997:1: ( RULE_INT )
            {
            // InternalScml.g:6997:1: ( RULE_INT )
            // InternalScml.g:6998:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalScml.g:7007:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7011:1: ( rule__EFloat__Group__4__Impl )
            // InternalScml.g:7012:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalScml.g:7018:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7022:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalScml.g:7023:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalScml.g:7023:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalScml.g:7024:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalScml.g:7025:2: ( rule__EFloat__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=11 && LA50_0<=12)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalScml.g:7025:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalScml.g:7034:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7038:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalScml.g:7039:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalScml.g:7046:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7050:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalScml.g:7051:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalScml.g:7051:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalScml.g:7052:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalScml.g:7053:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalScml.g:7053:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalScml.g:7061:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7065:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalScml.g:7066:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalScml.g:7073:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7077:1: ( ( ( '-' )? ) )
            // InternalScml.g:7078:1: ( ( '-' )? )
            {
            // InternalScml.g:7078:1: ( ( '-' )? )
            // InternalScml.g:7079:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalScml.g:7080:2: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalScml.g:7080:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalScml.g:7088:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7092:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalScml.g:7093:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalScml.g:7099:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7103:1: ( ( RULE_INT ) )
            // InternalScml.g:7104:1: ( RULE_INT )
            {
            // InternalScml.g:7104:1: ( RULE_INT )
            // InternalScml.g:7105:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__0"
    // InternalScml.g:7115:1: rule__GoalReferenceValue__Group__0 : rule__GoalReferenceValue__Group__0__Impl rule__GoalReferenceValue__Group__1 ;
    public final void rule__GoalReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7119:1: ( rule__GoalReferenceValue__Group__0__Impl rule__GoalReferenceValue__Group__1 )
            // InternalScml.g:7120:2: rule__GoalReferenceValue__Group__0__Impl rule__GoalReferenceValue__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GoalReferenceValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__1();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__0"


    // $ANTLR start "rule__GoalReferenceValue__Group__0__Impl"
    // InternalScml.g:7127:1: rule__GoalReferenceValue__Group__0__Impl : ( 'GoalReferenceValue' ) ;
    public final void rule__GoalReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7131:1: ( ( 'GoalReferenceValue' ) )
            // InternalScml.g:7132:1: ( 'GoalReferenceValue' )
            {
            // InternalScml.g:7132:1: ( 'GoalReferenceValue' )
            // InternalScml.g:7133:2: 'GoalReferenceValue'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getGoalReferenceValueKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getGoalReferenceValueKeyword_0()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__0__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__1"
    // InternalScml.g:7142:1: rule__GoalReferenceValue__Group__1 : rule__GoalReferenceValue__Group__1__Impl rule__GoalReferenceValue__Group__2 ;
    public final void rule__GoalReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7146:1: ( rule__GoalReferenceValue__Group__1__Impl rule__GoalReferenceValue__Group__2 )
            // InternalScml.g:7147:2: rule__GoalReferenceValue__Group__1__Impl rule__GoalReferenceValue__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__GoalReferenceValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__2();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__1"


    // $ANTLR start "rule__GoalReferenceValue__Group__1__Impl"
    // InternalScml.g:7154:1: rule__GoalReferenceValue__Group__1__Impl : ( '{' ) ;
    public final void rule__GoalReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7158:1: ( ( '{' ) )
            // InternalScml.g:7159:1: ( '{' )
            {
            // InternalScml.g:7159:1: ( '{' )
            // InternalScml.g:7160:2: '{'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__1__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__2"
    // InternalScml.g:7169:1: rule__GoalReferenceValue__Group__2 : rule__GoalReferenceValue__Group__2__Impl rule__GoalReferenceValue__Group__3 ;
    public final void rule__GoalReferenceValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7173:1: ( rule__GoalReferenceValue__Group__2__Impl rule__GoalReferenceValue__Group__3 )
            // InternalScml.g:7174:2: rule__GoalReferenceValue__Group__2__Impl rule__GoalReferenceValue__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__GoalReferenceValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__3();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__2"


    // $ANTLR start "rule__GoalReferenceValue__Group__2__Impl"
    // InternalScml.g:7181:1: rule__GoalReferenceValue__Group__2__Impl : ( 'type' ) ;
    public final void rule__GoalReferenceValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7185:1: ( ( 'type' ) )
            // InternalScml.g:7186:1: ( 'type' )
            {
            // InternalScml.g:7186:1: ( 'type' )
            // InternalScml.g:7187:2: 'type'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getTypeKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__2__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__3"
    // InternalScml.g:7196:1: rule__GoalReferenceValue__Group__3 : rule__GoalReferenceValue__Group__3__Impl rule__GoalReferenceValue__Group__4 ;
    public final void rule__GoalReferenceValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7200:1: ( rule__GoalReferenceValue__Group__3__Impl rule__GoalReferenceValue__Group__4 )
            // InternalScml.g:7201:2: rule__GoalReferenceValue__Group__3__Impl rule__GoalReferenceValue__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__GoalReferenceValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__4();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__3"


    // $ANTLR start "rule__GoalReferenceValue__Group__3__Impl"
    // InternalScml.g:7208:1: rule__GoalReferenceValue__Group__3__Impl : ( ( rule__GoalReferenceValue__TypeAssignment_3 ) ) ;
    public final void rule__GoalReferenceValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7212:1: ( ( ( rule__GoalReferenceValue__TypeAssignment_3 ) ) )
            // InternalScml.g:7213:1: ( ( rule__GoalReferenceValue__TypeAssignment_3 ) )
            {
            // InternalScml.g:7213:1: ( ( rule__GoalReferenceValue__TypeAssignment_3 ) )
            // InternalScml.g:7214:2: ( rule__GoalReferenceValue__TypeAssignment_3 )
            {
             before(grammarAccess.getGoalReferenceValueAccess().getTypeAssignment_3()); 
            // InternalScml.g:7215:2: ( rule__GoalReferenceValue__TypeAssignment_3 )
            // InternalScml.g:7215:3: rule__GoalReferenceValue__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoalReferenceValueAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__3__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__4"
    // InternalScml.g:7223:1: rule__GoalReferenceValue__Group__4 : rule__GoalReferenceValue__Group__4__Impl rule__GoalReferenceValue__Group__5 ;
    public final void rule__GoalReferenceValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7227:1: ( rule__GoalReferenceValue__Group__4__Impl rule__GoalReferenceValue__Group__5 )
            // InternalScml.g:7228:2: rule__GoalReferenceValue__Group__4__Impl rule__GoalReferenceValue__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__GoalReferenceValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__5();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__4"


    // $ANTLR start "rule__GoalReferenceValue__Group__4__Impl"
    // InternalScml.g:7235:1: rule__GoalReferenceValue__Group__4__Impl : ( 'value' ) ;
    public final void rule__GoalReferenceValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7239:1: ( ( 'value' ) )
            // InternalScml.g:7240:1: ( 'value' )
            {
            // InternalScml.g:7240:1: ( 'value' )
            // InternalScml.g:7241:2: 'value'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getValueKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getValueKeyword_4()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__4__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__5"
    // InternalScml.g:7250:1: rule__GoalReferenceValue__Group__5 : rule__GoalReferenceValue__Group__5__Impl rule__GoalReferenceValue__Group__6 ;
    public final void rule__GoalReferenceValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7254:1: ( rule__GoalReferenceValue__Group__5__Impl rule__GoalReferenceValue__Group__6 )
            // InternalScml.g:7255:2: rule__GoalReferenceValue__Group__5__Impl rule__GoalReferenceValue__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__GoalReferenceValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__6();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__5"


    // $ANTLR start "rule__GoalReferenceValue__Group__5__Impl"
    // InternalScml.g:7262:1: rule__GoalReferenceValue__Group__5__Impl : ( ( rule__GoalReferenceValue__ValueAssignment_5 ) ) ;
    public final void rule__GoalReferenceValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7266:1: ( ( ( rule__GoalReferenceValue__ValueAssignment_5 ) ) )
            // InternalScml.g:7267:1: ( ( rule__GoalReferenceValue__ValueAssignment_5 ) )
            {
            // InternalScml.g:7267:1: ( ( rule__GoalReferenceValue__ValueAssignment_5 ) )
            // InternalScml.g:7268:2: ( rule__GoalReferenceValue__ValueAssignment_5 )
            {
             before(grammarAccess.getGoalReferenceValueAccess().getValueAssignment_5()); 
            // InternalScml.g:7269:2: ( rule__GoalReferenceValue__ValueAssignment_5 )
            // InternalScml.g:7269:3: rule__GoalReferenceValue__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGoalReferenceValueAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__5__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__6"
    // InternalScml.g:7277:1: rule__GoalReferenceValue__Group__6 : rule__GoalReferenceValue__Group__6__Impl rule__GoalReferenceValue__Group__7 ;
    public final void rule__GoalReferenceValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7281:1: ( rule__GoalReferenceValue__Group__6__Impl rule__GoalReferenceValue__Group__7 )
            // InternalScml.g:7282:2: rule__GoalReferenceValue__Group__6__Impl rule__GoalReferenceValue__Group__7
            {
            pushFollow(FOLLOW_49);
            rule__GoalReferenceValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__7();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__6"


    // $ANTLR start "rule__GoalReferenceValue__Group__6__Impl"
    // InternalScml.g:7289:1: rule__GoalReferenceValue__Group__6__Impl : ( 'basis' ) ;
    public final void rule__GoalReferenceValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7293:1: ( ( 'basis' ) )
            // InternalScml.g:7294:1: ( 'basis' )
            {
            // InternalScml.g:7294:1: ( 'basis' )
            // InternalScml.g:7295:2: 'basis'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getBasisKeyword_6()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getBasisKeyword_6()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__6__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__7"
    // InternalScml.g:7304:1: rule__GoalReferenceValue__Group__7 : rule__GoalReferenceValue__Group__7__Impl rule__GoalReferenceValue__Group__8 ;
    public final void rule__GoalReferenceValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7308:1: ( rule__GoalReferenceValue__Group__7__Impl rule__GoalReferenceValue__Group__8 )
            // InternalScml.g:7309:2: rule__GoalReferenceValue__Group__7__Impl rule__GoalReferenceValue__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__GoalReferenceValue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__8();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__7"


    // $ANTLR start "rule__GoalReferenceValue__Group__7__Impl"
    // InternalScml.g:7316:1: rule__GoalReferenceValue__Group__7__Impl : ( ( rule__GoalReferenceValue__BasisAssignment_7 ) ) ;
    public final void rule__GoalReferenceValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7320:1: ( ( ( rule__GoalReferenceValue__BasisAssignment_7 ) ) )
            // InternalScml.g:7321:1: ( ( rule__GoalReferenceValue__BasisAssignment_7 ) )
            {
            // InternalScml.g:7321:1: ( ( rule__GoalReferenceValue__BasisAssignment_7 ) )
            // InternalScml.g:7322:2: ( rule__GoalReferenceValue__BasisAssignment_7 )
            {
             before(grammarAccess.getGoalReferenceValueAccess().getBasisAssignment_7()); 
            // InternalScml.g:7323:2: ( rule__GoalReferenceValue__BasisAssignment_7 )
            // InternalScml.g:7323:3: rule__GoalReferenceValue__BasisAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__BasisAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGoalReferenceValueAccess().getBasisAssignment_7()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__7__Impl"


    // $ANTLR start "rule__GoalReferenceValue__Group__8"
    // InternalScml.g:7331:1: rule__GoalReferenceValue__Group__8 : rule__GoalReferenceValue__Group__8__Impl ;
    public final void rule__GoalReferenceValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7335:1: ( rule__GoalReferenceValue__Group__8__Impl )
            // InternalScml.g:7336:2: rule__GoalReferenceValue__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoalReferenceValue__Group__8__Impl();

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
    // $ANTLR end "rule__GoalReferenceValue__Group__8"


    // $ANTLR start "rule__GoalReferenceValue__Group__8__Impl"
    // InternalScml.g:7342:1: rule__GoalReferenceValue__Group__8__Impl : ( '}' ) ;
    public final void rule__GoalReferenceValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7346:1: ( ( '}' ) )
            // InternalScml.g:7347:1: ( '}' )
            {
            // InternalScml.g:7347:1: ( '}' )
            // InternalScml.g:7348:2: '}'
            {
             before(grammarAccess.getGoalReferenceValueAccess().getRightCurlyBracketKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGoalReferenceValueAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__GoalReferenceValue__Group__8__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__0"
    // InternalScml.g:7358:1: rule__AggregatedValue__Group__0 : rule__AggregatedValue__Group__0__Impl rule__AggregatedValue__Group__1 ;
    public final void rule__AggregatedValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7362:1: ( rule__AggregatedValue__Group__0__Impl rule__AggregatedValue__Group__1 )
            // InternalScml.g:7363:2: rule__AggregatedValue__Group__0__Impl rule__AggregatedValue__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AggregatedValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__1();

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
    // $ANTLR end "rule__AggregatedValue__Group__0"


    // $ANTLR start "rule__AggregatedValue__Group__0__Impl"
    // InternalScml.g:7370:1: rule__AggregatedValue__Group__0__Impl : ( 'AggregatedValue' ) ;
    public final void rule__AggregatedValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7374:1: ( ( 'AggregatedValue' ) )
            // InternalScml.g:7375:1: ( 'AggregatedValue' )
            {
            // InternalScml.g:7375:1: ( 'AggregatedValue' )
            // InternalScml.g:7376:2: 'AggregatedValue'
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatedValueKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getAggregatedValueKeyword_0()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__0__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__1"
    // InternalScml.g:7385:1: rule__AggregatedValue__Group__1 : rule__AggregatedValue__Group__1__Impl rule__AggregatedValue__Group__2 ;
    public final void rule__AggregatedValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7389:1: ( rule__AggregatedValue__Group__1__Impl rule__AggregatedValue__Group__2 )
            // InternalScml.g:7390:2: rule__AggregatedValue__Group__1__Impl rule__AggregatedValue__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__AggregatedValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__2();

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
    // $ANTLR end "rule__AggregatedValue__Group__1"


    // $ANTLR start "rule__AggregatedValue__Group__1__Impl"
    // InternalScml.g:7397:1: rule__AggregatedValue__Group__1__Impl : ( '{' ) ;
    public final void rule__AggregatedValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7401:1: ( ( '{' ) )
            // InternalScml.g:7402:1: ( '{' )
            {
            // InternalScml.g:7402:1: ( '{' )
            // InternalScml.g:7403:2: '{'
            {
             before(grammarAccess.getAggregatedValueAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__1__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__2"
    // InternalScml.g:7412:1: rule__AggregatedValue__Group__2 : rule__AggregatedValue__Group__2__Impl rule__AggregatedValue__Group__3 ;
    public final void rule__AggregatedValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7416:1: ( rule__AggregatedValue__Group__2__Impl rule__AggregatedValue__Group__3 )
            // InternalScml.g:7417:2: rule__AggregatedValue__Group__2__Impl rule__AggregatedValue__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__AggregatedValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__3();

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
    // $ANTLR end "rule__AggregatedValue__Group__2"


    // $ANTLR start "rule__AggregatedValue__Group__2__Impl"
    // InternalScml.g:7424:1: rule__AggregatedValue__Group__2__Impl : ( 'type' ) ;
    public final void rule__AggregatedValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7428:1: ( ( 'type' ) )
            // InternalScml.g:7429:1: ( 'type' )
            {
            // InternalScml.g:7429:1: ( 'type' )
            // InternalScml.g:7430:2: 'type'
            {
             before(grammarAccess.getAggregatedValueAccess().getTypeKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getTypeKeyword_2()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__2__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__3"
    // InternalScml.g:7439:1: rule__AggregatedValue__Group__3 : rule__AggregatedValue__Group__3__Impl rule__AggregatedValue__Group__4 ;
    public final void rule__AggregatedValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7443:1: ( rule__AggregatedValue__Group__3__Impl rule__AggregatedValue__Group__4 )
            // InternalScml.g:7444:2: rule__AggregatedValue__Group__3__Impl rule__AggregatedValue__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__AggregatedValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__4();

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
    // $ANTLR end "rule__AggregatedValue__Group__3"


    // $ANTLR start "rule__AggregatedValue__Group__3__Impl"
    // InternalScml.g:7451:1: rule__AggregatedValue__Group__3__Impl : ( ( rule__AggregatedValue__TypeAssignment_3 ) ) ;
    public final void rule__AggregatedValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7455:1: ( ( ( rule__AggregatedValue__TypeAssignment_3 ) ) )
            // InternalScml.g:7456:1: ( ( rule__AggregatedValue__TypeAssignment_3 ) )
            {
            // InternalScml.g:7456:1: ( ( rule__AggregatedValue__TypeAssignment_3 ) )
            // InternalScml.g:7457:2: ( rule__AggregatedValue__TypeAssignment_3 )
            {
             before(grammarAccess.getAggregatedValueAccess().getTypeAssignment_3()); 
            // InternalScml.g:7458:2: ( rule__AggregatedValue__TypeAssignment_3 )
            // InternalScml.g:7458:3: rule__AggregatedValue__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedValueAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__3__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__4"
    // InternalScml.g:7466:1: rule__AggregatedValue__Group__4 : rule__AggregatedValue__Group__4__Impl rule__AggregatedValue__Group__5 ;
    public final void rule__AggregatedValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7470:1: ( rule__AggregatedValue__Group__4__Impl rule__AggregatedValue__Group__5 )
            // InternalScml.g:7471:2: rule__AggregatedValue__Group__4__Impl rule__AggregatedValue__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__AggregatedValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__5();

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
    // $ANTLR end "rule__AggregatedValue__Group__4"


    // $ANTLR start "rule__AggregatedValue__Group__4__Impl"
    // InternalScml.g:7478:1: rule__AggregatedValue__Group__4__Impl : ( 'value' ) ;
    public final void rule__AggregatedValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7482:1: ( ( 'value' ) )
            // InternalScml.g:7483:1: ( 'value' )
            {
            // InternalScml.g:7483:1: ( 'value' )
            // InternalScml.g:7484:2: 'value'
            {
             before(grammarAccess.getAggregatedValueAccess().getValueKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getValueKeyword_4()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__4__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__5"
    // InternalScml.g:7493:1: rule__AggregatedValue__Group__5 : rule__AggregatedValue__Group__5__Impl rule__AggregatedValue__Group__6 ;
    public final void rule__AggregatedValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7497:1: ( rule__AggregatedValue__Group__5__Impl rule__AggregatedValue__Group__6 )
            // InternalScml.g:7498:2: rule__AggregatedValue__Group__5__Impl rule__AggregatedValue__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__AggregatedValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__6();

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
    // $ANTLR end "rule__AggregatedValue__Group__5"


    // $ANTLR start "rule__AggregatedValue__Group__5__Impl"
    // InternalScml.g:7505:1: rule__AggregatedValue__Group__5__Impl : ( ( rule__AggregatedValue__ValueAssignment_5 ) ) ;
    public final void rule__AggregatedValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7509:1: ( ( ( rule__AggregatedValue__ValueAssignment_5 ) ) )
            // InternalScml.g:7510:1: ( ( rule__AggregatedValue__ValueAssignment_5 ) )
            {
            // InternalScml.g:7510:1: ( ( rule__AggregatedValue__ValueAssignment_5 ) )
            // InternalScml.g:7511:2: ( rule__AggregatedValue__ValueAssignment_5 )
            {
             before(grammarAccess.getAggregatedValueAccess().getValueAssignment_5()); 
            // InternalScml.g:7512:2: ( rule__AggregatedValue__ValueAssignment_5 )
            // InternalScml.g:7512:3: rule__AggregatedValue__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedValueAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__5__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__6"
    // InternalScml.g:7520:1: rule__AggregatedValue__Group__6 : rule__AggregatedValue__Group__6__Impl rule__AggregatedValue__Group__7 ;
    public final void rule__AggregatedValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7524:1: ( rule__AggregatedValue__Group__6__Impl rule__AggregatedValue__Group__7 )
            // InternalScml.g:7525:2: rule__AggregatedValue__Group__6__Impl rule__AggregatedValue__Group__7
            {
            pushFollow(FOLLOW_51);
            rule__AggregatedValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__7();

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
    // $ANTLR end "rule__AggregatedValue__Group__6"


    // $ANTLR start "rule__AggregatedValue__Group__6__Impl"
    // InternalScml.g:7532:1: rule__AggregatedValue__Group__6__Impl : ( 'aggregator' ) ;
    public final void rule__AggregatedValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7536:1: ( ( 'aggregator' ) )
            // InternalScml.g:7537:1: ( 'aggregator' )
            {
            // InternalScml.g:7537:1: ( 'aggregator' )
            // InternalScml.g:7538:2: 'aggregator'
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatorKeyword_6()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getAggregatorKeyword_6()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__6__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__7"
    // InternalScml.g:7547:1: rule__AggregatedValue__Group__7 : rule__AggregatedValue__Group__7__Impl rule__AggregatedValue__Group__8 ;
    public final void rule__AggregatedValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7551:1: ( rule__AggregatedValue__Group__7__Impl rule__AggregatedValue__Group__8 )
            // InternalScml.g:7552:2: rule__AggregatedValue__Group__7__Impl rule__AggregatedValue__Group__8
            {
            pushFollow(FOLLOW_52);
            rule__AggregatedValue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__8();

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
    // $ANTLR end "rule__AggregatedValue__Group__7"


    // $ANTLR start "rule__AggregatedValue__Group__7__Impl"
    // InternalScml.g:7559:1: rule__AggregatedValue__Group__7__Impl : ( ( rule__AggregatedValue__AggregatorAssignment_7 ) ) ;
    public final void rule__AggregatedValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7563:1: ( ( ( rule__AggregatedValue__AggregatorAssignment_7 ) ) )
            // InternalScml.g:7564:1: ( ( rule__AggregatedValue__AggregatorAssignment_7 ) )
            {
            // InternalScml.g:7564:1: ( ( rule__AggregatedValue__AggregatorAssignment_7 ) )
            // InternalScml.g:7565:2: ( rule__AggregatedValue__AggregatorAssignment_7 )
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatorAssignment_7()); 
            // InternalScml.g:7566:2: ( rule__AggregatedValue__AggregatorAssignment_7 )
            // InternalScml.g:7566:3: rule__AggregatedValue__AggregatorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__AggregatorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedValueAccess().getAggregatorAssignment_7()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__7__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__8"
    // InternalScml.g:7574:1: rule__AggregatedValue__Group__8 : rule__AggregatedValue__Group__8__Impl rule__AggregatedValue__Group__9 ;
    public final void rule__AggregatedValue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7578:1: ( rule__AggregatedValue__Group__8__Impl rule__AggregatedValue__Group__9 )
            // InternalScml.g:7579:2: rule__AggregatedValue__Group__8__Impl rule__AggregatedValue__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__AggregatedValue__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__9();

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
    // $ANTLR end "rule__AggregatedValue__Group__8"


    // $ANTLR start "rule__AggregatedValue__Group__8__Impl"
    // InternalScml.g:7586:1: rule__AggregatedValue__Group__8__Impl : ( 'aggregatedTime' ) ;
    public final void rule__AggregatedValue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7590:1: ( ( 'aggregatedTime' ) )
            // InternalScml.g:7591:1: ( 'aggregatedTime' )
            {
            // InternalScml.g:7591:1: ( 'aggregatedTime' )
            // InternalScml.g:7592:2: 'aggregatedTime'
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatedTimeKeyword_8()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getAggregatedTimeKeyword_8()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__8__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__9"
    // InternalScml.g:7601:1: rule__AggregatedValue__Group__9 : rule__AggregatedValue__Group__9__Impl rule__AggregatedValue__Group__10 ;
    public final void rule__AggregatedValue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7605:1: ( rule__AggregatedValue__Group__9__Impl rule__AggregatedValue__Group__10 )
            // InternalScml.g:7606:2: rule__AggregatedValue__Group__9__Impl rule__AggregatedValue__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__AggregatedValue__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__10();

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
    // $ANTLR end "rule__AggregatedValue__Group__9"


    // $ANTLR start "rule__AggregatedValue__Group__9__Impl"
    // InternalScml.g:7613:1: rule__AggregatedValue__Group__9__Impl : ( ( rule__AggregatedValue__AggregatedTimeAssignment_9 ) ) ;
    public final void rule__AggregatedValue__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7617:1: ( ( ( rule__AggregatedValue__AggregatedTimeAssignment_9 ) ) )
            // InternalScml.g:7618:1: ( ( rule__AggregatedValue__AggregatedTimeAssignment_9 ) )
            {
            // InternalScml.g:7618:1: ( ( rule__AggregatedValue__AggregatedTimeAssignment_9 ) )
            // InternalScml.g:7619:2: ( rule__AggregatedValue__AggregatedTimeAssignment_9 )
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatedTimeAssignment_9()); 
            // InternalScml.g:7620:2: ( rule__AggregatedValue__AggregatedTimeAssignment_9 )
            // InternalScml.g:7620:3: rule__AggregatedValue__AggregatedTimeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__AggregatedTimeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAggregatedValueAccess().getAggregatedTimeAssignment_9()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__9__Impl"


    // $ANTLR start "rule__AggregatedValue__Group__10"
    // InternalScml.g:7628:1: rule__AggregatedValue__Group__10 : rule__AggregatedValue__Group__10__Impl ;
    public final void rule__AggregatedValue__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7632:1: ( rule__AggregatedValue__Group__10__Impl )
            // InternalScml.g:7633:2: rule__AggregatedValue__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AggregatedValue__Group__10__Impl();

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
    // $ANTLR end "rule__AggregatedValue__Group__10"


    // $ANTLR start "rule__AggregatedValue__Group__10__Impl"
    // InternalScml.g:7639:1: rule__AggregatedValue__Group__10__Impl : ( '}' ) ;
    public final void rule__AggregatedValue__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7643:1: ( ( '}' ) )
            // InternalScml.g:7644:1: ( '}' )
            {
            // InternalScml.g:7644:1: ( '}' )
            // InternalScml.g:7645:2: '}'
            {
             before(grammarAccess.getAggregatedValueAccess().getRightCurlyBracketKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAggregatedValueAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__AggregatedValue__Group__10__Impl"


    // $ANTLR start "rule__Basis__Group__0"
    // InternalScml.g:7655:1: rule__Basis__Group__0 : rule__Basis__Group__0__Impl rule__Basis__Group__1 ;
    public final void rule__Basis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7659:1: ( rule__Basis__Group__0__Impl rule__Basis__Group__1 )
            // InternalScml.g:7660:2: rule__Basis__Group__0__Impl rule__Basis__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Basis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__1();

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
    // $ANTLR end "rule__Basis__Group__0"


    // $ANTLR start "rule__Basis__Group__0__Impl"
    // InternalScml.g:7667:1: rule__Basis__Group__0__Impl : ( 'Basis' ) ;
    public final void rule__Basis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7671:1: ( ( 'Basis' ) )
            // InternalScml.g:7672:1: ( 'Basis' )
            {
            // InternalScml.g:7672:1: ( 'Basis' )
            // InternalScml.g:7673:2: 'Basis'
            {
             before(grammarAccess.getBasisAccess().getBasisKeyword_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getBasisKeyword_0()); 

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
    // $ANTLR end "rule__Basis__Group__0__Impl"


    // $ANTLR start "rule__Basis__Group__1"
    // InternalScml.g:7682:1: rule__Basis__Group__1 : rule__Basis__Group__1__Impl rule__Basis__Group__2 ;
    public final void rule__Basis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7686:1: ( rule__Basis__Group__1__Impl rule__Basis__Group__2 )
            // InternalScml.g:7687:2: rule__Basis__Group__1__Impl rule__Basis__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Basis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__2();

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
    // $ANTLR end "rule__Basis__Group__1"


    // $ANTLR start "rule__Basis__Group__1__Impl"
    // InternalScml.g:7694:1: rule__Basis__Group__1__Impl : ( '{' ) ;
    public final void rule__Basis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7698:1: ( ( '{' ) )
            // InternalScml.g:7699:1: ( '{' )
            {
            // InternalScml.g:7699:1: ( '{' )
            // InternalScml.g:7700:2: '{'
            {
             before(grammarAccess.getBasisAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Basis__Group__1__Impl"


    // $ANTLR start "rule__Basis__Group__2"
    // InternalScml.g:7709:1: rule__Basis__Group__2 : rule__Basis__Group__2__Impl rule__Basis__Group__3 ;
    public final void rule__Basis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7713:1: ( rule__Basis__Group__2__Impl rule__Basis__Group__3 )
            // InternalScml.g:7714:2: rule__Basis__Group__2__Impl rule__Basis__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Basis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__3();

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
    // $ANTLR end "rule__Basis__Group__2"


    // $ANTLR start "rule__Basis__Group__2__Impl"
    // InternalScml.g:7721:1: rule__Basis__Group__2__Impl : ( 'description' ) ;
    public final void rule__Basis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7725:1: ( ( 'description' ) )
            // InternalScml.g:7726:1: ( 'description' )
            {
            // InternalScml.g:7726:1: ( 'description' )
            // InternalScml.g:7727:2: 'description'
            {
             before(grammarAccess.getBasisAccess().getDescriptionKeyword_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getDescriptionKeyword_2()); 

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
    // $ANTLR end "rule__Basis__Group__2__Impl"


    // $ANTLR start "rule__Basis__Group__3"
    // InternalScml.g:7736:1: rule__Basis__Group__3 : rule__Basis__Group__3__Impl rule__Basis__Group__4 ;
    public final void rule__Basis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7740:1: ( rule__Basis__Group__3__Impl rule__Basis__Group__4 )
            // InternalScml.g:7741:2: rule__Basis__Group__3__Impl rule__Basis__Group__4
            {
            pushFollow(FOLLOW_54);
            rule__Basis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__4();

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
    // $ANTLR end "rule__Basis__Group__3"


    // $ANTLR start "rule__Basis__Group__3__Impl"
    // InternalScml.g:7748:1: rule__Basis__Group__3__Impl : ( ( rule__Basis__DescriptionAssignment_3 ) ) ;
    public final void rule__Basis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7752:1: ( ( ( rule__Basis__DescriptionAssignment_3 ) ) )
            // InternalScml.g:7753:1: ( ( rule__Basis__DescriptionAssignment_3 ) )
            {
            // InternalScml.g:7753:1: ( ( rule__Basis__DescriptionAssignment_3 ) )
            // InternalScml.g:7754:2: ( rule__Basis__DescriptionAssignment_3 )
            {
             before(grammarAccess.getBasisAccess().getDescriptionAssignment_3()); 
            // InternalScml.g:7755:2: ( rule__Basis__DescriptionAssignment_3 )
            // InternalScml.g:7755:3: rule__Basis__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Basis__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasisAccess().getDescriptionAssignment_3()); 

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
    // $ANTLR end "rule__Basis__Group__3__Impl"


    // $ANTLR start "rule__Basis__Group__4"
    // InternalScml.g:7763:1: rule__Basis__Group__4 : rule__Basis__Group__4__Impl rule__Basis__Group__5 ;
    public final void rule__Basis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7767:1: ( rule__Basis__Group__4__Impl rule__Basis__Group__5 )
            // InternalScml.g:7768:2: rule__Basis__Group__4__Impl rule__Basis__Group__5
            {
            pushFollow(FOLLOW_55);
            rule__Basis__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__5();

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
    // $ANTLR end "rule__Basis__Group__4"


    // $ANTLR start "rule__Basis__Group__4__Impl"
    // InternalScml.g:7775:1: rule__Basis__Group__4__Impl : ( 'principleType' ) ;
    public final void rule__Basis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7779:1: ( ( 'principleType' ) )
            // InternalScml.g:7780:1: ( 'principleType' )
            {
            // InternalScml.g:7780:1: ( 'principleType' )
            // InternalScml.g:7781:2: 'principleType'
            {
             before(grammarAccess.getBasisAccess().getPrincipleTypeKeyword_4()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getPrincipleTypeKeyword_4()); 

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
    // $ANTLR end "rule__Basis__Group__4__Impl"


    // $ANTLR start "rule__Basis__Group__5"
    // InternalScml.g:7790:1: rule__Basis__Group__5 : rule__Basis__Group__5__Impl rule__Basis__Group__6 ;
    public final void rule__Basis__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7794:1: ( rule__Basis__Group__5__Impl rule__Basis__Group__6 )
            // InternalScml.g:7795:2: rule__Basis__Group__5__Impl rule__Basis__Group__6
            {
            pushFollow(FOLLOW_56);
            rule__Basis__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__6();

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
    // $ANTLR end "rule__Basis__Group__5"


    // $ANTLR start "rule__Basis__Group__5__Impl"
    // InternalScml.g:7802:1: rule__Basis__Group__5__Impl : ( ( rule__Basis__PrincipleTypeAssignment_5 ) ) ;
    public final void rule__Basis__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7806:1: ( ( ( rule__Basis__PrincipleTypeAssignment_5 ) ) )
            // InternalScml.g:7807:1: ( ( rule__Basis__PrincipleTypeAssignment_5 ) )
            {
            // InternalScml.g:7807:1: ( ( rule__Basis__PrincipleTypeAssignment_5 ) )
            // InternalScml.g:7808:2: ( rule__Basis__PrincipleTypeAssignment_5 )
            {
             before(grammarAccess.getBasisAccess().getPrincipleTypeAssignment_5()); 
            // InternalScml.g:7809:2: ( rule__Basis__PrincipleTypeAssignment_5 )
            // InternalScml.g:7809:3: rule__Basis__PrincipleTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Basis__PrincipleTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBasisAccess().getPrincipleTypeAssignment_5()); 

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
    // $ANTLR end "rule__Basis__Group__5__Impl"


    // $ANTLR start "rule__Basis__Group__6"
    // InternalScml.g:7817:1: rule__Basis__Group__6 : rule__Basis__Group__6__Impl rule__Basis__Group__7 ;
    public final void rule__Basis__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7821:1: ( rule__Basis__Group__6__Impl rule__Basis__Group__7 )
            // InternalScml.g:7822:2: rule__Basis__Group__6__Impl rule__Basis__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Basis__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__7();

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
    // $ANTLR end "rule__Basis__Group__6"


    // $ANTLR start "rule__Basis__Group__6__Impl"
    // InternalScml.g:7829:1: rule__Basis__Group__6__Impl : ( 'source' ) ;
    public final void rule__Basis__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7833:1: ( ( 'source' ) )
            // InternalScml.g:7834:1: ( 'source' )
            {
            // InternalScml.g:7834:1: ( 'source' )
            // InternalScml.g:7835:2: 'source'
            {
             before(grammarAccess.getBasisAccess().getSourceKeyword_6()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getSourceKeyword_6()); 

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
    // $ANTLR end "rule__Basis__Group__6__Impl"


    // $ANTLR start "rule__Basis__Group__7"
    // InternalScml.g:7844:1: rule__Basis__Group__7 : rule__Basis__Group__7__Impl rule__Basis__Group__8 ;
    public final void rule__Basis__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7848:1: ( rule__Basis__Group__7__Impl rule__Basis__Group__8 )
            // InternalScml.g:7849:2: rule__Basis__Group__7__Impl rule__Basis__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Basis__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Basis__Group__8();

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
    // $ANTLR end "rule__Basis__Group__7"


    // $ANTLR start "rule__Basis__Group__7__Impl"
    // InternalScml.g:7856:1: rule__Basis__Group__7__Impl : ( ( rule__Basis__SourceAssignment_7 ) ) ;
    public final void rule__Basis__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7860:1: ( ( ( rule__Basis__SourceAssignment_7 ) ) )
            // InternalScml.g:7861:1: ( ( rule__Basis__SourceAssignment_7 ) )
            {
            // InternalScml.g:7861:1: ( ( rule__Basis__SourceAssignment_7 ) )
            // InternalScml.g:7862:2: ( rule__Basis__SourceAssignment_7 )
            {
             before(grammarAccess.getBasisAccess().getSourceAssignment_7()); 
            // InternalScml.g:7863:2: ( rule__Basis__SourceAssignment_7 )
            // InternalScml.g:7863:3: rule__Basis__SourceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Basis__SourceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBasisAccess().getSourceAssignment_7()); 

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
    // $ANTLR end "rule__Basis__Group__7__Impl"


    // $ANTLR start "rule__Basis__Group__8"
    // InternalScml.g:7871:1: rule__Basis__Group__8 : rule__Basis__Group__8__Impl ;
    public final void rule__Basis__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7875:1: ( rule__Basis__Group__8__Impl )
            // InternalScml.g:7876:2: rule__Basis__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Basis__Group__8__Impl();

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
    // $ANTLR end "rule__Basis__Group__8"


    // $ANTLR start "rule__Basis__Group__8__Impl"
    // InternalScml.g:7882:1: rule__Basis__Group__8__Impl : ( '}' ) ;
    public final void rule__Basis__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7886:1: ( ( '}' ) )
            // InternalScml.g:7887:1: ( '}' )
            {
            // InternalScml.g:7887:1: ( '}' )
            // InternalScml.g:7888:2: '}'
            {
             before(grammarAccess.getBasisAccess().getRightCurlyBracketKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBasisAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Basis__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalScml.g:7898:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7902:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalScml.g:7903:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalScml.g:7910:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7914:1: ( ( 'Sensor' ) )
            // InternalScml.g:7915:1: ( 'Sensor' )
            {
            // InternalScml.g:7915:1: ( 'Sensor' )
            // InternalScml.g:7916:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

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
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalScml.g:7925:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7929:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalScml.g:7930:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalScml.g:7937:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7941:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalScml.g:7942:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalScml.g:7942:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalScml.g:7943:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalScml.g:7944:2: ( rule__Sensor__NameAssignment_1 )
            // InternalScml.g:7944:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalScml.g:7952:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7956:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalScml.g:7957:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

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
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalScml.g:7964:1: rule__Sensor__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7968:1: ( ( '{' ) )
            // InternalScml.g:7969:1: ( '{' )
            {
            // InternalScml.g:7969:1: ( '{' )
            // InternalScml.g:7970:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalScml.g:7979:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7983:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalScml.g:7984:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

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
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalScml.g:7991:1: rule__Sensor__Group__3__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:7995:1: ( ( 'type' ) )
            // InternalScml.g:7996:1: ( 'type' )
            {
            // InternalScml.g:7996:1: ( 'type' )
            // InternalScml.g:7997:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalScml.g:8006:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8010:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalScml.g:8011:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

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
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalScml.g:8018:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__TypeAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8022:1: ( ( ( rule__Sensor__TypeAssignment_4 ) ) )
            // InternalScml.g:8023:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            {
            // InternalScml.g:8023:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            // InternalScml.g:8024:2: ( rule__Sensor__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            // InternalScml.g:8025:2: ( rule__Sensor__TypeAssignment_4 )
            // InternalScml.g:8025:3: rule__Sensor__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalScml.g:8033:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8037:1: ( rule__Sensor__Group__5__Impl )
            // InternalScml.g:8038:2: rule__Sensor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5__Impl();

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
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalScml.g:8044:1: rule__Sensor__Group__5__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8048:1: ( ( '}' ) )
            // InternalScml.g:8049:1: ( '}' )
            {
            // InternalScml.g:8049:1: ( '}' )
            // InternalScml.g:8050:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalScml.g:8060:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8064:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalScml.g:8065:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

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
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalScml.g:8072:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8076:1: ( ( 'Actuator' ) )
            // InternalScml.g:8077:1: ( 'Actuator' )
            {
            // InternalScml.g:8077:1: ( 'Actuator' )
            // InternalScml.g:8078:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 

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
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalScml.g:8087:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8091:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // InternalScml.g:8092:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__2();

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
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalScml.g:8099:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8103:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // InternalScml.g:8104:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // InternalScml.g:8104:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // InternalScml.g:8105:2: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // InternalScml.g:8106:2: ( rule__Actuator__NameAssignment_1 )
            // InternalScml.g:8106:3: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // InternalScml.g:8114:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8118:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // InternalScml.g:8119:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__3();

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
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // InternalScml.g:8126:1: rule__Actuator__Group__2__Impl : ( '{' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8130:1: ( ( '{' ) )
            // InternalScml.g:8131:1: ( '{' )
            {
            // InternalScml.g:8131:1: ( '{' )
            // InternalScml.g:8132:2: '{'
            {
             before(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // InternalScml.g:8141:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8145:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // InternalScml.g:8146:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4();

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
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // InternalScml.g:8153:1: rule__Actuator__Group__3__Impl : ( 'type' ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8157:1: ( ( 'type' ) )
            // InternalScml.g:8158:1: ( 'type' )
            {
            // InternalScml.g:8158:1: ( 'type' )
            // InternalScml.g:8159:2: 'type'
            {
             before(grammarAccess.getActuatorAccess().getTypeKeyword_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__4"
    // InternalScml.g:8168:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl rule__Actuator__Group__5 ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8172:1: ( rule__Actuator__Group__4__Impl rule__Actuator__Group__5 )
            // InternalScml.g:8173:2: rule__Actuator__Group__4__Impl rule__Actuator__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Actuator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__5();

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
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // InternalScml.g:8180:1: rule__Actuator__Group__4__Impl : ( ( rule__Actuator__TypeAssignment_4 ) ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8184:1: ( ( ( rule__Actuator__TypeAssignment_4 ) ) )
            // InternalScml.g:8185:1: ( ( rule__Actuator__TypeAssignment_4 ) )
            {
            // InternalScml.g:8185:1: ( ( rule__Actuator__TypeAssignment_4 ) )
            // InternalScml.g:8186:2: ( rule__Actuator__TypeAssignment_4 )
            {
             before(grammarAccess.getActuatorAccess().getTypeAssignment_4()); 
            // InternalScml.g:8187:2: ( rule__Actuator__TypeAssignment_4 )
            // InternalScml.g:8187:3: rule__Actuator__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group__5"
    // InternalScml.g:8195:1: rule__Actuator__Group__5 : rule__Actuator__Group__5__Impl ;
    public final void rule__Actuator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8199:1: ( rule__Actuator__Group__5__Impl )
            // InternalScml.g:8200:2: rule__Actuator__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__5__Impl();

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
    // $ANTLR end "rule__Actuator__Group__5"


    // $ANTLR start "rule__Actuator__Group__5__Impl"
    // InternalScml.g:8206:1: rule__Actuator__Group__5__Impl : ( '}' ) ;
    public final void rule__Actuator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8210:1: ( ( '}' ) )
            // InternalScml.g:8211:1: ( '}' )
            {
            // InternalScml.g:8211:1: ( '}' )
            // InternalScml.g:8212:2: '}'
            {
             before(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Actuator__Group__5__Impl"


    // $ANTLR start "rule__SmartCity__NameAssignment_2"
    // InternalScml.g:8222:1: rule__SmartCity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SmartCity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8226:1: ( ( ruleEString ) )
            // InternalScml.g:8227:2: ( ruleEString )
            {
            // InternalScml.g:8227:2: ( ruleEString )
            // InternalScml.g:8228:3: ruleEString
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


    // $ANTLR start "rule__SmartCity__CategoryAssignment_4_2"
    // InternalScml.g:8237:1: rule__SmartCity__CategoryAssignment_4_2 : ( ruleCategory ) ;
    public final void rule__SmartCity__CategoryAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8241:1: ( ( ruleCategory ) )
            // InternalScml.g:8242:2: ( ruleCategory )
            {
            // InternalScml.g:8242:2: ( ruleCategory )
            // InternalScml.g:8243:3: ruleCategory
            {
             before(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__SmartCity__CategoryAssignment_4_2"


    // $ANTLR start "rule__SmartCity__CategoryAssignment_4_3_1"
    // InternalScml.g:8252:1: rule__SmartCity__CategoryAssignment_4_3_1 : ( ruleCategory ) ;
    public final void rule__SmartCity__CategoryAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8256:1: ( ( ruleCategory ) )
            // InternalScml.g:8257:2: ( ruleCategory )
            {
            // InternalScml.g:8257:2: ( ruleCategory )
            // InternalScml.g:8258:3: ruleCategory
            {
             before(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getSmartCityAccess().getCategoryCategoryParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__SmartCity__CategoryAssignment_4_3_1"


    // $ANTLR start "rule__SmartCity__ProjectAssignment_5_2"
    // InternalScml.g:8267:1: rule__SmartCity__ProjectAssignment_5_2 : ( ruleProject ) ;
    public final void rule__SmartCity__ProjectAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8271:1: ( ( ruleProject ) )
            // InternalScml.g:8272:2: ( ruleProject )
            {
            // InternalScml.g:8272:2: ( ruleProject )
            // InternalScml.g:8273:3: ruleProject
            {
             before(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__SmartCity__ProjectAssignment_5_2"


    // $ANTLR start "rule__SmartCity__ProjectAssignment_5_3_1"
    // InternalScml.g:8282:1: rule__SmartCity__ProjectAssignment_5_3_1 : ( ruleProject ) ;
    public final void rule__SmartCity__ProjectAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8286:1: ( ( ruleProject ) )
            // InternalScml.g:8287:2: ( ruleProject )
            {
            // InternalScml.g:8287:2: ( ruleProject )
            // InternalScml.g:8288:3: ruleProject
            {
             before(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getSmartCityAccess().getProjectProjectParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__SmartCity__ProjectAssignment_5_3_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalScml.g:8297:1: rule__Category__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8301:1: ( ( ruleEString ) )
            // InternalScml.g:8302:2: ( ruleEString )
            {
            // InternalScml.g:8302:2: ( ruleEString )
            // InternalScml.g:8303:3: ruleEString
            {
             before(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Category__SDGAssignment_5"
    // InternalScml.g:8312:1: rule__Category__SDGAssignment_5 : ( ruleEInt ) ;
    public final void rule__Category__SDGAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8316:1: ( ( ruleEInt ) )
            // InternalScml.g:8317:2: ( ruleEInt )
            {
            // InternalScml.g:8317:2: ( ruleEInt )
            // InternalScml.g:8318:3: ruleEInt
            {
             before(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Category__SDGAssignment_5"


    // $ANTLR start "rule__Category__SDGAssignment_6_1"
    // InternalScml.g:8327:1: rule__Category__SDGAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Category__SDGAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8331:1: ( ( ruleEInt ) )
            // InternalScml.g:8332:2: ( ruleEInt )
            {
            // InternalScml.g:8332:2: ( ruleEInt )
            // InternalScml.g:8333:3: ruleEInt
            {
             before(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getSDGEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Category__SDGAssignment_6_1"


    // $ANTLR start "rule__Project__NameAssignment_2"
    // InternalScml.g:8342:1: rule__Project__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Project__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8346:1: ( ( ruleEString ) )
            // InternalScml.g:8347:2: ( ruleEString )
            {
            // InternalScml.g:8347:2: ( ruleEString )
            // InternalScml.g:8348:3: ruleEString
            {
             before(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Project__NameAssignment_2"


    // $ANTLR start "rule__Project__CategoryAssignment_4_2"
    // InternalScml.g:8357:1: rule__Project__CategoryAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Project__CategoryAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8361:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8362:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8362:2: ( ( ruleEString ) )
            // InternalScml.g:8363:3: ( ruleEString )
            {
             before(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_2_0()); 
            // InternalScml.g:8364:3: ( ruleEString )
            // InternalScml.g:8365:4: ruleEString
            {
             before(grammarAccess.getProjectAccess().getCategoryCategoryEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getCategoryCategoryEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Project__CategoryAssignment_4_2"


    // $ANTLR start "rule__Project__CategoryAssignment_4_3_1"
    // InternalScml.g:8376:1: rule__Project__CategoryAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Project__CategoryAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8380:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8381:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8381:2: ( ( ruleEString ) )
            // InternalScml.g:8382:3: ( ruleEString )
            {
             before(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_3_1_0()); 
            // InternalScml.g:8383:3: ( ruleEString )
            // InternalScml.g:8384:4: ruleEString
            {
             before(grammarAccess.getProjectAccess().getCategoryCategoryEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getCategoryCategoryEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getCategoryCategoryCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__Project__CategoryAssignment_4_3_1"


    // $ANTLR start "rule__Project__ComponentAssignment_5_2"
    // InternalScml.g:8395:1: rule__Project__ComponentAssignment_5_2 : ( ruleInfrastructureComponent ) ;
    public final void rule__Project__ComponentAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8399:1: ( ( ruleInfrastructureComponent ) )
            // InternalScml.g:8400:2: ( ruleInfrastructureComponent )
            {
            // InternalScml.g:8400:2: ( ruleInfrastructureComponent )
            // InternalScml.g:8401:3: ruleInfrastructureComponent
            {
             before(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInfrastructureComponent();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Project__ComponentAssignment_5_2"


    // $ANTLR start "rule__Project__ComponentAssignment_5_3_1"
    // InternalScml.g:8410:1: rule__Project__ComponentAssignment_5_3_1 : ( ruleInfrastructureComponent ) ;
    public final void rule__Project__ComponentAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8414:1: ( ( ruleInfrastructureComponent ) )
            // InternalScml.g:8415:2: ( ruleInfrastructureComponent )
            {
            // InternalScml.g:8415:2: ( ruleInfrastructureComponent )
            // InternalScml.g:8416:3: ruleInfrastructureComponent
            {
             before(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInfrastructureComponent();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getComponentInfrastructureComponentParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Project__ComponentAssignment_5_3_1"


    // $ANTLR start "rule__Project__IndicatorAssignment_6_2"
    // InternalScml.g:8425:1: rule__Project__IndicatorAssignment_6_2 : ( ruleKPIMeasurementDevice ) ;
    public final void rule__Project__IndicatorAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8429:1: ( ( ruleKPIMeasurementDevice ) )
            // InternalScml.g:8430:2: ( ruleKPIMeasurementDevice )
            {
            // InternalScml.g:8430:2: ( ruleKPIMeasurementDevice )
            // InternalScml.g:8431:3: ruleKPIMeasurementDevice
            {
             before(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleKPIMeasurementDevice();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Project__IndicatorAssignment_6_2"


    // $ANTLR start "rule__Project__IndicatorAssignment_6_3_1"
    // InternalScml.g:8440:1: rule__Project__IndicatorAssignment_6_3_1 : ( ruleKPIMeasurementDevice ) ;
    public final void rule__Project__IndicatorAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8444:1: ( ( ruleKPIMeasurementDevice ) )
            // InternalScml.g:8445:2: ( ruleKPIMeasurementDevice )
            {
            // InternalScml.g:8445:2: ( ruleKPIMeasurementDevice )
            // InternalScml.g:8446:3: ruleKPIMeasurementDevice
            {
             before(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleKPIMeasurementDevice();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getIndicatorKPIMeasurementDeviceParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Project__IndicatorAssignment_6_3_1"


    // $ANTLR start "rule__KPIMeasurementDevice__NameAssignment_1"
    // InternalScml.g:8455:1: rule__KPIMeasurementDevice__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__KPIMeasurementDevice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8459:1: ( ( ruleEString ) )
            // InternalScml.g:8460:2: ( ruleEString )
            {
            // InternalScml.g:8460:2: ( ruleEString )
            // InternalScml.g:8461:3: ruleEString
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__NameAssignment_1"


    // $ANTLR start "rule__KPIMeasurementDevice__StatusAssignment_4"
    // InternalScml.g:8470:1: rule__KPIMeasurementDevice__StatusAssignment_4 : ( ruleStatus ) ;
    public final void rule__KPIMeasurementDevice__StatusAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8474:1: ( ( ruleStatus ) )
            // InternalScml.g:8475:2: ( ruleStatus )
            {
            // InternalScml.g:8475:2: ( ruleStatus )
            // InternalScml.g:8476:3: ruleStatus
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getStatusStatusEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatus();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getStatusStatusEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__StatusAssignment_4"


    // $ANTLR start "rule__KPIMeasurementDevice__LastCalculationAssignment_5_2"
    // InternalScml.g:8485:1: rule__KPIMeasurementDevice__LastCalculationAssignment_5_2 : ( ruleEString ) ;
    public final void rule__KPIMeasurementDevice__LastCalculationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8489:1: ( ( ruleEString ) )
            // InternalScml.g:8490:2: ( ruleEString )
            {
            // InternalScml.g:8490:2: ( ruleEString )
            // InternalScml.g:8491:3: ruleEString
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__LastCalculationAssignment_5_2"


    // $ANTLR start "rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1"
    // InternalScml.g:8500:1: rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1 : ( ruleEString ) ;
    public final void rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8504:1: ( ( ruleEString ) )
            // InternalScml.g:8505:2: ( ruleEString )
            {
            // InternalScml.g:8505:2: ( ruleEString )
            // InternalScml.g:8506:3: ruleEString
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getLastCalculationEStringParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__LastCalculationAssignment_5_3_1"


    // $ANTLR start "rule__KPIMeasurementDevice__NextCalculationAssignment_7"
    // InternalScml.g:8515:1: rule__KPIMeasurementDevice__NextCalculationAssignment_7 : ( ruleEString ) ;
    public final void rule__KPIMeasurementDevice__NextCalculationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8519:1: ( ( ruleEString ) )
            // InternalScml.g:8520:2: ( ruleEString )
            {
            // InternalScml.g:8520:2: ( ruleEString )
            // InternalScml.g:8521:3: ruleEString
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getNextCalculationEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__NextCalculationAssignment_7"


    // $ANTLR start "rule__KPIMeasurementDevice__ParameterAssignment_8_1"
    // InternalScml.g:8530:1: rule__KPIMeasurementDevice__ParameterAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__KPIMeasurementDevice__ParameterAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8534:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8535:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8535:2: ( ( ruleEString ) )
            // InternalScml.g:8536:3: ( ruleEString )
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getParameterParameterCrossReference_8_1_0()); 
            // InternalScml.g:8537:3: ( ruleEString )
            // InternalScml.g:8538:4: ruleEString
            {
             before(grammarAccess.getKPIMeasurementDeviceAccess().getParameterParameterEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKPIMeasurementDeviceAccess().getParameterParameterEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getKPIMeasurementDeviceAccess().getParameterParameterCrossReference_8_1_0()); 

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
    // $ANTLR end "rule__KPIMeasurementDevice__ParameterAssignment_8_1"


    // $ANTLR start "rule__Location__LatAssignment_3"
    // InternalScml.g:8549:1: rule__Location__LatAssignment_3 : ( ruleEFloat ) ;
    public final void rule__Location__LatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8553:1: ( ( ruleEFloat ) )
            // InternalScml.g:8554:2: ( ruleEFloat )
            {
            // InternalScml.g:8554:2: ( ruleEFloat )
            // InternalScml.g:8555:3: ruleEFloat
            {
             before(grammarAccess.getLocationAccess().getLatEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLatEFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Location__LatAssignment_3"


    // $ANTLR start "rule__Location__LongAssignment_5"
    // InternalScml.g:8564:1: rule__Location__LongAssignment_5 : ( ruleEFloat ) ;
    public final void rule__Location__LongAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8568:1: ( ( ruleEFloat ) )
            // InternalScml.g:8569:2: ( ruleEFloat )
            {
            // InternalScml.g:8569:2: ( ruleEFloat )
            // InternalScml.g:8570:3: ruleEFloat
            {
             before(grammarAccess.getLocationAccess().getLongEFloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLongEFloatParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Location__LongAssignment_5"


    // $ANTLR start "rule__DataValue__CollectedAssignment_0"
    // InternalScml.g:8579:1: rule__DataValue__CollectedAssignment_0 : ( ( 'collected' ) ) ;
    public final void rule__DataValue__CollectedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8583:1: ( ( ( 'collected' ) ) )
            // InternalScml.g:8584:2: ( ( 'collected' ) )
            {
            // InternalScml.g:8584:2: ( ( 'collected' ) )
            // InternalScml.g:8585:3: ( 'collected' )
            {
             before(grammarAccess.getDataValueAccess().getCollectedCollectedKeyword_0_0()); 
            // InternalScml.g:8586:3: ( 'collected' )
            // InternalScml.g:8587:4: 'collected'
            {
             before(grammarAccess.getDataValueAccess().getCollectedCollectedKeyword_0_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getDataValueAccess().getCollectedCollectedKeyword_0_0()); 

            }

             after(grammarAccess.getDataValueAccess().getCollectedCollectedKeyword_0_0()); 

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
    // $ANTLR end "rule__DataValue__CollectedAssignment_0"


    // $ANTLR start "rule__DataValue__TypeAssignment_4"
    // InternalScml.g:8598:1: rule__DataValue__TypeAssignment_4 : ( ruleDataType ) ;
    public final void rule__DataValue__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8602:1: ( ( ruleDataType ) )
            // InternalScml.g:8603:2: ( ruleDataType )
            {
            // InternalScml.g:8603:2: ( ruleDataType )
            // InternalScml.g:8604:3: ruleDataType
            {
             before(grammarAccess.getDataValueAccess().getTypeDataTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getTypeDataTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__DataValue__TypeAssignment_4"


    // $ANTLR start "rule__DataValue__ValueAssignment_6"
    // InternalScml.g:8613:1: rule__DataValue__ValueAssignment_6 : ( ruleEString ) ;
    public final void rule__DataValue__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8617:1: ( ( ruleEString ) )
            // InternalScml.g:8618:2: ( ruleEString )
            {
            // InternalScml.g:8618:2: ( ruleEString )
            // InternalScml.g:8619:3: ruleEString
            {
             before(grammarAccess.getDataValueAccess().getValueEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getValueEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DataValue__ValueAssignment_6"


    // $ANTLR start "rule__DataValue__ProducedTimeAssignment_8"
    // InternalScml.g:8628:1: rule__DataValue__ProducedTimeAssignment_8 : ( ruleEString ) ;
    public final void rule__DataValue__ProducedTimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8632:1: ( ( ruleEString ) )
            // InternalScml.g:8633:2: ( ruleEString )
            {
            // InternalScml.g:8633:2: ( ruleEString )
            // InternalScml.g:8634:3: ruleEString
            {
             before(grammarAccess.getDataValueAccess().getProducedTimeEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getProducedTimeEStringParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__DataValue__ProducedTimeAssignment_8"


    // $ANTLR start "rule__DataValue__ConsumedTimeAssignment_9_1"
    // InternalScml.g:8643:1: rule__DataValue__ConsumedTimeAssignment_9_1 : ( ruleEString ) ;
    public final void rule__DataValue__ConsumedTimeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8647:1: ( ( ruleEString ) )
            // InternalScml.g:8648:2: ( ruleEString )
            {
            // InternalScml.g:8648:2: ( ruleEString )
            // InternalScml.g:8649:3: ruleEString
            {
             before(grammarAccess.getDataValueAccess().getConsumedTimeEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataValueAccess().getConsumedTimeEStringParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__DataValue__ConsumedTimeAssignment_9_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalScml.g:8658:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8662:1: ( ( ruleEString ) )
            // InternalScml.g:8663:2: ( ruleEString )
            {
            // InternalScml.g:8663:2: ( ruleEString )
            // InternalScml.g:8664:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__UnitAssignment_4"
    // InternalScml.g:8673:1: rule__Parameter__UnitAssignment_4 : ( ruleEString ) ;
    public final void rule__Parameter__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8677:1: ( ( ruleEString ) )
            // InternalScml.g:8678:2: ( ruleEString )
            {
            // InternalScml.g:8678:2: ( ruleEString )
            // InternalScml.g:8679:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getUnitEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getUnitEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Parameter__UnitAssignment_4"


    // $ANTLR start "rule__Parameter__TypeAssignment_6"
    // InternalScml.g:8688:1: rule__Parameter__TypeAssignment_6 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8692:1: ( ( ruleParameterType ) )
            // InternalScml.g:8693:2: ( ruleParameterType )
            {
            // InternalScml.g:8693:2: ( ruleParameterType )
            // InternalScml.g:8694:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_6"


    // $ANTLR start "rule__Parameter__ComponentAssignment_8"
    // InternalScml.g:8703:1: rule__Parameter__ComponentAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__ComponentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8707:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8708:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8708:2: ( ( ruleEString ) )
            // InternalScml.g:8709:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getComponentInfrastructureComponentCrossReference_8_0()); 
            // InternalScml.g:8710:3: ( ruleEString )
            // InternalScml.g:8711:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getComponentInfrastructureComponentEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getComponentInfrastructureComponentEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getComponentInfrastructureComponentCrossReference_8_0()); 

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
    // $ANTLR end "rule__Parameter__ComponentAssignment_8"


    // $ANTLR start "rule__Parameter__GoalreferencevalueAssignment_10"
    // InternalScml.g:8722:1: rule__Parameter__GoalreferencevalueAssignment_10 : ( ruleGoalReferenceValue ) ;
    public final void rule__Parameter__GoalreferencevalueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8726:1: ( ( ruleGoalReferenceValue ) )
            // InternalScml.g:8727:2: ( ruleGoalReferenceValue )
            {
            // InternalScml.g:8727:2: ( ruleGoalReferenceValue )
            // InternalScml.g:8728:3: ruleGoalReferenceValue
            {
             before(grammarAccess.getParameterAccess().getGoalreferencevalueGoalReferenceValueParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleGoalReferenceValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getGoalreferencevalueGoalReferenceValueParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Parameter__GoalreferencevalueAssignment_10"


    // $ANTLR start "rule__Parameter__ObservedValueAssignment_11_1"
    // InternalScml.g:8737:1: rule__Parameter__ObservedValueAssignment_11_1 : ( ruleAggregatedValue ) ;
    public final void rule__Parameter__ObservedValueAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8741:1: ( ( ruleAggregatedValue ) )
            // InternalScml.g:8742:2: ( ruleAggregatedValue )
            {
            // InternalScml.g:8742:2: ( ruleAggregatedValue )
            // InternalScml.g:8743:3: ruleAggregatedValue
            {
             before(grammarAccess.getParameterAccess().getObservedValueAggregatedValueParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAggregatedValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getObservedValueAggregatedValueParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Parameter__ObservedValueAssignment_11_1"


    // $ANTLR start "rule__BuildingComponent__NameAssignment_1"
    // InternalScml.g:8752:1: rule__BuildingComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BuildingComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8756:1: ( ( ruleEString ) )
            // InternalScml.g:8757:2: ( ruleEString )
            {
            // InternalScml.g:8757:2: ( ruleEString )
            // InternalScml.g:8758:3: ruleEString
            {
             before(grammarAccess.getBuildingComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BuildingComponent__NameAssignment_1"


    // $ANTLR start "rule__BuildingComponent__IsPartOfAssignment_3_1"
    // InternalScml.g:8767:1: rule__BuildingComponent__IsPartOfAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BuildingComponent__IsPartOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8771:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8772:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8772:2: ( ( ruleEString ) )
            // InternalScml.g:8773:3: ( ruleEString )
            {
             before(grammarAccess.getBuildingComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 
            // InternalScml.g:8774:3: ( ruleEString )
            // InternalScml.g:8775:4: ruleEString
            {
             before(grammarAccess.getBuildingComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getBuildingComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__BuildingComponent__IsPartOfAssignment_3_1"


    // $ANTLR start "rule__BuildingComponent__ComposedOfAssignment_4_2"
    // InternalScml.g:8786:1: rule__BuildingComponent__ComposedOfAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__BuildingComponent__ComposedOfAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8790:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8791:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8791:2: ( ( ruleEString ) )
            // InternalScml.g:8792:3: ( ruleEString )
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 
            // InternalScml.g:8793:3: ( ruleEString )
            // InternalScml.g:8794:4: ruleEString
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__BuildingComponent__ComposedOfAssignment_4_2"


    // $ANTLR start "rule__BuildingComponent__ComposedOfAssignment_4_3_1"
    // InternalScml.g:8805:1: rule__BuildingComponent__ComposedOfAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__BuildingComponent__ComposedOfAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8809:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8810:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8810:2: ( ( ruleEString ) )
            // InternalScml.g:8811:3: ( ruleEString )
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 
            // InternalScml.g:8812:3: ( ruleEString )
            // InternalScml.g:8813:4: ruleEString
            {
             before(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getBuildingComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__BuildingComponent__ComposedOfAssignment_4_3_1"


    // $ANTLR start "rule__BuildingComponent__LocationAssignment_6"
    // InternalScml.g:8824:1: rule__BuildingComponent__LocationAssignment_6 : ( ruleLocation ) ;
    public final void rule__BuildingComponent__LocationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8828:1: ( ( ruleLocation ) )
            // InternalScml.g:8829:2: ( ruleLocation )
            {
            // InternalScml.g:8829:2: ( ruleLocation )
            // InternalScml.g:8830:3: ruleLocation
            {
             before(grammarAccess.getBuildingComponentAccess().getLocationLocationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getLocationLocationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__BuildingComponent__LocationAssignment_6"


    // $ANTLR start "rule__BuildingComponent__ProducesAssignment_7_2"
    // InternalScml.g:8839:1: rule__BuildingComponent__ProducesAssignment_7_2 : ( ruleDataValue ) ;
    public final void rule__BuildingComponent__ProducesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8843:1: ( ( ruleDataValue ) )
            // InternalScml.g:8844:2: ( ruleDataValue )
            {
            // InternalScml.g:8844:2: ( ruleDataValue )
            // InternalScml.g:8845:3: ruleDataValue
            {
             before(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__BuildingComponent__ProducesAssignment_7_2"


    // $ANTLR start "rule__BuildingComponent__ProducesAssignment_7_3_1"
    // InternalScml.g:8854:1: rule__BuildingComponent__ProducesAssignment_7_3_1 : ( ruleDataValue ) ;
    public final void rule__BuildingComponent__ProducesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8858:1: ( ( ruleDataValue ) )
            // InternalScml.g:8859:2: ( ruleDataValue )
            {
            // InternalScml.g:8859:2: ( ruleDataValue )
            // InternalScml.g:8860:3: ruleDataValue
            {
             before(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__BuildingComponent__ProducesAssignment_7_3_1"


    // $ANTLR start "rule__BuildingComponent__ParameterAssignment_9"
    // InternalScml.g:8869:1: rule__BuildingComponent__ParameterAssignment_9 : ( ruleParameter ) ;
    public final void rule__BuildingComponent__ParameterAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8873:1: ( ( ruleParameter ) )
            // InternalScml.g:8874:2: ( ruleParameter )
            {
            // InternalScml.g:8874:2: ( ruleParameter )
            // InternalScml.g:8875:3: ruleParameter
            {
             before(grammarAccess.getBuildingComponentAccess().getParameterParameterParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getParameterParameterParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__BuildingComponent__ParameterAssignment_9"


    // $ANTLR start "rule__BuildingComponent__DeviceAssignment_10_2"
    // InternalScml.g:8884:1: rule__BuildingComponent__DeviceAssignment_10_2 : ( ruleDevice ) ;
    public final void rule__BuildingComponent__DeviceAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8888:1: ( ( ruleDevice ) )
            // InternalScml.g:8889:2: ( ruleDevice )
            {
            // InternalScml.g:8889:2: ( ruleDevice )
            // InternalScml.g:8890:3: ruleDevice
            {
             before(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__BuildingComponent__DeviceAssignment_10_2"


    // $ANTLR start "rule__BuildingComponent__DeviceAssignment_10_3_1"
    // InternalScml.g:8899:1: rule__BuildingComponent__DeviceAssignment_10_3_1 : ( ruleDevice ) ;
    public final void rule__BuildingComponent__DeviceAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8903:1: ( ( ruleDevice ) )
            // InternalScml.g:8904:2: ( ruleDevice )
            {
            // InternalScml.g:8904:2: ( ruleDevice )
            // InternalScml.g:8905:3: ruleDevice
            {
             before(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getBuildingComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__BuildingComponent__DeviceAssignment_10_3_1"


    // $ANTLR start "rule__TransportationComponent__NameAssignment_1"
    // InternalScml.g:8914:1: rule__TransportationComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransportationComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8918:1: ( ( ruleEString ) )
            // InternalScml.g:8919:2: ( ruleEString )
            {
            // InternalScml.g:8919:2: ( ruleEString )
            // InternalScml.g:8920:3: ruleEString
            {
             before(grammarAccess.getTransportationComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TransportationComponent__NameAssignment_1"


    // $ANTLR start "rule__TransportationComponent__IsPartOfAssignment_3_1"
    // InternalScml.g:8929:1: rule__TransportationComponent__IsPartOfAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportationComponent__IsPartOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8933:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8934:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8934:2: ( ( ruleEString ) )
            // InternalScml.g:8935:3: ( ruleEString )
            {
             before(grammarAccess.getTransportationComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 
            // InternalScml.g:8936:3: ( ruleEString )
            // InternalScml.g:8937:4: ruleEString
            {
             before(grammarAccess.getTransportationComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getTransportationComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__TransportationComponent__IsPartOfAssignment_3_1"


    // $ANTLR start "rule__TransportationComponent__ComposedOfAssignment_4_2"
    // InternalScml.g:8948:1: rule__TransportationComponent__ComposedOfAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__TransportationComponent__ComposedOfAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8952:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8953:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8953:2: ( ( ruleEString ) )
            // InternalScml.g:8954:3: ( ruleEString )
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 
            // InternalScml.g:8955:3: ( ruleEString )
            // InternalScml.g:8956:4: ruleEString
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__TransportationComponent__ComposedOfAssignment_4_2"


    // $ANTLR start "rule__TransportationComponent__ComposedOfAssignment_4_3_1"
    // InternalScml.g:8967:1: rule__TransportationComponent__ComposedOfAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportationComponent__ComposedOfAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8971:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:8972:2: ( ( ruleEString ) )
            {
            // InternalScml.g:8972:2: ( ( ruleEString ) )
            // InternalScml.g:8973:3: ( ruleEString )
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 
            // InternalScml.g:8974:3: ( ruleEString )
            // InternalScml.g:8975:4: ruleEString
            {
             before(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getTransportationComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__TransportationComponent__ComposedOfAssignment_4_3_1"


    // $ANTLR start "rule__TransportationComponent__LocationAssignment_6"
    // InternalScml.g:8986:1: rule__TransportationComponent__LocationAssignment_6 : ( ruleLocation ) ;
    public final void rule__TransportationComponent__LocationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:8990:1: ( ( ruleLocation ) )
            // InternalScml.g:8991:2: ( ruleLocation )
            {
            // InternalScml.g:8991:2: ( ruleLocation )
            // InternalScml.g:8992:3: ruleLocation
            {
             before(grammarAccess.getTransportationComponentAccess().getLocationLocationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getLocationLocationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TransportationComponent__LocationAssignment_6"


    // $ANTLR start "rule__TransportationComponent__ProducesAssignment_7_2"
    // InternalScml.g:9001:1: rule__TransportationComponent__ProducesAssignment_7_2 : ( ruleDataValue ) ;
    public final void rule__TransportationComponent__ProducesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9005:1: ( ( ruleDataValue ) )
            // InternalScml.g:9006:2: ( ruleDataValue )
            {
            // InternalScml.g:9006:2: ( ruleDataValue )
            // InternalScml.g:9007:3: ruleDataValue
            {
             before(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__TransportationComponent__ProducesAssignment_7_2"


    // $ANTLR start "rule__TransportationComponent__ProducesAssignment_7_3_1"
    // InternalScml.g:9016:1: rule__TransportationComponent__ProducesAssignment_7_3_1 : ( ruleDataValue ) ;
    public final void rule__TransportationComponent__ProducesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9020:1: ( ( ruleDataValue ) )
            // InternalScml.g:9021:2: ( ruleDataValue )
            {
            // InternalScml.g:9021:2: ( ruleDataValue )
            // InternalScml.g:9022:3: ruleDataValue
            {
             before(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__TransportationComponent__ProducesAssignment_7_3_1"


    // $ANTLR start "rule__TransportationComponent__ParameterAssignment_9"
    // InternalScml.g:9031:1: rule__TransportationComponent__ParameterAssignment_9 : ( ruleParameter ) ;
    public final void rule__TransportationComponent__ParameterAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9035:1: ( ( ruleParameter ) )
            // InternalScml.g:9036:2: ( ruleParameter )
            {
            // InternalScml.g:9036:2: ( ruleParameter )
            // InternalScml.g:9037:3: ruleParameter
            {
             before(grammarAccess.getTransportationComponentAccess().getParameterParameterParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getParameterParameterParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__TransportationComponent__ParameterAssignment_9"


    // $ANTLR start "rule__TransportationComponent__DeviceAssignment_10_2"
    // InternalScml.g:9046:1: rule__TransportationComponent__DeviceAssignment_10_2 : ( ruleDevice ) ;
    public final void rule__TransportationComponent__DeviceAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9050:1: ( ( ruleDevice ) )
            // InternalScml.g:9051:2: ( ruleDevice )
            {
            // InternalScml.g:9051:2: ( ruleDevice )
            // InternalScml.g:9052:3: ruleDevice
            {
             before(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__TransportationComponent__DeviceAssignment_10_2"


    // $ANTLR start "rule__TransportationComponent__DeviceAssignment_10_3_1"
    // InternalScml.g:9061:1: rule__TransportationComponent__DeviceAssignment_10_3_1 : ( ruleDevice ) ;
    public final void rule__TransportationComponent__DeviceAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9065:1: ( ( ruleDevice ) )
            // InternalScml.g:9066:2: ( ruleDevice )
            {
            // InternalScml.g:9066:2: ( ruleDevice )
            // InternalScml.g:9067:3: ruleDevice
            {
             before(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getTransportationComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__TransportationComponent__DeviceAssignment_10_3_1"


    // $ANTLR start "rule__EnvironmentalComponent__NameAssignment_1"
    // InternalScml.g:9076:1: rule__EnvironmentalComponent__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnvironmentalComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9080:1: ( ( ruleEString ) )
            // InternalScml.g:9081:2: ( ruleEString )
            {
            // InternalScml.g:9081:2: ( ruleEString )
            // InternalScml.g:9082:3: ruleEString
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__NameAssignment_1"


    // $ANTLR start "rule__EnvironmentalComponent__IsPartOfAssignment_3_1"
    // InternalScml.g:9091:1: rule__EnvironmentalComponent__IsPartOfAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EnvironmentalComponent__IsPartOfAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9095:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:9096:2: ( ( ruleEString ) )
            {
            // InternalScml.g:9096:2: ( ( ruleEString ) )
            // InternalScml.g:9097:3: ( ruleEString )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 
            // InternalScml.g:9098:3: ( ruleEString )
            // InternalScml.g:9099:4: ruleEString
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfInfrastructureComponentEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getIsPartOfInfrastructureComponentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__IsPartOfAssignment_3_1"


    // $ANTLR start "rule__EnvironmentalComponent__ComposedOfAssignment_4_2"
    // InternalScml.g:9110:1: rule__EnvironmentalComponent__ComposedOfAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__EnvironmentalComponent__ComposedOfAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9114:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:9115:2: ( ( ruleEString ) )
            {
            // InternalScml.g:9115:2: ( ( ruleEString ) )
            // InternalScml.g:9116:3: ( ruleEString )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 
            // InternalScml.g:9117:3: ( ruleEString )
            // InternalScml.g:9118:4: ruleEString
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__ComposedOfAssignment_4_2"


    // $ANTLR start "rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1"
    // InternalScml.g:9129:1: rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9133:1: ( ( ( ruleEString ) ) )
            // InternalScml.g:9134:2: ( ( ruleEString ) )
            {
            // InternalScml.g:9134:2: ( ( ruleEString ) )
            // InternalScml.g:9135:3: ( ruleEString )
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 
            // InternalScml.g:9136:3: ( ruleEString )
            // InternalScml.g:9137:4: ruleEString
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getEnvironmentalComponentAccess().getComposedOfInfrastructureComponentCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__ComposedOfAssignment_4_3_1"


    // $ANTLR start "rule__EnvironmentalComponent__LocationAssignment_6"
    // InternalScml.g:9148:1: rule__EnvironmentalComponent__LocationAssignment_6 : ( ruleLocation ) ;
    public final void rule__EnvironmentalComponent__LocationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9152:1: ( ( ruleLocation ) )
            // InternalScml.g:9153:2: ( ruleLocation )
            {
            // InternalScml.g:9153:2: ( ruleLocation )
            // InternalScml.g:9154:3: ruleLocation
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getLocationLocationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getLocationLocationParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__LocationAssignment_6"


    // $ANTLR start "rule__EnvironmentalComponent__ProducesAssignment_7_2"
    // InternalScml.g:9163:1: rule__EnvironmentalComponent__ProducesAssignment_7_2 : ( ruleDataValue ) ;
    public final void rule__EnvironmentalComponent__ProducesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9167:1: ( ( ruleDataValue ) )
            // InternalScml.g:9168:2: ( ruleDataValue )
            {
            // InternalScml.g:9168:2: ( ruleDataValue )
            // InternalScml.g:9169:3: ruleDataValue
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__ProducesAssignment_7_2"


    // $ANTLR start "rule__EnvironmentalComponent__ProducesAssignment_7_3_1"
    // InternalScml.g:9178:1: rule__EnvironmentalComponent__ProducesAssignment_7_3_1 : ( ruleDataValue ) ;
    public final void rule__EnvironmentalComponent__ProducesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9182:1: ( ( ruleDataValue ) )
            // InternalScml.g:9183:2: ( ruleDataValue )
            {
            // InternalScml.g:9183:2: ( ruleDataValue )
            // InternalScml.g:9184:3: ruleDataValue
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataValue();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getProducesDataValueParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__ProducesAssignment_7_3_1"


    // $ANTLR start "rule__EnvironmentalComponent__ParameterAssignment_9"
    // InternalScml.g:9193:1: rule__EnvironmentalComponent__ParameterAssignment_9 : ( ruleParameter ) ;
    public final void rule__EnvironmentalComponent__ParameterAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9197:1: ( ( ruleParameter ) )
            // InternalScml.g:9198:2: ( ruleParameter )
            {
            // InternalScml.g:9198:2: ( ruleParameter )
            // InternalScml.g:9199:3: ruleParameter
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getParameterParameterParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getParameterParameterParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__ParameterAssignment_9"


    // $ANTLR start "rule__EnvironmentalComponent__DeviceAssignment_10_2"
    // InternalScml.g:9208:1: rule__EnvironmentalComponent__DeviceAssignment_10_2 : ( ruleDevice ) ;
    public final void rule__EnvironmentalComponent__DeviceAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9212:1: ( ( ruleDevice ) )
            // InternalScml.g:9213:2: ( ruleDevice )
            {
            // InternalScml.g:9213:2: ( ruleDevice )
            // InternalScml.g:9214:3: ruleDevice
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__DeviceAssignment_10_2"


    // $ANTLR start "rule__EnvironmentalComponent__DeviceAssignment_10_3_1"
    // InternalScml.g:9223:1: rule__EnvironmentalComponent__DeviceAssignment_10_3_1 : ( ruleDevice ) ;
    public final void rule__EnvironmentalComponent__DeviceAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9227:1: ( ( ruleDevice ) )
            // InternalScml.g:9228:2: ( ruleDevice )
            {
            // InternalScml.g:9228:2: ( ruleDevice )
            // InternalScml.g:9229:3: ruleDevice
            {
             before(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEnvironmentalComponentAccess().getDeviceDeviceParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__EnvironmentalComponent__DeviceAssignment_10_3_1"


    // $ANTLR start "rule__GoalReferenceValue__TypeAssignment_3"
    // InternalScml.g:9238:1: rule__GoalReferenceValue__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__GoalReferenceValue__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9242:1: ( ( ruleDataType ) )
            // InternalScml.g:9243:2: ( ruleDataType )
            {
            // InternalScml.g:9243:2: ( ruleDataType )
            // InternalScml.g:9244:3: ruleDataType
            {
             before(grammarAccess.getGoalReferenceValueAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getGoalReferenceValueAccess().getTypeDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__GoalReferenceValue__TypeAssignment_3"


    // $ANTLR start "rule__GoalReferenceValue__ValueAssignment_5"
    // InternalScml.g:9253:1: rule__GoalReferenceValue__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__GoalReferenceValue__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9257:1: ( ( ruleEString ) )
            // InternalScml.g:9258:2: ( ruleEString )
            {
            // InternalScml.g:9258:2: ( ruleEString )
            // InternalScml.g:9259:3: ruleEString
            {
             before(grammarAccess.getGoalReferenceValueAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGoalReferenceValueAccess().getValueEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GoalReferenceValue__ValueAssignment_5"


    // $ANTLR start "rule__GoalReferenceValue__BasisAssignment_7"
    // InternalScml.g:9268:1: rule__GoalReferenceValue__BasisAssignment_7 : ( ruleBasis ) ;
    public final void rule__GoalReferenceValue__BasisAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9272:1: ( ( ruleBasis ) )
            // InternalScml.g:9273:2: ( ruleBasis )
            {
            // InternalScml.g:9273:2: ( ruleBasis )
            // InternalScml.g:9274:3: ruleBasis
            {
             before(grammarAccess.getGoalReferenceValueAccess().getBasisBasisParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBasis();

            state._fsp--;

             after(grammarAccess.getGoalReferenceValueAccess().getBasisBasisParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__GoalReferenceValue__BasisAssignment_7"


    // $ANTLR start "rule__AggregatedValue__TypeAssignment_3"
    // InternalScml.g:9283:1: rule__AggregatedValue__TypeAssignment_3 : ( ruleDataType ) ;
    public final void rule__AggregatedValue__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9287:1: ( ( ruleDataType ) )
            // InternalScml.g:9288:2: ( ruleDataType )
            {
            // InternalScml.g:9288:2: ( ruleDataType )
            // InternalScml.g:9289:3: ruleDataType
            {
             before(grammarAccess.getAggregatedValueAccess().getTypeDataTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAggregatedValueAccess().getTypeDataTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__AggregatedValue__TypeAssignment_3"


    // $ANTLR start "rule__AggregatedValue__ValueAssignment_5"
    // InternalScml.g:9298:1: rule__AggregatedValue__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__AggregatedValue__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9302:1: ( ( ruleEString ) )
            // InternalScml.g:9303:2: ( ruleEString )
            {
            // InternalScml.g:9303:2: ( ruleEString )
            // InternalScml.g:9304:3: ruleEString
            {
             before(grammarAccess.getAggregatedValueAccess().getValueEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAggregatedValueAccess().getValueEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AggregatedValue__ValueAssignment_5"


    // $ANTLR start "rule__AggregatedValue__AggregatorAssignment_7"
    // InternalScml.g:9313:1: rule__AggregatedValue__AggregatorAssignment_7 : ( ruleOperation ) ;
    public final void rule__AggregatedValue__AggregatorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9317:1: ( ( ruleOperation ) )
            // InternalScml.g:9318:2: ( ruleOperation )
            {
            // InternalScml.g:9318:2: ( ruleOperation )
            // InternalScml.g:9319:3: ruleOperation
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatorOperationEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getAggregatedValueAccess().getAggregatorOperationEnumRuleCall_7_0()); 

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
    // $ANTLR end "rule__AggregatedValue__AggregatorAssignment_7"


    // $ANTLR start "rule__AggregatedValue__AggregatedTimeAssignment_9"
    // InternalScml.g:9328:1: rule__AggregatedValue__AggregatedTimeAssignment_9 : ( ruleEString ) ;
    public final void rule__AggregatedValue__AggregatedTimeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9332:1: ( ( ruleEString ) )
            // InternalScml.g:9333:2: ( ruleEString )
            {
            // InternalScml.g:9333:2: ( ruleEString )
            // InternalScml.g:9334:3: ruleEString
            {
             before(grammarAccess.getAggregatedValueAccess().getAggregatedTimeEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAggregatedValueAccess().getAggregatedTimeEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__AggregatedValue__AggregatedTimeAssignment_9"


    // $ANTLR start "rule__Basis__DescriptionAssignment_3"
    // InternalScml.g:9343:1: rule__Basis__DescriptionAssignment_3 : ( ruleEString ) ;
    public final void rule__Basis__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9347:1: ( ( ruleEString ) )
            // InternalScml.g:9348:2: ( ruleEString )
            {
            // InternalScml.g:9348:2: ( ruleEString )
            // InternalScml.g:9349:3: ruleEString
            {
             before(grammarAccess.getBasisAccess().getDescriptionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasisAccess().getDescriptionEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Basis__DescriptionAssignment_3"


    // $ANTLR start "rule__Basis__PrincipleTypeAssignment_5"
    // InternalScml.g:9358:1: rule__Basis__PrincipleTypeAssignment_5 : ( rulePrincipleType ) ;
    public final void rule__Basis__PrincipleTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9362:1: ( ( rulePrincipleType ) )
            // InternalScml.g:9363:2: ( rulePrincipleType )
            {
            // InternalScml.g:9363:2: ( rulePrincipleType )
            // InternalScml.g:9364:3: rulePrincipleType
            {
             before(grammarAccess.getBasisAccess().getPrincipleTypePrincipleTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePrincipleType();

            state._fsp--;

             after(grammarAccess.getBasisAccess().getPrincipleTypePrincipleTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Basis__PrincipleTypeAssignment_5"


    // $ANTLR start "rule__Basis__SourceAssignment_7"
    // InternalScml.g:9373:1: rule__Basis__SourceAssignment_7 : ( ruleEString ) ;
    public final void rule__Basis__SourceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9377:1: ( ( ruleEString ) )
            // InternalScml.g:9378:2: ( ruleEString )
            {
            // InternalScml.g:9378:2: ( ruleEString )
            // InternalScml.g:9379:3: ruleEString
            {
             before(grammarAccess.getBasisAccess().getSourceEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasisAccess().getSourceEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Basis__SourceAssignment_7"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalScml.g:9388:1: rule__Sensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9392:1: ( ( ruleEString ) )
            // InternalScml.g:9393:2: ( ruleEString )
            {
            // InternalScml.g:9393:2: ( ruleEString )
            // InternalScml.g:9394:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_4"
    // InternalScml.g:9403:1: rule__Sensor__TypeAssignment_4 : ( ruleParameterType ) ;
    public final void rule__Sensor__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9407:1: ( ( ruleParameterType ) )
            // InternalScml.g:9408:2: ( ruleParameterType )
            {
            // InternalScml.g:9408:2: ( ruleParameterType )
            // InternalScml.g:9409:3: ruleParameterType
            {
             before(grammarAccess.getSensorAccess().getTypeParameterTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeParameterTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Sensor__TypeAssignment_4"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // InternalScml.g:9418:1: rule__Actuator__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9422:1: ( ( ruleEString ) )
            // InternalScml.g:9423:2: ( ruleEString )
            {
            // InternalScml.g:9423:2: ( ruleEString )
            // InternalScml.g:9424:3: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actuator__NameAssignment_1"


    // $ANTLR start "rule__Actuator__TypeAssignment_4"
    // InternalScml.g:9433:1: rule__Actuator__TypeAssignment_4 : ( ruleParameterType ) ;
    public final void rule__Actuator__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScml.g:9437:1: ( ( ruleParameterType ) )
            // InternalScml.g:9438:2: ( ruleParameterType )
            {
            // InternalScml.g:9438:2: ( ruleParameterType )
            // InternalScml.g:9439:3: ruleParameterType
            {
             before(grammarAccess.getActuatorAccess().getTypeParameterTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getTypeParameterTypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Actuator__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000002C000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000180C000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000410000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000608L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x4000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});

}