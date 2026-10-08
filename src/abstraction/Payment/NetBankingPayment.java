package abstraction.Payment;

public class NetBankingPayment extends Payment {

	String accountHolderName;
	String accountNumber;
	String bankName;
	String branchName;
	String ifscCode;
	String loginId;
	boolean otpVerified;

	NetBankingPayment() {

	}

	NetBankingPayment(int paymentId, String customerName, String paymentType, double amount, String currency,
			String transactionDate, String transactionStatus, String accountHolderName, String accountNumber,
			String bankName, String branchName, String ifscCode, String loginId, boolean otpVerified) {

		super(paymentId, customerName, paymentType, amount, currency, transactionDate, transactionStatus);

		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.loginId = loginId;
		this.otpVerified = otpVerified;
	}

	@Override
	public void makePayment() {
		System.out.println("Payment made successfully using Net Banking");
		System.out.println("Account Holder : " + accountHolderName);
		System.out.println("Bank           : " + bankName);
		System.out.println("Amount         : " + amount);
	}

	public void verifyOTP() {
		System.out.println("Net Banking OTP verification completed");
	}

	@Override
	public String toString() {
		return "NetBankingPayment{" + "paymentId=" + paymentId + ", customerName='" + customerName + '\'' + ", amount="
				+ amount + ", accountHolderName='" + accountHolderName + '\'' + ", accountNumber='" + accountNumber
				+ '\'' + ", bankName='" + bankName + '\'' + ", branchName='" + branchName + '\'' + ", ifscCode='"
				+ ifscCode + '\'' + ", loginId='" + loginId + '\'' + ", otpVerified=" + otpVerified + '}';
	}
}
