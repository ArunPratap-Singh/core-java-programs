package multiThreading.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

	public static void main(String[] args) {
		
		Thread t1 =  new Thread(new Worker("Mohan", "Account Manager"));
		Thread t2 =  new Thread(new Worker("Sohan", "Chef"));
		Thread t3 =  new Thread(new Worker("Rohan", "Cleaner"));
		Thread t4 =  new Thread(new Worker("Karan", "Chef"));
		Thread t5 =  new Thread(new Worker("Arjun", "Manager"));
		Thread t6 =  new Thread(new Worker("Rohit", "Chef"));
		Thread t7 =  new Thread(new Worker("Ramesh", "Cleaner"));
		Thread t8 =  new Thread(new Worker("Suresh", "Account Manager"));
		Thread t9 =  new Thread(new Worker("Rajesh", "Chef"));
		Thread t10 =  new Thread(new Worker("Rakesh", "Cleaner"));
		
		/*t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		*/
		
		ExecutorService executor = 	Executors.newFixedThreadPool(5);
		executor.submit(t1);
		executor.submit(t2);
		executor.submit(t3);
		executor.submit(t4);
		executor.submit(t5);
		executor.submit(t6);
		executor.submit(t7);
		executor.submit(t8);
		executor.submit(t9);
		executor.submit(t10);
	}

}
