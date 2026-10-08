package abstraction.Payment;

public class PaymentDriver {

	public static void main(String[] args) {

		Payment p1 = new CreditCardPayment(102, "Rohit Verma", "Credit Card", 15000, "INR", "07-10-2026", "Pending",
				"Rohit Verma", "XXXX-XXXX-XXXX-4567", "MasterCard", "Axis Bank", "08/30", "XXX", false);
		Payment p2 = new CreditCardPayment(103, "Amit Sharma", "Credit Card", 22500, "INR", "08-10-2026", "Success",
				"Amit Sharma", "XXXX-XXXX-XXXX-7821", "Visa", "HDFC Bank", "09/29", "XXX", true);
		Payment p3 = new CreditCardPayment(104, "Priya Singh", "Credit Card", 18999, "INR", "09-10-2026", "Pending",
				"Priya Singh", "XXXX-XXXX-XXXX-3412", "MasterCard", "ICICI Bank", "11/30", "XXX", false);
		Payment p4 = new CreditCardPayment(105, "Neha Gupta", "Credit Card", 32500, "INR", "10-10-2026", "Success",
				"Neha Gupta", "XXXX-XXXX-XXXX-9156", "Visa", "SBI", "04/31", "XXX", true);
		Payment p5 = new CreditCardPayment(106, "Vikas Yadav", "Credit Card", 12500, "INR", "11-10-2026", "Failed",
				"Vikas Yadav", "XXXX-XXXX-XXXX-6289", "MasterCard", "Axis Bank", "06/29", "XXX", false);
		Payment p6 = new CreditCardPayment(107, "Anjali Mehta", "Credit Card", 45999, "INR", "12-10-2026", "Success",
				"Anjali Mehta", "XXXX-XXXX-XXXX-4738", "Visa", "Kotak Mahindra Bank", "12/30", "XXX", true);
		Payment p7 = new CreditCardPayment(108, "Suresh Kumar", "Credit Card", 9999, "INR", "13-10-2026", "Pending",
				"Suresh Kumar", "XXXX-XXXX-XXXX-2845", "MasterCard", "HDFC Bank", "03/31", "XXX", false);
		Payment p8 = new CreditCardPayment(109, "Pooja Verma", "Credit Card", 27999, "INR", "14-10-2026", "Success",
				"Pooja Verma", "XXXX-XXXX-XXXX-7352", "Visa", "ICICI Bank", "07/30", "XXX", true);
		Payment p9 = new CreditCardPayment(110, "Karan Malhotra", "Credit Card", 55000, "INR", "15-10-2026", "Pending",
				"Karan Malhotra", "XXXX-XXXX-XXXX-6194", "MasterCard", "SBI", "10/29", "XXX", false);
		Payment p10 = new CreditCardPayment(111, "Sneha Kapoor", "Credit Card", 36500, "INR", "16-10-2026", "Success",
				"Sneha Kapoor", "XXXX-XXXX-XXXX-8526", "Visa", "Axis Bank", "05/31", "XXX", true);
		
		System.out.println(p1);
		System.out.println("==============");

		System.out.println(p2);
		System.out.println("==============");

		System.out.println(p3);
		System.out.println("==============");

		System.out.println(p4);
		System.out.println("==============");

		System.out.println(p5);
		System.out.println("==============");

		System.out.println(p6);
		System.out.println("==============");

		System.out.println(p7);
		System.out.println("==============");

		System.out.println(p8);
		System.out.println("==============");

		System.out.println(p9);
		System.out.println("==============");

		System.out.println(p10);
		System.out.println("==============");
		
		System.out.println("======================p1 Details========================");
		p1.makePayment();
		((CreditCardPayment) p1).validateCard();

		System.out.println("======================p2 Details========================");
		p2.makePayment();
		((CreditCardPayment) p2).validateCard();

		System.out.println("======================p3 Details========================");
		p3.makePayment();
		((CreditCardPayment) p3).validateCard();

		System.out.println("======================p4 Details========================");
		p4.makePayment();
		((CreditCardPayment) p4).validateCard();

		System.out.println("======================p5 Details========================");
		p5.makePayment();
		((CreditCardPayment) p5).validateCard();

		System.out.println("======================p6 Details========================");
		p6.makePayment();
		((CreditCardPayment) p6).validateCard();

		System.out.println("======================p7 Details========================");
		p7.makePayment();
		((CreditCardPayment) p7).validateCard();

		System.out.println("======================p8 Details========================");
		p8.makePayment();
		((CreditCardPayment) p8).validateCard();

		System.out.println("======================p9 Details========================");
		p9.makePayment();
		((CreditCardPayment) p9).validateCard();

		System.out.println("======================p10 Details========================");
		p10.makePayment();
		((CreditCardPayment) p10).validateCard();
		
		
		Payment p11 = new UPIPayment(202, "Neha Gupta", "UPI", 6500, "INR", "07-10-2026", "Pending", "neha@upi",
				"9876501234", "PhonePe", "ICICI Bank", "UPI987654321", true);
		Payment p12 = new UPIPayment(203, "Rohit Verma", "UPI", 8500, "INR", "08-10-2026", "Success", "rohit@upi",
				"9876512345", "Google Pay", "HDFC Bank", "UPI123456789", true);
		Payment p13 = new UPIPayment(204, "Amit Sharma", "UPI", 4200, "INR", "09-10-2026", "Success", "amit@upi",
				"9876523456", "Paytm", "SBI", "UPI234567890", true);
		Payment p14 = new UPIPayment(205, "Priya Singh", "UPI", 12500, "INR", "10-10-2026", "Pending", "priya@upi",
				"9876534567", "PhonePe", "Axis Bank", "UPI345678901", false);
		Payment p15 = new UPIPayment(206, "Vikas Yadav", "UPI", 7800, "INR", "11-10-2026", "Success", "vikas@upi",
				"9876545678", "Google Pay", "Kotak Mahindra Bank", "UPI456789012", true);
		Payment p16 = new UPIPayment(207, "Anjali Mehta", "UPI", 15999, "INR", "12-10-2026", "Failed", "anjali@upi",
				"9876556789", "Paytm", "ICICI Bank", "UPI567890123", false);
		Payment p17 = new UPIPayment(208, "Suresh Kumar", "UPI", 3500, "INR", "13-10-2026", "Success", "suresh@upi",
				"9876567890", "PhonePe", "HDFC Bank", "UPI678901234", true);
		Payment p18 = new UPIPayment(209, "Pooja Verma", "UPI", 9200, "INR", "14-10-2026", "Pending", "pooja@upi",
				"9876578901", "Google Pay", "SBI", "UPI789012345", false);
		Payment p19 = new UPIPayment(210, "Karan Malhotra", "UPI", 18500, "INR", "15-10-2026", "Success", "karan@upi",
				"9876589012", "Paytm", "Axis Bank", "UPI890123456", true);
		Payment p20 = new UPIPayment(211, "Sneha Kapoor", "UPI", 6700, "INR", "16-10-2026", "Success", "sneha@upi",
				"9876590123", "PhonePe", "ICICI Bank", "UPI901234567", true);
		
		System.out.println(p11);
		System.out.println("================");

		System.out.println(p12);
		System.out.println("================");

		System.out.println(p13);
		System.out.println("================");

		System.out.println(p14);
		System.out.println("================");

		System.out.println(p15);
		System.out.println("================");

		System.out.println(p16);
		System.out.println("================");

		System.out.println(p17);
		System.out.println("================");

		System.out.println(p18);
		System.out.println("================");

		System.out.println(p19);
		System.out.println("================");

		System.out.println(p20);
		System.out.println("================");
		
		System.out.println("======================p11 Details========================");
		p11.makePayment();
		((UPIPayment) p11).verifyUPIPin();

		System.out.println("======================p12 Details========================");
		p12.makePayment();
		((UPIPayment) p12).verifyUPIPin();

		System.out.println("======================p13 Details========================");
		p13.makePayment();
		((UPIPayment) p13).verifyUPIPin();

		System.out.println("======================p14 Details========================");
		p14.makePayment();
		((UPIPayment) p14).verifyUPIPin();

		System.out.println("======================p15 Details========================");
		p15.makePayment();
		((UPIPayment) p15).verifyUPIPin();

		System.out.println("======================p16 Details========================");
		p16.makePayment();
		((UPIPayment) p16).verifyUPIPin();

		System.out.println("======================p17 Details========================");
		p17.makePayment();
		((UPIPayment) p17).verifyUPIPin();

		System.out.println("======================p18 Details========================");
		p18.makePayment();
		((UPIPayment) p18).verifyUPIPin();

		System.out.println("======================p19 Details========================");
		p19.makePayment();
		((UPIPayment) p19).verifyUPIPin();

		System.out.println("======================p20 Details========================");
		p20.makePayment();
		((UPIPayment) p20).verifyUPIPin();
		
		
		Payment p21 = new NetBankingPayment(302, "Vikas Singh", "Net Banking", 75000, "INR", "07-10-2026", "Pending",
				"Vikas Singh", "XXXXXX4567", "HDFC Bank", "Delhi Branch", "HDFC0000302", "vikas123", true);
		Payment p22 = new NetBankingPayment(303, "Rohit Verma", "Net Banking", 45000, "INR", "08-10-2026", "Success",
				"Rohit Verma", "XXXXXX7821", "ICICI Bank", "Lucknow Branch", "ICIC0000303", "rohit456", true);
		Payment p23 = new NetBankingPayment(304, "Neha Gupta", "Net Banking", 62500, "INR", "09-10-2026", "Pending",
				"Neha Gupta", "XXXXXX3412", "Axis Bank", "Delhi Branch", "UTIB0000304", "neha789", false);
		Payment p24 = new NetBankingPayment(305, "Amit Sharma", "Net Banking", 35000, "INR", "10-10-2026", "Success",
				"Amit Sharma", "XXXXXX9156", "SBI", "Mumbai Branch", "SBIN0000305", "amit321", true);
		Payment p25 = new NetBankingPayment(306, "Priya Singh", "Net Banking", 89000, "INR", "11-10-2026", "Failed",
				"Priya Singh", "XXXXXX6289", "Kotak Mahindra Bank", "Pune Branch", "KKBK0000306", "priya654", false);
		Payment p26 = new NetBankingPayment(307, "Anjali Mehta", "Net Banking", 56000, "INR", "12-10-2026", "Success",
				"Anjali Mehta", "XXXXXX4738", "HDFC Bank", "Noida Branch", "HDFC0000307", "anjali987", true);
		Payment p27 = new NetBankingPayment(308, "Suresh Kumar", "Net Banking", 42000, "INR", "13-10-2026", "Pending",
				"Suresh Kumar", "XXXXXX2845", "ICICI Bank", "Kanpur Branch", "ICIC0000308", "suresh159", false);
		Payment p28 = new NetBankingPayment(309, "Pooja Verma", "Net Banking", 97500, "INR", "14-10-2026", "Success",
				"Pooja Verma", "XXXXXX7352", "Axis Bank", "Jaipur Branch", "UTIB0000309", "pooja753", true);
		Payment p29 = new NetBankingPayment(310, "Karan Malhotra", "Net Banking", 68000, "INR", "15-10-2026", "Pending",
				"Karan Malhotra", "XXXXXX6194", "SBI", "Gurgaon Branch", "SBIN0000310", "karan852", false);
		Payment p30 = new NetBankingPayment(311, "Sneha Kapoor", "Net Banking", 52000, "INR", "16-10-2026", "Success",
				"Sneha Kapoor", "XXXXXX8526", "HDFC Bank", "Lucknow Branch", "HDFC0000311", "sneha951", true);
		
		System.out.println(p21);
		System.out.println("==================");

		System.out.println(p22);
		System.out.println("==================");

		System.out.println(p23);
		System.out.println("==================");

		System.out.println(p24);
		System.out.println("==================");

		System.out.println(p25);
		System.out.println("==================");

		System.out.println(p26);
		System.out.println("==================");

		System.out.println(p27);
		System.out.println("==================");

		System.out.println(p28);
		System.out.println("==================");

		System.out.println(p29);
		System.out.println("==================");

		System.out.println(p30);
		System.out.println("==================");
		
		System.out.println("======================p21 Details========================");
		p21.makePayment();
		((NetBankingPayment) p21).verifyOTP();
		
		System.out.println("======================p22 Details========================");
		p22.makePayment();
		((NetBankingPayment) p22).verifyOTP();

		System.out.println("======================p23 Details========================");
		p23.makePayment();
		((NetBankingPayment) p23).verifyOTP();

		System.out.println("======================p24 Details========================");
		p24.makePayment();
		((NetBankingPayment) p24).verifyOTP();

		System.out.println("======================p25 Details========================");
		p25.makePayment();
		((NetBankingPayment) p25).verifyOTP();

		System.out.println("======================p26 Details========================");
		p26.makePayment();
		((NetBankingPayment) p26).verifyOTP();

		System.out.println("======================p27 Details========================");
		p27.makePayment();
		((NetBankingPayment) p27).verifyOTP();

		System.out.println("======================p28 Details========================");
		p28.makePayment();
		((NetBankingPayment) p28).verifyOTP();

		System.out.println("======================p29 Details========================");
		p29.makePayment();
		((NetBankingPayment) p29).verifyOTP();

		System.out.println("======================p30 Details========================");
		p30.makePayment();
		((NetBankingPayment) p30).verifyOTP();

	}

}
