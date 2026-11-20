package recursionPrograming;

public class PrtintNumber10to1 {

	//WAJP To Print Number From 10 To 1 Without Using Loop
	
	public static void main(String[] args) {
		
		System.out.println("Main Program Starts");
		System.out.println();
		printNum(1);
		System.out.println();
		System.out.println("Main Program Ends");

	}
	
	public static void printNum(int n) {
		
		//Base Condition
		if(n > 10) {
			
			return;
		}
		
		printNum(n+1);
		System.out.println("Number is: " +n);
	}

}
