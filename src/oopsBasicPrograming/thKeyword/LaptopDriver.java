package oopsBasicPrograming.thKeyword;

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
			
			
		l1.setDetails("Dell", 45000, "Grey");
		l2.setDetails("Hp", 55000, "Dark-Grey");
		l3.setDetails("Asus", 65000, "White");
		l4.setDetails("Mac", 650000, "Black");
		l5.setDetails("Lenovo", 75000, "Silver-Grey");
		l6.setDetails("Motorola", 35000, "Blue");
		

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
