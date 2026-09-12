package methodChaining;

public class ATMTransaction {
	
		private String customerName;
		private String bankName;
		private String accountNumber;
		private String cardNumber;
		private String transactionId;
		private String transactionType;
		private double transactionAmount;
		private double availableBalance;
		private String atmLocation;
		private String transactionDate;
		private String transactionTime;
		private String paymentMode;
		private String transactionStatus;
		
		//Setters

		public ATMTransaction setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		public ATMTransaction setBankName(String bankName) {
			this.bankName = bankName;
			return this;
		}

		public ATMTransaction setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public ATMTransaction setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}

		public ATMTransaction setTransactionId(String transactionId) {
			this.transactionId = transactionId;
			return this;
		}

		public ATMTransaction setTransactionType(String transactionType) {
			this.transactionType = transactionType;
			return this;
		}

		public ATMTransaction setTransactionAmount(double transactionAmount) {
			this.transactionAmount = transactionAmount;
			return this;
		}

		public ATMTransaction setAvailableBalance(double availableBalance) {
			this.availableBalance = availableBalance;
			return this;
		}

		public ATMTransaction setAtmLocation(String atmLocation) {
			this.atmLocation = atmLocation;
			return this;
		}

		public ATMTransaction setTransactionDate(String transactionDate) {
			this.transactionDate = transactionDate;
			return this;
		}

		public ATMTransaction setTransactionTime(String transactionTime) {
			this.transactionTime = transactionTime;
			return this;
		}

		public ATMTransaction setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public ATMTransaction setTransactionStatus(String transactionStatus) {
			this.transactionStatus = transactionStatus;
			return this;
		}
		
		//Getters

		public ATMTransaction printCustomerName() {
			System.out.println("Customer Name: " + customerName);
			return this;
		}

		public ATMTransaction printBankName() {
			System.out.println("Bank Name: " + bankName);
			return this;
		}

		public ATMTransaction printAccountNumber() {
			System.out.println("Account Number: " + accountNumber);
			return this;
		}

		public ATMTransaction printCardNumber() {
			System.out.println("Card Number: " + cardNumber);
			return this;
		}

		public ATMTransaction printTransactionId() {
			System.out.println("Transaction ID: " + transactionId);
			return this;
		}

		public ATMTransaction printTransactionType() {
			System.out.println("Transaction Type: " + transactionType);
			return this;
		}

		public ATMTransaction printTransactionAmount() {
			System.out.println("Transaction Amount: " + transactionAmount);
			return this;
		}

		public ATMTransaction printAvailableBalance() {
			System.out.println("Available Balance: " + availableBalance);
			return this;
		}

		public ATMTransaction printAtmLocation() {
			System.out.println("ATM Location: " + atmLocation);
			return this;
		}

		public ATMTransaction printTransactionDate() {
			System.out.println("Transaction Date: " + transactionDate);
			return this;
		}

		public ATMTransaction printTransactionTime() {
			System.out.println("Transaction Time: " + transactionTime);
			return this;
		}

		public ATMTransaction printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public ATMTransaction printTransactionStatus() {
			System.out.println("Transaction Status: " + transactionStatus);
			return this;
		}
	

}
