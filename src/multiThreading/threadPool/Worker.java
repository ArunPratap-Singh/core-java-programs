package multiThreading.threadPool;

public class Worker implements Runnable{
	
	String name;
	String role;
	
	Worker(){
		
	}
	
	Worker(String name, String role){
		
		this.name = name;
		this.role = role;
	}
	
	public void run() {
		
		System.out.println("Worker "+ name +" with role " + role + " is executing the task. by thread "+Thread.currentThread().getName());
	}

}
