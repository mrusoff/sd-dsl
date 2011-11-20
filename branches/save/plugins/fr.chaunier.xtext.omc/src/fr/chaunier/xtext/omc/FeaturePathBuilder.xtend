package fr.chaunier.xtext.omc

import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Type

class FeaturePathBuilder {

  def compilePath(Entity rootInstanceEntity,InstancePathManager instancePathManager) {
//  	var pathPrefixe = generatorExtensions.QualifiedName(rootInstanceEntity).toString
	var pathPrefixe = '' 
	val om = new OmHelper()
	for (f:om.getFeaturesWithHerited(rootInstanceEntity).filter(typeof(Attribute))) {
		featurePath(f,pathPrefixe,'',instancePathManager)
	}
  }	

  def dispatch typePath(Entity et, String path, InstancePathManager instancePathManager) {
	val om = new OmHelper()
 	for (f:om.getFeaturesWithHerited(et).filter(typeof(Attribute))) {
		featurePath(f,path,'.',instancePathManager)
	}
	return null
  }

  def dispatch typePath(Type type, String path, InstancePathManager instancePathManager) {
	return null
  }

  def featurePath(Attribute a, String path, String separator,InstancePathManager instancePathManager) {
  	  val pathFeature = path+separator+a.name
  	  instancePathManager.addPath(pathFeature,a)
      typePath(a.type.referenced,pathFeature,instancePathManager)  
  }

	
}