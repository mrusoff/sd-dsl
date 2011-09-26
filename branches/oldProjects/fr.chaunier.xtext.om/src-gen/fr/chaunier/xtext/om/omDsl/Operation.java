/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.Operation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.Operation#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.Operation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link fr.chaunier.xtext.om.omDsl.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see fr.chaunier.xtext.om.omDsl.Visibility
   * @see #setVisibility(Visibility)
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getOperation_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.Operation#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see fr.chaunier.xtext.om.omDsl.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link fr.chaunier.xtext.om.omDsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getOperation_Type()
   * @model containment="true"
   * @generated
   */
  TypeRef getType();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.Operation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeRef value);

} // Operation
