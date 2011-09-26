/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage
 * @generated
 */
public interface AdslDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdslDslFactory eINSTANCE = fr.chaunier.xtext.archi.adslDsl.impl.AdslDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Archi Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Archi Model</em>'.
   * @generated
   */
  ArchiModel createArchiModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System</em>'.
   * @generated
   */
  System createSystem();

  /**
   * Returns a new object of class '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using</em>'.
   * @generated
   */
  Using createUsing();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provided Port</em>'.
   * @generated
   */
  ProvidedPort createProvidedPort();

  /**
   * Returns a new object of class '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Required Port</em>'.
   * @generated
   */
  RequiredPort createRequiredPort();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  Interface createInterface();

  /**
   * Returns a new object of class '<em>Message Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Interaction</em>'.
   * @generated
   */
  MessageInteraction createMessageInteraction();

  /**
   * Returns a new object of class '<em>Oneway Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Oneway Interaction</em>'.
   * @generated
   */
  OnewayInteraction createOnewayInteraction();

  /**
   * Returns a new object of class '<em>Request Reply Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Request Reply Interaction</em>'.
   * @generated
   */
  RequestReplyInteraction createRequestReplyInteraction();

  /**
   * Returns a new object of class '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message</em>'.
   * @generated
   */
  Message createMessage();

  /**
   * Returns a new object of class '<em>Message Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Message Parameter</em>'.
   * @generated
   */
  MessageParameter createMessageParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdslDslPackage getAdslDslPackage();

} //AdslDslFactory
