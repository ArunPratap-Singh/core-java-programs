package projects.ProjectVehicle;

public class Bus extends Vehicle{
	
	String route;
	boolean isAC;
	
	Bus(){
		
	}
	
	Bus(String name, int price, int numberofwheels, String route, boolean isAC){
		
		super(name, price, numberofwheels);
		this.route = route;
		this.isAC = isAC;
	}

}
