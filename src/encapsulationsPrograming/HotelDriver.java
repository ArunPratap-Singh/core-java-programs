package encapsulationsPrograming;

public class HotelDriver {

	public static void main(String[] args) {
		
		System.out.println("===========================Main Method Starts=================================");
		
		Hotel h1 = new Hotel("Taj Palace", "HTL101", "Delhi", "Deluxe", 8500.00, true);
		Hotel h2 = new Hotel("The Oberoi", "HTL102", "Mumbai", "Luxury", 12000.00, true);
		Hotel h3 = new Hotel("ITC Maurya", "HTL103", "Delhi", "Premium", 9500.00, false);
		Hotel h4 = new Hotel("Hyatt Regency", "HTL104", "Jaipur", "Deluxe", 7800.00, true);
		Hotel h5 = new Hotel("Radisson Blu", "HTL105", "Lucknow", "Executive", 6500.00, true);
		Hotel h6 = new Hotel("JW Marriott", "HTL106", "Pune", "Luxury", 11000.00, false);
		Hotel h7 = new Hotel("Leela Palace", "HTL107", "Udaipur", "Suite", 15000.00, true);
		Hotel h8 = new Hotel("Hilton Garden Inn", "HTL108", "Bangalore", "Standard", 5500.00, true);
		Hotel h9 = new Hotel("Novotel", "HTL109", "Hyderabad", "Deluxe", 7200.00, false);
		Hotel h10 = new Hotel("Sheraton Grand", "HTL110", "Chennai", "Premium", 9800.00, true);
		Hotel h11 = new Hotel("Four Seasons", "HTL111", "Mumbai", "Luxury", 18000.00, true);
		Hotel h12 = new Hotel("Lemon Tree Hotel", "HTL112", "Goa", "Standard", 4800.00, false);
		Hotel h13 = new Hotel("The Lalit", "HTL113", "Kolkata", "Deluxe", 7500.00, true);
		Hotel h14 = new Hotel("Trident Hotel", "HTL114", "Agra", "Premium", 8200.00, true);
		Hotel h15 = new Hotel("Holiday Inn", "HTL115", "Chandigarh", "Executive", 6900.00, false);
		Hotel h16 = new Hotel("Vivanta", "HTL116", "Delhi", "Luxury", 10500.00, true);
		Hotel h17 = new Hotel("Park Plaza", "HTL117", "Noida", "Deluxe", 7300.00, true);
		Hotel h18 = new Hotel("Ramada Hotel", "HTL118", "Varanasi", "Standard", 4200.00, false);
		Hotel h19 = new Hotel("Royal Orchid", "HTL119", "Bangalore", "Premium", 8900.00, true);
		Hotel h20 = new Hotel("Fortune Hotel", "HTL120", "Lucknow", "Executive", 6100.00, true);
		Hotel h21 = new Hotel("Westin Hotel", "HTL121", "Gurgaon", "Luxury", 13500.00, false);
		Hotel h22 = new Hotel("Courtyard Marriott", "HTL122", "Ahmedabad", "Deluxe", 8700.00, true);
		Hotel h23 = new Hotel("Grand Hyatt", "HTL123", "Goa", "Suite", 14500.00, true);
		Hotel h24 = new Hotel("Ibis Hotel", "HTL124", "Pune", "Standard", 3900.00, false);
		Hotel h25 = new Hotel("Golden Tulip", "HTL125", "Jaipur", "Deluxe", 6800.00, true);
		Hotel h26 = new Hotel("Ritz Plaza", "HTL126", "Amritsar", "Premium", 8400.00, true);
		Hotel h27 = new Hotel("The Park", "HTL127", "Kolkata", "Luxury", 11500.00, false);
		Hotel h28 = new Hotel("Clarks Inn", "HTL128", "Bhopal", "Standard", 4500.00, true);
		Hotel h29 = new Hotel("Sayaji Hotel", "HTL129", "Indore", "Deluxe", 7100.00, true);
		Hotel h30 = new Hotel("Sarovar Hotel", "HTL130", "Dehradun", "Executive", 6300.00, false);
		Hotel h31 = new Hotel("The Fern", "HTL131", "Kochi", "Premium", 9200.00, true);
		Hotel h32 = new Hotel("Ginger Hotel", "HTL132", "Patna", "Standard", 3700.00, true);
		Hotel h33 = new Hotel("Sun N Sand", "HTL133", "Mumbai", "Deluxe", 7600.00, false);
		Hotel h34 = new Hotel("Marriott Resort", "HTL134", "Goa", "Luxury", 16000.00, true);
		Hotel h35 = new Hotel("Regenta Hotel", "HTL135", "Bangalore", "Premium", 8600.00, true);
		Hotel h36 = new Hotel("Blue Diamond Hotel", "HTL136", "Pune", "Deluxe", 7400.00, false);
		Hotel h37 = new Hotel("Hotel Grand", "HTL137", "Shimla", "Standard", 5200.00, true);
		Hotel h38 = new Hotel("Snow View Resort", "HTL138", "Manali", "Suite", 12500.00, true);
		Hotel h39 = new Hotel("Lake View Hotel", "HTL139", "Udaipur", "Premium", 9700.00, false);
		Hotel h40 = new Hotel("Green Park Hotel", "HTL140", "Hyderabad", "Executive", 6700.00, true);
		Hotel h41 = new Hotel("Ocean Pearl", "HTL141", "Chennai", "Luxury", 14000.00, true);
		Hotel h42 = new Hotel("City Palace Hotel", "HTL142", "Jaipur", "Deluxe", 7900.00, false);
		Hotel h43 = new Hotel("Royal Residency", "HTL143", "Delhi", "Premium", 9300.00, true);
		Hotel h44 = new Hotel("Heritage Inn", "HTL144", "Jodhpur", "Standard", 5100.00, true);
		Hotel h45 = new Hotel("Palm Grove Resort", "HTL145", "Goa", "Luxury", 15500.00, false);
		Hotel h46 = new Hotel("Mountain View Hotel", "HTL146", "Nainital", "Deluxe", 6900.00, true);
		Hotel h47 = new Hotel("Crystal Palace", "HTL147", "Agra", "Premium", 8800.00, true);
		Hotel h48 = new Hotel("Sunrise Hotel", "HTL148", "Varanasi", "Standard", 4100.00, false);
		Hotel h49 = new Hotel("Metro Hotel", "HTL149", "Noida", "Executive", 6400.00, true);
		Hotel h50 = new Hotel("Royal Palace Resort", "HTL150", "Udaipur", "Suite", 17500.00, true);

				
		System.out.println("=========================Hotel Room Details 1===========================");
		System.out.println("Object Reference is: " + h1);
		System.out.println("Hotel Name is: " + h1.getHotelName());
		System.out.println("Hotel ID is: " + h1.getHotelID());
		System.out.println("Location is: " + h1.getLocation());
		System.out.println("Room Type is: " + h1.getRoomType());
		System.out.println("Room Price is: " + h1.getRoomPrice());
		System.out.println("Room Available is: " + h1.getRoomAvailable());
		System.out.println("Booking Status is: " + h1.getBookingStatus());


		System.out.println("=========================Hotel Room Details 2===========================");
		System.out.println("Object Reference is: " + h2);
		System.out.println("Hotel Name is: " + h2.getHotelName());
		System.out.println("Hotel ID is: " + h2.getHotelID());
		System.out.println("Location is: " + h2.getLocation());
		System.out.println("Room Type is: " + h2.getRoomType());
		System.out.println("Room Price is: " + h2.getRoomPrice());
		System.out.println("Room Available is: " + h2.getRoomAvailable());
		System.out.println("Booking Status is: " + h2.getBookingStatus());


		System.out.println("=========================Hotel Room Details 3===========================");
		System.out.println("Object Reference is: " + h3);
		System.out.println("Hotel Name is: " + h3.getHotelName());
		System.out.println("Hotel ID is: " + h3.getHotelID());
		System.out.println("Location is: " + h3.getLocation());
		System.out.println("Room Type is: " + h3.getRoomType());
		System.out.println("Room Price is: " + h3.getRoomPrice());
		System.out.println("Room Available is: " + h3.getRoomAvailable());
		System.out.println("Booking Status is: " + h3.getBookingStatus());


		System.out.println("=========================Hotel Room Details 4===========================");
		System.out.println("Object Reference is: " + h4);
		System.out.println("Hotel Name is: " + h4.getHotelName());
		System.out.println("Hotel ID is: " + h4.getHotelID());
		System.out.println("Location is: " + h4.getLocation());
		System.out.println("Room Type is: " + h4.getRoomType());
		System.out.println("Room Price is: " + h4.getRoomPrice());
		System.out.println("Room Available is: " + h4.getRoomAvailable());
		System.out.println("Booking Status is: " + h4.getBookingStatus());


		System.out.println("=========================Hotel Room Details 5===========================");
		System.out.println("Object Reference is: " + h5);
		System.out.println("Hotel Name is: " + h5.getHotelName());
		System.out.println("Hotel ID is: " + h5.getHotelID());
		System.out.println("Location is: " + h5.getLocation());
		System.out.println("Room Type is: " + h5.getRoomType());
		System.out.println("Room Price is: " + h5.getRoomPrice());
		System.out.println("Room Available is: " + h5.getRoomAvailable());
		System.out.println("Booking Status is: " + h5.getBookingStatus());


		System.out.println("=========================Hotel Room Details 6===========================");
		System.out.println("Object Reference is: " + h6);
		System.out.println("Hotel Name is: " + h6.getHotelName());
		System.out.println("Hotel ID is: " + h6.getHotelID());
		System.out.println("Location is: " + h6.getLocation());
		System.out.println("Room Type is: " + h6.getRoomType());
		System.out.println("Room Price is: " + h6.getRoomPrice());
		System.out.println("Room Available is: " + h6.getRoomAvailable());
		System.out.println("Booking Status is: " + h6.getBookingStatus());


		System.out.println("=========================Hotel Room Details 7===========================");
		System.out.println("Object Reference is: " + h7);
		System.out.println("Hotel Name is: " + h7.getHotelName());
		System.out.println("Hotel ID is: " + h7.getHotelID());
		System.out.println("Location is: " + h7.getLocation());
		System.out.println("Room Type is: " + h7.getRoomType());
		System.out.println("Room Price is: " + h7.getRoomPrice());
		System.out.println("Room Available is: " + h7.getRoomAvailable());
		System.out.println("Booking Status is: " + h7.getBookingStatus());


		System.out.println("=========================Hotel Room Details 8===========================");
		System.out.println("Object Reference is: " + h8);
		System.out.println("Hotel Name is: " + h8.getHotelName());
		System.out.println("Hotel ID is: " + h8.getHotelID());
		System.out.println("Location is: " + h8.getLocation());
		System.out.println("Room Type is: " + h8.getRoomType());
		System.out.println("Room Price is: " + h8.getRoomPrice());
		System.out.println("Room Available is: " + h8.getRoomAvailable());
		System.out.println("Booking Status is: " + h8.getBookingStatus());


		System.out.println("=========================Hotel Room Details 9===========================");
		System.out.println("Object Reference is: " + h9);
		System.out.println("Hotel Name is: " + h9.getHotelName());
		System.out.println("Hotel ID is: " + h9.getHotelID());
		System.out.println("Location is: " + h9.getLocation());
		System.out.println("Room Type is: " + h9.getRoomType());
		System.out.println("Room Price is: " + h9.getRoomPrice());
		System.out.println("Room Available is: " + h9.getRoomAvailable());
		System.out.println("Booking Status is: " + h9.getBookingStatus());


		System.out.println("=========================Hotel Room Details 10===========================");
		System.out.println("Object Reference is: " + h10);
		System.out.println("Hotel Name is: " + h10.getHotelName());
		System.out.println("Hotel ID is: " + h10.getHotelID());
		System.out.println("Location is: " + h10.getLocation());
		System.out.println("Room Type is: " + h10.getRoomType());
		System.out.println("Room Price is: " + h10.getRoomPrice());
		System.out.println("Room Available is: " + h10.getRoomAvailable());
		System.out.println("Booking Status is: " + h10.getBookingStatus());


		System.out.println("=========================Hotel Room Details 11===========================");
		System.out.println("Object Reference is: " + h11);
		System.out.println("Hotel Name is: " + h11.getHotelName());
		System.out.println("Hotel ID is: " + h11.getHotelID());
		System.out.println("Location is: " + h11.getLocation());
		System.out.println("Room Type is: " + h11.getRoomType());
		System.out.println("Room Price is: " + h11.getRoomPrice());
		System.out.println("Room Available is: " + h11.getRoomAvailable());
		System.out.println("Booking Status is: " + h11.getBookingStatus());


		System.out.println("=========================Hotel Room Details 12===========================");
		System.out.println("Object Reference is: " + h12);
		System.out.println("Hotel Name is: " + h12.getHotelName());
		System.out.println("Hotel ID is: " + h12.getHotelID());
		System.out.println("Location is: " + h12.getLocation());
		System.out.println("Room Type is: " + h12.getRoomType());
		System.out.println("Room Price is: " + h12.getRoomPrice());
		System.out.println("Room Available is: " + h12.getRoomAvailable());
		System.out.println("Booking Status is: " + h12.getBookingStatus());


		System.out.println("=========================Hotel Room Details 13===========================");

		System.out.println("Object Reference is: " + h13);
		System.out.println("Hotel Name is: " + h13.getHotelName());
		System.out.println("Hotel ID is: " + h13.getHotelID());
		System.out.println("Location is: " + h13.getLocation());
		System.out.println("Room Type is: " + h13.getRoomType());
		System.out.println("Room Price is: " + h13.getRoomPrice());
		System.out.println("Room Available is: " + h13.getRoomAvailable());
		System.out.println("Booking Status is: " + h13.getBookingStatus());


		System.out.println("=========================Hotel Room Details 14===========================");
		System.out.println("Object Reference is: " + h14);
		System.out.println("Hotel Name is: " + h14.getHotelName());
		System.out.println("Hotel ID is: " + h14.getHotelID());
		System.out.println("Location is: " + h14.getLocation());
		System.out.println("Room Type is: " + h14.getRoomType());
		System.out.println("Room Price is: " + h14.getRoomPrice());
		System.out.println("Room Available is: " + h14.getRoomAvailable());
		System.out.println("Booking Status is: " + h14.getBookingStatus());


		System.out.println("=========================Hotel Room Details 15===========================");
		System.out.println("Object Reference is: " + h15);
		System.out.println("Hotel Name is: " + h15.getHotelName());
		System.out.println("Hotel ID is: " + h15.getHotelID());
		System.out.println("Location is: " + h15.getLocation());
		System.out.println("Room Type is: " + h15.getRoomType());
		System.out.println("Room Price is: " + h15.getRoomPrice());
		System.out.println("Room Available is: " + h15.getRoomAvailable());
		System.out.println("Booking Status is: " + h15.getBookingStatus());


		System.out.println("=========================Hotel Room Details 16===========================");
		System.out.println("Object Reference is: " + h16);
		System.out.println("Hotel Name is: " + h16.getHotelName());
		System.out.println("Hotel ID is: " + h16.getHotelID());
		System.out.println("Location is: " + h16.getLocation());
		System.out.println("Room Type is: " + h16.getRoomType());
		System.out.println("Room Price is: " + h16.getRoomPrice());
		System.out.println("Room Available is: " + h16.getRoomAvailable());
		System.out.println("Booking Status is: " + h16.getBookingStatus());


		System.out.println("=========================Hotel Room Details 17===========================");
		System.out.println("Object Reference is: " + h17);
		System.out.println("Hotel Name is: " + h17.getHotelName());
		System.out.println("Hotel ID is: " + h17.getHotelID());
		System.out.println("Location is: " + h17.getLocation());
		System.out.println("Room Type is: " + h17.getRoomType());
		System.out.println("Room Price is: " + h17.getRoomPrice());
		System.out.println("Room Available is: " + h17.getRoomAvailable());
		System.out.println("Booking Status is: " + h17.getBookingStatus());


		System.out.println("=========================Hotel Room Details 18===========================");
		System.out.println("Object Reference is: " + h18);
		System.out.println("Hotel Name is: " + h18.getHotelName());
		System.out.println("Hotel ID is: " + h18.getHotelID());
		System.out.println("Location is: " + h18.getLocation());
		System.out.println("Room Type is: " + h18.getRoomType());
		System.out.println("Room Price is: " + h18.getRoomPrice());
		System.out.println("Room Available is: " + h18.getRoomAvailable());
		System.out.println("Booking Status is: " + h18.getBookingStatus());


		System.out.println("=========================Hotel Room Details 19===========================");
		System.out.println("Object Reference is: " + h19);
		System.out.println("Hotel Name is: " + h19.getHotelName());
		System.out.println("Hotel ID is: " + h19.getHotelID());
		System.out.println("Location is: " + h19.getLocation());
		System.out.println("Room Type is: " + h19.getRoomType());
		System.out.println("Room Price is: " + h19.getRoomPrice());
		System.out.println("Room Available is: " + h19.getRoomAvailable());
		System.out.println("Booking Status is: " + h19.getBookingStatus());


		System.out.println("=========================Hotel Room Details 20===========================");
		System.out.println("Object Reference is: " + h20);
		System.out.println("Hotel Name is: " + h20.getHotelName());
		System.out.println("Hotel ID is: " + h20.getHotelID());
		System.out.println("Location is: " + h20.getLocation());
		System.out.println("Room Type is: " + h20.getRoomType());
		System.out.println("Room Price is: " + h20.getRoomPrice());
		System.out.println("Room Available is: " + h20.getRoomAvailable());
		System.out.println("Booking Status is: " + h20.getBookingStatus());


		System.out.println("=========================Hotel Room Details 21===========================");
		System.out.println("Object Reference is: " + h21);
		System.out.println("Hotel Name is: " + h21.getHotelName());
		System.out.println("Hotel ID is: " + h21.getHotelID());
		System.out.println("Location is: " + h21.getLocation());
		System.out.println("Room Type is: " + h21.getRoomType());
		System.out.println("Room Price is: " + h21.getRoomPrice());
		System.out.println("Room Available is: " + h21.getRoomAvailable());
		System.out.println("Booking Status is: " + h21.getBookingStatus());


		System.out.println("=========================Hotel Room Details 22===========================");
		System.out.println("Object Reference is: " + h22);
		System.out.println("Hotel Name is: " + h22.getHotelName());
		System.out.println("Hotel ID is: " + h22.getHotelID());
		System.out.println("Location is: " + h22.getLocation());
		System.out.println("Room Type is: " + h22.getRoomType());
		System.out.println("Room Price is: " + h22.getRoomPrice());
		System.out.println("Room Available is: " + h22.getRoomAvailable());
		System.out.println("Booking Status is: " + h22.getBookingStatus());


		System.out.println("=========================Hotel Room Details 23===========================");
		System.out.println("Object Reference is: " + h23);
		System.out.println("Hotel Name is: " + h23.getHotelName());
		System.out.println("Hotel ID is: " + h23.getHotelID());
		System.out.println("Location is: " + h23.getLocation());
		System.out.println("Room Type is: " + h23.getRoomType());
		System.out.println("Room Price is: " + h23.getRoomPrice());
		System.out.println("Room Available is: " + h23.getRoomAvailable());
		System.out.println("Booking Status is: " + h23.getBookingStatus());


		System.out.println("=========================Hotel Room Details 24===========================");
		System.out.println("Object Reference is: " + h24);
		System.out.println("Hotel Name is: " + h24.getHotelName());
		System.out.println("Hotel ID is: " + h24.getHotelID());
		System.out.println("Location is: " + h24.getLocation());
		System.out.println("Room Type is: " + h24.getRoomType());
		System.out.println("Room Price is: " + h24.getRoomPrice());
		System.out.println("Room Available is: " + h24.getRoomAvailable());
		System.out.println("Booking Status is: " + h24.getBookingStatus());


		System.out.println("=========================Hotel Room Details 25===========================");
		System.out.println("Object Reference is: " + h25);
		System.out.println("Hotel Name is: " + h25.getHotelName());
		System.out.println("Hotel ID is: " + h25.getHotelID());
		System.out.println("Location is: " + h25.getLocation());
		System.out.println("Room Type is: " + h25.getRoomType());
		System.out.println("Room Price is: " + h25.getRoomPrice());
		System.out.println("Room Available is: " + h25.getRoomAvailable());
		System.out.println("Booking Status is: " + h25.getBookingStatus());


		System.out.println("=========================Hotel Room Details 26===========================");
		System.out.println("Object Reference is: " + h26);
		System.out.println("Hotel Name is: " + h26.getHotelName());
		System.out.println("Hotel ID is: " + h26.getHotelID());
		System.out.println("Location is: " + h26.getLocation());
		System.out.println("Room Type is: " + h26.getRoomType());
		System.out.println("Room Price is: " + h26.getRoomPrice());
		System.out.println("Room Available is: " + h26.getRoomAvailable());
		System.out.println("Booking Status is: " + h26.getBookingStatus());


		System.out.println("=========================Hotel Room Details 27===========================");
		System.out.println("Object Reference is: " + h27);
		System.out.println("Hotel Name is: " + h27.getHotelName());
		System.out.println("Hotel ID is: " + h27.getHotelID());
		System.out.println("Location is: " + h27.getLocation());
		System.out.println("Room Type is: " + h27.getRoomType());
		System.out.println("Room Price is: " + h27.getRoomPrice());
		System.out.println("Room Available is: " + h27.getRoomAvailable());
		System.out.println("Booking Status is: " + h27.getBookingStatus());


		System.out.println("=========================Hotel Room Details 28===========================");
		System.out.println("Object Reference is: " + h28);
		System.out.println("Hotel Name is: " + h28.getHotelName());
		System.out.println("Hotel ID is: " + h28.getHotelID());
		System.out.println("Location is: " + h28.getLocation());
		System.out.println("Room Type is: " + h28.getRoomType());
		System.out.println("Room Price is: " + h28.getRoomPrice());
		System.out.println("Room Available is: " + h28.getRoomAvailable());
		System.out.println("Booking Status is: " + h28.getBookingStatus());


		System.out.println("=========================Hotel Room Details 29===========================");
		System.out.println("Object Reference is: " + h29);
		System.out.println("Hotel Name is: " + h29.getHotelName());
		System.out.println("Hotel ID is: " + h29.getHotelID());
		System.out.println("Location is: " + h29.getLocation());
		System.out.println("Room Type is: " + h29.getRoomType());
		System.out.println("Room Price is: " + h29.getRoomPrice());
		System.out.println("Room Available is: " + h29.getRoomAvailable());
		System.out.println("Booking Status is: " + h29.getBookingStatus());


		System.out.println("=========================Hotel Room Details 30===========================");
		System.out.println("Object Reference is: " + h30);
		System.out.println("Hotel Name is: " + h30.getHotelName());
		System.out.println("Hotel ID is: " + h30.getHotelID());
		System.out.println("Location is: " + h30.getLocation());
		System.out.println("Room Type is: " + h30.getRoomType());
		System.out.println("Room Price is: " + h30.getRoomPrice());
		System.out.println("Room Available is: " + h30.getRoomAvailable());
		System.out.println("Booking Status is: " + h30.getBookingStatus());


		System.out.println("=========================Hotel Room Details 31===========================");
		System.out.println("Object Reference is: " + h31);
		System.out.println("Hotel Name is: " + h31.getHotelName());
		System.out.println("Hotel ID is: " + h31.getHotelID());
		System.out.println("Location is: " + h31.getLocation());
		System.out.println("Room Type is: " + h31.getRoomType());
		System.out.println("Room Price is: " + h31.getRoomPrice());
		System.out.println("Room Available is: " + h31.getRoomAvailable());
		System.out.println("Booking Status is: " + h31.getBookingStatus());


		System.out.println("=========================Hotel Room Details 32===========================");
		System.out.println("Object Reference is: " + h32);
		System.out.println("Hotel Name is: " + h32.getHotelName());
		System.out.println("Hotel ID is: " + h32.getHotelID());
		System.out.println("Location is: " + h32.getLocation());
		System.out.println("Room Type is: " + h32.getRoomType());
		System.out.println("Room Price is: " + h32.getRoomPrice());
		System.out.println("Room Available is: " + h32.getRoomAvailable());
		System.out.println("Booking Status is: " + h32.getBookingStatus());


		System.out.println("=========================Hotel Room Details 33===========================");
		System.out.println("Object Reference is: " + h33);
		System.out.println("Hotel Name is: " + h33.getHotelName());
		System.out.println("Hotel ID is: " + h33.getHotelID());
		System.out.println("Location is: " + h33.getLocation());
		System.out.println("Room Type is: " + h33.getRoomType());
		System.out.println("Room Price is: " + h33.getRoomPrice());
		System.out.println("Room Available is: " + h33.getRoomAvailable());
		System.out.println("Booking Status is: " + h33.getBookingStatus());


		System.out.println("=========================Hotel Room Details 34===========================");
		System.out.println("Object Reference is: " + h34);
		System.out.println("Hotel Name is: " + h34.getHotelName());
		System.out.println("Hotel ID is: " + h34.getHotelID());
		System.out.println("Location is: " + h34.getLocation());
		System.out.println("Room Type is: " + h34.getRoomType());
		System.out.println("Room Price is: " + h34.getRoomPrice());
		System.out.println("Room Available is: " + h34.getRoomAvailable());
		System.out.println("Booking Status is: " + h34.getBookingStatus());


		System.out.println("=========================Hotel Room Details 35===========================");
		System.out.println("Object Reference is: " + h35);
		System.out.println("Hotel Name is: " + h35.getHotelName());
		System.out.println("Hotel ID is: " + h35.getHotelID());
		System.out.println("Location is: " + h35.getLocation());
		System.out.println("Room Type is: " + h35.getRoomType());
		System.out.println("Room Price is: " + h35.getRoomPrice());
		System.out.println("Room Available is: " + h35.getRoomAvailable());
		System.out.println("Booking Status is: " + h35.getBookingStatus());


		System.out.println("=========================Hotel Room Details 36===========================");
		System.out.println("Object Reference is: " + h36);
		System.out.println("Hotel Name is: " + h36.getHotelName());
		System.out.println("Hotel ID is: " + h36.getHotelID());
		System.out.println("Location is: " + h36.getLocation());
		System.out.println("Room Type is: " + h36.getRoomType());
		System.out.println("Room Price is: " + h36.getRoomPrice());
		System.out.println("Room Available is: " + h36.getRoomAvailable());
		System.out.println("Booking Status is: " + h36.getBookingStatus());


		System.out.println("=========================Hotel Room Details 37===========================");
		System.out.println("Object Reference is: " + h37);
		System.out.println("Hotel Name is: " + h37.getHotelName());
		System.out.println("Hotel ID is: " + h37.getHotelID());
		System.out.println("Location is: " + h37.getLocation());
		System.out.println("Room Type is: " + h37.getRoomType());
		System.out.println("Room Price is: " + h37.getRoomPrice());
		System.out.println("Room Available is: " + h37.getRoomAvailable());
		System.out.println("Booking Status is: " + h37.getBookingStatus());


		System.out.println("=========================Hotel Room Details 38===========================");
		System.out.println("Object Reference is: " + h38);
		System.out.println("Hotel Name is: " + h38.getHotelName());
		System.out.println("Hotel ID is: " + h38.getHotelID());
		System.out.println("Location is: " + h38.getLocation());
		System.out.println("Room Type is: " + h38.getRoomType());
		System.out.println("Room Price is: " + h38.getRoomPrice());
		System.out.println("Room Available is: " + h38.getRoomAvailable());
		System.out.println("Booking Status is: " + h38.getBookingStatus());


		System.out.println("=========================Hotel Room Details 39===========================");
		System.out.println("Object Reference is: " + h39);
		System.out.println("Hotel Name is: " + h39.getHotelName());
		System.out.println("Hotel ID is: " + h39.getHotelID());
		System.out.println("Location is: " + h39.getLocation());
		System.out.println("Room Type is: " + h39.getRoomType());
		System.out.println("Room Price is: " + h39.getRoomPrice());
		System.out.println("Room Available is: " + h39.getRoomAvailable());
		System.out.println("Booking Status is: " + h39.getBookingStatus());


		System.out.println("=========================Hotel Room Details 40===========================");
		System.out.println("Object Reference is: " + h40);
		System.out.println("Hotel Name is: " + h40.getHotelName());
		System.out.println("Hotel ID is: " + h40.getHotelID());
		System.out.println("Location is: " + h40.getLocation());
		System.out.println("Room Type is: " + h40.getRoomType());
		System.out.println("Room Price is: " + h40.getRoomPrice());
		System.out.println("Room Available is: " + h40.getRoomAvailable());
		System.out.println("Booking Status is: " + h40.getBookingStatus());


		System.out.println("=========================Hotel Room Details 41===========================");
		System.out.println("Object Reference is: " + h41);
		System.out.println("Hotel Name is: " + h41.getHotelName());
		System.out.println("Hotel ID is: " + h41.getHotelID());
		System.out.println("Location is: " + h41.getLocation());
		System.out.println("Room Type is: " + h41.getRoomType());
		System.out.println("Room Price is: " + h41.getRoomPrice());
		System.out.println("Room Available is: " + h41.getRoomAvailable());
		System.out.println("Booking Status is: " + h41.getBookingStatus());


		System.out.println("=========================Hotel Room Details 42===========================");
		System.out.println("Object Reference is: " + h42);
		System.out.println("Hotel Name is: " + h42.getHotelName());
		System.out.println("Hotel ID is: " + h42.getHotelID());
		System.out.println("Location is: " + h42.getLocation());
		System.out.println("Room Type is: " + h42.getRoomType());
		System.out.println("Room Price is: " + h42.getRoomPrice());
		System.out.println("Room Available is: " + h42.getRoomAvailable());
		System.out.println("Booking Status is: " + h42.getBookingStatus());


		System.out.println("=========================Hotel Room Details 43===========================");
		System.out.println("Object Reference is: " + h43);
		System.out.println("Hotel Name is: " + h43.getHotelName());
		System.out.println("Hotel ID is: " + h43.getHotelID());
		System.out.println("Location is: " + h43.getLocation());
		System.out.println("Room Type is: " + h43.getRoomType());
		System.out.println("Room Price is: " + h43.getRoomPrice());
		System.out.println("Room Available is: " + h43.getRoomAvailable());
		System.out.println("Booking Status is: " + h43.getBookingStatus());


		System.out.println("=========================Hotel Room Details 44===========================");
		System.out.println("Object Reference is: " + h44);
		System.out.println("Hotel Name is: " + h44.getHotelName());
		System.out.println("Hotel ID is: " + h44.getHotelID());
		System.out.println("Location is: " + h44.getLocation());
		System.out.println("Room Type is: " + h44.getRoomType());
		System.out.println("Room Price is: " + h44.getRoomPrice());
		System.out.println("Room Available is: " + h44.getRoomAvailable());
		System.out.println("Booking Status is: " + h44.getBookingStatus());


		System.out.println("=========================Hotel Room Details 45===========================");
		System.out.println("Object Reference is: " + h45);
		System.out.println("Hotel Name is: " + h45.getHotelName());
		System.out.println("Hotel ID is: " + h45.getHotelID());
		System.out.println("Location is: " + h45.getLocation());
		System.out.println("Room Type is: " + h45.getRoomType());
		System.out.println("Room Price is: " + h45.getRoomPrice());
		System.out.println("Room Available is: " + h45.getRoomAvailable());
		System.out.println("Booking Status is: " + h45.getBookingStatus());


		System.out.println("=========================Hotel Room Details 46===========================");
		System.out.println("Object Reference is: " + h46);
		System.out.println("Hotel Name is: " + h46.getHotelName());
		System.out.println("Hotel ID is: " + h46.getHotelID());
		System.out.println("Location is: " + h46.getLocation());
		System.out.println("Room Type is: " + h46.getRoomType());
		System.out.println("Room Price is: " + h46.getRoomPrice());
		System.out.println("Room Available is: " + h46.getRoomAvailable());
		System.out.println("Booking Status is: " + h46.getBookingStatus());


		System.out.println("=========================Hotel Room Details 47===========================");
		System.out.println("Object Reference is: " + h47);
		System.out.println("Hotel Name is: " + h47.getHotelName());
		System.out.println("Hotel ID is: " + h47.getHotelID());
		System.out.println("Location is: " + h47.getLocation());
		System.out.println("Room Type is: " + h47.getRoomType());
		System.out.println("Room Price is: " + h47.getRoomPrice());
		System.out.println("Room Available is: " + h47.getRoomAvailable());
		System.out.println("Booking Status is: " + h47.getBookingStatus());


		System.out.println("=========================Hotel Room Details 48===========================");
		System.out.println("Object Reference is: " + h48);
		System.out.println("Hotel Name is: " + h48.getHotelName());
		System.out.println("Hotel ID is: " + h48.getHotelID());
		System.out.println("Location is: " + h48.getLocation());
		System.out.println("Room Type is: " + h48.getRoomType());
		System.out.println("Room Price is: " + h48.getRoomPrice());
		System.out.println("Room Available is: " + h48.getRoomAvailable());
		System.out.println("Booking Status is: " + h48.getBookingStatus());


		System.out.println("=========================Hotel Room Details 49===========================");
		System.out.println("Object Reference is: " + h49);
		System.out.println("Hotel Name is: " + h49.getHotelName());
		System.out.println("Hotel ID is: " + h49.getHotelID());
		System.out.println("Location is: " + h49.getLocation());
		System.out.println("Room Type is: " + h49.getRoomType());
		System.out.println("Room Price is: " + h49.getRoomPrice());
		System.out.println("Room Available is: " + h49.getRoomAvailable());
		System.out.println("Booking Status is: " + h49.getBookingStatus());


		System.out.println("=========================Hotel Room Details 50===========================");
		System.out.println("Object Reference is: " + h50);
		System.out.println("Hotel Name is: " + h50.getHotelName());
		System.out.println("Hotel ID is: " + h50.getHotelID());
		System.out.println("Location is: " + h50.getLocation());
		System.out.println("Room Type is: " + h50.getRoomType());
		System.out.println("Room Price is: " + h50.getRoomPrice());
		System.out.println("Room Available is: " + h50.getRoomAvailable());
		System.out.println("Booking Status is: " + h50.getBookingStatus());
		
		System.out.println("======================================Main Method Ends========================================");
	}

}
