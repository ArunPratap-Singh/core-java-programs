package contructor.ConstructorChaining;

public class Teacher {
	
	    String name;
	    int age;
	    String subject;
	    int experience;
	    long mobilenumber;
	    double salary;
	    String school;
	    String qualification;

	    Teacher(String name, int age, String subject, int experience,
	            long mobilenumber, double salary, String school, String qualification) {

	        this.name = name;
	        this.age = age;
	        this.subject = subject;
	        this.experience = experience;
	        this.mobilenumber = mobilenumber;
	        this.salary = salary;
	        this.school = school;
	        this.qualification = qualification;
	    }

	    Teacher() {
	    }

	    Teacher(String name) {
	        this.name = name;
	    }

	    Teacher(String name, int age) {
	        this(name);
	        this.age = age;
	    }

	    Teacher(String name, int age, String subject) {
	        this(name, age);
	        this.subject = subject;
	    }

	    Teacher(String name, int age, String subject, int experience) {
	        this(name, age, subject);
	        this.experience = experience;
	    }

	    Teacher(String name, int age, String subject, int experience, long mobilenumber) {
	        this(name, age, subject, experience);
	        this.mobilenumber = mobilenumber;
	    }

	    Teacher(String name, int age, String subject, int experience, long mobilenumber, double salary) {
	        this(name, age, subject, experience, mobilenumber);
	        this.salary = salary;
	    }

	    Teacher(int age, String name, String subject, int experience, long mobilenumber, double salary, String school) {
	        this(name, age, subject, experience, mobilenumber, salary);
	        this.school = school;
	    }

	    Teacher(int age, String name, String subject, int experience, long mobilenumber, double salary, String school, String qualification) {
	        this(age, name, subject, experience, mobilenumber, salary, school);
	        this.qualification = qualification;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tAge is: " + age + "\tSubject is: " + subject + "\tExperience is: " + experience + "\nMobile Number is: " + mobilenumber + "\tSalary is: " + salary + "\tSchool is: " + school + "\tQualification is: " + qualification + "\n===============================================";
	    }
	

}
