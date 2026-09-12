package oopsBasicPrograming.SetterMethod;

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
		
		a1.setDetails("Cow", 23, 110);
		a2.setDetails("Goat", 20, 50);
		a3.setDetails("Deer", 25, 45);
		a4.setDetails("Lion", 50, 120);
		a5.setDetails("Puma", 45, 150);
		a6.setDetails("Cheetah", 55, 110);
			
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
