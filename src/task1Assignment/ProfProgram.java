package task1Assignment;

public class ProfProgram {

	public static void main(String[] args) {
		
		printTotalPrice(12000, 51);
		printTotalPrice(150000.26, 66.25);
		printTotalPrice(12000, 51);
		printTotalPrice(150000.26, 66.25);
		printTotalPrice(250, 5);
		printTotalPrice(499.99, 3);
		printTotalPrice(899.50, 12);
		printTotalPrice(75.25, 20);
		printTotalPrice(1250, 8);
		printTotalPrice(999.99, 15);
		printTotalPrice(150.75, 6);
		printTotalPrice(4500, 10);
		printTotalPrice(200.50, 25);
		printTotalPrice(345.99, 7);
		printTotalPrice(7999, 2);
		printTotalPrice(650.80, 18);
		printTotalPrice(120.25, 40);
		printTotalPrice(1850, 9);
		printTotalPrice(99933.95, 4);
		printTotalPrice(5600.60, 11);
		printTotalPrice(275305.45, 30);
		printTotalPrice(149809, 14);
		printTotalPrice(89456.99, 50);
		printTotalPrice(32000, 13);
		printTotalPrice(84005.75, 16);
		printTotalPrice(50000.50, 21);
		printTotalPrice(22000, 5);
		printTotalPrice(179.99, 35);
		printTotalPrice(1350.40, 17);
		printTotalPrice(2499.99, 6);
		printTotalPrice(99.50, 75);
		printTotalPrice(7800, 19);
		printTotalPrice(2450.50, 15);
		printTotalPrice(79900, 9);
		printTotalPrice(125.25, 60);
		printTotalPrice(3500, 4);
		printTotalPrice(99933.95, 22);
		printTotalPrice(67000.80, 35);
		printTotalPrice(21000, 3);
		printTotalPrice(175.50, 48);
		printTotalPrice(450.75, 27);
		printTotalPrice(1899, 11);
		printTotalPrice(5500.99, 7);
		printTotalPrice(395600.99, 150);
		printTotalPrice(720.40, 19);
		printTotalPrice(12999, 2);
		printTotalPrice(27500.60, 45);
		printTotalPrice(85000.85, 13);
		

	}
	
	public static void printTotalPrice(double price, double profit) {
		
		System.out.println("Price is: " +price);
		System.out.println("% Profit is: " +profit+"%");
		double TotalPrice = price*(100+profit)/100;
		System.out.println("Total price is: " +TotalPrice);
	}

}
