
package fr.chaunier.xtext.omc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OmcDslStandaloneSetup extends OmcDslStandaloneSetupGenerated{

	public static void doSetup() {
		new OmcDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

