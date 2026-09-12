package upcastingdowncasting;

public class Bus extends Vehicle {
	
	String route;
	String ACnonAC;
	
	Bus(){
		
	}
	
	Bus(String name, int price, int numberofwheels, String route, String ACnonAC){
		
		super(name, price, numberofwheels);
		this.route = route;
		this.ACnonAC = ACnonAC;
	}
	
	

}
