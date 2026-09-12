package contructor.ConstructorCopy;

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
	
	Weopen(Weopen w) {
		
		this.name = w.name;
		this.price = w.price;
		this.damage = w.damage;
	}
	
	public String toString() {
		
		return "Name is: " +name+"\nPrice is: " +price+"\nDamage is: " +damage+"\n==============================";
	}

}
