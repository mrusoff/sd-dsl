/*
* generated by Xtext
*/
package fr.chaunier.xtext.instance.om;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class InstanceDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.chaunier.xtext.instance.om.ui.internal.InstanceDslActivator.getInstance().getInjector("fr.chaunier.xtext.instance.om.InstanceDsl");
	}
	
}
