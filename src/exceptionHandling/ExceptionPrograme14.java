package exceptionHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class ExceptionPrograme14 {

	public static void main(String[] args) {
		System.out.println("Programe Starts");
		
		try(Scanner sc = new Scanner(System.in);
			FileWriter fw = new FileWriter("")){	
		
		System.out.println("Enter First Number");
		int b = sc.nextInt();
		System.out.println("Enter Second Number");
		int c = sc.nextInt();
			System.out.println(b/c);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Occurred");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Message is: " +e.getMessage());		
		}finally {
			System.out.println("finally starts");
			System.out.println("finally ends");
		}
		
		System.out.println("Programe Ends");

	}

}
