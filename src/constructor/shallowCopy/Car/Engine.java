package constructor.shallowCopy.Car;

public class Engine {
	
	 int engineNumber;
	 String engineType;
	 int horsepower;
	 String fuelType;
	 double engineCapacity;
	 String manufacturer;
	 
	 Engine(){
		 
	 }
	 
	 Engine(int engineNumber, String engineType, int horsepower, String fuelType, double engineCapacity, String manufacturer){
		 
		 this.engineNumber = engineNumber;
		 this.engineType = engineType;
		 this.horsepower = horsepower;
		 this.fuelType = fuelType;
		 this.engineCapacity = engineCapacity;
		 this.manufacturer = manufacturer;
	 }
	 
	 public String toString() {
		 return "EngineNumber is: " +engineNumber+"\nEngineType is: " +engineType+"\nHorsePower is: " +horsepower+"\nFuelType is: " +fuelType+"\nEngineCapacity is: " +engineCapacity+"\nManufacturer is: " +manufacturer;
	 }

}
