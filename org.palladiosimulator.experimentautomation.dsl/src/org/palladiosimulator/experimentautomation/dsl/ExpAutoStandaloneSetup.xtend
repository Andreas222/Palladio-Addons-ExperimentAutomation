/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ExpAutoStandaloneSetup extends ExpAutoStandaloneSetupGenerated {

	def static void doSetup() {
		new ExpAutoStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}