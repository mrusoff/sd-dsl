package fr.chaunier.xtext.omc.features;

public class Cardinality {

	public Cardinality(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	int min ;
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	int max ;

}
