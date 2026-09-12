package contructor;

public class Missile {

    String name;
    String type;
    double cost;

	    
    Missile() {
    	
    }

    
    Missile(String name, String type, double cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    
    public String toString() {
        return "Name is: " +name+"\nType is: " +type+"\nCost is: " +cost+"\n==============================";
    }
	

}
