package exceptionHandling;

public class ExceptionPrograme49 {

	public static void main(String[] args) {
		int[] a = {11, 7, 11, 31, 19, 23, 41};
		int value = getFirstEven(a);
		System.out.println("First even number is: " +value);

	}
	public static int getFirstEven(int[] a) {
		for(int x : a) {
			if(x%2==0) {
				return x;
			}
		}
		return -1;

	}

}
