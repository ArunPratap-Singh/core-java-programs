package abstraction.BankAccount;

public abstract class BankAccount {

	int accountNumber;
	String accountHolderName;
	String accountType;
	String bankName;
	String branchName;
	String ifscCode;
	String city;
	String phoneNumber;
	String email;
	double balance;

	BankAccount() {

	}

	BankAccount(int accountNumber, String accountHolderName, String accountType, String bankName,
			String branchName, String ifscCode, String city, String phoneNumber, String email, double balance) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.balance = balance;
	}

	
	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract double calculateInterest();

	public void checkBalance() {

		System.out.println("Current Balance : " + balance);
	}

	@Override
	public String toString() {

		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountType=" + accountType + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", ifscCode=" + ifscCode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", balance=" + balance + "]";
	}
}