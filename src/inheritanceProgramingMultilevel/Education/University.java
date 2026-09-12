package inheritanceProgramingMultilevel.Education;

public class University extends Institution{
	
	    String universityName;
	    int universityCode;
	    
	    University(){
	    	
	    }	

	    University(String educationType, String educationBoard, String institutionName, String institutionLocation, String universityName, int universityCode) {

	        super(educationType, educationBoard, institutionName, institutionLocation);
	        this.universityName = universityName;
	        this.universityCode = universityCode;
	    }

	    @Override
	    public String toString() {
	        return super.toString()+ "\nUniversityName is: " + universityName + "\nUniversityCode is: " + universityCode;
	    }
	

}
