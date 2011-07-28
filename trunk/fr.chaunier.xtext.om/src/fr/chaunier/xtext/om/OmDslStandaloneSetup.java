
package fr.chaunier.xtext.om;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OmDslStandaloneSetup extends OmDslStandaloneSetupGenerated{

	public static void doSetup() {
		new OmDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

