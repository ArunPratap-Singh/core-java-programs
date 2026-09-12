package multiThreading.producerConsumer;

public class Chef extends Thread{
	
	private String name;
	private Container c;
	
	Chef(){
		
	}
	
	Chef(String name, Container c){
		
		this.name = name;
		this.c = c;
		
	}
	
	public void run() {
		
		for(int i=1;i<=20;i++) {
			c.produce(i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
