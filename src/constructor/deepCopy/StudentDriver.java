package constructor.deepCopy;

public class StudentDriver {

	public static void main(String[] args) {
		Students s1 = new Students("Mohan", 102, new Address("Noida", 201301, "U.P."));
		Students s2 = new Students("Rohan", 103, new Address("Kanpur", 226001, "U.P."));
		Students s3 = new Students("Sohan", 104, new Address("Delhi", 110005, "New Delhi"));
		Students s4 = new Students(s1);
		Students s5 = new Students(s2);
		Students s6 = new Students();
		
		System.out.println("==========Before Change==========");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		System.out.println("==========After Change==========");
		s4.a.city = "Gurugram";
		s4.a.state = "Haryana";
		System.out.println(s1);
		System.out.println(s4);
		s4.name = "Ram";
		s4.id = 101;
		System.out.println(s1);
		System.out.println(s4);
	}

}
