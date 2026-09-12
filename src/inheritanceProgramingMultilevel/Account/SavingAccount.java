package inheritanceProgramingMultilevel.Account;

public class SavingAccount extends BankAccount{
	
	    double interestRate;
	    boolean passbookAvailable;
	    
	    SavingAccount(){
	    	
	    }

	    SavingAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch, double interestRate, boolean passbookAvailable) {

	        super(accountHolder, accountNumber, bankName, balance, branch);
	        this.interestRate = interestRate;
	        this.passbookAvailable = passbookAvailable;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nInterest Rate is: " + interestRate + "\nPassbook Available is: " + passbookAvailable;
	    }
	

}
