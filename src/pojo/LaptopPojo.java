package pojo;

public class LaptopPojo {
	
	private String brandname;
	private int price;
	private String ram;
	private String color;
	
	LaptopPojo(String brandname, int price, String ram, String color){
		
		this.brandname = brandname;
		this.price = price;
		this.ram = ram;
		this.color = color;
	}
	
	public String toString() {
		return "brandname is: " +brandname+"\tPrice is: " +price+"\tRam is: " +ram+"\tColor is: " +color;
	}

}
