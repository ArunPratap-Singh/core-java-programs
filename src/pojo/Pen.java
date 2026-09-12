package pojo;

public class Pen {
	
	private String brandname;
	private String color;
	private int price;
	private String type;
	
	Pen(String brandname, String color, int price, String type){
		
		this.brandname = brandname;
		this.color = color;
		this.price = price;
		this.type = type;
	}
	
	public String toString() {
		return "Brandname is: " +brandname+"\tColor is: " +color+"\tPrice is: " +price+"\tType is: " +type;
	}

}
