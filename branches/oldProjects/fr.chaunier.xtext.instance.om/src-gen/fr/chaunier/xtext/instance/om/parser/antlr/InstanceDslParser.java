/*
* generated by Xtext
*/
package fr.chaunier.xtext.instance.om.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.chaunier.xtext.instance.om.services.InstanceDslGrammarAccess;

public class InstanceDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private InstanceDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.chaunier.xtext.instance.om.parser.antlr.internal.InternalInstanceDslParser createParser(XtextTokenStream stream) {
		return new fr.chaunier.xtext.instance.om.parser.antlr.internal.InternalInstanceDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Factory";
	}
	
	public InstanceDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(InstanceDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
