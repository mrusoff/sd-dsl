package fr.chaunier.xtext.omcst.om

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.generator.GeneratorExtensions

class FeaturePathBuilderWithEntity {

  def compilePath(Entity rootInstanceEntity,InstancePathManager instancePathManager) {
  	var generatorExtensions = new GeneratorExtensions()
  	var pathPrefixe = generatorExtensions.QualifiedName(rootInstanceEntity).toString 
	val om = new OmHelper()
	for (f:om.getFeaturesWithHerited(rootInstanceEntity).filter(typeof(Attribute))) {
		featurePath(f,pathPrefixe,':',instancePathManager)
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