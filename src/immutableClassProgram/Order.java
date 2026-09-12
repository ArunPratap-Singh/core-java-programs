package immutableClassProgram;

public final class Order {
	
	    private final int orderId;
	    private final String customerName;
	    private final String productName;
	    private final int quantity;
	    private final double price;
	    private final double totalAmount;
	    private final String orderStatus;

	    Order(int orderId, String customerName, String productName, int quantity, double price, double totalAmount, String orderStatus) {

	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	        this.totalAmount = totalAmount;
	        this.orderStatus = orderStatus;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public double getTotalAmount() {
	        return totalAmount;
	    }

	    public String getOrderStatus() {
	        return orderStatus;
	    }
	

}
