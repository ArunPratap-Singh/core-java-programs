package multiThreading;

public class Fruit extends Thread{
	
	String name;
	int time;
	
	Fruit(){
		
	}
	
	Fruit(String name, int time){
		this.name = name;
		this.time = time;
	}
	
	public void run() {
		eat();
	}
	
	public void eat() {
		
		System.out.println("================"+name+" is been eaten in following time=================");
		for(int i=1; i<=time; i++) {
			System.out.println(name+"is been eaten if "+i+"sec");
		}
		System.out.println("================"+name+" eating is completed=================");
	}

}
