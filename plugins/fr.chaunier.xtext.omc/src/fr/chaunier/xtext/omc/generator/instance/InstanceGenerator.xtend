package fr.chaunier.xtext.omc.generator.instance


import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.BoolConstraint
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Enumeration
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint
import fr.chaunier.xtext.omc.omcDsl.FileSpecModel
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.omc.omcDsl.StringConstraint
import fr.chaunier.xtext.omc.omcDsl.Type
import fr.chaunier.xtext.omc.generator.ImportManager
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
 
class InstanceGenerator implements IGenerator {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		var generatorExtensions = new InstanceGeneratorExtensions()
	    for(fileSpec : input.allContentsIterable.filter(typeof(FileSpecModel))) {
	      	fsa.generateFile(generatorExtensions.fileName(fileSpec.entity), compileInstance(fileSpec.entity))
		}
	}


  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

/* compile the text */
  def compileInstance(Entity root) '''
	«val importManager = new ImportManager()»
	«val body = bodyTxt(root,importManager)»
    «FOR i:importManager.imports»
import «i».*
    «ENDFOR»
    «body»
	'''
  
/*	«val body = bodyTxt(pac, importManager)» */
/*
  def compileTxt(PackageDeclaration pac,ImportManager importManager) {
	val body = bodyTxt(pac,importManager)
  }	
*/
  def bodyTxt(Entity rootInstanceEntity,ImportManager importManager) '''
«val OE = new OmHelper()»
«var p = OE.getPackageDeclaration(rootInstanceEntity)»   
«var path = p.name + '.' + rootInstanceEntity.name»
«val packName = shortName(rootInstanceEntity,importManager)»
«rootInstanceEntity.name» «rootInstanceEntity.name.toLowerCase»  {
	«typeTxt(rootInstanceEntity,path,importManager)» 
}
'''

  def dispatch typeTxt(Type dt, String path,ImportManager instanceManagerManager) '''
type
  '''

  def dispatch typeTxt(Attribute a,DataType dt, String path,ImportManager importManager) '''
«val qn = new DefaultDeclarativeQualifiedNameProvider()»
//path «path»  qn «qn.getFullyQualifiedName(dt)»
«IF ! a.type.multi»  
«a.name» = «getValue(a,dt)»
«ELSE»  
«a.name» += «getValue(a,dt)»
«ENDIF»
  '''

  def dispatch typeTxt(Attribute a,Enumeration en, String path,ImportManager importManager) '''
«val qn = new DefaultDeclarativeQualifiedNameProvider()»
//path «path»  qn «qn.getFullyQualifiedName(en)»
«IF ! a.type.multi»  
«a.name» = «getValue(a,en)»
«ELSE»  
«a.name» += «getValue(a,en)»
«ENDIF»
  '''

def getReturnType(Attribute a,Type type) {
//	println(type)
	switch type {
		DataType : "'"+a.name+"'"
		Enumeration : "'"+type.enumerationLiterals.head.name+"'"
	}
}

def getValue(Attribute a,Type t) '''
	«var ret = getReturnType(a,t)»
	«IF a.constraint == null»
		'«a.name»'
	«ELSE»
	«switch a.constraint {
		StringConstraint : ret 
		DecimalConstraint : 0
		EnumerationConstraint : ret
		BoolConstraint : 'true'
		DateTimeConstraint : 23242000 
//		default : "«a.name»"
		}		
	»
	«ENDIF»
'''

def dispatch typeTxt(Entity et, String path, ImportManager importManager) '''
  «val entityHelper = new OmHelper()»
  «FOR f:entityHelper.getFeaturesWithHerited(et).filter(typeof(Attribute))» 
	«featureTxt(f,path,importManager)»
«ENDFOR»
  '''
  def dispatch featureTxt(Attribute a, String path,ImportManager importManager) '''
  «IF a.type.referenced instanceof Entity»
«val qn = new DefaultDeclarativeQualifiedNameProvider()»
//path «path+'.'+a.name»  qn «qn.getFullyQualifiedName(a)»
«val shortName = shortName(a.type.referenced,importManager)»
«IF ! a.type.multi»  
  «a.name» = «a.type.referenced.name»  {
«ELSE»  
  «a.name» += «a.type.referenced.name»  {
«ENDIF»
      «typeTxt(a.type.referenced,path+'.'+a.name,importManager)»  
  }
  «ELSE»
  «typeTxt(a,a.type.referenced,path+'.'+a.name,importManager)»  
«ENDIF» 
  '''

  def dispatch featureTxt(Reference r, String path, ImportManager importManager) '''
  '''

}