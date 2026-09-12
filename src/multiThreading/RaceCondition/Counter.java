package multiThreading.RaceCondition;

public class Counter {
	
	private int count = 0;
	
	/*asynchronized method
	 * public void increment() {
		count++;
	}
	*/
	
	/*synchronized method
	 * public synchronized void increment() {
		
		count++;
	}
	*/
	
	//synchronized block
	public  void increment() {
		
		//code
		synchronized(this){
		count++;
		}
	}
	
	public int getCount() {
		return count;
	}

}
