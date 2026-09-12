package bean;

public class Shirt {
	private String brandname;
	private int price;
	private String fabric;
	private String color;
	private String size;
	
	Shirt(){
		
	}
	
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}
	public String getFabric() {
		return fabric;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSize() {
		return size;
	}

}
