package task1Assignment;

public class AvgProgram {

	public static void main(String[] args) {
		
		printAverage(45, 65, 89);
		printAverage(101, 102, 103);
		printAverage(78, 89, 55);
		printAverage(564, 654, 895);
		printAverage(89745, 5645, 564);
		printAverage(45, 12, 360);
		printAverage(87, 98, 75);
		printAverage(10, 23, 33);
		printAverage(56, 98, 45);
		printAverage(321, 4589, 463);
		printAverage(65, 45, 89);
		printAverage(89, 11, 33);
		printAverage(12, 23, 28);
		printAverage(89, 56, 23);
		printAverage(25, 24, 22);
		printAverage(225, 267, 293);
		printAverage(22, 33, 55);
		printAverage(11, 66, 77);
		printAverage(88, 99, 77);
		printAverage(256, 899, 325);
		printAverage(26, 56, 86);
		printAverage(81, 239, 15);
		printAverage(12, 18, 24);
		printAverage(45, 55, 65);
		printAverage(100, 200, 300);
		printAverage(7, 14, 21);
		printAverage(91, 82, 73);
		printAverage(150, 175, 200);
		printAverage(33, 66, 99);
		printAverage(123, 234, 345);
		printAverage(9, 27, 81);
		printAverage(64, 128, 256);
		printAverage(18, 36, 54);
		printAverage(49, 56, 63);
		printAverage(250, 500, 750);
		printAverage(17, 19, 23);
		printAverage(400, 350, 300);
		printAverage(5, 10, 15);
		printAverage(87, 93, 99);
		printAverage(111, 222, 333);
		printAverage(72, 84, 96);
		printAverage(999, 888, 777);

	}
	
	public static void printAverage(int a, int b, int c) {
		
		double Average = ((a+b+c)/3);
		
		System.out.println("Average of " +a+ " and " +b+ " and " +c+ " is: " +Average);
	}

}
