package fr.chaunier.xtext.instance.om.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.instance.om.instanceDsl.Containment;
import fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute;
import fr.chaunier.xtext.instance.om.instanceDsl.Factory;
import fr.chaunier.xtext.instance.om.instanceDsl.Feature;
import fr.chaunier.xtext.instance.om.instanceDsl.Import;
import fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage;
import fr.chaunier.xtext.instance.om.instanceDsl.Intero;
import fr.chaunier.xtext.instance.om.instanceDsl.New;
import fr.chaunier.xtext.instance.om.instanceDsl.NewObject;
import fr.chaunier.xtext.instance.om.instanceDsl.Nullo;
import fr.chaunier.xtext.instance.om.instanceDsl.Reference;
import fr.chaunier.xtext.instance.om.instanceDsl.Stringa;
import fr.chaunier.xtext.instance.om.instanceDsl.TerminalExpression;
import fr.chaunier.xtext.instance.om.instanceDsl.This;
import fr.chaunier.xtext.instance.om.services.InstanceDslGrammarAccess;
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
public class AbstractInstanceDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected InstanceDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == InstanceDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InstanceDslPackage.CONTAINMENT:
				if(context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getContainmentRule()) {
					sequence_Containment_Containment(context, (Containment) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.ENUM_ATTRIBUTE:
				if(context == grammarAccess.getEnumAttributeRule()) {
					sequence_EnumAttribute_EnumAttribute(context, (EnumAttribute) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.FACTORY:
				if(context == grammarAccess.getFactoryRule()) {
					sequence_Factory_Factory(context, (Factory) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.INTERO:
				if(context == grammarAccess.getInteroRule()) {
					sequence_Intero_Intero(context, (Intero) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.NEW:
				if(context == grammarAccess.getNewRule()) {
					sequence_New_New(context, (New) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.NEW_OBJECT:
				if(context == grammarAccess.getNewObjectRule()) {
					sequence_NewObject_NewObject(context, (NewObject) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.NULLO:
				if(context == grammarAccess.getNulloRule()) {
					sequence_Nullo_Nullo(context, (Nullo) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.REFERENCE:
				if(context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.STRINGA:
				if(context == grammarAccess.getStringaRule()) {
					sequence_Stringa_Stringa(context, (Stringa) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.TERMINAL_EXPRESSION:
				if(context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getTerminalExpressionRule()) {
					sequence_TerminalExpression_TerminalExpression(context, (TerminalExpression) semanticObject); 
					return; 
				}
				else break;
			case InstanceDslPackage.THIS:
				if(context == grammarAccess.getThisRule()) {
					sequence_This_This(context, (This) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=NewObject
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Containment_Containment(EObject context, Containment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.CONTAINMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.CONTAINMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContainmentAccess().getValueNewObjectParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[EnumerationLiteral|ID]
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_EnumAttribute_EnumAttribute(EObject context, EnumAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.ENUM_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.ENUM_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumAttributeAccess().getValueEnumerationLiteralIDTerminalRuleCall_1_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* root=NewObject)
	 *
	 * Features:
	 *    imports[0, *]
	 *    root[1, 1]
	 */
	protected void sequence_Factory_Factory(EObject context, Factory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eFeature=[StructuralFeature|ID] isMany?='+='? value=Value)
	 *
	 * Features:
	 *    eFeature[1, 1]
	 *    isMany[0, 1]
	 *    value[1, 1]
	 */
	protected void sequence_Feature_Feature(EObject context, Feature semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Intero_Intero(EObject context, Intero semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.INTERO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.INTERO__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteroAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eClass=[Entity|ID] name=ID? features+=Feature*)
	 *
	 * Features:
	 *    eClass[1, 1]
	 *    name[0, 1]
	 *    features[0, *]
	 */
	protected void sequence_NewObject_NewObject(EObject context, NewObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[Entity|ID]
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_New_New(EObject context, New semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.NEW__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.NEW__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewAccess().getTypeEntityIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value='null'
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Nullo_Nullo(EObject context, Nullo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.NULLO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.NULLO__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNulloAccess().getValueNullKeyword_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=[EObject|ID]
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Reference_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.REFERENCE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.REFERENCE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getValueEObjectIDTerminalRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_Stringa_Stringa(EObject context, Stringa semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.STRINGA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.STRINGA__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringaAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (this=This | new=New | int=Intero | string=Stringa | null=Nullo)
	 *
	 * Features:
	 *    this[0, 1]
	 *         EXCLUDE_IF_SET new
	 *         EXCLUDE_IF_SET int
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET null
	 *    new[0, 1]
	 *         EXCLUDE_IF_SET this
	 *         EXCLUDE_IF_SET int
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET null
	 *    int[0, 1]
	 *         EXCLUDE_IF_SET this
	 *         EXCLUDE_IF_SET new
	 *         EXCLUDE_IF_SET string
	 *         EXCLUDE_IF_SET null
	 *    string[0, 1]
	 *         EXCLUDE_IF_SET this
	 *         EXCLUDE_IF_SET new
	 *         EXCLUDE_IF_SET int
	 *         EXCLUDE_IF_SET null
	 *    null[0, 1]
	 *         EXCLUDE_IF_SET this
	 *         EXCLUDE_IF_SET new
	 *         EXCLUDE_IF_SET int
	 *         EXCLUDE_IF_SET string
	 */
	protected void sequence_TerminalExpression_TerminalExpression(EObject context, TerminalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variable='this'
	 *
	 * Features:
	 *    variable[1, 1]
	 */
	protected void sequence_This_This(EObject context, This semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InstanceDslPackage.Literals.THIS__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InstanceDslPackage.Literals.THIS__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThisAccess().getVariableThisKeyword_0(), semanticObject.getVariable());
		feeder.finish();
	}
}
