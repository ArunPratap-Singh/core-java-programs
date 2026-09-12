package exceptionHandling;

public class ExceptionPrograme28 {

	public static void main(String[] args) {
		int value = test(12, 0);
		System.out.println("Returned value is: " +value);

	}
	
	public static int test(int a, int b) {
		try {
			System.out.println(a/b);
			return 12;
		}catch(Exception e) {
			System.out.println(10/0);
			return 20;
		}finally {
			System.out.println("finally block starts");
			System.out.println("finally block ends");
			return 50;
		}
	}

}
