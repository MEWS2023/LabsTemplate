# Codegen Notes
The following notes aim to ease the understanding of simulation in lab4 and how it's individual components interact. The most critical components and their critical functions are documented.

## Simulation Utilities
The simulation utilities are used to simulate the execution of the SmartCity, which shows the interaction of different parts i.e., projects, infrastructures components, parameters and KPI measurement devices with each other. The simulation shows the interaction as described by the [Runner](#runner). The data values loading from the file are handled by [DataSource](#datasource). Values from the dataSources are within a tree structure of projects and infrastructure components defined as strings containing integer or float numbers. For the sake of simplification there are already some helper classes implemented in the [lib package](https://github.com/MEWS2023/LabsTemplate/tree/main/lab4/scml.codegen/src/at/ac/tuwien/big/scml/codegen/lib), e.g. the ``AggregatedValue``, ``GoalReferenceValue`` and ``DataValue``. 


### DataSource
A DataSource is needed for all Infrastructure Component objects. It is basically a queue and the Infrastructure Component reads the next value out of it. Each step a new value is read from each datasource of each Infrastructure Component. This continues as long as there are values in the datasource.


## Generated Code

### Runner
Each SmartCity is simulated by a runner. A Runner sets up the Project, Infrastructure Component, KPI Measurement Device, and Parameter objects. It further creates DataSources using the [values JSON file](https://github.com/MEWS2023/LabsTemplate/blob/main/lab4/scml.codegen/scenarios/viennaSCScenario.json). It also links infrastructure components and kpi measurement devices to a project. This Simulation does not entail Sensor and Actuator devices, Basis for Goal Reference Values and Location of Infrastructure Components for the sake of simplification.

The runner is also the only interface for the Simulation. For this each Runner implements a ``step`` method, which further invokes the steps from its containing objects.
A step invocation follows the following execution flow:
Runner ``step`` -> invokes the Project ``step`` which further invokes the steps from the other objects.

### Project
A Project has a name and implements the function ``toString`` which returns its name.

### Infrastructure Component
An infrastructure component extends the given abstract class ``Producer``.

### Parameter
A parameter extends the given abstract class ``Aggregator``.

### KPI Measurement Device
A KPI measurement device extends the given abstract class ``Indicator``.
