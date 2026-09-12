package eagerSingletonClass;

public class ATMMachine {

	private static ATMMachine atm = new ATMMachine();

	private String bankName;
	private String location;
	private boolean operational;

	private ATMMachine() {

		bankName = "ABC Bank";
		location = "Lucknow";
		operational = true;

		System.out.println("ATMMachine Object Created");
	}

	public static ATMMachine getInstance() {

		return atm;
	}

	public void displayATMDetails() {

		System.out.println("Bank Name  : " + bankName);
		System.out.println("Location   : " + location);
		System.out.println("Operational: " + operational);
	}

	public void checkBalance(String accountNumber, double balance) {

		System.out.println("Account Number: " + accountNumber);
		System.out.println("Available Balance: ₹" + balance);
	}

	public void withdraw(String accountNumber, double balance, double amount) {

		if (amount <= balance) {

			balance = balance - amount;

			System.out.println("Withdrawal Successful");

			System.out.println("Withdrawn Amount: ₹" + amount);

			System.out.println("Remaining Balance: ₹" + balance);

		} else {

			System.out.println("Insufficient Balance");
		}
	}

	public void deposit(String accountNumber, double balance, double amount) {

		balance = balance + amount;

		System.out.println("Deposit Successful");

		System.out.println("Deposited Amount: ₹" + amount);

		System.out.println("Updated Balance: ₹" + balance);
	}

	public void setOperational(boolean operational) {

		this.operational = operational;
	}

}
