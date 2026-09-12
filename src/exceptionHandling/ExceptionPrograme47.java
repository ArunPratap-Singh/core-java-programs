package exceptionHandling;

public class ExceptionPrograme47 {

	public static void main(String[] args) {
		int[] a = {11, 7, 12, 30, 19, 23, 40};
		int value  = getFirstEven(a);
		System.out.println("First even number is: " +value);

	}
	public static int getFirstEven(int[] a) {
		for(int x:a) {
			if(x%2==0) {
				return x;
			}
		}
	
	}

}
