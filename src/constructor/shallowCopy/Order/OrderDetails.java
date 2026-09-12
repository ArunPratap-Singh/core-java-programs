package constructor.shallowCopy.Order;

public class OrderDetails {
	
	    int productId;
	    String productName;
	    int quantity;
	    double price;
	    String category;
	    String deliveryStatus;

	    OrderDetails() {
	    	
	    }

	    OrderDetails(int productId, String productName, int quantity, double price, String category, String deliveryStatus) {

	        this.productId = productId;
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	        this.category = category;
	        this.deliveryStatus = deliveryStatus;
	    }

	    public String toString() {

	        return "ProductId is: " + productId + "\nProductName is: " + productName + "\nQuantity is: " + quantity + "\nPrice is: " + price + "\nCategory is: " + category + "\nDeliveryStatus is: " + deliveryStatus;
	    }
	

}
