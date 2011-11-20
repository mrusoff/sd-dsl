package fr.chaunier.xtext.constraint.generator;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import fr.chaunier.xtext.constraint.cstDsl.AttributeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Enumeration;

/**
	 */
public class EntityManager {

	private Map<Attribute, AttributeConstraint> mapA = newHashMap();

	public void append(AttributeConstraint ec) {
		mapA.put(ec.getAttribute(), ec);
	}


	public AttributeConstraint getAtrtibuteConstraint(Attribute a) {
		return mapA.get(a);
	}

}
