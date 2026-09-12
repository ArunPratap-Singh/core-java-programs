package upcastingdowncasting.fruit;

public class Banana extends Fruit{
	
	String brand;
	String quantity;
	
	Banana(){
		
	}
	
	Banana(String name, String color, int price, String brand, String quantity){
		
		super(name, color, price);
		this.brand = brand;
		this.quantity = quantity;
	}
	
}
