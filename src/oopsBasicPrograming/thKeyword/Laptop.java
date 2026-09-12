package oopsBasicPrograming.thKeyword;

public class Laptop {
	
	String name;
	int price;
	String color;
	
	public void setDetails(String name, int price, String color) {
		
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Price is: " +price);
		System.out.println("Color is: " +color);
	}

}
