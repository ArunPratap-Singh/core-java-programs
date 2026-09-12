package constructor.shallowCopy.Hospital;

public class Hospital {
	
	    String hospitalName;
	    String location;
	    int hospitalCode;
	    String hospitalType;
	    Patient p;

	    Hospital() {
	    }

	    Hospital(String hospitalName, String location, int hospitalCode, String hospitalType, Patient p) {

	        this.hospitalName = hospitalName;
	        this.location = location;
	        this.hospitalCode = hospitalCode;
	        this.hospitalType = hospitalType;
	        this.p = p;
	    }

	    // Shallow Copy Constructor
	    Hospital(Hospital h) {

	        this.hospitalName = h.hospitalName;
	        this.location = h.location;
	        this.hospitalCode = h.hospitalCode;
	        this.hospitalType = h.hospitalType;
	        this.p = h.p;
	    }

	    public String toString() {

	        return "HospitalName is: " + hospitalName + "\nLocation is: " + location + "\nHospitalCode is: " + hospitalCode + "\nHospitalType is: " + hospitalType + "\nP is: " + p + "\n========================";
	    }
	

}
