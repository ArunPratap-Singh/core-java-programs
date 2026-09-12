package contructor.ConstructorChaining;

public class Train {
	
	    String trainName;
	    int trainNumber;
	    String source;
	    String destination;
	    int coaches;
	    double ticketFare;
	    String departureTime;
	    String trainType;

	    Train(String trainName, int trainNumber, String source, String destination, int coaches, double ticketFare, String departureTime, String trainType) {

	        this.trainName = trainName;
	        this.trainNumber = trainNumber;
	        this.source = source;
	        this.destination = destination;
	        this.coaches = coaches;
	        this.ticketFare = ticketFare;
	        this.departureTime = departureTime;
	        this.trainType = trainType;
	    }

	    Train() {
	    }

	    Train(String trainName) {
	        this.trainName = trainName;
	    }

	    Train(String trainName, int trainNumber) {
	        this(trainName);
	        this.trainNumber = trainNumber;
	    }

	    Train(String trainName, int trainNumber, String source) {
	        this(trainName, trainNumber);
	        this.source = source;
	    }

	    Train(String trainName, int trainNumber, String source, String destination) {
	        this(trainName, trainNumber, source);
	        this.destination = destination;
	    }

	    Train(String trainName, int trainNumber, String source, String destination, int coaches) {
	        this(trainName, trainNumber, source, destination);
	        this.coaches = coaches;
	    }

	    Train(String trainName, int trainNumber, String source, String destination, int coaches, double ticketFare) {
	        this(trainName, trainNumber, source, destination, coaches);
	        this.ticketFare = ticketFare;
	    }

	    Train(String trainName, int trainNumber, String source, String destination, int coaches, double ticketFare, String departureTime) {
	        this(trainName, trainNumber, source, destination, coaches, ticketFare);
	        this.departureTime = departureTime;
	    }

	    Train(int trainNumber, String trainName, String source, String destination, int coaches, double ticketFare, String departureTime, String trainType) {
	        this(trainName, trainNumber, source, destination, coaches, ticketFare, departureTime);
	        this.trainType = trainType;
	    }

	    public String toString() {

	        return "Train Name is: " + trainName + "\tTrain Number is: " + trainNumber + "\tSource is: " + source + "\tDestination is: " + destination + "\nCoaches are: " + coaches + "\tTicket Fare is: " + ticketFare + "\tDeparture Time is: " + departureTime + "\nTrain Type is: " + trainType + "\n===============================================";
	    }
	

}
