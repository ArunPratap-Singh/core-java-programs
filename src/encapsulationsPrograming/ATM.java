package encapsulationsPrograming;

public class ATM {
	
		private String cardHolderName;
		private String cardNumber;
		private String bankName;
		private int pin;
		private double balance;


		ATM(){
			
		}
		
		ATM(String cardHolderName, String cardNumber, String bankName, int pin, double balance) {

			this.cardHolderName = cardHolderName;
			this.cardNumber = cardNumber;
			this.bankName = bankName;
			this.pin = pin;
			this.balance = balance;
		}


		public void setCardHolderName(String cardHolderName) {

			if(cardHolderName.length() > 3 && cardHolderName.length() <= 50 && !cardHolderName.isBlank() && cardHolderName.matches("[A-Z a-z]+"))

				this.cardHolderName = cardHolderName;

			else

				System.out.println("Wrong Card Holder Name");
		}


		public String getCardHolderName() {

			return cardHolderName;
		}


		public void setCardNumber(String cardNumber) {

			if(cardNumber.length() == 16 && cardNumber.matches("[0-9]+"))

				this.cardNumber = cardNumber;

			else

				System.out.println("Invalid Card Number");
		}


		public String getCardNumber() {

			return cardNumber;
		}


		public void setBankName(String bankName) {

			if(bankName.length() > 2 && bankName.length() <= 50 && !bankName.isBlank() && bankName.matches("[A-Z a-z]+"))

				this.bankName = bankName;

			else

				System.out.println("Wrong Bank Name");
		}


		public String getBankName() {

			return bankName;
		}


		public void setPin(int pin) {

			if(pin >= 1000 && pin <= 9999)

				this.pin = pin;

			else

				System.out.println("Invalid PIN");
		}


		public boolean verifyPin(int enteredPin) {

			return this.pin == enteredPin;
		}

		public void setBalance(double balance) {
		
			if(balance > 0) 
				
				this.balance = balance;
			else
				
				System.out.println("Invalid Amount Entered");
				
				
		}	
		
		public double getBalance() {

			return balance;
		}


		public void deposit(double amount) {

			if(amount > 0) {

				balance = balance + amount;

				System.out.println("Amount Deposited Successfully");
				System.out.println("Deposited Amount is: " +amount);
			}
			else {

				System.out.println("Invalid Deposit Amount");
			}
		}


		public void withdraw(double amount, int enteredPin) {

			if(!verifyPin(enteredPin)) {

				System.out.println("Invalid PIN");
			}
			else if(amount <= 0) {

				System.out.println("Invalid Withdrawal Amount");
			}
			else if(amount > balance) {

				System.out.println("Insufficient Balance");
			}
			else {

				balance = balance - amount;

				System.out.println("Withdrawal Successful");
				System.out.println("Withdrawl Amount is: " +amount);
			}
		}
	

}
