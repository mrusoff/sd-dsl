/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.util;

import fr.chaunier.xtext.constraint.cstDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage
 * @generated
 */
public class CstDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CstDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CstDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CstDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CstDslSwitch<Adapter> modelSwitch =
    new CstDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModelConstraint(DomainModelConstraint object)
      {
        return createDomainModelConstraintAdapter();
      }
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseFileSpecification(FileSpecification object)
      {
        return createFileSpecificationAdapter();
      }
      @Override
      public Adapter caseFreeSpecification(FreeSpecification object)
      {
        return createFreeSpecificationAdapter();
      }
      @Override
      public Adapter caseAbstractElementConstraint(AbstractElementConstraint object)
      {
        return createAbstractElementConstraintAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePackageConstraint(PackageConstraint object)
      {
        return createPackageConstraintAdapter();
      }
      @Override
      public Adapter caseTypeConstraint(TypeConstraint object)
      {
        return createTypeConstraintAdapter();
      }
      @Override
      public Adapter caseDataTypeConstraint(DataTypeConstraint object)
      {
        return createDataTypeConstraintAdapter();
      }
      @Override
      public Adapter caseEntityConstraint(EntityConstraint object)
      {
        return createEntityConstraintAdapter();
      }
      @Override
      public Adapter caseFeatureConstraint(FeatureConstraint object)
      {
        return createFeatureConstraintAdapter();
      }
      @Override
      public Adapter caseAttributeConstraint(AttributeConstraint object)
      {
        return createAttributeConstraintAdapter();
      }
      @Override
      public Adapter caseConstraint(Constraint object)
      {
        return createConstraintAdapter();
      }
      @Override
      public Adapter caseBoolConstraint(BoolConstraint object)
      {
        return createBoolConstraintAdapter();
      }
      @Override
      public Adapter caseStringConstraint(StringConstraint object)
      {
        return createStringConstraintAdapter();
      }
      @Override
      public Adapter caseDateTimeConstraint(DateTimeConstraint object)
      {
        return createDateTimeConstraintAdapter();
      }
      @Override
      public Adapter caseDecimalConstraint(DecimalConstraint object)
      {
        return createDecimalConstraintAdapter();
      }
      @Override
      public Adapter caseEnumerationConstraint(EnumerationConstraint object)
      {
        return createEnumerationConstraintAdapter();
      }
      @Override
      public Adapter caseNumberConstraint(NumberConstraint object)
      {
        return createNumberConstraintAdapter();
      }
      @Override
      public Adapter caseAllConstraint(AllConstraint object)
      {
        return createAllConstraintAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint <em>Domain Model Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.DomainModelConstraint
   * @generated
   */
  public Adapter createDomainModelConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.FileSpecification <em>File Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.FileSpecification
   * @generated
   */
  public Adapter createFileSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.FreeSpecification <em>Free Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.FreeSpecification
   * @generated
   */
  public Adapter createFreeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint <em>Abstract Element Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.AbstractElementConstraint
   * @generated
   */
  public Adapter createAbstractElementConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.PackageConstraint <em>Package Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.PackageConstraint
   * @generated
   */
  public Adapter createPackageConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.TypeConstraint <em>Type Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.TypeConstraint
   * @generated
   */
  public Adapter createTypeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint <em>Data Type Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint
   * @generated
   */
  public Adapter createDataTypeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.EntityConstraint <em>Entity Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.EntityConstraint
   * @generated
   */
  public Adapter createEntityConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint <em>Feature Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.FeatureConstraint
   * @generated
   */
  public Adapter createFeatureConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint <em>Attribute Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint
   * @generated
   */
  public Adapter createAttributeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.BoolConstraint <em>Bool Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.BoolConstraint
   * @generated
   */
  public Adapter createBoolConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.StringConstraint <em>String Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.StringConstraint
   * @generated
   */
  public Adapter createStringConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint <em>Date Time Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.DateTimeConstraint
   * @generated
   */
  public Adapter createDateTimeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint <em>Decimal Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.DecimalConstraint
   * @generated
   */
  public Adapter createDecimalConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint <em>Enumeration Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint
   * @generated
   */
  public Adapter createEnumerationConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.NumberConstraint <em>Number Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.NumberConstraint
   * @generated
   */
  public Adapter createNumberConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint <em>All Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.constraint.cstDsl.AllConstraint
   * @generated
   */
  public Adapter createAllConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CstDslAdapterFactory
