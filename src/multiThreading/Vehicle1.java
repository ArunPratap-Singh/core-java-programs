package multiThreading;

public class Vehicle1 extends Thread{
	
	String name;
	int distance;
	
	Vehicle1(){
		
	}
	
	Vehicle1(String name, int distance){
		this.name = name;
		this.distance = distance;
	}
	
	public void run() {
		drive();
	}
	
	
	public void drive() {
		
		System.out.println("================="+name+" has started===============");
		for(int i=1;i<=distance;i++) {
			System.out.println(name+"has covered "+i+"km");
		}
		System.out.println("=================="+name+"has reached the destination");
		
	}

}
