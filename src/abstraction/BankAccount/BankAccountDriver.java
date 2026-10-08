package abstraction.BankAccount;


public class BankAccountDriver {

    public static void main(String[] args) {
    	
    	BankAccount b1 = new SavingAccount(101, "Rahul", "Savings Account", "ABC Bank", "Lucknow Branch", "ABCB000101", "Lucknow", "9876543210", "rahul@example.com", 50000, 6.5, 5000, 5, true, true);
    	BankAccount b2 = new SavingAccount(102, "Amit", "Savings Account", "XYZ Bank", "Delhi Branch", "XYZB000102", "New Delhi", "9876543211", "amit@example.com", 75000, 7.0, 5000, 6, true, true);
    	BankAccount b3 = new SavingAccount(103, "Priya", "Savings Account", "PQR Bank", "Noida Branch", "PQRB000103", "Noida", "9876543212", "priya@example.com", 60000, 6.75, 3000, 5, true, true);
    	BankAccount b4 = new SavingAccount(104, "Vikas", "Savings Account", "SBI Bank", "Gomti Nagar Branch", "SBIB000104", "Lucknow", "9876543213", "vikas@example.com", 90000, 7.25, 5000, 8, true, true);
    	BankAccount b5 = new SavingAccount(105, "Neha", "Savings Account", "HDFC Bank", "Sector 18 Branch", "HDFC000105", "Noida", "9876543214", "neha@example.com", 85000, 6.5, 10000, 6, true, true);
    	BankAccount b6 = new SavingAccount(106, "Rohit", "Savings Account", "ICICI Bank", "Andheri Branch", "ICIC000106", "Mumbai", "9876543215", "rohit@example.com", 120000, 7.0, 10000, 7, true, true);
    	BankAccount b7 = new SavingAccount(107, "Anjali", "Savings Account", "Axis Bank", "Koramangala Branch", "AXIS000107", "Bangalore", "9876543216", "anjali@example.com", 95000, 6.75, 5000, 6, true, true);
    	BankAccount b8 = new SavingAccount(108, "Suresh", "Savings Account", "Kotak Bank", "Banjara Hills Branch", "KKBK000108", "Hyderabad", "9876543217", "suresh@example.com", 150000, 7.5, 10000, 8, true, true);
    	BankAccount b9 = new SavingAccount(109, "Pooja", "Savings Account", "Canara Bank", "MG Road Branch", "CNRB000109", "Pune", "9876543218", "pooja@example.com", 70000, 6.25, 3000, 5, true, false);
    	BankAccount b10 = new SavingAccount(110, "Arun", "Savings Account", "Bank of Baroda", "Hazratganj Branch", "BARB000110", "Lucknow", "9876543219", "arun@example.com", 110000, 7.0, 5000, 7, true, true);    	

    	System.out.println(b1);
    	System.out.println("==================");
    	System.out.println(b2);
    	System.out.println("==================");
    	System.out.println(b3);
    	System.out.println("==================");
    	System.out.println(b4);
    	System.out.println("==================");
    	System.out.println(b5);
    	System.out.println("==================");
    	System.out.println(b6);
    	System.out.println("==================");
    	System.out.println(b7);
    	System.out.println("==================");
    	System.out.println(b8);
    	System.out.println("==================");
    	System.out.println(b9);
    	System.out.println("==================");
    	System.out.println(b10);
    	System.out.println("==================");
    	
    	System.out.println("===========================b1 Details=============================");
    	b1.deposit(10000);
    	b1.withdraw(1200);
    	System.out.println("Interest is: " +b1.calculateInterest());
    	b1.checkBalance();
    	
    	System.out.println("===========================b2 Details=============================");
    	b2.deposit(20000);
    	b2.withdraw(2200);
    	System.out.println("Interest is: " +b2.calculateInterest());
    	b2.checkBalance();
    	
    	System.out.println("===========================b3 Details=============================");
    	b3.deposit(30000);
    	b3.withdraw(3200);
    	System.out.println("Interest is: " +b3.calculateInterest());
    	b3.checkBalance();
    	
    	System.out.println("===========================b4 Details=============================");
    	b4.deposit(40000);
    	b4.withdraw(4200);
    	System.out.println("Interest is: " +b4.calculateInterest());
    	b4.checkBalance();
    	
    	System.out.println("===========================b5 Details=============================");
    	b5.deposit(50000);
    	b5.withdraw(5200);
    	System.out.println("Interest is: " +b5.calculateInterest());    	
    	b5.checkBalance();
    	
    	System.out.println("===========================b6 Details=============================");
    	b6.deposit(60000);
    	b6.withdraw(6200);
    	System.out.println("Interest is: " +b6.calculateInterest());
    	b6.checkBalance();
    	
    	System.out.println("===========================b7 Details=============================");
    	b7.deposit(70000);
    	b7.withdraw(7200);
    	System.out.println("Interest is: " +b7.calculateInterest());
    	b7.checkBalance();
    	
    	System.out.println("===========================b8 Details=============================");
    	b8.deposit(80000);
    	b8.withdraw(8200);
    	System.out.println("Interest is: " +b8.calculateInterest());
    	b8.checkBalance();
    	
    	System.out.println("===========================b1 Details=============================");
    	b9.deposit(90000);
    	b9.withdraw(9200);
    	System.out.println("Interest is: " +b9.calculateInterest());
    	b9.checkBalance();
    	
    	System.out.println("===========================b1 Details=============================");
    	b10.deposit(20000);
    	b10.withdraw(9200);
    	System.out.println("Interest is: " +b10.calculateInterest());
    	b10.checkBalance();
    	
    	System.out.println("==============================================================================");
    	
    	BankAccount b11 = new CurrentAccount(302, "Vikas", "Current Account", "XYZ Bank", "Delhi Branch", "XYZB000302", "Delhi", "9876545678", "vikas@example.com", 250000, 100000, 1000000, 1000, true, true);
    	BankAccount b12 = new CurrentAccount(303, "Rahul", "Current Account", "ABC Bank", "Lucknow Branch", "ABCB000303", "Lucknow", "9876545679", "rahul@example.com", 300000, 150000, 1200000, 1200, true, true);
    	BankAccount b13 = new CurrentAccount(304, "Amit", "Current Account", "SBI Bank", "Noida Branch", "SBIB000304", "Noida", "9876545680", "amit@example.com", 450000, 200000, 1500000, 1500, true, true);
    	BankAccount b14 = new CurrentAccount(305, "Priya", "Current Account", "HDFC Bank", "Gurgaon Branch", "HDFC000305", "Gurgaon", "9876545681", "priya@example.com", 350000, 125000, 1100000, 1100, true, true);
    	BankAccount b15 = new CurrentAccount(306, "Neha", "Current Account", "ICICI Bank", "Mumbai Branch", "ICIC000306", "Mumbai", "9876545682", "neha@example.com", 500000, 250000, 2000000, 2000, true, true);
    	BankAccount b16 = new CurrentAccount(307, "Rohit", "Current Account", "Axis Bank", "Bangalore Branch", "AXIS000307", "Bangalore", "9876545683", "rohit@example.com", 275000, 100000, 900000, 900, true, true);
    	BankAccount b17 = new CurrentAccount(308, "Anjali", "Current Account", "Kotak Bank", "Hyderabad Branch", "KKBK000308", "Hyderabad", "9876545684", "anjali@example.com", 400000, 175000, 1300000, 1300, true, true);
    	BankAccount b18 = new CurrentAccount(309, "Suresh", "Current Account", "Canara Bank", "Pune Branch", "CNRB000309", "Pune", "9876545685", "suresh@example.com", 325000, 125000, 1000000, 1000, true, false);
    	BankAccount b19 = new CurrentAccount(310, "Pooja", "Current Account", "Bank of Baroda", "Kanpur Branch", "BARB000310", "Kanpur", "9876545686", "pooja@example.com", 375000, 150000, 1250000, 1250, true, true);
    	BankAccount b20 = new CurrentAccount(311, "Arun", "Current Account", "Punjab National Bank", "Chandigarh Branch", "PUNB000311", "Chandigarh", "9876545687", "arun@example.com", 600000, 300000, 2500000, 2500, true, true);
    	
    	System.out.println(b11);
    	System.out.println("=================");
    	System.out.println(b12);
    	System.out.println("=================");
    	System.out.println(b13);
    	System.out.println("=================");
    	System.out.println(b14);
    	System.out.println("=================");
    	System.out.println(b15);
    	System.out.println("=================");
    	System.out.println(b16);
    	System.out.println("=================");
    	System.out.println(b17);
    	System.out.println("=================");
    	System.out.println(b18);
    	System.out.println("=================");
    	System.out.println(b19);
    	System.out.println("=================");
    	System.out.println(b20);
    	
    	System.out.println("========================b11 Details=======================");
    	b11.deposit(200000);
    	b11.withdraw(20000);
    	System.out.println("Interest is: " +b11.calculateInterest());
    	b11.checkBalance();
    	
    	System.out.println("========================b12 Details=======================");
    	b12.deposit(300000);
    	b12.withdraw(30000);
    	System.out.println("Interest is: " +b12.calculateInterest());
    	b12.checkBalance();
    	
    	System.out.println("========================b13 Details=======================");
    	b13.deposit(400000);
    	b13.withdraw(40000);
    	System.out.println("Interest is: " +b13.calculateInterest());
    	b13.checkBalance();
    	
    	System.out.println("========================b14 Details=======================");
    	b14.deposit(500000);
    	b14.withdraw(50000);
    	System.out.println("Interest is: " +b14.calculateInterest());
    	b14.checkBalance();
    	
    	System.out.println("========================b15 Details=======================");
    	b15.deposit(600000);
    	b15.withdraw(60000);
    	System.out.println("Interest is: " +b15.calculateInterest());
    	b15.checkBalance();
    	
    	System.out.println("========================b16 Details=======================");
    	b16.deposit(700000);
    	b16.withdraw(70000);
    	System.out.println("Interest is: " +b16.calculateInterest());
    	b16.checkBalance();
    	
    	System.out.println("========================b17 Details=======================");
    	b17.deposit(800000);
    	b17.withdraw(80000);
    	System.out.println("Interest is: " +b17.calculateInterest());
    	b17.checkBalance();
    	
    	System.out.println("========================b18 Details=======================");
    	b18.deposit(900000);
    	b18.withdraw(90000);
    	System.out.println("Interest is: " +b18.calculateInterest());
    	b18.checkBalance();
    	
    	System.out.println("========================b19 Details=======================");
    	b19.deposit(900000);
    	b19.withdraw(20000);
    	System.out.println("Interest is: " +b19.calculateInterest());
    	b19.checkBalance();
    	
    	System.out.println("========================b20 Details=======================");
    	b20.deposit(200000);
    	b20.withdraw(30000);
    	System.out.println("Interest is: " +b20.calculateInterest());
    	b20.checkBalance();
    	
    			
	}
}