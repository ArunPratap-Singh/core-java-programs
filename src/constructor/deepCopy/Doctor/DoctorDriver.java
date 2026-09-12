package constructor.deepCopy.Doctor;

public class DoctorDriver {

	public static void main(String[] args) {
		
		System.out.println("============================Main Method Starts=================================");
		
		Doctor d1 = new Doctor("Dr.Mohan", "Cardiologist", 15, "Male", new Hospital(101, "City Hospital", "Lucknow", 500, "Multi-Speciality", "Private"));
		Doctor d2 = new Doctor("Dr.Sohan", "Neurologist", 12, "Male", new Hospital(102, "Apollo Hospital", "Delhi", 700, "Multi-Speciality", "Private"));
		Doctor d3 = new Doctor("Dr.Ravi", "Orthopedic", 10, "Male", new Hospital(103, "Max Hospital", "Noida", 600, "Multi-Speciality", "Private"));
		Doctor d4 = new Doctor("Dr.Anita", "Gynecologist", 8, "Female", new Hospital(104, "Medanta Hospital", "Gurugram", 900, "Super-Speciality", "Private"));
		Doctor d5 = new Doctor("Dr.Amit", "Dermatologist", 7, "Male", new Hospital(105, "Fortis Hospital", "Mumbai", 500, "Multi-Speciality", "Private"));

		Doctor d6 = new Doctor("Dr.Priya", "Pediatrician", 9, "Female", new Hospital(106, "AIIMS Hospital", "Delhi", 1200, "Government", "Government"));
		Doctor d7 = new Doctor("Dr.Rahul", "Cardiologist", 18, "Male", new Hospital(107, "KGMU Hospital", "Lucknow", 1000, "Government", "Government"));
		Doctor d8 = new Doctor("Dr.Sunita", "Neurologist", 14, "Female", new Hospital(108, "SGPGI Hospital", "Lucknow", 1500, "Super-Speciality", "Government"));
		Doctor d9 = new Doctor("Dr.Vikas", "ENT Specialist", 11, "Male", new Hospital(109, "Ruby Hospital", "Kolkata", 450, "Multi-Speciality", "Private"));
		Doctor d10 = new Doctor("Dr.Neha", "Dentist", 6, "Female", new Hospital(110, "Care Hospital", "Hyderabad", 550, "Multi-Speciality", "Private"));

		Doctor d11 = new Doctor("Dr.Rohit", "Urologist", 13, "Male", new Hospital(111, "Yashoda Hospital", "Hyderabad", 800, "Multi-Speciality", "Private"));
		Doctor d12 = new Doctor("Dr.Kavita", "Psychiatrist", 10, "Female", new Hospital(112, "Narayana Hospital", "Bangalore", 700, "Multi-Speciality", "Private"));
		Doctor d13 = new Doctor("Dr.Ajay", "General Physician", 16, "Male", new Hospital(113, "Manipal Hospital", "Bangalore", 900, "Multi-Speciality", "Private"));
		Doctor d14 = new Doctor("Dr.Pooja", "Ophthalmologist", 9, "Female", new Hospital(114, "Aravind Hospital", "Chennai", 600, "Eye Hospital", "Private"));
		Doctor d15 = new Doctor("Dr.Karan", "Surgeon", 20, "Male", new Hospital(115, "Columbia Hospital", "Pune", 750, "Multi-Speciality", "Private"));

		Doctor d16 = new Doctor("Dr.Sneha", "Cardiologist", 11, "Female", new Hospital(116, "Ruby Hall Clinic", "Pune", 650, "Multi-Speciality", "Private"));
		Doctor d17 = new Doctor("Dr.Manish", "Orthopedic", 15, "Male", new Hospital(117, "Civil Hospital", "Jaipur", 800, "Government", "Government"));
		Doctor d18 = new Doctor("Dr.Ritu", "Gynecologist", 13, "Female", new Hospital(118, "SMS Hospital", "Jaipur", 1100, "Government", "Government"));
		Doctor d19 = new Doctor("Dr.Sachin", "Neurologist", 17, "Male", new Hospital(119, "Nanavati Hospital", "Mumbai", 700, "Multi-Speciality", "Private"));
		Doctor d20 = new Doctor("Dr.Meena", "Pediatrician", 12, "Female", new Hospital(120, "Hinduja Hospital", "Mumbai", 600, "Multi-Speciality", "Private"));

		Doctor d21 = new Doctor("Dr.Ashok", "Dermatologist", 14, "Male", new Hospital(121, "Breach Candy Hospital", "Mumbai", 500, "Multi-Speciality", "Private"));
		Doctor d22 = new Doctor("Dr.Swati", "ENT Specialist", 8, "Female", new Hospital(122, "Batra Hospital", "Delhi", 650, "Multi-Speciality", "Private"));
		Doctor d23 = new Doctor("Dr.Deepak", "Urologist", 19, "Male", new Hospital(123, "Sir Ganga Ram Hospital", "Delhi", 900, "Multi-Speciality", "Private"));
		Doctor d24 = new Doctor("Dr.Nisha", "Psychiatrist", 7, "Female", new Hospital(124, "Institute of Mental Health", "Chennai", 500, "Speciality", "Government"));
		Doctor d25 = new Doctor("Dr.Raj", "General Physician", 10, "Male", new Hospital(125, "Apollo Hospital", "Chennai", 750, "Multi-Speciality", "Private"));

		Doctor d26 = new Doctor("Dr.Kirti", "Ophthalmologist", 12, "Female", new Hospital(126, "Sankara Nethralaya", "Chennai", 450, "Eye Hospital", "Private"));
		Doctor d27 = new Doctor("Dr.Suresh", "Surgeon", 22, "Male", new Hospital(127, "Fortis Hospital", "Bangalore", 850, "Multi-Speciality", "Private"));
		Doctor d28 = new Doctor("Dr.Radhika", "Cardiologist", 16, "Female", new Hospital(128, "Narayana Institute", "Bangalore", 1000, "Heart Hospital", "Private"));
		Doctor d29 = new Doctor("Dr.Vinay", "Neurologist", 14, "Male", new Hospital(129, "Kokilaben Hospital", "Mumbai", 900, "Multi-Speciality", "Private"));
		Doctor d30 = new Doctor("Dr.Pallavi", "Gynecologist", 11, "Female", new Hospital(130, "Cloudnine Hospital", "Bangalore", 400, "Women and Children", "Private"));

		Doctor d31 = new Doctor("Dr.Ramesh", "Orthopedic", 18, "Male", new Hospital(131, "Ortho Care Hospital", "Kanpur", 350, "Speciality", "Private"));
		Doctor d32 = new Doctor("Dr.Sapna", "Pediatrician", 9, "Female", new Hospital(132, "Rainbow Hospital", "Hyderabad", 500, "Children Hospital", "Private"));
		Doctor d33 = new Doctor("Dr.Arun", "Dermatologist", 13, "Male", new Hospital(133, "Skin Care Hospital", "Lucknow", 300, "Speciality", "Private"));
		Doctor d34 = new Doctor("Dr.Rekha", "Dentist", 8, "Female", new Hospital(134, "Dental Care Hospital", "Agra", 250, "Dental Hospital", "Private"));
		Doctor d35 = new Doctor("Dr.Mohit", "ENT Specialist", 12, "Male", new Hospital(135, "ENT Care Hospital", "Meerut", 320, "Speciality", "Private"));

		Doctor d36 = new Doctor("Dr.Shalini", "Urologist", 10, "Female", new Hospital(136, "Kidney Care Hospital", "Lucknow", 450, "Speciality", "Private"));
		Doctor d37 = new Doctor("Dr.Vivek", "Psychiatrist", 15, "Male", new Hospital(137, "Mental Health Institute", "Agra", 400, "Speciality", "Government"));
		Doctor d38 = new Doctor("Dr.Aarti", "General Physician", 9, "Female", new Hospital(138, "District Hospital", "Meerut", 700, "Government", "Government"));
		Doctor d39 = new Doctor("Dr.Rajesh", "Ophthalmologist", 17, "Male", new Hospital(139, "Eye Care Hospital", "Varanasi", 350, "Eye Hospital", "Private"));
		Doctor d40 = new Doctor("Dr.Simran", "Surgeon", 14, "Female", new Hospital(140, "Sahara Hospital", "Lucknow", 600, "Multi-Speciality", "Private"));

		Doctor d41 = new Doctor("Dr.Abhay", "Cardiologist", 21, "Male", new Hospital(141, "Heart Care Hospital", "Kanpur", 500, "Heart Hospital", "Private"));
		Doctor d42 = new Doctor("Dr.Kajal", "Neurologist", 13, "Female", new Hospital(142, "Neuro Care Hospital", "Noida", 450, "Speciality", "Private"));
		Doctor d43 = new Doctor("Dr.Sanjay", "Orthopedic", 16, "Male", new Hospital(143, "Bone Care Hospital", "Delhi", 550, "Speciality", "Private"));
		Doctor d44 = new Doctor("Dr.Tanya", "Gynecologist", 10, "Female", new Hospital(144, "Mother Care Hospital", "Jaipur", 400, "Women Hospital", "Private"));
		Doctor d45 = new Doctor("Dr.Rajiv", "Pediatrician", 18, "Male", new Hospital(145, "Children Care Hospital", "Lucknow", 450, "Children Hospital", "Private"));

		Doctor d46 = new Doctor("Dr.Monica", "Dermatologist", 12, "Female", new Hospital(146, "Skin Care Hospital", "Delhi", 300, "Speciality", "Private"));
		Doctor d47 = new Doctor("Dr.Ashish", "Urologist", 15, "Male", new Hospital(147, "Kidney Hospital", "Kanpur", 500, "Speciality", "Private"));
		Doctor d48 = new Doctor("Dr.Priyanka", "Psychiatrist", 11, "Female", new Hospital(148, "Wellness Hospital", "Noida", 350, "Speciality", "Private"));
		Doctor d49 = new Doctor("Dr.Naveen", "General Physician", 20, "Male", new Hospital(149, "City Medical Center", "Varanasi", 650, "Multi-Speciality", "Private"));
		Doctor d50 = new Doctor("Dr.Sonia", "Ophthalmologist", 14, "Female", new Hospital(150, "Vision Care Hospital", "Lucknow", 400, "Eye Hospital", "Private"));
		Doctor d51 = new Doctor(d1);
		Doctor d52 = new Doctor(d2);
		Doctor d53 = new Doctor(d3);
		Doctor d54 = new Doctor(d4);
		Doctor d55 = new Doctor(d5);
		Doctor d56 = new Doctor(d6);
		Doctor d57 = new Doctor(d7);
		Doctor d58 = new Doctor(d8);
		Doctor d59 = new Doctor(d9);
		Doctor d60 = new Doctor(d10);

		Doctor d61 = new Doctor(d11);
		Doctor d62 = new Doctor(d12);
		Doctor d63 = new Doctor(d13);
		Doctor d64 = new Doctor(d14);
		Doctor d65 = new Doctor(d15);
		Doctor d66 = new Doctor(d16);
		Doctor d67 = new Doctor(d17);
		Doctor d68 = new Doctor(d18);
		Doctor d69 = new Doctor(d19);
		Doctor d70 = new Doctor(d20);

		Doctor d71 = new Doctor(d21);
		Doctor d72 = new Doctor(d22);
		Doctor d73 = new Doctor(d23);
		Doctor d74 = new Doctor(d24);
		Doctor d75 = new Doctor(d25);
		Doctor d76 = new Doctor(d26);
		Doctor d77 = new Doctor(d27);
		Doctor d78 = new Doctor(d28);
		Doctor d79 = new Doctor(d29);
		Doctor d80 = new Doctor(d30);

		Doctor d81 = new Doctor(d31);
		Doctor d82 = new Doctor(d32);
		Doctor d83 = new Doctor(d33);
		Doctor d84 = new Doctor(d34);
		Doctor d85 = new Doctor(d35);
		Doctor d86 = new Doctor(d36);
		Doctor d87 = new Doctor(d37);
		Doctor d88 = new Doctor(d38);
		Doctor d89 = new Doctor(d39);
		Doctor d90 = new Doctor(d40);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
		System.out.println(d9);
		System.out.println(d10);

		System.out.println(d11);
		System.out.println(d12);
		System.out.println(d13);
		System.out.println(d14);
		System.out.println(d15);
		System.out.println(d16);
		System.out.println(d17);
		System.out.println(d18);
		System.out.println(d19);
		System.out.println(d20);

		System.out.println(d21);
		System.out.println(d22);
		System.out.println(d23);
		System.out.println(d24);
		System.out.println(d25);
		System.out.println(d26);
		System.out.println(d27);
		System.out.println(d28);
		System.out.println(d29);
		System.out.println(d30);

		System.out.println(d31);
		System.out.println(d32);
		System.out.println(d33);
		System.out.println(d34);
		System.out.println(d35);
		System.out.println(d36);
		System.out.println(d37);
		System.out.println(d38);
		System.out.println(d39);
		System.out.println(d40);

		System.out.println(d41);
		System.out.println(d42);
		System.out.println(d43);
		System.out.println(d44);
		System.out.println(d45);
		System.out.println(d46);
		System.out.println(d47);
		System.out.println(d48);
		System.out.println(d49);
		System.out.println(d50);

		System.out.println(d51);
		System.out.println(d52);
		System.out.println(d53);
		System.out.println(d54);
		System.out.println(d55);
		System.out.println(d56);
		System.out.println(d57);
		System.out.println(d58);
		System.out.println(d59);
		System.out.println(d60);

		System.out.println(d61);
		System.out.println(d62);
		System.out.println(d63);
		System.out.println(d64);
		System.out.println(d65);
		System.out.println(d66);
		System.out.println(d67);
		System.out.println(d68);
		System.out.println(d69);
		System.out.println(d70);

		System.out.println(d71);
		System.out.println(d72);
		System.out.println(d73);
		System.out.println(d74);
		System.out.println(d75);
		System.out.println(d76);
		System.out.println(d77);
		System.out.println(d78);
		System.out.println(d79);
		System.out.println(d80);

		System.out.println(d81);
		System.out.println(d82);
		System.out.println(d83);
		System.out.println(d84);
		System.out.println(d85);
		System.out.println(d86);
		System.out.println(d87);
		System.out.println(d88);
		System.out.println(d89);
		System.out.println(d90);
		
		System.out.println("====================================Main Method Ends====================================");
		
	}

}
