package abstraction.Payment;

public abstract class Payment {

	int paymentId;
	String customerName;
	String paymentType;
	double amount;
	String currency;
	String transactionDate;
	String transactionStatus;

	Payment() {

	}

	Payment(int paymentId, String customerName, String paymentType, double amount, String currency, String transactionDate, String transactionStatus) {

		this.paymentId = paymentId;
		this.customerName = customerName;
		this.paymentType = paymentType;
		this.amount = amount;
		this.currency = currency;
		this.transactionDate = transactionDate;
		this.transactionStatus = transactionStatus;
	}

	public abstract void makePayment();

	
	@Override
	public String toString() {
		return "Payment{" + "paymentId=" + paymentId + ", customerName='" + customerName + '\'' + ", paymentType='"
				+ paymentType + '\'' + ", amount=" + amount + ", currency='" + currency + '\'' + ", transactionDate='"
				+ transactionDate + '\'' + ", transactionStatus='" + transactionStatus + '\'' + '}';
	}
}
