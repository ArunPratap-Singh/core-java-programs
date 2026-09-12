package encapsulationsPrograming;

public class Bank {
	
		private String bankName;
		private String bankCode;
		private String branchName;
		private String managerName;
		private String accountDetails;
		private int totalAccounts;
		
		Bank(){
			
		}	


		Bank(String bankName, String bankCode, String branchName, String managerName, String accountDetails, int totalAccounts) {

			this.bankName = bankName;
			this.bankCode = bankCode;
			this.branchName = branchName;
			this.managerName = managerName;
			this.accountDetails = accountDetails;
			this.totalAccounts = totalAccounts;
		}


		public void setBankName(String bankName) {

			if(bankName != null && bankName.length() > 2 && bankName.length() <= 100 && !bankName.isBlank() && bankName.matches("[A-Z a-z 0-9 \s]+"))

				this.bankName = bankName;

			else

				System.out.println("Wrong Bank Name");
		}


		public String getBankName() {

			return bankName;
		}


		public void setBankCode(String bankCode) {

			if(bankCode != null && bankCode.length() >= 4 && bankCode.length() <= 20 && !bankCode.isBlank() && bankCode.matches("[A-Z a-z 0-9]+"))

				this.bankCode = bankCode;

			else

				System.out.println("Invalid Bank Code");
		}


		public String getBankCode() {

			return bankCode;
		}


		public void setBranchName(String branchName) {

			if(branchName != null && branchName.length() > 2 && branchName.length() <= 50 && !branchName.isBlank() && branchName.matches("[A-Z a-z 0-9 ]+"))

				this.branchName = branchName;

			else

				System.out.println("Wrong Branch Name");
		}


		public String getBranchName() {

			return branchName;
		}


		public void setManagerName(String managerName) {

			if(managerName != null && managerName.length() > 3 && managerName.length() <= 50 && !managerName.isBlank() && managerName.matches("[A-Z a-z \s]+"))

				this.managerName = managerName;

			else

				System.out.println("Wrong Manager Name");
		}


		public String getManagerName() {

			return managerName;
		}


		public void setAccountDetails(String accountDetails) {

			if(accountDetails != null && accountDetails.length() >= 5 && accountDetails.length() <= 500 && !accountDetails.isBlank())

				this.accountDetails = accountDetails;

			else

				System.out.println("Invalid Account Details");
		}


		public String getAccountDetails() {

			return accountDetails;
		}


		public void setTotalAccounts(int totalAccounts) {

			if(totalAccounts >= 0)

				this.totalAccounts = totalAccounts;

			else

				System.out.println("Invalid Total Accounts");
		}


		public int getTotalAccounts() {

			return totalAccounts;
		}


		public void addAccount(String accountName, String accountNumber) {

			if(accountName != null && !accountName.isBlank() && accountNumber != null && !accountNumber.isBlank()) {

				accountDetails = accountDetails + ", " + accountName + " (" + accountNumber + ") ";
				
				totalAccounts++;
				
				System.out.println("Account Added Successfully");
				
			}else
					System.out.println("Invalid Account Information");
		}


		public void removeAccount() {

			if(totalAccounts > 0) {

				totalAccounts--;

				System.out.println("Account Removed Successfully");
			}
			else {

				System.out.println("No Account Available");
			}
		}

	

}
