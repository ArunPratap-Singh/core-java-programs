package oopsBasicPrograming;

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
		
		s1.brand ="Livesmart";	s2.brand ="Levis";	s3.brand ="US-Polo";	s4.brand ="Adidas";	s5.brand ="Zara";
		s1.price = 750;			s2.price = 1150;	s3.price = 999;			s4.price = 2000;	s5.price = 2500;
		s1.color = "Peach";		s2.color = "White";	s3.color = "Yellow";	s4.color = "Cream";	s5.color = "White-Blue";
		s1.size = "42CM";		s2.size = "46CM";	s3.size = "40CM";		s4.size = "42CM";	s5.size = "38CM";
		s1.quantity = 4;		s2.quantity = 5;	s3.quantity = 2;		s4.quantity = 6;	s5.quantity = 8;
		
		s6.brand = "Louis Phillip";	s7.brand ="Van Heusen";	s8.brand ="Arrow";		s9.brand ="Mufti";	
		s6.price = 3550;			s7.price = 1999;		s8.price = 1000;		s9.price = 2500;	
		s6.color = "Navy-Blue";		s7.color = "Red";		s8.color = "Yellow";	s9.color = "Fluorescent Orange";	
		s6.size = "40CM";			s7.size = "46CM";		s8.size = "42CM";		s9.size = "36CM";	
		s6.quantity = 9;			s7.quantity = 1;		s8.quantity = 2;		s9.quantity = 6;	
		
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
