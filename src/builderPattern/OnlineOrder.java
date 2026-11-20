package builderPattern;

public class OnlineOrder {
	
	private int orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double price;
    private double totalAmount;
    private String paymentMode;
    private String deliveryAddress;
    
    private OnlineOrder() {
    	
    }
    
    private OnlineOrder(int orderId, String customerName, String productName, int quantity, double price, double totalAmount, String paymentMode, String deliveryAddress){
    	
    	this.orderId = orderId;
    	this.customerName = customerName;
    	this.productName = productName;
    	this.quantity = quantity;
    	this.price = price;
    	this.totalAmount = totalAmount;
    	this.paymentMode = paymentMode;
    	this.deliveryAddress = deliveryAddress;
    }
    
        
    private OnlineOrder(Builder b) {
    	
    	this(b.orderId, b.customerName, b.productName, b.quantity, b.price, b.totalAmount, b.paymentMode, b.deliveryAddress);
    }
    
    @Override
    public String toString() {
    	
    	return "OnlineOrder [Oder ID is: " + orderId + ", CustomerName is: " + customerName + ", Product Name is: " + productName + ", Quantity is: " + quantity + ", Price is: " + price + ", Total Amount is: " + totalAmount + ", Payment Mode is: " + paymentMode + ", Delivery Address is: " + deliveryAddress + "]"; 
    }
    
    static class Builder {
    	
    	private int orderId;
        private String customerName;
        private String productName;
        private int quantity;
        private double price;
        private double totalAmount;
        private String paymentMode;
        private String deliveryAddress;
        
        public Builder setOrderId(int orderId) {
        	
        	this.orderId = orderId;
        	return this;
        }
        
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

        public Builder setDeliveryAddress(String deliveryAddress) {
            
        	this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OnlineOrder build() {
            
        	return new OnlineOrder(this);
        }
    }
}  
    
    


