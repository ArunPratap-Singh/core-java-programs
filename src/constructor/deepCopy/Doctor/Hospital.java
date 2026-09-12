package constructor.deepCopy.Doctor;

public class Hospital {
	
		int hospitalId;
		String hospitalName;
		String location;
		int beds;
		String hospitalType;
		String management;

		Hospital() {

		}

		Hospital(int hospitalId, String hospitalName, String location, int beds, String hospitalType, String management) {

			this.hospitalId = hospitalId;
			this.hospitalName = hospitalName;
			this.location = location;
			this.beds = beds;
			this.hospitalType = hospitalType;
			this.management = management;

		}

		public String toString() {

			return "HospitalId is: " + hospitalId + "\nHospitalName is: " + hospitalName + "\nLocation is: " + location + "\nBeds is: " + beds + "\nHospitalType is: " + hospitalType + "\nManagement is: " + management;

		}

	

}
