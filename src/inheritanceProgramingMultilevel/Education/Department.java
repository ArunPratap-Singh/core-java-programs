package inheritanceProgramingMultilevel.Education;

public class Department extends College{
	
	    String departmentName;
	    int departmentId;
	    
	    Department(){
	    	
	    }

	    Department(String educationType, String educationBoard, String institutionName, String institutionLocation, String universityName, int universityCode, String collegeName, int collegeCode, String departmentName, int departmentId) {

	        super(educationType, educationBoard, institutionName, institutionLocation, universityName, universityCode, collegeName, collegeCode);
	        this.departmentName = departmentName;
	        this.departmentId = departmentId;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nDepartmentName is: " + departmentName + "\nDepartmentId is: " + departmentId;
	    }
	

}
