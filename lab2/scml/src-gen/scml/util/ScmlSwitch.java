/**
 */
package scml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import scml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see scml.ScmlPackage
 * @generated
 */
public class ScmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScmlSwitch() {
		if (modelPackage == null) {
			modelPackage = ScmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ScmlPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.KPI_MEASUREMENT_DEVICE: {
			KPIMeasurementDevice kpiMeasurementDevice = (KPIMeasurementDevice) theEObject;
			T result = caseKPIMeasurementDevice(kpiMeasurementDevice);
			if (result == null)
				result = caseNamedElement(kpiMeasurementDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.BASIS: {
			Basis basis = (Basis) theEObject;
			T result = caseBasis(basis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.GOAL_REFERENCE_VALUE: {
			GoalReferenceValue goalReferenceValue = (GoalReferenceValue) theEObject;
			T result = caseGoalReferenceValue(goalReferenceValue);
			if (result == null)
				result = caseData(goalReferenceValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.AGGREGATED_VALUE: {
			AggregatedValue aggregatedValue = (AggregatedValue) theEObject;
			T result = caseAggregatedValue(aggregatedValue);
			if (result == null)
				result = caseData(aggregatedValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.DATA_VALUE: {
			DataValue dataValue = (DataValue) theEObject;
			T result = caseDataValue(dataValue);
			if (result == null)
				result = caseData(dataValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.PROJECT: {
			Project project = (Project) theEObject;
			T result = caseProject(project);
			if (result == null)
				result = caseNamedElement(project);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.INFRASTRUCTURE_COMPONENT: {
			InfrastructureComponent infrastructureComponent = (InfrastructureComponent) theEObject;
			T result = caseInfrastructureComponent(infrastructureComponent);
			if (result == null)
				result = caseNamedElement(infrastructureComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.LOCATION: {
			Location location = (Location) theEObject;
			T result = caseLocation(location);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.BUILDING_COMPONENT: {
			BuildingComponent buildingComponent = (BuildingComponent) theEObject;
			T result = caseBuildingComponent(buildingComponent);
			if (result == null)
				result = caseInfrastructureComponent(buildingComponent);
			if (result == null)
				result = caseNamedElement(buildingComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.TRANSPORTATION_COMPONENT: {
			TransportationComponent transportationComponent = (TransportationComponent) theEObject;
			T result = caseTransportationComponent(transportationComponent);
			if (result == null)
				result = caseInfrastructureComponent(transportationComponent);
			if (result == null)
				result = caseNamedElement(transportationComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.ENVIRONMENTAL_COMPONENT: {
			EnvironmentalComponent environmentalComponent = (EnvironmentalComponent) theEObject;
			T result = caseEnvironmentalComponent(environmentalComponent);
			if (result == null)
				result = caseInfrastructureComponent(environmentalComponent);
			if (result == null)
				result = caseNamedElement(environmentalComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.SMART_CITY: {
			SmartCity smartCity = (SmartCity) theEObject;
			T result = caseSmartCity(smartCity);
			if (result == null)
				result = caseNamedElement(smartCity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.CATEGORY: {
			Category category = (Category) theEObject;
			T result = caseCategory(category);
			if (result == null)
				result = caseNamedElement(category);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.SENSOR: {
			Sensor sensor = (Sensor) theEObject;
			T result = caseSensor(sensor);
			if (result == null)
				result = caseDevice(sensor);
			if (result == null)
				result = caseNamedElement(sensor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.ACTUATOR: {
			Actuator actuator = (Actuator) theEObject;
			T result = caseActuator(actuator);
			if (result == null)
				result = caseDevice(actuator);
			if (result == null)
				result = caseNamedElement(actuator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScmlPackage.DEVICE: {
			Device device = (Device) theEObject;
			T result = caseDevice(device);
			if (result == null)
				result = caseNamedElement(device);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Measurement Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Measurement Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIMeasurementDevice(KPIMeasurementDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis(Basis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalReferenceValue(GoalReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedValue(AggregatedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValue(DataValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureComponent(InfrastructureComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildingComponent(BuildingComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transportation Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transportation Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportationComponent(TransportationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalComponent(EnvironmentalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart City</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart City</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartCity(SmartCity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuator(Actuator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ScmlSwitch
