package exceptionHandling;

import java.util.Scanner;

public class ExceptionPrograme9 {

	public static void main(String[] args) {
		System.out.println("Programe  Starts");
		Scanner sc = new Scanner(System.in);
		
		int[] a = {12, 0, 24, 36, 48, 60, 72, 94, 108};
		System.out.println("Enter firstIndex");
		int index1=sc.nextInt();
		System.out.println("Enter secondIndex");
		int index2=sc.nextInt();
		try {
			System.out.println(a[index1]);
			System.out.println(38/a[index2]);
			System.out.println("try block ends");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
			//code Arithmetic Exception related code
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionOccurred");
			//code Array Index Out Of Bounds related code
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Programe Ends");
	}

}
