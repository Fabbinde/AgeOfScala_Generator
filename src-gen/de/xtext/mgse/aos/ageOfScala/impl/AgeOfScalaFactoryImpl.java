/**
 */
package de.xtext.mgse.aos.ageOfScala.impl;

import de.xtext.mgse.aos.ageOfScala.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgeOfScalaFactoryImpl extends EFactoryImpl implements AgeOfScalaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AgeOfScalaFactory init()
  {
    try
    {
      AgeOfScalaFactory theAgeOfScalaFactory = (AgeOfScalaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.de/mgse/aos/AgeOfScala"); 
      if (theAgeOfScalaFactory != null)
      {
        return theAgeOfScalaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AgeOfScalaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgeOfScalaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AgeOfScalaPackage.ACTION: return createAction();
      case AgeOfScalaPackage.SHOW_BUILDINGS: return createShowBuildings();
      case AgeOfScalaPackage.BUILD_BUILDING: return createBuildBuilding();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AgeOfScalaPackage.BUILD_TYPE:
        return createBuildTypeFromString(eDataType, initialValue);
      case AgeOfScalaPackage.BUILDING_TYPES:
        return createBuildingTypesFromString(eDataType, initialValue);
      case AgeOfScalaPackage.BUILDINGS:
        return createBuildingsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case AgeOfScalaPackage.BUILD_TYPE:
        return convertBuildTypeToString(eDataType, instanceValue);
      case AgeOfScalaPackage.BUILDING_TYPES:
        return convertBuildingTypesToString(eDataType, instanceValue);
      case AgeOfScalaPackage.BUILDINGS:
        return convertBuildingsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShowBuildings createShowBuildings()
  {
    ShowBuildingsImpl showBuildings = new ShowBuildingsImpl();
    return showBuildings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildBuilding createBuildBuilding()
  {
    BuildBuildingImpl buildBuilding = new BuildBuildingImpl();
    return buildBuilding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildType createBuildTypeFromString(EDataType eDataType, String initialValue)
  {
    BuildType result = BuildType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuildTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuildingTypes createBuildingTypesFromString(EDataType eDataType, String initialValue)
  {
    BuildingTypes result = BuildingTypes.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuildingTypesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buildings createBuildingsFromString(EDataType eDataType, String initialValue)
  {
    Buildings result = Buildings.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBuildingsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AgeOfScalaPackage getAgeOfScalaPackage()
  {
    return (AgeOfScalaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AgeOfScalaPackage getPackage()
  {
    return AgeOfScalaPackage.eINSTANCE;
  }

} //AgeOfScalaFactoryImpl
