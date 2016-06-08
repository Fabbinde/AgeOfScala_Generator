/**
 */
package de.xtext.mgse.aos.ageOfScala;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding#getBuildType <em>Build Type</em>}</li>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding#getGebauede <em>Gebauede</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getBuildBuilding()
 * @model
 * @generated
 */
public interface BuildBuilding extends EObject
{
  /**
   * Returns the value of the '<em><b>Build Type</b></em>' attribute list.
   * The list contents are of type {@link de.xtext.mgse.aos.ageOfScala.BuildType}.
   * The literals are from the enumeration {@link de.xtext.mgse.aos.ageOfScala.BuildType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Build Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Build Type</em>' attribute list.
   * @see de.xtext.mgse.aos.ageOfScala.BuildType
   * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getBuildBuilding_BuildType()
   * @model unique="false"
   * @generated
   */
  EList<BuildType> getBuildType();

  /**
   * Returns the value of the '<em><b>Gebauede</b></em>' attribute.
   * The literals are from the enumeration {@link de.xtext.mgse.aos.ageOfScala.Buildings}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gebauede</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gebauede</em>' attribute.
   * @see de.xtext.mgse.aos.ageOfScala.Buildings
   * @see #setGebauede(Buildings)
   * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getBuildBuilding_Gebauede()
   * @model
   * @generated
   */
  Buildings getGebauede();

  /**
   * Sets the value of the '{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding#getGebauede <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gebauede</em>' attribute.
   * @see de.xtext.mgse.aos.ageOfScala.Buildings
   * @see #getGebauede()
   * @generated
   */
  void setGebauede(Buildings value);

} // BuildBuilding
