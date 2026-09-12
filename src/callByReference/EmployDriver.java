package callByReference;

public class EmployDriver {
	
	public static void main(String[] args) {
		
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();
		Employ e4 = new Employ();
		Employ e5 = new Employ();
		Employ e6 = new Employ();
		Employ e7 = new Employ();
		
		//As we are Calling By Giving object reference So Its Is called Call By Reference
		
		//Setters or Mutators
		EmployService.setDetails(e1, 23, 20000);
		EmployService.setDetails(e2, 24, 30000);
		EmployService.setDetails(e3, 25, 85000);
		EmployService.setDetails(e4, 55, 100000);
		EmployService.setDetails(e5, 65, 175000);
		EmployService.setDetails(e6, 33, 55000);
		EmployService.setDetails(e6, 35, 45000);
		
		System.out.println("============Employ e1 Details=============");
		System.out.println("Object Referemnce is: " +e1);
		System.out.println(EmployService.getDetails(e1));
		
		System.out.println("============Employ e2 Details=============");
		System.out.println("Object Referemnce is: " +e2);
		System.out.println(EmployService.getDetails(e2));
		
		System.out.println("============Employ e3 Details=============");
		System.out.println("Object Referemnce is: " +e3);
		System.out.println(EmployService.getDetails(e3));
		
		System.out.println("============Employ e4 Details=============");
		System.out.println("Object Referemnce is: " +e4);
		System.out.println(EmployService.getDetails(e4));
		
		System.out.println("============Employ e5 Details=============");
		System.out.println("Object Referemnce is: " +e5);
		System.out.println(EmployService.getDetails(e5));
		
		System.out.println("============Employ e6 Details=============");
		System.out.println("Object Referemnce is: " +e6);
		System.out.println(EmployService.getDetails(e6));
		
		System.out.println("============Employ e7 Details=============");
		System.out.println("Object Referemnce is: " +e7);
		System.out.println(EmployService.getDetails(e7));
		
	}
	
		
	

}
