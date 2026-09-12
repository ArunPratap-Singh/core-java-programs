package multiThreading.RaceCondition.threadLocalProgram;



public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		User u1 = new User("Mohan", 1000, c);
		User u2 = new User("Sohan", 2000, c);
		User u3 = new User("Rohan", 3000, c);
		User u4 = new User("John", 4000, c);
		User u5 = new User("Arun", 5000, c);
		
		u1.start();
		u2.start();
		u3.start();
		u4.start();
		u5.start();
		
		u1.join();
		u2.join();
		u3.join();
		u4.join();
		u5.join();
		System.out.println("Final count is: " +c.getCount());

	}

}
