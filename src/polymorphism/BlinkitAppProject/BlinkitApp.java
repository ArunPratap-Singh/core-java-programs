package polymorphism.BlinkitAppProject;

import java.util.Scanner;

public class BlinkitApp {
	
	public Product placeOrder() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1===> to choose Vegetables And Fruits");
		System.out.println("Press 2===> to choose Atta Rice And Daal");
		System.out.println("Press 3===> to choose Oil Ghee And Masala");
		System.out.println("Press 4===> to choose Milk Products");
		System.out.println("Press 5===> to choose Bakery And Biscuits");
		System.out.println("Press 6===> to choose Dry Fruits And Cereals");
		System.out.println("Press 7===> to choose Non Veg Product");
		System.out.println("Press 8===> to choose Kitchenware And Appliances");
		System.out.println("Press 9===> to choose Chips And Namkeen");
		System.out.println("Press 10===> to choose Sweets And Chocolates");
		System.out.println("Press 11===> to choose Drinks And Juices");
		System.out.println("Press 12===> to choose Tea And Coffee And Milk Drinks");
		System.out.println("Press 13===> to choose Instant Food");
		System.out.println("Press 14===> to choose Sauces And Spreads");
		System.out.println("Press 15===> to choose Paan Corner");
		System.out.println("Press 16===> to choose Ice Creams");
		System.out.println("Press 17===> to choose Bath And Beauty Product");
		System.out.println("Press 18===> to choose Hair Products");
		System.out.println("Press 19===> to choose Skin And Face Product");
		System.out.println("Press 20===> to choose Beauty And Cosmetics");
		System.out.println("Press 21===> to choose Feminine Hygiene");
		System.out.println("Press 22===> to choose Baby Care Product");
		System.out.println("Press 23===> to choose Health And Pharma");
		System.out.println("Press 24===> to choose Home And Lifstyle Product");
		System.out.println("Press 25===> to choose Cleaning Products");
		System.out.println("Press 26===> to choose Electronics");
		System.out.println("Press 27===> to choose Statinery And Games");
		System.out.println("Press 28===> to choose Book Store");
		System.out.println("Press 29===> to choose Jewellery Store");
		System.out.println("Press 30===> to choose Toys Store");
		System.out.println("Press 31===> to choose Footware Store");
		System.out.println("Press 32===> to choose Clothing Store");
		System.out.println("Press 33===> to choose Spritual Products");
		System.out.println("Press 34===> to choose Sports Product");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println("Open Blinkit App");
		Thread.sleep(2000);
		System.out.println("Enter Pin Code To Check The Products Available At Your NearBy Blinkit Store");
		System.out.println("Choose Products Which You Want To Buy");
		
