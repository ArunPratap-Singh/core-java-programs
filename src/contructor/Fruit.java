package contructor;

public class Fruit {
	
	String name;
	int price;
	double weight;
	
	Fruit(){
		
	}
	
	//Setters or Mutators
	Fruit(String name, int price, double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	
	//Getters or Accessors
	public String toString() {
		return "Name is: " +name+"\nPrice is: " +price+"\nWeight is: " +weight+"\n==========================";
	}

}
