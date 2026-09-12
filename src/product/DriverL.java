package product;

public class DriverL {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop("Dell", 50000, 1, 123, "Blue", "4GB");
		Laptop l3 = new Laptop("Asus", 60000, 1, 321, "Grey", "6GB");
		Laptop l4 = new Laptop("Motorola", 70000, 1, 231, "Silver", "8GB");
		Laptop l5 = new Laptop("Samsung", 80000, 1, 789, "Silver Grey", "10GB");
		Laptop l6 = new Laptop("Lenova", 90000, 1, 123, "Blue", "4GB");
		Laptop l7 = new Laptop("Mac Book", 100000, 1, 123, "White", "8GB");
		Laptop l8 = new Laptop("Mac Book 15", 550000, 1, 123, "Grey", "9GB");
		Laptop l9 = new Laptop("Mac book 16", 560000, 1, 123, "Red", "5GB");
		Laptop l10 = new Laptop("Mac book 17", 570000, 1, 123, "Sparkling Grey", "128GB");
		
		System.out.println("==============================================");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		System.out.println(l5);
		System.out.println(l6);
		System.out.println(l7);
		System.out.println(l8);
		System.out.println(l9);
		System.out.println(l10);
		
		
		

	}

}
