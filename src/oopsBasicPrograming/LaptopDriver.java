package oopsBasicPrograming;

public class LaptopDriver {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop();
		Laptop l4 = new Laptop();
		Laptop l5 = new Laptop(); 
		Laptop l6 = new Laptop();
		
		System.out.println("================Laptop Program Starts=======================");

		System.out.println("=======l1 details before initialization========");
		l1.printDetails();
		System.out.println("=======l2 details before initialization========");
		l2.printDetails();
		System.out.println("=======l3 details before initialization========");
		l3.printDetails();
		System.out.println("=======l4 details before initialization========");
		l4.printDetails();
		System.out.println("=======l5 details before initialization========");
		l5.printDetails();
		System.out.println("=======l6 details before initialization========");
		l6.printDetails();
		
		System.out.println("=======================================================");
			
			
		l1.name = "Dell";		l2.name = "Hp";		l3.name = "Acer";		l4.name = "Motorola";	l5.name = "MacBook";	l6.name = "Asus";
		l1.price = 45000;		l2.price = 60000;	l3.price = 55000;		l4.price = 65000;		l5.price = 165000; 		l6.price = 175000;
		l1.color = "Silver";	l2.color = "Grey";	l3.color = "Dark Grey";	l4.color = "Grey";		l5.color = "White";		l6.color = "Silver-Grey";
		

		System.out.println("=======l1 details after initialization========");
		l1.printDetails();
		System.out.println("=======l2 details after initialization========");
		l2.printDetails();
		System.out.println("=======l3 details after initialization========");
		l3.printDetails();
		System.out.println("=======l4 details after initialization========");
		l4.printDetails();
		System.out.println("=======l5 details after initialization========");
		l5.printDetails();
		System.out.println("=======l6 details after initialization========");
		l6.printDetails();
		
		System.out.println("================Laptop Programe Ends=================");


	}

}
