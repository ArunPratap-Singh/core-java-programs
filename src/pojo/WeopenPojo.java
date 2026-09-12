package pojo;

public class WeopenPojo {
	private String name;
	private int price;
	private String range;
	private double weight;
	
	WeopenPojo(String name, int price, String range, double weight){
		
		this.name = name;
		this.price = price;
		this.range = range;
		this.weight = weight;
		
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tRange is: " +range+"\tWeight is: " +weight;
	}

}
