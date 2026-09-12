package objCount.Product;

public class Product {
	
	String name;
	int price;
	int quantity;
	
	Product(){
		
	}
	
	Product(String name, int price, int quantity){
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	static int count = 0;
	
	{
		count++;
		System.out.println("Employ Object " +count+ " is Created");
	}

}
