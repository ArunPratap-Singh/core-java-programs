package inheritanceProgramingMultilevel.Account;

public class Account {
	

	    String accountHolder;
	    String accountNumber;
	    String bankName;
	    
	    Account(){
	    	
	    }

	    Account(String accountHolder, String accountNumber, String bankName) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.bankName = bankName;
	    }

	    @Override
	    public String toString() {
	        return "Account Holder is: " + accountHolder + "\nAccount Number is: " + accountNumber + "\nBank Name: " + bankName;
	    }
	

}
