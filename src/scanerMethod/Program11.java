package scanerMethod;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		System.out.println("============Main Method Starts=============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Boolean Value: ");
		boolean b = sc.nextBoolean();
		
		System.out.println("============You Entered=============");
		System.out.println("Boolean Value is: " +b);
		
		sc.close();
		
		System.out.println("============Main Method Ends=============");

	}

}
