package inheritanceProgramingHierarchialInheritance.Vehicle;

public class Aircraft extends Vehicle{
	
	    int passengerCapacity;
	    String aircraftType;
	    
	    Aircraft(){
	    	
	    }

	    Aircraft(String brand, String model, int year, int passengerCapacity, String aircraftType) {

	        super(brand, model, year);
	        this.passengerCapacity = passengerCapacity;
	        this.aircraftType = aircraftType;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nPassenger Capacity is: " + passengerCapacity + "\nAircraft Type is: " + aircraftType+"\n==================================";
	    }
	

}
