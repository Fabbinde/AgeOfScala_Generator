/**
 */
package de.xtext.mgse.aos.ageOfScala.impl;

import de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage;
import de.xtext.mgse.aos.ageOfScala.BuildingTypes;
import de.xtext.mgse.aos.ageOfScala.ShowBuildings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Show Buildings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.impl.ShowBuildingsImpl#getGebauede <em>Gebauede</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShowBuildingsImpl extends MinimalEObjectImpl.Container implements ShowBuildings
{
  /**
   * The default value of the '{@link #getGebauede() <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGebauede()
   * @generated
   * @ordered
   */
  protected static final BuildingTypes GEBAUEDE_EDEFAULT = BuildingTypes.HOUSE;

  /**
   * The cached value of the '{@link #getGebauede() <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGebauede()
   * @generated
   * @ordered
   */
  protected BuildingTypes gebauede = GEBAUEDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShowBuildingsImpl()
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
    return AgeOfScalaPackage.Literals.SHOW_BUILDINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildingTypes getGebauede()
  {
    return gebauede;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGebauede(BuildingTypes newGebauede)
  {
    BuildingTypes oldGebauede = gebauede;
    gebauede = newGebauede == null ? GEBAUEDE_EDEFAULT : newGebauede;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgeOfScalaPackage.SHOW_BUILDINGS__GEBAUEDE, oldGebauede, gebauede));
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
      case AgeOfScalaPackage.SHOW_BUILDINGS__GEBAUEDE:
        return getGebauede();
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
      case AgeOfScalaPackage.SHOW_BUILDINGS__GEBAUEDE:
        setGebauede((BuildingTypes)newValue);
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
      case AgeOfScalaPackage.SHOW_BUILDINGS__GEBAUEDE:
        setGebauede(GEBAUEDE_EDEFAULT);
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
      case AgeOfScalaPackage.SHOW_BUILDINGS__GEBAUEDE:
        return gebauede != GEBAUEDE_EDEFAULT;
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
    result.append(" (gebauede: ");
    result.append(gebauede);
    result.append(')');
    return result.toString();
  }

} //ShowBuildingsImpl
