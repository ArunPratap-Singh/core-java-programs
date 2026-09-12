package oopsBasicPrograming.SetterMethod;

public class Shirt {
	
	String brand;
	int price;
	String color;
	String size;
	int quantity;
	
	public void setDetails(String b, int p, String c, String s, int q) {

		brand = b;
		price = p;
		color = c;
		size = s;
		quantity = q;
		
	}
	
	public void printDetails(){

		System.out.println("Brand is: " +brand);
		System.out.println("Price si: " +price);
		System.out.println("Color is: " +color);
		System.out.println("Size is: " +color);
		System.out.println("Quantity is: " +quantity);
		
	}

}
