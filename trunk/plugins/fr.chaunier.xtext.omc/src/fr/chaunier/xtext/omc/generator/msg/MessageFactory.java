package fr.chaunier.xtext.omc.generator.msg;

import com.google.inject.Guice;

import fr.chaunier.xtext.omc.renderer.IEntityRenderer;

public class MessageFactory {

	public static IEntityRenderer getMessageInstance() {
		return Guice.createInjector(new MessageFeatureModule()).getInstance(IEntityRenderer.class) ;
	}
	
}
