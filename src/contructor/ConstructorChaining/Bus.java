package contructor.ConstructorChaining;

public class Bus {
	
	    String busName;
	    String busNumber;
	    String source;
	    String destination;
	    int seats;
	    double fare;
	    String departureTime;
	    String busType;

	    Bus(String busName, String busNumber, String source, String destination, int seats, double fare, String departureTime, String busType) {

	        this.busName = busName;
	        this.busNumber = busNumber;
	        this.source = source;
	        this.destination = destination;
	        this.seats = seats;
	        this.fare = fare;
	        this.departureTime = departureTime;
	        this.busType = busType;
	    }

	    Bus() {
	    }

	    Bus(String busName) {
	        this.busName = busName;
	    }

	    Bus(String busName, String busNumber) {
	        this(busName);
	        this.busNumber = busNumber;
	    }

	    Bus(String busName, String busNumber, String source) {
	        this(busName, busNumber);
	        this.source = source;
	    }

	    Bus(String busName, String busNumber, String source, String destination) {
	        this(busName, busNumber, source);
	        this.destination = destination;
	    }

	    Bus(String busName, String busNumber, String source, String destination, int seats) {
	        this(busName, busNumber, source, destination);
	        this.seats = seats;
	    }

	    Bus(String busName, String busNumber, String source, String destination, int seats, double fare) {
	        this(busName, busNumber, source, destination, seats);
	        this.fare = fare;
	    }

	    Bus(String busName, String busNumber, String source, String destination, int seats, double fare, String departureTime) {
	        this(busName, busNumber, source, destination, seats, fare);
	        this.departureTime = departureTime;
	    }

	    Bus(int seats, String busName, String busNumber, String source, String destination, double fare, String departureTime, String busType) {
	        this(busName, busNumber, source, destination, seats,fare, departureTime);
	        this.busType = busType;
	    }

	    public String toString() {

	        return "Bus Name is: " + busName + "\tBus Number is: " + busNumber + "\tSource is: " + source + "\tDestination is: " + destination + "\nSeats are: " + seats + "\tFare is: " + fare + "\tDeparture Time is: " + departureTime + "\nBus Type is: " + busType + "\n===============================================";
	    }
	

}
