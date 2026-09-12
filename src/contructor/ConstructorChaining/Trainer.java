package contructor.ConstructorChaining;

public class Trainer {
	
	
	    String name;
	    int age;
	    String specialization;
	    int experience;
	    long mobilenumber;
	    double salary;
	    String institute;
	    String subject;

	    Trainer(String name, int age, String specialization, int experience,
	            long mobilenumber, double salary, String institute, String subject) {

	        this.name = name;
	        this.age = age;
	        this.specialization = specialization;
	        this.experience = experience;
	        this.mobilenumber = mobilenumber;
	        this.salary = salary;
	        this.institute = institute;
	        this.subject = subject;
	    }

	    Trainer() {
	    }

	    Trainer(String name) {
	        this.name = name;
	    }

	    Trainer(String name, int age) {
	        this(name);
	        this.age = age;
	    }

	    Trainer(String name, int age, String specialization) {
	        this(name, age);
	        this.specialization = specialization;
	    }

	    Trainer(String name, int age, String specialization, int experience) {
	        this(name, age, specialization);
	        this.experience = experience;
	    }

	    Trainer(String name, int age, String specialization, int experience, long mobilenumber) {
	        this(name, age, specialization, experience);
	        this.mobilenumber = mobilenumber;
	    }

	    Trainer(String name, int age, String specialization, int experience, long mobilenumber, double salary) {
	        this(name, age, specialization, experience, mobilenumber);
	        this.salary = salary;
	    }

	    Trainer(int age, String name, String specialization, int experience, long mobilenumber, double salary, String institute) {
	        this(name, age, specialization, experience, mobilenumber, salary);
	        this.institute = institute;
	    }

	    Trainer(int age, String name, String specialization, int experience, long mobilenumber, double salary, String institute, String subject) {
	        this(age, name, specialization, experience, mobilenumber, salary, institute);
	        this.subject = subject;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tAge is: " + age + "\tSpecialization is: " + specialization + "\tExperience is: " + experience + "\nMobile Number is: " + mobilenumber + "\tSalary is: " + salary + "\tInstitute is: " + institute + "\tSubject is: " + subject + "\n===============================================";
	    }
	

}
