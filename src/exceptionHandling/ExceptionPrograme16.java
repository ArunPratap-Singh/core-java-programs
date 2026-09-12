package exceptionHandling;

public class ExceptionPrograme16 {

	public static void main(String[] args) {
		System.out.println("Programe starts");
		int a = 12;
		int b = 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		System.out.println(a/b);
		System.exit(0);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block starts");
			System.out.println("finally block ends");
		}
		System.out.println(a*b);
		System.out.println("Programe ends");

	}

}
