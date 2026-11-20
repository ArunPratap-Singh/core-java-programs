package builderPattern;

public class Hotel {

	    private int hotelId;
	    private String hotelName;
	    private String location;
	    private String roomType;
	    private int numberOfRooms;
	    private double pricePerNight;
	    private int numberOfNights;
	    private String rating;

	    private Hotel() {

	    }

	    private Hotel(int hotelId, String hotelName, String location, String roomType, int numberOfRooms, double pricePerNight, int numberOfNights, String rating) {

	        this.hotelId = hotelId;
	        this.hotelName = hotelName;
	        this.location = location;
	        this.roomType = roomType;
	        this.numberOfRooms = numberOfRooms;
	        this.pricePerNight = pricePerNight;
	        this.numberOfNights = numberOfNights;
	        this.rating = rating;
	    }

	    private Hotel(Builder b) {
	        
	    	this(b.hotelId, b.hotelName, b.location, b.roomType, b.numberOfRooms, b.pricePerNight, b.numberOfNights, b.rating);
	    }

	    @Override
	    public String toString() {
	        
	    	return "Hotel [Hotel ID is: " + hotelId + ", Hotel Name is: " + hotelName + ", Location is: " + location + ", Room Type is: " + roomType + ", Number of Rooms is: " + numberOfRooms + ", Price Per Night is: " + pricePerNight + ", Number of Nights is: " + numberOfNights + ", Rating is: " + rating + "]";
	    }

	    static class Builder {

	        private int hotelId;
	        private String hotelName;
	        private String location;
	        private String roomType;
	        private int numberOfRooms;
	        private double pricePerNight;
	        private int numberOfNights;
	        private String rating;

	        public Builder setHotelId(int hotelId) {
	            
	        	this.hotelId = hotelId;
	            return this;
	        }

	        public Builder setHotelName(String hotelName) {
	            
	        	this.hotelName = hotelName;
	            return this;
	        }

	        public Builder setLocation(String location) {
	            
	        	this.location = location;
	            return this;
	        }

	        public Builder setRoomType(String roomType) {
	            
	        	this.roomType = roomType;
	            return this;
	        }

	        public Builder setNumberOfRooms(int numberOfRooms) {
	            
	        	this.numberOfRooms = numberOfRooms;
	            return this;
	        }

	        public Builder setPricePerNight(double pricePerNight) {
	            
	        	this.pricePerNight = pricePerNight;
	            return this;
	        }

	        public Builder setNumberOfNights(int numberOfNights) {
	            
	        	this.numberOfNights = numberOfNights;
	            return this;
	        }

	        public Builder setRating(String rating) {
	            
	        	this.rating = rating;
	            return this;
	        }

	        public Hotel build() {
	            
	        	return new Hotel(this);
	        }
	    }
	}


