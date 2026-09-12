 package upcastingdowncasting.Project1;

import java.util.Scanner;

public class RacingGame {
	
	public Vehicle selectVehicle() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1===> to choose Car");
		System.out.println("Press 2===> to choose Bus");
		System.out.println("Press 3===> to choose Bike");
		int choice = Integer.parseInt(sc.nextLine());
		if(choice==1) {
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
			return new Car("Ferrari 499P", 450000000, 4, "Ferrari", 2, 670, 4); 
		}else if(choice==2) {
			System.out.println("You Have Chosen Your Vehicle");
			System.out.println("We Are Getting Ready Your Vehicle According To Your Choice");
			Thread.sleep(1000);
			System.out.println("Select Name");
			String name = sc.nextLine();
			System.out.println("Select Price");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Select Number Of Wheels");
			int numberofwheels = Integer.parseInt(sc.nextLine());
			System.out.println("Select Route");
			String route = sc.nextLine();
			System.out.println("Select isAC");
			boolean isAC = sc.nextBoolean();
			System.out.println("Your Vehicle Is Ready");
			System.out.println("We Hope Selected Vehicle Will Help You To Win");
			System.out.println("Start Your Race");
			return new Bus("Mercedes Speed Cruiser", 1900000000, 6, "Banglore-Chennai", true);
		}else if(choice==3) {
			System.out.println("You Have Chosen Your Vehicle");
			System.out.println("We Are Getting Ready Your Vehicle According To Your Choice");
			Thread.sleep(1000);
			System.out.println("Select Name");
			String name = sc.nextLine();
			System.out.println("Select Price");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("Select Number Of Wheels");
			int numberofwheels = Integer.parseInt(sc.nextLine());
			System.out.println("Select Brandname");
			String brandname = sc.nextLine();
			System.out.println("String Speed");
			String speed = sc.nextLine();
			System.out.println("Select CC");
			int cc = Integer.parseInt(sc.nextLine());
			System.out.println("Your Vehicle Is Ready");
			System.out.println("We Hope Selected Vehicle Will Help You To Win");
			System.out.println("Start Your Race");
			return new Bike("Kawasaki Ninja H2R", 7900000, 2, "Kawasaki", "400Km/h", 998);
		}else
			System.out.println("Wrong Input Given! No Vehicle Exists");
			System.out.println("Please Select Correct Input To Choose Vehicle"); 
			return selectVehicle();
	}

}
