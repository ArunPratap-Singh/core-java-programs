package multiThreading;

public class EmployRIDriver1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->System.out.println("My Thread 1"));
		Thread t2 = new Thread(()->{
			System.out.println("Thread-2 starts");
			for(int i=1;i<=120;i++) {
				System.out.println("Thread 2 Executing for : " +i);
			}
			System.out.println("=================Thread 2 completed====================");
		});
		
		Thread t3 = new Thread(()->{
			System.out.println("Thread-3 starts");
			for(int i=1;i<=15;i++) {
				System.out.println("Thread 3 Executing for: " +i);
			}
			System.out.println("==================Thread 3 completed===================");
		});
		Thread t4 = new Thread(()->System.out.println("My Thread 4"));
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
