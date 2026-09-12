package inheritanceProgramingMultilevel.Vehicles;

public class Car extends MotorVehicle{
	
	int numberOfDoors;
    String transmission;
    
    Car(){
    	
    }

    Car(String brand, String model, int year, String fuelType, int engineCapacity, int numberOfDoors, String transmission) {

        super(brand, model, year, fuelType, engineCapacity);
        this.numberOfDoors = numberOfDoors;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumberOfDoors is: " + numberOfDoors + "\nTransmission is: " + transmission;
    }

}
