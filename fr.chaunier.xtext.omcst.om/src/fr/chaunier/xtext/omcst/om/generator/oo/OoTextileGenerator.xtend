/*
 * generated by Xtext
 */
package fr.chaunier.xtext.omcst.om.generator.oo

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmcstExtensions

import fr.chaunier.xtext.omcst.om.generator.ImportManager
import fr.chaunier.xtext.omcst.om.generator.GeneratorExtensions
import fr.chaunier.xtext.omcst.om.MergeConstraintInString

class OoTextileGenerator  {

  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

/* compile the sumury */
  def compileTxt(PackageDeclaration pac,GeneratorExtensions generatorExtensions) '''
	�val entities = pac.elements.filter(typeof(Entity))�
�compileTxtSummary(pac,entities)�
�compileTxtBody(pac,entities)�
  '''	

  // draw the summury		

  def compileTxtSummary(PackageDeclaration pac,Iterable<Entity> entities) '''
�val importManager = new ImportManager()� 

h1. package : �pac.name�

table{border:1px solid black}.
| **name** | **prefix** | **namspace** | 
| �pac.name�  | �pac.prefix� | �pac.namespace� 

�val enums = pac.elements.filter(typeof(Enumeration))� 
�enumsTxt(enums,importManager)�

�val datatypes = pac.elements.filter(typeof(DataType))� 
�dataTypeTxt(datatypes,importManager)�

�entitySummuryTxt(entities,importManager)�

'''

////////// summury

	def enumerationString(Enumeration e) {
		var res = '['
	      for (l:e.enumerationLiterals) {
			res = res + '(' l.name + ',' + l.persistedValue +') ' 
			}
		res = res + ']'	 
	}

//!"�t.name�":#�t.name�

  // draw enumerations table
  def enumsTxt(Iterable<Enumeration> enums,ImportManager importManager) '''
	�IF enums.size > 0� 
h2(#Enumerations). Enumerations  
	  
table{border:1px solid black}.
|_.|_. Name |_. Constraint  |_. Documentation  |_.
      �FOR e:enums�	
|!icons/Property.gif!| �e.name� | �e.enumerationString� | |
      �ENDFOR�

	�ENDIF�
  ''' 	

  // draw data type table
  //* !icons/Datatype.gif!"�t.name�":#�t.name�
  
  def dataTypeTxt(Iterable<DataType> datatypes,ImportManager importManager) '''
	�IF datatypes.size > 0� 
    �val constraint = new MergeConstraintInString()�  
h2(#DataTypes). DataTypes

table{border:1px solid black}.
|_.|_. Name |_. Constraint  |_. Documentation  |_.
     �FOR dt:datatypes�	
|!icons/Property.gif!| �dt.name� | �constraint.constraintByString(dt.constraint)� | �dt.description� 
      �ENDFOR�

	�ENDIF�
  '''
  
  // draw data type table
  def entitySummuryTxt(Iterable<Entity> entities,ImportManager importManager) '''
	�IF entities.size > 0� 
h2. Entites

table{border:1px solid black}.
|_.|_. Name  |_. Documentation  |_.
      �FOR t:entities�	
|!icons/Entity.gif!|�t.name�|
      �ENDFOR�

	�ENDIF�
  ''' 	


// ------------------------------ entities detail

  def compileTxtBody(PackageDeclaration pac,Iterable<Entity> entities) '''
    �val importManager = new ImportManager()� 
    �val body = bodyTxt(entities, importManager)�
�val pcks = importManager.getImportPackages(pac)�
�FOR i:pcks�
�i.prefix�="�i.namespace�"
�ENDFOR�
�body�
  '''

  
  def bodyTxt(Iterable<Entity> entities, ImportManager importManager) '''

�IF entities.size > 0� 
h2. Entities

   �FOR e:entities�	
�entityDetailTxt(e, importManager)�
    �ENDFOR�
�ENDIF�    
  '''

def entityDetailTxt(Entity e, ImportManager importManager) '''

h3(#�e.name�). Class Name : �e.name� �IF e.superType!=null� Super types  �e.superType.name��ENDIF� �IF e.isAbstract�abstract�ENDIF�

p{color:blue}. �e.description�

h4. Attributes

table{border:1px solid black}.
|_.|_. Name |_. Type |_. Cardinality |_. Constraint  |_. Documentation  |_.
    �FOR f:e.features�
       �featureTxt(f, importManager)�
    �ENDFOR�
  '''

 def dispatch featureTxt(Feature f, ImportManager importManager) '''
 '''
 
  def dispatch featureTxt(Attribute a, ImportManager importManager) '''
  �val om = new GeneratorExtensions()�
  �val constraint = new MergeConstraintInString()�  
|!icons/Property.gif!| �a.name� | �a.type.referenced.linkHtml� | �constraint.cardinalityString(a)� | �constraint.constraintString(a)�| �a.description� 
   '''

  
  def dispatch featureTxt(Reference r, ImportManager importManager) '''
  �val om = new GeneratorExtensions()�
  �val constraint = new MergeConstraintInString()�  
|!icons/Property.gif!| �r.name� | �r.type.referenced.linkHtml� | �constraint.cardinalityString(r)� | | �r.description� 
   '''

/*
  def linkHtml2(Type type) {
  	val om = new OmcstExtensions()
	'"' + type.name+ '":'+om.packageName(type)+ '.html#' + type.name 
  } 
*/

  def linkHtml(Type type) {
    	val om = new OmcstExtensions()
    switch(type) {
		Entity : '"' + type.name+ '":'+om.packageName(type)+ '.html#' + type.name 
		DataType : '"' + type.name+ '":'+om.packageName(type)+ '.html#' + '#DataTypes'	
		Enumeration : '"' + type.name+ '":'+om.packageName(type)+ '.html#' + '#Enumerations'	
	}
  } 
   	
}
	
	