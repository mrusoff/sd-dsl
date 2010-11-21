package fr.chaunier.model.utils;



public class Ident
{
  public static String getIndentation(Integer iter)
  {
	  String res = new String() ;
	  for ( int i=0 ; i < iter.intValue() ;  ) {
		  res += "   |   " ;
		  i++ ;
	  }
	  return new String(res) ;  
  }
  
}