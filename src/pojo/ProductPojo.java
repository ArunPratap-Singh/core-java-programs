package pojo;

public class ProductPojo {
	private String name;
	private int price;
	private String brand;
	private int quantity;
	
	ProductPojo(String name, int price, String brand, int quantity){
		
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tBrand is: " +brand+"\tQuantity is: " +quantity;
	}

}
