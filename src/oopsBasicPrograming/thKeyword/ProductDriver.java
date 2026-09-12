package oopsBasicPrograming.thKeyword;

public class ProductDriver {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		Product p6 = new Product();
		Product p7 = new Product();
		
		System.out.println("==========Product Programe Starts=============");
		
		System.out.println("===============p1 Details Before Initialization================");
		p1.printDetails();
		System.out.println("================p2 Details Before Initialization=================");
		p2.printDetails();
		System.out.println("================p3 Details Before Initialization=================");
		p3.printDetails();
		System.out.println("================p4 Details Before Initialization=================");
		p4.printDetails();
		System.out.println("================p5 Details Before Initialization=================");
		p5.printDetails();
		System.out.println("================p6 Details Before Initialization=================");
		p6.printDetails();
		System.out.println("================p7 Details Before Initialization=================");
		p7.printDetails();
		
		System.out.println("======================================================================");
		
		p1.setDetails("Shirt", 101, 750, "Noida");
		p2.setDetails("Jeans", 102, 1250, "Noida-Sec18");
		p3.setDetails("Laptop", 103, 120750, "Gaziabad");
		p4.setDetails("Refridgerator", 104, 125750, "Delhi");
		p5.setDetails("ColdDrinks", 105, 50, "Noida-Sec15");
		p6.setDetails("Almirah", 106, 12750, "Meerut");
		p7.setDetails("Double-Bed", 107, 102750, "Lucknow");
		
		System.out.println("================p1 Details After Initialization===============");
		p1.printDetails();
		System.out.println("================p2 Details After Initialization===============");
		p2.printDetails();
		System.out.println("================p3 Details After Initialization===============");
		p3.printDetails();
		System.out.println("================p4 Details After Initialization===============");
		p4.printDetails();
		System.out.println("================p5 Details After Initialization===============");
		p5.printDetails();
		System.out.println("================p6 Details After Initialization===============");
		p6.printDetails();
		System.out.println("================p7 Details After Initialization===============");
		p7.printDetails();
		
		System.out.println("===============Product Program Ends===================");
		
		
	
		

	}

}
