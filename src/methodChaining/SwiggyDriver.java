package methodChaining;

public class SwiggyDriver {

	public static void main(String[] args) {

		Swiggy s1 = new Swiggy();
		Swiggy s2 = new Swiggy();
		Swiggy s3 = new Swiggy();
		Swiggy s4 = new Swiggy();
		Swiggy s5 = new Swiggy();
		Swiggy s6 = new Swiggy();
		Swiggy s7 = new Swiggy();
		Swiggy s8 = new Swiggy();
		Swiggy s9 = new Swiggy();
		Swiggy s10 = new Swiggy();
		Swiggy s11 = new Swiggy();
		Swiggy s12 = new Swiggy();
		Swiggy s13 = new Swiggy();
		Swiggy s14 = new Swiggy();
		Swiggy s15 = new Swiggy();
		Swiggy s16 = new Swiggy();
		Swiggy s17 = new Swiggy();
		Swiggy s18 = new Swiggy();
		Swiggy s19 = new Swiggy();
		Swiggy s20 = new Swiggy();

		s1.setCustomerName("Arun").setRestaurantName("Dominos").setFoodName("Farmhouse Pizza").setCategory("Pizza").setQuantity(2).setPrice(599.00).setDeliveryAddress("Lucknow").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		s2.setCustomerName("Rahul").setRestaurantName("Biryani Blues").setFoodName("Chicken Biryani").setCategory("Biryani").setQuantity(1).setPrice(349.00).setDeliveryAddress("Delhi").setPaymentMode("Credit Card").setOrderStatus("Preparing");
		s3.setCustomerName("Amit").setRestaurantName("Burger King").setFoodName("Whopper Burger").setCategory("Burger").setQuantity(2).setPrice(499.00).setDeliveryAddress("Noida").setPaymentMode("UPI").setOrderStatus("Out for Delivery");
		s4.setCustomerName("Priya").setRestaurantName("Haldiram's").setFoodName("Chole Bhature").setCategory("North Indian").setQuantity(2).setPrice(280.00).setDeliveryAddress("Jaipur").setPaymentMode("Cash on Delivery").setOrderStatus("Order Confirmed");
		s5.setCustomerName("Neha").setRestaurantName("KFC").setFoodName("Chicken Bucket").setCategory("Fast Food").setQuantity(1).setPrice(699.00).setDeliveryAddress("Gurgaon").setPaymentMode("UPI").setOrderStatus("Preparing");
		s6.setCustomerName("Vikas").setRestaurantName("Pizza Hut").setFoodName("Veggie Pizza").setCategory("Pizza").setQuantity(2).setPrice(549.00).setDeliveryAddress("Mumbai").setPaymentMode("Debit Card").setOrderStatus("Delivered");
		s7.setCustomerName("Rohit").setRestaurantName("Wow! Momo").setFoodName("Steamed Momos").setCategory("Momos").setQuantity(3).setPrice(399.00).setDeliveryAddress("Kolkata").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		s8.setCustomerName("Anjali").setRestaurantName("Subway").setFoodName("Paneer Sub").setCategory("Sandwich").setQuantity(1).setPrice(299.00).setDeliveryAddress("Pune").setPaymentMode("Credit Card").setOrderStatus("Preparing");
		s9.setCustomerName("Suresh").setRestaurantName("Dosa Plaza").setFoodName("Masala Dosa").setCategory("South Indian").setQuantity(2).setPrice(260.00).setDeliveryAddress("Bangalore").setPaymentMode("UPI").setOrderStatus("Out for Delivery");
		s10.setCustomerName("Karan").setRestaurantName("Barbeque Nation").setFoodName("Paneer Tikka").setCategory("Starter").setQuantity(2).setPrice(750.00).setDeliveryAddress("Hyderabad").setPaymentMode("Debit Card").setOrderStatus("Order Confirmed");
		s11.setCustomerName("Pooja").setRestaurantName("The Belgian Waffle Co").setFoodName("Chocolate Waffle").setCategory("Dessert").setQuantity(2).setPrice(360.00).setDeliveryAddress("Chandigarh").setPaymentMode("UPI").setOrderStatus("Preparing");
		s12.setCustomerName("Manish").setRestaurantName("Behrouz Biryani").setFoodName("Mutton Biryani").setCategory("Biryani").setQuantity(1).setPrice(449.00).setDeliveryAddress("Lucknow").setPaymentMode("Cash on Delivery").setOrderStatus("Out for Delivery");
		s13.setCustomerName("Sneha").setRestaurantName("Moti Mahal").setFoodName("Butter Chicken").setCategory("North Indian").setQuantity(1).setPrice(520.00).setDeliveryAddress("Delhi").setPaymentMode("UPI").setOrderStatus("Delivered");
		s14.setCustomerName("Ravi").setRestaurantName("Mainland China").setFoodName("Hakka Noodles").setCategory("Chinese").setQuantity(2).setPrice(480.00).setDeliveryAddress("Noida").setPaymentMode("Credit Card").setOrderStatus("Order Confirmed");
		s15.setCustomerName("Simran").setRestaurantName("Faasos").setFoodName("Paneer Roll").setCategory("Rolls").setQuantity(2).setPrice(320.00).setDeliveryAddress("Jaipur").setPaymentMode("UPI").setOrderStatus("Preparing");
		s16.setCustomerName("Deepak").setRestaurantName("Taco Bell").setFoodName("Mexican Taco").setCategory("Mexican").setQuantity(3).setPrice(450.00).setDeliveryAddress("Gurgaon").setPaymentMode("Debit Card").setOrderStatus("Out for Delivery");
		s17.setCustomerName("Kavita").setRestaurantName("Sagar Ratna").setFoodName("Idli Sambar").setCategory("South Indian").setQuantity(2).setPrice(220.00).setDeliveryAddress("Chennai").setPaymentMode("UPI").setOrderStatus("Order Confirmed");
		s18.setCustomerName("Nitin").setRestaurantName("Baskin Robbins").setFoodName("Chocolate Ice Cream").setCategory("Dessert").setQuantity(2).setPrice(340.00).setDeliveryAddress("Kanpur").setPaymentMode("Cash on Delivery").setOrderStatus("Delivered");
		s19.setCustomerName("Shivani").setRestaurantName("Mio Amore").setFoodName("Chocolate Cake").setCategory("Bakery").setQuantity(1).setPrice(650.00).setDeliveryAddress("Kolkata").setPaymentMode("UPI").setOrderStatus("Preparing");
		s20.setCustomerName("Varun").setRestaurantName("Paradise Biryani").setFoodName("Hyderabadi Biryani").setCategory("Biryani").setQuantity(2).setPrice(699.00).setDeliveryAddress("Hyderabad").setPaymentMode("Credit Card").setOrderStatus("Order Confirmed");
		
		System.out.println("==============================================");
		System.out.println("             SWIGGY ORDER DETAILS             ");
		System.out.println("==============================================");

		s1.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s2.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s3.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s4.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s5.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s6.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s7.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s8.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s9.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s10.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s11.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s12.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s13.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s14.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s15.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s16.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s17.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s18.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s19.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

		s20.printCustomerName().printRestaurantName().printFoodName().printCategory().printQuantity().printPrice().printDeliveryAddress().printPaymentMode().printOrderStatus();
		System.out.println("==============================================");

	}

}
