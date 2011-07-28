/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint;
import fr.chaunier.xtext.constraint.cstDsl.AllConstraint;
import fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.BoolConstraint;
import fr.chaunier.xtext.constraint.cstDsl.Constraint;
import fr.chaunier.xtext.constraint.cstDsl.CstDslFactory;
import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EnumUsage;
import fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint;
import fr.chaunier.xtext.constraint.cstDsl.FileSpecification;
import fr.chaunier.xtext.constraint.cstDsl.FreeSpecification;
import fr.chaunier.xtext.constraint.cstDsl.Import;
import fr.chaunier.xtext.constraint.cstDsl.NumberConstraint;
import fr.chaunier.xtext.constraint.cstDsl.PackageConstraint;
import fr.chaunier.xtext.constraint.cstDsl.Specification;
import fr.chaunier.xtext.constraint.cstDsl.StringConstraint;
import fr.chaunier.xtext.constraint.cstDsl.TypeConstraint;

import fr.chaunier.xtext.om.omDsl.OmDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CstDslPackageImpl extends EPackageImpl implements CstDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass freeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateTimeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumUsageEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CstDslPackageImpl()
  {
    super(eNS_URI, CstDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CstDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CstDslPackage init()
  {
    if (isInited) return (CstDslPackage)EPackage.Registry.INSTANCE.getEPackage(CstDslPackage.eNS_URI);

    // Obtain or create and register package
    CstDslPackageImpl theCstDslPackage = (CstDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CstDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CstDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    OmDslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theCstDslPackage.createPackageContents();

    // Initialize created meta-data
    theCstDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCstDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CstDslPackage.eNS_URI, theCstDslPackage);
    return theCstDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModelConstraint()
  {
    return domainModelConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModelConstraint_Imports()
  {
    return (EReference)domainModelConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModelConstraint_Elements()
  {
    return (EReference)domainModelConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileSpecification()
  {
    return fileSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSpecification_Format()
  {
    return (EAttribute)fileSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileSpecification_Delimiter()
  {
    return (EAttribute)fileSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFreeSpecification()
  {
    return freeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFreeSpecification_Lines()
  {
    return (EAttribute)freeSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElementConstraint()
  {
    return abstractElementConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageConstraint()
  {
    return packageConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageConstraint_PackageDeclaration()
  {
    return (EReference)packageConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageConstraint_Prefix()
  {
    return (EAttribute)packageConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageConstraint_Namespace()
  {
    return (EAttribute)packageConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageConstraint_Types()
  {
    return (EReference)packageConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeConstraint()
  {
    return typeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeConstraint()
  {
    return dataTypeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeConstraint_DataType()
  {
    return (EReference)dataTypeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeConstraint_Constraint()
  {
    return (EReference)dataTypeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeConstraint_Description()
  {
    return (EAttribute)dataTypeConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityConstraint()
  {
    return entityConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityConstraint_Entity()
  {
    return (EReference)entityConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityConstraint_Description()
  {
    return (EAttribute)entityConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityConstraint_Features()
  {
    return (EReference)entityConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureConstraint()
  {
    return featureConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeConstraint()
  {
    return attributeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeConstraint_Constraint()
  {
    return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeConstraint_Description()
  {
    return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeConstraint_Attribute()
  {
    return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstraint()
  {
    return constraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolConstraint()
  {
    return boolConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBoolConstraint_Constraint()
  {
    return (EAttribute)boolConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringConstraint()
  {
    return stringConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstraint_Constraint()
  {
    return (EAttribute)stringConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringConstraint_ConstraintRef()
  {
    return (EReference)stringConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringConstraint_RegularExpression()
  {
    return (EAttribute)stringConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateTimeConstraint()
  {
    return dateTimeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateTimeConstraint_Constraint()
  {
    return (EAttribute)dateTimeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDateTimeConstraint_DataType()
  {
    return (EReference)dateTimeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateTimeConstraint_HasDefault()
  {
    return (EAttribute)dateTimeConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateTimeConstraint_DefaultValue()
  {
    return (EAttribute)dateTimeConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecimalConstraint()
  {
    return decimalConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecimalConstraint_Constraint()
  {
    return (EAttribute)decimalConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecimalConstraint_ConstraintRef()
  {
    return (EReference)decimalConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationConstraint()
  {
    return enumerationConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationConstraint_Usage()
  {
    return (EAttribute)enumerationConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationConstraint_FixeLen()
  {
    return (EAttribute)enumerationConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationConstraint_HasDefault()
  {
    return (EAttribute)enumerationConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationConstraint_DefaultValueAsString()
  {
    return (EAttribute)enumerationConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberConstraint()
  {
    return numberConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_HasDefault()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_DefaultValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_IsFixed()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_FixedValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_MinValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_MaxValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_MinLen()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_MaxLen()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_FixeLen()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Paddle()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_IsId()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Nullable()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Derived()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Writable()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_IsXSDAtt()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllConstraint()
  {
    return allConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_HasDefault()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_DefaultValue()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_IsFixed()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_FixedValue()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_MinLen()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_MaxLen()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_FixeLen()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Paddle()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_IsId()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Nullable()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Derived()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Writable()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_IsXSDAtt()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumUsage()
  {
    return enumUsageEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CstDslFactory getCstDslFactory()
  {
    return (CstDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainModelConstraintEClass = createEClass(DOMAIN_MODEL_CONSTRAINT);
    createEReference(domainModelConstraintEClass, DOMAIN_MODEL_CONSTRAINT__IMPORTS);
    createEReference(domainModelConstraintEClass, DOMAIN_MODEL_CONSTRAINT__ELEMENTS);

    specificationEClass = createEClass(SPECIFICATION);

    fileSpecificationEClass = createEClass(FILE_SPECIFICATION);
    createEAttribute(fileSpecificationEClass, FILE_SPECIFICATION__FORMAT);
    createEAttribute(fileSpecificationEClass, FILE_SPECIFICATION__DELIMITER);

    freeSpecificationEClass = createEClass(FREE_SPECIFICATION);
    createEAttribute(freeSpecificationEClass, FREE_SPECIFICATION__LINES);

    abstractElementConstraintEClass = createEClass(ABSTRACT_ELEMENT_CONSTRAINT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageConstraintEClass = createEClass(PACKAGE_CONSTRAINT);
    createEReference(packageConstraintEClass, PACKAGE_CONSTRAINT__PACKAGE_DECLARATION);
    createEAttribute(packageConstraintEClass, PACKAGE_CONSTRAINT__PREFIX);
    createEAttribute(packageConstraintEClass, PACKAGE_CONSTRAINT__NAMESPACE);
    createEReference(packageConstraintEClass, PACKAGE_CONSTRAINT__TYPES);

    typeConstraintEClass = createEClass(TYPE_CONSTRAINT);

    dataTypeConstraintEClass = createEClass(DATA_TYPE_CONSTRAINT);
    createEReference(dataTypeConstraintEClass, DATA_TYPE_CONSTRAINT__DATA_TYPE);
    createEReference(dataTypeConstraintEClass, DATA_TYPE_CONSTRAINT__CONSTRAINT);
    createEAttribute(dataTypeConstraintEClass, DATA_TYPE_CONSTRAINT__DESCRIPTION);

    entityConstraintEClass = createEClass(ENTITY_CONSTRAINT);
    createEReference(entityConstraintEClass, ENTITY_CONSTRAINT__ENTITY);
    createEAttribute(entityConstraintEClass, ENTITY_CONSTRAINT__DESCRIPTION);
    createEReference(entityConstraintEClass, ENTITY_CONSTRAINT__FEATURES);

    featureConstraintEClass = createEClass(FEATURE_CONSTRAINT);

    attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
    createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__CONSTRAINT);
    createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__DESCRIPTION);
    createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ATTRIBUTE);

    constraintEClass = createEClass(CONSTRAINT);

    boolConstraintEClass = createEClass(BOOL_CONSTRAINT);
    createEAttribute(boolConstraintEClass, BOOL_CONSTRAINT__CONSTRAINT);

    stringConstraintEClass = createEClass(STRING_CONSTRAINT);
    createEAttribute(stringConstraintEClass, STRING_CONSTRAINT__CONSTRAINT);
    createEReference(stringConstraintEClass, STRING_CONSTRAINT__CONSTRAINT_REF);
    createEAttribute(stringConstraintEClass, STRING_CONSTRAINT__REGULAR_EXPRESSION);

    dateTimeConstraintEClass = createEClass(DATE_TIME_CONSTRAINT);
    createEAttribute(dateTimeConstraintEClass, DATE_TIME_CONSTRAINT__CONSTRAINT);
    createEReference(dateTimeConstraintEClass, DATE_TIME_CONSTRAINT__DATA_TYPE);
    createEAttribute(dateTimeConstraintEClass, DATE_TIME_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(dateTimeConstraintEClass, DATE_TIME_CONSTRAINT__DEFAULT_VALUE);

    decimalConstraintEClass = createEClass(DECIMAL_CONSTRAINT);
    createEAttribute(decimalConstraintEClass, DECIMAL_CONSTRAINT__CONSTRAINT);
    createEReference(decimalConstraintEClass, DECIMAL_CONSTRAINT__CONSTRAINT_REF);

    enumerationConstraintEClass = createEClass(ENUMERATION_CONSTRAINT);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__USAGE);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__FIXE_LEN);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING);

    numberConstraintEClass = createEClass(NUMBER_CONSTRAINT);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__DEFAULT_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__IS_FIXED);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__FIXED_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MIN_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MAX_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MIN_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MAX_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__FIXE_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__PADDLE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__IS_ID);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__NULLABLE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__DERIVED);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__WRITABLE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__IS_XSD_ATT);

    allConstraintEClass = createEClass(ALL_CONSTRAINT);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__DEFAULT_VALUE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__IS_FIXED);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__FIXED_VALUE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__MIN_LEN);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__MAX_LEN);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__FIXE_LEN);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__PADDLE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__IS_ID);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__NULLABLE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__DERIVED);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__WRITABLE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__IS_XSD_ATT);

    // Create enums
    enumUsageEEnum = createEEnum(ENUM_USAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    OmDslPackage theOmDslPackage = (OmDslPackage)EPackage.Registry.INSTANCE.getEPackage(OmDslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fileSpecificationEClass.getESuperTypes().add(this.getSpecification());
    freeSpecificationEClass.getESuperTypes().add(this.getSpecification());
    packageConstraintEClass.getESuperTypes().add(this.getAbstractElementConstraint());
    dataTypeConstraintEClass.getESuperTypes().add(this.getAbstractElementConstraint());
    dataTypeConstraintEClass.getESuperTypes().add(this.getTypeConstraint());
    entityConstraintEClass.getESuperTypes().add(this.getAbstractElementConstraint());
    entityConstraintEClass.getESuperTypes().add(this.getTypeConstraint());
    attributeConstraintEClass.getESuperTypes().add(this.getFeatureConstraint());
    boolConstraintEClass.getESuperTypes().add(this.getConstraint());
    stringConstraintEClass.getESuperTypes().add(this.getConstraint());
    dateTimeConstraintEClass.getESuperTypes().add(this.getConstraint());
    decimalConstraintEClass.getESuperTypes().add(this.getConstraint());
    enumerationConstraintEClass.getESuperTypes().add(this.getConstraint());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelConstraintEClass, DomainModelConstraint.class, "DomainModelConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModelConstraint_Imports(), this.getImport(), null, "imports", null, 0, -1, DomainModelConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainModelConstraint_Elements(), this.getAbstractElementConstraint(), null, "elements", null, 0, -1, DomainModelConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fileSpecificationEClass, FileSpecification.class, "FileSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFileSpecification_Format(), ecorePackage.getEString(), "format", null, 0, 1, FileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileSpecification_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, FileSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(freeSpecificationEClass, FreeSpecification.class, "FreeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFreeSpecification_Lines(), ecorePackage.getEString(), "lines", null, 0, -1, FreeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementConstraintEClass, AbstractElementConstraint.class, "AbstractElementConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageConstraintEClass, PackageConstraint.class, "PackageConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageConstraint_PackageDeclaration(), theOmDslPackage.getPackageDeclaration(), null, "packageDeclaration", null, 0, 1, PackageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageConstraint_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, PackageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageConstraint_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, PackageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageConstraint_Types(), this.getTypeConstraint(), null, "types", null, 0, -1, PackageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeConstraintEClass, TypeConstraint.class, "TypeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeConstraintEClass, DataTypeConstraint.class, "DataTypeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeConstraint_DataType(), theOmDslPackage.getDataType(), null, "dataType", null, 0, 1, DataTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeConstraint_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, DataTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTypeConstraint_Description(), ecorePackage.getEString(), "description", null, 0, 1, DataTypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityConstraintEClass, EntityConstraint.class, "EntityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityConstraint_Entity(), theOmDslPackage.getEntity(), null, "entity", null, 0, 1, EntityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityConstraint_Description(), ecorePackage.getEString(), "description", null, 0, 1, EntityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityConstraint_Features(), this.getFeatureConstraint(), null, "features", null, 0, -1, EntityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureConstraintEClass, FeatureConstraint.class, "FeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeConstraint_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeConstraint_Description(), ecorePackage.getEString(), "description", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeConstraint_Attribute(), theOmDslPackage.getAttribute(), null, "attribute", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolConstraintEClass, BoolConstraint.class, "BoolConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BoolConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstraintEClass, StringConstraint.class, "StringConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringConstraint_ConstraintRef(), this.getAllConstraint(), null, "constraintRef", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringConstraint_RegularExpression(), ecorePackage.getEString(), "regularExpression", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateTimeConstraintEClass, DateTimeConstraint.class, "DateTimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateTimeConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDateTimeConstraint_DataType(), theOmDslPackage.getDataType(), null, "dataType", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateTimeConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateTimeConstraint_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalConstraintEClass, DecimalConstraint.class, "DecimalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, DecimalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecimalConstraint_ConstraintRef(), this.getNumberConstraint(), null, "constraintRef", null, 0, 1, DecimalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationConstraintEClass, EnumerationConstraint.class, "EnumerationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationConstraint_Usage(), this.getEnumUsage(), "usage", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_FixeLen(), ecorePackage.getEInt(), "fixeLen", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_DefaultValueAsString(), ecorePackage.getEString(), "defaultValueAsString", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberConstraintEClass, NumberConstraint.class, "NumberConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_IsFixed(), ecorePackage.getEBoolean(), "isFixed", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MinLen(), ecorePackage.getEInt(), "minLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MaxLen(), ecorePackage.getEInt(), "maxLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_FixeLen(), ecorePackage.getEInt(), "fixeLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_Paddle(), ecorePackage.getEString(), "paddle", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_IsId(), ecorePackage.getEBoolean(), "isId", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_Writable(), ecorePackage.getEBoolean(), "writable", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_IsXSDAtt(), ecorePackage.getEBoolean(), "isXSDAtt", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allConstraintEClass, AllConstraint.class, "AllConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAllConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_IsFixed(), ecorePackage.getEBoolean(), "isFixed", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_MinLen(), ecorePackage.getEInt(), "minLen", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_MaxLen(), ecorePackage.getEInt(), "maxLen", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_FixeLen(), ecorePackage.getEInt(), "fixeLen", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Paddle(), ecorePackage.getEString(), "paddle", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_IsId(), ecorePackage.getEBoolean(), "isId", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Writable(), ecorePackage.getEBoolean(), "writable", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_IsXSDAtt(), ecorePackage.getEBoolean(), "isXSDAtt", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(enumUsageEEnum, EnumUsage.class, "EnumUsage");
    addEEnumLiteral(enumUsageEEnum, EnumUsage.AS_STRING);
    addEEnumLiteral(enumUsageEEnum, EnumUsage.AS_VALUE);

    // Create resource
    createResource(eNS_URI);
  }

} //CstDslPackageImpl
