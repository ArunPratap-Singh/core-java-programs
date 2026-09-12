package task1Assignment;

public class DiscProgram {

	public static void main(String[] args) {
		
		printDiscountedPrice(456, 56);
		printDiscountedPrice(555.12, 33.3);
		printDiscountedPrice(1200, 10);
		printDiscountedPrice(999.99, 15);
		printDiscountedPrice(2500, 25);
		printDiscountedPrice(1499.50, 18);
		printDiscountedPrice(799, 5);
		printDiscountedPrice(349.75, 12.5);
		printDiscountedPrice(1800, 30);
		printDiscountedPrice(4500.25, 22);
		printDiscountedPrice(99.99, 50);
		printDiscountedPrice(150, 8);
		printDiscountedPrice(650.45, 16);
		printDiscountedPrice(7250, 35);
		printDiscountedPrice(3400, 40);
		printDiscountedPrice(275.60, 7.5);
		printDiscountedPrice(890, 11);
		printDiscountedPrice(1250.80, 27);
		printDiscountedPrice(5600, 45);
		printDiscountedPrice(320.30, 9);
		printDiscountedPrice(4100, 13);
		printDiscountedPrice(875.90, 19.5);
		printDiscountedPrice(15000, 55);
		printDiscountedPrice(65.75, 2.5);
		printDiscountedPrice(9990, 60);
		printDiscountedPrice(2800.49, 14);
		printDiscountedPrice(145.99, 6);
		printDiscountedPrice(725.25, 17.5);
		printDiscountedPrice(4800, 28);
		printDiscountedPrice(999.45, 21);
		printDiscountedPrice(120, 10);
		printDiscountedPrice(250, 15);
		printDiscountedPrice(499.99, 20);
		printDiscountedPrice(999, 25);
		printDiscountedPrice(1500, 30);
		printDiscountedPrice(75.50, 12.5);
		printDiscountedPrice(340, 18);
		printDiscountedPrice(899.99, 40);
		printDiscountedPrice(125.75, 5);
		printDiscountedPrice(650, 50);
		printDiscountedPrice(2000, 35);
		printDiscountedPrice(89.99, 8.5);
		printDiscountedPrice(455.50, 22);
		printDiscountedPrice(789, 17);
		printDiscountedPrice(1350.99, 27.5);
		printDiscountedPrice(300, 7);
		printDiscountedPrice(560.60, 13.5);
		printDiscountedPrice(999.99, 45);
		printDiscountedPrice(150, 9);
		printDiscountedPrice(425.25, 16);
		printDiscountedPrice(1750, 28);
		printDiscountedPrice(210.80, 11);
		printDiscountedPrice(680, 32);
		printDiscountedPrice(59.99, 3.5);
		printDiscountedPrice(1200.45, 26);
		printDiscountedPrice(845, 19);
		printDiscountedPrice(275.99, 14.5);
		printDiscountedPrice(1800, 55);
		printDiscountedPrice(99.95, 6);
		printDiscountedPrice(2499.99, 60);
		

	}
	
	public static void printDiscountedPrice(double price, double discount) {
		
		System.out.println("Total Price is: " +price);
		System.out.println("%Discount is: " +discount+"%");
		double Discountedprice = price*(100-discount)/100;
		System.out.println("Discounted Price is: " +Discountedprice);
	}

}
