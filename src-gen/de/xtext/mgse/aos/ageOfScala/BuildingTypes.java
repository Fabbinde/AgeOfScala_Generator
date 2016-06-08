/**
 */
package de.xtext.mgse.aos.ageOfScala;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Building Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getBuildingTypes()
 * @model
 * @generated
 */
public enum BuildingTypes implements Enumerator
{
  /**
   * The '<em><b>HOUSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HOUSE_VALUE
   * @generated
   * @ordered
   */
  HOUSE(0, "HOUSE", "Wohngeb\u00e4ude"),

  /**
   * The '<em><b>PRODUCING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRODUCING_VALUE
   * @generated
   * @ordered
   */
  PRODUCING(1, "PRODUCING", "Produzierendes Geb\u00e4ude"),

  /**
   * The '<em><b>STOCK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STOCK_VALUE
   * @generated
   * @ordered
   */
  STOCK(2, "STOCK", "Lagergeb\u00e4ude");

  /**
   * The '<em><b>HOUSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HOUSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HOUSE
   * @model literal="Wohngeb\344ude"
   * @generated
   * @ordered
   */
  public static final int HOUSE_VALUE = 0;

  /**
   * The '<em><b>PRODUCING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRODUCING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRODUCING
   * @model literal="Produzierendes Geb\344ude"
   * @generated
   * @ordered
   */
  public static final int PRODUCING_VALUE = 1;

  /**
   * The '<em><b>STOCK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STOCK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STOCK
   * @model literal="Lagergeb\344ude"
   * @generated
   * @ordered
   */
  public static final int STOCK_VALUE = 2;

  /**
   * An array of all the '<em><b>Building Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuildingTypes[] VALUES_ARRAY =
    new BuildingTypes[]
    {
      HOUSE,
      PRODUCING,
      STOCK,
    };

  /**
   * A public read-only list of all the '<em><b>Building Types</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuildingTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Building Types</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildingTypes get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildingTypes result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Building Types</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildingTypes getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuildingTypes result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Building Types</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuildingTypes get(int value)
  {
    switch (value)
    {
      case HOUSE_VALUE: return HOUSE;
      case PRODUCING_VALUE: return PRODUCING;
      case STOCK_VALUE: return STOCK;
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
  private BuildingTypes(int value, String name, String literal)
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
  
} //BuildingTypes
