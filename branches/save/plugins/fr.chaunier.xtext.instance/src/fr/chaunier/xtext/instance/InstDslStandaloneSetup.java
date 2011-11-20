
package fr.chaunier.xtext.instance;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InstDslStandaloneSetup extends InstDslStandaloneSetupGenerated{

	public static void doSetup() {
		new InstDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

