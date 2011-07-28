package fr.chaunier.xtext.map.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.map.mapDsl.Expression;
import fr.chaunier.xtext.map.mapDsl.FeatureMap;
import fr.chaunier.xtext.map.mapDsl.Fuction;
import fr.chaunier.xtext.map.mapDsl.FuctionIn;
import fr.chaunier.xtext.map.mapDsl.FuctionOut;
import fr.chaunier.xtext.map.mapDsl.Import;
import fr.chaunier.xtext.map.mapDsl.MapDslPackage;
import fr.chaunier.xtext.map.mapDsl.MappingModule;
import fr.chaunier.xtext.map.mapDsl.Model;
import fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter;
import fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter;
import fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter;
import fr.chaunier.xtext.map.mapDsl.RootModule;
import fr.chaunier.xtext.map.mapDsl.Rule;
import fr.chaunier.xtext.map.services.MapDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractMapDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected MapDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MapDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MapDslPackage.EXPRESSION:
				if(context == grammarAccess.getExpressionRule()) {
					sequence_Expression_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.FEATURE_MAP:
				if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_6_2_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_6_2_0_FeatureMap(context, (FeatureMap) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_4_2_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_4_2_0_FeatureMap(context, (FeatureMap) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_2_5_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_2_5_0_FeatureMap(context, (FeatureMap) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_1_4_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_1_4_0_FeatureMap(context, (FeatureMap) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapRule()) {
					sequence_FeatureMap_FeatureMap(context, (FeatureMap) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.FUCTION:
				if(context == grammarAccess.getFuctionRule()) {
					sequence_Fuction_Fuction(context, (Fuction) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.FUCTION_IN:
				if(context == grammarAccess.getFuctionInRule() ||
				   context == grammarAccess.getFuctionInAccess().getNestedInTransformationParameterTargetAction_3_1_0()) {
					sequence_FuctionIn_FuctionIn(context, (FuctionIn) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.FUCTION_OUT:
				if(context == grammarAccess.getFuctionOutRule() ||
				   context == grammarAccess.getFuctionOutAccess().getNestedOutTransformationParameterTargetAction_3_1_0()) {
					sequence_FuctionOut_FuctionOut(context, (FuctionOut) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.MAPPING_MODULE:
				if(context == grammarAccess.getMappingModuleRule()) {
					sequence_MappingModule_MappingModule(context, (MappingModule) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER:
				if(context == grammarAccess.getFuctionInRule() ||
				   context == grammarAccess.getFuctionInAccess().getNestedInTransformationParameterTargetAction_3_1_0()) {
					sequence_FuctionIn_NestedInTransformationParameter(context, (NestedInTransformationParameter) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER:
				if(context == grammarAccess.getFuctionOutRule() ||
				   context == grammarAccess.getFuctionOutAccess().getNestedOutTransformationParameterTargetAction_3_1_0()) {
					sequence_FuctionOut_NestedOutTransformationParameter(context, (NestedOutTransformationParameter) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER:
				if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_6_2_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_6_2_0_NestedTransformationParameter(context, (NestedTransformationParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_4_2_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_4_2_0_NestedTransformationParameter(context, (NestedTransformationParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_2_5_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_2_5_0_NestedTransformationParameter(context, (NestedTransformationParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapAccess().getNestedTransformationParameterTargetAction_0_1_4_0()) {
					sequence_FeatureMap_NestedTransformationParameter_0_1_4_0_NestedTransformationParameter(context, (NestedTransformationParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureMapRule()) {
					sequence_FeatureMap_NestedTransformationParameter(context, (NestedTransformationParameter) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.ROOT_MODULE:
				if(context == grammarAccess.getRootModuleRule()) {
					sequence_RootModule_RootModule(context, (RootModule) semanticObject); 
					return; 
				}
				else break;
			case MapDslPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (value=STRING | intValue=INT)
	 *
	 * Features:
	 *    value[0, 1]
	 *         EXCLUDE_IF_SET intValue
	 *    intValue[0, 1]
	 *         EXCLUDE_IF_SET value
	 */
	protected void sequence_Expression_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (fuctionMap=[Fuction|ID] rule=[Rule|ID]?) | 
	 *             (attributeSource=[Attribute|ID] attributeTarget=[Attribute|ID] rule=[Rule|ID]?) | 
	 *             (withModule=[MappingModule|ID] attributeSources+=[Attribute|ID] attributeTarget=[Attribute|ID] rule=[Rule|ID]?) | 
	 *             (attributeSource=[Attribute|ID] expr=Expression rule=[Rule|ID]?) | 
	 *             (attributeTarget=[Attribute|ID] expr=Expression rule=[Rule|ID]?) | 
	 *             (attributeSource=[Attribute|ID] rule=[Rule|ID]?) | 
	 *             (attributeTarget=[Attribute|ID] rule=[Rule|ID]?)
	 *         ) 
	 *         documentation=STRING?
	 *     )
	 *
	 * Features:
	 *    fuctionMap[1, 1]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET withModule
	 *         EXCLUDE_IF_SET attributeSources
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *    attributeSource[3, 3]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET withModule
	 *         EXCLUDE_IF_SET attributeSources
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *    attributeTarget[4, 4]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *    withModule[1, 1]
	 *         EXCLUDE_IF_UNSET attributeSources
	 *         MANDATORY_IF_SET attributeSources
	 *         EXCLUDE_IF_UNSET attributeTarget
	 *         MANDATORY_IF_SET attributeTarget
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *    attributeSources[1, 1]
	 *         EXCLUDE_IF_UNSET withModule
	 *         MANDATORY_IF_SET withModule
	 *         EXCLUDE_IF_UNSET attributeTarget
	 *         MANDATORY_IF_SET attributeTarget
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *    expr[2, 2]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET withModule
	 *         EXCLUDE_IF_SET attributeSources
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET rule
	 *    rule[0, 7]
	 *         EXCLUDE_IF_UNSET attributeTarget
	 *         EXCLUDE_IF_SET fuctionMap
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET withModule
	 *         EXCLUDE_IF_SET attributeSources
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET attributeSource
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET attributeTarget
	 *         EXCLUDE_IF_SET expr
	 *         EXCLUDE_IF_SET attributeSource
	 *    documentation[0, 1]
	 */
	protected void sequence_FeatureMap_FeatureMap(EObject context, FeatureMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (target=FeatureMap_NestedTransformationParameter_0_1_4_0 refAttribute=[Attribute|ID] rule=[Rule|ID]?) | 
	 *             (target=FeatureMap_NestedTransformationParameter_0_2_5_0 refAttribute=[Attribute|ID] rule=[Rule|ID]?) | 
	 *             (target=FeatureMap_NestedTransformationParameter_0_4_2_0 refAttribute=[Attribute|ID] expr=Expression rule=[Rule|ID]?) | 
	 *             (target=FeatureMap_NestedTransformationParameter_0_6_2_0 refAttribute=[Attribute|ID] rule=[Rule|ID]?)
	 *         ) 
	 *         documentation=STRING?
	 *     )
	 *
	 * Features:
	 *    expr[1, 1]
	 *         EXCLUDE_IF_UNSET target
	 *         MANDATORY_IF_SET target
	 *         EXCLUDE_IF_UNSET refAttribute
	 *         MANDATORY_IF_SET refAttribute
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET rule
	 *    rule[0, 4]
	 *         EXCLUDE_IF_UNSET target
	 *         EXCLUDE_IF_UNSET refAttribute
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET target
	 *         EXCLUDE_IF_SET refAttribute
	 *         EXCLUDE_IF_SET expr
	 *    documentation[0, 1]
	 *    target[4, 4]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *    refAttribute[4, 4]
	 *         MANDATORY_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 *         EXCLUDE_IF_SET rule
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter(EObject context, NestedTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributeSource=[Attribute|ID] attributeTarget=[Attribute|ID])
	 *
	 * Features:
	 *    attributeSource[1, 1]
	 *    attributeTarget[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_1_4_0_FeatureMap(EObject context, FeatureMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FeatureMap_NestedTransformationParameter_0_1_4_0 refAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    refAttribute[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_1_4_0_NestedTransformationParameter(EObject context, NestedTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (withModule=[MappingModule|ID] attributeSources+=[Attribute|ID] attributeTarget=[Attribute|ID])
	 *
	 * Features:
	 *    attributeTarget[1, 1]
	 *    withModule[1, 1]
	 *    attributeSources[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_2_5_0_FeatureMap(EObject context, FeatureMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FeatureMap_NestedTransformationParameter_0_2_5_0 refAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    refAttribute[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_2_5_0_NestedTransformationParameter(EObject context, NestedTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributeTarget=[Attribute|ID]
	 *
	 * Features:
	 *    attributeTarget[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_4_2_0_FeatureMap(EObject context, FeatureMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FeatureMap_NestedTransformationParameter_0_4_2_0 refAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    refAttribute[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_4_2_0_NestedTransformationParameter(EObject context, NestedTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributeTarget=[Attribute|ID]
	 *
	 * Features:
	 *    attributeTarget[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_6_2_0_FeatureMap(EObject context, FeatureMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FeatureMap_NestedTransformationParameter_0_6_2_0 refAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    refAttribute[1, 1]
	 */
	protected void sequence_FeatureMap_NestedTransformationParameter_0_6_2_0_NestedTransformationParameter(EObject context, NestedTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inEntity=[Entity|QualifiedName] inAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    inEntity[1, 1]
	 *    inAttribute[1, 1]
	 */
	protected void sequence_FuctionIn_FuctionIn(EObject context, FuctionIn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.FUCTION_IN__IN_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.FUCTION_IN__IN_ENTITY));
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.FUCTION_IN__IN_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.FUCTION_IN__IN_ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuctionInAccess().getInEntityEntityQualifiedNameParserRuleCall_1_0_1(), semanticObject.getInEntity());
		feeder.accept(grammarAccess.getFuctionInAccess().getInAttributeAttributeIDTerminalRuleCall_3_0_0_1(), semanticObject.getInAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=FuctionIn_NestedInTransformationParameter_3_1_0 inRefAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    inRefAttribute[1, 1]
	 */
	protected void sequence_FuctionIn_NestedInTransformationParameter(EObject context, NestedInTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (outEntity=[Entity|QualifiedName] outAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    outEntity[1, 1]
	 *    outAttribute[1, 1]
	 */
	protected void sequence_FuctionOut_FuctionOut(EObject context, FuctionOut semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.FUCTION_OUT__OUT_ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.FUCTION_OUT__OUT_ENTITY));
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.FUCTION_OUT__OUT_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.FUCTION_OUT__OUT_ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuctionOutAccess().getOutEntityEntityQualifiedNameParserRuleCall_1_0_1(), semanticObject.getOutEntity());
		feeder.accept(grammarAccess.getFuctionOutAccess().getOutAttributeAttributeIDTerminalRuleCall_3_0_0_1(), semanticObject.getOutAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=FuctionOut_NestedOutTransformationParameter_3_1_0 outRefAttribute=[Attribute|ID])
	 *
	 * Features:
	 *    target[1, 1]
	 *    outRefAttribute[1, 1]
	 */
	protected void sequence_FuctionOut_NestedOutTransformationParameter(EObject context, NestedOutTransformationParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID in+=FuctionIn* out+=FuctionOut* documentation=STRING?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    in[0, *]
	 *    out[0, *]
	 *    documentation[0, 1]
	 */
	protected void sequence_Fuction_Fuction(EObject context, Fuction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildCard
	 *
	 * Features:
	 *    importedNamespace[1, 1]
	 */
	protected void sequence_Import_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MapDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MapDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entitySource=[Entity|QualifiedName] entityTarget=[Entity|QualifiedName] documentation=STRING? mappedFeatures+=FeatureMap*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    entitySource[1, 1]
	 *    entityTarget[1, 1]
	 *    documentation[0, 1]
	 *    mappedFeatures[0, *]
	 */
	protected void sequence_MappingModule_MappingModule(EObject context, MappingModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         documentation=STRING? 
	 *         imports+=Import* 
	 *         rules+=Rule* 
	 *         fuctions+=Fuction* 
	 *         mappingModules+=MappingModule* 
	 *         roots=RootModule
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    documentation[0, 1]
	 *    imports[0, *]
	 *    rules[0, *]
	 *    fuctions[0, *]
	 *    mappingModules[0, *]
	 *    roots[1, 1]
	 */
	protected void sequence_Model_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rootRef=[MappingModule|ID] documentation=STRING?)
	 *
	 * Features:
	 *    rootRef[1, 1]
	 *    documentation[0, 1]
	 */
	protected void sequence_RootModule_RootModule(EObject context, RootModule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID operation=STRING? args+=STRING*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    operation[0, 1]
	 *    args[0, *]
	 */
	protected void sequence_Rule_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
