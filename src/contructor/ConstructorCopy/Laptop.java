package contructor.ConstructorCopy;

public class Laptop {
	
	String brand;
	int price;
	String ram;
	
	Laptop(){
		
	}
	
	//Setters or Mutators
	Laptop(String brand, int price, String ram){
		
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		
	}
	
	Laptop(Laptop l){
		
		this.brand = l.brand;
		this.price = l.price;
		this.ram = l.ram;
	}
	
	//Getters or Accessors
	public String toString() {
		return "Brand is: " +brand+"\nPrice is: " +price+"\nRam is: " +ram+"\n=============================";
	}

}
