package exceptionHandling;

public class ExceptionPrograme22 {

	public static void main(String[] args) {
		int value = test(12, 6);
		System.out.println("Current return value is: " +value);

	}
	
	public static int test(int a, int b) {
		try {
		System.out.println(a/b);
		return 12;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return 20;
		}
	}

}
