package multiThreading;

import java.lang.Thread.State;

public class Calculate2Driver {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Appication starts");
		System.out.println(Thread.currentThread().getName());
		
		State[] states = Thread.State.values();
		for(State s:states) {
			System.out.println(s);
		}
		
		Calculate2 c1 = new Calculate2(789561239l);
		Calculate2 c2 = new Calculate2(897456123l);
		Calculate2 c3 = new Calculate2(978456123l);
		Calculate2 c4 = new Calculate2(489712345l);
		Calculate2 c5 = new Calculate2(896678456l);
		Calculate2 c6 = new Calculate2(996678488l);
		Calculate2 c7 = new Calculate2(796678989l);
		Calculate2 c8 = new Calculate2(896456899l);
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getPriority());
		System.out.println(c1.getState().name());
		
		long starttime = System.currentTimeMillis();
		
//		c1.add();	
//		c2.add();
//		c3.add();
//		c4.add();
//		c5.add();
//		c6.add();
//		c7.add();
//		c8.add();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		System.out.println(Thread.currentThread().getName());
		c5.start();
		c6.start();
		c7.start();
		c8.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		c5.join();
		c6.join();
		c7.join();
		c8.join();
		
		long endtime = System.currentTimeMillis();
		
		long actualtime = (endtime-starttime);
		System.out.println("Total time used is: " +actualtime+ " milliseconds ");
		
		System.out.println("Application ends");
		
	}

}
