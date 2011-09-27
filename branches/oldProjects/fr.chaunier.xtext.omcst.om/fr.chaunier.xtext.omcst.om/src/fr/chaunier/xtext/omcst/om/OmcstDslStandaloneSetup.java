
package fr.chaunier.xtext.omcst.om;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OmcstDslStandaloneSetup extends OmcstDslStandaloneSetupGenerated{

	public static void doSetup() {
		new OmcstDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

