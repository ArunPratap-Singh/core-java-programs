package objCount.WithSetterMethod;

import java.util.Scanner;

public class Employ1Service {
	
	public static Employ1 createEmployProfile() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		
		System.out.println("Enter the age ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the salary ");
		double salary = Double.parseDouble(sc.nextLine());
		
		Employ1 e = new Employ1();
		e.setDetails(name, age, salary);
		return e;
	}

}
