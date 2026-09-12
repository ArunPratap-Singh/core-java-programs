package multiThreading;

public class NaturalNumber extends Thread{
	
	int start;
	int end;
	
	NaturalNumber(){
		
	}
	
	NaturalNumber(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		natural();
	}
	
	public void natural() {
		for(int i=start;i<=end;i++) {
			System.out.println("Natural number is: " +i);
		}
		System.out.println("natural number printed");
		
	}

}
