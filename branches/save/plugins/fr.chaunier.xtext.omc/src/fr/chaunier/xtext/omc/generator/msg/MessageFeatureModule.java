package fr.chaunier.xtext.omc.generator.msg;
import com.google.inject.AbstractModule;

import fr.chaunier.xtext.omc.renderer.CellFeatureRenderer;
import fr.chaunier.xtext.omc.renderer.IEntityRenderer;
import fr.chaunier.xtext.omc.renderer.IFeatureRenderer;
import fr.chaunier.xtext.omc.renderer.TextileMessageRenderer;

public class MessageFeatureModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(IEntityRenderer.class).to(TextileMessageRenderer.class);
		bind(IFeatureRenderer.class).to(CellFeatureRenderer.class);
	}
}
