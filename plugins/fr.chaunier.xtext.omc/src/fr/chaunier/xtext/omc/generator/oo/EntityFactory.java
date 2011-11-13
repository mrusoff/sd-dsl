package fr.chaunier.xtext.omc.generator.oo;

import com.google.inject.Guice;

import fr.chaunier.xtext.omc.renderer.IEntityRenderer;

public class EntityFactory {

	public static IEntityRenderer getEntityInstance() {
		return Guice.createInjector(new EntityFeatureModule()).getInstance(IEntityRenderer.class) ;
	}
}
