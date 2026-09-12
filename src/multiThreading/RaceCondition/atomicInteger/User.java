package multiThreading.RaceCondition.atomicInteger;

import multiThreading.RaceCondition.Counter;

public class User extends Thread {
	
	String name;
	int n;
	Counter c;
	
	User(){
		
	}
	
	User(String name, int n, Counter c){
		this.name = name;
		this.n = n;
		this.c = c;
	}
	
	public void run() {
		for(int i = 1;i<=n;i++) {
			c.increment();
		}
	}
}
