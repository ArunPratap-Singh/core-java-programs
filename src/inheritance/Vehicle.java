package inheritance;

public class Vehicle {
	
	String name;
	String price;
	int numberofwheels;
	
	Vehicle(){
		
	}
	
	Vehicle(String name, String price, int numberofwheels){
		
		this.name = name;
		this.price = price;
		this.numberofwheels = numberofwheels;
	}
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tNumber of Wheels: " +numberofwheels;
	}

}
