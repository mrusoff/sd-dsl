package fr.chaunier.xtext.path.map.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.internal.xtend.util.Pair;

import fr.chaunier.xtext.omc.omcDsl.Entity;
import fr.chaunier.xtext.omc.omcDsl.Feature;


	public class PathMapFeature {
		
		private Entity source ;
		private Entity target ;
		
		// set the link representation from -> to in path string
		private List<Pair<String,String>> pathMaps = new ArrayList<Pair<String,String>>();
		// set the feature link from the path representation
		private Map<String,Feature> pathFromFeatures = new HashMap<String,Feature>();
		// set the feature link to the path representation
		private Map<String,Feature> pathToFeatures = new HashMap<String,Feature>();
		// set the rule the pair path representation of link
		private Map<Pair<String,String>,MapArgs> linkToRule = new HashMap<Pair<String,String>,MapArgs>();
		// set the rule the pair path representation of link
		private Map<Pair<String,String>,String> linkToDoc = new HashMap<Pair<String,String>,String>();
		
		public PathMapFeature(Entity source,Entity target) {
			this.source = source ;
			this.target = target ;		
		}
		
		public Entity getSource() {
			return source;
		}

		public Entity getTarget() {
			return target;
		}

		public List<Pair<String, String>> getPathMaps() {
			return pathMaps;
		}
		
		public void addMaps(String from,String to,Feature featureFrom , Feature featureTo,MapArgs mapArgs,String doc) {
			Pair<String,String> link = new Pair<String,String>(from,to);
			pathMaps.add(link);
			pathFromFeatures.put(from, featureFrom);
			pathToFeatures.put(to, featureTo);
			linkToRule.put(link, mapArgs);
			linkToDoc.put(link, doc);
		}
		
		public void addMaps(String from,String to,Feature featureFrom , Feature featureTo,MapArgs mapArgs) {
			Pair<String,String> link = new Pair<String,String>(from,to);
			pathMaps.add(link);
			pathFromFeatures.put(from, featureFrom);
			pathToFeatures.put(to, featureTo);
			linkToRule.put(link, mapArgs);
		}
		

		public List<String> getPathsFrom(String pathTo) {
			List<String> paths = new ArrayList<String>() ; 
			if ( pathTo == null )
				return paths; 
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathTo.equals( map.getFirst())) 
					paths.add(map.getSecond());
			}
			return paths;
		}

		public List<String> getPathsTo(String pathFrom) {
			List<String> paths = new ArrayList<String>() ; 
			if ( pathFrom == null )
				return paths; 
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathFrom.equals( map.getSecond())) 
					paths.add(map.getFirst());
			}
			return paths;
		}

		public List<Pair<String,String>> getPathsToPair(String pathFrom) {
			List<Pair<String,String>> paths = new ArrayList<Pair<String,String>>() ; 
			if ( pathFrom == null )
				return paths; 
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathFrom.equals( map.getSecond())) 
					paths.add(map);
			}
			return paths;
		}

		public List<Pair<String,String>> getPathsFromPair(String pathTo) {
			List<Pair<String,String>> paths = new ArrayList<Pair<String,String>>() ; 
			if ( pathTo == null )
				return paths;
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathTo.equals( map.getFirst())) 
					paths.add(map);
			}		
			return paths;
		}
		
		public Feature getFeatureFrom(String pathFrom) {
			return pathFromFeatures.get(pathFrom);
		}
	
		public Feature getFeatureTo(String pathTo) {
			return pathToFeatures.get(pathTo);
		}
		
		public MapArgs getMapArgs(Pair<String,String> pair) {
			return linkToRule.get(pair);
		}
		

		public MapArgs getMapArgs(String from,String to) {
			return linkToRule.get(new Pair<String,String>(from,to));
		}

		public String getDoc(Pair<String,String> pair) {
			return linkToDoc.get(pair);
		}

		public String getDoc(String from,String to) {
			return linkToDoc.get(new Pair<String,String>(from,to));
		}
	}
