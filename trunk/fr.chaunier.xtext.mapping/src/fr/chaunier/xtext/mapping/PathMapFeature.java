package fr.chaunier.xtext.mapping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xtend.util.Pair;

import fr.chaunier.xtext.omcst.om.omcstDsl.Entity;
import fr.chaunier.xtext.omcst.om.omcstDsl.Feature;

	public class PathMapFeature {
		
		public PathMapFeature(Entity source,Entity target) {
			this.source = source ;
			this.target = target ;		
		}
		
		private Entity source ;
		public Entity getSource() {
			return source;
		}


		public Entity getTarget() {
			return target;
		}

		private Entity target ;
		
		private List<Pair<String,String>> pathMaps = new ArrayList<Pair<String,String>>();

		public List<Pair<String, String>> getPathMaps() {
			return pathMaps;
		}

		private List<Pair<String,Feature>> pathFromFeatures = new ArrayList<Pair<String,Feature>>();
		public List<Pair<String, Feature>> getPathFromFeatures() {
			return pathFromFeatures;
		}


		public List<Pair<String, Feature>> getPathToFeatures() {
			return pathToFeatures;
		}

		private List<Pair<String,Feature>> pathToFeatures = new ArrayList<Pair<String,Feature>>();
		
		public void addMaps(String from,String to,Feature featureFrom , Feature featureTo) {
			pathMaps.add(new Pair<String,String>(from,to));
			pathFromFeatures.add(new Pair<String,Feature>(from,featureFrom));
			pathToFeatures.add(new Pair<String,Feature>(to,featureTo));
		}
		

		public void addMaps(String from,String to) {
			pathMaps.add(new Pair<String,String>(from,to));
		}

		public String getPathFrom(String pathTo) {
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathTo.equals( map.getFirst())) 
					return map.getSecond();
			}
			return null;
		}

		public Pair<String,String> getPathFromPair(String pathTo) {
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathTo.equals( map.getFirst())) 
					return map;
			}
			return null;
		}

		public String getPathTo(String pathFrom) {
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathFrom.equals( map.getSecond())) 
					return map.getFirst();
			}
			return null;
		}
		
		public Pair<String,String> getPathToPair(String pathFrom) {
			for ( Pair<String,String> map:pathMaps ) {
				if ( pathFrom.equals( map.getSecond())) 
					return map;
			}
			return null;
		}

		public Feature getFeatureFrom(String pathFrom) {
			for ( Pair<String,Feature> map:pathFromFeatures ) {
				if ( pathFrom != null )
				if ( pathFrom.equals( map.getFirst())) 
					return map.getSecond();
			}
			return null;
		}
	
		public Feature getFeatureTo(String pathTo) {
			for ( Pair<String,Feature> map:pathToFeatures ) {
				if ( pathTo != null )
				if ( pathTo.equals( map.getFirst())) 
					return map.getSecond();
			}
			return null;
		}
		
	}
