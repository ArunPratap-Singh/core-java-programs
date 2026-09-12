package immutableClassProgram;

public class HotelBookingDriver {

	public static void main(String[] args) {

		HotelBooking h1 = new HotelBooking(101, "Rahul Sharma", "Taj Palace", "Deluxe Room", 3, 7500.00, 22500.00);
		HotelBooking h2 = new HotelBooking(102, "Priya Verma", "The Oberoi", "Luxury Room", 2, 9000.00, 18000.00);
		HotelBooking h3 = new HotelBooking(103, "Amit Singh", "ITC Maurya", "Executive Room", 4, 8500.00, 34000.00);
		HotelBooking h4 = new HotelBooking(104, "Neha Gupta", "Hyatt Regency", "Deluxe Room", 3, 7000.00, 21000.00);
		HotelBooking h5 = new HotelBooking(105, "Rohit Kumar", "Leela Palace", "Suite", 2, 12000.00, 24000.00);
		HotelBooking h6 = new HotelBooking(106, "Anjali Mishra", "Radisson Blu", "Premium Room", 5, 6500.00, 32500.00);
		HotelBooking h7 = new HotelBooking(107, "Vikas Yadav", "Marriott Hotel", "Deluxe Room", 3, 8000.00, 24000.00);
		HotelBooking h8 = new HotelBooking(108, "Sneha Kapoor", "Novotel", "Standard Room", 2, 5500.00, 11000.00);
		HotelBooking h9 = new HotelBooking(109, "Karan Malhotra", "Trident Hotel", "Luxury Room", 4, 9500.00, 38000.00);
		HotelBooking h10 = new HotelBooking(110, "Pooja Agarwal", "Shangri-La Hotel", "Suite", 3, 11000.00, 33000.00);
		HotelBooking h11 = new HotelBooking(111, "Aditya Srivastava", "Taj Mahal Palace", "Deluxe Room", 2, 10000.00, 20000.00);
		HotelBooking h12 = new HotelBooking(112, "Simran Kaur", "The Lalit", "Premium Room", 4, 7500.00, 30000.00);
		HotelBooking h13 = new HotelBooking(113, "Nikhil Jain", "Hilton Hotel", "Executive Room", 3, 8500.00, 25500.00);
		HotelBooking h14 = new HotelBooking(114, "Kavita Joshi", "Crowne Plaza", "Standard Room", 5, 6000.00, 30000.00);
		HotelBooking h15 = new HotelBooking(115, "Saurabh Tiwari", "Holiday Inn", "Deluxe Room", 2, 6500.00, 13000.00);
		HotelBooking h16 = new HotelBooking(116, "Riya Mehta", "Four Seasons", "Luxury Suite", 3, 15000.00, 45000.00);
		HotelBooking h17 = new HotelBooking(117, "Manish Pandey", "JW Marriott", "Executive Room", 4, 10500.00, 42000.00);
		HotelBooking h18 = new HotelBooking(118, "Swati Saxena", "Sheraton Hotel", "Premium Room", 2, 8000.00, 16000.00);
		HotelBooking h19 = new HotelBooking(119, "Akash Tripathi", "Grand Hyatt", "Suite", 3, 13000.00, 39000.00);
		HotelBooking h20 = new HotelBooking(120, "Divya Singh", "Park Hyatt", "Deluxe Room", 5, 9000.00, 45000.00);

				
		System.out.println("==========================Hotel Booking Details 1================================");
		System.out.println("ObjectReference is: " + h1);
		System.out.println("Booking Id is: " + h1.getBookingId());
		System.out.println("Customer Name is: " + h1.getCustomerName());
		System.out.println("Hotel Name is: " + h1.getHotelName());
		System.out.println("Room Type is: " + h1.getRoomType());
		System.out.println("Number of Nights is: " + h1.getNumberOfNights());
		System.out.println("Price Per Night is: " + h1.getPricePerNight());
		System.out.println("Total Amount is: " + h1.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 2================================");
		System.out.println("ObjectReference is: " + h2);
		System.out.println("Booking Id is: " + h2.getBookingId());
		System.out.println("Customer Name is: " + h2.getCustomerName());
		System.out.println("Hotel Name is: " + h2.getHotelName());
		System.out.println("Room Type is: " + h2.getRoomType());
		System.out.println("Number of Nights is: " + h2.getNumberOfNights());
		System.out.println("Price Per Night is: " + h2.getPricePerNight());
		System.out.println("Total Amount is: " + h2.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 3================================");
		System.out.println("ObjectReference is: " + h3);
		System.out.println("Booking Id is: " + h3.getBookingId());
		System.out.println("Customer Name is: " + h3.getCustomerName());
		System.out.println("Hotel Name is: " + h3.getHotelName());
		System.out.println("Room Type is: " + h3.getRoomType());
		System.out.println("Number of Nights is: " + h3.getNumberOfNights());
		System.out.println("Price Per Night is: " + h3.getPricePerNight());
		System.out.println("Total Amount is: " + h3.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 4================================");
		System.out.println("ObjectReference is: " + h4);
		System.out.println("Booking Id is: " + h4.getBookingId());
		System.out.println("Customer Name is: " + h4.getCustomerName());
		System.out.println("Hotel Name is: " + h4.getHotelName());
		System.out.println("Room Type is: " + h4.getRoomType());
		System.out.println("Number of Nights is: " + h4.getNumberOfNights());
		System.out.println("Price Per Night is: " + h4.getPricePerNight());
		System.out.println("Total Amount is: " + h4.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 5================================");
		System.out.println("ObjectReference is: " + h5);
		System.out.println("Booking Id is: " + h5.getBookingId());
		System.out.println("Customer Name is: " + h5.getCustomerName());
		System.out.println("Hotel Name is: " + h5.getHotelName());
		System.out.println("Room Type is: " + h5.getRoomType());
		System.out.println("Number of Nights is: " + h5.getNumberOfNights());
		System.out.println("Price Per Night is: " + h5.getPricePerNight());
		System.out.println("Total Amount is: " + h5.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 6================================");
		System.out.println("ObjectReference is: " + h6);
		System.out.println("Booking Id is: " + h6.getBookingId());
		System.out.println("Customer Name is: " + h6.getCustomerName());
		System.out.println("Hotel Name is: " + h6.getHotelName());
		System.out.println("Room Type is: " + h6.getRoomType());
		System.out.println("Number of Nights is: " + h6.getNumberOfNights());
		System.out.println("Price Per Night is: " + h6.getPricePerNight());
		System.out.println("Total Amount is: " + h6.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 7================================");
		System.out.println("ObjectReference is: " + h7);
		System.out.println("Booking Id is: " + h7.getBookingId());
		System.out.println("Customer Name is: " + h7.getCustomerName());
		System.out.println("Hotel Name is: " + h7.getHotelName());
		System.out.println("Room Type is: " + h7.getRoomType());
		System.out.println("Number of Nights is: " + h7.getNumberOfNights());
		System.out.println("Price Per Night is: " + h7.getPricePerNight());
		System.out.println("Total Amount is: " + h7.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 8================================");
		System.out.println("ObjectReference is: " + h8);
		System.out.println("Booking Id is: " + h8.getBookingId());
		System.out.println("Customer Name is: " + h8.getCustomerName());
		System.out.println("Hotel Name is: " + h8.getHotelName());
		System.out.println("Room Type is: " + h8.getRoomType());
		System.out.println("Number of Nights is: " + h8.getNumberOfNights());
		System.out.println("Price Per Night is: " + h8.getPricePerNight());
		System.out.println("Total Amount is: " + h8.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 9================================");
		System.out.println("ObjectReference is: " + h9);
		System.out.println("Booking Id is: " + h9.getBookingId());
		System.out.println("Customer Name is: " + h9.getCustomerName());
		System.out.println("Hotel Name is: " + h9.getHotelName());
		System.out.println("Room Type is: " + h9.getRoomType());
		System.out.println("Number of Nights is: " + h9.getNumberOfNights());
		System.out.println("Price Per Night is: " + h9.getPricePerNight());
		System.out.println("Total Amount is: " + h9.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 10================================");
		System.out.println("ObjectReference is: " + h10);
		System.out.println("Booking Id is: " + h10.getBookingId());
		System.out.println("Customer Name is: " + h10.getCustomerName());
		System.out.println("Hotel Name is: " + h10.getHotelName());
		System.out.println("Room Type is: " + h10.getRoomType());
		System.out.println("Number of Nights is: " + h10.getNumberOfNights());
		System.out.println("Price Per Night is: " + h10.getPricePerNight());
		System.out.println("Total Amount is: " + h10.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 11================================");
		System.out.println("ObjectReference is: " + h11);
		System.out.println("Booking Id is: " + h11.getBookingId());
		System.out.println("Customer Name is: " + h11.getCustomerName());
		System.out.println("Hotel Name is: " + h11.getHotelName());
		System.out.println("Room Type is: " + h11.getRoomType());
		System.out.println("Number of Nights is: " + h11.getNumberOfNights());
		System.out.println("Price Per Night is: " + h11.getPricePerNight());
		System.out.println("Total Amount is: " + h11.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 12================================");
		System.out.println("ObjectReference is: " + h12);
		System.out.println("Booking Id is: " + h12.getBookingId());
		System.out.println("Customer Name is: " + h12.getCustomerName());
		System.out.println("Hotel Name is: " + h12.getHotelName());
		System.out.println("Room Type is: " + h12.getRoomType());
		System.out.println("Number of Nights is: " + h12.getNumberOfNights());
		System.out.println("Price Per Night is: " + h12.getPricePerNight());
		System.out.println("Total Amount is: " + h12.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 13================================");
		System.out.println("ObjectReference is: " + h13);
		System.out.println("Booking Id is: " + h13.getBookingId());
		System.out.println("Customer Name is: " + h13.getCustomerName());
		System.out.println("Hotel Name is: " + h13.getHotelName());
		System.out.println("Room Type is: " + h13.getRoomType());
		System.out.println("Number of Nights is: " + h13.getNumberOfNights());
		System.out.println("Price Per Night is: " + h13.getPricePerNight());
		System.out.println("Total Amount is: " + h13.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 14================================");
		System.out.println("ObjectReference is: " + h14);
		System.out.println("Booking Id is: " + h14.getBookingId());
		System.out.println("Customer Name is: " + h14.getCustomerName());
		System.out.println("Hotel Name is: " + h14.getHotelName());
		System.out.println("Room Type is: " + h14.getRoomType());
		System.out.println("Number of Nights is: " + h14.getNumberOfNights());
		System.out.println("Price Per Night is: " + h14.getPricePerNight());
		System.out.println("Total Amount is: " + h14.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 15================================");
		System.out.println("ObjectReference is: " + h15);
		System.out.println("Booking Id is: " + h15.getBookingId());
		System.out.println("Customer Name is: " + h15.getCustomerName());
		System.out.println("Hotel Name is: " + h15.getHotelName());
		System.out.println("Room Type is: " + h15.getRoomType());
		System.out.println("Number of Nights is: " + h15.getNumberOfNights());
		System.out.println("Price Per Night is: " + h15.getPricePerNight());
		System.out.println("Total Amount is: " + h15.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 16================================");
		System.out.println("ObjectReference is: " + h16);
		System.out.println("Booking Id is: " + h16.getBookingId());
		System.out.println("Customer Name is: " + h16.getCustomerName());
		System.out.println("Hotel Name is: " + h16.getHotelName());
		System.out.println("Room Type is: " + h16.getRoomType());
		System.out.println("Number of Nights is: " + h16.getNumberOfNights());
		System.out.println("Price Per Night is: " + h16.getPricePerNight());
		System.out.println("Total Amount is: " + h16.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 17================================");
		System.out.println("ObjectReference is: " + h17);
		System.out.println("Booking Id is: " + h17.getBookingId());
		System.out.println("Customer Name is: " + h17.getCustomerName());
		System.out.println("Hotel Name is: " + h17.getHotelName());
		System.out.println("Room Type is: " + h17.getRoomType());
		System.out.println("Number of Nights is: " + h17.getNumberOfNights());
		System.out.println("Price Per Night is: " + h17.getPricePerNight());
		System.out.println("Total Amount is: " + h17.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 18================================");
		System.out.println("ObjectReference is: " + h18);
		System.out.println("Booking Id is: " + h18.getBookingId());
		System.out.println("Customer Name is: " + h18.getCustomerName());
		System.out.println("Hotel Name is: " + h18.getHotelName());
		System.out.println("Room Type is: " + h18.getRoomType());
		System.out.println("Number of Nights is: " + h18.getNumberOfNights());
		System.out.println("Price Per Night is: " + h18.getPricePerNight());
		System.out.println("Total Amount is: " + h18.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 19================================");
		System.out.println("ObjectReference is: " + h19);
		System.out.println("Booking Id is: " + h19.getBookingId());
		System.out.println("Customer Name is: " + h19.getCustomerName());
		System.out.println("Hotel Name is: " + h19.getHotelName());
		System.out.println("Room Type is: " + h19.getRoomType());
		System.out.println("Number of Nights is: " + h19.getNumberOfNights());
		System.out.println("Price Per Night is: " + h19.getPricePerNight());
		System.out.println("Total Amount is: " + h19.getTotalAmount());


		System.out.println("==========================Hotel Booking Details 20================================");
		System.out.println("ObjectReference is: " + h20);
		System.out.println("Booking Id is: " + h20.getBookingId());
		System.out.println("Customer Name is: " + h20.getCustomerName());
		System.out.println("Hotel Name is: " + h20.getHotelName());
		System.out.println("Room Type is: " + h20.getRoomType());
		System.out.println("Number of Nights is: " + h20.getNumberOfNights());
		System.out.println("Price Per Night is: " + h20.getPricePerNight());
		System.out.println("Total Amount is: " + h20.getTotalAmount());

	}

}
