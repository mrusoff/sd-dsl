
/*
 * generated by Xtext
 */
 
package fr.chaunier.xtext.mapdsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class MapDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return fr.chaunier.xtext.mapdsl.ui.internal.MapDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return fr.chaunier.xtext.mapdsl.ui.internal.MapDslActivator.getInstance().getInjector("fr.chaunier.xtext.mapdsl.MapDsl");
	}
	
}
