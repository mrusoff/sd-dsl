package fr.chaunier.xtext.omc.generator.oo;
import com.google.inject.AbstractModule;

import fr.chaunier.xtext.omc.renderer.CellFeatureRenderer;
import fr.chaunier.xtext.omc.renderer.IEntityRenderer;
import fr.chaunier.xtext.omc.renderer.IFeatureRenderer;
import fr.chaunier.xtext.omc.renderer.TextileEntityRenderer;

public class EntityFeatureModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(IEntityRenderer.class).to(TextileEntityRenderer.class);
		bind(IFeatureRenderer.class).to(CellFeatureRenderer.class);
	}
}
