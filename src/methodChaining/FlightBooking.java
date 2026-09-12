package methodChaining;

public class FlightBooking {
	
		private String passengerName;
		private String airlineName;
		private String flightNumber;
		private String source;
		private String destination;
		private String travelClass;
		private String seatNumber;
		private int numberOfPassengers;
		private int baggageWeight;
		private double ticketPrice;
		private String departureDate;
		private String departureTime;
		private String paymentMode;
		private String bookingStatus;

		// Setter Methods

		public FlightBooking setPassengerName(String passengerName) {
			this.passengerName = passengerName;
			return this;
		}

		public FlightBooking setAirlineName(String airlineName) {
			this.airlineName = airlineName;
			return this;
		}

		public FlightBooking setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
			return this;
		}

		public FlightBooking setSource(String source) {
			this.source = source;
			return this;
		}

		public FlightBooking setDestination(String destination) {
			this.destination = destination;
			return this;
		}

		public FlightBooking setTravelClass(String travelClass) {
			this.travelClass = travelClass;
			return this;
		}

		public FlightBooking setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
			return this;
		}

		public FlightBooking setNumberOfPassengers(int numberOfPassengers) {
			this.numberOfPassengers = numberOfPassengers;
			return this;
		}

		public FlightBooking setBaggageWeight(int baggageWeight) {
			this.baggageWeight = baggageWeight;
			return this;
		}

		public FlightBooking setTicketPrice(double ticketPrice) {
			this.ticketPrice = ticketPrice;
			return this;
		}

		public FlightBooking setDepartureDate(String departureDate) {
			this.departureDate = departureDate;
			return this;
		}

		public FlightBooking setDepartureTime(String departureTime) {
			this.departureTime = departureTime;
			return this;
		}

		public FlightBooking setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public FlightBooking setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
			return this;
		}

		// Print Methods

		public FlightBooking printPassengerName() {
			System.out.println("Passenger Name: " + passengerName);
			return this;
		}

		public FlightBooking printAirlineName() {
			System.out.println("Airline Name: " + airlineName);
			return this;
		}

		public FlightBooking printFlightNumber() {
			System.out.println("Flight Number: " + flightNumber);
			return this;
		}

		public FlightBooking printSource() {
			System.out.println("Source: " + source);
			return this;
		}

		public FlightBooking printDestination() {
			System.out.println("Destination: " + destination);
			return this;
		}

		public FlightBooking printTravelClass() {
			System.out.println("Travel Class: " + travelClass);
			return this;
		}

		public FlightBooking printSeatNumber() {
			System.out.println("Seat Number: " + seatNumber);
			return this;
		}

		public FlightBooking printNumberOfPassengers() {
			System.out.println("Number Of Passengers: " + numberOfPassengers);
			return this;
		}

		public FlightBooking printBaggageWeight() {
			System.out.println("Baggage Weight: " + baggageWeight + " kg");
			return this;
		}

		public FlightBooking printTicketPrice() {
			System.out.println("Ticket Price: " + ticketPrice);
			return this;
		}

		public FlightBooking printDepartureDate() {
			System.out.println("Departure Date: " + departureDate);
			return this;
		}

		public FlightBooking printDepartureTime() {
			System.out.println("Departure Time: " + departureTime);
			return this;
		}

		public FlightBooking printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public FlightBooking printBookingStatus() {
			System.out.println("Booking Status: " + bookingStatus);
			return this;
		}
	

}
