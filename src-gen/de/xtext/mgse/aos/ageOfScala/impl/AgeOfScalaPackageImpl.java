/**
 */
package de.xtext.mgse.aos.ageOfScala.impl;

import de.xtext.mgse.aos.ageOfScala.Action;
import de.xtext.mgse.aos.ageOfScala.AgeOfScalaFactory;
import de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage;
import de.xtext.mgse.aos.ageOfScala.BuildBuilding;
import de.xtext.mgse.aos.ageOfScala.BuildType;
import de.xtext.mgse.aos.ageOfScala.BuildingTypes;
import de.xtext.mgse.aos.ageOfScala.Buildings;
import de.xtext.mgse.aos.ageOfScala.ShowBuildings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgeOfScalaPackageImpl extends EPackageImpl implements AgeOfScalaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showBuildingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buildBuildingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum buildTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum buildingTypesEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum buildingsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.xtext.mgse.aos.ageOfScala.AgeOfScalaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AgeOfScalaPackageImpl()
  {
    super(eNS_URI, AgeOfScalaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AgeOfScalaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AgeOfScalaPackage init()
  {
    if (isInited) return (AgeOfScalaPackage)EPackage.Registry.INSTANCE.getEPackage(AgeOfScalaPackage.eNS_URI);

    // Obtain or create and register package
    AgeOfScalaPackageImpl theAgeOfScalaPackage = (AgeOfScalaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AgeOfScalaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AgeOfScalaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAgeOfScalaPackage.createPackageContents();

    // Initialize created meta-data
    theAgeOfScalaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAgeOfScalaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AgeOfScalaPackage.eNS_URI, theAgeOfScalaPackage);
    return theAgeOfScalaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Action()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShowBuildings()
  {
    return showBuildingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShowBuildings_Gebauede()
  {
    return (EAttribute)showBuildingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuildBuilding()
  {
    return buildBuildingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildBuilding_BuildType()
  {
    return (EAttribute)buildBuildingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuildBuilding_Gebauede()
  {
    return (EAttribute)buildBuildingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuildType()
  {
    return buildTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuildingTypes()
  {
    return buildingTypesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuildings()
  {
    return buildingsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgeOfScalaFactory getAgeOfScalaFactory()
  {
    return (AgeOfScalaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__ACTION);

    showBuildingsEClass = createEClass(SHOW_BUILDINGS);
    createEAttribute(showBuildingsEClass, SHOW_BUILDINGS__GEBAUEDE);

    buildBuildingEClass = createEClass(BUILD_BUILDING);
    createEAttribute(buildBuildingEClass, BUILD_BUILDING__BUILD_TYPE);
    createEAttribute(buildBuildingEClass, BUILD_BUILDING__GEBAUEDE);

    // Create enums
    buildTypeEEnum = createEEnum(BUILD_TYPE);
    buildingTypesEEnum = createEEnum(BUILDING_TYPES);
    buildingsEEnum = createEEnum(BUILDINGS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Action(), ecorePackage.getEObject(), null, "action", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(showBuildingsEClass, ShowBuildings.class, "ShowBuildings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getShowBuildings_Gebauede(), this.getBuildingTypes(), "gebauede", null, 0, 1, ShowBuildings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buildBuildingEClass, BuildBuilding.class, "BuildBuilding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuildBuilding_BuildType(), this.getBuildType(), "buildType", null, 0, -1, BuildBuilding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBuildBuilding_Gebauede(), this.getBuildings(), "gebauede", null, 0, 1, BuildBuilding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(buildTypeEEnum, BuildType.class, "BuildType");
    addEEnumLiteral(buildTypeEEnum, BuildType.BUILD);
    addEEnumLiteral(buildTypeEEnum, BuildType.DESTROY);

    initEEnum(buildingTypesEEnum, BuildingTypes.class, "BuildingTypes");
    addEEnumLiteral(buildingTypesEEnum, BuildingTypes.HOUSE);
    addEEnumLiteral(buildingTypesEEnum, BuildingTypes.PRODUCING);
    addEEnumLiteral(buildingTypesEEnum, BuildingTypes.STOCK);

    initEEnum(buildingsEEnum, Buildings.class, "Buildings");
    addEEnumLiteral(buildingsEEnum, Buildings.LUMBERJACK);
    addEEnumLiteral(buildingsEEnum, Buildings.MASON);
    addEEnumLiteral(buildingsEEnum, Buildings.HUNTER);
    addEEnumLiteral(buildingsEEnum, Buildings.FISHERMAN);

    // Create resource
    createResource(eNS_URI);
  }

} //AgeOfScalaPackageImpl
