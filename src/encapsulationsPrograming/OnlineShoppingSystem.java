package encapsulationsPrograming;

public class OnlineShoppingSystem {
	
		private String customerName;
		private String customerID;
		private String customerAddress;
		private long contact;
		private String productName;
		private String productID;
		private String category;
		private double price;
		private int quantity;
		private String orderID;
		private String orderStatus;
		
		OnlineShoppingSystem(){
			
		}

		OnlineShoppingSystem(String customerName, String customerID, String customerAddress, long contact, String productName, String productID, String category, double price, int quantity, String orderID, String orderStatus) {

			this.customerName = customerName;
			this.customerID = customerID;
			this.customerAddress = customerAddress;
			this.contact = contact;
			this.productName = productName;
			this.productID = productID;
			this.category = category;
			this.price = price;
			this.quantity = quantity;
			this.orderID = orderID;
			this.orderStatus = orderStatus;
		}


		public void setCustomerName(String customerName) {

			if(customerName != null && customerName.length() > 3 && customerName.length() <= 50 && !customerName.isBlank() && customerName.matches("[A-Z a-z \s]+")) {

				this.customerName = customerName;
			}
			else {

				System.out.println("Wrong Customer Name");
			}
		}


		public String getCustomerName() {

			return customerName;
		}


		public void setCustomerID(String customerID) {

			if(customerID != null && customerID.length() >= 5 && customerID.length() <= 20 && !customerID.isBlank() && customerID.matches("[A-Z a-z 0-9]+")) {

				this.customerID = customerID;
			}
			else {

				System.out.println("Invalid Customer ID");
			}
		}


		public String getCustomerID() {

			return customerID;
		}


		public void setCustomerAddress(String customerAddress) {

			if(customerAddress != null && customerAddress.length() > 3 && customerAddress.length() <= 100 && !customerAddress.isBlank() && customerAddress.matches("[A-Z a-z 0-9 ,.- \s]+")) {

				this.customerAddress = customerAddress;
			}
			else {

				System.out.println("Wrong Customer Address");
			}
		}


		public String getCustomerAddress() {

			return customerAddress;
		}


		public void setContact(long contact) {

			if(contact >= 1000000000L && contact <= 9999999999L) {

				this.contact = contact;
			}
			else {

				System.out.println("Invalid Contact Number");
			}
		}


		public long getContact() {

			return contact;
		}


		public void setProductName(String productName) {

			if(productName != null && productName.length() > 2 && productName.length() <= 100 && !productName.isBlank() && productName.matches("[A-Z a-z 0-9 - \s]+")) {

				this.productName = productName;
			}
			else {

				System.out.println("Wrong Product Name");
			}
		}


		public String getProductName() {

			return productName;
		}


		public void setProductID(String productID) {

			if(productID != null && productID.length() >= 5 && productID.length() <= 20 && !productID.isBlank() && productID.matches("[A-Z a-z 0-9]+")) {

				this.productID = productID;
			}
			else {

				System.out.println("Invalid Product ID");
			}
		}


		public String getProductID() {

			return productID;
		}


		public void setCategory(String category) {

			if(category != null && category.length() > 2 && category.length() <= 50 && !category.isBlank() && category.matches("[A-Z a-z ]+")) {

				this.category = category;
			}
			else {

				System.out.println("Invalid Category");
			}
		}


		public String getCategory() {

			return category;
		}


		public void setPrice(double price) {

			if(price > 0) {

				this.price = price;
			}
			else {

				System.out.println("Invalid Product Price");
			}
		}


		public double getPrice() {

			return price;
		}


		public void setQuantity(int quantity) {

			if(quantity > 0 && quantity <= 100) {

				this.quantity = quantity;
			}
			else {

				System.out.println("Invalid Product Quantity");
			}
		}


		public int getQuantity() {

			return quantity;
		}


		public void setOrderID(String orderID) {

			if(orderID != null && orderID.length() >= 5 && orderID.length() <= 20 && !orderID.isBlank() && orderID.matches("[A-Z a-z 0-9]+")) {

				this.orderID = orderID;
			}
			else {

				System.out.println("Invalid Order ID");
			}
		}


		public String getOrderID() {

			return orderID;
		}


		public void setOrderStatus(String orderStatus) {

			if(orderStatus != null && orderStatus.equalsIgnoreCase("Placed") || orderStatus.equalsIgnoreCase("Packed") || orderStatus.equalsIgnoreCase("Shipped") || orderStatus.equalsIgnoreCase("Delivered") || orderStatus.equalsIgnoreCase("Cancelled")) {

				this.orderStatus = orderStatus;
			}
			else {

				System.out.println("Invalid Order Status");
			}
		}


		public String getOrderStatus() {

			return orderStatus;
		}


		public double getTotalAmount() {

			return price * quantity;
		}


		public void placeOrder() {

			if(orderStatus.equalsIgnoreCase("Cancelled")) {

				System.out.println("Cancelled Order Cannot Be Placed Again");
			}
			else {

				orderStatus = "Placed";

				System.out.println("Order Placed Successfully");
			}
		}


		public void packOrder() {

			if(orderStatus.equalsIgnoreCase("Placed")) {

				orderStatus = "Packed";

				System.out.println("Order Packed Successfully");
			}
			else {

				System.out.println("Order Must Be Placed Before Packing");
			}
		}


		public void shipOrder() {

			if(orderStatus.equalsIgnoreCase("Packed")) {

				orderStatus = "Shipped";

				System.out.println("Order Shipped Successfully");
			}
			else {

				System.out.println("Order Must Be Packed Before Shipping");
			}
		}


		public void deliverOrder() {

			if(orderStatus.equalsIgnoreCase("Shipped")) {

				orderStatus = "Delivered";

				System.out.println("Order Delivered Successfully");
			}
			else {

				System.out.println("Order Must Be Shipped Before Delivery");
			}
		}


		public void cancelOrder() {

			if(orderStatus.equalsIgnoreCase("Delivered")) {

				System.out.println("Delivered Order Cannot Be Cancelled");
			}
			else if(orderStatus.equalsIgnoreCase("Cancelled")) {

				System.out.println("Order is Already Cancelled");
			}
			else {

				orderStatus = "Cancelled";

				System.out.println("Order Cancelled Successfully");
			}
		}


		public void updateQuantity(int newQuantity) {

			if(orderStatus.equalsIgnoreCase("Placed") ||
					orderStatus.equalsIgnoreCase("Packed")) {

				if(newQuantity > 0 && newQuantity <= 100) {

					quantity = newQuantity;

					System.out.println("Quantity Updated Successfully");
				}
				else {

					System.out.println("Invalid New Quantity");
				}
			}
			else {

				System.out.println("Quantity Cannot Be Changed At This Stage");
			}
		}

	

}
