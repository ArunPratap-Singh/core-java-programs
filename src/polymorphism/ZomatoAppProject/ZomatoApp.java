package polymorphism.ZomatoAppProject;

import java.util.Scanner;

public class ZomatoApp {
	
	public FoodShop placeOrder() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Zomato");
		Thread.sleep(2000);
		System.out.println("Its Discount Season Is Going!!! Order Food To Get At Discounted Price");
		System.out.println("All Restaurent Are Showing Prices After Discount");
		System.out.println("Hurry Up!!!!!");
		System.out.println("Select Restaurent and Choose Food");
		Thread.sleep(4000);
		System.out.println("Press 1 ====> To Select ChaatAndSnacks");
		System.out.println("Press 2 ====> To Select Sweets");
		System.out.println("Press 3 ====> To Select ThaliMealsAndCombos");
		System.out.println("Press 4 ====> To Select Breakfast");
		System.out.println("Press 5 ====> To Select Platters");
		System.out.println("Press 6 ====> To Select Soups");
		System.out.println("Press 7 ====> To Select FastFoodItems");
		System.out.println("Press 8 ====> To Select Breads");
		System.out.println("Press 9 ====> To Select RiceAndBiryani");
		System.out.println("Press 10 ====> To Select Accompaniments");
		System.out.println("Press 11 ====> To Select Namkeens");
		System.out.println("Press 12 ====> To Select BuiscuitsAndCookies");
		System.out.println("Press 13 ====> To Select CakesAndPastries");
		System.out.println("Press 14 ====> To Select Beverages");
		Thread.sleep(1000);
		int Choice = Integer.parseInt(sc.nextLine());
		
		System.out.println("============================================================================");
		
