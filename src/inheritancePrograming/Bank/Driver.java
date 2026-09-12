package inheritancePrograming.Bank;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("===============================Main Method Starts==================================");

		SavingsAccount s1 = new SavingsAccount("Rahul Sharma", 1001001001, 75000.50, "Lucknow", 6.5, "Savings", true);
		SavingsAccount s2 = new SavingsAccount("Amit Kumar", 1001001002, 65000.75, "Kanpur", 6.25, "Savings", true);
		SavingsAccount s3 = new SavingsAccount("Priya Singh", 1001001003, 85000.00, "Delhi", 7.0, "Savings", false);
		SavingsAccount s4 = new SavingsAccount("Neha Gupta", 1001001004, 92000.50, "Agra", 6.75, "Savings", true);
		SavingsAccount s5 = new SavingsAccount("Rohit Verma", 1001001005, 55000.25, "Noida", 6.5, "Savings", false);
		SavingsAccount s6 = new SavingsAccount("Sneha Mishra", 1001001006, 78000.80, "Varanasi", 7.25, "Savings", true);
		SavingsAccount s7 = new SavingsAccount("Vikas Yadav", 1001001007, 45000.00, "Prayagraj", 6.0, "Savings", true);
		SavingsAccount s8 = new SavingsAccount("Pooja Sharma", 1001001008, 105000.60, "Lucknow", 7.0, "Savings", false);
		SavingsAccount s9 = new SavingsAccount("Ankit Singh", 1001001009, 68000.40, "Gorakhpur", 6.5, "Savings", true);
		SavingsAccount s10 = new SavingsAccount("Kavita Verma", 1001001010, 99000.90, "Meerut", 7.5, "Savings", true);
		SavingsAccount s11 = new SavingsAccount("Saurabh Kumar", 1001001011, 72000.35, "Bareilly", 6.25, "Savings", false);
		SavingsAccount s12 = new SavingsAccount("Riya Gupta", 1001001012, 88000.75, "Mathura", 6.75, "Savings", true);
		SavingsAccount s13 = new SavingsAccount("Deepak Singh", 1001001013, 63000.50, "Ayodhya", 7.0, "Savings", true);
		SavingsAccount s14 = new SavingsAccount("Anjali Sharma", 1001001014, 115000.25, "Aligarh", 7.25, "Savings", false);
		SavingsAccount s15 = new SavingsAccount("Manish Yadav", 1001001015, 58000.90, "Ghaziabad", 6.5, "Savings", true);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
		System.out.println(s15);
		
		System.out.println("==============================Main Method Ends==========================================");
	}

}
