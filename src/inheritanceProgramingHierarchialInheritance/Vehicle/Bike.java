package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Bike extends Vehicle{
	
	    int engineCC;
	    String bikeType;
	    
	    Bike(){
	    	
	    }

	    Bike(String brand, String model, int year, int engineCC, String bikeType) {

	        super(brand, model, year);
	        this.engineCC = engineCC;
	        this.bikeType = bikeType;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nEngine CC is: " + engineCC + "\nBike Type is: " + bikeType+"\n============================";
	    }
	

}
