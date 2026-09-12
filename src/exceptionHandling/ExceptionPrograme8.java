package exceptionHandling;

import java.util.Scanner;

public class ExceptionPrograme8 {

	public static void main(String[] args) {
		System.out.println("Programe Starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		try {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		}catch(ArithmeticException e) {
			System.out.println("Message is: " +e.getMessage());
		}catch(Exception e) {	
			System.out.println("Wrong Input Entered");
		}
		System.out.println("Programe Ends");

	}

}
