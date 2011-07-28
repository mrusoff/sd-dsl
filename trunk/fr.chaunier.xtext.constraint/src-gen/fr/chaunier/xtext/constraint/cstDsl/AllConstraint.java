/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMinLen <em>Min Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getPaddle <em>Paddle</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsId <em>Is Id</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isNullable <em>Nullable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isDerived <em>Derived</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isWritable <em>Writable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsXSDAtt <em>Is XSD Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint()
 * @model
 * @generated
 */
public interface AllConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Has Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Has Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Default</em>' attribute.
   * @see #setHasDefault(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isHasDefault <em>Has Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Default</em>' attribute.
   * @see #isHasDefault()
   * @generated
   */
  void setHasDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' attribute.
   * @see #setDefaultValue(String)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getDefaultValue <em>Default Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' attribute.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(String value);

  /**
   * Returns the value of the '<em><b>Is Fixed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Fixed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Fixed</em>' attribute.
   * @see #setIsFixed(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_IsFixed()
   * @model
   * @generated
   */
  boolean isIsFixed();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsFixed <em>Is Fixed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Fixed</em>' attribute.
   * @see #isIsFixed()
   * @generated
   */
  void setIsFixed(boolean value);

  /**
   * Returns the value of the '<em><b>Fixed Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed Value</em>' attribute.
   * @see #setFixedValue(String)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

  /**
   * Returns the value of the '<em><b>Min Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Len</em>' attribute.
   * @see #setMinLen(int)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_MinLen()
   * @model
   * @generated
   */
  int getMinLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMinLen <em>Min Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Len</em>' attribute.
   * @see #getMinLen()
   * @generated
   */
  void setMinLen(int value);

  /**
   * Returns the value of the '<em><b>Max Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Len</em>' attribute.
   * @see #setMaxLen(int)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_MaxLen()
   * @model
   * @generated
   */
  int getMaxLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getMaxLen <em>Max Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Len</em>' attribute.
   * @see #getMaxLen()
   * @generated
   */
  void setMaxLen(int value);

  /**
   * Returns the value of the '<em><b>Fixe Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixe Len</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixe Len</em>' attribute.
   * @see #setFixeLen(int)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_FixeLen()
   * @model
   * @generated
   */
  int getFixeLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getFixeLen <em>Fixe Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixe Len</em>' attribute.
   * @see #getFixeLen()
   * @generated
   */
  void setFixeLen(int value);

  /**
   * Returns the value of the '<em><b>Paddle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paddle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paddle</em>' attribute.
   * @see #setPaddle(String)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_Paddle()
   * @model
   * @generated
   */
  String getPaddle();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#getPaddle <em>Paddle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paddle</em>' attribute.
   * @see #getPaddle()
   * @generated
   */
  void setPaddle(String value);

  /**
   * Returns the value of the '<em><b>Is Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Id</em>' attribute.
   * @see #setIsId(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_IsId()
   * @model
   * @generated
   */
  boolean isIsId();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsId <em>Is Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Id</em>' attribute.
   * @see #isIsId()
   * @generated
   */
  void setIsId(boolean value);

  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

  /**
   * Returns the value of the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Derived</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Derived</em>' attribute.
   * @see #setDerived(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_Derived()
   * @model
   * @generated
   */
  boolean isDerived();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isDerived <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Derived</em>' attribute.
   * @see #isDerived()
   * @generated
   */
  void setDerived(boolean value);

  /**
   * Returns the value of the '<em><b>Writable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writable</em>' attribute.
   * @see #setWritable(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_Writable()
   * @model
   * @generated
   */
  boolean isWritable();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isWritable <em>Writable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Writable</em>' attribute.
   * @see #isWritable()
   * @generated
   */
  void setWritable(boolean value);

  /**
   * Returns the value of the '<em><b>Is XSD Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is XSD Att</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is XSD Att</em>' attribute.
   * @see #setIsXSDAtt(boolean)
   * @see fr.chaunier.xtext.constraint.cstDsl.CstDslPackage#getAllConstraint_IsXSDAtt()
   * @model
   * @generated
   */
  boolean isIsXSDAtt();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.constraint.cstDsl.AllConstraint#isIsXSDAtt <em>Is XSD Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is XSD Att</em>' attribute.
   * @see #isIsXSDAtt()
   * @generated
   */
  void setIsXSDAtt(boolean value);

} // AllConstraint
