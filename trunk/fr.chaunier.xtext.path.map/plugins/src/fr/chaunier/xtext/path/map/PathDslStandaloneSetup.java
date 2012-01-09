
package fr.chaunier.xtext.path.map;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PathDslStandaloneSetup extends PathDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PathDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

