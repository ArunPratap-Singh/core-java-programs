package multiThreading;

public class EmployRI implements Runnable{
	
	String name;
	int workduration;
	
	EmployRI(){
		
	}
	
	EmployRI(String name, int workduration){
		this.name = name;
		this.workduration = workduration;
	}
	
	public void run() {
		work();
	}
	
	public void work() {
		System.out.println(name+" started working");
		for(int i=1;i<=workduration;i++) {
			System.out.println(name+" has completed"+i+" hours");
		}
		System.out.println(name+" has completed the work");
	}

}
