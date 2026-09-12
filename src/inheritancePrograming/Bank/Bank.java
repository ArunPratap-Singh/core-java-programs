package inheritancePrograming.Bank;

public class Bank {
	
	String accountHolderName;
    long accountNumber;
    double balance;
    String branch;
    
    Bank(){
    	
    }

    Bank(String accountHolderName, long accountNumber, double balance, String branch) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
    }
    
    public String toString() {
    	return "AccountHolderName is: " +accountHolderName+"\nAccountNumber is: " +accountNumber+"\nBalance is: " +balance+"\nBranch is: " +branch+"\n==========================";
    }


}
