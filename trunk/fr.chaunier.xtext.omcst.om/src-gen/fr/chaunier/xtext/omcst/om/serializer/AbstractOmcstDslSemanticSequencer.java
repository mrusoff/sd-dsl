package fr.chaunier.xtext.omcst.om.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.omcst.om.omcstDsl.AllConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.Annotation;
import fr.chaunier.xtext.omcst.om.omcstDsl.Annotations;
import fr.chaunier.xtext.omcst.om.omcstDsl.Attribute;
import fr.chaunier.xtext.omcst.om.omcstDsl.BoolConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DataType;
import fr.chaunier.xtext.omcst.om.omcstDsl.DateTimeConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DecimalConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.DomainModel;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration;
import fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationLiteral;
import fr.chaunier.xtext.omcst.om.omcstDsl.Import;
import fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage;
import fr.chaunier.xtext.omcst.om.omcstDsl.Operation;
import fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration;
import fr.chaunier.xtext.omcst.om.omcstDsl.Parameter;
import fr.chaunier.xtext.omcst.om.omcstDsl.Reference;
import fr.chaunier.xtext.omcst.om.omcstDsl.StringConstraint;
import fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef;
import fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement;
import fr.chaunier.xtext.omcst.om.services.OmcstDslGrammarAccess;
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
public class AbstractOmcstDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected OmcstDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == OmcstDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OmcstDslPackage.ALL_CONSTRAINT:
				if(context == grammarAccess.getAllConstraintRule()) {
					sequence_AllConstraint_AllConstraint(context, (AllConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ANNOTATIONS:
				if(context == grammarAccess.getAnnotationsRule()) {
					sequence_Annotations_Annotations(context, (Annotations) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ATTRIBUTE:
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
			case OmcstDslPackage.BOOL_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getBoolConstraintRule()) {
					sequence_BoolConstraint_BoolConstraint(context, (BoolConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.DATA_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getDataTypeRule()) {
					sequence_DataType_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.DATE_TIME_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDateTimeConstraintRule()) {
					sequence_DateTimeConstraint_DateTimeConstraint(context, (DateTimeConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.DECIMAL_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDecimalConstraintRule()) {
					sequence_DecimalConstraint_DecimalConstraint(context, (DecimalConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.DOMAIN_MODEL:
				if(context == grammarAccess.getDomainModelRule()) {
					sequence_DomainModel_DomainModel(context, (DomainModel) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ENUMERATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ENUMERATION_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getEnumerationConstraintRule()) {
					sequence_EnumerationConstraint_EnumerationConstraint(context, (EnumerationConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.ENUMERATION_LITERAL:
				if(context == grammarAccess.getEnumerationLiteralRule()) {
					sequence_EnumerationLiteral_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.IMPORT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.NUMBER_CONSTRAINT:
				if(context == grammarAccess.getNumberConstraintRule()) {
					sequence_NumberConstraint_NumberConstraint(context, (NumberConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.PACKAGE_DECLARATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPackageDeclarationRule()) {
					sequence_PackageDeclaration_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Parameter_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.REFERENCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Feature_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.STRING_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getStringConstraintRule()) {
					sequence_StringConstraint_StringConstraint(context, (StringConstraint) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.TYPE_REF:
				if(context == grammarAccess.getTypeRefRule()) {
					sequence_TypeRef_TypeRef(context, (TypeRef) semanticObject); 
					return; 
				}
				else break;
			case OmcstDslPackage.XSD_ELEMENT:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getXsdElementRule()) {
					sequence_XsdElement_XsdElement(context, (XsdElement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (hasDefault?='default' defaultValue=STRING)? 
	 *         (isFixed?='fixed' fixedValue=STRING)? 
	 *         minLen=INT? 
	 *         maxLen=INT? 
	 *         fixeLen=INT? 
	 *         paddle=STRING? 
	 *         isId?='id'? 
	 *         nullable?='nullable'? 
	 *         (derived?='derived' writable?='writable'?)? 
	 *         isXSDAtt?='xsdA.'?
	 *     )
	 *
	 * Features:
	 *    hasDefault[0, 1]
	 *         EXCLUDE_IF_UNSET defaultValue
	 *         MANDATORY_IF_SET defaultValue
	 *    defaultValue[0, 1]
	 *         EXCLUDE_IF_UNSET hasDefault
	 *         MANDATORY_IF_SET hasDefault
	 *    isFixed[0, 1]
	 *         EXCLUDE_IF_UNSET fixedValue
	 *         MANDATORY_IF_SET fixedValue
	 *    fixedValue[0, 1]
	 *         EXCLUDE_IF_UNSET isFixed
	 *         MANDATORY_IF_SET isFixed
	 *    minLen[0, 1]
	 *    maxLen[0, 1]
	 *    fixeLen[0, 1]
	 *    paddle[0, 1]
	 *    isId[0, 1]
	 *    nullable[0, 1]
	 *    derived[0, 1]
	 *         MANDATORY_IF_SET writable
	 *    writable[0, 1]
	 *         EXCLUDE_IF_UNSET derived
	 *    isXSDAtt[0, 1]
	 */
	protected void sequence_AllConstraint_AllConstraint(EObject context, AllConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.ANNOTATION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.ANNOTATION__KEY));
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.ANNOTATION__VALUE));
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
	 *     constraint='boolean'
	 *
	 * Features:
	 *    constraint[1, 1]
	 */
	protected void sequence_BoolConstraint_BoolConstraint(EObject context, BoolConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.BOOL_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.BOOL_CONSTRAINT__CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID constraint=Constraint? anno=Annotations?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    constraint[0, 1]
	 *    anno[0, 1]
	 */
	protected void sequence_DataType_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint='datetime' (hasDefault?='default' defaultValue=STRING)?)
	 *
	 * Features:
	 *    constraint[1, 1]
	 *    hasDefault[0, 1]
	 *         EXCLUDE_IF_UNSET defaultValue
	 *         MANDATORY_IF_SET defaultValue
	 *    defaultValue[0, 1]
	 *         EXCLUDE_IF_UNSET hasDefault
	 *         MANDATORY_IF_SET hasDefault
	 */
	protected void sequence_DateTimeConstraint_DateTimeConstraint(EObject context, DateTimeConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint='decimal' constraintRef=NumberConstraint)
	 *
	 * Features:
	 *    constraint[1, 1]
	 *    constraintRef[1, 1]
	 */
	protected void sequence_DecimalConstraint_DecimalConstraint(EObject context, DecimalConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT));
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0(), semanticObject.getConstraintRef());
		feeder.finish();
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
	 *         anno=Annotations? 
	 *         description=STRING? 
	 *         features+=Feature*
	 *     )
	 *
	 * Features:
	 *    name[1, 1]
	 *    entityType[0, 1]
	 *    superType[0, 1]
	 *    anno[0, 1]
	 *    description[0, 1]
	 *    features[0, *]
	 */
	protected void sequence_Entity_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (usage=EnumUsage fixeLen=INT? (hasDefault?='default' defaultValueAsString=ID)?)
	 *
	 * Features:
	 *    usage[1, 1]
	 *    fixeLen[0, 1]
	 *    hasDefault[0, 1]
	 *         EXCLUDE_IF_UNSET defaultValueAsString
	 *         MANDATORY_IF_SET defaultValueAsString
	 *    defaultValueAsString[0, 1]
	 *         EXCLUDE_IF_UNSET hasDefault
	 *         MANDATORY_IF_SET hasDefault
	 */
	protected void sequence_EnumerationConstraint_EnumerationConstraint(EObject context, EnumerationConstraint semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.ENUMERATION_LITERAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.ENUMERATION_LITERAL__NAME));
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.ENUMERATION_LITERAL__PERSISTED_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.ENUMERATION_LITERAL__PERSISTED_VALUE));
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
	 *     (name=ID type=TypeRef constraint=Constraint? anno=Annotations? description=STRING?)
	 *
	 * Features:
	 *    constraint[0, 1]
	 *    anno[0, 1]
	 *    description[0, 1]
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Feature_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         type=TypeRef 
	 *         opposite=[Reference|ID]? 
	 *         constraint=Constraint? 
	 *         anno=Annotations? 
	 *         description=STRING?
	 *     )
	 *
	 * Features:
	 *    constraint[0, 1]
	 *    anno[0, 1]
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
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (hasDefault?='default' defaultValue=STRING)? 
	 *         (isFixed?='fixed' fixedValue=STRING)? 
	 *         minValue=INT? 
	 *         maxValue=INT? 
	 *         minLen=INT? 
	 *         maxLen=INT? 
	 *         fixeLen=INT? 
	 *         paddle=STRING? 
	 *         isId?='id'? 
	 *         nullable?='nullable'? 
	 *         (derived?='derived' writable?='writable'?)? 
	 *         isXSDAtt?='xsdA.'?
	 *     )
	 *
	 * Features:
	 *    hasDefault[0, 1]
	 *         EXCLUDE_IF_UNSET defaultValue
	 *         MANDATORY_IF_SET defaultValue
	 *    defaultValue[0, 1]
	 *         EXCLUDE_IF_UNSET hasDefault
	 *         MANDATORY_IF_SET hasDefault
	 *    isFixed[0, 1]
	 *         EXCLUDE_IF_UNSET fixedValue
	 *         MANDATORY_IF_SET fixedValue
	 *    fixedValue[0, 1]
	 *         EXCLUDE_IF_UNSET isFixed
	 *         MANDATORY_IF_SET isFixed
	 *    minValue[0, 1]
	 *    maxValue[0, 1]
	 *    minLen[0, 1]
	 *    maxLen[0, 1]
	 *    fixeLen[0, 1]
	 *    paddle[0, 1]
	 *    isId[0, 1]
	 *    nullable[0, 1]
	 *    derived[0, 1]
	 *         MANDATORY_IF_SET writable
	 *    writable[0, 1]
	 *         EXCLUDE_IF_UNSET derived
	 *    isXSDAtt[0, 1]
	 */
	protected void sequence_NumberConstraint_NumberConstraint(EObject context, NumberConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=QualifiedName prefix=QualifiedName? namespace=STRING? anno=Annotations? elements+=AbstractElement*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    prefix[0, 1]
	 *    namespace[0, 1]
	 *    anno[0, 1]
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
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.PARAMETER__NAME));
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.PARAMETER__TYPE));
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
	 *     (constraint='string' constraintRef=AllConstraint regularExpression=STRING?)
	 *
	 * Features:
	 *    constraint[1, 1]
	 *    constraintRef[1, 1]
	 *    regularExpression[0, 1]
	 */
	protected void sequence_StringConstraint_StringConstraint(EObject context, StringConstraint semanticObject) {
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
	
	
	/**
	 * Constraint:
	 *     xsdElement=[Entity|ID]
	 *
	 * Features:
	 *    xsdElement[1, 1]
	 */
	protected void sequence_XsdElement_XsdElement(EObject context, XsdElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OmcstDslPackage.Literals.XSD_ELEMENT__XSD_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OmcstDslPackage.Literals.XSD_ELEMENT__XSD_ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXsdElementAccess().getXsdElementEntityIDTerminalRuleCall_1_0_1(), semanticObject.getXsdElement());
		feeder.finish();
	}
}
