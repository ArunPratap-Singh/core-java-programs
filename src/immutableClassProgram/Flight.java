package immutableClassProgram;

public final class Flight {

	private final int flightId;
	private final String flightNumber;
	private final String airlineName;
	private final String source;
	private final String destination;
	private final double ticketPrice;
	private final String flightType;

	Flight(int flightId, String flightNumber, String airlineName, String source, String destination, double ticketPrice, String flightType) {

		this.flightId = flightId;
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
		this.flightType = flightType;
	}

	public int getFlightId() {
		return flightId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public String getFlightType() {
		return flightType;
	}

}
