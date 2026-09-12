package contructor;

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

	    public String toString() {
	        return "Bird Name is: " +birdName+ "\nHabitat is: " +habitat+ "\nAge is: " +age+ " years"+"\nWingspan is: " +wingspan+ " cm"+"\n==============================";
	    }
	

}
