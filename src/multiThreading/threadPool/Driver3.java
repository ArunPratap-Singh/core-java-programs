

package multiThreading.threadPool;

public class Driver3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Method Starts");
		
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
		
		//Here we are creating virtual threads using Thread.startVirtualThread() method;
		
		/*Thread vth1 = Thread.startVirtualThread(t1);
		Thread vth2 = Thread.startVirtualThread(t2);
		Thread vth3 = Thread.startVirtualThread(t3);
		Thread vth4 = Thread.startVirtualThread(t4);
		Thread vth5 = Thread.startVirtualThread(t5);
		Thread vth6 = Thread.startVirtualThread(t6);
		Thread vth7 = Thread.startVirtualThread(t7);
		Thread vth8 = Thread.startVirtualThread(t8);
		Thread vth9 = Thread.startVirtualThread(t9);
		Thread vth10 = Thread.startVirtualThread(t10);
		*/
		
		//Here we are creating virtual threads using Thread.ofVirtual()method;
		
		Thread vth1 = Thread.ofVirtual().name("Thread-bcd").unstarted(t1);
		Thread vth2 = Thread.ofVirtual().name("Thread-abc").start(t2);
		Thread vth3 = Thread.ofVirtual().name("Thread-def").start(t3);
		Thread vth4 = Thread.ofVirtual().name("Thread-ghi").start(t4);
		Thread vth5 = Thread.ofVirtual().name("Thread-jkl").start(t5);
		Thread vth6 = Thread.ofVirtual().name("Thread-mno").start(t6);
		Thread vth7 = Thread.ofVirtual().name("Thread-pqr").start(t7);
		Thread vth8 = Thread.ofVirtual().name("Thread-stu").start(t8);
		Thread vth9 = Thread.ofVirtual().name("Thread-vwx").start(t9);
		Thread vth10 = Thread.ofVirtual().name("Thread-yza").start(t10);
		
		vth1.start();
		
		vth1.join();
		vth2.join();
		vth3.join();
		vth4.join();
		vth5.join();
		vth6.join();
		vth7.join();
		vth8.join();
		vth9.join();
		vth10.join();
		
		System.out.println("Main Method Ends");


	}

}
