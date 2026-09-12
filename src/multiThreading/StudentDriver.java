package multiThreading;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student s1 = new Student("Arun", 32, "Testing");
		Student s2 = new Student("Sachin", 25, "Java");
		Student s3 = new Student("Rishabh", 26, "Pytho");
		Student s4 = new Student("Piyush", 47, "Data Analytics");
		Student s5 = new Student("Arpit", 35, "Testing");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
	}

}
