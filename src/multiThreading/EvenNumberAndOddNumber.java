package multiThreading;

public class EvenNumberAndOddNumber extends Thread {
	
	int num;
	
	EvenNumberAndOddNumber(){
		
	}
	
	EvenNumberAndOddNumber(int num){
		this.num = num;
	}
	
	public void run() {
		printEven();
		printOdd();
	}
	
	public void printEven() {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Even Number is: " +i);
			}
		}
		System.out.println("printing of even Number" +num+ " is completed");
	}
	
	public void printOdd() {
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("Odd Number is: " +i);
			}
		}
		System.out.println("printing of odd Number" +num+ " is completed");
	}
	

}
