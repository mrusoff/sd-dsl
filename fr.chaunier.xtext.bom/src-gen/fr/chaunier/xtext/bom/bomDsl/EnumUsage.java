/**
 * <copyright>
 * </copyright>
 *

 */
package fr.chaunier.xtext.bom.bomDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Usage</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.chaunier.xtext.bom.bomDsl.BomDslPackage#getEnumUsage()
 * @model
 * @generated
 */
public enum EnumUsage implements Enumerator
{
  /**
   * The '<em><b>As String</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AS_STRING_VALUE
   * @generated
   * @ordered
   */
  AS_STRING(0, "asString", "as String"),

  /**
   * The '<em><b>As Boolean</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AS_BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  AS_BOOLEAN(1, "asBoolean", "as bool String"),

  /**
   * The '<em><b>As Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AS_VALUE_VALUE
   * @generated
   * @ordered
   */
  AS_VALUE(2, "asValue", "as Value"),

  /**
   * The '<em><b>As Bool Value</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AS_BOOL_VALUE_VALUE
   * @generated
   * @ordered
   */
  AS_BOOL_VALUE(3, "asBoolValue", "as bool Value");

  /**
   * The '<em><b>As String</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>As String</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AS_STRING
   * @model name="asString" literal="as String"
   * @generated
   * @ordered
   */
  public static final int AS_STRING_VALUE = 0;

  /**
   * The '<em><b>As Boolean</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>As Boolean</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AS_BOOLEAN
   * @model name="asBoolean" literal="as bool String"
   * @generated
   * @ordered
   */
  public static final int AS_BOOLEAN_VALUE = 1;

  /**
   * The '<em><b>As Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>As Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AS_VALUE
   * @model name="asValue" literal="as Value"
   * @generated
   * @ordered
   */
  public static final int AS_VALUE_VALUE = 2;

  /**
   * The '<em><b>As Bool Value</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>As Bool Value</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AS_BOOL_VALUE
   * @model name="asBoolValue" literal="as bool Value"
   * @generated
   * @ordered
   */
  public static final int AS_BOOL_VALUE_VALUE = 3;

  /**
   * An array of all the '<em><b>Enum Usage</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumUsage[] VALUES_ARRAY =
    new EnumUsage[]
    {
      AS_STRING,
      AS_BOOLEAN,
      AS_VALUE,
      AS_BOOL_VALUE,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Usage</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumUsage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Usage</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumUsage get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumUsage result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Usage</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumUsage getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumUsage result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Usage</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumUsage get(int value)
  {
    switch (value)
    {
      case AS_STRING_VALUE: return AS_STRING;
      case AS_BOOLEAN_VALUE: return AS_BOOLEAN;
      case AS_VALUE_VALUE: return AS_VALUE;
      case AS_BOOL_VALUE_VALUE: return AS_BOOL_VALUE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EnumUsage(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EnumUsage
