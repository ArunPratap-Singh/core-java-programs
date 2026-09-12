package bean;

public class WaterBottle {
	private String name;
	private int price;
	private String type;
	private String volume;
	private String brand;
	
	WaterBottle(){
		
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
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getVolume() {
		return volume;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}

}
