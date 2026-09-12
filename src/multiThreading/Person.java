package multiThreading;

public class Person extends Thread{
	
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void run() {
		feel();
	}
	
	public void feel() {
		System.out.println("============="+name+"is feeling==================");
		for(int i=1;i<=age;i++) {
			System.out.println(name+" is feeling that health condition is decreasing as"+i+"increases");
			
		}
		System.out.println(name+"Age end and move to heaven");
	}

}
