package pojo;


public class PenDriver {

	public static void main(String[] args) {
		
		Pen p1 = new Pen("Reynolds", "Blue", 20, "Gel");
		Pen p2 = new Pen("Parker", "Black", 180, "Gel");
		Pen p3 = new Pen("Cello", "Green", 20, "Ball");
		Pen p4 = new Pen("Cello Brite", "Yellow", 50, "Gel");
		Pen p5 = new Pen("Cello Gripper", "Red", 10, "BallPoint");
		Pen p6 = new Pen("Pilot", "Orange", 59, "InkPen");
		
		System.out.println("=======================================");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);

	}

}
