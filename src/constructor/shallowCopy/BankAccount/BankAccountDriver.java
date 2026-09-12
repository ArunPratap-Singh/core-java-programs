package constructor.shallowCopy.BankAccount;

public class BankAccountDriver {
	
	public static void main(String[] args) {
		
		System.out.println("===============================Main Method Starts=====================================");
		
		BankAccount b1 = new BankAccount("PUNBSC123456", "Current", 50000.025, "Mumbai Branch", new Customer(101, "Mohan Singh", "Mumbai", 35, "Male", "Bussines Men"));
		BankAccount b2 = new BankAccount("SBINSC234567", "Savings", 75000.500, "Delhi Branch", new Customer(102, "Sohan Kumar", "Delhi", 29, "Male", "Teacher"));
		BankAccount b3 = new BankAccount("HDFCAC345678", "Savings", 125000.750, "Lucknow Branch", new Customer(103, "Ravi Sharma", "Lucknow", 42, "Male", "Engineer"));
		BankAccount b4 = new BankAccount("ICICAC456789", "Current", 95000.250, "Kanpur Branch", new Customer(104, "Anita Verma", "Kanpur", 31, "Female", "Doctor"));
		BankAccount b5 = new BankAccount("AXISAC567890", "Savings", 85000.125, "Agra Branch", new Customer(105, "Amit Gupta", "Agra", 38, "Male", "Accountant"));

		BankAccount b6 = new BankAccount("BOBAC678901", "Current", 150000.875, "Jaipur Branch", new Customer(106, "Priya Singh", "Jaipur", 27, "Female", "Lawyer"));
		BankAccount b7 = new BankAccount("YESBSC789012", "Savings", 65000.350, "Pune Branch", new Customer(107, "Rahul Mehta", "Pune", 33, "Male", "Manager"));
		BankAccount b8 = new BankAccount("PNBAC890123", "Current", 225000.625, "Meerut Branch", new Customer(108, "Neha Agarwal", "Meerut", 30, "Female", "Designer"));
		BankAccount b9 = new BankAccount("SBISC901234", "Savings", 45000.450, "Varanasi Branch", new Customer(109, "Vikas Yadav", "Varanasi", 40, "Male", "Farmer"));
		BankAccount b10 = new BankAccount("HDFCSC012345", "Current", 180000.900, "Noida Branch", new Customer(110, "Pooja Mishra", "Noida", 26, "Female", "Software Engineer"));

		BankAccount b11 = new BankAccount("ICICAC123789", "Savings", 92000.225, "Gurgaon Branch", new Customer(111, "Karan Malhotra", "Gurgaon", 36, "Male", "Business Man"));
		BankAccount b12 = new BankAccount("AXISAC234890", "Current", 135000.575, "Chandigarh Branch", new Customer(112, "Sneha Kapoor", "Chandigarh", 28, "Female", "Teacher"));
		BankAccount b13 = new BankAccount("BOBAC345901", "Savings", 78000.825, "Bhopal Branch", new Customer(113, "Manish Tiwari", "Bhopal", 45, "Male", "Government Officer"));
		BankAccount b14 = new BankAccount("PNBAC456012", "Current", 250000.350, "Patna Branch", new Customer(114, "Ritu Singh", "Patna", 34, "Female", "Professor"));
		BankAccount b15 = new BankAccount("SBINSC567123", "Savings", 56000.675, "Ranchi Branch", new Customer(115, "Sachin Kumar", "Ranchi", 39, "Male", "Sales Manager"));

		BankAccount b16 = new BankAccount("HDFCAC678234", "Current", 175000.425, "Hyderabad Branch", new Customer(116, "Meena Rao", "Hyderabad", 32, "Female", "Architect"));
		BankAccount b17 = new BankAccount("ICICAC789345", "Savings", 88000.950, "Bengaluru Branch", new Customer(117, "Ashok Reddy", "Bengaluru", 41, "Male", "Developer"));
		BankAccount b18 = new BankAccount("AXISAC890456", "Current", 310000.125, "Chennai Branch", new Customer(118, "Swati Iyer", "Chennai", 29, "Female", "Scientist"));
		BankAccount b19 = new BankAccount("BOBAC901567", "Savings", 72000.775, "Kolkata Branch", new Customer(119, "Deepak Das", "Kolkata", 37, "Male", "Journalist"));
		BankAccount b20 = new BankAccount("PNBAC012678", "Current", 195000.550, "Ahmedabad Branch", new Customer(120, "Kavita Patel", "Ahmedabad", 43, "Female", "Entrepreneur"));

		BankAccount b21 = new BankAccount("SBINSC123890", "Savings", 67000.325, "Surat Branch", new Customer(121, "Rajesh Shah", "Surat", 35, "Male", "Trader"));
		BankAccount b22 = new BankAccount("HDFCSC234901", "Current", 285000.875, "Nashik Branch", new Customer(122, "Divya Joshi", "Nashik", 27, "Female", "Nurse"));
		BankAccount b23 = new BankAccount("ICICAC345012", "Savings", 99000.425, "Indore Branch", new Customer(123, "Suresh Patel", "Indore", 48, "Male", "Business Man"));
		BankAccount b24 = new BankAccount("AXISAC456123", "Current", 145000.650, "Vadodara Branch", new Customer(124, "Aarti Mehta", "Vadodara", 31, "Female", "HR Manager"));
		BankAccount b25 = new BankAccount("BOBAC567234", "Savings", 53000.275, "Amritsar Branch", new Customer(125, "Vivek Sharma", "Amritsar", 44, "Male", "Police Officer"));

		BankAccount b26 = new BankAccount("PNBAC678345", "Current", 220000.825, "Dehradun Branch", new Customer(126, "Shalini Verma", "Dehradun", 33, "Female", "Consultant"));
		BankAccount b27 = new BankAccount("SBINSC789456", "Savings", 81000.375, "Shimla Branch", new Customer(127, "Arun Singh", "Shimla", 39, "Male", "Business Man"));
		BankAccount b28 = new BankAccount("HDFCSC890567", "Current", 165000.725, "Jodhpur Branch", new Customer(128, "Kajal Jain", "Jodhpur", 25, "Female", "Fashion Designer"));
		BankAccount b29 = new BankAccount("ICICAC901678", "Savings", 47000.950, "Udaipur Branch", new Customer(129, "Rohit Jain", "Udaipur", 36, "Male", "Photographer"));
		BankAccount b30 = new BankAccount("AXISAC012789", "Current", 275000.275, "Kota Branch", new Customer(130, "Simran Kaur", "Kota", 28, "Female", "Professor"));

		BankAccount b31 = new BankAccount("BOBAC123901", "Savings", 62000.825, "Ludhiana Branch", new Customer(131, "Ramesh Kumar", "Ludhiana", 46, "Male", "Contractor"));
		BankAccount b32 = new BankAccount("PNBAC234012", "Current", 190000.450, "Jalandhar Branch", new Customer(132, "Pallavi Gupta", "Jalandhar", 30, "Female", "Bank Manager"));
		BankAccount b33 = new BankAccount("SBINSC345123", "Savings", 73500.675, "Mathura Branch", new Customer(133, "Ajay Verma", "Mathura", 34, "Male", "Teacher"));
		BankAccount b34 = new BankAccount("HDFCSC456234", "Current", 155000.925, "Prayagraj Branch", new Customer(134, "Rekha Singh", "Prayagraj", 41, "Female", "Doctor"));
		BankAccount b35 = new BankAccount("ICICAC567345", "Savings", 89000.350, "Gorakhpur Branch", new Customer(135, "Naveen Mishra", "Gorakhpur", 38, "Male", "Engineer"));

		BankAccount b36 = new BankAccount("AXISAC678456", "Current", 245000.725, "Bareilly Branch", new Customer(136, "Monika Agarwal", "Bareilly", 29, "Female", "Accountant"));
		BankAccount b37 = new BankAccount("BOBAC789567", "Savings", 58000.475, "Moradabad Branch", new Customer(137, "Abhishek Kumar", "Moradabad", 32, "Male", "Software Engineer"));
		BankAccount b38 = new BankAccount("PNBAC890678", "Current", 210000.850, "Aligarh Branch", new Customer(138, "Tanya Sharma", "Aligarh", 26, "Female", "Teacher"));
		BankAccount b39 = new BankAccount("SBINSC901789", "Savings", 76000.625, "Meerut Branch", new Customer(139, "Vijay Singh", "Meerut", 43, "Male", "Business Man"));
		BankAccount b40 = new BankAccount("HDFCSC012890", "Current", 320000.375, "Ghaziabad Branch", new Customer(140, "Komal Gupta", "Ghaziabad", 35, "Female", "Manager"));

		BankAccount b41 = new BankAccount("ICICAC123901", "Savings", 93000.725, "Faridabad Branch", new Customer(141, "Rajesh Kumar", "Faridabad", 47, "Male", "Engineer"));
		BankAccount b42 = new BankAccount("AXISAC234012", "Current", 185000.525, "Rohtak Branch", new Customer(142, "Divya Sharma", "Rohtak", 29, "Female", "Doctor"));
		BankAccount b43 = new BankAccount("BOBAC345123", "Savings", 69000.875, "Panipat Branch", new Customer(143, "Mohan Lal", "Panipat", 52, "Male", "Business Man"));
		BankAccount b44 = new BankAccount("PNBAC456234", "Current", 270000.425, "Karnal Branch", new Customer(144, "Sunita Devi", "Karnal", 45, "Female", "Government Officer"));
		BankAccount b45 = new BankAccount("SBINSC567345", "Savings", 54000.650, "Hisar Branch", new Customer(145, "Anil Kumar", "Hisar", 40, "Male", "Farmer"));

		BankAccount b46 = new BankAccount("HDFCSC678456", "Current", 235000.925, "Ambala Branch", new Customer(146, "Radhika Singh", "Ambala", 33, "Female", "Lawyer"));
		BankAccount b47 = new BankAccount("ICICAC789567", "Savings", 87000.325, "Saharanpur Branch", new Customer(147, "Sanjay Gupta", "Saharanpur", 37, "Male", "Architect"));
		BankAccount b48 = new BankAccount("AXISAC890678", "Current", 305000.775, "Agra Branch", new Customer(148, "Preeti Sharma", "Agra", 31, "Female", "Professor"));
		BankAccount b49 = new BankAccount("BOBAC901789", "Savings", 71000.475, "Firozabad Branch", new Customer(149, "Manoj Singh", "Firozabad", 42, "Male", "Contractor"));
		BankAccount b50 = new BankAccount("PNBAC012890", "Current", 280000.625, "Lucknow Branch", new Customer(150, "Shweta Verma", "Lucknow", 28, "Female", "Software Engineer"));
		BankAccount b51 = new BankAccount(b1);
		BankAccount b52 = new BankAccount(b2);
		BankAccount b53 = new BankAccount(b3);
		BankAccount b54 = new BankAccount(b4);
		BankAccount b55 = new BankAccount(b5);
		BankAccount b56 = new BankAccount(b6);
		BankAccount b57 = new BankAccount(b7);
		BankAccount b58 = new BankAccount(b8);
		BankAccount b59 = new BankAccount(b9);
		BankAccount b60 = new BankAccount(b10);

		BankAccount b61 = new BankAccount(b11);
		BankAccount b62 = new BankAccount(b12);
		BankAccount b63 = new BankAccount(b13);
		BankAccount b64 = new BankAccount(b14);
		BankAccount b65 = new BankAccount(b15);
		BankAccount b66 = new BankAccount(b16);
		BankAccount b67 = new BankAccount(b17);
		BankAccount b68 = new BankAccount(b18);
		BankAccount b69 = new BankAccount(b19);
		BankAccount b70 = new BankAccount(b20);

		BankAccount b71 = new BankAccount(b21);
		BankAccount b72 = new BankAccount(b22);
		BankAccount b73 = new BankAccount(b23);
		BankAccount b74 = new BankAccount(b24);
		BankAccount b75 = new BankAccount(b25);
		BankAccount b76 = new BankAccount(b26);
		BankAccount b77 = new BankAccount(b27);
		BankAccount b78 = new BankAccount(b28);
		BankAccount b79 = new BankAccount(b29);
		BankAccount b80 = new BankAccount(b30);

		BankAccount b81 = new BankAccount(b31);
		BankAccount b82 = new BankAccount(b32);
		BankAccount b83 = new BankAccount(b33);
		BankAccount b84 = new BankAccount(b34);
		BankAccount b85 = new BankAccount(b35);
		BankAccount b86 = new BankAccount(b36);
		BankAccount b87 = new BankAccount(b37);
		BankAccount b88 = new BankAccount(b38);
		BankAccount b89 = new BankAccount(b39);
		BankAccount b90 = new BankAccount(b40);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);
		System.out.println(b9);
		System.out.println(b10);

