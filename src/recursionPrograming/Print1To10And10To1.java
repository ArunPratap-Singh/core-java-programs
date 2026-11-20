package recursionPrograming;

public class Print1To10And10To1 {

	// WAP To Print Number From 1 To 10 And 10 To 1
	
	public static void main(String[] args) {
		
		System.out.println("Main Program Starts");
		System.out.println();
		printNumberAndReverse(1);
		System.out.println();
		System.out.println("Main Program Ends");
		
	}
	
	public static void printNumberAndReverse(int n) {
		
		//Base Condition
		if(n > 10) {
			
			System.out.println("===================");
			return;
		}
		
		System.out.println("Number is: " +n);
		printNumberAndReverse(n+1);
		System.out.println("Number is: " +n);
	}
}
