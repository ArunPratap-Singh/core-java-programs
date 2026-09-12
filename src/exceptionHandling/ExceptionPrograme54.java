package exceptionHandling;

public class ExceptionPrograme54 {

	public static void main(String[] args) {
		int[] a = {12, 7, 11, 7, 23, 21};
		int value = getFirstEven(a);
		System.out.println("Square root of first even element is: " +value*value);

	}
	public static int getFirstEven(int[] a) {
		for(int x:a) {
			if(x%2==0) {
				return x;
			}
		}
		throw new NoFirstEvenElementFoundException("First Even Element Is Not Avalaible");
	}

	

}
