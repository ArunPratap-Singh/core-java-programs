package inheritanceProgramingMultilevel.Account;

public class PremiumSavingAccount extends SavingAccount{
	
	    String premiumCard;
	    double minimumBalance;
	    
	    PremiumSavingAccount(){
	    	
	    }

	    PremiumSavingAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch, double interestRate, boolean passbookAvailable, String premiumCard, double minimumBalance) {

	        super(accountHolder, accountNumber, bankName, balance, branch, interestRate, passbookAvailable);

	        this.premiumCard = premiumCard;
	        this.minimumBalance = minimumBalance;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nPremium Card is: " + premiumCard + "\nMinimum Balance is: " + minimumBalance;
	    }
	

}
