package oopsBasicPrograming.SetterMethod;

public class Animal {
	
	String name;
	int age;
	double weight;
	
	public void setDetails(String n, int a, double w) {
		
		name = n;
		age = a;
		weight = w;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
		System.out.println("Weight is: " +weight);
	}

}
