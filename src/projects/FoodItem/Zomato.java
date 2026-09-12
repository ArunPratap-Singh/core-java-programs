package projects.FoodItem;

import java.util.Scanner;

public class Zomato {
	
	    Scanner sc = new Scanner(System.in);

	    public FoodItems selectAndGetFood() {

	        System.out.println("==============================================");
	        System.out.println("        WELCOME TO ZOMATO FOOD DELIVERY        ");
	        System.out.println("==============================================");
	        
	        System.out.println("=========You Can Order Food From Different Restaurent===========");
	        
	        System.out.println("=========Enter Pin Code To Check That Zomato Delivery Is There At Your Location===========");
	        int pincode = Integer.parseInt(sc.nextLine());
	        System.out.println("Pincode is: " +pincode);
	        System.out.println("==========Food Can Be Delivered============");
	        	        
	        System.out.println("=========Enjoy Exciting Offers===========");
	        
	        System.out.println("=========Enjoy Free Delivery Upto 10Km===========");

	        System.out.println("Press 1  ===> Pizza");
	        System.out.println("Press 2  ===> Burger");
	        System.out.println("Press 3  ===> Sandwich");
	        System.out.println("Press 4  ===> Pasta");
	        System.out.println("Press 5  ===> Biryani");
	        System.out.println("Press 6  ===> Noodles");
	        System.out.println("Press 7  ===> Momos");
	        System.out.println("Press 8  ===> Dosa");
	        System.out.println("Press 9  ===> Idli");
	        System.out.println("Press 10 ===> Samosa");
	        System.out.println("Press 11 ===> Chole Bhature");
	        System.out.println("Press 12 ===> Paneer Tikka");
	        System.out.println("Press 13 ===> Fried Rice");
	        System.out.println("Press 14 ===> Cake");
	        System.out.println("Press 15 ===> Ice Cream");
	        System.out.println("Press 16 ===> Gulab Jamun");
	        System.out.println("Press 17 ===> Donut");
	        System.out.println("Press 18 ===> French Fries");
	        System.out.println("Press 19 ===> Shawarma");
	        System.out.println("Press 20 ===> Rolls");
	        System.out.println("Press 21  ===> Burger Pizza");
	        System.out.println("Press 22  ===> Gartlic Bread");
	        System.out.println("Press 23  ===> Spring Roll");
	        System.out.println("Press 24  ===> Manchurian");
	        System.out.println("Press 25  ===> Pav Bhaji");
	        System.out.println("Press 26  ===> Vada Pav");
	        System.out.println("Press 27  ===> Rajma Chawal");
	        System.out.println("Press 28  ===> Dal Makhani");
	        System.out.println("Press 29  ===> Paneer Butter Masala");
	        System.out.println("Press 30 ===> Butter Chicken");
	        System.out.println("Press 31 ===> Tandoori Chicken");
	        System.out.println("Press 32 ===> Aloo Paratha");
	        System.out.println("Press 33 ===> Paneer Paratha"); 
	        System.out.println("Press 34 ===> Kachori");
	        System.out.println("Press 35 ===> Brownie");
	        System.out.println("Press 36 ===> Rasgulla");
	        System.out.println("Press 37 ===> ColdCoffee");
	        System.out.println("Press 38 ===> Mango Shake");
	        System.out.println("Press 39 ===> Masala Tea");
	        System.out.println("Press 40 ===> Coffee");

	        System.out.println("Enter Your Choice:");
	        int choice = Integer.parseInt(sc.nextLine());

	        if (choice == 1) {

	            System.out.println("Enter Pizza Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Size:");
	            String size = sc.nextLine();

	            System.out.println("Enter Crust Type:");
	            String crustType = sc.nextLine();

	            System.out.println("Extra Cheese (true/false):");
	            boolean extraCheese = Boolean.parseBoolean(sc.nextLine());
	            
	          //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Pizza(name, price, restaurantName, size, crustType, extraCheese);
	        }

	        else if (choice == 2) {

	            System.out.println("Enter Burger Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Burger Type:");
	            String burgerType = sc.nextLine();

	            System.out.println("Enter Patty Type:");
	            String pattyType = sc.nextLine();

	            System.out.println("Extra Cheese (true/false):");
	            boolean extraCheese = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Burger(name, price, restaurantName, burgerType, pattyType, extraCheese);
	        }

	        else if (choice == 3) {

	            System.out.println("Enter Sandwich Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Bread Type:");
	            String breadType = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Is Grilled (true/false):");
	            boolean grilled = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Sandwich(name, price, restaurantName, breadType, filling, grilled);
	        }

	        else if (choice == 4) {

	            System.out.println("Enter Pasta Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Pasta Type:");
	            String pastaType = sc.nextLine();

	            System.out.println("Enter Sauce Type:");
	            String sauceType = sc.nextLine();

	            System.out.println("Enter Spice Level:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Pasta(name, price, restaurantName, pastaType, sauceType, spiceLevel);
	        }

	        else if (choice == 5) {

	            System.out.println("Enter Biryani Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Biryani Type:");
	            String biryaniType = sc.nextLine();

	            System.out.println("Enter Quantity:");
	            int quantity = Integer.parseInt(sc.nextLine());

	            System.out.println("Raita Included (true/false):");
	            boolean raitaIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Biryani(name, price, restaurantName, biryaniType, quantity, raitaIncluded);
	        }

	        else if (choice == 6) {

	            System.out.println("Enter Noodles Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Noodle Type:");
	            String noodleType = sc.nextLine();

	            System.out.println("Enter Sauce:");
	            String sauce = sc.nextLine();

	            System.out.println("Enter Spice Level:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Noodles(name, price, restaurantName, noodleType, sauce, spiceLevel);
	        }

	        else if (choice == 7) {

	            System.out.println("Enter Momos Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Momo Type:");
	            String momoType = sc.nextLine();

	            System.out.println("Enter Number Of Pieces:");
	            int pieces =
	                    Integer.parseInt(sc.nextLine());

	            System.out.println("Fried (true/false):");
	            boolean fried = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Momos(name, price, restaurantName, momoType, pieces, fried);
	        }

	        else if (choice == 8) {

	            System.out.println("Enter Dosa Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Dosa Type:");
	            String dosaType = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Chutney Included (true/false):");
	            boolean chutneyIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Dosa(name, price, restaurantName, dosaType, filling, chutneyIncluded);
	        }

	        else if (choice == 9) {

	            System.out.println("Enter Idli Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Number Of Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Chutney Type:");
	            String chutneyType = sc.nextLine();

	            System.out.println("Sambar Included (true/false):");
	            boolean sambarIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Idli(name, price, restaurantName, pieces, chutneyType, sambarIncluded);
	        }

	        else if (choice == 10) {

	            System.out.println("Enter Samosa Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Quantity:");
	            int quantity = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Enter Chutney Type:");
	            String chutneyType = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Samosa(name, price, restaurantName, quantity, filling, chutneyType);
	        }

	        else if (choice == 11) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Bhature Quantity:");
	            int bhatureQuantity = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Chole Type:");
	            String choleType = sc.nextLine();

	            System.out.println("Pickle Included (true/false):");
	            boolean pickleIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new CholeBhature(name, price, restaurantName, bhatureQuantity, choleType, pickleIncluded);
	        }

	        else if (choice == 12) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Tikka Type:");
	            String tikkaType = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Spice Level:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new PaneerTikka(name, price, restaurantName, tikkaType, pieces, spiceLevel);
	        }

	        else if (choice == 13) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Rice Type:");
	            String riceType = sc.nextLine();

	            System.out.println("Enter Vegetable Type:");
	            String vegetableType = sc.nextLine();

	            System.out.println("Enter Spice Level:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new FriedRice(name, price, restaurantName, riceType, vegetableType, spiceLevel);
	        }

	        else if (choice == 14) {

	            System.out.println("Enter Cake Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Flavour:");
	            String flavour = sc.nextLine();

	            System.out.println("Enter Weight:");
	            double weight = Double.parseDouble(sc.nextLine());

	            System.out.println("Eggless (true/false):");
	            boolean eggless = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Cake(name, price, restaurantName, flavour, weight, eggless);
	        }

	        else if (choice == 15) {

	            System.out.println("Enter Ice Cream Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Flavour:");
	            String flavour = sc.nextLine();

	            System.out.println("Enter Scoops:");
	            int scoops = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Cone Type:");
	            String coneType = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new IceCream(name, price, restaurantName, flavour, scoops, coneType);
	        }

	        else if (choice == 16) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Sweetness Level:");
	            String sweetnessLevel = sc.nextLine();

	            System.out.println("Served Hot (true/false):");
	            boolean servedHot = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new GulabJamun(name, price, restaurantName, pieces, sweetnessLevel, servedHot);
	        }

