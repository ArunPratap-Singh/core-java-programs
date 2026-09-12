package exceptionHandling;

public class ExceptionPrograme5 {
	public static void main(String[] args) {
		System.out.println("Programe Starts");
		int a = 12;
		int b = 0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		try {
		    System.out.println(a/b);
		}catch(ArithmeticException e){
		
			System.out.println("Message is: " +e.getMessage());
		}
		System.out.println(a*b);
		
		int c = 18;
		int d = 3;
		try {
		System.out.println(c/d);
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		}catch(Exception e) {
			System.out.println("Message is: " +e.getMessage());
		}
		
		System.out.println("Programe Ends");
	}

}
