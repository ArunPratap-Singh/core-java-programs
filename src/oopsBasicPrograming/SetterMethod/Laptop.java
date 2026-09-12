package oopsBasicPrograming.SetterMethod;

public class Laptop {
	
	String name;
	int price;
	String color;
	
	public void setDetails(String n, int p, String c) {
		
		name = n;
		price = p;
		color = c;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Price is: " +price);
		System.out.println("Color is: " +color);
	}

}
