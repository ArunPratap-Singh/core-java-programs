package multiThreading.DeadLock;

public class User extends Thread{
	
	String name;
	String resource1;
	String resource2;
	
	User(){
		
	}
	
	User(String name, String resource1, String resource2){
		
		this.name = name;
		this.resource1 = resource1;
		this.resource2 = resource2;
		
	}
	
	public void run() {
		
		System.out.println(name+" is trying to lock "+resource1);
		synchronized(resource1) {
			System.out.println(name+" has locked "+resource1);
			System.out.println(name+" is trying to lock "+resource2);
			synchronized(resource2) {
				System.out.println(name+" has locked " +resource2);
				//There will be code to perform different operations
			}
		}
		System.out.println(name+" has released " +resource1+" and "+resource2);
	}

}
