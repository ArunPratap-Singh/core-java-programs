package exceptionHandling;

public class ExceptionPrograme30 {

	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		System.out.println("test method starts");
		System.out.println("test method ends");
		test();
	}

}
