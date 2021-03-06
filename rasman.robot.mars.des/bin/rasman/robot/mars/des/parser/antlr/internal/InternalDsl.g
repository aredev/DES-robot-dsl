/*
 * generated by Xtext 2.10.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package rasman.robot.mars.des.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMission
entryRuleMission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionRule()); }
	iv_ruleMission=ruleMission
	{ $current=$iv_ruleMission.current; }
	EOF;

// Rule Mission
ruleMission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mission:'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0());
				}
				lv_tasks_1_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_1_0,
						"rasman.robot.mars.des.Dsl.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='Uses:'
			{
				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getUsesKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0());
					}
					lv_sensor_3_0=ruleSensorType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						set(
							$current,
							"sensor",
							lv_sensor_3_0,
							"rasman.robot.mars.des.Dsl.SensorType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_4='Do:'
			{
				newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDoKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_3_1_0());
					}
					lv_action_5_0=ruleActions
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						add(
							$current,
							"action",
							lv_action_5_0,
							"rasman.robot.mars.des.Dsl.Actions");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		(
			otherlv_6='For'
			{
				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getForKeyword_4_0());
			}
			otherlv_7='Max:'
			{
				newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getMaxKeyword_4_1());
			}
			(
				(
					lv_nrOfTimes_8_0=RULE_INT
					{
						newLeafNode(lv_nrOfTimes_8_0, grammarAccess.getTaskAccess().getNrOfTimesINTTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskRule());
						}
						setWithLastConsumed(
							$current,
							"nrOfTimes",
							lv_nrOfTimes_8_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_9='Times'
			{
				newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getTimesKeyword_4_3());
			}
		)?
		(
			otherlv_10='Not:'
			{
				newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getNotKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_5_1_0());
					}
					lv_ignoreBehavior_11_0=ruleIgnorables
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						set(
							$current,
							"ignoreBehavior",
							lv_ignoreBehavior_11_0,
							"rasman.robot.mars.des.Dsl.Ignorables");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_12='ExpiresAfter:'
			{
				newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getExpiresAfterKeyword_6_0());
			}
			(
				(
					lv_time_13_0=RULE_INT
					{
						newLeafNode(lv_time_13_0, grammarAccess.getTaskAccess().getTimeINTTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTaskRule());
						}
						setWithLastConsumed(
							$current,
							"time",
							lv_time_13_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTaskAccess().getTimeunitTimeUnitValueParserRuleCall_6_2_0());
					}
					lv_timeunit_14_0=ruletimeUnitValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTaskRule());
						}
						set(
							$current,
							"timeunit",
							lv_timeunit_14_0,
							"rasman.robot.mars.des.Dsl.timeUnitValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuletimeUnitValue
entryRuletimeUnitValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimeUnitValueRule()); }
	iv_ruletimeUnitValue=ruletimeUnitValue
	{ $current=$iv_ruletimeUnitValue.current; }
	EOF;

// Rule timeUnitValue
ruletimeUnitValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTimeUnitValueAccess().getUnitTimeUnitEnumRuleCall_0());
			}
			lv_unit_0_0=ruletimeUnit
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTimeUnitValueRule());
				}
				set(
					$current,
					"unit",
					lv_unit_0_0,
					"rasman.robot.mars.des.Dsl.timeUnit");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleIgnorables
entryRuleIgnorables returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIgnorablesRule()); }
	iv_ruleIgnorables=ruleIgnorables
	{ $current=$iv_ruleIgnorables.current; }
	EOF;

// Rule Ignorables
ruleIgnorables returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_AVOID_OBJECTS_0_0='AvoidObjects'
			{
				newLeafNode(lv_AVOID_OBJECTS_0_0, grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIgnorablesRule());
				}
				setWithLastConsumed($current, "AVOID_OBJECTS", lv_AVOID_OBJECTS_0_0, "AvoidObjects");
			}
		)
	)
;

// Entry rule entryRuleSensorType
entryRuleSensorType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorTypeRule()); }
	iv_ruleSensorType=ruleSensorType
	{ $current=$iv_ruleSensorType.current; }
	EOF;

// Rule SensorType
ruleSensorType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0());
		}
		this_ColorSensor_0=ruleColorSensor
		{
			$current = $this_ColorSensor_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1());
		}
		this_TouchSensor_1=ruleTouchSensor
		{
			$current = $this_TouchSensor_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2());
		}
		this_UltrasonicSensor_2=ruleUltrasonicSensor
		{
			$current = $this_UltrasonicSensor_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleColorSensor
entryRuleColorSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorSensorRule()); }
	iv_ruleColorSensor=ruleColorSensor
	{ $current=$iv_ruleColorSensor.current; }
	EOF;

// Rule ColorSensor
ruleColorSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ColorSensor'
			{
				newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0_0());
			}
			otherlv_1='On'
			{
				newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getOnKeyword_0_1());
			}
			(
				(
					lv_distinct_2_0='New'
					{
						newLeafNode(lv_distinct_2_0, grammarAccess.getColorSensorAccess().getDistinctNewKeyword_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColorSensorRule());
						}
						setWithLastConsumed($current, "distinct", true, "New");
					}
				)
			)?
			otherlv_3='DetectedColor'
			{
				newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getDetectedColorKeyword_0_3());
			}
			otherlv_4='is:'
			{
				newLeafNode(otherlv_4, grammarAccess.getColorSensorAccess().getIsKeyword_0_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColorSensorAccess().getKeyColorValueParserRuleCall_0_5_0());
					}
					lv_key_5_0=ruleColorValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColorSensorRule());
						}
						set(
							$current,
							"key",
							lv_key_5_0,
							"rasman.robot.mars.des.Dsl.ColorValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_6='ColorSensor'
			{
				newLeafNode(otherlv_6, grammarAccess.getColorSensorAccess().getColorSensorKeyword_1_0());
			}
			otherlv_7='On'
			{
				newLeafNode(otherlv_7, grammarAccess.getColorSensorAccess().getOnKeyword_1_1());
			}
			(
				(
					lv_distinct_8_0='New'
					{
						newLeafNode(lv_distinct_8_0, grammarAccess.getColorSensorAccess().getDistinctNewKeyword_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColorSensorRule());
						}
						setWithLastConsumed($current, "distinct", true, "New");
					}
				)
			)?
			otherlv_9='DetectedColors'
			{
				newLeafNode(otherlv_9, grammarAccess.getColorSensorAccess().getDetectedColorsKeyword_1_3());
			}
			otherlv_10='are:'
			{
				newLeafNode(otherlv_10, grammarAccess.getColorSensorAccess().getAreKeyword_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColorSensorAccess().getKeysColorValueParserRuleCall_1_5_0());
					}
					lv_keys_11_0=ruleColorValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColorSensorRule());
						}
						add(
							$current,
							"keys",
							lv_keys_11_0,
							"rasman.robot.mars.des.Dsl.ColorValue");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)
	)
;

// Entry rule entryRuleTouchSensor
entryRuleTouchSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTouchSensorRule()); }
	iv_ruleTouchSensor=ruleTouchSensor
	{ $current=$iv_ruleTouchSensor.current; }
	EOF;

// Rule TouchSensor
ruleTouchSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TouchSensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0());
		}
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getOnKeyword_1());
		}
		otherlv_2='TouchedSide:'
		{
			newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0());
				}
				lv_key_3_0=ruleTouchSensorSides
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTouchSensorRule());
					}
					set(
						$current,
						"key",
						lv_key_3_0,
						"rasman.robot.mars.des.Dsl.TouchSensorSides");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUltrasonicSensor
entryRuleUltrasonicSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUltrasonicSensorRule()); }
	iv_ruleUltrasonicSensor=ruleUltrasonicSensor
	{ $current=$iv_ruleUltrasonicSensor.current; }
	EOF;

// Rule UltrasonicSensor
ruleUltrasonicSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='USensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0());
		}
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1());
		}
		otherlv_2='Distance:'
		{
			newLeafNode(otherlv_2, grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0());
				}
				lv_comparator_3_0=ruleCompareOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUltrasonicSensorRule());
					}
					set(
						$current,
						"comparator",
						lv_comparator_3_0,
						"rasman.robot.mars.des.Dsl.CompareOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_distance_4_0=RULE_DECIMAL
				{
					newLeafNode(lv_distance_4_0, grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUltrasonicSensorRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_4_0,
						"rasman.robot.mars.des.Dsl.DECIMAL");
				}
			)
		)
	)
;

// Entry rule entryRuleColorValue
entryRuleColorValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorValueRule()); }
	iv_ruleColorValue=ruleColorValue
	{ $current=$iv_ruleColorValue.current; }
	EOF;

// Rule ColorValue
ruleColorValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getColorValueAccess().getColorColorsEnumRuleCall_0());
			}
			lv_color_0_0=ruleColors
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getColorValueRule());
				}
				set(
					$current,
					"color",
					lv_color_0_0,
					"rasman.robot.mars.des.Dsl.Colors");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Rule timeUnit
ruletimeUnit returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='s'
			{
				$current = grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getSECONDSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ms'
			{
				$current = grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getMILISECONDSEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule TouchSensorSides
ruleTouchSensorSides returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LEFT'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='RIGHT'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='BOTH'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='ANY'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getTouchSensorSidesAccess().getANYEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule Actions
ruleActions returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ROTATELEFT'
			{
				$current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ROTATERIGHT'
			{
				$current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='DRIVEFORWARD'
			{
				$current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DRIVEBACKWARD'
			{
				$current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='STOP'
			{
				$current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='TURNAROUND'
			{
				$current = grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='BEEP'
			{
				$current = grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='MEASURE'
			{
				$current = grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='DRIVETOEDGE'
			{
				$current = grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8());
			}
		)
	)
;

// Rule Colors
ruleColors returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BLACK'
			{
				$current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BLUE'
			{
				$current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CYAN'
			{
				$current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DARK_GRAY'
			{
				$current = grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='GRAY'
			{
				$current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='GREEN'
			{
				$current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='LIGHT_GRAY'
			{
				$current = grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='MAGENTA'
			{
				$current = grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='ORANGE'
			{
				$current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='PINK'
			{
				$current = grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='RED'
			{
				$current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='WHITE'
			{
				$current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='YELLOW'
			{
				$current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12());
			}
		)
	)
;

// Rule CompareOperator
ruleCompareOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='=='
			{
				$current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>='
			{
				$current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='>'
			{
				$current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='<='
			{
				$current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='<'
			{
				$current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
			}
		)
	)
;

RULE_DECIMAL : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
