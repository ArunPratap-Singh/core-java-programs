package multiThreading.RaceCondition.threadLocalProgram;

public class Counter1 {
	
ThreadLocal<Integer> count = ThreadLocal.withInitial(() -> 0 );
	
	public void increment() {
		
		count.set(count.get() + 1);
	}
	
	public int getCount() {
		return count.get();
	}
	
	public void close() {
		count.remove();
	}


}
