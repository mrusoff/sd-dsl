package fr.chaunier.xtext.omc.generator.msg

import fr.chaunier.xtext.omc.OmHelper
import fr.chaunier.xtext.omc.omcDsl.CsvNature
import fr.chaunier.xtext.omc.omcDsl.DBNature
import fr.chaunier.xtext.omc.omcDsl.DelimiteurSpec
import fr.chaunier.xtext.omc.omcDsl.EdiNature
import fr.chaunier.xtext.omc.omcDsl.Entity
import fr.chaunier.xtext.omc.omcDsl.FileSpecModel
import fr.chaunier.xtext.omc.omcDsl.FlatNature
import fr.chaunier.xtext.omc.omcDsl.OtherNature
import fr.chaunier.xtext.omc.omcDsl.XmlNature

class SpecFileRenderer {
	
	def specRender(Entity rootEntity) '''
    	«val entityHelper = new OmHelper()»
 		«val spec = entityHelper.getSpec(rootEntity)»
«IF spec != null» 		
|«"specification"»|«spec.name»|
|«"Description"»|«rootEntity.description»|
|«"Format"»|«fileFormat(spec)»|
 		«FOR line:spec.specLines»
|«line.title»|«line.label»|
 		«ENDFOR»
«ENDIF» 		
	'''

	def fileFormat(FileSpecModel fileSpec) {
		var fileNature = fileSpec.file.nature
		switch (fileNature) {
			CsvNature : "CSV" + delimiter(fileNature.delimiter) 
			EdiNature : "EDI" + delimiter(fileNature.delimiter) 
			FlatNature : "Flat"   
			XmlNature : "XML"
			DBNature : "DB"
			OtherNature : "DB"
			default : "pas de format" + fileNature  
		}
	}
	
	def delimiter(DelimiteurSpec delimiter) {
		if ( delimiter == null ) return ''
		var res = ' '
//		println(delimiter)
		if  ( delimiter.field != null )
			res = res + "separateur (" + delimiter.field +")" 
		if  ( delimiter.component != null )
			res = res + " component (" + delimiter.component +")"
		if  ( delimiter.subComponent != null )
			res = res + " sub component (" + delimiter.subComponent +")"
		if  ( delimiter.segment != null )
			res = res + " segment (" + delimiter.segment +")"
		return res	
	}  
	
	/* return alias of the root*/
	def getAlias(Entity rootEntity) {
    	val entityHelper = new OmHelper()
 		val spec = entityHelper.getSpec(rootEntity)
 		if ( spec.element != null ) 
 			return spec.element
 		else return rootEntity.name	
	}
	
}