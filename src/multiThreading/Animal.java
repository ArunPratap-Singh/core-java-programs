package multiThreading;

public class Animal extends Thread {
	String name;
	int distance;
	
	Animal(){
		
	}
	
	Animal(String name, int distance){
		this.name = name;
		this.distance = distance;
	}
	
	public void run() {
		walk();
	}
	
	public void walk() {
		System.out.println("================"+name+ " Started Walking");
		for(int i=1;i<=distance;i++) {
			System.out.println(name+" walked " +i+ " Km distance");
		}
		System.out.println(name+" Reached Destination");
	}
	
	

}
