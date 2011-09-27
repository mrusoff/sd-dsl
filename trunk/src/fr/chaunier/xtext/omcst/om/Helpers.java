package fr.chaunier.xtext.omcst.om;

import java.math.BigInteger;

import org.eclipse.xtext.naming.QualifiedName;

import fr.chaunier.xtext.omcst.om.omcstDsl.BoolVar;
import fr.chaunier.xtext.omcst.om.omcstDsl.IntVar;
import fr.chaunier.xtext.omcst.om.omcstDsl.NumberVar;

public class Helpers {

	/*
	public static boolean isAbstract(Entity e) {
		if (e == null ) return false ;
		if (e.getEntityType() == null ) return false ;
		return e.getEntityType()==EntityType.ABSTRACT;
	}
	*/
	
	// remove last segment of qualifiedName
	public static String getPackageNameSpace(QualifiedName qn) {
		StringBuilder builder = new StringBuilder();
		boolean isFirst = true;
		boolean isLast = false;
		for (String segment : qn.getSegments()) {
			if (! segment.equals(qn.getLastSegment()))
				isLast=true;
			if (!isFirst && !isLast)
				builder.append(".");
			isFirst = false;
			if ( ! isLast )
				builder.append(segment);
		}
		return builder.toString();
	}

	/*	def merge(NumberVar dtI,NumberVar attI) {
		if ( dtI != null )
			dtI 
		else attI
	}
*/
	public static BigInteger merge(BigInteger first,BigInteger seconde) {
		return ( first==null ) ? seconde : first ;
	}
	public static NumberVar merge(NumberVar first,NumberVar seconde) {
		return ( first==null ) ? seconde : first ;
	}
	public static BoolVar merge(BoolVar first,BoolVar seconde) {
		return ( first==null ) ? seconde : first ;
	}
	public static IntVar merge(IntVar first,IntVar seconde) {
		return ( first==null ) ? seconde : first ;
	}
	public static String merge(String first,String seconde) {
		return ( first==null ) ? seconde : first ;
	}
	public static boolean merge(boolean first,boolean seconde) {
		return ( ! first ) ? seconde : first ;
	}
	
}
