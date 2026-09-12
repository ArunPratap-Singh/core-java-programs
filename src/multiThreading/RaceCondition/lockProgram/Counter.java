package multiThreading.RaceCondition.lockProgram;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	
	private int count = 0;
	
	
	public  void increment() {
		
		Lock l = new ReentrantLock();
		l.lock();
		try {
		count++;
		System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}finally {
			l.unlock();
		}
	}
	
	public int getCount() {
		return count;
	}

}
