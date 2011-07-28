package fr.chaunier.xtext.map.serializer;

import com.google.inject.Inject;
import fr.chaunier.xtext.map.services.MapDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractMapDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MapDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_MappingModule_SemicolonKeyword_8_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MapDslGrammarAccess) access;
		match_MappingModule_SemicolonKeyword_8_1_q = new TokenAlias(true, false, grammarAccess.getMappingModuleAccess().getSemicolonKeyword_8_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_MappingModule_SemicolonKeyword_8_1_q.equals(transition.getAmbiguousSyntax()))
			emit_MappingModule_SemicolonKeyword_8_1_q(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_MappingModule_SemicolonKeyword_8_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