	        else if (choice == 17) {

	            System.out.println("Enter Donut Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Flavour:");
	            String flavour = sc.nextLine();

	            System.out.println("Enter Topping:");
	            String topping = sc.nextLine();

	            System.out.println("Filled (true/false):");
	            boolean filled = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Donut(name, price, restaurantName, flavour, topping, filled);
	        }

	        else if (choice == 18) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Size:");
	            String size = sc.nextLine();

	            System.out.println("Enter Seasoning:");
	            String seasoning = sc.nextLine();

	            System.out.println("Cheese Dip (true/false):");
	            boolean cheeseDip = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new FrenchFries(name, price, restaurantName, size, seasoning, cheeseDip);
	        }

	        else if (choice == 19) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Shawarma Type:");
	            String shawarmaType = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Extra Sauce (true/false):");
	            boolean extraSauce = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Shawarma(name, price, restaurantName, shawarmaType, filling, extraSauce);
	        }

	        else if (choice == 20) {

	            System.out.println("Enter Roll Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Roll Type:");
	            String rollType = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Enter Sauce Type:");
	            String sauceType = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Rolls(name, price, restaurantName, rollType, filling, sauceType);
	        }
	        
	        else if(choice == 21) {
	        	
	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Size:");
	            String size = sc.nextLine();

	            System.out.println("Enter Topping:");
	            String topping = sc.nextLine();

	            System.out.println("Extra Cheese (true/false):");
	            boolean extraCheese = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new BurgerPizza(name, price, restaurantName, size, topping, extraCheese);
	        }
	        
	        else if (choice == 22) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter BreadType:");
	            String breadType = sc.nextLine();

	            System.out.println("Cheese Added (true/false):");
	            boolean cheeseAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new GarlicBread(name, price, restaurantName, pieces, breadType, cheeseAdded);
	            
	        }
	        
	        else if (choice == 23) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Filling:");
	            String filling = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter Saunce Type:");
	            String sauceType = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new SpringRoll(name, price, restaurantName, filling, pieces, sauceType);
	            
	        }
	        
	        else if (choice == 24) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Type:");
	            String type = sc.nextLine();

	            System.out.println("Enter sauceType:");
	            String sauceType = sc.nextLine();

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Manchurian(name, price, restaurantName, type, sauceType, spiceLevel);
	        }
	        
	        else if (choice == 25) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter PavPieces:");
	            int pavPieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();

	            System.out.println("Butter Added (true/false):");
	            boolean butterAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new PavBhaji(name, price, restaurantName, pavPieces, spiceLevel, butterAdded);
	        }
	        else if (choice == 26) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter ChutneyType:");
	            String chutneyType = sc.nextLine();

	            System.out.println("FriedChilli (true/false):");
	            boolean friedChilli = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new VadaPav(name, price, restaurantName, pieces, chutneyType, friedChilli);
	        }
	        else if (choice == 27) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter RajmaType:");
	            String rajmaType = sc.nextLine();

	            System.out.println("Enter RiceType:");
	            String riceType = sc.nextLine();

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new RajmaChawal(name, price, restaurantName, rajmaType, riceType, spiceLevel);
	        }
	        else if (choice == 28) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter DalType:");
	            String dalType = sc.nextLine();

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();

	            System.out.println("CreamAdded (true/false):");
	            boolean creamAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new DalMakhani(name, price, restaurantName, dalType, spiceLevel, creamAdded);
	        }
	        else if (choice == 29) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter GravyType:");
	            String gravyType = sc.nextLine();

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();

	            System.out.println("ButterAdded(true/false):");
	            boolean butterAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new PaneerButterMasala(name, price, restaurantName, gravyType, spiceLevel, butterAdded);
	        }
	        else if (choice == 30) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter ChickenType:");
	            String chickenType = sc.nextLine();

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();

	            System.out.println("ButterAdded(true/false):");
	            boolean butterAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new ButterChicken(name, price, restaurantName, chickenType, spiceLevel, butterAdded);
	        }
	        else if (choice == 31) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Pieces");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter SpiceLevel:");
	            String spiceLevel = sc.nextLine();

	            System.out.println("MintChutney(true/false):");
	            boolean mintChutney = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new TandooriChicken(name, price, restaurantName, pieces, spiceLevel, mintChutney);
	        }
	        else if (choice == 32) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter pieces");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("ButterAdded(true/false):");
	            boolean butterAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            System.out.println("CurdIncluded(true/false):");
	            boolean curdIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new AlooParatha(name, price, restaurantName, pieces, butterAdded, curdIncluded);
	        }
	        else if (choice == 33) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter pieces");
	            int pieces = Integer.parseInt(sc.nextLine());
	            
	            System.out.println("Enter Spice Level");
	            String spiceLevel = sc.nextLine();

	            System.out.println("ButterAdded(true/false):");
	            boolean butterAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new PaneerParatha(name, price, restaurantName, pieces, spiceLevel, butterAdded);
	        }
	        else if (choice == 34) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Filling");
	            String filling = sc.nextLine();

	            System.out.println("Enter Pieces:");
	            int pieces = Integer.parseInt(sc.nextLine());
	            
	            System.out.println("ChutneyIncluded(true/false):");
	            boolean chutneyIncluded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Kachori(name, price, restaurantName, filling, pieces, chutneyIncluded);
	        }
	        else if (choice == 35) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Flavour");
	            String flavour = sc.nextLine();

	            System.out.println("IceCreamAdded(true/false):");
	            boolean iceCreamAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            System.out.println("Enter Topping:");
	            String topping = sc.nextLine();
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Brownie(name, price, restaurantName, flavour, iceCreamAdded, topping);
	        }
	        else if (choice == 36) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter pieces");
	            int pieces = Integer.parseInt(sc.nextLine());

	            System.out.println("Enter SyrupType:");
	            String syrupType = sc.nextLine();
	            
	            System.out.println("Chilled(true/false):");
	            boolean chilled = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Rasgulla(name, price, restaurantName, pieces, syrupType, chilled);
	        }
	        else if (choice == 37) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter 	Size");
	            String size = sc.nextLine();

	            System.out.println("Enter Flavour:");
	            String flavour = sc.nextLine();
	            
	            System.out.println("IceCreamAdded(true/false):");
	            boolean iceCreamAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new ColdCoffee(name, price, restaurantName, size, flavour, iceCreamAdded);
	        }
	        else if (choice == 38) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter 	Size");
	            String size = sc.nextLine();

	            System.out.println("SugarAdded(true/false):");
	            boolean sugarAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            System.out.println("IceCreamAdded(true/false):");
	            boolean iceCreamAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new MangoShake(name, price, restaurantName, size, sugarAdded, iceCreamAdded);
	        }
	        else if (choice == 39) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter 	Size");
	            String size = sc.nextLine();

	            System.out.println("SugarAdded(true/false):");
	            boolean sugarAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            System.out.println("GingerAdded(true/false):");
	            boolean gingerAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new MasalaTea(name, price, restaurantName, size, sugarAdded, gingerAdded);
	        }
	        else if (choice == 37) {

	            System.out.println("Enter Name:");
	            String name = sc.nextLine();

	            System.out.println("Enter Price:");
	            double price = Double.parseDouble(sc.nextLine());

	            System.out.println("Enter Restaurant Name:");
	            String restaurantName = sc.nextLine();

	            System.out.println("Enter Size");
	            String size = sc.nextLine();

	            System.out.println("Enter coffeeType:");
	            String coffeeType = sc.nextLine();
	            
	            System.out.println("SugarAdded(true/false):");
	            boolean sugarAdded = Boolean.parseBoolean(sc.nextLine());
	            
	            //PAYMENT SYSTEM
	            
	            System.out.println("Select Payment Options");
				System.out.println("Press 100===> to choose Google Pay");
				System.out.println("Press 101===>to choose Paytm");
				System.out.println("Press 102===> to choose Bhim UPI");
				System.out.println("Press 103===> to choose Amazon Pay");
				System.out.println("Press 104===> to Amazon Pay Later");
				System.out.println("Press 105===> to choose Cash On Delivery");
					
				int Options = Integer.parseInt(sc.nextLine());
					if(Options==100) {
						System.out.println("You Have Chosen Google Pay");
						System.out.println("Enter Amount...");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5Minutes..");
						
					}else if(Options==101) {
						System.out.println("You Have Chosen Paytm");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");
					
					}else if(Options==102) {
						System.out.println("You Have Chosen Bhim UPI");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==103){
						System.out.println("You Have Chosen Amazon Pay");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==104) {
						System.out.println("You Have Chosen Amazon Pay Later");
						System.out.println("Enter Amount");
						double Amount=price;
						System.out.println("Click Pay");
						System.out.println("Enter UPI Pin.....");
						System.out.println("Amount Paid");
						System.out.println("Select Other Items Within 5 Minutes..");

					}else if(Options==105) {
						System.out.println("You Have Chosen Cash On Delivery");
						System.out.println("Pay Amount When Order Arrive..");
						double Amount=price;
						System.out.println("Select Other Items Within 5 Minutes..");
						System.out.println("Order Arrived");
						System.out.println("Paid");

					}else {
						System.out.println("Invalid Choice");
						System.out.println("Select Correct Payment Options");
					}
				System.out.println("We Are Packaging Your Order");
				System.out.println("Arrival Time 15 Minutes");
				
				System.out.println("Your Delivery Partner Is....");
				System.out.println("Enter Name...");
				String Name = sc.nextLine();
				System.out.println("Name is: " +Name);
				
				System.out.println("You Order Is On Th Way.....");
				System.out.println("Order Arrived.");
				System.out.println("Order Recieved");
				
				System.out.println("Did Your Order Arrived In Good Condition");
				String Response = sc.nextLine();
				System.out.println("Response is: " +Response);
				
				System.out.println("Rate the Expirience");
				String RateTheExpirience = sc.nextLine();
				System.out.println("RateTheExpirience is: " +RateTheExpirience);
				System.out.println("Thanks For Your Response...");
				
				System.out.println("Thanks For Choosing Zomato..");
				System.out.println("Shop it Again");

	            return new Coffee(name, price, restaurantName, coffeeType, size, sugarAdded);
	        } 
	        else {

	            System.out.println("Invalid Choice");
	            System.out.println("===========Please Select Correct Choice============");
	            return selectAndGetFood();
	        }
	    
	    }
  
}
