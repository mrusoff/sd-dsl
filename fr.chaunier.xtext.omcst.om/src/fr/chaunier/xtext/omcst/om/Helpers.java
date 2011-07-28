package fr.chaunier.xtext.omcst.om;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.EntityType;

public class Helpers {

	
	public boolean isAbstract(Entity e) {
		if (e == null ) return false ;
		if (e.getEntityType() == null ) return false ;
		return e.getEntityType()==EntityType.ABSTRACT;
	}

}
