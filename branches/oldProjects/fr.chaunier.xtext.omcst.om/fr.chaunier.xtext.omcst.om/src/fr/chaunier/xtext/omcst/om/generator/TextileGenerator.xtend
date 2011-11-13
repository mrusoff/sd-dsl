/*
 * generated by Xtext
 */
package fr.chaunier.xtext.omcst.om.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmcstExtensions

class TextileGenerator  {

  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

/* compile the sumury */
  def compileTxt(PackageDeclaration pac,GeneratorExtensions generatorExtensions) '''
  	�pac.compileTxtSummary�
  	�pac.compileTxtBody�
  '''	
	
  def compileTxtSummary(PackageDeclaration pac) '''
	�val importManager = new ImportManager()� 
	�val body = bodyTxt(pac, importManager)�

h1. package : �pac.name�

table{border:1px solid black}.
| **name** | **prefix** | **namspace** | 
| �pac.name�  | �pac.prefix� | �pac.namespace� 

h2. Enumeration definition

      �FOR t:pac.elements.filter(typeof(Enumeration))�	
* !icons/Enumeration.gif!"�t.name�":#�t.name�
      �ENDFOR�

h2. Data Type definition

      �FOR t:pac.elements.filter(typeof(DataType))�
* !icons/Datatype.gif!"�t.name�":#�t.name�
      �ENDFOR�

h2. Class definition

      �FOR t:pac.elements.filter(typeof(Entity))�	
* !icons/Entity.gif!"�t.name�":#�t.name�
      �ENDFOR�
      
   '''

/* compile the body */

  def compileTxtBody(PackageDeclaration pac) '''
    �val importManager = new ImportManager()� 
    �val body = bodyTxt(pac, importManager)�
�val pcks = importManager.getImportPackages(pac)�
�FOR i:pcks�
�i.prefix�="�i.namespace�"
�ENDFOR�
�body�
  '''
  
  def bodyTxt(PackageDeclaration p, ImportManager importManager) '''
      �FOR t:p.elements.filter(typeof(DataType))�	
        �typeTxt(t, importManager)�
      �ENDFOR�
      �FOR t:p.elements.filter(typeof(Entity))�	
        �typeTxt(t, importManager)�
      �ENDFOR�
      �FOR t:p.elements.filter(typeof(Enumeration))�	
        �typeTxt(t, importManager)�
      �ENDFOR�
  '''

  def dispatch typeTxt(Entity e, ImportManager importManager) '''
h3(#�e.name�). Class Name : �e.name�  

p{color:blue}. �e.description�

�IF e.superType!=null� Super types  �e.superType.name��ENDIF�

h4. Attributes

table{border:1px solid black}.
|_.|_. Name |_. Type |_. Cardinality |_. Semantic |_. Constraint  |_. Documentation  |_.
    �FOR f:e.features.filter(typeof(Attribute))�
       �featureTxt(f, importManager)�
    �ENDFOR�
  '''
/*
�((PackageDeclaration)type.referenced.eContainer()).name�.html#�type.referenced.name� 
| �EXPAND constraints::minMax FOR type-� | �EXPAND constraints::const FOR constraint-� | �description-� |*/

  def dispatch featureTxt(Attribute a, ImportManager importManager) '''
  �val om = new OmcstExtensions()�  
|!icons/Attribute.gif!| �a.name� | "�a.type.referenced.name�":�om.getPackage(a.type.referenced).name�.html#�a.type.referenced.name� | 
   '''

  def dispatch featureTxt(Reference r, ImportManager importManager) '''
   '''

  def dispatch typeTxt(DataType d, ImportManager importManager) '''
h3(#�d.name�). DataType Name : �d.name�

  '''
  
  def dispatch typeTxt(Enumeration e, ImportManager importManager) '''
h3(#�e.name�). Enumeration Name : �e.name� [
      �FOR l:e.enumerationLiterals�
			�l.name� 
      �ENDFOR� ]	

  '''



}
	
	