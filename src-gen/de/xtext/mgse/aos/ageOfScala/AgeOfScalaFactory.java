/**
 */
package de.xtext.mgse.aos.ageOfScala;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage
 * @generated
 */
public interface AgeOfScalaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgeOfScalaFactory eINSTANCE = de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Show Buildings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Show Buildings</em>'.
   * @generated
   */
  ShowBuildings createShowBuildings();

  /**
   * Returns a new object of class '<em>Build Building</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Build Building</em>'.
   * @generated
   */
  BuildBuilding createBuildBuilding();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AgeOfScalaPackage getAgeOfScalaPackage();

} //AgeOfScalaFactory
