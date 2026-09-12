package contructor.ConstructorCopy;

public class Shirt {
	
	String brand;
	int price;
	String color;
	String size;
	
	Shirt(){
		
	}
	
	Shirt(String brand, int price, String color, String size){

		this.brand = brand;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	Shirt(Shirt s){
		
		this.brand = s.brand;
		this.color = s.color;
		this.price = s.price;
		this.size = s.size;
	}
	
	public String toString() {

	return "Brand is: " +brand+"\nPrice is: " +price+"\nColor is: " +color+"\nSize is: " +size+"\n=========================";
	
	}

}
