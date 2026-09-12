package bean;

public class Laptop {
	private String brandname;
	private int price;
	private String ram;
	private String color;
	
	Laptop(){
		
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
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRam() {
		return ram;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
		
	
}
