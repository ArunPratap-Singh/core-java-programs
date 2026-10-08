package abstraction.BankAccount;

public class SavingAccount extends BankAccount {

	double interestRate;
	double minimumBalance;
	int withdrawalLimit;
	boolean atmCard;
	boolean internetBanking;

	SavingAccount() {

	}

	SavingAccount(int accountNumber, String accountHolderName, String accountType, String bankName, String branchName,
			String ifscCode, String city, String phoneNumber, String email, double balance, double interestRate,
			double minimumBalance, int withdrawalLimit, boolean atmCard, boolean internetBanking) {

		super(accountNumber, accountHolderName, accountType, bankName, branchName, ifscCode, city, phoneNumber, email, balance);

		this.interestRate = interestRate;
		this.minimumBalance = minimumBalance;
		this.withdrawalLimit = withdrawalLimit;
		this.atmCard = atmCard;
		this.internetBanking = internetBanking;
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

		} else if (amount > balance) {

			System.out.println("Insufficient Balance");

		} else if ((balance - amount) < minimumBalance) {

			System.out.println("Minimum Balance Requirement Not Maintained");

		} else {

			balance = balance - amount;

			System.out.println("Amount Withdrawn : " + amount);
			System.out.println("Updated Balance  : " + balance);
		}
	}

	
	@Override
	public double calculateInterest() {

		return balance * interestRate / 100;
	}

	
	@Override
	public String toString() {

		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountType=" + accountType + ", bankName=" + bankName + ", branchName=" + branchName
				+ ", ifscCode=" + ifscCode + ", city=" + city + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", balance=" + balance + ", interestRate=" + interestRate + ", minimumBalance=" + minimumBalance
				+ ", withdrawalLimit=" + withdrawalLimit + ", atmCard=" + atmCard + ", internetBanking="
				+ internetBanking + "]";
	}
}