package oopsBasicPrograming;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		Employee e7 = new Employee();
		Employee e8 = new Employee();
		
		System.out.println("===========Employee Programe Starts================");
		
		System.out.println("===========e1 Details Before initialization============");
		e1.printDetails();
		System.out.println("===========e2 Details Before initialization============");
		e2.printDetails();
		System.out.println("===========e3 Details Before initialization============");
		e3.printDetails();
		System.out.println("===========e4 Details Before initialization============");
		e4.printDetails();
		System.out.println("===========e5 Details Before initialization============");
		e5.printDetails();
		System.out.println("===========e6 Details Before initialization============");
		e6.printDetails();
		System.out.println("===========e7 Details Before initialization============");
		e7.printDetails();
		System.out.println("===========e8 Details Before initialization============");
		e8.printDetails();
		
		System.out.println("===========================================================");
		
		e1.name = "Mohan";		e2.name = "Rohan";		e3.name = "Sohan";		e7.name = "Shambhu";		
		e1.age = 23;			e2.age = 25;			e3.age = 26;			e7.age = 28;
		e1.salary = 25000;		e2.salary = 30000;		e3.salary = 35000;		e7.salary = 45000;
		
		e4.name = "John";		e5.name = "Arun";		e6.name = "Manoj";		e8.name = "Akash";
		e4.age = 30;			e5.age = 45;			e6.age = 50;			e8.age = 29;
		e4.salary = 31000;		e5.salary = 40000;		e6.salary = 500000;		e8.salary = 95000;
		
		System.out.println("============e1 Details After Initialization==============");
		e1.printDetails();
		System.out.println("============e2 Details After Initialization==============");
		e2.printDetails();
		System.out.println("============e3 Details After Initialization==============");
		e3.printDetails();
		System.out.println("============e4 Details After Initialization==============");
		e4.printDetails();
		System.out.println("============e5 Details After Initialization==============");
		e5.printDetails();
		System.out.println("============e6 Details After Initialization==============");
		e6.printDetails();
		System.out.println("============e7 Details After Initialization==============");
		e7.printDetails();
		System.out.println("============e8 Details After Initialization==============");
		e8.printDetails();
		
		System.out.println("==============Employee Programe Ends=================");
	}

}
