package recursionPrograming.DynamicPrograming;

public class PrintNaturalArrayUsingRecursion {

	//WAJP To Print Array In Natural Order Using Recursion
	
	public static void main(String[] args) {
		
		int [] a = {13, 35, 45, 65, 26, 55, 85, 75, 95 , 45, 55, 86, 21, 1, 19, 2, 3, 33};
		System.out.println("Main Program Starts");
		System.out.println();
		printForward(a, 0);
		System.out.println();
		System.out.println("Main Program Ends");
		

	}
	
	public static void printForward(int [] a, int i) {
		
		//Base Condition
		if(i == a.length) {
			
			return;
		}
		
		System.out.println(a[i]+" ");
		printForward(a, i+1);
	}

}
