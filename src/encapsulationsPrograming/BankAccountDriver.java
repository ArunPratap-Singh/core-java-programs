package encapsulationsPrograming;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		System.out.println("=============================Main Method Starts=============================");
		
		BankAccount a1 = new BankAccount("Mohan", "ACC101", "Savings", "Noida", 25000.50);
		BankAccount a2 = new BankAccount("Rohan", "ACC102", "Current", "Lucknow", 50000.00);
		BankAccount a3 = new BankAccount("Sohan", "ACC103", "Savings", "Banglore", 35000.75);
		BankAccount a4 = new BankAccount("Ram", "ACC104", "Salary", "Pune", 45000.00);
		BankAccount a5 = new BankAccount("Shyam", "ACC105", "Savings", "Mumbai", 60000.25);
		BankAccount a6 = new BankAccount("Manoj", "ACC106", "Current", "Gaziabad", 75000.00);
		BankAccount a7 = new BankAccount("Akash", "ACC107", "Savings", "Meerut", 42000.50);
		BankAccount a8 = new BankAccount("Samarth", "ACC108", "Salary", "NaviMumbai", 85000.00);
		BankAccount a9 = new BankAccount("Abhishek", "ACC109", "Savings", "Ahemdabad", 55000.75);
		BankAccount a10 = new BankAccount("Karan Singh", "ACC110", "Current", "Gurugram", 95000.00);

		BankAccount a11 = new BankAccount("Rahul", "ACC111", "Savings", "Delhi", 32000.50);
		BankAccount a12 = new BankAccount("Vikas", "ACC112", "Current", "Kanpur", 48000.00);
		BankAccount a13 = new BankAccount("Amit", "ACC113", "Salary", "Agra", 57000.25);
		BankAccount a14 = new BankAccount("Sumit", "ACC114", "Savings", "Varanasi", 29000.75);
		BankAccount a15 = new BankAccount("Ravi", "ACC115", "Current", "Jaipur", 68000.00);
		BankAccount a16 = new BankAccount("Nitin", "ACC116", "Salary", "Indore", 72000.50);
		BankAccount a17 = new BankAccount("Varun", "ACC117", "Savings", "Bhopal", 39000.25);
		BankAccount a18 = new BankAccount("Ankit", "ACC118", "Current", "Patna", 81000.00);
		BankAccount a19 = new BankAccount("Deepak", "ACC119", "Savings", "Ranchi", 44000.75);
		BankAccount a20 = new BankAccount("Pankaj", "ACC120", "Salary", "Chandigarh", 92000.50);

		BankAccount a21 = new BankAccount("Sachin", "ACC121", "Savings", "Noida", 36000.00);
		BankAccount a22 = new BankAccount("Rakesh", "ACC122", "Current", "Faridabad", 53000.25);
		BankAccount a23 = new BankAccount("Vivek", "ACC123", "Salary", "Gurugram", 76000.00);
		BankAccount a24 = new BankAccount("Gaurav", "ACC124", "Savings", "Meerut", 41000.50);
		BankAccount a25 = new BankAccount("Harish", "ACC125", "Current", "Agra", 63000.75);
		BankAccount a26 = new BankAccount("Suresh", "ACC126", "Salary", "Lucknow", 88000.00);
		BankAccount a27 = new BankAccount("Mahesh", "ACC127", "Savings", "Kanpur", 35000.25);
		BankAccount a28 = new BankAccount("Yash", "ACC128", "Current", "Delhi", 67000.50);
		BankAccount a29 = new BankAccount("Ayush", "ACC129", "Savings", "Pune", 46000.00);
		BankAccount a30 = new BankAccount("Kunal", "ACC130", "Salary", "Mumbai", 99000.75);

		BankAccount a31 = new BankAccount("Rohit", "ACC131", "Savings", "Jaipur", 38000.50);
		BankAccount a32 = new BankAccount("Mohit", "ACC132", "Current", "Bhopal", 59000.00);
		BankAccount a33 = new BankAccount("Tarun", "ACC133", "Salary", "Indore", 78000.25);
		BankAccount a34 = new BankAccount("Arjun", "ACC134", "Savings", "Patna", 43000.75);
		BankAccount a35 = new BankAccount("Naveen", "ACC135", "Current", "Ranchi", 71000.50);
		BankAccount a36 = new BankAccount("Prakash", "ACC136", "Salary", "Chandigarh", 83000.00);
		BankAccount a37 = new BankAccount("Shubham", "ACC137", "Savings", "Varanasi", 37000.25);
		BankAccount a38 = new BankAccount("Aditya", "ACC138", "Current", "Agra", 65000.75);
		BankAccount a39 = new BankAccount("Raj", "ACC139", "Savings", "Delhi", 49000.50);
		BankAccount a40 = new BankAccount("Vishal", "ACC140", "Salary", "Noida", 105000.00);

		BankAccount a41 = new BankAccount("Dev", "ACC141", "Savings", "Lucknow", 34000.75);
		BankAccount a42 = new BankAccount("Rajat", "ACC142", "Current", "Kanpur", 58000.50);
		BankAccount a43 = new BankAccount("Mukul", "ACC143", "Salary", "Mumbai", 87000.00);
		BankAccount a44 = new BankAccount("Ashish", "ACC144", "Savings", "Pune", 45000.25);
		BankAccount a45 = new BankAccount("Lokesh", "ACC145", "Current", "Gurugram", 73000.75);
		BankAccount a46 = new BankAccount("Sanjay", "ACC146", "Salary", "Faridabad", 91000.50);
		BankAccount a47 = new BankAccount("Manish", "ACC147", "Savings", "Meerut", 40000.00);
		BankAccount a48 = new BankAccount("Rishabh", "ACC148", "Current", "Noida", 69000.25);
		BankAccount a49 = new BankAccount("Shivam", "ACC149", "Savings", "Delhi", 52000.75);
		BankAccount a50 = new BankAccount("Varun Singh", "ACC150", "Salary", "Gurugram", 110000.00);
		
		System.out.println("===========================BankAccount 1 Details=================================");
		System.out.println("Object Reference is: " +a1);
		System.out.println("AccountHolderName is: " +a1.getAccountHolderName());
		System.out.println("AccountNumber is: " +a1.getAccountNumber());
		System.out.println("Account Type is: " +a1.getAccountType());
		System.out.println("Branch is: " +a1.getBranch());
		System.out.println("Balance is: " +a1.getBalance());
		
		System.out.println("===========================BankAccount 1 Details=================================");
		System.out.println("Object Reference is: " + a1);
		System.out.println("AccountHolderName is: " + a1.getAccountHolderName());
		System.out.println("AccountNumber is: " + a1.getAccountNumber());
		System.out.println("Account Type is: " + a1.getAccountType());
		System.out.println("Branch is: " + a1.getBranch());
		System.out.println("Balance is: " + a1.getBalance());

		System.out.println("===========================BankAccount 2 Details=================================");
		System.out.println("Object Reference is: " + a2);
		System.out.println("AccountHolderName is: " + a2.getAccountHolderName());
		System.out.println("AccountNumber is: " + a2.getAccountNumber());
		System.out.println("Account Type is: " + a2.getAccountType());
		System.out.println("Branch is: " + a2.getBranch());
		System.out.println("Balance is: " + a2.getBalance());

		System.out.println("===========================BankAccount 3 Details=================================");
		System.out.println("Object Reference is: " + a3);
		System.out.println("AccountHolderName is: " + a3.getAccountHolderName());
		System.out.println("AccountNumber is: " + a3.getAccountNumber());
		System.out.println("Account Type is: " + a3.getAccountType());
		System.out.println("Branch is: " + a3.getBranch());
		System.out.println("Balance is: " + a3.getBalance());

		System.out.println("===========================BankAccount 4 Details=================================");
		System.out.println("Object Reference is: " + a4);
		System.out.println("AccountHolderName is: " + a4.getAccountHolderName());
		System.out.println("AccountNumber is: " + a4.getAccountNumber());
		System.out.println("Account Type is: " + a4.getAccountType());
		System.out.println("Branch is: " + a4.getBranch());
		System.out.println("Balance is: " + a4.getBalance());

		System.out.println("===========================BankAccount 5 Details=================================");
		System.out.println("Object Reference is: " + a5);
		System.out.println("AccountHolderName is: " + a5.getAccountHolderName());
		System.out.println("AccountNumber is: " + a5.getAccountNumber());
		System.out.println("Account Type is: " + a5.getAccountType());
		System.out.println("Branch is: " + a5.getBranch());
		System.out.println("Balance is: " + a5.getBalance());

		System.out.println("===========================BankAccount 6 Details=================================");
		System.out.println("Object Reference is: " + a6);
		System.out.println("AccountHolderName is: " + a6.getAccountHolderName());
		System.out.println("AccountNumber is: " + a6.getAccountNumber());
		System.out.println("Account Type is: " + a6.getAccountType());
		System.out.println("Branch is: " + a6.getBranch());
		System.out.println("Balance is: " + a6.getBalance());

		System.out.println("===========================BankAccount 7 Details=================================");
		System.out.println("Object Reference is: " + a7);
		System.out.println("AccountHolderName is: " + a7.getAccountHolderName());
		System.out.println("AccountNumber is: " + a7.getAccountNumber());
		System.out.println("Account Type is: " + a7.getAccountType());
		System.out.println("Branch is: " + a7.getBranch());
		System.out.println("Balance is: " + a7.getBalance());

		System.out.println("===========================BankAccount 8 Details=================================");
		System.out.println("Object Reference is: " + a8);
		System.out.println("AccountHolderName is: " + a8.getAccountHolderName());
		System.out.println("AccountNumber is: " + a8.getAccountNumber());
		System.out.println("Account Type is: " + a8.getAccountType());
		System.out.println("Branch is: " + a8.getBranch());
		System.out.println("Balance is: " + a8.getBalance());

		System.out.println("===========================BankAccount 9 Details=================================");
		System.out.println("Object Reference is: " + a9);
		System.out.println("AccountHolderName is: " + a9.getAccountHolderName());
		System.out.println("AccountNumber is: " + a9.getAccountNumber());
		System.out.println("Account Type is: " + a9.getAccountType());
		System.out.println("Branch is: " + a9.getBranch());
		System.out.println("Balance is: " + a9.getBalance());

		System.out.println("===========================BankAccount 10 Details=================================");
		System.out.println("Object Reference is: " + a10);
		System.out.println("AccountHolderName is: " + a10.getAccountHolderName());
		System.out.println("AccountNumber is: " + a10.getAccountNumber());
		System.out.println("Account Type is: " + a10.getAccountType());
		System.out.println("Branch is: " + a10.getBranch());
		System.out.println("Balance is: " + a10.getBalance());

		System.out.println("===========================BankAccount 11 Details=================================");
		System.out.println("Object Reference is: " + a11);
		System.out.println("AccountHolderName is: " + a11.getAccountHolderName());
		System.out.println("AccountNumber is: " + a11.getAccountNumber());
		System.out.println("Account Type is: " + a11.getAccountType());
		System.out.println("Branch is: " + a11.getBranch());
		System.out.println("Balance is: " + a11.getBalance());

		System.out.println("===========================BankAccount 12 Details=================================");
		System.out.println("Object Reference is: " + a12);
		System.out.println("AccountHolderName is: " + a12.getAccountHolderName());
		System.out.println("AccountNumber is: " + a12.getAccountNumber());
		System.out.println("Account Type is: " + a12.getAccountType());
		System.out.println("Branch is: " + a12.getBranch());
		System.out.println("Balance is: " + a12.getBalance());

		System.out.println("===========================BankAccount 13 Details=================================");
		System.out.println("Object Reference is: " + a13);
		System.out.println("AccountHolderName is: " + a13.getAccountHolderName());
		System.out.println("AccountNumber is: " + a13.getAccountNumber());
		System.out.println("Account Type is: " + a13.getAccountType());
		System.out.println("Branch is: " + a13.getBranch());
		System.out.println("Balance is: " + a13.getBalance());

		System.out.println("===========================BankAccount 14 Details=================================");
		System.out.println("Object Reference is: " + a14);
		System.out.println("AccountHolderName is: " + a14.getAccountHolderName());
		System.out.println("AccountNumber is: " + a14.getAccountNumber());
		System.out.println("Account Type is: " + a14.getAccountType());
		System.out.println("Branch is: " + a14.getBranch());
		System.out.println("Balance is: " + a14.getBalance());

		System.out.println("===========================BankAccount 15 Details=================================");
		System.out.println("Object Reference is: " + a15);
		System.out.println("AccountHolderName is: " + a15.getAccountHolderName());
		System.out.println("AccountNumber is: " + a15.getAccountNumber());
		System.out.println("Account Type is: " + a15.getAccountType());
		System.out.println("Branch is: " + a15.getBranch());
		System.out.println("Balance is: " + a15.getBalance());

		System.out.println("===========================BankAccount 16 Details=================================");
		System.out.println("Object Reference is: " + a16);
		System.out.println("AccountHolderName is: " + a16.getAccountHolderName());
		System.out.println("AccountNumber is: " + a16.getAccountNumber());
		System.out.println("Account Type is: " + a16.getAccountType());
		System.out.println("Branch is: " + a16.getBranch());
		System.out.println("Balance is: " + a16.getBalance());

		System.out.println("===========================BankAccount 17 Details=================================");
		System.out.println("Object Reference is: " + a17);
		System.out.println("AccountHolderName is: " + a17.getAccountHolderName());
		System.out.println("AccountNumber is: " + a17.getAccountNumber());
		System.out.println("Account Type is: " + a17.getAccountType());
		System.out.println("Branch is: " + a17.getBranch());
		System.out.println("Balance is: " + a17.getBalance());

		System.out.println("===========================BankAccount 18 Details=================================");
		System.out.println("Object Reference is: " + a18);
		System.out.println("AccountHolderName is: " + a18.getAccountHolderName());
		System.out.println("AccountNumber is: " + a18.getAccountNumber());
		System.out.println("Account Type is: " + a18.getAccountType());
		System.out.println("Branch is: " + a18.getBranch());
		System.out.println("Balance is: " + a18.getBalance());

		System.out.println("===========================BankAccount 19 Details=================================");
		System.out.println("Object Reference is: " + a19);
		System.out.println("AccountHolderName is: " + a19.getAccountHolderName());
		System.out.println("AccountNumber is: " + a19.getAccountNumber());
		System.out.println("Account Type is: " + a19.getAccountType());
		System.out.println("Branch is: " + a19.getBranch());
		System.out.println("Balance is: " + a19.getBalance());

		System.out.println("===========================BankAccount 20 Details=================================");
		System.out.println("Object Reference is: " + a20);
		System.out.println("AccountHolderName is: " + a20.getAccountHolderName());
		System.out.println("AccountNumber is: " + a20.getAccountNumber());
		System.out.println("Account Type is: " + a20.getAccountType());
		System.out.println("Branch is: " + a20.getBranch());
		System.out.println("Balance is: " + a20.getBalance());

		System.out.println("===========================BankAccount 21 Details=================================");
		System.out.println("Object Reference is: " + a21);
		System.out.println("AccountHolderName is: " + a21.getAccountHolderName());
		System.out.println("AccountNumber is: " + a21.getAccountNumber());
		System.out.println("Account Type is: " + a21.getAccountType());
		System.out.println("Branch is: " + a21.getBranch());
		System.out.println("Balance is: " + a21.getBalance());

		System.out.println("===========================BankAccount 22 Details=================================");
		System.out.println("Object Reference is: " + a22);
		System.out.println("AccountHolderName is: " + a22.getAccountHolderName());
		System.out.println("AccountNumber is: " + a22.getAccountNumber());
		System.out.println("Account Type is: " + a22.getAccountType());
		System.out.println("Branch is: " + a22.getBranch());
		System.out.println("Balance is: " + a22.getBalance());

		System.out.println("===========================BankAccount 23 Details=================================");
		System.out.println("Object Reference is: " + a23);
		System.out.println("AccountHolderName is: " + a23.getAccountHolderName());
		System.out.println("AccountNumber is: " + a23.getAccountNumber());
		System.out.println("Account Type is: " + a23.getAccountType());
		System.out.println("Branch is: " + a23.getBranch());
		System.out.println("Balance is: " + a23.getBalance());

		System.out.println("===========================BankAccount 24 Details=================================");
		System.out.println("Object Reference is: " + a24);
		System.out.println("AccountHolderName is: " + a24.getAccountHolderName());
		System.out.println("AccountNumber is: " + a24.getAccountNumber());
		System.out.println("Account Type is: " + a24.getAccountType());
		System.out.println("Branch is: " + a24.getBranch());
		System.out.println("Balance is: " + a24.getBalance());

		System.out.println("===========================BankAccount 25 Details=================================");
		System.out.println("Object Reference is: " + a25);
		System.out.println("AccountHolderName is: " + a25.getAccountHolderName());
		System.out.println("AccountNumber is: " + a25.getAccountNumber());
		System.out.println("Account Type is: " + a25.getAccountType());
		System.out.println("Branch is: " + a25.getBranch());
		System.out.println("Balance is: " + a25.getBalance());

		System.out.println("===========================BankAccount 26 Details=================================");
		System.out.println("Object Reference is: " + a26);
		System.out.println("AccountHolderName is: " + a26.getAccountHolderName());
		System.out.println("AccountNumber is: " + a26.getAccountNumber());
		System.out.println("Account Type is: " + a26.getAccountType());
		System.out.println("Branch is: " + a26.getBranch());
		System.out.println("Balance is: " + a26.getBalance());

		System.out.println("===========================BankAccount 27 Details=================================");
		System.out.println("Object Reference is: " + a27);
		System.out.println("AccountHolderName is: " + a27.getAccountHolderName());
		System.out.println("AccountNumber is: " + a27.getAccountNumber());
		System.out.println("Account Type is: " + a27.getAccountType());
		System.out.println("Branch is: " + a27.getBranch());
		System.out.println("Balance is: " + a27.getBalance());

		System.out.println("===========================BankAccount 28 Details=================================");
		System.out.println("Object Reference is: " + a28);
		System.out.println("AccountHolderName is: " + a28.getAccountHolderName());
		System.out.println("AccountNumber is: " + a28.getAccountNumber());
		System.out.println("Account Type is: " + a28.getAccountType());
		System.out.println("Branch is: " + a28.getBranch());
		System.out.println("Balance is: " + a28.getBalance());

		System.out.println("===========================BankAccount 29 Details=================================");
		System.out.println("Object Reference is: " + a29);
		System.out.println("AccountHolderName is: " + a29.getAccountHolderName());
		System.out.println("AccountNumber is: " + a29.getAccountNumber());
		System.out.println("Account Type is: " + a29.getAccountType());
		System.out.println("Branch is: " + a29.getBranch());
		System.out.println("Balance is: " + a29.getBalance());

		System.out.println("===========================BankAccount 30 Details=================================");
		System.out.println("Object Reference is: " + a30);
		System.out.println("AccountHolderName is: " + a30.getAccountHolderName());
		System.out.println("AccountNumber is: " + a30.getAccountNumber());
		System.out.println("Account Type is: " + a30.getAccountType());
		System.out.println("Branch is: " + a30.getBranch());
		System.out.println("Balance is: " + a30.getBalance());

		System.out.println("===========================BankAccount 31 Details=================================");
		System.out.println("Object Reference is: " + a31);
		System.out.println("AccountHolderName is: " + a31.getAccountHolderName());
		System.out.println("AccountNumber is: " + a31.getAccountNumber());
		System.out.println("Account Type is: " + a31.getAccountType());
		System.out.println("Branch is: " + a31.getBranch());
		System.out.println("Balance is: " + a31.getBalance());

		System.out.println("===========================BankAccount 32 Details=================================");
		System.out.println("Object Reference is: " + a32);
		System.out.println("AccountHolderName is: " + a32.getAccountHolderName());
		System.out.println("AccountNumber is: " + a32.getAccountNumber());
		System.out.println("Account Type is: " + a32.getAccountType());
		System.out.println("Branch is: " + a32.getBranch());
		System.out.println("Balance is: " + a32.getBalance());

		System.out.println("===========================BankAccount 33 Details=================================");
		System.out.println("Object Reference is: " + a33);
		System.out.println("AccountHolderName is: " + a33.getAccountHolderName());
		System.out.println("AccountNumber is: " + a33.getAccountNumber());
		System.out.println("Account Type is: " + a33.getAccountType());
		System.out.println("Branch is: " + a33.getBranch());
		System.out.println("Balance is: " + a33.getBalance());

		System.out.println("===========================BankAccount 34 Details=================================");
		System.out.println("Object Reference is: " + a34);
		System.out.println("AccountHolderName is: " + a34.getAccountHolderName());
		System.out.println("AccountNumber is: " + a34.getAccountNumber());
		System.out.println("Account Type is: " + a34.getAccountType());
		System.out.println("Branch is: " + a34.getBranch());
		System.out.println("Balance is: " + a34.getBalance());

		System.out.println("===========================BankAccount 35 Details=================================");
		System.out.println("Object Reference is: " + a35);
		System.out.println("AccountHolderName is: " + a35.getAccountHolderName());
		System.out.println("AccountNumber is: " + a35.getAccountNumber());
		System.out.println("Account Type is: " + a35.getAccountType());
		System.out.println("Branch is: " + a35.getBranch());
		System.out.println("Balance is: " + a35.getBalance());

		System.out.println("===========================BankAccount 36 Details=================================");
		System.out.println("Object Reference is: " + a36);
		System.out.println("AccountHolderName is: " + a36.getAccountHolderName());
		System.out.println("AccountNumber is: " + a36.getAccountNumber());
		System.out.println("Account Type is: " + a36.getAccountType());
		System.out.println("Branch is: " + a36.getBranch());
		System.out.println("Balance is: " + a36.getBalance());

		System.out.println("===========================BankAccount 37 Details=================================");
		System.out.println("Object Reference is: " + a37);
		System.out.println("AccountHolderName is: " + a37.getAccountHolderName());
		System.out.println("AccountNumber is: " + a37.getAccountNumber());
		System.out.println("Account Type is: " + a37.getAccountType());
		System.out.println("Branch is: " + a37.getBranch());
		System.out.println("Balance is: " + a37.getBalance());

		System.out.println("===========================BankAccount 38 Details=================================");
		System.out.println("Object Reference is: " + a38);
		System.out.println("AccountHolderName is: " + a38.getAccountHolderName());
		System.out.println("AccountNumber is: " + a38.getAccountNumber());
		System.out.println("Account Type is: " + a38.getAccountType());
		System.out.println("Branch is: " + a38.getBranch());
		System.out.println("Balance is: " + a38.getBalance());

		System.out.println("===========================BankAccount 39 Details=================================");
		System.out.println("Object Reference is: " + a39);
		System.out.println("AccountHolderName is: " + a39.getAccountHolderName());
		System.out.println("AccountNumber is: " + a39.getAccountNumber());
		System.out.println("Account Type is: " + a39.getAccountType());
		System.out.println("Branch is: " + a39.getBranch());
		System.out.println("Balance is: " + a39.getBalance());

		System.out.println("===========================BankAccount 40 Details=================================");
		System.out.println("Object Reference is: " + a40);
		System.out.println("AccountHolderName is: " + a40.getAccountHolderName());
		System.out.println("AccountNumber is: " + a40.getAccountNumber());
		System.out.println("Account Type is: " + a40.getAccountType());
		System.out.println("Branch is: " + a40.getBranch());
		System.out.println("Balance is: " + a40.getBalance());

		System.out.println("===========================BankAccount 41 Details=================================");
		System.out.println("Object Reference is: " + a41);
		System.out.println("AccountHolderName is: " + a41.getAccountHolderName());
		System.out.println("AccountNumber is: " + a41.getAccountNumber());
		System.out.println("Account Type is: " + a41.getAccountType());
		System.out.println("Branch is: " + a41.getBranch());
		System.out.println("Balance is: " + a41.getBalance());

		System.out.println("===========================BankAccount 42 Details=================================");
		System.out.println("Object Reference is: " + a42);
		System.out.println("AccountHolderName is: " + a42.getAccountHolderName());
		System.out.println("AccountNumber is: " + a42.getAccountNumber());
		System.out.println("Account Type is: " + a42.getAccountType());
		System.out.println("Branch is: " + a42.getBranch());
		System.out.println("Balance is: " + a42.getBalance());

		System.out.println("===========================BankAccount 43 Details=================================");
		System.out.println("Object Reference is: " + a43);
		System.out.println("AccountHolderName is: " + a43.getAccountHolderName());
		System.out.println("AccountNumber is: " + a43.getAccountNumber());
		System.out.println("Account Type is: " + a43.getAccountType());
		System.out.println("Branch is: " + a43.getBranch());
		System.out.println("Balance is: " + a43.getBalance());

		System.out.println("===========================BankAccount 44 Details=================================");
		System.out.println("Object Reference is: " + a44);
		System.out.println("AccountHolderName is: " + a44.getAccountHolderName());
		System.out.println("AccountNumber is: " + a44.getAccountNumber());
		System.out.println("Account Type is: " + a44.getAccountType());
		System.out.println("Branch is: " + a44.getBranch());
		System.out.println("Balance is: " + a44.getBalance());

		System.out.println("===========================BankAccount 45 Details=================================");
		System.out.println("Object Reference is: " + a45);
		System.out.println("AccountHolderName is: " + a45.getAccountHolderName());
		System.out.println("AccountNumber is: " + a45.getAccountNumber());
		System.out.println("Account Type is: " + a45.getAccountType());
		System.out.println("Branch is: " + a45.getBranch());
		System.out.println("Balance is: " + a45.getBalance());

		System.out.println("===========================BankAccount 46 Details=================================");
		System.out.println("Object Reference is: " + a46);
		System.out.println("AccountHolderName is: " + a46.getAccountHolderName());
		System.out.println("AccountNumber is: " + a46.getAccountNumber());
		System.out.println("Account Type is: " + a46.getAccountType());
		System.out.println("Branch is: " + a46.getBranch());
		System.out.println("Balance is: " + a46.getBalance());

		System.out.println("===========================BankAccount 47 Details=================================");
		System.out.println("Object Reference is: " + a47);
		System.out.println("AccountHolderName is: " + a47.getAccountHolderName());
		System.out.println("AccountNumber is: " + a47.getAccountNumber());
		System.out.println("Account Type is: " + a47.getAccountType());
		System.out.println("Branch is: " + a47.getBranch());
		System.out.println("Balance is: " + a47.getBalance());

		System.out.println("===========================BankAccount 48 Details=================================");
		System.out.println("Object Reference is: " + a48);
		System.out.println("AccountHolderName is: " + a48.getAccountHolderName());
		System.out.println("AccountNumber is: " + a48.getAccountNumber());
		System.out.println("Account Type is: " + a48.getAccountType());
		System.out.println("Branch is: " + a48.getBranch());
		System.out.println("Balance is: " + a48.getBalance());

		System.out.println("===========================BankAccount 49 Details=================================");
		System.out.println("Object Reference is: " + a49);
		System.out.println("AccountHolderName is: " + a49.getAccountHolderName());
		System.out.println("AccountNumber is: " + a49.getAccountNumber());
		System.out.println("Account Type is: " + a49.getAccountType());
		System.out.println("Branch is: " + a49.getBranch());
		System.out.println("Balance is: " + a49.getBalance());

		System.out.println("===========================BankAccount 50 Details=================================");
		System.out.println("Object Reference is: " + a50);
		System.out.println("AccountHolderName is: " + a50.getAccountHolderName());
		System.out.println("AccountNumber is: " + a50.getAccountNumber());
		System.out.println("Account Type is: " + a50.getAccountType());
		System.out.println("Branch is: " + a50.getBranch());
		System.out.println("Balance is: " + a50.getBalance());
		
		System.out.println("=================================Main Method Ends================================");

	}

}
