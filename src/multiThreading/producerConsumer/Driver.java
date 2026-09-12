package multiThreading.producerConsumer;

public class Driver {

	public static void main(String[] args) {

		Container c = new  Container();
		Chef chef = new Chef("Mohan", c);
		Guest guest = new Guest("Rohan", c);
		
		chef.start();
		guest.start();
		
		try {
		chef.join();
		guest.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All items are produced and consumed");
	}

}
