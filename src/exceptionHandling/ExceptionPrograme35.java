package exceptionHandling;

public class ExceptionPrograme35 {

	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		try {
			throw new ArithmeticException("/ by zero!!!!!!!!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


}
