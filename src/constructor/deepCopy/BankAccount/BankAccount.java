package constructor.deepCopy.BankAccount;

public class BankAccount {
	
		String accountNumber;
		String accountType;
		double balance;
		String branch;
		Customer c;

		BankAccount() {

		}

		BankAccount(String accountNumber, String accountType, double balance, String branch, Customer c) {

			this.accountNumber = accountNumber;
			this.accountType = accountType;
			this.balance = balance;
			this.branch = branch;
			this.c = c;

		}

		//deep copy
		BankAccount(BankAccount b) {

			this.accountNumber = b.accountNumber;
			this.accountType = b.accountType;
			this.balance = b.balance;
			this.branch = b.branch;
			this.c = new Customer();
			this.c.age = b.c.age;
			this.c.city = b.c.city;
			this.c.customerId = b.c.customerId;
			this.c.customerName = b.c.customerName;
			this.c.gender = b.c.gender;
			this.c.occupation = b.c.occupation;

		}

		public String toString() {

			return "AccountNumber is: " + accountNumber + "\nAccountType is: " + accountType + "\nBalance is: " + balance + "\nBranch is: " + branch + "\nC is: " + c + "\n========================";

		}

	

}
