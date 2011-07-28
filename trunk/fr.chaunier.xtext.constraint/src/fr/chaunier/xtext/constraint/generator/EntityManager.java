package fr.chaunier.xtext.constraint.generator;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import fr.chaunier.xtext.constraint.cstDsl.EntityConstraint;
import fr.chaunier.xtext.om.omDsl.Entity;

/**
	 */
public class EntityManager {

	// link entity cts by entity name
	private Map<Entity,EntityConstraint> entityLinks = newHashMap();

	public void appendEntity(EntityConstraint ec) {
		entityLinks.put(ec.getEntity(),ec);
	}

	public EntityConstraint getConstraint(Entity entity) {
		return entityLinks.get(entity) ;
	}
	
/*	
	public List<String> getImports() {
		ArrayList<String> result = newArrayList(packageDecls.keySet());
		Collections.sort(result);
		return result;
	}
*/
	
}
