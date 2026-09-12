package classOrabstractclassOrinterface;

public abstract class Fruit {
	String color;
	int price;
	double weight;
	String name;
	String taste;
	
	Fruit(){
		
	}
	
	Fruit(String color, int price, double weight, String name, String taste){
		
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.name = name;
		this.taste = taste;
	}
	
	public abstract void eat();
	
	public String toString() {
		return "Color is: " +color+"\tPrice is: " +price+"\tWeight is: " +weight+"\tName is: " +name+"\tTaste is: " +taste;
	}

}
