package inheritanceProgramingMultilevel.Vehicles;

public class MotorVehicle extends Vehicle{
	
	String fuelType;
    int engineCapacity;
    
    MotorVehicle(){
    	
    }

    MotorVehicle(String brand, String model, int year, String fuelType, int engineCapacity) {

        super(brand, model, year);
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFuelType is: " + fuelType + "\nEngineCapacity is: " + engineCapacity + " CC";
    }

}
