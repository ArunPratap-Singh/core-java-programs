package lazySingletonClass;

public class ECommerceCartManager {
	
	    private static ECommerceCartManager ecm;

	    private String customerName;
	    private int totalItems;
	    private double totalAmount;

	    private ECommerceCartManager() {

	        customerName = "Arun";
	        totalItems = 0;
	        totalAmount = 0.0;
	    }

	    public static ECommerceCartManager getInstance() {
	    	
	    	if(ecm == null) {
	    		ecm = new ECommerceCartManager();
	    	}

	        return ecm;
	    }

	    // Getter methods

	    public String getCustomerName() {
	        return customerName;
	    }

	    public int getTotalItems() {
	        return totalItems;
	    }

	    public double getTotalAmount() {
	        return totalAmount;
	    }

	    // Setter method

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }
	    
	    public void setTotalItems(int totalItems) {
	        this.totalItems = totalItems;
	    }
	    
	    public void setTotalAmount(double totalAmount) {
	        this.totalAmount = totalAmount;
	    }

	    // Add product to cart

	    public void addProduct(String productName, double price) {

	        totalItems++;
	        totalAmount = totalAmount + price;

	        System.out.println(productName + " added to cart.");
	        System.out.println("Price: " + price);
	    }

	    // Remove product from cart

	    public void removeProduct(String productName, double price) {

	        if (totalItems > 0) {

	            totalItems--;
	            totalAmount = totalAmount - price;

	            System.out.println(productName + " removed from cart.");
	        }
	        else {

	            System.out.println("Cart is empty.");
	        }
	    }

	    // Apply discount

	    public void applyDiscount(double discountPercentage) {

	        double discount =totalAmount * discountPercentage / 100;

	        totalAmount = totalAmount - discount;

	        System.out.println("Discount Applied: " + discountPercentage + "%");

	        System.out.println("Discount Amount: " + discount);
	    }

	    // cart Info details

	    public void CartInfo() {

	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Total Items   : " + totalItems);
	        System.out.println("Total Amount  : " + totalAmount);
	    }

	    // Clear cart

	    public void clearCart() {

	        totalItems = 0;
	        totalAmount = 0.0;

	        System.out.println("Cart has been cleared.");
	    }
	

}
