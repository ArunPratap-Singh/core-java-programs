package exceptionHandling;

import java.util.Scanner;

public class ExceptionPrograme10 {

	public static void main(String[] args) {
		System.out.println("Programe Ends");
		Scanner sc = new Scanner(System.in);
		int[] a = {12, 0, 26, 24, 36, 51, 89, 78, 101, 86};
		
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
		}
		
		sc.close();
		System.out.println("Programe Ends");

	}

}
