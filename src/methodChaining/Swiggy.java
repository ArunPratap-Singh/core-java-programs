package methodChaining;

public class Swiggy {
	
	    private String customerName;
	    private String restaurantName;
	    private String foodName;
	    private String category;
	    private int quantity;
	    private double price;
	    private String deliveryAddress;
	    private String paymentMode;
	    private String orderStatus;

	    // ================= SETTER METHODS =================

	    public Swiggy setCustomerName(String customerName) {
	        this.customerName = customerName;
	        return this;
	    }

	    public Swiggy setRestaurantName(String restaurantName) {
	        this.restaurantName = restaurantName;
	        return this;
	    }

	    public Swiggy setFoodName(String foodName) {
	        this.foodName = foodName;
	        return this;
	    }

	    public Swiggy setCategory(String category) {
	        this.category = category;
	        return this;
	    }

	    public Swiggy setQuantity(int quantity) {
	        this.quantity = quantity;
	        return this;
	    }

	    public Swiggy setPrice(double price) {
	        this.price = price;
	        return this;
	    }

	    public Swiggy setDeliveryAddress(String deliveryAddress) {
	        this.deliveryAddress = deliveryAddress;
	        return this;
	    }

	    public Swiggy setPaymentMode(String paymentMode) {
	        this.paymentMode = paymentMode;
	        return this;
	    }

	    public Swiggy setOrderStatus(String orderStatus) {
	        this.orderStatus = orderStatus;
	        return this;
	    }

	    // ================= PRINT METHODS =================

	    public Swiggy printCustomerName() {
	        System.out.println("Customer Name: " + customerName);
	        return this;
	    }

	    public Swiggy printRestaurantName() {
	        System.out.println("Restaurant Name: " + restaurantName);
	        return this;
	    }

	    public Swiggy printFoodName() {
	        System.out.println("Food Name: " + foodName);
	        return this;
	    }

	    public Swiggy printCategory() {
	        System.out.println("Category: " + category);
	        return this;
	    }

	    public Swiggy printQuantity() {
	        System.out.println("Quantity: " + quantity);
	        return this;
	    }

	    public Swiggy printPrice() {
	        System.out.println("Price: ₹" + price);
	        return this;
	    }

	    public Swiggy printDeliveryAddress() {
	        System.out.println("Delivery Address: " + deliveryAddress);
	        return this;
	    }

	    public Swiggy printPaymentMode() {
	        System.out.println("Payment Mode: " + paymentMode);
	        return this;
	    }

	    public Swiggy printOrderStatus() {
	        System.out.println("Order Status: " + orderStatus);
	        return this;
	    }
	

}
