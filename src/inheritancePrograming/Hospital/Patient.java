package inheritancePrograming.Hospital;

public class Patient extends Doctor{
	
	    String patientName;
	    int patientId;
	    int age;
	    String disease;

	    public Patient(String hospitalName, String location, int hospitalId, String doctorName, String specialization, double consultationFee, String patientName, int patientId, int age, String disease) {

	        super(hospitalName, location, hospitalId, doctorName, specialization, consultationFee);
	        this.patientName = patientName;
	        this.patientId = patientId;
	        this.age = age;
	        this.disease = disease;
	    }

	    @Override
	    public String toString() {
	    	return super.toString()+"PatientName is: " +patientName+"\nPatientID is: " +patientId+"\nAge is: " +age+"\nDisease is: " +disease+"\n========================";
	    }

}
