

package fr.chaunier.xtext.omc.generator.msg

import fr.chaunier.xtext.omc.Helpers
import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Feature
import fr.chaunier.xtext.omc.omcDsl.FileSpecModel
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.omc.omcDsl.Type
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class MessageTextileGenerator implements IGenerator  {

/*
 * generate doc for root entity
 * generate doc for concrete entity on same package
 * generate doc for concrete entity on differente package 
 */
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		var generatorExtensions = new MsgGeneratorExtensions()
		var concreteEntities = new HashSet<Entity>()
		var generation = false   
	    for(fileSpec : input.allContentsIterable.filter(typeof(FileSpecModel))) {
	      	fsa.generateFile(generatorExtensions.fileName(fileSpec.entity), compileTextile(fileSpec.entity,true))
	      	generation = true
			// search concrete entity on different package and show it
		}
		val entityHelper = new OmHelper()
		if (! generation )
		for(entity : input.allContentsIterable.filter(typeof(Entity))) {
	    	if ( entityHelper.concreteEntity(entity) )
      			fsa.generateFile(generatorExtensions.fileName(entity), compileTextile(entity,false))
		}
	}


	def compileTextile(Entity entity,boolean whithConcrete) '''
«var i = new java.lang.Integer(-1)»
«var msgManager = new MsgManager()»
«val entityHelper = new OmHelper()»
«val iconPath = '../' + Helpers::getRelativeRoot(entityHelper.QualifiedName(entity)) + 'icons/'»

«val specRenderer = new SpecFileRenderer()»
«specRenderer.specRender(entity)»

h2. «entity.name»

table{border:1px solid black}.
|_.|_.|_. Name |_. Type |_. Cardinality |_. Cst type |_. Cst spec |_. Documentation  |_.
«row(entity,i,msgManager,iconPath)»

«IF ! whithConcrete»  
«concreteEnitiesInSamePackage(entity,iconPath)»
«ENDIF»	
	'''

/* search concrete entity on same package and show it
 * 
 * */
	def concreteEnitiesInSamePackage(Entity root,String iconPath) '''
«val entityHelper = new OmHelper()»
«var pack = entityHelper.getPackageDeclaration(root)»
«var concreteEntities = entityHelper.searchConcreteEntitiesInPackage(pack)»
«var i = new java.lang.Integer(-1)»
«var msgManager = new MsgManager()»
«IF ! concreteEntities.empty»
	«FOR ce:concreteEntities»
h2. «ce.name»

table{border:1px solid black}.
|_.|_.|_. Name |_. Type |_. Cardinality |_. Cst type |_. Cst spec |_. Documentation  |_.
«row(ce,i,msgManager,iconPath)»
	«ENDFOR»
«ENDIF»

	''' 

  def dispatch row(Type e,Integer i,MsgManager manager,String iconPath) '''
  '''
  
  def dispatch row(Entity e,Integer i,MsgManager msgManager,String iconPath) '''
    «val entityHelper = new OmHelper()»
    «FOR f:entityHelper.getFeaturesWithHerited(e)»
       «featureRow(f,i+1,msgManager,iconPath)»
    «ENDFOR»
  '''

  def dispatch featureRow(Feature f,Integer i,MsgManager msgManager,String iconPath) '''
  '''

//«val iconType=constraintRenderer.getIconsType(cst,iconPath)»
  	
  def dispatch featureRow(Attribute a,Integer i,MsgManager msgManager,String iconPath) '''
«var msgRenderer = MessageFactory::messageInstance»
«msgRenderer.setIconPath(iconPath)»
«val iconType=msgRenderer.elementType(a)»
  «IF msgRenderer.isEntity(a)»
  «val icon = '!'+iconPath+'Entity.gif!'»
|«msgManager.getNext()»| «icon» | «msgManager.getIndentation(i)»«a.name»| «iconType» «a.type.referenced.name» |  «msgRenderer.cardinality(a)» | «msgRenderer.constraintType(a) »  | «msgRenderer.constraintInFeature(a)» |  «a.description» 
  «row(a.type.referenced,i,msgManager,iconPath)»	
  «ELSE»
  «val icon = '!'+iconPath+'Attribute.gif!'»
|«msgManager.getNext()»| «icon» | «msgManager.getIndentation(i)»«a.name»| «iconType» «a.type.referenced.name» | «msgRenderer.cardinality(a)» | «msgRenderer.constraintType(a)»  | «msgRenderer.constraintInFeature(a)» | «a.description»
  «ENDIF»   
   '''


  def dispatch featureRow(Reference r,Integer i,MsgManager msgManager,String iconPath) '''
«var msgRenderer = MessageFactory::messageInstance»
«msgRenderer.setIconPath(iconPath)»
«val iconType=msgRenderer.elementType(r)»
«val icon = '!'+iconPath+'Reference.gif!'»
|«msgManager.getNext()»| «icon» |«msgManager.getIndentation(i)»«r.name»| «iconType» «r.type.referenced.name» | «msgRenderer.cardinality(r)»  |   | «r.description» 
   '''

}