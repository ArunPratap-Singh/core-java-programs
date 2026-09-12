package immutableClassProgram;

public class PaymentDriver {

	public static void main(String[] args) {

		Payment p1 = new Payment(101, "Rahul Sharma", "UPI", 25000.00, "TXN100101", "09-09-2026", "Successful");
		Payment p2 = new Payment(102, "Priya Verma", "Credit Card", 18500.50, "TXN100102", "09-09-2026", "Successful");
		Payment p3 = new Payment(103, "Amit Singh", "Debit Card", 12500.00, "TXN100103", "08-09-2026", "Successful");
		Payment p4 = new Payment(104, "Neha Gupta", "Net Banking", 32000.75, "TXN100104", "08-09-2026", "Successful");
		Payment p5 = new Payment(105, "Rohit Kumar", "UPI", 7500.00, "TXN100105", "07-09-2026", "Pending");
		Payment p6 = new Payment(106, "Anjali Mishra", "Credit Card", 45000.00, "TXN100106", "07-09-2026", "Successful");
		Payment p7 = new Payment(107, "Vikas Yadav", "Debit Card", 9800.25, "TXN100107", "06-09-2026", "Failed");
		Payment p8 = new Payment(108, "Sneha Kapoor", "UPI", 15500.00, "TXN100108", "06-09-2026", "Successful");
		Payment p9 = new Payment(109, "Karan Malhotra", "Net Banking", 28500.50, "TXN100109", "05-09-2026", "Successful");
		Payment p10 = new Payment(110, "Pooja Agarwal", "Credit Card", 52000.00, "TXN100110", "05-09-2026", "Pending");
		Payment p11 = new Payment(111, "Aditya Srivastava", "UPI", 6700.75, "TXN100111", "04-09-2026", "Successful");
		Payment p12 = new Payment(112, "Simran Kaur", "Debit Card", 19500.00, "TXN100112", "04-09-2026", "Successful");
		Payment p13 = new Payment(113, "Nikhil Jain", "Net Banking", 35000.25, "TXN100113", "03-09-2026", "Failed");
		Payment p14 = new Payment(114, "Kavita Joshi", "UPI", 8900.00, "TXN100114", "03-09-2026", "Successful");
		Payment p15 = new Payment(115, "Saurabh Tiwari", "Credit Card", 27500.50, "TXN100115", "02-09-2026", "Successful");
		Payment p16 = new Payment(116, "Riya Mehta", "Debit Card", 14500.00, "TXN100116", "02-09-2026", "Pending");
		Payment p17 = new Payment(117, "Manish Pandey", "UPI", 6300.25, "TXN100117", "01-09-2026", "Successful");
		Payment p18 = new Payment(118, "Swati Saxena", "Net Banking", 41000.00, "TXN100118", "01-09-2026", "Successful");
		Payment p19 = new Payment(119, "Akash Tripathi", "Credit Card", 56000.75, "TXN100119", "31-08-2026", "Failed");
		Payment p20 = new Payment(120, "Divya Singh", "UPI", 22000.00, "TXN100120", "31-08-2026", "Successful");

		System.out.println("==========================Payment Details================================");
		System.out.println("ObjectReference is: " + p1);
		System.out.println("Payment Id is: " + p1.getPaymentId());
		System.out.println("Customer Name is: " + p1.getCustomerName());
		System.out.println("Payment Method is: " + p1.getPaymentMethod());
		System.out.println("Amount is: " + p1.getAmount());
		System.out.println("Transaction Id is: " + p1.getTransactionId());
		System.out.println("Payment Date is: " + p1.getPaymentDate());
		System.out.println("Payment Status is: " + p1.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p2);
		System.out.println("Payment Id is: " + p2.getPaymentId());
		System.out.println("Customer Name is: " + p2.getCustomerName());
		System.out.println("Payment Method is: " + p2.getPaymentMethod());
		System.out.println("Amount is: " + p2.getAmount());
		System.out.println("Transaction Id is: " + p2.getTransactionId());
		System.out.println("Payment Date is: " + p2.getPaymentDate());
		System.out.println("Payment Status is: " + p2.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p3);
		System.out.println("Payment Id is: " + p3.getPaymentId());
		System.out.println("Customer Name is: " + p3.getCustomerName());
		System.out.println("Payment Method is: " + p3.getPaymentMethod());
		System.out.println("Amount is: " + p3.getAmount());
		System.out.println("Transaction Id is: " + p3.getTransactionId());
		System.out.println("Payment Date is: " + p3.getPaymentDate());
		System.out.println("Payment Status is: " + p3.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p4);
		System.out.println("Payment Id is: " + p4.getPaymentId());
		System.out.println("Customer Name is: " + p4.getCustomerName());
		System.out.println("Payment Method is: " + p4.getPaymentMethod());
		System.out.println("Amount is: " + p4.getAmount());
		System.out.println("Transaction Id is: " + p4.getTransactionId());
		System.out.println("Payment Date is: " + p4.getPaymentDate());
		System.out.println("Payment Status is: " + p4.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p5);
		System.out.println("Payment Id is: " + p5.getPaymentId());
		System.out.println("Customer Name is: " + p5.getCustomerName());
		System.out.println("Payment Method is: " + p5.getPaymentMethod());
		System.out.println("Amount is: " + p5.getAmount());
		System.out.println("Transaction Id is: " + p5.getTransactionId());
		System.out.println("Payment Date is: " + p5.getPaymentDate());
		System.out.println("Payment Status is: " + p5.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p6);
		System.out.println("Payment Id is: " + p6.getPaymentId());
		System.out.println("Customer Name is: " + p6.getCustomerName());
		System.out.println("Payment Method is: " + p6.getPaymentMethod());
		System.out.println("Amount is: " + p6.getAmount());
		System.out.println("Transaction Id is: " + p6.getTransactionId());
		System.out.println("Payment Date is: " + p6.getPaymentDate());
		System.out.println("Payment Status is: " + p6.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p7);
		System.out.println("Payment Id is: " + p7.getPaymentId());
		System.out.println("Customer Name is: " + p7.getCustomerName());
		System.out.println("Payment Method is: " + p7.getPaymentMethod());
		System.out.println("Amount is: " + p7.getAmount());
		System.out.println("Transaction Id is: " + p7.getTransactionId());
		System.out.println("Payment Date is: " + p7.getPaymentDate());
		System.out.println("Payment Status is: " + p7.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p8);
		System.out.println("Payment Id is: " + p8.getPaymentId());
		System.out.println("Customer Name is: " + p8.getCustomerName());
		System.out.println("Payment Method is: " + p8.getPaymentMethod());
		System.out.println("Amount is: " + p8.getAmount());
		System.out.println("Transaction Id is: " + p8.getTransactionId());
		System.out.println("Payment Date is: " + p8.getPaymentDate());
		System.out.println("Payment Status is: " + p8.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p9);
		System.out.println("Payment Id is: " + p9.getPaymentId());
		System.out.println("Customer Name is: " + p9.getCustomerName());
		System.out.println("Payment Method is: " + p9.getPaymentMethod());
		System.out.println("Amount is: " + p9.getAmount());
		System.out.println("Transaction Id is: " + p9.getTransactionId());
		System.out.println("Payment Date is: " + p9.getPaymentDate());
		System.out.println("Payment Status is: " + p9.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p10);
		System.out.println("Payment Id is: " + p10.getPaymentId());
		System.out.println("Customer Name is: " + p10.getCustomerName());
		System.out.println("Payment Method is: " + p10.getPaymentMethod());
		System.out.println("Amount is: " + p10.getAmount());
		System.out.println("Transaction Id is: " + p10.getTransactionId());
		System.out.println("Payment Date is: " + p10.getPaymentDate());
		System.out.println("Payment Status is: " + p10.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p11);
		System.out.println("Payment Id is: " + p11.getPaymentId());
		System.out.println("Customer Name is: " + p11.getCustomerName());
		System.out.println("Payment Method is: " + p11.getPaymentMethod());
		System.out.println("Amount is: " + p11.getAmount());
		System.out.println("Transaction Id is: " + p11.getTransactionId());
		System.out.println("Payment Date is: " + p11.getPaymentDate());
		System.out.println("Payment Status is: " + p11.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p12);
		System.out.println("Payment Id is: " + p12.getPaymentId());
		System.out.println("Customer Name is: " + p12.getCustomerName());
		System.out.println("Payment Method is: " + p12.getPaymentMethod());
		System.out.println("Amount is: " + p12.getAmount());
		System.out.println("Transaction Id is: " + p12.getTransactionId());
		System.out.println("Payment Date is: " + p12.getPaymentDate());
		System.out.println("Payment Status is: " + p12.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p13);
		System.out.println("Payment Id is: " + p13.getPaymentId());
		System.out.println("Customer Name is: " + p13.getCustomerName());
		System.out.println("Payment Method is: " + p13.getPaymentMethod());
		System.out.println("Amount is: " + p13.getAmount());
		System.out.println("Transaction Id is: " + p13.getTransactionId());
		System.out.println("Payment Date is: " + p13.getPaymentDate());
		System.out.println("Payment Status is: " + p13.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p14);
		System.out.println("Payment Id is: " + p14.getPaymentId());
		System.out.println("Customer Name is: " + p14.getCustomerName());
		System.out.println("Payment Method is: " + p14.getPaymentMethod());
		System.out.println("Amount is: " + p14.getAmount());
		System.out.println("Transaction Id is: " + p14.getTransactionId());
		System.out.println("Payment Date is: " + p14.getPaymentDate());
		System.out.println("Payment Status is: " + p14.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p15);
		System.out.println("Payment Id is: " + p15.getPaymentId());
		System.out.println("Customer Name is: " + p15.getCustomerName());
		System.out.println("Payment Method is: " + p15.getPaymentMethod());
		System.out.println("Amount is: " + p15.getAmount());
		System.out.println("Transaction Id is: " + p15.getTransactionId());
		System.out.println("Payment Date is: " + p15.getPaymentDate());
		System.out.println("Payment Status is: " + p15.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p16);
		System.out.println("Payment Id is: " + p16.getPaymentId());
		System.out.println("Customer Name is: " + p16.getCustomerName());
		System.out.println("Payment Method is: " + p16.getPaymentMethod());
		System.out.println("Amount is: " + p16.getAmount());
		System.out.println("Transaction Id is: " + p16.getTransactionId());
		System.out.println("Payment Date is: " + p16.getPaymentDate());
		System.out.println("Payment Status is: " + p16.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p17);
		System.out.println("Payment Id is: " + p17.getPaymentId());
		System.out.println("Customer Name is: " + p17.getCustomerName());
		System.out.println("Payment Method is: " + p17.getPaymentMethod());
		System.out.println("Amount is: " + p17.getAmount());
		System.out.println("Transaction Id is: " + p17.getTransactionId());
		System.out.println("Payment Date is: " + p17.getPaymentDate());
		System.out.println("Payment Status is: " + p17.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p18);
		System.out.println("Payment Id is: " + p18.getPaymentId());
		System.out.println("Customer Name is: " + p18.getCustomerName());
		System.out.println("Payment Method is: " + p18.getPaymentMethod());
		System.out.println("Amount is: " + p18.getAmount());
		System.out.println("Transaction Id is: " + p18.getTransactionId());
		System.out.println("Payment Date is: " + p18.getPaymentDate());
		System.out.println("Payment Status is: " + p18.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p19);
		System.out.println("Payment Id is: " + p19.getPaymentId());
		System.out.println("Customer Name is: " + p19.getCustomerName());
		System.out.println("Payment Method is: " + p19.getPaymentMethod());
		System.out.println("Amount is: " + p19.getAmount());
		System.out.println("Transaction Id is: " + p19.getTransactionId());
		System.out.println("Payment Date is: " + p19.getPaymentDate());
		System.out.println("Payment Status is: " + p19.getPaymentStatus());


		System.out.println("==========================Payment Details================================");

		System.out.println("ObjectReference is: " + p20);
		System.out.println("Payment Id is: " + p20.getPaymentId());
		System.out.println("Customer Name is: " + p20.getCustomerName());
		System.out.println("Payment Method is: " + p20.getPaymentMethod());
		System.out.println("Amount is: " + p20.getAmount());
		System.out.println("Transaction Id is: " + p20.getTransactionId());
		System.out.println("Payment Date is: " + p20.getPaymentDate());
		System.out.println("Payment Status is: " + p20.getPaymentStatus());

	}

}
