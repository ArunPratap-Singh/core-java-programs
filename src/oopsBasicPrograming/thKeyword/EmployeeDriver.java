package oopsBasicPrograming.thKeyword;

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
		
		e1.setDetails("Mohan", 20, 25000);
		e2.setDetails("Rohan", 30, 35000);
		e3.setDetails("Sohan", 25, 45000);
		e4.setDetails("Madan", 35, 55000);
		e5.setDetails("John", 50, 65000);
		e6.setDetails("Manoj", 33, 75000);
		e7.setDetails("Shambhu", 40, 550000);
		e8.setDetails("Akash", 29, 250000);
		
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
