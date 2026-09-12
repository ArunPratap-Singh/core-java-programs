package inheritanceProgramingMultilevel.Account;

public class BankAccount extends Account{
	
	    double balance;
	    String branch;
	    
	    BankAccount(){
	    	
	    }

	    BankAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch) {

	        super(accountHolder, accountNumber, bankName);
	        this.balance = balance;
	        this.branch = branch;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nBalance is: " + balance + "\nBranch is: " + branch;
	    }
	

}
