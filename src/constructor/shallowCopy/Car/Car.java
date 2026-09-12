package constructor.shallowCopy.Car;

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
	
	Car(Car c) {
		
		this.name = c.name;
		this.brand = c.brand;
		this.price = c.price;
		this.color = c.color;
		this.e = c.e;
	}
	
	public String toString() {
		
		return "Name is: " +name+"\nBrand is: " +brand+"\nPrice is: " +price+"\nColor is: " +color+"\nE is: " +e+"\n========================";
	}
	
	
	
}
