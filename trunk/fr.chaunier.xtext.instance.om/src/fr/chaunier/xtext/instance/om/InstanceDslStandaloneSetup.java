
package fr.chaunier.xtext.instance.om;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InstanceDslStandaloneSetup extends InstanceDslStandaloneSetupGenerated{

	public static void doSetup() {
		new InstanceDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

