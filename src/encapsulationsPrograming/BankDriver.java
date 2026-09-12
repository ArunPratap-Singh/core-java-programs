package encapsulationsPrograming;

public class BankDriver {

	public static void main(String[] args) {
		
		System.out.println("===================================Main Method Starts========================================");
		Bank b1 = new Bank("SBI", "SBI101", "Noida", "Mr. Sharma", "Mohan(ACC101), Rohan(ACC102), Sohan(ACC103)", 3);
		Bank b2 = new Bank("HDFC Bank", "HDFC102", "Lucknow", "Mr. Verma", "Rahul(ACC201), Shyam(ACC202), Amit(ACC203)", 3);
		Bank b3 = new Bank("ICICI Bank", "ICICI103", "Delhi", "Mr. Gupta", "Ankit(ACC301), Ravi(ACC302), Pankaj(ACC303)", 3);
		Bank b4 = new Bank("Axis Bank", "AXIS104", "Mumbai", "Mrs. Mehta", "Karan(ACC401), Nitin(ACC402), Varun(ACC403)", 3);
		Bank b5 = new Bank("PNB", "PNB105", "Pune", "Mr. Singh", "Akash(ACC501), Deepak(ACC502), Vivek(ACC503)", 3);
		Bank b6 = new Bank("Bank of Baroda", "BOB106", "Jaipur", "Mr. Kumar", "Raj(ACC601), Mohit(ACC602), Suresh(ACC603)", 3);
		Bank b7 = new Bank("Canara Bank", "CAN107", "Hyderabad", "Mr. Gupta", "Ajay(ACC701), Vikas(ACC702), Tarun(ACC703)", 3);
		Bank b8 = new Bank("Union Bank", "UNION108", "Gurugram", "Mrs. Kapoor", "Arjun(ACC801), Kunal(ACC802), Manish(ACC803)", 3);
		Bank b9 = new Bank("Indian Bank", "IND109", "Chennai", "Mr. Mishra", "Ravi(ACC901), Amit(ACC902), Lokesh(ACC903)", 3);
		Bank b10 = new Bank("Bank of India", "BOI110", "Kolkata", "Mrs. Tiwari", "Neeraj(ACC1001), Pankaj(ACC1002), Sanjay(ACC1003)", 3);

		Bank b11 = new Bank("IDBI Bank", "IDBI111", "Noida", "Mr. Sharma", "Aman(ACC1101), Rohit(ACC1102), Sandeep(ACC1103)", 3);
		Bank b12 = new Bank("Kotak Mahindra Bank", "KOTAK112", "Lucknow", "Mrs. Verma", "Piyush(ACC1201), Naveen(ACC1202), Ashish(ACC1203)", 3);
		Bank b13 = new Bank("Yes Bank", "YES113", "Delhi", "Mr. Gupta", "Sumit(ACC1301), Anuj(ACC1302), Manish(ACC1303)", 3);
		Bank b14 = new Bank("IndusInd Bank", "INDUS114", "Mumbai", "Mrs. Mehta", "Rakesh(ACC1401), Varun(ACC1402), Nitin(ACC1403)", 3);
		Bank b15 = new Bank("Federal Bank", "FED115", "Pune", "Mr. Singh", "Akash(ACC1501), Kunal(ACC1502), Deepak(ACC1503)", 3);
		Bank b16 = new Bank("Bank of Maharashtra", "BOM116", "Nagpur", "Mr. Kumar", "Rajesh(ACC1601), Sohan(ACC1602), Vivek(ACC1603)", 3);
		Bank b17 = new Bank("UCO Bank", "UCO117", "Kolkata", "Mr. Gupta", "Ajit(ACC1701), Vikas(ACC1702), Tarun(ACC1703)", 3);
		Bank b18 = new Bank("Indian Overseas Bank", "IOB118", "Chennai", "Mrs. Kapoor", "Arjun(ACC1801), Karan(ACC1802), Manish(ACC1803)", 3);
		Bank b19 = new Bank("Central Bank of India", "CBI119", "Bhopal", "Mr. Mishra", "Lokesh(ACC1901), Sanjay(ACC1902), Ravi(ACC1903)", 3);
		Bank b20 = new Bank("Punjab Sind Bank", "PSB120", "Amritsar", "Mrs. Tiwari", "Neeraj(ACC2001), Shyam(ACC2002), Amit(ACC2003)", 3);

		Bank b21 = new Bank("SBI", "SBI121", "Kanpur", "Mr. Sharma", "Mohan(ACC2101), Rahul(ACC2102), Kunal(ACC2103)", 3);
		Bank b22 = new Bank("HDFC Bank", "HDFC122", "Gurugram", "Mr. Verma", "Suresh(ACC2201), Pankaj(ACC2202), Rohit(ACC2203)", 3);
		Bank b23 = new Bank("ICICI Bank", "ICICI123", "Lucknow", "Mr. Gupta", "Deepak(ACC2301), Amit(ACC2302), Naveen(ACC2303)", 3);
		Bank b24 = new Bank("Axis Bank", "AXIS124", "Noida", "Mrs. Mehta", "Karan(ACC2401), Varun(ACC2402), Ashish(ACC2403)", 3);
		Bank b25 = new Bank("PNB", "PNB125", "Mumbai", "Mr. Singh", "Akash(ACC2501), Manoj(ACC2502), Vivek(ACC2503)", 3);
		Bank b26 = new Bank("Bank of Baroda", "BOB126", "Delhi", "Mr. Kumar", "Raj(ACC2601), Sohan(ACC2602), Piyush(ACC2603)", 3);
		Bank b27 = new Bank("Canara Bank", "CAN127", "Bangalore", "Mr. Gupta", "Ajay(ACC2701), Tarun(ACC2702), Vikas(ACC2703)", 3);
		Bank b28 = new Bank("Union Bank", "UNION128", "Hyderabad", "Mrs. Kapoor", "Arjun(ACC2801), Manish(ACC2802), Rakesh(ACC2803)", 3);
		Bank b29 = new Bank("Indian Bank", "IND129", "Chennai", "Mr. Mishra", "Lokesh(ACC2901), Ravi(ACC2902), Sanjay(ACC2903)", 3);
		Bank b30 = new Bank("Bank of India", "BOI130", "Kolkata", "Mrs. Tiwari", "Neeraj(ACC3001), Amit(ACC3002), Suresh(ACC3003)", 3);

		Bank b31 = new Bank("IDBI Bank", "IDBI131", "Jaipur", "Mr. Sharma", "Aman(ACC3101), Rohit(ACC3102), Mohit(ACC3103)", 3);
		Bank b32 = new Bank("Kotak Mahindra Bank", "KOTAK132", "Pune", "Mrs. Verma", "Naveen(ACC3201), Pankaj(ACC3202), Shyam(ACC3203)", 3);
		Bank b33 = new Bank("Yes Bank", "YES133", "Mumbai", "Mr. Gupta", "Sumit(ACC3301), Ankit(ACC3302), Rahul(ACC3303)", 3);
		Bank b34 = new Bank("IndusInd Bank", "INDUS134", "Chennai", "Mrs. Mehta", "Rohan(ACC3401), Deepak(ACC3402), Karan(ACC3403)", 3);
		Bank b35 = new Bank("Federal Bank", "FED135", "Bangalore", "Mr. Singh", "Manoj(ACC3501), Ajay(ACC3502), Varun(ACC3503)", 3);
		Bank b36 = new Bank("Bank of Maharashtra", "BOM136", "Hyderabad", "Mr. Kumar", "Akash(ACC3601), Vivek(ACC3602), Raj(ACC3603)", 3);
		Bank b37 = new Bank("UCO Bank", "UCO137", "Noida", "Mr. Gupta", "Sohan(ACC3701), Mohit(ACC3702), Tarun(ACC3703)", 3);
		Bank b38 = new Bank("Indian Overseas Bank", "IOB138", "Delhi", "Mrs. Kapoor", "Arjun(ACC3801), Nitin(ACC3802), Kunal(ACC3803)", 3);
		Bank b39 = new Bank("Central Bank of India", "CBI139", "Lucknow", "Mr. Mishra", "Lokesh(ACC3901), Sanjay(ACC3902), Piyush(ACC3903)", 3);
		Bank b40 = new Bank("Punjab Sind Bank", "PSB140", "Pune", "Mrs. Tiwari", "Neeraj(ACC4001), Shyam(ACC4002), Rakesh(ACC4003)", 3);

		Bank b41 = new Bank("SBI", "SBI141", "Mumbai", "Mr. Sharma", "Mohan(ACC4101), Suresh(ACC4102), Amit(ACC4103)", 3);
		Bank b42 = new Bank("HDFC Bank", "HDFC142", "Bangalore", "Mr. Verma", "Rahul(ACC4201), Ashish(ACC4202), Pankaj(ACC4203)", 3);
		Bank b43 = new Bank("ICICI Bank", "ICICI143", "Hyderabad", "Mr. Gupta", "Ankit(ACC4301), Ravi(ACC4302), Deepak(ACC4303)", 3);
		Bank b44 = new Bank("Axis Bank", "AXIS144", "Noida", "Mrs. Mehta", "Karan(ACC4401), Varun(ACC4402), Mohit(ACC4403)", 3);
		Bank b45 = new Bank("PNB", "PNB145", "Delhi", "Mr. Singh", "Akash(ACC4501), Vivek(ACC4502), Raj(ACC4503)", 3);
		Bank b46 = new Bank("Bank of Baroda", "BOB146", "Lucknow", "Mr. Kumar", "Sohan(ACC4601), Piyush(ACC4602), Aman(ACC4603)", 3);
		Bank b47 = new Bank("Canara Bank", "CAN147", "Pune", "Mr. Gupta", "Ajay(ACC4701), Tarun(ACC4702), Nitin(ACC4703)", 3);
		Bank b48 = new Bank("Union Bank", "UNION148", "Mumbai", "Mrs. Kapoor", "Arjun(ACC4801), Manish(ACC4802), Rohan(ACC4803)", 3);
		Bank b49 = new Bank("Indian Bank", "IND149", "Bangalore", "Mr. Mishra", "Lokesh(ACC4901), Sanjay(ACC4902), Neeraj(ACC4903)", 3);
		Bank b50 = new Bank("Bank of India", "BOI150", "Hyderabad", "Mrs. Tiwari", "Rakesh(ACC5001), Shyam(ACC5002), Amit(ACC5003)", 3);
		
				
		System.out.println("=========================Bank Multiple Account Details 1===========================");
		System.out.println("Object Reference is: " + b1);
		System.out.println("Bank Name is: " + b1.getBankName());
		System.out.println("Bank Code is: " + b1.getBankCode());
		System.out.println("Branch Name is: " + b1.getBranchName());
		System.out.println("Manager Name is: " + b1.getManagerName());
		System.out.println("Account Details are: " + b1.getAccountDetails());
		System.out.println("Total Accounts are: " + b1.getTotalAccounts());
		System.out.println("============================================");
		
		System.out.println("=========================Bank Multiple Account Details 2===========================");
		System.out.println("Object Reference is: " + b2);
		System.out.println("Bank Name is: " + b2.getBankName());
		System.out.println("Bank Code is: " + b2.getBankCode());
		System.out.println("Branch Name is: " + b2.getBranchName());
		System.out.println("Manager Name is: " + b2.getManagerName());
		System.out.println("Account Details are: " + b2.getAccountDetails());
		System.out.println("Total Accounts are: " + b2.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 3===========================");
		System.out.println("Object Reference is: " + b3);
		System.out.println("Bank Name is: " + b3.getBankName());
		System.out.println("Bank Code is: " + b3.getBankCode());
		System.out.println("Branch Name is: " + b3.getBranchName());
		System.out.println("Manager Name is: " + b3.getManagerName());
		System.out.println("Account Details are: " + b3.getAccountDetails());
		System.out.println("Total Accounts are: " + b3.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 4===========================");
		System.out.println("Object Reference is: " + b4);
		System.out.println("Bank Name is: " + b4.getBankName());
		System.out.println("Bank Code is: " + b4.getBankCode());
		System.out.println("Branch Name is: " + b4.getBranchName());
		System.out.println("Manager Name is: " + b4.getManagerName());
		System.out.println("Account Details are: " + b4.getAccountDetails());
		System.out.println("Total Accounts are: " + b4.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 5===========================");
		System.out.println("Object Reference is: " + b5);
		System.out.println("Bank Name is: " + b5.getBankName());
		System.out.println("Bank Code is: " + b5.getBankCode());
		System.out.println("Branch Name is: " + b5.getBranchName());
		System.out.println("Manager Name is: " + b5.getManagerName());
		System.out.println("Account Details are: " + b5.getAccountDetails());
		System.out.println("Total Accounts are: " + b5.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 6===========================");
		System.out.println("Object Reference is: " + b6);
		System.out.println("Bank Name is: " + b6.getBankName());
		System.out.println("Bank Code is: " + b6.getBankCode());
		System.out.println("Branch Name is: " + b6.getBranchName());
		System.out.println("Manager Name is: " + b6.getManagerName());
		System.out.println("Account Details are: " + b6.getAccountDetails());
		System.out.println("Total Accounts are: " + b6.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 7===========================");
		System.out.println("Object Reference is: " + b7);
		System.out.println("Bank Name is: " + b7.getBankName());
		System.out.println("Bank Code is: " + b7.getBankCode());
		System.out.println("Branch Name is: " + b7.getBranchName());
		System.out.println("Manager Name is: " + b7.getManagerName());
		System.out.println("Account Details are: " + b7.getAccountDetails());
		System.out.println("Total Accounts are: " + b7.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 8===========================");
		System.out.println("Object Reference is: " + b8);
		System.out.println("Bank Name is: " + b8.getBankName());
		System.out.println("Bank Code is: " + b8.getBankCode());
		System.out.println("Branch Name is: " + b8.getBranchName());
		System.out.println("Manager Name is: " + b8.getManagerName());
		System.out.println("Account Details are: " + b8.getAccountDetails());
		System.out.println("Total Accounts are: " + b8.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 9===========================");
		System.out.println("Object Reference is: " + b9);
		System.out.println("Bank Name is: " + b9.getBankName());
		System.out.println("Bank Code is: " + b9.getBankCode());
		System.out.println("Branch Name is: " + b9.getBranchName());
		System.out.println("Manager Name is: " + b9.getManagerName());
		System.out.println("Account Details are: " + b9.getAccountDetails());
		System.out.println("Total Accounts are: " + b9.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 10===========================");
		System.out.println("Object Reference is: " + b10);
		System.out.println("Bank Name is: " + b10.getBankName());
		System.out.println("Bank Code is: " + b10.getBankCode());
		System.out.println("Branch Name is: " + b10.getBranchName());
		System.out.println("Manager Name is: " + b10.getManagerName());
		System.out.println("Account Details are: " + b10.getAccountDetails());
		System.out.println("Total Accounts are: " + b10.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 11===========================");
		System.out.println("Object Reference is: " + b11);
		System.out.println("Bank Name is: " + b11.getBankName());
		System.out.println("Bank Code is: " + b11.getBankCode());
		System.out.println("Branch Name is: " + b11.getBranchName());
		System.out.println("Manager Name is: " + b11.getManagerName());
		System.out.println("Account Details are: " + b11.getAccountDetails());
		System.out.println("Total Accounts are: " + b11.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 12===========================");
		System.out.println("Object Reference is: " + b12);
		System.out.println("Bank Name is: " + b12.getBankName());
		System.out.println("Bank Code is: " + b12.getBankCode());
		System.out.println("Branch Name is: " + b12.getBranchName());
		System.out.println("Manager Name is: " + b12.getManagerName());
		System.out.println("Account Details are: " + b12.getAccountDetails());
		System.out.println("Total Accounts are: " + b12.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 13===========================");
		System.out.println("Object Reference is: " + b13);
		System.out.println("Bank Name is: " + b13.getBankName());
		System.out.println("Bank Code is: " + b13.getBankCode());
		System.out.println("Branch Name is: " + b13.getBranchName());
		System.out.println("Manager Name is: " + b13.getManagerName());
		System.out.println("Account Details are: " + b13.getAccountDetails());
		System.out.println("Total Accounts are: " + b13.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 14===========================");
		System.out.println("Object Reference is: " + b14);
		System.out.println("Bank Name is: " + b14.getBankName());
		System.out.println("Bank Code is: " + b14.getBankCode());
		System.out.println("Branch Name is: " + b14.getBranchName());
		System.out.println("Manager Name is: " + b14.getManagerName());
		System.out.println("Account Details are: " + b14.getAccountDetails());
		System.out.println("Total Accounts are: " + b14.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 15===========================");
		System.out.println("Object Reference is: " + b15);
		System.out.println("Bank Name is: " + b15.getBankName());
		System.out.println("Bank Code is: " + b15.getBankCode());
		System.out.println("Branch Name is: " + b15.getBranchName());
		System.out.println("Manager Name is: " + b15.getManagerName());
		System.out.println("Account Details are: " + b15.getAccountDetails());
		System.out.println("Total Accounts are: " + b15.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 16===========================");
		System.out.println("Object Reference is: " + b16);
		System.out.println("Bank Name is: " + b16.getBankName());
		System.out.println("Bank Code is: " + b16.getBankCode());
		System.out.println("Branch Name is: " + b16.getBranchName());
		System.out.println("Manager Name is: " + b16.getManagerName());
		System.out.println("Account Details are: " + b16.getAccountDetails());
		System.out.println("Total Accounts are: " + b16.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 17===========================");
		System.out.println("Object Reference is: " + b17);
		System.out.println("Bank Name is: " + b17.getBankName());
		System.out.println("Bank Code is: " + b17.getBankCode());
		System.out.println("Branch Name is: " + b17.getBranchName());
		System.out.println("Manager Name is: " + b17.getManagerName());
		System.out.println("Account Details are: " + b17.getAccountDetails());
		System.out.println("Total Accounts are: " + b17.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 18===========================");
		System.out.println("Object Reference is: " + b18);
		System.out.println("Bank Name is: " + b18.getBankName());
		System.out.println("Bank Code is: " + b18.getBankCode());
		System.out.println("Branch Name is: " + b18.getBranchName());
		System.out.println("Manager Name is: " + b18.getManagerName());
		System.out.println("Account Details are: " + b18.getAccountDetails());
		System.out.println("Total Accounts are: " + b18.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 19===========================");
		System.out.println("Object Reference is: " + b19);
		System.out.println("Bank Name is: " + b19.getBankName());
		System.out.println("Bank Code is: " + b19.getBankCode());
		System.out.println("Branch Name is: " + b19.getBranchName());
		System.out.println("Manager Name is: " + b19.getManagerName());
		System.out.println("Account Details are: " + b19.getAccountDetails());
		System.out.println("Total Accounts are: " + b19.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 20===========================");
		System.out.println("Object Reference is: " + b20);
		System.out.println("Bank Name is: " + b20.getBankName());
		System.out.println("Bank Code is: " + b20.getBankCode());
		System.out.println("Branch Name is: " + b20.getBranchName());
		System.out.println("Manager Name is: " + b20.getManagerName());
		System.out.println("Account Details are: " + b20.getAccountDetails());
		System.out.println("Total Accounts are: " + b20.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 21===========================");
		System.out.println("Object Reference is: " + b21);
		System.out.println("Bank Name is: " + b21.getBankName());
		System.out.println("Bank Code is: " + b21.getBankCode());
		System.out.println("Branch Name is: " + b21.getBranchName());
		System.out.println("Manager Name is: " + b21.getManagerName());
		System.out.println("Account Details are: " + b21.getAccountDetails());
		System.out.println("Total Accounts are: " + b21.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 22===========================");
		System.out.println("Object Reference is: " + b22);
		System.out.println("Bank Name is: " + b22.getBankName());
		System.out.println("Bank Code is: " + b22.getBankCode());
		System.out.println("Branch Name is: " + b22.getBranchName());
		System.out.println("Manager Name is: " + b22.getManagerName());
		System.out.println("Account Details are: " + b22.getAccountDetails());
		System.out.println("Total Accounts are: " + b22.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 23===========================");
		System.out.println("Object Reference is: " + b23);
		System.out.println("Bank Name is: " + b23.getBankName());
		System.out.println("Bank Code is: " + b23.getBankCode());
		System.out.println("Branch Name is: " + b23.getBranchName());
		System.out.println("Manager Name is: " + b23.getManagerName());
		System.out.println("Account Details are: " + b23.getAccountDetails());
		System.out.println("Total Accounts are: " + b23.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 24===========================");
		System.out.println("Object Reference is: " + b24);
		System.out.println("Bank Name is: " + b24.getBankName());
		System.out.println("Bank Code is: " + b24.getBankCode());
		System.out.println("Branch Name is: " + b24.getBranchName());
		System.out.println("Manager Name is: " + b24.getManagerName());
		System.out.println("Account Details are: " + b24.getAccountDetails());
		System.out.println("Total Accounts are: " + b24.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 25===========================");
		System.out.println("Object Reference is: " + b25);
		System.out.println("Bank Name is: " + b25.getBankName());
		System.out.println("Bank Code is: " + b25.getBankCode());
		System.out.println("Branch Name is: " + b25.getBranchName());
		System.out.println("Manager Name is: " + b25.getManagerName());
		System.out.println("Account Details are: " + b25.getAccountDetails());
		System.out.println("Total Accounts are: " + b25.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 26===========================");
		System.out.println("Object Reference is: " + b26);
		System.out.println("Bank Name is: " + b26.getBankName());
		System.out.println("Bank Code is: " + b26.getBankCode());
		System.out.println("Branch Name is: " + b26.getBranchName());
		System.out.println("Manager Name is: " + b26.getManagerName());
		System.out.println("Account Details are: " + b26.getAccountDetails());
		System.out.println("Total Accounts are: " + b26.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 27===========================");
		System.out.println("Object Reference is: " + b27);
		System.out.println("Bank Name is: " + b27.getBankName());
		System.out.println("Bank Code is: " + b27.getBankCode());
		System.out.println("Branch Name is: " + b27.getBranchName());
		System.out.println("Manager Name is: " + b27.getManagerName());
		System.out.println("Account Details are: " + b27.getAccountDetails());
		System.out.println("Total Accounts are: " + b27.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 28===========================");
		System.out.println("Object Reference is: " + b28);
		System.out.println("Bank Name is: " + b28.getBankName());
		System.out.println("Bank Code is: " + b28.getBankCode());
		System.out.println("Branch Name is: " + b28.getBranchName());
		System.out.println("Manager Name is: " + b28.getManagerName());
		System.out.println("Account Details are: " + b28.getAccountDetails());
		System.out.println("Total Accounts are: " + b28.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 29===========================");
		System.out.println("Object Reference is: " + b29);
		System.out.println("Bank Name is: " + b29.getBankName());
		System.out.println("Bank Code is: " + b29.getBankCode());
		System.out.println("Branch Name is: " + b29.getBranchName());
		System.out.println("Manager Name is: " + b29.getManagerName());
		System.out.println("Account Details are: " + b29.getAccountDetails());
		System.out.println("Total Accounts are: " + b29.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 30===========================");
		System.out.println("Object Reference is: " + b30);
		System.out.println("Bank Name is: " + b30.getBankName());
		System.out.println("Bank Code is: " + b30.getBankCode());
		System.out.println("Branch Name is: " + b30.getBranchName());
		System.out.println("Manager Name is: " + b30.getManagerName());
		System.out.println("Account Details are: " + b30.getAccountDetails());
		System.out.println("Total Accounts are: " + b30.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 31===========================");
		System.out.println("Object Reference is: " + b31);
		System.out.println("Bank Name is: " + b31.getBankName());
		System.out.println("Bank Code is: " + b31.getBankCode());
		System.out.println("Branch Name is: " + b31.getBranchName());
		System.out.println("Manager Name is: " + b31.getManagerName());
		System.out.println("Account Details are: " + b31.getAccountDetails());
		System.out.println("Total Accounts are: " + b31.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 32===========================");
		System.out.println("Object Reference is: " + b32);
		System.out.println("Bank Name is: " + b32.getBankName());
		System.out.println("Bank Code is: " + b32.getBankCode());
		System.out.println("Branch Name is: " + b32.getBranchName());
		System.out.println("Manager Name is: " + b32.getManagerName());
		System.out.println("Account Details are: " + b32.getAccountDetails());
		System.out.println("Total Accounts are: " + b32.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 33===========================");
		System.out.println("Object Reference is: " + b33);
		System.out.println("Bank Name is: " + b33.getBankName());
		System.out.println("Bank Code is: " + b33.getBankCode());
		System.out.println("Branch Name is: " + b33.getBranchName());
		System.out.println("Manager Name is: " + b33.getManagerName());
		System.out.println("Account Details are: " + b33.getAccountDetails());
		System.out.println("Total Accounts are: " + b33.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 34===========================");
		System.out.println("Object Reference is: " + b34);
		System.out.println("Bank Name is: " + b34.getBankName());
		System.out.println("Bank Code is: " + b34.getBankCode());
		System.out.println("Branch Name is: " + b34.getBranchName());
		System.out.println("Manager Name is: " + b34.getManagerName());
		System.out.println("Account Details are: " + b34.getAccountDetails());
		System.out.println("Total Accounts are: " + b34.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 35===========================");
		System.out.println("Object Reference is: " + b35);
		System.out.println("Bank Name is: " + b35.getBankName());
		System.out.println("Bank Code is: " + b35.getBankCode());
		System.out.println("Branch Name is: " + b35.getBranchName());
		System.out.println("Manager Name is: " + b35.getManagerName());
		System.out.println("Account Details are: " + b35.getAccountDetails());
		System.out.println("Total Accounts are: " + b35.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 36===========================");
		System.out.println("Object Reference is: " + b36);
		System.out.println("Bank Name is: " + b36.getBankName());
		System.out.println("Bank Code is: " + b36.getBankCode());
		System.out.println("Branch Name is: " + b36.getBranchName());
		System.out.println("Manager Name is: " + b36.getManagerName());
		System.out.println("Account Details are: " + b36.getAccountDetails());
		System.out.println("Total Accounts are: " + b36.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 37===========================");
		System.out.println("Object Reference is: " + b37);
		System.out.println("Bank Name is: " + b37.getBankName());
		System.out.println("Bank Code is: " + b37.getBankCode());
		System.out.println("Branch Name is: " + b37.getBranchName());
		System.out.println("Manager Name is: " + b37.getManagerName());
		System.out.println("Account Details are: " + b37.getAccountDetails());
		System.out.println("Total Accounts are: " + b37.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 38===========================");
		System.out.println("Object Reference is: " + b38);
		System.out.println("Bank Name is: " + b38.getBankName());
		System.out.println("Bank Code is: " + b38.getBankCode());
		System.out.println("Branch Name is: " + b38.getBranchName());
		System.out.println("Manager Name is: " + b38.getManagerName());
		System.out.println("Account Details are: " + b38.getAccountDetails());
		System.out.println("Total Accounts are: " + b38.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 39===========================");
		System.out.println("Object Reference is: " + b39);
		System.out.println("Bank Name is: " + b39.getBankName());
		System.out.println("Bank Code is: " + b39.getBankCode());
		System.out.println("Branch Name is: " + b39.getBranchName());
		System.out.println("Manager Name is: " + b39.getManagerName());
		System.out.println("Account Details are: " + b39.getAccountDetails());
		System.out.println("Total Accounts are: " + b39.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 40===========================");
		System.out.println("Object Reference is: " + b40);
		System.out.println("Bank Name is: " + b40.getBankName());
		System.out.println("Bank Code is: " + b40.getBankCode());
		System.out.println("Branch Name is: " + b40.getBranchName());
		System.out.println("Manager Name is: " + b40.getManagerName());
		System.out.println("Account Details are: " + b40.getAccountDetails());
		System.out.println("Total Accounts are: " + b40.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 41===========================");
		System.out.println("Object Reference is: " + b41);
		System.out.println("Bank Name is: " + b41.getBankName());
		System.out.println("Bank Code is: " + b41.getBankCode());
		System.out.println("Branch Name is: " + b41.getBranchName());
		System.out.println("Manager Name is: " + b41.getManagerName());
		System.out.println("Account Details are: " + b41.getAccountDetails());
		System.out.println("Total Accounts are: " + b41.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 42===========================");
		System.out.println("Object Reference is: " + b42);
		System.out.println("Bank Name is: " + b42.getBankName());
		System.out.println("Bank Code is: " + b42.getBankCode());
		System.out.println("Branch Name is: " + b42.getBranchName());
		System.out.println("Manager Name is: " + b42.getManagerName());
		System.out.println("Account Details are: " + b42.getAccountDetails());
		System.out.println("Total Accounts are: " + b42.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 43===========================");
		System.out.println("Object Reference is: " + b43);
		System.out.println("Bank Name is: " + b43.getBankName());
		System.out.println("Bank Code is: " + b43.getBankCode());
		System.out.println("Branch Name is: " + b43.getBranchName());
		System.out.println("Manager Name is: " + b43.getManagerName());
		System.out.println("Account Details are: " + b43.getAccountDetails());
		System.out.println("Total Accounts are: " + b43.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 44===========================");
		System.out.println("Object Reference is: " + b44);
		System.out.println("Bank Name is: " + b44.getBankName());
		System.out.println("Bank Code is: " + b44.getBankCode());
		System.out.println("Branch Name is: " + b44.getBranchName());
		System.out.println("Manager Name is: " + b44.getManagerName());
		System.out.println("Account Details are: " + b44.getAccountDetails());
		System.out.println("Total Accounts are: " + b44.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 45===========================");
		System.out.println("Object Reference is: " + b45);
		System.out.println("Bank Name is: " + b45.getBankName());
		System.out.println("Bank Code is: " + b45.getBankCode());
		System.out.println("Branch Name is: " + b45.getBranchName());
		System.out.println("Manager Name is: " + b45.getManagerName());
		System.out.println("Account Details are: " + b45.getAccountDetails());
		System.out.println("Total Accounts are: " + b45.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 46===========================");
		System.out.println("Object Reference is: " + b46);
		System.out.println("Bank Name is: " + b46.getBankName());
		System.out.println("Bank Code is: " + b46.getBankCode());
		System.out.println("Branch Name is: " + b46.getBranchName());
		System.out.println("Manager Name is: " + b46.getManagerName());
		System.out.println("Account Details are: " + b46.getAccountDetails());
		System.out.println("Total Accounts are: " + b46.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 47===========================");
		System.out.println("Object Reference is: " + b47);
		System.out.println("Bank Name is: " + b47.getBankName());
		System.out.println("Bank Code is: " + b47.getBankCode());
		System.out.println("Branch Name is: " + b47.getBranchName());
		System.out.println("Manager Name is: " + b47.getManagerName());
		System.out.println("Account Details are: " + b47.getAccountDetails());
		System.out.println("Total Accounts are: " + b47.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 48===========================");
		System.out.println("Object Reference is: " + b48);
		System.out.println("Bank Name is: " + b48.getBankName());
		System.out.println("Bank Code is: " + b48.getBankCode());
		System.out.println("Branch Name is: " + b48.getBranchName());
		System.out.println("Manager Name is: " + b48.getManagerName());
		System.out.println("Account Details are: " + b48.getAccountDetails());
		System.out.println("Total Accounts are: " + b48.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 49===========================");
		System.out.println("Object Reference is: " + b49);
		System.out.println("Bank Name is: " + b49.getBankName());
		System.out.println("Bank Code is: " + b49.getBankCode());
		System.out.println("Branch Name is: " + b49.getBranchName());
		System.out.println("Manager Name is: " + b49.getManagerName());
		System.out.println("Account Details are: " + b49.getAccountDetails());
		System.out.println("Total Accounts are: " + b49.getTotalAccounts());
		System.out.println("============================================");

		System.out.println("=========================Bank Multiple Account Details 50===========================");
		System.out.println("Object Reference is: " + b50);
		System.out.println("Bank Name is: " + b50.getBankName());
		System.out.println("Bank Code is: " + b50.getBankCode());
		System.out.println("Branch Name is: " + b50.getBranchName());
		System.out.println("Manager Name is: " + b50.getManagerName());
		System.out.println("Account Details are: " + b50.getAccountDetails());
		System.out.println("Total Accounts are: " + b50.getTotalAccounts());
		System.out.println("============================================");
		
		System.out.println("==================================Main method Ends==========================================");

	}

}
