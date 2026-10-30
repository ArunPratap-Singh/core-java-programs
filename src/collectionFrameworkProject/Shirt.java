package collectionFrameworkProject;

public class Shirt {
	
	String brand;
	double price;
	String color;
	int size;
	
	Shirt(){
		
	}
	
	Shirt(String brand, double price, String color, int size){
		
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public String toString() {
		
		return "Shirt [Brand is: " +brand+"\t Price is: " +price+"\t Color is: " +color+"\t Size is: " +size+"]";
	}

}
