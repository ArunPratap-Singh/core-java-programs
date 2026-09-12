package immutableClassProgram;

public final class Student {
	
	    private final int studentId;
	    private final String studentName;
	    private final String course;
	    private final String branch;
	    private final double percentage;
	    private final String college;
	    private final String city;

	    Student(int studentId, String studentName, String course, String branch, double percentage, String college, String city) {

	        this.studentId = studentId;
	        this.studentName = studentName;
	        this.course = course;
	        this.branch = branch;
	        this.percentage = percentage;
	        this.college = college;
	        this.city = city;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public String getStudentName() {
	        return studentName;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public double getPercentage() {
	        return percentage;
	    }

	    public String getCollege() {
	        return college;
	    }

	    public String getCity() {
	        return city;
	    }
	

}
