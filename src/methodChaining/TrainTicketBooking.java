package methodChaining;

public class TrainTicketBooking {
	
		private String passengerName;
		private String trainName;
		private String trainNumber;
		private String source;
		private String destination;
		private String travelClass;
		private String coachNumber;
		private String seatNumber;
		private int numberOfPassengers;
		private double ticketPrice;
		private String journeyDate;
		private String departureTime;
		private String paymentMode;
		private String bookingStatus;

		// Setter Methods

		public TrainTicketBooking setPassengerName(String passengerName) {
			this.passengerName = passengerName;
			return this;
		}

		public TrainTicketBooking setTrainName(String trainName) {
			this.trainName = trainName;
			return this;
		}

		public TrainTicketBooking setTrainNumber(String trainNumber) {
			this.trainNumber = trainNumber;
			return this;
		}

		public TrainTicketBooking setSource(String source) {
			this.source = source;
			return this;
		}

		public TrainTicketBooking setDestination(String destination) {
			this.destination = destination;
			return this;
		}

		public TrainTicketBooking setTravelClass(String travelClass) {
			this.travelClass = travelClass;
			return this;
		}

		public TrainTicketBooking setCoachNumber(String coachNumber) {
			this.coachNumber = coachNumber;
			return this;
		}

		public TrainTicketBooking setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
			return this;
		}

		public TrainTicketBooking setNumberOfPassengers(int numberOfPassengers) {
			this.numberOfPassengers = numberOfPassengers;
			return this;
		}

		public TrainTicketBooking setTicketPrice(double ticketPrice) {
			this.ticketPrice = ticketPrice;
			return this;
		}

		public TrainTicketBooking setJourneyDate(String journeyDate) {
			this.journeyDate = journeyDate;
			return this;
		}

		public TrainTicketBooking setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
			return this;
		}

		public TrainTicketBooking setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public TrainTicketBooking setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
			return this;
		}

		// Print Methods

		public TrainTicketBooking printPassengerName() {
			System.out.println("Passenger Name: " + passengerName);
			return this;
		}

		public TrainTicketBooking printTrainName() {
			System.out.println("Train Name: " + trainName);
			return this;
		}

		public TrainTicketBooking printTrainNumber() {
			System.out.println("Train Number: " + trainNumber);
			return this;
		}

		public TrainTicketBooking printSource() {
			System.out.println("Source: " + source);
			return this;
		}

		public TrainTicketBooking printDestination() {
			System.out.println("Destination: " + destination);
			return this;
		}

		public TrainTicketBooking printTravelClass() {
			System.out.println("Travel Class: " + travelClass);
			return this;
		}

		public TrainTicketBooking printCoachNumber() {
			System.out.println("Coach Number: " + coachNumber);
			return this;
		}

		public TrainTicketBooking printSeatNumber() {
			System.out.println("Seat Number: " + seatNumber);
			return this;
		}

		public TrainTicketBooking printNumberOfPassengers() {
			System.out.println("Number Of Passengers: " + numberOfPassengers);
			return this;
		}

		public TrainTicketBooking printTicketPrice() {
			System.out.println("Ticket Price: " + ticketPrice);
			return this;
		}

		public TrainTicketBooking printJourneyDate() {
			System.out.println("Journey Date: " + journeyDate);
			return this;
		}

		public TrainTicketBooking printDepartureTime() {
			System.out.println("Departure Time: " + departureTime);
			return this;
		}

		public TrainTicketBooking printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public TrainTicketBooking printBookingStatus() {
			System.out.println("Booking Status: " + bookingStatus);
			return this;
		}
	

}
