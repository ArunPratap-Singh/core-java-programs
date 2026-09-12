package scanerMethod;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		System.out.println("=============Main Method Starts==============");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char c = sc.next().charAt(1);
		
		System.out.println("===========You Entered============");
		
		System.out.println("Character is: " +c);
		
		sc.close();
		
		System.out.println("=============Main Method Ends================");


	}

}
