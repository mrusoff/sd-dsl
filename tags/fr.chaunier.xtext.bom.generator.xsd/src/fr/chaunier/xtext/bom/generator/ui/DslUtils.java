package fr.chaunier.xtext.bom.generator.ui;

import java.util.ArrayList;
import java.util.List;

import fr.chaunier.xtext.bom.bomDsl.Attribute;
import fr.chaunier.xtext.bom.bomDsl.DataType;
import fr.chaunier.xtext.bom.bomDsl.Entity;
import fr.chaunier.xtext.bom.bomDsl.Enumeration;
import fr.chaunier.xtext.bom.bomDsl.Feature;
import fr.chaunier.xtext.bom.bomDsl.PackageDeclaration;
import fr.chaunier.xtext.bom.bomDsl.Type;

public class DslUtils {

	public static void debugTrace(String msg) {
		System.out.println(msg);
	}

	public static void getAllSuperTypeEntities(List<Entity> entities,
			Entity entity) {
		if (entity.getSuperType() != null) {
			entities.add(entity.getSuperType());
			getAllSuperTypeEntities(entities, entity.getSuperType());
		}
	}

	public static List<Entity> getAllSuperTypeEntities(Entity entity) {
		List<Entity> entities = new ArrayList<Entity>();
		getAllSuperTypeEntities(entities, entity);
		return entities;
	}

	public static List<Feature> filterAttributeDataType(Entity entity) {
		List<Feature> features = new ArrayList<Feature>();
		// List<Feature> features = entity.getFeatures();
		for (Feature feature : entity.getFeatures()) {
			if (feature instanceof Attribute) {
				Attribute attribute = (Attribute) feature;
				Type type = attribute.getType().getReferenced();
				// debugTrace("type 1 " +
				// attribute.getType().getReferenced().toString());
				if (type instanceof DataType) {
					features.add(feature);
					// debugTrace("add " + feature.toString());
				}
			}
		}
		return features;
	}

	public static List<Feature> filterAttributeEntityType(Entity entity) {
		List<Feature> features = new ArrayList<Feature>();
		// List<Feature> features = entity.getFeatures();
		for (Feature feature : entity.getFeatures()) {
			if (feature instanceof Attribute) {
				Attribute attribute = (Attribute) feature;
				Type type = attribute.getType().getReferenced();
				// debugTrace("type 2 " +
				// attribute.getType().getReferenced().toString());
				if (type instanceof Entity) {
					features.add(feature);
					// debugTrace("add " + feature.toString());
				}
			}
		}
		return features;
	}

	public static List<Feature> filterAttributeEnumType(Entity entity) {
		List<Feature> features = new ArrayList<Feature>();
		// List<Feature> features = entity.getFeatures();
		for (Feature feature : features) {
			if (feature instanceof Attribute) {
				Attribute attribute = (Attribute) feature;
				Type type = attribute.getType().getReferenced();
				if (type instanceof Enumeration)
					features.add(feature);
			}
		}
		return features;
	}
	
	public static PackageDeclaration getPackage(PackageDeclaration pck) {
		if ( ! (pck.eContainer()instanceof PackageDeclaration )) {
			System.out.println("pack name"+pck.getName());
			return pck;
		}
		if ( pck.eContainer() instanceof PackageDeclaration)
			getPackage((PackageDeclaration)pck.eContainer());
		return null ;
	}
	
	public static PackageDeclaration getPackage(Type type) {
		Object oUp = type.eContainer() ;
		if( oUp instanceof Type ) {
			Type typeUp = (Type)oUp ;
			getPackage(typeUp);
		}
		else if ( oUp instanceof PackageDeclaration ) {
			PackageDeclaration pUp = (PackageDeclaration)oUp ;
//			System.out.println(type);
			return getPackage(pUp) ;				
		} return null;			
	}

}