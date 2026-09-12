package multiThreading.producerConsumer;

import java.util.LinkedList;

public class Container {
	
	private LinkedList<Integer> list = new LinkedList<>();
	private int capacity = 5;
	
	public synchronized void produce(int i) {
		try {
		while (list.size() == capacity) {
			wait();
			System.out.println("Producer is waiting for item to be consumed");
		}
		list.add(i);
		System.out.println("Producer has produced item: " +i);
		notifyAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void consume() {
		try {
		while (list.size() == 0) {
			wait();
			System.out.println("Consumer is waiting for item to be produced");
		}
		int item = list.removeFirst();
		System.out.println("Consumer has consumed item: " +item);
		notifyAll();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
