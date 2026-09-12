package inheritancePrograming.Bank;

public class SavingsAccount extends Bank{
	
	double interestRate;
    String accountType;
    boolean nomineeAvailable;
    
    SavingsAccount(){
    	
    }

    SavingsAccount(String accountHolderName, long accountNumber, double balance, String branch, double interestRate, String accountType, boolean nomineeAvailable) {

        super(accountHolderName, accountNumber, balance, branch);
        this.interestRate = interestRate;
        this.accountType = accountType;
        this.nomineeAvailable = nomineeAvailable;
    }
    
    public String toString() {
    	return super.toString()+"\nInterestRate is: " +interestRate+"\nAccount Type is: " +accountType+"\nNomineeAvailable is: " +nomineeAvailable+"\n========================";
    }

}
