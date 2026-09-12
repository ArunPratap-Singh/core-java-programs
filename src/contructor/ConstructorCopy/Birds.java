package contructor.ConstructorCopy;

public class Birds {
	
	    String birdName;
	    String habitat;
	    int age;
	    double wingspan;

	    Birds() {
	    }

	    Birds(String birdName, String habitat, int age, double wingspan) {
	        this.birdName = birdName;
	        this.habitat = habitat;
	        this.age = age;
	        this.wingspan = wingspan;
	    }
	    
	    Birds(Birds b) {
	    	
	    	this.birdName = b.birdName;
	    	this.habitat = b.habitat;
	    	this.age = b.age;
	    	this.wingspan = b.wingspan;
	    }

	    public String toString() {
	        return "Bird Name is: " +birdName+ "\nHabitat is: " +habitat+ "\nAge is: " +age+ " years"+"\nWingspan is: " +wingspan+ " cm"+"\n==============================";
	    }
	

}
