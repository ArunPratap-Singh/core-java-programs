package contructor;

public class Mango {

	    String variety;
	    String origin;
	    double weight;
	    int sweetness;

	    Mango() {
	    }

	    Mango(String variety, String origin, double weight, int sweetness) {
	        this.variety = variety;
	        this.origin = origin;
	        this.weight = weight;
	        this.sweetness = sweetness;
	    }

	    public String toString() {
	        return "Variety is: " +variety+ "\nOrigin is: " +origin+ "\nWeight is: " +weight+ " grams"+ "\nSweetness Level is: " +sweetness+ "\n==============================";
	    }
	

}
