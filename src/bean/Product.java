package bean;

public class Product {
	private String name;
	private int price;
	private String brand;
	private int quantity;
	
	Product(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand  = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}

}
