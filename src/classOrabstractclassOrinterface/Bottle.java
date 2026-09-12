package classOrabstractclassOrinterface;

public abstract class Bottle {
	
	String name;
	int price;
	double capacity;
	String material;
	String color;
	
	Bottle(){
		
	}
	
	Bottle(String name, int price, double capacity, String material, String color) {
		
		this.name = name;
		this.price = price;
		this.capacity = capacity;
		this.material = material;
		this.color = color;
	}
	
	public abstract void use();
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tCapacity is: " +capacity+"\tMaterial is: " +material+"\tColor is: " +color;
	}

}
