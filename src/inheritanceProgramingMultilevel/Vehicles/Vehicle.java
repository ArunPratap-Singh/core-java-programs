package inheritanceProgramingMultilevel.Vehicles;

public class Vehicle {
	
	String brand;
    String model;
    int year;
    
    Vehicle(){
    	
    }

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand is: " + brand + "\nModel is: " + model + "\nYear is: " + year;
    }

}
