/**
 */
package scml.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import scml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see scml.ScmlPackage
 * @generated
 */
public class ScmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScmlValidator INSTANCE = new ScmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "scml";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Status CRITICAL' of 'KPI Measurement Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KPI_MEASUREMENT_DEVICE__CHECK_STATUS_CRITICAL = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Status WARN' of 'KPI Measurement Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KPI_MEASUREMENT_DEVICE__CHECK_STATUS_WARN = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Calculation Date Comparison' of 'KPI Measurement Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KPI_MEASUREMENT_DEVICE__CALCULATION_DATE_COMPARISON = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Consumed Time Produced Time' of 'Data Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_VALUE__CHECK_CONSUMED_TIME_PRODUCED_TIME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Consumed Time Set' of 'Data Value'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_VALUE__CHECK_CONSUMED_TIME_SET = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Not Part Of Itself' of 'Infrastructure Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_COMPONENT__CHECK_NOT_PART_OF_ITSELF = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Has Prefix Initial Of Project' of 'Infrastructure Component'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFRASTRUCTURE_COMPONENT__NAME_HAS_PREFIX_INITIAL_OF_PROJECT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lat Long In Range' of 'Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOCATION__LAT_LONG_IN_RANGE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check SDG Number' of 'Category'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATEGORY__CHECK_SDG_NUMBER = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Check Parameter Type' of 'Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEVICE__CHECK_PARAMETER_TYPE = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 10;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ScmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ScmlPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case ScmlPackage.KPI_MEASUREMENT_DEVICE:
			return validateKPIMeasurementDevice((KPIMeasurementDevice) value, diagnostics, context);
		case ScmlPackage.BASIS:
			return validateBasis((Basis) value, diagnostics, context);
		case ScmlPackage.GOAL_REFERENCE_VALUE:
			return validateGoalReferenceValue((GoalReferenceValue) value, diagnostics, context);
		case ScmlPackage.AGGREGATED_VALUE:
			return validateAggregatedValue((AggregatedValue) value, diagnostics, context);
		case ScmlPackage.DATA:
			return validateData((Data) value, diagnostics, context);
		case ScmlPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case ScmlPackage.DATA_VALUE:
			return validateDataValue((DataValue) value, diagnostics, context);
		case ScmlPackage.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT:
			return validateInfrastructureComponent((InfrastructureComponent) value, diagnostics, context);
		case ScmlPackage.LOCATION:
			return validateLocation((Location) value, diagnostics, context);
		case ScmlPackage.BUILDING_COMPONENT:
			return validateBuildingComponent((BuildingComponent) value, diagnostics, context);
		case ScmlPackage.TRANSPORTATION_COMPONENT:
			return validateTransportationComponent((TransportationComponent) value, diagnostics, context);
		case ScmlPackage.ENVIRONMENTAL_COMPONENT:
			return validateEnvironmentalComponent((EnvironmentalComponent) value, diagnostics, context);
		case ScmlPackage.SMART_CITY:
			return validateSmartCity((SmartCity) value, diagnostics, context);
		case ScmlPackage.CATEGORY:
			return validateCategory((Category) value, diagnostics, context);
		case ScmlPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case ScmlPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case ScmlPackage.DEVICE:
			return validateDevice((Device) value, diagnostics, context);
		case ScmlPackage.STATUS:
			return validateStatus((Status) value, diagnostics, context);
		case ScmlPackage.PRINCIPLE_TYPE:
			return validatePrincipleType((PrincipleType) value, diagnostics, context);
		case ScmlPackage.DATA_TYPE:
			return validateDataType((DataType) value, diagnostics, context);
		case ScmlPackage.OPERATION:
			return validateOperation((Operation) value, diagnostics, context);
		case ScmlPackage.PARAMETER_TYPE:
			return validateParameterType((ParameterType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKPIMeasurementDevice(KPIMeasurementDevice kpiMeasurementDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kpiMeasurementDevice, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateKPIMeasurementDevice_checkStatusCRITICAL(kpiMeasurementDevice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateKPIMeasurementDevice_calculationDateComparison(kpiMeasurementDevice, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateKPIMeasurementDevice_checkStatusWARN(kpiMeasurementDevice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the calculationDateComparison constraint of '<em>KPI Measurement Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKPIMeasurementDevice_calculationDateComparison(KPIMeasurementDevice kpiMeasurementDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kpiMeasurementDevice.calculationDateComparison(diagnostics, context);
	}

	/**
	 * Validates the checkStatusCRITICAL constraint of '<em>KPI Measurement Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKPIMeasurementDevice_checkStatusCRITICAL(KPIMeasurementDevice kpiMeasurementDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kpiMeasurementDevice.checkStatusCRITICAL(diagnostics, context);
	}

	/**
	 * Validates the checkStatusWARN constraint of '<em>KPI Measurement Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKPIMeasurementDevice_checkStatusWARN(KPIMeasurementDevice kpiMeasurementDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kpiMeasurementDevice.checkStatusWARN(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasis(Basis basis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalReferenceValue(GoalReferenceValue goalReferenceValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalReferenceValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregatedValue(AggregatedValue aggregatedValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aggregatedValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataValue(DataValue dataValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataValue, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataValue_checkConsumedTimeSet(dataValue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDataValue_checkConsumedTimeProducedTime(dataValue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkConsumedTimeSet constraint of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataValue_checkConsumedTimeSet(DataValue dataValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataValue.checkConsumedTimeSet(diagnostics, context);
	}

	/**
	 * Validates the checkConsumedTimeProducedTime constraint of '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataValue_checkConsumedTimeProducedTime(DataValue dataValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return dataValue.checkConsumedTimeProducedTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureComponent(InfrastructureComponent infrastructureComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(infrastructureComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_nameHasPrefixInitialOfProject(infrastructureComponent,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_checkNotPartOfItself(infrastructureComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the nameHasPrefixInitialOfProject constraint of '<em>Infrastructure Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureComponent_nameHasPrefixInitialOfProject(
			InfrastructureComponent infrastructureComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureComponent.nameHasPrefixInitialOfProject(diagnostics, context);
	}

	/**
	 * Validates the checkNotPartOfItself constraint of '<em>Infrastructure Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureComponent_checkNotPartOfItself(InfrastructureComponent infrastructureComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return infrastructureComponent.checkNotPartOfItself(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(location, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(location, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLocation_latLongInRange(location, diagnostics, context);
		return result;
	}

	/**
	 * Validates the latLongInRange constraint of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation_latLongInRange(Location location, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return location.latLongInRange(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuildingComponent(BuildingComponent buildingComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buildingComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(buildingComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_nameHasPrefixInitialOfProject(buildingComponent, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_checkNotPartOfItself(buildingComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportationComponent(TransportationComponent transportationComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transportationComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transportationComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_nameHasPrefixInitialOfProject(transportationComponent,
					diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_checkNotPartOfItself(transportationComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalComponent(EnvironmentalComponent environmentalComponent,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(environmentalComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(environmentalComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_nameHasPrefixInitialOfProject(environmentalComponent, diagnostics,
					context);
		if (result || diagnostics != null)
			result &= validateInfrastructureComponent_checkNotPartOfItself(environmentalComponent, diagnostics,
					context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmartCity(SmartCity smartCity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smartCity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCategory_checkSDGNumber(category, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkSDGNumber constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_checkSDGNumber(Category category, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return category.checkSDGNumber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_checkParameterType(sensor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_checkParameterType(actuator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_checkParameterType(device, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkParameterType constraint of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice_checkParameterType(Device device, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return device.checkParameterType(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrincipleType(PrincipleType principleType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ScmlValidator
