package encapsulationsPrograming;

public class BankAccount {
	
		private String accountHolderName;
		private String accountNumber;
		private String accountType;
		private String branch;
		private double balance;
		
		BankAccount(){
			
		}

		BankAccount(String accountHolderName, String accountNumber, String accountType, String branch, double balance) {

			this.accountHolderName = accountHolderName;
			this.accountNumber = accountNumber;
			this.accountType = accountType;
			this.branch = branch;
			this.balance = balance;
		}

		public void setAccountHolderName(String accountHolderName) {

			if (accountHolderName.length() > 3 && accountHolderName.length() <= 50 && !accountHolderName.isBlank() && accountHolderName.matches("[A-Za-z \s]+"))

				this.accountHolderName = accountHolderName;

			else
				System.out.println("Wrong Account Holder Name");
		}

		public String getAccountHolderName() {
			return accountHolderName;
		}

		public void setAccountNumber(String accountNumber) {

			if (accountNumber.length() >= 5 && accountNumber.length() <= 20 && !accountNumber.isBlank() && accountNumber.matches("[A-Z a-z 0-9]+"))

				this.accountNumber = accountNumber;

			else
				System.out.println("Invalid Account Number");
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountType(String accountType) {

			if (accountType.equalsIgnoreCase("Savings") || accountType.equalsIgnoreCase("Current") || accountType.equalsIgnoreCase("Salary"))

				this.accountType = accountType;

			else
				System.out.println("Invalid Account Type");
		}

		public String getAccountType() {
			return accountType;
		}

		public void setBranch(String branch) {

			if (branch.length() > 2 && branch.length() <= 50 && !branch.isBlank() && branch.matches("[A-Z a-z \s]+"))

				this.branch = branch;

			else
				System.out.println("Invalid Branch Name");
		}

		public String getBranch() {
			return branch;
		}

		public void setBalance(double balance) {

			if (balance >= 0)
				
				this.balance = balance;

			else
				System.out.println("Wrong Balance Amount");
		}

		public double getBalance() {
			return balance;
		}
	

}
