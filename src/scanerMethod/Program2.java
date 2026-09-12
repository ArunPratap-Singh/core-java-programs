package scanerMethod;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Weight: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter the Address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter the Gender: ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("Enter the City: ");
		String city = sc.nextLine();
		
		
		System.out.println("======================You Entered=======================");
		
		System.out.println("Age is: " +age);
		System.out.println("Name is: " +name);
		System.out.println("Weight is: " +weight);
		System.out.println("Address is: " +address);
		System.out.println("Gender is: " +gender);
		System.out.println("City is: " +city);
		
		sc.close();

	}

}
