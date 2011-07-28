/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.Entity#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.chaunier.xtext.bom.bomDsl.EntityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' attribute.
   * @see fr.chaunier.xtext.bom.bomDsl.EntityType
   * @see #setEntityType(EntityType)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEntity_EntityType()
   * @model
   * @generated
   */
  EntityType getEntityType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getEntityType <em>Entity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' attribute.
   * @see fr.chaunier.xtext.bom.bomDsl.EntityType
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(EntityType value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Entity)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEntity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.bom.bomDsl.Entity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.bom.bomDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
