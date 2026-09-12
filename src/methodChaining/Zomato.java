package methodChaining;

public class Zomato {
	
		private String customerName;
		private String restaurantName;
		private String foodName;
		private String category;
		private int quantity;
		private double price;
		private String deliveryAddress;
		private String paymentMode;
		private String orderStatus;

		// Setter Methods

		public Zomato setCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		public Zomato setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
			return this;
		}

		public Zomato setFoodName(String foodName) {
			this.foodName = foodName;
			return this;
		}

		public Zomato setCategory(String category) {
			this.category = category;
			return this;
		}

		public Zomato setQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}

		public Zomato setPrice(double price) {
			this.price = price;
			return this;
		}

		public Zomato setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
			return this;
		}

		public Zomato setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public Zomato setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
			return this;
		}

		// Print Methods

		public Zomato printCustomerName() {
			System.out.println("Customer Name: " + customerName);
			return this;
		}

		public Zomato printRestaurantName() {
			System.out.println("Restaurant Name: " + restaurantName);
			return this;
		}

		public Zomato printFoodName() {
			System.out.println("Food Name: " + foodName);
			return this;
		}

		public Zomato printCategory() {
			System.out.println("Category: " + category);
			return this;
		}

		public Zomato printQuantity() {
			System.out.println("Quantity: " + quantity);
			return this;
		}

		public Zomato printPrice() {
			System.out.println("Price: " + price);
			return this;
		}

		public Zomato printDeliveryAddress() {
			System.out.println("Delivery Address: " + deliveryAddress);
			return this;
		}

		public Zomato printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public Zomato printOrderStatus() {
			System.out.println("Order Status: " + orderStatus);
			return this;
		}
	

}
