package exceptionHandling;

public class ExceptionPrograme36 {

	public static void main(String[] args) {
		test();
		System.out.println("abcd i am riding bicycle");
		System.out.println("wow i am eating at my relative");
		System.out.println("I am working");

	}
	
	public static void test() {
		throw new ArithmeticException("/ by zero!!!!!!!!!!!!!!");
	}

}
