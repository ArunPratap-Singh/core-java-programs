package upcastingdowncasting.fruit;

public class Mango extends Fruit{
	
	String brand;
	int quantity;
	
	Mango(){
		
	}
	
	Mango(String name, String color, int price, String brand, int quantity){
		
		super(name, color, price);
		this.brand = brand;
		this.quantity = quantity;
	}

}
