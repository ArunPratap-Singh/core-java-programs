package constructor.deepCopy.Car;

public class Car {
	
	String name;
	String brand;
	int price;
	String color;
	Engine e;
	
	Car(){
		
	}
	
	Car(String name, String brand, int price, String color, Engine e) {
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.e = e;
	}
	
	//deep copy
	Car(Car c) {
		
		this.name = c.name;
		this.brand = c.brand;
		this.price = c.price;
		this.color = c.color;
		this.e = new Engine();
		this.e.engineCapacity = c.e.engineCapacity;
		this.e.engineNumber = c.e.engineNumber;
		this.e.engineType = c.e.engineType;
		this.e.fuelType = c.e.fuelType;
		this.e.horsepower = c.e.horsepower;
		this.e.manufacturer = c.e.manufacturer;
	}
	
	public String toString() {
		
		return "Name is: " +name+"\nBrand is: " +brand+"\nPrice is: " +price+"\nColor is: " +color+"\nE is: " +e+"\n========================";
	}
	
	
	
}
