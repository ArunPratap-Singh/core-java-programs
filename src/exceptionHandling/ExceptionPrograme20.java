package exceptionHandling;

public class ExceptionPrograme20 {

	public static void main(String[] args) {
		System.out.println("Programe starts");
		int a = 12;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block starts");
			try {
			System.out.println(10/0);
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());
			}
			System.out.println("finally block ends");
		}
		System.out.println(a*b);
		System.out.println("Programe ends");

	}

}
