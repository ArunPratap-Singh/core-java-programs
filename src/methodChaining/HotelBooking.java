package methodChaining;

public class HotelBooking {
	
		private String guestName;
		private String hotelName;
		private String roomType;
		private String city;
		private int numberOfGuests;
		private int numberOfNights;
		private double pricePerNight;
		private String checkInDate;
		private String checkOutDate;
		private String paymentMode;
		private String bookingStatus;

		// Setter Methods

		public HotelBooking setGuestName(String guestName) {
			this.guestName = guestName;
			return this;
		}

		public HotelBooking setHotelName(String hotelName) {
			this.hotelName = hotelName;
			return this;
		}

		public HotelBooking setRoomType(String roomType) {
			this.roomType = roomType;
			return this;
		}

		public HotelBooking setCity(String city) {
			this.city = city;
			return this;
		}

		public HotelBooking setNumberOfGuests(int numberOfGuests) {
			this.numberOfGuests = numberOfGuests;
			return this;
		}

		public HotelBooking setNumberOfNights(int numberOfNights) {
			this.numberOfNights = numberOfNights;
			return this;
		}

		public HotelBooking setPricePerNight(double pricePerNight) {
			this.pricePerNight = pricePerNight;
			return this;
		}

		public HotelBooking setCheckInDate(String checkInDate) {
			this.checkInDate = checkInDate;
			return this;
		}

		public HotelBooking setCheckOutDate(String checkOutDate) {
			this.checkOutDate = checkOutDate;
			return this;
		}

		public HotelBooking setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public HotelBooking setBookingStatus(String bookingStatus) {
			this.bookingStatus = bookingStatus;
			return this;
		}

		// Print Methods

		public HotelBooking printGuestName() {
			System.out.println("Guest Name: " + guestName);
			return this;
		}

		public HotelBooking printHotelName() {
			System.out.println("Hotel Name: " + hotelName);
			return this;
		}

		public HotelBooking printRoomType() {
			System.out.println("Room Type: " + roomType);
			return this;
		}

		public HotelBooking printCity() {
			System.out.println("City: " + city);
			return this;
		}

		public HotelBooking printNumberOfGuests() {
			System.out.println("Number Of Guests: " + numberOfGuests);
			return this;
		}

		public HotelBooking printNumberOfNights() {
			System.out.println("Number Of Nights: " + numberOfNights);
			return this;
		}

		public HotelBooking printPricePerNight() {
			System.out.println("Price Per Night: " + pricePerNight);
			return this;
		}

		public HotelBooking printCheckInDate() {
			System.out.println("Check-In Date: " + checkInDate);
			return this;
		}

		public HotelBooking printCheckOutDate() {
			System.out.println("Check-Out Date: " + checkOutDate);
			return this;
		}

		public HotelBooking printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public HotelBooking printBookingStatus() {
			System.out.println("Booking Status: " + bookingStatus);
			return this;
		}
	

}
