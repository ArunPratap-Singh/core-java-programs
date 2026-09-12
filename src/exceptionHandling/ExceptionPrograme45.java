package exceptionHandling;

public class ExceptionPrograme45 {

	public static void main(String[] args) throws InterruptedException{
		printNum();
		System.out.println("hii");

	}
	public static void printNum() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println("I is: " +i);
			Thread.sleep(1000);
		}
	}

	

}
