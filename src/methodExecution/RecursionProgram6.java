package methodExecution;
//Solution of recursion program with base condition print value 1 to 10000 without loop
public class RecursionProgram6 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Starts!");
		printNum(1);
		System.out.println("Main Method Ends!");
	}
	
	public static void printNum(int n) {
		//Base Condition
		if(n>10000) {
			return;
		}
		 System.out.println(n);
		 printNum(n+1);
	}

}
