package inheritanceProgramingMultilevel.Education;

public class Professor extends Teacher{
	
	    String specialization;
	    int experience;
	    
	    Professor(){
	    	
	    }

	    Professor(String educationType, String educationBoard, String institutionName, String institutionLocation, String universityName, int universityCode, String collegeName, int collegeCode, String departmentName, int departmentId, int teacherId, String teacherName, double salary, String specialization, int experience) {

	        super(educationType, educationBoard, institutionName, institutionLocation, universityName, universityCode, collegeName, collegeCode, departmentName, departmentId, teacherId, teacherName, salary);

	        this.specialization = specialization;
	        this.experience = experience;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSpecialization is: " + specialization + "\nExperience is: " + experience + " years "+"\n================================";
	    }
	

}
