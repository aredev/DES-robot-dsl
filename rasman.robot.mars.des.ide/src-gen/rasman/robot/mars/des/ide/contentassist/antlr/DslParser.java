/*
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import rasman.robot.mars.des.ide.contentassist.antlr.internal.InternalDslParser;
import rasman.robot.mars.des.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSensorTypeAccess().getAlternatives(), "rule__SensorType__Alternatives");
					put(grammarAccess.getColorSensorAccess().getAlternatives(), "rule__ColorSensor__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getTouchSensorSidesAccess().getAlternatives(), "rule__TouchSensorSides__Alternatives");
					put(grammarAccess.getActionsAccess().getAlternatives(), "rule__Actions__Alternatives");
					put(grammarAccess.getDirectionsAccess().getAlternatives(), "rule__Directions__Alternatives");
					put(grammarAccess.getColorsAccess().getAlternatives(), "rule__Colors__Alternatives");
					put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getTaskAccess().getGroup_2(), "rule__Task__Group_2__0");
					put(grammarAccess.getTaskAccess().getGroup_3(), "rule__Task__Group_3__0");
					put(grammarAccess.getTaskAccess().getGroup_4(), "rule__Task__Group_4__0");
					put(grammarAccess.getTaskAccess().getGroup_5(), "rule__Task__Group_5__0");
					put(grammarAccess.getTaskAccess().getGroup_6(), "rule__Task__Group_6__0");
					put(grammarAccess.getColorSensorAccess().getGroup_0(), "rule__ColorSensor__Group_0__0");
					put(grammarAccess.getColorSensorAccess().getGroup_1(), "rule__ColorSensor__Group_1__0");
					put(grammarAccess.getTouchSensorAccess().getGroup(), "rule__TouchSensor__Group__0");
					put(grammarAccess.getUltrasonicSensorAccess().getGroup(), "rule__UltrasonicSensor__Group__0");
					put(grammarAccess.getMissionAccess().getTasksAssignment_1(), "rule__Mission__TasksAssignment_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getSensorAssignment_2_1(), "rule__Task__SensorAssignment_2_1");
					put(grammarAccess.getTaskAccess().getActionAssignment_3_1(), "rule__Task__ActionAssignment_3_1");
					put(grammarAccess.getTaskAccess().getNrOfTimesAssignment_4_2(), "rule__Task__NrOfTimesAssignment_4_2");
					put(grammarAccess.getTaskAccess().getIgnoreBehaviorAssignment_5_1(), "rule__Task__IgnoreBehaviorAssignment_5_1");
					put(grammarAccess.getTaskAccess().getTimeAssignment_6_1(), "rule__Task__TimeAssignment_6_1");
					put(grammarAccess.getTaskAccess().getTimeunitAssignment_6_2(), "rule__Task__TimeunitAssignment_6_2");
					put(grammarAccess.getTimeUnitValueAccess().getUnitAssignment(), "rule__TimeUnitValue__UnitAssignment");
					put(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAssignment(), "rule__Ignorables__AVOID_OBJECTSAssignment");
					put(grammarAccess.getColorSensorAccess().getDistinctAssignment_0_2(), "rule__ColorSensor__DistinctAssignment_0_2");
					put(grammarAccess.getColorSensorAccess().getKeyAssignment_0_5(), "rule__ColorSensor__KeyAssignment_0_5");
					put(grammarAccess.getColorSensorAccess().getDistinctAssignment_1_2(), "rule__ColorSensor__DistinctAssignment_1_2");
					put(grammarAccess.getColorSensorAccess().getKeysAssignment_1_5(), "rule__ColorSensor__KeysAssignment_1_5");
					put(grammarAccess.getTouchSensorAccess().getKeyAssignment_3(), "rule__TouchSensor__KeyAssignment_3");
					put(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3(), "rule__UltrasonicSensor__ComparatorAssignment_3");
					put(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4(), "rule__UltrasonicSensor__DistanceAssignment_4");
					put(grammarAccess.getColorValueAccess().getColorAssignment(), "rule__ColorValue__ColorAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslParser typedParser = (InternalDslParser) parser;
			typedParser.entryRuleMission();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
