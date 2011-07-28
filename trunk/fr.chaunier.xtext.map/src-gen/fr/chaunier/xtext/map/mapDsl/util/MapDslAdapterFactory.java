/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.util;

import fr.chaunier.xtext.map.mapDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage
 * @generated
 */
public class MapDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MapDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MapDslPackage.eINSTANCE;
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
  protected MapDslSwitch<Adapter> modelSwitch =
    new MapDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseRootModule(RootModule object)
      {
        return createRootModuleAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseFuction(Fuction object)
      {
        return createFuctionAdapter();
      }
      @Override
      public Adapter caseFuctionIn(FuctionIn object)
      {
        return createFuctionInAdapter();
      }
      @Override
      public Adapter caseFuctionOut(FuctionOut object)
      {
        return createFuctionOutAdapter();
      }
      @Override
      public Adapter caseMappingModule(MappingModule object)
      {
        return createMappingModuleAdapter();
      }
      @Override
      public Adapter caseFeatureMap(FeatureMap object)
      {
        return createFeatureMapAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseNestedInTransformationParameter(NestedInTransformationParameter object)
      {
        return createNestedInTransformationParameterAdapter();
      }
      @Override
      public Adapter caseNestedOutTransformationParameter(NestedOutTransformationParameter object)
      {
        return createNestedOutTransformationParameterAdapter();
      }
      @Override
      public Adapter caseNestedTransformationParameter(NestedTransformationParameter object)
      {
        return createNestedTransformationParameterAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.RootModule <em>Root Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.RootModule
   * @generated
   */
  public Adapter createRootModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.Fuction <em>Fuction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.Fuction
   * @generated
   */
  public Adapter createFuctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.FuctionIn <em>Fuction In</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionIn
   * @generated
   */
  public Adapter createFuctionInAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.FuctionOut <em>Fuction Out</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.FuctionOut
   * @generated
   */
  public Adapter createFuctionOutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.MappingModule <em>Mapping Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.MappingModule
   * @generated
   */
  public Adapter createMappingModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap <em>Feature Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.FeatureMap
   * @generated
   */
  public Adapter createFeatureMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter <em>Nested In Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.NestedInTransformationParameter
   * @generated
   */
  public Adapter createNestedInTransformationParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter <em>Nested Out Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.NestedOutTransformationParameter
   * @generated
   */
  public Adapter createNestedOutTransformationParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter <em>Nested Transformation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.map.mapDsl.NestedTransformationParameter
   * @generated
   */
  public Adapter createNestedTransformationParameterAdapter()
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

} //MapDslAdapterFactory
