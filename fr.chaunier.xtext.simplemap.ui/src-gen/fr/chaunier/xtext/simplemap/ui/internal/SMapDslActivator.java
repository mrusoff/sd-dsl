
/*
 * generated by Xtext
 */
package fr.chaunier.xtext.simplemap.ui.internal;

import org.apache.log4j.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

import java.util.Map;
import java.util.HashMap;

/**
 * Generated
 */
public class SMapDslActivator extends AbstractUIPlugin {

	private Map<String,Injector> injectors = new HashMap<String,Injector>();
	private static SMapDslActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {
			
			injectors.put("fr.chaunier.xtext.simplemap.SMapDsl", Guice.createInjector(
				Modules.override(Modules.override(getRuntimeModule("fr.chaunier.xtext.simplemap.SMapDsl")).with(getUiModule("fr.chaunier.xtext.simplemap.SMapDsl"))).with(getSharedStateModule())
			));
			
		} catch (Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}
	
	public static SMapDslActivator getInstance() {
		return INSTANCE;
	}
	
	protected Module getRuntimeModule(String grammar) {
		
		if ("fr.chaunier.xtext.simplemap.SMapDsl".equals(grammar)) {
		  return new fr.chaunier.xtext.simplemap.SMapDslRuntimeModule();
		}
		
		throw new IllegalArgumentException(grammar);
	}
	protected Module getUiModule(String grammar) {
		
		if ("fr.chaunier.xtext.simplemap.SMapDsl".equals(grammar)) {
		  return new fr.chaunier.xtext.simplemap.ui.SMapDslUiModule(this);
		}
		
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}
	
}