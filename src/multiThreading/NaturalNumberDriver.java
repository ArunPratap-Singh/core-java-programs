package multiThreading;

public class NaturalNumberDriver {

	public static void main(String[] args) {
		
		NaturalNumber n1 = new NaturalNumber(1, 20);
		NaturalNumber n2 = new NaturalNumber(21, 40);
		NaturalNumber n3 = new NaturalNumber(41, 60);
		NaturalNumber n4 = new NaturalNumber(61, 80);
		NaturalNumber n5 = new NaturalNumber(81, 100);
		
		n1.start();
		n2.start();
		n3.start();
		n4.start();
		n5.start();

	}

}
