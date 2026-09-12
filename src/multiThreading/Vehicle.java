package multiThreading;

public class Vehicle {
	
	String name;
	int distance;
	
	Vehicle(){
		
	}
	
	Vehicle(String name, int distance){
		this.name = name;
		this.distance = distance;
	}
	
	public void drive() {
		
		System.out.println("================="+name+" has started===============");
		for(int i=1;i<=distance;i++) {
			System.out.println(name+"has covered "+i+"km");
		}
		System.out.println("=================="+name+"has reached the destination");
		
	}

}
