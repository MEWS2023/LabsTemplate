/*
 * generated by Xtext 2.31.0
 */
package at.ac.tuwien.big.serializer;

import at.ac.tuwien.big.services.ScmlGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import scml.Actuator;
import scml.AggregatedValue;
import scml.Basis;
import scml.BuildingComponent;
import scml.Category;
import scml.DataValue;
import scml.EnvironmentalComponent;
import scml.GoalReferenceValue;
import scml.KPIMeasurementDevice;
import scml.Location;
import scml.Project;
import scml.ScmlPackage;
import scml.Sensor;
import scml.SmartCity;
import scml.TransportationComponent;

@SuppressWarnings("all")
public class ScmlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ScmlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ScmlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ScmlPackage.ACTUATOR:
				sequence_Actuator(context, (Actuator) semanticObject); 
				return; 
			case ScmlPackage.AGGREGATED_VALUE:
				sequence_AggregatedValue(context, (AggregatedValue) semanticObject); 
				return; 
			case ScmlPackage.BASIS:
				sequence_Basis(context, (Basis) semanticObject); 
				return; 
			case ScmlPackage.BUILDING_COMPONENT:
				sequence_BuildingComponent(context, (BuildingComponent) semanticObject); 
				return; 
			case ScmlPackage.CATEGORY:
				sequence_Category(context, (Category) semanticObject); 
				return; 
			case ScmlPackage.DATA_VALUE:
				sequence_DataValue(context, (DataValue) semanticObject); 
				return; 
			case ScmlPackage.ENVIRONMENTAL_COMPONENT:
				sequence_EnvironmentalComponent(context, (EnvironmentalComponent) semanticObject); 
				return; 
			case ScmlPackage.GOAL_REFERENCE_VALUE:
				sequence_GoalReferenceValue(context, (GoalReferenceValue) semanticObject); 
				return; 
			case ScmlPackage.KPI_MEASUREMENT_DEVICE:
				sequence_KPIMeasurementDevice(context, (KPIMeasurementDevice) semanticObject); 
				return; 
			case ScmlPackage.LOCATION:
				sequence_Location(context, (Location) semanticObject); 
				return; 
			case ScmlPackage.PARAMETER:
				sequence_Parameter(context, (scml.Parameter) semanticObject); 
				return; 
			case ScmlPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case ScmlPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case ScmlPackage.SMART_CITY:
				sequence_SmartCity(context, (SmartCity) semanticObject); 
				return; 
			case ScmlPackage.TRANSPORTATION_COMPONENT:
				sequence_TransportationComponent(context, (TransportationComponent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Device returns Actuator
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     (name=EString type=ParameterType)
	 * </pre>
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DEVICE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DEVICE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActuatorAccess().getTypeParameterTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AggregatedValue returns AggregatedValue
	 *
	 * Constraint:
	 *     (type=DataType value=EString aggregator=Operation aggregatedTime=EString)
	 * </pre>
	 */
	protected void sequence_AggregatedValue(ISerializationContext context, AggregatedValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DATA__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DATA__TYPE));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DATA__VALUE));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATOR));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATED_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.AGGREGATED_VALUE__AGGREGATED_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAggregatedValueAccess().getTypeDataTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAggregatedValueAccess().getValueEStringParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAggregatedValueAccess().getAggregatorOperationEnumRuleCall_7_0(), semanticObject.getAggregator());
		feeder.accept(grammarAccess.getAggregatedValueAccess().getAggregatedTimeEStringParserRuleCall_9_0(), semanticObject.getAggregatedTime());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Basis returns Basis
	 *
	 * Constraint:
	 *     (description=EString principleType=PrincipleType source=EString)
	 * </pre>
	 */
	protected void sequence_Basis(ISerializationContext context, Basis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.BASIS__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.BASIS__DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.BASIS__PRINCIPLE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.BASIS__PRINCIPLE_TYPE));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.BASIS__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.BASIS__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBasisAccess().getDescriptionEStringParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getBasisAccess().getPrincipleTypePrincipleTypeEnumRuleCall_5_0(), semanticObject.getPrincipleType());
		feeder.accept(grammarAccess.getBasisAccess().getSourceEStringParserRuleCall_7_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InfrastructureComponent returns BuildingComponent
	 *     BuildingComponent returns BuildingComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isPartOf=[InfrastructureComponent|EString]? 
	 *         (composedOf+=[InfrastructureComponent|EString] composedOf+=[InfrastructureComponent|EString]*)? 
	 *         location=Location 
	 *         (produces+=DataValue produces+=DataValue*)? 
	 *         parameter=Parameter 
	 *         (device+=Device device+=Device*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_BuildingComponent(ISerializationContext context, BuildingComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Category returns Category
	 *
	 * Constraint:
	 *     (name=EString SDG+=EInt SDG+=EInt*)
	 * </pre>
	 */
	protected void sequence_Category(ISerializationContext context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DataValue returns DataValue
	 *
	 * Constraint:
	 *     (collected?='collected' type=DataType value=EString producedTime=EString consumedTime=EString?)
	 * </pre>
	 */
	protected void sequence_DataValue(ISerializationContext context, DataValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InfrastructureComponent returns EnvironmentalComponent
	 *     EnvironmentalComponent returns EnvironmentalComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isPartOf=[InfrastructureComponent|EString]? 
	 *         (composedOf+=[InfrastructureComponent|EString] composedOf+=[InfrastructureComponent|EString]*)? 
	 *         location=Location 
	 *         (produces+=DataValue produces+=DataValue*)? 
	 *         parameter=Parameter 
	 *         (device+=Device device+=Device*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_EnvironmentalComponent(ISerializationContext context, EnvironmentalComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GoalReferenceValue returns GoalReferenceValue
	 *
	 * Constraint:
	 *     (type=DataType value=EString basis=Basis)
	 * </pre>
	 */
	protected void sequence_GoalReferenceValue(ISerializationContext context, GoalReferenceValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DATA__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DATA__TYPE));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DATA__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DATA__VALUE));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.GOAL_REFERENCE_VALUE__BASIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.GOAL_REFERENCE_VALUE__BASIS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoalReferenceValueAccess().getTypeDataTypeEnumRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGoalReferenceValueAccess().getValueEStringParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getGoalReferenceValueAccess().getBasisBasisParserRuleCall_7_0(), semanticObject.getBasis());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     KPIMeasurementDevice returns KPIMeasurementDevice
	 *
	 * Constraint:
	 *     (name=EString status=Status (lastCalculation+=EString lastCalculation+=EString*)? nextCalculation=EString parameter=[Parameter|EString]?)
	 * </pre>
	 */
	protected void sequence_KPIMeasurementDevice(ISerializationContext context, KPIMeasurementDevice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Location returns Location
	 *
	 * Constraint:
	 *     (Lat=EFloat Long=EFloat)
	 * </pre>
	 */
	protected void sequence_Location(ISerializationContext context, Location semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.LOCATION__LAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.LOCATION__LAT));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.LOCATION__LONG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.LOCATION__LONG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLocationAccess().getLatEFloatParserRuleCall_3_0(), semanticObject.getLat());
		feeder.accept(grammarAccess.getLocationAccess().getLongEFloatParserRuleCall_5_0(), semanticObject.getLong());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         unit=EString 
	 *         type=ParameterType 
	 *         component=[InfrastructureComponent|EString] 
	 *         goalreferencevalue=GoalReferenceValue 
	 *         observedValue=AggregatedValue?
	 *     )
	 * </pre>
	 */
	protected void sequence_Parameter(ISerializationContext context, scml.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (category+=[Category|EString] category+=[Category|EString]*)? 
	 *         (component+=InfrastructureComponent component+=InfrastructureComponent*)? 
	 *         (indicator+=KPIMeasurementDevice indicator+=KPIMeasurementDevice*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Device returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=EString type=ParameterType)
	 * </pre>
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, ScmlPackage.Literals.DEVICE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ScmlPackage.Literals.DEVICE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSensorAccess().getTypeParameterTypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     SmartCity returns SmartCity
	 *
	 * Constraint:
	 *     (name=EString (category+=Category category+=Category*)? (project+=Project project+=Project*)?)
	 * </pre>
	 */
	protected void sequence_SmartCity(ISerializationContext context, SmartCity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     InfrastructureComponent returns TransportationComponent
	 *     TransportationComponent returns TransportationComponent
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         isPartOf=[InfrastructureComponent|EString]? 
	 *         (composedOf+=[InfrastructureComponent|EString] composedOf+=[InfrastructureComponent|EString]*)? 
	 *         location=Location 
	 *         (produces+=DataValue produces+=DataValue*)? 
	 *         parameter=Parameter 
	 *         (device+=Device device+=Device*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_TransportationComponent(ISerializationContext context, TransportationComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
