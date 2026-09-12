 package projects.ProjectVehicle;

import java.util.Scanner;

public class RacingGame {
	
	public Vehicle selectAndGetVehicle() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1===> to choose Car");
		System.out.println("Press 2===> to choose Bus");
		System.out.println("Press 3===> to choose Bike");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		
		case 1:
			System.out.println("You Have Chosen Your Vehicle");
			System.out.println("We Are Getting Ready Your Vehicle According To You Choice");
			Thread.sleep(1000);
			System.out.println("Select Name");
			String name = sc.nextLine();
			System.out.println("Select Price");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Select Number Of Wheels");
			int numberofwheels = Integer.parseInt(sc.nextLine());
			System.out.println("Select Brandname");
			String brandname = sc.nextLine();
			System.out.println("Number Of Doors");
			int numberofdoors = Integer.parseInt(sc.nextLine());
			System.out.println("Select Horse Power");
			int horsepower = Integer.parseInt(sc.nextLine());
			System.out.println("Select Strokes");
			int strokes = Integer.parseInt(sc.nextLine());
			System.out.println("Your Vehicle Is Ready");
			System.out.println("We Hope Selected Vehicle Will Help You To Win");
			System.out.println("Start Your Race");
			return new Car(name, price, numberofwheels, brandname, numberofdoors, horsepower, strokes);
			
		case 2:
			System.out.println("You Have Chosen Your Vehicle");
			System.out.println("We Are Getting Ready Your Vehicle According To Your Choice");
			Thread.sleep(1000);
			System.out.println("Select Name");
			String name1 = sc.nextLine();
			System.out.println("Select Price");
			int price1 = Integer.parseInt(sc.nextLine());
			System.out.println("Select Number Of Wheels");
			int numberofwheels1 = Integer.parseInt(sc.nextLine());
			System.out.println("Select Route");
			String route = sc.nextLine();
			System.out.println("Select isAC");
			boolean isAC = sc.nextBoolean();
			System.out.println("Your Vehicle Is Ready");
			System.out.println("We Hope Selected Vehicle Will Help You To Win");
			System.out.println("Start Your Race");
			return new Bus(name1, price1, numberofwheels1, route, isAC);
		
		case 3:
			System.out.println("You Have Chosen Your Vehicle");
			System.out.println("We Are Getting Ready Your Vehicle According To Your Choice");
			Thread.sleep(1000);
			System.out.println("Select Name");
			String name2 = sc.nextLine();
			System.out.println("Select Price");
			int price2 = Integer.parseInt(sc.nextLine());
			System.out.println("Select Number Of Wheels");
			int numberofwheels2 = Integer.parseInt(sc.nextLine());
			System.out.println("Select Brandname");
			String brandname2 = sc.nextLine();
			System.out.println("String Speed");
			String speed = sc.nextLine();
			System.out.println("Select CC");
			int cc = Integer.parseInt(sc.nextLine());
			System.out.println("Your Vehicle Is Ready");
			System.out.println("We Hope Selected Vehicle Will Help You To Win");
			System.out.println("Start Your Race");
			return new Bike(name2, price2, numberofwheels2, brandname2, speed, cc);
		
		default:
			System.out.println("Wrong Input Given! No Vehicle Exists");
			System.out.println("Please Select Correct Input To Choose Vehicle"); 
			return selectAndGetVehicle();
		}	
	}

}
