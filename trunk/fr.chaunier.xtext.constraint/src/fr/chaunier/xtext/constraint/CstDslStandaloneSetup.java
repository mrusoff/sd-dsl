
package fr.chaunier.xtext.constraint;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CstDslStandaloneSetup extends CstDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CstDslStandaloneSetup().createInjectorAndDoEMFRegistration();
//		setReferencedGenModels("");
	}
}

