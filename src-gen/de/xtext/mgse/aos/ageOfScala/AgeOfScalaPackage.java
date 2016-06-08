/**
 */
package de.xtext.mgse.aos.ageOfScala;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaFactory
 * @model kind="package"
 * @generated
 */
public interface AgeOfScalaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ageOfScala";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.de/mgse/aos/AgeOfScala";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ageOfScala";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AgeOfScalaPackage eINSTANCE = de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl.init();

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.impl.ActionImpl
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getAction()
   * @generated
   */
  int ACTION = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ACTION = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.impl.ShowBuildingsImpl <em>Show Buildings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.impl.ShowBuildingsImpl
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getShowBuildings()
   * @generated
   */
  int SHOW_BUILDINGS = 1;

  /**
   * The feature id for the '<em><b>Gebauede</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_BUILDINGS__GEBAUEDE = 0;

  /**
   * The number of structural features of the '<em>Show Buildings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOW_BUILDINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl <em>Build Building</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildBuilding()
   * @generated
   */
  int BUILD_BUILDING = 2;

  /**
   * The feature id for the '<em><b>Build Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_BUILDING__BUILD_TYPE = 0;

  /**
   * The feature id for the '<em><b>Gebauede</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_BUILDING__GEBAUEDE = 1;

  /**
   * The number of structural features of the '<em>Build Building</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_BUILDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.BuildType <em>Build Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.BuildType
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildType()
   * @generated
   */
  int BUILD_TYPE = 3;

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.BuildingTypes <em>Building Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.BuildingTypes
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildingTypes()
   * @generated
   */
  int BUILDING_TYPES = 4;

  /**
   * The meta object id for the '{@link de.xtext.mgse.aos.ageOfScala.Buildings <em>Buildings</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.xtext.mgse.aos.ageOfScala.Buildings
   * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildings()
   * @generated
   */
  int BUILDINGS = 5;


  /**
   * Returns the meta object for class '{@link de.xtext.mgse.aos.ageOfScala.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the containment reference list '{@link de.xtext.mgse.aos.ageOfScala.Action#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.Action#getAction()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Action();

  /**
   * Returns the meta object for class '{@link de.xtext.mgse.aos.ageOfScala.ShowBuildings <em>Show Buildings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Show Buildings</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.ShowBuildings
   * @generated
   */
  EClass getShowBuildings();

  /**
   * Returns the meta object for the attribute '{@link de.xtext.mgse.aos.ageOfScala.ShowBuildings#getGebauede <em>Gebauede</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gebauede</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.ShowBuildings#getGebauede()
   * @see #getShowBuildings()
   * @generated
   */
  EAttribute getShowBuildings_Gebauede();

  /**
   * Returns the meta object for class '{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding <em>Build Building</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Build Building</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.BuildBuilding
   * @generated
   */
  EClass getBuildBuilding();

  /**
   * Returns the meta object for the attribute list '{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding#getBuildType <em>Build Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Build Type</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.BuildBuilding#getBuildType()
   * @see #getBuildBuilding()
   * @generated
   */
  EAttribute getBuildBuilding_BuildType();

  /**
   * Returns the meta object for the attribute '{@link de.xtext.mgse.aos.ageOfScala.BuildBuilding#getGebauede <em>Gebauede</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gebauede</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.BuildBuilding#getGebauede()
   * @see #getBuildBuilding()
   * @generated
   */
  EAttribute getBuildBuilding_Gebauede();

  /**
   * Returns the meta object for enum '{@link de.xtext.mgse.aos.ageOfScala.BuildType <em>Build Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Build Type</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.BuildType
   * @generated
   */
  EEnum getBuildType();

  /**
   * Returns the meta object for enum '{@link de.xtext.mgse.aos.ageOfScala.BuildingTypes <em>Building Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Building Types</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.BuildingTypes
   * @generated
   */
  EEnum getBuildingTypes();

  /**
   * Returns the meta object for enum '{@link de.xtext.mgse.aos.ageOfScala.Buildings <em>Buildings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Buildings</em>'.
   * @see de.xtext.mgse.aos.ageOfScala.Buildings
   * @generated
   */
  EEnum getBuildings();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AgeOfScalaFactory getAgeOfScalaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.impl.ActionImpl
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__ACTION = eINSTANCE.getAction_Action();

    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.impl.ShowBuildingsImpl <em>Show Buildings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.impl.ShowBuildingsImpl
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getShowBuildings()
     * @generated
     */
    EClass SHOW_BUILDINGS = eINSTANCE.getShowBuildings();

    /**
     * The meta object literal for the '<em><b>Gebauede</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHOW_BUILDINGS__GEBAUEDE = eINSTANCE.getShowBuildings_Gebauede();

    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl <em>Build Building</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.impl.BuildBuildingImpl
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildBuilding()
     * @generated
     */
    EClass BUILD_BUILDING = eINSTANCE.getBuildBuilding();

    /**
     * The meta object literal for the '<em><b>Build Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_BUILDING__BUILD_TYPE = eINSTANCE.getBuildBuilding_BuildType();

    /**
     * The meta object literal for the '<em><b>Gebauede</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_BUILDING__GEBAUEDE = eINSTANCE.getBuildBuilding_Gebauede();

    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.BuildType <em>Build Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.BuildType
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildType()
     * @generated
     */
    EEnum BUILD_TYPE = eINSTANCE.getBuildType();

    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.BuildingTypes <em>Building Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.BuildingTypes
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildingTypes()
     * @generated
     */
    EEnum BUILDING_TYPES = eINSTANCE.getBuildingTypes();

    /**
     * The meta object literal for the '{@link de.xtext.mgse.aos.ageOfScala.Buildings <em>Buildings</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.xtext.mgse.aos.ageOfScala.Buildings
     * @see de.xtext.mgse.aos.ageOfScala.impl.AgeOfScalaPackageImpl#getBuildings()
     * @generated
     */
    EEnum BUILDINGS = eINSTANCE.getBuildings();

  }

} //AgeOfScalaPackage
