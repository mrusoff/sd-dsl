package fr.chaunier.xtext.constraint.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.chaunier.xtext.constraint.cstDsl.AllConstraint;
import fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.BoolConstraint;
import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FileSpecification;
import fr.chaunier.xtext.constraint.cstDsl.FreeSpecification;
import fr.chaunier.xtext.constraint.cstDsl.Import;
import fr.chaunier.xtext.constraint.cstDsl.NumberConstraint;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.cstDsl.StringConstraint;
import fr.chaunier.xtext.constraint.services.CstDslGrammarAccess;
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
public class AbstractCstDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected CstDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == CstDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CstDslPackage.ALL_CONSTRAINT:
				if(context == grammarAccess.getAllConstraintRule()) {
					sequence_AllConstraint_AllConstraint(context, (AllConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.ATTRIBUTE_CONSTRAINT:
				if(context == grammarAccess.getFeatureConstraintRule()) {
					sequence_FeatureConstraint_AttributeConstraint(context, (AttributeConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAttributeConstraintRule()) {
					sequence_AttributeConstraint_AttributeConstraint(context, (AttributeConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.BOOL_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getBoolConstraintRule()) {
					sequence_BoolConstraint_BoolConstraint(context, (BoolConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.DATA_TYPE_CONSTRAINT:
				if(context == grammarAccess.getAbstractElementConstraintRule() ||
				   context == grammarAccess.getTypeConstraintRule() ||
				   context == grammarAccess.getDataTypeConstraintRule()) {
					sequence_DataTypeConstraint_DataTypeConstraint(context, (DataTypeConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.DATE_TIME_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDateTimeConstraintRule()) {
					sequence_DateTimeConstraint_DateTimeConstraint(context, (DateTimeConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.DECIMAL_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDecimalConstraintRule()) {
					sequence_DecimalConstraint_DecimalConstraint(context, (DecimalConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.DOMAIN_MODEL_CONSTRAINT:
				if(context == grammarAccess.getDomainModelConstraintRule()) {
					sequence_DomainModelConstraint_DomainModelConstraint(context, (DomainModelConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.ENTITY_CONSTRAINT:
				if(context == grammarAccess.getAbstractElementConstraintRule() ||
				   context == grammarAccess.getTypeConstraintRule() ||
				   context == grammarAccess.getEntityConstraintRule()) {
					sequence_EntityConstraint_EntityConstraint(context, (EntityConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.ENUMERATION_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getEnumerationConstraintRule()) {
					sequence_EnumerationConstraint_EnumerationConstraint(context, (EnumerationConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.FILE_SPECIFICATION:
				if(context == grammarAccess.getSpecificationRule() ||
				   context == grammarAccess.getFileSpecificationRule()) {
					sequence_FileSpecification_FileSpecification(context, (FileSpecification) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.FREE_SPECIFICATION:
				if(context == grammarAccess.getSpecificationRule() ||
				   context == grammarAccess.getFreeSpecificationRule()) {
					sequence_FreeSpecification_FreeSpecification(context, (FreeSpecification) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.NUMBER_CONSTRAINT:
				if(context == grammarAccess.getNumberConstraintRule()) {
					sequence_NumberConstraint_NumberConstraint(context, (NumberConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.PACKAGE_CONSTRAINT:
				if(context == grammarAccess.getAbstractElementConstraintRule() ||
				   context == grammarAccess.getPackageConstraintRule()) {
					sequence_PackageConstraint_PackageConstraint(context, (PackageConstraint) semanticObject); 
					return; 
				}
				else break;
			case CstDslPackage.STRING_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getStringConstraintRule()) {
					sequence_StringConstraint_StringConstraint(context, (StringConstraint) semanticObject); 
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
	 *     attribute=[Attribute|ID]
	 *
	 * Features:
	 *    attribute[1, 1]
	 */
	protected void sequence_AttributeConstraint_AttributeConstraint(EObject context, AttributeConstraint semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, CstDslPackage.Literals.BOOL_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CstDslPackage.Literals.BOOL_CONSTRAINT__CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolConstraintAccess().getConstraintBooleanKeyword_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dataType=[DataType|ID] constraint=Constraint? description=STRING?)
	 *
	 * Features:
	 *    dataType[1, 1]
	 *    constraint[0, 1]
	 *    description[0, 1]
	 */
	protected void sequence_DataTypeConstraint_DataTypeConstraint(EObject context, DataTypeConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint='datetime' dataType=[DataType|ID] (hasDefault?='default' defaultValue=STRING)?)
	 *
	 * Features:
	 *    constraint[1, 1]
	 *    dataType[1, 1]
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
			if(transientValues.isValueTransient(semanticObject, CstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT));
			if(transientValues.isValueTransient(semanticObject, CstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CstDslPackage.Literals.DECIMAL_CONSTRAINT__CONSTRAINT_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDecimalConstraintAccess().getConstraintDecimalKeyword_0_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getDecimalConstraintAccess().getConstraintRefNumberConstraintParserRuleCall_1_0(), semanticObject.getConstraintRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* elements+=AbstractElementConstraint*)
	 *
	 * Features:
	 *    imports[0, *]
	 *    elements[0, *]
	 */
	protected void sequence_DomainModelConstraint_DomainModelConstraint(EObject context, DomainModelConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity=[Entity|ID] description=STRING? features+=FeatureConstraint*)
	 *
	 * Features:
	 *    entity[1, 1]
	 *    description[0, 1]
	 *    features[0, *]
	 */
	protected void sequence_EntityConstraint_EntityConstraint(EObject context, EntityConstraint semanticObject) {
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
	 *     (attribute=[Attribute|ID] constraint=Constraint? description=STRING?)
	 *
	 * Features:
	 *    constraint[0, 1]
	 *    description[0, 1]
	 *    attribute[1, 1]
	 */
	protected void sequence_FeatureConstraint_AttributeConstraint(EObject context, AttributeConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (format='XSD' | delimiter=STRING)
	 *
	 * Features:
	 *    format[0, 1]
	 *         EXCLUDE_IF_SET delimiter
	 *    delimiter[0, 1]
	 *         EXCLUDE_IF_SET format
	 */
	protected void sequence_FileSpecification_FileSpecification(EObject context, FileSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     lines+=STRING+
	 *
	 * Features:
	 *    lines[1, *]
	 */
	protected void sequence_FreeSpecification_FreeSpecification(EObject context, FreeSpecification semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, CstDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CstDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
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
	 *     (packageDeclaration=[PackageDeclaration|ID] prefix=QualifiedName namespace=STRING types+=TypeConstraint*)
	 *
	 * Features:
	 *    packageDeclaration[1, 1]
	 *    prefix[1, 1]
	 *    namespace[1, 1]
	 *    types[0, *]
	 */
	protected void sequence_PackageConstraint_PackageConstraint(EObject context, PackageConstraint semanticObject) {
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
}
