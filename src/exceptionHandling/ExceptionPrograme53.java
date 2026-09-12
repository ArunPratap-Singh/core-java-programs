package exceptionHandling;

public class ExceptionPrograme53 {

	public static void main(String[] args) {
		int[] a = {11, 7, 11, 7, 23, 21};
		int value = getFirstEven(a);
		System.out.println("Square root of first even element is: " +value*value);

	}
	public static int getFirstEven(int[] a) {
		for(int x:a) {
			if(x%2==0) {
				return x;
			}
		}
		return -1;
	}

	

}
