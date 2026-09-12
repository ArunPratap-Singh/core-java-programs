package oopsBasicPrograming;

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
		
		f1.name = "Mango";				f2.name = "Grapes";						f3.name = "Orange";
		f1.brandname = "Dasheri";		f2.brandname = "IG International";		f3.brandname = "NagpurOrange";	
		f1.color = "Green-Yellow";		f2.color = "Green";						f3.color = "Orange-Yellow";
		f1.weight = 54.0;				f2.weight = 13.5;						f3.weight = 10.12;
		
		f4.name = "Pineapple";				f5.name = "Kiwi";				f6.name = "Banana";
		f4.brandname = "Queen-Pineapple";	f5.brandname = "Zespri";		f6.brandname = "Chiquita";	
		f4.color = "Green";					f5.color = "Brown";				f6.color = "Yellow";
		f4.weight = 84.0;					f5.weight = 13.3;				f6.weight = 10.12;
		
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
