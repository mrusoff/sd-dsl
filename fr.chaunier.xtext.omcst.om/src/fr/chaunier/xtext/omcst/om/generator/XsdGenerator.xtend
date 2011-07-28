package fr.chaunier.xtext.omcst.om.generator

import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmcstExtensions
import org.eclipse.emf.ecore.EObject
import fr.chaunier.xtext.omcst.om.Helpers

class XsdGenerator {

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
      «FOR t:p.elements.filter(typeof(XsdElement))»	
        «element(t)»
      «ENDFOR»
      «FOR t:p.elements.filter(typeof(Entity))»	
        «substitutionGroup(t)»
      «ENDFOR»
    </xsd:schema>  
  '''

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
  '''

/*«IF e.entityType.get(EntityType.ABSTRACT) == 0»«abstract=""»«ENDIF» 
«IF e.entityType.literal==EntityType.»
 */
 
def getAbstract(Entity e, ImportManager importManager) '''
	«val helpers = new Helpers()»
	«IF helpers.isAbstract(e)»abstract="true"«ENDIF»'''
 

 
def dispatch type(Entity e, ImportManager importManager) '''
<xsd:complexType name="«e.name()»Type" «getAbstract(e,importManager)»>
«IF e.superType != null»   
<xsd:complexContent>
<xsd:extension base="«getPrefixe(e.superType)»:«e.superType.name()»Type"»>
«ENDIF» 	
<xsd:annotation>
<xsd:documentation>«e.description»</xsd:documentation>
</xsd:annotation>
«IF e.features.size !=0»
<xsd:sequence>
    «FOR f:e.features.filter(typeof(Attribute))»
       «feature(f, importManager)»
    «ENDFOR»
       </xsd:sequence>
«ENDIF»       
«IF e.superType!=null»   
  	</xsd:extension>
  	</xsd:complexContent>
 «ENDIF» 	
	</xsd:complexType>  
  '''

// traitement des features(attributs) d'une entité	
  def dispatch feature(Attribute a, ImportManager importManager) '''
   «shortName(a.type.referenced,importManager)»
«IF a.constraint == null»
   <xsd:element name="«a.name»" «a.type.cardinality» «a.type.referenced.typeOfRef»>
	<xsd:annotation>
    	<xsd:documentation>«a.description»</xsd:documentation>
       </xsd:annotation>
    </xsd:element>
«ELSE»
	«a.setXsdConstraint»
«ENDIF»	    	
  '''

// traitement des features(reference) d'une entité	
  def dispatch feature(Reference ref, ImportManager importManager) '''
  '''

// traitement des contraintes d'un attribut	
	def dispatch contraintXsd(Constraint cst) '''
	''' 

	def dispatch contraintXsd(StringConstraint cst) '''
		«IF cst.constraintRef.minLen !=0»<xsd:minLength value= "«cst.constraintRef.minLen»"«ENDIF»
		«IF cst.constraintRef.maxLen !=0»<xsd:maxLength value= "«cst.constraintRef.maxLen»"«ENDIF»
		«IF cst.constraintRef.fixeLen !=0»<xsd:minLength value= "«cst.constraintRef.fixeLen»"<xsd:maxLength value= "«cst.constraintRef.fixeLen»"«ENDIF»
	''' 

	def dispatch contraintXsd(DecimalConstraint cst) '''
		«IF cst.constraintRef.minLen !=0»<xsd:minLength value= "«cst.constraintRef.minLen»"«ENDIF»
		«IF cst.constraintRef.maxLen !=0»<xsd:maxLength value= "«cst.constraintRef.maxLen»"«ENDIF»
		«IF cst.constraintRef.fixeLen !=0»<xsd:minLength value= "«cst.constraintRef.fixeLen»"<xsd:maxLength value= "«cst.constraintRef.fixeLen»"«ENDIF»
	''' 

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
    switch(att.constraint) {
      StringConstraint : attributConstraint(att,att.constraint)  
      DecimalConstraint : attributConstraint(att,att.constraint)
      EnumerationConstraint : attributConstraint(att,att.constraint)
      DateTimeConstraint : attributConstraint(att,att.constraint)
      default: null
    }
  }	
	
	def dispatch attributConstraint(Attribute attribute,Constraint cst) '''
	<xsd:annotation>
	<xsd:documentation>«attribute.name» type interdit</xsd:documentation>
	</xsd:annotation>
	'''

	def dispatch attributConstraint(Attribute attribute,StringConstraint cst) '''
		«IF cst.constraintRef != null || cst.constraintRef.minLen!=0 || cst.constraintRef.maxLen != 0 || cst.constraintRef.fixeLen != 0» 
		<xsd:element name="«attribute.name»" «attribute.type.cardinality»
		    <xsd:annotation>
		<xsd:documentation>«attribute.description»</xsd:documentation>
		</xsd:annotation>
		<xsd:simpleType>
		<xsd:restriction base="xsd:string">
						«cst.contraintXsd»    				
		</xsd:restriction>
		</xsd:simpleType>
		</xsd:element>
	«ELSE»    			
        <xsd:element name="«attribute.name»" type="xsd:string" «attribute.type.cardinality»/>
	«ENDIF» 	
	''' 

	def dispatch attributConstraint(Attribute attribute,DecimalConstraint cst) '''
		«IF cst.constraintRef != null || cst.constraintRef.minLen!=0 || cst.constraintRef.maxLen != 0 || cst.constraintRef.fixeLen != 0» 
		<xsd:element name="«attribute.name»" «attribute.type.cardinality»
		    <xsd:annotation>
      			<xsd:documentation>«attribute.description»</xsd:documentation>
    		</xsd:annotation>
    			<xsd:simpleType>
    				<xsd:restriction base="xsd:integer">
						«cst.contraintXsd»    				
    				</xsd:restriction>
    			</xsd:simpleType>
    	</xsd:element>
	«ELSE»    			
        <xsd:element name="«attribute.name»" type="xsd:integer" «attribute.type.cardinality»/>
	«ENDIF» 	
	'''
	 
	def dispatch attributConstraint(Attribute attribute,EnumerationConstraint cst) '''
	'''

	def dispatch attributConstraint(Attribute attribute,DateTimeConstraint cst) '''
	'''
	
	def element(XsdElement element)'''
    <xsd:element name="«element.xsdElement.name.toLowerCase»" type="«element.xsdElement.prefixe»:«element.xsdElement.name»Type"></xsd:element>
	'''
/* 
	def dispatch attributConstraint(Attribute attribute,BooleanConstraint cst) '''
	'''
*/

/*
	<element name="Magazine" type="MagazineType" substitutionGroup="Publication"></element>
	<element name="Publication" type="c:PublicationType" abstract="true"></element>
 */
 
 	// traitement des substitutions group
	def substitutionGroup(Entity entity)'''
	«val helpers = new Helpers()»
	«IF helpers.isAbstract(entity.superType)» 
	<element name="«entity.name»" type="«entity.name»Type" substitutionGroup="«entity.superType.name»"></element>
	«ENDIF»
	«IF helpers.isAbstract(entity)» 
	<element name="«entity.name»" type="c:«entity.name»Type" abstract="true"></element>
	«ENDIF»
	}
	'''
}