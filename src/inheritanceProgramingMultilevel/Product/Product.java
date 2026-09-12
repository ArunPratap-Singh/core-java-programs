package inheritanceProgramingMultilevel.Product;

public class Product {

	    int productId;
	    String productName;
	    
	    Product(){
	    	
	    }

	    Product(int productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }

	    @Override
	    public String toString() {
	        return "ProductId is: " + productId + "\nProductName is: " + productName;
	    }
	

}
