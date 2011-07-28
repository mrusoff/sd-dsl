/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntitySource <em>Entity Source</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntityTarget <em>Entity Target</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getMappedFeatures <em>Mapped Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule()
 * @model
 * @generated
 */
public interface MappingModule extends EObject
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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entity Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Source</em>' reference.
   * @see #setEntitySource(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule_EntitySource()
   * @model
   * @generated
   */
  Entity getEntitySource();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntitySource <em>Entity Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Source</em>' reference.
   * @see #getEntitySource()
   * @generated
   */
  void setEntitySource(Entity value);

  /**
   * Returns the value of the '<em><b>Entity Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Target</em>' reference.
   * @see #setEntityTarget(Entity)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule_EntityTarget()
   * @model
   * @generated
   */
  Entity getEntityTarget();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getEntityTarget <em>Entity Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Target</em>' reference.
   * @see #getEntityTarget()
   * @generated
   */
  void setEntityTarget(Entity value);

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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.MappingModule#getDocumentation <em>Documentation</em>}' attribute.
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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getMappingModule_MappedFeatures()
   * @model containment="true"
   * @generated
   */
  EList<FeatureMap> getMappedFeatures();

} // MappingModule
