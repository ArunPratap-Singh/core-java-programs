package objCount.Product;

import java.util.Scanner;

public class ProductService {
	
	public static Product orderProduct() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Price ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Quantity ");
		int quantity = Integer.parseInt(sc.nextLine());
		
		Product p = new Product(name, price, quantity);
		return p;
		
	}

}
