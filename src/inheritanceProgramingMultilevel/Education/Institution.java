package inheritanceProgramingMultilevel.Education;

public class Institution extends Education{
	
	    String institutionName;
	    String institutionLocation;
	    
	    Institution(){
	    	
	    }

	    Institution(String educationType, String educationBoard, String institutionName, String institutionLocation) {

	        super(educationType, educationBoard);
	        this.institutionName = institutionName;
	        this.institutionLocation = institutionLocation;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nInstitutionName is: " + institutionName + "\nInstitutionLocation is: " + institutionLocation;
	    }
	

}
