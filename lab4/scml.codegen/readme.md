# Codegen Notes
The following notes aim to ease the understanding of simulation in lab4 and how it's individual components interact. The most critical components and their critical functions are documented.

## Simulation Utilities
The simulation utilities are used to simulate the execution of the SmartCity, which shows the interaction of different parts i.e., projects, infrastructures components, parameters, KPI measurement devices and data values with each other. The simulation shows the interaction as described by the [Runner](###Runner). The data values loading from the file are handled by [DataSource](###DataSource) and each value TODO [values in datasources](###Values). 


### DataSource
A DataSource is needed for all TODO. It is basically a queue and the Infrastructure Component reads the next value out of it. Each step a new value is read from each datasource of each Infrastructure Component. This continues as long as there are values in the TODO.


### Values
TODO

## Generated Code

### Runner
Each SmartCity is simulated by a runner. A Runner sets up the Project, Infrastructure Component, KPI Measurement Device, Parameter and Data Value objects. It further creates DataSources using the [values JSON file TODO link](https://github.com/MEws22/lab4Template/blob/master/cpsml.codegen/scenarios/productionCPSScenario.json). Once all objects are created it links TODO. This Simulation does not entail TODO for the sake of simplification.

The runner is also the only interface for the Simulation. For this each Runner implements a ``step`` method, which further invokes the steps from its containing objects.
A step invocation follows the following execution flow:
Runner ``step`` -> invoke the following ``steps`` -
1.  Infrastructure Component ``step`` -> look if new Data Values are provided in dataSource
2.  TODO ``step`` TODO
3.  TODO ``step`` -> TODO

### Project
A Project has a name and implements the function ``toString`` which returns its name.

### Infrastructure Component
TODO

### Parameter
TODO

### KPI Measurement Device
TODO

### Data Value
TODO
