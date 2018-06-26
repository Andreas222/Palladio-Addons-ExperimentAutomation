/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.palladiosimulator.experimentautomation.dsl.parser.antlr.internal.InternalExpAutoParser;
import org.palladiosimulator.experimentautomation.dsl.services.ExpAutoGrammarAccess;

public class ExpAutoParser extends AbstractAntlrParser {

	@Inject
	private ExpAutoGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalExpAutoParser createParser(XtextTokenStream stream) {
		return new InternalExpAutoParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public ExpAutoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExpAutoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
