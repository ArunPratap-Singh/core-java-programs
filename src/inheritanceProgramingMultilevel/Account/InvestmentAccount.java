package inheritanceProgramingMultilevel.Account;

public class InvestmentAccount extends PremiumSavingAccount{
	

	    String investmentType;
	    double investmentAmount;
	    
	    InvestmentAccount(){
	    	
	    }

	    InvestmentAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch, double interestRate, boolean passbookAvailable, String premiumCard, double minimumBalance, String investmentType, double investmentAmount) {

	        super(accountHolder, accountNumber, bankName, balance, branch, interestRate, passbookAvailable, premiumCard, minimumBalance);
	        this.investmentType = investmentType;
	        this.investmentAmount = investmentAmount;
	    }

	    @Override
	    public String toString() {
	        return super.toString() +"\nInvestment Type is: " + investmentType + "\nInvestment Amount is: " + investmentAmount;
	    }
	

}
