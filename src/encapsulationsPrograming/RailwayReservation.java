package encapsulationsPrograming;

	public class RailwayReservation {

	    private String reservationId;
	    private String trainNumber;
	    private String trainName;
	    private String sourceStation;
	    private String destinationStation;
	    private String journeyDate;
	    private String coachType;
	    private int seatNumber;
	    private double ticketPrice;
	    private boolean bookingStatus;
	    private String passengerDetails;


	    RailwayReservation() {
	    	
	    	
	    }	
	            
	    RailwayReservation(String reservationId, String trainNumber, String trainName, String sourceStation, String destinationStation, String journeyDate, String coachType, int seatNumber, double ticketPrice, boolean bookingStatus, String passengerDetails) {

	        this.reservationId = reservationId;
	        this.trainNumber = trainNumber;
	        this.trainName = trainName;
	        this.sourceStation = sourceStation;
	        this.destinationStation = destinationStation;
	        this.journeyDate = journeyDate;
	        this.coachType = coachType;
	        this.seatNumber = seatNumber;
	        this.ticketPrice = ticketPrice;
	        this.bookingStatus = bookingStatus;
	        this.passengerDetails = passengerDetails;
	        
	    }


	    public void setReservationId(String reservationId) {

	        if (reservationId != null && reservationId.matches("RR[0-9]{6}")) {

	            this.reservationId = reservationId;

	        } else {

	            System.out.println("Invalid Reservation ID");
	        }
	    }

	    public String getReservationId() {
	        return reservationId;
	    }


	    public void setTrainNumber(String trainNumber) {

	        if (trainNumber != null && trainNumber.matches("[0-9]{5}")) {

	            this.trainNumber = trainNumber;

	        } else {

	            System.out.println("Invalid Train Number");
	        }
	    }

	    public String getTrainNumber() {
	        return trainNumber;
	    }


	    public void setTrainName(String trainName) {

	        if (trainName != null && !trainName.isBlank() && trainName.length() >= 3 && trainName.length() <= 50 && trainName.matches("[A-Z a-z \s]+")) {

	            this.trainName = trainName;

	        } else {

	            System.out.println("Invalid Train Name");
	        }
	    }

	    public String getTrainName() {
	        return trainName;
	    }


	    public void setSourceStation(String sourceStation) {

	        if (sourceStation != null && !sourceStation.isBlank() && sourceStation.length() >= 3 && sourceStation.matches("[A-Z a-z \s]+")) {

	            this.sourceStation = sourceStation;

	        } else {

	            System.out.println("Invalid Source Station");
	        }
	    }

	    public String getSourceStation() {
	        return sourceStation;
	    }


	    public void setDestinationStation(String destinationStation) {

	        if (destinationStation != null && !destinationStation.isBlank() && destinationStation.length() >= 3 && destinationStation.matches("[A-Za-z ]+")) {

	            this.destinationStation = destinationStation;

	        } else {

	            System.out.println("Invalid Destination Station");
	        }
	    }

	    public String getDestinationStation() {
	        return destinationStation;
	    }


	    public void setJourneyDate(String journeyDate) {

	        if (journeyDate != null && journeyDate.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}")) {

	            this.journeyDate = journeyDate;

	        } else {

	            System.out.println("Invalid Journey Date");
	        }
	    }

	    public String getJourneyDate() {
	        return journeyDate;
	    }


	    public void setCoachType(String coachType) {

	        if (coachType != null && (coachType.equalsIgnoreCase("General") || coachType.equalsIgnoreCase("Sleeper") || coachType.equalsIgnoreCase("AC 3 Tier") || coachType.equalsIgnoreCase("AC 2 Tier") || coachType.equalsIgnoreCase("First AC"))) {

	            this.coachType = coachType;

	        } else {

	            System.out.println("Invalid Coach Type");
	        }
	    }

	    public String getCoachType() {
	        return coachType;
	    }


	    public void setSeatNumber(int seatNumber) {

	        if (seatNumber > 0 && seatNumber <= 100) {

	            this.seatNumber = seatNumber;

	        } else {

	            System.out.println("Invalid Seat Number");
	        }
	    }

	    public int getSeatNumber() {
	        return seatNumber;
	    }


	    public void setTicketPrice(double ticketPrice) {

	        if (ticketPrice > 0) {

	            this.ticketPrice = ticketPrice;

	        } else {

	            System.out.println("Invalid Ticket Price");
	        }
	    }

	    public double getTicketPrice() {
	        return ticketPrice;
	    }


	    public void setBookingStatus(boolean bookingStatus) {

	        this.bookingStatus = bookingStatus;
	    }

	    public boolean getBookingStatus() {
	        return bookingStatus;
	    }


	    public void setPassengerDetails(String passengerDetails) {

	        if (passengerDetails != null && passengerDetails.length()>2 && passengerDetails.length()<=50 && passengerDetails.matches("[A-Z a-z \s]+")) {

	            this.passengerDetails = passengerDetails;

	        } else {

	            System.out.println("Passenger Details Cannot Be Null");
	        }
	    }

	    public String getPassengerDetails() {
	        return passengerDetails;
	    }
	
}	