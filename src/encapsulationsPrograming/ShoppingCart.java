package encapsulationsPrograming;

public class ShoppingCart {

		private String customerName;
		private String cartID;
		private String productName;
		private int quantity;
		private double totalPrice;
		
		ShoppingCart(){
			
		}


		ShoppingCart(String customerName, String cartID, String productName, int quantity, double totalPrice) {

			this.customerName = customerName;
			this.cartID = cartID;
			this.productName = productName;
			this.quantity = quantity;
			this.totalPrice = totalPrice;
		}


		public void setCustomerName(String customerName) {

			if(customerName.length() > 3 && customerName.length() <= 50 && !customerName.isBlank() && customerName.matches("[A-Z a-z .]+"))

				this.customerName = customerName;

			else

				System.out.println("Wrong Customer Name");
		}


		public String getCustomerName() {

			return customerName;
		}


		public void setCartID(String cartID) {

			if(cartID.length() > 3 && cartID.length() <= 20 && !cartID.isBlank() && cartID.matches("[A-Z a-z 0-9]+"))

				this.cartID = cartID;

			else

				System.out.println("Invalid Cart ID");
		}


		public String getCartID() {

			return cartID;
		}


		public void setProductName(String productName) {

			if(productName.length() > 2 && productName.length() <= 50 && !productName.isBlank() && productName.matches("[A-Z a-z 0-9 .]+"))

				this.productName = productName;

			else

				System.out.println("Wrong Product Name");
		}


		public String getProductName() {

			return productName;
		}


		public void setQuantity(int quantity) {

			if(quantity > 0 && quantity <= 100)

				this.quantity = quantity;

			else

				System.out.println("Invalid Product Quantity");
		}


		public int getQuantity() {

			return quantity;
		}


		public void setTotalPrice(double totalPrice) {

			if(totalPrice > 0)

				this.totalPrice = totalPrice;

			else

				System.out.println("Wrong Total Price");
		}


		public double getTotalPrice() {

			return totalPrice;
		}

	

}
