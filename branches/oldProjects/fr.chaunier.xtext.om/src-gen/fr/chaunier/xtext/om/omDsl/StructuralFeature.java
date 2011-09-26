/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getStructuralFeature()
 * @model
 * @generated
 */
public interface StructuralFeature extends Feature
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.om.omDsl.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getStructuralFeature_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getStructuralFeature_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getStructuralFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeRef)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getStructuralFeature_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.StructuralFeature#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

} // StructuralFeature
