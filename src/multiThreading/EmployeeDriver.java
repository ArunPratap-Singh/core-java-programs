package multiThreading;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Piyush", 101, 10, 10);
		Employee e2 = new Employee("Mohan", 102, 20, 20);
		Employee e3 = new Employee("Madan", 103, 30, 30);
		Employee e4 = new Employee("Rohan", 104, 40, 40);
		Employee e5 = new Employee("Sohan", 105, 50, 50);
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();

	}

}
