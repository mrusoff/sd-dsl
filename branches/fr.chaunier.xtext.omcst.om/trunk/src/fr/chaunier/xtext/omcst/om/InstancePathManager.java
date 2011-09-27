package fr.chaunier.xtext.omcst.om;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.Feature;


public class InstancePathManager {

// for path
	
	Entity root ;
	
	public InstancePathManager(Entity root) {
	}
	// map the string
	private Map<String,Feature> pathsMap = new HashMap<String,Feature>();
	// prevent double path
//	private Set<String> pathsSet = new HashSet<String>();
	// let the path order  
	private List<String> paths = new ArrayList<String>();
	

//	public void addPath(String path) {
//		boolean isAdd = pathsSet.add(path);
//		if (isAdd)
//			paths.add(path);
//	}
	
	public void addPath(String path,Feature feature) {
		boolean isAdd = pathsMap.put(path, feature) == null ;
		if (isAdd)
			paths.add(path);
	}

	public List<String> getPaths() {
		return paths ;
	}

	public Feature getFeature(String path) {
		return pathsMap.get(path);
	}
	
	public Entity getRoot() {
		return root ;
	}
}
