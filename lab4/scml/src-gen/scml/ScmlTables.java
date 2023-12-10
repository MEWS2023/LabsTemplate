/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /scml/model/scml.ecore
 * using:
 *   /scml/model/scml.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package scml;

import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
// import scml.ScmlPackage;
// import scml.ScmlTables;

/**
 * ScmlTables provides the dispatch tables for the scml for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ScmlTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ScmlPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_scml = IdManager.getNsURIPackageId("http://www.example.org/scml", null, ScmlPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AggregatedValue = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("AggregatedValue", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Basis = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Basis", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Category = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Category", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = ScmlTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DataValue = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("DataValue", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Device = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Device", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_GoalReferenceValue = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("GoalReferenceValue", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_InfrastructureComponent = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("InfrastructureComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_KPIMeasurementDevice = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("KPIMeasurementDevice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = ScmlTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Project = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("Project", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SmartCity = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getClassId("SmartCity", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = ScmlTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = ScmlTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DataType = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getEnumerationId("DataType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Operation = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getEnumerationId("Operation");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ParameterType = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getEnumerationId("ParameterType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PrincipleType = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getEnumerationId("PrincipleType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Status = ScmlTables.PACKid_http_c_s_s_www_example_org_s_scml.getEnumerationId("Status");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_18 = ValueUtil.integerValueOf("18");
	public static final /*@NonInvalid*/ IntegerValue INT_180 = ValueUtil.integerValueOf("180");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ IntegerValue INT_90 = ValueUtil.integerValueOf("90");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ RealValue REA_0_25 = ValueUtil.realValueOf("0.25");
	public static final /*@NonInvalid*/ String STR__32 = " ";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Parameter = TypeId.BAG.getSpecializedId(ScmlTables.CLSSid_Parameter, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Project = TypeId.BAG.getSpecializedId(ScmlTables.CLSSid_Project, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_CRITICAL = ScmlTables.ENUMid_Status.getEnumerationLiteralId("CRITICAL");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_INTEGER = ScmlTables.ENUMid_DataType.getEnumerationLiteralId("INTEGER");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_WARN = ScmlTables.ENUMid_Status.getEnumerationLiteralId("WARN");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Category = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_Category, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DataValue = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_DataValue, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Device = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_Device, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_InfrastructureComponent = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_InfrastructureComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_KPIMeasurementDevice = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_KPIMeasurementDevice, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Project = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.CLSSid_Project, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_DATAid_EInt = TypeId.ORDERED_SET.getSpecializedId(ScmlTables.DATAid_EInt, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_InfrastructureComponent = TypeId.SET.getSpecializedId(ScmlTables.CLSSid_InfrastructureComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ScmlTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Actuator = new EcoreExecutorType(ScmlPackage.Literals.ACTUATOR, PACKAGE, 0);
		public static final EcoreExecutorType _AggregatedValue = new EcoreExecutorType(ScmlPackage.Literals.AGGREGATED_VALUE, PACKAGE, 0);
		public static final EcoreExecutorType _Basis = new EcoreExecutorType(ScmlPackage.Literals.BASIS, PACKAGE, 0);
		public static final EcoreExecutorType _BuildingComponent = new EcoreExecutorType(ScmlPackage.Literals.BUILDING_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _Category = new EcoreExecutorType(ScmlPackage.Literals.CATEGORY, PACKAGE, 0);
		public static final EcoreExecutorType _Data = new EcoreExecutorType(ScmlPackage.Literals.DATA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _DataType = new EcoreExecutorEnumeration(ScmlPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _DataValue = new EcoreExecutorType(ScmlPackage.Literals.DATA_VALUE, PACKAGE, 0);
		public static final EcoreExecutorType _Device = new EcoreExecutorType(ScmlPackage.Literals.DEVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _EnvironmentalComponent = new EcoreExecutorType(ScmlPackage.Literals.ENVIRONMENTAL_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _GoalReferenceValue = new EcoreExecutorType(ScmlPackage.Literals.GOAL_REFERENCE_VALUE, PACKAGE, 0);
		public static final EcoreExecutorType _InfrastructureComponent = new EcoreExecutorType(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _KPIMeasurementDevice = new EcoreExecutorType(ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(ScmlPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(ScmlPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _Operation = new EcoreExecutorEnumeration(ScmlPackage.Literals.OPERATION, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(ScmlPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ParameterType = new EcoreExecutorEnumeration(ScmlPackage.Literals.PARAMETER_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PrincipleType = new EcoreExecutorEnumeration(ScmlPackage.Literals.PRINCIPLE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Project = new EcoreExecutorType(ScmlPackage.Literals.PROJECT, PACKAGE, 0);
		public static final EcoreExecutorType _Sensor = new EcoreExecutorType(ScmlPackage.Literals.SENSOR, PACKAGE, 0);
		public static final EcoreExecutorType _SmartCity = new EcoreExecutorType(ScmlPackage.Literals.SMART_CITY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Status = new EcoreExecutorEnumeration(ScmlPackage.Literals.STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _TransportationComponent = new EcoreExecutorType(ScmlPackage.Literals.TRANSPORTATION_COMPONENT, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Actuator,
			_AggregatedValue,
			_Basis,
			_BuildingComponent,
			_Category,
			_Data,
			_DataType,
			_DataValue,
			_Device,
			_EnvironmentalComponent,
			_GoalReferenceValue,
			_InfrastructureComponent,
			_KPIMeasurementDevice,
			_Location,
			_NamedElement,
			_Operation,
			_Parameter,
			_ParameterType,
			_PrincipleType,
			_Project,
			_Sensor,
			_SmartCity,
			_Status,
			_TransportationComponent
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Actuator__Actuator = new ExecutorFragment(Types._Actuator, ScmlTables.Types._Actuator);
		private static final ExecutorFragment _Actuator__Device = new ExecutorFragment(Types._Actuator, ScmlTables.Types._Device);
		private static final ExecutorFragment _Actuator__NamedElement = new ExecutorFragment(Types._Actuator, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Actuator__OclAny = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Actuator__OclElement = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _AggregatedValue__AggregatedValue = new ExecutorFragment(Types._AggregatedValue, ScmlTables.Types._AggregatedValue);
		private static final ExecutorFragment _AggregatedValue__Data = new ExecutorFragment(Types._AggregatedValue, ScmlTables.Types._Data);
		private static final ExecutorFragment _AggregatedValue__OclAny = new ExecutorFragment(Types._AggregatedValue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AggregatedValue__OclElement = new ExecutorFragment(Types._AggregatedValue, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Basis__Basis = new ExecutorFragment(Types._Basis, ScmlTables.Types._Basis);
		private static final ExecutorFragment _Basis__OclAny = new ExecutorFragment(Types._Basis, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Basis__OclElement = new ExecutorFragment(Types._Basis, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _BuildingComponent__BuildingComponent = new ExecutorFragment(Types._BuildingComponent, ScmlTables.Types._BuildingComponent);
		private static final ExecutorFragment _BuildingComponent__InfrastructureComponent = new ExecutorFragment(Types._BuildingComponent, ScmlTables.Types._InfrastructureComponent);
		private static final ExecutorFragment _BuildingComponent__NamedElement = new ExecutorFragment(Types._BuildingComponent, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _BuildingComponent__OclAny = new ExecutorFragment(Types._BuildingComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BuildingComponent__OclElement = new ExecutorFragment(Types._BuildingComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Category__Category = new ExecutorFragment(Types._Category, ScmlTables.Types._Category);
		private static final ExecutorFragment _Category__NamedElement = new ExecutorFragment(Types._Category, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Category__OclAny = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Category__OclElement = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Data__Data = new ExecutorFragment(Types._Data, ScmlTables.Types._Data);
		private static final ExecutorFragment _Data__OclAny = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Data__OclElement = new ExecutorFragment(Types._Data, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, ScmlTables.Types._DataType);
		private static final ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DataType__OclEnumeration = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _DataValue__Data = new ExecutorFragment(Types._DataValue, ScmlTables.Types._Data);
		private static final ExecutorFragment _DataValue__DataValue = new ExecutorFragment(Types._DataValue, ScmlTables.Types._DataValue);
		private static final ExecutorFragment _DataValue__OclAny = new ExecutorFragment(Types._DataValue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DataValue__OclElement = new ExecutorFragment(Types._DataValue, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Device__Device = new ExecutorFragment(Types._Device, ScmlTables.Types._Device);
		private static final ExecutorFragment _Device__NamedElement = new ExecutorFragment(Types._Device, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Device__OclAny = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Device__OclElement = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EnvironmentalComponent__EnvironmentalComponent = new ExecutorFragment(Types._EnvironmentalComponent, ScmlTables.Types._EnvironmentalComponent);
		private static final ExecutorFragment _EnvironmentalComponent__InfrastructureComponent = new ExecutorFragment(Types._EnvironmentalComponent, ScmlTables.Types._InfrastructureComponent);
		private static final ExecutorFragment _EnvironmentalComponent__NamedElement = new ExecutorFragment(Types._EnvironmentalComponent, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _EnvironmentalComponent__OclAny = new ExecutorFragment(Types._EnvironmentalComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EnvironmentalComponent__OclElement = new ExecutorFragment(Types._EnvironmentalComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _GoalReferenceValue__Data = new ExecutorFragment(Types._GoalReferenceValue, ScmlTables.Types._Data);
		private static final ExecutorFragment _GoalReferenceValue__GoalReferenceValue = new ExecutorFragment(Types._GoalReferenceValue, ScmlTables.Types._GoalReferenceValue);
		private static final ExecutorFragment _GoalReferenceValue__OclAny = new ExecutorFragment(Types._GoalReferenceValue, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _GoalReferenceValue__OclElement = new ExecutorFragment(Types._GoalReferenceValue, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _InfrastructureComponent__InfrastructureComponent = new ExecutorFragment(Types._InfrastructureComponent, ScmlTables.Types._InfrastructureComponent);
		private static final ExecutorFragment _InfrastructureComponent__NamedElement = new ExecutorFragment(Types._InfrastructureComponent, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _InfrastructureComponent__OclAny = new ExecutorFragment(Types._InfrastructureComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _InfrastructureComponent__OclElement = new ExecutorFragment(Types._InfrastructureComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _KPIMeasurementDevice__KPIMeasurementDevice = new ExecutorFragment(Types._KPIMeasurementDevice, ScmlTables.Types._KPIMeasurementDevice);
		private static final ExecutorFragment _KPIMeasurementDevice__NamedElement = new ExecutorFragment(Types._KPIMeasurementDevice, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _KPIMeasurementDevice__OclAny = new ExecutorFragment(Types._KPIMeasurementDevice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _KPIMeasurementDevice__OclElement = new ExecutorFragment(Types._KPIMeasurementDevice, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, ScmlTables.Types._Location);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Operation__OclEnumeration = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Operation__OclType = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, ScmlTables.Types._Operation);

		private static final ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, ScmlTables.Types._Parameter);

		private static final ExecutorFragment _ParameterType__OclAny = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ParameterType__OclElement = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ParameterType__OclEnumeration = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ParameterType__OclType = new ExecutorFragment(Types._ParameterType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _ParameterType__ParameterType = new ExecutorFragment(Types._ParameterType, ScmlTables.Types._ParameterType);

		private static final ExecutorFragment _PrincipleType__OclAny = new ExecutorFragment(Types._PrincipleType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PrincipleType__OclElement = new ExecutorFragment(Types._PrincipleType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PrincipleType__OclEnumeration = new ExecutorFragment(Types._PrincipleType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PrincipleType__OclType = new ExecutorFragment(Types._PrincipleType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PrincipleType__PrincipleType = new ExecutorFragment(Types._PrincipleType, ScmlTables.Types._PrincipleType);

		private static final ExecutorFragment _Project__NamedElement = new ExecutorFragment(Types._Project, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Project__OclAny = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Project__OclElement = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Project__Project = new ExecutorFragment(Types._Project, ScmlTables.Types._Project);

		private static final ExecutorFragment _Sensor__Device = new ExecutorFragment(Types._Sensor, ScmlTables.Types._Device);
		private static final ExecutorFragment _Sensor__NamedElement = new ExecutorFragment(Types._Sensor, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, ScmlTables.Types._Sensor);

		private static final ExecutorFragment _SmartCity__NamedElement = new ExecutorFragment(Types._SmartCity, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _SmartCity__OclAny = new ExecutorFragment(Types._SmartCity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SmartCity__OclElement = new ExecutorFragment(Types._SmartCity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SmartCity__SmartCity = new ExecutorFragment(Types._SmartCity, ScmlTables.Types._SmartCity);

		private static final ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Status__OclEnumeration = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Status__OclType = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, ScmlTables.Types._Status);

		private static final ExecutorFragment _TransportationComponent__InfrastructureComponent = new ExecutorFragment(Types._TransportationComponent, ScmlTables.Types._InfrastructureComponent);
		private static final ExecutorFragment _TransportationComponent__NamedElement = new ExecutorFragment(Types._TransportationComponent, ScmlTables.Types._NamedElement);
		private static final ExecutorFragment _TransportationComponent__OclAny = new ExecutorFragment(Types._TransportationComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TransportationComponent__OclElement = new ExecutorFragment(Types._TransportationComponent, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TransportationComponent__TransportationComponent = new ExecutorFragment(Types._TransportationComponent, ScmlTables.Types._TransportationComponent);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _AggregatedValue__aggregatedTime = new EcoreExecutorProperty(ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATED_TIME, Types._AggregatedValue, 0);
		public static final ExecutorProperty _AggregatedValue__aggregator = new EcoreExecutorProperty(ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATOR, Types._AggregatedValue, 1);
		public static final ExecutorProperty _AggregatedValue__Parameter__observedValue = new ExecutorPropertyWithImplementation("Parameter", Types._AggregatedValue, 2, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PARAMETER__OBSERVED_VALUE));

		public static final ExecutorProperty _Basis__description = new EcoreExecutorProperty(ScmlPackage.Literals.BASIS__DESCRIPTION, Types._Basis, 0);
		public static final ExecutorProperty _Basis__principleType = new EcoreExecutorProperty(ScmlPackage.Literals.BASIS__PRINCIPLE_TYPE, Types._Basis, 1);
		public static final ExecutorProperty _Basis__source = new EcoreExecutorProperty(ScmlPackage.Literals.BASIS__SOURCE, Types._Basis, 2);
		public static final ExecutorProperty _Basis__GoalReferenceValue__basis = new ExecutorPropertyWithImplementation("GoalReferenceValue", Types._Basis, 3, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.GOAL_REFERENCE_VALUE__BASIS));

		public static final ExecutorProperty _Category__SDG = new EcoreExecutorProperty(ScmlPackage.Literals.CATEGORY__SDG, Types._Category, 0);
		public static final ExecutorProperty _Category__Project__category = new ExecutorPropertyWithImplementation("Project", Types._Category, 1, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PROJECT__CATEGORY));
		public static final ExecutorProperty _Category__SmartCity__category = new ExecutorPropertyWithImplementation("SmartCity", Types._Category, 2, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.SMART_CITY__CATEGORY));

		public static final ExecutorProperty _Data__type = new EcoreExecutorProperty(ScmlPackage.Literals.DATA__TYPE, Types._Data, 0);
		public static final ExecutorProperty _Data__value = new EcoreExecutorProperty(ScmlPackage.Literals.DATA__VALUE, Types._Data, 1);

		public static final ExecutorProperty _DataValue__collected = new EcoreExecutorProperty(ScmlPackage.Literals.DATA_VALUE__COLLECTED, Types._DataValue, 0);
		public static final ExecutorProperty _DataValue__consumedTime = new EcoreExecutorProperty(ScmlPackage.Literals.DATA_VALUE__CONSUMED_TIME, Types._DataValue, 1);
		public static final ExecutorProperty _DataValue__producedTime = new EcoreExecutorProperty(ScmlPackage.Literals.DATA_VALUE__PRODUCED_TIME, Types._DataValue, 2);
		public static final ExecutorProperty _DataValue__InfrastructureComponent__produces = new ExecutorPropertyWithImplementation("InfrastructureComponent", Types._DataValue, 3, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__PRODUCES));

		public static final ExecutorProperty _Device__type = new EcoreExecutorProperty(ScmlPackage.Literals.DEVICE__TYPE, Types._Device, 0);
		public static final ExecutorProperty _Device__InfrastructureComponent__device = new ExecutorPropertyWithImplementation("InfrastructureComponent", Types._Device, 1, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__DEVICE));

		public static final ExecutorProperty _GoalReferenceValue__basis = new EcoreExecutorProperty(ScmlPackage.Literals.GOAL_REFERENCE_VALUE__BASIS, Types._GoalReferenceValue, 0);
		public static final ExecutorProperty _GoalReferenceValue__Parameter__goalreferencevalue = new ExecutorPropertyWithImplementation("Parameter", Types._GoalReferenceValue, 1, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PARAMETER__GOALREFERENCEVALUE));

		public static final ExecutorProperty _InfrastructureComponent__composedOf = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__COMPOSED_OF, Types._InfrastructureComponent, 0);
		public static final ExecutorProperty _InfrastructureComponent__device = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__DEVICE, Types._InfrastructureComponent, 1);
		public static final ExecutorProperty _InfrastructureComponent__isPartOf = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__IS_PART_OF, Types._InfrastructureComponent, 2);
		public static final ExecutorProperty _InfrastructureComponent__location = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__LOCATION, Types._InfrastructureComponent, 3);
		public static final ExecutorProperty _InfrastructureComponent__parameter = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__PARAMETER, Types._InfrastructureComponent, 4);
		public static final ExecutorProperty _InfrastructureComponent__produces = new EcoreExecutorProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__PRODUCES, Types._InfrastructureComponent, 5);
		public static final ExecutorProperty _InfrastructureComponent__Parameter__component = new ExecutorPropertyWithImplementation("Parameter", Types._InfrastructureComponent, 6, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PARAMETER__COMPONENT));
		public static final ExecutorProperty _InfrastructureComponent__Project__component = new ExecutorPropertyWithImplementation("Project", Types._InfrastructureComponent, 7, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PROJECT__COMPONENT));

		public static final ExecutorProperty _KPIMeasurementDevice__lastCalculation = new EcoreExecutorProperty(ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION, Types._KPIMeasurementDevice, 0);
		public static final ExecutorProperty _KPIMeasurementDevice__nextCalculation = new EcoreExecutorProperty(ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION, Types._KPIMeasurementDevice, 1);
		public static final ExecutorProperty _KPIMeasurementDevice__parameter = new EcoreExecutorProperty(ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE__PARAMETER, Types._KPIMeasurementDevice, 2);
		public static final ExecutorProperty _KPIMeasurementDevice__status = new EcoreExecutorProperty(ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE__STATUS, Types._KPIMeasurementDevice, 3);
		public static final ExecutorProperty _KPIMeasurementDevice__Project__indicator = new ExecutorPropertyWithImplementation("Project", Types._KPIMeasurementDevice, 4, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.PROJECT__INDICATOR));

		public static final ExecutorProperty _Location__Lat = new EcoreExecutorProperty(ScmlPackage.Literals.LOCATION__LAT, Types._Location, 0);
		public static final ExecutorProperty _Location__Long = new EcoreExecutorProperty(ScmlPackage.Literals.LOCATION__LONG, Types._Location, 1);
		public static final ExecutorProperty _Location__InfrastructureComponent__location = new ExecutorPropertyWithImplementation("InfrastructureComponent", Types._Location, 2, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__LOCATION));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(ScmlPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Parameter__component = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__COMPONENT, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__goalreferencevalue = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__GOALREFERENCEVALUE, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__kpimeasurementdevice = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__KPIMEASUREMENTDEVICE, Types._Parameter, 2);
		public static final ExecutorProperty _Parameter__observedValue = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__OBSERVED_VALUE, Types._Parameter, 3);
		public static final ExecutorProperty _Parameter__type = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__TYPE, Types._Parameter, 4);
		public static final ExecutorProperty _Parameter__unit = new EcoreExecutorProperty(ScmlPackage.Literals.PARAMETER__UNIT, Types._Parameter, 5);
		public static final ExecutorProperty _Parameter__InfrastructureComponent__parameter = new ExecutorPropertyWithImplementation("InfrastructureComponent", Types._Parameter, 6, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT__PARAMETER));

		public static final ExecutorProperty _Project__category = new EcoreExecutorProperty(ScmlPackage.Literals.PROJECT__CATEGORY, Types._Project, 0);
		public static final ExecutorProperty _Project__component = new EcoreExecutorProperty(ScmlPackage.Literals.PROJECT__COMPONENT, Types._Project, 1);
		public static final ExecutorProperty _Project__indicator = new EcoreExecutorProperty(ScmlPackage.Literals.PROJECT__INDICATOR, Types._Project, 2);
		public static final ExecutorProperty _Project__SmartCity__project = new ExecutorPropertyWithImplementation("SmartCity", Types._Project, 3, new EcoreLibraryOppositeProperty(ScmlPackage.Literals.SMART_CITY__PROJECT));

		public static final ExecutorProperty _SmartCity__category = new EcoreExecutorProperty(ScmlPackage.Literals.SMART_CITY__CATEGORY, Types._SmartCity, 0);
		public static final ExecutorProperty _SmartCity__project = new EcoreExecutorProperty(ScmlPackage.Literals.SMART_CITY__PROJECT, Types._SmartCity, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Actuator =
			{
				Fragments._Actuator__OclAny /* 0 */,
				Fragments._Actuator__OclElement /* 1 */,
				Fragments._Actuator__NamedElement /* 2 */,
				Fragments._Actuator__Device /* 3 */,
				Fragments._Actuator__Actuator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Actuator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AggregatedValue =
			{
				Fragments._AggregatedValue__OclAny /* 0 */,
				Fragments._AggregatedValue__OclElement /* 1 */,
				Fragments._AggregatedValue__Data /* 2 */,
				Fragments._AggregatedValue__AggregatedValue /* 3 */
			};
		private static final int /*@NonNull*/ [] __AggregatedValue = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Basis =
			{
				Fragments._Basis__OclAny /* 0 */,
				Fragments._Basis__OclElement /* 1 */,
				Fragments._Basis__Basis /* 2 */
			};
		private static final int /*@NonNull*/ [] __Basis = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BuildingComponent =
			{
				Fragments._BuildingComponent__OclAny /* 0 */,
				Fragments._BuildingComponent__OclElement /* 1 */,
				Fragments._BuildingComponent__NamedElement /* 2 */,
				Fragments._BuildingComponent__InfrastructureComponent /* 3 */,
				Fragments._BuildingComponent__BuildingComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __BuildingComponent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Category =
			{
				Fragments._Category__OclAny /* 0 */,
				Fragments._Category__OclElement /* 1 */,
				Fragments._Category__NamedElement /* 2 */,
				Fragments._Category__Category /* 3 */
			};
		private static final int /*@NonNull*/ [] __Category = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Data =
			{
				Fragments._Data__OclAny /* 0 */,
				Fragments._Data__OclElement /* 1 */,
				Fragments._Data__Data /* 2 */
			};
		private static final int /*@NonNull*/ [] __Data = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__OclEnumeration /* 3 */,
				Fragments._DataType__DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] __DataType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DataValue =
			{
				Fragments._DataValue__OclAny /* 0 */,
				Fragments._DataValue__OclElement /* 1 */,
				Fragments._DataValue__Data /* 2 */,
				Fragments._DataValue__DataValue /* 3 */
			};
		private static final int /*@NonNull*/ [] __DataValue = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Device =
			{
				Fragments._Device__OclAny /* 0 */,
				Fragments._Device__OclElement /* 1 */,
				Fragments._Device__NamedElement /* 2 */,
				Fragments._Device__Device /* 3 */
			};
		private static final int /*@NonNull*/ [] __Device = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EnvironmentalComponent =
			{
				Fragments._EnvironmentalComponent__OclAny /* 0 */,
				Fragments._EnvironmentalComponent__OclElement /* 1 */,
				Fragments._EnvironmentalComponent__NamedElement /* 2 */,
				Fragments._EnvironmentalComponent__InfrastructureComponent /* 3 */,
				Fragments._EnvironmentalComponent__EnvironmentalComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __EnvironmentalComponent = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _GoalReferenceValue =
			{
				Fragments._GoalReferenceValue__OclAny /* 0 */,
				Fragments._GoalReferenceValue__OclElement /* 1 */,
				Fragments._GoalReferenceValue__Data /* 2 */,
				Fragments._GoalReferenceValue__GoalReferenceValue /* 3 */
			};
		private static final int /*@NonNull*/ [] __GoalReferenceValue = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _InfrastructureComponent =
			{
				Fragments._InfrastructureComponent__OclAny /* 0 */,
				Fragments._InfrastructureComponent__OclElement /* 1 */,
				Fragments._InfrastructureComponent__NamedElement /* 2 */,
				Fragments._InfrastructureComponent__InfrastructureComponent /* 3 */
			};
		private static final int /*@NonNull*/ [] __InfrastructureComponent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _KPIMeasurementDevice =
			{
				Fragments._KPIMeasurementDevice__OclAny /* 0 */,
				Fragments._KPIMeasurementDevice__OclElement /* 1 */,
				Fragments._KPIMeasurementDevice__NamedElement /* 2 */,
				Fragments._KPIMeasurementDevice__KPIMeasurementDevice /* 3 */
			};
		private static final int /*@NonNull*/ [] __KPIMeasurementDevice = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__Location /* 2 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__OclType /* 2 */,
				Fragments._Operation__OclEnumeration /* 3 */,
				Fragments._Operation__Operation /* 4 */
			};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__NamedElement /* 2 */,
				Fragments._Parameter__Parameter /* 3 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ParameterType =
			{
				Fragments._ParameterType__OclAny /* 0 */,
				Fragments._ParameterType__OclElement /* 1 */,
				Fragments._ParameterType__OclType /* 2 */,
				Fragments._ParameterType__OclEnumeration /* 3 */,
				Fragments._ParameterType__ParameterType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ParameterType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PrincipleType =
			{
				Fragments._PrincipleType__OclAny /* 0 */,
				Fragments._PrincipleType__OclElement /* 1 */,
				Fragments._PrincipleType__OclType /* 2 */,
				Fragments._PrincipleType__OclEnumeration /* 3 */,
				Fragments._PrincipleType__PrincipleType /* 4 */
			};
		private static final int /*@NonNull*/ [] __PrincipleType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Project =
			{
				Fragments._Project__OclAny /* 0 */,
				Fragments._Project__OclElement /* 1 */,
				Fragments._Project__NamedElement /* 2 */,
				Fragments._Project__Project /* 3 */
			};
		private static final int /*@NonNull*/ [] __Project = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sensor =
			{
				Fragments._Sensor__OclAny /* 0 */,
				Fragments._Sensor__OclElement /* 1 */,
				Fragments._Sensor__NamedElement /* 2 */,
				Fragments._Sensor__Device /* 3 */,
				Fragments._Sensor__Sensor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SmartCity =
			{
				Fragments._SmartCity__OclAny /* 0 */,
				Fragments._SmartCity__OclElement /* 1 */,
				Fragments._SmartCity__NamedElement /* 2 */,
				Fragments._SmartCity__SmartCity /* 3 */
			};
		private static final int /*@NonNull*/ [] __SmartCity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Status =
			{
				Fragments._Status__OclAny /* 0 */,
				Fragments._Status__OclElement /* 1 */,
				Fragments._Status__OclType /* 2 */,
				Fragments._Status__OclEnumeration /* 3 */,
				Fragments._Status__Status /* 4 */
			};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TransportationComponent =
			{
				Fragments._TransportationComponent__OclAny /* 0 */,
				Fragments._TransportationComponent__OclElement /* 1 */,
				Fragments._TransportationComponent__NamedElement /* 2 */,
				Fragments._TransportationComponent__InfrastructureComponent /* 3 */,
				Fragments._TransportationComponent__TransportationComponent /* 4 */
			};
		private static final int /*@NonNull*/ [] __TransportationComponent = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actuator.initFragments(_Actuator, __Actuator);
			Types._AggregatedValue.initFragments(_AggregatedValue, __AggregatedValue);
			Types._Basis.initFragments(_Basis, __Basis);
			Types._BuildingComponent.initFragments(_BuildingComponent, __BuildingComponent);
			Types._Category.initFragments(_Category, __Category);
			Types._Data.initFragments(_Data, __Data);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._DataValue.initFragments(_DataValue, __DataValue);
			Types._Device.initFragments(_Device, __Device);
			Types._EnvironmentalComponent.initFragments(_EnvironmentalComponent, __EnvironmentalComponent);
			Types._GoalReferenceValue.initFragments(_GoalReferenceValue, __GoalReferenceValue);
			Types._InfrastructureComponent.initFragments(_InfrastructureComponent, __InfrastructureComponent);
			Types._KPIMeasurementDevice.initFragments(_KPIMeasurementDevice, __KPIMeasurementDevice);
			Types._Location.initFragments(_Location, __Location);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._ParameterType.initFragments(_ParameterType, __ParameterType);
			Types._PrincipleType.initFragments(_PrincipleType, __PrincipleType);
			Types._Project.initFragments(_Project, __Project);
			Types._Sensor.initFragments(_Sensor, __Sensor);
			Types._SmartCity.initFragments(_SmartCity, __SmartCity);
			Types._Status.initFragments(_Status, __Status);
			Types._TransportationComponent.initFragments(_TransportationComponent, __TransportationComponent);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Actuator = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AggregatedValue__AggregatedValue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AggregatedValue__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AggregatedValue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AggregatedValue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Basis__Basis = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Basis__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Basis__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _BuildingComponent__BuildingComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BuildingComponent__InfrastructureComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BuildingComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _BuildingComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BuildingComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Category__Category = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Data__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Data__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataType__DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DataValue__DataValue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataValue__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DataValue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DataValue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Device__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalComponent__EnvironmentalComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalComponent__InfrastructureComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EnvironmentalComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _GoalReferenceValue__GoalReferenceValue = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GoalReferenceValue__Data = {};
		private static final ExecutorOperation /*@NonNull*/ [] _GoalReferenceValue__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _GoalReferenceValue__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _InfrastructureComponent__InfrastructureComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfrastructureComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _InfrastructureComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _InfrastructureComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _KPIMeasurementDevice__KPIMeasurementDevice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KPIMeasurementDevice__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _KPIMeasurementDevice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _KPIMeasurementDevice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Operation__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__ParameterType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ParameterType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PrincipleType__PrincipleType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipleType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipleType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipleType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PrincipleType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Project__Project = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SmartCity__SmartCity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SmartCity__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SmartCity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SmartCity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TransportationComponent__TransportationComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportationComponent__InfrastructureComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportationComponent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportationComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TransportationComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initOperations(_Actuator__Actuator);
			Fragments._Actuator__Device.initOperations(_Actuator__Device);
			Fragments._Actuator__NamedElement.initOperations(_Actuator__NamedElement);
			Fragments._Actuator__OclAny.initOperations(_Actuator__OclAny);
			Fragments._Actuator__OclElement.initOperations(_Actuator__OclElement);

			Fragments._AggregatedValue__AggregatedValue.initOperations(_AggregatedValue__AggregatedValue);
			Fragments._AggregatedValue__Data.initOperations(_AggregatedValue__Data);
			Fragments._AggregatedValue__OclAny.initOperations(_AggregatedValue__OclAny);
			Fragments._AggregatedValue__OclElement.initOperations(_AggregatedValue__OclElement);

			Fragments._Basis__Basis.initOperations(_Basis__Basis);
			Fragments._Basis__OclAny.initOperations(_Basis__OclAny);
			Fragments._Basis__OclElement.initOperations(_Basis__OclElement);

			Fragments._BuildingComponent__BuildingComponent.initOperations(_BuildingComponent__BuildingComponent);
			Fragments._BuildingComponent__InfrastructureComponent.initOperations(_BuildingComponent__InfrastructureComponent);
			Fragments._BuildingComponent__NamedElement.initOperations(_BuildingComponent__NamedElement);
			Fragments._BuildingComponent__OclAny.initOperations(_BuildingComponent__OclAny);
			Fragments._BuildingComponent__OclElement.initOperations(_BuildingComponent__OclElement);

			Fragments._Category__Category.initOperations(_Category__Category);
			Fragments._Category__NamedElement.initOperations(_Category__NamedElement);
			Fragments._Category__OclAny.initOperations(_Category__OclAny);
			Fragments._Category__OclElement.initOperations(_Category__OclElement);

			Fragments._Data__Data.initOperations(_Data__Data);
			Fragments._Data__OclAny.initOperations(_Data__OclAny);
			Fragments._Data__OclElement.initOperations(_Data__OclElement);

			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclEnumeration.initOperations(_DataType__OclEnumeration);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);

			Fragments._DataValue__Data.initOperations(_DataValue__Data);
			Fragments._DataValue__DataValue.initOperations(_DataValue__DataValue);
			Fragments._DataValue__OclAny.initOperations(_DataValue__OclAny);
			Fragments._DataValue__OclElement.initOperations(_DataValue__OclElement);

			Fragments._Device__Device.initOperations(_Device__Device);
			Fragments._Device__NamedElement.initOperations(_Device__NamedElement);
			Fragments._Device__OclAny.initOperations(_Device__OclAny);
			Fragments._Device__OclElement.initOperations(_Device__OclElement);

			Fragments._EnvironmentalComponent__EnvironmentalComponent.initOperations(_EnvironmentalComponent__EnvironmentalComponent);
			Fragments._EnvironmentalComponent__InfrastructureComponent.initOperations(_EnvironmentalComponent__InfrastructureComponent);
			Fragments._EnvironmentalComponent__NamedElement.initOperations(_EnvironmentalComponent__NamedElement);
			Fragments._EnvironmentalComponent__OclAny.initOperations(_EnvironmentalComponent__OclAny);
			Fragments._EnvironmentalComponent__OclElement.initOperations(_EnvironmentalComponent__OclElement);

			Fragments._GoalReferenceValue__Data.initOperations(_GoalReferenceValue__Data);
			Fragments._GoalReferenceValue__GoalReferenceValue.initOperations(_GoalReferenceValue__GoalReferenceValue);
			Fragments._GoalReferenceValue__OclAny.initOperations(_GoalReferenceValue__OclAny);
			Fragments._GoalReferenceValue__OclElement.initOperations(_GoalReferenceValue__OclElement);

			Fragments._InfrastructureComponent__InfrastructureComponent.initOperations(_InfrastructureComponent__InfrastructureComponent);
			Fragments._InfrastructureComponent__NamedElement.initOperations(_InfrastructureComponent__NamedElement);
			Fragments._InfrastructureComponent__OclAny.initOperations(_InfrastructureComponent__OclAny);
			Fragments._InfrastructureComponent__OclElement.initOperations(_InfrastructureComponent__OclElement);

			Fragments._KPIMeasurementDevice__KPIMeasurementDevice.initOperations(_KPIMeasurementDevice__KPIMeasurementDevice);
			Fragments._KPIMeasurementDevice__NamedElement.initOperations(_KPIMeasurementDevice__NamedElement);
			Fragments._KPIMeasurementDevice__OclAny.initOperations(_KPIMeasurementDevice__OclAny);
			Fragments._KPIMeasurementDevice__OclElement.initOperations(_KPIMeasurementDevice__OclElement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__OclEnumeration.initOperations(_Operation__OclEnumeration);
			Fragments._Operation__OclType.initOperations(_Operation__OclType);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);

			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._ParameterType__OclAny.initOperations(_ParameterType__OclAny);
			Fragments._ParameterType__OclElement.initOperations(_ParameterType__OclElement);
			Fragments._ParameterType__OclEnumeration.initOperations(_ParameterType__OclEnumeration);
			Fragments._ParameterType__OclType.initOperations(_ParameterType__OclType);
			Fragments._ParameterType__ParameterType.initOperations(_ParameterType__ParameterType);

			Fragments._PrincipleType__OclAny.initOperations(_PrincipleType__OclAny);
			Fragments._PrincipleType__OclElement.initOperations(_PrincipleType__OclElement);
			Fragments._PrincipleType__OclEnumeration.initOperations(_PrincipleType__OclEnumeration);
			Fragments._PrincipleType__OclType.initOperations(_PrincipleType__OclType);
			Fragments._PrincipleType__PrincipleType.initOperations(_PrincipleType__PrincipleType);

			Fragments._Project__NamedElement.initOperations(_Project__NamedElement);
			Fragments._Project__OclAny.initOperations(_Project__OclAny);
			Fragments._Project__OclElement.initOperations(_Project__OclElement);
			Fragments._Project__Project.initOperations(_Project__Project);

			Fragments._Sensor__Device.initOperations(_Sensor__Device);
			Fragments._Sensor__NamedElement.initOperations(_Sensor__NamedElement);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);

			Fragments._SmartCity__NamedElement.initOperations(_SmartCity__NamedElement);
			Fragments._SmartCity__OclAny.initOperations(_SmartCity__OclAny);
			Fragments._SmartCity__OclElement.initOperations(_SmartCity__OclElement);
			Fragments._SmartCity__SmartCity.initOperations(_SmartCity__SmartCity);

			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__OclEnumeration.initOperations(_Status__OclEnumeration);
			Fragments._Status__OclType.initOperations(_Status__OclType);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._TransportationComponent__InfrastructureComponent.initOperations(_TransportationComponent__InfrastructureComponent);
			Fragments._TransportationComponent__NamedElement.initOperations(_TransportationComponent__NamedElement);
			Fragments._TransportationComponent__OclAny.initOperations(_TransportationComponent__OclAny);
			Fragments._TransportationComponent__OclElement.initOperations(_TransportationComponent__OclElement);
			Fragments._TransportationComponent__TransportationComponent.initOperations(_TransportationComponent__TransportationComponent);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Actuator = {
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Device__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AggregatedValue = {
			ScmlTables.Properties._AggregatedValue__aggregatedTime,
			ScmlTables.Properties._AggregatedValue__aggregator,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Data__type,
			ScmlTables.Properties._Data__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Basis = {
			ScmlTables.Properties._Basis__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Basis__principleType,
			ScmlTables.Properties._Basis__source
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BuildingComponent = {
			ScmlTables.Properties._InfrastructureComponent__composedOf,
			ScmlTables.Properties._InfrastructureComponent__device,
			ScmlTables.Properties._InfrastructureComponent__isPartOf,
			ScmlTables.Properties._InfrastructureComponent__location,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._InfrastructureComponent__parameter,
			ScmlTables.Properties._InfrastructureComponent__produces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Category = {
			ScmlTables.Properties._Category__SDG,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Data = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Data__type,
			ScmlTables.Properties._Data__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DataValue = {
			ScmlTables.Properties._DataValue__collected,
			ScmlTables.Properties._DataValue__consumedTime,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._DataValue__producedTime,
			ScmlTables.Properties._Data__type,
			ScmlTables.Properties._Data__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Device = {
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Device__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EnvironmentalComponent = {
			ScmlTables.Properties._InfrastructureComponent__composedOf,
			ScmlTables.Properties._InfrastructureComponent__device,
			ScmlTables.Properties._InfrastructureComponent__isPartOf,
			ScmlTables.Properties._InfrastructureComponent__location,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._InfrastructureComponent__parameter,
			ScmlTables.Properties._InfrastructureComponent__produces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _GoalReferenceValue = {
			ScmlTables.Properties._GoalReferenceValue__basis,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Data__type,
			ScmlTables.Properties._Data__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _InfrastructureComponent = {
			ScmlTables.Properties._InfrastructureComponent__composedOf,
			ScmlTables.Properties._InfrastructureComponent__device,
			ScmlTables.Properties._InfrastructureComponent__isPartOf,
			ScmlTables.Properties._InfrastructureComponent__location,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._InfrastructureComponent__parameter,
			ScmlTables.Properties._InfrastructureComponent__produces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _KPIMeasurementDevice = {
			ScmlTables.Properties._KPIMeasurementDevice__lastCalculation,
			ScmlTables.Properties._NamedElement__name,
			ScmlTables.Properties._KPIMeasurementDevice__nextCalculation,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._KPIMeasurementDevice__parameter,
			ScmlTables.Properties._KPIMeasurementDevice__status
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			ScmlTables.Properties._Location__Lat,
			ScmlTables.Properties._Location__Long,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Operation = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			ScmlTables.Properties._Parameter__component,
			ScmlTables.Properties._Parameter__goalreferencevalue,
			ScmlTables.Properties._Parameter__kpimeasurementdevice,
			ScmlTables.Properties._NamedElement__name,
			ScmlTables.Properties._Parameter__observedValue,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Parameter__type,
			ScmlTables.Properties._Parameter__unit
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ParameterType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PrincipleType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Project = {
			ScmlTables.Properties._Project__category,
			ScmlTables.Properties._Project__component,
			ScmlTables.Properties._Project__indicator,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sensor = {
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._Device__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SmartCity = {
			ScmlTables.Properties._SmartCity__category,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._SmartCity__project
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Status = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TransportationComponent = {
			ScmlTables.Properties._InfrastructureComponent__composedOf,
			ScmlTables.Properties._InfrastructureComponent__device,
			ScmlTables.Properties._InfrastructureComponent__isPartOf,
			ScmlTables.Properties._InfrastructureComponent__location,
			ScmlTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ScmlTables.Properties._InfrastructureComponent__parameter,
			ScmlTables.Properties._InfrastructureComponent__produces
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initProperties(_Actuator);
			Fragments._AggregatedValue__AggregatedValue.initProperties(_AggregatedValue);
			Fragments._Basis__Basis.initProperties(_Basis);
			Fragments._BuildingComponent__BuildingComponent.initProperties(_BuildingComponent);
			Fragments._Category__Category.initProperties(_Category);
			Fragments._Data__Data.initProperties(_Data);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._DataValue__DataValue.initProperties(_DataValue);
			Fragments._Device__Device.initProperties(_Device);
			Fragments._EnvironmentalComponent__EnvironmentalComponent.initProperties(_EnvironmentalComponent);
			Fragments._GoalReferenceValue__GoalReferenceValue.initProperties(_GoalReferenceValue);
			Fragments._InfrastructureComponent__InfrastructureComponent.initProperties(_InfrastructureComponent);
			Fragments._KPIMeasurementDevice__KPIMeasurementDevice.initProperties(_KPIMeasurementDevice);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._ParameterType__ParameterType.initProperties(_ParameterType);
			Fragments._PrincipleType__PrincipleType.initProperties(_PrincipleType);
			Fragments._Project__Project.initProperties(_Project);
			Fragments._Sensor__Sensor.initProperties(_Sensor);
			Fragments._SmartCity__SmartCity.initProperties(_SmartCity);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._TransportationComponent__TransportationComponent.initProperties(_TransportationComponent);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DataType__STRING = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.DATA_TYPE.getEEnumLiteral("STRING"), Types._DataType, 0);
		public static final EcoreExecutorEnumerationLiteral _DataType__BOOL = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.DATA_TYPE.getEEnumLiteral("BOOL"), Types._DataType, 1);
		public static final EcoreExecutorEnumerationLiteral _DataType__INTEGER = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.DATA_TYPE.getEEnumLiteral("INTEGER"), Types._DataType, 2);
		public static final EcoreExecutorEnumerationLiteral _DataType__FLOAT = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.DATA_TYPE.getEEnumLiteral("FLOAT"), Types._DataType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DataType = {
			_DataType__STRING,
			_DataType__BOOL,
			_DataType__INTEGER,
			_DataType__FLOAT
		};

		public static final EcoreExecutorEnumerationLiteral _Operation__SUM = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.OPERATION.getEEnumLiteral("SUM"), Types._Operation, 0);
		public static final EcoreExecutorEnumerationLiteral _Operation__DIFF = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.OPERATION.getEEnumLiteral("DIFF"), Types._Operation, 1);
		public static final EcoreExecutorEnumerationLiteral _Operation__AVG = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.OPERATION.getEEnumLiteral("AVG"), Types._Operation, 2);
		public static final EcoreExecutorEnumerationLiteral _Operation__MIN = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.OPERATION.getEEnumLiteral("MIN"), Types._Operation, 3);
		public static final EcoreExecutorEnumerationLiteral _Operation__MAX = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.OPERATION.getEEnumLiteral("MAX"), Types._Operation, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Operation = {
			_Operation__SUM,
			_Operation__DIFF,
			_Operation__AVG,
			_Operation__MIN,
			_Operation__MAX
		};

		public static final EcoreExecutorEnumerationLiteral _ParameterType__AIRQUALITY = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("AIRQUALITY"), Types._ParameterType, 0);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__WEATHER = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("WEATHER"), Types._ParameterType, 1);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__TRAFFIC = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("TRAFFIC"), Types._ParameterType, 2);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__ENERGY = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("ENERGY"), Types._ParameterType, 3);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__AGRICULTURAL = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("AGRICULTURAL"), Types._ParameterType, 4);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__NAVIGATION = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("NAVIGATION"), Types._ParameterType, 5);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__WASTEMANAGEMENT = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("WASTEMANAGEMENT"), Types._ParameterType, 6);
		public static final EcoreExecutorEnumerationLiteral _ParameterType__SAFETY = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PARAMETER_TYPE.getEEnumLiteral("SAFETY"), Types._ParameterType, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ParameterType = {
			_ParameterType__AIRQUALITY,
			_ParameterType__WEATHER,
			_ParameterType__TRAFFIC,
			_ParameterType__ENERGY,
			_ParameterType__AGRICULTURAL,
			_ParameterType__NAVIGATION,
			_ParameterType__WASTEMANAGEMENT,
			_ParameterType__SAFETY
		};

		public static final EcoreExecutorEnumerationLiteral _PrincipleType__LAW = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PRINCIPLE_TYPE.getEEnumLiteral("LAW"), Types._PrincipleType, 0);
		public static final EcoreExecutorEnumerationLiteral _PrincipleType__STANDARD = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PRINCIPLE_TYPE.getEEnumLiteral("STANDARD"), Types._PrincipleType, 1);
		public static final EcoreExecutorEnumerationLiteral _PrincipleType__POLICY = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.PRINCIPLE_TYPE.getEEnumLiteral("POLICY"), Types._PrincipleType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PrincipleType = {
			_PrincipleType__LAW,
			_PrincipleType__STANDARD,
			_PrincipleType__POLICY
		};

		public static final EcoreExecutorEnumerationLiteral _Status__GOOD = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.STATUS.getEEnumLiteral("GOOD"), Types._Status, 0);
		public static final EcoreExecutorEnumerationLiteral _Status__WARN = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.STATUS.getEEnumLiteral("WARN"), Types._Status, 1);
		public static final EcoreExecutorEnumerationLiteral _Status__CRITICAL = new EcoreExecutorEnumerationLiteral(ScmlPackage.Literals.STATUS.getEEnumLiteral("CRITICAL"), Types._Status, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Status = {
			_Status__GOOD,
			_Status__WARN,
			_Status__CRITICAL
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DataType.initLiterals(_DataType);
			Types._Operation.initLiterals(_Operation);
			Types._ParameterType.initLiterals(_ParameterType);
			Types._PrincipleType.initLiterals(_PrincipleType);
			Types._Status.initLiterals(_Status);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ScmlTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new ScmlTables();
	}

	private ScmlTables() {
		super(ScmlPackage.eNS_URI);
	}
}
