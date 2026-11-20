package builderPattern;

public class Hospital {

	private String hospitalName;
	private String location;
	private String hospitalType;
	private int totalBeds;
	private int totalDoctors;
	private double rating;

	private Hospital() {

	}

	private Hospital(String hospitalName, String location, String hospitalType, int totalBeds, int totalDoctors, double rating) {

		this.hospitalName = hospitalName;
		this.location = location;
		this.hospitalType = hospitalType;
		this.totalBeds = totalBeds;
		this.totalDoctors = totalDoctors;
		this.rating = rating;
	}

	private Hospital(Builder b) {
		
		this(b.hospitalName, b.location, b.hospitalType, b.totalBeds, b.totalDoctors, b.rating);
	}

	@Override
	public String toString() {
		
		return "Hospital [Hospital Name is: " + hospitalName + ", Location is: " + location + ", Hospital Type is: " + hospitalType + ", Total Beds is: " + totalBeds + ", Total Doctors is: " + totalDoctors + ", Rating is: " + rating + "]";
	}

	static class Builder {

		private String hospitalName;
		private String location;
		private String hospitalType;
		private int totalBeds;
		private int totalDoctors;
		private double rating;

		public Builder setHospitalName(String hospitalName) {
			
			this.hospitalName = hospitalName;
			return this;
		}

		public Builder setLocation(String location) {
			
			this.location = location;
			return this;
		}

		public Builder setHospitalType(String hospitalType) {
			
			this.hospitalType = hospitalType;
			return this;
		}

		public Builder setTotalBeds(int totalBeds) {
			
			this.totalBeds = totalBeds;
			return this;
		}

		public Builder setTotalDoctors(int totalDoctors) {
			
			this.totalDoctors = totalDoctors;
			return this;
		}

		public Builder setRating(double rating) {
			
			this.rating = rating;
			return this;
		}

		public Hospital build() {
			
			return new Hospital(this);
		}
	}
}
