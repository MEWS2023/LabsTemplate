SmartCity SmartVienna {
	categories [Education(SDG=2, 4), Transportation(SDG=5, 8), AirQuality(SDG=1), Energy(SDG=4), SmartHealthCare(SDG=3, 12)]
	projects [
		GreenEnergy belongsTo (Energy, AirQuality) {
			components [
				EnvironmentalComponent GETurkenschanzpark {
					environmentalComponentLocation : lat=16.0738, long=12.0472
					environmentalComponentParameter CoContent (unit="mg/m3", type=AIRQUALITY){
						goalValue : GoalValue(value="8.75", type=FLOAT)
							basedOn -> Basis {
								description "Optimal value for CO2 content in the air"
								principleType POLICY
								source "UN"
							}
						dataSource: GETurkenschanzpark
						observedValue {
							value : "8.75" 
							type: FLOAT 
							aggregatorType : AVG
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
					environmentalComponentData {
						DataValue (collected) {
							dType INTEGER
							value "5"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 14:30:00.000+0200"
						},
						DataValue (collected) {
							dType INTEGER
							value "8"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 14:30:00.000+0200"
						},
						DataValue (collected) {
							dType INTEGER
							value "12"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 14:30:00.000+0200"
						},
						DataValue (collected) {
							dType INTEGER
							value "10"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 14:30:00.000+0200"
						},
						DataValue (collected) {
							dType INTEGER
							value "10"
							producedTime "2023-09-12T 11:30:00.000+0200"
						},
						DataValue {
							dType INTEGER
							value "14"
							producedTime "2023-09-12T 11:30:00.000+0200"
						}
					}
					environmentalComponentDevices [
						Sensor Co2Detector1(type=AIRQUALITY),
						Sensor Co2Detector2(type=AIRQUALITY)
					]
				},
				EnvironmentalComponent GEWienerLinienSBahn {
					environmentalComponentLocation : lat=16.0738, long=12.0472
					environmentalComponentParameter cocontent(unit="mmg/m3", type=AIRQUALITY){
						goalValue : GoalValue(value="8.75", type=FLOAT)
							basedOn -> Basis {
								description "Optimal value for CO2 content in the air"
								principleType POLICY
								source "UN"
							}
						dataSource: GEWienerLinienSBahn
						observedValue {
							value : "8.75" 
							type: FLOAT 
							aggregatorType : AVG
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
				},
				TransportationComponent GEWienerLinienBusDepartment {
					transportComponentLocation : lat=22.033, long=12.032
					transportComponentParameter TransportEnergyConsumption(unit="Watts", type=ENERGY){
						goalValue : GoalValue(value="55", type=INTEGER)
							basedOn -> Basis {
								description "Regulation by the national transport ministry for energy limit"
								principleType LAW
								source "National Transportation Ministry"
							}
						dataSource: GEWienerLinienBusDepartment
						observedValue {
							value : "89"
							type : INTEGER
							aggregatorType : MAX
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
					transportComponentData {
						DataValue (collected) {
							dType STRING
							value "65"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 12:30:00.000+0200"
						},
						DataValue (collected) {
							dType STRING
							value "68"
							producedTime "2023-09-12T 12:30:00.000+0200"
							consumedTime "2023-09-12T 14:30:00.000+0200"  // This specific date format
						},
						DataValue (collected) {
							dType STRING
							value "89"
							producedTime "2023-09-12T 11:30:00.000+0200"
						},
						DataValue {
							dType STRING
							value "76"
							producedTime "2023-09-12T 11:30:00.000+0200"
						}
					}
					transportComponentDevices [
						Sensor energyConsumedDetector(type=ENERGY),
						Actuator energyManager(type=ENERGY)
					]
				}
				,
				BuildingComponent GETUKarlsplatz {
					buildingComponentLocation: lat=22.2345, long=33.1213
					buildingComponentParameter Lux(unit="lux", type=ENERGY){
						goalValue : GoalValue(value="10", type=INTEGER)
							basedOn -> Basis {
								description "Energy utilization standards set by the WECF"
								principleType STANDARD
								source "World Energy Conservation Forum"
							}
						dataSource: GETUKarlsplatz
						observedValue {
							value : "14"
							type: INTEGER
							aggregatorType : AVG
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
					buildingComponentData {
						DataValue (collected){
							dType INTEGER
							value "13"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 19:30:00.000+0200"
						},
						DataValue (collected){
							dType INTEGER
							value "12"
							producedTime "2023-09-12T 11:30:00.000+0200"
							consumedTime "2023-09-12T 19:30:00.000+0200"
						},
						DataValue (collected){
							dType INTEGER
							value "19"
							producedTime "2023-09-12T 11:30:00.000+0200"
						}
					}
					buildingComponentDevices[
						Actuator AutomaticLuminiscenceManager(type=ENERGY),
						Sensor Photocells(type=ENERGY),
						Sensor MotionDetector(type=ENERGY)
					]
				}
			]
			indicators [
				COCONTENTmeasurement_indicator(status=GOOD, parameter=CoContent){
					lastCalculation [ "2023-09-12T 10:30:00.000+0200", "2023-09-12T 09:30:00.000+0200" ]
					nextCalculation "2023-09-12T 11:30:00.000+0200"
				},
				TRANSPORTENERGYCONSUMPTIONmeasurement_indicator(status=WARN, parameter=TransportEnergyConsumption){
					lastCalculation [ "2023-09-12T 10:30:00.000+0200", "2023-09-12T 09:30:00.000+0200" ]
					nextCalculation "2023-09-12T 11:30:00.000+0200"
				}
			]
		},
		SmartTransportation belongsTo (Transportation) {
			components [
				TransportationComponent STWienerLinien {
					transportComponentLocation: lat=16.0738, long=12.0472
					transportComponentParameter energyConsumed(unit="Watts", type=ENERGY){
						goalValue : GoalValue(value="50", type=INTEGER)
							basedOn -> Basis {
								description "Regulation by the national transport ministry for energy limit"
								principleType LAW
								source "National Transportation Ministry"
							}
						dataSource: STWienerLinien
						observedValue {
							value : "67"
							type : INTEGER
							aggregatorType : MAX
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
					transportationComponentSub [STWienerLinienUbahn, STWienerLinienStrassenbahn, STTrafficLights]
				},
				TransportationComponent STWienerLinienStrassenbahn {
					transportationComponentSuper STTrafficLights
					transportComponentLocation: lat=16.0738, long=12.0472
					transportComponentParameter energyConsumed(unit="Watts", type=ENERGY){
						goalValue : GoalValue(value="50", type=INTEGER)
							basedOn -> Basis {
								description "Regulation by the national transport ministry for energy limit"
								principleType LAW
								source "National Transportation Ministry"
							}
						dataSource: STWienerLinienStrassenbahn
					}					
				},
				TransportationComponent STWienerLinienUbahn {
					transportationComponentSuper STWienerLinien
					transportComponentLocation: lat=16.0738, long=12.0472
					transportComponentParameter energyConsumed(unit="Watts", type=ENERGY){
						goalValue : GoalValue(value="50", type=INTEGER)
							basedOn -> Basis {
								description "Regulation by the national transport ministry for energy limit"
								principleType LAW
								source "National Transportation Ministry"
							}
						dataSource: STWienerLinienUbahn 
					} 
				},
				EnvironmentalComponent STTrafficLights {
					environmentalComponentSuper STWienerLinien
					environmentalComponentLocation : lat=16.0738, long=12.0472
					environmentalComponentParameter carsPerMinute (unit="cars/min", type=NAVIGATION){
						goalValue : GoalValue(value="50", type=INTEGER)
							basedOn -> Basis {
								description "Optimal value for CO2 content in the air"
								principleType POLICY
								source "UN"
							}
						dataSource: STTrafficLights
						observedValue {
							value : "8.75" 
							type: FLOAT 
							aggregatorType : AVG
							aggregatedTime : "2023-09-12T 11:30:00.000+0200"
						}
					}
					environmentalComponentDevices [
						Sensor Camera(type=NAVIGATION)
					]
				},
				BuildingComponent STWestBahnhofControlRoom {
					buildingComponentLocation : lat=16.0738, long=12.0472
					buildingComponentParameter energyConsumed(unit="Watts", type=ENERGY){
						goalValue : GoalValue(value="2500", type=INTEGER)
							basedOn -> Basis {
								description "Combined Daily Energy Consumption Limit "
								principleType LAW
								source "National Transportation Ministry"
							}
						dataSource: STWestBahnhofControlRoom 
					}
				}
			]
		}	
	]
}