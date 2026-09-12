package methodChaining;

public class BankAccount {
	
		private long accountNo;
		private String accountHolderName;
		private String accountType;
		private double balance;
		private String bankName;
		
		BankAccount(){
			
		}

		public BankAccount setAccountNo(long accountNo) {

			this.accountNo = accountNo;

			return this;
		}

		public BankAccount setAccountHolderName(String accountHolderName) {

			this.accountHolderName = accountHolderName;

			return this;
		}

		public BankAccount setAccountType(String accountType) {

			this.accountType = accountType;

			return this;
		}

		public BankAccount setBalance(double balance) {

			this.balance = balance;

			return this;
		}

		public BankAccount setBankName(String bankName) {

			this.bankName = bankName;

			return this;
		}

		public BankAccount printAccountNo() {

			System.out.println("Account No is: " + accountNo);

			return this;
		}

		public BankAccount printAccountHolderName() {

			System.out.println("Account Holder Name is: " + accountHolderName);

			return this;
		}

		public BankAccount printAccountType() {

			System.out.println("Account Type is: " + accountType);

			return this;
		}

		public BankAccount printBalance() {

			System.out.println("Balance is: " + balance);

			return this;
		}

		public BankAccount printBankName() {

			System.out.println("Bank Name is: " + bankName);

			return this;
		}
	

}
