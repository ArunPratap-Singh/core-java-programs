package constructor.deepCopy.Hospital;

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

	    // deep Copy Constructor
	    Hospital(Hospital h) {

	        this.hospitalName = h.hospitalName;
	        this.location = h.location;
	        this.hospitalCode = h.hospitalCode;
	        this.hospitalType = h.hospitalType;
	        this.p = new Patient();
	        this.p.age = h.p.age;
	        this.p.billAmount = h.p.billAmount;
	        this.p.disease=  h.p.disease;
	        this.p.doctorName = h.p.doctorName;
	        this.p.patientId = h.p.patientId;
	        this.p.patientName = h.p.patientName;
	    }

	    public String toString() {

	        return "HospitalName is: " + hospitalName + "\nLocation is: " + location + "\nHospitalCode is: " + hospitalCode + "\nHospitalType is: " + hospitalType + "\nP is: " + p + "\n========================";
	    }
	

}
