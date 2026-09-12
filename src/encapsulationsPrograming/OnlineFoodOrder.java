package encapsulationsPrograming;

public class OnlineFoodOrder {
	
		private String customerName;
		private String orderID;
		private String foodName;
		private String restaurantName;
		private int quantity;
		private double price;
		private String orderStatus;
		private String orderDetails;

		OnlineFoodOrder(String customerName, String orderID, String foodName, String restaurantName, int quantity, double price, String orderStatus, String orderDetails) {

			this.customerName = customerName;
			this.orderID = orderID;
			this.foodName = foodName;
			this.restaurantName = restaurantName;
			this.quantity = quantity;
			this.price = price;
			this.orderStatus = orderStatus;
			this.orderDetails = orderDetails;
		}


		public void setCustomerName(String customerName) {

			if(customerName != null && customerName.length() > 3 && customerName.length() <= 50 && !customerName.isBlank() && customerName.matches("[A-Z a-z \s]+"))

				this.customerName = customerName;

			else

				System.out.println("Wrong Customer Name");
		}


		public String getCustomerName() {

			return customerName;
		}


		public void setOrderID(String orderID) {

			if(orderID != null && orderID.length() >= 5 && orderID.length() <= 20 && !orderID.isBlank() && orderID.matches("[A-Z a-z 0-9]+"))

				this.orderID = orderID;

			else

				System.out.println("Invalid Order ID");
		}


		public String getOrderID() {

			return orderID;
		}


		public void setFoodName(String foodName) {

			if(foodName != null && foodName.length() > 2 && foodName.length() <= 100 && !foodName.isBlank() && foodName.matches("[A-Z a-z \s]+"))

				this.foodName = foodName;

			else

				System.out.println("Wrong Food Name");
		}


		public String getFoodName() {

			return foodName;
		}


		public void setRestaurantName(String restaurantName) {

			if(restaurantName != null && restaurantName.length() > 2 && restaurantName.length() <= 100 && !restaurantName.isBlank() && restaurantName.matches("[A-Z a-z 0-9 \s]+"))

				this.restaurantName = restaurantName;

			else

				System.out.println("Wrong Restaurant Name");
		}


		public String getRestaurantName() {

			return restaurantName;
		}


		public void setQuantity(int quantity) {

			if(quantity > 0 && quantity <= 20)

				this.quantity = quantity;

			else

				System.out.println("Invalid Quantity");
		}


		public int getQuantity() {

			return quantity;
		}


		public void setPrice(double price) {

			if(price > 0)

				this.price = price;

			else

				System.out.println("Invalid Price");
		}


		public double getPrice() {

			return price;
		}


		public void setOrderStatus(String orderStatus) {

			if(orderStatus != null && orderStatus.equalsIgnoreCase("Placed") || orderStatus.equalsIgnoreCase("Preparing") || orderStatus.equalsIgnoreCase("Out for Delivery") || orderStatus.equalsIgnoreCase("Delivered") || orderStatus.equalsIgnoreCase("Cancelled") && orderStatus.matches("[A-Z a-z \s]+"))

				this.orderStatus = orderStatus;

			else

				System.out.println("Invalid Order Status");
		}


		public String getOrderStatus() {

			return orderStatus;
		}


		public void setOrderDetails(String orderDetails) {

			if(orderDetails != null && orderDetails.length() >= 5 && orderDetails.length() <= 300 && !orderDetails.isBlank())

				this.orderDetails = orderDetails;

			else

				System.out.println("Invalid Order Details");
		}


		public String getOrderDetails() {

			return orderDetails;
		}


		public double getTotalAmount() {

			return quantity * price;
		}


		public void updateOrderStatus(String newStatus) {

			if(newStatus != null && newStatus.equalsIgnoreCase("Placed") || newStatus.equalsIgnoreCase("Preparing") || newStatus.equalsIgnoreCase("Out for Delivery") || newStatus.equalsIgnoreCase("Delivered") || newStatus.equalsIgnoreCase("Cancelled") && newStatus.matches("[A-Z a-z \s]+")) {

				this.orderStatus = newStatus;

				System.out.println("Order Status Updated Successfully");
			}
			else {

				System.out.println("Invalid New Order Status");
			}
		}


		public void updateOrderDetails(String newDetails) {

			if(newDetails != null && !newDetails.isBlank() && newDetails.length() >= 5 && newDetails.length() <= 300) {

				this.orderDetails = newDetails;

				System.out.println("Order Details Updated Successfully");
			}
			else {

				System.out.println("Invalid New Order Details");
			}
		}

	

}
