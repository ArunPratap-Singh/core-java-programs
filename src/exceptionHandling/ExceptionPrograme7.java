package exceptionHandling;

import java.util.Scanner;

public class ExceptionPrograme7 {

	public static void main(String[] args) {
		System.out.println("Programe 7 Starts");
		Scanner sc = new Scanner(System.in);
		
		int[] a = {12, 0, 24, 36, 48, 60, 72, 94, 108};
		System.out.println("Enter firstIndex");
		int index1=sc.nextInt();
		System.out.println("Enter secondIndex");
		int index2=sc.nextInt();
		try {
			System.out.println(a[index1]/a[index2]);
			//Statement 1
			//Statement 2
			//Statement 3
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionOccurred");
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			
		}catch(Exception e) {
			System.out.println("ExceptionOccurred");
			
		}


	}

}
