package scanerMethod;

import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(age);
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter the weight: ");
		double weight = Double.parseDouble(sc.nextLine());
		System.out.println(weight);
		
		System.out.println("Enter the Address: ");
		String address = sc.nextLine();
		System.out.println(address);
		
		System.out.println("Enter the gender: ");
		char gender = sc.nextLine().charAt(0);
		System.out.println(gender);
		
		System.out.println("Enter the city: ");
		String city = sc.nextLine();
		System.out.println(city);
		
		System.out.println("Are you Graduate?: ");
		boolean isgraduate = Boolean.parseBoolean(sc.nextLine());
		System.out.println(isgraduate);
		
		System.out.println("Enter the Email: ");
		String email = sc.nextLine();
		System.out.println(email);
		
		System.out.println("=====================You Entered========================");
		
		System.out.println("Age is: " +age);
		System.out.println("Name is: " +name);
		System.out.println("Weight is: " +weight);
		System.out.println("Address is: " +address);
		System.out.println("Gender is: " +gender);
		System.out.println("City is: " +city);
		System.out.println("Graduate is: " +isgraduate);
		System.out.println("Email is: " +email);
		
		sc.close();
		
	}

}
