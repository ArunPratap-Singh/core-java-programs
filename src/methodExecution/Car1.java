package methodExecution;

public class Car1 {
	
	static int x = 20;
	int y = 56;
	
	public static void start() {
		System.out.println("Car x is: " +x);
		Car1 c = new Car1();
		System.out.println(" Car Y is: " +c.y);
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		Car1.start();
		Car1 c = new Car1(); 
		c.drive();
		System.out.println(c.x);
		System.out.println(c.y);
		c.start();
		
		
	}
	
	public void drive() {
		System.out.println("Drive car x is: " +x+"Y is: " +y);
	}
	

}
