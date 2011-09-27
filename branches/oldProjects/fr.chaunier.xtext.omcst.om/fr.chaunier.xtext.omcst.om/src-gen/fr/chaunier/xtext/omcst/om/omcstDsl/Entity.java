/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getAnno <em>Anno</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.chaunier.xtext.omcst.om.omcstDsl.EntityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' attribute.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.EntityType
   * @see #setEntityType(EntityType)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity_EntityType()
   * @model
   * @generated
   */
  EntityType getEntityType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getEntityType <em>Entity Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' attribute.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.EntityType
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity_SuperType()
   * @model
   * @generated
   */
  Entity getSuperType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Entity value);

  /**
   * Returns the value of the '<em><b>Anno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anno</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anno</em>' containment reference.
   * @see #setAnno(Annotations)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity_Anno()
   * @model containment="true"
   * @generated
   */
  Annotations getAnno();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getAnno <em>Anno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anno</em>' containment reference.
   * @see #getAnno()
   * @generated
   */
  void setAnno(Annotations value);

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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.Entity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.omcst.om.omcstDsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
