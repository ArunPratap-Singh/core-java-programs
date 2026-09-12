package inheritanceProgramingHierarchialInheritance.Employee;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("=================================Main Method Starts====================================");

		Developer d1 = new Developer("Rahul", 101, 75000, "Java", "Banking Application");
		Tester t1 = new Tester("Priya", 102, 65000, "Automation", "Selenium");
		Manager m1 = new Manager("Amit", 103, 95000, 12, "IT");
		HR h1 = new HR("Neha", 104, 70000, 150, "Recruitment");
		Accountant ac1 = new Accountant("Rohit", 105, 60000, "Tally", "M.Com");
		SalesExecutive s1 = new SalesExecutive("Vikas", 106, 55000, 500000, "North India");

		System.out.println(d1);
		System.out.println(t1);
		System.out.println(m1);
		System.out.println(h1);
		System.out.println(ac1);
		System.out.println(s1);
		
		System.out.println("=================================Main Method Ends========================================");
	}

}
