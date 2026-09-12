package inheritancePrograming.Hospital;

public class Doctor extends Hospital{
	
	    String doctorName;
	    String specialization;
	    double consultationFee;
	    
	    Doctor(){
	    	
	    }

	    public Doctor(String hospitalName, String location, int hospitalId, String doctorName, String specialization, double consultationFee) {

	        super(hospitalName, location, hospitalId);
	        this.doctorName = doctorName;
	        this.specialization = specialization;
	        this.consultationFee = consultationFee;
	    }
	    @Override
	    public String toString() {
	    	return super.toString()+"\nDoctorName is: " +doctorName+"\nSpecialization is: " +specialization+"\nConsultationFee is: " +consultationFee+"\n===========================";
	    }

	

}
