/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.AbstractElement;
import fr.chaunier.xtext.bom.bomDsl.AllConstraint;
import fr.chaunier.xtext.bom.bomDsl.Attribute;
import fr.chaunier.xtext.bom.bomDsl.BomDslFactory;
import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.BoolConstraint;
import fr.chaunier.xtext.bom.bomDsl.Constraint;
import fr.chaunier.xtext.bom.bomDsl.DataType;
import fr.chaunier.xtext.bom.bomDsl.DateTimeConstraint;
import fr.chaunier.xtext.bom.bomDsl.DecimalConstraint;
import fr.chaunier.xtext.bom.bomDsl.DomainModel;
import fr.chaunier.xtext.bom.bomDsl.Entity;
import fr.chaunier.xtext.bom.bomDsl.EntityType;
import fr.chaunier.xtext.bom.bomDsl.EnumUsage;
import fr.chaunier.xtext.bom.bomDsl.Enumeration;
import fr.chaunier.xtext.bom.bomDsl.EnumerationConstraint;
import fr.chaunier.xtext.bom.bomDsl.EnumerationLiteral;
import fr.chaunier.xtext.bom.bomDsl.Feature;
import fr.chaunier.xtext.bom.bomDsl.Import;
import fr.chaunier.xtext.bom.bomDsl.IntegerConstraint;
import fr.chaunier.xtext.bom.bomDsl.NumberConstraint;
import fr.chaunier.xtext.bom.bomDsl.Operation;
import fr.chaunier.xtext.bom.bomDsl.PackageDeclaration;
import fr.chaunier.xtext.bom.bomDsl.Parameter;
import fr.chaunier.xtext.bom.bomDsl.Reference;
import fr.chaunier.xtext.bom.bomDsl.StringConstraint;
import fr.chaunier.xtext.bom.bomDsl.StructuralFeature;
import fr.chaunier.xtext.bom.bomDsl.Type;
import fr.chaunier.xtext.bom.bomDsl.TypeRef;
import fr.chaunier.xtext.bom.bomDsl.TypedElement;
import fr.chaunier.xtext.bom.bomDsl.Visibility;

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
public class BomDslPackageImpl extends EPackageImpl implements BomDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

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
  private EClass packageDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structuralFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumerationLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeRefEClass = null;

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
  private EClass integerConstraintEClass = null;

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
  private EEnum visibilityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum entityTypeEEnum = null;

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
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BomDslPackageImpl()
  {
    super(eNS_URI, BomDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BomDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BomDslPackage init()
  {
    if (isInited) return (BomDslPackage)EPackage.Registry.INSTANCE.getEPackage(BomDslPackage.eNS_URI);

    // Obtain or create and register package
    BomDslPackageImpl theBomDslPackage = (BomDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BomDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BomDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBomDslPackage.createPackageContents();

    // Initialize created meta-data
    theBomDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBomDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BomDslPackage.eNS_URI, theBomDslPackage);
    return theBomDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainModel()
  {
    return domainModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainModel_Elements()
  {
    return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
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
  public EClass getPackageDeclaration()
  {
    return packageDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Name()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Prefix()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Namespace()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Format()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Delimiter()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageDeclaration_Lines()
  {
    return (EAttribute)packageDeclarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageDeclaration_Elements()
  {
    return (EReference)packageDeclarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_EntityType()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_SuperType()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntity_Description()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Features()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructuralFeature()
  {
    return structuralFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuralFeature_Constraint()
  {
    return (EReference)structuralFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructuralFeature_Description()
  {
    return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructuralFeature_Name()
  {
    return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuralFeature_Type()
  {
    return (EReference)structuralFeatureEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Opposite()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeration_EnumerationLiterals()
  {
    return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationLiteral()
  {
    return enumerationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_Name()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumerationLiteral_PersistedValue()
  {
    return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Visibility()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Params()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Type()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedElement()
  {
    return typedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRef_Referenced()
  {
    return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRef_Multi()
  {
    return (EAttribute)typeRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRef_Option()
  {
    return (EAttribute)typeRefEClass.getEStructuralFeatures().get(2);
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
  public EClass getIntegerConstraint()
  {
    return integerConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerConstraint_Constraint()
  {
    return (EAttribute)integerConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerConstraint_ConstraintRef()
  {
    return (EReference)integerConstraintEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getNumberConstraint_MinValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_MaxValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_HasDefault()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_DefaultValue()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_IsFixed()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_FixedValue()
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
  public EAttribute getNumberConstraint_Nullable()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Derived()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_Writable()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberConstraint_IsXSDAtt()
  {
    return (EAttribute)numberConstraintEClass.getEStructuralFeatures().get(13);
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
  public EAttribute getAllConstraint_Nullable()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Derived()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_Writable()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllConstraint_IsXSDAtt()
  {
    return (EAttribute)allConstraintEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibility()
  {
    return visibilityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEntityType()
  {
    return entityTypeEEnum;
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
  public BomDslFactory getBomDslFactory()
  {
    return (BomDslFactory)getEFactoryInstance();
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
    domainModelEClass = createEClass(DOMAIN_MODEL);
    createEReference(domainModelEClass, DOMAIN_MODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    packageDeclarationEClass = createEClass(PACKAGE_DECLARATION);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAME);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__PREFIX);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__NAMESPACE);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__FORMAT);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__DELIMITER);
    createEAttribute(packageDeclarationEClass, PACKAGE_DECLARATION__LINES);
    createEReference(packageDeclarationEClass, PACKAGE_DECLARATION__ELEMENTS);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__ENTITY_TYPE);
    createEReference(entityEClass, ENTITY__SUPER_TYPE);
    createEAttribute(entityEClass, ENTITY__DESCRIPTION);
    createEReference(entityEClass, ENTITY__FEATURES);

    featureEClass = createEClass(FEATURE);

    structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
    createEReference(structuralFeatureEClass, STRUCTURAL_FEATURE__CONSTRAINT);
    createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__DESCRIPTION);
    createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__NAME);
    createEReference(structuralFeatureEClass, STRUCTURAL_FEATURE__TYPE);

    attributeEClass = createEClass(ATTRIBUTE);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__OPPOSITE);

    enumerationEClass = createEClass(ENUMERATION);
    createEReference(enumerationEClass, ENUMERATION__ENUMERATION_LITERALS);

    enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);
    createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__PERSISTED_VALUE);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__VISIBILITY);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEReference(operationEClass, OPERATION__PARAMS);
    createEReference(operationEClass, OPERATION__TYPE);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);
    createEReference(parameterEClass, PARAMETER__TYPE);

    typedElementEClass = createEClass(TYPED_ELEMENT);

    typeRefEClass = createEClass(TYPE_REF);
    createEReference(typeRefEClass, TYPE_REF__REFERENCED);
    createEAttribute(typeRefEClass, TYPE_REF__MULTI);
    createEAttribute(typeRefEClass, TYPE_REF__OPTION);

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

    integerConstraintEClass = createEClass(INTEGER_CONSTRAINT);
    createEAttribute(integerConstraintEClass, INTEGER_CONSTRAINT__CONSTRAINT);
    createEReference(integerConstraintEClass, INTEGER_CONSTRAINT__CONSTRAINT_REF);

    decimalConstraintEClass = createEClass(DECIMAL_CONSTRAINT);
    createEAttribute(decimalConstraintEClass, DECIMAL_CONSTRAINT__CONSTRAINT);
    createEReference(decimalConstraintEClass, DECIMAL_CONSTRAINT__CONSTRAINT_REF);

    enumerationConstraintEClass = createEClass(ENUMERATION_CONSTRAINT);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__USAGE);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__FIXE_LEN);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(enumerationConstraintEClass, ENUMERATION_CONSTRAINT__DEFAULT_VALUE_AS_STRING);

    numberConstraintEClass = createEClass(NUMBER_CONSTRAINT);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MIN_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MAX_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__HAS_DEFAULT);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__DEFAULT_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__IS_FIXED);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__FIXED_VALUE);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MIN_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__MAX_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__FIXE_LEN);
    createEAttribute(numberConstraintEClass, NUMBER_CONSTRAINT__PADDLE);
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
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__NULLABLE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__DERIVED);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__WRITABLE);
    createEAttribute(allConstraintEClass, ALL_CONSTRAINT__IS_XSD_ATT);

    // Create enums
    visibilityEEnum = createEEnum(VISIBILITY);
    entityTypeEEnum = createEEnum(ENTITY_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importEClass.getESuperTypes().add(this.getAbstractElement());
    packageDeclarationEClass.getESuperTypes().add(this.getAbstractElement());
    typeEClass.getESuperTypes().add(this.getAbstractElement());
    dataTypeEClass.getESuperTypes().add(this.getType());
    entityEClass.getESuperTypes().add(this.getType());
    featureEClass.getESuperTypes().add(this.getTypedElement());
    structuralFeatureEClass.getESuperTypes().add(this.getFeature());
    attributeEClass.getESuperTypes().add(this.getStructuralFeature());
    referenceEClass.getESuperTypes().add(this.getStructuralFeature());
    enumerationEClass.getESuperTypes().add(this.getType());
    parameterEClass.getESuperTypes().add(this.getTypedElement());
    boolConstraintEClass.getESuperTypes().add(this.getConstraint());
    stringConstraintEClass.getESuperTypes().add(this.getConstraint());
    dateTimeConstraintEClass.getESuperTypes().add(this.getConstraint());
    integerConstraintEClass.getESuperTypes().add(this.getConstraint());
    decimalConstraintEClass.getESuperTypes().add(this.getConstraint());
    enumerationConstraintEClass.getESuperTypes().add(this.getConstraint());

    // Initialize classes and features; add operations and parameters
    initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageDeclarationEClass, PackageDeclaration.class, "PackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Format(), ecorePackage.getEString(), "format", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPackageDeclaration_Lines(), ecorePackage.getEString(), "lines", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageDeclaration_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, PackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_EntityType(), this.getEntityType(), "entityType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_SuperType(), this.getEntity(), null, "superType", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntity_Description(), ecorePackage.getEString(), "description", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructuralFeature_Constraint(), this.getConstraint(), null, "constraint", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructuralFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructuralFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructuralFeature_Type(), this.getTypeRef(), null, "type", null, 0, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Opposite(), this.getReference(), null, "opposite", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumeration_EnumerationLiterals(), this.getEnumerationLiteral(), null, "enumerationLiterals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationLiteral_PersistedValue(), ecorePackage.getEInt(), "persistedValue", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Params(), this.getParameter(), null, "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Type(), this.getTypeRef(), null, "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Type(), this.getTypeRef(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeRef_Referenced(), this.getType(), null, "referenced", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRef_Multi(), ecorePackage.getEBoolean(), "multi", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeRef_Option(), ecorePackage.getEBoolean(), "option", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolConstraintEClass, BoolConstraint.class, "BoolConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBoolConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, BoolConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringConstraintEClass, StringConstraint.class, "StringConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStringConstraint_ConstraintRef(), this.getAllConstraint(), null, "constraintRef", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStringConstraint_RegularExpression(), ecorePackage.getEString(), "regularExpression", null, 0, 1, StringConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateTimeConstraintEClass, DateTimeConstraint.class, "DateTimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateTimeConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDateTimeConstraint_DataType(), this.getDataType(), null, "dataType", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateTimeConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDateTimeConstraint_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, DateTimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerConstraintEClass, IntegerConstraint.class, "IntegerConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, IntegerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerConstraint_ConstraintRef(), this.getNumberConstraint(), null, "constraintRef", null, 0, 1, IntegerConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalConstraintEClass, DecimalConstraint.class, "DecimalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, DecimalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecimalConstraint_ConstraintRef(), this.getNumberConstraint(), null, "constraintRef", null, 0, 1, DecimalConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumerationConstraintEClass, EnumerationConstraint.class, "EnumerationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumerationConstraint_Usage(), this.getEnumUsage(), "usage", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_FixeLen(), ecorePackage.getEInt(), "fixeLen", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumerationConstraint_DefaultValueAsString(), ecorePackage.getEString(), "defaultValueAsString", null, 0, 1, EnumerationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberConstraintEClass, NumberConstraint.class, "NumberConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberConstraint_MinValue(), ecorePackage.getEInt(), "minValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MaxValue(), ecorePackage.getEInt(), "maxValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_HasDefault(), ecorePackage.getEBoolean(), "hasDefault", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_IsFixed(), ecorePackage.getEBoolean(), "isFixed", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_FixedValue(), ecorePackage.getEString(), "fixedValue", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MinLen(), ecorePackage.getEInt(), "minLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_MaxLen(), ecorePackage.getEInt(), "maxLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_FixeLen(), ecorePackage.getEInt(), "fixeLen", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumberConstraint_Paddle(), ecorePackage.getEString(), "paddle", null, 0, 1, NumberConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
    initEAttribute(getAllConstraint_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Derived(), ecorePackage.getEBoolean(), "derived", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_Writable(), ecorePackage.getEBoolean(), "writable", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllConstraint_IsXSDAtt(), ecorePackage.getEBoolean(), "isXSDAtt", null, 0, 1, AllConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(visibilityEEnum, Visibility.class, "Visibility");
    addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
    addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
    addEEnumLiteral(visibilityEEnum, Visibility.PROTECTED);

    initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
    addEEnumLiteral(entityTypeEEnum, EntityType.PUBLIC);

    initEEnum(enumUsageEEnum, EnumUsage.class, "EnumUsage");
    addEEnumLiteral(enumUsageEEnum, EnumUsage.AS_STRING);
    addEEnumLiteral(enumUsageEEnum, EnumUsage.AS_VALUE);

    // Create resource
    createResource(eNS_URI);
  }

} //BomDslPackageImpl
