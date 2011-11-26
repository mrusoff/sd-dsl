package fr.chaunier.xtext.omc.renderer;

import com.google.inject.Inject;

import fr.chaunier.xtext.omc.features.Cardinality;
import fr.chaunier.xtext.omc.features.ConstraintResult;
import fr.chaunier.xtext.omc.features.ConstraintType;
import fr.chaunier.xtext.omc.features.ElementType;
import fr.chaunier.xtext.omc.omcDsl.Attribute;
import fr.chaunier.xtext.omc.omcDsl.DataType;
import fr.chaunier.xtext.omc.omcDsl.Entity;
import fr.chaunier.xtext.omc.omcDsl.Enumeration;
import fr.chaunier.xtext.omc.omcDsl.EnumerationLiteral;
import fr.chaunier.xtext.omc.omcDsl.Reference;


public class TextileEntityRenderer implements IEntityRenderer {

	  @Inject
	  private IFeatureRenderer featureRendrerer ;
	
	  
	  TextileEntityRenderer() {
//		  featureRendrerer = EntityFactory.getFeatureInstance() ;
//		  System.out.println("FR "+featureRendrerer);
	  }
	  
	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.Reference)
	 */

	public String constraintInFeature(Reference r) {
		  return "" ;
		  }

	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.Attribute)
	 */

	public String constraintInFeature(Attribute a) {
		  	if ( a.getConstraint() == null ) return "" ;
		  	return featureRendrerer.constraint(a.getConstraint()) ; 	
		  }
		  
	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.DataType)
	 */

	public String constraintInFeature(DataType dt) {
		  	if ( dt.getConstraint() == null ) return "" ;
		  	return featureRendrerer.constraint(dt.getConstraint()) ;  	
	}

		// buid cardinality for attribute	
	 	/* (non-Javadoc)
		 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#cardinality(fr.chaunier.xtext.emc.emcDsl.Attribute)
		 */

		public String cardinality(Attribute att) {
	 		String res = new String() ;
			if (att.getType().isMulti())res="[0..*]" ;
			else if (att.getType().isMulti1())res="[1..*]";
			else if (att.getType().isOption())res="[0..1]" ; else res="[1..1]" ;
			return res ;
	 	}
	  
		// buid cardinality for reference	
	 	/* (non-Javadoc)
		 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#cardinality(fr.chaunier.xtext.emc.emcDsl.Reference)
		 */

		public String cardinality(Reference ref) {
	 		String res = new String() ;
			if (ref.getType().isMulti())res="[0..*]" ;
			else if (ref.getType().isMulti1())res="[1..*]";
			else if (ref.getType().isOption())res="[0..1]" ; else res="[1..1]" ;
			return res ;
	 	}

		// buid cardinality for attribute	
	 	/* (non-Javadoc)
		 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#cardinality(fr.chaunier.xtext.emc.features.Cardinality)
		 */

		public String cardinality(Cardinality cardinality) {
	 		String res = new String() ;
			if ( cardinality.getMin() == 0 ) res="[0.." ; else res="[1.."  ;
			if ( cardinality.getMax() == 1 ) res=res+"1]" ; else res=res+"*]" ; 
			return res ;
	 	}



		public void setIconPath(String iconPath) {
			featureRendrerer.setIconPath(iconPath);
			
		}


		public Boolean isEntity(Attribute a) {
			if ( a.getType() != null && a.getType().getReferenced() != null)
				return  a.getType().getReferenced() instanceof Entity ;
			else return false ;
		}
	  
		public String constraintType(Attribute a) {
		  	if ( a.getConstraint() == null ) return "" ;
		  	ConstraintTypeHelper cth  = new ConstraintTypeHelper();
		  	ConstraintType ct = cth.constraintType(a.getConstraint());
		  	IconsRenderer ir = new  IconsRenderer();
		  	return ir.getIconType(ct, featureRendrerer.getIconPath());
		}


		public String elementType(Attribute a) {
		  	ElementTypeHelper cth  = new ElementTypeHelper();
		  	ElementType ct = cth.featureType(a);
		  	IconsRenderer ir = new  IconsRenderer();
		  	return ir.getIconType(ct, featureRendrerer.getIconPath());
		}


		public String elementType(Reference r) {
		  	ElementTypeHelper cth  = new ElementTypeHelper();
		  	ElementType ct = cth.featureType(r);
		  	IconsRenderer ir = new  IconsRenderer();
		  	return ir.getIconType(ct, featureRendrerer.getIconPath());
		}

		public String enumerationString(Enumeration e) {
			StringBuffer str = new StringBuffer();
	      	for (EnumerationLiteral el : e.getEnumerationLiterals()) {
	      		str.append("(");
				str.append(el.getName());
				str.append(",");
				str.append(el.getPersistedValue());
				str.append(')');
			} 
	      	return str.toString();
		}

//		@Override
		public ConstraintResult constraintResultInFeature(Attribute a) {
			return null;
		}

	
}
