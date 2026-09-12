package classOrabstractclassOrinterface;

public abstract class Weopen {
	
	String name;
	int price;
	double weight;
	String range;
	String durability;
	
	Weopen(){
		
	}
	
	Weopen(String name, int price, double weight, String range, String durability) {
		
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.range = range;
		this.durability = durability;
	}
	
	public abstract void use();
	
	public String toString() {
		
		return "Name is: " +name+"\tPrice is: " +price+"\tWeight is: " +weight+"\tRange is: " +range+"\tDurability is: " +durability;
	}

}
