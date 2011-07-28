
package fr.chaunier.xtext.archi;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AdslDslStandaloneSetup extends AdslDslStandaloneSetupGenerated{

	public static void doSetup() {
		new AdslDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

