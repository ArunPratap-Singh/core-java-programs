package methodChaining;

public class ZomatoDriver {

	public static void main(String[] args) {

		Zomato z1 = new Zomato();
		Zomato z2 = new Zomato();
		Zomato z3 = new Zomato();
		Zomato z4 = new Zomato();
		Zomato z5 = new Zomato();
		Zomato z6 = new Zomato();
		Zomato z7 = new Zomato();
		Zomato z8 = new Zomato();
		Zomato z9 = new Zomato();
		Zomato z10 = new Zomato();
		Zomato z11 = new Zomato();
		Zomato z12 = new Zomato();
		Zomato z13 = new Zomato();
		Zomato z14 = new Zomato();
		Zomato z15 = new Zomato();
		Zomato z16 = new Zomato();
		Zomato z17 = new Zomato();
		Zomato z18 = new Zomato();
		Zomato z19 = new Zomato();
		Zomato z20 = new Zomato();

		z1.setCustomerName("Arun").setRestaurantName("Dominos").setFoodName("Farmhouse Pizza").setCategory("Pizza").setQuantity(2).setPrice(599.00).setDeliveryAddress("Lucknow").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		z2.setCustomerName("Rahul").setRestaurantName("Biryani Blues").setFoodName("Chicken Biryani").setCategory("Biryani").setQuantity(1).setPrice(349.00).setDeliveryAddress("Delhi").setPaymentMode("Credit Card").setOrderStatus("Preparing");
		z3.setCustomerName("Amit").setRestaurantName("Burger King").setFoodName("Whopper Burger").setCategory("Burger").setQuantity(2).setPrice(499.00).setDeliveryAddress("Noida").setPaymentMode("UPI").setOrderStatus("Out for Delivery");
		z4.setCustomerName("Priya").setRestaurantName("Haldiram's").setFoodName("Chole Bhature").setCategory("North Indian").setQuantity(2).setPrice(280.00).setDeliveryAddress("Jaipur").setPaymentMode("Cash on Delivery").setOrderStatus("Order Confirmed");
		z5.setCustomerName("Neha").setRestaurantName("KFC").setFoodName("Chicken Bucket").setCategory("Fast Food").setQuantity(1).setPrice(699.00).setDeliveryAddress("Gurgaon").setPaymentMode("UPI").setOrderStatus("Preparing");
		z6.setCustomerName("Vikas").setRestaurantName("Pizza Hut").setFoodName("Veggie Pizza").setCategory("Pizza").setQuantity(2).setPrice(549.00).setDeliveryAddress("Mumbai").setPaymentMode("Debit Card").setOrderStatus("Delivered");
		z7.setCustomerName("Rohit").setRestaurantName("Wow! Momo").setFoodName("Steamed Momos").setCategory("Momos").setQuantity(3).setPrice(399.00).setDeliveryAddress("Kolkata").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		z8.setCustomerName("Anjali").setRestaurantName("Subway").setFoodName("Paneer Sub").setCategory("Sandwich").setQuantity(1).setPrice(299.00).setDeliveryAddress("Pune").setPaymentMode("Credit Card").setOrderStatus("Preparing");
		z9.setCustomerName("Suresh").setRestaurantName("Dosa Plaza").setFoodName("Masala Dosa").setCategory("South Indian").setQuantity(2).setPrice(260.00).setDeliveryAddress("Bangalore").setPaymentMode("UPI").setOrderStatus("Out for Delivery");
		z10.setCustomerName("Karan").setRestaurantName("Barbeque Nation").setFoodName("Paneer Tikka").setCategory("Starter").setQuantity(2).setPrice(750.00).setDeliveryAddress("Hyderabad").setPaymentMode("Debit Card").setOrderStatus("Order Confirmed");
		z11.setCustomerName("Pooja").setRestaurantName("The Belgian Waffle Co").setFoodName("Chocolate Waffle").setCategory("Dessert").setQuantity(2).setPrice(360.00).setDeliveryAddress("Chandigarh").setPaymentMode("UPI").setOrderStatus("Preparing");
		z12.setCustomerName("Manish").setRestaurantName("Behrouz Biryani").setFoodName("Mutton Biryani").setCategory("Biryani").setQuantity(1).setPrice(449.00).setDeliveryAddress("Lucknow").setPaymentMode("Cash on Delivery").setOrderStatus("Out for Delivery");
		z13.setCustomerName("Sneha").setRestaurantName("Moti Mahal").setFoodName("Butter Chicken").setCategory("North Indian").setQuantity(1).setPrice(520.00).setDeliveryAddress("Delhi").setPaymentMode("UPI").setOrderStatus("Delivered");
		z14.setCustomerName("Ravi").setRestaurantName("Mainland China").setFoodName("Hakka Noodles").setCategory("Chinese").setQuantity(2).setPrice(480.00).setDeliveryAddress("Noida").setPaymentMode("Credit Card").setOrderStatus("Order Confirmed");
		z15.setCustomerName("Simran").setRestaurantName("Faasos").setFoodName("Paneer Roll").setCategory("Rolls").setQuantity(2).setPrice(320.00).setDeliveryAddress("Jaipur").setPaymentMode("UPI").setOrderStatus("Preparing");
		z16.setCustomerName("Deepak").setRestaurantName("Taco Bell").setFoodName("Mexican Taco").setCategory("Mexican").setQuantity(3).setPrice(450.00).setDeliveryAddress("Gurgaon").setPaymentMode("Debit Card").setOrderStatus("Out for Delivery");
		z17.setCustomerName("Kavita").setRestaurantName("Sagar Ratna").setFoodName("Idli Sambar").setCategory("South Indian").setQuantity(2).setPrice(220.00).setDeliveryAddress("Chennai").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		z18.setCustomerName("Nitin").setRestaurantName("Baskin Robbins").setFoodName("Chocolate Ice Cream").setCategory("Dessert").setQuantity(2).setPrice(340.00).setDeliveryAddress("Kanpur").setPaymentMode("Cash on Delivery").setOrderStatus("Delivered");
		z19.setCustomerName("Shivani").setRestaurantName("Mio Amore").setFoodName("Chocolate Cake").setCategory("Bakery").setQuantity(1).setPrice(650.00).setDeliveryAddress("Kolkata").setPaymentMode("UPI").setOrderStatus("Preparing");
		z20.setCustomerName("Varun").setRestaurantName("Paradise Biryani").setFoodName("Hyderabadi Biryani").setCategory("Biryani").setQuantity(2).setPrice(699.00).setDeliveryAddress("Hyderabad").setPaymentMode("Credit Card").setOrderStatus("Order Confirmed");

		z1.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z1.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z2.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z3.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z4.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z5.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z6.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z7.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z8.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z9.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z10.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z11.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z12.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z13.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z14.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z15.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z16.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z17.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z18.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z19.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		z20.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");
	}

}
