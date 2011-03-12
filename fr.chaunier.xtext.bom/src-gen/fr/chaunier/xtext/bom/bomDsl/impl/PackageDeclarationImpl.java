/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl.impl;

import fr.chaunier.xtext.bom.bomDsl.AbstractElement;
import fr.chaunier.xtext.bom.bomDsl.BomDslPackage;
import fr.chaunier.xtext.bom.bomDsl.PackageDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link fr.chaunier.xtext.bom.bomDsl.impl.PackageDeclarationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageDeclarationImpl extends AbstractElementImpl implements PackageDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected static final String PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected String prefix = PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected static final String DELIMITER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected String delimiter = DELIMITER_EDEFAULT;

  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList<String> lines;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BomDslPackage.Literals.PACKAGE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.PACKAGE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(String newPrefix)
  {
    String oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.PACKAGE_DECLARATION__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.PACKAGE_DECLARATION__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.PACKAGE_DECLARATION__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(String newDelimiter)
  {
    String oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BomDslPackage.PACKAGE_DECLARATION__DELIMITER, oldDelimiter, delimiter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLines()
  {
    if (lines == null)
    {
      lines = new EDataTypeEList<String>(String.class, this, BomDslPackage.PACKAGE_DECLARATION__LINES);
    }
    return lines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, BomDslPackage.PACKAGE_DECLARATION__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BomDslPackage.PACKAGE_DECLARATION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BomDslPackage.PACKAGE_DECLARATION__NAME:
        return getName();
      case BomDslPackage.PACKAGE_DECLARATION__PREFIX:
        return getPrefix();
      case BomDslPackage.PACKAGE_DECLARATION__NAMESPACE:
        return getNamespace();
      case BomDslPackage.PACKAGE_DECLARATION__FORMAT:
        return getFormat();
      case BomDslPackage.PACKAGE_DECLARATION__DELIMITER:
        return getDelimiter();
      case BomDslPackage.PACKAGE_DECLARATION__LINES:
        return getLines();
      case BomDslPackage.PACKAGE_DECLARATION__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BomDslPackage.PACKAGE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__PREFIX:
        setPrefix((String)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__FORMAT:
        setFormat((String)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__DELIMITER:
        setDelimiter((String)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends String>)newValue);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BomDslPackage.PACKAGE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__PREFIX:
        setPrefix(PREFIX_EDEFAULT);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
        return;
      case BomDslPackage.PACKAGE_DECLARATION__LINES:
        getLines().clear();
        return;
      case BomDslPackage.PACKAGE_DECLARATION__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BomDslPackage.PACKAGE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BomDslPackage.PACKAGE_DECLARATION__PREFIX:
        return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
      case BomDslPackage.PACKAGE_DECLARATION__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case BomDslPackage.PACKAGE_DECLARATION__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case BomDslPackage.PACKAGE_DECLARATION__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
      case BomDslPackage.PACKAGE_DECLARATION__LINES:
        return lines != null && !lines.isEmpty();
      case BomDslPackage.PACKAGE_DECLARATION__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", prefix: ");
    result.append(prefix);
    result.append(", namespace: ");
    result.append(namespace);
    result.append(", format: ");
    result.append(format);
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(", lines: ");
    result.append(lines);
    result.append(')');
    return result.toString();
  }

} //PackageDeclarationImpl
