package multiThreading.RaceCondition.lockProgram;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter2 {
	
private int count = 0;
	
	
	public  void increment() {
		
		Lock l = new ReentrantLock();
		l.lock();
		
		count++;
		
	}
	
	public int getCount() {
		return count;
	}


}
