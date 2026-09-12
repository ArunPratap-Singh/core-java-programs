package immutableClass;

public final class Fruit {
	
	private final String name;
	private final int price;
	private final double quantity;
	private final String color;
	
	Fruit(String name, int price, double quantity, String color){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public double getQuantity() {
		return quantity;
	}
	public String getColor() {
		return color;
	}

}
