package pojoPrograming;

public class BankAccount {
	
		private String accountNumber;
		private String holderName;
		private String accountType;
		private double balance;
		private String bankName;
		private String branch;
		private String ifscCode;
		private long contact;
		private String email;
		private String address;
		private String nomineeName;
		private String accountStatus;
		private int openingYear;

		public BankAccount() {

		}

		public BankAccount(String accountNumber, String holderName, String accountType, double balance, String bankName, String branch, String ifscCode, long contact, String email, String address, String nomineeName, String accountStatus, int openingYear) {

			this.accountNumber = accountNumber;
			this.holderName = holderName;
			this.accountType = accountType;
			this.balance = balance;
			this.bankName = bankName;
			this.branch = branch;
			this.ifscCode = ifscCode;
			this.contact = contact;
			this.email = email;
			this.address = address;
			this.nomineeName = nomineeName;
			this.accountStatus = accountStatus;
			this.openingYear = openingYear;
		}


		public String getAccountNumber() {

			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {

			this.accountNumber = accountNumber;
		}


		public String getHolderName() {

			return holderName;
		}

		public void setHolderName(String holderName) {

			this.holderName = holderName;
		}

		public String getAccountType() {

			return accountType;
		}

		public void setAccountType(String accountType) {

			this.accountType = accountType;
		}


		public double getBalance() {

			return balance;
		}

		public void setBalance(double balance) {

			this.balance = balance;
		}


		public String getBankName() {

			return bankName;
		}

		public void setBankName(String bankName) {

			this.bankName = bankName;
		}


		public String getBranch() {

			return branch;
		}

		public void setBranch(String branch) {

			this.branch = branch;
		}

		public String getIfscCode() {

			return ifscCode;
		}

		public void setIfscCode(String ifscCode) {

			this.ifscCode = ifscCode;
		}

		public long getContact() {

			return contact;
		}

		public void setContact(long contact) {

			this.contact = contact;
		}


		public String getEmail() {

			return email;
		}

		public void setEmail(String email) {

			this.email = email;
		}

		public String getAddress() {

			return address;
		}

		public void setAddress(String address) {

			this.address = address;
		}


		public String getNomineeName() {

			return nomineeName;
		}

		public void setNomineeName(String nomineeName) {

			this.nomineeName = nomineeName;
		}

		public String getAccountStatus() {

			return accountStatus;
		}

		public void setAccountStatus(String accountStatus) {

			this.accountStatus = accountStatus;
		}

		public int getOpeningYear() {

			return openingYear;
		}

		public void setOpeningYear(int openingYear) {

			this.openingYear = openingYear;
		}

	

}
