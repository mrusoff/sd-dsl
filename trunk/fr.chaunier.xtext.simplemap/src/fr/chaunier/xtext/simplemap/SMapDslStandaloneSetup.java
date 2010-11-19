
package fr.chaunier.xtext.simplemap;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SMapDslStandaloneSetup extends SMapDslStandaloneSetupGenerated{

	public static void doSetup() {
		new SMapDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

