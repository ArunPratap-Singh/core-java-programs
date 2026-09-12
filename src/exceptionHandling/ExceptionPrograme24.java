package exceptionHandling;

public class ExceptionPrograme24 {

	public static void main(String[] args) {
		int value = test(12, 6);
			System.out.println("returned value is: " +value);

	}
	
	public static int test(int a, int b) {
		try {
			System.out.println(a/b);
			return 12;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return 20;
		}finally {
			System.out.println("finally block starts");
			System.out.println("finally block ends");
		}
	}

}
