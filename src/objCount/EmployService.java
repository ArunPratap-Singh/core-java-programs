package objCount;

import java.util.Scanner;

public class EmployService {
	
	public static Employ1 createEmployProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Age: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		Employ1 e = new Employ1(name, age, salary);
		return e;
		
		
	}
	

}
