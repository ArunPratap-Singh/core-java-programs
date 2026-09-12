package inheritanceProgramingMultilevel.Hospital;

public class Specialist extends Doctor{
	
	    String specialization;
	    int experience;
	    
	    Specialist(){
	    	
	    }

	    Specialist(String hospitalName, String hospitalLocation, int staffId, String staffName, int doctorId, double salary, String specialization, int experience) {

	        super(hospitalName, hospitalLocation, staffId, staffName, doctorId, salary);
	        this.specialization = specialization;
	        this.experience = experience;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSpecialization is: " + specialization + "\nExperience is: " + experience + " years";
	    }
	

}
