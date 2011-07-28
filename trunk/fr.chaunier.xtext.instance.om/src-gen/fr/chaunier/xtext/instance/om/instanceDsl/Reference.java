/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.Reference#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(EObject)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getReference_Value()
   * @model
   * @generated
   */
  EObject getValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.Reference#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EObject value);

} // Reference
