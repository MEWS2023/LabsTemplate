/**
 */
package scml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import scml.Actuator;
import scml.AggregatedValue;
import scml.Basis;
import scml.BuildingComponent;
import scml.Category;
import scml.Data;
import scml.DataType;
import scml.DataValue;
import scml.Device;
import scml.EnvironmentalComponent;
import scml.GoalReferenceValue;
import scml.InfrastructureComponent;
import scml.KPIMeasurementDevice;
import scml.Location;
import scml.NamedElement;
import scml.Operation;
import scml.Parameter;
import scml.ParameterType;
import scml.PrincipleType;
import scml.Project;
import scml.ScmlFactory;
import scml.ScmlPackage;
import scml.Sensor;
import scml.SmartCity;
import scml.Status;
import scml.TransportationComponent;
import scml.util.ScmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScmlPackageImpl extends EPackageImpl implements ScmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiMeasurementDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildingComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartCityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum principleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterTypeEEnum = null;

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
	 * @see scml.ScmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScmlPackageImpl() {
		super(eNS_URI, ScmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScmlPackage init() {
		if (isInited)
			return (ScmlPackage) EPackage.Registry.INSTANCE.getEPackage(ScmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ScmlPackageImpl theScmlPackage = registeredScmlPackage instanceof ScmlPackageImpl
				? (ScmlPackageImpl) registeredScmlPackage
				: new ScmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theScmlPackage.createPackageContents();

		// Initialize created meta-data
		theScmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theScmlPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return ScmlValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theScmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScmlPackage.eNS_URI, theScmlPackage);
		return theScmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKPIMeasurementDevice() {
		return kpiMeasurementDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKPIMeasurementDevice_Status() {
		return (EAttribute) kpiMeasurementDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKPIMeasurementDevice_LastCalculation() {
		return (EAttribute) kpiMeasurementDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKPIMeasurementDevice_NextCalculation() {
		return (EAttribute) kpiMeasurementDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKPIMeasurementDevice_Parameter() {
		return (EReference) kpiMeasurementDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKPIMeasurementDevice__CheckStatusCRITICAL__DiagnosticChain_Map() {
		return kpiMeasurementDeviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKPIMeasurementDevice__CheckStatusWARN__DiagnosticChain_Map() {
		return kpiMeasurementDeviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKPIMeasurementDevice__CalculationDateComparison__DiagnosticChain_Map() {
		return kpiMeasurementDeviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasis() {
		return basisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasis_Description() {
		return (EAttribute) basisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasis_PrincipleType() {
		return (EAttribute) basisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasis_Source() {
		return (EAttribute) basisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoalReferenceValue() {
		return goalReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGoalReferenceValue_Basis() {
		return (EReference) goalReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregatedValue() {
		return aggregatedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregatedValue_Aggregator() {
		return (EAttribute) aggregatedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAggregatedValue_AggregatedTime() {
		return (EAttribute) aggregatedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Type() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Value() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Unit() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Goalreferencevalue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ObservedValue() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Component() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Kpimeasurementdevice() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_Collected() {
		return (EAttribute) dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_ProducedTime() {
		return (EAttribute) dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_ConsumedTime() {
		return (EAttribute) dataValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataValue__CheckConsumedTimeProducedTime__DiagnosticChain_Map() {
		return dataValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataValue__CheckConsumedTimeSet__DiagnosticChain_Map() {
		return dataValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Component() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Category() {
		return (EReference) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Indicator() {
		return (EReference) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfrastructureComponent() {
		return infrastructureComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_IsPartOf() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_ComposedOf() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_Location() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_Produces() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_Parameter() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfrastructureComponent_Device() {
		return (EReference) infrastructureComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInfrastructureComponent__CheckNotPartOfItself__DiagnosticChain_Map() {
		return infrastructureComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInfrastructureComponent__NameHasPrefixInitialOfProject__DiagnosticChain_Map() {
		return infrastructureComponentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Lat() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocation_Long() {
		return (EAttribute) locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLocation__LatLongInRange__DiagnosticChain_Map() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBuildingComponent() {
		return buildingComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransportationComponent() {
		return transportationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentalComponent() {
		return environmentalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmartCity() {
		return smartCityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCity_Category() {
		return (EReference) smartCityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSmartCity_Project() {
		return (EReference) smartCityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_SDG() {
		return (EAttribute) categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCategory__CheckSDGNumber__DiagnosticChain_Map() {
		return categoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Type() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDevice__CheckParameterType__DiagnosticChain_Map() {
		return deviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrincipleType() {
		return principleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperation() {
		return operationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParameterType() {
		return parameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScmlFactory getScmlFactory() {
		return (ScmlFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		kpiMeasurementDeviceEClass = createEClass(KPI_MEASUREMENT_DEVICE);
		createEAttribute(kpiMeasurementDeviceEClass, KPI_MEASUREMENT_DEVICE__STATUS);
		createEAttribute(kpiMeasurementDeviceEClass, KPI_MEASUREMENT_DEVICE__LAST_CALCULATION);
		createEAttribute(kpiMeasurementDeviceEClass, KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION);
		createEReference(kpiMeasurementDeviceEClass, KPI_MEASUREMENT_DEVICE__PARAMETER);
		createEOperation(kpiMeasurementDeviceEClass,
				KPI_MEASUREMENT_DEVICE___CALCULATION_DATE_COMPARISON__DIAGNOSTICCHAIN_MAP);
		createEOperation(kpiMeasurementDeviceEClass, KPI_MEASUREMENT_DEVICE___CHECK_STATUS_WARN__DIAGNOSTICCHAIN_MAP);
		createEOperation(kpiMeasurementDeviceEClass,
				KPI_MEASUREMENT_DEVICE___CHECK_STATUS_CRITICAL__DIAGNOSTICCHAIN_MAP);

		basisEClass = createEClass(BASIS);
		createEAttribute(basisEClass, BASIS__DESCRIPTION);
		createEAttribute(basisEClass, BASIS__PRINCIPLE_TYPE);
		createEAttribute(basisEClass, BASIS__SOURCE);

		goalReferenceValueEClass = createEClass(GOAL_REFERENCE_VALUE);
		createEReference(goalReferenceValueEClass, GOAL_REFERENCE_VALUE__BASIS);

		aggregatedValueEClass = createEClass(AGGREGATED_VALUE);
		createEAttribute(aggregatedValueEClass, AGGREGATED_VALUE__AGGREGATOR);
		createEAttribute(aggregatedValueEClass, AGGREGATED_VALUE__AGGREGATED_TIME);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__TYPE);
		createEAttribute(dataEClass, DATA__VALUE);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__UNIT);
		createEReference(parameterEClass, PARAMETER__GOALREFERENCEVALUE);
		createEReference(parameterEClass, PARAMETER__OBSERVED_VALUE);
		createEReference(parameterEClass, PARAMETER__COMPONENT);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__KPIMEASUREMENTDEVICE);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__COLLECTED);
		createEAttribute(dataValueEClass, DATA_VALUE__PRODUCED_TIME);
		createEAttribute(dataValueEClass, DATA_VALUE__CONSUMED_TIME);
		createEOperation(dataValueEClass, DATA_VALUE___CHECK_CONSUMED_TIME_PRODUCED_TIME__DIAGNOSTICCHAIN_MAP);
		createEOperation(dataValueEClass, DATA_VALUE___CHECK_CONSUMED_TIME_SET__DIAGNOSTICCHAIN_MAP);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__COMPONENT);
		createEReference(projectEClass, PROJECT__CATEGORY);
		createEReference(projectEClass, PROJECT__INDICATOR);

		infrastructureComponentEClass = createEClass(INFRASTRUCTURE_COMPONENT);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__IS_PART_OF);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__COMPOSED_OF);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__LOCATION);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__PRODUCES);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__PARAMETER);
		createEReference(infrastructureComponentEClass, INFRASTRUCTURE_COMPONENT__DEVICE);
		createEOperation(infrastructureComponentEClass,
				INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP);
		createEOperation(infrastructureComponentEClass,
				INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LAT);
		createEAttribute(locationEClass, LOCATION__LONG);
		createEOperation(locationEClass, LOCATION___LAT_LONG_IN_RANGE__DIAGNOSTICCHAIN_MAP);

		buildingComponentEClass = createEClass(BUILDING_COMPONENT);

		transportationComponentEClass = createEClass(TRANSPORTATION_COMPONENT);

		environmentalComponentEClass = createEClass(ENVIRONMENTAL_COMPONENT);

		smartCityEClass = createEClass(SMART_CITY);
		createEReference(smartCityEClass, SMART_CITY__CATEGORY);
		createEReference(smartCityEClass, SMART_CITY__PROJECT);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__SDG);
		createEOperation(categoryEClass, CATEGORY___CHECK_SDG_NUMBER__DIAGNOSTICCHAIN_MAP);

		sensorEClass = createEClass(SENSOR);

		actuatorEClass = createEClass(ACTUATOR);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEOperation(deviceEClass, DEVICE___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		principleTypeEEnum = createEEnum(PRINCIPLE_TYPE);
		dataTypeEEnum = createEEnum(DATA_TYPE);
		operationEEnum = createEEnum(OPERATION);
		parameterTypeEEnum = createEEnum(PARAMETER_TYPE);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kpiMeasurementDeviceEClass.getESuperTypes().add(this.getNamedElement());
		goalReferenceValueEClass.getESuperTypes().add(this.getData());
		aggregatedValueEClass.getESuperTypes().add(this.getData());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		dataValueEClass.getESuperTypes().add(this.getData());
		projectEClass.getESuperTypes().add(this.getNamedElement());
		infrastructureComponentEClass.getESuperTypes().add(this.getNamedElement());
		buildingComponentEClass.getESuperTypes().add(this.getInfrastructureComponent());
		transportationComponentEClass.getESuperTypes().add(this.getInfrastructureComponent());
		environmentalComponentEClass.getESuperTypes().add(this.getInfrastructureComponent());
		smartCityEClass.getESuperTypes().add(this.getNamedElement());
		categoryEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getDevice());
		actuatorEClass.getESuperTypes().add(this.getDevice());
		deviceEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kpiMeasurementDeviceEClass, KPIMeasurementDevice.class, "KPIMeasurementDevice", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKPIMeasurementDevice_Status(), this.getStatus(), "status", null, 1, 1,
				KPIMeasurementDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKPIMeasurementDevice_LastCalculation(), ecorePackage.getEString(), "lastCalculation", null, 0,
				-1, KPIMeasurementDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKPIMeasurementDevice_NextCalculation(), ecorePackage.getEString(), "nextCalculation", null, 1,
				1, KPIMeasurementDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPIMeasurementDevice_Parameter(), this.getParameter(),
				this.getParameter_Kpimeasurementdevice(), "parameter", null, 1, 1, KPIMeasurementDevice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getKPIMeasurementDevice__CalculationDateComparison__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "calculationDateComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getKPIMeasurementDevice__CheckStatusWARN__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkStatusWARN", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getKPIMeasurementDevice__CheckStatusCRITICAL__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "checkStatusCRITICAL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basisEClass, Basis.class, "Basis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasis_Description(), ecorePackage.getEString(), "description", null, 1, 1, Basis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasis_PrincipleType(), this.getPrincipleType(), "principleType", null, 1, 1, Basis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasis_Source(), ecorePackage.getEString(), "source", null, 1, 1, Basis.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalReferenceValueEClass, GoalReferenceValue.class, "GoalReferenceValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalReferenceValue_Basis(), this.getBasis(), null, "basis", null, 1, 1,
				GoalReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedValueEClass, AggregatedValue.class, "AggregatedValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregatedValue_Aggregator(), this.getOperation(), "aggregator", "SUM", 1, 1,
				AggregatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregatedValue_AggregatedTime(), ecorePackage.getEString(), "aggregatedTime", null, 1, 1,
				AggregatedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Type(), this.getDataType(), "type", null, 1, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_Value(), ecorePackage.getEString(), "value", null, 1, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Unit(), ecorePackage.getEString(), "unit", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Goalreferencevalue(), this.getGoalReferenceValue(), null, "goalreferencevalue",
				null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ObservedValue(), this.getAggregatedValue(), null, "observedValue", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Component(), this.getInfrastructureComponent(), null, "component", null, 1, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Kpimeasurementdevice(), this.getKPIMeasurementDevice(),
				this.getKPIMeasurementDevice_Parameter(), "kpimeasurementdevice", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Collected(), ecorePackage.getEBoolean(), "collected", null, 1, 1, DataValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_ProducedTime(), ecorePackage.getEString(), "producedTime", null, 1, 1,
				DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataValue_ConsumedTime(), ecorePackage.getEString(), "consumedTime", null, 0, 1,
				DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataValue__CheckConsumedTimeProducedTime__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "checkConsumedTimeProducedTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataValue__CheckConsumedTimeSet__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkConsumedTimeSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Component(), this.getInfrastructureComponent(), null, "component", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Category(), this.getCategory(), null, "category", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Indicator(), this.getKPIMeasurementDevice(), null, "indicator", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureComponentEClass, InfrastructureComponent.class, "InfrastructureComponent", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureComponent_IsPartOf(), this.getInfrastructureComponent(),
				this.getInfrastructureComponent_ComposedOf(), "isPartOf", null, 0, 1, InfrastructureComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_ComposedOf(), this.getInfrastructureComponent(),
				this.getInfrastructureComponent_IsPartOf(), "composedOf", null, 0, -1, InfrastructureComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_Location(), this.getLocation(), null, "location", null, 1, 1,
				InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_Produces(), this.getDataValue(), null, "produces", null, 0, -1,
				InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_Parameter(), this.getParameter(), null, "parameter", null, 1, 1,
				InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfrastructureComponent_Device(), this.getDevice(), null, "device", null, 0, -1,
				InfrastructureComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInfrastructureComponent__CheckNotPartOfItself__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "checkNotPartOfItself", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInfrastructureComponent__NameHasPrefixInitialOfProject__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "nameHasPrefixInitialOfProject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Lat(), ecorePackage.getEFloat(), "Lat", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Long(), ecorePackage.getEFloat(), "Long", null, 1, 1, Location.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocation__LatLongInRange__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"latLongInRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buildingComponentEClass, BuildingComponent.class, "BuildingComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportationComponentEClass, TransportationComponent.class, "TransportationComponent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentalComponentEClass, EnvironmentalComponent.class, "EnvironmentalComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smartCityEClass, SmartCity.class, "SmartCity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartCity_Category(), this.getCategory(), null, "category", null, 0, -1, SmartCity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartCity_Project(), this.getProject(), null, "project", null, 0, -1, SmartCity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_SDG(), ecorePackage.getEInt(), "SDG", null, 1, -1, Category.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCategory__CheckSDGNumber__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkSDGNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Type(), this.getParameterType(), "type", null, 1, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDevice__CheckParameterType__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"checkParameterType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.GOOD);
		addEEnumLiteral(statusEEnum, Status.WARN);
		addEEnumLiteral(statusEEnum, Status.CRITICAL);

		initEEnum(principleTypeEEnum, PrincipleType.class, "PrincipleType");
		addEEnumLiteral(principleTypeEEnum, PrincipleType.LAW);
		addEEnumLiteral(principleTypeEEnum, PrincipleType.STANDARD);
		addEEnumLiteral(principleTypeEEnum, PrincipleType.POLICY);

		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.STRING);
		addEEnumLiteral(dataTypeEEnum, DataType.BOOL);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.FLOAT);

		initEEnum(operationEEnum, Operation.class, "Operation");
		addEEnumLiteral(operationEEnum, Operation.SUM);
		addEEnumLiteral(operationEEnum, Operation.DIFF);
		addEEnumLiteral(operationEEnum, Operation.AVG);
		addEEnumLiteral(operationEEnum, Operation.MIN);
		addEEnumLiteral(operationEEnum, Operation.MAX);

		initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
		addEEnumLiteral(parameterTypeEEnum, ParameterType.AIRQUALITY);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.WEATHER);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.TRAFFIC);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.ENERGY);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.AGRICULTURAL);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.NAVIGATION);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.WASTEMANAGEMENT);
		addEEnumLiteral(parameterTypeEEnum, ParameterType.SAFETY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(kpiMeasurementDeviceEClass, source, new String[] { "constraints", "checkStatusCRITICAL" });
		addAnnotation(dataValueEClass, source, new String[] { "constraints", "checkConsumedTimeSet" });
		addAnnotation(infrastructureComponentEClass, source,
				new String[] { "constraints", "nameHasPrefixInitialOfProject" });
		addAnnotation(locationEClass, source, new String[] { "constraints", "latLongInRange" });
		addAnnotation(categoryEClass, source, new String[] { "constraints", "checkSDGNumber" });
		addAnnotation(deviceEClass, source, new String[] { "constraints", "checkParameterType" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getKPIMeasurementDevice__CalculationDateComparison__DiagnosticChain_Map(), source, new String[] {
				"body",
				"   ------ 1. explicit constraint ---------\n\t\tself.lastCalculation -> forAll(d | d < self.nextCalculation)" });
		addAnnotation(getKPIMeasurementDevice__CheckStatusWARN__DiagnosticChain_Map(), source, new String[] { "body",
				"            ------ 2. explicit constraint ---------\n\t\t(\n\t\t\tself.parameter.observedValue <> null and \n\t\t\tself.status=Status::WARN and \n\t\t\tself.parameter.observedValue.type = DataType::INTEGER and\n\t\t\tself.parameter.goalreferencevalue.type = DataType::INTEGER\n\t\t) implies\n\t\t(\n\t\t\t(self.parameter.observedValue.value.toInteger() >= (self.parameter.goalreferencevalue.value.toInteger() * (1-0.25))) or \n\t\t\t(self.parameter.observedValue.value.toInteger() <= (self.parameter.goalreferencevalue.value.toInteger() * (1+0.25)))\n\t\t)" });
		addAnnotation(getKPIMeasurementDevice__CheckStatusCRITICAL__DiagnosticChain_Map(), source, new String[] {
				"body",
				"      ------ 3. explicit constraint ---------\n\t\t(\n\t\t\tself.parameter.observedValue <> null and \n\t\t\tself.status=Status::CRITICAL and \n\t\t\tself.parameter.observedValue.type = DataType::INTEGER and\n\t\t\tself.parameter.goalreferencevalue.type = DataType::INTEGER\n\t\t) implies\n\t\t(self.parameter.observedValue.value.toInteger() > (self.parameter.goalreferencevalue.value.toInteger() * (1+0.25)))" });
		addAnnotation(getDataValue__CheckConsumedTimeProducedTime__DiagnosticChain_Map(), source, new String[] { "body",
				"      --------- 3. explicit constraint ---------\n\t\tself.consumedTime <> null implies self.consumedTime > self.producedTime" });
		addAnnotation(getDataValue__CheckConsumedTimeSet__DiagnosticChain_Map(), source, new String[] { "body",
				"      --------- 3. explicit constraint ---------\n\t\tself.consumedTime <> null implies self.collected = true" });
		addAnnotation(getInfrastructureComponent__CheckNotPartOfItself__DiagnosticChain_Map(), source, new String[] {
				"body",
				"             --------- 3. implicit constraint ---------\n\t\tself.composedOf -> excludes(self) and self.isPartOf -> excludes(self)" });
		addAnnotation(getInfrastructureComponent__NameHasPrefixInitialOfProject__DiagnosticChain_Map(), source,
				new String[] { "body",
						"     ------ 4. implicit constraint ---------\n\t\tself.oclContainer().oclIsTypeOf(Project) implies\n\t\tself.name.at(1) = self.oclContainer().oclAsType(Project).name.at(1) and\n\t\t(self.oclContainer().oclAsType(Project).name.indexOf(\' \') <> 0 implies\n\t\tself.name.at(2) = self.oclContainer().oclAsType(Project).name.at(self.oclContainer().oclAsType(Project).name.indexOf(\' \') + 1))" });
		addAnnotation(getLocation__LatLongInRange__DiagnosticChain_Map(), source, new String[] { "body",
				"       ------ 4. explicit constraint ---------\n\t\tself.Lat >= (-90) and self.Lat <= 90 and self.Long >= (-180) and self.Long <= 180" });
		addAnnotation(getCategory__CheckSDGNumber__DiagnosticChain_Map(), source, new String[] { "body",
				"      ------ 1. implicit constraint ---------\n\t\t(self.SDG -> size() < 18) and\n\t\t(self.SDG -> forAll(s | s < 18 and s > 0))" });
		addAnnotation(getDevice__CheckParameterType__DiagnosticChain_Map(), source, new String[] { "body",
				"     ------ 5. implicit constraint ---------\n\t\tself.oclContainer().oclAsType(InfrastructureComponent).parameter.type = self.type" });
	}

} //ScmlPackageImpl
