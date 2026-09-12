package methodExecution;

public class Program1 {
	
	public static void test() {
		System.out.println("Test Method starts!");
		System.out.println("Test Method Ends!");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Starts!");
		demo();
		System.out.println("Main Method Ends!");
		
	}
	
	public static void demo() { 
		System.out.println("Demo Method Starts!");
		test();
		System.out.println("Demo Method Ends!");
	}

}
