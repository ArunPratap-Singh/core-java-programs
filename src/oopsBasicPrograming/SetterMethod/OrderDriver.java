package oopsBasicPrograming.SetterMethod;

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
		
		o1.setDetails("ABS4561", 2, "Noida-Sec16", "03-08-2026");
		o2.setDetails("HUB4565", 6, "NewDelhi", "04-08-2026");
		o3.setDetails("xyz78965", 5, "Gaziabad", "08-08-2026");
		o4.setDetails("KLZ7894", 5, "Lucknow", "05-08-2026");
		o5.setDetails("TUY78866", 1, "Banglore", "06-08-2026");
		o6.setDetails("PUB5689", 9, "Pune", "07-08-2026");
		
		
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
