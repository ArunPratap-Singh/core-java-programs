package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Truck extends Vehicle{
	
	    double loadCapacity;
	    int numberOfWheels;
	    
	    Truck(){
	    	
	    }

	    Truck(String brand, String model, int year, double loadCapacity, int numberOfWheels) {

	        super(brand, model, year);
	        this.loadCapacity = loadCapacity;
	        this.numberOfWheels = numberOfWheels;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nLoad Capacity is: " + loadCapacity + "Wheels is: " + numberOfWheels+"\n=============================";
	    }
	

}
