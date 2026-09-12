package methodExecution;

public class Car {

	static int a = 89;
	int b = 50;
	
	public static void start() {
		int a = 44;
		System.out.println("Start Car a is : " +a);
		
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		Car.start();
		

	}
	public void drive() {
		System.out.println("Drive Car");
	}

}
