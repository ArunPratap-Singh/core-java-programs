package methodChaining;

public class TrainTicketBookingDriver {

	public static void main(String[] args) {

		TrainTicketBooking t1 = new TrainTicketBooking();
		TrainTicketBooking t2 = new TrainTicketBooking();
		TrainTicketBooking t3 = new TrainTicketBooking();
		TrainTicketBooking t4 = new TrainTicketBooking();
		TrainTicketBooking t5 = new TrainTicketBooking();
		TrainTicketBooking t6 = new TrainTicketBooking();
		TrainTicketBooking t7 = new TrainTicketBooking();
		TrainTicketBooking t8 = new TrainTicketBooking();
		TrainTicketBooking t9 = new TrainTicketBooking();
		TrainTicketBooking t10 = new TrainTicketBooking();
		TrainTicketBooking t11 = new TrainTicketBooking();
		TrainTicketBooking t12 = new TrainTicketBooking();
		TrainTicketBooking t13 = new TrainTicketBooking();
		TrainTicketBooking t14 = new TrainTicketBooking();
		TrainTicketBooking t15 = new TrainTicketBooking();
		TrainTicketBooking t16 = new TrainTicketBooking();
		TrainTicketBooking t17 = new TrainTicketBooking();
		TrainTicketBooking t18 = new TrainTicketBooking();
		TrainTicketBooking t19 = new TrainTicketBooking();
		TrainTicketBooking t20 = new TrainTicketBooking();

		t1.setPassengerName("Arun").setTrainName("Rajdhani Express").setTrainNumber("12951").setSource("Delhi").setDestination("Mumbai").setTravelClass("AC First Class").setCoachNumber("A1").setSeatNumber("12").setNumberOfPassengers(2).setTicketPrice(18500.00).setJourneyDate("25-09-2026").setDepartureTime("05:00 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t2.setPassengerName("Rahul").setTrainName("Shatabdi Express").setTrainNumber("12002").setSource("Delhi").setDestination("Bhopal").setTravelClass("AC Chair Car").setCoachNumber("C1").setSeatNumber("25").setNumberOfPassengers(1).setTicketPrice(3200.00).setJourneyDate("27-09-2026").setDepartureTime("06:00 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		t3.setPassengerName("Amit").setTrainName("Duronto Express").setTrainNumber("12290").setSource("Mumbai").setDestination("Nagpur").setTravelClass("AC 2 Tier").setCoachNumber("B2").setSeatNumber("36").setNumberOfPassengers(2).setTicketPrice(7200.00).setJourneyDate("29-09-2026").setDepartureTime("08:15 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		t4.setPassengerName("Priya").setTrainName("Gomti Express").setTrainNumber("12420").setSource("Lucknow").setDestination("Delhi").setTravelClass("AC Chair Car").setCoachNumber("C2").setSeatNumber("18").setNumberOfPassengers(1).setTicketPrice(2800.00).setJourneyDate("01-10-2026").setDepartureTime("06:30 AM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t5.setPassengerName("Neha").setTrainName("Tejas Express").setTrainNumber("82501").setSource("Lucknow").setDestination("Delhi").setTravelClass("Executive Chair Car").setCoachNumber("EC1").setSeatNumber("10").setNumberOfPassengers(2).setTicketPrice(6400.00).setJourneyDate("03-10-2026").setDepartureTime("07:10 AM").setPaymentMode("Credit Card").setBookingStatus("Pending");
		t6.setPassengerName("Vikas").setTrainName("Avadh Express").setTrainNumber("19038").setSource("Bandra").setDestination("Lucknow").setTravelClass("AC 3 Tier").setCoachNumber("B3").setSeatNumber("45").setNumberOfPassengers(2).setTicketPrice(5800.00).setJourneyDate("05-10-2026").setDepartureTime("10:30 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t7.setPassengerName("Rohit").setTrainName("Golden Temple Mail").setTrainNumber("12904").setSource("Mumbai").setDestination("Delhi").setTravelClass("AC 2 Tier").setCoachNumber("A2").setSeatNumber("22").setNumberOfPassengers(1).setTicketPrice(5600.00).setJourneyDate("07-10-2026").setDepartureTime("09:00 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		t8.setPassengerName("Anjali").setTrainName("Chennai Express").setTrainNumber("12163").setSource("Mumbai").setDestination("Chennai").setTravelClass("AC 3 Tier").setCoachNumber("B4").setSeatNumber("31").setNumberOfPassengers(2).setTicketPrice(8200.00).setJourneyDate("09-10-2026").setDepartureTime("12:30 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t9.setPassengerName("Suresh").setTrainName("Howrah Rajdhani").setTrainNumber("12302").setSource("Delhi").setDestination("Kolkata").setTravelClass("AC 2 Tier").setCoachNumber("A2").setSeatNumber("17").setNumberOfPassengers(1).setTicketPrice(7800.00).setJourneyDate("11-10-2026").setDepartureTime("04:55 PM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		t10.setPassengerName("Karan").setTrainName("Karnataka Express").setTrainNumber("12628").setSource("New Delhi").setDestination("Bangalore").setTravelClass("AC 3 Tier").setCoachNumber("B5").setSeatNumber("42").setNumberOfPassengers(2).setTicketPrice(9500.00).setJourneyDate("13-10-2026").setDepartureTime("09:15 PM").setPaymentMode("UPI").setBookingStatus("Pending");
		t11.setPassengerName("Pooja").setTrainName("August Kranti Rajdhani").setTrainNumber("12954").setSource("Mumbai").setDestination("Delhi").setTravelClass("AC First Class").setCoachNumber("H1").setSeatNumber("06").setNumberOfPassengers(1).setTicketPrice(12800.00).setJourneyDate("15-10-2026").setDepartureTime("05:40 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t12.setPassengerName("Manish").setTrainName("Humsafar Express").setTrainNumber("12572").setSource("Gorakhpur").setDestination("Anand Vihar").setTravelClass("AC 3 Tier").setCoachNumber("B2").setSeatNumber("28").setNumberOfPassengers(2).setTicketPrice(6800.00).setJourneyDate("17-10-2026").setDepartureTime("08:00 PM").setPaymentMode("Debit Card").setBookingStatus("Confirmed");
		t13.setPassengerName("Sneha").setTrainName("Kashi Vishwanath Express").setTrainNumber("15128").setSource("New Delhi").setDestination("Varanasi").setTravelClass("AC 2 Tier").setCoachNumber("A1").setSeatNumber("19").setNumberOfPassengers(2).setTicketPrice(6200.00).setJourneyDate("19-10-2026").setDepartureTime("11:35 PM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		t14.setPassengerName("Ravi").setTrainName("Howrah Mail").setTrainNumber("12322").setSource("Mumbai").setDestination("Howrah").setTravelClass("Sleeper Class").setCoachNumber("S5").setSeatNumber("56").setNumberOfPassengers(3).setTicketPrice(4500.00).setJourneyDate("21-10-2026").setDepartureTime("09:40 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t15.setPassengerName("Simran").setTrainName("Maharashtra Express").setTrainNumber("11040").setSource("Gondia").setDestination("Kolhapur").setTravelClass("AC 3 Tier").setCoachNumber("B1").setSeatNumber("15").setNumberOfPassengers(1).setTicketPrice(3900.00).setJourneyDate("23-10-2026").setDepartureTime("07:20 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		t16.setPassengerName("Deepak").setTrainName("Intercity Express").setTrainNumber("14241").setSource("Allahabad").setDestination("Lucknow").setTravelClass("AC Chair Car").setCoachNumber("C1").setSeatNumber("34").setNumberOfPassengers(2).setTicketPrice(2600.00).setJourneyDate("25-10-2026").setDepartureTime("06:45 AM").setPaymentMode("Debit Card").setBookingStatus("Pending");
		t17.setPassengerName("Kavita").setTrainName("Rajdhani Express").setTrainNumber("12952").setSource("Mumbai").setDestination("Delhi").setTravelClass("AC First Class").setCoachNumber("H1").setSeatNumber("08").setNumberOfPassengers(1).setTicketPrice(13500.00).setJourneyDate("27-10-2026").setDepartureTime("05:00 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t18.setPassengerName("Nitin").setTrainName("Vande Bharat Express").setTrainNumber("22436").setSource("New Delhi").setDestination("Varanasi").setTravelClass("Executive Chair Car").setCoachNumber("EC1").setSeatNumber("14").setNumberOfPassengers(2).setTicketPrice(7200.00).setJourneyDate("29-10-2026").setDepartureTime("06:00 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		t19.setPassengerName("Shivani").setTrainName("Garib Rath Express").setTrainNumber("12909").setSource("Bandra").setDestination("Delhi").setTravelClass("AC 3 Tier").setCoachNumber("G4").setSeatNumber("38").setNumberOfPassengers(3).setTicketPrice(6900.00).setJourneyDate("31-10-2026").setDepartureTime("12:30 PM").setPaymentMode("UPI").setBookingStatus("Confirmed");
		t20.setPassengerName("Varun").setTrainName("Kerala Express").setTrainNumber("12626").setSource("New Delhi").setDestination("Thiruvananthapuram").setTravelClass("AC 2 Tier").setCoachNumber("A3").setSeatNumber("27").setNumberOfPassengers(2).setTicketPrice(11200.00).setJourneyDate("02-11-2026").setDepartureTime("11:25 AM").setPaymentMode("Credit Card").setBookingStatus("Confirmed");
		
		t1.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");
		
		t2.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t3.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t4.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t5.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t6.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t7.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t8.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t9.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t10.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t11.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t12.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t13.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t14.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t15.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t16.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t17.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t18.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t19.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

		t20.printPassengerName().printTrainName().printTrainNumber().printSource().printDestination().printTravelClass().printCoachNumber().printSeatNumber().printNumberOfPassengers().printTicketPrice().printJourneyDate().printDepartureTime().printPaymentMode().printBookingStatus();
		System.out.println("==================================================");

	}

}
