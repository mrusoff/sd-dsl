package fr.chaunier.xtext.omc.generator.msg;

/**
	 */
public class MsgManager {

	  private int countArgs ;
//	  private Map<String, String> ElementToPath = newHashMap();
	  
	  MsgManager() {
		  countArgs = 1 ;
	  }

	  public int getNext() {
		  return countArgs++ ;
	  }
	  
	  public String getIndentation(Integer iter)
	  {
		  String res = new String() ;
		  for ( int i=0 ; i < iter.intValue() ;  ) {
			  res += "--." ;
			  i++ ;
		  }
		  return new String(res) ;  
	  }

	  public String getReserveByCount(Integer iter,Integer max) {
		  String res = new String() ;
		  for ( int i=iter.intValue() ; i < max.intValue() ;  ) {
			  res += " | " ;
			  i++ ;
		  }
		  return new String(res) ;  
	  }

}
