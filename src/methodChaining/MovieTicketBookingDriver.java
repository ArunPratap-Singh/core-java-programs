package methodChaining;

public class MovieTicketBookingDriver {

	public static void main(String[] args) {

		MovieTicketBooking m1 = new MovieTicketBooking();
		MovieTicketBooking m2 = new MovieTicketBooking();
		MovieTicketBooking m3 = new MovieTicketBooking();
		MovieTicketBooking m4 = new MovieTicketBooking();
		MovieTicketBooking m5 = new MovieTicketBooking();
		MovieTicketBooking m6 = new MovieTicketBooking();
		MovieTicketBooking m7 = new MovieTicketBooking();
		MovieTicketBooking m8 = new MovieTicketBooking();
		MovieTicketBooking m9 = new MovieTicketBooking();
		MovieTicketBooking m10 = new MovieTicketBooking();
		MovieTicketBooking m11 = new MovieTicketBooking();
		MovieTicketBooking m12 = new MovieTicketBooking();
		MovieTicketBooking m13 = new MovieTicketBooking();
		MovieTicketBooking m14 = new MovieTicketBooking();
		MovieTicketBooking m15 = new MovieTicketBooking();
		MovieTicketBooking m16 = new MovieTicketBooking();
		MovieTicketBooking m17 = new MovieTicketBooking();
		MovieTicketBooking m18 = new MovieTicketBooking();
		MovieTicketBooking m19 = new MovieTicketBooking();
		MovieTicketBooking m20 = new MovieTicketBooking();

		m1.setCustomerName("Arun").setMovieName("War 2").setTheatreName("PVR Cinemas").setCity("Lucknow").setScreenNumber("Screen 1").setShowDate("15-09-2026").setShowTime("07:30 PM").setSeatType("Recliner").setSeatNumber("A12").setNumberOfTickets(2).setTicketPrice(1200.00).setFoodCombo("Large Popcorn + Coke").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m2.setCustomerName("Rahul").setMovieName("Avatar 3").setTheatreName("INOX").setCity("Delhi").setScreenNumber("Screen 3").setShowDate("16-09-2026").setShowTime("06:45 PM").setSeatType("Premium").setSeatNumber("B15").setNumberOfTickets(3).setTicketPrice(1800.00).setFoodCombo("Medium Popcorn + Coke").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		m3.setCustomerName("Amit").setMovieName("Dhurandhar").setTheatreName("Cinepolis").setCity("Mumbai").setScreenNumber("Screen 2").setShowDate("18-09-2026").setShowTime("09:00 PM").setSeatType("Gold").setSeatNumber("C10").setNumberOfTickets(2).setTicketPrice(1400.00).setFoodCombo("Nachos + Coke").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		m4.setCustomerName("Priya").setMovieName("Jana Gana Mana").setTheatreName("PVR Cinemas").setCity("Bangalore").setScreenNumber("Screen 4").setShowDate("20-09-2026").setShowTime("05:30 PM").setSeatType("Premium").setSeatNumber("D08").setNumberOfTickets(2).setTicketPrice(1600.00).setFoodCombo("Popcorn + Pepsi").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m5.setCustomerName("Neha").setMovieName("The Conjuring").setTheatreName("INOX").setCity("Gurgaon").setScreenNumber("Screen 5").setShowDate("21-09-2026").setShowTime("10:00 PM").setSeatType("Recliner").setSeatNumber("E05").setNumberOfTickets(2).setTicketPrice(2200.00).setFoodCombo("Large Combo").setPaymentMode("Credit Card").setBookingStatus("Pending");
		m6.setCustomerName("Vikas").setMovieName("KGF Chapter 3").setTheatreName("Cinepolis").setCity("Hyderabad").setScreenNumber("Screen 1").setShowDate("22-09-2026").setShowTime("08:00 PM").setSeatType("Gold").setSeatNumber("F12").setNumberOfTickets(3).setTicketPrice(1950.00).setFoodCombo("Popcorn + Nachos").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m7.setCustomerName("Rohit").setMovieName("Pushpa 3").setTheatreName("PVR Cinemas").setCity("Chennai").setScreenNumber("Screen 2").setShowDate("23-09-2026").setShowTime("07:00 PM").setSeatType("Premium").setSeatNumber("G18").setNumberOfTickets(2).setTicketPrice(1500.00).setFoodCombo("Popcorn + Coke").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		m8.setCustomerName("Anjali").setMovieName("Housefull 5").setTheatreName("INOX").setCity("Pune").setScreenNumber("Screen 3").setShowDate("24-09-2026").setShowTime("06:15 PM").setSeatType("Gold").setSeatNumber("H10").setNumberOfTickets(4).setTicketPrice(2400.00).setFoodCombo("Family Combo").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m9.setCustomerName("Suresh").setMovieName("Singham Again").setTheatreName("Cinepolis").setCity("Kolkata").setScreenNumber("Screen 6").setShowDate("25-09-2026").setShowTime("09:15 PM").setSeatType("Recliner").setSeatNumber("J04").setNumberOfTickets(2).setTicketPrice(2000.00).setFoodCombo("Nachos + Coke").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		m10.setCustomerName("Karan").setMovieName("Mission Impossible").setTheatreName("PVR Cinemas").setCity("Noida").setScreenNumber("Screen 7").setShowDate("26-09-2026").setShowTime("08:45 PM").setSeatType("Premium").setSeatNumber("K20").setNumberOfTickets(2).setTicketPrice(1700.00).setFoodCombo("Popcorn + Pepsi").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m11.setCustomerName("Pooja").setMovieName("Fantastic Four").setTheatreName("INOX").setCity("Jaipur").setScreenNumber("Screen 2").setShowDate("27-09-2026").setShowTime("04:30 PM").setSeatType("Gold").setSeatNumber("L14").setNumberOfTickets(3).setTicketPrice(2100.00).setFoodCombo("Large Popcorn").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		m12.setCustomerName("Manish").setMovieName("Superman").setTheatreName("Cinepolis").setCity("Lucknow").setScreenNumber("Screen 4").setShowDate("28-09-2026").setShowTime("07:45 PM").setSeatType("Recliner").setSeatNumber("M08").setNumberOfTickets(2).setTicketPrice(2300.00).setFoodCombo("Premium Combo").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		m13.setCustomerName("Sneha").setMovieName("Toy Story 5").setTheatreName("PVR Cinemas").setCity("Chandigarh").setScreenNumber("Screen 1").setShowDate("29-09-2026").setShowTime("03:30 PM").setSeatType("Premium").setSeatNumber("N16").setNumberOfTickets(3).setTicketPrice(1650.00).setFoodCombo("Kids Combo").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m14.setCustomerName("Ravi").setMovieName("Final Destination").setTheatreName("INOX").setCity("Bangalore").setScreenNumber("Screen 5").setShowDate("30-09-2026").setShowTime("10:30 PM").setSeatType("Gold").setSeatNumber("P11").setNumberOfTickets(2).setTicketPrice(1450.00).setFoodCombo("Popcorn + Nachos").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		m15.setCustomerName("Simran").setMovieName("Jurassic World").setTheatreName("Cinepolis").setCity("Mumbai").setScreenNumber("Screen 3").setShowDate("01-10-2026").setShowTime("08:30 PM").setSeatType("Recliner").setSeatNumber("Q07").setNumberOfTickets(2).setTicketPrice(2500.00).setFoodCombo("Large Combo").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		m16.setCustomerName("Deepak").setMovieName("Avengers Secret Wars").setTheatreName("PVR Cinemas").setCity("Hyderabad").setScreenNumber("Screen 6").setShowDate("02-10-2026").setShowTime("09:30 PM").setSeatType("Premium").setSeatNumber("R13").setNumberOfTickets(3).setTicketPrice(2550.00).setFoodCombo("Popcorn + Coke").setPaymentMode("UPI").setBookingStatus("Pending");
		m17.setCustomerName("Kavita").setMovieName("Black Panther").setTheatreName("INOX").setCity("Delhi").setScreenNumber("Screen 2").setShowDate("03-10-2026").setShowTime("06:00 PM").setSeatType("Gold").setSeatNumber("S09").setNumberOfTickets(2).setTicketPrice(1550.00).setFoodCombo("Nachos + Pepsi").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		m18.setCustomerName("Nitin").setMovieName("Spider-Man").setTheatreName("Cinepolis").setCity("Pune").setScreenNumber("Screen 4").setShowDate("04-10-2026").setShowTime("07:15 PM").setSeatType("Recliner").setSeatNumber("T05").setNumberOfTickets(2).setTicketPrice(2200.00).setFoodCombo("Premium Combo").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		m19.setCustomerName("Shivani").setMovieName("Moana").setTheatreName("PVR Cinemas").setCity("Kolkata").setScreenNumber("Screen 3").setShowDate("05-10-2026").setShowTime("04:00 PM").setSeatType("Premium").setSeatNumber("U17").setNumberOfTickets(3).setTicketPrice(1800.00).setFoodCombo("Family Combo").setPaymentMode("UPI").setBookingStatus("Confirmed");
		m20.setCustomerName("Varun").setMovieName("Avatar").setTheatreName("INOX").setCity("Ahmedabad").setScreenNumber("Screen 1").setShowDate("06-10-2026").setShowTime("08:00 PM").setSeatType("Recliner").setSeatNumber("V10").setNumberOfTickets(2).setTicketPrice(2400.00).setFoodCombo("Large Popcorn + Coke").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		
		m1.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m2.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m3.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m4.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m5.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m6.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m7.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m8.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m9.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m10.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m11.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m12.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m13.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m14.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m15.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m16.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m17.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m18.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m19.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		m20.printCustomerName().printMovieName().printTheatreName().printCity().printScreenNumber().printShowDate().printShowTime().printSeatType().printSeatNumber().printNumberOfTickets().printTicketPrice().printFoodCombo().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

	}

}
