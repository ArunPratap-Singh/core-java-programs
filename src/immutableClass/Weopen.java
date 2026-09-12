package immutableClass;

public final class Weopen {
	
	private final String name;
	private final int price;
	private final double weight;
	
	Weopen(String name, int price, double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}

}
