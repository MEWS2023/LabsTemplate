
package vienna;

import java.util.Map;

import at.ac.tuwien.big.scml.codegen.lib.DataSource;
import at.ac.tuwien.big.scml.codegen.lib.SmartCityRunner;
import at.ac.tuwien.big.scml.codegen.lib.Util;


import vienna.project.GreenEnergy;
import vienna.project.SmartTransportation;

import vienna.kpi.CoContentMeasurementIndicator;
import vienna.kpi.LightMeasurementIndicator;
import vienna.kpi.WienerLinienEnergyConsumedIndicator;
import vienna.kpi.ControlRoomEnergyConsumedIndicator;

import vienna.component.GETurkenschanzpark;
import vienna.component.GEWienerLinienBusDepartment;
import vienna.component.GETUKarlsplatz;
import vienna.component.STWienerLinien;
import vienna.component.STWienerLinienStrassenbahn;
import vienna.component.STWienerLinienUbahn;
import vienna.component.STTrafficLights;
import vienna.component.STWestBahnhofControlRoom;

import vienna.parameter.GECo2Content;
import vienna.parameter.GELux;
import vienna.parameter.STenergyConsumedWienerLinien;
import vienna.parameter.STenergyConsumedCR;

public class ViennaRunner implements SmartCityRunner {

	private GreenEnergy greenEnergy;
	private SmartTransportation smartTransportation;
	
	private CoContentMeasurementIndicator coContentMeasurementIndicator;
	private LightMeasurementIndicator lightMeasurementIndicator;
	private WienerLinienEnergyConsumedIndicator wienerLinienEnergyConsumedIndicator;
	private ControlRoomEnergyConsumedIndicator controlRoomEnergyConsumedIndicator;
	
	private GETurkenschanzpark gETurkenschanzpark;
	private GEWienerLinienBusDepartment gEWienerLinienBusDepartment;
	private GETUKarlsplatz gETUKarlsplatz;
	private STWienerLinien sTWienerLinien;
	private STWienerLinienStrassenbahn sTWienerLinienStrassenbahn;
	private STWienerLinienUbahn sTWienerLinienUbahn;
	private STTrafficLights sTTrafficLights;
	private STWestBahnhofControlRoom sTWestBahnhofControlRoom;
	
	private GECo2Content gECo2Content;
	private GELux gELux;
	private STenergyConsumedWienerLinien sTenergyConsumedWienerLinien;
	private STenergyConsumedCR sTenergyConsumedCR;
			
	private int stepCount = 0;
	
