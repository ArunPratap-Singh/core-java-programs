package recursionPrograming.DynamicPrograming;

public class PrintReverseArrayUsingRecursion {
	
	//WAJP To Print Array In Reverse Order Using Recursion
	
	public static void main(String[] args) {
		
		int [] a = {13, 35, 45, 65, 26, 55, 85, 75, 95 , 45, 55, 86, 21, 1, 19, 2, 3, 33};
		
		System.out.println("Main Program Stars");
		System.out.println();
		printReverse(a, 0);
		System.out.println();
		System.out.println("Main Program Ends");
		
	}
	
	public static void printReverse(int [] a, int i) {
		
		//Base Condition
		if(i == a.length) {
			return;
		}
		
		printReverse(a, i+1);
		System.out.println(a[i] + " ");
	}
	
	
	
}
