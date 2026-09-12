package exceptionHandling;

public class ExceptionPrograme17 {

	public static void main(String[] args) {
		System.out.println("Programe starts");
		int a = 12;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		System.out.println(a/b);
			for(int i = 1;i>0;i++) {
				System.out.println("i is: " +i);
			}
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
