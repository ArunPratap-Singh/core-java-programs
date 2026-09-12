package immutableClassProgram;

public final class HotelBooking {

	private final int bookingId;
	private final String customerName;
	private final String hotelName;
	private final String roomType;
	private final int numberOfNights;
	private final double pricePerNight;
	private final double totalAmount;

	public HotelBooking(int bookingId, String customerName, String hotelName, String roomType, int numberOfNights, double pricePerNight, double totalAmount) {

		this.bookingId = bookingId;
		this.customerName = customerName;
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.numberOfNights = numberOfNights;
		this.pricePerNight = pricePerNight;
		this.totalAmount = totalAmount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getRoomType() {
		return roomType;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

}
