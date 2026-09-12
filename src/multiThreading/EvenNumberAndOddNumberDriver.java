package multiThreading;

public class EvenNumberAndOddNumberDriver {

	public static void main(String[] args) {
		
		EvenNumberAndOddNumber en1 = new EvenNumberAndOddNumber(100);
		EvenNumberAndOddNumber en2 = new EvenNumberAndOddNumber(200);
		EvenNumberAndOddNumber en3 = new EvenNumberAndOddNumber(300);
		EvenNumberAndOddNumber en4 = new EvenNumberAndOddNumber(400);
		EvenNumberAndOddNumber en5 = new EvenNumberAndOddNumber(500);
		
		en1.start();
		en2.start();
		en3.start();
		en4.start();
		en5.start();

	}

}
