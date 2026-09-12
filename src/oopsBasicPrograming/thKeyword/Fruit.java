package oopsBasicPrograming.thKeyword;

public class Fruit {
	
	String name;
	String brandname;
	String color;
	double weight;
	
	
	public void setDetails(String name, String brandname, String color, double weight) {
		
		this.name = name;
		this.brandname = brandname;
		this.color = color;
		this.weight = weight;
		
	}
	
	public void printDetails() {
		System.out.println("Name is: " +name);
		System.out.println("Brandname is: " +brandname);
		System.out.println("Color is: " +color);
		System.out.println("Weight is: " +weight);
		
	}

}
