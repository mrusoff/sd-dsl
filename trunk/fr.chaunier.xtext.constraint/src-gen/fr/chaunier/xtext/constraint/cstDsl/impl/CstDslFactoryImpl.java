/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.*;

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
public class CstDslFactoryImpl extends EFactoryImpl implements CstDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CstDslFactory init()
  {
    try
    {
      CstDslFactory theCstDslFactory = (CstDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/constraint/CstDsl"); 
      if (theCstDslFactory != null)
      {
        return theCstDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CstDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CstDslFactoryImpl()
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
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT: return createDomainModelConstraint();
      case CstDslPackage.SPECIFICATION: return createSpecification();
      case CstDslPackage.FILE_SPECIFICATION: return createFileSpecification();
      case CstDslPackage.FREE_SPECIFICATION: return createFreeSpecification();
      case CstDslPackage.ABSTRACT_ELEMENT_CONSTRAINT: return createAbstractElementConstraint();
      case CstDslPackage.IMPORT: return createImport();
      case CstDslPackage.PACKAGE_CONSTRAINT: return createPackageConstraint();
      case CstDslPackage.TYPE_CONSTRAINT: return createTypeConstraint();
      case CstDslPackage.DATA_TYPE_CONSTRAINT: return createDataTypeConstraint();
      case CstDslPackage.ENTITY_CONSTRAINT: return createEntityConstraint();
      case CstDslPackage.FEATURE_CONSTRAINT: return createFeatureConstraint();
      case CstDslPackage.ATTRIBUTE_CONSTRAINT: return createAttributeConstraint();
      case CstDslPackage.CONSTRAINT: return createConstraint();
      case CstDslPackage.BOOL_CONSTRAINT: return createBoolConstraint();
      case CstDslPackage.STRING_CONSTRAINT: return createStringConstraint();
      case CstDslPackage.DATE_TIME_CONSTRAINT: return createDateTimeConstraint();
      case CstDslPackage.DECIMAL_CONSTRAINT: return createDecimalConstraint();
      case CstDslPackage.ENUMERATION_CONSTRAINT: return createEnumerationConstraint();
      case CstDslPackage.NUMBER_CONSTRAINT: return createNumberConstraint();
      case CstDslPackage.ALL_CONSTRAINT: return createAllConstraint();
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
      case CstDslPackage.ENUM_USAGE:
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
      case CstDslPackage.ENUM_USAGE:
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
  public DomainModelConstraint createDomainModelConstraint()
  {
    DomainModelConstraintImpl domainModelConstraint = new DomainModelConstraintImpl();
    return domainModelConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileSpecification createFileSpecification()
  {
    FileSpecificationImpl fileSpecification = new FileSpecificationImpl();
    return fileSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FreeSpecification createFreeSpecification()
  {
    FreeSpecificationImpl freeSpecification = new FreeSpecificationImpl();
    return freeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElementConstraint createAbstractElementConstraint()
  {
    AbstractElementConstraintImpl abstractElementConstraint = new AbstractElementConstraintImpl();
    return abstractElementConstraint;
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
  public PackageConstraint createPackageConstraint()
  {
    PackageConstraintImpl packageConstraint = new PackageConstraintImpl();
    return packageConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeConstraint createTypeConstraint()
  {
    TypeConstraintImpl typeConstraint = new TypeConstraintImpl();
    return typeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeConstraint createDataTypeConstraint()
  {
    DataTypeConstraintImpl dataTypeConstraint = new DataTypeConstraintImpl();
    return dataTypeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityConstraint createEntityConstraint()
  {
    EntityConstraintImpl entityConstraint = new EntityConstraintImpl();
    return entityConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureConstraint createFeatureConstraint()
  {
    FeatureConstraintImpl featureConstraint = new FeatureConstraintImpl();
    return featureConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeConstraint createAttributeConstraint()
  {
    AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
    return attributeConstraint;
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
  public CstDslPackage getCstDslPackage()
  {
    return (CstDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CstDslPackage getPackage()
  {
    return CstDslPackage.eINSTANCE;
  }

} //CstDslFactoryImpl
