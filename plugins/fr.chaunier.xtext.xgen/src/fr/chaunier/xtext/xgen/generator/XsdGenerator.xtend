package fr.chaunier.xtext.xgen.generator

import fr.chaunier.xtext.omc.omcDsl.Attribute
import fr.chaunier.xtext.omc.omcDsl.Constraint
import fr.chaunier.xtext.omc.omcDsl.DataType
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.Enumeration
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint
import fr.chaunier.xtext.omc.omcDsl.IntegerConstraint
import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration
import fr.chaunier.xtext.omc.omcDsl.Reference
import fr.chaunier.xtext.omc.omcDsl.StringConstraint
import fr.chaunier.xtext.omc.omcDsl.Type
import fr.chaunier.xtext.omc.omcDsl.TypeRef
import fr.chaunier.xtext.xgen.xgenDsl.PackageConstraint
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*


class XsdGenerator implements IGenerator {

	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		
		var generatorExtensions = new XsdGeneratorExtensions()
	    for(pack : input.allContentsIterable.filter(typeof(PackageConstraint))) {
	      	fsa.generateFile(generatorExtensions.fileName(pack.packageDeclaration), compileXsd(pack.packageDeclaration))
		}
	}


  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

  def PackageDeclaration getPackage(Object o) {
    switch(o) {
      PackageDeclaration : o 
      EObject : getPackage(o.eContainer)
      default: null
    }
  }

  def String getPrefixe(Object o) {
  		getPackage(o).prefix
  }	

  def compileXsd(PackageDeclaration pac) '''
    «val importManager = new ImportManager()»
    «val body = body(pac, importManager)»
<?xml version="1.0" encoding="UTF-8" ?>
<xsd:schema xmlns:«pac.prefix»="«pac.namespace»" 
attributeFormDefault="unqualified" 
elementFormDefault="unqualified" 
targetNamespace="«pac.namespace»"
xmlns:xsd="http://www.w3.org/2001/XMLSchema"
«val pcks = importManager.getImportPackages(pac)»
«FOR i:pcks»
xmlns:«i.prefix»="«i.namespace»"
«ENDFOR»
>
    «FOR i:pcks»
<xsd:import schemaLocation="«i.name».xsd" namespace="«i.namespace»"></xsd:import>
    «ENDFOR»
    «body»
  '''
  
  // traitement root du package
  def body(PackageDeclaration p, ImportManager importManager) '''
      «FOR t:p.elements.filter(typeof(DataType))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Entity))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Enumeration))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Entity))»	
        «substitutionGroup(t)»
      «ENDFOR»
    </xsd:schema>  
  '''

  // traitement root du package
/*  
  def body(PackageDeclaration p, ImportManager importManager) '''
      «FOR t:p.elements.filter(typeof(DataType))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Entity))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Enumeration))»	
        «type(t, importManager)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(XsdElement))»	
        «element(t.xsd)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Entity))»	
        «substitutionGroup(t)»
      «ENDFOR»
    </xsd:schema>  
  '''
 */
// traitement des type de 
  def dispatch type(DataType d, ImportManager importManager) '''
	<xsd:annotation>
<xsd:documentation>«d.name»</xsd:documentation>
</xsd:annotation>
  '''


  def dispatch type(Enumeration e, ImportManager importManager) '''
  	<xsd:simpleType name="«e.name»Enum">
  	<xsd:restriction base="xsd:string">
      «FOR l:e.enumerationLiterals»
  	<xsd:enumeration value="«l.name»"/>
      «ENDFOR»	
  	<xsd:enumeration value="INCONNU_«e.name»«e.enumerationLiterals.size+1»"/> 
  	<xsd:enumeration value="INCONNU_«e.name»«e.enumerationLiterals.size+2»"/>
  	</xsd:restriction> 
	</xsd:simpleType>
  '''

 
def getAbstract(Entity e, ImportManager importManager) '''
	«IF e.isAbstract»abstract="true"«ENDIF»'''
 
 
