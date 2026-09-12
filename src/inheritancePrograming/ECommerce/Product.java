package inheritancePrograming.ECommerce;

public class Product extends ECommerce{
	
	    String productName;
	    int productId;
	    double price;
	    
	    Product(){
	    	
	    }

	    Product(String websiteName, String websiteLocation, int websiteId, String productName, int productId, double price) {

	        super(websiteName, websiteLocation, websiteId);
	        this.productName = productName;
	        this.productId = productId;
	        this.price = price;
	    }

	    @Override
	    public String toString() {

	        return super.toString() +"\nProductName is: " + productName + "\nProductId is: " + productId + "\nPrice is: " + price;
	    }
	

}
