/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.archi.adslDsl.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.archi.adslDsl.AdslDslPackage
 * @generated
 */
public class AdslDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AdslDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdslDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AdslDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdslDslSwitch<Adapter> modelSwitch =
    new AdslDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseArchiModel(ArchiModel object)
      {
        return createArchiModelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseSystem(fr.chaunier.xtext.archi.adslDsl.System object)
      {
        return createSystemAdapter();
      }
      @Override
      public Adapter caseUsing(Using object)
      {
        return createUsingAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseProvidedPort(ProvidedPort object)
      {
        return createProvidedPortAdapter();
      }
      @Override
      public Adapter caseRequiredPort(RequiredPort object)
      {
        return createRequiredPortAdapter();
      }
      @Override
      public Adapter caseInterface(Interface object)
      {
        return createInterfaceAdapter();
      }
      @Override
      public Adapter caseMessageInteraction(MessageInteraction object)
      {
        return createMessageInteractionAdapter();
      }
      @Override
      public Adapter caseOnewayInteraction(OnewayInteraction object)
      {
        return createOnewayInteractionAdapter();
      }
      @Override
      public Adapter caseRequestReplyInteraction(RequestReplyInteraction object)
      {
        return createRequestReplyInteractionAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseMessageParameter(MessageParameter object)
      {
        return createMessageParameterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.ArchiModel <em>Archi Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.ArchiModel
   * @generated
   */
  public Adapter createArchiModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.System
   * @generated
   */
  public Adapter createSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Using
   * @generated
   */
  public Adapter createUsingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.ProvidedPort
   * @generated
   */
  public Adapter createProvidedPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.RequiredPort
   * @generated
   */
  public Adapter createRequiredPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Interface
   * @generated
   */
  public Adapter createInterfaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.MessageInteraction <em>Message Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageInteraction
   * @generated
   */
  public Adapter createMessageInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.OnewayInteraction <em>Oneway Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.OnewayInteraction
   * @generated
   */
  public Adapter createOnewayInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction <em>Request Reply Interaction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.RequestReplyInteraction
   * @generated
   */
  public Adapter createRequestReplyInteractionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.chaunier.xtext.archi.adslDsl.MessageParameter <em>Message Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.chaunier.xtext.archi.adslDsl.MessageParameter
   * @generated
   */
  public Adapter createMessageParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AdslDslAdapterFactory
