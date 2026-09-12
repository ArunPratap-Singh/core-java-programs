package exceptionHandling;

public class ExceptionPrograme15 {

	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.exit(0);
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occured");
		}finally {
			System.out.println("finally block starts");
			System.out.println("finally block ends");
		}
		System.out.println(a*b);

	}

}
