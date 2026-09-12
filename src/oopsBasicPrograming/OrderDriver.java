package oopsBasicPrograming;

public class OrderDriver {
	
	public static void main(String[] args) {
		
		Order o1 = new Order();
		Order o2 = new Order();
		Order o3 = new Order();
		Order o4 = new Order();
		Order o5 = new Order();
		Order o6 = new Order();
		
		System.out.println("=============Order Program Starts==================");
		
		System.out.println("================o1 Details Before Initialization==============");
		o1.printDetails();
		System.out.println("================o2 Details Before Initialization==============");
		o2.printDetails();
		System.out.println("================o3 Details Before Initialization==============");
		o3.printDetails();
		System.out.println("================o4 Details Before Initialization==============");
		o4.printDetails();
		System.out.println("================o5 Details Before Initialization==============");
		o5.printDetails();
		System.out.println("================o6 Details Before Initialization==============");
		o6.printDetails();
		
		System.out.println("===============================================================================");
		
		o1.orderid = "ABS1234";			o2.orderid = "HUB4565";			o3.orderid = "XYZ7865";			o4.orderid = "KLZ7354";
		o1.numberofproducts = 2;		o2.numberofproducts = 6;		o3.numberofproducts = 6;		o4.numberofproducts = 2;
		o1.address = "Noida-Sec16";		o2.address = "NewDelhi";		o3.address = "Lucknow";			o4.address = "Meerut";
		o1.deliverydate = "03-08-2026";	o2.deliverydate = "04-08-2026";	o3.deliverydate = "05-08-2026";	o4.deliverydate = "06-08-2026";
		
		o5.orderid = "YWQ73012";		o6.orderid = "PUB9879";
		o5.numberofproducts = 8;		o6.numberofproducts = 9;
		o5.address = "Gaziabad";		o6.address = "Banglore";
		o5.deliverydate = "07-08-2026";	o6.deliverydate = "08-08-2026";
		
		System.out.println("=================o1 Details After Initialization====================");
		o1.printDetails();
		System.out.println("=================o2.Details After Initialization====================");
		o2.printDetails();
		System.out.println("=================o3.Details After Initialization====================");
		o3.printDetails();
		System.out.println("=================o4.Details After Initialization====================");
		o4.printDetails();
		System.out.println("=================o5.Details After Initialization====================");
		o5.printDetails();
		System.out.println("=================o6.Details After Initialization====================");
		o6.printDetails();
		
		System.out.println("===============Order Program Ends======================");
		
	}

}
