package anonymousClass.PaymentSystem;

public class AnonymousClass {

	public static void main(String[] args) {
		
		PaymentSystem payment = new PaymentSystem() {
			
			@Override
			public void upiPayment(double amount) {
				
				 System.out.println("Payment Method : UPI");
	             System.out.println("Amount         : " + amount);
	             System.out.println("UPI Payment Successful");
				
			}
			
			@Override
			public void netBankingPayment(double amount) {
				
				System.out.println("Payment Method : Net Banking");
                System.out.println("Amount         : " + amount);
                System.out.println("Net Banking Payment Successful");
				
			}
			
			@Override
			public void creditCardPayment(double amount) {
				
				System.out.println("Payment Method : Credit Card");
                System.out.println("Amount         : " + amount);
                System.out.println("Credit Card Payment Successful");
				
			}
		};
		
		payment.creditCardPayment(10000);
		System.out.println("=================");
		payment.upiPayment(5000);
		System.out.println("=================");
		payment.netBankingPayment(120000);

	}

}
