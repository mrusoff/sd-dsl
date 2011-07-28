package fr.telintrans.model.utils;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class UtilEMF {
	
	private static String ConvertFromUnicode2UTF8(String in) {
		try {
			// Convert from Unicode to UTF-8
			byte[] utf8 = in.getBytes("UTF-8");
			// Convert from UTF-8 to Unicode
			return new String(utf8, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null ;
		}
	}
	
		private static String clean(String in) {
			in = ConvertFromUnicode2UTF8(in);
			String out = in.trim() ; 

			out = out.replace('"', '\'') ;
			out = out.replace('é', 'e') ;
			out = out.replace('è', 'e') ;
			out = out.replace('ê', 'e') ;
			out = out.replace('à', 'a') ;
			
			
			out = out.replace('\t', ' ') ;
			out = out.replace('\n', ' ') ;
			out = out.replace('\r', ' ') ;
			out = out.replace("             ", " ") ;
			out = out.replace("     ", " ") ;
			out = out.replace("   ", " ") ;
			out = out.replace("  ", " ") ;
			out = out.trim() ; 
			return out ;
		}
		


		public static String getDoc(EModelElement eModelElement) {
			  String doc = EcoreUtil.getDocumentation(eModelElement) ;
			  return ( doc == null ) ? "" : clean(doc.trim()) ;  
		  }

		/*
		public static String getConstraints(EAttribute eAttribute) {
			  int upper = eAttribute.getUpperBound() ;
			  int lower = eAttribute.getLowerBound() ;
			  if ( upper==-1 ) return "*" ;
			  else if ( upper !=1 ) return "*" ;
			  else if ( upper ==1 && lower == 0 ) return "?" ;
			  else return "" ;
		}*/

		public static String getCardinality(EAttribute eAttribute) {
			  int upper = eAttribute.getUpperBound() ;
			  int lower = eAttribute.getLowerBound() ;
			  if ( upper==-1 ) return "*" ;
			  else if ( upper !=1 ) return "*" ;
			  else if ( upper ==1 && lower == 0 ) return "?" ;
			  else return "" ;
//			  return "(" + eAttribute.getLowerBound() + ".." + ((upper==-1) ? "*" : upper)  + ")";
		}

		public static String getCardinality(EReference eReference) {
			  int upper = eReference.getUpperBound() ;
			  int lower = eReference.getLowerBound() ;
			  if ( upper==-1 ) return "*" ;
			  else if ( upper !=1 ) return "*" ;
			  else if ( upper ==1 && lower == 0 ) return "?" ;
			  else return "" ;
//			  return "(" + eReference.getLowerBound() + ".." + ((upper==-1) ? "*" : upper) + ")";
		  }
		  
		  public boolean isEnumerator(EDataType eDataType) {
			  return eDataType.getInstanceClassName().equals("org.eclipse.emf.common.util.Enumerator");
		  }

		  
		  protected static final String EXTENDED_META_DATA_PACKAGE_NS_URI = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

		  
		  public static String getName(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("name");
		  }

		  public static String getKind(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("kind");
		  }
/*
       <details key="baseType" value="http://www.eclipse.org/emf/2003/XMLType#string"/>
      <details key="minLength" value="10"/>
      <details key="maxLength" value="30"/>
 * */
		  public static String getBaseType(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    String res = eAnnotation == null ? null : (String)eAnnotation.getDetails().get("baseType");
		    if ( res.startsWith("http://www.eclipse.org/emf/2003/XMLType#") )
		    	return res.substring("http://www.eclipse.org/emf/2003/XMLType#".length());
		    return res ;
		  }

		  public static String getMinLength(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("minLength");
		  }
		  
		  public static String getMaxLength(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("maxLength");
		  }

		  public static String getLength(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("length");
		  }

		  public static String getPattern(EModelElement eModelElement)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    return eAnnotation == null ? null : (String)eAnnotation.getDetails().get("pattern");
		  }
		  
		  
		  public static void setName(EModelElement eModelElement, String name,String kind)
		  {
		    EAnnotation eAnnotation = eModelElement.getEAnnotation(EXTENDED_META_DATA_PACKAGE_NS_URI);
		    if (name == null)
		    {
		      if (eAnnotation != null)
		      {
		        eAnnotation.getDetails().remove("name");
		        eAnnotation.getDetails().remove("kind");
		      }
		    }
		    else
		    {
		      if (eAnnotation == null)
		      {
		        eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		        eAnnotation.setSource(EXTENDED_META_DATA_PACKAGE_NS_URI);
		        eModelElement.getEAnnotations().add(eAnnotation);
		      }
		      eAnnotation.getDetails().put("name", name);
		      eAnnotation.getDetails().put("kind", kind);
		    }
		  }

		  public static boolean isXSDElement(EStructuralFeature eStructuralFeature) {
		  	 if ( getKind(eStructuralFeature).equals("element") )
		  		 return true ;
		  	 else return false ;
		  }
		  
		  public static String getElementNamedList(List<ENamedElement> eNamedElements,char car) {
			     String res = "" ;
			     for ( ENamedElement el : eNamedElements ) {
			    	 res += el.getName()+car ;
			     }
			     if ( res.length() > 1 ) res.substring(0,res.length()-1);
			     return res ;	 
		  }

		  public static String getClassifierListLinked(List eClassifiers,String sep) {
			     String res = "" ;
			     for ( EClassifier el : (List<EClassifier>)eClassifiers ) {
			    	 res += "\""+el.getName()+"\":"+el.getEPackage().getName()+".html#"+el.getName()+sep ;
			     }
			     res = res.trim();
			     if ( res.length() > 1 ) res = res.substring(0,res.length()-1);
			     return res ;	 
		  }

		  public void getEnum(EEnum eEnum) {
			  EList<EEnumLiteral> list = eEnum.getELiterals() ;
			  for (EEnumLiteral el : list) {
				  System.out.println(el.getName()+ " " + el.getValue() + " " + el.getLiteral() );
			  }
		  }
}
