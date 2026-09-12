package multiThreading;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person("Sachin", 65);
		Person p2 = new Person("Jayant", 75);
		Person p3 = new Person("Piyush", 85);
		Person p4 = new Person("Arun", 95);
		Person p5 = new Person("Manoj", 105);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		

	}

}
