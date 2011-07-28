/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.omcst.om.omcstDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isHasDefault <em>Has Default</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsFixed <em>Is Fixed</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getFixedValue <em>Fixed Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMinLen <em>Min Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMaxLen <em>Max Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getFixeLen <em>Fixe Len</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getPaddle <em>Paddle</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsId <em>Is Id</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isNullable <em>Nullable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isDerived <em>Derived</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isWritable <em>Writable</em>}</li>
 *   <li>{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsXSDAtt <em>Is XSD Att</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint()
 * @model
 * @generated
 */
public interface NumberConstraint extends EObject
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_HasDefault()
   * @model
   * @generated
   */
  boolean isHasDefault();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isHasDefault <em>Has Default</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_DefaultValue()
   * @model
   * @generated
   */
  String getDefaultValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getDefaultValue <em>Default Value</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_IsFixed()
   * @model
   * @generated
   */
  boolean isIsFixed();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsFixed <em>Is Fixed</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_FixedValue()
   * @model
   * @generated
   */
  String getFixedValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getFixedValue <em>Fixed Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Value</em>' attribute.
   * @see #getFixedValue()
   * @generated
   */
  void setFixedValue(String value);

  /**
   * Returns the value of the '<em><b>Min Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Value</em>' attribute.
   * @see #setMinValue(int)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_MinValue()
   * @model
   * @generated
   */
  int getMinValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMinValue <em>Min Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Value</em>' attribute.
   * @see #getMinValue()
   * @generated
   */
  void setMinValue(int value);

  /**
   * Returns the value of the '<em><b>Max Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Value</em>' attribute.
   * @see #setMaxValue(int)
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_MaxValue()
   * @model
   * @generated
   */
  int getMaxValue();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMaxValue <em>Max Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Value</em>' attribute.
   * @see #getMaxValue()
   * @generated
   */
  void setMaxValue(int value);

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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_MinLen()
   * @model
   * @generated
   */
  int getMinLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMinLen <em>Min Len</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_MaxLen()
   * @model
   * @generated
   */
  int getMaxLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getMaxLen <em>Max Len</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_FixeLen()
   * @model
   * @generated
   */
  int getFixeLen();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getFixeLen <em>Fixe Len</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_Paddle()
   * @model
   * @generated
   */
  String getPaddle();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#getPaddle <em>Paddle</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_IsId()
   * @model
   * @generated
   */
  boolean isIsId();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsId <em>Is Id</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isNullable <em>Nullable</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_Derived()
   * @model
   * @generated
   */
  boolean isDerived();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isDerived <em>Derived</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_Writable()
   * @model
   * @generated
   */
  boolean isWritable();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isWritable <em>Writable</em>}' attribute.
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
   * @see fr.chaunier.xtext.omcst.om.omcstDsl.OmcstDslPackage#getNumberConstraint_IsXSDAtt()
   * @model
   * @generated
   */
  boolean isIsXSDAtt();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.omcst.om.omcstDsl.NumberConstraint#isIsXSDAtt <em>Is XSD Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is XSD Att</em>' attribute.
   * @see #isIsXSDAtt()
   * @generated
   */
  void setIsXSDAtt(boolean value);

} // NumberConstraint
