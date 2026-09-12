package constructor.shallowCopy.ShoppingCart;

public class ShoppingCart {
	
	    String cartId;
	    String customerName;
	    int totalPrice;
	    String paymentMode;
	    Product p;

	    ShoppingCart() {
	    	
	    }
	    

	    ShoppingCart(String cartId, String customerName, int totalPrice, String paymentMode, Product p) {

	        this.cartId = cartId;
	        this.customerName = customerName;
	        this.totalPrice = totalPrice;
	        this.paymentMode = paymentMode;
	        this.p = p;
	    }

	    ShoppingCart(ShoppingCart s) {

	        this.cartId = s.cartId;
	        this.customerName = s.customerName;
	        this.totalPrice = s.totalPrice;
	        this.paymentMode = s.paymentMode;
	        this.p = s.p;
	    }

	    public String toString() {

	        return "CartId is: " + cartId + "\nCustomerName is: " + customerName + "\nTotalPrice is: " + totalPrice + "\nPaymentMode is: " + paymentMode + "\nP is: " + p + "\n========================";
	    }
	

}
