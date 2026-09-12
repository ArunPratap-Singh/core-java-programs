package contructor.ConstructorCopy;

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
    
    Missile(Missile m){
    	
    	this.cost = m.cost;
    	this.name = m.name;
    	this.type = m.type;
    }

    
    public String toString() {
        return "Name is: " +name+"\nType is: " +type+"\nCost is: " +cost+"\n==============================";
    }
	

}
