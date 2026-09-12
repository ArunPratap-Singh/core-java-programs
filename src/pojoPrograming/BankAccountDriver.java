package pojoPrograming;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		System.out.println("==============================Main Method Starts=================================");
		
		BankAccount a1 = new BankAccount("ACC101", "Mohan Singh", "Savings", 250000.50, "SBI", "Noida", "SBIN0001234", 9876543210L, "mohan@gmail.com", "Noida", "Rohan Singh", "Active", 2020);
		BankAccount a2 = new BankAccount("ACC102", "Rohan Kumar", "Current", 350000.75, "HDFC Bank", "Lucknow", "HDFC0001234", 9876543211L, "rohan@gmail.com", "Lucknow", "Amit Kumar", "Active", 2019);
		BankAccount a3 = new BankAccount("ACC103", "Sohan Sharma", "Savings", 185000.25, "ICICI Bank", "Delhi", "ICIC0002345", 9876543212L, "sohan@gmail.com", "Delhi", "Rahul Sharma", "Active", 2021);
		BankAccount a4 = new BankAccount("ACC104", "Rahul Verma", "Salary", 425000.50, "Axis Bank", "Mumbai", "UTIB0003456", 9876543213L, "rahul@gmail.com", "Mumbai", "Karan Verma", "Active", 2018);
		BankAccount a5 = new BankAccount("ACC105", "Shyam Gupta", "Savings", 275500.00, "PNB", "Pune", "PUNB0004567", 9876543214L, "shyam@gmail.com", "Pune", "Mohan Gupta", "Active", 2022);
		BankAccount a6 = new BankAccount("ACC106", "Manoj Singh", "Current", 625000.80, "Bank of Baroda", "Kanpur", "BARB0005678", 9876543215L, "manoj@gmail.com", "Kanpur", "Suresh Singh", "Active", 2017);
		BankAccount a7 = new BankAccount("ACC107", "Akash Kumar", "Savings", 150000.40, "Kotak Mahindra Bank", "Noida", "KKBK0006789", 9876543216L, "akash@gmail.com", "Noida", "Vikas Kumar", "Active", 2023);
		BankAccount a8 = new BankAccount("ACC108", "Samarth Singh", "Salary", 480000.60, "Canara Bank", "Jaipur", "CNRB0007890", 9876543217L, "samarth@gmail.com", "Jaipur", "Akash Singh", "Active", 2020);
		BankAccount a9 = new BankAccount("ACC109", "Abhishek Kumar", "Savings", 210750.90, "Union Bank", "Ahmedabad", "UBIN0008901", 9876543218L, "abhishek@gmail.com", "Ahmedabad", "Rakesh Kumar", "Active", 2021);
		BankAccount a10 = new BankAccount("ACC110", "Karan Singh", "Current", 575000.35, "IDBI Bank", "Gurugram", "IBKL0009012", 9876543219L, "karan@gmail.com", "Gurugram", "Deepak Singh", "Active", 2016);

		
		System.out.println("=========================Bank Account Details 1=========================");

		System.out.println("Object Reference is: " + a1);
		System.out.println("Account Number is: " + a1.getAccountNumber());
		System.out.println("Holder Name is: " + a1.getHolderName());
		System.out.println("Account Type is: " + a1.getAccountType());
		System.out.println("Balance is: " + a1.getBalance());
		System.out.println("Bank Name is: " + a1.getBankName());
		System.out.println("Branch is: " + a1.getBranch());
		System.out.println("IFSC Code is: " + a1.getIfscCode());
		System.out.println("Contact is: " + a1.getContact());
		System.out.println("Email is: " + a1.getEmail());
		System.out.println("Address is: " + a1.getAddress());
		System.out.println("Nominee Name is: " + a1.getNomineeName());
		System.out.println("Account Status is: " + a1.getAccountStatus());
		System.out.println("Opening Year is: " + a1.getOpeningYear());


		System.out.println("=========================Bank Account Details 2=========================");

		System.out.println("Object Reference is: " + a2);
		System.out.println("Account Number is: " + a2.getAccountNumber());
		System.out.println("Holder Name is: " + a2.getHolderName());
		System.out.println("Account Type is: " + a2.getAccountType());
		System.out.println("Balance is: " + a2.getBalance());
		System.out.println("Bank Name is: " + a2.getBankName());
		System.out.println("Branch is: " + a2.getBranch());
		System.out.println("IFSC Code is: " + a2.getIfscCode());
		System.out.println("Contact is: " + a2.getContact());
		System.out.println("Email is: " + a2.getEmail());
		System.out.println("Address is: " + a2.getAddress());
		System.out.println("Nominee Name is: " + a2.getNomineeName());
		System.out.println("Account Status is: " + a2.getAccountStatus());
		System.out.println("Opening Year is: " + a2.getOpeningYear());


		System.out.println("=========================Bank Account Details 3=========================");

		System.out.println("Object Reference is: " + a3);
		System.out.println("Account Number is: " + a3.getAccountNumber());
		System.out.println("Holder Name is: " + a3.getHolderName());
		System.out.println("Account Type is: " + a3.getAccountType());
		System.out.println("Balance is: " + a3.getBalance());
		System.out.println("Bank Name is: " + a3.getBankName());
		System.out.println("Branch is: " + a3.getBranch());
		System.out.println("IFSC Code is: " + a3.getIfscCode());
		System.out.println("Contact is: " + a3.getContact());
		System.out.println("Email is: " + a3.getEmail());
		System.out.println("Address is: " + a3.getAddress());
		System.out.println("Nominee Name is: " + a3.getNomineeName());
		System.out.println("Account Status is: " + a3.getAccountStatus());
		System.out.println("Opening Year is: " + a3.getOpeningYear());


		System.out.println("=========================Bank Account Details 4=========================");

		System.out.println("Object Reference is: " + a4);
		System.out.println("Account Number is: " + a4.getAccountNumber());
		System.out.println("Holder Name is: " + a4.getHolderName());
		System.out.println("Account Type is: " + a4.getAccountType());
		System.out.println("Balance is: " + a4.getBalance());
		System.out.println("Bank Name is: " + a4.getBankName());
		System.out.println("Branch is: " + a4.getBranch());
		System.out.println("IFSC Code is: " + a4.getIfscCode());
		System.out.println("Contact is: " + a4.getContact());
		System.out.println("Email is: " + a4.getEmail());
		System.out.println("Address is: " + a4.getAddress());
		System.out.println("Nominee Name is: " + a4.getNomineeName());
		System.out.println("Account Status is: " + a4.getAccountStatus());
		System.out.println("Opening Year is: " + a4.getOpeningYear());


		System.out.println("=========================Bank Account Details 5=========================");

		System.out.println("Object Reference is: " + a5);
		System.out.println("Account Number is: " + a5.getAccountNumber());
		System.out.println("Holder Name is: " + a5.getHolderName());
		System.out.println("Account Type is: " + a5.getAccountType());
		System.out.println("Balance is: " + a5.getBalance());
		System.out.println("Bank Name is: " + a5.getBankName());
		System.out.println("Branch is: " + a5.getBranch());
		System.out.println("IFSC Code is: " + a5.getIfscCode());
		System.out.println("Contact is: " + a5.getContact());
		System.out.println("Email is: " + a5.getEmail());
		System.out.println("Address is: " + a5.getAddress());
		System.out.println("Nominee Name is: " + a5.getNomineeName());
		System.out.println("Account Status is: " + a5.getAccountStatus());
		System.out.println("Opening Year is: " + a5.getOpeningYear());


		System.out.println("=========================Bank Account Details 6=========================");

		System.out.println("Object Reference is: " + a6);
		System.out.println("Account Number is: " + a6.getAccountNumber());
		System.out.println("Holder Name is: " + a6.getHolderName());
		System.out.println("Account Type is: " + a6.getAccountType());
		System.out.println("Balance is: " + a6.getBalance());
		System.out.println("Bank Name is: " + a6.getBankName());
		System.out.println("Branch is: " + a6.getBranch());
		System.out.println("IFSC Code is: " + a6.getIfscCode());
		System.out.println("Contact is: " + a6.getContact());
		System.out.println("Email is: " + a6.getEmail());
		System.out.println("Address is: " + a6.getAddress());
		System.out.println("Nominee Name is: " + a6.getNomineeName());
		System.out.println("Account Status is: " + a6.getAccountStatus());
		System.out.println("Opening Year is: " + a6.getOpeningYear());


		System.out.println("=========================Bank Account Details 7=========================");

		System.out.println("Object Reference is: " + a7);
		System.out.println("Account Number is: " + a7.getAccountNumber());
		System.out.println("Holder Name is: " + a7.getHolderName());
		System.out.println("Account Type is: " + a7.getAccountType());
		System.out.println("Balance is: " + a7.getBalance());
		System.out.println("Bank Name is: " + a7.getBankName());
		System.out.println("Branch is: " + a7.getBranch());
		System.out.println("IFSC Code is: " + a7.getIfscCode());
		System.out.println("Contact is: " + a7.getContact());
		System.out.println("Email is: " + a7.getEmail());
		System.out.println("Address is: " + a7.getAddress());
		System.out.println("Nominee Name is: " + a7.getNomineeName());
		System.out.println("Account Status is: " + a7.getAccountStatus());
		System.out.println("Opening Year is: " + a7.getOpeningYear());


		System.out.println("=========================Bank Account Details 8=========================");

		System.out.println("Object Reference is: " + a8);
		System.out.println("Account Number is: " + a8.getAccountNumber());
		System.out.println("Holder Name is: " + a8.getHolderName());
		System.out.println("Account Type is: " + a8.getAccountType());
		System.out.println("Balance is: " + a8.getBalance());
		System.out.println("Bank Name is: " + a8.getBankName());
		System.out.println("Branch is: " + a8.getBranch());
		System.out.println("IFSC Code is: " + a8.getIfscCode());
		System.out.println("Contact is: " + a8.getContact());
		System.out.println("Email is: " + a8.getEmail());
		System.out.println("Address is: " + a8.getAddress());
		System.out.println("Nominee Name is: " + a8.getNomineeName());
		System.out.println("Account Status is: " + a8.getAccountStatus());
		System.out.println("Opening Year is: " + a8.getOpeningYear());


		System.out.println("=========================Bank Account Details 9=========================");

		System.out.println("Object Reference is: " + a9);
		System.out.println("Account Number is: " + a9.getAccountNumber());
		System.out.println("Holder Name is: " + a9.getHolderName());
		System.out.println("Account Type is: " + a9.getAccountType());
		System.out.println("Balance is: " + a9.getBalance());
		System.out.println("Bank Name is: " + a9.getBankName());
		System.out.println("Branch is: " + a9.getBranch());
		System.out.println("IFSC Code is: " + a9.getIfscCode());
		System.out.println("Contact is: " + a9.getContact());
		System.out.println("Email is: " + a9.getEmail());
		System.out.println("Address is: " + a9.getAddress());
		System.out.println("Nominee Name is: " + a9.getNomineeName());
		System.out.println("Account Status is: " + a9.getAccountStatus());
		System.out.println("Opening Year is: " + a9.getOpeningYear());


		System.out.println("=========================Bank Account Details 10=========================");

		System.out.println("Object Reference is: " + a10);
		System.out.println("Account Number is: " + a10.getAccountNumber());
		System.out.println("Holder Name is: " + a10.getHolderName());
		System.out.println("Account Type is: " + a10.getAccountType());
		System.out.println("Balance is: " + a10.getBalance());
		System.out.println("Bank Name is: " + a10.getBankName());
		System.out.println("Branch is: " + a10.getBranch());
		System.out.println("IFSC Code is: " + a10.getIfscCode());
		System.out.println("Contact is: " + a10.getContact());
		System.out.println("Email is: " + a10.getEmail());
		System.out.println("Address is: " + a10.getAddress());
		System.out.println("Nominee Name is: " + a10.getNomineeName());
		System.out.println("Account Status is: " + a10.getAccountStatus());
		System.out.println("Opening Year is: " + a10.getOpeningYear());

		System.out.println("================================Main Method Ends========================================");
	}

}
