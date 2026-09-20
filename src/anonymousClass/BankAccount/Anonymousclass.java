package anonymousClass.BankAccount;

public class Anonymousclass {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount() {
			
			double balance = 10000;
			
			@Override
			public void withdraw(double amount) {
				
				if(amount > 0) {
					
					balance = balance - amount;
					
					System.out.println("Amount withdrawn : " +amount);
					System.out.println("Amount withdrawn successfully");
				}
				
			}
			
			@Override
			public void deposit(double amount) {
				
				if(amount > 0 ) {
					
					balance = balance + amount;
					
					System.out.println("Deposited amount: " +amount);
					System.out.println("Amount deposited successfully");
					
					
				}
				
			}
			
			@Override
			public void checkBalance() {
			
				System.out.println("Current balance is: " +balance);
				
			}
		};
		
		account.checkBalance();
		account.deposit(100000);
		account.checkBalance();
		account.withdraw(15000);
		account.checkBalance();

	}

}
