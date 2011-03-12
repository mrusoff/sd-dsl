
package fr.chaunier.xtext.mapdsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MapDslStandaloneSetup extends MapDslStandaloneSetupGenerated{

	public static void doSetup() {
		new MapDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

