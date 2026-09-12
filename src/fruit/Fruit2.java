package fruit;

public class Fruit2 {
	
	String name;
	int price;
	String color;
	
	Fruit2(){
		
	}
	
	Fruit2(String name, int price, String color){
		
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tColor is: " +color;

	}

}
