/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.mapdsl.mapDsl.impl;

import fr.chaunier.xtext.mapdsl.mapDsl.*;

import org.eclipse.emf.ecore.EClass;
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
public class MapDslFactoryImpl extends EFactoryImpl implements MapDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MapDslFactory init()
  {
    try
    {
      MapDslFactory theMapDslFactory = (MapDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/mapdsl/MapDsl"); 
      if (theMapDslFactory != null)
      {
        return theMapDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MapDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapDslFactoryImpl()
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
      case MapDslPackage.MODEL: return createModel();
      case MapDslPackage.ROOT_MODULE: return createRootModule();
      case MapDslPackage.MAPPING_MODULE: return createMappingModule();
      case MapDslPackage.FEATURE_MAP: return createFeatureMap();
      case MapDslPackage.EXPRESSION: return createExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RootModule createRootModule()
  {
    RootModuleImpl rootModule = new RootModuleImpl();
    return rootModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingModule createMappingModule()
  {
    MappingModuleImpl mappingModule = new MappingModuleImpl();
    return mappingModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap createFeatureMap()
  {
    FeatureMapImpl featureMap = new FeatureMapImpl();
    return featureMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapDslPackage getMapDslPackage()
  {
    return (MapDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MapDslPackage getPackage()
  {
    return MapDslPackage.eINSTANCE;
  }

} //MapDslFactoryImpl
