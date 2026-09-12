package oopsBasicPrograming.SetterMethod;

public class Weapon {
	
	String name;
	int price;
	String damage;
	
	public void setDetails(String n, int p, String d){

		name = n;
		price = p;
		damage = d;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Price is: " +price);
		System.out.println("Damage is: " +damage);
		
	}

}
