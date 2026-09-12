package constructor.deepCopy.Employ;

public class EmployDriver {

	public static void main(String[] args) {
		Employ e1 = new Employ("Mohan", 102, new Address("Noida", 201301, "U.P."));
		Employ e2 = new Employ("Sohan", 103, new Address("Delhi", 110005, "New Delhi"));
		Employ e3 = new Employ("Rohan", 104, new Address("Noida", 201301, "U.P."));
		Employ e4 = new Employ(e2);
		Employ e5 = new Employ(e3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		

	}

}
