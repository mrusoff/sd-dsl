/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.impl;

import fr.chaunier.xtext.archi.adslDsl.AdslDslFactory;
import fr.chaunier.xtext.archi.adslDsl.AdslDslPackage;
import fr.chaunier.xtext.archi.adslDsl.ArchiModel;
import fr.chaunier.xtext.archi.adslDsl.Component;
import fr.chaunier.xtext.archi.adslDsl.Import;
import fr.chaunier.xtext.archi.adslDsl.Interface;
import fr.chaunier.xtext.archi.adslDsl.Message;
import fr.chaunier.xtext.archi.adslDsl.MessageInteraction;
import fr.chaunier.xtext.archi.adslDsl.MessageParameter;
import fr.chaunier.xtext.archi.adslDsl.OnewayInteraction;
import fr.chaunier.xtext.archi.adslDsl.Port;
import fr.chaunier.xtext.archi.adslDsl.ProvidedPort;
import fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction;
import fr.chaunier.xtext.archi.adslDsl.RequiredPort;
import fr.chaunier.xtext.archi.adslDsl.Using;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdslDslFactoryImpl extends EFactoryImpl implements AdslDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdslDslFactory init()
  {
    try
    {
      AdslDslFactory theAdslDslFactory = (AdslDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/archi/AdslDsl"); 
      if (theAdslDslFactory != null)
      {
        return theAdslDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdslDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdslDslPackage.ARCHI_MODEL: return createArchiModel();
      case AdslDslPackage.IMPORT: return createImport();
      case AdslDslPackage.SYSTEM: return createSystem();
      case AdslDslPackage.USING: return createUsing();
      case AdslDslPackage.COMPONENT: return createComponent();
      case AdslDslPackage.PORT: return createPort();
      case AdslDslPackage.PROVIDED_PORT: return createProvidedPort();
      case AdslDslPackage.REQUIRED_PORT: return createRequiredPort();
      case AdslDslPackage.INTERFACE: return createInterface();
      case AdslDslPackage.MESSAGE_INTERACTION: return createMessageInteraction();
      case AdslDslPackage.ONEWAY_INTERACTION: return createOnewayInteraction();
      case AdslDslPackage.REQUEST_REPLY_INTERACTION: return createRequestReplyInteraction();
      case AdslDslPackage.MESSAGE: return createMessage();
      case AdslDslPackage.MESSAGE_PARAMETER: return createMessageParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchiModel createArchiModel()
  {
    ArchiModelImpl archiModel = new ArchiModelImpl();
    return archiModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.chaunier.xtext.archi.adslDsl.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Using createUsing()
  {
    UsingImpl using = new UsingImpl();
    return using;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedPort createProvidedPort()
  {
    ProvidedPortImpl providedPort = new ProvidedPortImpl();
    return providedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredPort createRequiredPort()
  {
    RequiredPortImpl requiredPort = new RequiredPortImpl();
    return requiredPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageInteraction createMessageInteraction()
  {
    MessageInteractionImpl messageInteraction = new MessageInteractionImpl();
    return messageInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnewayInteraction createOnewayInteraction()
  {
    OnewayInteractionImpl onewayInteraction = new OnewayInteractionImpl();
    return onewayInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestReplyInteraction createRequestReplyInteraction()
  {
    RequestReplyInteractionImpl requestReplyInteraction = new RequestReplyInteractionImpl();
    return requestReplyInteraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageParameter createMessageParameter()
  {
    MessageParameterImpl messageParameter = new MessageParameterImpl();
    return messageParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslDslPackage getAdslDslPackage()
  {
    return (AdslDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdslDslPackage getPackage()
  {
    return AdslDslPackage.eINSTANCE;
  }

} //AdslDslFactoryImpl
