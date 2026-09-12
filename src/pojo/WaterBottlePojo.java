package pojo;

public class WaterBottlePojo {
	private String name;
	private int price;
	private String type;
	private String volume;
	private String brand;
	
	WaterBottlePojo(String name, int price, String type, String volume, String brand){
		
		this.name = name;
		this.price = price;
		this.type = type;
		this.volume = volume;
		this.brand = brand;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tType is: " +type+"\tVolume is: " +volume+"\tBrand is: " +brand;
	}

}
