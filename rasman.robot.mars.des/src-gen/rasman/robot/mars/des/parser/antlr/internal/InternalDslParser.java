package rasman.robot.mars.des.parser.antlr.internal;

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
import rasman.robot.mars.des.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'Task:'", "'Uses:'", "'Do:'", "'For'", "'Max:'", "'Times'", "'Not:'", "'ExpiresAfter:'", "'AvoidObjects'", "'ColorSensor'", "'On'", "'New'", "'DetectedColor'", "'is:'", "'DetectedColors'", "'are:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'", "'s'", "'ms'", "'LEFT'", "'RIGHT'", "'BOTH'", "'ANY'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'MEASURE'", "'DRIVETOEDGE'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mission";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalDsl.g:65:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalDsl.g:65:48: (iv_ruleMission= ruleMission EOF )
            // InternalDsl.g:66:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ ) )
            // InternalDsl.g:79:2: (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ )
            // InternalDsl.g:80:3: otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_tasks_1_0= ruleTask ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:85:4: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalDsl.g:85:4: (lv_tasks_1_0= ruleTask )
            	    // InternalDsl.g:86:5: lv_tasks_1_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"rasman.robot.mars.des.Dsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalDsl.g:107:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalDsl.g:107:45: (iv_ruleTask= ruleTask EOF )
            // InternalDsl.g:108:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalDsl.g:114:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+ (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )? (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )? (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_nrOfTimes_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_time_13_0=null;
        EObject lv_sensor_3_0 = null;

        Enumerator lv_action_5_0 = null;

        EObject lv_ignoreBehavior_11_0 = null;

        EObject lv_timeunit_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:120:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+ (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )? (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )? (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )? ) )
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+ (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )? (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )? (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )? )
            {
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+ (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )? (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )? (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )? )
            // InternalDsl.g:122:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+ (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )? (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )? (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalDsl.g:126:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:127:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:127:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:128:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:144:3: (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:145:4: otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getUsesKeyword_2_0());
                    			
                    // InternalDsl.g:149:4: ( (lv_sensor_3_0= ruleSensorType ) )
                    // InternalDsl.g:150:5: (lv_sensor_3_0= ruleSensorType )
                    {
                    // InternalDsl.g:150:5: (lv_sensor_3_0= ruleSensorType )
                    // InternalDsl.g:151:6: lv_sensor_3_0= ruleSensorType
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_sensor_3_0=ruleSensorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"sensor",
                    							lv_sensor_3_0,
                    							"rasman.robot.mars.des.Dsl.SensorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:169:3: (otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:170:4: otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDoKeyword_3_0());
            	    			
            	    // InternalDsl.g:174:4: ( (lv_action_5_0= ruleActions ) )
            	    // InternalDsl.g:175:5: (lv_action_5_0= ruleActions )
            	    {
            	    // InternalDsl.g:175:5: (lv_action_5_0= ruleActions )
            	    // InternalDsl.g:176:6: lv_action_5_0= ruleActions
            	    {

            	    						newCompositeNode(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_action_5_0=ruleActions();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"action",
            	    							lv_action_5_0,
            	    							"rasman.robot.mars.des.Dsl.Actions");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalDsl.g:194:3: (otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:195:4: otherlv_6= 'For' otherlv_7= 'Max:' ( (lv_nrOfTimes_8_0= RULE_INT ) ) otherlv_9= 'Times'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getForKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getMaxKeyword_4_1());
                    			
                    // InternalDsl.g:203:4: ( (lv_nrOfTimes_8_0= RULE_INT ) )
                    // InternalDsl.g:204:5: (lv_nrOfTimes_8_0= RULE_INT )
                    {
                    // InternalDsl.g:204:5: (lv_nrOfTimes_8_0= RULE_INT )
                    // InternalDsl.g:205:6: lv_nrOfTimes_8_0= RULE_INT
                    {
                    lv_nrOfTimes_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_nrOfTimes_8_0, grammarAccess.getTaskAccess().getNrOfTimesINTTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nrOfTimes",
                    							lv_nrOfTimes_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getTimesKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalDsl.g:226:3: (otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:227:4: otherlv_10= 'Not:' ( (lv_ignoreBehavior_11_0= ruleIgnorables ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getNotKeyword_5_0());
                    			
                    // InternalDsl.g:231:4: ( (lv_ignoreBehavior_11_0= ruleIgnorables ) )
                    // InternalDsl.g:232:5: (lv_ignoreBehavior_11_0= ruleIgnorables )
                    {
                    // InternalDsl.g:232:5: (lv_ignoreBehavior_11_0= ruleIgnorables )
                    // InternalDsl.g:233:6: lv_ignoreBehavior_11_0= ruleIgnorables
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_ignoreBehavior_11_0=ruleIgnorables();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"ignoreBehavior",
                    							lv_ignoreBehavior_11_0,
                    							"rasman.robot.mars.des.Dsl.Ignorables");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:251:3: (otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:252:4: otherlv_12= 'ExpiresAfter:' ( (lv_time_13_0= RULE_INT ) ) ( (lv_timeunit_14_0= ruletimeUnitValue ) )
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getExpiresAfterKeyword_6_0());
                    			
                    // InternalDsl.g:256:4: ( (lv_time_13_0= RULE_INT ) )
                    // InternalDsl.g:257:5: (lv_time_13_0= RULE_INT )
                    {
                    // InternalDsl.g:257:5: (lv_time_13_0= RULE_INT )
                    // InternalDsl.g:258:6: lv_time_13_0= RULE_INT
                    {
                    lv_time_13_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_time_13_0, grammarAccess.getTaskAccess().getTimeINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalDsl.g:274:4: ( (lv_timeunit_14_0= ruletimeUnitValue ) )
                    // InternalDsl.g:275:5: (lv_timeunit_14_0= ruletimeUnitValue )
                    {
                    // InternalDsl.g:275:5: (lv_timeunit_14_0= ruletimeUnitValue )
                    // InternalDsl.g:276:6: lv_timeunit_14_0= ruletimeUnitValue
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getTimeunitTimeUnitValueParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_timeunit_14_0=ruletimeUnitValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"timeunit",
                    							lv_timeunit_14_0,
                    							"rasman.robot.mars.des.Dsl.timeUnitValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuletimeUnitValue"
    // InternalDsl.g:298:1: entryRuletimeUnitValue returns [EObject current=null] : iv_ruletimeUnitValue= ruletimeUnitValue EOF ;
    public final EObject entryRuletimeUnitValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletimeUnitValue = null;


        try {
            // InternalDsl.g:298:54: (iv_ruletimeUnitValue= ruletimeUnitValue EOF )
            // InternalDsl.g:299:2: iv_ruletimeUnitValue= ruletimeUnitValue EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletimeUnitValue=ruletimeUnitValue();

            state._fsp--;

             current =iv_ruletimeUnitValue; 
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
    // $ANTLR end "entryRuletimeUnitValue"


    // $ANTLR start "ruletimeUnitValue"
    // InternalDsl.g:305:1: ruletimeUnitValue returns [EObject current=null] : ( (lv_unit_0_0= ruletimeUnit ) ) ;
    public final EObject ruletimeUnitValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_unit_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:311:2: ( ( (lv_unit_0_0= ruletimeUnit ) ) )
            // InternalDsl.g:312:2: ( (lv_unit_0_0= ruletimeUnit ) )
            {
            // InternalDsl.g:312:2: ( (lv_unit_0_0= ruletimeUnit ) )
            // InternalDsl.g:313:3: (lv_unit_0_0= ruletimeUnit )
            {
            // InternalDsl.g:313:3: (lv_unit_0_0= ruletimeUnit )
            // InternalDsl.g:314:4: lv_unit_0_0= ruletimeUnit
            {

            				newCompositeNode(grammarAccess.getTimeUnitValueAccess().getUnitTimeUnitEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_unit_0_0=ruletimeUnit();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTimeUnitValueRule());
            				}
            				set(
            					current,
            					"unit",
            					lv_unit_0_0,
            					"rasman.robot.mars.des.Dsl.timeUnit");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruletimeUnitValue"


    // $ANTLR start "entryRuleIgnorables"
    // InternalDsl.g:334:1: entryRuleIgnorables returns [EObject current=null] : iv_ruleIgnorables= ruleIgnorables EOF ;
    public final EObject entryRuleIgnorables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorables = null;


        try {
            // InternalDsl.g:334:51: (iv_ruleIgnorables= ruleIgnorables EOF )
            // InternalDsl.g:335:2: iv_ruleIgnorables= ruleIgnorables EOF
            {
             newCompositeNode(grammarAccess.getIgnorablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIgnorables=ruleIgnorables();

            state._fsp--;

             current =iv_ruleIgnorables; 
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
    // $ANTLR end "entryRuleIgnorables"


    // $ANTLR start "ruleIgnorables"
    // InternalDsl.g:341:1: ruleIgnorables returns [EObject current=null] : ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) ) ;
    public final EObject ruleIgnorables() throws RecognitionException {
        EObject current = null;

        Token lv_AVOID_OBJECTS_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:347:2: ( ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) ) )
            // InternalDsl.g:348:2: ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) )
            {
            // InternalDsl.g:348:2: ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) )
            // InternalDsl.g:349:3: (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' )
            {
            // InternalDsl.g:349:3: (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' )
            // InternalDsl.g:350:4: lv_AVOID_OBJECTS_0_0= 'AvoidObjects'
            {
            lv_AVOID_OBJECTS_0_0=(Token)match(input,21,FOLLOW_2); 

            				newLeafNode(lv_AVOID_OBJECTS_0_0, grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIgnorablesRule());
            				}
            				setWithLastConsumed(current, "AVOID_OBJECTS", lv_AVOID_OBJECTS_0_0, "AvoidObjects");
            			

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
    // $ANTLR end "ruleIgnorables"


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:365:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalDsl.g:365:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalDsl.g:366:2: iv_ruleSensorType= ruleSensorType EOF
            {
             newCompositeNode(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;

             current =iv_ruleSensorType; 
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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalDsl.g:372:1: ruleSensorType returns [EObject current=null] : (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ColorSensor_0 = null;

        EObject this_TouchSensor_1 = null;

        EObject this_UltrasonicSensor_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:378:2: ( (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) )
            // InternalDsl.g:379:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            {
            // InternalDsl.g:379:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 31:
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
                    // InternalDsl.g:380:3: this_ColorSensor_0= ruleColorSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorSensor_0=ruleColorSensor();

                    state._fsp--;


                    			current = this_ColorSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:389:3: this_TouchSensor_1= ruleTouchSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TouchSensor_1=ruleTouchSensor();

                    state._fsp--;


                    			current = this_TouchSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:398:3: this_UltrasonicSensor_2= ruleUltrasonicSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UltrasonicSensor_2=ruleUltrasonicSensor();

                    state._fsp--;


                    			current = this_UltrasonicSensor_2;
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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleColorSensor"
    // InternalDsl.g:410:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalDsl.g:410:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalDsl.g:411:2: iv_ruleColorSensor= ruleColorSensor EOF
            {
             newCompositeNode(grammarAccess.getColorSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorSensor=ruleColorSensor();

            state._fsp--;

             current =iv_ruleColorSensor; 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalDsl.g:417:1: ruleColorSensor returns [EObject current=null] : ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) ) | (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_distinct_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_distinct_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_key_5_0 = null;

        EObject lv_keys_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:423:2: ( ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) ) | (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ ) ) )
            // InternalDsl.g:424:2: ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) ) | (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ ) )
            {
            // InternalDsl.g:424:2: ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) ) | (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3==25) ) {
                            alt11=1;
                        }
                        else if ( (LA11_3==27) ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 25:
                        {
                        alt11=1;
                        }
                        break;
                    case 27:
                        {
                        alt11=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:425:3: (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) )
                    {
                    // InternalDsl.g:425:3: (otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) ) )
                    // InternalDsl.g:426:4: otherlv_0= 'ColorSensor' otherlv_1= 'On' ( (lv_distinct_2_0= 'New' ) )? otherlv_3= 'DetectedColor' otherlv_4= 'is:' ( (lv_key_5_0= ruleColorValue ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getOnKeyword_0_1());
                    			
                    // InternalDsl.g:434:4: ( (lv_distinct_2_0= 'New' ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==24) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDsl.g:435:5: (lv_distinct_2_0= 'New' )
                            {
                            // InternalDsl.g:435:5: (lv_distinct_2_0= 'New' )
                            // InternalDsl.g:436:6: lv_distinct_2_0= 'New'
                            {
                            lv_distinct_2_0=(Token)match(input,24,FOLLOW_20); 

                            						newLeafNode(lv_distinct_2_0, grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getColorSensorRule());
                            						}
                            						setWithLastConsumed(current, "distinct", true, "New");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getDetectedColorKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getColorSensorAccess().getIsKeyword_0_4());
                    			
                    // InternalDsl.g:456:4: ( (lv_key_5_0= ruleColorValue ) )
                    // InternalDsl.g:457:5: (lv_key_5_0= ruleColorValue )
                    {
                    // InternalDsl.g:457:5: (lv_key_5_0= ruleColorValue )
                    // InternalDsl.g:458:6: lv_key_5_0= ruleColorValue
                    {

                    						newCompositeNode(grammarAccess.getColorSensorAccess().getKeyColorValueParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_key_5_0=ruleColorValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorSensorRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_5_0,
                    							"rasman.robot.mars.des.Dsl.ColorValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:477:3: (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ )
                    {
                    // InternalDsl.g:477:3: (otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+ )
                    // InternalDsl.g:478:4: otherlv_6= 'ColorSensor' otherlv_7= 'On' ( (lv_distinct_8_0= 'New' ) )? otherlv_9= 'DetectedColors' otherlv_10= 'are:' ( (lv_keys_11_0= ruleColorValue ) )+
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getColorSensorAccess().getColorSensorKeyword_1_0());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorSensorAccess().getOnKeyword_1_1());
                    			
                    // InternalDsl.g:486:4: ( (lv_distinct_8_0= 'New' ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==24) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl.g:487:5: (lv_distinct_8_0= 'New' )
                            {
                            // InternalDsl.g:487:5: (lv_distinct_8_0= 'New' )
                            // InternalDsl.g:488:6: lv_distinct_8_0= 'New'
                            {
                            lv_distinct_8_0=(Token)match(input,24,FOLLOW_24); 

                            						newLeafNode(lv_distinct_8_0, grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getColorSensorRule());
                            						}
                            						setWithLastConsumed(current, "distinct", true, "New");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getColorSensorAccess().getDetectedColorsKeyword_1_3());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getColorSensorAccess().getAreKeyword_1_4());
                    			
                    // InternalDsl.g:508:4: ( (lv_keys_11_0= ruleColorValue ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=48 && LA10_0<=60)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:509:5: (lv_keys_11_0= ruleColorValue )
                    	    {
                    	    // InternalDsl.g:509:5: (lv_keys_11_0= ruleColorValue )
                    	    // InternalDsl.g:510:6: lv_keys_11_0= ruleColorValue
                    	    {

                    	    						newCompositeNode(grammarAccess.getColorSensorAccess().getKeysColorValueParserRuleCall_1_5_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_keys_11_0=ruleColorValue();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getColorSensorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"keys",
                    	    							lv_keys_11_0,
                    	    							"rasman.robot.mars.des.Dsl.ColorValue");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleTouchSensor"
    // InternalDsl.g:532:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // InternalDsl.g:532:52: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // InternalDsl.g:533:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
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
    // $ANTLR end "entryRuleTouchSensor"


    // $ANTLR start "ruleTouchSensor"
    // InternalDsl.g:539:1: ruleTouchSensor returns [EObject current=null] : (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) ;
    public final EObject ruleTouchSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_key_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:545:2: ( (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) )
            // InternalDsl.g:546:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            {
            // InternalDsl.g:546:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            // InternalDsl.g:547:3: otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2());
            		
            // InternalDsl.g:559:3: ( (lv_key_3_0= ruleTouchSensorSides ) )
            // InternalDsl.g:560:4: (lv_key_3_0= ruleTouchSensorSides )
            {
            // InternalDsl.g:560:4: (lv_key_3_0= ruleTouchSensorSides )
            // InternalDsl.g:561:5: lv_key_3_0= ruleTouchSensorSides
            {

            					newCompositeNode(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_3_0=ruleTouchSensorSides();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTouchSensorRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"rasman.robot.mars.des.Dsl.TouchSensorSides");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleTouchSensor"


    // $ANTLR start "entryRuleUltrasonicSensor"
    // InternalDsl.g:582:1: entryRuleUltrasonicSensor returns [EObject current=null] : iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF ;
    public final EObject entryRuleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltrasonicSensor = null;


        try {
            // InternalDsl.g:582:57: (iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF )
            // InternalDsl.g:583:2: iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF
            {
             newCompositeNode(grammarAccess.getUltrasonicSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUltrasonicSensor=ruleUltrasonicSensor();

            state._fsp--;

             current =iv_ruleUltrasonicSensor; 
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
    // $ANTLR end "entryRuleUltrasonicSensor"


    // $ANTLR start "ruleUltrasonicSensor"
    // InternalDsl.g:589:1: ruleUltrasonicSensor returns [EObject current=null] : (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_distance_4_0=null;
        Enumerator lv_comparator_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:595:2: ( (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) )
            // InternalDsl.g:596:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            {
            // InternalDsl.g:596:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            // InternalDsl.g:597:3: otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2());
            		
            // InternalDsl.g:609:3: ( (lv_comparator_3_0= ruleCompareOperator ) )
            // InternalDsl.g:610:4: (lv_comparator_3_0= ruleCompareOperator )
            {
            // InternalDsl.g:610:4: (lv_comparator_3_0= ruleCompareOperator )
            // InternalDsl.g:611:5: lv_comparator_3_0= ruleCompareOperator
            {

            					newCompositeNode(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_comparator_3_0=ruleCompareOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUltrasonicSensorRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_3_0,
            						"rasman.robot.mars.des.Dsl.CompareOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:628:3: ( (lv_distance_4_0= RULE_DECIMAL ) )
            // InternalDsl.g:629:4: (lv_distance_4_0= RULE_DECIMAL )
            {
            // InternalDsl.g:629:4: (lv_distance_4_0= RULE_DECIMAL )
            // InternalDsl.g:630:5: lv_distance_4_0= RULE_DECIMAL
            {
            lv_distance_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

            					newLeafNode(lv_distance_4_0, grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUltrasonicSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_4_0,
            						"rasman.robot.mars.des.Dsl.DECIMAL");
            				

            }


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
    // $ANTLR end "ruleUltrasonicSensor"


    // $ANTLR start "entryRuleColorValue"
    // InternalDsl.g:650:1: entryRuleColorValue returns [EObject current=null] : iv_ruleColorValue= ruleColorValue EOF ;
    public final EObject entryRuleColorValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorValue = null;


        try {
            // InternalDsl.g:650:51: (iv_ruleColorValue= ruleColorValue EOF )
            // InternalDsl.g:651:2: iv_ruleColorValue= ruleColorValue EOF
            {
             newCompositeNode(grammarAccess.getColorValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorValue=ruleColorValue();

            state._fsp--;

             current =iv_ruleColorValue; 
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
    // $ANTLR end "entryRuleColorValue"


    // $ANTLR start "ruleColorValue"
    // InternalDsl.g:657:1: ruleColorValue returns [EObject current=null] : ( (lv_color_0_0= ruleColors ) ) ;
    public final EObject ruleColorValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_color_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:663:2: ( ( (lv_color_0_0= ruleColors ) ) )
            // InternalDsl.g:664:2: ( (lv_color_0_0= ruleColors ) )
            {
            // InternalDsl.g:664:2: ( (lv_color_0_0= ruleColors ) )
            // InternalDsl.g:665:3: (lv_color_0_0= ruleColors )
            {
            // InternalDsl.g:665:3: (lv_color_0_0= ruleColors )
            // InternalDsl.g:666:4: lv_color_0_0= ruleColors
            {

            				newCompositeNode(grammarAccess.getColorValueAccess().getColorColorsEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_color_0_0=ruleColors();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getColorValueRule());
            				}
            				set(
            					current,
            					"color",
            					lv_color_0_0,
            					"rasman.robot.mars.des.Dsl.Colors");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleColorValue"


    // $ANTLR start "ruletimeUnit"
    // InternalDsl.g:686:1: ruletimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) ) ;
    public final Enumerator ruletimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:692:2: ( ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) ) )
            // InternalDsl.g:693:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) )
            {
            // InternalDsl.g:693:2: ( (enumLiteral_0= 's' ) | (enumLiteral_1= 'ms' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:694:3: (enumLiteral_0= 's' )
                    {
                    // InternalDsl.g:694:3: (enumLiteral_0= 's' )
                    // InternalDsl.g:695:4: enumLiteral_0= 's'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:702:3: (enumLiteral_1= 'ms' )
                    {
                    // InternalDsl.g:702:3: (enumLiteral_1= 'ms' )
                    // InternalDsl.g:703:4: enumLiteral_1= 'ms'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruletimeUnit"


    // $ANTLR start "ruleTouchSensorSides"
    // InternalDsl.g:713:1: ruleTouchSensorSides returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) | (enumLiteral_3= 'ANY' ) ) ;
    public final Enumerator ruleTouchSensorSides() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:719:2: ( ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) | (enumLiteral_3= 'ANY' ) ) )
            // InternalDsl.g:720:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) | (enumLiteral_3= 'ANY' ) )
            {
            // InternalDsl.g:720:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) | (enumLiteral_3= 'ANY' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt13=1;
                }
                break;
            case 36:
                {
                alt13=2;
                }
                break;
            case 37:
                {
                alt13=3;
                }
                break;
            case 38:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDsl.g:721:3: (enumLiteral_0= 'LEFT' )
                    {
                    // InternalDsl.g:721:3: (enumLiteral_0= 'LEFT' )
                    // InternalDsl.g:722:4: enumLiteral_0= 'LEFT'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:729:3: (enumLiteral_1= 'RIGHT' )
                    {
                    // InternalDsl.g:729:3: (enumLiteral_1= 'RIGHT' )
                    // InternalDsl.g:730:4: enumLiteral_1= 'RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:737:3: (enumLiteral_2= 'BOTH' )
                    {
                    // InternalDsl.g:737:3: (enumLiteral_2= 'BOTH' )
                    // InternalDsl.g:738:4: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:745:3: (enumLiteral_3= 'ANY' )
                    {
                    // InternalDsl.g:745:3: (enumLiteral_3= 'ANY' )
                    // InternalDsl.g:746:4: enumLiteral_3= 'ANY'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTouchSensorSides"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:756:1: ruleActions returns [Enumerator current=null] : ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) ) ;
    public final Enumerator ruleActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDsl.g:762:2: ( ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) ) )
            // InternalDsl.g:763:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) )
            {
            // InternalDsl.g:763:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            case 45:
                {
                alt14=7;
                }
                break;
            case 46:
                {
                alt14=8;
                }
                break;
            case 47:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDsl.g:764:3: (enumLiteral_0= 'ROTATELEFT' )
                    {
                    // InternalDsl.g:764:3: (enumLiteral_0= 'ROTATELEFT' )
                    // InternalDsl.g:765:4: enumLiteral_0= 'ROTATELEFT'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:772:3: (enumLiteral_1= 'ROTATERIGHT' )
                    {
                    // InternalDsl.g:772:3: (enumLiteral_1= 'ROTATERIGHT' )
                    // InternalDsl.g:773:4: enumLiteral_1= 'ROTATERIGHT'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:780:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    {
                    // InternalDsl.g:780:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    // InternalDsl.g:781:4: enumLiteral_2= 'DRIVEFORWARD'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:788:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    {
                    // InternalDsl.g:788:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    // InternalDsl.g:789:4: enumLiteral_3= 'DRIVEBACKWARD'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:796:3: (enumLiteral_4= 'STOP' )
                    {
                    // InternalDsl.g:796:3: (enumLiteral_4= 'STOP' )
                    // InternalDsl.g:797:4: enumLiteral_4= 'STOP'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:804:3: (enumLiteral_5= 'TURNAROUND' )
                    {
                    // InternalDsl.g:804:3: (enumLiteral_5= 'TURNAROUND' )
                    // InternalDsl.g:805:4: enumLiteral_5= 'TURNAROUND'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:812:3: (enumLiteral_6= 'BEEP' )
                    {
                    // InternalDsl.g:812:3: (enumLiteral_6= 'BEEP' )
                    // InternalDsl.g:813:4: enumLiteral_6= 'BEEP'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:820:3: (enumLiteral_7= 'MEASURE' )
                    {
                    // InternalDsl.g:820:3: (enumLiteral_7= 'MEASURE' )
                    // InternalDsl.g:821:4: enumLiteral_7= 'MEASURE'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:828:3: (enumLiteral_8= 'DRIVETOEDGE' )
                    {
                    // InternalDsl.g:828:3: (enumLiteral_8= 'DRIVETOEDGE' )
                    // InternalDsl.g:829:4: enumLiteral_8= 'DRIVETOEDGE'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "ruleColors"
    // InternalDsl.g:839:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;


        	enterRule();

        try {
            // InternalDsl.g:845:2: ( ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) )
            // InternalDsl.g:846:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            {
            // InternalDsl.g:846:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            int alt15=13;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt15=1;
                }
                break;
            case 49:
                {
                alt15=2;
                }
                break;
            case 50:
                {
                alt15=3;
                }
                break;
            case 51:
                {
                alt15=4;
                }
                break;
            case 52:
                {
                alt15=5;
                }
                break;
            case 53:
                {
                alt15=6;
                }
                break;
            case 54:
                {
                alt15=7;
                }
                break;
            case 55:
                {
                alt15=8;
                }
                break;
            case 56:
                {
                alt15=9;
                }
                break;
            case 57:
                {
                alt15=10;
                }
                break;
            case 58:
                {
                alt15=11;
                }
                break;
            case 59:
                {
                alt15=12;
                }
                break;
            case 60:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDsl.g:847:3: (enumLiteral_0= 'BLACK' )
                    {
                    // InternalDsl.g:847:3: (enumLiteral_0= 'BLACK' )
                    // InternalDsl.g:848:4: enumLiteral_0= 'BLACK'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:855:3: (enumLiteral_1= 'BLUE' )
                    {
                    // InternalDsl.g:855:3: (enumLiteral_1= 'BLUE' )
                    // InternalDsl.g:856:4: enumLiteral_1= 'BLUE'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:863:3: (enumLiteral_2= 'CYAN' )
                    {
                    // InternalDsl.g:863:3: (enumLiteral_2= 'CYAN' )
                    // InternalDsl.g:864:4: enumLiteral_2= 'CYAN'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:871:3: (enumLiteral_3= 'DARK_GRAY' )
                    {
                    // InternalDsl.g:871:3: (enumLiteral_3= 'DARK_GRAY' )
                    // InternalDsl.g:872:4: enumLiteral_3= 'DARK_GRAY'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:879:3: (enumLiteral_4= 'GRAY' )
                    {
                    // InternalDsl.g:879:3: (enumLiteral_4= 'GRAY' )
                    // InternalDsl.g:880:4: enumLiteral_4= 'GRAY'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:887:3: (enumLiteral_5= 'GREEN' )
                    {
                    // InternalDsl.g:887:3: (enumLiteral_5= 'GREEN' )
                    // InternalDsl.g:888:4: enumLiteral_5= 'GREEN'
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:895:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    {
                    // InternalDsl.g:895:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    // InternalDsl.g:896:4: enumLiteral_6= 'LIGHT_GRAY'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:903:3: (enumLiteral_7= 'MAGENTA' )
                    {
                    // InternalDsl.g:903:3: (enumLiteral_7= 'MAGENTA' )
                    // InternalDsl.g:904:4: enumLiteral_7= 'MAGENTA'
                    {
                    enumLiteral_7=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:911:3: (enumLiteral_8= 'ORANGE' )
                    {
                    // InternalDsl.g:911:3: (enumLiteral_8= 'ORANGE' )
                    // InternalDsl.g:912:4: enumLiteral_8= 'ORANGE'
                    {
                    enumLiteral_8=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:919:3: (enumLiteral_9= 'PINK' )
                    {
                    // InternalDsl.g:919:3: (enumLiteral_9= 'PINK' )
                    // InternalDsl.g:920:4: enumLiteral_9= 'PINK'
                    {
                    enumLiteral_9=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:927:3: (enumLiteral_10= 'RED' )
                    {
                    // InternalDsl.g:927:3: (enumLiteral_10= 'RED' )
                    // InternalDsl.g:928:4: enumLiteral_10= 'RED'
                    {
                    enumLiteral_10=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:935:3: (enumLiteral_11= 'WHITE' )
                    {
                    // InternalDsl.g:935:3: (enumLiteral_11= 'WHITE' )
                    // InternalDsl.g:936:4: enumLiteral_11= 'WHITE'
                    {
                    enumLiteral_11=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:943:3: (enumLiteral_12= 'YELLOW' )
                    {
                    // InternalDsl.g:943:3: (enumLiteral_12= 'YELLOW' )
                    // InternalDsl.g:944:4: enumLiteral_12= 'YELLOW'
                    {
                    enumLiteral_12=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12());
                    			

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:954:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDsl.g:960:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalDsl.g:961:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalDsl.g:961:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt16=1;
                }
                break;
            case 62:
                {
                alt16=2;
                }
                break;
            case 63:
                {
                alt16=3;
                }
                break;
            case 64:
                {
                alt16=4;
                }
                break;
            case 65:
                {
                alt16=5;
                }
                break;
            case 66:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDsl.g:962:3: (enumLiteral_0= '==' )
                    {
                    // InternalDsl.g:962:3: (enumLiteral_0= '==' )
                    // InternalDsl.g:963:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:970:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:970:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:971:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:978:3: (enumLiteral_2= '>=' )
                    {
                    // InternalDsl.g:978:3: (enumLiteral_2= '>=' )
                    // InternalDsl.g:979:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:986:3: (enumLiteral_3= '>' )
                    {
                    // InternalDsl.g:986:3: (enumLiteral_3= '>' )
                    // InternalDsl.g:987:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:994:3: (enumLiteral_4= '<=' )
                    {
                    // InternalDsl.g:994:3: (enumLiteral_4= '<=' )
                    // InternalDsl.g:995:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1002:3: (enumLiteral_5= '<' )
                    {
                    // InternalDsl.g:1002:3: (enumLiteral_5= '<' )
                    // InternalDsl.g:1003:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleCompareOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000A0400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000FF8000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000198002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1FFF000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1FFF000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}