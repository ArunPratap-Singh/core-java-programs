package immutableClassProgram;

public final class Payment {

	private final int paymentId;
	private final String customerName;
	private final String paymentMethod;
	private final double amount;
	private final String transactionId;
	private final String paymentDate;
	private final String paymentStatus;

	Payment(int paymentId, String customerName, String paymentMethod, double amount, String transactionId, String paymentDate, String paymentStatus) {

		this.paymentId = paymentId;
		this.customerName = customerName;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.transactionId = transactionId;
		this.paymentDate = paymentDate;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

}
