package scanerMethod;

import java.util.Scanner;

public class Program10 {
	
	public static void main(String[] args) {
		
		System.out.println("==========Main Method Starts===========");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.next();
		
		System.out.println("============You Entered============");
		
		System.out.println("Name is: " +name);
		
		sc.close();
		
		System.out.println("===========Main Method Ends============");

	}

}
