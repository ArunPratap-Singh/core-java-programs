package immutableClassProgram;

public final class BankAccount {
	
	    private final int accountNumber;
	    private final String accountHolderName;
	    private final String accountType;
	    private final double balance;
	    private final String bankName;
	    private final String branch;
	    private final String city;

	    BankAccount(int accountNumber, String accountHolderName, String accountType, double balance, String bankName, String branch, String city) {

	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.accountType = accountType;
	        this.balance = balance;
	        this.bankName = bankName;
	        this.branch = branch;
	        this.city = city;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }

	    public String getAccountType() {
	        return accountType;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getBankName() {
	        return bankName;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public String getCity() {
	        return city;
	    }
	

}
