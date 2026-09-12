package fruit;

public class Fruit {
	
	String name;
	int price;
	String color;
	
	Fruit(){
		
	}
	
	Fruit(String name, int price, String color){
		
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tColor is: " +color;
	}

}
