package pojo;

public class ShirtPojo {
	private String brandname;
	private int price;
	private String fabric;
	private String color;
	private String size;
	
	ShirtPojo(String brandname, int price, String fabric, String color, String size){
		this.brandname = brandname;
		this.price = price;
		this.fabric = fabric;
		this.color = color;
		this.size = size;
	}
	
	public String toString() {
		return "Brandname is: " +brandname+"\tPrice is: " +price+"\tFabric is: " +fabric+"\tColor is: " +color+"\tSize is: " +size+"\t============";
	}

}
