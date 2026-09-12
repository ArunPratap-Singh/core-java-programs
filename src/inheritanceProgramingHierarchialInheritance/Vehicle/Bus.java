package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Bus extends Vehicle{
	
	    int seatingCapacity;
	    String route;
	    
	    Bus(){
	    	
	    }

	    Bus(String brand, String model, int year, int seatingCapacity, String route) {

	        super(brand, model, year);
	        this.seatingCapacity = seatingCapacity;
	        this.route = route;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSeating Capacity is: " + seatingCapacity + "\nRoute is: " + route+"\n===============================";
	    }
	

}
