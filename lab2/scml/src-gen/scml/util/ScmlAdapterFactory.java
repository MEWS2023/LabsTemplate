/**
 */
package scml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import scml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see scml.ScmlPackage
 * @generated
 */
public class ScmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScmlSwitch<Adapter> modelSwitch = new ScmlSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseKPIMeasurementDevice(KPIMeasurementDevice object) {
			return createKPIMeasurementDeviceAdapter();
		}

		@Override
		public Adapter caseBasis(Basis object) {
			return createBasisAdapter();
		}

		@Override
		public Adapter caseGoalReferenceValue(GoalReferenceValue object) {
			return createGoalReferenceValueAdapter();
		}

		@Override
		public Adapter caseAggregatedValue(AggregatedValue object) {
			return createAggregatedValueAdapter();
		}

		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseDataValue(DataValue object) {
			return createDataValueAdapter();
		}

		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseInfrastructureComponent(InfrastructureComponent object) {
			return createInfrastructureComponentAdapter();
		}

		@Override
		public Adapter caseLocation(Location object) {
			return createLocationAdapter();
		}

		@Override
		public Adapter caseBuildingComponent(BuildingComponent object) {
			return createBuildingComponentAdapter();
		}

		@Override
		public Adapter caseTransportationComponent(TransportationComponent object) {
			return createTransportationComponentAdapter();
		}

		@Override
		public Adapter caseEnvironmentalComponent(EnvironmentalComponent object) {
			return createEnvironmentalComponentAdapter();
		}

		@Override
		public Adapter caseSmartCity(SmartCity object) {
			return createSmartCityAdapter();
		}

		@Override
		public Adapter caseCategory(Category object) {
			return createCategoryAdapter();
		}

		@Override
		public Adapter caseSensor(Sensor object) {
			return createSensorAdapter();
		}

		@Override
		public Adapter caseActuator(Actuator object) {
			return createActuatorAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.KPIMeasurementDevice <em>KPI Measurement Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.KPIMeasurementDevice
	 * @generated
	 */
	public Adapter createKPIMeasurementDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Basis <em>Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Basis
	 * @generated
	 */
	public Adapter createBasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.GoalReferenceValue <em>Goal Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.GoalReferenceValue
	 * @generated
	 */
	public Adapter createGoalReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.AggregatedValue <em>Aggregated Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.AggregatedValue
	 * @generated
	 */
	public Adapter createAggregatedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.InfrastructureComponent <em>Infrastructure Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.InfrastructureComponent
	 * @generated
	 */
	public Adapter createInfrastructureComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.BuildingComponent <em>Building Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.BuildingComponent
	 * @generated
	 */
	public Adapter createBuildingComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.TransportationComponent <em>Transportation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.TransportationComponent
	 * @generated
	 */
	public Adapter createTransportationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.EnvironmentalComponent <em>Environmental Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.EnvironmentalComponent
	 * @generated
	 */
	public Adapter createEnvironmentalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.SmartCity <em>Smart City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.SmartCity
	 * @generated
	 */
	public Adapter createSmartCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Actuator
	 * @generated
	 */
	public Adapter createActuatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link scml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see scml.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ScmlAdapterFactory
