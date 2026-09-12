package oopsBasicPrograming;

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
		
		p1.name = "Shirt";		p2.name = "Jeans";			p3.name = "Laptop";			p4.name = "Refridgerator";
		p1.productid = 101;		p2.productid = 102;			p3.productid = 103;			p4.productid = 104;
		p1.price = 750;			p2.price = 1250;			p3.price = 120750;			p4.price = 125750;
		p1.address = "Noida";	p2.address = "Noida-sec18";	p3.address = "Gaziabad";	p4.address = "Delhi";
		
		p5.name = "ColdDrinks";		p6.name = "Almirah";		p7.name = "Double Bed";
		p5.productid = 105;			p6.productid = 106;			p7.productid = 107;
		p5.price = 50;				p6.price = 12750;			p7.price = 102750;			
		p5.address = "Noida-sec16";	p6.address = "NewDelhi";	p7.address = "Lucknow";
		
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
