package multiThreading;

public class Students1Driver {

	public static void main(String[] args) {
		
		Students1 s1 = new Students1("Mohan", 50);
		Students1 s2 = new Students1("Sohan", 30);
		Students1 s3 = new Students1("Rohan", 25);
		Students1 s4 = new Students1("John", 35);
		Students1 s5 = new Students1("Madan", 45);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		
		s1.interrupt();

	}

}
