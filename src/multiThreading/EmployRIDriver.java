package multiThreading;

public class EmployRIDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Starts");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		
		EmployRI e1 = new EmployRI("Mohan", 9);//Runnable Object
		EmployRI e2 = new EmployRI("Sohan", 6);
		//EmployRI e3 = new EmployRI("Rohan", 3);
		//EmployRI e4 = new EmployRI("John", 7);
		
		Thread t1 = new Thread(e1);//Thread Object
		Thread t2 = new Thread(e2);
		//Thread t3 = new Thread(e3);
		//Thread t4 = new Thread(e4);
		Thread t3 = new Thread(new EmployRI("Rohan", 3));
		Thread t4 = new Thread(new EmployRI("John", 7));
		
		
		t1.start();
		t2.start();
		//t3.start();
		//t4.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("Main Ends");

	}

}
