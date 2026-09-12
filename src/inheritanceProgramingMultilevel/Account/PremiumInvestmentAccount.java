package inheritanceProgramingMultilevel.Account;

public class PremiumInvestmentAccount extends InvestmentAccount{
	
	    String investmentAdvisor;
	    double expectedReturn;
	    
	    PremiumInvestmentAccount(){
	    	
	    }

	    PremiumInvestmentAccount(String accountHolder, String accountNumber, String bankName, double balance, String branch, double interestRate, boolean passbookAvailable, String premiumCard, double minimumBalance, String investmentType, double investmentAmount, String investmentAdvisor, double expectedReturn) {

	        super(accountHolder, accountNumber, bankName, balance, branch, interestRate, passbookAvailable, premiumCard, minimumBalance, investmentType, investmentAmount);
	        this.investmentAdvisor = investmentAdvisor;
	        this.expectedReturn = expectedReturn;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nInvestment Advisor is: " + investmentAdvisor + "\nExpected Return is: " + expectedReturn;
	    }
	

}
