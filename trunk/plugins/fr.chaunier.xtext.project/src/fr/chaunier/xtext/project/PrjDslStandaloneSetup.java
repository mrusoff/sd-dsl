
package fr.chaunier.xtext.project;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PrjDslStandaloneSetup extends PrjDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PrjDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

