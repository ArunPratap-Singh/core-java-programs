package builderPattern;

public class BankAccount {

    private String accountHolder;
    private long accountNumber;
    private String bankName;
    private double balance;
    private String accountType;
    private String branch;

    private BankAccount() {
    	
    }

    private BankAccount(String accountHolder, long accountNumber, String bankName, double balance, String accountType, String branch) {

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
        this.accountType = accountType;
        this.branch = branch;
    }

    private BankAccount(Builder b) {
        
    	this(b.accountHolder, b.accountNumber, b.bankName, b.balance, b.accountType, b.branch);
    }

    @Override
    public String toString() {
        
    	return "BankAccount [Account Holder is: " + accountHolder + ", Account Number is: " + accountNumber + ", Bank Name is: " + bankName + ", Balance is: " + balance + ", Account Type is: " + accountType + ", Branch is: " + branch + "]";
    }

    static class Builder {

        private String accountHolder;
        private long accountNumber;
        private String bankName;
        private double balance;
        private String accountType;
        private String branch;

        public Builder setAccountHolder(String accountHolder) {
            
        	this.accountHolder = accountHolder;
            return this;
        }

        public Builder setAccountNumber(long accountNumber) {
            
        	this.accountNumber = accountNumber;
            return this;
        }

        public Builder setBankName(String bankName) {
            
        	this.bankName = bankName;
            return this;
        }

        public Builder setBalance(double balance) {
            
        	this.balance = balance;
            return this;
        }

        public Builder setAccountType(String accountType) {
            
        	this.accountType = accountType;
            return this;
        }

        public Builder setBranch(String branch) {
            
        	this.branch = branch;
            return this;
        }

        public BankAccount build() {
            
        	return new BankAccount(this);
        }
    }
}



