package methodChaining;

public class ShoppingCart {
	
	    private String customerName;
	    private String productName;
	    private String category;
	    private int price;
	    private int quantity;
	    private String paymentMode;

	    // Setter methods

	    public ShoppingCart setCustomerName(String customerName) {
	        this.customerName = customerName;
	        return this;
	    }

	    public ShoppingCart setProductName(String productName) {
	        this.productName = productName;
	        return this;
	    }

	    public ShoppingCart setCategory(String category) {
	        this.category = category;
	        return this;
	    }

	    public ShoppingCart setPrice(int price) {
	        this.price = price;
	        return this;
	    }

	    public ShoppingCart setQuantity(int quantity) {
	        this.quantity = quantity;
	        return this;
	    }

	    public ShoppingCart setPaymentMode(String paymentMode) {
	        this.paymentMode = paymentMode;
	        return this;
	    }

	    // Print methods

	    public ShoppingCart printCustomerName() {
	        System.out.println("Customer Name: " + customerName);
	        return this;
	    }

	    public ShoppingCart printProductName() {
	        System.out.println("Product Name: " + productName);
	        return this;
	    }

	    public ShoppingCart printCategory() {
	        System.out.println("Category: " + category);
	        return this;
	    }

	    public ShoppingCart printPrice() {
	        System.out.println("Price: " + price);
	        return this;
	    }

	    public ShoppingCart printQuantity() {
	        System.out.println("Quantity: " + quantity);
	        return this;
	    }

	    public ShoppingCart printPaymentMode() {
	        System.out.println("Payment Mode: " + paymentMode);
	        return this;
	    }
	

}
