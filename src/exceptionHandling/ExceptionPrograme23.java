package exceptionHandling;

public class ExceptionPrograme23 {

	public static void main(String[] args) {
		int value = test(12, 0);
		System.out.println("return value is: " +value);

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
