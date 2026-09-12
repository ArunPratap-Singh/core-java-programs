package methodExecution;

public class Program4 {
	//Recursion Program Calling Main method in other method
	public static void test() {
		System.out.println("Test Method Starts!");
		System.out.println("Test Method Ends!");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		demo();
		System.out.println("Main Method Ends!");
	}
	
	public static void demo() {
		System.out.println("Demo Method starts!");
		main(null);
		System.out.println("Demo Method Ends!0");
	}

}
