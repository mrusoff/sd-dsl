package fr.telintrans.model.utils;

import org.eclipse.emf.ecore.EPackage;


public class PackageUtil {

	  public static String getDefaultArtifactFileName(EPackage ePackage)
	  {
		System.out.println("package " + ePackage.toString());  
	    if (ePackage.eResource() != null && ePackage.getESuperPackage() == null)
	    {
	      String fileName = ePackage.eResource().getURI().lastSegment();
		   System.out.println("fileName " + fileName);  
	      int lastIndex = fileName.lastIndexOf('.');
	      if (lastIndex > 0)
	      {
	        return fileName.substring(0, lastIndex);
	      }
	    }
	    return ConverterUtil.getQualifiedName(ePackage);
	  }
	
}
