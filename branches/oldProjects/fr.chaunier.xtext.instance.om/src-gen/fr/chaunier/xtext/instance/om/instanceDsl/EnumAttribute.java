/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl;

import fr.chaunier.xtext.om.omDsl.EnumerationLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getEnumAttribute()
 * @model
 * @generated
 */
public interface EnumAttribute extends EObject
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
   * @see #setValue(EnumerationLiteral)
   * @see fr.chaunier.xtext.instance.om.instanceDsl.InstanceDslPackage#getEnumAttribute_Value()
   * @model
   * @generated
   */
  EnumerationLiteral getValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.instance.om.instanceDsl.EnumAttribute#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EnumerationLiteral value);

} // EnumAttribute
