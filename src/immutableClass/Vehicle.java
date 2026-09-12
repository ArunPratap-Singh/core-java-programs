package immutableClass;

public final class Vehicle {
	
	private final String name;
	private final String brandname;
	private final int price;
	private final int numberofwheel;
	private final String color;
	

	
	Vehicle(String name, String brandname, int price, int numberofwheel, String color){
		this.name = name;
		this.brandname = brandname;
		this.price = price;
		this.numberofwheel = numberofwheel;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public String getBrandName() {
		return brandname;
	}
	public int getPrice() {
		return price;
	}
	public int getNumberOfWheels() {
		return numberofwheel;
	}
	public String getColor() {
		return color;
	}

}
