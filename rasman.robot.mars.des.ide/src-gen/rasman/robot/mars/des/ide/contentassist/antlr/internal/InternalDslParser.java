package rasman.robot.mars.des.ide.contentassist.antlr.internal;

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
import rasman.robot.mars.des.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s'", "'ms'", "'LEFT'", "'RIGHT'", "'BOTH'", "'ANY'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'MEASURE'", "'DRIVETOEDGE'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Mission:'", "'Task:'", "'Uses:'", "'Do:'", "'For'", "'Max:'", "'Times'", "'Not:'", "'ExpiresAfter:'", "'ColorSensor'", "'On'", "'DetectedColor'", "'is:'", "'DetectedColors'", "'are:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'", "'AvoidObjects'", "'New'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMission"
    // InternalDsl.g:53:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleMission EOF )
            // InternalDsl.g:55:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:62:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Mission__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Mission__Group__0 )
            // InternalDsl.g:69:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalDsl.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleTask EOF )
            // InternalDsl.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalDsl.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Task__Group__0 )
            // InternalDsl.g:94:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuletimeUnitValue"
    // InternalDsl.g:103:1: entryRuletimeUnitValue : ruletimeUnitValue EOF ;
    public final void entryRuletimeUnitValue() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruletimeUnitValue EOF )
            // InternalDsl.g:105:1: ruletimeUnitValue EOF
            {
             before(grammarAccess.getTimeUnitValueRule()); 
            pushFollow(FOLLOW_1);
            ruletimeUnitValue();

            state._fsp--;

             after(grammarAccess.getTimeUnitValueRule()); 
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
    // $ANTLR end "entryRuletimeUnitValue"


    // $ANTLR start "ruletimeUnitValue"
    // InternalDsl.g:112:1: ruletimeUnitValue : ( ( rule__TimeUnitValue__UnitAssignment ) ) ;
    public final void ruletimeUnitValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__TimeUnitValue__UnitAssignment ) ) )
            // InternalDsl.g:117:2: ( ( rule__TimeUnitValue__UnitAssignment ) )
            {
            // InternalDsl.g:117:2: ( ( rule__TimeUnitValue__UnitAssignment ) )
            // InternalDsl.g:118:3: ( rule__TimeUnitValue__UnitAssignment )
            {
             before(grammarAccess.getTimeUnitValueAccess().getUnitAssignment()); 
            // InternalDsl.g:119:3: ( rule__TimeUnitValue__UnitAssignment )
            // InternalDsl.g:119:4: rule__TimeUnitValue__UnitAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnitValue__UnitAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitValueAccess().getUnitAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletimeUnitValue"


    // $ANTLR start "entryRuleIgnorables"
    // InternalDsl.g:128:1: entryRuleIgnorables : ruleIgnorables EOF ;
    public final void entryRuleIgnorables() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleIgnorables EOF )
            // InternalDsl.g:130:1: ruleIgnorables EOF
            {
             before(grammarAccess.getIgnorablesRule()); 
            pushFollow(FOLLOW_1);
            ruleIgnorables();

            state._fsp--;

             after(grammarAccess.getIgnorablesRule()); 
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
    // $ANTLR end "entryRuleIgnorables"


    // $ANTLR start "ruleIgnorables"
    // InternalDsl.g:137:1: ruleIgnorables : ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) ) ;
    public final void ruleIgnorables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) ) )
            // InternalDsl.g:142:2: ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) )
            // InternalDsl.g:143:3: ( rule__Ignorables__AVOID_OBJECTSAssignment )
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAssignment()); 
            // InternalDsl.g:144:3: ( rule__Ignorables__AVOID_OBJECTSAssignment )
            // InternalDsl.g:144:4: rule__Ignorables__AVOID_OBJECTSAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ignorables__AVOID_OBJECTSAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIgnorables"


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:153:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleSensorType EOF )
            // InternalDsl.g:155:1: ruleSensorType EOF
            {
             before(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypeRule()); 
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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalDsl.g:162:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__SensorType__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__SensorType__Alternatives )
            // InternalDsl.g:169:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleColorSensor"
    // InternalDsl.g:178:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleColorSensor EOF )
            // InternalDsl.g:180:1: ruleColorSensor EOF
            {
             before(grammarAccess.getColorSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleColorSensor();

            state._fsp--;

             after(grammarAccess.getColorSensorRule()); 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalDsl.g:187:1: ruleColorSensor : ( ( rule__ColorSensor__Alternatives ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__ColorSensor__Alternatives ) ) )
            // InternalDsl.g:192:2: ( ( rule__ColorSensor__Alternatives ) )
            {
            // InternalDsl.g:192:2: ( ( rule__ColorSensor__Alternatives ) )
            // InternalDsl.g:193:3: ( rule__ColorSensor__Alternatives )
            {
             before(grammarAccess.getColorSensorAccess().getAlternatives()); 
            // InternalDsl.g:194:3: ( rule__ColorSensor__Alternatives )
            // InternalDsl.g:194:4: rule__ColorSensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleTouchSensor"
    // InternalDsl.g:203:1: entryRuleTouchSensor : ruleTouchSensor EOF ;
    public final void entryRuleTouchSensor() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleTouchSensor EOF )
            // InternalDsl.g:205:1: ruleTouchSensor EOF
            {
             before(grammarAccess.getTouchSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleTouchSensor();

            state._fsp--;

             after(grammarAccess.getTouchSensorRule()); 
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
    // $ANTLR end "entryRuleTouchSensor"


    // $ANTLR start "ruleTouchSensor"
    // InternalDsl.g:212:1: ruleTouchSensor : ( ( rule__TouchSensor__Group__0 ) ) ;
    public final void ruleTouchSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__TouchSensor__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__TouchSensor__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__TouchSensor__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__TouchSensor__Group__0 )
            {
             before(grammarAccess.getTouchSensorAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__TouchSensor__Group__0 )
            // InternalDsl.g:219:4: rule__TouchSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchSensor"


    // $ANTLR start "entryRuleUltrasonicSensor"
    // InternalDsl.g:228:1: entryRuleUltrasonicSensor : ruleUltrasonicSensor EOF ;
    public final void entryRuleUltrasonicSensor() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleUltrasonicSensor EOF )
            // InternalDsl.g:230:1: ruleUltrasonicSensor EOF
            {
             before(grammarAccess.getUltrasonicSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleUltrasonicSensor();

            state._fsp--;

             after(grammarAccess.getUltrasonicSensorRule()); 
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
    // $ANTLR end "entryRuleUltrasonicSensor"


    // $ANTLR start "ruleUltrasonicSensor"
    // InternalDsl.g:237:1: ruleUltrasonicSensor : ( ( rule__UltrasonicSensor__Group__0 ) ) ;
    public final void ruleUltrasonicSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__UltrasonicSensor__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__UltrasonicSensor__Group__0 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__UltrasonicSensor__Group__0 )
            // InternalDsl.g:244:4: rule__UltrasonicSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUltrasonicSensor"


    // $ANTLR start "entryRuleColorValue"
    // InternalDsl.g:253:1: entryRuleColorValue : ruleColorValue EOF ;
    public final void entryRuleColorValue() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleColorValue EOF )
            // InternalDsl.g:255:1: ruleColorValue EOF
            {
             before(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorValueRule()); 
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
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalDsl.g:262:1: ruleColorValue : ( ( rule__ColorValue__ColorAssignment ) ) ;
    public final void ruleColorValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__ColorValue__ColorAssignment ) ) )
            // InternalDsl.g:267:2: ( ( rule__ColorValue__ColorAssignment ) )
            {
            // InternalDsl.g:267:2: ( ( rule__ColorValue__ColorAssignment ) )
            // InternalDsl.g:268:3: ( rule__ColorValue__ColorAssignment )
            {
             before(grammarAccess.getColorValueAccess().getColorAssignment()); 
            // InternalDsl.g:269:3: ( rule__ColorValue__ColorAssignment )
            // InternalDsl.g:269:4: rule__ColorValue__ColorAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColorValue__ColorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColorValueAccess().getColorAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "ruletimeUnit"
    // InternalDsl.g:278:1: ruletimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruletimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:282:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalDsl.g:283:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalDsl.g:283:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalDsl.g:284:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalDsl.g:285:3: ( rule__TimeUnit__Alternatives )
            // InternalDsl.g:285:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletimeUnit"


    // $ANTLR start "ruleTouchSensorSides"
    // InternalDsl.g:294:1: ruleTouchSensorSides : ( ( rule__TouchSensorSides__Alternatives ) ) ;
    public final void ruleTouchSensorSides() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:298:1: ( ( ( rule__TouchSensorSides__Alternatives ) ) )
            // InternalDsl.g:299:2: ( ( rule__TouchSensorSides__Alternatives ) )
            {
            // InternalDsl.g:299:2: ( ( rule__TouchSensorSides__Alternatives ) )
            // InternalDsl.g:300:3: ( rule__TouchSensorSides__Alternatives )
            {
             before(grammarAccess.getTouchSensorSidesAccess().getAlternatives()); 
            // InternalDsl.g:301:3: ( rule__TouchSensorSides__Alternatives )
            // InternalDsl.g:301:4: rule__TouchSensorSides__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensorSides__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorSidesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchSensorSides"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:310:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:314:1: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDsl.g:315:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDsl.g:315:2: ( ( rule__Actions__Alternatives ) )
            // InternalDsl.g:316:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalDsl.g:317:3: ( rule__Actions__Alternatives )
            // InternalDsl.g:317:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "ruleColors"
    // InternalDsl.g:326:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:330:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalDsl.g:331:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalDsl.g:331:2: ( ( rule__Colors__Alternatives ) )
            // InternalDsl.g:332:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalDsl.g:333:3: ( rule__Colors__Alternatives )
            // InternalDsl.g:333:4: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:342:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:346:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalDsl.g:347:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalDsl.g:347:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalDsl.g:348:3: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // InternalDsl.g:349:3: ( rule__CompareOperator__Alternatives )
            // InternalDsl.g:349:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalDsl.g:357:1: rule__SensorType__Alternatives : ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:361:1: ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt1=1;
                }
                break;
            case 61:
                {
                alt1=2;
                }
                break;
            case 63:
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
                    // InternalDsl.g:362:2: ( ruleColorSensor )
                    {
                    // InternalDsl.g:362:2: ( ruleColorSensor )
                    // InternalDsl.g:363:3: ruleColorSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColorSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:368:2: ( ruleTouchSensor )
                    {
                    // InternalDsl.g:368:2: ( ruleTouchSensor )
                    // InternalDsl.g:369:3: ruleTouchSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTouchSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:374:2: ( ruleUltrasonicSensor )
                    {
                    // InternalDsl.g:374:2: ( ruleUltrasonicSensor )
                    // InternalDsl.g:375:3: ruleUltrasonicSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUltrasonicSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2()); 

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
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__ColorSensor__Alternatives"
    // InternalDsl.g:384:1: rule__ColorSensor__Alternatives : ( ( ( rule__ColorSensor__Group_0__0 ) ) | ( ( rule__ColorSensor__Group_1__0 ) ) );
    public final void rule__ColorSensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:388:1: ( ( ( rule__ColorSensor__Group_0__0 ) ) | ( ( rule__ColorSensor__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==55) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==56) ) {
                    switch ( input.LA(3) ) {
                    case 66:
                        {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==59) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==57) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 59:
                        {
                        alt2=2;
                        }
                        break;
                    case 57:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:389:2: ( ( rule__ColorSensor__Group_0__0 ) )
                    {
                    // InternalDsl.g:389:2: ( ( rule__ColorSensor__Group_0__0 ) )
                    // InternalDsl.g:390:3: ( rule__ColorSensor__Group_0__0 )
                    {
                     before(grammarAccess.getColorSensorAccess().getGroup_0()); 
                    // InternalDsl.g:391:3: ( rule__ColorSensor__Group_0__0 )
                    // InternalDsl.g:391:4: rule__ColorSensor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorSensor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorSensorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:395:2: ( ( rule__ColorSensor__Group_1__0 ) )
                    {
                    // InternalDsl.g:395:2: ( ( rule__ColorSensor__Group_1__0 ) )
                    // InternalDsl.g:396:3: ( rule__ColorSensor__Group_1__0 )
                    {
                     before(grammarAccess.getColorSensorAccess().getGroup_1()); 
                    // InternalDsl.g:397:3: ( rule__ColorSensor__Group_1__0 )
                    // InternalDsl.g:397:4: rule__ColorSensor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorSensor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColorSensorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ColorSensor__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalDsl.g:405:1: rule__TimeUnit__Alternatives : ( ( ( 's' ) ) | ( ( 'ms' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:409:1: ( ( ( 's' ) ) | ( ( 'ms' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:410:2: ( ( 's' ) )
                    {
                    // InternalDsl.g:410:2: ( ( 's' ) )
                    // InternalDsl.g:411:3: ( 's' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:412:3: ( 's' )
                    // InternalDsl.g:412:4: 's'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:416:2: ( ( 'ms' ) )
                    {
                    // InternalDsl.g:416:2: ( ( 'ms' ) )
                    // InternalDsl.g:417:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:418:3: ( 'ms' )
                    // InternalDsl.g:418:4: 'ms'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__TouchSensorSides__Alternatives"
    // InternalDsl.g:426:1: rule__TouchSensorSides__Alternatives : ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) | ( ( 'ANY' ) ) );
    public final void rule__TouchSensorSides__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:430:1: ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) | ( ( 'ANY' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:431:2: ( ( 'LEFT' ) )
                    {
                    // InternalDsl.g:431:2: ( ( 'LEFT' ) )
                    // InternalDsl.g:432:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:433:3: ( 'LEFT' )
                    // InternalDsl.g:433:4: 'LEFT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:437:2: ( ( 'RIGHT' ) )
                    {
                    // InternalDsl.g:437:2: ( ( 'RIGHT' ) )
                    // InternalDsl.g:438:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:439:3: ( 'RIGHT' )
                    // InternalDsl.g:439:4: 'RIGHT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:443:2: ( ( 'BOTH' ) )
                    {
                    // InternalDsl.g:443:2: ( ( 'BOTH' ) )
                    // InternalDsl.g:444:3: ( 'BOTH' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:445:3: ( 'BOTH' )
                    // InternalDsl.g:445:4: 'BOTH'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:449:2: ( ( 'ANY' ) )
                    {
                    // InternalDsl.g:449:2: ( ( 'ANY' ) )
                    // InternalDsl.g:450:3: ( 'ANY' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:451:3: ( 'ANY' )
                    // InternalDsl.g:451:4: 'ANY'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__TouchSensorSides__Alternatives"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalDsl.g:459:1: rule__Actions__Alternatives : ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) | ( ( 'MEASURE' ) ) | ( ( 'DRIVETOEDGE' ) ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:463:1: ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) | ( ( 'MEASURE' ) ) | ( ( 'DRIVETOEDGE' ) ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 24:
                {
                alt5=7;
                }
                break;
            case 25:
                {
                alt5=8;
                }
                break;
            case 26:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:464:2: ( ( 'ROTATELEFT' ) )
                    {
                    // InternalDsl.g:464:2: ( ( 'ROTATELEFT' ) )
                    // InternalDsl.g:465:3: ( 'ROTATELEFT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:466:3: ( 'ROTATELEFT' )
                    // InternalDsl.g:466:4: 'ROTATELEFT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:470:2: ( ( 'ROTATERIGHT' ) )
                    {
                    // InternalDsl.g:470:2: ( ( 'ROTATERIGHT' ) )
                    // InternalDsl.g:471:3: ( 'ROTATERIGHT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 
                    // InternalDsl.g:472:3: ( 'ROTATERIGHT' )
                    // InternalDsl.g:472:4: 'ROTATERIGHT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:476:2: ( ( 'DRIVEFORWARD' ) )
                    {
                    // InternalDsl.g:476:2: ( ( 'DRIVEFORWARD' ) )
                    // InternalDsl.g:477:3: ( 'DRIVEFORWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:478:3: ( 'DRIVEFORWARD' )
                    // InternalDsl.g:478:4: 'DRIVEFORWARD'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:482:2: ( ( 'DRIVEBACKWARD' ) )
                    {
                    // InternalDsl.g:482:2: ( ( 'DRIVEBACKWARD' ) )
                    // InternalDsl.g:483:3: ( 'DRIVEBACKWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:484:3: ( 'DRIVEBACKWARD' )
                    // InternalDsl.g:484:4: 'DRIVEBACKWARD'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:488:2: ( ( 'STOP' ) )
                    {
                    // InternalDsl.g:488:2: ( ( 'STOP' ) )
                    // InternalDsl.g:489:3: ( 'STOP' )
                    {
                     before(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:490:3: ( 'STOP' )
                    // InternalDsl.g:490:4: 'STOP'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:494:2: ( ( 'TURNAROUND' ) )
                    {
                    // InternalDsl.g:494:2: ( ( 'TURNAROUND' ) )
                    // InternalDsl.g:495:3: ( 'TURNAROUND' )
                    {
                     before(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:496:3: ( 'TURNAROUND' )
                    // InternalDsl.g:496:4: 'TURNAROUND'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:500:2: ( ( 'BEEP' ) )
                    {
                    // InternalDsl.g:500:2: ( ( 'BEEP' ) )
                    // InternalDsl.g:501:3: ( 'BEEP' )
                    {
                     before(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:502:3: ( 'BEEP' )
                    // InternalDsl.g:502:4: 'BEEP'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:506:2: ( ( 'MEASURE' ) )
                    {
                    // InternalDsl.g:506:2: ( ( 'MEASURE' ) )
                    // InternalDsl.g:507:3: ( 'MEASURE' )
                    {
                     before(grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:508:3: ( 'MEASURE' )
                    // InternalDsl.g:508:4: 'MEASURE'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:512:2: ( ( 'DRIVETOEDGE' ) )
                    {
                    // InternalDsl.g:512:2: ( ( 'DRIVETOEDGE' ) )
                    // InternalDsl.g:513:3: ( 'DRIVETOEDGE' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:514:3: ( 'DRIVETOEDGE' )
                    // InternalDsl.g:514:4: 'DRIVETOEDGE'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__Colors__Alternatives"
    // InternalDsl.g:522:1: rule__Colors__Alternatives : ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:526:1: ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            case 32:
                {
                alt6=6;
                }
                break;
            case 33:
                {
                alt6=7;
                }
                break;
            case 34:
                {
                alt6=8;
                }
                break;
            case 35:
                {
                alt6=9;
                }
                break;
            case 36:
                {
                alt6=10;
                }
                break;
            case 37:
                {
                alt6=11;
                }
                break;
            case 38:
                {
                alt6=12;
                }
                break;
            case 39:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:527:2: ( ( 'BLACK' ) )
                    {
                    // InternalDsl.g:527:2: ( ( 'BLACK' ) )
                    // InternalDsl.g:528:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:529:3: ( 'BLACK' )
                    // InternalDsl.g:529:4: 'BLACK'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:533:2: ( ( 'BLUE' ) )
                    {
                    // InternalDsl.g:533:2: ( ( 'BLUE' ) )
                    // InternalDsl.g:534:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:535:3: ( 'BLUE' )
                    // InternalDsl.g:535:4: 'BLUE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:539:2: ( ( 'CYAN' ) )
                    {
                    // InternalDsl.g:539:2: ( ( 'CYAN' ) )
                    // InternalDsl.g:540:3: ( 'CYAN' )
                    {
                     before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:541:3: ( 'CYAN' )
                    // InternalDsl.g:541:4: 'CYAN'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:545:2: ( ( 'DARK_GRAY' ) )
                    {
                    // InternalDsl.g:545:2: ( ( 'DARK_GRAY' ) )
                    // InternalDsl.g:546:3: ( 'DARK_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:547:3: ( 'DARK_GRAY' )
                    // InternalDsl.g:547:4: 'DARK_GRAY'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:551:2: ( ( 'GRAY' ) )
                    {
                    // InternalDsl.g:551:2: ( ( 'GRAY' ) )
                    // InternalDsl.g:552:3: ( 'GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:553:3: ( 'GRAY' )
                    // InternalDsl.g:553:4: 'GRAY'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:557:2: ( ( 'GREEN' ) )
                    {
                    // InternalDsl.g:557:2: ( ( 'GREEN' ) )
                    // InternalDsl.g:558:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:559:3: ( 'GREEN' )
                    // InternalDsl.g:559:4: 'GREEN'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:563:2: ( ( 'LIGHT_GRAY' ) )
                    {
                    // InternalDsl.g:563:2: ( ( 'LIGHT_GRAY' ) )
                    // InternalDsl.g:564:3: ( 'LIGHT_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:565:3: ( 'LIGHT_GRAY' )
                    // InternalDsl.g:565:4: 'LIGHT_GRAY'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:569:2: ( ( 'MAGENTA' ) )
                    {
                    // InternalDsl.g:569:2: ( ( 'MAGENTA' ) )
                    // InternalDsl.g:570:3: ( 'MAGENTA' )
                    {
                     before(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:571:3: ( 'MAGENTA' )
                    // InternalDsl.g:571:4: 'MAGENTA'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:575:2: ( ( 'ORANGE' ) )
                    {
                    // InternalDsl.g:575:2: ( ( 'ORANGE' ) )
                    // InternalDsl.g:576:3: ( 'ORANGE' )
                    {
                     before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:577:3: ( 'ORANGE' )
                    // InternalDsl.g:577:4: 'ORANGE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:581:2: ( ( 'PINK' ) )
                    {
                    // InternalDsl.g:581:2: ( ( 'PINK' ) )
                    // InternalDsl.g:582:3: ( 'PINK' )
                    {
                     before(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:583:3: ( 'PINK' )
                    // InternalDsl.g:583:4: 'PINK'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:587:2: ( ( 'RED' ) )
                    {
                    // InternalDsl.g:587:2: ( ( 'RED' ) )
                    // InternalDsl.g:588:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:589:3: ( 'RED' )
                    // InternalDsl.g:589:4: 'RED'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:593:2: ( ( 'WHITE' ) )
                    {
                    // InternalDsl.g:593:2: ( ( 'WHITE' ) )
                    // InternalDsl.g:594:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:595:3: ( 'WHITE' )
                    // InternalDsl.g:595:4: 'WHITE'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:599:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDsl.g:599:2: ( ( 'YELLOW' ) )
                    // InternalDsl.g:600:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:601:3: ( 'YELLOW' )
                    // InternalDsl.g:601:4: 'YELLOW'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12()); 

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
    // $ANTLR end "rule__Colors__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalDsl.g:609:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:613:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            case 43:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            case 45:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:614:2: ( ( '==' ) )
                    {
                    // InternalDsl.g:614:2: ( ( '==' ) )
                    // InternalDsl.g:615:3: ( '==' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:616:3: ( '==' )
                    // InternalDsl.g:616:4: '=='
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:620:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:620:2: ( ( '!=' ) )
                    // InternalDsl.g:621:3: ( '!=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:622:3: ( '!=' )
                    // InternalDsl.g:622:4: '!='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:626:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:626:2: ( ( '>=' ) )
                    // InternalDsl.g:627:3: ( '>=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:628:3: ( '>=' )
                    // InternalDsl.g:628:4: '>='
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:632:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:632:2: ( ( '>' ) )
                    // InternalDsl.g:633:3: ( '>' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:634:3: ( '>' )
                    // InternalDsl.g:634:4: '>'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:638:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:638:2: ( ( '<=' ) )
                    // InternalDsl.g:639:3: ( '<=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:640:3: ( '<=' )
                    // InternalDsl.g:640:4: '<='
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:644:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:644:2: ( ( '<' ) )
                    // InternalDsl.g:645:3: ( '<' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:646:3: ( '<' )
                    // InternalDsl.g:646:4: '<'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalDsl.g:654:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:658:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDsl.g:659:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalDsl.g:666:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:670:1: ( ( 'Mission:' ) )
            // InternalDsl.g:671:1: ( 'Mission:' )
            {
            // InternalDsl.g:671:1: ( 'Mission:' )
            // InternalDsl.g:672:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalDsl.g:681:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:685:1: ( rule__Mission__Group__1__Impl )
            // InternalDsl.g:686:2: rule__Mission__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalDsl.g:692:1: rule__Mission__Group__1__Impl : ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:696:1: ( ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) )
            // InternalDsl.g:697:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            {
            // InternalDsl.g:697:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            // InternalDsl.g:698:2: ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* )
            {
            // InternalDsl.g:698:2: ( ( rule__Mission__TasksAssignment_1 ) )
            // InternalDsl.g:699:3: ( rule__Mission__TasksAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:700:3: ( rule__Mission__TasksAssignment_1 )
            // InternalDsl.g:700:4: rule__Mission__TasksAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__TasksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTasksAssignment_1()); 

            }

            // InternalDsl.g:703:2: ( ( rule__Mission__TasksAssignment_1 )* )
            // InternalDsl.g:704:3: ( rule__Mission__TasksAssignment_1 )*
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:705:3: ( rule__Mission__TasksAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:705:4: rule__Mission__TasksAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Mission__TasksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getTasksAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalDsl.g:715:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:719:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalDsl.g:720:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalDsl.g:727:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:731:1: ( ( 'Task:' ) )
            // InternalDsl.g:732:1: ( 'Task:' )
            {
            // InternalDsl.g:732:1: ( 'Task:' )
            // InternalDsl.g:733:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalDsl.g:742:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:746:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalDsl.g:747:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalDsl.g:754:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:758:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalDsl.g:759:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalDsl.g:759:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalDsl.g:760:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalDsl.g:761:2: ( rule__Task__NameAssignment_1 )
            // InternalDsl.g:761:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalDsl.g:769:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:773:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalDsl.g:774:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalDsl.g:781:1: rule__Task__Group__2__Impl : ( ( rule__Task__Group_2__0 )? ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:785:1: ( ( ( rule__Task__Group_2__0 )? ) )
            // InternalDsl.g:786:1: ( ( rule__Task__Group_2__0 )? )
            {
            // InternalDsl.g:786:1: ( ( rule__Task__Group_2__0 )? )
            // InternalDsl.g:787:2: ( rule__Task__Group_2__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_2()); 
            // InternalDsl.g:788:2: ( rule__Task__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:788:3: rule__Task__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalDsl.g:796:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:800:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalDsl.g:801:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalDsl.g:808:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__Group_3__0 ) ) ( ( rule__Task__Group_3__0 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( ( ( ( rule__Task__Group_3__0 ) ) ( ( rule__Task__Group_3__0 )* ) ) )
            // InternalDsl.g:813:1: ( ( ( rule__Task__Group_3__0 ) ) ( ( rule__Task__Group_3__0 )* ) )
            {
            // InternalDsl.g:813:1: ( ( ( rule__Task__Group_3__0 ) ) ( ( rule__Task__Group_3__0 )* ) )
            // InternalDsl.g:814:2: ( ( rule__Task__Group_3__0 ) ) ( ( rule__Task__Group_3__0 )* )
            {
            // InternalDsl.g:814:2: ( ( rule__Task__Group_3__0 ) )
            // InternalDsl.g:815:3: ( rule__Task__Group_3__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // InternalDsl.g:816:3: ( rule__Task__Group_3__0 )
            // InternalDsl.g:816:4: rule__Task__Group_3__0
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup_3()); 

            }

            // InternalDsl.g:819:2: ( ( rule__Task__Group_3__0 )* )
            // InternalDsl.g:820:3: ( rule__Task__Group_3__0 )*
            {
             before(grammarAccess.getTaskAccess().getGroup_3()); 
            // InternalDsl.g:821:3: ( rule__Task__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:821:4: rule__Task__Group_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Task__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getGroup_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalDsl.g:830:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:834:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalDsl.g:835:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalDsl.g:842:1: rule__Task__Group__4__Impl : ( ( rule__Task__Group_4__0 )? ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:846:1: ( ( ( rule__Task__Group_4__0 )? ) )
            // InternalDsl.g:847:1: ( ( rule__Task__Group_4__0 )? )
            {
            // InternalDsl.g:847:1: ( ( rule__Task__Group_4__0 )? )
            // InternalDsl.g:848:2: ( rule__Task__Group_4__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_4()); 
            // InternalDsl.g:849:2: ( rule__Task__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==50) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:849:3: rule__Task__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalDsl.g:857:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:861:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalDsl.g:862:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalDsl.g:869:1: rule__Task__Group__5__Impl : ( ( rule__Task__Group_5__0 )? ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:873:1: ( ( ( rule__Task__Group_5__0 )? ) )
            // InternalDsl.g:874:1: ( ( rule__Task__Group_5__0 )? )
            {
            // InternalDsl.g:874:1: ( ( rule__Task__Group_5__0 )? )
            // InternalDsl.g:875:2: ( rule__Task__Group_5__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_5()); 
            // InternalDsl.g:876:2: ( rule__Task__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==53) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:876:3: rule__Task__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalDsl.g:884:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:888:1: ( rule__Task__Group__6__Impl )
            // InternalDsl.g:889:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalDsl.g:895:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:899:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalDsl.g:900:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalDsl.g:900:1: ( ( rule__Task__Group_6__0 )? )
            // InternalDsl.g:901:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalDsl.g:902:2: ( rule__Task__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==54) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:902:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_2__0"
    // InternalDsl.g:911:1: rule__Task__Group_2__0 : rule__Task__Group_2__0__Impl rule__Task__Group_2__1 ;
    public final void rule__Task__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:915:1: ( rule__Task__Group_2__0__Impl rule__Task__Group_2__1 )
            // InternalDsl.g:916:2: rule__Task__Group_2__0__Impl rule__Task__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0"


    // $ANTLR start "rule__Task__Group_2__0__Impl"
    // InternalDsl.g:923:1: rule__Task__Group_2__0__Impl : ( 'Uses:' ) ;
    public final void rule__Task__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:927:1: ( ( 'Uses:' ) )
            // InternalDsl.g:928:1: ( 'Uses:' )
            {
            // InternalDsl.g:928:1: ( 'Uses:' )
            // InternalDsl.g:929:2: 'Uses:'
            {
             before(grammarAccess.getTaskAccess().getUsesKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUsesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0__Impl"


    // $ANTLR start "rule__Task__Group_2__1"
    // InternalDsl.g:938:1: rule__Task__Group_2__1 : rule__Task__Group_2__1__Impl ;
    public final void rule__Task__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:942:1: ( rule__Task__Group_2__1__Impl )
            // InternalDsl.g:943:2: rule__Task__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1"


    // $ANTLR start "rule__Task__Group_2__1__Impl"
    // InternalDsl.g:949:1: rule__Task__Group_2__1__Impl : ( ( rule__Task__SensorAssignment_2_1 ) ) ;
    public final void rule__Task__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:953:1: ( ( ( rule__Task__SensorAssignment_2_1 ) ) )
            // InternalDsl.g:954:1: ( ( rule__Task__SensorAssignment_2_1 ) )
            {
            // InternalDsl.g:954:1: ( ( rule__Task__SensorAssignment_2_1 ) )
            // InternalDsl.g:955:2: ( rule__Task__SensorAssignment_2_1 )
            {
             before(grammarAccess.getTaskAccess().getSensorAssignment_2_1()); 
            // InternalDsl.g:956:2: ( rule__Task__SensorAssignment_2_1 )
            // InternalDsl.g:956:3: rule__Task__SensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__SensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSensorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1__Impl"


    // $ANTLR start "rule__Task__Group_3__0"
    // InternalDsl.g:965:1: rule__Task__Group_3__0 : rule__Task__Group_3__0__Impl rule__Task__Group_3__1 ;
    public final void rule__Task__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:969:1: ( rule__Task__Group_3__0__Impl rule__Task__Group_3__1 )
            // InternalDsl.g:970:2: rule__Task__Group_3__0__Impl rule__Task__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0"


    // $ANTLR start "rule__Task__Group_3__0__Impl"
    // InternalDsl.g:977:1: rule__Task__Group_3__0__Impl : ( 'Do:' ) ;
    public final void rule__Task__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:981:1: ( ( 'Do:' ) )
            // InternalDsl.g:982:1: ( 'Do:' )
            {
            // InternalDsl.g:982:1: ( 'Do:' )
            // InternalDsl.g:983:2: 'Do:'
            {
             before(grammarAccess.getTaskAccess().getDoKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__0__Impl"


    // $ANTLR start "rule__Task__Group_3__1"
    // InternalDsl.g:992:1: rule__Task__Group_3__1 : rule__Task__Group_3__1__Impl ;
    public final void rule__Task__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:996:1: ( rule__Task__Group_3__1__Impl )
            // InternalDsl.g:997:2: rule__Task__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1"


    // $ANTLR start "rule__Task__Group_3__1__Impl"
    // InternalDsl.g:1003:1: rule__Task__Group_3__1__Impl : ( ( rule__Task__ActionAssignment_3_1 ) ) ;
    public final void rule__Task__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1007:1: ( ( ( rule__Task__ActionAssignment_3_1 ) ) )
            // InternalDsl.g:1008:1: ( ( rule__Task__ActionAssignment_3_1 ) )
            {
            // InternalDsl.g:1008:1: ( ( rule__Task__ActionAssignment_3_1 ) )
            // InternalDsl.g:1009:2: ( rule__Task__ActionAssignment_3_1 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_3_1()); 
            // InternalDsl.g:1010:2: ( rule__Task__ActionAssignment_3_1 )
            // InternalDsl.g:1010:3: rule__Task__ActionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_3__1__Impl"


    // $ANTLR start "rule__Task__Group_4__0"
    // InternalDsl.g:1019:1: rule__Task__Group_4__0 : rule__Task__Group_4__0__Impl rule__Task__Group_4__1 ;
    public final void rule__Task__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( rule__Task__Group_4__0__Impl rule__Task__Group_4__1 )
            // InternalDsl.g:1024:2: rule__Task__Group_4__0__Impl rule__Task__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0"


    // $ANTLR start "rule__Task__Group_4__0__Impl"
    // InternalDsl.g:1031:1: rule__Task__Group_4__0__Impl : ( 'For' ) ;
    public final void rule__Task__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1035:1: ( ( 'For' ) )
            // InternalDsl.g:1036:1: ( 'For' )
            {
            // InternalDsl.g:1036:1: ( 'For' )
            // InternalDsl.g:1037:2: 'For'
            {
             before(grammarAccess.getTaskAccess().getForKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getForKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__0__Impl"


    // $ANTLR start "rule__Task__Group_4__1"
    // InternalDsl.g:1046:1: rule__Task__Group_4__1 : rule__Task__Group_4__1__Impl rule__Task__Group_4__2 ;
    public final void rule__Task__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1050:1: ( rule__Task__Group_4__1__Impl rule__Task__Group_4__2 )
            // InternalDsl.g:1051:2: rule__Task__Group_4__1__Impl rule__Task__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1"


    // $ANTLR start "rule__Task__Group_4__1__Impl"
    // InternalDsl.g:1058:1: rule__Task__Group_4__1__Impl : ( 'Max:' ) ;
    public final void rule__Task__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1062:1: ( ( 'Max:' ) )
            // InternalDsl.g:1063:1: ( 'Max:' )
            {
            // InternalDsl.g:1063:1: ( 'Max:' )
            // InternalDsl.g:1064:2: 'Max:'
            {
             before(grammarAccess.getTaskAccess().getMaxKeyword_4_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getMaxKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__1__Impl"


    // $ANTLR start "rule__Task__Group_4__2"
    // InternalDsl.g:1073:1: rule__Task__Group_4__2 : rule__Task__Group_4__2__Impl rule__Task__Group_4__3 ;
    public final void rule__Task__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1077:1: ( rule__Task__Group_4__2__Impl rule__Task__Group_4__3 )
            // InternalDsl.g:1078:2: rule__Task__Group_4__2__Impl rule__Task__Group_4__3
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__2"


    // $ANTLR start "rule__Task__Group_4__2__Impl"
    // InternalDsl.g:1085:1: rule__Task__Group_4__2__Impl : ( ( rule__Task__NrOfTimesAssignment_4_2 ) ) ;
    public final void rule__Task__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1089:1: ( ( ( rule__Task__NrOfTimesAssignment_4_2 ) ) )
            // InternalDsl.g:1090:1: ( ( rule__Task__NrOfTimesAssignment_4_2 ) )
            {
            // InternalDsl.g:1090:1: ( ( rule__Task__NrOfTimesAssignment_4_2 ) )
            // InternalDsl.g:1091:2: ( rule__Task__NrOfTimesAssignment_4_2 )
            {
             before(grammarAccess.getTaskAccess().getNrOfTimesAssignment_4_2()); 
            // InternalDsl.g:1092:2: ( rule__Task__NrOfTimesAssignment_4_2 )
            // InternalDsl.g:1092:3: rule__Task__NrOfTimesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__NrOfTimesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNrOfTimesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__2__Impl"


    // $ANTLR start "rule__Task__Group_4__3"
    // InternalDsl.g:1100:1: rule__Task__Group_4__3 : rule__Task__Group_4__3__Impl ;
    public final void rule__Task__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1104:1: ( rule__Task__Group_4__3__Impl )
            // InternalDsl.g:1105:2: rule__Task__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__3"


    // $ANTLR start "rule__Task__Group_4__3__Impl"
    // InternalDsl.g:1111:1: rule__Task__Group_4__3__Impl : ( 'Times' ) ;
    public final void rule__Task__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1115:1: ( ( 'Times' ) )
            // InternalDsl.g:1116:1: ( 'Times' )
            {
            // InternalDsl.g:1116:1: ( 'Times' )
            // InternalDsl.g:1117:2: 'Times'
            {
             before(grammarAccess.getTaskAccess().getTimesKeyword_4_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimesKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_4__3__Impl"


    // $ANTLR start "rule__Task__Group_5__0"
    // InternalDsl.g:1127:1: rule__Task__Group_5__0 : rule__Task__Group_5__0__Impl rule__Task__Group_5__1 ;
    public final void rule__Task__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1131:1: ( rule__Task__Group_5__0__Impl rule__Task__Group_5__1 )
            // InternalDsl.g:1132:2: rule__Task__Group_5__0__Impl rule__Task__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0"


    // $ANTLR start "rule__Task__Group_5__0__Impl"
    // InternalDsl.g:1139:1: rule__Task__Group_5__0__Impl : ( 'Not:' ) ;
    public final void rule__Task__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1143:1: ( ( 'Not:' ) )
            // InternalDsl.g:1144:1: ( 'Not:' )
            {
            // InternalDsl.g:1144:1: ( 'Not:' )
            // InternalDsl.g:1145:2: 'Not:'
            {
             before(grammarAccess.getTaskAccess().getNotKeyword_5_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNotKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__0__Impl"


    // $ANTLR start "rule__Task__Group_5__1"
    // InternalDsl.g:1154:1: rule__Task__Group_5__1 : rule__Task__Group_5__1__Impl ;
    public final void rule__Task__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1158:1: ( rule__Task__Group_5__1__Impl )
            // InternalDsl.g:1159:2: rule__Task__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1"


    // $ANTLR start "rule__Task__Group_5__1__Impl"
    // InternalDsl.g:1165:1: rule__Task__Group_5__1__Impl : ( ( rule__Task__IgnoreBehaviorAssignment_5_1 ) ) ;
    public final void rule__Task__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1169:1: ( ( ( rule__Task__IgnoreBehaviorAssignment_5_1 ) ) )
            // InternalDsl.g:1170:1: ( ( rule__Task__IgnoreBehaviorAssignment_5_1 ) )
            {
            // InternalDsl.g:1170:1: ( ( rule__Task__IgnoreBehaviorAssignment_5_1 ) )
            // InternalDsl.g:1171:2: ( rule__Task__IgnoreBehaviorAssignment_5_1 )
            {
             before(grammarAccess.getTaskAccess().getIgnoreBehaviorAssignment_5_1()); 
            // InternalDsl.g:1172:2: ( rule__Task__IgnoreBehaviorAssignment_5_1 )
            // InternalDsl.g:1172:3: rule__Task__IgnoreBehaviorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__IgnoreBehaviorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIgnoreBehaviorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_5__1__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalDsl.g:1181:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1185:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalDsl.g:1186:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalDsl.g:1193:1: rule__Task__Group_6__0__Impl : ( 'ExpiresAfter:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1197:1: ( ( 'ExpiresAfter:' ) )
            // InternalDsl.g:1198:1: ( 'ExpiresAfter:' )
            {
            // InternalDsl.g:1198:1: ( 'ExpiresAfter:' )
            // InternalDsl.g:1199:2: 'ExpiresAfter:'
            {
             before(grammarAccess.getTaskAccess().getExpiresAfterKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getExpiresAfterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalDsl.g:1208:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl rule__Task__Group_6__2 ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1212:1: ( rule__Task__Group_6__1__Impl rule__Task__Group_6__2 )
            // InternalDsl.g:1213:2: rule__Task__Group_6__1__Impl rule__Task__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalDsl.g:1220:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__TimeAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1224:1: ( ( ( rule__Task__TimeAssignment_6_1 ) ) )
            // InternalDsl.g:1225:1: ( ( rule__Task__TimeAssignment_6_1 ) )
            {
            // InternalDsl.g:1225:1: ( ( rule__Task__TimeAssignment_6_1 ) )
            // InternalDsl.g:1226:2: ( rule__Task__TimeAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getTimeAssignment_6_1()); 
            // InternalDsl.g:1227:2: ( rule__Task__TimeAssignment_6_1 )
            // InternalDsl.g:1227:3: rule__Task__TimeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_6__2"
    // InternalDsl.g:1235:1: rule__Task__Group_6__2 : rule__Task__Group_6__2__Impl ;
    public final void rule__Task__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1239:1: ( rule__Task__Group_6__2__Impl )
            // InternalDsl.g:1240:2: rule__Task__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2"


    // $ANTLR start "rule__Task__Group_6__2__Impl"
    // InternalDsl.g:1246:1: rule__Task__Group_6__2__Impl : ( ( rule__Task__TimeunitAssignment_6_2 ) ) ;
    public final void rule__Task__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1250:1: ( ( ( rule__Task__TimeunitAssignment_6_2 ) ) )
            // InternalDsl.g:1251:1: ( ( rule__Task__TimeunitAssignment_6_2 ) )
            {
            // InternalDsl.g:1251:1: ( ( rule__Task__TimeunitAssignment_6_2 ) )
            // InternalDsl.g:1252:2: ( rule__Task__TimeunitAssignment_6_2 )
            {
             before(grammarAccess.getTaskAccess().getTimeunitAssignment_6_2()); 
            // InternalDsl.g:1253:2: ( rule__Task__TimeunitAssignment_6_2 )
            // InternalDsl.g:1253:3: rule__Task__TimeunitAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__TimeunitAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getTimeunitAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__0"
    // InternalDsl.g:1262:1: rule__ColorSensor__Group_0__0 : rule__ColorSensor__Group_0__0__Impl rule__ColorSensor__Group_0__1 ;
    public final void rule__ColorSensor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1266:1: ( rule__ColorSensor__Group_0__0__Impl rule__ColorSensor__Group_0__1 )
            // InternalDsl.g:1267:2: rule__ColorSensor__Group_0__0__Impl rule__ColorSensor__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__ColorSensor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__0"


    // $ANTLR start "rule__ColorSensor__Group_0__0__Impl"
    // InternalDsl.g:1274:1: rule__ColorSensor__Group_0__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1278:1: ( ( 'ColorSensor' ) )
            // InternalDsl.g:1279:1: ( 'ColorSensor' )
            {
            // InternalDsl.g:1279:1: ( 'ColorSensor' )
            // InternalDsl.g:1280:2: 'ColorSensor'
            {
             before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__0__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__1"
    // InternalDsl.g:1289:1: rule__ColorSensor__Group_0__1 : rule__ColorSensor__Group_0__1__Impl rule__ColorSensor__Group_0__2 ;
    public final void rule__ColorSensor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1293:1: ( rule__ColorSensor__Group_0__1__Impl rule__ColorSensor__Group_0__2 )
            // InternalDsl.g:1294:2: rule__ColorSensor__Group_0__1__Impl rule__ColorSensor__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__ColorSensor__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__1"


    // $ANTLR start "rule__ColorSensor__Group_0__1__Impl"
    // InternalDsl.g:1301:1: rule__ColorSensor__Group_0__1__Impl : ( 'On' ) ;
    public final void rule__ColorSensor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1305:1: ( ( 'On' ) )
            // InternalDsl.g:1306:1: ( 'On' )
            {
            // InternalDsl.g:1306:1: ( 'On' )
            // InternalDsl.g:1307:2: 'On'
            {
             before(grammarAccess.getColorSensorAccess().getOnKeyword_0_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getOnKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__2"
    // InternalDsl.g:1316:1: rule__ColorSensor__Group_0__2 : rule__ColorSensor__Group_0__2__Impl rule__ColorSensor__Group_0__3 ;
    public final void rule__ColorSensor__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( rule__ColorSensor__Group_0__2__Impl rule__ColorSensor__Group_0__3 )
            // InternalDsl.g:1321:2: rule__ColorSensor__Group_0__2__Impl rule__ColorSensor__Group_0__3
            {
            pushFollow(FOLLOW_17);
            rule__ColorSensor__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__2"


    // $ANTLR start "rule__ColorSensor__Group_0__2__Impl"
    // InternalDsl.g:1328:1: rule__ColorSensor__Group_0__2__Impl : ( ( rule__ColorSensor__DistinctAssignment_0_2 )? ) ;
    public final void rule__ColorSensor__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1332:1: ( ( ( rule__ColorSensor__DistinctAssignment_0_2 )? ) )
            // InternalDsl.g:1333:1: ( ( rule__ColorSensor__DistinctAssignment_0_2 )? )
            {
            // InternalDsl.g:1333:1: ( ( rule__ColorSensor__DistinctAssignment_0_2 )? )
            // InternalDsl.g:1334:2: ( rule__ColorSensor__DistinctAssignment_0_2 )?
            {
             before(grammarAccess.getColorSensorAccess().getDistinctAssignment_0_2()); 
            // InternalDsl.g:1335:2: ( rule__ColorSensor__DistinctAssignment_0_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==66) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1335:3: rule__ColorSensor__DistinctAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorSensor__DistinctAssignment_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorSensorAccess().getDistinctAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__3"
    // InternalDsl.g:1343:1: rule__ColorSensor__Group_0__3 : rule__ColorSensor__Group_0__3__Impl rule__ColorSensor__Group_0__4 ;
    public final void rule__ColorSensor__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1347:1: ( rule__ColorSensor__Group_0__3__Impl rule__ColorSensor__Group_0__4 )
            // InternalDsl.g:1348:2: rule__ColorSensor__Group_0__3__Impl rule__ColorSensor__Group_0__4
            {
            pushFollow(FOLLOW_18);
            rule__ColorSensor__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__3"


    // $ANTLR start "rule__ColorSensor__Group_0__3__Impl"
    // InternalDsl.g:1355:1: rule__ColorSensor__Group_0__3__Impl : ( 'DetectedColor' ) ;
    public final void rule__ColorSensor__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1359:1: ( ( 'DetectedColor' ) )
            // InternalDsl.g:1360:1: ( 'DetectedColor' )
            {
            // InternalDsl.g:1360:1: ( 'DetectedColor' )
            // InternalDsl.g:1361:2: 'DetectedColor'
            {
             before(grammarAccess.getColorSensorAccess().getDetectedColorKeyword_0_3()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getDetectedColorKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__3__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__4"
    // InternalDsl.g:1370:1: rule__ColorSensor__Group_0__4 : rule__ColorSensor__Group_0__4__Impl rule__ColorSensor__Group_0__5 ;
    public final void rule__ColorSensor__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1374:1: ( rule__ColorSensor__Group_0__4__Impl rule__ColorSensor__Group_0__5 )
            // InternalDsl.g:1375:2: rule__ColorSensor__Group_0__4__Impl rule__ColorSensor__Group_0__5
            {
            pushFollow(FOLLOW_19);
            rule__ColorSensor__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__4"


    // $ANTLR start "rule__ColorSensor__Group_0__4__Impl"
    // InternalDsl.g:1382:1: rule__ColorSensor__Group_0__4__Impl : ( 'is:' ) ;
    public final void rule__ColorSensor__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1386:1: ( ( 'is:' ) )
            // InternalDsl.g:1387:1: ( 'is:' )
            {
            // InternalDsl.g:1387:1: ( 'is:' )
            // InternalDsl.g:1388:2: 'is:'
            {
             before(grammarAccess.getColorSensorAccess().getIsKeyword_0_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getIsKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__4__Impl"


    // $ANTLR start "rule__ColorSensor__Group_0__5"
    // InternalDsl.g:1397:1: rule__ColorSensor__Group_0__5 : rule__ColorSensor__Group_0__5__Impl ;
    public final void rule__ColorSensor__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1401:1: ( rule__ColorSensor__Group_0__5__Impl )
            // InternalDsl.g:1402:2: rule__ColorSensor__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__5"


    // $ANTLR start "rule__ColorSensor__Group_0__5__Impl"
    // InternalDsl.g:1408:1: rule__ColorSensor__Group_0__5__Impl : ( ( rule__ColorSensor__KeyAssignment_0_5 ) ) ;
    public final void rule__ColorSensor__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1412:1: ( ( ( rule__ColorSensor__KeyAssignment_0_5 ) ) )
            // InternalDsl.g:1413:1: ( ( rule__ColorSensor__KeyAssignment_0_5 ) )
            {
            // InternalDsl.g:1413:1: ( ( rule__ColorSensor__KeyAssignment_0_5 ) )
            // InternalDsl.g:1414:2: ( rule__ColorSensor__KeyAssignment_0_5 )
            {
             before(grammarAccess.getColorSensorAccess().getKeyAssignment_0_5()); 
            // InternalDsl.g:1415:2: ( rule__ColorSensor__KeyAssignment_0_5 )
            // InternalDsl.g:1415:3: rule__ColorSensor__KeyAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__KeyAssignment_0_5();

            state._fsp--;


            }

             after(grammarAccess.getColorSensorAccess().getKeyAssignment_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_0__5__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__0"
    // InternalDsl.g:1424:1: rule__ColorSensor__Group_1__0 : rule__ColorSensor__Group_1__0__Impl rule__ColorSensor__Group_1__1 ;
    public final void rule__ColorSensor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1428:1: ( rule__ColorSensor__Group_1__0__Impl rule__ColorSensor__Group_1__1 )
            // InternalDsl.g:1429:2: rule__ColorSensor__Group_1__0__Impl rule__ColorSensor__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ColorSensor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__0"


    // $ANTLR start "rule__ColorSensor__Group_1__0__Impl"
    // InternalDsl.g:1436:1: rule__ColorSensor__Group_1__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1440:1: ( ( 'ColorSensor' ) )
            // InternalDsl.g:1441:1: ( 'ColorSensor' )
            {
            // InternalDsl.g:1441:1: ( 'ColorSensor' )
            // InternalDsl.g:1442:2: 'ColorSensor'
            {
             before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_1_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getColorSensorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__0__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__1"
    // InternalDsl.g:1451:1: rule__ColorSensor__Group_1__1 : rule__ColorSensor__Group_1__1__Impl rule__ColorSensor__Group_1__2 ;
    public final void rule__ColorSensor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1455:1: ( rule__ColorSensor__Group_1__1__Impl rule__ColorSensor__Group_1__2 )
            // InternalDsl.g:1456:2: rule__ColorSensor__Group_1__1__Impl rule__ColorSensor__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ColorSensor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__1"


    // $ANTLR start "rule__ColorSensor__Group_1__1__Impl"
    // InternalDsl.g:1463:1: rule__ColorSensor__Group_1__1__Impl : ( 'On' ) ;
    public final void rule__ColorSensor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1467:1: ( ( 'On' ) )
            // InternalDsl.g:1468:1: ( 'On' )
            {
            // InternalDsl.g:1468:1: ( 'On' )
            // InternalDsl.g:1469:2: 'On'
            {
             before(grammarAccess.getColorSensorAccess().getOnKeyword_1_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getOnKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__2"
    // InternalDsl.g:1478:1: rule__ColorSensor__Group_1__2 : rule__ColorSensor__Group_1__2__Impl rule__ColorSensor__Group_1__3 ;
    public final void rule__ColorSensor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1482:1: ( rule__ColorSensor__Group_1__2__Impl rule__ColorSensor__Group_1__3 )
            // InternalDsl.g:1483:2: rule__ColorSensor__Group_1__2__Impl rule__ColorSensor__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__ColorSensor__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__2"


    // $ANTLR start "rule__ColorSensor__Group_1__2__Impl"
    // InternalDsl.g:1490:1: rule__ColorSensor__Group_1__2__Impl : ( ( rule__ColorSensor__DistinctAssignment_1_2 )? ) ;
    public final void rule__ColorSensor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1494:1: ( ( ( rule__ColorSensor__DistinctAssignment_1_2 )? ) )
            // InternalDsl.g:1495:1: ( ( rule__ColorSensor__DistinctAssignment_1_2 )? )
            {
            // InternalDsl.g:1495:1: ( ( rule__ColorSensor__DistinctAssignment_1_2 )? )
            // InternalDsl.g:1496:2: ( rule__ColorSensor__DistinctAssignment_1_2 )?
            {
             before(grammarAccess.getColorSensorAccess().getDistinctAssignment_1_2()); 
            // InternalDsl.g:1497:2: ( rule__ColorSensor__DistinctAssignment_1_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==66) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1497:3: rule__ColorSensor__DistinctAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColorSensor__DistinctAssignment_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorSensorAccess().getDistinctAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__3"
    // InternalDsl.g:1505:1: rule__ColorSensor__Group_1__3 : rule__ColorSensor__Group_1__3__Impl rule__ColorSensor__Group_1__4 ;
    public final void rule__ColorSensor__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1509:1: ( rule__ColorSensor__Group_1__3__Impl rule__ColorSensor__Group_1__4 )
            // InternalDsl.g:1510:2: rule__ColorSensor__Group_1__3__Impl rule__ColorSensor__Group_1__4
            {
            pushFollow(FOLLOW_21);
            rule__ColorSensor__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__3"


    // $ANTLR start "rule__ColorSensor__Group_1__3__Impl"
    // InternalDsl.g:1517:1: rule__ColorSensor__Group_1__3__Impl : ( 'DetectedColors' ) ;
    public final void rule__ColorSensor__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1521:1: ( ( 'DetectedColors' ) )
            // InternalDsl.g:1522:1: ( 'DetectedColors' )
            {
            // InternalDsl.g:1522:1: ( 'DetectedColors' )
            // InternalDsl.g:1523:2: 'DetectedColors'
            {
             before(grammarAccess.getColorSensorAccess().getDetectedColorsKeyword_1_3()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getDetectedColorsKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__3__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__4"
    // InternalDsl.g:1532:1: rule__ColorSensor__Group_1__4 : rule__ColorSensor__Group_1__4__Impl rule__ColorSensor__Group_1__5 ;
    public final void rule__ColorSensor__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1536:1: ( rule__ColorSensor__Group_1__4__Impl rule__ColorSensor__Group_1__5 )
            // InternalDsl.g:1537:2: rule__ColorSensor__Group_1__4__Impl rule__ColorSensor__Group_1__5
            {
            pushFollow(FOLLOW_19);
            rule__ColorSensor__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__4"


    // $ANTLR start "rule__ColorSensor__Group_1__4__Impl"
    // InternalDsl.g:1544:1: rule__ColorSensor__Group_1__4__Impl : ( 'are:' ) ;
    public final void rule__ColorSensor__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1548:1: ( ( 'are:' ) )
            // InternalDsl.g:1549:1: ( 'are:' )
            {
            // InternalDsl.g:1549:1: ( 'are:' )
            // InternalDsl.g:1550:2: 'are:'
            {
             before(grammarAccess.getColorSensorAccess().getAreKeyword_1_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getAreKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__4__Impl"


    // $ANTLR start "rule__ColorSensor__Group_1__5"
    // InternalDsl.g:1559:1: rule__ColorSensor__Group_1__5 : rule__ColorSensor__Group_1__5__Impl ;
    public final void rule__ColorSensor__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1563:1: ( rule__ColorSensor__Group_1__5__Impl )
            // InternalDsl.g:1564:2: rule__ColorSensor__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__5"


    // $ANTLR start "rule__ColorSensor__Group_1__5__Impl"
    // InternalDsl.g:1570:1: rule__ColorSensor__Group_1__5__Impl : ( ( ( rule__ColorSensor__KeysAssignment_1_5 ) ) ( ( rule__ColorSensor__KeysAssignment_1_5 )* ) ) ;
    public final void rule__ColorSensor__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1574:1: ( ( ( ( rule__ColorSensor__KeysAssignment_1_5 ) ) ( ( rule__ColorSensor__KeysAssignment_1_5 )* ) ) )
            // InternalDsl.g:1575:1: ( ( ( rule__ColorSensor__KeysAssignment_1_5 ) ) ( ( rule__ColorSensor__KeysAssignment_1_5 )* ) )
            {
            // InternalDsl.g:1575:1: ( ( ( rule__ColorSensor__KeysAssignment_1_5 ) ) ( ( rule__ColorSensor__KeysAssignment_1_5 )* ) )
            // InternalDsl.g:1576:2: ( ( rule__ColorSensor__KeysAssignment_1_5 ) ) ( ( rule__ColorSensor__KeysAssignment_1_5 )* )
            {
            // InternalDsl.g:1576:2: ( ( rule__ColorSensor__KeysAssignment_1_5 ) )
            // InternalDsl.g:1577:3: ( rule__ColorSensor__KeysAssignment_1_5 )
            {
             before(grammarAccess.getColorSensorAccess().getKeysAssignment_1_5()); 
            // InternalDsl.g:1578:3: ( rule__ColorSensor__KeysAssignment_1_5 )
            // InternalDsl.g:1578:4: rule__ColorSensor__KeysAssignment_1_5
            {
            pushFollow(FOLLOW_22);
            rule__ColorSensor__KeysAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getColorSensorAccess().getKeysAssignment_1_5()); 

            }

            // InternalDsl.g:1581:2: ( ( rule__ColorSensor__KeysAssignment_1_5 )* )
            // InternalDsl.g:1582:3: ( rule__ColorSensor__KeysAssignment_1_5 )*
            {
             before(grammarAccess.getColorSensorAccess().getKeysAssignment_1_5()); 
            // InternalDsl.g:1583:3: ( rule__ColorSensor__KeysAssignment_1_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=27 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:1583:4: rule__ColorSensor__KeysAssignment_1_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ColorSensor__KeysAssignment_1_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getColorSensorAccess().getKeysAssignment_1_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group_1__5__Impl"


    // $ANTLR start "rule__TouchSensor__Group__0"
    // InternalDsl.g:1593:1: rule__TouchSensor__Group__0 : rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 ;
    public final void rule__TouchSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1597:1: ( rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 )
            // InternalDsl.g:1598:2: rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TouchSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__0"


    // $ANTLR start "rule__TouchSensor__Group__0__Impl"
    // InternalDsl.g:1605:1: rule__TouchSensor__Group__0__Impl : ( 'TouchSensor' ) ;
    public final void rule__TouchSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1609:1: ( ( 'TouchSensor' ) )
            // InternalDsl.g:1610:1: ( 'TouchSensor' )
            {
            // InternalDsl.g:1610:1: ( 'TouchSensor' )
            // InternalDsl.g:1611:2: 'TouchSensor'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__0__Impl"


    // $ANTLR start "rule__TouchSensor__Group__1"
    // InternalDsl.g:1620:1: rule__TouchSensor__Group__1 : rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 ;
    public final void rule__TouchSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 )
            // InternalDsl.g:1625:2: rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__TouchSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__1"


    // $ANTLR start "rule__TouchSensor__Group__1__Impl"
    // InternalDsl.g:1632:1: rule__TouchSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__TouchSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1636:1: ( ( 'On' ) )
            // InternalDsl.g:1637:1: ( 'On' )
            {
            // InternalDsl.g:1637:1: ( 'On' )
            // InternalDsl.g:1638:2: 'On'
            {
             before(grammarAccess.getTouchSensorAccess().getOnKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__1__Impl"


    // $ANTLR start "rule__TouchSensor__Group__2"
    // InternalDsl.g:1647:1: rule__TouchSensor__Group__2 : rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 ;
    public final void rule__TouchSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1651:1: ( rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 )
            // InternalDsl.g:1652:2: rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__TouchSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__2"


    // $ANTLR start "rule__TouchSensor__Group__2__Impl"
    // InternalDsl.g:1659:1: rule__TouchSensor__Group__2__Impl : ( 'TouchedSide:' ) ;
    public final void rule__TouchSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1663:1: ( ( 'TouchedSide:' ) )
            // InternalDsl.g:1664:1: ( 'TouchedSide:' )
            {
            // InternalDsl.g:1664:1: ( 'TouchedSide:' )
            // InternalDsl.g:1665:2: 'TouchedSide:'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__2__Impl"


    // $ANTLR start "rule__TouchSensor__Group__3"
    // InternalDsl.g:1674:1: rule__TouchSensor__Group__3 : rule__TouchSensor__Group__3__Impl ;
    public final void rule__TouchSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1678:1: ( rule__TouchSensor__Group__3__Impl )
            // InternalDsl.g:1679:2: rule__TouchSensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__3"


    // $ANTLR start "rule__TouchSensor__Group__3__Impl"
    // InternalDsl.g:1685:1: rule__TouchSensor__Group__3__Impl : ( ( rule__TouchSensor__KeyAssignment_3 ) ) ;
    public final void rule__TouchSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1689:1: ( ( ( rule__TouchSensor__KeyAssignment_3 ) ) )
            // InternalDsl.g:1690:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            {
            // InternalDsl.g:1690:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            // InternalDsl.g:1691:2: ( rule__TouchSensor__KeyAssignment_3 )
            {
             before(grammarAccess.getTouchSensorAccess().getKeyAssignment_3()); 
            // InternalDsl.g:1692:2: ( rule__TouchSensor__KeyAssignment_3 )
            // InternalDsl.g:1692:3: rule__TouchSensor__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorAccess().getKeyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__3__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__0"
    // InternalDsl.g:1701:1: rule__UltrasonicSensor__Group__0 : rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 ;
    public final void rule__UltrasonicSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1705:1: ( rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 )
            // InternalDsl.g:1706:2: rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UltrasonicSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__0"


    // $ANTLR start "rule__UltrasonicSensor__Group__0__Impl"
    // InternalDsl.g:1713:1: rule__UltrasonicSensor__Group__0__Impl : ( 'USensor' ) ;
    public final void rule__UltrasonicSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1717:1: ( ( 'USensor' ) )
            // InternalDsl.g:1718:1: ( 'USensor' )
            {
            // InternalDsl.g:1718:1: ( 'USensor' )
            // InternalDsl.g:1719:2: 'USensor'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__0__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__1"
    // InternalDsl.g:1728:1: rule__UltrasonicSensor__Group__1 : rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 ;
    public final void rule__UltrasonicSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1732:1: ( rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 )
            // InternalDsl.g:1733:2: rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__UltrasonicSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__1"


    // $ANTLR start "rule__UltrasonicSensor__Group__1__Impl"
    // InternalDsl.g:1740:1: rule__UltrasonicSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__UltrasonicSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1744:1: ( ( 'On' ) )
            // InternalDsl.g:1745:1: ( 'On' )
            {
            // InternalDsl.g:1745:1: ( 'On' )
            // InternalDsl.g:1746:2: 'On'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__1__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__2"
    // InternalDsl.g:1755:1: rule__UltrasonicSensor__Group__2 : rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 ;
    public final void rule__UltrasonicSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1759:1: ( rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 )
            // InternalDsl.g:1760:2: rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__UltrasonicSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__2"


    // $ANTLR start "rule__UltrasonicSensor__Group__2__Impl"
    // InternalDsl.g:1767:1: rule__UltrasonicSensor__Group__2__Impl : ( 'Distance:' ) ;
    public final void rule__UltrasonicSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1771:1: ( ( 'Distance:' ) )
            // InternalDsl.g:1772:1: ( 'Distance:' )
            {
            // InternalDsl.g:1772:1: ( 'Distance:' )
            // InternalDsl.g:1773:2: 'Distance:'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__2__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__3"
    // InternalDsl.g:1782:1: rule__UltrasonicSensor__Group__3 : rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 ;
    public final void rule__UltrasonicSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 )
            // InternalDsl.g:1787:2: rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__UltrasonicSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__3"


    // $ANTLR start "rule__UltrasonicSensor__Group__3__Impl"
    // InternalDsl.g:1794:1: rule__UltrasonicSensor__Group__3__Impl : ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) ;
    public final void rule__UltrasonicSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1798:1: ( ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) )
            // InternalDsl.g:1799:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            {
            // InternalDsl.g:1799:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            // InternalDsl.g:1800:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3()); 
            // InternalDsl.g:1801:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            // InternalDsl.g:1801:3: rule__UltrasonicSensor__ComparatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__ComparatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__3__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__4"
    // InternalDsl.g:1809:1: rule__UltrasonicSensor__Group__4 : rule__UltrasonicSensor__Group__4__Impl ;
    public final void rule__UltrasonicSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1813:1: ( rule__UltrasonicSensor__Group__4__Impl )
            // InternalDsl.g:1814:2: rule__UltrasonicSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__4"


    // $ANTLR start "rule__UltrasonicSensor__Group__4__Impl"
    // InternalDsl.g:1820:1: rule__UltrasonicSensor__Group__4__Impl : ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) ;
    public final void rule__UltrasonicSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1824:1: ( ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) )
            // InternalDsl.g:1825:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            {
            // InternalDsl.g:1825:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            // InternalDsl.g:1826:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4()); 
            // InternalDsl.g:1827:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            // InternalDsl.g:1827:3: rule__UltrasonicSensor__DistanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__DistanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__4__Impl"


    // $ANTLR start "rule__Mission__TasksAssignment_1"
    // InternalDsl.g:1836:1: rule__Mission__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__Mission__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1840:1: ( ( ruleTask ) )
            // InternalDsl.g:1841:2: ( ruleTask )
            {
            // InternalDsl.g:1841:2: ( ruleTask )
            // InternalDsl.g:1842:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TasksAssignment_1"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalDsl.g:1851:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1855:1: ( ( RULE_ID ) )
            // InternalDsl.g:1856:2: ( RULE_ID )
            {
            // InternalDsl.g:1856:2: ( RULE_ID )
            // InternalDsl.g:1857:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__SensorAssignment_2_1"
    // InternalDsl.g:1866:1: rule__Task__SensorAssignment_2_1 : ( ruleSensorType ) ;
    public final void rule__Task__SensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1870:1: ( ( ruleSensorType ) )
            // InternalDsl.g:1871:2: ( ruleSensorType )
            {
            // InternalDsl.g:1871:2: ( ruleSensorType )
            // InternalDsl.g:1872:3: ruleSensorType
            {
             before(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SensorAssignment_2_1"


    // $ANTLR start "rule__Task__ActionAssignment_3_1"
    // InternalDsl.g:1881:1: rule__Task__ActionAssignment_3_1 : ( ruleActions ) ;
    public final void rule__Task__ActionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( ( ruleActions ) )
            // InternalDsl.g:1886:2: ( ruleActions )
            {
            // InternalDsl.g:1886:2: ( ruleActions )
            // InternalDsl.g:1887:3: ruleActions
            {
             before(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_3_1"


    // $ANTLR start "rule__Task__NrOfTimesAssignment_4_2"
    // InternalDsl.g:1896:1: rule__Task__NrOfTimesAssignment_4_2 : ( RULE_INT ) ;
    public final void rule__Task__NrOfTimesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( ( RULE_INT ) )
            // InternalDsl.g:1901:2: ( RULE_INT )
            {
            // InternalDsl.g:1901:2: ( RULE_INT )
            // InternalDsl.g:1902:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getNrOfTimesINTTerminalRuleCall_4_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNrOfTimesINTTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NrOfTimesAssignment_4_2"


    // $ANTLR start "rule__Task__IgnoreBehaviorAssignment_5_1"
    // InternalDsl.g:1911:1: rule__Task__IgnoreBehaviorAssignment_5_1 : ( ruleIgnorables ) ;
    public final void rule__Task__IgnoreBehaviorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1915:1: ( ( ruleIgnorables ) )
            // InternalDsl.g:1916:2: ( ruleIgnorables )
            {
            // InternalDsl.g:1916:2: ( ruleIgnorables )
            // InternalDsl.g:1917:3: ruleIgnorables
            {
             before(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIgnorables();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IgnoreBehaviorAssignment_5_1"


    // $ANTLR start "rule__Task__TimeAssignment_6_1"
    // InternalDsl.g:1926:1: rule__Task__TimeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Task__TimeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1930:1: ( ( RULE_INT ) )
            // InternalDsl.g:1931:2: ( RULE_INT )
            {
            // InternalDsl.g:1931:2: ( RULE_INT )
            // InternalDsl.g:1932:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getTimeINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTimeINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeAssignment_6_1"


    // $ANTLR start "rule__Task__TimeunitAssignment_6_2"
    // InternalDsl.g:1941:1: rule__Task__TimeunitAssignment_6_2 : ( ruletimeUnitValue ) ;
    public final void rule__Task__TimeunitAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1945:1: ( ( ruletimeUnitValue ) )
            // InternalDsl.g:1946:2: ( ruletimeUnitValue )
            {
            // InternalDsl.g:1946:2: ( ruletimeUnitValue )
            // InternalDsl.g:1947:3: ruletimeUnitValue
            {
             before(grammarAccess.getTaskAccess().getTimeunitTimeUnitValueParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruletimeUnitValue();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getTimeunitTimeUnitValueParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__TimeunitAssignment_6_2"


    // $ANTLR start "rule__TimeUnitValue__UnitAssignment"
    // InternalDsl.g:1956:1: rule__TimeUnitValue__UnitAssignment : ( ruletimeUnit ) ;
    public final void rule__TimeUnitValue__UnitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1960:1: ( ( ruletimeUnit ) )
            // InternalDsl.g:1961:2: ( ruletimeUnit )
            {
            // InternalDsl.g:1961:2: ( ruletimeUnit )
            // InternalDsl.g:1962:3: ruletimeUnit
            {
             before(grammarAccess.getTimeUnitValueAccess().getUnitTimeUnitEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruletimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeUnitValueAccess().getUnitTimeUnitEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnitValue__UnitAssignment"


    // $ANTLR start "rule__Ignorables__AVOID_OBJECTSAssignment"
    // InternalDsl.g:1971:1: rule__Ignorables__AVOID_OBJECTSAssignment : ( ( 'AvoidObjects' ) ) ;
    public final void rule__Ignorables__AVOID_OBJECTSAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1975:1: ( ( ( 'AvoidObjects' ) ) )
            // InternalDsl.g:1976:2: ( ( 'AvoidObjects' ) )
            {
            // InternalDsl.g:1976:2: ( ( 'AvoidObjects' ) )
            // InternalDsl.g:1977:3: ( 'AvoidObjects' )
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 
            // InternalDsl.g:1978:3: ( 'AvoidObjects' )
            // InternalDsl.g:1979:4: 'AvoidObjects'
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 

            }

             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignorables__AVOID_OBJECTSAssignment"


    // $ANTLR start "rule__ColorSensor__DistinctAssignment_0_2"
    // InternalDsl.g:1990:1: rule__ColorSensor__DistinctAssignment_0_2 : ( ( 'New' ) ) ;
    public final void rule__ColorSensor__DistinctAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1994:1: ( ( ( 'New' ) ) )
            // InternalDsl.g:1995:2: ( ( 'New' ) )
            {
            // InternalDsl.g:1995:2: ( ( 'New' ) )
            // InternalDsl.g:1996:3: ( 'New' )
            {
             before(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0()); 
            // InternalDsl.g:1997:3: ( 'New' )
            // InternalDsl.g:1998:4: 'New'
            {
             before(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0()); 

            }

             after(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__DistinctAssignment_0_2"


    // $ANTLR start "rule__ColorSensor__KeyAssignment_0_5"
    // InternalDsl.g:2009:1: rule__ColorSensor__KeyAssignment_0_5 : ( ruleColorValue ) ;
    public final void rule__ColorSensor__KeyAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2013:1: ( ( ruleColorValue ) )
            // InternalDsl.g:2014:2: ( ruleColorValue )
            {
            // InternalDsl.g:2014:2: ( ruleColorValue )
            // InternalDsl.g:2015:3: ruleColorValue
            {
             before(grammarAccess.getColorSensorAccess().getKeyColorValueParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorSensorAccess().getKeyColorValueParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__KeyAssignment_0_5"


    // $ANTLR start "rule__ColorSensor__DistinctAssignment_1_2"
    // InternalDsl.g:2024:1: rule__ColorSensor__DistinctAssignment_1_2 : ( ( 'New' ) ) ;
    public final void rule__ColorSensor__DistinctAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( ( ( 'New' ) ) )
            // InternalDsl.g:2029:2: ( ( 'New' ) )
            {
            // InternalDsl.g:2029:2: ( ( 'New' ) )
            // InternalDsl.g:2030:3: ( 'New' )
            {
             before(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0()); 
            // InternalDsl.g:2031:3: ( 'New' )
            // InternalDsl.g:2032:4: 'New'
            {
             before(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0()); 

            }

             after(grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__DistinctAssignment_1_2"


    // $ANTLR start "rule__ColorSensor__KeysAssignment_1_5"
    // InternalDsl.g:2043:1: rule__ColorSensor__KeysAssignment_1_5 : ( ruleColorValue ) ;
    public final void rule__ColorSensor__KeysAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( ( ruleColorValue ) )
            // InternalDsl.g:2048:2: ( ruleColorValue )
            {
            // InternalDsl.g:2048:2: ( ruleColorValue )
            // InternalDsl.g:2049:3: ruleColorValue
            {
             before(grammarAccess.getColorSensorAccess().getKeysColorValueParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleColorValue();

            state._fsp--;

             after(grammarAccess.getColorSensorAccess().getKeysColorValueParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__KeysAssignment_1_5"


    // $ANTLR start "rule__TouchSensor__KeyAssignment_3"
    // InternalDsl.g:2058:1: rule__TouchSensor__KeyAssignment_3 : ( ruleTouchSensorSides ) ;
    public final void rule__TouchSensor__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2062:1: ( ( ruleTouchSensorSides ) )
            // InternalDsl.g:2063:2: ( ruleTouchSensorSides )
            {
            // InternalDsl.g:2063:2: ( ruleTouchSensorSides )
            // InternalDsl.g:2064:3: ruleTouchSensorSides
            {
             before(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTouchSensorSides();

            state._fsp--;

             after(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__KeyAssignment_3"


    // $ANTLR start "rule__UltrasonicSensor__ComparatorAssignment_3"
    // InternalDsl.g:2073:1: rule__UltrasonicSensor__ComparatorAssignment_3 : ( ruleCompareOperator ) ;
    public final void rule__UltrasonicSensor__ComparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2077:1: ( ( ruleCompareOperator ) )
            // InternalDsl.g:2078:2: ( ruleCompareOperator )
            {
            // InternalDsl.g:2078:2: ( ruleCompareOperator )
            // InternalDsl.g:2079:3: ruleCompareOperator
            {
             before(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__ComparatorAssignment_3"


    // $ANTLR start "rule__UltrasonicSensor__DistanceAssignment_4"
    // InternalDsl.g:2088:1: rule__UltrasonicSensor__DistanceAssignment_4 : ( RULE_DECIMAL ) ;
    public final void rule__UltrasonicSensor__DistanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2092:1: ( ( RULE_DECIMAL ) )
            // InternalDsl.g:2093:2: ( RULE_DECIMAL )
            {
            // InternalDsl.g:2093:2: ( RULE_DECIMAL )
            // InternalDsl.g:2094:3: RULE_DECIMAL
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__DistanceAssignment_4"


    // $ANTLR start "rule__ColorValue__ColorAssignment"
    // InternalDsl.g:2103:1: rule__ColorValue__ColorAssignment : ( ruleColors ) ;
    public final void rule__ColorValue__ColorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2107:1: ( ( ruleColors ) )
            // InternalDsl.g:2108:2: ( ruleColors )
            {
            // InternalDsl.g:2108:2: ( ruleColors )
            // InternalDsl.g:2109:3: ruleColors
            {
             before(grammarAccess.getColorValueAccess().getColorColorsEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getColorValueAccess().getColorColorsEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorValue__ColorAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0064000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xA080000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FFF8000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000FFF8000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});

}