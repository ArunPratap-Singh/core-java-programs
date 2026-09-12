package inheritanceProgramingMultilevel.Hospital;

public class Doctor extends MedicalStaff{

		int doctorId;
	    double salary;
	    
	    Doctor(){
	    	
	    }

	    Doctor(String hospitalName, String hospitalLocation, int staffId, String staffName, int doctorId, double salary) {

	        super(hospitalName, hospitalLocation, staffId, staffName);
	        this.doctorId = doctorId;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nDoctorId is: " + doctorId + "\nSalary is: " + salary + "]";
	    }
	

}
