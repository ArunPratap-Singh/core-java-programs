package contructor;

public class Teacher {

	    String teacherName;
	    String subject;
	    int experience;
	    double salary;

	    Teacher() {
	    }

	    Teacher(String teacherName, String subject, int experience, double salary) {
	        this.teacherName = teacherName;
	        this.subject = subject;
	        this.experience = experience;
	        this.salary = salary;
	    }

	    public String toString() {
	        return "Teacher Name is: " +teacherName+ "\nSubject is: " +subject+ "\nExperience is: " +experience+ " years"+"\nSalary is: " +salary+ "\n==============================";
	    }
	

}
