/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.instance.om.instanceDsl.impl;

import fr.chaunier.xtext.instance.om.instanceDsl.*;

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
public class InstanceDslFactoryImpl extends EFactoryImpl implements InstanceDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static InstanceDslFactory init()
  {
    try
    {
      InstanceDslFactory theInstanceDslFactory = (InstanceDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.chaunier.fr/xtext/instance/om/InstanceDsl"); 
      if (theInstanceDslFactory != null)
      {
        return theInstanceDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new InstanceDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceDslFactoryImpl()
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
      case InstanceDslPackage.FACTORY: return createFactory();
      case InstanceDslPackage.IMPORT: return createImport();
      case InstanceDslPackage.FEATURE: return createFeature();
      case InstanceDslPackage.NEW_OBJECT: return createNewObject();
      case InstanceDslPackage.VALUE: return createValue();
      case InstanceDslPackage.REFERENCE: return createReference();
      case InstanceDslPackage.CONTAINMENT: return createContainment();
      case InstanceDslPackage.ENUM_ATTRIBUTE: return createEnumAttribute();
      case InstanceDslPackage.TERMINAL_EXPRESSION: return createTerminalExpression();
      case InstanceDslPackage.THIS: return createThis();
      case InstanceDslPackage.NEW: return createNew();
      case InstanceDslPackage.INTERO: return createIntero();
      case InstanceDslPackage.STRINGA: return createStringa();
      case InstanceDslPackage.NULLO: return createNullo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factory createFactory()
  {
    FactoryImpl factory = new FactoryImpl();
    return factory;
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
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewObject createNewObject()
  {
    NewObjectImpl newObject = new NewObjectImpl();
    return newObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Containment createContainment()
  {
    ContainmentImpl containment = new ContainmentImpl();
    return containment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumAttribute createEnumAttribute()
  {
    EnumAttributeImpl enumAttribute = new EnumAttributeImpl();
    return enumAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalExpression createTerminalExpression()
  {
    TerminalExpressionImpl terminalExpression = new TerminalExpressionImpl();
    return terminalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public This createThis()
  {
    ThisImpl this_ = new ThisImpl();
    return this_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public New createNew()
  {
    NewImpl new_ = new NewImpl();
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intero createIntero()
  {
    InteroImpl intero = new InteroImpl();
    return intero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stringa createStringa()
  {
    StringaImpl stringa = new StringaImpl();
    return stringa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nullo createNullo()
  {
    NulloImpl nullo = new NulloImpl();
    return nullo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceDslPackage getInstanceDslPackage()
  {
    return (InstanceDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static InstanceDslPackage getPackage()
  {
    return InstanceDslPackage.eINSTANCE;
  }

} //InstanceDslFactoryImpl
