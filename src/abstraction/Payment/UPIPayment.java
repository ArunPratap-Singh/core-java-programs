package abstraction.Payment;

public class UPIPayment extends Payment {

	String upiId;
	String mobileNumber;
	String upiApp;
	String bankName;
	String transactionReference;
	boolean pinVerified;

	UPIPayment() {

	}

	UPIPayment(int paymentId, String customerName, String paymentType, double amount, String currency,
			String transactionDate, String transactionStatus, String upiId, String mobileNumber, String upiApp,
			String bankName, String transactionReference, boolean pinVerified) {

		super(paymentId, customerName, paymentType, amount, currency, transactionDate, transactionStatus);

		this.upiId = upiId;
		this.mobileNumber = mobileNumber;
		this.upiApp = upiApp;
		this.bankName = bankName;
		this.transactionReference = transactionReference;
		this.pinVerified = pinVerified;
	}

	@Override
	public void makePayment() {
		System.out.println("Payment made successfully using UPI");
		System.out.println("UPI ID      : " + upiId);
		System.out.println("UPI App     : " + upiApp);
		System.out.println("Amount      : " + amount);
	}

	public void verifyUPIPin() {
		System.out.println("UPI PIN verification completed");
	}

	@Override
	public String toString() {
		return "UPIPayment{" + "paymentId=" + paymentId + ", customerName='" + customerName + '\'' + ", amount="
				+ amount + ", upiId='" + upiId + '\'' + ", mobileNumber='" + mobileNumber + '\'' + ", upiApp='" + upiApp
				+ '\'' + ", bankName='" + bankName + '\'' + ", transactionReference='" + transactionReference + '\''
				+ ", pinVerified=" + pinVerified + '}';
	}
}
