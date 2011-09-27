package fr.chaunier.xtext.prjdsl.generator

import fr.chaunier.xtext.om.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.common.types.*
import java.util.Set
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import fr.chaunier.xtext.omcst.om.omcstDsl.*
import fr.chaunier.xtext.prjdsl.prjDsl.*

class GeneratorExtensions  {
 
  def fileName(TransformationGroup e) {
  "prj/" + e.name + '.transfo'
  }

/*
  def fileName(PackageDeclaration e) {
  "xsds/" + e.name + '.xsd'
  }

  def fileOoName(PackageDeclaration e) {
//  	"oo/" + e.name.folderName + "/" + e.name + '.oo.textile'
  	"oo/" + QualifiedName(e) + '.oo.textile'
  }

  def fileMsgName(XsdElement e) {
  	"msg/" + QualifiedName(e.xsdElement) + '.msg.textile'
  }

  def filePathName(XsdElement e) {
  	"path/" + QualifiedName(e.xsdElement) + '.path.textile'
  }

  def fileInstanceName(XsdElement e) {
  	"instances/" + QualifiedName(e.xsdElement) + '.iom'
  }

  def QualifiedName(EObject o) {
	   val qn = new DefaultDeclarativeQualifiedNameProvider()
	   qn.getFullyQualifiedName(o)
  }  
 */
  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
}