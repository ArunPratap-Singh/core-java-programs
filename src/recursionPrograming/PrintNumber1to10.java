package recursionPrograming;

public class PrintNumber1to10 {
	
	//WAJP To Print Number From 1 To 10 Without Using Loop
	
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
		
		System.out.println("Number is: " +n);
		printNum(n+1);
	}
	
	

}
