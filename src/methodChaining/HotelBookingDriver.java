package methodChaining;

public class HotelBookingDriver {

	public static void main(String[] args) {

		HotelBooking h1 = new HotelBooking();
		HotelBooking h2 = new HotelBooking();
		HotelBooking h3 = new HotelBooking();
		HotelBooking h4 = new HotelBooking();
		HotelBooking h5 = new HotelBooking();
		HotelBooking h6 = new HotelBooking();
		HotelBooking h7 = new HotelBooking();
		HotelBooking h8 = new HotelBooking();
		HotelBooking h9 = new HotelBooking();
		HotelBooking h10 = new HotelBooking();
		HotelBooking h11 = new HotelBooking();
		HotelBooking h12 = new HotelBooking();
		HotelBooking h13 = new HotelBooking();
		HotelBooking h14 = new HotelBooking();
		HotelBooking h15 = new HotelBooking();
		HotelBooking h16 = new HotelBooking();
		HotelBooking h17 = new HotelBooking();
		HotelBooking h18 = new HotelBooking();
		HotelBooking h19 = new HotelBooking();
		HotelBooking h20 = new HotelBooking();

		h1.setGuestName("Arun").setHotelName("Taj Palace").setRoomType("Deluxe Room").setCity("Delhi").setNumberOfGuests(2).setNumberOfNights(3).setPricePerNight(8500.00).setCheckInDate("20-09-2026").setCheckOutDate("23-09-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h2.setGuestName("Rahul").setHotelName("The Oberoi").setRoomType("Luxury Suite").setCity("Mumbai").setNumberOfGuests(2).setNumberOfNights(4).setPricePerNight(12000.00).setCheckInDate("22-09-2026").setCheckOutDate("26-09-2026").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		h3.setGuestName("Amit").setHotelName("ITC Grand").setRoomType("Executive Room").setCity("Bangalore").setNumberOfGuests(1).setNumberOfNights(2).setPricePerNight(7500.00).setCheckInDate("25-09-2026").setCheckOutDate("27-09-2026").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		h4.setGuestName("Priya").setHotelName("Leela Palace").setRoomType("Premium Room").setCity("Jaipur").setNumberOfGuests(3).setNumberOfNights(5).setPricePerNight(9500.00).setCheckInDate("28-09-2026").setCheckOutDate("03-10-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h5.setGuestName("Neha").setHotelName("Hyatt Regency").setRoomType("Deluxe Room").setCity("Gurgaon").setNumberOfGuests(2).setNumberOfNights(3).setPricePerNight(6800.00).setCheckInDate("01-10-2026").setCheckOutDate("04-10-2026").setPaymentMode("Credit Card").setBookingStatus("Pending");
		h6.setGuestName("Vikas").setHotelName("Radisson Blu").setRoomType("Business Room").setCity("Lucknow").setNumberOfGuests(1).setNumberOfNights(2).setPricePerNight(5500.00).setCheckInDate("05-10-2026").setCheckOutDate("07-10-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h7.setGuestName("Rohit").setHotelName("Marriott Hotel").setRoomType("King Room").setCity("Pune").setNumberOfGuests(2).setNumberOfNights(4).setPricePerNight(8200.00).setCheckInDate("08-10-2026").setCheckOutDate("12-10-2026").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		h8.setGuestName("Anjali").setHotelName("Sheraton Grand").setRoomType("Deluxe Suite").setCity("Chennai").setNumberOfGuests(2).setNumberOfNights(3).setPricePerNight(9000.00).setCheckInDate("10-10-2026").setCheckOutDate("13-10-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h9.setGuestName("Suresh").setHotelName("Novotel Hotel").setRoomType("Standard Room").setCity("Hyderabad").setNumberOfGuests(1).setNumberOfNights(2).setPricePerNight(4800.00).setCheckInDate("12-10-2026").setCheckOutDate("14-10-2026").setPaymentMode("Cash").setBookingStatus("Pending");
		h10.setGuestName("Karan").setHotelName("Holiday Inn").setRoomType("Family Room").setCity("Kolkata").setNumberOfGuests(4).setNumberOfNights(5).setPricePerNight(6200.00).setCheckInDate("15-10-2026").setCheckOutDate("20-10-2026").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		h11.setGuestName("Pooja").setHotelName("The Lalit").setRoomType("Premium Suite").setCity("Delhi").setNumberOfGuests(2).setNumberOfNights(3).setPricePerNight(7800.00).setCheckInDate("18-10-2026").setCheckOutDate("21-10-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h12.setGuestName("Manish").setHotelName("Trident Hotel").setRoomType("Deluxe Room").setCity("Mumbai").setNumberOfGuests(2).setNumberOfNights(4).setPricePerNight(8800.00).setCheckInDate("20-10-2026").setCheckOutDate("24-10-2026").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		h13.setGuestName("Sneha").setHotelName("Ramada Hotel").setRoomType("Executive Suite").setCity("Noida").setNumberOfGuests(3).setNumberOfNights(2).setPricePerNight(7200.00).setCheckInDate("22-10-2026").setCheckOutDate("24-10-2026").setPaymentMode("UPI").setBookingStatus("Pending");
		h14.setGuestName("Ravi").setHotelName("Crowne Plaza").setRoomType("King Suite").setCity("Bangalore").setNumberOfGuests(2).setNumberOfNights(5).setPricePerNight(10500.00).setCheckInDate("25-10-2026").setCheckOutDate("30-10-2026").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		h15.setGuestName("Simran").setHotelName("Pullman Hotel").setRoomType("Superior Room").setCity("Gurgaon").setNumberOfGuests(1).setNumberOfNights(3).setPricePerNight(6500.00).setCheckInDate("27-10-2026").setCheckOutDate("30-10-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");
		h16.setGuestName("Deepak").setHotelName("Four Points").setRoomType("Deluxe Room").setCity("Chandigarh").setNumberOfGuests(2).setNumberOfNights(4).setPricePerNight(5900.00).setCheckInDate("01-11-2026").setCheckOutDate("05-11-2026").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		h17.setGuestName("Kavita").setHotelName("Vivanta Hotel").setRoomType("Premium Room").setCity("Goa").setNumberOfGuests(2).setNumberOfNights(6).setPricePerNight(11000.00).setCheckInDate("05-11-2026").setCheckOutDate("11-11-2026").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		h18.setGuestName("Nitin").setHotelName("ibis Hotel").setRoomType("Standard Room").setCity("Ahmedabad").setNumberOfGuests(1).setNumberOfNights(2).setPricePerNight(4200.00).setCheckInDate("10-11-2026").setCheckOutDate("12-11-2026").setPaymentMode("UPI").setBookingStatus("Pending");
		h19.setGuestName("Shivani").setHotelName("Taj Resort").setRoomType("Pool View Room").setCity("Goa").setNumberOfGuests(3).setNumberOfNights(5).setPricePerNight(9800.00).setCheckInDate("15-11-2026").setCheckOutDate("20-11-2026").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		h20.setGuestName("Varun").setHotelName("Park Plaza").setRoomType("Luxury Room").setCity("Hyderabad").setNumberOfGuests(2).setNumberOfNights(3).setPricePerNight(7600.00).setCheckInDate("20-11-2026").setCheckOutDate("23-11-2026").setPaymentMode("UPI").setBookingStatus("Confirmed");

		h1.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");
		
		h2.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h3.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h4.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h5.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h6.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h7.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h8.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h9.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h10.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h11.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h12.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h13.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h14.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h15.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h16.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h17.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h18.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h19.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		h20.printGuestName().printHotelName().printRoomType().printCity().printNumberOfGuests().printNumberOfNights().printPricePerNight().printCheckInDate().printCheckOutDate().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

	}

}
