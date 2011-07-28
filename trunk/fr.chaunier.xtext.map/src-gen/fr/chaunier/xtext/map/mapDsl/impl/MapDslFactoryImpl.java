/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl.impl;

import fr.chaunier.xtext.map.mapDsl.*;

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
      MapDslFactory theMapDslFactory = (MapDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/map/MapDsl"); 
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
      case MapDslPackage.IMPORT: return createImport();
      case MapDslPackage.ROOT_MODULE: return createRootModule();
      case MapDslPackage.RULE: return createRule();
      case MapDslPackage.FUCTION: return createFuction();
      case MapDslPackage.FUCTION_IN: return createFuctionIn();
      case MapDslPackage.FUCTION_OUT: return createFuctionOut();
      case MapDslPackage.MAPPING_MODULE: return createMappingModule();
      case MapDslPackage.FEATURE_MAP: return createFeatureMap();
      case MapDslPackage.EXPRESSION: return createExpression();
      case MapDslPackage.NESTED_IN_TRANSFORMATION_PARAMETER: return createNestedInTransformationParameter();
      case MapDslPackage.NESTED_OUT_TRANSFORMATION_PARAMETER: return createNestedOutTransformationParameter();
      case MapDslPackage.NESTED_TRANSFORMATION_PARAMETER: return createNestedTransformationParameter();
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
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fuction createFuction()
  {
    FuctionImpl fuction = new FuctionImpl();
    return fuction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuctionIn createFuctionIn()
  {
    FuctionInImpl fuctionIn = new FuctionInImpl();
    return fuctionIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuctionOut createFuctionOut()
  {
    FuctionOutImpl fuctionOut = new FuctionOutImpl();
    return fuctionOut;
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
  public NestedInTransformationParameter createNestedInTransformationParameter()
  {
    NestedInTransformationParameterImpl nestedInTransformationParameter = new NestedInTransformationParameterImpl();
    return nestedInTransformationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedOutTransformationParameter createNestedOutTransformationParameter()
  {
    NestedOutTransformationParameterImpl nestedOutTransformationParameter = new NestedOutTransformationParameterImpl();
    return nestedOutTransformationParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedTransformationParameter createNestedTransformationParameter()
  {
    NestedTransformationParameterImpl nestedTransformationParameter = new NestedTransformationParameterImpl();
    return nestedTransformationParameter;
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
