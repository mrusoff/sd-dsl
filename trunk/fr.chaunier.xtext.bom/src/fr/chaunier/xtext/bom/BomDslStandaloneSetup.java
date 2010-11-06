
package fr.chaunier.xtext.bom;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BomDslStandaloneSetup extends BomDslStandaloneSetupGenerated{

	public static void doSetup() {
		new BomDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

