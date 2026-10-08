package abstraction.BankAccount;

public class CurrentAccount extends BankAccount {

	double overdraftLimit;
	double transactionLimit;
	double serviceCharge;
	boolean chequeBook;
	boolean businessAccount;

	CurrentAccount() {

	}

	CurrentAccount(int accountNumber, String accountHolderName, String accountType, String bankName,
			String branchName, String ifscCode, String city, String phoneNumber, String email, double balance,
			double overdraftLimit, double transactionLimit, double serviceCharge, boolean chequeBook,
			boolean businessAccount) {

		super(accountNumber, accountHolderName, accountType, bankName, branchName, ifscCode, city, phoneNumber, email, balance);

		this.overdraftLimit = overdraftLimit;
		this.transactionLimit = transactionLimit;
		this.serviceCharge = serviceCharge;
		this.chequeBook = chequeBook;
		this.businessAccount = businessAccount;
	}

	
	@Override
	public void deposit(double amount) {

		if (amount > 0) {

			balance = balance + amount;

			System.out.println("Amount Deposited : " + amount);
			System.out.println("Updated Balance  : " + balance);

		} else {

			System.out.println("Invalid Deposit Amount");
		}
	}

	
	@Override
	public void withdraw(double amount) {

		if (amount <= 0) {

			System.out.println("Invalid Withdrawal Amount");

		} else if (amount > balance + overdraftLimit) {

			System.out.println("Overdraft Limit Exceeded");

		} else {

			balance = balance - amount;

			System.out.println("Amount Withdrawn : " + amount);
			System.out.println("Updated Balance  : " + balance);
		}
	}

	
	@Override
	public double calculateInterest() {

		// Current account generally does not provide regular
		// savings-style interest.
		return 0;
	}

	
	@Override
	public String toString() {

		return "CurrentAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountType=" + accountType + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", ifscCode=" + ifscCode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", balance=" + balance + ", overdraftLimit=" + overdraftLimit + ", transactionLimit="
				+ transactionLimit + ", serviceCharge=" + serviceCharge + ", chequeBook=" + chequeBook
				+ ", businessAccount=" + businessAccount + "]";
	}
}
