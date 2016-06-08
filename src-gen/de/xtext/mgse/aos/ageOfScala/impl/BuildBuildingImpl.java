/**
 */
package de.xtext.mgse.aos.ageOfScala.impl;

import de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage;
import de.xtext.mgse.aos.ageOfScala.BuildBuilding;
import de.xtext.mgse.aos.ageOfScala.BuildType;
import de.xtext.mgse.aos.ageOfScala.Buildings;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl#getBuildType <em>Build Type</em>}</li>
 *   <li>{@link de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl#getGebauede <em>Gebauede</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildBuildingImpl extends MinimalEObjectImpl.Container implements BuildBuilding
{
  /**
   * The cached value of the '{@link #getBuildType() <em>Build Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildType()
   * @generated
   * @ordered
   */
  protected EList<BuildType> buildType;

  /**
   * The default value of the '{@link #getGebauede() <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGebauede()
   * @generated
   * @ordered
   */
  protected static final Buildings GEBAUEDE_EDEFAULT = Buildings.LUMBERJACK;

  /**
   * The cached value of the '{@link #getGebauede() <em>Gebauede</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGebauede()
   * @generated
   * @ordered
   */
  protected Buildings gebauede = GEBAUEDE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BuildBuildingImpl()
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
    return AgeOfScalaPackage.Literals.BUILD_BUILDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BuildType> getBuildType()
  {
    if (buildType == null)
    {
      buildType = new EDataTypeEList<BuildType>(BuildType.class, this, AgeOfScalaPackage.BUILD_BUILDING__BUILD_TYPE);
    }
    return buildType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buildings getGebauede()
  {
    return gebauede;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGebauede(Buildings newGebauede)
  {
    Buildings oldGebauede = gebauede;
    gebauede = newGebauede == null ? GEBAUEDE_EDEFAULT : newGebauede;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AgeOfScalaPackage.BUILD_BUILDING__GEBAUEDE, oldGebauede, gebauede));
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
      case AgeOfScalaPackage.BUILD_BUILDING__BUILD_TYPE:
        return getBuildType();
      case AgeOfScalaPackage.BUILD_BUILDING__GEBAUEDE:
        return getGebauede();
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
      case AgeOfScalaPackage.BUILD_BUILDING__BUILD_TYPE:
        getBuildType().clear();
        getBuildType().addAll((Collection<? extends BuildType>)newValue);
        return;
      case AgeOfScalaPackage.BUILD_BUILDING__GEBAUEDE:
        setGebauede((Buildings)newValue);
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
      case AgeOfScalaPackage.BUILD_BUILDING__BUILD_TYPE:
        getBuildType().clear();
        return;
      case AgeOfScalaPackage.BUILD_BUILDING__GEBAUEDE:
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
      case AgeOfScalaPackage.BUILD_BUILDING__BUILD_TYPE:
        return buildType != null && !buildType.isEmpty();
      case AgeOfScalaPackage.BUILD_BUILDING__GEBAUEDE:
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
    result.append(" (buildType: ");
    result.append(buildType);
    result.append(", gebauede: ");
    result.append(gebauede);
    result.append(')');
    return result.toString();
  }

} //BuildBuildingImpl
