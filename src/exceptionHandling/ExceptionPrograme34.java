package exceptionHandling;

public class ExceptionPrograme34 {

	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
