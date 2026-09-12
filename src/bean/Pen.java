package bean;

public class Pen {
	
	private String brandname;
	private String color;
	private int price;
	private String type;
	
	Pen(){
		
	}
	
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	

}
