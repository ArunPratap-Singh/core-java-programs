package upcastingdowncasting.fruit;

public class Apple extends Fruit{
	
	String brand;
	int quantity;
	
	Apple(){
		
	}
	
	Apple(String name, String color, int price, String brand, int quantity){
		
		super(name, color, price);
		this.brand = brand;
		this.quantity = quantity;
	}

}
