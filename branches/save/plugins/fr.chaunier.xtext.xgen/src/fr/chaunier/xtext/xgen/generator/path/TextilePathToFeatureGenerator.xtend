package fr.chaunier.xtext.xgen.generator.path

import fr.chaunier.xtext.omc.FeaturePathBuilder
import fr.chaunier.xtext.omc.InstancePathManager
import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.generator.oo.EntityFactory

class TextilePathToFeatureGenerator {


  def pathList(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
		var entityRenderer = EntityFactory::entityInstance
    	val omHelper = new OmHelper()
    	for (p : instancePathManager.paths) {
    		val feature = instancePathManager.getFeature(p);
    		val att = omHelper.asAttribute(feature)
    		val typeName = omHelper.featureTypeName(feature)
    		builder.append(' | ');
    		if ( typeName.equals('Entity')) {
    			builder.append('**'+p+'**');
    		} 
    		else builder.append(p);
    		builder.append(' | ');
    		if (att != null) {
	    		builder.append(typeName);
    			builder.append(' | ');
	    		builder.append(entityRenderer.cardinality(att));
    			builder.append(' | ');
//	    		builder.append(contraint.constraintByString(att)); dont work
	    		builder.append(entityRenderer.constraintInFeature(att));
    		} else builder.append(' | | ');
   			builder.append(' | ');
   			if ( att.description != null )
   				builder.append(att.description);
   			builder.append(' | | ');
//    		val type = instancePathManager.getType(p)
//    		builder.append(type)
    		builder.append('\n');
    	} 
    	builder.toString
  }

  def pathList2(InstancePathManager instancePathManager) {
    	val builder = new StringBuilder()
    	for (p : instancePathManager.paths) {
    		builder.append(p);
//    		builder.append('\t');
//    		val type = instancePathManager.getType(p)
//    		builder.append(type)
    		builder.append('\n');
    	} 
    	builder.toString
  }

  def compileTxt(Entity entity) '''
	«val instancePathManager = new InstancePathManager(entity)»
	«val instance = new FeaturePathBuilder()»
	«instance.compilePath(entity,instancePathManager)»
	«instancePathManager.paths.size»
	
h1. Enity source : «entity.name» 
	
table{border:1px solid black}.
|_. Path |_. Type |_. Cardinality |_. Constraint  |_. Documentation  |_.
	«pathList(instancePathManager)»
  '''



}