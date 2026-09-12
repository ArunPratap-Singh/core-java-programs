package inheritancePrograming.University;

public class Student extends College{

		String studentName;
	    int studentId;
	    String course;
	    double percentage;

	    Student(String universityName, String universityLocation, int universityCode, String collegeName, String collegeLocation, int collegeCode, String studentName, int studentId, String course, double percentage) {

	        super(universityName, universityLocation, universityCode, collegeName, collegeLocation, collegeCode);

	        this.studentName = studentName;
	        this.studentId = studentId;
	        this.course = course;
	        this.percentage = percentage;
	    }
	    
	    @Override
	    public String toString() {
	    	return super.toString()+"\nStudentName is: " +studentName+"\nSstudentID is: " +studentId+"\nCourse is: " +course+"\nPercentage is: " +percentage;
	    }

	    public void study() {

	        System.out.println(studentName + " is studying " + course + ".");
	    }

	

}
