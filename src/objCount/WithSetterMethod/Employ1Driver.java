package objCount.WithSetterMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employ1Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employ1> l = new ArrayList<>();
		
		char choice;
		do {
		Employ1 e = Employ1Service.createEmployProfile();
		l.add(e);
		System.out.println("Press y/Y to continue the program");
		choice = sc.nextLine().charAt(0);
		}while(choice=='Y'  || choice=='y');
		
		for(Employ1 e: l) {
			System.out.println(e.getDetails());
		}
		
		
		System.out.println("Total Employ Object Created is: " +Employ1.count);
		
		sc.close();
	}

}
