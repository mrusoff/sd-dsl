package fr.chaunier.xtext.constraint.generator;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import fr.chaunier.xtext.constraint.cstDsl.DataTypeConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.constraint.cstDsl.EnumerationConstraint;
import fr.chaunier.xtext.om.omDsl.Attribute;
import fr.chaunier.xtext.om.omDsl.DataType;
import fr.chaunier.xtext.om.omDsl.Entity;
import fr.chaunier.xtext.om.omDsl.Enumeration;

/**
	 */
public class ConstraintManager {

	private Map<Entity, EntityConstraint> mapE = newHashMap();
	private Map<DataType, DataTypeConstraint> mapD = newHashMap();
	private Map<Enumeration, EnumerationConstraint> mapEnum = newHashMap();

	public void append(EntityConstraint ec) {
		mapE.put(ec.getEntity(), ec);
	}

	public void append(DataTypeConstraint dtc) {
		mapD.put(dtc.getDataType(), dtc);
	}

	public void append(EnumerationConstraint enc) {
		mapEnum.put(enc.getEnumerate(), enc);
	}

	public EntityConstraint getEntityConstraint(Entity e) {
		return mapE.get(e);
	}

	public DataTypeConstraint getDataTypeConstraint(DataType dt) {
		return mapD.get(dt);
	}

	public EnumerationConstraint getEnumerationConstraint(Enumeration en) {
		return mapEnum.get(en);
	}
}
