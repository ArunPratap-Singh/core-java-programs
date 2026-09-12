package methodChaining;

public class FlightBookingDriver {

	public static void main(String[] args) {

		FlightBooking f1 = new FlightBooking();
		FlightBooking f2 = new FlightBooking();
		FlightBooking f3 = new FlightBooking();
		FlightBooking f4 = new FlightBooking();
		FlightBooking f5 = new FlightBooking();
		FlightBooking f6 = new FlightBooking();
		FlightBooking f7 = new FlightBooking();
		FlightBooking f8 = new FlightBooking();
		FlightBooking f9 = new FlightBooking();
		FlightBooking f10 = new FlightBooking();
		FlightBooking f11 = new FlightBooking();
		FlightBooking f12 = new FlightBooking();
		FlightBooking f13 = new FlightBooking();
		FlightBooking f14 = new FlightBooking();
		FlightBooking f15 = new FlightBooking();
		FlightBooking f16 = new FlightBooking();
		FlightBooking f17 = new FlightBooking();
		FlightBooking f18 = new FlightBooking();
		FlightBooking f19 = new FlightBooking();
		FlightBooking f20 = new FlightBooking();

		f1.setPassengerName("Arun").setAirlineName("IndiGo").setFlightNumber("6E-203").setSource("Delhi").setDestination("Mumbai").setTravelClass("Economy").setSeatNumber("12A").setNumberOfPassengers(2).setBaggageWeight(30).setTicketPrice(12500.00).setDepartureDate("25-09-2026").setDepartureTime("08:30 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f2.setPassengerName("Rahul").setAirlineName("Air India").setFlightNumber("AI-101").setSource("Mumbai").setDestination("Delhi").setTravelClass("Business").setSeatNumber("04B").setNumberOfPassengers(1).setBaggageWeight(25).setTicketPrice(18500.00).setDepartureDate("27-09-2026").setDepartureTime("10:15 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		f3.setPassengerName("Amit").setAirlineName("Vistara").setFlightNumber("UK-820").setSource("Bangalore").setDestination("Delhi").setTravelClass("Economy").setSeatNumber("18C").setNumberOfPassengers(2).setBaggageWeight(35).setTicketPrice(14200.00).setDepartureDate("29-09-2026").setDepartureTime("06:45 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		f4.setPassengerName("Priya").setAirlineName("IndiGo").setFlightNumber("6E-450").setSource("Lucknow").setDestination("Bangalore").setTravelClass("Economy").setSeatNumber("21D").setNumberOfPassengers(1).setBaggageWeight(20).setTicketPrice(9800.00).setDepartureDate("01-10-2026").setDepartureTime("07:30 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f5.setPassengerName("Neha").setAirlineName("Air India Express").setFlightNumber("IX-302").setSource("Delhi").setDestination("Kolkata").setTravelClass("Economy").setSeatNumber("15A").setNumberOfPassengers(3).setBaggageWeight(45).setTicketPrice(16800.00).setDepartureDate("03-10-2026").setDepartureTime("09:20 AM").setPaymentMode("Credit Card").setBookingStatus("Pending");
		f6.setPassengerName("Vikas").setAirlineName("IndiGo").setFlightNumber("6E-710").setSource("Mumbai").setDestination("Goa").setTravelClass("Economy").setSeatNumber("09F").setNumberOfPassengers(2).setBaggageWeight(25).setTicketPrice(7600.00).setDepartureDate("05-10-2026").setDepartureTime("11:45 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f7.setPassengerName("Rohit").setAirlineName("SpiceJet").setFlightNumber("SG-405").setSource("Delhi").setDestination("Hyderabad").setTravelClass("Economy").setSeatNumber("14B").setNumberOfPassengers(1).setBaggageWeight(20).setTicketPrice(8900.00).setDepartureDate("07-10-2026").setDepartureTime("02:30 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		f8.setPassengerName("Anjali").setAirlineName("Vistara").setFlightNumber("UK-955").setSource("Chennai").setDestination("Mumbai").setTravelClass("Premium Economy").setSeatNumber("07C").setNumberOfPassengers(2).setBaggageWeight(30).setTicketPrice(15400.00).setDepartureDate("09-10-2026").setDepartureTime("05:15 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f9.setPassengerName("Suresh").setAirlineName("Air India").setFlightNumber("AI-650").setSource("Kolkata").setDestination("Delhi").setTravelClass("Business").setSeatNumber("03A").setNumberOfPassengers(1).setBaggageWeight(30).setTicketPrice(22000.00).setDepartureDate("11-10-2026").setDepartureTime("08:00 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		f10.setPassengerName("Karan").setAirlineName("IndiGo").setFlightNumber("6E-820").setSource("Hyderabad").setDestination("Pune").setTravelClass("Economy").setSeatNumber("19E").setNumberOfPassengers(2).setBaggageWeight(30).setTicketPrice(11200.00).setDepartureDate("13-10-2026").setDepartureTime("04:45 PM").setPaymentMode("UPI").setBookingStatus("Pending");
		f11.setPassengerName("Pooja").setAirlineName("Akasa Air").setFlightNumber("QP-140").setSource("Mumbai").setDestination("Delhi").setTravelClass("Economy").setSeatNumber("11D").setNumberOfPassengers(1).setBaggageWeight(20).setTicketPrice(8200.00).setDepartureDate("15-10-2026").setDepartureTime("06:30 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f12.setPassengerName("Manish").setAirlineName("Air India Express").setFlightNumber("IX-540").setSource("Jaipur").setDestination("Mumbai").setTravelClass("Economy").setSeatNumber("16F").setNumberOfPassengers(2).setBaggageWeight(35).setTicketPrice(13400.00).setDepartureDate("17-10-2026").setDepartureTime("01:15 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		f13.setPassengerName("Sneha").setAirlineName("IndiGo").setFlightNumber("6E-310").setSource("Delhi").setDestination("Chennai").setTravelClass("Premium Economy").setSeatNumber("08A").setNumberOfPassengers(2).setBaggageWeight(30).setTicketPrice(17600.00).setDepartureDate("19-10-2026").setDepartureTime("09:45 PM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		f14.setPassengerName("Ravi").setAirlineName("SpiceJet").setFlightNumber("SG-620").setSource("Bangalore").setDestination("Kolkata").setTravelClass("Economy").setSeatNumber("22C").setNumberOfPassengers(3).setBaggageWeight(50).setTicketPrice(19800.00).setDepartureDate("21-10-2026").setDepartureTime("07:10 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f15.setPassengerName("Simran").setAirlineName("Vistara").setFlightNumber("UK-710").setSource("Delhi").setDestination("Goa").setTravelClass("Business").setSeatNumber("02D").setNumberOfPassengers(1).setBaggageWeight(30).setTicketPrice(24500.00).setDepartureDate("23-10-2026").setDepartureTime("12:20 PM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		f16.setPassengerName("Deepak").setAirlineName("IndiGo").setFlightNumber("6E-505").setSource("Lucknow").setDestination("Mumbai").setTravelClass("Economy").setSeatNumber("17B").setNumberOfPassengers(2).setBaggageWeight(25).setTicketPrice(11800.00).setDepartureDate("25-10-2026").setDepartureTime("03:40 PM").setPaymentMode("Debit Card").setBookingStatus("Pending");
		f17.setPassengerName("Kavita").setAirlineName("Air India").setFlightNumber("AI-880").setSource("Delhi").setDestination("Ahmedabad").setTravelClass("Economy").setSeatNumber("13E").setNumberOfPassengers(1).setBaggageWeight(20).setTicketPrice(9300.00).setDepartureDate("27-10-2026").setDepartureTime("10:50 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f18.setPassengerName("Nitin").setAirlineName("Akasa Air").setFlightNumber("QP-720").setSource("Mumbai").setDestination("Bangalore").setTravelClass("Premium Economy").setSeatNumber("06F").setNumberOfPassengers(2).setBaggageWeight(30).setTicketPrice(12800.00).setDepartureDate("29-10-2026").setDepartureTime("08:25 PM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		f19.setPassengerName("Shivani").setAirlineName("IndiGo").setFlightNumber("6E-920").setSource("Hyderabad").setDestination("Delhi").setTravelClass("Economy").setSeatNumber("10A").setNumberOfPassengers(3).setBaggageWeight(40).setTicketPrice(15600.00).setDepartureDate("31-10-2026").setDepartureTime("05:35 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		f20.setPassengerName("Varun").setAirlineName("Air India").setFlightNumber("AI-450").setSource("Delhi").setDestination("Kochi").setTravelClass("Business").setSeatNumber("01C").setNumberOfPassengers(2).setBaggageWeight(40).setTicketPrice(28500.00).setDepartureDate("02-11-2026").setDepartureTime("06:15 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");

		f1.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");
		
		f2.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f3.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f4.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f5.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f6.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f7.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f8.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f9.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f10.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f11.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f12.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f13.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f14.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f15.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f16.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f17.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f18.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f19.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		f20.printPassengerName().printAirlineName().printFlightNumber().printSource().printDestination().printTravelClass().printSeatNumber().printNumberOfPassengers().printBaggageWeight().printTicketPrice().printDepartureDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

	}

}
