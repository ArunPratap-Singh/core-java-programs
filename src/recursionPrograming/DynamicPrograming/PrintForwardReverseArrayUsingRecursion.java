package recursionPrograming.DynamicPrograming;

public class PrintForwardReverseArrayUsingRecursion {
	
	//WAJP To Print Array In Reverse Order And Backward Order Using Recursion
	
	public static void main(String[] args) {
		
		int [] a = {13, 35, 45, 65, 26, 55, 85, 75, 95 , 45, 55, 86, 21, 1, 19, 2, 3, 33};
		
		System.out.println("Main Program Starts");
		System.out.println();
		
		System.out.println("Array In Forward Order");
		printForwardArray(a, 0);
		
		System.out.println();
		
		System.out.println("Array In Reverse Order");
		printReverseArray(a, 0);
		
		System.out.println();
		System.out.println("Main Program Ends");
	}
	
	public static void printForwardArray(int [] a, int i) {
		
		if(i == a.length) {
			
			return;
		}
		
		System.out.println(a[i] + " ");
		printForwardArray(a, i+1);
	
	}
	
	public static void printReverseArray(int [] a, int i) {
		
		if(i == a.length) {
			
			return;
		}
		
		printReverseArray(a, i+1);
		System.out.println(a[i] + " ");
		
	}

}
