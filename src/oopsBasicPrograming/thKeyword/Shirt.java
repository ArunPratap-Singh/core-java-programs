package oopsBasicPrograming.thKeyword;

public class Shirt {
	
	String brand;
	int price;
	String color;
	String size;
	int quantity;
	
	public void setDetails(String brand, int price, String color, String size, int quantity) {

		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
		this.quantity = quantity;
		
	}
	
	public void printDetails(){

		System.out.println("Brand is: " +brand);
		System.out.println("Price si: " +price);
		System.out.println("Color is: " +color);
		System.out.println("Size is: " +color);
		System.out.println("Quantity is: " +quantity);
		
	}

}
