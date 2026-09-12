package immutableClass;

public class FruitDriver {

	public static void main(String[] args) {
		
		Fruit f1 = new Fruit("Apple", 250, 4.5, "Red");
		Fruit f2 = new Fruit("Mango", 100, 50.25, "Yellow");
		Fruit f3 = new Fruit("Grapes", 150, 100.25, "Green");
		Fruit f4 = new Fruit("WaterMelon", 10, 5, "DarkGreen");
		Fruit f5 = new Fruit("Orange", 79, 25.36, "Green-Yellow");
		Fruit f6 = new Fruit("Mausammi", 80, 8.9, "LightGreen");
		
		System.out.println("========Fruit f1 Details===========");
		System.out.println("ObjectReference is: " +f1);
		System.out.println("Name is: " +f1.getName());
		System.out.println("Price is: " +f1.getPrice());
		System.out.println("Quantity is: " +f1.getQuantity());
		System.out.println("Color is: " +f1.getColor());
		
		System.out.println("===================================================");
		
		System.out.println("========Fruit f2 Details===========");
		System.out.println("ObjectReference is: " +f2);
		System.out.println("Name is: " +f2.getName());
		System.out.println("Price is: " +f2.getPrice());
		System.out.println("Quantity is: " +f2.getQuantity());
		System.out.println("Color is: " +f2.getColor());
		
		System.out.println("==================================================");
		
		System.out.println("========Fruit f3 Details===========");
		System.out.println("ObjectReference is: " +f3);
		System.out.println("Name is: " +f3.getName());
		System.out.println("Price is: " +f3.getPrice());
		System.out.println("Quantity is: " +f3.getQuantity());
		System.out.println("Color is: " +f3.getColor());
		
		System.out.println("=====================================================");
		
		System.out.println("========Fruit f4 Details===========");
		System.out.println("ObjectReference is: " +f4);
		System.out.println("Name is: " +f4.getName());
		System.out.println("Price is: " +f4.getPrice());
		System.out.println("Quantity is: " +f4.getQuantity());
		System.out.println("Color is: " +f4.getColor());
		
		System.out.println("======================================================");
		
		System.out.println("========Fruit f5 Details===========");
		System.out.println("ObjectReference is: " +f5);
		System.out.println("Name is: " +f5.getName());
		System.out.println("Price is: " +f5.getPrice());
		System.out.println("Quantity is: " +f5.getQuantity());
		System.out.println("Color is: " +f5.getColor());
		
		System.out.println("===================================================");
		
		System.out.println("========Fruit f6 Details===========");
		System.out.println("ObjectReference is: " +f6);
		System.out.println("Name is: " +f6.getName());
		System.out.println("Price is: " +f6.getPrice());
		System.out.println("Quantity is: " +f6.getQuantity());
		System.out.println("Color is: " +f6.getColor());

	}

}
