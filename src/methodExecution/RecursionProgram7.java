package methodExecution;

public class RecursionProgram7 {
// Recursion Program printing reverse value without running loop 
	public static void main(String[] args) {
		
		System.out.println("Main Method Starts!");
		printNum(1);
		System.out.println("Main Method Ends");

	}
	
	public static void printNum(int n) {
		if(n>10000) {
			return;
		}
		printNum(n+1);
		System.out.println(n);
		
	}

}
