/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.constraint.cstDsl.impl;

import fr.chaunier.xtext.constraint.cstDsl.CstDslPackage;
import fr.chaunier.xtext.constraint.cstDsl.FileSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.chaunier.xtext.constraint.cstDsl.impl.FileSpecificationImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSpecificationImpl extends SpecificationImpl implements FileSpecification
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileSpecificationImpl()
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
    return CstDslPackage.Literals.FILE_SPECIFICATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.FILE_SPECIFICATION__FORMAT, oldFormat, format));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CstDslPackage.FILE_SPECIFICATION__DELIMITER, oldDelimiter, delimiter));
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
      case CstDslPackage.FILE_SPECIFICATION__FORMAT:
        return getFormat();
      case CstDslPackage.FILE_SPECIFICATION__DELIMITER:
        return getDelimiter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CstDslPackage.FILE_SPECIFICATION__FORMAT:
        setFormat((String)newValue);
        return;
      case CstDslPackage.FILE_SPECIFICATION__DELIMITER:
        setDelimiter((String)newValue);
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
      case CstDslPackage.FILE_SPECIFICATION__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case CstDslPackage.FILE_SPECIFICATION__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
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
      case CstDslPackage.FILE_SPECIFICATION__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case CstDslPackage.FILE_SPECIFICATION__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
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
    result.append(" (format: ");
    result.append(format);
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(')');
    return result.toString();
  }

} //FileSpecificationImpl
