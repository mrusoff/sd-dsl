/*
 * generated by Xtext
 */
package fr.chaunier.xtext.constraint.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CstDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return fr.chaunier.xtext.constraint.ui.internal.CstDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return fr.chaunier.xtext.constraint.ui.internal.CstDslActivator.getInstance().getInjector("fr.chaunier.xtext.constraint.CstDsl");
	}
	
}
