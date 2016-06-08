/**
 */
package de.xtext.mgse.aos.ageOfScala;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Buildings</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getBuildings()
 * @model
 * @generated
 */
public enum Buildings implements Enumerator
{
  /**
   * The '<em><b>LUMBERJACK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LUMBERJACK_VALUE
   * @generated
   * @ordered
   */
  LUMBERJACK(0, "LUMBERJACK", "Holzf\u00e4ller"),

  /**
   * The '<em><b>MASON</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MASON_VALUE
   * @generated
   * @ordered
   */
  MASON(1, "MASON", "Steinmetz"),

  /**
   * The '<em><b>HUNTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HUNTER_VALUE
   * @generated
   * @ordered
   */
  HUNTER(2, "HUNTER", "J\u00e4ger"),

  /**
   * The '<em><b>FISHERMAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FISHERMAN_VALUE
   * @generated
   * @ordered
   */
  FISHERMAN(3, "FISHERMAN", "Fischerei");

  /**
   * The '<em><b>LUMBERJACK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LUMBERJACK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LUMBERJACK
   * @model literal="Holzf\344ller"
   * @generated
   * @ordered
   */
  public static final int LUMBERJACK_VALUE = 0;

  /**
   * The '<em><b>MASON</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MASON</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MASON
   * @model literal="Steinmetz"
   * @generated
   * @ordered
   */
  public static final int MASON_VALUE = 1;

  /**
   * The '<em><b>HUNTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HUNTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HUNTER
   * @model literal="J\344ger"
   * @generated
   * @ordered
   */
  public static final int HUNTER_VALUE = 2;

  /**
   * The '<em><b>FISHERMAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FISHERMAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FISHERMAN
   * @model literal="Fischerei"
   * @generated
   * @ordered
   */
  public static final int FISHERMAN_VALUE = 3;

  /**
   * An array of all the '<em><b>Buildings</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Buildings[] VALUES_ARRAY =
    new Buildings[]
    {
      LUMBERJACK,
      MASON,
      HUNTER,
      FISHERMAN,
    };

  /**
   * A public read-only list of all the '<em><b>Buildings</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Buildings> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Buildings</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buildings get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Buildings result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Buildings</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buildings getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Buildings result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Buildings</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Buildings get(int value)
  {
    switch (value)
    {
      case LUMBERJACK_VALUE: return LUMBERJACK;
      case MASON_VALUE: return MASON;
      case HUNTER_VALUE: return HUNTER;
      case FISHERMAN_VALUE: return FISHERMAN;
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
  private Buildings(int value, String name, String literal)
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
  
} //Buildings
