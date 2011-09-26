/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.om.omDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.DataType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link fr.chaunier.xtext.om.omDsl.DataType#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends Type
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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getDataType_Annotations()
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
   * @see fr.chaunier.xtext.om.omDsl.OmDslPackage#getDataType_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.om.omDsl.DataType#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // DataType
