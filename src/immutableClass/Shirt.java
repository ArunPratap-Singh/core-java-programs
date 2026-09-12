package immutableClass;

public final class Shirt {
	
	private final String brandname;
	private final String fabric;
	private final int price;
	private final int quantity;
	
	Shirt(String brandname, String fabric, int price, int quantity){
		this.brandname = brandname;
		this.fabric = fabric;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getBrandname() {
		return brandname;
	}
	public String getFabric() {
		return fabric;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	

}
