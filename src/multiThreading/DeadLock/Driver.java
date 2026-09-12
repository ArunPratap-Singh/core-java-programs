package multiThreading.DeadLock;

public class Driver {
	
	public static void main(String[] args) {
		
		String resource1 = "Bat";
		String resource2 = "Ball";
		
		User u1 = new User("Mohan", resource1, resource2);
		User u2 = new User("Sohan", resource2, resource1);
		
		u1.start();
		u2.start();
	}

}
