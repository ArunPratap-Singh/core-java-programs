package inheritanceProgramingMultilevel.Education;

public class Teacher extends Department{
	
	    int teacherId;
	    String teacherName;
	    double salary;
	    
	    Teacher(){
	    	
	    }	

	    Teacher(String educationType, String educationBoard, String institutionName, String institutionLocation, String universityName, int universityCode, String collegeName, int collegeCode, String departmentName, int departmentId, int teacherId, String teacherName, double salary) {

	        super(educationType, educationBoard, institutionName, institutionLocation, universityName, universityCode, collegeName, collegeCode, departmentName, departmentId);
	        this.teacherId = teacherId;
	        this.teacherName = teacherName;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nTeacherId is: " + teacherId + "\nTeacherName is: " + teacherName + "\nSalary is: " + salary;
	    }
	

}
