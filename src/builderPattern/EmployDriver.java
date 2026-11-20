package builderPattern;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1 = new Employ.Builder().setName("John").setAge(23).setSalary(25000.0).setAddress("Noida").setId(101).setExperience(2).build();

		Employ e2 = new Employ.Builder().setName("Roman").setAge(24).setSalary(35000.0).setAddress("Noida-160").setId(102).setExperience(1).build();
		
		Employ e3 = new Employ.Builder().setName("Amit").setAge(27).setSalary(35000.0).setAddress("Lucknow").setId(103).setExperience(4).build();

		Employ e4 = new Employ.Builder().setName("Priya").setAge(24).setSalary(28000.0).setAddress("Kanpur").setId(104).setExperience(2).build();

		Employ e5 = new Employ.Builder().setName("Sneha").setAge(26).setSalary(40000.0).setAddress("Mumbai").setId(105).setExperience(5).build();

		Employ e6 = new Employ.Builder().setName("Vikas").setAge(29).setSalary(45000.0).setAddress("Pune").setId(106).setExperience(6).build();

		Employ e7 = new Employ.Builder().setName("Neha").setAge(22).setSalary(22000.0).setAddress("Jaipur").setId(107).setExperience(1).build();

		Employ e8 = new Employ.Builder().setName("Rohit").setAge(30).setSalary(50000.0).setAddress("Bangalore").setId(108).setExperience(7).build();

		Employ e9 = new Employ.Builder().setName("Pooja").setAge(28).setSalary(42000.0).setAddress("Hyderabad").setId(109).setExperience(5).build();

		Employ e10 = new Employ.Builder().setName("Karan").setAge(31).setSalary(55000.0).setAddress("Chennai").setId(110).setExperience(8).build();

		Employ e11 = new Employ.Builder().setName("Anjali").setAge(23).setSalary(26000.0).setAddress("Agra").setId(111).setExperience(2).build();

		Employ e12 = new Employ.Builder().setName("Suresh").setAge(32).setSalary(60000.0).setAddress("Gurgaon").setId(112).setExperience(9).build();

		Employ e13 = new Employ.Builder().setName("Ritika").setAge(25).setSalary(32000.0).setAddress("Noida").setId(113).setExperience(3).build();

		Employ e14 = new Employ.Builder().setName("Manish").setAge(28).setSalary(38000.0).setAddress("Indore").setId(114).setExperience(4).build();

		Employ e15 = new Employ.Builder().setName("Kavita").setAge(27).setSalary(41000.0).setAddress("Bhopal").setId(115).setExperience(5).build();

		Employ e16 = new Employ.Builder().setName("Deepak").setAge(33).setSalary(65000.0).setAddress("Ahmedabad").setId(116).setExperience(10).build();

		Employ e17 = new Employ.Builder().setName("Swati").setAge(24).setSalary(29000.0).setAddress("Patna").setId(117).setExperience(2).build();

		Employ e18 = new Employ.Builder().setName("Varun").setAge(29).setSalary(48000.0).setAddress("Kolkata").setId(118).setExperience(6).build();

		Employ e19 = new Employ.Builder().setName("Meena").setAge(26).setSalary(36000.0).setAddress("Meerut").setId(119).setExperience(4).build();

		Employ e20 = new Employ.Builder().setName("Arjun").setAge(35).setSalary(75000.0).setAddress("Gurgaon").setId(120).setExperience(12).build();
		
		System.out.println(e1);
		System.out.println("============");
		System.out.println(e2);
		System.out.println("============");
		System.out.println(e3);
		System.out.println("============");
		System.out.println(e4);
		System.out.println("============");
		System.out.println(e5);
		System.out.println("============");
		System.out.println(e6);
		System.out.println("============");
		System.out.println(e7);
		System.out.println("============");
		System.out.println(e8);
		System.out.println("============");
		System.out.println(e9);
		System.out.println("============");
		System.out.println(e10);
		System.out.println("============");
		System.out.println(e11);
		System.out.println("============");
		System.out.println(e12);
		System.out.println("============");
		System.out.println(e13);
		System.out.println("============");
		System.out.println(e14);
		System.out.println("============");
		System.out.println(e15);
		System.out.println("============");
		System.out.println(e16);
		System.out.println("============");
		System.out.println(e17);
		System.out.println("============");
		System.out.println(e18);
		System.out.println("============");
		System.out.println(e19);
		System.out.println("============");
		System.out.println(e20);
	}

}
