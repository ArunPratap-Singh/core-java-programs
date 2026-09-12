package constructor.shallowCopy;

public class EmployDriver1 {

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
		System.out.println("===============================");
		System.out.println(e2.a);
		System.out.println(e3.a);
		System.out.println("===============================");
		e2.a.city = "Gaziabad";
		System.out.println(e2);
		System.out.println(e4);
		System.out.println("===============================");
		System.out.println(e2.a.city);
		System.out.println(e4.a.city);
		System.out.println(e2.a.pin);
		System.out.println(e4.a.pin);
		System.out.println(e2.a.state);
		System.out.println(e4.a.state);
		System.out.println(e2.name);
		System.out.println(e4.name);
		System.out.println(e2.id);
		System.out.println(e2.id);
		e2.a.city = "Kanpur";
		e2.a.pin = 226001;
		e2.a.state = "U.P.";
		System.out.println("=============================");
		System.out.println(e2.a.city);
		System.out.println(e4.a.city);
		System.out.println(e2.a.pin);
		System.out.println(e4.a.pin);
		System.out.println(e2.a.state);
		System.out.println(e4.a.state);
		System.out.println("==================After Change====================");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		e4.name = "Shyam";
		System.out.println(e2.name);
		System.out.println(e4.name);
	}

}
