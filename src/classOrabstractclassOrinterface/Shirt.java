package classOrabstractclassOrinterface;

public abstract class Shirt {
	
	String name;
	int price;
	String brand;
	String size;
	String type;
	String fabric;
	String color;
	
	Shirt(){
		
	}
	
	Shirt(String name, int price, String brand, String size, String type, String fabric, String color){
		
		this.name = name;
		this.price  = price;
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.fabric = fabric;
		this.color = color;
	}
	
	public abstract void use();
	
	public String toString() {
		
		return "Name is: " +name+"\tPrice is: " +price+"\tBrand is: " +brand+"\tSize is: " +size+"Type is: " +type+"\tFabric is: " +fabric+"\tColor is: " +color; 
	}
}
