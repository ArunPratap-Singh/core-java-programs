package exceptionHandling;

import java.util.Scanner;

public class ExceptionPrograme12 {

	public static void main(String[] args) {
		System.out.println("Programe Ends");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int b = sc.nextInt();
		System.out.println("Enter Second Number");
		int c = sc.nextInt();
		
		try {
			System.out.println(b/c);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Occurred");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Message is: " +e.getMessage());		
		}finally {
			System.out.println("finally starts");
			sc.close();
			System.out.println("finally ends");
		}
		
		System.out.println("Programe Ends");


	}

}
