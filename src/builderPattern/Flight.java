package builderPattern;

public class Flight {

	    private int flightId;
	    private String airline;
	    private String flightNumber;
	    private String source;
	    private String destination;
	    private String departureTime;
	    private String arrivalTime;
	    private double ticketPrice;

	    private Flight() {

	    }

	    private Flight(int flightId, String airline, String flightNumber,  String source, String destination, String departureTime, String arrivalTime, double ticketPrice) {

	        this.flightId = flightId;
	        this.airline = airline;
	        this.flightNumber = flightNumber;
	        this.source = source;
	        this.destination = destination;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.ticketPrice = ticketPrice;
	    }

	    private Flight(Builder b) {
	        
	    	this(b.flightId, b.airline, b.flightNumber, b.source, b.destination, b.departureTime, b.arrivalTime, b.ticketPrice);
	    }

	    @Override
	    public String toString() {
	       
	    	return "Flight [Flight ID is: " + flightId + ", Airline is: " + airline + ", Flight Number is: " + flightNumber + ", Source is: " + source + ", Destination is: " + destination + ", Departure Time is: " + departureTime + ", Arrival Time is: " + arrivalTime + ", Ticket Price is: " + ticketPrice + "]";
	    }

	    public static class Builder {

	        private int flightId;
	        private String airline;
	        private String flightNumber;
	        private String source;
	        private String destination;
	        private String departureTime;
	        private String arrivalTime;
	        private double ticketPrice;

	        public Builder setFlightId(int flightId) {
	            
	        	this.flightId = flightId;
	            return this;
	        }

	        public Builder setAirline(String airline) {
	            
	        	this.airline = airline;
	            return this;
	        }

	        public Builder setFlightNumber(String flightNumber) {
	            
	        	this.flightNumber = flightNumber;
	            return this;
	        }

	        public Builder setSource(String source) {
	            
	        	this.source = source;
	            return this;
	        }

	        public Builder setDestination(String destination) {
	            
	        	this.destination = destination;
	            return this;
	        }

	        public Builder setDepartureTime(String departureTime) {
	            
	        	this.departureTime = departureTime;
	            return this;
	        }

	        public Builder setArrivalTime(String arrivalTime) {
	            
	        	this.arrivalTime = arrivalTime;
	            return this;
	        }

	        public Builder setTicketPrice(double ticketPrice) {
	            
	        	this.ticketPrice = ticketPrice;
	            return this;
	        }

	        public Flight build() {
	            
	        	return new Flight(this);
	        }
	    }
	}
	
	


