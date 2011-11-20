package fr.chaunier.xtext.omc.renderer;

import com.google.inject.Inject;

import fr.chaunier.xtext.omc.BuildConstraintResult;
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


public class TextileMessageRenderer implements IEntityRenderer {

	  @Inject
	  private IFeatureRenderer featureRendrerer ;
	
	  
//	  TextileMessageRenderer() {
//	  }
	  
	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.Reference)
	 */
//	@Override
	public String constraintInFeature(Reference r) {
		  return "" ;
		  }

	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.Attribute)
	 */
//	@Override
	public ConstraintResult constraintResultInFeature(Attribute a) {
		if ( a == null ) 
			return null ;
		BuildConstraintResult builder = new BuildConstraintResult();
			return builder.constraintString(a);
		  }
		  

	public String constraintInFeature(Attribute a) {
		if ( a == null ) 
			return null ;
		BuildConstraintResult builder = new BuildConstraintResult();
			ConstraintResult res = builder.constraintString(a);
			if ( res == null ) 
			   return "";
		  	return featureRendrerer.constraint(res.getConstraint()) ; 	
		  }
		  
	  /* (non-Javadoc)
	 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#constraintInFeature(fr.chaunier.xtext.emc.emcDsl.DataType)
	 */
//	@Override
	public String constraintInFeature(DataType dt) {
		  	if ( dt.getConstraint() == null ) return "" ;
		  	return featureRendrerer.constraint(dt.getConstraint()) ;  	
	}

	  
		// buid cardinality for attribute	
	 	/* (non-Javadoc)
		 * @see fr.chaunier.xtext.emc.renderer.IIEntityRenderer#cardinality(fr.chaunier.xtext.emc.emcDsl.Attribute)
		 */
//	 	@Override
		public String cardinality(Attribute att) {
			if ( att == null) 
				return "" ;
			if ( att.getType() == null) 
				return "" ;
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
//	 	@Override
		public String cardinality(Reference ref) {
			if ( ref == null) 
				return "" ;
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
//	 	@Override
		public String cardinality(Cardinality cardinality) {
	 		String res = new String() ;
			if ( cardinality.getMin() == 0 ) res="[0.." ; else res="[1.."  ;
			if ( cardinality.getMax() == 1 ) res=res+"1]" ; else res=res+"*]" ; 
			return res ;
	 	}


//		@Override
		public void setIconPath(String iconPath) {
			featureRendrerer.setIconPath(iconPath);
			
		}

//		@Override
		public Boolean isEntity(Attribute a) {
			if ( a.getType() != null && a.getType().getReferenced() != null)
				return  a.getType().getReferenced() instanceof Entity ;
			else return false ;
		}
	  
		/*
		  def getMergedConstraint(Attribute att) {
				if ( att.type.referenced instanceof DataType ) {
					var dt = att.type.referenced as DataType
					if (dt.constraint != null)
						return mergeConstraints(att.constraint,dt.constraint)
					else return att.constraint	
				} else return att.constraint
			  }
		*/
		
		// TODO merge type
		public String constraintType(Attribute a) {
		  	ConstraintTypeHelper cth  = new ConstraintTypeHelper();
		  	ConstraintType ct ;
		  	if ( a == null )
		  		return "";
		  	if ( a.getType() == null )
		  		return "";
		  	if ( a.getType().getReferenced() == null ) 
		  		return "";
			if ( a.getType().getReferenced() instanceof DataType ) {
				DataType dt = (DataType) a.getType().getReferenced();
				if (dt.getConstraint() != null) {
					ConstraintType dct = cth.constraintType(dt.getConstraint());
					if ( dct != ConstraintType.WITHOUT )
						ct = dct ;
					else {
					  	if ( a.getConstraint() == null ) return "" ;
						ct = cth.constraintType(a.getConstraint());
					}
				  	IconsRenderer ir = new  IconsRenderer();
				  	return ir.getIconType(ct, featureRendrerer.getIconPath());
				}	
			} return "";
		}

//		@Override
		public String elementType(Attribute a) {
		  	if ( a == null )
		  		return "";
		  	ElementTypeHelper cth  = new ElementTypeHelper();
		  	ElementType ct = cth.featureType(a);
		  	IconsRenderer ir = new  IconsRenderer();
		  	return ir.getIconType(ct, featureRendrerer.getIconPath());
		}

//		@Override
		public String elementType(Reference r) {
		  	if ( r == null )
		  		return "";
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
		
}
