package anonymousClass.BankTransaction;

public interface BankTransaction {
	
	void deposit(double amount);

    void withdraw(double amount);

    void transfer(double amount);

    void transactionHistory();

}
