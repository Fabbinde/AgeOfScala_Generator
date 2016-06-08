/**
 */
package de.xtext.mgse.aos.ageOfScala;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show Buildings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.ShowBuildings#getGebauede <em>Gebauede</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getShowBuildings()
 * @model
 * @generated
 */
public interface ShowBuildings extends EObject
{
  /**
   * Returns the value of the '<em><b>Gebauede</b></em>' attribute.
   * The literals are from the enumeration {@link de.xtext.mgse.aos.ageOfScala.BuildingTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gebauede</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gebauede</em>' attribute.
   * @see de.xtext.mgse.aos.ageOfScala.BuildingTypes
   * @see #setGebauede(BuildingTypes)
   * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getShowBuildings_Gebauede()
   * @model
   * @generated
   */
  BuildingTypes getGebauede();

  /**
   * Sets the value of the '{@link de.xtext.mgse.aos.ageOfScala.ShowBuildings#getGebauede <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gebauede</em>' attribute.
   * @see de.xtext.mgse.aos.ageOfScala.BuildingTypes
   * @see #getGebauede()
   * @generated
   */
  void setGebauede(BuildingTypes value);

} // ShowBuildings
