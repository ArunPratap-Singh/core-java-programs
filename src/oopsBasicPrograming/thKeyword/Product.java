package oopsBasicPrograming.thKeyword;

public class Product {
	
	String name;
	int productid;
	int price;
	String address;
	
	public void setDetails(String name, int productid, int price, String address) {
		
		this.name = name;
		this.productid = productid;
		this.price = price;
		this.address = address;
	}
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Productid is: " +productid);
		System.out.println("Price is: " +price);
		System.out.println("Address is: " +address);
	}
}
