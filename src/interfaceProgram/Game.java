package interfaceProgram;

import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	public void start() {
		
		
		System.out.println("===============Shape Game Had Started================");
	
		System.out.println("=====================================================");
		System.out.println("                WELCOME TO SHAPE GAME                 ");
		System.out.println("======================================================");
		
		System.out.println("Please Select The Option To Start The Game.....!!!!!!!");
		
		System.out.println("Press 1 for TwoDShape");
		System.out.println("Press 2 for ThreeDShape");
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			System.out.println("You Have Selected TwoDShape......");
		 try {
			TwoDShape t = selectAndGetTwoDShape();
			
			System.out.println(t);
			
			String shapeName = t.getClass().getSimpleName();
			
			System.out.println("Area of " +shapeName+" is: " +t.area());
			System.out.println("Perimeter of " +shapeName+" is: " +t.perimeter());
			t.rotate();
			t.resize();
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 
		}else if(choice == 2) {
			System.out.println("You Have Selected ThreeDShape.... ");
		 try {
			ThreeDShape t = selectAndGetThreeDShape();
			
			System.out.println(t);
			
			String shapeName = t.getClass().getSimpleName();
			
			System.out.println("Volume of " +shapeName+" is: " +t.volume());
			System.out.println("TotalSurfaceArea of " +shapeName+" is: " +t.totalSurfaceArea());
			System.out.println("LateralSurfaceArea of " +shapeName+" is: " +t.lateralSurfaceArea());
			t.rotate();
			t.resize();
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		}else {
			System.out.println("Invalid choice, Please enter valid choice....");
			start();
		}
	}
	
	private TwoDShape selectAndGetTwoDShape() {
		
		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Rectangle");
		System.out.println("Press 3 for Square");
		
		int choice = Integer.parseInt(sc.nextLine());
		if(choice == 1) {
			
			System.out.println("==================================================");
			System.out.println("            YOU HAVE SELECTED CIRCLE              ");
			System.out.println("==================================================");
			
			System.out.println("Enter the Radius of Circle...");
			double r = Double.parseDouble(sc.nextLine());
			
			Circle circle = new Circle(r);
			return circle;
		}
		
		else if(choice == 2) {
			
			System.out.println("==========================================================");
			System.out.println("               YOU HAVE SELECTED RECTANGLE                ");
			System.out.println("==========================================================");
			
			System.out.println("Enter the Length of Rectangle...");
			double length = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the Breadth of Rectangle...");
			double breadth = Double.parseDouble(sc.nextLine());
			
			Rectangle rectangle = new Rectangle(length, breadth);
			return rectangle;
		}
		
		else if(choice == 3) {
			
			System.out.println("==========================================================");
			System.out.println("                YOU HAVE SELECTED SQUARE                  ");
			System.out.println("==========================================================");
			
			System.out.println("Enter the Side of Square...");
			double side = Double.parseDouble(sc.nextLine());
			
			return new Square(side);
		}
		
		else {
			
			System.out.println("Invalid choice, Please enter valid choice");
			return selectAndGetTwoDShape();
		}
	}
	
	private ThreeDShape selectAndGetThreeDShape() {
		
		System.out.println("Press 1 for Cube");
		System.out.println("Press 2 for Cuboid");
		System.out.println("Press 3 for Cylinder");
		
		int choice = Integer.parseInt(sc.nextLine());
		
		if(choice == 1) {
			
			System.out.println("=========================================================");
			System.out.println("                  YOU HAVE SELECTED CUBE                 ");
			System.out.println("=========================================================");
			
			System.out.println("Enter the Side of Cube...");
			double side = Double.parseDouble(sc.nextLine());
			
			Cube cube = new Cube(side);
			return cube;
		}
		
		else if(choice == 2) {
			
			System.out.println("=========================================================");
			System.out.println("                  YOU HAVE SELECTED CUBOID               ");
			System.out.println("=========================================================");
			
			System.out.println("Enter the Length of Cuboid...");
			double length = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the Breadth of Cuboid...");
			double breadth = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the Height of Cube...");
			double height = Double.parseDouble(sc.nextLine());
			
			Cuboid cuboid = new Cuboid(length, breadth, height);
			return cuboid;
		}
		
		else if(choice == 3) {
			
			System.out.println("========================================================");
			System.out.println("                 YOU HAVE SELECTED CYLINDER             ");
			System.out.println("========================================================");
			
			System.out.println("Enter the Radius of Cylinder...");
			double radius = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the Height of Cylinder...");
			double height = Double.parseDouble(sc.nextLine());
			
			Cylinder cylinder = new Cylinder(radius, height);
			return cylinder;
		}
		
		else {
			System.out.println("Invalid choice, Please enter valid choice");
			return selectAndGetThreeDShape();
		}
	}
	
	public boolean doYouWantToContinue() {
		
		System.out.println("Press Yes to Continue or No to Exit");
		String choice = sc.nextLine();
		
		return choice.equalsIgnoreCase("yes");
	}

}