		if(Choice==1) {
		
		System.out.println("You Have Chosen ChaatAndSnacks");
		
		System.out.println("Enter Name......");
		String Name = sc.nextLine();
		System.out.println("Name is: " +Name);
		
		System.out.println("Enter Rating.....");
		String Rating = sc.nextLine();
		System.out.println("Rating is: " +Rating);
		
		System.out.println("Enter Distance....");
		String Distance = sc.nextLine();
		System.out.println("Distance is: " +Distance);
		
		System.out.println("Enter isFreeDelivery.....");
		boolean isFreeDelivery = sc.nextBoolean();
		System.out.println("Is Free Delivery is: " +isFreeDelivery);
		
		System.out.println("Enter Discount...");
		String Discount = sc.nextLine();
		System.out.println("Discount is: " +Discount);
		
		System.out.println("Enter Type...");
		String Type = sc.nextLine();
		System.out.println("Type is: " +Type);
		
		System.out.println("Enter Type Name");
		String TypeName = sc.nextLine();
		System.out.println("Type Name is: " +TypeName);
		
		System.out.println("Enter Price...");
		int Price  = Integer.parseInt(sc.nextLine());
		System.out.println("Price is: " +Price);
		
		System.out.println("You Have Selected Your Items");
		System.out.println("Pay For The Selected Items");
		System.out.println("Choose Payment Options");
		
		System.out.println("Press 20===> To Choose GooglePay");
		System.out.println("Press 21===> To Choose Paytm");
		System.out.println("Press 22===> To Choose BhimUPI");
		System.out.println("Press 23===> To Choose AmazonPay");
		System.out.println("Press 24===> To Choose Cash On Delivery");
		Thread.sleep(3000);
		int Options = sc.nextInt();
		if(Options==20) {
			System.out.println("Chosen Google Pay");
			System.out.println("Pay It");
			System.out.println("Enter The Amount....." );
			int Amount=Price;
			System.out.println("Amount Entered");
			System.out.println("Enter Pin....");
			Thread.sleep(2000);
			System.out.println("Payment Successfully Done");
			System.out.println("Order Placed");
		}else if(Options==21) {
			System.out.println("Chosen Paytm");
			System.out.println("Pay It");
			System.out.println("Enter The Amount");
			int Amount=Price;
			System.out.println("Amount Entered");
			System.out.println("Enter Pin.....");
			Thread.sleep(2000);
			System.out.println("Payment Successfully Done");
			System.out.println("Order Placed");
		}else if(Options==22) {
			System.out.println("Choose BhimUPI");
			System.out.println("Pay It");
			System.out.println("Enter The Amount");
			int Amount=Price;
			System.out.println("Amount Entered");
			System.out.println("Enter Pin");
			Thread.sleep(2000);
			System.out.println("Payment Successfully Done");
			System.out.println("Order Placed");
		}else if(Options==23) {
			System.out.println("Choose Amazon pay");
			System.out.println("Pay It");
			System.out.println("Enter The Amount");
			int Amount=Price;
			System.out.println("Amount Entered");
			System.out.println("Enter Pin");
			Thread.sleep(2000);
			System.out.println("Payment Successfully Done");
			System.out.println("Order Placed");
		}else if(Options==24) {
			System.out.println("Choose Cash On Delivery");
			System.out.println("Order Placed");
			System.out.println("Order Recieved");
			int Amount=Price;
			System.out.println("Payment Successfully Done");
		}else {
			System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
		}	
		System.out.println("Order Confirmed");
		Thread.sleep(3000);
		System.out.println("Waiting For Delivery Partner.....");
		System.out.println("Delivery Partner Arrived");
		System.out.println("Preparing Your Food");
		System.out.println("Your Order Is On The Way");
		System.out.println("Order Arrived");
		
		return new ChaatAndSnacks(Name, Rating, Distance, isFreeDelivery, Discount, Type, TypeName, Price);
		
		}else if(Choice==2) {
			
			System.out.println("You Have Selected Sweets");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Sweet Name....");
			String SweetName = sc.nextLine();
			System.out.println("SweetName is: " +SweetName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
			
			return new Sweets(Name, Rating, Distance, isFreeDelivery, Discount, SweetName, Price);
		
		}else if(Choice==3) {
			
			System.out.println("You Have Selected ThaliMealsAndCombos");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Meals Name....");
			String MealsName = sc.nextLine();
			System.out.println("MealsName: " +MealsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
				
				return new ThaliMealsAndCombos(Name, Rating, Distance, isFreeDelivery, Discount, MealsName, Price);
		
		}else if(Choice==4) {
			
			System.out.println("You Have Selected Breakfast");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Breakfast Name....");
			String BreakfastName = sc.nextLine();
			System.out.println("BreakfastName is: " +BreakfastName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
			System.out.println("Order Confirmed");
			Thread.sleep(3000);
			System.out.println("Waiting For Delivery Partner.....");
			System.out.println("Delivery Partner Arrived");
			System.out.println("Preparing Your Food");
			System.out.println("Your Order Is On The Way");
			System.out.println("Order Arrived");
			
			return new Breakfast(Name, Rating, Distance, isFreeDelivery, Discount, BreakfastName, Price);
		
		}else if(Choice==5) {
			System.out.println("You Have Selected Platters");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
			System.out.println("Order Confirmed");
			Thread.sleep(3000);
			System.out.println("Waiting For Delivery Partner.....");
			System.out.println("Delivery Partner Arrived");
			System.out.println("Preparing Your Food");
			System.out.println("Your Order Is On The Way");
			System.out.println("Order Arrived");
			
			return new Platters(Name, Rating, Distance, isFreeDelivery, Discount, Type, Price);
		}else if(Choice==6) {
			System.out.println("You Have Selected Soups");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Soup Name....");
			String SoupName = sc.nextLine();
			System.out.println("SoupName is: " +SoupName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
				
				return new Soups(Name, Rating, Distance, isFreeDelivery, Discount, SoupName, Price);
		}else if(Choice==7) {
			System.out.println("You Have Selected Fast Food Items");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Item Name....");
			String ItemName = sc.nextLine();
			System.out.println("ItemName is: " +ItemName);
			
			System.out.println("Enter Item Name Type Price");
			String ItemNameType = sc.nextLine(); 
			System.out.println("ItemNameType is: " +ItemNameType);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
			System.out.println("Order Confirmed");
			Thread.sleep(3000);
			System.out.println("Waiting For Delivery Partner.....");
			System.out.println("Delivery Partner Arrived");
			System.out.println("Preparing Your Food");
			System.out.println("Your Order Is On The Way");
			System.out.println("Order Arrived");
			
			return new FastFoodItems(Name, Rating, Distance, isFreeDelivery, Discount, ItemName, ItemNameType, Price);
		}else if(Choice==8) {
			System.out.println("You Have Selected Breads");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Bread Name....");
			String BreadName = sc.nextLine();
			System.out.println("BreadName is: " +BreadName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Stuffing.....");
			String Stuffing = sc.nextLine();
			System.out.println("Stuffing is: " +Stuffing);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
			System.out.println("Order Confirmed");
			Thread.sleep(3000);
			System.out.println("Waiting For Delivery Partner.....");
			System.out.println("Delivery Partner Arrived");
			System.out.println("Preparing Your Food");
			System.out.println("Your Order Is On The Way");
			System.out.println("Order Arrived");
			
			return new Breads(Name, Rating, Distance, isFreeDelivery, Discount, BreadName, Price, Stuffing);
		}else if(Choice==9) {
			System.out.println("You Have Selected RiceAndBiryani");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter isVeg");
			boolean isVeg = sc.nextBoolean();
			System.out.println("Is Veg is: " +isVeg);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
				
				return new RiceAndBiryani(Name, Rating, Distance, isFreeDelivery, Discount, Type, isVeg, Price);
		}else if(Choice==10) {
			System.out.println("You Have Selected Accompaniments");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Accompaniments Name....");
			String AccompanimentsName = sc.nextLine();
			System.out.println("AccompanimentsName is: " +AccompanimentsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
			System.out.println("Waiting For The Payment");
			System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
			System.out.println("Order Confirmed");
			Thread.sleep(3000);
			System.out.println("Waiting For Delivery Partner.....");
			System.out.println("Delivery Partner Arrived");
			System.out.println("Preparing Your Food");
			System.out.println("Your Order Is On The Way");
			System.out.println("Order Arrived");
			
			return new Accompaniments(Name, Rating, Distance, isFreeDelivery, Discount, AccompanimentsName, Price);
		}else if(Choice==11) {
			
			System.out.println("You Have Selected Namkeens");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type.....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("TypeName is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
			
				return new Namkeens(Name, Rating, Distance, isFreeDelivery, Discount, Type, TypeName, Price);
		}else if(Choice==12) {
			System.out.println("You Have Selected BuiscuitsAndCookies");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("TypeName is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
			
				return new BuiscuitsAndCookies(Name, Rating, Distance, isFreeDelivery, Discount, Type, TypeName, Price);
		
		}else if(Choice==13) {
			
			System.out.println("You Have Selected CakesAndPastries");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("TypeName is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else {
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			}
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
			
				return new CakesAndPastries(Name, Rating, Distance, isFreeDelivery, Discount, Type, TypeName, Price);
		
		}else if(Choice==14) {
			
			System.out.println("You Have Selected Beverages");
			
			System.out.println("Enter Name....");
			String Name = sc.nextLine();
			System.out.println("Name is: " +Name);
			
			System.out.println("Enter Rating....");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Distance....");
			String Distance  = sc.nextLine();
			System.out.println("Distance is: " +Distance);
			
			System.out.println("Enter Is Free Delivery");
			boolean isFreeDelivery = sc.nextBoolean();
			System.out.println("Is Free Delivery is: " +isFreeDelivery);
			
			System.out.println("Enter Discount....");
			String Discount = sc.nextLine();
			System.out.println("Discount is: " +Discount);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: " +Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("TypeName is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("You Have Selected Your Items");
			System.out.println("Pay For The Selected Items");
			System.out.println("Choose Payment options");
			
			System.out.println("Press 20===> To Choose GooglePay");
			System.out.println("Press 21===> To Choose Paytm");
			System.out.println("Press 22===> To Choose BhimUPI");
			System.out.println("Press 23===> To Choose AmazonPay");
			System.out.println("Press 24===> To Choose Cash On Delivery");
			Thread.sleep(2000);
			int Options=sc.nextInt();
			if(Options==20) {
				System.out.println("Chosen Google Pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount....." );
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==21) {
				System.out.println("Chosen Paytm");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin.....");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==22) {
				System.out.println("Choose BhimUPI");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==23) {
				System.out.println("Choose Amazon pay");
				System.out.println("Pay It");
				System.out.println("Enter The Amount");
				int Amount=Price;
				System.out.println("Amount Entered");
				System.out.println("Enter Pin");
				Thread.sleep(2000);
				System.out.println("Payment Successfully Done");
				System.out.println("Order Placed");
			}else if(Options==24) {
				System.out.println("Choose Cash On Delivery");
				System.out.println("Order Placed");
				System.out.println("Order Recieved");
				int Amount=Price;
				System.out.println("Payment Successfully Done");
			}else
				System.out.println("Invalid Choice");
				System.out.println("Waiting For The Payment");
				System.out.println("Please Select Correct Payment Options And Pay It Again");
			
				System.out.println("Order Confirmed");
				Thread.sleep(3000);
				System.out.println("Waiting For Delivery Partner.....");
				System.out.println("Delivery Partner Arrived");
				System.out.println("Preparing Your Food");
				System.out.println("Your Order Is On The Way");
				System.out.println("Order Arrived");
			
				return new Beverages(Name, Rating, Distance, isFreeDelivery, Discount, Type, TypeName, Price);
		}else {
			System.out.println("Not Found Interested Items");
			System.out.println("Select Another Restaurent");
			return placeOrder();
		}
		
		
	}

}
