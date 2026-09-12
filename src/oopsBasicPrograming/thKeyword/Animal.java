package oopsBasicPrograming.thKeyword;

public class Animal {
	
	String name;
	int age;
	double weight;
	
	public void setDetails(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Age is: " +age);
		System.out.println("Weight is: " +weight);
	}

}
