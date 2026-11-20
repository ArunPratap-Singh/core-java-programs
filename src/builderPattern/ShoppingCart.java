package builderPattern;

public class ShoppingCart {

	    private String customerName;
	    private String productName;
	    private int quantity;
	    private double price;
	    private double totalAmount;
	    private String paymentMode;

	    private ShoppingCart() {

	    }

	    private ShoppingCart(String customerName, String productName, int quantity, double price, double totalAmount, String paymentMode) {

	        this.customerName = customerName;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	        this.totalAmount = totalAmount;
	        this.paymentMode = paymentMode;
	    }

	    private ShoppingCart(Builder b) {
	        
	    	this(b.customerName, b.productName, b.quantity, b.price, b.totalAmount, b.paymentMode);
	    }

	    @Override
	    public String toString() {
	        
	    	return "ShoppingCart [Customer Name is: " + customerName + ", Product Name is: " + productName + ", Quantity is: " + quantity + ", Price is: " + price + ", Total Amount is: " + totalAmount + ", Payment Mode is: " + paymentMode + "]";
	    }

	    static class Builder {

	        private String customerName;
	        private String productName;
	        private int quantity;
	        private double price;
	        private double totalAmount;
	        private String paymentMode;

	        public Builder setCustomerName(String customerName) {
	            
	        	this.customerName = customerName;
	            return this;
	        }

	        public Builder setProductName(String productName) {
	            
	        	this.productName = productName;
	            return this;
	        }

	        public Builder setQuantity(int quantity) {
	            
	        	this.quantity = quantity;
	            return this;
	        }

	        public Builder setPrice(double price) {
	            
	        	this.price = price;
	            return this;
	        }

	        public Builder setTotalAmount(double totalAmount) {
	            
	        	this.totalAmount = totalAmount;
	            return this;
	        }

	        public Builder setPaymentMode(String paymentMode) {
	            
	        	this.paymentMode = paymentMode;
	            return this;
	        }

	        public ShoppingCart build() {
	            
	        	return new ShoppingCart(this);
	        }
	    }
	}


