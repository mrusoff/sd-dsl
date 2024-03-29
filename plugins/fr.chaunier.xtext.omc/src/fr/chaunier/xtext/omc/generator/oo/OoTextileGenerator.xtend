/*
 * generated by Xtext
 */
package fr.chaunier.xtext.omc.generator.oo


import fr.chaunier.xtext.omc.Helpers
import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.generator.GeneratorExtensions
import fr.chaunier.xtext.omc.generator.ImportManager
import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Enumeration
import fr.chaunier.xtext.omc.omcDsl.Feature
import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.omc.omcDsl.Type
import fr.chaunier.xtext.omc.renderer.MultiCellsFeatureRenderer
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

class OoTextileGenerator implements IGenerator  {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		var generatorExtensions = new OOGeneratorExtensions()
	    for(packageDeclaration : input.allContentsIterable.filter(typeof(PackageDeclaration))) {
	      	fsa.generateFile(generatorExtensions.fileName(packageDeclaration), compileTextile(packageDeclaration,generatorExtensions))
		}
	}



  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }


/* compile the sumury */
//		fsa.generateFileIfNotExists("myProject/" + entity.name + ".h", entity.compileHeader)	  

  def compileTextile(PackageDeclaration pac,GeneratorExtensions generatorExtensions) '''
�val entities = pac.elements.filter(typeof(Entity))�
�compileTxtSummary(pac,entities)�
�compileTxtBody(pac,entities)�
  '''	

  // draw the summury		

  def compileTxtSummary(PackageDeclaration pac,Iterable<Entity> entities) '''
�val importManager = new ImportManager()� 
�val OmHelper = new OmHelper()�
�val iconPath = '../' + Helpers::getRelativeRoot(OmHelper.QualifiedName(pac)) + 'icons/'�

h1. package : �pac.name�

table{border:1px solid black}.
| **name** | **prefix** | **namspace** | 
| �pac.name�  | �pac.prefix� | �pac.namespace� 

�val enums = pac.elements.filter(typeof(Enumeration))� 
�enumsTxt(enums,importManager,iconPath)�

�val datatypes = pac.elements.filter(typeof(DataType))� 
�dataTypeTxt(datatypes,importManager,iconPath)�

�entitySummuryTxt(entities,importManager,iconPath)�

'''

////////// summury

  // draw enumerations table
  def enumsTxt(Iterable<Enumeration> enums,ImportManager importManager,String iconPath) '''
	�IF enums.size > 0� 
�var entityRenderer = EntityFactory::entityInstance�
h2(#Enumerations). Enumerations  
	  
table{border:1px solid black}.
|_.|_. Name |_. Constraint  |_. Documentation  |_.
      �FOR e:enums�	
|!�iconPath�Enumeration.gif!| �e.name� | �entityRenderer.enumerationString(e)� | |
      �ENDFOR�

	�ENDIF�
  ''' 	

  // draw data type table
  //* !icons/Datatype.gif!"�t.name�":#�t.name�
//    �val constraintRenderer = new SimpleConstraintRenderer()�  
  
  def dataTypeTxt(Iterable<DataType> datatypes,ImportManager importManager,String iconPath) '''
	�IF datatypes.size > 0� 
�var entityRenderer = EntityFactory::entityInstance�
�entityRenderer.setIconPath(iconPath)�
h2(#DataTypes). DataTypes

table{border:1px solid black}.
|_.|_. Name |_. Constraint  |_. Documentation  |_.
     �FOR dt:datatypes�	
|!�iconPath�DataType.gif!| �dt.name� | �entityRenderer.constraintInFeature(dt)� | �dt.description� 
      �ENDFOR�

	�ENDIF�
  '''
  
  // draw data type table
  def entitySummuryTxt(Iterable<Entity> entities,ImportManager importManager,String iconPath) '''
	�IF entities.size > 0� 
h2. Entites

table{border:1px solid black}.
|_.|_. Name  |_. Documentation  |_.
      �FOR e:entities�	
|!�iconPath�Entity.gif!|�e.linkHtml��e.name�|
      �ENDFOR�

	�ENDIF�
  ''' 	


// ------------------------------ entities detail

  def compileTxtBody(PackageDeclaration pac,Iterable<Entity> entities) '''
    �val importManager = new ImportManager()� 
�val OmHelper = new OmHelper()�
�val iconPath = '../' + Helpers::getRelativeRoot(OmHelper.QualifiedName(pac)) + 'icons/'�
�val body = bodyTxt(entities, importManager,iconPath)�
�val pcks = importManager.getImportPackages(pac)�
�FOR i:pcks�
�i.prefix�="�i.namespace�"
�ENDFOR�
�body�
  '''

  
  def bodyTxt(Iterable<Entity> entities, ImportManager importManager,String iconPath) '''

�IF entities.size > 0� 
h2. Entities

   �FOR e:entities�	
�entityDetailTxt(e, importManager,iconPath)�
    �ENDFOR�
�ENDIF�    
  '''

def entityDetailTxt(Entity e, ImportManager importManager,String iconPath) '''

h3(#�e.name�). Class Name : �e.name� �IF e.superType!=null� Super types  �e.linkHtml��e.superType.name��ENDIF� �IF e.isAbstract�abstract�ENDIF�

p{color:blue}. �e.description�

�IF e.features.size != 0�
table{border:1px solid black}.
|_.|_. Name |_. Type |_. Cardinality |_. Constraint  |_. Documentation  |_.
    �FOR f:e.features�
       �featureTxt(f, importManager,iconPath)�
    �ENDFOR�
�ENDIF�    
  '''

 def dispatch featureTxt(Feature f, ImportManager importManager,String iconPath) '''
 '''
 
  def dispatch featureTxt(Attribute a, ImportManager importManager,String iconPath) '''
�var entityRenderer = EntityFactory::entityInstance�
�entityRenderer.setIconPath(iconPath)�
|!�iconPath�Property.gif!| �a.name� | �a.type.referenced.linkHtml� | �entityRenderer.cardinality(a)� | �entityRenderer.constraintInFeature(a)�| �a.description� 
   '''

  
  def dispatch featureTxt(Reference r, ImportManager importManager,String iconPath) '''
�var entityRenderer = EntityFactory::entityInstance�
�entityRenderer.setIconPath(iconPath)�
|!�iconPath�Property.gif!| �r.name� | �r.type.referenced.linkHtml� | �entityRenderer.cardinality(r)� | | �r.description� 
   '''
  
  def linkHtml(Type type) {
    	val om = new OmHelper()
    switch(type) {
		Entity : '"' + type.name+ '":'+om.getPackageDeclaration(type).name + '.html#' + type.name 
		DataType : '"' + type.name+ '":'+om.getPackageDeclaration(type).name + '.html#' + '#DataTypes'	
		Enumeration : '"' + type.name+ '":'+om.getPackageDeclaration(type).name+ '.html#' + '#Enumerations'	
	}
  } 
   	
}
	
	
