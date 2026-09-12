package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Car extends Vehicle{
	
	    int numberOfDoors;
	    String fuelType;
	    
	    Car(){
	    	
	    }

	    Car(String brand, String model, int year, int numberOfDoors, String fuelType) {

	        super(brand, model, year);
	        this.numberOfDoors = numberOfDoors;
	        this.fuelType = fuelType;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nNumber Of Doors is: " + numberOfDoors + "\nFuel Type is: " + fuelType+"\n===========================";
	    }
	

}
