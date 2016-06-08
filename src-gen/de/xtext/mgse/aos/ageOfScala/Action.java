/**
 */
package de.xtext.mgse.aos.ageOfScala;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.Action#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#getAction_Action()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAction();

} // Action
