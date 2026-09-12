package inheritancePrograming;

public class Vehicle {
	
	String name;
	int price;
	int numberofwheels;
	String color;
	
	Vehicle(){
		
	}
	
	Vehicle(String name, int price, int numberofwheels, String color){
		
		this.name = name;
		this.price = price;
		this.numberofwheels = numberofwheels;
		this.color = color;
				
	}
	
	@Override
	public String toString() {
		return "Name is: " +name+"\nPrice is: " +price+"\nNumber of Wheels is: " +numberofwheels+"\nColor is: " +color; 
	}

}
