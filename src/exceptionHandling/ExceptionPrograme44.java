package exceptionHandling;

public class ExceptionPrograme44 {

	public static void main(String[] args) throws InterruptedException {
		printNum();

	}
	public static void printNum() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("I is: " +i);
			Thread.sleep(null);
		}
	}

	

}
