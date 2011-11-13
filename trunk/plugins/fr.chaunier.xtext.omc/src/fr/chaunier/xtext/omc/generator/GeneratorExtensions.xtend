package fr.chaunier.xtext.omc.generator

import fr.chaunier.xtext.omc.omcDsl.PackageDeclaration
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider 

class GeneratorExtensions  {
 
  def String packageName(Object o) {
    switch(o) {
      PackageDeclaration : concatPath(packageName(o.eContainer), o.name)
//      Entity : o.name
      EObject : packageName(o.eContainer)
//      DataType : packageName(o)
//      Entity : packageName(o)
      default: null
    }
  }

  def concatPath(String prefix, String suffix) {
    if (prefix.nullOrEmpty)
      suffix
    else
      prefix + "." + suffix
  }

  def folderName(String javaPackageName) {
	  if(javaPackageName != null) javaPackageName.replace('.', '/') else ''
  }

  def QualifiedName(EObject o) {
	   val qn = new DefaultDeclarativeQualifiedNameProvider()
	   qn.getFullyQualifiedName(o)
  }  
 
}