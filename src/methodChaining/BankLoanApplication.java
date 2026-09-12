package methodChaining;

public class BankLoanApplication {
	
		private String applicantName;
		private String bankName;
		private String applicationNumber;
		private String loanType;
		private String employmentType;
		private String companyName;
		private double monthlyIncome;
		private double loanAmount;
		private int loanTenure;
		private double interestRate;
		private double monthlyEMI;
		private String bankBranch;
		private String applicationDate;
		private String applicationStatus;
		
		//Setters

		public BankLoanApplication setApplicantName(String applicantName) {
			this.applicantName = applicantName;
			return this;
		}

		public BankLoanApplication setBankName(String bankName) {
			this.bankName = bankName;
			return this;
		}

		public BankLoanApplication setApplicationNumber(String applicationNumber) {
			this.applicationNumber = applicationNumber;
			return this;
		}

		public BankLoanApplication setLoanType(String loanType) {
			this.loanType = loanType;
			return this;
		}

		public BankLoanApplication setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
			return this;
		}

		public BankLoanApplication setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public BankLoanApplication setMonthlyIncome(double monthlyIncome) {
			this.monthlyIncome = monthlyIncome;
			return this;
		}

		public BankLoanApplication setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
			return this;
		}

		public BankLoanApplication setLoanTenure(int loanTenure) {
			this.loanTenure = loanTenure;
			return this;
		}

		public BankLoanApplication setInterestRate(double interestRate) {
			this.interestRate = interestRate;
			return this;
		}

		public BankLoanApplication setMonthlyEMI(double monthlyEMI) {
			this.monthlyEMI = monthlyEMI;
			return this;
		}

		public BankLoanApplication setBankBranch(String bankBranch) {
			this.bankBranch = bankBranch;
			return this;
		}

		public BankLoanApplication setApplicationDate(String applicationDate) {
			this.applicationDate = applicationDate;
			return this;
		}

		public BankLoanApplication setApplicationStatus(String applicationStatus) {
			this.applicationStatus = applicationStatus;
			return this;
		}
		
		//Getters

		public BankLoanApplication printApplicantName() {
			System.out.println("Applicant Name: " + applicantName);
			return this;
		}

		public BankLoanApplication printBankName() {
			System.out.println("Bank Name: " + bankName);
			return this;
		}

		public BankLoanApplication printApplicationNumber() {
			System.out.println("Application Number: " + applicationNumber);
			return this;
		}

		public BankLoanApplication printLoanType() {
			System.out.println("Loan Type: " + loanType);
			return this;
		}

		public BankLoanApplication printEmploymentType() {
			System.out.println("Employment Type: " + employmentType);
			return this;
		}

		public BankLoanApplication printCompanyName() {
			System.out.println("Company Name: " + companyName);
			return this;
		}

		public BankLoanApplication printMonthlyIncome() {
			System.out.println("Monthly Income: " + monthlyIncome);
			return this;
		}

		public BankLoanApplication printLoanAmount() {
			System.out.println("Loan Amount: " + loanAmount);
			return this;
		}

		public BankLoanApplication printLoanTenure() {
			System.out.println("Loan Tenure: " + loanTenure + " years");
			return this;
		}

		public BankLoanApplication printInterestRate() {
			System.out.println("Interest Rate: " + interestRate + "%");
			return this;
		}

		public BankLoanApplication printMonthlyEMI() {
			System.out.println("Monthly EMI: " + monthlyEMI);
			return this;
		}

		public BankLoanApplication printBankBranch() {
			System.out.println("Bank Branch: " + bankBranch);
			return this;
		}

		public BankLoanApplication printApplicationDate() {
			System.out.println("Application Date: " + applicationDate);
			return this;
		}

		public BankLoanApplication printApplicationStatus() {
			System.out.println("Application Status: " + applicationStatus);
			return this;
		}
	

}