	@Override
	public void setup(Map<String, Map<String, DataSource<String>>> dataSources, Map<String, Integer> valueAggregationLimitMap) {
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=------------------------------------ Setup ------------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=================================================================================\n" + Util.ANSI_RESET);
		
		//Setup Project:
		System.out.println(Util.ANSI_BOLD + "=-------------- Setting up Projects and Infrastructure Components --------------=" + Util.ANSI_RESET);
		greenEnergy = new GreenEnergy("Green Energy", valueAggregationLimitMap.get("Green Energy"));
		System.out.println("	Created Project: " + greenEnergy.toString() + " with categories: " + String.join(", ", greenEnergy.getGreenEnergyCategories()) + "\n");
		gETurkenschanzpark = new GETurkenschanzpark("gETurkenschanzpark", dataSources.get("Green Energy").get("GE Turkenschanzpark"));
		System.out.println("	🌳 Created Environmental Component: GE Turkenschanzpark");
		
		greenEnergy.addComponent(gETurkenschanzpark);
		System.out.println("	Added GE Turkenschanzpark to: Green Energy\n");
		
		gECo2Content = gETurkenschanzpark.parameter;
		gEWienerLinienBusDepartment = new GEWienerLinienBusDepartment("gEWienerLinienBusDepartment", dataSources.get("Green Energy").get("GE Wiener Linien Bus Department"));
		System.out.println("	🚂 Created Transportation Component: GE Wiener Linien Bus Department");
		
		greenEnergy.addComponent(gEWienerLinienBusDepartment);
		System.out.println("	Added GE Wiener Linien Bus Department to: Green Energy\n");
		
		gETUKarlsplatz = new GETUKarlsplatz("gETUKarlsplatz", dataSources.get("Green Energy").get("GE TU Karlsplatz"));
		System.out.println("	🏢 Created Building Component: GE TU Karlsplatz");
		
		greenEnergy.addComponent(gETUKarlsplatz);
		System.out.println("	Added GE TU Karlsplatz to: Green Energy\n");
		
		gELux = gETUKarlsplatz.parameter;
		smartTransportation = new SmartTransportation("Smart Transportation", valueAggregationLimitMap.get("Smart Transportation"));
		System.out.println("	Created Project: " + smartTransportation.toString() + " with categories: " + String.join(", ", smartTransportation.getSmartTransportationCategories()) + "\n");
		sTWienerLinien = new STWienerLinien("sTWienerLinien", dataSources.get("Smart Transportation").get("ST Wiener Linien"));
		System.out.println("	🚂 Created Transportation Component: ST Wiener Linien");
		
		smartTransportation.addComponent(sTWienerLinien);
		System.out.println("	Added ST Wiener Linien to: Smart Transportation\n");
		
		sTenergyConsumedWienerLinien = sTWienerLinien.parameter;
		sTWienerLinienStrassenbahn = new STWienerLinienStrassenbahn("sTWienerLinienStrassenbahn", dataSources.get("Smart Transportation").get("ST Wiener Linien Strassenbahn"));
		System.out.println("	🚂 Created Transportation Component: ST Wiener Linien Strassenbahn");
		
		smartTransportation.addComponent(sTWienerLinienStrassenbahn);
		System.out.println("	Added ST Wiener Linien Strassenbahn to: Smart Transportation\n");
		
		sTWienerLinienUbahn = new STWienerLinienUbahn("sTWienerLinienUbahn", dataSources.get("Smart Transportation").get("ST Wiener Linien Ubahn"));
		System.out.println("	🚂 Created Transportation Component: ST Wiener Linien Ubahn");
		
		smartTransportation.addComponent(sTWienerLinienUbahn);
		System.out.println("	Added ST Wiener Linien Ubahn to: Smart Transportation\n");
		
		sTTrafficLights = new STTrafficLights("sTTrafficLights", dataSources.get("Smart Transportation").get("ST Traffic Lights"));
		System.out.println("	🌳 Created Environmental Component: ST Traffic Lights");
		
		smartTransportation.addComponent(sTTrafficLights);
		System.out.println("	Added ST Traffic Lights to: Smart Transportation\n");
		
		sTWestBahnhofControlRoom = new STWestBahnhofControlRoom("sTWestBahnhofControlRoom", dataSources.get("Smart Transportation").get("ST WestBahnhof Control Room"));
		System.out.println("	🏢 Created Building Component: ST WestBahnhof Control Room");
		
		smartTransportation.addComponent(sTWestBahnhofControlRoom);
		System.out.println("	Added ST WestBahnhof Control Room to: Smart Transportation\n");
		
		sTenergyConsumedCR = sTWestBahnhofControlRoom.parameter;
		
		System.out.println(Util.ANSI_BOLD + "=----------------------- Projects are set up successfully -------------------------=\n" + Util.ANSI_RESET);
		
		System.out.println(Util.ANSI_BOLD + "=---------------- Setting up KPI Measurement Devices for Projects -----------------=" + Util.ANSI_RESET);
		
		//Setup KPI:
		coContentMeasurementIndicator = new CoContentMeasurementIndicator();
		System.out.println("	Created Device CoContentMeasurementIndicator");
		
		coContentMeasurementIndicator.setParameter(gECo2Content);
		System.out.println("	Linked Device CoContentMeasurementIndicator" + " to GECo2Content");
			
		greenEnergy.addIndicator(coContentMeasurementIndicator);
		System.out.println("	Added Indicator to Green Energy \n");
		lightMeasurementIndicator = new LightMeasurementIndicator();
		System.out.println("	Created Device LightMeasurementIndicator");
		
		lightMeasurementIndicator.setParameter(gELux);
		System.out.println("	Linked Device LightMeasurementIndicator" + " to GELux");
			
		greenEnergy.addIndicator(lightMeasurementIndicator);
		System.out.println("	Added Indicator to Green Energy \n");
		wienerLinienEnergyConsumedIndicator = new WienerLinienEnergyConsumedIndicator();
		System.out.println("	Created Device WienerLinienEnergyConsumedIndicator");
		
		wienerLinienEnergyConsumedIndicator.setParameter(sTenergyConsumedWienerLinien);
		System.out.println("	Linked Device WienerLinienEnergyConsumedIndicator" + " to STenergyConsumedWienerLinien");
			
		smartTransportation.addIndicator(wienerLinienEnergyConsumedIndicator);
		System.out.println("	Added Indicator to Smart Transportation \n");
		controlRoomEnergyConsumedIndicator = new ControlRoomEnergyConsumedIndicator();
		System.out.println("	Created Device ControlRoomEnergyConsumedIndicator");
		
		controlRoomEnergyConsumedIndicator.setParameter(sTenergyConsumedCR);
		System.out.println("	Linked Device ControlRoomEnergyConsumedIndicator" + " to STenergyConsumedCR");
			
		smartTransportation.addIndicator(controlRoomEnergyConsumedIndicator);
		System.out.println("	Added Indicator to Smart Transportation \n");
		
		System.out.println(Util.ANSI_BOLD + "=---------------- KPI Measurement Devices are set up sucessfully ------------------=\n" + Util.ANSI_RESET);
		
		System.out.println(Util.ANSI_BOLD + "========================================================================================" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "=---------------------------------- Setup Successful ----------------------------------=" + Util.ANSI_RESET);
		System.out.println(Util.ANSI_BOLD + "========================================================================================\n" + Util.ANSI_RESET);
	}
	
	@Override
	public void step() {
		stepCount++;
		System.out.println(Util.ANSI_BOLD + "==================================== Step " + (stepCount < 10 ? "0" : "") + stepCount + " ====================================\n" + Util.ANSI_RESET);
		
		greenEnergy.step();
		smartTransportation.step();
		
		System.out.println(Util.ANSI_BOLD + "=================================================================================" + Util.ANSI_RESET);
	}
}
