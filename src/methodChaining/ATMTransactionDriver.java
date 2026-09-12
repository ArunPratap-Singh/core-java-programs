package methodChaining;

public class ATMTransactionDriver {

	public static void main(String[] args) {

		ATMTransaction a1 = new ATMTransaction();
		ATMTransaction a2 = new ATMTransaction();
		ATMTransaction a3 = new ATMTransaction();
		ATMTransaction a4 = new ATMTransaction();
		ATMTransaction a5 = new ATMTransaction();
		ATMTransaction a6 = new ATMTransaction();
		ATMTransaction a7 = new ATMTransaction();
		ATMTransaction a8 = new ATMTransaction();
		ATMTransaction a9 = new ATMTransaction();
		ATMTransaction a10 = new ATMTransaction();
		ATMTransaction a11 = new ATMTransaction();
		ATMTransaction a12 = new ATMTransaction();
		ATMTransaction a13 = new ATMTransaction();
		ATMTransaction a14 = new ATMTransaction();
		ATMTransaction a15 = new ATMTransaction();
		ATMTransaction a16 = new ATMTransaction();
		ATMTransaction a17 = new ATMTransaction();
		ATMTransaction a18 = new ATMTransaction();
		ATMTransaction a19 = new ATMTransaction();
		ATMTransaction a20 = new ATMTransaction();

		a1.setCustomerName("Arun").setBankName("HDFC Bank").setAccountNumber("XXXXXX4587").setCardNumber("XXXX-XXXX-XXXX-1025").setTransactionId("TXN10001").setTransactionType("Cash Withdrawal").setTransactionAmount(10000.00).setAvailableBalance(45000.00).setAtmLocation("Lucknow").setTransactionDate("13-09-2026").setTransactionTime("10:30 AM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a2.setCustomerName("Rahul").setBankName("SBI").setAccountNumber("XXXXXX7821").setCardNumber("XXXX-XXXX-XXXX-2048").setTransactionId("TXN10002").setTransactionType("Cash Deposit").setTransactionAmount(15000.00).setAvailableBalance(62000.00).setAtmLocation("Delhi").setTransactionDate("13-09-2026").setTransactionTime("11:15 AM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a3.setCustomerName("Priya").setBankName("ICICI Bank").setAccountNumber("XXXXXX3412").setCardNumber("XXXX-XXXX-XXXX-3096").setTransactionId("TXN10003").setTransactionType("Cash Withdrawal").setTransactionAmount(5000.00).setAvailableBalance(28000.00).setAtmLocation("Kanpur").setTransactionDate("13-09-2026").setTransactionTime("12:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a4.setCustomerName("Amit").setBankName("Axis Bank").setAccountNumber("XXXXXX9165").setCardNumber("XXXX-XXXX-XXXX-4012").setTransactionId("TXN10004").setTransactionType("Balance Inquiry").setTransactionAmount(0.00).setAvailableBalance(75000.00).setAtmLocation("Mumbai").setTransactionDate("13-09-2026").setTransactionTime("12:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a5.setCustomerName("Neha").setBankName("HDFC Bank").setAccountNumber("XXXXXX6248").setCardNumber("XXXX-XXXX-XXXX-5037").setTransactionId("TXN10005").setTransactionType("Cash Withdrawal").setTransactionAmount(8000.00).setAvailableBalance(37000.00).setAtmLocation("Lucknow").setTransactionDate("13-09-2026").setTransactionTime("01:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a6.setCustomerName("Rohit").setBankName("SBI").setAccountNumber("XXXXXX1579").setCardNumber("XXXX-XXXX-XXXX-6084").setTransactionId("TXN10006").setTransactionType("Cash Withdrawal").setTransactionAmount(12000.00).setAvailableBalance(48000.00).setAtmLocation("Noida").setTransactionDate("13-09-2026").setTransactionTime("01:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a7.setCustomerName("Pooja").setBankName("Kotak Mahindra Bank").setAccountNumber("XXXXXX8436").setCardNumber("XXXX-XXXX-XXXX-7152").setTransactionId("TXN10007").setTransactionType("Cash Deposit").setTransactionAmount(20000.00).setAvailableBalance(85000.00).setAtmLocation("Jaipur").setTransactionDate("13-09-2026").setTransactionTime("02:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a8.setCustomerName("Vikas").setBankName("Axis Bank").setAccountNumber("XXXXXX2954").setCardNumber("XXXX-XXXX-XXXX-8261").setTransactionId("TXN10008").setTransactionType("Cash Withdrawal").setTransactionAmount(7000.00).setAvailableBalance(33000.00).setAtmLocation("Agra").setTransactionDate("13-09-2026").setTransactionTime("02:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a9.setCustomerName("Anjali").setBankName("ICICI Bank").setAccountNumber("XXXXXX5187").setCardNumber("XXXX-XXXX-XXXX-9374").setTransactionId("TXN10009").setTransactionType("Cash Withdrawal").setTransactionAmount(15000.00).setAvailableBalance(55000.00).setAtmLocation("Delhi").setTransactionDate("13-09-2026").setTransactionTime("03:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a10.setCustomerName("Karan").setBankName("HDFC Bank").setAccountNumber("XXXXXX7632").setCardNumber("XXXX-XXXX-XXXX-1048").setTransactionId("TXN10010").setTransactionType("Cash Deposit").setTransactionAmount(25000.00).setAvailableBalance(95000.00).setAtmLocation("Bengaluru").setTransactionDate("13-09-2026").setTransactionTime("03:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a11.setCustomerName("Sneha").setBankName("SBI").setAccountNumber("XXXXXX4826").setCardNumber("XXXX-XXXX-XXXX-2159").setTransactionId("TXN10011").setTransactionType("Cash Withdrawal").setTransactionAmount(6000.00).setAvailableBalance(24000.00).setAtmLocation("Varanasi").setTransactionDate("13-09-2026").setTransactionTime("04:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a12.setCustomerName("Manish").setBankName("Bank of Baroda").setAccountNumber("XXXXXX6391").setCardNumber("XXXX-XXXX-XXXX-3267").setTransactionId("TXN10012").setTransactionType("Balance Inquiry").setTransactionAmount(0.00).setAvailableBalance(68000.00).setAtmLocation("Prayagraj").setTransactionDate("13-09-2026").setTransactionTime("04:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a13.setCustomerName("Riya").setBankName("Axis Bank").setAccountNumber("XXXXXX7514").setCardNumber("XXXX-XXXX-XXXX-4378").setTransactionId("TXN10013").setTransactionType("Cash Withdrawal").setTransactionAmount(9000.00).setAvailableBalance(41000.00).setAtmLocation("Pune").setTransactionDate("13-09-2026").setTransactionTime("05:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a14.setCustomerName("Saurabh").setBankName("HDFC Bank").setAccountNumber("XXXXXX8642").setCardNumber("XXXX-XXXX-XXXX-5489").setTransactionId("TXN10014").setTransactionType("Cash Deposit").setTransactionAmount(18000.00).setAvailableBalance(72000.00).setAtmLocation("Gurugram").setTransactionDate("13-09-2026").setTransactionTime("05:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a15.setCustomerName("Kavita").setBankName("ICICI Bank").setAccountNumber("XXXXXX3197").setCardNumber("XXXX-XXXX-XXXX-6591").setTransactionId("TXN10015").setTransactionType("Cash Withdrawal").setTransactionAmount(11000.00).setAvailableBalance(39000.00).setAtmLocation("Mumbai").setTransactionDate("13-09-2026").setTransactionTime("06:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a16.setCustomerName("Deepak").setBankName("SBI").setAccountNumber("XXXXXX4275").setCardNumber("XXXX-XXXX-XXXX-7614").setTransactionId("TXN10016").setTransactionType("Cash Withdrawal").setTransactionAmount(4000.00).setAvailableBalance(21000.00).setAtmLocation("Lucknow").setTransactionDate("13-09-2026").setTransactionTime("06:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a17.setCustomerName("Nisha").setBankName("Kotak Mahindra Bank").setAccountNumber("XXXXXX5386").setCardNumber("XXXX-XXXX-XXXX-8725").setTransactionId("TXN10017").setTransactionType("Cash Deposit").setTransactionAmount(30000.00).setAvailableBalance(110000.00).setAtmLocation("Chandigarh").setTransactionDate("13-09-2026").setTransactionTime("07:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a18.setCustomerName("Aditya").setBankName("Axis Bank").setAccountNumber("XXXXXX6493").setCardNumber("XXXX-XXXX-XXXX-9836").setTransactionId("TXN10018").setTransactionType("Cash Withdrawal").setTransactionAmount(13000.00).setAvailableBalance(47000.00).setAtmLocation("Hyderabad").setTransactionDate("13-09-2026").setTransactionTime("07:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a19.setCustomerName("Simran").setBankName("HDFC Bank").setAccountNumber("XXXXXX7528").setCardNumber("XXXX-XXXX-XXXX-1947").setTransactionId("TXN10019").setTransactionType("Cash Withdrawal").setTransactionAmount(7500.00).setAvailableBalance(32500.00).setAtmLocation("Kanpur").setTransactionDate("13-09-2026").setTransactionTime("08:00 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		a20.setCustomerName("Varun").setBankName("SBI").setAccountNumber("XXXXXX8614").setCardNumber("XXXX-XXXX-XXXX-2058").setTransactionId("TXN10020").setTransactionType("Cash Deposit").setTransactionAmount(22000.00).setAvailableBalance(78000.00).setAtmLocation("Delhi").setTransactionDate("13-09-2026").setTransactionTime("08:30 PM").setPaymentMode("Debit Card").setTransactionStatus("Successful");
		
		a1.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");
		
		a2.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a3.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a4.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a5.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a6.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a7.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a8.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a9.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a10.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a11.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a12.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a13.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a14.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a15.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a16.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a17.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a18.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a19.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		a20.printCustomerName().printBankName().printAccountNumber().printCardNumber().printTransactionId().printTransactionType().printTransactionAmount().printAvailableBalance().printAtmLocation().printTransactionDate().printTransactionTime().printPaymentMode().printTransactionStatus();
		System.out.println("==================================================");

		

	}

}
