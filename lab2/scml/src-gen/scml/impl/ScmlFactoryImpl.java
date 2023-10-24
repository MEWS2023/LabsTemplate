/**
 */
package scml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import scml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScmlFactoryImpl extends EFactoryImpl implements ScmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScmlFactory init() {
		try {
			ScmlFactory theScmlFactory = (ScmlFactory) EPackage.Registry.INSTANCE.getEFactory(ScmlPackage.eNS_URI);
			if (theScmlFactory != null) {
				return theScmlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ScmlPackage.KPI_MEASUREMENT_DEVICE:
			return createKPIMeasurementDevice();
		case ScmlPackage.BASIS:
			return createBasis();
		case ScmlPackage.GOAL_REFERENCE_VALUE:
			return createGoalReferenceValue();
		case ScmlPackage.AGGREGATED_VALUE:
			return createAggregatedValue();
		case ScmlPackage.PARAMETER:
			return createParameter();
		case ScmlPackage.DATA_VALUE:
			return createDataValue();
		case ScmlPackage.PROJECT:
			return createProject();
		case ScmlPackage.LOCATION:
			return createLocation();
		case ScmlPackage.BUILDING_COMPONENT:
			return createBuildingComponent();
		case ScmlPackage.TRANSPORTATION_COMPONENT:
			return createTransportationComponent();
		case ScmlPackage.ENVIRONMENTAL_COMPONENT:
			return createEnvironmentalComponent();
		case ScmlPackage.SMART_CITY:
			return createSmartCity();
		case ScmlPackage.CATEGORY:
			return createCategory();
		case ScmlPackage.SENSOR:
			return createSensor();
		case ScmlPackage.ACTUATOR:
			return createActuator();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ScmlPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		case ScmlPackage.PRINCIPLE_TYPE:
			return createPrincipleTypeFromString(eDataType, initialValue);
		case ScmlPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		case ScmlPackage.OPERATION:
			return createOperationFromString(eDataType, initialValue);
		case ScmlPackage.PARAMETER_TYPE:
			return createParameterTypeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ScmlPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		case ScmlPackage.PRINCIPLE_TYPE:
			return convertPrincipleTypeToString(eDataType, instanceValue);
		case ScmlPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		case ScmlPackage.OPERATION:
			return convertOperationToString(eDataType, instanceValue);
		case ScmlPackage.PARAMETER_TYPE:
			return convertParameterTypeToString(eDataType, instanceValue);
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
	public KPIMeasurementDevice createKPIMeasurementDevice() {
		KPIMeasurementDeviceImpl kpiMeasurementDevice = new KPIMeasurementDeviceImpl();
		return kpiMeasurementDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis createBasis() {
		BasisImpl basis = new BasisImpl();
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalReferenceValue createGoalReferenceValue() {
		GoalReferenceValueImpl goalReferenceValue = new GoalReferenceValueImpl();
		return goalReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregatedValue createAggregatedValue() {
		AggregatedValueImpl aggregatedValue = new AggregatedValueImpl();
		return aggregatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataValue createDataValue() {
		DataValueImpl dataValue = new DataValueImpl();
		return dataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildingComponent createBuildingComponent() {
		BuildingComponentImpl buildingComponent = new BuildingComponentImpl();
		return buildingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportationComponent createTransportationComponent() {
		TransportationComponentImpl transportationComponent = new TransportationComponentImpl();
		return transportationComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalComponent createEnvironmentalComponent() {
		EnvironmentalComponentImpl environmentalComponent = new EnvironmentalComponentImpl();
		return environmentalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartCity createSmartCity() {
		SmartCityImpl smartCity = new SmartCityImpl();
		return smartCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipleType createPrincipleTypeFromString(EDataType eDataType, String initialValue) {
		PrincipleType result = PrincipleType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrincipleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperationFromString(EDataType eDataType, String initialValue) {
		Operation result = Operation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScmlPackage getScmlPackage() {
		return (ScmlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScmlPackage getPackage() {
		return ScmlPackage.eINSTANCE;
	}

} //ScmlFactoryImpl
