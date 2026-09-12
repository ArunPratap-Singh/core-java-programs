package oopsBasicPrograming.SetterMethod;

public class ShirtDriver {

	public static void main(String[] args) {
		
		Shirt s1 = new Shirt();
		Shirt s2 = new Shirt();
		Shirt s3 = new Shirt();
		Shirt s4 = new Shirt();
		Shirt s5 = new Shirt();
		Shirt s6 = new Shirt();
		Shirt s7 = new Shirt();
		Shirt s8 = new Shirt();
		Shirt s9 = new Shirt();
		
		System.out.println("===============Shirt Program Starts===============");
		
		System.out.println("==================s1 Details Before Initialization================");
		s1.printDetails();
		System.out.println("==================s2 Details Before Initialization================");
		s2.printDetails();
		System.out.println("==================s3 Details Before Initialization================");
		s3.printDetails();
		System.out.println("==================s4 Details Before Initialization================");
		s4.printDetails();
		System.out.println("==================s5 Details Before Initialization================");
		s5.printDetails();
		System.out.println("==================s6 Details Before Initialization================");
		s6.printDetails();
		System.out.println("==================s7 Details Before Initialization================");
		s7.printDetails();
		System.out.println("==================s8 Details Before Initialization================");
		s8.printDetails();
		System.out.println("==================s9 Details Before Initialization================");
		s9.printDetails();
		
		s1.setDetails("Livesmart", 750, "Peach", "42CM",4);
		s2.setDetails("Levis", 1100, "White", "46CM",5);
		s3.setDetails("US Polo", 999, "Yellow", "42CM",6);
		s4.setDetails("Adidas", 2000, "White", "42CM",2);
		s5.setDetails("Zara", 2500, "White Blue", "46CM",8);
		s6.setDetails("Louis Philippe", 3500, "Navy Blue", "40CM",9);
		s7.setDetails("Van Huesen", 1999, "Red", "40CM",6);
		s8.setDetails("Arrow", 1000, "Red White check", "42CM",10);
		s9.setDetails("Mufti", 2500, "Fluorescent Orange", "42CM",3);
		
		System.out.println("=================s1 Details After Initialization=====================");
		s1.printDetails();
		System.out.println("=================s2 Details After Initialization=====================");
		s2.printDetails();
		System.out.println("=================s3 Details After Initialization=====================");
		s3.printDetails();
		System.out.println("=================s4 Details After Initialization=====================");
		s4.printDetails();
		System.out.println("=================s5 Details After Initialization=====================");
		s5.printDetails();
		System.out.println("=================s6 Details After Initialization=====================");
		s6.printDetails();
		System.out.println("=================s7 Details After Initialization=====================");
		s7.printDetails();
		System.out.println("=================s8 Details After Initialization=====================");
		s8.printDetails();
		System.out.println("=================s9 Details After Initialization=====================");
		s9.printDetails();
		
		System.out.println("===================Shirt Program Ends=========================");


	}

}
