package multiThreading;

public class Programe1 {

	public static void main(String[] args) {
		
		System.out.println("=========Main Starts============");
		
		for(int i=1;i<=100;i++) {
			System.out.println("i is: " +i);
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("I/m interrupted");
			}
		}
		
		System.out.println("=========Main Ends=========");

	}

}
