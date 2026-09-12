package scanerMethod;

import java.util.Scanner;

public class Program3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter the Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("==================You Entered=====================");
		
		System.out.println("Age is: " +age);
		System.out.println("Name is: " +name);
		
		sc.close();
		
	}

}
