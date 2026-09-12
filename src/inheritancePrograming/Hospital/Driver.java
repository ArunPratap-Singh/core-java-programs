package inheritancePrograming.Hospital;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("================================Main Method Starts================================");

		Patient p1 = new Patient("Apollo Hospital", "Lucknow", 101, "Rajesh Sharma", "Cardiologist", 1500.50, "Rahul Singh", 1001, 25, "Heart Problem");
		Patient p2 = new Patient("Medanta Hospital", "Delhi", 102, "Amit Verma", "Neurologist", 1800.00, "Amit Singh", 1002, 32, "Migraine");
		Patient p3 = new Patient("Fortis Hospital", "Noida", 103, "Priya Sharma", "Dermatologist", 1200.50, "Neha Gupta", 1003, 28, "Skin Allergy");
		Patient p4 = new Patient("KGMU Hospital", "Lucknow", 104, "Sanjay Kumar", "Orthopedic", 1600.75, "Rohit Verma", 1004, 35, "Leg Fracture");
		Patient p5 = new Patient("Max Hospital", "Delhi", 105, "Anjali Singh", "Gynecologist", 2000.00, "Pooja Sharma", 1005, 30, "Pregnancy Checkup");
		Patient p6 = new Patient("Apollo Hospital", "Kanpur", 106, "Vikas Yadav", "ENT Specialist", 1000.50, "Saurabh Kumar", 1006, 27, "Ear Infection");
		Patient p7 = new Patient("AIIMS Hospital", "Delhi", 107, "Ravi Sharma", "General Physician", 800.00, "Deepak Singh", 1007, 40, "Fever");
		Patient p8 = new Patient("Sahara Hospital", "Lucknow", 108, "Kavita Gupta", "Pediatrician", 1400.25, "Riya Verma", 1008, 12, "Viral Infection");
		Patient p9 = new Patient("Fortis Hospital", "Gurgaon", 109, "Manoj Singh", "Cardiologist", 1750.50, "Ankit Sharma", 1009, 45, "Chest Pain");
		Patient p10 = new Patient("Medanta Hospital", "Gurgaon", 110, "Sneha Mishra", "Ophthalmologist", 1300.00, "Vikas Kumar", 1010, 33, "Eye Infection");
		Patient p11 = new Patient("KGMU Hospital", "Lucknow", 111, "Rajeev Verma", "Psychiatrist", 1900.75, "Manish Yadav", 1011, 29, "Stress");
		Patient p12 = new Patient("Max Hospital", "Noida", 112, "Pooja Singh", "Dentist", 900.50, "Kavita Sharma", 1012, 26, "Tooth Pain");
		Patient p13 = new Patient("Apollo Hospital", "Delhi", 113, "Deepak Kumar", "Orthopedic", 1550.00, "Aman Gupta", 1013, 38, "Back Pain");
		Patient p14 = new Patient("AIIMS Hospital", "Delhi", 114, "Rohit Sharma", "Neurologist", 2200.50, "Sneha Verma", 1014, 31, "Headache");
		Patient p15 = new Patient("Sahara Hospital", "Lucknow", 115, "Neha Singh", "Dermatologist", 1250.75, "Priya Mishra", 1015, 24, "Acne");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		System.out.println(p8);
		System.out.println(p9);
		System.out.println(p10);
		System.out.println(p11);
		System.out.println(p12);
		System.out.println(p13);
		System.out.println(p14);
		System.out.println(p15);
		
		System.out.println("=================================Main Method Ends=================================");
	}

}
