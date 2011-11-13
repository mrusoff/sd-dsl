package fr.chaunier.xtext.omc.renderer;

import fr.chaunier.xtext.omc.omcDsl.Constraint;

public interface IFeatureRenderer {

	public abstract String constraint(Constraint cst/*String iconPath*/);
	public abstract void setIconPath(String iconPath);
	public abstract String getIconPath();
}