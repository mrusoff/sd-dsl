
package fr.chaunier.xtext.xgen;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XgenDslStandaloneSetup extends XgenDslStandaloneSetupGenerated{

	public static void doSetup() {
		new XgenDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

