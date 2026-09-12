package inheritanceProgramingMultilevel.Hospital;

public class SeniorSurgeon extends Surgeon{
	
	    String seniorityLevel;
	    int teamSize;
	    
	    SeniorSurgeon(){
	    	
	    }

	    SeniorSurgeon(String hospitalName, String hospitalLocation, int staffId, String staffName, int doctorId, double salary, String specialization, int experience, String surgeryType, int surgeriesPerformed, String seniorityLevel, int teamSize) {

	        super(hospitalName, hospitalLocation, staffId, staffName, doctorId, salary, specialization, experience, surgeryType, surgeriesPerformed);
	        this.seniorityLevel = seniorityLevel;
	        this.teamSize = teamSize;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSeniorityLevel is: " + seniorityLevel + "\nTeamSize is: " + teamSize;
	    }
	

}
