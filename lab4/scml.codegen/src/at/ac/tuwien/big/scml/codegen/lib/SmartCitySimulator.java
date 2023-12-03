package at.ac.tuwien.big.scml.codegen.lib;

import java.util.Optional;
import java.util.stream.Stream;

import at.ac.tuwien.big.scml.codegen.SmartCityRunnerProvider;

public class SmartCitySimulator {
	
	private static final String VIENNA_RUNNER = "vienna";
	
	public static void main(String[] args) {
		boolean stepwise = Stream.of(args).filter(a -> "-s".equals(a)).findAny().isPresent();
		Optional<String> runnerArg = Stream.of(args).filter(a -> VIENNA_RUNNER.equals(a)).findAny();
		Optional<String> scenarioFile = Stream.of(args).filter(a -> a.endsWith(".json")).findAny();
		
		if (!runnerArg.isPresent()) {
			printUsage();
		}
		
		if (!scenarioFile.isPresent()) {
			printUsage();
		}
		
		SmartCityRunner runner = VIENNA_RUNNER.equals(runnerArg.get()) ? SmartCityRunnerProvider.getViennaRunner() : null;
		
		JsonScenarioSimulator simulator = new JsonScenarioSimulator();
									
		if (stepwise) {
			simulator.simulateStepwise(runner, scenarioFile.get());
		} else {
			simulator.simulate(runner, scenarioFile.get());
		}
	}
	
	private static void printUsage() {
		System.err.println("Usage:");
		System.err.println(" SmartCitySimulator [-s] (vienna) scenariofile");
		System.exit(1);
	}
}
