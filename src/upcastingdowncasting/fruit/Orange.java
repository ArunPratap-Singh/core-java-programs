package upcastingdowncasting.fruit;

public class Orange extends Fruit{
	
	String brand;
	int quantity;
	String taste;
	
	Orange(){
		
	}
	
	Orange(String name, String color, int price, String brand, int quantity, String taste){
		
		super(name, color, price);
		this.brand = brand;
		this.quantity = quantity;
		this.taste = taste;
	}

}