def dispatch type(Entity entity, ImportManager importManager) '''
<xsd:complexType name="«entity.name»Type" «getAbstract(entity,importManager)»>
«IF entity.superType != null»   
<xsd:complexContent>
<xsd:extension base="«getPrefixe(entity.superType)»:«entity.superType.name»Type">
«ENDIF» 	
«entity.description.genDoc()»
«IF entity.features.size !=0»
<xsd:sequence>
    «FOR f:entity.features.filter(typeof(Attribute))»
       «feature(f, importManager)»
    «ENDFOR»
</xsd:sequence>
«ENDIF»       
«IF entity.superType!=null»   
  	</xsd:extension>
  	</xsd:complexContent>
 «ENDIF» 	
	</xsd:complexType>  
  '''

// traitement des features(attributs) d'une entité	
  def dispatch feature(Attribute attribute, ImportManager importManager) '''
   «shortName(attribute.type.referenced,importManager)»
«IF attribute.constraint == null»
   <xsd:element name="«attribute.name»" «attribute.type.cardinality» «attribute.type.referenced.typeOfRef»>
		«attribute.description.genDoc()»
    </xsd:element>
«ELSE»
	«attribute.setXsdConstraint»
«ENDIF»	    	
  '''

// traitement des features(reference) d'une entité	
  def dispatch feature(Reference ref, ImportManager importManager) '''
  '''

// traitement des contraintes d'un attribut	
	def dispatch contraintXsd(Constraint cst) '''
	''' 

	def dispatch contraintXsd(StringConstraint cst) '''
		«IF cst.minLen !=null»<xsd:minLength value= "«cst.minLen»"/>«ENDIF»
		«IF cst.maxLen !=null»<xsd:maxLength value= "«cst.maxLen»"/>«ENDIF»
		«IF cst.fixeLen !=null»<xsd:minLength value= "«cst.fixeLen»"/><xsd:maxLength value= "«cst.fixeLen»"/>«ENDIF»
	''' 

	def dispatch contraintXsd(DecimalConstraint cst) '''
		«IF cst.precision !=null»<xsd:totalDigits value= "«cst.precision»"/>«ENDIF»
		«IF cst.scale !=null»<xsd:fractionDigits value= "«cst.scale»"/>«ENDIF»
		«IF cst.fixeLen !=null»<xsd:minLength value= "«cst.fixeLen»/> "<xsd:maxLength value= "«cst.fixeLen»"/>«ENDIF»
	''' 

	def dispatch contraintXsd(IntegerConstraint cst) '''
		«IF cst.minValue !=null»<xsd:minInclusive value= "«cst.minValue»"/>«ENDIF»
		«IF cst.maxValue !=null»<xsd:maxInclusive value= "«cst.maxValue»"/>«ENDIF»
		«IF cst.fixeLen !=null»<xsd:minLength value= "«cst.fixeLen»/> "<xsd:maxLength value= "«cst.fixeLen»"/>«ENDIF»
	''' 

/*
<simpleType name='celsiusBodyTemp'>
  <restriction base='decimal'>
    <totalDigits value='4'/>
    <fractionDigits value='1'/>
    <minInclusive value='36.4'/>
    <maxInclusive value='40.5'/>
  </restriction>
</simpleType>
* 
<simpleType name='better-us-zipcode'>
  <restriction base='string'>
    <pattern value='[0-9]{5}(-[0-9]{4})?'/>
  </restriction>
</simpleType>
* 
*  
* 	def dispatch contraintXsd(DecimalConstraint cst) '''
		«IF cst != null && cst.constraintRef != null»
		«IF cst.constraintRef.minLen !=null»<xsd:minLength value= "«cst.constraintRef.minLen»"«ENDIF»
		«IF cst.constraintRef.maxLen !=null»<xsd:maxLength value= "«cst.constraintRef.maxLen»"«ENDIF»
		«IF cst.constraintRef.fixeLen !=null»<xsd:minLength value= "«cst.constraintRef.fixeLen»"<xsd:maxLength value= "«cst.constraintRef.fixeLen»"«ENDIF»
		«ENDIF»
	''' 
 */
 
	// buid xsd cardinality	
 	def cardinality(TypeRef ref) '''
		«IF ref.option»minOccurs="0"«ENDIF»
		«IF ref.multi»maxOccurs="unbounded"«ENDIF»
 	'''
	
	// buid xsd type of ref 	
	def dispatch typeOfRef(Type e) '''
	'''

	def dispatch typeOfRef(Entity e) '''
 		type="«getPrefixe(e)»:«e.name»Type"	
	'''
	def dispatch typeOfRef(DataType e) '''
		type="xsd:string" 
	'''
	def dispatch typeOfRef(Enumeration e) '''
 		type="«getPrefixe(e)»:«e.name»Enum"	
	'''

