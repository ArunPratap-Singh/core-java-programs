package anonymousClass.BankTransaction;

import java.util.ArrayList;
import java.util.List;

public class AnonymousClass {

	public static void main(String[] args) {
		
		BankTransaction transaction = new BankTransaction() {
			
			double balance = 100000;
			
			List<String> history = new ArrayList<>();
			
			@Override
			public void withdraw(double amount) {
				
				if (amount <= 0) {

                    System.out.println("Invalid withdrawal amount.");

                } else if (amount > balance) {

                    System.out.println("Insufficient balance.");

                } else {

                    balance = balance - amount;

                    history.add("Withdrawn: Rs. " + amount);

                    System.out.println("Amount Withdrawn : Rs. " + amount);
                    System.out.println("Amount Withdrawn Successfully");
                    System.out.println("Current Balance  : Rs. " + balance);
                }
				
			}
			
			@Override
			public void transfer(double amount) {
		
				if (amount <= 0) {

                    System.out.println("Invalid transfer amount.");

                } else if (amount > balance) {

                    System.out.println("Insufficient balance for transfer.");

                } else {

                    balance = balance - amount;

                    history.add("Transferred: Rs. " + amount);

                    System.out.println("Amount Transferred : Rs. " + amount);
                    System.out.println("Amount Transfered successfully");
                    System.out.println("Current Balance    : Rs. " + balance);
                }
				
			}
			
						
			@Override
			public void deposit(double amount) {
				
				if (amount > 0) {

                    balance = balance + amount;

                    history.add("Deposited: Rs. " + amount);

                    System.out.println("Amount Deposited : Rs. " + amount);
                    System.out.println("Amount deposited successfully");
                    System.out.println("Current Balance  : Rs. " + balance);

                } else {

                    System.out.println("Invalid deposit amount.");
                }
				
			}
			
			@Override
			public void transactionHistory() {
				
				 System.out.println("\nTransaction History");

	                if (history.isEmpty()) {

	                    System.out.println("No transactions available.");

	                } else {

	                    for (String transaction : history) {
	                        System.out.println(transaction);
	                    }
	                }

	                System.out.println("Final Balance : Rs. " + balance);
	        }
				
			
		};
		
		transaction.deposit(200000);
		
		System.out.println("==========================");
		
        transaction.withdraw(20000);

        System.out.println("==========================");

        transaction.transfer(30000);

        System.out.println("==========================");

        transaction.transactionHistory();

	}

}
