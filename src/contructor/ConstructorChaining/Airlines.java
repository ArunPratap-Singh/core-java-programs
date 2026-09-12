package contructor.ConstructorChaining;

public class Airlines {
	
	    String airlineName;
	    String flightCode;
	    String destination;
	    int passengers;
	    double ticketPrice;
	    String departureTime;
	    String aircraftType;
	    String terminal;

	    Airlines(String airlineName, String flightCode, String destination, int passengers, double ticketPrice, String departureTime, String aircraftType, String terminal) {

	        this.airlineName = airlineName;
	        this.flightCode = flightCode;
	        this.destination = destination;
	        this.passengers = passengers;
	        this.ticketPrice = ticketPrice;
	        this.departureTime = departureTime;
	        this.aircraftType = aircraftType;
	        this.terminal = terminal;
	    }

	    Airlines() {
	    }

	    Airlines(String airlineName) {
	        this.airlineName = airlineName;
	    }

	    Airlines(String airlineName, String flightCode) {
	        this(airlineName);
	        this.flightCode = flightCode;
	    }

	    Airlines(String airlineName, String flightCode, String destination) {
	        this(airlineName, flightCode);
	        this.destination = destination;
	    }

	    Airlines(String airlineName, String flightCode, String destination, int passengers) {
	        this(airlineName, flightCode, destination);
	        this.passengers = passengers;
	    }

	    Airlines(String airlineName, String flightCode, String destination, int passengers, double ticketPrice) {
	        this(airlineName, flightCode, destination, passengers);
	        this.ticketPrice = ticketPrice;
	    }

	    Airlines(String airlineName, String flightCode, String destination, int passengers, double ticketPrice, String departureTime) {
	        this(airlineName, flightCode, destination, passengers, ticketPrice);
	        this.departureTime = departureTime;
	    }

	    Airlines(String airlineName, String flightCode, String destination, int passengers, double ticketPrice, String departureTime, String aircraftType) {
	        this(airlineName, flightCode, destination, passengers, ticketPrice, departureTime);
	        this.aircraftType = aircraftType;
	    }

	    Airlines(int passengers, String airlineName, String flightCode, String destination, double ticketPrice, String departureTime, String aircraftType, String terminal) {
	    	this(airlineName, flightCode, destination, passengers, ticketPrice, departureTime, aircraftType);
	        this.terminal = terminal;
	    }

	    public String toString() {

	        return "Airline Name is: " + airlineName + "\tFlight Code is: " + flightCode + "\tDestination is: " + destination + "\nPassengers are: " + passengers + "\tTicket Price is: " + ticketPrice + "\tDeparture Time is: " + departureTime + "\nAircraft Type is: " + aircraftType + "\tTerminal is: " + terminal + "\n===============================================";
	    }
	

}
