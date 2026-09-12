package product;

public class Laptop extends ProductL {
	
	String color;
	String ram;
	
	Laptop(){
		
	}
	
	Laptop(String brandname, int price, int quantity, int productid, String color, String ram){
		 
		super(brandname, price, quantity, productid);
		this.color = color;
		this.ram = ram;
		
	}
	
	public String toString() {
		return super.toString()+"\tColor is: " +color+"\tRam is: " +ram;
	}

}
