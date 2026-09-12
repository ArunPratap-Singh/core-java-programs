package multiThreading.producerConsumer;

public class Guest extends Thread{
	
	private String name;
	 private Container c;
	
	Guest(){
		
	}
	
	Guest(String name, Container c){
		this.name =   name;
		this.c = c;
	}
	
	public void run() {
		for(int i=1;i<=20;i++) {
			c.consume();
			try {
			Thread.sleep(1200);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
