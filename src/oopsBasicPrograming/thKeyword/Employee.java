package oopsBasicPrograming.thKeyword;

public class Employee {
	
	String name;
	int age;
	double salary;
	
	public void setDetails(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
		System.out.println("Salary is: " +salary);
	}

}
