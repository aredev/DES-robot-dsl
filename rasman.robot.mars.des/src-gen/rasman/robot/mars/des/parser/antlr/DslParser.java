/*
 * generated by Xtext 2.10.0
 */
package rasman.robot.mars.des.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import rasman.robot.mars.des.parser.antlr.internal.InternalDslParser;
import rasman.robot.mars.des.services.DslGrammarAccess;

public class DslParser extends AbstractAntlrParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDslParser createParser(XtextTokenStream stream) {
		return new InternalDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Mission";
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
