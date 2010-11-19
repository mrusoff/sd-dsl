/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.bom.bomDsl.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Mapping#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Mapping#getLeftClass <em>Left Class</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Mapping#getRightClass <em>Right Class</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Mapping#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.Mapping#getMappedFeatures <em>Mapped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Left Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Class</em>' reference.
   * @see #setLeftClass(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping_LeftClass()
   * @model
   * @generated
   */
  Entity getLeftClass();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getLeftClass <em>Left Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Class</em>' reference.
   * @see #getLeftClass()
   * @generated
   */
  void setLeftClass(Entity value);

  /**
   * Returns the value of the '<em><b>Right Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Class</em>' reference.
   * @see #setRightClass(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping_RightClass()
   * @model
   * @generated
   */
  Entity getRightClass();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getRightClass <em>Right Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Class</em>' reference.
   * @see #getRightClass()
   * @generated
   */
  void setRightClass(Entity value);

  /**
   * Returns the value of the '<em><b>Documentation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documentation</em>' attribute.
   * @see #setDocumentation(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.Mapping#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

  /**
   * Returns the value of the '<em><b>Mapped Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.map.mapDsl.FeatureMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped Features</em>' containment reference list.
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMapping_MappedFeatures()
   * @model containment="true"
   * @generated
   */
  EList<FeatureMap> getMappedFeatures();

} // Mapping
