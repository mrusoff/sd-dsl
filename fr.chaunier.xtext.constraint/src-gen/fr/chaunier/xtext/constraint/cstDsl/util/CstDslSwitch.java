/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.util;

import fr.chaunier.xtext.constraint.cstDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage
 * @generated
 */
public class CstDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CstDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CstDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CstDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CstDslPackage.DOMAIN_MODEL_CONSTRAINT:
      {
        DomainModelConstraint domainModelConstraint = (DomainModelConstraint)theEObject;
        T result = caseDomainModelConstraint(domainModelConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.FILE_SPECIFICATION:
      {
        FileSpecification fileSpecification = (FileSpecification)theEObject;
        T result = caseFileSpecification(fileSpecification);
        if (result == null) result = caseSpecification(fileSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.FREE_SPECIFICATION:
      {
        FreeSpecification freeSpecification = (FreeSpecification)theEObject;
        T result = caseFreeSpecification(freeSpecification);
        if (result == null) result = caseSpecification(freeSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.ABSTRACT_ELEMENT_CONSTRAINT:
      {
        AbstractElementConstraint abstractElementConstraint = (AbstractElementConstraint)theEObject;
        T result = caseAbstractElementConstraint(abstractElementConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.PACKAGE_CONSTRAINT:
      {
        PackageConstraint packageConstraint = (PackageConstraint)theEObject;
        T result = casePackageConstraint(packageConstraint);
        if (result == null) result = caseAbstractElementConstraint(packageConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.TYPE_CONSTRAINT:
      {
        TypeConstraint typeConstraint = (TypeConstraint)theEObject;
        T result = caseTypeConstraint(typeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.DATA_TYPE_CONSTRAINT:
      {
        DataTypeConstraint dataTypeConstraint = (DataTypeConstraint)theEObject;
        T result = caseDataTypeConstraint(dataTypeConstraint);
        if (result == null) result = caseAbstractElementConstraint(dataTypeConstraint);
        if (result == null) result = caseTypeConstraint(dataTypeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.ENTITY_CONSTRAINT:
      {
        EntityConstraint entityConstraint = (EntityConstraint)theEObject;
        T result = caseEntityConstraint(entityConstraint);
        if (result == null) result = caseAbstractElementConstraint(entityConstraint);
        if (result == null) result = caseTypeConstraint(entityConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.FEATURE_CONSTRAINT:
      {
        FeatureConstraint featureConstraint = (FeatureConstraint)theEObject;
        T result = caseFeatureConstraint(featureConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.ATTRIBUTE_CONSTRAINT:
      {
        AttributeConstraint attributeConstraint = (AttributeConstraint)theEObject;
        T result = caseAttributeConstraint(attributeConstraint);
        if (result == null) result = caseFeatureConstraint(attributeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.BOOL_CONSTRAINT:
      {
        BoolConstraint boolConstraint = (BoolConstraint)theEObject;
        T result = caseBoolConstraint(boolConstraint);
        if (result == null) result = caseConstraint(boolConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.STRING_CONSTRAINT:
      {
        StringConstraint stringConstraint = (StringConstraint)theEObject;
        T result = caseStringConstraint(stringConstraint);
        if (result == null) result = caseConstraint(stringConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.DATE_TIME_CONSTRAINT:
      {
        DateTimeConstraint dateTimeConstraint = (DateTimeConstraint)theEObject;
        T result = caseDateTimeConstraint(dateTimeConstraint);
        if (result == null) result = caseConstraint(dateTimeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.DECIMAL_CONSTRAINT:
      {
        DecimalConstraint decimalConstraint = (DecimalConstraint)theEObject;
        T result = caseDecimalConstraint(decimalConstraint);
        if (result == null) result = caseConstraint(decimalConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.ENUMERATION_CONSTRAINT:
      {
        EnumerationConstraint enumerationConstraint = (EnumerationConstraint)theEObject;
        T result = caseEnumerationConstraint(enumerationConstraint);
        if (result == null) result = caseConstraint(enumerationConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.NUMBER_CONSTRAINT:
      {
        NumberConstraint numberConstraint = (NumberConstraint)theEObject;
        T result = caseNumberConstraint(numberConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CstDslPackage.ALL_CONSTRAINT:
      {
        AllConstraint allConstraint = (AllConstraint)theEObject;
        T result = caseAllConstraint(allConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Model Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Model Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainModelConstraint(DomainModelConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecification(Specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileSpecification(FileSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Free Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Free Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFreeSpecification(FreeSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElementConstraint(AbstractElementConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageConstraint(PackageConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeConstraint(TypeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeConstraint(DataTypeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityConstraint(EntityConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureConstraint(FeatureConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeConstraint(AttributeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstraint(BoolConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringConstraint(StringConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Time Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Time Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateTimeConstraint(DateTimeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalConstraint(DecimalConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationConstraint(EnumerationConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberConstraint(NumberConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>All Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>All Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllConstraint(AllConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CstDslSwitch
