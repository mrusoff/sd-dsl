package fr.chaunier.xtext.omc;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

import fr.chaunier.xtext.omc.omcDsl.BoolVar;
import fr.chaunier.xtext.omc.omcDsl.DomainModel;
import fr.chaunier.xtext.omc.omcDsl.IntVar;
import fr.chaunier.xtext.omc.omcDsl.NumberVar;

public class Helpers {

	public static DomainModel getModel(EObject current) {
		current = current.eContainer() ;
		if ( current instanceof DomainModel )
			return (DomainModel)current ;
		else return getModel(current) ;
	}

	
	// remove last segment of qualifiedName
	public static String getQNWithoutLast(QualifiedName qn) {
		StringBuilder builder = new StringBuilder();
		boolean isFirst = true;
		boolean isLast = false;
		for (String segment : qn.getSegments()) {
			if (segment.equals(qn.getLastSegment()))
				isLast=true;
			if (!isFirst)
				builder.append(".");
			isFirst = false;
			if (!isLast )
				builder.append(segment);
		}
		return builder.toString();
	}
	
	// remove last segment of qualifiedName
	public static String getRelativeRoot(QualifiedName qn) {
		StringBuilder builder = new StringBuilder();
		
		for ( int i = 0 ; i < qn.getSegmentCount() ; i++) {
			builder.append("../");
		}
		return builder.toString();
	}

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
