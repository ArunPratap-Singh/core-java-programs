package multiThreading;

public class AnimalDriver {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Dog", 10);
		Animal a2 = new Animal("Lion", 30);
		Animal a3 = new Animal("Leopard", 40);
		Animal a4 = new Animal("Deer", 50);
		Animal a5 = new Animal("Cheetah", 100);
		Animal a6 = new Animal("Tiger", 130);
		Animal a7 = new Animal("Puma", 150);
		Animal a8 = new Animal("Jaguar", 190);
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();
		a7.start();
		a8.start();

	}

}
