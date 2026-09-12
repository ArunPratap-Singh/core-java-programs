package inheritancePrograming.University;

public class College extends University {

	    String collegeName;
	    String collegeLocation;
	    int collegeCode;
	    
	    College() {
	    	
	    }	

	    College(String universityName, String universityLocation, int universityCode, String collegeName, String collegeLocation, int collegeCode) {

	        super(universityName, universityLocation, universityCode);
	        this.collegeName = collegeName;
	        this.collegeLocation = collegeLocation;
	        this.collegeCode = collegeCode;
	    }

	  	public void conductClasses() {

	      System.out.println(collegeName + " Conducts Regular Classes.");
	    }
	  	
	  	@Override
	  	public String toString() {
	  		
	  		return super.toString()+"\nCollege Name is: " +collegeName+"\nCollegeLocation is: " +collegeLocation+"\nCollege Code is: " +collegeCode;
	  	}
	
}
