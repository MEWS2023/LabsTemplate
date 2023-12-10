package at.ac.tuwien.big.scml.codegen.xtend

import scml.InfrastructureComponent
import scml.BuildingComponent
import scml.TransportationComponent
import scml.EnvironmentalComponent


class InfrastructureComponentGenerator {
	
	public static final String INFRA_COMP_PACKAGE = "component"
	
	private def getInfrastructureComponentImpl(String packageName, InfrastructureComponent comp)
	'''
	# TODO: Implement
	'''
	
	def dispatch generate(String packageName, BuildingComponent comp)
	'''
	# TODO: Implement
	'''
	
	def dispatch generate(String packageName, TransportationComponent comp)
	'''
	# TODO: Implement
	'''
	
	def dispatch generate(String packageName, EnvironmentalComponent comp)
	'''
	# TODO: Implement
	'''
}
