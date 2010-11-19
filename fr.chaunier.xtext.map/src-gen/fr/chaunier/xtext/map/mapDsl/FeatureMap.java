/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.map.mapDsl;

import fr.chaunier.xtext.bom.bomDsl.Attribute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getLeftField <em>Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRightField <em>Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValLeft <em>Val Left</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValRight <em>Val Right</em>}</li>
 *   <li>{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap()
 * @model
 * @generated
 */
public interface FeatureMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Field</em>' reference.
   * @see #setLeftField(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_LeftField()
   * @model
   * @generated
   */
  Attribute getLeftField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getLeftField <em>Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Field</em>' reference.
   * @see #getLeftField()
   * @generated
   */
  void setLeftField(Attribute value);

  /**
   * Returns the value of the '<em><b>Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Field</em>' reference.
   * @see #setRightField(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_RightField()
   * @model
   * @generated
   */
  Attribute getRightField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRightField <em>Right Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Field</em>' reference.
   * @see #getRightField()
   * @generated
   */
  void setRightField(Attribute value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' attribute.
   * @see #setRule(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_Rule()
   * @model
   * @generated
   */
  String getRule();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getRule <em>Rule</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' attribute.
   * @see #getRule()
   * @generated
   */
  void setRule(String value);

  /**
   * Returns the value of the '<em><b>Set Left Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Left Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Left Field</em>' reference.
   * @see #setSetLeftField(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_SetLeftField()
   * @model
   * @generated
   */
  Attribute getSetLeftField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetLeftField <em>Set Left Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Left Field</em>' reference.
   * @see #getSetLeftField()
   * @generated
   */
  void setSetLeftField(Attribute value);

  /**
   * Returns the value of the '<em><b>Val Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Left</em>' attribute.
   * @see #setValLeft(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_ValLeft()
   * @model
   * @generated
   */
  String getValLeft();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValLeft <em>Val Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Left</em>' attribute.
   * @see #getValLeft()
   * @generated
   */
  void setValLeft(String value);

  /**
   * Returns the value of the '<em><b>Set Right Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Right Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Right Field</em>' reference.
   * @see #setSetRightField(Attribute)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_SetRightField()
   * @model
   * @generated
   */
  Attribute getSetRightField();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getSetRightField <em>Set Right Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Right Field</em>' reference.
   * @see #getSetRightField()
   * @generated
   */
  void setSetRightField(Attribute value);

  /**
   * Returns the value of the '<em><b>Val Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Right</em>' attribute.
   * @see #setValRight(String)
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_ValRight()
   * @model
   * @generated
   */
  String getValRight();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getValRight <em>Val Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Right</em>' attribute.
   * @see #getValRight()
   * @generated
   */
  void setValRight(String value);

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
   * @see fr.chaunier.xtext.map.mapDsl.MapDslPackage#getFeatureMap_Documentation()
   * @model
   * @generated
   */
  String getDocumentation();

  /**
   * Sets the value of the '{@link fr.chaunier.xtext.map.mapDsl.FeatureMap#getDocumentation <em>Documentation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Documentation</em>' attribute.
   * @see #getDocumentation()
   * @generated
   */
  void setDocumentation(String value);

} // FeatureMap
