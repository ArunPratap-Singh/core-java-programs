package oopsBasicPrograming.SetterMethod;

public class Product {
	
	String name;
	int productid;
	int price;
	String address;
	
	public void setDetails(String n, int pi, int p, String a) {
		
		name = n;
		productid = pi;
		price = p;
		address = a;
	}
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Productid is: " +productid);
		System.out.println("Price is: " +price);
		System.out.println("Address is: " +address);
	}
}
