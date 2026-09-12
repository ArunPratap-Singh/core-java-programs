package objCount.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> l = new ArrayList<>();
		
		char choice;
		do {
			Product p = ProductService.orderProduct();
			l.add(p);
			System.out.println("Press y/Y to continue the program ");
			choice = sc.nextLine().charAt(0);
			
		}while(choice=='y'  || choice=='Y');
		
		for(Product p:l) {
			System.out.println("Name is: " +p.name+"\tPrice is: " +p.price+"\tQuantity is: " +p.quantity);
			
		}
			
		
		System.out.println("Total Object Created is: " +Product.count);
	
	}

}
