package upcastingdowncasting.Product;

public class Shirt extends Product{
	
	String brandname;
	String fabric;
	String type;
	String color;
	char size;

	Shirt(){
		
	}
	
	Shirt(String name, int price, int quantity, String brandname, String fabric, String type, String color, char size){
		
		super(name, price, quantity);
		this.brandname = brandname;
		this.fabric = fabric;
		this.type = type;
		this.color = color;
		this.size = size;
	}
}
