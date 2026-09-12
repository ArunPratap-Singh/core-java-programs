package inheritancePrograming.Person;

public class Student extends Person{
	
	int studentId;
    String course;
    double percentage;

    Student(String personName, int age, String gender, String city, int studentId, String course, double percentage) {

        super(personName, age, gender, city);
        this.studentId = studentId;
        this.course = course;
        this.percentage = percentage;
    }
    
    public String toString() {
    	return super.toString()+"\nStudentID is: " +studentId+"\nCourse is: " +course+"\nPersentage is: " +percentage+"\n======================";
    }

}
