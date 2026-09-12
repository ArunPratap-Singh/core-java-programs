package oopsBasicPrograming;

public class AnimalDriver {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		Animal a4 = new Animal();
		Animal a5 = new Animal();
		Animal a6 = new Animal();
		
		System.out.println("================Animal Program Starts=================");

		System.out.println("=======a1 details before initialization========");
		a1.printDetails();
		System.out.println("=======a2 details before initialization========");
		a2.printDetails();
		System.out.println("=======a3 details before initialization========");
		a3.printDetails();
		System.out.println("=======a4 details before initialization========");
		a4.printDetails();
		System.out.println("=======a5 details before initialization========");
		a5.printDetails();
		System.out.println("=======a6 details before initialization========");
		a6.printDetails();
		
		System.out.println("==========================================================");
			
		a1.name = "Cow";		a1.age = 23;		a1.weight = 110;
		a2.name = "Goat";		a2.age = 20;		a2.weight = 50;
		a3.name = "Deer";		a3.age = 35;		a3.weight = 45;
		a4.name = "Lion";		a4.age = 45;		a4.weight = 65;
		a5.name = "Cheetah";	a5.age = 55;		a5.weight = 85;
		a5.name = "Puma";		a6.age = 65;		a6.weight = 95;
			
		System.out.println("=======a1 details after initialization========");
		a1.printDetails();
		System.out.println("=======a2 details after initialization========");
		a2.printDetails();
		System.out.println("=======a3 details after initialization========");
		a3.printDetails();
		System.out.println("=======a4 details after initialization========");
		a4.printDetails();
		System.out.println("=======a5 details after initialization========");
		a5.printDetails();
		System.out.println("=======a6 details after initialization========");
		a6.printDetails();
		
		System.out.println("================Animal Programe Ends====================");

	}

}
