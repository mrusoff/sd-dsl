/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.impl;

import fr.chaunier.xtext.omcst.om.omcstDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OmcstDslFactoryImpl extends EFactoryImpl implements OmcstDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OmcstDslFactory init()
  {
    try
    {
      OmcstDslFactory theOmcstDslFactory = (OmcstDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/omcst/om/OmcstDsl"); 
      if (theOmcstDslFactory != null)
      {
        return theOmcstDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OmcstDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmcstDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OmcstDslPackage.DOMAIN_MODEL: return createDomainModel();
      case OmcstDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case OmcstDslPackage.IMPORT: return createImport();
      case OmcstDslPackage.XSD_ELEMENT: return createXsdElement();
      case OmcstDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case OmcstDslPackage.TYPE: return createType();
      case OmcstDslPackage.DATA_TYPE: return createDataType();
      case OmcstDslPackage.ENTITY: return createEntity();
      case OmcstDslPackage.FEATURE: return createFeature();
      case OmcstDslPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
      case OmcstDslPackage.ATTRIBUTE: return createAttribute();
      case OmcstDslPackage.REFERENCE: return createReference();
      case OmcstDslPackage.ENUMERATION: return createEnumeration();
      case OmcstDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case OmcstDslPackage.OPERATION: return createOperation();
      case OmcstDslPackage.PARAMETER: return createParameter();
      case OmcstDslPackage.TYPED_ELEMENT: return createTypedElement();
      case OmcstDslPackage.TYPE_REF: return createTypeRef();
      case OmcstDslPackage.ANNOTATIONS: return createAnnotations();
      case OmcstDslPackage.ANNOTATION: return createAnnotation();
      case OmcstDslPackage.CONSTRAINT: return createConstraint();
      case OmcstDslPackage.BOOL_CONSTRAINT: return createBoolConstraint();
      case OmcstDslPackage.STRING_CONSTRAINT: return createStringConstraint();
      case OmcstDslPackage.DATE_TIME_CONSTRAINT: return createDateTimeConstraint();
      case OmcstDslPackage.DECIMAL_CONSTRAINT: return createDecimalConstraint();
      case OmcstDslPackage.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
      case OmcstDslPackage.NUMBER_CONSTRAINT: return createNumberConstraint();
      case OmcstDslPackage.ALL_CONSTRAINT: return createAllConstraint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OmcstDslPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      case OmcstDslPackage.ENTITY_TYPE:
        return createEntityTypeFromString(eDataType, initialValue);
      case OmcstDslPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      case OmcstDslPackage.ENUM_USAGE:
        return createEnumUsageFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OmcstDslPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      case OmcstDslPackage.ENTITY_TYPE:
        return convertEntityTypeToString(eDataType, instanceValue);
      case OmcstDslPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      case OmcstDslPackage.ENUM_USAGE:
        return convertEnumUsageToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsdElement createXsdElement()
  {
    XsdElementImpl xsdElement = new XsdElementImpl();
    return xsdElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageDeclaration createPackageDeclaration()
  {
    PackageDeclarationImpl packageDeclaration = new PackageDeclarationImpl();
    return packageDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralFeature createStructuralFeature()
  {
    StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
    return structuralFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedElement createTypedElement()
  {
    TypedElementImpl typedElement = new TypedElementImpl();
    return typedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotations createAnnotations()
  {
    AnnotationsImpl annotations = new AnnotationsImpl();
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstraint createBoolConstraint()
  {
    BoolConstraintImpl boolConstraint = new BoolConstraintImpl();
    return boolConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringConstraint createStringConstraint()
  {
    StringConstraintImpl stringConstraint = new StringConstraintImpl();
    return stringConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateTimeConstraint createDateTimeConstraint()
  {
    DateTimeConstraintImpl dateTimeConstraint = new DateTimeConstraintImpl();
    return dateTimeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalConstraint createDecimalConstraint()
  {
    DecimalConstraintImpl decimalConstraint = new DecimalConstraintImpl();
    return decimalConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumerationConstraint createEnumerationConstraint()
  {
    EnumerationConstraintImpl enumerationConstraint = new EnumerationConstraintImpl();
    return enumerationConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberConstraint createNumberConstraint()
  {
    NumberConstraintImpl numberConstraint = new NumberConstraintImpl();
    return numberConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllConstraint createAllConstraint()
  {
    AllConstraintImpl allConstraint = new AllConstraintImpl();
    return allConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibilityFromString(EDataType eDataType, String initialValue)
  {
    Visibility result = Visibility.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityTypeFromString(EDataType eDataType, String initialValue)
  {
    EntityType result = EntityType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEntityTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumUsage createEnumUsageFromString(EDataType eDataType, String initialValue)
  {
    EnumUsage result = EnumUsage.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumUsageToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmcstDslPackage getOmcstDslPackage()
  {
    return (OmcstDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OmcstDslPackage getPackage()
  {
    return OmcstDslPackage.eINSTANCE;
  }

} //OmcstDslFactoryImpl
