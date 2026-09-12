package inheritanceProgramingMultilevel.Account;

public class WealthAccount extends PremiumInvestmentAccount{
	
	    String wealthManager;
	    double totalPortfolioValue;
	    
	    WealthAccount(){
	    	
	    }	

	    WealthAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch, double interestRate, boolean passbookAvailable, String premiumCard, double minimumBalance, String investmentType, double investmentAmount, String investmentAdvisor, double expectedReturn, String wealthManager, double totalPortfolioValue) {

	        super(accountHolder, accountNumber, bankName, balance, branch, interestRate, passbookAvailable, premiumCard, minimumBalance, investmentType, investmentAmount, investmentAdvisor, expectedReturn);
	        this.wealthManager = wealthManager;
	        this.totalPortfolioValue = totalPortfolioValue;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nWealth Manager is: " + wealthManager + "\nTotal Portfolio Value is: " + totalPortfolioValue+"\n===========================";
	    }
	

}
