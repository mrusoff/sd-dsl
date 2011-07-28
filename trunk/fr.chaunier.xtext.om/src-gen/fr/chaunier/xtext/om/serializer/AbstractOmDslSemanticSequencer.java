package fr.chaunier.xtext.om.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.om.omDsl.Annotation;
import fr.chaunier.xtext.om.omDsl.Annotations;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.DomainModel;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Enumeration;
import fr.chaunier.xtext.om.omDsl.EnumerationLiteral;
import fr.chaunier.xtext.om.omDsl.Import;
import fr.chaunier.xtext.om.omDsl.OmDslPackage;
import fr.chaunier.xtext.om.omDsl.Operation;
import fr.chaunier.xtext.om.omDsl.PackageDeclaration;
import fr.chaunier.xtext.om.omDsl.Parameter;
import fr.chaunier.xtext.om.omDsl.Reference;
import fr.chaunier.xtext.om.omDsl.TypeRef;
import fr.chaunier.xtext.om.services.OmDslGrammarAccess;
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
public class AbstractOmDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected OmDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == OmDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OmDslPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.ANNOTATIONS:
				if(context == grammarAccess.getAnnotationsRule()) {
					sequence_Annotations_Annotations(context, (Annotations) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Feature_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getAttributeRule()) {
					sequence_Attribute_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.DATA_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getDataTypeRule()) {
					sequence_DataType_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.ENUMERATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.ENUMERATION_LITERAL:
				if(context == grammarAccess.getEnumerationLiteralRule()) {
					sequence_EnumerationLiteral_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Parameter_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.REFERENCE:
				if(context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Feature_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case OmDslPackage.TYPE_REF:
				if(context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (key=STRING value=STRING)
	 *
	 * Features:
	 *    key[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_Annotation_Annotation(EObject context, Annotation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.ANNOTATION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.ANNOTATION__KEY));
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.ANNOTATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (annotations+=Annotation annotations+=Annotation*)?
	 *
	 * Features:
	 *    annotations[0, *]
	 */
	protected void sequence_Annotations_Annotations(EObject context, Annotations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Attribute_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (annotations+=Annotation annotations+=Annotation*)? description=STRING?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    annotations[0, *]
	 *    description[0, 1]
	 */
	protected void sequence_DataType_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 *
	 * Features:
	 *    elements[0, *]
	 */
	protected void sequence_DomainModel_DomainModel(EObject context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         entityType=EntityType? 
	 *         name=ID 
	 *         superType=[Entity|QualifiedName]? 
	 *         (annotations+=Annotation annotations+=Annotation*)? 
	 *         description=STRING? 
	 *         features+=Feature*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    entityType[0, 1]
	 *    superType[0, 1]
	 *    annotations[0, *]
	 *    description[0, 1]
	 *    features[0, *]
	 */
	protected void sequence_Entity_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID persistedValue=INT)
	 *
	 * Features:
	 *    name[1, 1]
	 *    persistedValue[1, 1]
	 */
	protected void sequence_EnumerationLiteral_EnumerationLiteral(EObject context, EnumerationLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.ENUMERATION_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.ENUMERATION_LITERAL__NAME));
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.ENUMERATION_LITERAL__PERSISTED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.ENUMERATION_LITERAL__PERSISTED_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumerationLiteralAccess().getPersistedValueINTTerminalRuleCall_1_1_0(), semanticObject.getPersistedValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID enumerationLiterals+=EnumerationLiteral+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    enumerationLiterals[1, *]
	 */
	protected void sequence_Enumeration_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef (annotations+=Annotation annotations+=Annotation*)? description=STRING?)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    description[0, 1]
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Feature_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef opposite=[Reference|ID]? (annotations+=Annotation annotations+=Annotation*)? description=STRING?)
	 *
	 * Features:
	 *    annotations[0, *]
	 *    description[0, 1]
	 *    name[1, 1]
	 *    type[1, 1]
	 *    opposite[0, 1]
	 */
	protected void sequence_Feature_Reference(EObject context, Reference semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? name=ID (params+=Parameter params+=Parameter*)? type=TypeRef)
	 *
	 * Features:
	 *    visibility[0, 1]
	 *    name[1, 1]
	 *    params[0, *]
	 *    type[1, 1]
	 */
	protected void sequence_Operation_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (annotations+=Annotation annotations+=Annotation*)? elements+=AbstractElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    annotations[0, *]
	 *    elements[0, *]
	 */
	protected void sequence_PackageDeclaration_PackageDeclaration(EObject context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Parameter_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, OmDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmDslPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeRefParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=TypeRef opposite=[Reference|ID]?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    opposite[0, 1]
	 */
	protected void sequence_Reference_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenced=[Type|QualifiedName] multi?='*'? option?='?'?)
	 *
	 * Features:
	 *    referenced[1, 1]
	 *    multi[0, 1]
	 *    option[0, 1]
	 */
	protected void sequence_TypeRef_TypeRef(EObject context, TypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
