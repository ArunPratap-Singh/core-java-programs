package exceptionHandling;

public class ExceptionPrograme46 {
	public static void main(String[] args) throws InterruptedException{
		ExceptionPrograme46.printNum();

	}
	public static void printNum() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("I is: " +i);
			Thread.sleep(2000);
		}
	}
}
