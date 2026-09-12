package oopsBasicPrograming.SetterMethod;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public void setDetails(String n, int a, double s) {
		name = n;
		age = a;
		salary = s;
	}
	
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
		System.out.println("Salary is: " +salary);
	}

}
