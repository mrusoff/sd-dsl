
package fr.chaunier.xtext.archi;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
@SuppressWarnings("all")
public class AdslDslStandaloneSetupGenerated implements ISetup {

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new fr.chaunier.xtext.archi.AdslDslRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.chaunier.fr/xtext/archi/AdslDsl")) {
		EPackage.Registry.INSTANCE.put("http://www.chaunier.fr/xtext/archi/AdslDsl", fr.chaunier.xtext.archi.adslDsl.AdslDslPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("adsl", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("adsl", serviceProvider);
		




	}
}
