
/*
 * generated by Xtext
 */
 
package fr.chaunier.xtext.simplemap.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class SMapDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return fr.chaunier.xtext.simplemap.ui.internal.SMapDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return fr.chaunier.xtext.simplemap.ui.internal.SMapDslActivator.getInstance().getInjector("fr.chaunier.xtext.simplemap.SMapDsl");
	}
	
}