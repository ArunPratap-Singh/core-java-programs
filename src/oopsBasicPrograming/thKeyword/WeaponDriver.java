package oopsBasicPrograming.thKeyword;

public class WeaponDriver {

	public static void main(String[] args) {
		
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();
		Weapon w5 = new Weapon();
		Weapon w6 = new Weapon();
		Weapon w7 = new Weapon();
		Weapon w8 = new Weapon();
		Weapon w9 = new Weapon();
		
		System.out.println("==============Weapon Program Starts=================");
		
		System.out.println("==============w1 Details Before Initialization===============");
		w1.printDetails();
		System.out.println("==============w2 Details Before Initialization===============");
		w2.printDetails();
		System.out.println("==============w3 Details Before Initialization===============");
		w3.printDetails();
		System.out.println("==============w4 Details Before Initialization===============");
		w4.printDetails();
		System.out.println("==============w5 Details Before Initialization===============");
		w5.printDetails();
		System.out.println("==============w6 Details Before Initialization===============");
		w6.printDetails();
		System.out.println("==============w7 Details Before Initialization===============");
		w7.printDetails();
		System.out.println("==============w8 Details Before Initialization===============");
		w7.printDetails();
		System.out.println("==============w9 Details Before Initialization===============");
		w9.printDetails();
		
		System.out.println("==================================================================");
		
		w1.setDetails("Knife", 60, "High");
		w2.setDetails("Bomb", 50000, "Very High");
		w3.setDetails("Swords", 250000, "High");
		w4.setDetails("Darggers",100000, "High");
		w5.setDetails("Bows", 125000, "High");
		w6.setDetails("Rifle", 300000, "Very High");
		w7.setDetails("Pistols", 150000, "High");
		w8.setDetails("Grenades", 50000, "Very High");
		w9.setDetails("Missile", 250000000, "Very High");
		
		System.out.println("=================w1 Details After Initialization=====================");
		w1.printDetails();
		System.out.println("=================w2 Details After Initialization=====================");
		w2.printDetails();
		System.out.println("=================w3 Details After Initialization=====================");
		w3.printDetails();
		System.out.println("=================w4 Details After Initialization=====================");
		w4.printDetails();
		System.out.println("=================w5 Details After Initialization=====================");
		w5.printDetails();
		System.out.println("=================w6 Details After Initialization=====================");
		w6.printDetails();
		System.out.println("=================w7 Details After Initialization=====================");
		w7.printDetails();
		System.out.println("=================w8 Details After Initialization=====================");
		w8.printDetails();
		System.out.println("=================w9 Details After Initialization=====================");
		w9.printDetails();
		
		System.out.println("================Weapon Program Ends========================");

	}

}
