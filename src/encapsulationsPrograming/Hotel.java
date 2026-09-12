package encapsulationsPrograming;

public class Hotel {
	
		private String hotelName;
		private String hotelID;
		private String location;
		private String roomType;
		private double roomPrice;
		private boolean roomAvailable;
		
		Hotel(){
			
		}

		Hotel(String hotelName, String hotelID, String location, String roomType, double roomPrice, boolean roomAvailable) {

			this.hotelName = hotelName;
			this.hotelID = hotelID;
			this.location = location;
			this.roomType = roomType;
			this.roomPrice = roomPrice;
			this.roomAvailable = roomAvailable;
		}


		public void setHotelName(String hotelName) {

			if(hotelName != null && hotelName.length() > 2 && hotelName.length() <= 100 && !hotelName.isBlank() && hotelName.matches("[A-Z a-z \s]+"))

				this.hotelName = hotelName;

			else

				System.out.println("Wrong Hotel Name");
		}


		public String getHotelName() {

			return hotelName;
		}


		public void setHotelID(String hotelID) {

			if(hotelID != null && hotelID.length() >= 4 && hotelID.length() <= 20 && !hotelID.isBlank() && hotelID.matches("[A-Z a-z 0-9]+"))

				this.hotelID = hotelID;

			else

				System.out.println("Invalid Hotel ID");
		}


		public String getHotelID() {

			return hotelID;
		}


		public void setLocation(String location) {

			if(location != null && location.length() > 2 && location.length() <= 50 && !location.isBlank() && location.matches("[A-Z a-z 0-9 ]+"))

				this.location = location;

			else

				System.out.println("Wrong Location");
		}


		public String getLocation() {

			return location;
		}


		public void setRoomType(String roomType) {

			if(roomType != null && roomType.length() > 2 && roomType.length() <= 30 && !roomType.isBlank() && roomType.matches("[A-Z a-z ]+"))

				this.roomType = roomType;

			else

				System.out.println("Wrong Room Type");
		}


		public String getRoomType() {

			return roomType;
		}


		public void setRoomPrice(double roomPrice) {

			if(roomPrice > 0)

				this.roomPrice = roomPrice;

			else

				System.out.println("Wrong Room Price");
		}


		public double getRoomPrice() {

			return roomPrice;
		}


		public void setRoomAvailable(boolean roomAvailable) {

			this.roomAvailable = roomAvailable;
		}


		public boolean getRoomAvailable() {

			return roomAvailable;
		}


		public void bookRoom() {

			if(roomAvailable) {

				roomAvailable = false;

				System.out.println("Room Booked Successfully");
			}
			else {

				System.out.println("Room is Already Booked");
			}
		}


		public void cancelBooking() {

			if(!roomAvailable) {

				roomAvailable = true;

				System.out.println("Room Booking Cancelled Successfully");
			}
			else {

				System.out.println("Room is Already Available");
			}
		}


		public String getBookingStatus() {

			if(roomAvailable)

				return "Available";

			else

				return "Booked";
		}

	

}
