package contructor;

public class Weopen {
	
	String name;
	int price;
	String damage;
	
	Weopen(){
		
	}
	
	Weopen(String name, int price, String damage) {
		
		this.name = name;
		this.price = price;
		this.damage = damage;
	}
	
	public String toString() {
		
		return "Name is: " +name+"\nPrice is: " +price+"\nDamage is: " +damage+"\n==============================";
	}

}
