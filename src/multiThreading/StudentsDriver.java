package multiThreading;

public class StudentsDriver {

	public static void main(String[] args) {
		
		Students s1 = new Students("Mohan", 50);
		Students s2 = new Students("Sohan", 30);
		Students s3 = new Students("Rohan", 25);
		Students s4 = new Students("John", 35);
		Students s5 = new Students("Madan", 45);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		
		s1.interrupt();

	}

}
