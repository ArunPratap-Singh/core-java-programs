package inheritanceProgramingMultilevel.Education;

public class College extends University{
	
	    String collegeName;
	    int collegeCode;
	    
	    College(){
	    	
	    }

	    College(String educationType, String educationBoard, String institutionName, String institutionLocation, String universityName, int universityCode, String collegeName, int collegeCode) {

	        super(educationType, educationBoard, institutionName, institutionLocation, universityName, universityCode);
	        this.collegeName = collegeName;
	        this.collegeCode = collegeCode;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nCollegeName is: " + collegeName + "\nCollegeCode is: " + collegeCode;
	    }
	

}