		if(choice==1) {
			System.out.println("You Have Chosen Vegetables And Fruits");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Vegetables Or Fruits....");
			String VegetablesOrFruits = sc.nextLine();
			System.out.println("Vegetables Or Fruits is: "+VegetablesOrFruits);
			
			System.out.println("Enter Vegetables Or Fruits Name....");
			String VegetablesOrFruitsName = sc.nextLine();
			System.out.println("Vegetables Or Fruits Name is: " +VegetablesOrFruitsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new VegetablesAndFruits(ProductGroupName, VegetablesOrFruits, VegetablesOrFruitsName, Price, Quantity, DeliveryTiming);
		
		}else if(choice==2) {
			System.out.println("You Have Chosen Atta Rice And Daal");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Atta Or Rice Or Daal....");
			String AttaorRiceorDaal = sc.nextLine();
			System.out.println("AttaorRiceorDaal is: "+AttaorRiceorDaal);
			
			System.out.println("Enter Atta Or Rice Or Daal Name....");
			String AttaorRiceorDaalName = sc.nextLine();
			System.out.println("AttaorRiceorDaal Name is: " +AttaorRiceorDaalName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new AttaRiceAndDaal(ProductGroupName, AttaorRiceorDaal, AttaorRiceorDaalName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==3) {
			System.out.println("You Have chosen OilGheeAndMasala");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Oil Or Ghee Or Masala....");
			String OilorGheeorMasala = sc.nextLine();
			System.out.println("OilorGheeorMasala is: "+OilorGheeorMasala);
			
			System.out.println("Enter Oil Or Ghee Or Masala Name....");
			String OilorGheeorMasalaName = sc.nextLine();
			System.out.println("Oil Or Ghee Or Masala Name is: " +OilorGheeorMasalaName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new OilGheeAndMasala(ProductGroupName, OilorGheeorMasala, OilorGheeorMasalaName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==4) {
			System.out.println("You Have Chosen Milk Products");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Milk Products Type....");
			String MilkProductsType = sc.nextLine();
			System.out.println("MilkProductsType is: "+MilkProductsType);
			
			System.out.println("Enter Milk Products Type Name....");
			String MilkProductsTypeName = sc.nextLine();
			System.out.println("Milk Products Type Name is: " +MilkProductsTypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new MilkProducts(ProductGroupName, MilkProductsType, MilkProductsTypeName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==5) {
			System.out.println("You Have Chosen Bakery And Biscuits");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Bakery Or Biscuits....");
			String	BakeryorBiscuits = sc.nextLine();
			System.out.println("BakeryorBiscuits is: "+BakeryorBiscuits);
			
			System.out.println("Enter Bakery or Biscuits Name....");
			String BakeryorBiscuitsName = sc.nextLine();
			System.out.println("Bakery or Biscuits Name is: " +BakeryorBiscuitsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new BakeryAndBiscuits(ProductGroupName, BakeryorBiscuits, BakeryorBiscuitsName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==6) {
			System.out.println("You Have chosen DryFruitsAndCereals");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Dry Fruits Or Cereals....");
			String DryFruitsorCereals = sc.nextLine();
			System.out.println("DryFruitsorCereals is: "+DryFruitsorCereals);
			
			System.out.println("Enter Dry Fruits Or Cereals Name....");
			String DryFruitsorCerealsName = sc.nextLine();
			System.out.println("Dry Fruits Or Cereals Name is: " +DryFruitsorCerealsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new DryFruitsAndCereals(ProductGroupName, DryFruitsorCereals, DryFruitsorCerealsName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==7) {
			System.out.println("You Have chosen Non Veg Product");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Non Veg Product Type....");
			String NonVegProductType = sc.nextLine();
			System.out.println("NonVegProductType is: "+NonVegProductType);
			
			System.out.println("Enter Non Veg Product Type Name....");
			String NonVegProductTypeName = sc.nextLine();
			System.out.println("Non Veg Product Type Name is: " +NonVegProductTypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new NonVegProduct(ProductGroupName, NonVegProductType, NonVegProductTypeName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==8) {
			System.out.println("You Have chosen Kitchenware And Appliances");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Kitchenware Or Appliances....");
			String KitchenwareorAppliances = sc.nextLine();
			System.out.println("KitchenwareorAppliances is: "+KitchenwareorAppliances);
			
			System.out.println("Enter Kitchenware Or Appliances Name....");
			String KitchenwareorAppliancesName = sc.nextLine();
			System.out.println("Kitchenware or Appliances Name is: " +KitchenwareorAppliancesName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new KitchenwareAndAppliances(ProductGroupName, KitchenwareorAppliances, KitchenwareorAppliancesName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==9) {
			System.out.println("You Have Chosen Chips And Namkeen");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Chips Or Namkeen....");
			String ChipsOrNamkeen = sc.nextLine();
			System.out.println("ChipsOrNamkeen is: "+ChipsOrNamkeen);
			
			System.out.println("Enter Chips Or Namkeen Name....");
			String ChipsOrNamkeenName = sc.nextLine();
			System.out.println("Chips Or Namkeen Name is: " +ChipsOrNamkeenName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new ChipsAndNamkeen(ProductGroupName, ChipsOrNamkeen, ChipsOrNamkeenName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==10) {
			System.out.println("You Have Chosen Sweets And Chocolates");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Sweets Or Chocolates....");
			String SweetsOrChocolates = sc.nextLine();
			System.out.println("SweetsOrChocolates is: "+SweetsOrChocolates);
			
			System.out.println("Enter Sweets Or Chocolates Name....");
			String SweetsOrChocolatesName = sc.nextLine();
			System.out.println("Sweets Or Chocolates Name is: " +SweetsOrChocolatesName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new SweetsAndChocolates(ProductGroupName, SweetsOrChocolates, SweetsOrChocolatesName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==11) {
			System.out.println("You Have Chosen Drinks And Juices");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Drinks Or Juices....");
			String DrinksorJuices = sc.nextLine();
			System.out.println("DrinksorJuices is: "+DrinksorJuices);
			
			System.out.println("Enter Drinks Or Juices Name....");
			String DrinksorJuicesName = sc.nextLine();
			System.out.println("Drinks or Juices Name is: " +DrinksorJuicesName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new DrinksAndJuices(ProductGroupName, DrinksorJuices, DrinksorJuicesName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==12) {
			System.out.println("You Have Chosen Tea And Coffee And MilkDrinks");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Tea or Coffee or MilkDrinks....");
			String TeaorCoffeeorMilkDrinks = sc.nextLine();
			System.out.println("TeaorCoffeeorMilkDrinks is: "+TeaorCoffeeorMilkDrinks);
			
			System.out.println("Enter Tea or Coffee or MilkDrinks Name....");
			String TeaorCoffeeorMilkDrinksName = sc.nextLine();
			System.out.println("Tea or Coffee or MilkDrinks Name is: " +TeaorCoffeeorMilkDrinksName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new TeaAndCoffeeAndMilkDrinks(ProductGroupName, TeaorCoffeeorMilkDrinks, TeaorCoffeeorMilkDrinksName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==13) {
			System.out.println("You Have Chosen Instand Food");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Instant Food Name....");
			String InstantFoodName = sc.nextLine();
			System.out.println("Instant Food Name is: " +InstantFoodName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new InstantFood(ProductGroupName, InstantFoodName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==14) {
			System.out.println("You Have Chosen Sauces And Spreads");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Sauces Or Spreads....");
			String SaucesorSpreads = sc.nextLine();
			System.out.println("SaucesorSpreads is: "+SaucesorSpreads);
			
			System.out.println("Enter Sauces or Spreads Name....");
			String SaucesorSpreadsName = sc.nextLine();
			System.out.println("Sauces Or Spreads Name is: " +SaucesorSpreadsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new SaucesAndSpreads(ProductGroupName, SaucesorSpreads, SaucesorSpreadsName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==15){
			System.out.println("You Have Chosen Paan Corner");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Product Name....");
			String ProductName = sc.nextLine();
			System.out.println("Product Name is: " +ProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new PaanCorner(ProductGroupName, ProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==16) {
			System.out.println("You Have Chosen Ice Creams");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Product Name....");
			String ProductName = sc.nextLine();
			System.out.println("Product Name is: " +ProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new IceCreams(ProductGroupName, ProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==17) {
			System.out.println("You Have Chosen Bath And body Product");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Bath Or Body Product....");
			String BathorBodyProduct = sc.nextLine();
			System.out.println("BathorBodyProduct is: "+BathorBodyProduct);
			
			System.out.println("Enter Bath Or Body Product Name....");
			String BathorBodyProductName = sc.nextLine();
			System.out.println("BathorBodyProductName is: " +BathorBodyProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new BathAndBodyProduct(ProductGroupName, BathorBodyProduct, BathorBodyProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==18) {
			System.out.println("You Have Chosen Hair Products");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Hair Product Name....");
			String HairProductName = sc.nextLine();
			System.out.println("Hair Product Name is: " +HairProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new HairProducts(ProductGroupName, HairProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==19) {
			System.out.println("You Have Chosen Skin And Face Product");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Skin Or Face Product....");
			String SkinorFaceProduct = sc.nextLine();
			System.out.println("SkinorFaceProduct is: "+SkinorFaceProduct);
			
			System.out.println("Enter Skin Or Face Product Name....");
			String SkinorFaceProductName = sc.nextLine();
			System.out.println("Skin or Face Product Name is: " +SkinorFaceProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new SkinAndFaceProduct(ProductGroupName, SkinorFaceProduct, SkinorFaceProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==20) {
			System.out.println("You Have Chosen Beauty And Cosmetics");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Beauty Or Cosmetics....");
			String BeautyorCosmetics = sc.nextLine();
			System.out.println("BeautyorCosmetics is: "+BeautyorCosmetics);
			
			System.out.println("Enter Beauty And Cosmetics Product Name....");
			String BeautyorCosmeticsProductName = sc.nextLine();
			System.out.println("Beauty or Cosmetics Product Name is: " +BeautyorCosmeticsProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new BeautyAndCosmetics(ProductGroupName, BeautyorCosmetics, BeautyorCosmeticsProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==21) {
			System.out.println("You Have Chosen Feminine Hygiene Product...");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Feminine Hygiene Product Name....");
			String FeminineHygieneProductName = sc.nextLine();
			System.out.println("Feminine Hygiene Product Name is: " +FeminineHygieneProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("Enter Size..");
			String Size = sc.nextLine();
			System.out.println("Size is: " +Size);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new FeminineHygieneProduct(ProductGroupName, FeminineHygieneProductName, Price, Quantity, Rating, DeliveryTiming, Size);
		
		}else if(choice==22) {
			System.out.println("You Have Chosen Baby Care Product");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Baby Care Product Name....");
			String BabyCareProductName = sc.nextLine();
			System.out.println("Baby Care Product Name is: " +BabyCareProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("Enter Age..");
			String Age = sc.nextLine();
			System.out.println("Age is: " +Age);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new BabyCareProduct(ProductGroupName, BabyCareProductName, Price, Quantity, Rating, DeliveryTiming, Age);
		
		}else if(choice==23) {
		System.out.println("You Have Chosen Health And Pharma....");
		
		System.out.println("Enter Product Group Name");
		String ProductGroupName = sc.nextLine();
		System.out.println("Product Group Name is: " +ProductGroupName);
		
		System.out.println("Enter Health Or Pharma....");
		String HealthorPharma = sc.nextLine();
		System.out.println("HealthorPharma is: "+HealthorPharma);
		
		System.out.println("Enter Health or Pharma Product Name....");
		String HealthorPharmaProductName = sc.nextLine();
		System.out.println("Health or Pharma Product Name is: " +HealthorPharmaProductName);
		
		System.out.println("Enter Price....");
		int Price = Integer.parseInt(sc.nextLine());
		System.out.println("Price is: " +Price);
		
		System.out.println("Enter Quantity...");
		int Quantity = Integer.parseInt(sc.nextLine());
		System.out.println("Quantity is: " +Quantity);
		
		System.out.println("Enter Rating..");
		String Rating = sc.nextLine();
		System.out.println("Rating is: " +Rating);
		
		System.out.println("Enter Delivery Timing");
		String DeliveryTiming = sc.nextLine();
		System.out.println("Delivery Timing is: " +DeliveryTiming);
		
		System.out.println("You Have Selected Your Item");
		System.out.println("Click Buy");
		System.out.println("Enter Correct Address");
		
		System.out.println("Enter Address");
		String Address = sc.nextLine();
		System.out.println("Address is: " +Address);
		
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
				int Amount=Price;
				System.out.println("Click Pay");
				System.out.println("Enter UPI Pin....");
				System.out.println("Amount Paid");
				System.out.println("Select Other Items Within 5Minutes..");
				
			}else if(Options==101) {
				System.out.println("You Have Chosen Paytm");
				System.out.println("Enter Amount");
				int Amount=Price;
				System.out.println("Click Pay");
				System.out.println("Enter UPI Pin.....");
				System.out.println("Amount Paid");
				System.out.println("Select Other Items Within 5 Minutes..");
			
			}else if(Options==102) {
				System.out.println("You Have Chosen Bhim UPI");
				System.out.println("Enter Amount");
				int Amount=Price;
				System.out.println("Click Pay");
				System.out.println("Enter UPI Pin.....");
				System.out.println("Amount Paid");
				System.out.println("Select Other Items Within 5 Minutes..");

			}else if(Options==103){
				System.out.println("You Have Chosen Amazon Pay");
				System.out.println("Enter Amount");
				int Amount=Price;
				System.out.println("Click Pay");
				System.out.println("Enter UPI Pin.....");
				System.out.println("Amount Paid");
				System.out.println("Select Other Items Within 5 Minutes..");

			}else if(Options==104) {
				System.out.println("You Have Chosen Amazon Pay Later");
				System.out.println("Enter Amount");
				int Amount=Price;
				System.out.println("Click Pay");
				System.out.println("Enter UPI Pin.....");
				System.out.println("Amount Paid");
				System.out.println("Select Other Items Within 5 Minutes..");

			}else if(Options==105) {
				System.out.println("You Have Chosen Cash On Delivery");
				System.out.println("Pay Amount When Order Arrive..");
				int Amount=Price;
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
		
		System.out.println("Rate the Experience");
		String RateTheExperience = sc.nextLine();
		System.out.println("RateTheExpirience is: " +RateTheExperience);
		System.out.println("Thanks For Your Response...");
		
		System.out.println("Thanks For Choosing Blinkit..");
		System.out.println("Shop it Again");
		return new HealthAndPharma(ProductGroupName, HealthorPharma, HealthorPharmaProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==24) {
			System.out.println("You Have Chosen Home And Lifestyle Product");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Home or Lifestyle Product....");
			String HomeorLifestyleProduct = sc.nextLine();
			System.out.println("Home or Lifestyle Product is: "+HomeorLifestyleProduct);
			
			System.out.println("Enter Home or Lifestyle Product Name....");
			String HomeorLifestyleProductName = sc.nextLine();
			System.out.println("HomeorLifestyelProductName is: " +HomeorLifestyleProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new HomeAndLifestyleProduct(ProductGroupName, HomeorLifestyleProduct, HomeorLifestyleProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==25) {
			System.out.println("You Have Chosen Cleaning Products....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Cleaning Products Name....");
			String CleaningProductsName = sc.nextLine();
			System.out.println("CleaningProductsName is: " +CleaningProductsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			String Quantity = sc.nextLine();
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new CleaningProducts(ProductGroupName, CleaningProductsName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==26) {
			System.out.println("You Have Chosen Electronics...");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Electronics Product Name....");
			String ElectronicsProductName = sc.nextLine();
			System.out.println("Electronics Product Name is: " +ElectronicsProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new Electronics(ProductGroupName, ElectronicsProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==27) {
			System.out.println("You Have Chosen Staionery And Games");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Statinery Or Games....");
			String StationeryorGames = sc.nextLine();
			System.out.println("StationeryorGames is: "+StationeryorGames);
			
			System.out.println("Enter Stationery Or Games Product Name....");
			String StationeryorGamesProductName = sc.nextLine();
			System.out.println("StationeryorGamesProductName is: " +StationeryorGamesProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new StationeryAndGames(ProductGroupName, StationeryorGames, StationeryorGamesProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==28) {
			System.out.println("You Have Chosen Book Store");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Type Of Book....");
			String TypeofBook = sc.nextLine();
			System.out.println("TypeofBook is: "+TypeofBook);
			
			System.out.println("Enter Name Of Book....");
			String NameofBook = sc.nextLine();
			System.out.println("Name of Book is: " +NameofBook);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Number Of Books...");
			int NumberofBooks = Integer.parseInt(sc.nextLine());
			System.out.println("NumberofBooks is: " +NumberofBooks);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new BookStore(ProductGroupName, TypeofBook, NameofBook, Price, NumberofBooks, Rating, DeliveryTiming);
		
		}else if(choice==29) {
			System.out.println("You Have Chosen Jewellery Store...");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Jewellery Type....");
			String JewelleryType = sc.nextLine();
			System.out.println("Jewellery Type is: "+JewelleryType);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("Type Name is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new JewelleryStore(ProductGroupName, JewelleryType, TypeName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==30) {
			System.out.println("You Have Chosen Toys Store....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: "+Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("Type Name is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new ToysStore(ProductGroupName, Type, TypeName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==31) {
			System.out.println("You Have Chosen Footware Store....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: "+Type);
			
			System.out.println("Enter Type Name....");
			String TypeName = sc.nextLine();
			System.out.println("Type Name is: " +TypeName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new FootwareStore(ProductGroupName, Type, TypeName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==32) {
			System.out.println("You Have Chosen Clothing Store....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Type....");
			String Type = sc.nextLine();
			System.out.println("Type is: "+Type);
			
			System.out.println("Enter Brand Name....");
			String BrandName = sc.nextLine();
			System.out.println("Brand Name is: " +BrandName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new ClothingStore(ProductGroupName, Type, BrandName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==33) {
			System.out.println("You Have Chosen Spritual Products....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Spritual Products Name....");
			String SpritualProductsName = sc.nextLine();
			System.out.println("SpritualProductsName is: " +SpritualProductsName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new SpritualProducts(ProductGroupName, SpritualProductsName, Price, Quantity, Rating, DeliveryTiming);
		
		}else if(choice==34) {
			System.out.println("You Have Chosen Sports Products....");
			
			System.out.println("Enter Product Group Name");
			String ProductGroupName = sc.nextLine();
			System.out.println("Product Group Name is: " +ProductGroupName);
			
			System.out.println("Enter Sports Products Name....");
			String SportsProductName = sc.nextLine();
			System.out.println("SportsProductName is: " +SportsProductName);
			
			System.out.println("Enter Price....");
			int Price = Integer.parseInt(sc.nextLine());
			System.out.println("Price is: " +Price);
			
			System.out.println("Enter Quantity...");
			int Quantity = Integer.parseInt(sc.nextLine());
			System.out.println("Quantity is: " +Quantity);
			
			System.out.println("Enter Rating..");
			String Rating = sc.nextLine();
			System.out.println("Rating is: " +Rating);
			
			System.out.println("Enter Delivery Timing");
			String DeliveryTiming = sc.nextLine();
			System.out.println("Delivery Timing is: " +DeliveryTiming);
			
			System.out.println("You Have Selected Your Item");
			System.out.println("Click Buy");
			System.out.println("Enter Correct Address");
			
			System.out.println("Enter Address");
			String Address = sc.nextLine();
			System.out.println("Address is: " +Address);
			
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
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5Minutes..");
					
				}else if(Options==101) {
					System.out.println("You Have Chosen Paytm");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");
				
				}else if(Options==102) {
					System.out.println("You Have Chosen Bhim UPI");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==103){
					System.out.println("You Have Chosen Amazon Pay");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==104) {
					System.out.println("You Have Chosen Amazon Pay Later");
					System.out.println("Enter Amount");
					int Amount=Price;
					System.out.println("Click Pay");
					System.out.println("Enter UPI Pin.....");
					System.out.println("Amount Paid");
					System.out.println("Select Other Items Within 5 Minutes..");

				}else if(Options==105) {
					System.out.println("You Have Chosen Cash On Delivery");
					System.out.println("Pay Amount When Order Arrive..");
					int Amount=Price;
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
			
			System.out.println("Rate the Experience");
			String RateTheExperience = sc.nextLine();
			System.out.println("RateTheExpirience is: " +RateTheExperience);
			System.out.println("Thanks For Your Response...");
			
			System.out.println("Thanks For Choosing Blinkit..");
			System.out.println("Shop it Again");
			return new SportsProduct(ProductGroupName, SportsProductName, Price, Quantity, Rating, DeliveryTiming);
		
		}else {
			System.out.println("Invalid Choice");
			System.out.println("Please Select Correct Choice");
			return placeOrder();
		}
		
	}

}
