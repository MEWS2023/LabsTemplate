/**
 */
package scml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see scml.ScmlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ScmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/scml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScmlPackage eINSTANCE = scml.impl.ScmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link scml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.NamedElementImpl
	 * @see scml.impl.ScmlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scml.impl.KPIMeasurementDeviceImpl <em>KPI Measurement Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.KPIMeasurementDeviceImpl
	 * @see scml.impl.ScmlPackageImpl#getKPIMeasurementDevice()
	 * @generated
	 */
	int KPI_MEASUREMENT_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE__STATUS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Calculation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE__LAST_CALCULATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE__PARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>KPI Measurement Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Check Status CRITICAL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE___CHECK_STATUS_CRITICAL__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Has Parameter Prefix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE___NAME_HAS_PARAMETER_PREFIX__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Status WARN</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE___CHECK_STATUS_WARN__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Status GOOD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE___CHECK_STATUS_GOOD__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Calculation Date Comparison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE___CALCULATION_DATE_COMPARISON__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>KPI Measurement Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_MEASUREMENT_DEVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link scml.impl.BasisImpl <em>Basis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.BasisImpl
	 * @see scml.impl.ScmlPackageImpl#getBasis()
	 * @generated
	 */
	int BASIS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Principle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS__PRINCIPLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Basis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scml.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.DataImpl
	 * @see scml.impl.ScmlPackageImpl#getData()
	 * @generated
	 */
	int DATA = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link scml.impl.GoalReferenceValueImpl <em>Goal Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.GoalReferenceValueImpl
	 * @see scml.impl.ScmlPackageImpl#getGoalReferenceValue()
	 * @generated
	 */
	int GOAL_REFERENCE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFERENCE_VALUE__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFERENCE_VALUE__VALUE = DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFERENCE_VALUE__BASIS = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFERENCE_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Goal Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFERENCE_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.AggregatedValueImpl <em>Aggregated Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.AggregatedValueImpl
	 * @see scml.impl.ScmlPackageImpl#getAggregatedValue()
	 * @generated
	 */
	int AGGREGATED_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__VALUE = DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Aggregator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__AGGREGATOR = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregated Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE__AGGREGATED_TIME = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Aggregated Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.ParameterImpl
	 * @see scml.impl.ScmlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goalreferencevalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__GOALREFERENCEVALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Observed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OBSERVED_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.DataValueImpl <em>Data Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.DataValueImpl
	 * @see scml.impl.ScmlPackageImpl#getDataValue()
	 * @generated
	 */
	int DATA_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__VALUE = DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__COLLECTED = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Produced Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__PRODUCED_TIME = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Consumed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE__CONSUMED_TIME = DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_FEATURE_COUNT = DATA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Check Consumed Time Produced Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE___CHECK_CONSUMED_TIME_PRODUCED_TIME__DIAGNOSTICCHAIN_MAP = DATA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Consumed Time Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE___CHECK_CONSUMED_TIME_SET__DIAGNOSTICCHAIN_MAP = DATA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_VALUE_OPERATION_COUNT = DATA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link scml.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.ProjectImpl
	 * @see scml.impl.ScmlPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INDICATOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.InfrastructureComponentImpl
	 * @see scml.impl.ScmlPackageImpl#getInfrastructureComponent()
	 * @generated
	 */
	int INFRASTRUCTURE_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__IS_PART_OF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__COMPOSED_OF = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__PRODUCES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__PARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT__DEVICE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Infrastructure Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Not Part Of Itself</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Name Has Prefix Initial Of Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Infrastructure Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link scml.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.LocationImpl
	 * @see scml.impl.ScmlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 10;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONG = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Lat Long In Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LAT_LONG_IN_RANGE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link scml.impl.BuildingComponentImpl <em>Building Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.BuildingComponentImpl
	 * @see scml.impl.ScmlPackageImpl#getBuildingComponent()
	 * @generated
	 */
	int BUILDING_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__IS_PART_OF = INFRASTRUCTURE_COMPONENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__COMPOSED_OF = INFRASTRUCTURE_COMPONENT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__LOCATION = INFRASTRUCTURE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__PRODUCES = INFRASTRUCTURE_COMPONENT__PRODUCES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__PARAMETER = INFRASTRUCTURE_COMPONENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT__DEVICE = INFRASTRUCTURE_COMPONENT__DEVICE;

	/**
	 * The number of structural features of the '<em>Building Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Not Part Of Itself</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Has Prefix Initial Of Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Building Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_COMPONENT_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.TransportationComponentImpl <em>Transportation Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.TransportationComponentImpl
	 * @see scml.impl.ScmlPackageImpl#getTransportationComponent()
	 * @generated
	 */
	int TRANSPORTATION_COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__IS_PART_OF = INFRASTRUCTURE_COMPONENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__COMPOSED_OF = INFRASTRUCTURE_COMPONENT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__LOCATION = INFRASTRUCTURE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__PRODUCES = INFRASTRUCTURE_COMPONENT__PRODUCES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__PARAMETER = INFRASTRUCTURE_COMPONENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT__DEVICE = INFRASTRUCTURE_COMPONENT__DEVICE;

	/**
	 * The number of structural features of the '<em>Transportation Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Not Part Of Itself</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Has Prefix Initial Of Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Transportation Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTATION_COMPONENT_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.EnvironmentalComponentImpl <em>Environmental Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.EnvironmentalComponentImpl
	 * @see scml.impl.ScmlPackageImpl#getEnvironmentalComponent()
	 * @generated
	 */
	int ENVIRONMENTAL_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__NAME = INFRASTRUCTURE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__IS_PART_OF = INFRASTRUCTURE_COMPONENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Composed Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__COMPOSED_OF = INFRASTRUCTURE_COMPONENT__COMPOSED_OF;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__LOCATION = INFRASTRUCTURE_COMPONENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__PRODUCES = INFRASTRUCTURE_COMPONENT__PRODUCES;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__PARAMETER = INFRASTRUCTURE_COMPONENT__PARAMETER;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT__DEVICE = INFRASTRUCTURE_COMPONENT__DEVICE;

	/**
	 * The number of structural features of the '<em>Environmental Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT_FEATURE_COUNT = INFRASTRUCTURE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Not Part Of Itself</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Name Has Prefix Initial Of Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP = INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Environmental Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_COMPONENT_OPERATION_COUNT = INFRASTRUCTURE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.SmartCityImpl <em>Smart City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.SmartCityImpl
	 * @see scml.impl.ScmlPackageImpl#getSmartCity()
	 * @generated
	 */
	int SMART_CITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Smart City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Smart City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_CITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.CategoryImpl
	 * @see scml.impl.ScmlPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SDG</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SDG = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check SDG Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___CHECK_SDG_NUMBER__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link scml.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.DeviceImpl
	 * @see scml.impl.ScmlPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Parameter Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link scml.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.SensorImpl
	 * @see scml.impl.ScmlPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = DEVICE__TYPE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Parameter Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP = DEVICE___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.impl.ActuatorImpl
	 * @see scml.impl.ScmlPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE__TYPE;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Parameter Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP = DEVICE___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link scml.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.Status
	 * @see scml.impl.ScmlPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 19;

	/**
	 * The meta object id for the '{@link scml.PrincipleType <em>Principle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.PrincipleType
	 * @see scml.impl.ScmlPackageImpl#getPrincipleType()
	 * @generated
	 */
	int PRINCIPLE_TYPE = 20;

	/**
	 * The meta object id for the '{@link scml.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.DataType
	 * @see scml.impl.ScmlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 21;

	/**
	 * The meta object id for the '{@link scml.Operation <em>Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.Operation
	 * @see scml.impl.ScmlPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 22;

	/**
	 * The meta object id for the '{@link scml.ParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see scml.ParameterType
	 * @see scml.impl.ScmlPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 23;

	/**
	 * Returns the meta object for class '{@link scml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see scml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link scml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see scml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link scml.KPIMeasurementDevice <em>KPI Measurement Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI Measurement Device</em>'.
	 * @see scml.KPIMeasurementDevice
	 * @generated
	 */
	EClass getKPIMeasurementDevice();

	/**
	 * Returns the meta object for the attribute '{@link scml.KPIMeasurementDevice#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see scml.KPIMeasurementDevice#getStatus()
	 * @see #getKPIMeasurementDevice()
	 * @generated
	 */
	EAttribute getKPIMeasurementDevice_Status();

	/**
	 * Returns the meta object for the attribute list '{@link scml.KPIMeasurementDevice#getLastCalculation <em>Last Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Last Calculation</em>'.
	 * @see scml.KPIMeasurementDevice#getLastCalculation()
	 * @see #getKPIMeasurementDevice()
	 * @generated
	 */
	EAttribute getKPIMeasurementDevice_LastCalculation();

	/**
	 * Returns the meta object for the attribute '{@link scml.KPIMeasurementDevice#getNextCalculation <em>Next Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Calculation</em>'.
	 * @see scml.KPIMeasurementDevice#getNextCalculation()
	 * @see #getKPIMeasurementDevice()
	 * @generated
	 */
	EAttribute getKPIMeasurementDevice_NextCalculation();

	/**
	 * Returns the meta object for the reference '{@link scml.KPIMeasurementDevice#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see scml.KPIMeasurementDevice#getParameter()
	 * @see #getKPIMeasurementDevice()
	 * @generated
	 */
	EReference getKPIMeasurementDevice_Parameter();

	/**
	 * Returns the meta object for the '{@link scml.KPIMeasurementDevice#checkStatusCRITICAL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Status CRITICAL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Status CRITICAL</em>' operation.
	 * @see scml.KPIMeasurementDevice#checkStatusCRITICAL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKPIMeasurementDevice__CheckStatusCRITICAL__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.KPIMeasurementDevice#nameHasParameterPrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Has Parameter Prefix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Has Parameter Prefix</em>' operation.
	 * @see scml.KPIMeasurementDevice#nameHasParameterPrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKPIMeasurementDevice__NameHasParameterPrefix__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.KPIMeasurementDevice#checkStatusWARN(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Status WARN</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Status WARN</em>' operation.
	 * @see scml.KPIMeasurementDevice#checkStatusWARN(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKPIMeasurementDevice__CheckStatusWARN__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.KPIMeasurementDevice#checkStatusGOOD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Status GOOD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Status GOOD</em>' operation.
	 * @see scml.KPIMeasurementDevice#checkStatusGOOD(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKPIMeasurementDevice__CheckStatusGOOD__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.KPIMeasurementDevice#calculationDateComparison(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Calculation Date Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculation Date Comparison</em>' operation.
	 * @see scml.KPIMeasurementDevice#calculationDateComparison(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getKPIMeasurementDevice__CalculationDateComparison__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link scml.Basis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basis</em>'.
	 * @see scml.Basis
	 * @generated
	 */
	EClass getBasis();

	/**
	 * Returns the meta object for the attribute '{@link scml.Basis#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see scml.Basis#getDescription()
	 * @see #getBasis()
	 * @generated
	 */
	EAttribute getBasis_Description();

	/**
	 * Returns the meta object for the attribute '{@link scml.Basis#getPrincipleType <em>Principle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principle Type</em>'.
	 * @see scml.Basis#getPrincipleType()
	 * @see #getBasis()
	 * @generated
	 */
	EAttribute getBasis_PrincipleType();

	/**
	 * Returns the meta object for the attribute '{@link scml.Basis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see scml.Basis#getSource()
	 * @see #getBasis()
	 * @generated
	 */
	EAttribute getBasis_Source();

	/**
	 * Returns the meta object for class '{@link scml.GoalReferenceValue <em>Goal Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Reference Value</em>'.
	 * @see scml.GoalReferenceValue
	 * @generated
	 */
	EClass getGoalReferenceValue();

	/**
	 * Returns the meta object for the containment reference '{@link scml.GoalReferenceValue#getBasis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basis</em>'.
	 * @see scml.GoalReferenceValue#getBasis()
	 * @see #getGoalReferenceValue()
	 * @generated
	 */
	EReference getGoalReferenceValue_Basis();

	/**
	 * Returns the meta object for class '{@link scml.AggregatedValue <em>Aggregated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Value</em>'.
	 * @see scml.AggregatedValue
	 * @generated
	 */
	EClass getAggregatedValue();

	/**
	 * Returns the meta object for the attribute '{@link scml.AggregatedValue#getAggregator <em>Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregator</em>'.
	 * @see scml.AggregatedValue#getAggregator()
	 * @see #getAggregatedValue()
	 * @generated
	 */
	EAttribute getAggregatedValue_Aggregator();

	/**
	 * Returns the meta object for the attribute '{@link scml.AggregatedValue#getAggregatedTime <em>Aggregated Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregated Time</em>'.
	 * @see scml.AggregatedValue#getAggregatedTime()
	 * @see #getAggregatedValue()
	 * @generated
	 */
	EAttribute getAggregatedValue_AggregatedTime();

	/**
	 * Returns the meta object for class '{@link scml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see scml.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link scml.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scml.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the attribute '{@link scml.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see scml.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for class '{@link scml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see scml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link scml.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see scml.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link scml.Parameter#getGoalreferencevalue <em>Goalreferencevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goalreferencevalue</em>'.
	 * @see scml.Parameter#getGoalreferencevalue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Goalreferencevalue();

	/**
	 * Returns the meta object for the containment reference '{@link scml.Parameter#getObservedValue <em>Observed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observed Value</em>'.
	 * @see scml.Parameter#getObservedValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ObservedValue();

	/**
	 * Returns the meta object for the reference '{@link scml.Parameter#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see scml.Parameter#getComponent()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Component();

	/**
	 * Returns the meta object for the attribute '{@link scml.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scml.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link scml.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Value</em>'.
	 * @see scml.DataValue
	 * @generated
	 */
	EClass getDataValue();

	/**
	 * Returns the meta object for the attribute '{@link scml.DataValue#isCollected <em>Collected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collected</em>'.
	 * @see scml.DataValue#isCollected()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_Collected();

	/**
	 * Returns the meta object for the attribute '{@link scml.DataValue#getProducedTime <em>Produced Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produced Time</em>'.
	 * @see scml.DataValue#getProducedTime()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_ProducedTime();

	/**
	 * Returns the meta object for the attribute '{@link scml.DataValue#getConsumedTime <em>Consumed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumed Time</em>'.
	 * @see scml.DataValue#getConsumedTime()
	 * @see #getDataValue()
	 * @generated
	 */
	EAttribute getDataValue_ConsumedTime();

	/**
	 * Returns the meta object for the '{@link scml.DataValue#checkConsumedTimeProducedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Consumed Time Produced Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Consumed Time Produced Time</em>' operation.
	 * @see scml.DataValue#checkConsumedTimeProducedTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataValue__CheckConsumedTimeProducedTime__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.DataValue#checkConsumedTimeSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Consumed Time Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Consumed Time Set</em>' operation.
	 * @see scml.DataValue#checkConsumedTimeSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDataValue__CheckConsumedTimeSet__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link scml.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see scml.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.Project#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see scml.Project#getComponent()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Component();

	/**
	 * Returns the meta object for the reference list '{@link scml.Project#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see scml.Project#getCategory()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.Project#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indicator</em>'.
	 * @see scml.Project#getIndicator()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Indicator();

	/**
	 * Returns the meta object for class '{@link scml.InfrastructureComponent <em>Infrastructure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Component</em>'.
	 * @see scml.InfrastructureComponent
	 * @generated
	 */
	EClass getInfrastructureComponent();

	/**
	 * Returns the meta object for the reference '{@link scml.InfrastructureComponent#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of</em>'.
	 * @see scml.InfrastructureComponent#getIsPartOf()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_IsPartOf();

	/**
	 * Returns the meta object for the reference list '{@link scml.InfrastructureComponent#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composed Of</em>'.
	 * @see scml.InfrastructureComponent#getComposedOf()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_ComposedOf();

	/**
	 * Returns the meta object for the containment reference '{@link scml.InfrastructureComponent#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see scml.InfrastructureComponent#getLocation()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.InfrastructureComponent#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produces</em>'.
	 * @see scml.InfrastructureComponent#getProduces()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_Produces();

	/**
	 * Returns the meta object for the containment reference '{@link scml.InfrastructureComponent#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see scml.InfrastructureComponent#getParameter()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.InfrastructureComponent#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see scml.InfrastructureComponent#getDevice()
	 * @see #getInfrastructureComponent()
	 * @generated
	 */
	EReference getInfrastructureComponent_Device();

	/**
	 * Returns the meta object for the '{@link scml.InfrastructureComponent#checkNotPartOfItself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Not Part Of Itself</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Not Part Of Itself</em>' operation.
	 * @see scml.InfrastructureComponent#checkNotPartOfItself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInfrastructureComponent__CheckNotPartOfItself__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link scml.InfrastructureComponent#nameHasPrefixInitialOfProject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Name Has Prefix Initial Of Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Has Prefix Initial Of Project</em>' operation.
	 * @see scml.InfrastructureComponent#nameHasPrefixInitialOfProject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInfrastructureComponent__NameHasPrefixInitialOfProject__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link scml.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see scml.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link scml.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see scml.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link scml.Location#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see scml.Location#getLong()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Long();

	/**
	 * Returns the meta object for the '{@link scml.Location#latLongInRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Lat Long In Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lat Long In Range</em>' operation.
	 * @see scml.Location#latLongInRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLocation__LatLongInRange__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link scml.BuildingComponent <em>Building Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building Component</em>'.
	 * @see scml.BuildingComponent
	 * @generated
	 */
	EClass getBuildingComponent();

	/**
	 * Returns the meta object for class '{@link scml.TransportationComponent <em>Transportation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportation Component</em>'.
	 * @see scml.TransportationComponent
	 * @generated
	 */
	EClass getTransportationComponent();

	/**
	 * Returns the meta object for class '{@link scml.EnvironmentalComponent <em>Environmental Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Component</em>'.
	 * @see scml.EnvironmentalComponent
	 * @generated
	 */
	EClass getEnvironmentalComponent();

	/**
	 * Returns the meta object for class '{@link scml.SmartCity <em>Smart City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart City</em>'.
	 * @see scml.SmartCity
	 * @generated
	 */
	EClass getSmartCity();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.SmartCity#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see scml.SmartCity#getCategory()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link scml.SmartCity#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see scml.SmartCity#getProject()
	 * @see #getSmartCity()
	 * @generated
	 */
	EReference getSmartCity_Project();

	/**
	 * Returns the meta object for class '{@link scml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see scml.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute list '{@link scml.Category#getSDG <em>SDG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>SDG</em>'.
	 * @see scml.Category#getSDG()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_SDG();

	/**
	 * Returns the meta object for the '{@link scml.Category#checkSDGNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check SDG Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check SDG Number</em>' operation.
	 * @see scml.Category#checkSDGNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCategory__CheckSDGNumber__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link scml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see scml.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link scml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see scml.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link scml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see scml.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link scml.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see scml.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the '{@link scml.Device#checkParameterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Check Parameter Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Parameter Type</em>' operation.
	 * @see scml.Device#checkParameterType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDevice__CheckParameterType__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link scml.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see scml.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link scml.PrincipleType <em>Principle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Principle Type</em>'.
	 * @see scml.PrincipleType
	 * @generated
	 */
	EEnum getPrincipleType();

	/**
	 * Returns the meta object for enum '{@link scml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see scml.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link scml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation</em>'.
	 * @see scml.Operation
	 * @generated
	 */
	EEnum getOperation();

	/**
	 * Returns the meta object for enum '{@link scml.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see scml.ParameterType
	 * @generated
	 */
	EEnum getParameterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScmlFactory getScmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link scml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.NamedElementImpl
		 * @see scml.impl.ScmlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link scml.impl.KPIMeasurementDeviceImpl <em>KPI Measurement Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.KPIMeasurementDeviceImpl
		 * @see scml.impl.ScmlPackageImpl#getKPIMeasurementDevice()
		 * @generated
		 */
		EClass KPI_MEASUREMENT_DEVICE = eINSTANCE.getKPIMeasurementDevice();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MEASUREMENT_DEVICE__STATUS = eINSTANCE.getKPIMeasurementDevice_Status();

		/**
		 * The meta object literal for the '<em><b>Last Calculation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MEASUREMENT_DEVICE__LAST_CALCULATION = eINSTANCE.getKPIMeasurementDevice_LastCalculation();

		/**
		 * The meta object literal for the '<em><b>Next Calculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION = eINSTANCE.getKPIMeasurementDevice_NextCalculation();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_MEASUREMENT_DEVICE__PARAMETER = eINSTANCE.getKPIMeasurementDevice_Parameter();

		/**
		 * The meta object literal for the '<em><b>Check Status CRITICAL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI_MEASUREMENT_DEVICE___CHECK_STATUS_CRITICAL__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getKPIMeasurementDevice__CheckStatusCRITICAL__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Has Parameter Prefix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI_MEASUREMENT_DEVICE___NAME_HAS_PARAMETER_PREFIX__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getKPIMeasurementDevice__NameHasParameterPrefix__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Check Status WARN</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI_MEASUREMENT_DEVICE___CHECK_STATUS_WARN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getKPIMeasurementDevice__CheckStatusWARN__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Check Status GOOD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI_MEASUREMENT_DEVICE___CHECK_STATUS_GOOD__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getKPIMeasurementDevice__CheckStatusGOOD__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Calculation Date Comparison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KPI_MEASUREMENT_DEVICE___CALCULATION_DATE_COMPARISON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getKPIMeasurementDevice__CalculationDateComparison__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.impl.BasisImpl <em>Basis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.BasisImpl
		 * @see scml.impl.ScmlPackageImpl#getBasis()
		 * @generated
		 */
		EClass BASIS = eINSTANCE.getBasis();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIS__DESCRIPTION = eINSTANCE.getBasis_Description();

		/**
		 * The meta object literal for the '<em><b>Principle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIS__PRINCIPLE_TYPE = eINSTANCE.getBasis_PrincipleType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIS__SOURCE = eINSTANCE.getBasis_Source();

		/**
		 * The meta object literal for the '{@link scml.impl.GoalReferenceValueImpl <em>Goal Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.GoalReferenceValueImpl
		 * @see scml.impl.ScmlPackageImpl#getGoalReferenceValue()
		 * @generated
		 */
		EClass GOAL_REFERENCE_VALUE = eINSTANCE.getGoalReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Basis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_REFERENCE_VALUE__BASIS = eINSTANCE.getGoalReferenceValue_Basis();

		/**
		 * The meta object literal for the '{@link scml.impl.AggregatedValueImpl <em>Aggregated Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.AggregatedValueImpl
		 * @see scml.impl.ScmlPackageImpl#getAggregatedValue()
		 * @generated
		 */
		EClass AGGREGATED_VALUE = eINSTANCE.getAggregatedValue();

		/**
		 * The meta object literal for the '<em><b>Aggregator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE__AGGREGATOR = eINSTANCE.getAggregatedValue_Aggregator();

		/**
		 * The meta object literal for the '<em><b>Aggregated Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_VALUE__AGGREGATED_TIME = eINSTANCE.getAggregatedValue_AggregatedTime();

		/**
		 * The meta object literal for the '{@link scml.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.DataImpl
		 * @see scml.impl.ScmlPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '{@link scml.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.ParameterImpl
		 * @see scml.impl.ScmlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '<em><b>Goalreferencevalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__GOALREFERENCEVALUE = eINSTANCE.getParameter_Goalreferencevalue();

		/**
		 * The meta object literal for the '<em><b>Observed Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OBSERVED_VALUE = eINSTANCE.getParameter_ObservedValue();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__COMPONENT = eINSTANCE.getParameter_Component();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link scml.impl.DataValueImpl <em>Data Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.DataValueImpl
		 * @see scml.impl.ScmlPackageImpl#getDataValue()
		 * @generated
		 */
		EClass DATA_VALUE = eINSTANCE.getDataValue();

		/**
		 * The meta object literal for the '<em><b>Collected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__COLLECTED = eINSTANCE.getDataValue_Collected();

		/**
		 * The meta object literal for the '<em><b>Produced Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__PRODUCED_TIME = eINSTANCE.getDataValue_ProducedTime();

		/**
		 * The meta object literal for the '<em><b>Consumed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_VALUE__CONSUMED_TIME = eINSTANCE.getDataValue_ConsumedTime();

		/**
		 * The meta object literal for the '<em><b>Check Consumed Time Produced Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_VALUE___CHECK_CONSUMED_TIME_PRODUCED_TIME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDataValue__CheckConsumedTimeProducedTime__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Check Consumed Time Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_VALUE___CHECK_CONSUMED_TIME_SET__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDataValue__CheckConsumedTimeSet__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.ProjectImpl
		 * @see scml.impl.ScmlPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPONENT = eINSTANCE.getProject_Component();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CATEGORY = eINSTANCE.getProject_Category();

		/**
		 * The meta object literal for the '<em><b>Indicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__INDICATOR = eINSTANCE.getProject_Indicator();

		/**
		 * The meta object literal for the '{@link scml.impl.InfrastructureComponentImpl <em>Infrastructure Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.InfrastructureComponentImpl
		 * @see scml.impl.ScmlPackageImpl#getInfrastructureComponent()
		 * @generated
		 */
		EClass INFRASTRUCTURE_COMPONENT = eINSTANCE.getInfrastructureComponent();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__IS_PART_OF = eINSTANCE.getInfrastructureComponent_IsPartOf();

		/**
		 * The meta object literal for the '<em><b>Composed Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__COMPOSED_OF = eINSTANCE.getInfrastructureComponent_ComposedOf();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__LOCATION = eINSTANCE.getInfrastructureComponent_Location();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__PRODUCES = eINSTANCE.getInfrastructureComponent_Produces();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__PARAMETER = eINSTANCE.getInfrastructureComponent_Parameter();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_COMPONENT__DEVICE = eINSTANCE.getInfrastructureComponent_Device();

		/**
		 * The meta object literal for the '<em><b>Check Not Part Of Itself</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getInfrastructureComponent__CheckNotPartOfItself__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Name Has Prefix Initial Of Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getInfrastructureComponent__NameHasPrefixInitialOfProject__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.LocationImpl
		 * @see scml.impl.ScmlPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONG = eINSTANCE.getLocation_Long();

		/**
		 * The meta object literal for the '<em><b>Lat Long In Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___LAT_LONG_IN_RANGE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLocation__LatLongInRange__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.impl.BuildingComponentImpl <em>Building Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.BuildingComponentImpl
		 * @see scml.impl.ScmlPackageImpl#getBuildingComponent()
		 * @generated
		 */
		EClass BUILDING_COMPONENT = eINSTANCE.getBuildingComponent();

		/**
		 * The meta object literal for the '{@link scml.impl.TransportationComponentImpl <em>Transportation Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.TransportationComponentImpl
		 * @see scml.impl.ScmlPackageImpl#getTransportationComponent()
		 * @generated
		 */
		EClass TRANSPORTATION_COMPONENT = eINSTANCE.getTransportationComponent();

		/**
		 * The meta object literal for the '{@link scml.impl.EnvironmentalComponentImpl <em>Environmental Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.EnvironmentalComponentImpl
		 * @see scml.impl.ScmlPackageImpl#getEnvironmentalComponent()
		 * @generated
		 */
		EClass ENVIRONMENTAL_COMPONENT = eINSTANCE.getEnvironmentalComponent();

		/**
		 * The meta object literal for the '{@link scml.impl.SmartCityImpl <em>Smart City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.SmartCityImpl
		 * @see scml.impl.ScmlPackageImpl#getSmartCity()
		 * @generated
		 */
		EClass SMART_CITY = eINSTANCE.getSmartCity();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY__CATEGORY = eINSTANCE.getSmartCity_Category();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_CITY__PROJECT = eINSTANCE.getSmartCity_Project();

		/**
		 * The meta object literal for the '{@link scml.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.CategoryImpl
		 * @see scml.impl.ScmlPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>SDG</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__SDG = eINSTANCE.getCategory_SDG();

		/**
		 * The meta object literal for the '<em><b>Check SDG Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CATEGORY___CHECK_SDG_NUMBER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCategory__CheckSDGNumber__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.SensorImpl
		 * @see scml.impl.ScmlPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link scml.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.ActuatorImpl
		 * @see scml.impl.ScmlPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link scml.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.impl.DeviceImpl
		 * @see scml.impl.ScmlPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Check Parameter Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___CHECK_PARAMETER_TYPE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDevice__CheckParameterType__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link scml.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.Status
		 * @see scml.impl.ScmlPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link scml.PrincipleType <em>Principle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.PrincipleType
		 * @see scml.impl.ScmlPackageImpl#getPrincipleType()
		 * @generated
		 */
		EEnum PRINCIPLE_TYPE = eINSTANCE.getPrincipleType();

		/**
		 * The meta object literal for the '{@link scml.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.DataType
		 * @see scml.impl.ScmlPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link scml.Operation <em>Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.Operation
		 * @see scml.impl.ScmlPackageImpl#getOperation()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link scml.ParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see scml.ParameterType
		 * @see scml.impl.ScmlPackageImpl#getParameterType()
		 * @generated
		 */
		EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

	}

} //ScmlPackage
