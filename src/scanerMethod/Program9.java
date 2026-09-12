package scanerMethod;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		System.out.println("==========Main Method Starts===========");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("============You Entered============");
		
		System.out.println("Name is: " +name);
		
		sc.close();
		
		System.out.println("===========Main Method Ends============");

	}

}
