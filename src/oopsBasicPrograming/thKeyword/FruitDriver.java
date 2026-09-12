package oopsBasicPrograming.thKeyword;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit();
		Fruit f3 = new Fruit();
		Fruit f4 = new Fruit();
		Fruit f5 = new Fruit();
		Fruit f6 = new Fruit();
		
		System.out.println("===========Fruit Programe starts==============");
		
		System.out.println("==============f1 Details Before Initialization==============");
		f1.printDetails();
		System.out.println("==============f2 Details Before Initialization==============");
		f2.printDetails();
		System.out.println("==============f3 Details Before Initialization==============");
		f3.printDetails();
		System.out.println("==============f4 Details Before Initialization==============");
		f4.printDetails();
		System.out.println("==============f5 Details Before Initialization==============");
		f5.printDetails();
		System.out.println("==============f6 Details Before Initialization==============");
		f6.printDetails();
		
		System.out.println("====================================================================");
		
		f1.setDetails("Mango", "Dasheri", "Green-Yellow", 54.5);
		f2.setDetails("Grapes", "IG International", "Green", 13.4);
		f3.setDetails("Orange", "Namgpur-Orange", "Orange-Yellow", 12.12);
		f4.setDetails("Pineapple", "Queen-Pineapple", "Green", 100.12);
		f5.setDetails("Kiwi", "Zesperi", "Brown", 13.3);
		f6.setDetails("Banana", "Chiquita", "Yellow", 10.12);
		
		
		System.out.println("=================f1 Details After Initialization==================");
		f1.printDetails();
		System.out.println("=================f2 Details After Initialization==================");
		f2.printDetails();
		System.out.println("=================f3 Details After Initialization==================");
		f3.printDetails();
		System.out.println("=================f4 Details After Initialization==================");
		f4.printDetails();
		System.out.println("=================f5 Details After Initialization==================");
		f5.printDetails();
		System.out.println("=================f6 Details After Initialization==================");
		f6.printDetails();
		
		System.out.println("=================Fruit Programe Ends===================");
		

	}

}
