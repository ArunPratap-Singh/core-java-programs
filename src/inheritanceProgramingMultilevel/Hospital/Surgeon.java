package inheritanceProgramingMultilevel.Hospital;

public class Surgeon extends Specialist{
	
	    String surgeryType;
	    int surgeriesPerformed;
	    
	    Surgeon(){
	    	
	    }

	    Surgeon(String hospitalName, String hospitalLocation, int staffId, String staffName, int doctorId, double salary, String specialization, int experience, String surgeryType, int surgeriesPerformed) {

	        super(hospitalName, hospitalLocation, staffId, staffName, doctorId, salary, specialization, experience);
	        this.surgeryType = surgeryType;
	        this.surgeriesPerformed = surgeriesPerformed;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSurgeryType is: " + surgeryType + "\nSurgeriesPerformed is: " + surgeriesPerformed;
	    }
	

}
