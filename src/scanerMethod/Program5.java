package scanerMethod;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("========================You Entered===========================");
		
		System.out.println("Age is: " +age);
		System.out.println("Name is: " +name);
		
		sc.close();

	}

}
