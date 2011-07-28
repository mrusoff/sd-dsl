package fr.chaunier.xtext.archi.serializer;

import com.google.inject.Inject;
import fr.chaunier.xtext.archi.services.AdslDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractAdslDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AdslDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Message_CommaKeyword_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AdslDslGrammarAccess) access;
		match_Message_CommaKeyword_1_1_q = new TokenAlias(true, false, grammarAccess.getMessageAccess().getCommaKeyword_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_Message_CommaKeyword_1_1_q.equals(transition.getAmbiguousSyntax()))
			emit_Message_CommaKeyword_1_1_q(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Message_CommaKeyword_1_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