		System.out.println(b11);
		System.out.println(b12);
		System.out.println(b13);
		System.out.println(b14);
		System.out.println(b15);
		System.out.println(b16);
		System.out.println(b17);
		System.out.println(b18);
		System.out.println(b19);
		System.out.println(b20);

		System.out.println(b21);
		System.out.println(b22);
		System.out.println(b23);
		System.out.println(b24);
		System.out.println(b25);
		System.out.println(b26);
		System.out.println(b27);
		System.out.println(b28);
		System.out.println(b29);
		System.out.println(b30);

		System.out.println(b31);
		System.out.println(b32);
		System.out.println(b33);
		System.out.println(b34);
		System.out.println(b35);
		System.out.println(b36);
		System.out.println(b37);
		System.out.println(b38);
		System.out.println(b39);
		System.out.println(b40);

		System.out.println(b41);
		System.out.println(b42);
		System.out.println(b43);
		System.out.println(b44);
		System.out.println(b45);
		System.out.println(b46);
		System.out.println(b47);
		System.out.println(b48);
		System.out.println(b49);
		System.out.println(b50);

		System.out.println(b51);
		System.out.println(b52);
		System.out.println(b53);
		System.out.println(b54);
		System.out.println(b55);
		System.out.println(b56);
		System.out.println(b57);
		System.out.println(b58);
		System.out.println(b59);
		System.out.println(b60);

		System.out.println(b61);
		System.out.println(b62);
		System.out.println(b63);
		System.out.println(b64);
		System.out.println(b65);
		System.out.println(b66);
		System.out.println(b67);
		System.out.println(b68);
		System.out.println(b69);
		System.out.println(b70);

		System.out.println(b71);
		System.out.println(b72);
		System.out.println(b73);
		System.out.println(b74);
		System.out.println(b75);
		System.out.println(b76);
		System.out.println(b77);
		System.out.println(b78);
		System.out.println(b79);
		System.out.println(b80);

		System.out.println(b81);
		System.out.println(b82);
		System.out.println(b83);
		System.out.println(b84);
		System.out.println(b85);
		System.out.println(b86);
		System.out.println(b87);
		System.out.println(b88);
		System.out.println(b89);
		System.out.println(b90);
		
		System.out.println("====================================Main Methos Ends========================================");
		
	}
	
	
	
}
