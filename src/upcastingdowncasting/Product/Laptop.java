package upcastingdowncasting.Product;

public class Laptop extends Product{
	
	String brandname;
	String ram;
	String color;
	
	Laptop(){
		
	}
	
	Laptop(String name, int price, int quantity, String brandname, String ram, String color){
		
		super(name, price, quantity);
		this.brandname = brandname;
		this.ram = ram;
		this.color = color;
	}

}
