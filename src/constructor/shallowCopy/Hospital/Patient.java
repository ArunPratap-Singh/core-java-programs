package constructor.shallowCopy.Hospital;

public class Patient {
	
	    int patientId;
	    String patientName;
	    int age;
	    String disease;
	    double billAmount;
	    String doctorName;

	    Patient() {
	    }

	    Patient(int patientId, String patientName, int age, String disease, double billAmount, String doctorName) {

	        this.patientId = patientId;
	        this.patientName = patientName;
	        this.age = age;
	        this.disease = disease;
	        this.billAmount = billAmount;
	        this.doctorName = doctorName;
	    }

	    public String toString() {

	        return "PatientId is: " + patientId + "\nPatientName is: " + patientName + "\nAge is: " + age + "\nDisease is: " + disease + "\nBillAmount is: " + billAmount + "\nDoctorName is: " + doctorName;
	    }
	

}
