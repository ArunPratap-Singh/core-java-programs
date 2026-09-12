package callByValue;

public class EmployDriver {
	
	public static void main(String[] args) {
		
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();
		Employ e4 = new Employ();
		Employ e5 = new Employ();
		Employ e6 = new Employ();
		Employ e7 = new Employ();
		
		//As we are Calling By Giving Value So Its Is called Call By Value
		
		//Setters or Mutators
		e1.setDetails(23, 20000);
		e2.setDetails(24, 30000);
		e3.setDetails(25, 85000);
		e4.setDetails(55, 100000);
		e5.setDetails(65, 175000);
		e6.setDetails(33, 55000);
		e7.setDetails(35, 45000);
		
		System.out.println("============Employ e1 Details=============");
		System.out.println("Object Referemnce is: " +e1);
		System.out.println(e1.getDetails());
		
		System.out.println("============Employ e2 Details=============");
		System.out.println("Object Referemnce is: " +e2);
		System.out.println(e2.getDetails());
		
		System.out.println("============Employ e3 Details=============");
		System.out.println("Object Referemnce is: " +e3);
		System.out.println(e3.getDetails());
		
		System.out.println("============Employ e4 Details=============");
		System.out.println("Object Referemnce is: " +e4);
		System.out.println(e4.getDetails());
		
		System.out.println("============Employ e5 Details=============");
		System.out.println("Object Referemnce is: " +e5);
		System.out.println(e5.getDetails());
		
		System.out.println("============Employ e6 Details=============");
		System.out.println("Object Referemnce is: " +e6);
		System.out.println(e6.getDetails());
		
		System.out.println("============Employ e7 Details=============");
		System.out.println("Object Referemnce is: " +e7);
		System.out.println(e7.getDetails());
		
	}
	
		
	

}
