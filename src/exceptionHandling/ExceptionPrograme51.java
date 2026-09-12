package exceptionHandling;

public class ExceptionPrograme51 {

	public static void main(String[] args) {
		int[] a = {12, 8, 12, 30, 18, 24, 40};
		int value = getFirstOdd(a);
		System.out.println("First odd number is: " +value);

	}
	public static int getFirstOdd(int[] a) {
		for(int x : a) {
			if(x%2!=0) {
				return x;
			}
		}
		return -1;

	}

}
