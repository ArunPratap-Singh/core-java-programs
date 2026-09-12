package upcastingdowncasting.Product;

public class Jeans extends Product{
	
	String brandname;
	String color;
	String size;
	
	Jeans(){
		
	}
	
	Jeans(String name, int price, int quantity, String brandname, String color, String size){
		
		super(name, price, quantity);
		this.brandname = brandname;
		this.color = color;
		this.size = size;
	}
	
	 

}
