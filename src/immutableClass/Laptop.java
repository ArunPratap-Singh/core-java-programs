package immutableClass;

public final class Laptop {
	
	private final String name;
	private final String brandname;
	private final int price;
	private final String ram;
	
	Laptop(String name, String brandname, int price, String ram){
		this.name = name;
		this.brandname = brandname;
		this.price = price;
		this.ram = ram;
	}
	
	public String getName() {
		return name;
	}
	public String getBrandname() {
		return brandname;
	}
	public int getPrice() {
		return price;
	}
	public String getRam() {
		return ram;
	}

}
