package multiThreading;

public class Calculate2 extends Thread{
	
	long n;
	
	Calculate2(){
		
	}
	
	Calculate2(long n){
		this.n = n;
	}
	
	public void run() {
		add();
	}
	
	public void add() {
		long sum = 0;
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("Sum upto" + n + "number is: " +sum);
	}

}
