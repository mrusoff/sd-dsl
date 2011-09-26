package fr.chaunier.xtext.om.serializer;

import com.google.inject.Inject;
import fr.chaunier.xtext.om.services.OmDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractOmDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OmDslGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OmDslGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		acceptNodes(transition, fromNode, toNode);
	}

}
