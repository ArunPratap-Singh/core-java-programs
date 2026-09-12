package inheritanceProgramingMultilevel.Education;

public class Education {
	
	    String educationType;
	    String educationBoard;
	    
	    Education(){
	    	
	    }

	    Education(String educationType, String educationBoard) {
	        this.educationType = educationType;
	        this.educationBoard = educationBoard;
	    }

	    @Override
	    public String toString() {
	        return "\nEducationType is: " + educationType + "\nEducationBoard is: " + educationBoard;
	    }
	

}
