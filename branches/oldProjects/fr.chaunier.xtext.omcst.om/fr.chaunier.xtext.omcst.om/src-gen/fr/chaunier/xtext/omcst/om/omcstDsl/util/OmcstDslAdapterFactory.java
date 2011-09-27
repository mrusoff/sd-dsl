/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl.util;

import fr.chaunier.xtext.omcst.om.omcstDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage
 * @generated
 */
public class OmcstDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OmcstDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OmcstDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OmcstDslPackage.eINSTANCE;
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
  protected OmcstDslSwitch<Adapter> modelSwitch =
    new OmcstDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseXsdElement(XsdElement object)
      {
        return createXsdElementAdapter();
      }
      @Override
      public Adapter casePackageDeclaration(PackageDeclaration object)
      {
        return createPackageDeclarationAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseDataType(DataType object)
      {
        return createDataTypeAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseStructuralFeature(StructuralFeature object)
      {
        return createStructuralFeatureAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteral(EnumerationLiteral object)
      {
        return createEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseTypedElement(TypedElement object)
      {
        return createTypedElementAdapter();
      }
      @Override
      public Adapter caseTypeRef(TypeRef object)
      {
        return createTypeRefAdapter();
      }
      @Override
      public Adapter caseAnnotations(Annotations object)
      {
        return createAnnotationsAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement <em>Xsd Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.XsdElement
   * @generated
   */
  public Adapter createXsdElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.PackageDeclaration
   * @generated
   */
  public Adapter createPackageDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.DataType
   * @generated
   */
  public Adapter createDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature <em>Structural Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.StructuralFeature
   * @generated
   */
  public Adapter createStructuralFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationLiteral
   * @generated
   */
  public Adapter createEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.TypedElement
   * @generated
   */
  public Adapter createTypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.TypeRef
   * @generated
   */
  public Adapter createTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Annotations
   * @generated
   */
  public Adapter createAnnotationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.BoolConstraint <em>Bool Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.BoolConstraint
   * @generated
   */
  public Adapter createBoolConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.StringConstraint <em>String Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.StringConstraint
   * @generated
   */
  public Adapter createStringConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.DateTimeConstraint <em>Date Time Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.DateTimeConstraint
   * @generated
   */
  public Adapter createDateTimeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.DecimalConstraint <em>Decimal Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.DecimalConstraint
   * @generated
   */
  public Adapter createDecimalConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationConstraint <em>Enumeration Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.EnumerationConstraint
   * @generated
   */
  public Adapter createEnumerationConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint <em>Number Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint
   * @generated
   */
  public Adapter createNumberConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.omcst.om.omcstDsl.AllConstraint <em>All Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.AllConstraint
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

} //OmcstDslAdapterFactory
