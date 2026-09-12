package classOrabstractclassOrinterface;

public abstract class Product {
	
	String name;
	int price;
	double weight;
	String color;
	int id;
	
	Product(){
		
	}

	Product(String name, int price, double weight, String color, int id){
		
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.id = id;
	}
	
	public abstract void use();
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tWeight is: " +weight+"\tColor is: " +color+"\tId is: " +id;
	}
}
