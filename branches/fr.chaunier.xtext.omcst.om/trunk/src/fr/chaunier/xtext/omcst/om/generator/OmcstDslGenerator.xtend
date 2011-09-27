package fr.chaunier.xtext.omcst.om.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.omcst.om.OmcstExtensions
import com.google.inject.Inject
import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*

import fr.chaunier.xtext.omcst.om.generator.path.TextilePathToFeatureGenerator
import fr.chaunier.xtext.omcst.om.generator.path.TextPathToFeatureEntityGenerator
import fr.chaunier.xtext.omcst.om.generator.path.TextPathToFeatureGenerator
import fr.chaunier.xtext.omcst.om.generator.instance.InstanceGenerator
import fr.chaunier.xtext.omcst.om.generator.xsd.XsdGenerator
import fr.chaunier.xtext.omcst.om.generator.message.MsgTextileGenerator
import fr.chaunier.xtext.omcst.om.generator.oo.OoTextileGenerator
import fr.chaunier.xtext.omcst.om.Helpers

class OmcstDslGenerator implements IGenerator {


  @Inject extension GeneratorExtensions generatorExtensions

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	
	    
//		var String modelPath = resource.getURI().devicePath;
//		var String propertiesPath = StringHelpers::replaceLastSubstring(modelPath, "omcst", "properties")
//		ProjectProperties::setPropertiesFile(propertiesPath);
//		println("properties path : "+propertiesPath)
//		var String genOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcGenPath;
//		var String manOutputPath = ProjectProperties::projectPath + "/" + ProjectProperties::srcManPath;

//		println("genOutputPath: "+genOutputPath)
//		println("manOutputPath: "+manOutputPath)
		
		val oOTextileGenerator = new OoTextileGenerator()
		val xsdGenerator = new XsdGenerator()
	    for(packageDeclaration : resource.allContentsIterable.filter(typeof(PackageDeclaration))) {
	      // xsd gen	
	      fsa.generateFile(packageDeclaration.fileName, xsdGenerator.compileXsd(packageDeclaration))
	      // oo gen	
	      fsa.generateFile(packageDeclaration.fileOoName, oOTextileGenerator.compileTxt(packageDeclaration,generatorExtensions))
    	}
	    // search root element entity 
		val msgTextileGenerator = new MsgTextileGenerator()
		val textilePathGenerator = new TextilePathToFeatureGenerator()
//		val textPathGenerator = new TextPathToFeatureEntityGenerator()
		val textPathGenerator = new TextPathToFeatureGenerator()
		val instanceGenerator = new InstanceGenerator()
	    for(element : resource.allContentsIterable.filter(typeof(XsdElement))) {
	      fsa.generateFile(element.xsdElement.fileMsgName, msgTextileGenerator.compileTxt(element.xsdElement))
      	  fsa.generateFile(element.xsdElement.textileFilePathName, textilePathGenerator.compileTxt(element.xsdElement))
//      	  fsa.generateFile(element.xsdElement.fileTextPathName, textPathGenerator.compileTxt(element.xsdElement))
      	  fsa.generateFile(element.xsdElement.fileTextSimplePathName, textPathGenerator.compileTxt(element.xsdElement))
      	  fsa.generateFile(element.xsdElement.fileInstanceName, instanceGenerator.compileTxt(element.xsdElement))
	    }
	    // search concrete entity  
	    for(entity : resource.allContentsIterable.filter(typeof(Entity))) {
//	      if (Helpers::isAbstract(entity.superType)) { 
	      if (entity.superType != null && entity.superType.isAbstract) { 
		      fsa.generateFile(entity.fileMsgName, msgTextileGenerator.compileTxt(entity))
		      fsa.generateFile(entity.fileInstanceName, instanceGenerator.compileTxt(entity))
      	  	  fsa.generateFile(entity.textileFilePathName, textilePathGenerator.compileTxt(entity))
      	      fsa.generateFile(entity.fileTextPathName, textPathGenerator.compileTxt(entity))
	      }
	    }
	}
}
	
	
