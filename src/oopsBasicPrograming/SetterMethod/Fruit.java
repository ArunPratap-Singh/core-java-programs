package oopsBasicPrograming.SetterMethod;

public class Fruit {
	
	String name;
	String brandname;
	String color;
	double weight;
	
	
	public void setDetails(String n, String b, String c, double w) {
		
		name = n;
		brandname = b;
		color = c;
		weight = w;
		
	}
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Brandname is: " +brandname);
		System.out.println("Color is: " +color);
		System.out.println("Weight is: " +weight);
		
	}

}
