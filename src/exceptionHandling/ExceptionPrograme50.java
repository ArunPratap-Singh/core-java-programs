package exceptionHandling;

public class ExceptionPrograme50 {

	public static void main(String[] args) {
		int[] a = {11, 7, 12, 30, 19, 23, 40};
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
