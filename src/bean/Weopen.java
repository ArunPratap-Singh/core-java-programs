package bean;

public class Weopen {
	private String name;
	private int price;
	private String range;
	private double weight;
	
	Weopen(){
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price  = price;
	}
	public int getPrice() {
		return price;
	}
	public void setRange(String range) {
		this.range = range;
	}
	public String getRange() {
		return range;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}

}
