package at.ac.tuwien.big.scml.codegen.lib;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import at.ac.tuwien.big.scml.codegen.xtend.ScmlGenerator;

public class SimulatorGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "scml";
	}

	@Override
	protected String getFileExtensions() {
		return "xmi";
	}

	public Class<? extends IGenerator2> bindIGenerator() {
		return ScmlGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}
}
