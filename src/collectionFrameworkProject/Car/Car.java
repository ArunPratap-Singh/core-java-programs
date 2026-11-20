package collectionFrameworkProject.Car;

public class Car {
	
	String brand;
	double price;
	String color;
	int manufacturingYear;
	
	Car(){
		
		
	}
	
	Car(String brand, double price, String color, int manufacturingYear){
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.manufacturingYear = manufacturingYear;
		
	}
	
	public String toString() {
		
		return "Car [Brand is: " +brand+", Color is: " +color+", Price is: " +price+", Manufacturing Year is: " +manufacturingYear+"]";
	}

}