// traitement des contraintes suivant type : boolean , string , decimal, enum  		
  def setXsdConstraint(Attribute att) {
  	if ( att.constraint != null ) {
	    switch(att.constraint) {
	      StringConstraint : attributConstraint(att,att.constraint)  
	      DecimalConstraint : attributConstraint(att,att.constraint)
	      EnumerationConstraint : attributConstraint(att,att.constraint)
	      DateTimeConstraint : attributConstraint(att,att.constraint)
	      default: null
	    }
  	} //else
//	    switch(att.constraint) {
//	      StringConstraint : xsd:  
//	      DecimalConstraint : attributConstraint(att,att.constraint)
//	      EnumerationConstraint : attributConstraint(att,att.constraint)
//	      DateTimeConstraint : attributConstraint(att,att.constraint)
//	      default: null
//	    }
  }	
	
	def dispatch attributConstraint(Attribute attribute,Constraint cst) '''
	«attribute.description.genDoc()»
	'''

	def dispatch attributConstraint(Attribute attribute,StringConstraint cst) '''
		«IF cst.minLen == null && cst.maxLen == null && cst.fixeLen == null »
	        <xsd:element name="«attribute.name»" type="xsd:string" «attribute.type.cardinality»/>
		«ELSE» 
		<xsd:element name="«attribute.name»" «attribute.type.cardinality»>
		«attribute.description.genDoc()»
		<xsd:simpleType>
		<xsd:restriction base="xsd:string">
						«cst.contraintXsd»    				
		</xsd:restriction>
		</xsd:simpleType>
		</xsd:element>
	«ENDIF» 	
	''' 

	def genDoc(String doc) '''
		«IF ! doc.nullOrEmpty» 
		<xsd:annotation>
		<xsd:documentation>«doc»</xsd:documentation>
		</xsd:annotation>
		«ENDIF»
	''' 

	def dispatch attributConstraint(Attribute attribute,DecimalConstraint cst) '''
		«IF cst.precision!=0 || cst.scale != 0 || cst.fixeLen != 0» 
	        <xsd:element name="«attribute.name»" type="xsd:decimal" «attribute.type.cardinality»/>
		«ELSE» 
		<xsd:element name="«attribute.name»" «attribute.type.cardinality»>
		«attribute.description.genDoc()»
    			<xsd:simpleType>
    				<xsd:restriction base="xsd:decimal">
						«cst.contraintXsd»    				
    				</xsd:restriction>
    			</xsd:simpleType>
    	</xsd:element>
	«ENDIF» 	
	'''
	 
	def dispatch attributConstraint(Attribute attribute,EnumerationConstraint cst) '''
	'''

	def dispatch attributConstraint(Attribute attribute,DateTimeConstraint cst) '''
	'''

/*	
	def element(XsdElement element)'''
    <xsd:element name="«element.xsdElement.name»" type="«element.xsdElement.prefixe»:«element.xsdElement.name»Type"></xsd:element>
	'''
*/

/*
	<element name="Publication" type="c:PublicationType" abstract="true"></element>
	<element name="Book" type="c:BookType" substitutionGroup="c:Publication"></element>
	<element name="Magazine" type="c:MagazineType" substitutionGroup="c:Publication"></element>
 */

 	// traitement des substitutions group
	def substitutionGroup(Entity entity)'''
	«IF entity.superType != null && entity.superType.isAbstract» 
	<xsd:element name="«entity.name.toFirstLower»" type="«entity.prefixe»:«entity.name»Type" substitutionGroup="«entity.superType.prefixe»:«entity.superType.name.toFirstLower»"></xsd:element>
	«ENDIF»
	«IF entity.isAbstract»
	<xsd:element name="«entity.name.toFirstLower»" type="«entity.prefixe»:«entity.name»Type" abstract="true"></xsd:element>
	«ENDIF»
	'''
}