package contructor.ConstructorOverloading;

public class EmployDriver {

	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Starts================================");
		
		Employ e1 = new Employ("Akash", 30, 25000.0, "Noida - sector 3", 101, 1234567891l, 111122223333L);
		Employ e2 = new Employ("Shambhu");
		Employ e3 = new Employ(35, 555566667777l);
		Employ e4 = new Employ(89000.0, "Lucknow Cantt");
		Employ e5 = new Employ("Mahendranagar", 120000.0);
		Employ e6 = new Employ(102);
		Employ e7 = new Employ(1234568978l);
		Employ e8 = new Employ(111188889999L, 55000.0);
		Employ e9 = new Employ();
		Employ e10 = new Employ(30, "Mohan", 25000.0, "Noida - sector 3", 101, 1234567891l, 111122223333L);
		Employ e11 = new Employ("Mohan", 31, "Noida - sector 55", 55000.0, 101, 1234564561l, 111122227777L);
		Employ e12 = new Employ("Mohan", 45, 25000.0, "Noida - sector 18", 9898567891l, 102, 965422223333L);
		Employ e13 = new Employ("Mohan", 55, 25000.0, 101, 1234567891l, "Noida - sector 16", 111122223333L);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println(e9);
		System.out.println(e10);
		System.out.println(e11);
		System.out.println(e12);
		System.out.println(e13);
		
		System.out.println("=======================================Main Method Ends======================================");

	}

}
