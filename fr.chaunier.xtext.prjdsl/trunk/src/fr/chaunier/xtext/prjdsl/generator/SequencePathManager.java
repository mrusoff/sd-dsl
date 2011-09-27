package fr.chaunier.xtext.prjdsl.generator;

import java.util.HashMap;

import fr.chaunier.xtext.mapping.PathMapFeature;
import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;

public class SequencePathManager {

	HashMap<String,String> inversePathsMap = new HashMap<String,String>();
	public HashMap<String, String> getInversePathsMap() {
		return inversePathsMap;
	}

	public void setInversePathsMap(HashMap<String, String> inversePathsMap) {
		this.inversePathsMap = inversePathsMap;
	}

	public Entity getSource() {
		return source;
	}

	public void setSource(Entity source) {
		this.source = source;
	}

	Entity source ;
	Entity target ;
//	PathMapFeature pathFeatureSource ;
//	PathMapFeature pathFeatureTarget ;
	
	
	public Entity getTarget() {
		return target;
	}

	public void setTarget(Entity target) {
		this.target = target;
	}

	public boolean isFist() { 
		return inversePathsMap.size() == 0 ;
	}
	
}
