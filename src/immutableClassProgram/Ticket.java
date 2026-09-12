package immutableClassProgram;

public final class Ticket {

	private final int ticketId;
	private final String passengerName;
	private final String ticketType;
	private final String source;
	private final String destination;
	private final double ticketPrice;
	private final String ticketStatus;

	Ticket(int ticketId, String passengerName, String ticketType, String source, String destination, double ticketPrice, String ticketStatus) {

		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.ticketType = ticketType;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
		this.ticketStatus = ticketStatus;
	}

	public int getTicketId() {
		return ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public String getTicketType() {
		return ticketType;
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

	public String getTicketStatus() {
		return ticketStatus;
	}

}
