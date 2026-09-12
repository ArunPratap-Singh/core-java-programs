package eagerSingletonClass;

public class BankingSystem {

	    private static BankingSystem bs = new BankingSystem();

	    private String bankName;
	    private String branchName;
	    private String ifscCode;

	   
	    private BankingSystem() {

	        bankName = "ABC Bank";
	        branchName = "Lucknow Main Branch";
	        ifscCode = "ABCD0001234";

	        System.out.println("BankingSystem Object Created");
	    }

	    
	    public static BankingSystem getBankingSystem() {

	        return bs;
	    }

	    // Getters

	    public String getBankName() {
	        return bankName;
	    }

	    public String getBranchName() {
	        return branchName;
	    }

	    public String getIfscCode() {
	        return ifscCode;
	    }

	    // Setters

	    public void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public void setBranchName(String branchName) {
	        this.branchName = branchName;
	    }

	    public void setIfscCode(String ifscCode) {
	        this.ifscCode = ifscCode;
	    }

	    // Banking operations

	    public void deposit(String accountNumber, double amount) {

	        System.out.println("Amount Deposited: ₹" + amount);
	        System.out.println("Account Number: " + accountNumber);
	    }

	    public void withdraw(String accountNumber, double amount) {

	        System.out.println("Amount Withdrawn: ₹" + amount);
	        System.out.println("Account Number: " + accountNumber);
	    }

	    public void transfer(String fromAccount, String toAccount, double amount) {

	        System.out.println("Transfer Amount: ₹" + amount);
	        System.out.println("From Account: " + fromAccount);
	        System.out.println("To Account: " + toAccount);
	    }

	    // PrintInfo

	    public void printInfo() {

	        System.out.println("Bank Name   : " + bankName);

	        System.out.println("Branch Name : " + branchName);

	        System.out.println("IFSC Code   : " + ifscCode);
	    }
	

}
