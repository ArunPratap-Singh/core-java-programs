package methodChaining;

public class MovieTicketBooking {
	
		private String customerName;
		private String movieName;
		private String theatreName;
		private String city;
		private String screenNumber;
		private String showDate;
		private String showTime;
		private String seatType;
		private String seatNumber;
		private int numberOfTickets;
		private double ticketPrice;
		private String foodCombo;
		private String paymentMode;
		private String bookingStatus;
		
		//Setters

		public MovieTicketBooking setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		public MovieTicketBooking setMovieName(String movieName) {
			this.movieName = movieName;
			return this;
		}

		public MovieTicketBooking setTheatreName(String theatreName) {
			this.theatreName = theatreName;
			return this;
		}

		public MovieTicketBooking setCity(String city) {
			this.city = city;
			return this;
		}

		public MovieTicketBooking setScreenNumber(String screenNumber) {
			this.screenNumber = screenNumber;
			return this;
		}

		public MovieTicketBooking setShowDate(String showDate) {
			this.showDate = showDate;
			return this;
		}

		public MovieTicketBooking setShowTime(String showTime) {
			this.showTime = showTime;
			return this;
		}

		public MovieTicketBooking setSeatType(String seatType) {
			this.seatType = seatType;
			return this;
		}

		public MovieTicketBooking setSeatNumber(String seatNumber) {
			this.seatNumber = seatNumber;
			return this;
		}

		public MovieTicketBooking setNumberOfTickets(int numberOfTickets) {
			this.numberOfTickets = numberOfTickets;
			return this;
		}

		public MovieTicketBooking setTicketPrice(double ticketPrice) {
			this.ticketPrice = ticketPrice;
			return this;
		}

		public MovieTicketBooking setFoodCombo(String foodCombo) {
			this.foodCombo = foodCombo;
			return this;
		}

		public MovieTicketBooking setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public MovieTicketBooking setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
			return this;
		}
		
		//Getters

		public MovieTicketBooking printCustomerName() {
			System.out.println("Customer Name: " + customerName);
			return this;
		}

		public MovieTicketBooking printMovieName() {
			System.out.println("Movie Name: " + movieName);
			return this;
		}

		public MovieTicketBooking printTheatreName() {
			System.out.println("Theatre Name: " + theatreName);
			return this;
		}

		public MovieTicketBooking printCity() {
			System.out.println("City: " + city);
			return this;
		}

		public MovieTicketBooking printScreenNumber() {
			System.out.println("Screen Number: " + screenNumber);
			return this;
		}

		public MovieTicketBooking printShowDate() {
			System.out.println("Show Date: " + showDate);
			return this;
		}

		public MovieTicketBooking printShowTime() {
			System.out.println("Show Time: " + showTime);
			return this;
		}

		public MovieTicketBooking printSeatType() {
			System.out.println("Seat Type: " + seatType);
			return this;
		}

		public MovieTicketBooking printSeatNumber() {
			System.out.println("Seat Number: " + seatNumber);
			return this;
		}

		public MovieTicketBooking printNumberOfTickets() {
			System.out.println("Number Of Tickets: " + numberOfTickets);
			return this;
		}

		public MovieTicketBooking printTicketPrice() {
			System.out.println("Ticket Price: " + ticketPrice);
			return this;
		}

		public MovieTicketBooking printFoodCombo() {
			System.out.println("Food Combo: " + foodCombo);
			return this;
		}

		public MovieTicketBooking printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public MovieTicketBooking printBookingStatus() {
			System.out.println("Booking Status: " + bookingStatus);
			return this;
		}
	

}
