/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage
 * @generated
 */
public interface MapDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapDslFactory eINSTANCE = fr.chaunier.xtext.map.mapDsl.impl.MapDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Root Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root Module</em>'.
   * @generated
   */
  RootModule createRootModule();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Fuction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuction</em>'.
   * @generated
   */
  Fuction createFuction();

  /**
   * Returns a new object of class '<em>Fuction In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuction In</em>'.
   * @generated
   */
  FuctionIn createFuctionIn();

  /**
   * Returns a new object of class '<em>Fuction Out</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fuction Out</em>'.
   * @generated
   */
  FuctionOut createFuctionOut();

  /**
   * Returns a new object of class '<em>Mapping Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Module</em>'.
   * @generated
   */
  MappingModule createMappingModule();

  /**
   * Returns a new object of class '<em>Feature Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Map</em>'.
   * @generated
   */
  FeatureMap createFeatureMap();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Nested In Transformation Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested In Transformation Parameter</em>'.
   * @generated
   */
  NestedInTransformationParameter createNestedInTransformationParameter();

  /**
   * Returns a new object of class '<em>Nested Out Transformation Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Out Transformation Parameter</em>'.
   * @generated
   */
  NestedOutTransformationParameter createNestedOutTransformationParameter();

  /**
   * Returns a new object of class '<em>Nested Transformation Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Transformation Parameter</em>'.
   * @generated
   */
  NestedTransformationParameter createNestedTransformationParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MapDslPackage getMapDslPackage();

} //MapDslFactory
