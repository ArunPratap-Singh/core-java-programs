package upcastingdowncasting.PROJECT;

import java.util.Scanner;

public class Dominos {
	
	public FastFood placeOrder() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1===> to order Pizza");
		System.out.println("Press 2===> to order Burger");
		System.out.println("Press 3===> to order Desserts");
		int choice = sc.nextInt();
		if(choice == 1) {
			
			System.out.println("You Have Succefully Placed Your Order");
			System.out.println("Please Wait Your Order Is Under Process");
			Thread.sleep(1000);
			Pizza p = new Pizza("Cheese Burst Pizza", 299, 1, 'M', "Extracheese,Mozzarella");
		}else if(choice == 2) {
			
			System.out.println("You Have Succesfully Placed Your Order");
			System.out.println("Please wait Your Order Is Under Process");
			Thread.sleep(1000);
			return new Burger("Veg Burger", 99, 1, "Veg", "Lettuce,Tomato, cheese");
		}else if(choice == 3) {
			
			System.out.println("You Have Successfully Placed Your Order");
			System.out.println("Please wait Your Order is Under Process");
			Thread.sleep(1000);
			return new Desserts("Chocolate Cake", 450, 1, "Chocolate", true);
		}else
			System.out.println("No Input Given");
			return placeOrder();
			
		
	}

}
