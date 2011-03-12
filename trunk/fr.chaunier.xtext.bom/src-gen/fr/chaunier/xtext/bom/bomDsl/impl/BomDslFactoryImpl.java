/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.*;

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
public class BomDslFactoryImpl extends EFactoryImpl implements BomDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BomDslFactory init()
  {
    try
    {
      BomDslFactory theBomDslFactory = (BomDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/bom/BomDsl"); 
      if (theBomDslFactory != null)
      {
        return theBomDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BomDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BomDslFactoryImpl()
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
      case BomDslPackage.DOMAIN_MODEL: return createDomainModel();
      case BomDslPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case BomDslPackage.IMPORT: return createImport();
      case BomDslPackage.PACKAGE_DECLARATION: return createPackageDeclaration();
      case BomDslPackage.TYPE: return createType();
      case BomDslPackage.DATA_TYPE: return createDataType();
      case BomDslPackage.ENTITY: return createEntity();
      case BomDslPackage.FEATURE: return createFeature();
      case BomDslPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
      case BomDslPackage.ATTRIBUTE: return createAttribute();
      case BomDslPackage.REFERENCE: return createReference();
      case BomDslPackage.ENUMERATION: return createEnumeration();
      case BomDslPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case BomDslPackage.OPERATION: return createOperation();
      case BomDslPackage.PARAMETER: return createParameter();
      case BomDslPackage.TYPED_ELEMENT: return createTypedElement();
      case BomDslPackage.TYPE_REF: return createTypeRef();
      case BomDslPackage.CONSTRAINT: return createConstraint();
      case BomDslPackage.BOOL_CONSTRAINT: return createBoolConstraint();
      case BomDslPackage.STRING_CONSTRAINT: return createStringConstraint();
      case BomDslPackage.DATE_TIME_CONSTRAINT: return createDateTimeConstraint();
      case BomDslPackage.INTEGER_CONSTRAINT: return createIntegerConstraint();
      case BomDslPackage.DECIMAL_CONSTRAINT: return createDecimalConstraint();
      case BomDslPackage.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
      case BomDslPackage.NUMBER_CONSTRAINT: return createNumberConstraint();
      case BomDslPackage.ALL_CONSTRAINT: return createAllConstraint();
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
      case BomDslPackage.VISIBILITY:
        return createVisibilityFromString(eDataType, initialValue);
      case BomDslPackage.ENTITY_TYPE:
        return createEntityTypeFromString(eDataType, initialValue);
      case BomDslPackage.ENUM_USAGE:
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
      case BomDslPackage.VISIBILITY:
        return convertVisibilityToString(eDataType, instanceValue);
      case BomDslPackage.ENTITY_TYPE:
        return convertEntityTypeToString(eDataType, instanceValue);
      case BomDslPackage.ENUM_USAGE:
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
  public IntegerConstraint createIntegerConstraint()
  {
    IntegerConstraintImpl integerConstraint = new IntegerConstraintImpl();
    return integerConstraint;
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
  public BomDslPackage getBomDslPackage()
  {
    return (BomDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BomDslPackage getPackage()
  {
    return BomDslPackage.eINSTANCE;
  }

} //BomDslFactoryImpl
