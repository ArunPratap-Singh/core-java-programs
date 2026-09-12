package objCount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employ1Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employ1> l = new ArrayList<>();
		
		char choice;
		do {
			
			Employ1 e = EmployService.createEmployProfile();
			l.add(e);
			System.out.println("Press Y/y to create next profile: ");
			choice = sc.nextLine().charAt(0);
		}while(choice=='y' || choice=='Y');

		for(Employ1 e:l) {
			System.out.println("Name is: " +e.name+"\tAge is: " +e.age+"\tSalary is: " +e.salary);
		}
		
		
		
		
		
		System.out.println("Total Employ Object Created is: " +Employ.count);
		
		sc.close();
	}

}
