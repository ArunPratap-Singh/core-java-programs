package contructor.ConstructorChaining;

public class Order {
	
	    String customerName;
	    int orderId;
	    String productName;
	    int quantity;
	    double price;
	    String paymentMode;
	    String deliveryAddress;
	    String status;

	    Order(String customerName, int orderId, String productName, int quantity, double price, String paymentMode, String deliveryAddress, String status) {

	        this.customerName = customerName;
	        this.orderId = orderId;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	        this.paymentMode = paymentMode;
	        this.deliveryAddress = deliveryAddress;
	        this.status = status;
	    }

	    Order() {
	    }

	    Order(String customerName) {
	        this.customerName = customerName;
	    }

	    Order(String customerName, int orderId) {
	        this(customerName);
	        this.orderId = orderId;
	    }

	    Order(String customerName, int orderId, String productName) {
	        this(customerName, orderId);
	        this.productName = productName;
	    }

	    Order(String customerName, int orderId, String productName, int quantity) {
	        this(customerName, orderId, productName);
	        this.quantity = quantity;
	    }

	    Order(String customerName, int orderId, String productName, int quantity, double price) {
	        this(customerName, orderId, productName, quantity);
	        this.price = price;
	    }

	    Order(String customerName, int orderId, String productName, int quantity, double price, String paymentMode) {
	        this(customerName, orderId, productName, quantity, price);
	        this.paymentMode = paymentMode;
	    }

	    Order(int orderId, String customerName, String productName, int quantity, double price, String paymentMode, String deliveryAddress) {
	        this(customerName, orderId, productName, quantity, price, paymentMode);
	        this.deliveryAddress = deliveryAddress;
	    }

	    Order(int orderId, String customerName, String productName, int quantity, double price, String paymentMode, String deliveryAddress, String status) {
	        this(orderId, customerName, productName, quantity, price, paymentMode, deliveryAddress);
	        this.status = status;
	    }

	    public String toString() {

	        return "Customer Name is: " + customerName + "\tOrder ID is: " + orderId + "\tProduct Name is: " + productName + "\tQuantity is: " + quantity + "\nPrice is: " + price + "\tPayment Mode is: " + paymentMode + "\tDelivery Address is: " + deliveryAddress + "\tStatus is: " + status + "\n===============================================";
	    }
	

}
