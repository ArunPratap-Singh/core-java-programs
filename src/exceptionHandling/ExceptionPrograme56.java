package exceptionHandling;

public class ExceptionPrograme56 {

	public static void main(String[] args) {
		int[] a = {11, 7, 13, 7, 23, 41};
		try {
		int value = getFirstEven(a);
		System.out.println("Square root of First Even Number is: " +value*value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("===========Programe Ends============"); 

	}
	public static int getFirstEven(int[] a) {
		for(int x:a) {
			if(x%2==0) {
				return x;
			}
		}
		throw new RuntimeException("No First Even Element Found");
	}

}
