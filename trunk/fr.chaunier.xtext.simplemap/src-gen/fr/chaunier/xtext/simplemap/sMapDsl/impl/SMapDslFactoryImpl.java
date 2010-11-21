/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.simplemap.sMapDsl.impl;

import fr.chaunier.xtext.simplemap.sMapDsl.*;

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
public class SMapDslFactoryImpl extends EFactoryImpl implements SMapDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SMapDslFactory init()
  {
    try
    {
      SMapDslFactory theSMapDslFactory = (SMapDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/simplemap/SMapDsl"); 
      if (theSMapDslFactory != null)
      {
        return theSMapDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SMapDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMapDslFactoryImpl()
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
      case SMapDslPackage.MODEL: return createModel();
      case SMapDslPackage.ROOT_MODULE: return createRootModule();
      case SMapDslPackage.MAPPING_MODULE: return createMappingModule();
      case SMapDslPackage.FEATURE_MAP: return createFeatureMap();
      case SMapDslPackage.EXPRESSION: return createExpression();
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
  public SMapDslPackage getSMapDslPackage()
  {
    return (SMapDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SMapDslPackage getPackage()
  {
    return SMapDslPackage.eINSTANCE;
  }

} //SMapDslFactoryImpl
