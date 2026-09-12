package oopsBasicPrograming.thKeyword;

public class Weapon {
	
	String name;
	int price;
	String damage;
	
	public void setDetails(String name, int price, String damage){

		this.name = name;
		this.price = price;
		this.damage = damage;
	}
	
	public void printDetails() {
		
		System.out.println("Name is: " +name);
		System.out.println("Price is: " +price);
		System.out.println("Damage is: " +damage);
		
	}

}
