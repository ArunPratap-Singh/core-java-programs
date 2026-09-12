package multiThreading;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("Mango", 60);
		Fruit f2 = new Fruit("Apple", 20);
		Fruit f3 = new Fruit("Grapes", 30);
		Fruit f4 = new Fruit("Orange", 55);
		Fruit f5 = new Fruit("Dragon Fruit", 120);
		
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();

	}

}
