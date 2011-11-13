package fr.chaunier.xtext.omc.renderer;

import fr.chaunier.xtext.omc.omcDsl.BoolConstraint;
import fr.chaunier.xtext.omc.omcDsl.BoolVar;
import fr.chaunier.xtext.omc.omcDsl.Constraint;
import fr.chaunier.xtext.omc.omcDsl.DateTimeConstraint;
import fr.chaunier.xtext.omc.omcDsl.DecimalConstraint;
import fr.chaunier.xtext.omc.omcDsl.EnumerationConstraint;
import fr.chaunier.xtext.omc.omcDsl.IntVar;
import fr.chaunier.xtext.omc.omcDsl.IntegerConstraint;
import fr.chaunier.xtext.omc.omcDsl.NumberVar;
import fr.chaunier.xtext.omc.omcDsl.StringConstraint;
import fr.chaunier.xtext.omc.omcDsl.TerminalExpression;
import fr.chaunier.xtext.omc.omcDsl.TerminalNumber;

public class TextFeatureRenderer implements IFeatureRenderer {

	// dispatcher
	public String constraint(Constraint cst/*String iconPath*/) {
	    if (cst instanceof BoolConstraint) {
	         return constraint((BoolConstraint)cst);
	       } else if (cst instanceof DateTimeConstraint) {
	         return constraint((DateTimeConstraint)cst);
	       } else if (cst instanceof DecimalConstraint) {
	         return constraint((DecimalConstraint)cst) ;
	       } else if (cst instanceof EnumerationConstraint) {
	         return constraint((EnumerationConstraint)cst);
	       } else if (cst instanceof IntegerConstraint) {
	         return constraint((IntegerConstraint)cst);
	       } else if (cst instanceof StringConstraint) {
	         return constraint((StringConstraint)cst);
	       } else {
	         throw new IllegalArgumentException("Unhandled parameter types: "); 
	       }
 	}
 	

	public String constraint(StringConstraint cst) {
		StringBuilder strBuilder = new StringBuilder();

		if (cst.getMinLen() !=null)
			strBuilder.append(" min "+cst.getMinLen());
		else if (cst.getFixeLen() !=null)
			strBuilder.append(" fixe "+cst.getFixeLen());
		if (cst.getMaxLen() !=null) 
			strBuilder.append(" max "+cst.getMaxLen());
		if (cst.getDefaultValue() !=null)
			strBuilder.append(" def " +cst.getDefaultValue());
		if (cst.getFixedValue() !=null)
		if (cst.getRegex() !=null)
			strBuilder.append(" regex " + cst.getRegex());
		if (cst.isIsId())
			strBuilder.append("id");
		return strBuilder.toString ();	 
	} 

	
	public String constraint(DecimalConstraint cst) {

		StringBuilder strBuilder = new StringBuilder();

		if (cst.getFixeLen() !=null)
			strBuilder.append(" fixe "+cst.getFixeLen());
		if (cst.getMinValue() !=null)
			strBuilder.append(" <= " +cst.getMinValue());
		if (cst.getMaxValue() !=null)
			strBuilder.append(toStr(cst.getMaxValue()));
		strBuilder.append("| ");

		if (cst.getPrecision() !=null)
			strBuilder.append(cst.getPrecision());
		strBuilder.append("| ");

		if (cst.getScale() !=null) 
			strBuilder.append(cst.getScale());
		strBuilder.append("| ");

		if (cst.getDefaultValue() !=null)
			strBuilder.append(toStr(cst.getDefaultValue()));
		strBuilder.append("| ");

		if (cst.getFixedValue() !=null)
			strBuilder.append(toStr(cst.getFixedValue()));
		strBuilder.append("| ");

		if (cst.getPaddle() !=null)
			strBuilder.append(cst.getPaddle());

		strBuilder.append("| "); // isId
		return strBuilder.toString(); 	 
	} 
	
 	String toStr(NumberVar numVar) {
		return numVar.getValue().toString();
	}

 	String toStr(IntVar intVar) {
		return intVar.getValue().toString();
	}

 	String toStr(BoolVar boolVar) {
		return boolVar.getValue().toString();
	}

	public String constraint(IntegerConstraint cst/*String iconPath*/) {
		StringBuilder strBuilder = new StringBuilder();

		if (cst.getFixeLen() !=null)
			strBuilder.append(cst.getFixeLen());
		strBuilder.append("| ");

		if (cst.getFixeLen() !=null)
			strBuilder.append(cst.getFixeLen());
		strBuilder.append("| ");

		if (cst.getMinValue() !=null)
			strBuilder.append(toStr(cst.getMinValue()));
		strBuilder.append("| ");
		if (cst.getMaxValue() !=null)
			strBuilder.append(toStr(cst.getMaxValue()));
		strBuilder.append("| ");
		strBuilder.append("| ");
		strBuilder.append("| ");
		if (cst.getDefaultValue() !=null)
			strBuilder.append(cst.getDefaultValue());
		strBuilder.append("| ");

		if (cst.getFixedValue() !=null)
			strBuilder.append(toStr(cst.getFixedValue()));
		strBuilder.append("| ");

		if (cst.getPaddle() !=null)
			strBuilder.append(cst.getPaddle());

		strBuilder.append("| ");
		if (cst.isIsId())
			strBuilder.append('O');

		return strBuilder.toString(); 	 
	} 

 	String terminal(TerminalNumber te/*String iconPath*/) {
		if ( te.getInt() != null )	
			return te.getInt().getValue().toString(); 
		else if ( te.getNumber() != null )	
			return te.getNumber().getValue().toString();
		return "";
	}
	
	String terminal(TerminalExpression te) {
		if ( te.getBool() != null )
			return te.getBool().getValue() ;
		else if ( te.getInt() != null )	
			return te.getInt().getValue().toString() ;
		else if ( te.getNumber() != null )	
			return te.getNumber().getValue().toString() ;
		else if ( te.getString() != null )	
			return te.getString().getValue() ;
		return "";
	}
	
	public String constraint(EnumerationConstraint cst/*String iconPath*/) {
		StringBuilder strBuilder = new StringBuilder();
 		strBuilder.append("| | | | | | | ") ;
		if (cst.getFixeLen() !=null)
			strBuilder.append(cst.getFixeLen());
		strBuilder.append("| "); // scale
		if (cst.getUsage() != null)
			strBuilder.append(cst.getUsage().toString());
		strBuilder.append("| "); // key
		return strBuilder.toString(); 	 
	}
	
	public String constraint(DateTimeConstraint cst/*String iconPath*/) {
		StringBuilder strBuilder = new StringBuilder();
 		strBuilder.append("| | | | | | | | ");
		strBuilder.append("| ");
		return strBuilder.toString(); 	 
	}
	
	public String constraint(BoolConstraint cst/*String iconPath*/) {
		StringBuilder strBuilder = new StringBuilder();
 		strBuilder.append("| | | | | | | ");
		if (cst.getDefaultValue() !=null)
			strBuilder.append(toStr(cst.getDefaultValue()));
		strBuilder.append("| ");
		if (cst.getFixedValue() !=null)
			strBuilder.append(toStr(cst.getFixedValue()));
		strBuilder.append("| ");
		return strBuilder.toString() ;
	}


//	@Override
	public void setIconPath(String iconPath) {
		// TODO Auto-generated method stub
		
	}


//	@Override
	public String getIconPath() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
