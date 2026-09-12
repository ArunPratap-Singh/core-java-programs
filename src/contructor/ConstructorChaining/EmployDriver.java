package contructor.ConstructorChaining;

public class EmployDriver {
	
	public static void main(String[] args) {
		
		System.out.println("=====================================Main Method Starts======================================");
		
		Employ e1 = new Employ("Akash", 26, "Noida", 1122334455l, 222233334444l, 200000.0, "Q Spider", "Manager");
		Employ e2 = new Employ();
		Employ e3 = new Employ("Ravi");
		Employ e4 = new Employ("Ram", 57);
		Employ e5 = new Employ("Shambhu", 45, "Noida");
		Employ e6 = new Employ("Saurabh", 35, "Noida", 4455667788l);
		Employ e7 = new Employ("Ayush", 25, "Kanpur", 9977884455l, 666655558888l);
		Employ e8 = new Employ("Shrestha", 45, "Hapur", 9977884455l, 666655558888l, 1000000.0);
		Employ e9 = new Employ(35,"manoj","Delhi", 9977112255l, 666655557777l, 2000000.0, "HCL");
	    Employ e10 = new Employ(32, "Ram", "Lucknow", 9977884455l, 666655558888l, 1000000.0, "Tata Groups", "Tracker");
	    
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
	    
        System.out.println("=====================================Main Method Ends======================================");

		
	}
	
	
    

    

}
