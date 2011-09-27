package fr.chaunier.xtext.omcst.om.generator

//import fr.chaunier.xtext.om.*
//import fr.chaunier.xtext.om.omDsl.*
//import fr.chaunier.xtext.constraint.cstDsl.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.common.types.*
import java.util.Set
import fr.chaunier.xtext.omcst.om.omcstDsl.*
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import fr.chaunier.xtext.omcst.om.Helpers 

class GeneratorExtensions  {
 
  def shortName(Type r, ImportManager importManager) {
    val builder = new StringBuilder()
    importManager.appendTypeRef(r, builder)
    builder.toString
  }

//  def fileName(EntityConstraint e) {
//  e.packageName.folderName + '/' + e.entity.name + '.xsd'
//  }


  def fileName(PackageDeclaration e) {
  "xsds/" + e.name + '.xsd'
  }

  def fileOoName(PackageDeclaration e) {
//  	"oo/" + e.name.folderName + "/" + e.name + '.oo.textile'
  	"oo/" + QualifiedName(e).toString.folderName + '.oo.textile'
  }

  def fileMsgName(Entity e) {
  	"msg/" + QualifiedName(e).toString.folderName + '.msg.textile'
  }

  def textileFilePathName(Entity e) {
  	"path/" + QualifiedName(e).toString.folderName + '.path.textile'
  }

  def fileTextPathName(Entity e) {
  	"path/" + QualifiedName(e).toString.folderName + '.path.text'
  }

  def fileTextSimplePathName(Entity e) {
  	"path/" + QualifiedName(e).toString.folderName + '.sppath.text'
  }

  def fileInstanceName(Entity e) {
  	"instances/"  + QualifiedName(e).toString.folderName + '.iom'
  }

  def QualifiedName(EObject o) {
	   val qn = new DefaultDeclarativeQualifiedNameProvider()
	   qn.getFullyQualifiedName(o)
  }  

  def folderName(String javaPackageName) {
  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }
  
  /*
  def pakageName(QualifiedName qn) {
  	 folderName(Helpers::getPackageNameSpace(qn))
  }
  
  def ObjectName(QualifiedName qn) {
  	 qn.lastSegment
  }

  def fileName(EObject object) {
  	 val qn = QualifiedName(object)
  	 val packageName = Helpers::getPackageNameSpace(qn) 
  	println("instances qn /" + qn)
  	println("instances pack /" + packageName)
  	println("instances object /" + ObjectName(qn) )
  	 folderName(packageName) + ObjectName(qn) 
  }
  */ 
}