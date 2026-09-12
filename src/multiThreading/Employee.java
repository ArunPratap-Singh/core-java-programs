package multiThreading;

public class Employee extends Thread{
	
	String name;
	int id;
	int task;
	int days;
	
	Employee(){
		
	}
	
	Employee(String name, int id, int task, int days){
		this.name = name;
		this.id = id;
		this.task = task;
		this.days = days;
	}
	
	public void run() {
		work();
	}
	
	public void work() {
		System.out.println("==============="+name+"started work===============");
		for(int i=1;i<=task;i++) {
			System.out.println(name+" is completing "+i+" task in "+days);
		}
		System.out.println(name+ " has completed task");
		
	}

}
