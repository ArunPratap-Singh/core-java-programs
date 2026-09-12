package immutableClass;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1 = new Employ("Mohan", 26, 50000, "Noida", 101);
		Employ e2 = new Employ("Rohan", 27, 60000, "Meerut", 102);
		Employ e3 = new Employ("Sohan", 28, 70000, "GreaterNoida", 103);
		Employ e4 = new Employ("Shyam", 29, 80000, "Gaziabad", 104);
		Employ e5 = new Employ("Ram", 25, 90000, "Ayodhya", 105);
		Employ e6= new Employ("Manoj", 30, 100000, "Rampur", 106);
		
		System.out.println("=========Employ e1 Details==========");
		System.out.println("ObjectReference is: " +e1);
		System.out.println("Name is: " +e1.getName());
		System.out.println("Age is: " +e1.getAge());
		System.out.println("Salary is: " +e1.getSalary());
		System.out.println("Address is: " +e1.getAddress());
		System.out.println("ID is: " +e1.getID());
		
		System.out.println("=====================================================");
		
		System.out.println("=========Employ e2 Details==========");
		System.out.println("ObjectReference is: " +e2);
		System.out.println("Name is: " +e2.getName());
		System.out.println("Age is: " +e2.getAge());
		System.out.println("Salary is: " +e2.getSalary());
		System.out.println("Address is: " +e2.getAddress());
		System.out.println("ID is: " +e2.getID());
		
		System.out.println("=========Employ e3 Details==========");
		System.out.println("ObjectReference is: " +e3);
		System.out.println("Name is: " +e3.getName());
		System.out.println("Age is: " +e3.getAge());
		System.out.println("Salary is: " +e3.getSalary());
		System.out.println("Address is: " +e3.getAddress());
		System.out.println("ID is: " +e3.getID());
		
		System.out.println("=====================================================");
		
		System.out.println("=========Employ e4 Details==========");
		System.out.println("ObjectReference is: " +e4);
		System.out.println("Name is: " +e4.getName());
		System.out.println("Age is: " +e4.getAge());
		System.out.println("Salary is: " +e4.getSalary());
		System.out.println("Address is: " +e4.getAddress());
		System.out.println("ID is: " +e4.getID());
		
		System.out.println("=====================================================");
		
		System.out.println("=========Employ e5 Details==========");
		System.out.println("ObjectReference is: " +e5);
		System.out.println("Name is: " +e5.getName());
		System.out.println("Age is: " +e5.getAge());
		System.out.println("Salary is: " +e5.getSalary());
		System.out.println("Address is: " +e5.getAddress());
		System.out.println("ID is: " +e5.getID());
		
		System.out.println("=====================================================");
		
		System.out.println("=========Employ e6 Details==========");
		System.out.println("ObjectReference is: " +e6);
		System.out.println("Name is: " +e6.getName());
		System.out.println("Age is: " +e6.getAge());
		System.out.println("Salary is: " +e6.getSalary());
		System.out.println("Address is: " +e6.getAddress());
		System.out.println("ID is: " +e6.getID());

	}

}
