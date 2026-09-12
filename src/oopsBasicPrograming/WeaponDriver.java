package oopsBasicPrograming;

public class WeaponDriver {
	
	public static void main(String[] args) {
		
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		Weapon w3 = new Weapon();
		Weapon w4 = new Weapon();

		System.out.println("====w1 Details before initialization====");
		w1.printDetails();
		System.out.println("====w2 Details before initialization====");
		w2.printDetails();
		System.out.println("====w3 Details before initialization====");
		w3.printDetails();
		System.out.println("====w4 Details before initialization====");
		w4.printDetails();

		w1.name = "Knife";	w1.price = 60;		w1.weight = 10;		w1.feature = "Attack";
		w2.name = "Gun";	w2.price = 1500000;	w2.weight = 50;		w2.feature = "Attack";
		w3.name = "Bomb";	w2.price = 500000;	w3.weight = 25;		w3.feature = "Attack";
		w4.name = "Missile";	w4.price = 2500000;	w4.weight = 125;	w4.feature = "Attack";

		System.out.println("=========w1 Details After initialization=======");
		w1.printDetails();
		System.out.println("==========w2 Details After initialization========");
		w2.printDetails();
		System.out.println("===========w3 Details After initialization=========");
		w3.printDetails();
		System.out.println("===========w4 Details After initialization=========");
		w4.printDetails();
	}

}
