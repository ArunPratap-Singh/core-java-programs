package abstraction.Payment;

public class CreditCardPayment extends Payment {

	String cardHolderName;
	String cardNumber;
	String cardType;
	String bankName;
	String expiryDate;
	String cvv;
	boolean internationalTransaction;

	CreditCardPayment() {

	}

	CreditCardPayment(int paymentId, String customerName, String paymentType, double amount, String currency,
			String transactionDate, String transactionStatus, String cardHolderName, String cardNumber, String cardType,
			String bankName, String expiryDate, String cvv, boolean internationalTransaction) {

		super(paymentId, customerName, paymentType, amount, currency, transactionDate, transactionStatus);

		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.bankName = bankName;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.internationalTransaction = internationalTransaction;
	}

	@Override
	public void makePayment() {
		System.out.println("Payment made successfully using Credit Card");
		System.out.println("Card Holder : " + cardHolderName);
		System.out.println("Bank        : " + bankName);
		System.out.println("Amount      : " + amount);
	}

	public void validateCard() {
		System.out.println("Credit card validation completed");
	}

	@Override
	public String toString() {
		return "CreditCardPayment{" + "paymentId=" + paymentId + ", customerName='" + customerName + '\'' + ", amount="
				+ amount + ", cardHolderName='" + cardHolderName + '\'' + ", cardType='" + cardType + '\''
				+ ", bankName='" + bankName + '\'' + ", expiryDate='" + expiryDate + '\''
				+ ", internationalTransaction=" + internationalTransaction + '}';
	}
}
