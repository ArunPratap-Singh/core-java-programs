package polymorphism.METHODOVERRIDINGPROJECT;

import java.util.Scanner;

public class Game {
	
	public Vehicle selectAndGetVehicle() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1===> To Choose Car");
		System.out.println("Press 2===> To Choose Bike");
		System.out.println("Press 3===> To Choose Bus");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("You Have Selected Car");
			return new Car();
		}else if(choice==2) {
			System.out.println("You Have Selected Bike");
			return new Bike();
		}else if(choice==3) {
			System.out.println("You Have Selected Bus");
			return new Bus();
		}else {
			System.out.println("Invali Choice");
			return selectAndGetVehicle();
		
		}
	}

}
